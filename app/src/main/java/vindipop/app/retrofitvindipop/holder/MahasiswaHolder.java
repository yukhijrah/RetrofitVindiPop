package vindipop.app.retrofitvindipop.holder;

import android.app.Dialog;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import vindipop.app.retrofitvindipop.R;

public class MahasiswaHolder extends RecyclerView.ViewHolder {

    public TextView txtNama;
    public TextView txtNim;
    public Button btnDelete;
    public Button btnFavorite;
    public Dialog itemView;

    public MahasiswaHolder(View itemView) {
        super(itemView);
        txtNama = (TextView) itemView.findViewById(R.id.txt_nama);
        txtNim = (TextView) itemView.findViewById(R.id.txt_nim);
        btnDelete = (Button) itemView.findViewById(R.id.btn_delete);
        btnFavorite = (Button) itemView.findViewById(R.id.btn_favorite);
    }
}
