package com.sns.aws.sendnotificatiotosns.request;

import org.springframework.beans.factory.annotation.Value;

public class SNSRequest {
    public String getTopicArn() {
        return topicArn;
    }

    public void setTopicArn(String topicArn) {
        this.topicArn = topicArn;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    @Value("${sns.topicArn}")
    private String topicArn;
    private String message;
}
