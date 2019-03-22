package com.Translator.controller;

import java.io.*;
import java.net.*;

import org.springframework.stereotype.Service;

import com.Translator.model.Script;

@Service
public class Sender {

	public static void send(Script script) throws IOException
	{
		
		final String CLIENT_ID = "FREE_TRIAL_ACCOUNT";
		  final String CLIENT_SECRET = "PUBLIC_SECRET";
		  final String ENDPOINT = "http://api.whatsmate.net/v1/translation/translate";

			    URL url = new URL(ENDPOINT);
			    HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			    conn.setDoOutput(true);
			    conn.setRequestMethod("POST");
			    conn.setRequestProperty("X-WM-CLIENT-ID", CLIENT_ID);
			    conn.setRequestProperty("X-WM-CLIENT-SECRET", CLIENT_SECRET);
			    conn.setRequestProperty("Content-Type", "application/json");

			    OutputStream os = conn.getOutputStream();
			    //os.write(jsonPayload.getBytes());
			    os.flush();
			    os.close();

			    int statusCode = conn.getResponseCode();
			    System.out.println("Status Code: " + statusCode);
			    BufferedReader br = new BufferedReader(new InputStreamReader(
			        (statusCode == 200) ? conn.getInputStream() : conn.getErrorStream()
			      ));
			    String output;
			    while ((output = br.readLine()) != null) {
			    	
			        System.out.println(script.getText()+"----->"+output);
			        
			    }
			    conn.disconnect();
			  }
		
	}
	
	

