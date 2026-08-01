package com.google.android.material.timepicker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.View;
import androidx.appcompat.widget.ViewOnTouchListenerC0179;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.davemorrissey.labs.subscaleview.R;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.chip.Chip;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
class TimePickerView extends ConstraintLayout {

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public static final /* synthetic */ int f10839 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public final ClockHandView f10840;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public final Chip f10841;

    public TimePickerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        ViewOnClickListenerC3209 viewOnClickListenerC3209 = new ViewOnClickListenerC3209();
        LayoutInflater.from(context).inflate(R.layout.material_timepicker, this);
        ClockFaceView clockFaceView = (ClockFaceView) findViewById(R.id.material_clock_face);
        ((MaterialButtonToggleGroup) findViewById(R.id.material_clock_period_toggle)).addOnButtonCheckedListener(new C3214());
        Chip chip = (Chip) findViewById(R.id.material_minute_tv);
        Chip chip2 = (Chip) findViewById(R.id.material_hour_tv);
        this.f10841 = chip2;
        this.f10840 = (ClockHandView) findViewById(R.id.material_clock_hand);
        clockFaceView.setOnEnterKeyPressedListener(new C3215(this));
        ViewOnTouchListenerC0179 viewOnTouchListenerC0179 = new ViewOnTouchListenerC0179(new GestureDetector(getContext(), new C3208()), 1);
        chip.setOnTouchListener(viewOnTouchListenerC0179);
        chip2.setOnTouchListener(viewOnTouchListenerC0179);
        chip.setTag(R.id.selection_type, 12);
        chip2.setTag(R.id.selection_type, 10);
        chip.setOnClickListener(viewOnClickListenerC3209);
        chip2.setOnClickListener(viewOnClickListenerC3209);
        chip.setAccessibilityClassName("android.view.View");
        chip2.setAccessibilityClassName("android.view.View");
    }

    public void addOnRotateListener(InterfaceC3213 interfaceC3213) {
        this.f10840.addOnRotateListener(interfaceC3213);
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (view == this && i == 0) {
            this.f10841.sendAccessibilityEvent(8);
        }
    }

    public void setOnActionUpListener(InterfaceC3202 interfaceC3202) {
        this.f10840.setOnActionUpListener(interfaceC3202);
    }

    public void setOnDoubleTapListener(InterfaceC3210 interfaceC3210) {
    }

    public void setOnPeriodChangeListener(InterfaceC3211 interfaceC3211) {
    }
}
