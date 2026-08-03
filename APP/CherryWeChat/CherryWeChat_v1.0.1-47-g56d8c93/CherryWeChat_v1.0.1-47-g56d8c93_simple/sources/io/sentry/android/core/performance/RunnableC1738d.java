package io.sentry.android.core.performance;

import android.os.Handler;
import android.os.Looper;
import io.sentry.android.core.C1696g;
import io.sentry.android.core.C1744r;

/* JADX INFO: renamed from: io.sentry.android.core.performance.d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1738d implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f6301a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1740f f6302b;

    public /* synthetic */ RunnableC1738d(C1740f r1, int r2) {
        this.f6301a = r2;
        this.f6302b = r1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch(this.f6301a) {
            case 0: goto L21;
            case 1: goto L19;
            case 2: goto L17;
            default: goto L4;
        };
    L4:
        C1740f r0 = this.f6302b;
        if (r0.f6318m.get() != 0) goto L23;
        r0.f6307b = false;
        C1744r r1 = r0.f6313h;
        if (r1 != null) goto L9;
    L11:
        C1696g r12 = r0.f6314i;
        if (r12 != null) goto L14;
        return;
    L14:
        if (r12.f6128i == false) goto L25;
        r12.mo3690a(true);
        r0.f6314i = null;
        return;
    L25:
        return;
    L9:
        if (r1.isRunning() == false) goto L11;
        r0.f6313h.close();
        r0.f6313h = null;
        goto L11
    L23:
        return;
    L17:
        this.f6302b.m3916c();
        return;
    L19:
        this.f6302b.m3916c();
        return;
    L21:
        Handler r02 = new Handler(Looper.getMainLooper());
        C1740f r3 = this.f6302b;
        r02.post(new RunnableC1738d(r3, 3));
    }
}
