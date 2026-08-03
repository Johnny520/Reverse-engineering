package io.sentry.android.replay.capture;

import android.view.MotionEvent;
import io.sentry.C2046v2;
import io.sentry.C2054w1;
import io.sentry.EnumC1657a2;
import io.sentry.EnumC2055w2;
import io.sentry.InterfaceC1651Z;
import io.sentry.RunnableC1587H0;
import io.sentry.android.core.RunnableC1752z;
import io.sentry.android.replay.C1789j;
import io.sentry.android.replay.C1790k;
import io.sentry.android.replay.C1793n;
import io.sentry.android.replay.C1799t;
import io.sentry.android.replay.C1821w;
import io.sentry.config.AbstractC1856a;
import io.sentry.protocol.C1970t;
import io.sentry.rrweb.AbstractC1986b;
import io.sentry.transport.C2009d;
import io.sentry.transport.InterfaceC2011f;
import io.sentry.util.C2035g;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.concurrent.ScheduledExecutorService;
import p000.AbstractC0585Nj;
import p000.AbstractC2453ra;
import p000.C1514ht;
import p000.C2464rl;
import p000.InterfaceC0674Pm;
import p000.InterfaceC1416fj;
import p000.RunnableC2260n3;

/* JADX INFO: renamed from: io.sentry.android.replay.capture.h */
/* JADX INFO: loaded from: classes.dex */
public final class C1770h extends AbstractC1767e {

    /* JADX INFO: renamed from: r */
    public final C2046v2 f6454r;

    /* JADX INFO: renamed from: s */
    public final InterfaceC1651Z f6455s;

    /* JADX INFO: renamed from: t */
    public final InterfaceC2011f f6456t;

    /* JADX INFO: renamed from: u */
    public final C2035g f6457u;

    /* JADX INFO: renamed from: v */
    public final ArrayList f6458v;

    public C1770h(C2046v2 r1, C2054w1 r2, C2009d r3, C2035g r4, ScheduledExecutorService r5) {
        super(r1, r2, r3, r5);
        this.f6454r = r1;
        this.f6455s = r2;
        this.f6456t = r3;
        this.f6457u = r4;
        this.f6458v = new ArrayList();
    }

    @Override // io.sentry.android.replay.capture.AbstractC1767e, io.sentry.android.replay.capture.InterfaceC1776n
    /* JADX INFO: renamed from: a */
    public final void mo3952a(MotionEvent r5) {
        super.mo3952a(r5);
        long r0 = this.f6456t.mo3899b() - this.f6454r.getSessionReplay().f7311g;
        Iterator r52 = this.f6444p.iterator();
    L4:
        if (r52.hasNext() == false) goto L8;
        if (((AbstractC1986b) r52.next()).f7116b >= r0) goto L4;
        r52.remove();
        goto L4
    }

    @Override // io.sentry.android.replay.capture.InterfaceC1776n
    /* JADX INFO: renamed from: b */
    public final void mo3959b(boolean r8, C1514ht r9) {
        C2046v2 r0 = this.f6454r;
        Double r1 = r0.getSessionReplay().f7306b;
        if (r1 != null) goto L5;
    L14:
        r0.getLogger().mo3680e(EnumC1657a2.INFO, "Replay wasn't sampled by onErrorSampleRate, not capturing for event", new Object[0]);
        return;
    L5:
        if (r1.doubleValue() < this.f6457u.m4179c()) goto L14;
        InterfaceC1651Z r12 = this.f6455s;
        if (r12 == null) goto L9;
        r12.mo3719m(new C2464rl(11, this));
    L9:
        if (r8 == false) goto L12;
        this.f6435g.set(true);
        r0.getLogger().mo3680e(EnumC1657a2.DEBUG, "Not capturing replay for crashed event, will be captured on next launch", new Object[0]);
        return;
    L12:
        m3964n("capture_replay", new C1799t(this, r9, 1));
    }

    @Override // io.sentry.android.replay.capture.InterfaceC1776n
    /* JADX INFO: renamed from: c */
    public final void mo3960c(C1821w r6) {
        m3964n("configuration_changed", new C1769g(this, 0));
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
        m3964n("pause", new C1769g(this, 1));
    }

    @Override // io.sentry.android.replay.capture.InterfaceC1776n
    /* JADX INFO: renamed from: e */
    public final InterfaceC1776n mo3962e() {
        boolean r0 = this.f6435g.get();
        C2046v2 r1 = this.f6454r;
        if (r0 == false) goto L6;
        r1.getLogger().mo3680e(EnumC1657a2.DEBUG, "Not converting to session mode, because the process is about to terminate", new Object[0]);
        return this;
    L6:
        InterfaceC2011f r2 = this.f6456t;
        ScheduledExecutorService r3 = this.f6432d;
        C1779q r02 = new C1779q(r1, this.f6455s, r2, r3);
        r02.mo3953f(m3955j(), m3954i(), EnumC2055w2.BUFFER);
        return r02;
    }

    @Override // io.sentry.android.replay.capture.InterfaceC1776n
    /* JADX INFO: renamed from: g */
    public final void mo3963g(C1793n r4) {
        RunnableC1752z r2 = new RunnableC1752z(this, r4, this.f6456t.mo3899b());
        AbstractC1856a.m4052H(this.f6432d, this.f6454r, "BufferCaptureStrategy.add_frame", r2);
    }

    /* JADX INFO: renamed from: n */
    public final void m3964n(String r10, InterfaceC1416fj r11) {
        C1821w r6 = m3956k();
        C2046v2 r8 = this.f6454r;
        if (r6 != null) goto L6;
        r8.getLogger().mo3680e(EnumC1657a2.DEBUG, "Recorder config is not set, not creating segment for task: ".concat(r10), new Object[0]);
        return;
    L6:
        long r0 = r8.getSessionReplay().f7311g;
        long r2 = this.f6456t.mo3899b();
        C1789j r4 = this.f6436h;
        if (r4 != null) goto L9;
    L14:
        Date r02 = AbstractC1856a.m4068n(r2 - r0);
    L13:
        Date r42 = r02;
        long r22 = r2 - r42.getTime();
        C1970t r5 = m3954i();
        AbstractC1856a.m4052H(this.f6432d, r8, "BufferCaptureStrategy.".concat(r10), new RunnableC1768f(this, r22, r42, r5, r6, r11));
        return;
    L9:
        if (r4.f6505h == null) goto L14;
        if ((!r4.isEmpty()) != true) goto L14;
        r02 = AbstractC1856a.m4068n(((C1790k) AbstractC2453ra.m4898h0(this.f6436h.f6505h)).f6509b);
        goto L13
    }

    @Override // io.sentry.android.replay.capture.InterfaceC1776n
    public final void stop() {
        C1789j r0 = this.f6436h;
        if (r0 == null) goto L5;
        File r02 = r0.m3972f();
    L6:
        AbstractC1856a.m4052H(this.f6432d, this.f6454r, "BufferCaptureStrategy.stop", new RunnableC2260n3(29, r02, this));
        C1789j r03 = this.f6436h;
        if (r03 == null) goto L9;
        r03.close();
    L9:
        this.f6439k.set(0);
        m3958m(null);
        C1970t r04 = C1970t.f7011b;
        InterfaceC0674Pm r1 = AbstractC1767e.f6428q[3];
        C1765c r12 = this.f6441m;
        Object r2 = r12.f6421a.getAndSet(r04);
        if (AbstractC0585Nj.m1134a(r2, r04) == true) goto L22;
        C1764b r3 = new C1764b(r2, r04, r12.f6423c, 0);
        AbstractC1767e r05 = r12.f6422b;
        C2046v2 r13 = r05.f6429a;
        if (r13.getThreadChecker().mo3902c() == false) goto L20;
        AbstractC1856a.m4052H((ScheduledExecutorService) r05.f6433e.getValue(), r13, "CaptureStrategy.runInBackground", new RunnableC1587H0(1, r3));
        return;
    L20:
        r3.mo6a();     // Catch: Throwable -> L17
        return;
    L17:
        th = move-exception;
        r13.getLogger().mo3683r(EnumC1657a2.ERROR, "Failed to execute task CaptureStrategy.runInBackground", th);
        return;
    L22:
        return;
    L5:
        r02 = null;
        goto L6
    }
}
