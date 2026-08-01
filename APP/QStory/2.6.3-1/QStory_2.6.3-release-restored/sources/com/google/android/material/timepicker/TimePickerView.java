package com.google.android.material.timepicker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.View;
import androidx.appcompat.widget.ViewOnTouchListenerC1026;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.davemorrissey.labs.subscaleview.C0328R;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.chip.Chip;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
class TimePickerView extends ConstraintLayout {

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public static final /* synthetic */ int f11184 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public final ClockHandView f11185;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public final Chip f11186;

    public TimePickerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        ViewOnClickListenerC4041 viewOnClickListenerC4041 = new ViewOnClickListenerC4041();
        LayoutInflater.from(context).inflate(C0328R.layout.material_timepicker, this);
        ClockFaceView clockFaceView = (ClockFaceView) findViewById(C0328R.id.material_clock_face);
        ((MaterialButtonToggleGroup) findViewById(C0328R.id.material_clock_period_toggle)).addOnButtonCheckedListener(new C4046());
        Chip chip = (Chip) findViewById(C0328R.id.material_minute_tv);
        Chip chip2 = (Chip) findViewById(C0328R.id.material_hour_tv);
        this.f11186 = chip2;
        this.f11185 = (ClockHandView) findViewById(C0328R.id.material_clock_hand);
        clockFaceView.setOnEnterKeyPressedListener(new C4047(this));
        ViewOnTouchListenerC1026 viewOnTouchListenerC1026 = new ViewOnTouchListenerC1026(new GestureDetector(getContext(), new C4040()), 1);
        chip.setOnTouchListener(viewOnTouchListenerC1026);
        chip2.setOnTouchListener(viewOnTouchListenerC1026);
        chip.setTag(C0328R.id.selection_type, 12);
        chip2.setTag(C0328R.id.selection_type, 10);
        chip.setOnClickListener(viewOnClickListenerC4041);
        chip2.setOnClickListener(viewOnClickListenerC4041);
        chip.setAccessibilityClassName("android.view.View");
        chip2.setAccessibilityClassName("android.view.View");
    }

    public void addOnRotateListener(InterfaceC4045 interfaceC4045) {
        this.f11185.addOnRotateListener(interfaceC4045);
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (view == this && i == 0) {
            this.f11186.sendAccessibilityEvent(8);
        }
    }

    public void setOnActionUpListener(InterfaceC4034 interfaceC4034) {
        this.f11185.setOnActionUpListener(interfaceC4034);
    }

    public void setOnDoubleTapListener(InterfaceC4042 interfaceC4042) {
    }

    public void setOnPeriodChangeListener(InterfaceC4043 interfaceC4043) {
    }
}
