package io.sentry.android.replay;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import io.sentry.C1563B0;
import io.sentry.C1599K0;
import io.sentry.C1650Y1;
import io.sentry.C1981r;
import io.sentry.C2046v2;
import io.sentry.C2054w1;
import io.sentry.C2067z2;
import io.sentry.EnumC1606M;
import io.sentry.EnumC1657a2;
import io.sentry.EnumC1929n;
import io.sentry.EnumC2063y2;
import io.sentry.InterfaceC1610N;
import io.sentry.InterfaceC1833c0;
import io.sentry.InterfaceC1912j1;
import io.sentry.InterfaceC1916k1;
import io.sentry.InterfaceC1935o0;
import io.sentry.RunnableC1631S1;
import io.sentry.android.replay.capture.AbstractC1767e;
import io.sentry.android.replay.capture.C1770h;
import io.sentry.android.replay.capture.C1779q;
import io.sentry.android.replay.capture.InterfaceC1776n;
import io.sentry.android.replay.gestures.C1785b;
import io.sentry.android.replay.util.RunnableC1803c;
import io.sentry.config.AbstractC1856a;
import io.sentry.protocol.C1970t;
import io.sentry.transport.C2009d;
import io.sentry.transport.C2021p;
import io.sentry.transport.InterfaceC2020o;
import io.sentry.util.C2029a;
import io.sentry.util.C2035g;
import java.io.Closeable;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import p000.AbstractC0148Dc;
import p000.AbstractC0714Qj;
import p000.AbstractC2453ra;
import p000.AbstractC2564tz;
import p000.C0382Iv;
import p000.C1251cA;
import p000.C1514ht;
import p000.RunnableC2069iq;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
public final class ReplayIntegration implements InterfaceC1935o0, Closeable, InterfaceC1916k1, InterfaceC1610N, InterfaceC2020o {

    /* JADX INFO: renamed from: q */
    public static final /* synthetic */ int f6381q = 0;

    /* JADX INFO: renamed from: a */
    public final Context f6382a;

    /* JADX INFO: renamed from: b */
    public final C2009d f6383b;

    /* JADX INFO: renamed from: c */
    public C2046v2 f6384c;

    /* JADX INFO: renamed from: d */
    public C2054w1 f6385d;

    /* JADX INFO: renamed from: e */
    public C1758C f6386e;

    /* JADX INFO: renamed from: f */
    public C1785b f6387f;

    /* JADX INFO: renamed from: g */
    public final C1251cA f6388g;

    /* JADX INFO: renamed from: h */
    public final C1251cA f6389h;

    /* JADX INFO: renamed from: i */
    public final C1251cA f6390i;

    /* JADX INFO: renamed from: j */
    public final AtomicBoolean f6391j;

    /* JADX INFO: renamed from: k */
    public final AtomicBoolean f6392k;

    /* JADX INFO: renamed from: l */
    public InterfaceC1776n f6393l;

    /* JADX INFO: renamed from: m */
    public InterfaceC1912j1 f6394m;

    /* JADX INFO: renamed from: n */
    public final C1563B0 f6395n;

    /* JADX INFO: renamed from: o */
    public final C2029a f6396o;

    /* JADX INFO: renamed from: p */
    public final C1795p f6397p;

    static {
        C1650Y1.m3790d().m3792b("maven:io.sentry:sentry-android-replay", "8.21.1");
    }

    public ReplayIntegration(Context context) {
        C2009d c2009d = C2009d.f7188a;
        Context applicationContext = context.getApplicationContext();
        this.f6382a = applicationContext != null ? applicationContext : context;
        this.f6383b = c2009d;
        this.f6388g = new C1251cA(C1760a.f6399d);
        this.f6389h = new C1251cA(C1760a.f6401f);
        this.f6390i = new C1251cA(C1760a.f6400e);
        this.f6391j = new AtomicBoolean(false);
        this.f6392k = new AtomicBoolean(false);
        this.f6394m = C1599K0.f5773b;
        this.f6395n = new C1563B0(4, false);
        this.f6396o = new C2029a();
        C1795p c1795p = new C1795p();
        c1795p.f6517a = EnumC1796q.INITIAL;
        this.f6397p = c1795p;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        C2021p c2021pMo3709c;
        C1981r c1981rM4173a = this.f6396o.m4173a();
        try {
            if (this.f6391j.get() && this.f6397p.m3974a(EnumC1796q.CLOSED)) {
                C2046v2 c2046v2 = this.f6384c;
                if (c2046v2 == null) {
                    c2046v2 = null;
                }
                c2046v2.getConnectionStatusProvider().mo3687n(this);
                C2054w1 c2054w1 = this.f6385d;
                if (c2054w1 != null && (c2021pMo3709c = c2054w1.mo3709c()) != null) {
                    c2021pMo3709c.f7207d.remove(this);
                }
                stop();
                C1758C c1758c = this.f6386e;
                if (c1758c != null) {
                    c1758c.close();
                }
                this.f6386e = null;
                ((C1798s) this.f6389h.getValue()).close();
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f6390i.getValue();
                C2046v2 c2046v22 = this.f6384c;
                if (c2046v22 == null) {
                    c2046v22 = null;
                }
                synchronized (scheduledExecutorService) {
                    if (!scheduledExecutorService.isShutdown()) {
                        scheduledExecutorService.shutdown();
                    }
                    try {
                        if (!scheduledExecutorService.awaitTermination(c2046v22.getShutdownTimeoutMillis(), TimeUnit.MILLISECONDS)) {
                            scheduledExecutorService.shutdownNow();
                        }
                    } catch (InterruptedException unused) {
                        scheduledExecutorService.shutdownNow();
                        Thread.currentThread().interrupt();
                    }
                }
                this.f6397p.f6517a = EnumC1796q.CLOSED;
                AbstractC0714Qj.m1489k(c1981rM4173a, null);
                return;
            }
            AbstractC0714Qj.m1489k(c1981rM4173a, null);
        } finally {
        }
    }

    @Override // io.sentry.InterfaceC1916k1
    /* JADX INFO: renamed from: d */
    public final void mo3693d() {
        this.f6392k.set(true);
        m3949v();
    }

    @Override // io.sentry.InterfaceC1916k1
    /* JADX INFO: renamed from: f */
    public final void mo3694f(Boolean bool) {
        if (this.f6391j.get() && m3946r()) {
            C1970t c1970t = C1970t.f7011b;
            InterfaceC1776n interfaceC1776n = this.f6393l;
            if (c1970t.equals(interfaceC1776n != null ? ((AbstractC1767e) interfaceC1776n).m3954i() : null)) {
                C2046v2 c2046v2 = this.f6384c;
                (c2046v2 != null ? c2046v2 : null).getLogger().mo3680e(EnumC1657a2.DEBUG, "Replay id is not set, not capturing for event", new Object[0]);
                return;
            }
            InterfaceC1776n interfaceC1776n2 = this.f6393l;
            if (interfaceC1776n2 != null) {
                interfaceC1776n2.mo3959b(bool.equals(Boolean.TRUE), new C1514ht(2, this));
            }
            InterfaceC1776n interfaceC1776n3 = this.f6393l;
            this.f6393l = interfaceC1776n3 != null ? interfaceC1776n3.mo3962e() : null;
        }
    }

    @Override // io.sentry.InterfaceC1610N
    /* JADX INFO: renamed from: i */
    public final void mo3725i(EnumC1606M enumC1606M) {
        if (this.f6393l instanceof C1779q) {
            if (enumC1606M == EnumC1606M.DISCONNECTED) {
                m3949v();
            } else {
                m3950w();
            }
        }
    }

    @Override // io.sentry.InterfaceC1916k1
    /* JADX INFO: renamed from: l */
    public final void mo3699l() {
        this.f6392k.set(false);
        m3950w();
    }

    @Override // io.sentry.transport.InterfaceC2020o
    /* JADX INFO: renamed from: m */
    public final void mo3877m(C2021p c2021p) {
        if (this.f6393l instanceof C1779q) {
            if (c2021p.m4170f(EnumC1929n.All) || c2021p.m4170f(EnumC1929n.Replay)) {
                m3949v();
            } else {
                m3950w();
            }
        }
    }

    @Override // io.sentry.InterfaceC1916k1
    /* JADX INFO: renamed from: o */
    public final void mo3701o() {
        InterfaceC1776n c1770h;
        C1981r c1981rM4173a = this.f6396o.m4173a();
        try {
            if (!this.f6391j.get()) {
                AbstractC0714Qj.m1489k(c1981rM4173a, null);
                return;
            }
            C1795p c1795p = this.f6397p;
            EnumC1796q enumC1796q = EnumC1796q.STARTED;
            if (!c1795p.m3974a(enumC1796q)) {
                C2046v2 c2046v2 = this.f6384c;
                if (c2046v2 == null) {
                    c2046v2 = null;
                }
                c2046v2.getLogger().mo3680e(EnumC1657a2.DEBUG, "Session replay is already being recorded, not starting a new one", new Object[0]);
                AbstractC0714Qj.m1489k(c1981rM4173a, null);
                return;
            }
            C2035g c2035g = (C2035g) this.f6388g.getValue();
            C2046v2 c2046v22 = this.f6384c;
            if (c2046v22 == null) {
                c2046v22 = null;
            }
            Double d = c2046v22.getSessionReplay().f7305a;
            boolean z = d != null && d.doubleValue() >= c2035g.m4179c();
            if (!z) {
                C2046v2 c2046v23 = this.f6384c;
                if (c2046v23 == null) {
                    c2046v23 = null;
                }
                Double d2 = c2046v23.getSessionReplay().f7306b;
                if (!(d2 != null && d2.doubleValue() > 0.0d)) {
                    C2046v2 c2046v24 = this.f6384c;
                    if (c2046v24 == null) {
                        c2046v24 = null;
                    }
                    c2046v24.getLogger().mo3680e(EnumC1657a2.INFO, "Session replay is not started, full session was not sampled and onErrorSampleRate is not specified", new Object[0]);
                    AbstractC0714Qj.m1489k(c1981rM4173a, null);
                    return;
                }
            }
            this.f6397p.f6517a = enumC1796q;
            if (z) {
                C2046v2 c2046v25 = this.f6384c;
                if (c2046v25 == null) {
                    c2046v25 = null;
                }
                c1770h = new C1779q(c2046v25, this.f6385d, this.f6383b, (ScheduledExecutorService) this.f6390i.getValue());
            } else {
                C2046v2 c2046v26 = this.f6384c;
                c1770h = new C1770h(c2046v26 == null ? null : c2046v26, this.f6385d, this.f6383b, (C2035g) this.f6388g.getValue(), (ScheduledExecutorService) this.f6390i.getValue());
            }
            this.f6393l = c1770h;
            C1758C c1758c = this.f6386e;
            if (c1758c != null) {
                c1758c.f6373f.getAndSet(true);
            }
            InterfaceC1776n interfaceC1776n = this.f6393l;
            if (interfaceC1776n != null) {
                interfaceC1776n.mo3953f(0, new C1970t(), null);
            }
            if (this.f6386e != null) {
                ((C1798s) this.f6389h.getValue()).f6521c.add(this.f6386e);
            }
            ((C1798s) this.f6389h.getValue()).f6521c.add(this.f6387f);
            AbstractC0714Qj.m1489k(c1981rM4173a, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC0714Qj.m1489k(c1981rM4173a, th);
                throw th2;
            }
        }
    }

    @Override // io.sentry.InterfaceC1935o0
    /* JADX INFO: renamed from: p */
    public final void mo3742p(C2046v2 c2046v2) {
        Double d;
        this.f6384c = c2046v2;
        Double d2 = c2046v2.getSessionReplay().f7305a;
        if ((d2 == null || d2.doubleValue() <= 0.0d) && ((d = c2046v2.getSessionReplay().f7306b) == null || d.doubleValue() <= 0.0d)) {
            c2046v2.getLogger().mo3680e(EnumC1657a2.INFO, "Session replay is disabled, no sample rate specified", new Object[0]);
            return;
        }
        C2054w1 c2054w1 = C2054w1.f7276a;
        this.f6385d = c2054w1;
        this.f6386e = new C1758C(c2046v2, this, this, this.f6395n, (ScheduledExecutorService) this.f6390i.getValue());
        this.f6387f = new C1785b(c2046v2, this);
        this.f6391j.set(true);
        c2046v2.getConnectionStatusProvider().mo3685h(this);
        C2021p c2021pMo3709c = c2054w1.mo3709c();
        if (c2021pMo3709c != null) {
            c2021pMo3709c.f7207d.add(this);
        }
        AbstractC1856a.m4055a("Replay");
        C2046v2 c2046v22 = this.f6384c;
        if (c2046v22 == null) {
            c2046v22 = null;
        }
        InterfaceC1833c0 executorService = c2046v22.getExecutorService();
        C2046v2 c2046v23 = this.f6384c;
        if (c2046v23 == null) {
            c2046v23 = null;
        }
        try {
            executorService.submit(new RunnableC1803c(0, new RunnableC1631S1(8, this), c2046v23));
        } catch (Throwable th) {
            c2046v23.getLogger().mo3683r(EnumC1657a2.ERROR, "Failed to submit task ReplayIntegration.finalize_previous_replay to executor", th);
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m3945q(String str) {
        File[] fileArrListFiles;
        C1970t c1970tM3954i;
        C2046v2 c2046v2 = this.f6384c;
        if (c2046v2 == null) {
            c2046v2 = null;
        }
        String cacheDirPath = c2046v2.getCacheDirPath();
        if (cacheDirPath == null || (fileArrListFiles = new File(cacheDirPath).listFiles()) == null) {
            return;
        }
        for (File file : fileArrListFiles) {
            String name = file.getName();
            if (name.startsWith("replay_")) {
                InterfaceC1776n interfaceC1776n = this.f6393l;
                if (interfaceC1776n == null || (c1970tM3954i = ((AbstractC1767e) interfaceC1776n).m3954i()) == null) {
                    c1970tM3954i = C1970t.f7011b;
                }
                if (!AbstractC2564tz.m5051L(name, c1970tM3954i.toString(), false) && (AbstractC2564tz.m5059T(str) || !AbstractC2564tz.m5051L(name, str, false))) {
                    AbstractC1856a.m4060f(file);
                }
            }
        }
    }

    /* JADX INFO: renamed from: r */
    public final boolean m3946r() {
        return this.f6397p.f6517a.compareTo(EnumC1796q.STARTED) >= 0 && this.f6397p.f6517a.compareTo(EnumC1796q.STOPPED) < 0;
    }

    /* JADX INFO: renamed from: s */
    public final void m3947s(Bitmap bitmap) {
        C0382Iv c0382Iv = new C0382Iv();
        C2054w1 c2054w1 = this.f6385d;
        if (c2054w1 != null) {
            c2054w1.mo3719m(new C1791l(c0382Iv, 0));
        }
        InterfaceC1776n interfaceC1776n = this.f6393l;
        if (interfaceC1776n != null) {
            interfaceC1776n.mo3963g(new C1793n(bitmap, c0382Iv, this));
        }
    }

    @Override // io.sentry.InterfaceC1916k1
    public final void stop() {
        C1981r c1981rM4173a = this.f6396o.m4173a();
        try {
            if (this.f6391j.get()) {
                C1795p c1795p = this.f6397p;
                EnumC1796q enumC1796q = EnumC1796q.STOPPED;
                if (c1795p.m3974a(enumC1796q)) {
                    if (this.f6386e != null) {
                        ((C1798s) this.f6389h.getValue()).f6521c.remove(this.f6386e);
                    }
                    ((C1798s) this.f6389h.getValue()).f6521c.remove(this.f6387f);
                    C1758C c1758c = this.f6386e;
                    if (c1758c != null) {
                        c1758c.m3942l();
                    }
                    C1758C c1758c2 = this.f6386e;
                    if (c1758c2 != null) {
                        c1758c2.m3944o();
                    }
                    C1785b c1785b = this.f6387f;
                    if (c1785b != null) {
                        c1785b.m3969a();
                    }
                    InterfaceC1776n interfaceC1776n = this.f6393l;
                    if (interfaceC1776n != null) {
                        interfaceC1776n.stop();
                    }
                    this.f6393l = null;
                    this.f6397p.f6517a = enumC1796q;
                    AbstractC0714Qj.m1489k(c1981rM4173a, null);
                    return;
                }
            }
            AbstractC0714Qj.m1489k(c1981rM4173a, null);
        } finally {
        }
    }

    @Override // io.sentry.InterfaceC1916k1
    /* JADX INFO: renamed from: t */
    public final InterfaceC1912j1 mo3705t() {
        return this.f6394m;
    }

    /* JADX INFO: renamed from: u */
    public final void m3948u(int i, int i2) {
        C1758C c1758c;
        RunnableC2069iq runnableC2069iq;
        ViewTreeObserverOnDrawListenerC1810v viewTreeObserverOnDrawListenerC1810v;
        if (this.f6391j.get() && m3946r()) {
            C2046v2 c2046v2 = this.f6384c;
            if (c2046v2 == null) {
                c2046v2 = null;
            }
            if (c2046v2.getSessionReplay().f7314j) {
                Context context = this.f6382a;
                C2046v2 c2046v22 = this.f6384c;
                if (c2046v22 == null) {
                    c2046v22 = null;
                }
                C2067z2 sessionReplay = c2046v22.getSessionReplay();
                float f = i2;
                float f2 = f / context.getResources().getDisplayMetrics().density;
                EnumC2063y2 enumC2063y2 = sessionReplay.f7309e;
                int iM283q = AbstractC0148Dc.m283q(f2 * enumC2063y2.sizeScale);
                int i3 = iM283q % 16;
                int i4 = i3 <= 8 ? iM283q - i3 : iM283q + (16 - i3);
                float f3 = i;
                int iM283q2 = AbstractC0148Dc.m283q((f3 / context.getResources().getDisplayMetrics().density) * enumC2063y2.sizeScale);
                int i5 = iM283q2 % 16;
                int i6 = i5 <= 8 ? iM283q2 - i5 : iM283q2 + (16 - i5);
                C1821w c1821w = new C1821w(i6, i4, i6 / f3, i4 / f, sessionReplay.f7310f, enumC2063y2.bitRate);
                if (this.f6391j.get() && m3946r()) {
                    InterfaceC1776n interfaceC1776n = this.f6393l;
                    if (interfaceC1776n != null) {
                        interfaceC1776n.mo3960c(c1821w);
                    }
                    C1758C c1758c2 = this.f6386e;
                    if (c1758c2 != null && c1758c2.f6373f.get()) {
                        if (c1758c2.f6378k == null) {
                            C1981r c1981rM4173a = c1758c2.f6377j.m4173a();
                            try {
                                if (c1758c2.f6378k == null) {
                                    c1758c2.f6378k = new RunnableC2069iq(c1758c2.f6368a, c1758c2.f6371d);
                                }
                                AbstractC0714Qj.m1489k(c1981rM4173a, null);
                            } catch (Throwable th) {
                                try {
                                    throw th;
                                } catch (Throwable th2) {
                                    AbstractC0714Qj.m1489k(c1981rM4173a, th);
                                    throw th2;
                                }
                            }
                        }
                        RunnableC2069iq runnableC2069iq2 = c1758c2.f6378k;
                        if (runnableC2069iq2 != null) {
                            runnableC2069iq2.f7322e = c1821w;
                        }
                        RunnableC2069iq runnableC2069iq3 = c1758c2.f6378k;
                        if (runnableC2069iq3 != null) {
                            runnableC2069iq3.f7321d = new ViewTreeObserverOnDrawListenerC1810v(c1821w, c1758c2.f6368a, c1758c2.f6371d, c1758c2.f6372e, c1758c2.f6369b);
                        }
                        WeakReference weakReference = (WeakReference) AbstractC2453ra.m4903m0(c1758c2.f6374g);
                        View view = weakReference != null ? (View) weakReference.get() : null;
                        if (view != null && (runnableC2069iq = c1758c2.f6378k) != null && (viewTreeObserverOnDrawListenerC1810v = (ViewTreeObserverOnDrawListenerC1810v) runnableC2069iq.f7321d) != null) {
                            viewTreeObserverOnDrawListenerC1810v.m3979a(view);
                        }
                        C1563B0 c1563b0 = c1758c2.f6371d;
                        RunnableC2069iq runnableC2069iq4 = c1758c2.f6378k;
                        Handler handler = (Handler) c1563b0.f5600a;
                        if (runnableC2069iq4 != null) {
                            handler.removeCallbacks(runnableC2069iq4);
                        }
                        C1563B0 c1563b02 = c1758c2.f6371d;
                        RunnableC2069iq runnableC2069iq5 = c1758c2.f6378k;
                        if (!(runnableC2069iq5 == null ? false : ((Handler) c1563b02.f5600a).postDelayed(runnableC2069iq5, 100L))) {
                            c1758c2.f6368a.getLogger().mo3680e(EnumC1657a2.WARNING, "Failed to post the capture runnable, main looper is shutting down.", new Object[0]);
                        }
                    }
                    if (this.f6397p.f6517a != EnumC1796q.PAUSED || (c1758c = this.f6386e) == null) {
                        return;
                    }
                    c1758c.m3941i();
                }
            }
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m3949v() {
        C1981r c1981rM4173a = this.f6396o.m4173a();
        try {
            if (this.f6391j.get()) {
                C1795p c1795p = this.f6397p;
                EnumC1796q enumC1796q = EnumC1796q.PAUSED;
                if (c1795p.m3974a(enumC1796q)) {
                    C1758C c1758c = this.f6386e;
                    if (c1758c != null) {
                        c1758c.m3941i();
                    }
                    InterfaceC1776n interfaceC1776n = this.f6393l;
                    if (interfaceC1776n != null) {
                        interfaceC1776n.mo3961d();
                    }
                    this.f6397p.f6517a = enumC1796q;
                    AbstractC0714Qj.m1489k(c1981rM4173a, null);
                    return;
                }
            }
            AbstractC0714Qj.m1489k(c1981rM4173a, null);
        } finally {
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m3950w() {
        C2054w1 c2054w1;
        C2054w1 c2054w12;
        C2021p c2021pMo3709c;
        C2021p c2021pMo3709c2;
        C1981r c1981rM4173a = this.f6396o.m4173a();
        try {
            if (this.f6391j.get()) {
                C1795p c1795p = this.f6397p;
                EnumC1796q enumC1796q = EnumC1796q.RESUMED;
                if (c1795p.m3974a(enumC1796q)) {
                    if (!this.f6392k.get()) {
                        C2046v2 c2046v2 = this.f6384c;
                        if (c2046v2 == null) {
                            c2046v2 = null;
                        }
                        if (c2046v2.getConnectionStatusProvider().mo3684g() != EnumC1606M.DISCONNECTED && (((c2054w1 = this.f6385d) == null || (c2021pMo3709c2 = c2054w1.mo3709c()) == null || !c2021pMo3709c2.m4170f(EnumC1929n.All)) && ((c2054w12 = this.f6385d) == null || (c2021pMo3709c = c2054w12.mo3709c()) == null || !c2021pMo3709c.m4170f(EnumC1929n.Replay)))) {
                            this.f6397p.f6517a = enumC1796q;
                            InterfaceC1776n interfaceC1776n = this.f6393l;
                            if (interfaceC1776n != null) {
                                ((AbstractC1767e) interfaceC1776n).m3958m(AbstractC1856a.m4067m());
                            }
                            C1758C c1758c = this.f6386e;
                            if (c1758c != null) {
                                c1758c.m3943m();
                            }
                            AbstractC0714Qj.m1489k(c1981rM4173a, null);
                            return;
                        }
                    }
                    AbstractC0714Qj.m1489k(c1981rM4173a, null);
                    return;
                }
            }
            AbstractC0714Qj.m1489k(c1981rM4173a, null);
        } finally {
        }
    }
}
