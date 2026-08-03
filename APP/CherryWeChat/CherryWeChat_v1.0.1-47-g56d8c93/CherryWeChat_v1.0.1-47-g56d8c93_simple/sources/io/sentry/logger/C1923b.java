package io.sentry.logger;

import io.sentry.C1563B0;
import io.sentry.C1580F1;
import io.sentry.C1638U1;
import io.sentry.C1835c2;
import io.sentry.C1864d2;
import io.sentry.C1981r;
import io.sentry.C2046v2;
import io.sentry.EnumC1657a2;
import io.sentry.RunnableC1587H0;
import io.sentry.RunnableC1631S1;
import io.sentry.transport.C2022q;
import io.sentry.util.C2029a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: io.sentry.logger.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1923b implements InterfaceC1922a {

    /* JADX INFO: renamed from: f */
    public static final C2029a f6810f = null;

    /* JADX INFO: renamed from: a */
    public final C2046v2 f6811a;

    /* JADX INFO: renamed from: b */
    public final C1580F1 f6812b;

    /* JADX INFO: renamed from: c */
    public final ConcurrentLinkedQueue f6813c;

    /* JADX INFO: renamed from: d */
    public final C1638U1 f6814d;

    /* JADX INFO: renamed from: e */
    public final C1563B0 f6815e;

    static {
        f6810f = new C2029a();
    }

    public C1923b(C2046v2 r4, C1580F1 r5) {
        this.f6815e = new C1563B0(7, false);
        this.f6811a = r4;
        this.f6812b = r5;
        this.f6813c = new ConcurrentLinkedQueue();
        this.f6814d = new C1638U1(r4);
    }

    @Override // io.sentry.logger.InterfaceC1922a
    /* JADX INFO: renamed from: a */
    public final void mo4142a(boolean r4) {
        C1638U1 r0 = this.f6814d;
        if (r4 == false) goto L6;
        m4145d(true);
        r0.submit(new RunnableC1631S1(11, this));
        return;
    L6:
        r0.mo3695g(this.f6811a.getShutdownTimeoutMillis());
    L8:
        if (this.f6813c.isEmpty() == true) goto L10;
        m4144c();
        goto L8
    }

    @Override // io.sentry.logger.InterfaceC1922a
    /* JADX INFO: renamed from: b */
    public final void mo4143b(long r4) {
        m4145d(true);
        C1563B0 r1 = this.f6815e;     // Catch: InterruptedException -> L5
        TimeUnit r2 = TimeUnit.MILLISECONDS;     // Catch: InterruptedException -> L5
        r1.getClass();     // Catch: InterruptedException -> L5
        ((C2022q) r1.f5600a).tryAcquireSharedNanos(1, r2.toNanos(r4));     // Catch: InterruptedException -> L5
        return;
    L5:
        e = move-exception;
        this.f6811a.getLogger().mo3683r(EnumC1657a2.ERROR, "Failed to flush log events", e);
        Thread.currentThread().interrupt();
    }

    /* JADX INFO: renamed from: c */
    public final void m4144c() {
        ArrayList r0 = new ArrayList(100);
    L3:
        ConcurrentLinkedQueue r2 = this.f6813c;
        C1835c2 r3 = (C1835c2) r2.poll();
        if (r3 == null) goto L7;
        r0.add(r3);
    L7:
        if (r2.isEmpty() == true) goto L11;
        if (r0.size() < 100) goto L3;
    L11:
        if (r0.isEmpty() == true) goto L20;
        int r22 = 0;
        C1864d2 r1 = new C1864d2(0, r0);
        C1580F1 r32 = this.f6812b;
        r32.getClass();
        r32.m3660s(r32.m3655m(r1), null);     // Catch: IOException -> L15
    L18:
        if (r22 >= r0.size()) goto L28;
        C2022q r12 = (C2022q) this.f6815e.f5600a;
        int r33 = C2022q.f7210a;
        r12.releaseShared(1);
        r22 = r22 + 1;
        goto L18
    L28:
        return;
    L15:
        e = move-exception;
        r32.f5692b.getLogger().mo3682n(EnumC1657a2.WARNING, e, "Capturing log failed.", new Object[0]);
        goto L18
    }

    /* JADX INFO: renamed from: d */
    public final void m4145d(boolean r6) {
        C1981r r0 = f6810f.m4173a();
        if (r6 == false) goto L5;
        int r62 = 0;
    L17:
        this.f6814d.mo3703q(new RunnableC1587H0(7, this), r62);     // Catch: Throwable -> L9
        r0.close();
        return;
    L9:
        th = move-exception;
        r0.close();     // Catch: Throwable -> L12
    L14:
        throw th;
    L12:
        th = move-exception;
        th.addSuppressed(th);
        goto L14
    L5:
        r62 = 5000;
        goto L17
    }
}
