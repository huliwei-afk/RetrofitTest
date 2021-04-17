package com.example.retrofittest;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface IpServiceForPostBody {
    @POST("getIpInfo.php")
    Call<IpModel> getIpMsg(@Body Ip ip);
}
