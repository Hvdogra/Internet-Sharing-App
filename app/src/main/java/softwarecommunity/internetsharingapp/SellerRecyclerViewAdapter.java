package softwarecommunity.internetsharingapp;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.util.List;

/**
 * Created by sachin on 26/01/18.
 * created with the help of this refrence here :
 * https://github.com/codepath/android_guides/wiki/Using-the-RecyclerView
 */

public class SellerRecyclerViewAdapter extends
        RecyclerView.Adapter
                <SellerRecyclerViewAdapter.ViewHolder> {


    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView dataTextView;
        public TextView timeTextView;
        public Button contactButton;

        public ViewHolder(View itemView) {
            super(itemView);

            dataTextView = (TextView) itemView.findViewById(R.id.second_recycler_component_data);
            timeTextView = (TextView) itemView.findViewById(R.id.second_recycler_component_time);
            contactButton = (Button) itemView.findViewById(R.id.second_recycler_component_button_connect);
        }
    }

    private List<seller> mseller;
    private Context mContext;

    public SellerRecyclerViewAdapter(Context context, List<seller> sellers) {
        mseller = sellers;
        mContext = context;
    }

    private Context getContext() {
        return mContext;
    }

    @Override
    public SellerRecyclerViewAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        View sellerView = inflater.inflate(R.layout.second_recycler_component, parent, false);

        ViewHolder viewHolder = new ViewHolder(sellerView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(SellerRecyclerViewAdapter.ViewHolder viewHolder, int position) {
        seller sell = mseller.get(position);

        TextView data = viewHolder.dataTextView;
        TextView time = viewHolder.timeTextView;
        data.setText("data:"+sell.GetDataLimit());
        time.setText("time:"+sell.GetTimeLimit());


    }

    @Override
    public int getItemCount() {
        return mseller.size();
    }

}
