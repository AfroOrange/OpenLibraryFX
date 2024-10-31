package dad.openlibrary.api;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import okhttp3.ConnectionPool;
import okhttp3.OkHttpClient;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class OpenLibrary {

    private static final String BASE_URL = "https://openlibrary.org/";

    private final OpenLibraryInterface service;

    public OpenLibrary() {

        ConnectionPool pool = new ConnectionPool(1, 5, TimeUnit.SECONDS);

        OkHttpClient client = new OkHttpClient.Builder()
                .connectionPool(pool)
                .build();

        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();

        service = retrofit.create(OpenLibraryInterface.class);
    }

    public SearchResult getBooks(String query) throws IOException {
        Response<SearchResult> response = service.search(query).execute();
        return response.body();
    }
}