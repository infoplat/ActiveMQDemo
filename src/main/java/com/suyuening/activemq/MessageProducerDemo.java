package com.suyuening.activemq;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.DeliveryMode;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.MessageProducer;
import javax.jms.ObjectMessage;
import javax.jms.Session;

import org.apache.activemq.ActiveMQConnection;
import org.apache.activemq.ActiveMQConnectionFactory;

/**
 * MessageProducer
 */
public class MessageProducerDemo {

    public static void main(String[] args) {
        System.out.println("MessageProducerDemo start");
        ConnectionFactory connectionFactory = new ActiveMQConnectionFactory(ActiveMQConnection.DEFAULT_USER,
                                                                            ActiveMQConnection.DEFAULT_PASSWORD,
                                                                            "tcp://localhost:61616");
        try {
            Connection connection = connectionFactory.createConnection();
            connection.start();
            
            Session session = connection.createSession(Boolean.TRUE, Session.AUTO_ACKNOWLEDGE);
            Destination destination = session.createQueue("MessageQueue");
            MessageProducer producer = session.createProducer(destination);
            producer.setDeliveryMode(DeliveryMode.NON_PERSISTENT);
            
            ObjectMessage message = session.createObjectMessage("hello everyone2!");
            producer.send(message);
            session.commit();
        } catch (JMSException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("MessageProducerDemo end");
        
    }
}
