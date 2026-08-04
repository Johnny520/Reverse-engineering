package yyds;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: yyds.ᲈᲁᛱᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2751 extends AbstractC0428 implements InterfaceC2800 {

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final Executor f13468;

    public C2751(Executor executor) {
        this.f13468 = executor;
        if (executor instanceof ScheduledThreadPoolExecutor) {
            ((ScheduledThreadPoolExecutor) executor).setRemoveOnCancelPolicy(true);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Executor executor = this.f13468;
        ExecutorService executorService = executor instanceof ExecutorService ? (ExecutorService) executor : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C2751) && ((C2751) obj).f13468 == this.f13468;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f13468);
    }

    @Override // yyds.AbstractC0974
    public final String toString() {
        return this.f13468.toString();
    }

    @Override // yyds.InterfaceC2800
    /* JADX INFO: renamed from: ᛳᛸᛴᛶ */
    public final void mo1247(long j, C1853 c1853) {
        Executor executor = this.f13468;
        ScheduledFuture<?> scheduledFutureSchedule = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            RunnableC2660 runnableC2660 = new RunnableC2660(8, this, c1853, false);
            InterfaceC2213 interfaceC2213 = c1853.f9326;
            try {
                scheduledFutureSchedule = scheduledExecutorService.schedule(runnableC2660, j, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e);
                InterfaceC2798 interfaceC2798 = (InterfaceC2798) interfaceC2213.mo423(C1586.f8041);
                if (interfaceC2798 != null) {
                    interfaceC2798.mo2093(cancellationException);
                }
            }
        }
        if (scheduledFutureSchedule != null) {
            c1853.m3636(new C0385(0, scheduledFutureSchedule));
        } else {
            RunnableC1433.f6788.mo1247(j, c1853);
        }
    }

    @Override // yyds.AbstractC0974
    /* JADX INFO: renamed from: ᛷᲇᛲᛱ */
    public final void mo1251(InterfaceC2213 interfaceC2213, Runnable runnable) {
        try {
            this.f13468.execute(runnable);
        } catch (RejectedExecutionException e) {
            CancellationException cancellationException = new CancellationException("The task was rejected");
            cancellationException.initCause(e);
            InterfaceC2798 interfaceC2798 = (InterfaceC2798) interfaceC2213.mo423(C1586.f8041);
            if (interfaceC2798 != null) {
                interfaceC2798.mo2093(cancellationException);
            }
            C1206 c1206 = AbstractC0221.f1238;
            ExecutorC2482.f12272.mo1251(interfaceC2213, runnable);
        }
    }

    @Override // yyds.InterfaceC2800
    /* JADX INFO: renamed from: ᛸᛸᛷᛱ */
    public final InterfaceC0970 mo1253(long j, RunnableC1993 runnableC1993, InterfaceC2213 interfaceC2213) {
        Executor executor = this.f13468;
        ScheduledFuture<?> scheduledFutureSchedule = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            try {
                scheduledFutureSchedule = scheduledExecutorService.schedule(runnableC1993, j, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e);
                InterfaceC2798 interfaceC2798 = (InterfaceC2798) interfaceC2213.mo423(C1586.f8041);
                if (interfaceC2798 != null) {
                    interfaceC2798.mo2093(cancellationException);
                }
            }
        }
        return scheduledFutureSchedule != null ? new C0767(scheduledFutureSchedule) : RunnableC1433.f6788.mo1253(j, runnableC1993, interfaceC2213);
    }
}
