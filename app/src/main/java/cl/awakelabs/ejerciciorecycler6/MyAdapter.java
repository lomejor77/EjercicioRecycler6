package cl.awakelabs.ejerciciorecycler6;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;

import cl.awakelabs.ejerciciorecycler6.databinding.ItemBinding;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder>{
    private List<ImageListModel> listado;

    public void setListado(List<ImageListModel> listado) {
        this.listado = listado;
    }

    @NonNull
    @Override
    public MyAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemBinding item = ItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new MyViewHolder(item);
    }

    @Override
    public void onBindViewHolder(@NonNull MyAdapter.MyViewHolder holder, int position) {
        ImageListModel imageLista = listado.get(position);
        Picasso.get().load(imageLista.getUrlImage()).into(holder.imageView);
        holder.tvDescription.setText(imageLista.getTextImage());
    }

    @Override
    public int getItemCount() {
        return listado.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
       private ItemBinding bindingItem;
       private ImageView imageView;
       private TextView tvDescription;
       public MyViewHolder(@NonNull View itemView) {
            super(itemView);
        }

        public MyViewHolder(ItemBinding item) {
            super(item.getRoot());
            this.bindingItem = bindingItem;
            imageView = bindingItem.imageView2;
            tvDescription = bindingItem.tvDescription;
        }
    }
}
