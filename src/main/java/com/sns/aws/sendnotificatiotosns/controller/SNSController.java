package com.sns.aws.sendnotificatiotosns.controller;
import com.amazonaws.services.sns.AmazonSNS;
import com.amazonaws.services.sns.model.PublishRequest;
import com.sns.aws.sendnotificatiotosns.request.SNSRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/sns")
public class SNSController {

    private final AmazonSNS snsClient;

    @Autowired
    public SNSController(AmazonSNS snsClient) {
        this.snsClient = snsClient;
    }

    @ResponseBody
    @PostMapping
    public String publishToSNS(@RequestBody SNSRequest snsRequest) {
        PublishRequest publishRequest = new PublishRequest()
                .withTopicArn(snsRequest.getTopicArn())
                .withMessage(snsRequest.getMessage());

        snsClient.publish(publishRequest);

        return "Message published to SNS topic: " + snsRequest.getTopicArn();
    }
}
