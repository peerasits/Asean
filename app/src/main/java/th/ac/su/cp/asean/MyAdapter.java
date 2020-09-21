package th.ac.su.cp.asean;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import th.ac.su.cp.asean.model.WordItem;

class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    //1 item only
    WordItem[] items = {
            new WordItem(R.drawable.brunei, "BRUNEI","BANDAR SERI BEGAWAN"),
            new WordItem(R.drawable.cambodia, "CAMBODIA","PHNOM PENH"),
            new WordItem(R.drawable.indonesia, "INDONESIA","JAKARTA"),
            new WordItem(R.drawable.laos, "LAOS","VIENTIANE"),
            new WordItem(R.drawable.malaysia, "MALAYSIA","KUALA LUMPUR"),
            new WordItem(R.drawable.myanmar, "MYANMAR","NAYPYIDAW"),
            new WordItem(R.drawable.philippines, "PHILIPPINES","MANILA"),
            new WordItem(R.drawable.singapore, "SINGAPORE","SINGAPORE"),
            new WordItem(R.drawable.thailand, "THAILAND","BANGKOK"),
            new WordItem(R.drawable.vietnam,"VIETNAM","HANOI")
    };

    public MyAdapter() {

    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //inflation layout and store in object and create MyViewHolder from View (layout)
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_flag, parent, false);
        MyViewHolder vh = new MyViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.imageView.setImageResource(items[position].imageResId);
        holder.wordTextView.setText(items[position].country);
        holder.wordTextView2.setText(items[position].capital);
    }

    @Override
    public int getItemCount() {
        return 10;
    }

    class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView wordTextView,wordTextView2;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.Flag_View);
            wordTextView = itemView.findViewById(R.id.Country_Text_View);
            wordTextView2 = itemView.findViewById(R.id.Capital_Text_View);
        }
    }
}