package com.chen.xinyueweather.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.chen.xinyueweather.R;
import com.chen.xinyueweather.dao.bean.CityManage;
import com.chen.xinyueweather.widget.CircleTextView;

import java.util.List;

import butterknife.BindView;

/**
 * author long
 * date 17-10-18
 * desc
 */

public class CityManageAdapter extends RecyclerView.Adapter<CityManageAdapter.ViewHolder> {


    private LayoutInflater mInflater;

    private Context mContext;

    private List<CityManage> mList;

    public CityManageAdapter(Context context, List<CityManage> list) {
        mInflater = LayoutInflater.from(context);
        mContext = context;
        mList = list;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewHolder(mInflater.inflate(R.layout.item_location_manage, parent, false));
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.mCircleText.setText(mList.get(position).getAreaName().substring(0, 1));
        holder.mTvArea.setText(mList.get(position).getAreaName());
        if (!"".equals(mList.get(position).getWeather()) && mList.get(position).getWeather() != null) {
            holder.mTvType.setText(mList.get(position).getWeather());
        }
        if (mList.get(position).getTemperature() != 0) {
            holder.mTvTemp.setText(mList.get(position).getTemperature() + "");
        }
        holder.mRelativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String weatherId = mList.get(position).getWeatherId();
            }
        });
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {
        RelativeLayout mRelativeLayout;
        CircleTextView mCircleText;
        TextView mTvArea;
        TextView mTvType;
        TextView mTvTemp;

        public ViewHolder(View itemView) {
            super(itemView);
            mRelativeLayout = itemView.findViewById(R.id.relative_layout);
            mCircleText = itemView.findViewById(R.id.circle_text);
            mTvArea = itemView.findViewById(R.id.tv_area);
            mTvType = itemView.findViewById(R.id.tv_type);
            mTvTemp = itemView.findViewById(R.id.tv_temp);
        }
    }

}