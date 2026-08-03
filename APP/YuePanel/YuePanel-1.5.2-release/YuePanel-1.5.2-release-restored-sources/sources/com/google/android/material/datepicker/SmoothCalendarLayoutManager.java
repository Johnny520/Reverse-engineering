package com.google.android.material.datepicker;

import android.content.Context;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.C8983;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
class SmoothCalendarLayoutManager extends LinearLayoutManager {
    private static final float MILLISECONDS_PER_INCH = 100.0f;

    public SmoothCalendarLayoutManager(Context context, int i, boolean z) {
        super(context, i, z);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC8919
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.C8935 c8935, int i) {
        C8983 c8983 = new C8983(recyclerView.getContext()) { // from class: com.google.android.material.datepicker.SmoothCalendarLayoutManager.1
            @Override // androidx.recyclerview.widget.C8983
            public float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
                return SmoothCalendarLayoutManager.MILLISECONDS_PER_INCH / displayMetrics.densityDpi;
            }
        };
        c8983.setTargetPosition(i);
        startSmoothScroll(c8983);
    }
}
