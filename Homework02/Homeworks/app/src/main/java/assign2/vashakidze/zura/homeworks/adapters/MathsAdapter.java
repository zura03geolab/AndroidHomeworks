package assign2.vashakidze.zura.homeworks.adapters;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

import assign2.vashakidze.zura.homeworks.R;
import assign2.vashakidze.zura.homeworks.model.MathCompCharacters;

/**
 * Created by Zurab Vashakidze on 29/04/2016.
 */
public class MathsAdapter extends BaseAdapter {

    private ArrayList<MathCompCharacters> list;
    private Context context;

    public MathsAdapter(Context context, ArrayList<MathCompCharacters> list){
        this.list= list;
        this.context = context;

    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView;
        ViewHolder viewHolder;

        if (convertView == null){
            listItemView = View.inflate(context, R.layout.list_item_view, null);

            TextView nameView = (TextView) listItemView.findViewById(R.id.nameView);
            ImageView imageView = (ImageView) listItemView.findViewById(R.id.imageView);

            viewHolder = new ViewHolder();
            viewHolder.nameFild = nameView;
            viewHolder.imageFild = imageView;

            listItemView.setTag(viewHolder);
        } else {
            listItemView = convertView;
            viewHolder = (ViewHolder) convertView.getTag();
        }

        MathCompCharacters character = (MathCompCharacters) getItem(position);

        viewHolder.nameFild.setText(character.getName());

        Picasso.with(context).load(character.getImage()).into(viewHolder.imageFild);



        return listItemView;
    }

    class ViewHolder {
        TextView nameFild;
        ImageView imageFild;
    }
}
