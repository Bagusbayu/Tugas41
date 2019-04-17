package com.example.tugas41;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class makan5 extends Fragment {
    protected Button button;
    protected Button button1;
    @Nullable
@Override
public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
    View view = inflater.inflate(R.layout.makan5,container,false);
    button = view.findViewById(R.id.button1);
    button1 = view.findViewById(R.id.button);
    button.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            openmenu();
        }
    });
    button1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Toast.makeText(getActivity(), "Masih BUG", Toast.LENGTH_SHORT).show();
        }
    });
    return view;
}
    public void openmenu(){
        Intent intent = new Intent(getActivity(), MainActivity.class);
        startActivity(intent);
}
}
