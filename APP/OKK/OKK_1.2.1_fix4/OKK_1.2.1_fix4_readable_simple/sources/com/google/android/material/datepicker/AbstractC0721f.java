package com.google.android.material.datepicker;

import java.util.Calendar;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: com.google.android.material.datepicker.f */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0721f {
    static {
        new AtomicReference();
    }

    /* JADX INFO: renamed from: a */
    public static Calendar m1880a(Calendar r3) {
        Calendar r02 = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        if (r3 != null) goto L5;
        r02.clear();
    L6:
        return r02;
    L5:
        r02.setTimeInMillis(r3.getTimeInMillis());
        goto L6
    }
}
