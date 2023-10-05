package edu.eci.arep;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;

import java.util.ArrayList;

import org.bson.Document;

public class Persistency {

    public static ArrayList<String> getRecords() {
        MongoCollection<Document> collection = Mongo.getDatabase().getCollection("records");
        ArrayList<String> result = new ArrayList<>();

        Document sort = new Document("_id", -1);
        int limit = 10;
        MongoCursor<Document> cursor = collection.find().sort(sort).limit(limit).iterator();

        while(cursor.hasNext()) {
            Document document = cursor.next();
            result.add(document.toJson());
        }

        return result;
    }

    public static void addRecord(String value) {
        MongoCollection<Document> collection = Mongo.getDatabase().getCollection("records");
        Document record = new Document("value", value);
        collection.insertOne(record);
    }

}
