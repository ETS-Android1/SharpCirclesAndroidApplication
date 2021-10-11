package com.example.sharpcirclesandroidapp;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.sharpcirclesandroidapp.steps.StepOneActivity;

import java.util.List;

public class SeoStepsAdapter extends RecyclerView.Adapter<SeoStepsAdapter.ViewHolder> {
    List<SeoSteps> seosteps;
    Context context;

    public SeoStepsAdapter(List<SeoSteps> seosteps){
        this.seosteps = seosteps;
    }

    @NonNull
    @Override
    public SeoStepsAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_listview,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        context = parent.getContext();
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull SeoStepsAdapter.ViewHolder holder, int position) {
        SeoSteps tvShow = seosteps.get(position);

        holder.textSteps.setText(tvShow.getSteps());
        holder.step.setText(tvShow.getStepnum());
        holder.cv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Intent intent;
                switch (holder.getAdapterPosition()){
                    case 0:
                        intent = new Intent(context, StepOneActivity.class);
                        break;
                    case 1:
                        intent = new Intent(context, StepOneActivity.class);
                        break;
                    case 2:
                        intent = new Intent(context, StepOneActivity.class);
                        break;
                    case 3:
                        intent = new Intent(context, StepOneActivity.class);
                        break;
                    case 4:
                        intent = new Intent(context, StepOneActivity.class);
                        break;
                    case 5:
                        intent = new Intent(context, StepOneActivity.class);
                        break;
                    case 6:
                        intent = new Intent(context, StepOneActivity.class);
                        break;
                    case 7:
                        intent = new Intent(context, StepOneActivity.class);
                        break;
                    case 8:
                        intent = new Intent(context, StepOneActivity.class);
                        break;
                    case 9:
                        intent = new Intent(context, StepOneActivity.class);
                        break;
                    default:
                        intent = new Intent(context, StepOneActivity.class);
                        break;
                }
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return seosteps.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView textSteps;
        TextView step;
        CardView cv;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            context = itemView.getContext();
            textSteps =(TextView)itemView.findViewById(R.id.label);
            step=(TextView)itemView.findViewById(R.id.tvstep);
            cv =(CardView)itemView.findViewById(R.id.cv);
        }
    }
}
