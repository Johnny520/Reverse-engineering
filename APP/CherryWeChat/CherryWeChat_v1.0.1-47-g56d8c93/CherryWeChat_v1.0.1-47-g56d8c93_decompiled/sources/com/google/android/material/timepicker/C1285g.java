package com.google.android.material.timepicker;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* JADX INFO: renamed from: com.google.android.material.timepicker.g */
/* JADX INFO: loaded from: classes.dex */
public final class C1285g extends GestureDetector.SimpleOnGestureListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ TimePickerView f4707a;

    public C1285g(TimePickerView timePickerView) {
        this.f4707a = timePickerView;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        int i = TimePickerView.f4700r;
        this.f4707a.getClass();
        return false;
    }
}
