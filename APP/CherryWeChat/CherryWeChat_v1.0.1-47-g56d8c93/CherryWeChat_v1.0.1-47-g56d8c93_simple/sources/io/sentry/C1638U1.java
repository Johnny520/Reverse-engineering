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

    public C1638U1(ScheduledThreadPoolExecutor r3, C2046v2 r4) {
        this.f5872b = new C2029a();
        this.f5873c = new RunnableC2531t8(1);
        this.f5871a = r3;
        this.f5874d = r4;
    }

    @Override // io.sentry.InterfaceC1833c0
    /* JADX INFO: renamed from: g */
    public void mo3695g(long r4) {
        ScheduledThreadPoolExecutor r0 = (ScheduledThreadPoolExecutor) this.f5871a;
        C1981r r1 = ((C2029a) this.f5872b).m4173a();
    L10:
        th = move-exception;
        r1.close();     // Catch: Throwable -> L17
    L19:
        throw th;
    L17:
        th = move-exception;
        th.addSuppressed(th);
        goto L19
    L4:
        if (r0.isShutdown() == true) goto L13;
        r0.shutdown();     // Catch: Throwable -> L10
    L12:
        r0.shutdownNow();     // Catch: Throwable -> L10
        Thread.currentThread().interrupt();     // Catch: Throwable -> L10
        goto L13
    L7:
        if (r0.awaitTermination(r4, TimeUnit.MILLISECONDS) == true) goto L13;
        r0.shutdownNow();     // Catch: Throwable -> L10 InterruptedException -> L12
    L13:
        r1.close();
    }

    @Override // io.sentry.InterfaceC1833c0
    public boolean isClosed() {
        C1981r r0 = ((C2029a) this.f5872b).m4173a();
        boolean r1 = ((ScheduledThreadPoolExecutor) this.f5871a).isShutdown();     // Catch: Throwable -> L6
        r0.close();
        return r1;
    L6:
        th = move-exception;
        r0.close();     // Catch: Throwable -> L9
    L11:
        throw th;
    L9:
        th = move-exception;
        th.addSuppressed(th);
        goto L11
    }

    @Override // io.sentry.InterfaceC1833c0
    /* JADX INFO: renamed from: m */
    public void mo3700m() {
        ((ScheduledThreadPoolExecutor) this.f5871a).submit(new RunnableC1631S1(0, this));
    }

    @Override // io.sentry.InterfaceC1833c0
    /* JADX INFO: renamed from: q */
    public Future mo3703q(Runnable r4, long r5) {
        ScheduledThreadPoolExecutor r0 = (ScheduledThreadPoolExecutor) this.f5871a;
        if (r0.getQueue().size() < 271) goto L5;
        C2046v2 r52 = (C2046v2) this.f5874d;
        if (r52 == null) goto L10;
        r52.getLogger().mo3680e(EnumC1657a2.WARNING, "Task " + r4 + " rejected from " + r0, new Object[0]);
    L10:
        return new FutureC1635T1();
    L5:
        return r0.schedule(r4, r5, TimeUnit.MILLISECONDS);
    }

    @Override // io.sentry.InterfaceC1833c0
    public Future submit(Runnable r6) {
        ScheduledThreadPoolExecutor r0 = (ScheduledThreadPoolExecutor) this.f5871a;
        if (r0.getQueue().size() < 271) goto L5;
        C2046v2 r1 = (C2046v2) this.f5874d;
        if (r1 == null) goto L10;
        r1.getLogger().mo3680e(EnumC1657a2.WARNING, "Task " + r6 + " rejected from " + r0, new Object[0]);
    L10:
        return new FutureC1635T1();
    L5:
        return r0.submit(r6);
    }

    public C1638U1(C2046v2 r4) {
        this(new ScheduledThreadPoolExecutor(1, new ThreadFactoryC1594J(1)), r4);
    }

    public C1638U1() {
        this(new ScheduledThreadPoolExecutor(1, new ThreadFactoryC1594J(1)), null);
    }

    public C1638U1(EnumC1751y r1) {
        this.f5871a = r1;
        this.f5872b = null;
        this.f5873c = null;
        this.f5874d = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1638U1(EnumC1751y r1, byte[] r2) {
        this.f5871a = r1;
        this.f5872b = r2;
        this.f5873c = null;
        this.f5874d = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1638U1(EnumC1751y r1, byte[] r2, ArrayList r3, ArrayList r4) {
        this.f5871a = r1;
        this.f5872b = r2;
        this.f5873c = r3;
        this.f5874d = r4;
    }
}
