package io.sentry.android.core;

import io.sentry.AbstractC1588H1;
import io.sentry.AbstractC2066z1;
import io.sentry.C1615O0;
import io.sentry.C1617O2;
import io.sentry.C1863d1;
import io.sentry.C1878g2;
import io.sentry.C1981r;
import io.sentry.C2046v2;
import io.sentry.EnumC1606M;
import io.sentry.EnumC1657a2;
import io.sentry.EnumC1877g1;
import io.sentry.EnumC1929n;
import io.sentry.ILogger;
import io.sentry.InterfaceC1618P;
import io.sentry.InterfaceC1651Z;
import io.sentry.InterfaceC1833c0;
import io.sentry.InterfaceC1925m;
import io.sentry.RunnableC1631S1;
import io.sentry.android.core.internal.util.C1727o;
import io.sentry.protocol.C1970t;
import io.sentry.transport.C2021p;
import io.sentry.transport.InterfaceC2020o;
import io.sentry.util.AbstractC2036h;
import io.sentry.util.C2029a;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: io.sentry.android.core.g */
/* JADX INFO: loaded from: classes.dex */
public final class C1696g implements InterfaceC1618P, InterfaceC2020o {

    /* JADX INFO: renamed from: a */
    public final ILogger f6120a;

    /* JADX INFO: renamed from: b */
    public final String f6121b;

    /* JADX INFO: renamed from: c */
    public final int f6122c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC1833c0 f6123d;

    /* JADX INFO: renamed from: e */
    public final C1666I f6124e;

    /* JADX INFO: renamed from: f */
    public boolean f6125f;

    /* JADX INFO: renamed from: g */
    public final C1727o f6126g;

    /* JADX INFO: renamed from: h */
    public C1734p f6127h;

    /* JADX INFO: renamed from: i */
    public boolean f6128i;

    /* JADX INFO: renamed from: j */
    public InterfaceC1651Z f6129j;

    /* JADX INFO: renamed from: k */
    public Future f6130k;

    /* JADX INFO: renamed from: l */
    public InterfaceC1925m f6131l;

    /* JADX INFO: renamed from: m */
    public final ArrayList f6132m;

    /* JADX INFO: renamed from: n */
    public C1970t f6133n;

    /* JADX INFO: renamed from: o */
    public C1970t f6134o;

    /* JADX INFO: renamed from: p */
    public final AtomicBoolean f6135p;

    /* JADX INFO: renamed from: q */
    public AbstractC1588H1 f6136q;

    /* JADX INFO: renamed from: r */
    public volatile boolean f6137r;

    /* JADX INFO: renamed from: s */
    public boolean f6138s;

    /* JADX INFO: renamed from: t */
    public boolean f6139t;

    /* JADX INFO: renamed from: u */
    public int f6140u;

    /* JADX INFO: renamed from: v */
    public final C2029a f6141v;

    /* JADX INFO: renamed from: w */
    public final C2029a f6142w;

    public C1696g(C1666I r3, C1727o r4, ILogger r5, String r6, int r7, InterfaceC1833c0 r8) {
        this.f6125f = false;
        this.f6127h = null;
        this.f6128i = false;
        this.f6132m = new ArrayList();
        C1970t r1 = C1970t.f7011b;
        this.f6133n = r1;
        this.f6134o = r1;
        this.f6135p = new AtomicBoolean(false);
        this.f6136q = new C1878g2();
        this.f6137r = true;
        this.f6138s = false;
        this.f6139t = false;
        this.f6140u = 0;
        this.f6141v = new C2029a();
        this.f6142w = new C2029a();
        this.f6120a = r5;
        this.f6126g = r4;
        this.f6124e = r3;
        this.f6121b = r6;
        this.f6122c = r7;
        this.f6123d = r8;
    }

    @Override // io.sentry.InterfaceC1618P
    /* JADX INFO: renamed from: a */
    public final void mo3690a(boolean r4) {
        C1981r r0 = this.f6141v.m4173a();
        this.f6140u = 0;     // Catch: Throwable -> L7
        this.f6138s = true;     // Catch: Throwable -> L7
        if (r4 == false) goto L9;
        m3876e(false);     // Catch: Throwable -> L7
        this.f6135p.set(true);     // Catch: Throwable -> L7
    L9:
        r0.close();
        return;
    L7:
        th = move-exception;
        r0.close();     // Catch: Throwable -> L13
    L15:
        throw th;
    L13:
        th = move-exception;
        th.addSuppressed(th);
        goto L15
    }

    /* JADX INFO: renamed from: b */
    public final void m3874b() {
        InterfaceC1651Z r0 = this.f6129j;
        if (r0 == null) goto L7;
        if (r0 == C1615O0.f5812b) goto L7;
        return;
    L7:
        if (AbstractC2066z1.m4233b() == C1615O0.f5812b) goto L13;
        this.f6129j = AbstractC2066z1.m4233b();
        this.f6131l = AbstractC2066z1.m4233b().mo3718l().getCompositePerformanceCollector();
        C2021p r02 = this.f6129j.mo3709c();
        if (r02 == null) goto L14;
        r02.f7207d.add(this);
        return;
    L14:
        return;
    }

    @Override // io.sentry.InterfaceC1618P
    /* JADX INFO: renamed from: c */
    public final void mo3692c(EnumC1877g1 r4) {
        C1981r r0 = this.f6141v.m4173a();
        int r42 = AbstractC1694f.f6110a[r4.ordinal()];     // Catch: Throwable -> L9
        if (r42 != 1) goto L6;
        int r43 = this.f6140u - 1;     // Catch: Throwable -> L9
        this.f6140u = r43;     // Catch: Throwable -> L9
        if (r43 <= 0) goto L15;
        r0.close();
        return;
    L15:
        if (r43 < 0) goto L17;
    L18:
        this.f6138s = true;     // Catch: Throwable -> L9
    L19:
        r0.close();
        return;
    L17:
        this.f6140u = 0;     // Catch: Throwable -> L9
        goto L18
    L6:
        if (r42 != 2) goto L19;
        this.f6138s = true;     // Catch: Throwable -> L9
    L9:
        th = move-exception;
        r0.close();     // Catch: Throwable -> L23
    L25:
        throw th;
    L23:
        th = move-exception;
        th.addSuppressed(th);
        goto L25
    }

    /* JADX INFO: renamed from: d */
    public final void m3875d() {
        m3874b();
        this.f6124e.getClass();
        boolean r0 = this.f6125f;
        ILogger r3 = this.f6120a;
        if (r0 == true) goto L13;
        this.f6125f = true;
        String r5 = this.f6121b;
        if (r5 != null) goto L8;
        r3.mo3680e(EnumC1657a2.WARNING, "Disabling profiling because no profiling traces dir path is defined in options.", new Object[0]);
        goto L13
    L8:
        int r02 = this.f6122c;
        if (r02 > 0) goto L11;
        r3.mo3680e(EnumC1657a2.WARNING, "Disabling profiling because trace rate is set to %d", new Object[]{Integer.valueOf(r02)});
        goto L13
    L11:
        int r6 = ((int) TimeUnit.SECONDS.toMicros(1)) / r02;
        ILogger r9 = this.f6120a;
        this.f6127h = new C1734p(r5, r6, this.f6126g, null, r9);
    L13:
        if (this.f6127h == null) goto L50;
        InterfaceC1651Z r03 = this.f6129j;
        if (r03 == null) goto L30;
        C2021p r04 = r03.mo3709c();
        if (r04 == null) goto L26;
        if (r04.m4170f(EnumC1929n.All) == false) goto L22;
    L23:
        r3.mo3680e(EnumC1657a2.WARNING, "SDK is rate limited. Stopping profiler.", new Object[0]);
        m3876e(false);
        return;
    L22:
        if (r04.m4170f(EnumC1929n.ProfileChunkUi) == true) goto L23;
    L26:
        if (this.f6129j.mo3718l().getConnectionStatusProvider().mo3684g() != EnumC1606M.DISCONNECTED) goto L29;
        r3.mo3680e(EnumC1657a2.WARNING, "Device is offline. Stopping profiler.", new Object[0]);
        m3876e(false);
        return;
    L29:
        this.f6136q = this.f6129j.mo3718l().getDateProvider().mo3603a();
    L32:
        if (this.f6127h.m3912c() != null) goto L34;
        return;
    L34:
        this.f6128i = true;
        C1970t r05 = this.f6133n;
        C1970t r2 = C1970t.f7011b;
        if (r05 != r2) goto L38;
        this.f6133n = new C1970t();
    L38:
        if (this.f6134o != r2) goto L40;
        this.f6134o = new C1970t();
    L40:
        InterfaceC1925m r06 = this.f6131l;
        if (r06 == null) goto L48;
        r06.mo3676c(this.f6134o.toString());
    L48:
        this.f6130k = this.f6123d.mo3703q(new RunnableC1631S1(3, this), 60000);     // Catch: RejectedExecutionException -> L45
        return;
    L45:
        e = move-exception;
        r3.mo3683r(EnumC1657a2.ERROR, "Failed to schedule profiling chunk finish. Did you call Sentry.close()?", e);
        this.f6138s = true;
        return;
    L30:
        this.f6136q = new C1878g2();
        goto L32
    }

    /* JADX INFO: renamed from: e */
    public final void m3876e(boolean r13) {
        m3874b();
        C1981r r1 = this.f6141v.m4173a();
        Future r0 = this.f6130k;     // Catch: Throwable -> L6
        if (r0 == null) goto L9;
        r0.cancel(true);     // Catch: Throwable -> L6
    L9:
        if (this.f6127h != null) goto L11;
    L45:
        C1970t r132 = C1970t.f7011b;     // Catch: Throwable -> L6
        this.f6133n = r132;     // Catch: Throwable -> L6
        this.f6134o = r132;     // Catch: Throwable -> L6
        r1.close();
        return;
    L11:
        if (this.f6128i == false) goto L45;
        this.f6124e.getClass();     // Catch: Throwable -> L6
        InterfaceC1925m r02 = this.f6131l;     // Catch: Throwable -> L6
        if (r02 == null) goto L16;
        List r03 = r02.mo3679f(this.f6134o.toString());     // Catch: Throwable -> L6
    L17:
        C1733o r04 = this.f6127h.m3910a(r03, false);     // Catch: Throwable -> L6
        ILogger r2 = this.f6120a;
        if (r04 != null) goto L21;
        r2.mo3680e(EnumC1657a2.ERROR, "An error occurred while collecting a profile chunk, and it won't be sent.", new Object[0]);     // Catch: Throwable -> L6
    L24:
        this.f6128i = false;     // Catch: Throwable -> L6
        this.f6134o = C1970t.f7011b;     // Catch: Throwable -> L6
        InterfaceC1651Z r05 = this.f6129j;     // Catch: Throwable -> L6
        if (r05 == null) goto L31;
        C2046v2 r4 = r05.mo3718l();     // Catch: Throwable -> L6
        r4.getExecutorService().submit(new RunnableC1684a0(this, r4, r05, 2));     // Catch: Throwable -> L29
    L29:
        th = move-exception;
        r4.getLogger().mo3683r(EnumC1657a2.DEBUG, "Failed to send profile chunks.", th);     // Catch: Throwable -> L6
    L31:
        if (r13 == true) goto L33;
    L35:
        this.f6133n = C1970t.f7011b;     // Catch: Throwable -> L6
        r2.mo3680e(EnumC1657a2.DEBUG, "Profile chunk finished.", new Object[0]);     // Catch: Throwable -> L6
    L36:
        r1.close();
        return;
    L33:
        if (this.f6138s == true) goto L35;
        r2.mo3680e(EnumC1657a2.DEBUG, "Profile chunk finished. Starting a new one.", new Object[0]);     // Catch: Throwable -> L6
        m3875d();     // Catch: Throwable -> L6
        goto L36
    L21:
        C1981r r42 = this.f6142w.m4173a();     // Catch: Throwable -> L6
        this.f6132m.add(new C1863d1(this.f6133n, this.f6134o, r04.f6277d, r04.f6276c, this.f6136q));     // Catch: Throwable -> L38
        r42.close();     // Catch: Throwable -> L6
        goto L24
    L38:
        th = move-exception;
        r42.close();     // Catch: Throwable -> L42
    L62:
        throw th;     // Catch: Throwable -> L6
    L42:
        th = move-exception;
        th.addSuppressed(th);     // Catch: Throwable -> L6
        throw th;     // Catch: Throwable -> L6
    L16:
        r03 = null;
    L6:
        th = move-exception;
        r1.close();     // Catch: Throwable -> L50
        throw th;
    L50:
        th = move-exception;
        th.addSuppressed(th);
        throw th;
    }

    @Override // io.sentry.InterfaceC1618P
    /* JADX INFO: renamed from: h */
    public final void mo3696h(EnumC1877g1 r9, C1617O2 r10) {
        C1981r r0 = this.f6141v.m4173a();
    L12:
        th = move-exception;
        r0.close();     // Catch: Throwable -> L40
    L42:
        throw th;
    L40:
        th = move-exception;
        th.addSuppressed(th);
        goto L42
    L4:
        if (this.f6137r == false) goto L15;
        double r4 = AbstractC2036h.m4180a().m4179c();     // Catch: Throwable -> L12
        Double r102 = r10.f5819a.getProfileSessionSampleRate();     // Catch: Throwable -> L12
        if (r102 != null) goto L8;
    L10:
        boolean r103 = false;
    L11:
        this.f6139t = r103;     // Catch: Throwable -> L12
        this.f6137r = false;     // Catch: Throwable -> L12
        goto L15
    L8:
        if (r102.doubleValue() < r4) goto L10;
        r103 = true;
    L15:
        if (this.f6139t == true) goto L19;
        this.f6120a.mo3680e(EnumC1657a2.DEBUG, "Profiler was not started due to sampling decision.", new Object[0]);     // Catch: Throwable -> L12
        r0.close();
        return;
    L19:
        int r92 = AbstractC1694f.f6110a[r9.ordinal()];     // Catch: Throwable -> L12
        if (r92 == 1) goto L30;
        if (r92 == 2) goto L25;
    L34:
        if (this.f6128i == true) goto L36;
        this.f6120a.mo3680e(EnumC1657a2.DEBUG, "Started Profiler.", new Object[0]);     // Catch: Throwable -> L12
        m3875d();     // Catch: Throwable -> L12
    L36:
        r0.close();
        return;
    L25:
        if (this.f6128i == false) goto L34;
        this.f6120a.mo3680e(EnumC1657a2.DEBUG, "Profiler is already running.", new Object[0]);     // Catch: Throwable -> L12
        r0.close();
        return;
    L30:
        if (this.f6140u >= 0) goto L32;
        this.f6140u = 0;     // Catch: Throwable -> L12
    L32:
        this.f6140u++;
        goto L34
    }

    @Override // io.sentry.transport.InterfaceC2020o
    /* JADX INFO: renamed from: m */
    public final void mo3877m(C2021p r5) {
        if (r5.m4170f(EnumC1929n.All) == false) goto L5;
    L8:
        ILogger r3 = this.f6120a;
        r3.mo3680e(EnumC1657a2.WARNING, "SDK is rate limited. Stopping profiler.", new Object[0]);
        m3876e(false);
        return;
    L5:
        if (r5.m4170f(EnumC1929n.ProfileChunkUi) == true) goto L8;
    }

    @Override // io.sentry.InterfaceC1618P
    /* JADX INFO: renamed from: p */
    public final void mo3702p() {
        this.f6137r = true;
    }

    @Override // io.sentry.InterfaceC1618P
    /* JADX INFO: renamed from: s */
    public final C1970t mo3704s() {
        return this.f6133n;
    }
}
