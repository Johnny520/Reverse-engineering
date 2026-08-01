package com.google.android.material.timepicker;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* JADX INFO: loaded from: classes.dex */
public final class f extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ TimePickerView a;

    public f(TimePickerView r1) {
        this.a = r1;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent r1) {
        int r12 = TimePickerView.q;
        this.a.getClass();
        return false;
    }
}
