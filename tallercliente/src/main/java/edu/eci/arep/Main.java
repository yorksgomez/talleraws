package edu.eci.arep;

import static spark.Spark.*;


/**
 * Hello world!
 *
 */
public class Main 
{
    public static void main( String[] args )
    {
        port(35000);

        get("/save", (req, res) -> {
            res.type("application/json");
            String record = req.queryParams("record");

            try {
                return Request.get(RoundRobin.getNextApi() + "/save?record="+record);
            } catch(Exception ex) {
                return "{\"error\": \"" + ex.getMessage() + "\"}";
            }
            
        });

    }
}
