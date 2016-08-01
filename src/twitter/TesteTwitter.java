package application;

import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.auth.AccessToken;

public class TesteTwitter {
	
	public static void main(String[] args) throws TwitterException {
		
		Twitter twitter = TwitterFactory.getSingleton();
		
		twitter.setOAuthConsumer("jxSuGshKT9kApUWdbL8AQpAFd", "z73Usp8NHreYDlUN2tRx6x7m50dfll74Fe2j7GTY42vSiDcD8b");
		
		twitter.setOAuthAccessToken(new AccessToken("2894591277-7M9hnY1s4TE2V2dQAX4AAg34FqNPiFrRAa3Mh5K", "qcqWgpnBBO3NVb72PFV8OPGK5M2zQd9HK2yYfEbY54xqH"));
		
		twitter.updateStatus("DOMINGO, estudando Twitter4j: em http://twitter4j.org/en/code-examples.html");
		
		/*
		
		result = twitter.search(query);
		
		System.out.println(result.getCount());
		
		do{
			
			result.getTweets().forEach(s -> {System.out.println(s.getCreatedAt().toString() + " " + s.getUser().getScreenName() + " " + s.getText());});
			
		} while((query = result.nextQuery()) != null);
		
		*/
		
		
		
		
	}
	

}
