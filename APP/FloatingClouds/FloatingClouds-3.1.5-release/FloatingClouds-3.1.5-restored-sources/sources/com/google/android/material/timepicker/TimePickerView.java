package com.google.android.material.timepicker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.C1247R;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.chip.Chip;
import p000a.ViewOnTouchListenerC0580ff;

/* JADX INFO: loaded from: classes.dex */
class TimePickerView extends ConstraintLayout {

    /* JADX INFO: renamed from: r */
    public static final /* synthetic */ int f6024r = 0;

    /* JADX INFO: renamed from: q */
    public final Chip f6025q;

    /* JADX INFO: renamed from: com.google.android.material.timepicker.TimePickerView$a */
    public class ViewOnClickListenerC1321a implements View.OnClickListener {
        public ViewOnClickListenerC1321a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            int i = TimePickerView.f6024r;
            TimePickerView.this.getClass();
        }
    }

    public TimePickerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        ViewOnClickListenerC1321a viewOnClickListenerC1321a = new ViewOnClickListenerC1321a();
        LayoutInflater.from(context).inflate(C1247R.layout.material_timepicker, this);
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) findViewById(C1247R.id.material_clock_period_toggle);
        materialButtonToggleGroup.f5526c.add(new C1324c());
        Chip chip = (Chip) findViewById(C1247R.id.material_minute_tv);
        Chip chip2 = (Chip) findViewById(C1247R.id.material_hour_tv);
        this.f6025q = chip2;
        ViewOnTouchListenerC0580ff viewOnTouchListenerC0580ff = new ViewOnTouchListenerC0580ff(new GestureDetector(getContext(), new C1325d(this)));
        chip.setOnTouchListener(viewOnTouchListenerC0580ff);
        chip2.setOnTouchListener(viewOnTouchListenerC0580ff);
        chip.setTag(C1247R.id.selection_type, 12);
        chip2.setTag(C1247R.id.selection_type, 10);
        chip.setOnClickListener(viewOnClickListenerC1321a);
        chip2.setOnClickListener(viewOnClickListenerC1321a);
        chip.setAccessibilityClassName("android.view.View");
        chip2.setAccessibilityClassName("android.view.View");
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (view == this && i == 0) {
            this.f6025q.sendAccessibilityEvent(8);
        }
    }
}
