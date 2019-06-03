package br.com.ntcampanhas.connection;

import com.mongodb.MongoClient;
import com.mongodb.MongoException;
import com.mongodb.WriteConcern;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;
import com.mongodb.DBCursor;
import com.mongodb.ServerAddress;
import java.util.Arrays;

public class dbConnect {
	public static void main( String args[] ){
	      try{   
	         // Conectando ao servidor mongodb
	         MongoClient mongoClient = new MongoClient( "localhost" , 27017 );
	         // Conecta ao banco de dados test
	         DB db = mongoClient.getDB( "campanhas" );
	                 System.out.println("Banco de dados conectado com sucesso");
	         //boolean auth = db.authenticate(null, null);
	                 //System.out.println("Autenticacao: "+auth);
	      }catch(Exception e){
	             System.err.println( e.getClass().getName() + ": " + e.getMessage() );
	          }
	   }	

}
