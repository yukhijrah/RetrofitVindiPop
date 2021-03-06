package vindipop.app.retrofitvindipop.data;


import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

import vindipop.app.retrofitvindipop.entity.Mahasiswa;

@Database(entities = {Mahasiswa.class}, version = 1, exportSchema = false)
public abstract class MahasiswaDatabase extends RoomDatabase {
    public abstract MahasiswaDao mahasiswaDao();
}
