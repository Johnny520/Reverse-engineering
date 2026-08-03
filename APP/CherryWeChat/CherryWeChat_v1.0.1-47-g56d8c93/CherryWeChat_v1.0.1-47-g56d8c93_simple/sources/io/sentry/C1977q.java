package io.sentry;

import io.sentry.android.core.C1695f0;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.config.AbstractC1856a;
import io.sentry.protocol.C1970t;
import io.sentry.util.C2029a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Timer;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import p000.RunnableC2260n3;

/* JADX INFO: renamed from: io.sentry.q */
/* JADX INFO: loaded from: classes.dex */
public final class C1977q implements InterfaceC1925m {

    /* JADX INFO: renamed from: a */
    public final C2029a f7070a;

    /* JADX INFO: renamed from: b */
    public volatile Timer f7071b;

    /* JADX INFO: renamed from: c */
    public final ConcurrentHashMap f7072c;

    /* JADX INFO: renamed from: d */
    public final ArrayList f7073d;

    /* JADX INFO: renamed from: e */
    public final ArrayList f7074e;

    /* JADX INFO: renamed from: f */
    public final boolean f7075f;

    /* JADX INFO: renamed from: g */
    public final C2046v2 f7076g;

    /* JADX INFO: renamed from: h */
    public final AtomicBoolean f7077h;

    /* JADX INFO: renamed from: i */
    public long f7078i;

    public C1977q(SentryAndroidOptions r5) {
        this.f7070a = new C2029a();
        this.f7071b = null;
        this.f7072c = new ConcurrentHashMap();
        boolean r1 = false;
        this.f7077h = new AtomicBoolean(false);
        this.f7078i = 0;
        AbstractC1856a.m4048D("The options object is required.", r5);
        this.f7076g = r5;
        this.f7073d = new ArrayList();
        this.f7074e = new ArrayList();
        Iterator<InterfaceC1636U> r52 = r5.getPerformanceCollectors().iterator();
    L4:
        if (r52.hasNext() == false) goto L12;
        InterfaceC1636U r0 = r52.next();
        if ((r0 instanceof InterfaceC1642W) == false) goto L9;
        this.f7073d.add((InterfaceC1642W) r0);
    L9:
        if ((r0 instanceof InterfaceC1639V) == false) goto L4;
        this.f7074e.add((InterfaceC1639V) r0);
        goto L4
    L12:
        if (this.f7073d.isEmpty() == true) goto L14;
    L16:
        this.f7075f = r1;
        return;
    L14:
        if (this.f7074e.isEmpty() == false) goto L16;
        r1 = true;
        goto L16
    }

    @Override // io.sentry.InterfaceC1925m
    /* JADX INFO: renamed from: a */
    public final void mo3674a(C1585G2 r3) {
        Iterator r0 = this.f7074e.iterator();
    L4:
        if (r0.hasNext() == false) goto L6;
        ((C1695f0) ((InterfaceC1639V) r0.next())).m3873f(r3);
        goto L4
    }

    @Override // io.sentry.InterfaceC1925m
    /* JADX INFO: renamed from: b */
    public final void mo3675b(C1573D2 r7) {
        C1970t r0 = r7.f5628a;
        boolean r1 = this.f7075f;
        C2046v2 r2 = this.f7076g;
        if (r1 == false) goto L6;
        r2.getLogger().mo3680e(EnumC1657a2.INFO, "No collector found. Performance stats will not be captured during transactions.", new Object[0]);
        return;
    L6:
        Iterator r12 = this.f7074e.iterator();
    L8:
        if (r12.hasNext() == false) goto L10;
        ((C1695f0) ((InterfaceC1639V) r12.next())).m3873f(r7);
        goto L8
    L10:
        String r13 = r0.toString();
        ConcurrentHashMap r3 = this.f7072c;
        if (r3.containsKey(r13) == true) goto L17;
        r3.put(r0.toString(), new ArrayList());
        r2.getExecutorService().mo3703q(new RunnableC2260n3(19, this, r7), 30000);     // Catch: RejectedExecutionException -> L15
    L15:
        e = move-exception;
        r2.getLogger().mo3683r(EnumC1657a2.ERROR, "Failed to call the executor. Performance collector will not be automatically finished. Did you call Sentry.close()?", e);
    L17:
        mo3676c(r0.toString());
    }

    @Override // io.sentry.InterfaceC1925m
    /* JADX INFO: renamed from: c */
    public final void mo3676c(String r11) {
        if (this.f7075f == false) goto L7;
        this.f7076g.getLogger().mo3680e(EnumC1657a2.INFO, "No collector found. Performance stats will not be captured during transactions.", new Object[0]);
        return;
    L7:
        if (this.f7072c.containsKey(r11) == true) goto L10;
        this.f7072c.put(r11, new ArrayList());
    L10:
        if (this.f7077h.getAndSet(true) == true) goto L25;
        C1981r r112 = this.f7070a.m4173a();
    L15:
        th = move-exception;
        r112.close();     // Catch: Throwable -> L22
        throw th;
    L22:
        th = move-exception;
        th.addSuppressed(th);
        throw th;
    L13:
        if (this.f7071b != null) goto L17;
        this.f7071b = new Timer(true);     // Catch: Throwable -> L15
    L17:
        this.f7071b.schedule(new C1938p(this, 0), 0);     // Catch: Throwable -> L15
        C1938p r5 = new C1938p(this, 1);     // Catch: Throwable -> L15
        this.f7071b.scheduleAtFixedRate(r5, 100, 100);     // Catch: Throwable -> L15
        r112.close();
        return;
    }

    @Override // io.sentry.InterfaceC1925m
    public final void close() {
        this.f7076g.getLogger().mo3680e(EnumC1657a2.DEBUG, "stop collecting all performance info for transactions", new Object[0]);
        this.f7072c.clear();
        Iterator r0 = this.f7074e.iterator();
    L4:
        if (r0.hasNext() == false) goto L7;
        ((C1695f0) ((InterfaceC1639V) r0.next())).m3871d();
        goto L4
    L7:
        if (this.f7077h.getAndSet(false) == false) goto L22;
        C1981r r02 = this.f7070a.m4173a();
    L13:
        th = move-exception;
        r02.close();     // Catch: Throwable -> L19
    L21:
        throw th;
    L19:
        th = move-exception;
        th.addSuppressed(th);
        goto L21
    L10:
        if (this.f7071b == null) goto L15;
        this.f7071b.cancel();     // Catch: Throwable -> L13
        this.f7071b = null;     // Catch: Throwable -> L13
    L15:
        r02.close();
        return;
    }

    @Override // io.sentry.InterfaceC1925m
    /* JADX INFO: renamed from: d */
    public final void mo3677d(C1585G2 r3) {
        Iterator r0 = this.f7074e.iterator();
    L4:
        if (r0.hasNext() == false) goto L6;
        ((C1695f0) ((InterfaceC1639V) r0.next())).m3872e(r3);
        goto L4
    }

    @Override // io.sentry.InterfaceC1925m
    /* JADX INFO: renamed from: e */
    public final List mo3678e(InterfaceC1895i0 r5) {
        this.f7076g.getLogger().mo3680e(EnumC1657a2.DEBUG, "stop collecting performance info for transactions %s (%s)", new Object[]{r5.getName(), r5.mo3627m().f5738a.toString()});
        Iterator r0 = this.f7074e.iterator();
    L4:
        if (r0.hasNext() == false) goto L7;
        ((C1695f0) ((InterfaceC1639V) r0.next())).m3872e(r5);
        goto L4
    L7:
        return mo3679f(r5.mo3621g().toString());
    }

    @Override // io.sentry.InterfaceC1925m
    /* JADX INFO: renamed from: f */
    public final List mo3679f(String r2) {
        ConcurrentHashMap r0 = this.f7072c;
        List r22 = (List) r0.remove(r2);
        if (r0.isEmpty() == false) goto L5;
        close();
    L5:
        return r22;
    }
}
