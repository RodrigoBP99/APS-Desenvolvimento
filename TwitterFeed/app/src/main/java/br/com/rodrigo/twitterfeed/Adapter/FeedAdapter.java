package br.com.rodrigo.twitterfeed.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import br.com.rodrigo.twitterfeed.Model.Feed;
import br.com.rodrigo.twitterfeed.R;
import de.hdodenhof.circleimageview.CircleImageView;

import static br.com.rodrigo.twitterfeed.R.mipmap.foto_perfil;

public class FeedAdapter extends RecyclerView.Adapter<FeedAdapter.FeedAdapterViewHolder> {
    private ArrayList<Feed> feedArrayList;
    private Context context;

    public FeedAdapter(ArrayList<Feed> feedArrayList, Context context) {
        this.feedArrayList = feedArrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public FeedAdapterViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.adapter_feed, viewGroup, false);
        return new FeedAdapterViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FeedAdapterViewHolder feedAdapterViewHolder, int i) {
        Feed postagem = feedArrayList.get(i);
        feedAdapterViewHolder.circleImageViewPerfil.setImageResource(foto_perfil);
        feedAdapterViewHolder.textViewUserName.setText(postagem.getNomeUsuario());
        feedAdapterViewHolder.textViewUserLoginName.setText(postagem.getUserLoginName());
        feedAdapterViewHolder.textViewFeedText.setText(postagem.getTextoFeed());
        feedAdapterViewHolder.textViewHoraPostado.setText(postagem.getHoraPostagem());
    }

    @Override
    public int getItemCount() {
        return feedArrayList.size();
    }

    public class FeedAdapterViewHolder extends RecyclerView.ViewHolder {
        private TextView textViewUserName;
        private TextView textViewUserLoginName;
        private TextView textViewFeedText;
        private TextView textViewHoraPostado;
        private ImageView circleImageViewPerfil;

        public FeedAdapterViewHolder(@NonNull View itemView) {
            super(itemView);
            textViewUserName = itemView.findViewById(R.id.textViewUserName);
            textViewUserLoginName = itemView.findViewById(R.id.textViewUserLoginName);
            textViewFeedText = itemView.findViewById(R.id.textViewTextoFeed);
            textViewHoraPostado = itemView.findViewById(R.id.textViewHoraPostagem);
            circleImageViewPerfil = itemView.findViewById(R.id.imageUserPerfil);

        }
    }
}
