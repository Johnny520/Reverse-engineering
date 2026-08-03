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
    public static final C2029a f6810f = new C2029a();

    /* JADX INFO: renamed from: a */
    public final C2046v2 f6811a;

    /* JADX INFO: renamed from: b */
    public final C1580F1 f6812b;

    /* JADX INFO: renamed from: d */
    public final C1638U1 f6814d;

    /* JADX INFO: renamed from: e */
    public final C1563B0 f6815e = new C1563B0(7, false);

    /* JADX INFO: renamed from: c */
    public final ConcurrentLinkedQueue f6813c = new ConcurrentLinkedQueue();

    public C1923b(C2046v2 c2046v2, C1580F1 c1580f1) {
        this.f6811a = c2046v2;
        this.f6812b = c1580f1;
        this.f6814d = new C1638U1(c2046v2);
    }

    @Override // io.sentry.logger.InterfaceC1922a
    /* JADX INFO: renamed from: a */
    public final void mo4142a(boolean z) {
        C1638U1 c1638u1 = this.f6814d;
        if (z) {
            m4145d(true);
            c1638u1.submit(new RunnableC1631S1(11, this));
        } else {
            c1638u1.mo3695g(this.f6811a.getShutdownTimeoutMillis());
            while (!this.f6813c.isEmpty()) {
                m4144c();
            }
        }
    }

    @Override // io.sentry.logger.InterfaceC1922a
    /* JADX INFO: renamed from: b */
    public final void mo4143b(long j) {
        m4145d(true);
        try {
            C1563B0 c1563b0 = this.f6815e;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            c1563b0.getClass();
            ((C2022q) c1563b0.f5600a).tryAcquireSharedNanos(1, timeUnit.toNanos(j));
        } catch (InterruptedException e) {
            this.f6811a.getLogger().mo3683r(EnumC1657a2.ERROR, "Failed to flush log events", e);
            Thread.currentThread().interrupt();
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m4144c() {
        ArrayList arrayList = new ArrayList(100);
        do {
            ConcurrentLinkedQueue concurrentLinkedQueue = this.f6813c;
            C1835c2 c1835c2 = (C1835c2) concurrentLinkedQueue.poll();
            if (c1835c2 != null) {
                arrayList.add(c1835c2);
            }
            if (concurrentLinkedQueue.isEmpty()) {
                break;
            }
        } while (arrayList.size() < 100);
        if (arrayList.isEmpty()) {
            return;
        }
        C1864d2 c1864d2 = new C1864d2(0, arrayList);
        C1580F1 c1580f1 = this.f6812b;
        c1580f1.getClass();
        try {
            c1580f1.m3660s(c1580f1.m3655m(c1864d2), null);
        } catch (IOException e) {
            c1580f1.f5692b.getLogger().mo3682n(EnumC1657a2.WARNING, e, "Capturing log failed.", new Object[0]);
        }
        for (int i = 0; i < arrayList.size(); i++) {
            C2022q c2022q = (C2022q) this.f6815e.f5600a;
            int i2 = C2022q.f7210a;
            c2022q.releaseShared(1);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m4145d(boolean z) {
        C1981r c1981rM4173a = f6810f.m4173a();
        try {
            this.f6814d.mo3703q(new RunnableC1587H0(7, this), z ? 0 : 5000);
            c1981rM4173a.close();
        } catch (Throwable th) {
            try {
                c1981rM4173a.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
