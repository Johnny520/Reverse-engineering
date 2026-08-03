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

    /* JADX INFO: renamed from: a */
    public final AtomicLong f6046a;

    /* JADX INFO: renamed from: b */
    public final long f6047b;

    /* JADX INFO: renamed from: c */
    public C1677U f6048c;

    /* JADX INFO: renamed from: d */
    public final C2032d f6049d;

    /* JADX INFO: renamed from: e */
    public final C2029a f6050e;

    /* JADX INFO: renamed from: f */
    public final C2054w1 f6051f;

    /* JADX INFO: renamed from: g */
    public final boolean f6052g;

    /* JADX INFO: renamed from: h */
    public final boolean f6053h;

    /* JADX INFO: renamed from: i */
    public final C2009d f6054i;

    public C1678V(long r4, boolean r6, boolean r7) {
        this.f6046a = new AtomicLong(0);
        this.f6049d = new C2032d(new C1676T(0));
        this.f6050e = new C2029a();
        this.f6047b = r4;
        this.f6052g = r6;
        this.f6053h = r7;
        this.f6051f = C2054w1.f7276a;
        this.f6054i = C2009d.f7188a;
    }

    /* JADX INFO: renamed from: a */
    public final void m3858a(String r3) {
        if (this.f6053h == false) goto L6;
        C1871f r0 = new C1871f();
        r0.f6712e = "navigation";
        r0.m4093b("state", r3);
        r0.f6714g = "app.lifecycle";
        r0.f6716i = EnumC1657a2.INFO;
        this.f6051f.m4224s(r0);
        return;
    }

    /* JADX INFO: renamed from: b */
    public final void m3859b() {
        C1981r r0 = this.f6050e.m4173a();
        C1677U r1 = this.f6048c;     // Catch: Throwable -> L7
        if (r1 == null) goto L9;
        r1.cancel();     // Catch: Throwable -> L7
        this.f6048c = null;     // Catch: Throwable -> L7
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

    @Override // io.sentry.android.core.InterfaceC1659B
    /* JADX INFO: renamed from: d */
    public final void mo3807d() {
        m3859b();
        this.f6054i.getClass();
        long r0 = System.currentTimeMillis();
        C2464rl r2 = new C2464rl(8, this);
        C2054w1 r3 = this.f6051f;
        r3.mo3719m(r2);
        AtomicLong r22 = this.f6046a;
        long r4 = r22.get();
        if (r4 == 0) goto L7;
        if ((r4 + this.f6047b) <= r0) goto L7;
    L10:
        r3.mo3718l().getReplayController().mo3699l();
        r22.set(r0);
        m3858a("foreground");
        return;
    L7:
        if (this.f6052g == false) goto L9;
        r3.mo3716j();
    L9:
        r3.mo3718l().getReplayController().mo3701o();
        goto L10
    }

    @Override // io.sentry.android.core.InterfaceC1659B
    /* JADX INFO: renamed from: f */
    public final void mo3808f() {
        this.f6054i.getClass();
        long r0 = System.currentTimeMillis();
        this.f6046a.set(r0);
        this.f6051f.mo3718l().getReplayController().mo3693d();
        C1981r r02 = this.f6050e.m4173a();
        m3859b();     // Catch: Throwable -> L6
        this.f6048c = new C1677U(0, this);     // Catch: Throwable -> L6
        ((Timer) this.f6049d.m4175a()).schedule(this.f6048c, this.f6047b);     // Catch: Throwable -> L6
        r02.close();
        m3858a("background");
        return;
    L6:
        th = move-exception;
        r02.close();     // Catch: Throwable -> L9
    L11:
        throw th;
    L9:
        th = move-exception;
        th.addSuppressed(th);
        goto L11
    }
}
