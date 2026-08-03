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

    public C2019n(int r10, ThreadFactoryC1594J r11, RejectedExecutionHandlerC2006a r12, ILogger r13, InterfaceC1592I1 r14) {
        super(1, 1, 0, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), r11, r12);
        this.f7200b = null;
        this.f7203e = new C1563B0(7, false);
        this.f7199a = r10;
        this.f7201c = r13;
        this.f7202d = r14;
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public final void afterExecute(Runnable r3, Throwable r4) {
        C1563B0 r0 = this.f7203e;
        super.afterExecute(r3, r4);     // Catch: Throwable -> L6
        C2022q r32 = (C2022q) r0.f5600a;
        int r42 = C2022q.f7210a;
        r32.releaseShared(1);
        return;
    L6:
        th = move-exception;
        C2022q r43 = (C2022q) r0.f5600a;
        int r02 = C2022q.f7210a;
        r43.releaseShared(1);
        throw th;
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        if (this == ForkJoinPool.commonPool()) goto L26;
        boolean r0 = isTerminated();
        if (r0 == true) goto L24;
        shutdown();
        boolean r1 = false;
    L8:
        if (r0 == true) goto L13;
        r0 = awaitTermination(1, TimeUnit.DAYS);     // Catch: InterruptedException -> L11
    L11:
        if (r1 == true) goto L8;
        shutdownNow();
        r1 = true;
        goto L8
    L13:
        if (r1 == false) goto L25;
        Thread.currentThread().interrupt();
        return;
    L25:
        return;
    L24:
        return;
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final Future submit(Runnable r4) {
        C1563B0 r0 = this.f7203e;
        if (C2022q.m4171a((C2022q) r0.f5600a) >= this.f7199a) goto L6;
        C2022q.m4172b((C2022q) r0.f5600a);
        return super.submit(r4);
    L6:
        this.f7200b = this.f7202d.mo3603a();
        ILogger r1 = this.f7201c;
        r1.mo3680e(EnumC1657a2.WARNING, "Submit cancelled", new Object[0]);
        return new FutureC2018m();
    }
}
