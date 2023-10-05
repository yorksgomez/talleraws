package edu.eci.arep;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;

public class Mongo {
    
    private static MongoClient client = null;

    public static MongoClient getClient() {

        if(client == null)
            client = MongoClients.create(getConnectionString());

        return client;
    }

    public static MongoDatabase getDatabase() {
        return getClient().getDatabase("mydb");
    }

    private static String getConnectionString() {
        return System.getenv("MONGODB_URI");
    }

}
