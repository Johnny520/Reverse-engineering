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

    public TimePickerView(Context r5, AttributeSet r6) {
        super(r5, r6, 0);
        ViewOnClickListenerC1284f r62 = new ViewOnClickListenerC1284f(this);
        LayoutInflater.from(r5).inflate(R.layout.material_timepicker, this);
        ClockFaceView r52 = (ClockFaceView) findViewById(R.id.material_clock_face);
        MaterialButtonToggleGroup r53 = (MaterialButtonToggleGroup) findViewById(R.id.material_clock_period_toggle);
        C1283e r0 = new C1283e();
        r53.f4499k.add(r0);
        Chip r54 = (Chip) findViewById(R.id.material_minute_tv);
        Chip r02 = (Chip) findViewById(R.id.material_hour_tv);
        this.f4701q = r02;
        ClockHandView r1 = (ClockHandView) findViewById(R.id.material_clock_hand);
        ViewOnTouchListenerC0246Fo r2 = new ViewOnTouchListenerC0246Fo(1, new GestureDetector(getContext(), new C1285g(this)));
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
        this.f4701q.sendAccessibilityEvent(8);
        return;
    L8:
        return;
    }
}
