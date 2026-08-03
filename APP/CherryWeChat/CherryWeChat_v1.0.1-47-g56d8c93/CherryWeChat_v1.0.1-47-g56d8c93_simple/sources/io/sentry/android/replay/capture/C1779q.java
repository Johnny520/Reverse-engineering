package io.sentry.android.replay.capture;

import io.sentry.C2046v2;
import io.sentry.EnumC1657a2;
import io.sentry.EnumC2055w2;
import io.sentry.InterfaceC1651Z;
import io.sentry.RunnableC1587H0;
import io.sentry.android.core.C1676T;
import io.sentry.android.replay.C1789j;
import io.sentry.android.replay.C1793n;
import io.sentry.android.replay.C1799t;
import io.sentry.android.replay.C1821w;
import io.sentry.config.AbstractC1856a;
import io.sentry.protocol.C1970t;
import io.sentry.transport.InterfaceC2011f;
import java.io.File;
import java.util.Date;
import java.util.concurrent.ScheduledExecutorService;
import p000.AbstractC0585Nj;
import p000.C1514ht;
import p000.C2464rl;
import p000.InterfaceC0674Pm;
import p000.InterfaceC1416fj;

/* JADX INFO: renamed from: io.sentry.android.replay.capture.q */
/* JADX INFO: loaded from: classes.dex */
public final class C1779q extends AbstractC1767e {

    /* JADX INFO: renamed from: r */
    public final C2046v2 f6468r;

    /* JADX INFO: renamed from: s */
    public final InterfaceC1651Z f6469s;

    /* JADX INFO: renamed from: t */
    public final InterfaceC2011f f6470t;

    public C1779q(C2046v2 r1, InterfaceC1651Z r2, InterfaceC2011f r3, ScheduledExecutorService r4) {
        super(r1, r2, r3, r4);
        this.f6468r = r1;
        this.f6469s = r2;
        this.f6470t = r3;
    }

    @Override // io.sentry.android.replay.capture.InterfaceC1776n
    /* JADX INFO: renamed from: b */
    public final void mo3959b(boolean r4, C1514ht r5) {
        C2046v2 r52 = this.f6468r;
        if (r52.getSessionReplay().f7316l == false) goto L5;
        r52.getLogger().mo3680e(EnumC1657a2.DEBUG, "Replay is already running in 'session' mode, not capturing for event", new Object[0]);
    L5:
        this.f6435g.set(r4);
    }

    @Override // io.sentry.android.replay.capture.InterfaceC1776n
    /* JADX INFO: renamed from: c */
    public final void mo3960c(C1821w r6) {
        m3967n("onConfigurationChanged", new C1778p(this, 0));
        InterfaceC0674Pm r0 = AbstractC1767e.f6428q[0];
        C1765c r02 = this.f6437i;
        Object r1 = r02.f6421a.getAndSet(r6);
        if (AbstractC0585Nj.m1134a(r1, r6) == true) goto L15;
        C1766d r2 = new C1766d(r1, r6, r02.f6423c, 1);
        AbstractC1767e r62 = r02.f6422b;
        C2046v2 r03 = r62.f6429a;
        if (r03.getThreadChecker().mo3902c() == false) goto L13;
        AbstractC1856a.m4052H((ScheduledExecutorService) r62.f6433e.getValue(), r03, "CaptureStrategy.runInBackground", new RunnableC1587H0(4, r2));
        return;
    L13:
        r2.mo6a();     // Catch: Throwable -> L10
        return;
    L10:
        th = move-exception;
        r03.getLogger().mo3683r(EnumC1657a2.ERROR, "Failed to execute task CaptureStrategy.runInBackground", th);
        return;
    }

    @Override // io.sentry.android.replay.capture.InterfaceC1776n
    /* JADX INFO: renamed from: d */
    public final void mo3961d() {
        m3967n("pause", new C1778p(this, 1));
    }

    @Override // io.sentry.android.replay.capture.InterfaceC1776n
    /* JADX INFO: renamed from: e */
    public final InterfaceC1776n mo3962e() {
        return this;
    }

    @Override // io.sentry.android.replay.capture.AbstractC1767e, io.sentry.android.replay.capture.InterfaceC1776n
    /* JADX INFO: renamed from: f */
    public final void mo3953f(int r1, C1970t r2, EnumC2055w2 r3) {
        super.mo3953f(r1, r2, r3);
        InterfaceC1651Z r12 = this.f6469s;
        if (r12 == null) goto L6;
        r12.mo3719m(new C2464rl(12, this));
        return;
    }

    @Override // io.sentry.android.replay.capture.InterfaceC1776n
    /* JADX INFO: renamed from: g */
    public final void mo3963g(final C1793n r7) {
        final C1821w r5 = m3956k();
        final long r3 = this.f6470t.mo3899b();
        Runnable r0 = new RunnableC1777o(this, r7, r3, r5);
        AbstractC1856a.m4052H(this.f6432d, this.f6468r, "SessionCaptureStrategy.add_frame", r0);
    }

    /* JADX INFO: renamed from: n */
    public final void m3967n(String r10, InterfaceC1416fj r11) {
        C1821w r6 = m3956k();
        C2046v2 r8 = this.f6468r;
        if (r6 != null) goto L6;
        r8.getLogger().mo3680e(EnumC1657a2.DEBUG, "Recorder config is not set, not creating segment for task: ".concat(r10), new Object[0]);
        return;
    L6:
        long r0 = this.f6470t.mo3899b();
        InterfaceC0674Pm r2 = AbstractC1767e.f6428q[1];
        Date r4 = (Date) this.f6438j.f6421a.get();
        if (r4 != null) goto L9;
        return;
    L9:
        long r22 = r0 - r4.getTime();
        C1970t r5 = m3954i();
        String r102 = "SessionCaptureStrategy.".concat(r10);
        RunnableC1768f r02 = new RunnableC1768f(this, r22, r4, r5, r6, r11);
        AbstractC1856a.m4052H(this.f6432d, r8, r102, r02);
    }

    @Override // io.sentry.android.replay.capture.InterfaceC1776n
    public final void stop() {
        C1789j r0 = this.f6436h;
        if (r0 == null) goto L5;
        File r02 = r0.m3972f();
    L6:
        m3967n("stop", new C1799t(this, r02, 2));
        InterfaceC1651Z r03 = this.f6469s;
        if (r03 == null) goto L9;
        r03.mo3719m(new C1676T(2));
    L9:
        C1789j r04 = this.f6436h;
        if (r04 == null) goto L12;
        r04.close();
    L12:
        this.f6439k.set(0);
        m3958m(null);
        C1970t r05 = C1970t.f7011b;
        InterfaceC0674Pm r1 = AbstractC1767e.f6428q[3];
        C1765c r12 = this.f6441m;
        Object r2 = r12.f6421a.getAndSet(r05);
        if (AbstractC0585Nj.m1134a(r2, r05) == true) goto L25;
        C1764b r3 = new C1764b(r2, r05, r12.f6423c, 0);
        AbstractC1767e r06 = r12.f6422b;
        C2046v2 r13 = r06.f6429a;
        if (r13.getThreadChecker().mo3902c() == false) goto L23;
        AbstractC1856a.m4052H((ScheduledExecutorService) r06.f6433e.getValue(), r13, "CaptureStrategy.runInBackground", new RunnableC1587H0(1, r3));
        return;
    L23:
        r3.mo6a();     // Catch: Throwable -> L20
        return;
    L20:
        th = move-exception;
        r13.getLogger().mo3683r(EnumC1657a2.ERROR, "Failed to execute task CaptureStrategy.runInBackground", th);
        return;
    L25:
        return;
    L5:
        r02 = null;
        goto L6
    }
}
