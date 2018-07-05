package com.example.rupali.mahimaelectronics;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;


/**
 * A simple {@link Fragment} subclass.
 */
public class AboutUsFragment extends Fragment {

    ImageView fbFollow;
    TextView websiteUrl;
    public AboutUsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =inflater.inflate(R.layout.fragment_about_us, container, false);
        fbFollow=view.findViewById(R.id.fb_follow);
        websiteUrl=view.findViewById(R.id.website_url);
        fbFollow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                String url = "https://www.facebook.com/mahimaelectronics/";
                intent.setData(Uri.parse(url));
                startActivity(intent);

            }
        });
        websiteUrl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "http://www.mahimaelectronics.com/";
                Intent i = new Intent();
                i.setAction(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });
        return view;
    }

}
