package com.google.android.material.timepicker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.chip.Chip;
import org.luckypray.dexkit.C1031R;

/* JADX INFO: loaded from: classes.dex */
class TimePickerView extends ConstraintLayout {

    /* JADX INFO: renamed from: q */
    public static final /* synthetic */ int f2545q = 0;

    /* JADX INFO: renamed from: p */
    public final Chip f2546p;

    public TimePickerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        ViewOnClickListenerC0729g viewOnClickListenerC0729g = new ViewOnClickListenerC0729g(this);
        LayoutInflater.from(context).inflate(C1031R.layout.material_timepicker, this);
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) findViewById(C1031R.id.material_clock_period_toggle);
        materialButtonToggleGroup.f2356c.add(new C0728f(this));
        Chip chip = (Chip) findViewById(C1031R.id.material_minute_tv);
        Chip chip2 = (Chip) findViewById(C1031R.id.material_hour_tv);
        this.f2546p = chip2;
        ViewOnTouchListenerC0731i viewOnTouchListenerC0731i = new ViewOnTouchListenerC0731i(new GestureDetector(getContext(), new C0730h(this)));
        chip.setOnTouchListener(viewOnTouchListenerC0731i);
        chip2.setOnTouchListener(viewOnTouchListenerC0731i);
        chip.setTag(C1031R.id.selection_type, 12);
        chip2.setTag(C1031R.id.selection_type, 10);
        chip.setOnClickListener(viewOnClickListenerC0729g);
        chip2.setOnClickListener(viewOnClickListenerC0729g);
        chip.setAccessibilityClassName("android.view.View");
        chip2.setAccessibilityClassName("android.view.View");
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i2) {
        super.onVisibilityChanged(view, i2);
        if (view == this && i2 == 0) {
            this.f2546p.sendAccessibilityEvent(8);
        }
    }
}
