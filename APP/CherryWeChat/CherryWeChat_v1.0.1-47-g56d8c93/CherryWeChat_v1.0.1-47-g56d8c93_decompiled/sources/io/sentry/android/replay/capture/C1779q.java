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
import java.io.IOException;
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

    public C1779q(C2046v2 c2046v2, InterfaceC1651Z interfaceC1651Z, InterfaceC2011f interfaceC2011f, ScheduledExecutorService scheduledExecutorService) {
        super(c2046v2, interfaceC1651Z, interfaceC2011f, scheduledExecutorService);
        this.f6468r = c2046v2;
        this.f6469s = interfaceC1651Z;
        this.f6470t = interfaceC2011f;
    }

    @Override // io.sentry.android.replay.capture.InterfaceC1776n
    /* JADX INFO: renamed from: b */
    public final void mo3959b(boolean z, C1514ht c1514ht) {
        C2046v2 c2046v2 = this.f6468r;
        if (c2046v2.getSessionReplay().f7316l) {
            c2046v2.getLogger().mo3680e(EnumC1657a2.DEBUG, "Replay is already running in 'session' mode, not capturing for event", new Object[0]);
        }
        this.f6435g.set(z);
    }

    @Override // io.sentry.android.replay.capture.InterfaceC1776n
    /* JADX INFO: renamed from: c */
    public final void mo3960c(C1821w c1821w) {
        m3967n("onConfigurationChanged", new C1778p(this, 0));
        InterfaceC0674Pm interfaceC0674Pm = AbstractC1767e.f6428q[0];
        C1765c c1765c = this.f6437i;
        Object andSet = c1765c.f6421a.getAndSet(c1821w);
        if (AbstractC0585Nj.m1134a(andSet, c1821w)) {
            return;
        }
        C1766d c1766d = new C1766d(andSet, c1821w, c1765c.f6423c, 1);
        AbstractC1767e abstractC1767e = c1765c.f6422b;
        C2046v2 c2046v2 = abstractC1767e.f6429a;
        if (c2046v2.getThreadChecker().mo3902c()) {
            AbstractC1856a.m4052H((ScheduledExecutorService) abstractC1767e.f6433e.getValue(), c2046v2, "CaptureStrategy.runInBackground", new RunnableC1587H0(4, c1766d));
            return;
        }
        try {
            c1766d.mo6a();
        } catch (Throwable th) {
            c2046v2.getLogger().mo3683r(EnumC1657a2.ERROR, "Failed to execute task CaptureStrategy.runInBackground", th);
        }
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
    public final void mo3953f(int i, C1970t c1970t, EnumC2055w2 enumC2055w2) {
        super.mo3953f(i, c1970t, enumC2055w2);
        InterfaceC1651Z interfaceC1651Z = this.f6469s;
        if (interfaceC1651Z != null) {
            interfaceC1651Z.mo3719m(new C2464rl(12, this));
        }
    }

    @Override // io.sentry.android.replay.capture.InterfaceC1776n
    /* JADX INFO: renamed from: g */
    public final void mo3963g(final C1793n c1793n) {
        final C1821w c1821wM3956k = m3956k();
        final long jMo3899b = this.f6470t.mo3899b();
        AbstractC1856a.m4052H(this.f6432d, this.f6468r, "SessionCaptureStrategy.add_frame", new Runnable() { // from class: io.sentry.android.replay.capture.o
            @Override // java.lang.Runnable
            public final void run() throws IOException {
                C1779q c1779q = this.f6462a;
                C1789j c1789j = c1779q.f6436h;
                C2046v2 c2046v2 = c1779q.f6468r;
                if (c1789j != null) {
                    c1793n.mo446d(c1789j, Long.valueOf(jMo3899b));
                }
                C1765c c1765c = c1779q.f6438j;
                InterfaceC0674Pm interfaceC0674Pm = AbstractC1767e.f6428q[1];
                Date date = (Date) c1765c.f6421a.get();
                if (date == null) {
                    c2046v2.getLogger().mo3680e(EnumC1657a2.DEBUG, "Segment timestamp is not set, not recording frame", new Object[0]);
                    return;
                }
                if (c1779q.f6435g.get()) {
                    c2046v2.getLogger().mo3680e(EnumC1657a2.DEBUG, "Not capturing segment, because the app is terminating, will be captured on next launch", new Object[0]);
                    return;
                }
                C1821w c1821w = c1821wM3956k;
                if (c1821w == null) {
                    c2046v2.getLogger().mo3680e(EnumC1657a2.DEBUG, "Recorder config is not set, not recording frame", new Object[0]);
                    return;
                }
                long jMo3899b2 = c1779q.f6470t.mo3899b();
                if (jMo3899b2 - date.getTime() >= c2046v2.getSessionReplay().f7312h) {
                    AbstractC1775m abstractC1775mM3951h = AbstractC1767e.m3951h(c1779q, c2046v2.getSessionReplay().f7312h, date, c1779q.m3954i(), c1779q.m3955j(), c1821w.f6590b, c1821w.f6589a, c1821w.f6593e, c1821w.f6594f);
                    if (abstractC1775mM3951h instanceof C1773k) {
                        C1773k c1773k = (C1773k) abstractC1775mM3951h;
                        C1773k.m3966a(c1773k, c1779q.f6469s);
                        c1779q.m3957l(c1779q.m3955j() + 1);
                        c1779q.m3958m(c1773k.f6459a.f7285u);
                    }
                }
                if (jMo3899b2 - c1779q.f6439k.get() >= c2046v2.getSessionReplay().f7313i) {
                    c2046v2.getReplayController().stop();
                    c2046v2.getLogger().mo3680e(EnumC1657a2.INFO, "Session replay deadline exceeded (1h), stopping recording", new Object[0]);
                }
            }
        });
    }

    /* JADX INFO: renamed from: n */
    public final void m3967n(String str, InterfaceC1416fj interfaceC1416fj) {
        C1821w c1821wM3956k = m3956k();
        C2046v2 c2046v2 = this.f6468r;
        if (c1821wM3956k == null) {
            c2046v2.getLogger().mo3680e(EnumC1657a2.DEBUG, "Recorder config is not set, not creating segment for task: ".concat(str), new Object[0]);
            return;
        }
        long jMo3899b = this.f6470t.mo3899b();
        InterfaceC0674Pm interfaceC0674Pm = AbstractC1767e.f6428q[1];
        Date date = (Date) this.f6438j.f6421a.get();
        if (date == null) {
            return;
        }
        long time = jMo3899b - date.getTime();
        C1970t c1970tM3954i = m3954i();
        AbstractC1856a.m4052H(this.f6432d, c2046v2, "SessionCaptureStrategy.".concat(str), new RunnableC1768f(this, time, date, c1970tM3954i, c1821wM3956k, interfaceC1416fj));
    }

    @Override // io.sentry.android.replay.capture.InterfaceC1776n
    public final void stop() {
        C1789j c1789j = this.f6436h;
        m3967n("stop", new C1799t(this, c1789j != null ? c1789j.m3972f() : null, 2));
        InterfaceC1651Z interfaceC1651Z = this.f6469s;
        if (interfaceC1651Z != null) {
            interfaceC1651Z.mo3719m(new C1676T(2));
        }
        C1789j c1789j2 = this.f6436h;
        if (c1789j2 != null) {
            c1789j2.close();
        }
        this.f6439k.set(0L);
        m3958m(null);
        C1970t c1970t = C1970t.f7011b;
        InterfaceC0674Pm interfaceC0674Pm = AbstractC1767e.f6428q[3];
        C1765c c1765c = this.f6441m;
        Object andSet = c1765c.f6421a.getAndSet(c1970t);
        if (AbstractC0585Nj.m1134a(andSet, c1970t)) {
            return;
        }
        C1764b c1764b = new C1764b(andSet, c1970t, c1765c.f6423c, 0);
        AbstractC1767e abstractC1767e = c1765c.f6422b;
        C2046v2 c2046v2 = abstractC1767e.f6429a;
        if (c2046v2.getThreadChecker().mo3902c()) {
            AbstractC1856a.m4052H((ScheduledExecutorService) abstractC1767e.f6433e.getValue(), c2046v2, "CaptureStrategy.runInBackground", new RunnableC1587H0(1, c1764b));
            return;
        }
        try {
            c1764b.mo6a();
        } catch (Throwable th) {
            c2046v2.getLogger().mo3683r(EnumC1657a2.ERROR, "Failed to execute task CaptureStrategy.runInBackground", th);
        }
    }
}
