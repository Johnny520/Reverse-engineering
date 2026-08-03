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

    public C1770h(C2046v2 c2046v2, C2054w1 c2054w1, C2009d c2009d, C2035g c2035g, ScheduledExecutorService scheduledExecutorService) {
        super(c2046v2, c2054w1, c2009d, scheduledExecutorService);
        this.f6454r = c2046v2;
        this.f6455s = c2054w1;
        this.f6456t = c2009d;
        this.f6457u = c2035g;
        this.f6458v = new ArrayList();
    }

    @Override // io.sentry.android.replay.capture.AbstractC1767e, io.sentry.android.replay.capture.InterfaceC1776n
    /* JADX INFO: renamed from: a */
    public final void mo3952a(MotionEvent motionEvent) {
        super.mo3952a(motionEvent);
        long jMo3899b = this.f6456t.mo3899b() - this.f6454r.getSessionReplay().f7311g;
        Iterator it = this.f6444p.iterator();
        while (it.hasNext()) {
            if (((AbstractC1986b) it.next()).f7116b < jMo3899b) {
                it.remove();
            }
        }
    }

    @Override // io.sentry.android.replay.capture.InterfaceC1776n
    /* JADX INFO: renamed from: b */
    public final void mo3959b(boolean z, C1514ht c1514ht) {
        C2046v2 c2046v2 = this.f6454r;
        Double d = c2046v2.getSessionReplay().f7306b;
        if (d == null || d.doubleValue() < this.f6457u.m4179c()) {
            c2046v2.getLogger().mo3680e(EnumC1657a2.INFO, "Replay wasn't sampled by onErrorSampleRate, not capturing for event", new Object[0]);
            return;
        }
        InterfaceC1651Z interfaceC1651Z = this.f6455s;
        if (interfaceC1651Z != null) {
            interfaceC1651Z.mo3719m(new C2464rl(11, this));
        }
        if (!z) {
            m3964n("capture_replay", new C1799t(this, c1514ht, 1));
        } else {
            this.f6435g.set(true);
            c2046v2.getLogger().mo3680e(EnumC1657a2.DEBUG, "Not capturing replay for crashed event, will be captured on next launch", new Object[0]);
        }
    }

    @Override // io.sentry.android.replay.capture.InterfaceC1776n
    /* JADX INFO: renamed from: c */
    public final void mo3960c(C1821w c1821w) {
        m3964n("configuration_changed", new C1769g(this, 0));
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
        m3964n("pause", new C1769g(this, 1));
    }

    @Override // io.sentry.android.replay.capture.InterfaceC1776n
    /* JADX INFO: renamed from: e */
    public final InterfaceC1776n mo3962e() {
        boolean z = this.f6435g.get();
        C2046v2 c2046v2 = this.f6454r;
        if (z) {
            c2046v2.getLogger().mo3680e(EnumC1657a2.DEBUG, "Not converting to session mode, because the process is about to terminate", new Object[0]);
            return this;
        }
        C1779q c1779q = new C1779q(c2046v2, this.f6455s, this.f6456t, this.f6432d);
        c1779q.mo3953f(m3955j(), m3954i(), EnumC2055w2.BUFFER);
        return c1779q;
    }

    @Override // io.sentry.android.replay.capture.InterfaceC1776n
    /* JADX INFO: renamed from: g */
    public final void mo3963g(C1793n c1793n) {
        AbstractC1856a.m4052H(this.f6432d, this.f6454r, "BufferCaptureStrategy.add_frame", new RunnableC1752z(this, c1793n, this.f6456t.mo3899b()));
    }

    /* JADX INFO: renamed from: n */
    public final void m3964n(String str, InterfaceC1416fj interfaceC1416fj) {
        ArrayList arrayList;
        C1821w c1821wM3956k = m3956k();
        C2046v2 c2046v2 = this.f6454r;
        if (c1821wM3956k == null) {
            c2046v2.getLogger().mo3680e(EnumC1657a2.DEBUG, "Recorder config is not set, not creating segment for task: ".concat(str), new Object[0]);
            return;
        }
        long j = c2046v2.getSessionReplay().f7311g;
        long jMo3899b = this.f6456t.mo3899b();
        C1789j c1789j = this.f6436h;
        Date dateM4068n = (c1789j == null || (arrayList = c1789j.f6505h) == null || !(arrayList.isEmpty() ^ true)) ? AbstractC1856a.m4068n(jMo3899b - j) : AbstractC1856a.m4068n(((C1790k) AbstractC2453ra.m4898h0(this.f6436h.f6505h)).f6509b);
        AbstractC1856a.m4052H(this.f6432d, c2046v2, "BufferCaptureStrategy.".concat(str), new RunnableC1768f(this, jMo3899b - dateM4068n.getTime(), dateM4068n, m3954i(), c1821wM3956k, interfaceC1416fj));
    }

    @Override // io.sentry.android.replay.capture.InterfaceC1776n
    public final void stop() {
        C1789j c1789j = this.f6436h;
        AbstractC1856a.m4052H(this.f6432d, this.f6454r, "BufferCaptureStrategy.stop", new RunnableC2260n3(29, c1789j != null ? c1789j.m3972f() : null, this));
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
