package io.sentry.backpressure;

import io.sentry.C1981r;
import io.sentry.C2046v2;
import io.sentry.C2054w1;
import io.sentry.EnumC1657a2;
import io.sentry.InterfaceC1833c0;
import io.sentry.util.C2029a;
import java.util.concurrent.Future;

/* JADX INFO: renamed from: io.sentry.backpressure.a */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1829a implements InterfaceC1830b, Runnable {

    /* JADX INFO: renamed from: a */
    public final C2046v2 f6611a;

    /* JADX INFO: renamed from: b */
    public final C2054w1 f6612b;

    /* JADX INFO: renamed from: c */
    public int f6613c;

    /* JADX INFO: renamed from: d */
    public volatile Future f6614d;

    /* JADX INFO: renamed from: e */
    public final C2029a f6615e;

    public RunnableC1829a(C2046v2 r3) {
        C2054w1 r0 = C2054w1.f7276a;
        this.f6613c = 0;
        this.f6614d = null;
        this.f6615e = new C2029a();
        this.f6611a = r3;
        this.f6612b = r0;
    }

    @Override // io.sentry.backpressure.InterfaceC1830b
    /* JADX INFO: renamed from: a */
    public final int mo3993a() {
        return this.f6613c;
    }

    /* JADX INFO: renamed from: b */
    public final void m3994b(int r5) {
        InterfaceC1833c0 r0 = this.f6611a.getExecutorService();
        if (r0.isClosed() == true) goto L14;
        C1981r r1 = this.f6615e.m4173a();
        this.f6614d = r0.mo3703q(this, r5);     // Catch: Throwable -> L8
        r1.close();
        return;
    L8:
        th = move-exception;
        r1.close();     // Catch: Throwable -> L11
    L13:
        throw th;
    L11:
        th = move-exception;
        th.addSuppressed(th);
        goto L13
    }

    @Override // io.sentry.backpressure.InterfaceC1830b
    public final void close() {
        Future r0 = this.f6614d;
        if (r0 == null) goto L14;
        C1981r r1 = this.f6615e.m4173a();
        r0.cancel(true);     // Catch: Throwable -> L8
        r1.close();
        return;
    L8:
        th = move-exception;
        r1.close();     // Catch: Throwable -> L11
    L13:
        throw th;
    L11:
        th = move-exception;
        th.addSuppressed(th);
        goto L13
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean r0 = this.f6612b.mo3711e();
        C2046v2 r1 = this.f6611a;
        if (r0 == true) goto L5;
        int r02 = this.f6613c;
        if (r02 >= 10) goto L11;
        this.f6613c = r02 + 1;
        r1.getLogger().mo3680e(EnumC1657a2.DEBUG, "Health check negative, downsampling with a factor of %d", new Object[]{Integer.valueOf(this.f6613c)});
    L11:
        m3994b(10000);
        return;
    L5:
        if (this.f6613c <= 0) goto L7;
        r1.getLogger().mo3680e(EnumC1657a2.DEBUG, "Health check positive, reverting to normal sampling.", new Object[0]);
    L7:
        this.f6613c = 0;
        goto L11
    }

    @Override // io.sentry.backpressure.InterfaceC1830b
    public final void start() {
        m3994b(500);
    }
}
