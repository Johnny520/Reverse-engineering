package Yue;

import Yue.InterfaceC4364;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: Yue.ۥۣ۠ۡۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C4748 extends AbstractC4746 implements InterfaceC4364 {

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    @InterfaceC6399
    public final Executor f10207;

    public C4748(@InterfaceC6399 Executor executor) {
        this.f10207 = executor;
        C4076.m11510(mo12605());
    }

    @Override // Yue.AbstractC4746, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Executor executorMo12605 = mo12605();
        ExecutorService executorService = executorMo12605 instanceof ExecutorService ? (ExecutorService) executorMo12605 : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    @Override // Yue.AbstractC4232
    public void dispatch(@InterfaceC6399 InterfaceC4225 interfaceC4225, @InterfaceC6399 Runnable runnable) {
        Runnable runnableM5898;
        try {
            Executor executorMo12605 = mo12605();
            AbstractC3018 abstractC3018M84 = C3019.m84();
            if (abstractC3018M84 == null || (runnableM5898 = abstractC3018M84.m5898(runnable)) == null) {
                runnableM5898 = runnable;
            }
            executorMo12605.execute(runnableM5898);
        } catch (RejectedExecutionException e) {
            AbstractC3018 abstractC3018M842 = C3019.m84();
            if (abstractC3018M842 != null) {
                abstractC3018M842.m5895();
            }
            m14309(interfaceC4225, e);
            C4423.m12870().dispatch(interfaceC4225, runnable);
        }
    }

    public boolean equals(@InterfaceC6489 Object obj) {
        return (obj instanceof C4748) && ((C4748) obj).mo12605() == mo12605();
    }

    public int hashCode() {
        return System.identityHashCode(mo12605());
    }

    @Override // Yue.AbstractC4232
    @InterfaceC6399
    public String toString() {
        return mo12605().toString();
    }

    @Override // Yue.InterfaceC4364
    @InterfaceC4372(level = EnumC0393.f8971, message = "Deprecated without replacement as an internal method never intended for public use")
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟ۡ۠ */
    public Object mo12617(long j, @InterfaceC6399 InterfaceC4199<? super C8107> interfaceC4199) {
        return InterfaceC4364.C0387.m1320(this, j, interfaceC4199);
    }

    @Override // Yue.InterfaceC4364
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣ۟۟ */
    public InterfaceC4433 mo12587(long j, @InterfaceC6399 Runnable runnable, @InterfaceC6399 InterfaceC4225 interfaceC4225) {
        Executor executorMo12605 = mo12605();
        ScheduledExecutorService scheduledExecutorService = executorMo12605 instanceof ScheduledExecutorService ? (ScheduledExecutorService) executorMo12605 : null;
        ScheduledFuture<?> scheduledFutureM14310 = scheduledExecutorService != null ? m14310(scheduledExecutorService, runnable, interfaceC4225, j) : null;
        return scheduledFutureM14310 != null ? new C4432(scheduledFutureM14310) : RunnableC4337.f8898.mo12587(j, runnable, interfaceC4225);
    }

    @Override // Yue.InterfaceC4364
    /* JADX INFO: renamed from: ۥ۟۟ۤۥ */
    public void mo12618(long j, @InterfaceC6399 InterfaceC3665<? super C8107> interfaceC3665) {
        Executor executorMo12605 = mo12605();
        ScheduledExecutorService scheduledExecutorService = executorMo12605 instanceof ScheduledExecutorService ? (ScheduledExecutorService) executorMo12605 : null;
        ScheduledFuture<?> scheduledFutureM14310 = scheduledExecutorService != null ? m14310(scheduledExecutorService, new RunnableC7155(this, interfaceC3665), interfaceC3665.getContext(), j) : null;
        if (scheduledFutureM14310 != null) {
            C5553.m17208(interfaceC3665, scheduledFutureM14310);
        } else {
            RunnableC4337.f8898.mo12618(j, interfaceC3665);
        }
    }

    @Override // Yue.AbstractC4746
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۧ۟ */
    public Executor mo12605() {
        return this.f10207;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧ۠, reason: contains not printable characters */
    public final void m14309(InterfaceC4225 interfaceC4225, RejectedExecutionException rejectedExecutionException) {
        C5553.m17191(interfaceC4225, C4739.m1654("The task was rejected", rejectedExecutionException));
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧۡ, reason: contains not printable characters */
    public final ScheduledFuture<?> m14310(ScheduledExecutorService scheduledExecutorService, Runnable runnable, InterfaceC4225 interfaceC4225, long j) {
        try {
            return scheduledExecutorService.schedule(runnable, j, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e) {
            m14309(interfaceC4225, e);
            return null;
        }
    }
}
