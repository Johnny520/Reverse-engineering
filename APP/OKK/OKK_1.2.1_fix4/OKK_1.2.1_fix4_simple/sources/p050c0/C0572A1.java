package p050c0;

import java.util.concurrent.ConcurrentHashMap;
import p009E0.C0180k;
import p040V0.C0400c;
import p040V0.C0401d;
import p040V0.C0402e;
import p040V0.InterfaceC0405h;

/* JADX INFO: renamed from: c0.A1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0572A1 {

    /* JADX INFO: renamed from: a */
    public static final ConcurrentHashMap f1693a = null;

    static {
        f1693a = new ConcurrentHashMap();
    }

    /* JADX INFO: renamed from: a */
    public static void m1384a(long[] r6) {
        long r02 = System.currentTimeMillis();
        ConcurrentHashMap r2 = f1693a;
        r2.entrySet().removeIf(new C0715z1(new C0712y1(r02)));
        if (r6.length != 0) goto L5;
        InterfaceC0405h r62 = C0400c.f890a;
    L6:
        C0401d r63 = new C0401d(new C0402e(r62, true, new C0570A(25)));
    L8:
        if (r63.hasNext() == false) goto L10;
        r2.put(Long.valueOf(((Number) r63.next()).longValue()), Long.valueOf(r02));
        goto L8
    L10:
        return;
    L5:
        r62 = new C0180k(1, r6);
        goto L6
    }
}
