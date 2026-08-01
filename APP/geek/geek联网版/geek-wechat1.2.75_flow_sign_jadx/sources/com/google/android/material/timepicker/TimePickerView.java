package com.google.android.material.timepicker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.chip.Chip;
import com.ljx.wechatmod.R;
import p000.ViewOnTouchListenerC0532nr;

/* JADX INFO: loaded from: classes.dex */
class TimePickerView extends ConstraintLayout {

    /* JADX INFO: renamed from: q */
    public static final /* synthetic */ int f1205q = 0;

    /* JADX INFO: renamed from: p */
    public final Chip f1206p;

    public TimePickerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        ViewOnClickListenerC0120e viewOnClickListenerC0120e = new ViewOnClickListenerC0120e(this);
        LayoutInflater.from(context).inflate(R.layout.material_timepicker, this);
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) findViewById(R.id.material_clock_period_toggle);
        materialButtonToggleGroup.f1013c.add(new C0119d());
        Chip chip = (Chip) findViewById(R.id.material_minute_tv);
        Chip chip2 = (Chip) findViewById(R.id.material_hour_tv);
        this.f1206p = chip2;
        ViewOnTouchListenerC0532nr viewOnTouchListenerC0532nr = new ViewOnTouchListenerC0532nr(1, new GestureDetector(getContext(), new C0121f(this)));
        chip.setOnTouchListener(viewOnTouchListenerC0532nr);
        chip2.setOnTouchListener(viewOnTouchListenerC0532nr);
        chip.setTag(R.id.selection_type, 12);
        chip2.setTag(R.id.selection_type, 10);
        chip.setOnClickListener(viewOnClickListenerC0120e);
        chip2.setOnClickListener(viewOnClickListenerC0120e);
        chip.setAccessibilityClassName("android.view.View");
        chip2.setAccessibilityClassName("android.view.View");
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (view == this && i == 0) {
            this.f1206p.sendAccessibilityEvent(8);
        }
    }
}
