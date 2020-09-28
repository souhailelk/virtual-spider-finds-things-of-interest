import com.sun.tools.javac.util.List;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;

public class Main {
    private static void Produce(){
        KafkaProducer producer = ProducerCreator.createProducer();
        ProducerRecord<String,String> producerRecord = new ProducerRecord<String, String>(IKafkaConstants.TOPIC_NAME,"myKey", "hello every one");
        producer.send(producerRecord);
        System.out.println("Produce ends");
    }
    private static void Consume(){
        KafkaConsumer consumer = ConsumerCreator.createConsumer();
        consumer.subscribe(List.of(IKafkaConstants.TOPIC_NAME));
        ConsumerRecords<String, String> records = consumer.poll(1000);
        System.out.println("Consumed data : ");
        for (ConsumerRecord<String, String> record : records)
            System.out.println(", Topic: " + record.topic() +
                    ", Partition: " + record.partition() +
                    ", Offset: " + record.offset() +
                    ", key: " + record.key() + ", value: " +
                    "" + record.value());

    }
    public static void main(String[] argv){
        Produce();
        Consume();
    }
}
