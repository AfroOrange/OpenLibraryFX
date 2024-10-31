package dad.openlibrary.api;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface OpenLibraryInterface {

    @GET("/search.json")
    Call<dad.openlibrary.api.SearchResult> search(@Query("q") String query);
}
