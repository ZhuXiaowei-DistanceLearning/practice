package main.java.cn.itcast.httpclient;

import java.awt.image.RescaleOp;
import java.io.IOException;
import java.net.URISyntaxException;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpStatus;
import org.apache.commons.httpclient.HttpVersion;
import org.apache.commons.httpclient.URI;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicHttpResponse;

public class demo {
	public static void main(String[] args) throws URISyntaxException {
		// new BasicHttpResponse(HttpVersion.HTTP_1_1, HttpStatus.SC_OK, "OK");
		/*
		 * java.net.URI url = new URIBuilder().setScheme("http")
		 * .setHost("www.baidu.com").setPath("/search") .setParameter("q",
		 * "httpclient") .setParameter("btnG",
		 * "Baidu Search").setParameter("aq", "f") .setParameter("oq",
		 * "").build(); HttpGet httpget = new HttpGet(url);
		 * System.out.println(httpget);
		 */
		// 创建对象
		CloseableHttpClient client = HttpClients.createDefault();
		// 创建请求
		HttpGet httpGet = new HttpGet("www.baidu.com");

		CloseableHttpResponse response = null;
		try {
			response = client.execute(httpGet);
		} catch (ClientProtocolException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
