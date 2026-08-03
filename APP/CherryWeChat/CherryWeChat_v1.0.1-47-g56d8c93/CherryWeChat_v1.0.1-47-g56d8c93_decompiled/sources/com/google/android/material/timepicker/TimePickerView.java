package com.google.android.material.timepicker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.chip.Chip;
import io.github.cherrywechat.R;
import p000.ViewOnTouchListenerC0246Fo;

/* JADX INFO: loaded from: classes.dex */
class TimePickerView extends ConstraintLayout {

    /* JADX INFO: renamed from: r */
    public static final /* synthetic */ int f4700r = 0;

    /* JADX INFO: renamed from: q */
    public final Chip f4701q;

    public TimePickerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        ViewOnClickListenerC1284f viewOnClickListenerC1284f = new ViewOnClickListenerC1284f(this);
        LayoutInflater.from(context).inflate(R.layout.material_timepicker, this);
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) findViewById(R.id.material_clock_period_toggle);
        materialButtonToggleGroup.f4499k.add(new C1283e());
        Chip chip = (Chip) findViewById(R.id.material_minute_tv);
        Chip chip2 = (Chip) findViewById(R.id.material_hour_tv);
        this.f4701q = chip2;
        ViewOnTouchListenerC0246Fo viewOnTouchListenerC0246Fo = new ViewOnTouchListenerC0246Fo(1, new GestureDetector(getContext(), new C1285g(this)));
        chip.setOnTouchListener(viewOnTouchListenerC0246Fo);
        chip2.setOnTouchListener(viewOnTouchListenerC0246Fo);
        chip.setTag(R.id.selection_type, 12);
        chip2.setTag(R.id.selection_type, 10);
        chip.setOnClickListener(viewOnClickListenerC1284f);
        chip2.setOnClickListener(viewOnClickListenerC1284f);
        chip.setAccessibilityClassName("android.view.View");
        chip2.setAccessibilityClassName("android.view.View");
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (view == this && i == 0) {
            this.f4701q.sendAccessibilityEvent(8);
        }
    }
}
