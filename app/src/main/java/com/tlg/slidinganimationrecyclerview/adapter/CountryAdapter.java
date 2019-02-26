package com.tlg.slidinganimationrecyclerview.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.tlg.slidinganimationrecyclerview.R;
import com.tlg.slidinganimationrecyclerview.model.Country;

import java.util.ArrayList;

public class CountryAdapter extends RecyclerView.Adapter<CountryAdapter.CountryViewHolder> {
    private Context context;
    private ArrayList<Country> countries;

    public CountryAdapter(Context context, ArrayList<Country> countries) {
        this.context = context;
        this.countries = countries;
    }

    @NonNull
    @Override
    public CountryViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.data_cell,viewGroup,false);
        return new CountryViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CountryViewHolder countryViewHolder, int i) {
        Country country = countries.get(i);
        countryViewHolder.countryNameTv.setText(country.getCountryName());
        countryViewHolder.capitalNameTv.setText(country.getCapitalName());

    }

    @Override
    public int getItemCount() {
        return countries.size();
    }

    public class CountryViewHolder extends RecyclerView.ViewHolder{

    public TextView countryNameTv,capitalNameTv;
    public CountryViewHolder(@NonNull View itemView) {
        super(itemView);
        countryNameTv =itemView.findViewById(R.id.country_name_cell_tv);
        capitalNameTv =itemView.findViewById(R.id.capital_name_cell_tv);
    }
}
}
