package br.com.campanhas.config;

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

import javax.activation.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
public class dataSource {
	
	@Bean
	public 	DB dataSrc (){
		try {
		MongoClient mongoClient = new MongoClient( "localhost" , 27017 );
		DB db = mongoClient.getDB( "campanhas" );
		System.out.println("Banco de dados conectado com sucesso");
		return db;
		}catch(Exception e){
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
         }
		//DriverManagerDataSource ds = new DriverManagerDataSource();
		//ds.setDriverClassName(arg0);
		//ds.setUrl(url);
		//ds.setUsername(username);
		//ds.setPassword(password);		
		return null;
	}

}
