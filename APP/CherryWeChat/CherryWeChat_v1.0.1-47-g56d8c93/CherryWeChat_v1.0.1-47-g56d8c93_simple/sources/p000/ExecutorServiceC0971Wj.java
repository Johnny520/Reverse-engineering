package p000;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: Wj */
/* JADX INFO: loaded from: classes.dex */
public final class ExecutorServiceC0971Wj implements ExecutorService, AutoCloseable {

    /* JADX INFO: renamed from: b */
    public static final long f3025b = 0;

    /* JADX INFO: renamed from: c */
    public static volatile int f3026c;

    /* JADX INFO: renamed from: a */
    public final ThreadPoolExecutor f3027a;

    static {
        f3025b = TimeUnit.SECONDS.toMillis(10);
    }

    public ExecutorServiceC0971Wj(ThreadPoolExecutor r1) {
        this.f3027a = r1;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long r2, TimeUnit r4) {
        return this.f3027a.awaitTermination(r2, r4);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this == ForkJoinPool.commonPool()) goto L26;
        ThreadPoolExecutor r0 = this.f3027a;
        boolean r1 = r0.isTerminated();
        if (r1 == true) goto L24;
        shutdown();
        boolean r2 = false;
    L8:
        if (r1 == true) goto L13;
        r1 = r0.awaitTermination(1, TimeUnit.DAYS);     // Catch: InterruptedException -> L11
    L11:
        if (r2 == true) goto L8;
        shutdownNow();
        r2 = true;
        goto L8
    L13:
        if (r2 == false) goto L25;
        Thread.currentThread().interrupt();
        return;
    L25:
        return;
    L24:
        return;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable r2) {
        this.f3027a.execute(r2);
    }

    @Override // java.util.concurrent.ExecutorService
    public final List invokeAll(Collection r2) {
        return this.f3027a.invokeAll(r2);
    }

    @Override // java.util.concurrent.ExecutorService
    public final Object invokeAny(Collection r2) {
        return this.f3027a.invokeAny(r2);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return this.f3027a.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return this.f3027a.isTerminated();
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        this.f3027a.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        return this.f3027a.shutdownNow();
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future submit(Runnable r2) {
        return this.f3027a.submit(r2);
    }

    public final String toString() {
        return this.f3027a.toString();
    }

    @Override // java.util.concurrent.ExecutorService
    public final List invokeAll(Collection r2, long r3, TimeUnit r5) {
        return this.f3027a.invokeAll(r2, r3, r5);
    }

    @Override // java.util.concurrent.ExecutorService
    public final Object invokeAny(Collection r2, long r3, TimeUnit r5) {
        return this.f3027a.invokeAny(r2, r3, r5);
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future submit(Runnable r2, Object r3) {
        return this.f3027a.submit(r2, r3);
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future submit(Callable r2) {
        return this.f3027a.submit(r2);
    }
}
