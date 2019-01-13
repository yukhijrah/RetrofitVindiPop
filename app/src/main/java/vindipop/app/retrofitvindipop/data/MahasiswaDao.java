package vindipop.app.retrofitvindipop.data;


import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Update;

import java.util.List;

import retrofit2.http.Query;
import vindipop.app.retrofitvindipop.entity.Mahasiswa;

@Dao
public interface MahasiswaDao {

    @Insert
    void insert(Mahasiswa mahasiswa);

    @Query("SELECT * FROM mahasiswa")
    List<Mahasiswa> getMahasiswa();

    @Update
    void update(Mahasiswa mahasiswa);

    @Delete
    void delete(Mahasiswa mahasiswa);

}
