package io.sentry;

import io.sentry.android.core.EnumC1751y;
import io.sentry.util.C2029a;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p000.RunnableC2531t8;

/* JADX INFO: renamed from: io.sentry.U1 */
/* JADX INFO: loaded from: classes.dex */
public final class C1638U1 implements InterfaceC1833c0 {

    /* JADX INFO: renamed from: a */
    public final Object f5871a;

    /* JADX INFO: renamed from: b */
    public final Serializable f5872b;

    /* JADX INFO: renamed from: c */
    public final Object f5873c;

    /* JADX INFO: renamed from: d */
    public final Object f5874d;

    public C1638U1(ScheduledThreadPoolExecutor scheduledThreadPoolExecutor, C2046v2 c2046v2) {
        this.f5872b = new C2029a();
        this.f5873c = new RunnableC2531t8(1);
        this.f5871a = scheduledThreadPoolExecutor;
        this.f5874d = c2046v2;
    }

    @Override // io.sentry.InterfaceC1833c0
    /* JADX INFO: renamed from: g */
    public void mo3695g(long j) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) this.f5871a;
        C1981r c1981rM4173a = ((C2029a) this.f5872b).m4173a();
        try {
            if (!scheduledThreadPoolExecutor.isShutdown()) {
                scheduledThreadPoolExecutor.shutdown();
                try {
                    if (!scheduledThreadPoolExecutor.awaitTermination(j, TimeUnit.MILLISECONDS)) {
                        scheduledThreadPoolExecutor.shutdownNow();
                    }
                } catch (InterruptedException unused) {
                    scheduledThreadPoolExecutor.shutdownNow();
                    Thread.currentThread().interrupt();
                }
            }
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

    @Override // io.sentry.InterfaceC1833c0
    public boolean isClosed() {
        C1981r c1981rM4173a = ((C2029a) this.f5872b).m4173a();
        try {
            boolean zIsShutdown = ((ScheduledThreadPoolExecutor) this.f5871a).isShutdown();
            c1981rM4173a.close();
            return zIsShutdown;
        } catch (Throwable th) {
            try {
                c1981rM4173a.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // io.sentry.InterfaceC1833c0
    /* JADX INFO: renamed from: m */
    public void mo3700m() {
        ((ScheduledThreadPoolExecutor) this.f5871a).submit(new RunnableC1631S1(0, this));
    }

    @Override // io.sentry.InterfaceC1833c0
    /* JADX INFO: renamed from: q */
    public Future mo3703q(Runnable runnable, long j) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) this.f5871a;
        if (scheduledThreadPoolExecutor.getQueue().size() < 271) {
            return scheduledThreadPoolExecutor.schedule(runnable, j, TimeUnit.MILLISECONDS);
        }
        C2046v2 c2046v2 = (C2046v2) this.f5874d;
        if (c2046v2 != null) {
            c2046v2.getLogger().mo3680e(EnumC1657a2.WARNING, "Task " + runnable + " rejected from " + scheduledThreadPoolExecutor, new Object[0]);
        }
        return new FutureC1635T1();
    }

    @Override // io.sentry.InterfaceC1833c0
    public Future submit(Runnable runnable) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) this.f5871a;
        if (scheduledThreadPoolExecutor.getQueue().size() < 271) {
            return scheduledThreadPoolExecutor.submit(runnable);
        }
        C2046v2 c2046v2 = (C2046v2) this.f5874d;
        if (c2046v2 != null) {
            c2046v2.getLogger().mo3680e(EnumC1657a2.WARNING, "Task " + runnable + " rejected from " + scheduledThreadPoolExecutor, new Object[0]);
        }
        return new FutureC1635T1();
    }

    public C1638U1(C2046v2 c2046v2) {
        this(new ScheduledThreadPoolExecutor(1, new ThreadFactoryC1594J(1)), c2046v2);
    }

    public C1638U1() {
        this(new ScheduledThreadPoolExecutor(1, new ThreadFactoryC1594J(1)), (C2046v2) null);
    }

    public C1638U1(EnumC1751y enumC1751y) {
        this.f5871a = enumC1751y;
        this.f5872b = null;
        this.f5873c = null;
        this.f5874d = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1638U1(EnumC1751y enumC1751y, byte[] bArr) {
        this.f5871a = enumC1751y;
        this.f5872b = bArr;
        this.f5873c = null;
        this.f5874d = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1638U1(EnumC1751y enumC1751y, byte[] bArr, ArrayList arrayList, ArrayList arrayList2) {
        this.f5871a = enumC1751y;
        this.f5872b = bArr;
        this.f5873c = arrayList;
        this.f5874d = arrayList2;
    }
}
