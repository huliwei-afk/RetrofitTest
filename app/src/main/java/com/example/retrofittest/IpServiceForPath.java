package com.example.retrofittest;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface IpServiceForPath {
    @GET("{path}/getIpInfo.php?ip=59.108.54.37")
    Call<IpModel> getIpMsg(@Path("path") String path);
}