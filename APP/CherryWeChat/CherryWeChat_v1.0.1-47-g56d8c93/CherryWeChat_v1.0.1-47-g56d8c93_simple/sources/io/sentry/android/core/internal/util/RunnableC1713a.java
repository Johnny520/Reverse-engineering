package io.sentry.android.core.internal.util;

import android.net.ConnectivityManager;
import io.sentry.C1981r;
import io.sentry.EnumC1606M;
import io.sentry.InterfaceC1610N;
import io.sentry.android.core.C1662E;
import java.util.Iterator;

/* JADX INFO: renamed from: io.sentry.android.core.internal.util.a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1713a implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f6203a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1714b f6204b;

    public /* synthetic */ RunnableC1713a(C1714b r1, int r2) {
        this.f6203a = r2;
        this.f6204b = r1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch(this.f6203a) {
            case 0: goto L55;
            case 1: goto L37;
            case 2: goto L35;
            default: goto L4;
        };
    L4:
        C1714b r0 = this.f6204b;
        r0.m3898t(null);
        EnumC1606M r2 = r0.m3894m();
        if (r2 != EnumC1606M.DISCONNECTED) goto L20;
        r0.f6221k.set(false);
        C1981r r3 = C1714b.f6207n.m4173a();
        Iterator r4 = C1714b.f6208o.iterator();     // Catch: Throwable -> L12
    L8:
        if (r4.hasNext() == false) goto L14;
        ((ConnectivityManager.NetworkCallback) r4.next()).onLost(null);     // Catch: Throwable -> L12
        goto L8
    L14:
        r3.close();
    L12:
        th = move-exception;
        r3.close();     // Catch: Throwable -> L17
    L19:
        throw th;
    L17:
        th = move-exception;
        th.addSuppressed(th);
    L20:
        C1981r r1 = r0.f6216f.m4173a();
        Iterator r32 = r0.f6215e.iterator();     // Catch: Throwable -> L26
    L22:
        if (r32.hasNext() == false) goto L28;
        ((InterfaceC1610N) r32.next()).mo3725i(r2);     // Catch: Throwable -> L26
        goto L22
    L28:
        r1.close();
        r0.m3893l();
        return;
    L26:
        th = move-exception;
        r1.close();     // Catch: Throwable -> L32
    L34:
        throw th;
    L32:
        th = move-exception;
        th.addSuppressed(th);
        goto L34
    L35:
        this.f6204b.m3897s(false);
        return;
    L37:
        C1714b r02 = this.f6204b;
        r02.m3897s(true);
        C1981r r12 = C1714b.f6207n.m4173a();
        C1714b.f6208o.clear();     // Catch: Throwable -> L49
        r12.close();
        C1981r r13 = C1714b.f6205l.m4173a();
        C1714b.f6206m = null;     // Catch: Throwable -> L43
        r13.close();
        C1662E.f5959e.m3812l(r02);
        return;
    L43:
        th = move-exception;
        r13.close();     // Catch: Throwable -> L46
    L48:
        throw th;
    L46:
        th = move-exception;
        th.addSuppressed(th);
    L49:
        th = move-exception;
        r12.close();     // Catch: Throwable -> L52
    L54:
        throw th;
    L52:
        th = move-exception;
        th.addSuppressed(th);
        goto L54
    L55:
        this.f6204b.m3893l();
    }
}
