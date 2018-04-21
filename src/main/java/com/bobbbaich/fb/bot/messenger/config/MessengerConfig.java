package com.bobbbaich.fb.bot.messenger.config;

import com.github.messenger4j.Messenger;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Slf4j
@Configuration
public class MessengerConfig {

    private static final String APP_SECRET = "${messenger4j.appSecret}";
    private static final String VERIFY_TOKEN = "${messenger4j.verifyToken}";
    private static final String PAGE_ACCESS_TOKEN = "${messenger4j.pageAccessToken}";

    /**
     * Initializes the {@code MessengerSendClient}.
     *
     * @param pageAccessToken the generated {@code Page Access Token}
     */
    @Bean
    public Messenger messengerSendClient(@Value(PAGE_ACCESS_TOKEN) String pageAccessToken,
                                         @Value(APP_SECRET) final String appSecret,
                                         @Value(VERIFY_TOKEN) final String verifyToken) {
        log.debug("Initializing Messenger - pageAccessToken: {}", pageAccessToken);
        return Messenger.create(pageAccessToken, appSecret, verifyToken);
    }

//    /**
//     * Initializes the {@code MessengerReceiveClient}.
//     *
//     * @param appSecret   the {@code Application Secret}
//     * @param verifyToken the {@code Verification Token} that has been provided by you during the setup of the {@code
//     *                    Webhook}
//     */
//
//    @Bean
//    public MessengerReceiveClient messengerReceiveClient(@Value(APP_SECRET) final String appSecret,
//                                                         @Value(VERIFY_TOKEN) final String verifyToken) {
//        LOG.debug("Initializing MessengerReceiveClient - appSecret: {} | verifyToken: {}", appSecret, verifyToken);
//        return MessengerPlatform.newReceiveClientBuilder(appSecret, verifyToken)
//                .onTextMessageEvent(textMessageEventHandler)
//                .onPostbackEvent(postbackEventHandler)
//                .build();
//    }
//
//    @Bean
//    public MessengerSetupClient messengerSetupClient(@Value(PAGE_ACCESS_TOKEN) String pageAccessToken) {
//        LOG.debug("Initializing MessengerSetupClient - pageAccessToken: {}", pageAccessToken);
//        return MessengerPlatform.newSetupClientBuilder(pageAccessToken).build();
//    }
//
//    @Bean
//    public UserProfileClient userProfileClient(@Value(PAGE_ACCESS_TOKEN) String pageAccessToken) {
//        LOG.debug("Initializing UserProfileClient - pageAccessToken: {}", pageAccessToken);
//        return MessengerPlatform.newUserProfileClientBuilder(pageAccessToken).build();
//    }
//
//    @Autowired
//    public void setTextMessageEventHandler(TextMessageEventHandler textMessageEventHandler) {
//        this.textMessageEventHandler = textMessageEventHandler;
//    }
//
//    @Autowired
//    public void setPostbackEventHandler(PostbackEventHandler postbackEventHandler) {
//        this.postbackEventHandler = postbackEventHandler;
//    }
}