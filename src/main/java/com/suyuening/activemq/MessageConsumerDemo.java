package com.suyuening.activemq;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.MessageConsumer;
import javax.jms.ObjectMessage;
import javax.jms.Session;

import org.apache.activemq.ActiveMQConnection;
import org.apache.activemq.ActiveMQConnectionFactory;

/**
 * MessageProducer
 */
public class MessageConsumerDemo {

    public static void main(String[] args) {
        System.out.println("MessageConsumerDemo start");
        ConnectionFactory connectionFactory = new ActiveMQConnectionFactory(ActiveMQConnection.DEFAULT_USER,
                                                                            ActiveMQConnection.DEFAULT_PASSWORD,
                                                                            "tcp://localhost:61616");
        try {
            Connection connection = connectionFactory.createConnection();
            connection.start();
            
            Session session = connection.createSession(Boolean.FALSE, Session.AUTO_ACKNOWLEDGE);
            Destination destination = session.createQueue("MessageQueue");
            MessageConsumer consumer = session.createConsumer(destination);
            while (true) {
                ObjectMessage message = (ObjectMessage) consumer.receive(10000);
                if (null == message) {
                    break;
                }
                String messageContent = (String) message.getObject();
                System.out.println(messageContent);
            }
        } catch (JMSException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("MessageConsumerDemo end");
        
    }
}
