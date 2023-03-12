package com.example.andoirdx;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Fragment0 extends Fragment {

    public Fragment0() {
        super(R.layout.fragment_0);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        Button button = view.findViewById(R.id.Button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = new Bundle();
                bundle.putString("key", "from Fragment0");
                Navigation.findNavController(view).navigate(R.id.action_Fragment0_to_Fragment1, bundle);
            }
        });
    }
}