package io.sentry.transport;

import io.sentry.AbstractC1588H1;
import io.sentry.C1563B0;
import io.sentry.EnumC1657a2;
import io.sentry.ILogger;
import io.sentry.InterfaceC1592I1;
import io.sentry.ThreadFactoryC1594J;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: io.sentry.transport.n */
/* JADX INFO: loaded from: classes.dex */
public final class C2019n extends ThreadPoolExecutor implements AutoCloseable {

    /* JADX INFO: renamed from: a */
    public final int f7199a;

    /* JADX INFO: renamed from: b */
    public AbstractC1588H1 f7200b;

    /* JADX INFO: renamed from: c */
    public final ILogger f7201c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC1592I1 f7202d;

    /* JADX INFO: renamed from: e */
    public final C1563B0 f7203e;

    public C2019n(int i, ThreadFactoryC1594J threadFactoryC1594J, RejectedExecutionHandlerC2006a rejectedExecutionHandlerC2006a, ILogger iLogger, InterfaceC1592I1 interfaceC1592I1) {
        super(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), threadFactoryC1594J, rejectedExecutionHandlerC2006a);
        this.f7200b = null;
        this.f7203e = new C1563B0(7, false);
        this.f7199a = i;
        this.f7201c = iLogger;
        this.f7202d = interfaceC1592I1;
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public final void afterExecute(Runnable runnable, Throwable th) {
        C1563B0 c1563b0 = this.f7203e;
        try {
            super.afterExecute(runnable, th);
        } finally {
            C2022q c2022q = (C2022q) c1563b0.f5600a;
            int i = C2022q.f7210a;
            c2022q.releaseShared(1);
        }
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        boolean zIsTerminated;
        if (this == ForkJoinPool.commonPool() || (zIsTerminated = isTerminated())) {
            return;
        }
        shutdown();
        boolean z = false;
        while (!zIsTerminated) {
            try {
                zIsTerminated = awaitTermination(1L, TimeUnit.DAYS);
            } catch (InterruptedException unused) {
                if (!z) {
                    shutdownNow();
                    z = true;
                }
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final Future submit(Runnable runnable) {
        C1563B0 c1563b0 = this.f7203e;
        if (C2022q.m4171a((C2022q) c1563b0.f5600a) < this.f7199a) {
            C2022q.m4172b((C2022q) c1563b0.f5600a);
            return super.submit(runnable);
        }
        this.f7200b = this.f7202d.mo3603a();
        this.f7201c.mo3680e(EnumC1657a2.WARNING, "Submit cancelled", new Object[0]);
        return new FutureC2018m();
    }
}
