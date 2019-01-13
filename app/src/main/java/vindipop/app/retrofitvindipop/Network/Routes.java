package vindipop.app.retrofitvindipop.Network;


import android.telecom.Call;

import retrofit2.http.DELETE;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import vindipop.app.retrofitvindipop.entity.DaftarMahasiswa;
import vindipop.app.retrofitvindipop.entity.Mahasiswa;

public interface Routes {

    /**
     * Mendefinisikan root dari web services yang disediakan
     * Jika dideskripsikan berarti:
     * https://ti16.herokuapp.com/list.php
     * */

    @GET("dev/list_mahasiswa")
    Call<DaftarMahasiswa> getMahasiswa();

    @POST("dev/insert_mahasiswa")
    @FormUrlEncoded
    Call<Mahasiswa> postMahasiswa(
            @Field("name") String name,
            @Field("nim") String nim
    );

    @DELETE("mahasiswatest/{mhsId}")
    Call<Mahasiswa> deleteMahasiswa(
            @Path("mhsId") String mhsId
    );

    @PUT("mahasiswatest/{mhsId}")
    @FormUrlEncoded
    Call<Mahasiswa> updateMahasiswa(
            @Path("mhsId") String mhsId,
            @Field("name") String name,
            @Field("nim") String nim
    );
}
