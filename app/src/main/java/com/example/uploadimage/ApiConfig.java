package com.example.uploadimage;

import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;

interface ApiConfig {

    @Multipart
    @POST("upload.php")
    Call<ServerResponse> uploadFile( @Part("name") RequestBody name,
                                     @Part MultipartBody.Part file);

}
