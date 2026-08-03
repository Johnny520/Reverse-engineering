package com.google.android.material.timepicker;

import Yue.InterfaceC5459;
import Yue.InterfaceC7613;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes.dex */
interface TimePickerControls {

    @Retention(RetentionPolicy.SOURCE)
    public @interface ActiveSelection {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface ClockPeriod {
    }

    void setActiveSelection(int i);

    void setHandRotation(float f);

    void setValues(String[] strArr, @InterfaceC7613 int i);

    void updateTime(int i, int i2, @InterfaceC5459(from = 0) int i3);
}
