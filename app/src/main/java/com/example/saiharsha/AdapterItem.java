package com.example.saiharsha;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.RadioButton;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AdapterItem extends RecyclerView.Adapter<AdapterItem.MyHolder> {
    List<ClassItem> classItems;
    private int lastSelectedPositionRadioButton = -1;
    public String getRadioButtonValue;
    
    public AdapterItem(List<ClassItem> classItems){
        this.classItems = classItems;
    }

    @NonNull
    @Override
    public AdapterItem.MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.activity_close, parent, false);
        return new MyHolder(classItems);

    }

    @Override
    public void onBindViewHolder(@NonNull AdapterItem.MyHolder holder, int position) {

        ClassItem classItem = classItems.get(position);
        holder.etHeight.setText("6" + classItem.getHeight());
        holder.radioButton2.setChecked(lastSelectedPositionRadioButton  == position);

    }

    @Override
    public int getItemCount() {
        return classItems.size();
    }

    public class MyHolder extends RecyclerView.ViewHolder {

        RadioButton radioButton1,radioButton2;
        EditText etHeight;


        public MyHolder(@NonNull View itemView) {
            super(itemView);


            radioButton1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    lastSelectedPositionRadioButton = getAdapterPosition();
                    getRadioButtonValue = radioButton1.getText().toString();
                    notifyDataSetChanged();
                }
            });

            radioButton2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    lastSelectedPositionRadioButton = getAdapterPosition();
                    getRadioButtonValue = radioButton2.getText().toString();
                    notifyDataSetChanged();
                }
            });

        }

        public MyHolder(List<ClassItem> classItems) {
            super((View) classItems);
            radioButton1 = itemView.findViewById(R.id.radio_step);
            radioButton2 = itemView.findViewById(R.id.radio_Extension);
            etHeight = itemView.findViewById(R.id.et_height);
        }
    }
}
