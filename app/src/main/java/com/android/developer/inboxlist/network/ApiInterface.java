package com.android.developer.inboxlist.network;

/**
 * Created by HP on 12-04-2017.
 */

import com.android.developer.inboxlist.model.Message;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 *  This class contains the rest api endpoints and the type of response it is expecting
 */
public interface ApiInterface {


    @GET("inbox.json")
    Call<List<Message>> getInbox();
}
