package com.example.simulator.data;

import com.example.simulator.domain.Match;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface MatchesAPI {

    @GET("matches.json")//Endpoint mapeado
    Call<List<Match>> getMatches();

}
