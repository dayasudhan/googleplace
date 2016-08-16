package com.khaanavali.googleplace;

/**
 * Created by dganeshappa on 8/10/2016.
 */
import android.os.Bundle;
        import android.support.annotation.Nullable;
        import android.support.v4.app.Fragment;
        import android.text.Html;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.Button;
        import android.widget.TextView;

        import com.khaanavali.googleplace.R;



public class AddPlaceFragment extends Fragment {

    View rootview;
    // Session Manager Class
    // Button Logout
    Button btnLogout;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootview=inflater.inflate(R.layout.addplacelayout,container,false);
        // Session class instance





        return rootview;
    }



}
