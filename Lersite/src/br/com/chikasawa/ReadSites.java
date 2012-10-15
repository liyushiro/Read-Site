package br.com.chikasawa;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

public class ReadSites {
	
	public static void main(String[] args){
		
		try {
			HttpClient httpclient = new DefaultHttpClient();
			HttpGet  httpget = new HttpGet("http://chikadeveloper.wordpress.com/2012/07/31/quartz-part3/");
			HttpResponse response = httpclient.execute(httpget);
			HttpEntity entity = response.getEntity();
		
			if (entity != null) {
				String responseContent = EntityUtils.toString(entity);
				System.out.println(responseContent);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	
	}
	
	
	
    
}
