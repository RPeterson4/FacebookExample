package com.ross;

import facebook4j.Facebook;
import facebook4j.FacebookFactory;
import facebook4j.auth.AccessToken;

/**
 * Created by RLP on 5/1/14.
 */
public class FacebookTest {

    public static void main(String args[]){

        Facebook facebook = new FacebookFactory().getInstance();
        facebook.setOAuthAppId("227461414129991", "4ae59408cd54fc59eea550ffbf5ff641");
        //facebook.setOAuthPermissions(commaSeparetedPermissions);
        facebook.setOAuthAccessToken(new AccessToken("CAACEdEose0cBAAzkvZARdYZAoONS2UnXUhSootgS7hBTt2dd7FxE2LyEbcn0RNzWalYMBC7bfZBbai8rRegD4JyciHQzYUp5dV8i9REIh8OD9aEUux5Om4oNYpt0dbUnTaKhvZAf5ZByznjG2W4Nq50KqMQMRSZC5t21ZC4hTZBA8r8Wec7aJ5XPjbslupuHeoZAdG1bQHlrl2QZDZD", null));

    }
}
