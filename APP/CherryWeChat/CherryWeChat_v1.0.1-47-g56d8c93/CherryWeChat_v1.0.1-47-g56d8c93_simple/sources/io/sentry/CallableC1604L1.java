package io.sentry;

import io.sentry.internal.debugmeta.C1901c;
import java.net.InetAddress;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: io.sentry.L1 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class CallableC1604L1 implements Callable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f5784a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f5785b;

    public /* synthetic */ CallableC1604L1(int r1, Object r2) {
        this.f5784a = r1;
        this.f5785b = r2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch(this.f5784a) {
            case 0: goto L42;
            case 1: goto L40;
            case 2: goto L38;
            case 3: goto L36;
            case 4: goto L34;
            case 5: goto L32;
            case 6: goto L30;
            case 7: goto L28;
            case 8: goto L26;
            case 9: goto L24;
            case 10: goto L22;
            case 11: goto L20;
            case 12: goto L18;
            case 13: goto L16;
            case 14: goto L14;
            case 15: goto L12;
            default: goto L4;
        };
    L4:
        C1598K r0 = (C1598K) this.f5785b;
        r0.f5770e.getClass();     // Catch: Throwable -> L8
        r0.f5767b = InetAddress.getLocalHost().getCanonicalHostName();     // Catch: Throwable -> L8
        r0.f5768c = System.currentTimeMillis() + r0.f5766a;     // Catch: Throwable -> L8
        r0.f5769d.set(false);
        return null;
    L8:
        th = move-exception;
        r0.f5769d.set(false);
        throw th;
    L12:
        return ((C1901c) this.f5785b).m4103l();
    L14:
        return Integer.valueOf(((C1901c) this.f5785b).m4103l().length);
    L16:
        return ((C1901c) this.f5785b).m4103l();
    L18:
        return Integer.valueOf(((C1901c) this.f5785b).m4103l().length);
    L20:
        return ((C1901c) this.f5785b).m4103l();
    L22:
        return ((C1901c) this.f5785b).m4103l();
    L24:
        return Integer.valueOf(((C1901c) this.f5785b).m4103l().length);
    L26:
        return ((C1901c) this.f5785b).m4103l();
    L28:
        return Integer.valueOf(((C1901c) this.f5785b).m4103l().length);
    L30:
        return Integer.valueOf(((C1901c) this.f5785b).m4103l().length);
    L32:
        return ((C1901c) this.f5785b).m4103l();
    L34:
        return Integer.valueOf(((C1901c) this.f5785b).m4103l().length);
    L36:
        return ((C1901c) this.f5785b).m4103l();
    L38:
        return Integer.valueOf(((C1901c) this.f5785b).m4103l().length);
    L40:
        return ((C1901c) this.f5785b).m4103l();
    L42:
        return Integer.valueOf(((C1901c) this.f5785b).m4103l().length);
    }
}
