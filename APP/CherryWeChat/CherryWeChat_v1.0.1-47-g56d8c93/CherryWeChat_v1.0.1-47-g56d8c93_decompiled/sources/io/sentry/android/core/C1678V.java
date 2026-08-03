package io.sentry.android.core;

import io.sentry.C1871f;
import io.sentry.C1981r;
import io.sentry.C2054w1;
import io.sentry.EnumC1657a2;
import io.sentry.transport.C2009d;
import io.sentry.util.C2029a;
import io.sentry.util.C2032d;
import java.util.Timer;
import java.util.concurrent.atomic.AtomicLong;
import p000.C2464rl;

/* JADX INFO: renamed from: io.sentry.android.core.V */
/* JADX INFO: loaded from: classes.dex */
public final class C1678V implements InterfaceC1659B {

    /* JADX INFO: renamed from: b */
    public final long f6047b;

    /* JADX INFO: renamed from: c */
    public C1677U f6048c;

    /* JADX INFO: renamed from: g */
    public final boolean f6052g;

    /* JADX INFO: renamed from: h */
    public final boolean f6053h;

    /* JADX INFO: renamed from: a */
    public final AtomicLong f6046a = new AtomicLong(0);

    /* JADX INFO: renamed from: d */
    public final C2032d f6049d = new C2032d(new C1676T(0));

    /* JADX INFO: renamed from: e */
    public final C2029a f6050e = new C2029a();

    /* JADX INFO: renamed from: f */
    public final C2054w1 f6051f = C2054w1.f7276a;

    /* JADX INFO: renamed from: i */
    public final C2009d f6054i = C2009d.f7188a;

    public C1678V(long j, boolean z, boolean z2) {
        this.f6047b = j;
        this.f6052g = z;
        this.f6053h = z2;
    }

    /* JADX INFO: renamed from: a */
    public final void m3858a(String str) {
        if (this.f6053h) {
            C1871f c1871f = new C1871f();
            c1871f.f6712e = "navigation";
            c1871f.m4093b("state", str);
            c1871f.f6714g = "app.lifecycle";
            c1871f.f6716i = EnumC1657a2.INFO;
            this.f6051f.m4224s(c1871f);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m3859b() {
        C1981r c1981rM4173a = this.f6050e.m4173a();
        try {
            C1677U c1677u = this.f6048c;
            if (c1677u != null) {
                c1677u.cancel();
                this.f6048c = null;
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

    @Override // io.sentry.android.core.InterfaceC1659B
    /* JADX INFO: renamed from: d */
    public final void mo3807d() {
        m3859b();
        this.f6054i.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        C2464rl c2464rl = new C2464rl(8, this);
        C2054w1 c2054w1 = this.f6051f;
        c2054w1.mo3719m(c2464rl);
        AtomicLong atomicLong = this.f6046a;
        long j = atomicLong.get();
        if (j == 0 || j + this.f6047b <= jCurrentTimeMillis) {
            if (this.f6052g) {
                c2054w1.mo3716j();
            }
            c2054w1.mo3718l().getReplayController().mo3701o();
        }
        c2054w1.mo3718l().getReplayController().mo3699l();
        atomicLong.set(jCurrentTimeMillis);
        m3858a("foreground");
    }

    @Override // io.sentry.android.core.InterfaceC1659B
    /* JADX INFO: renamed from: f */
    public final void mo3808f() {
        this.f6054i.getClass();
        this.f6046a.set(System.currentTimeMillis());
        this.f6051f.mo3718l().getReplayController().mo3693d();
        C1981r c1981rM4173a = this.f6050e.m4173a();
        try {
            m3859b();
            this.f6048c = new C1677U(0, this);
            ((Timer) this.f6049d.m4175a()).schedule(this.f6048c, this.f6047b);
            c1981rM4173a.close();
            m3858a("background");
        } catch (Throwable th) {
            try {
                c1981rM4173a.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
