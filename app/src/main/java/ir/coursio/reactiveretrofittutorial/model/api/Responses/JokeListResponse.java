package ir.coursio.reactiveretrofittutorial.model.api.Responses;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.ArrayList;

import ir.coursio.reactiveretrofittutorial.model.api.Subs.JokeStruct;

/**
 * Created by Taher on 11/04/2017.
 * Project: ReactiveRetrofitTutorial
 */

public class JokeListResponse implements Serializable {

    @SerializedName("type")
    private String type;

    @SerializedName("value")
    private ArrayList<JokeStruct> jokes;

    public String getType() {
        return type;
    }

    public ArrayList<JokeStruct> getJokes() {
        return jokes;
    }
}