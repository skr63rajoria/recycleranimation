package com.tlg.slidinganimationrecyclerview.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.view.animation.LayoutAnimationController;
import android.widget.Button;
import android.widget.Toast;

import com.tlg.slidinganimationrecyclerview.R;
import com.tlg.slidinganimationrecyclerview.adapter.CountryAdapter;
import com.tlg.slidinganimationrecyclerview.util.Constants;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private RecyclerView countryRecyclerView;
    private CountryAdapter countryAdapter;
    private Button normalBtn,topToBottomBtn,bottomToTopBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        normalBtn = findViewById(R.id.btn_normal);
        topToBottomBtn = findViewById(R.id.btn_random_animation);
        bottomToTopBtn = findViewById(R.id.btn_reverse_anumation);
        countryRecyclerView = findViewById(R.id.data_recycler_view);

        normalBtn.setOnClickListener(this);
        topToBottomBtn.setOnClickListener(this);
        bottomToTopBtn.setOnClickListener(this);

        countryAdapter = new CountryAdapter(this, Constants.getCountryList());
        countryRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        countryRecyclerView.setAdapter(countryAdapter);
        runLayoutAnimation(countryRecyclerView, R.anim.layout_animation_fall_normal);
    }



    private void runLayoutAnimation(final RecyclerView recyclerView,int animStyle) {
        countryRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        countryRecyclerView.setAdapter(countryAdapter);
        LayoutAnimationController animation = AnimationUtils.loadLayoutAnimation(this, animStyle);
        recyclerView.setLayoutAnimation(animation);
        countryAdapter.notifyDataSetChanged();
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_random_animation:
                runLayoutAnimation(countryRecyclerView,R.anim.layout_animation_fall_random);
                break;
            case R.id.btn_normal:
                runLayoutAnimation(countryRecyclerView,R.anim.layout_animation_fall_normal);
                break;
            case R.id.btn_reverse_anumation:
                runLayoutAnimation(countryRecyclerView,R.anim.layout_animation_fall_reverse);
                break;
                default:
                    Toast.makeText(this, "Not getting view event", Toast.LENGTH_SHORT).show();
        }
    }
}
