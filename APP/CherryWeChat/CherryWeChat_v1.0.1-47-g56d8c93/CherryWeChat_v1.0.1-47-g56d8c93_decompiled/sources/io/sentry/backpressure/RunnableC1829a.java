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

    public RunnableC1829a(C2046v2 c2046v2) {
        C2054w1 c2054w1 = C2054w1.f7276a;
        this.f6613c = 0;
        this.f6614d = null;
        this.f6615e = new C2029a();
        this.f6611a = c2046v2;
        this.f6612b = c2054w1;
    }

    @Override // io.sentry.backpressure.InterfaceC1830b
    /* JADX INFO: renamed from: a */
    public final int mo3993a() {
        return this.f6613c;
    }

    /* JADX INFO: renamed from: b */
    public final void m3994b(int i) {
        InterfaceC1833c0 executorService = this.f6611a.getExecutorService();
        if (executorService.isClosed()) {
            return;
        }
        C1981r c1981rM4173a = this.f6615e.m4173a();
        try {
            this.f6614d = executorService.mo3703q(this, i);
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

    @Override // io.sentry.backpressure.InterfaceC1830b
    public final void close() {
        Future future = this.f6614d;
        if (future != null) {
            C1981r c1981rM4173a = this.f6615e.m4173a();
            try {
                future.cancel(true);
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

    @Override // java.lang.Runnable
    public final void run() {
        boolean zMo3711e = this.f6612b.mo3711e();
        C2046v2 c2046v2 = this.f6611a;
        if (zMo3711e) {
            if (this.f6613c > 0) {
                c2046v2.getLogger().mo3680e(EnumC1657a2.DEBUG, "Health check positive, reverting to normal sampling.", new Object[0]);
            }
            this.f6613c = 0;
        } else {
            int i = this.f6613c;
            if (i < 10) {
                this.f6613c = i + 1;
                c2046v2.getLogger().mo3680e(EnumC1657a2.DEBUG, "Health check negative, downsampling with a factor of %d", Integer.valueOf(this.f6613c));
            }
        }
        m3994b(10000);
    }

    @Override // io.sentry.backpressure.InterfaceC1830b
    public final void start() {
        m3994b(500);
    }
}
