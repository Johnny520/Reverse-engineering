package defpackage;

import java.util.Calendar;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public abstract class u80 {
    public static final AtomicReference a = null;

    static {
        a = new AtomicReference();
    }

    public static Calendar a(Calendar r4) {
        Calendar r42 = c(r4);
        Calendar r0 = c(null);
        r0.set(r42.get(1), r42.get(2), r42.get(5));
        return r0;
    }

    public static Calendar b() {
        w60 r0 = (w60) a.get();
        Calendar r02 = Calendar.getInstance();
        r02.set(11, 0);
        r02.set(12, 0);
        r02.set(13, 0);
        r02.set(14, 0);
        r02.setTimeZone(TimeZone.getTimeZone("UTC"));
        return r02;
    }

    public static Calendar c(Calendar r3) {
        Calendar r0 = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        if (r3 != null) goto L6;
        r0.clear();
        return r0;
    L6:
        r0.setTimeInMillis(r3.getTimeInMillis());
        return r0;
    }
}
