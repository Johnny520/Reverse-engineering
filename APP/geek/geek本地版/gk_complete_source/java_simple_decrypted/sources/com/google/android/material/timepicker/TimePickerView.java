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
import defpackage.jr;

/* JADX INFO: loaded from: classes.dex */
class TimePickerView extends ConstraintLayout {
    public static final /* synthetic */ int q = 0;
    public final Chip p;

    public TimePickerView(Context r5, AttributeSet r6) {
        super(r5, r6, 0);
        e r62 = new e(this);
        LayoutInflater.from(r5).inflate(R.layout.material_timepicker, this);
        ClockFaceView r52 = (ClockFaceView) findViewById(R.id.material_clock_face);
        MaterialButtonToggleGroup r53 = (MaterialButtonToggleGroup) findViewById(R.id.material_clock_period_toggle);
        d r0 = new d();
        r53.c.add(r0);
        Chip r54 = (Chip) findViewById(R.id.material_minute_tv);
        Chip r02 = (Chip) findViewById(R.id.material_hour_tv);
        this.p = r02;
        ClockHandView r1 = (ClockHandView) findViewById(R.id.material_clock_hand);
        jr r2 = new jr(1, new GestureDetector(getContext(), new f(this)));
        r54.setOnTouchListener(r2);
        r02.setOnTouchListener(r2);
        r54.setTag(R.id.selection_type, 12);
        r02.setTag(R.id.selection_type, 10);
        r54.setOnClickListener(r62);
        r02.setOnClickListener(r62);
        r54.setAccessibilityClassName("android.view.View");
        r02.setAccessibilityClassName("android.view.View");
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View r1, int r2) {
        super.onVisibilityChanged(r1, r2);
        if (r1 != this) goto L7;
        if (r2 != 0) goto L8;
        this.p.sendAccessibilityEvent(8);
        return;
    L8:
        return;
    }
}
