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

    public TimePickerView(Context r5, AttributeSet r6) {
        super(r5, r6, 0);
        ViewOnClickListenerC0729g r62 = new ViewOnClickListenerC0729g(this);
        LayoutInflater.from(r5).inflate(C1031R.layout.material_timepicker, this);
        ClockFaceView r52 = (ClockFaceView) findViewById(C1031R.id.material_clock_face);
        MaterialButtonToggleGroup r53 = (MaterialButtonToggleGroup) findViewById(C1031R.id.material_clock_period_toggle);
        C0728f r02 = new C0728f(this);
        r53.f2356c.add(r02);
        Chip r54 = (Chip) findViewById(C1031R.id.material_minute_tv);
        Chip r03 = (Chip) findViewById(C1031R.id.material_hour_tv);
        this.f2546p = r03;
        ClockHandView r1 = (ClockHandView) findViewById(C1031R.id.material_clock_hand);
        ViewOnTouchListenerC0731i r2 = new ViewOnTouchListenerC0731i(new GestureDetector(getContext(), new C0730h(this)));
        r54.setOnTouchListener(r2);
        r03.setOnTouchListener(r2);
        r54.setTag(C1031R.id.selection_type, 12);
        r03.setTag(C1031R.id.selection_type, 10);
        r54.setOnClickListener(r62);
        r03.setOnClickListener(r62);
        r54.setAccessibilityClassName("android.view.View");
        r03.setAccessibilityClassName("android.view.View");
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View r1, int r2) {
        super.onVisibilityChanged(r1, r2);
        if (r1 != this) goto L7;
        if (r2 != 0) goto L8;
        this.f2546p.sendAccessibilityEvent(8);
        return;
    L8:
        return;
    }
}
