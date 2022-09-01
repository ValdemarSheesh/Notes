package com.demo.notes;

import android.content.Context;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;

import java.util.List;

public class NAdapter extends ArrayAdapter<Note> {
    public NAdapter(@NonNull Context context, int resource, @NonNull List<Note> objects) {
        super(context, resource, objects);
    }
}
