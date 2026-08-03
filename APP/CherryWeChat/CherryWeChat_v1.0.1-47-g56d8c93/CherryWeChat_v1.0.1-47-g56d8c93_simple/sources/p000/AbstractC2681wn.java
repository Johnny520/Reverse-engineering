package p000;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: wn */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2681wn {

    /* JADX INFO: renamed from: a */
    public static final CopyOnWriteArrayList f9241a = null;

    static {
        f9241a = new CopyOnWriteArrayList();
    }

    /* JADX INFO: renamed from: a */
    public static C0175E2 m5250a(String r4) {
        Iterator r0 = f9241a.iterator();
    L4:
        if (r0.hasNext() == false) goto L15;
        C0175E2 r1 = (C0175E2) r0.next();
        monitor-enter(r1);
        boolean r2 = r4.toLowerCase(Locale.US).startsWith("android-keystore://");     // Catch: Throwable -> L11
        monitor-exit(r1);
        if (r2 == false) goto L4;
        return r1;
    L11:
        th = move-exception;
        throw th;
    L15:
        throw new GeneralSecurityException(AbstractC0213Ey.m420r("No KMS client does support: ", r4));
    }
}
