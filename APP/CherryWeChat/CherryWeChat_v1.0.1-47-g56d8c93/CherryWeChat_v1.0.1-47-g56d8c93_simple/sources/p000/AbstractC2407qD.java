package p000;

import java.util.Calendar;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: qD */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2407qD {

    /* JADX INFO: renamed from: a */
    public static final AtomicReference f8441a = null;

    static {
        f8441a = new AtomicReference();
    }

    /* JADX INFO: renamed from: a */
    public static Calendar m4843a(Calendar r4) {
        Calendar r42 = m4845c(r4);
        Calendar r0 = m4845c(null);
        r0.set(r42.get(1), r42.get(2), r42.get(5));
        return r0;
    }

    /* JADX INFO: renamed from: b */
    public static Calendar m4844b() {
        AbstractC1445gB r0 = (AbstractC1445gB) f8441a.get();
        Calendar r02 = Calendar.getInstance();
        r02.set(11, 0);
        r02.set(12, 0);
        r02.set(13, 0);
        r02.set(14, 0);
        r02.setTimeZone(TimeZone.getTimeZone("UTC"));
        return r02;
    }

    /* JADX INFO: renamed from: c */
    public static Calendar m4845c(Calendar r3) {
        Calendar r0 = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        if (r3 != null) goto L6;
        r0.clear();
        return r0;
    L6:
        r0.setTimeInMillis(r3.getTimeInMillis());
        return r0;
    }
}
