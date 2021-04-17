package com.example.retrofittest;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface IpServiceForQuery{
    @GET("getIpInfo.php")
    Call<IpModel> getIpMsg(@Query("ip")String ip);
}