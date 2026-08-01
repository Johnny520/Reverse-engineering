package com.google.android.material.timepicker;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* JADX INFO: renamed from: com.google.android.material.timepicker.f */
/* JADX INFO: loaded from: classes.dex */
public final class C0121f extends GestureDetector.SimpleOnGestureListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ TimePickerView f1211a;

    public C0121f(TimePickerView timePickerView) {
        this.f1211a = timePickerView;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        int i = TimePickerView.f1205q;
        this.f1211a.getClass();
        return false;
    }
}
