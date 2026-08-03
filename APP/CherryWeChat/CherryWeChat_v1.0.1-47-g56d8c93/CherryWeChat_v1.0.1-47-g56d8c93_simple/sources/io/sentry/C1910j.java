package io.sentry;

import io.sentry.protocol.C1945B;
import io.sentry.protocol.C1951a;
import io.sentry.protocol.C1952b;
import io.sentry.protocol.C1953c;
import io.sentry.protocol.C1956f;
import io.sentry.protocol.C1959i;
import io.sentry.protocol.C1963m;
import io.sentry.protocol.C1966p;
import io.sentry.protocol.C1972v;
import java.util.Enumeration;
import java.util.Set;

/* JADX INFO: renamed from: io.sentry.j */
/* JADX INFO: loaded from: classes.dex */
public final class C1910j extends C1953c {

    /* JADX INFO: renamed from: c */
    public final C1953c f6799c;

    /* JADX INFO: renamed from: d */
    public final C1953c f6800d;

    /* JADX INFO: renamed from: e */
    public final C1953c f6801e;

    /* JADX INFO: renamed from: f */
    public final EnumC2027u1 f6802f;

    public C1910j(C1953c r1, C1953c r2, C1953c r3, EnumC2027u1 r4) {
        this.f6799c = r1;
        this.f6800d = r2;
        this.f6801e = r3;
        this.f6802f = r4;
    }

    @Override // io.sentry.protocol.C1953c
    /* JADX INFO: renamed from: a */
    public final boolean mo4119a(Object r1) {
        throw null;
    }

    @Override // io.sentry.protocol.C1953c
    /* JADX INFO: renamed from: b */
    public final Set mo4120b() {
        return m4140w().f6889a.entrySet();
    }

    @Override // io.sentry.protocol.C1953c
    /* JADX INFO: renamed from: c */
    public final Object mo4121c(Object r2) {
        Object r0 = this.f6801e.mo4121c(r2);
        if (r0 == null) goto L5;
        return r0;
    L5:
        Object r02 = this.f6800d.mo4121c(r2);
        if (r02 == null) goto L9;
        return r02;
    L9:
        return this.f6799c.mo4121c(r2);
    }

    @Override // io.sentry.protocol.C1953c
    /* JADX INFO: renamed from: d */
    public final C1951a mo4122d() {
        C1951a r0 = this.f6801e.mo4122d();
        if (r0 == null) goto L5;
        return r0;
    L5:
        C1951a r02 = this.f6800d.mo4122d();
        if (r02 == null) goto L9;
        return r02;
    L9:
        return this.f6799c.mo4122d();
    }

    @Override // io.sentry.protocol.C1953c
    /* JADX INFO: renamed from: e */
    public final C1956f mo4123e() {
        C1956f r0 = this.f6801e.mo4123e();
        if (r0 == null) goto L5;
        return r0;
    L5:
        C1956f r02 = this.f6800d.mo4123e();
        if (r02 == null) goto L9;
        return r02;
    L9:
        return this.f6799c.mo4123e();
    }

    @Override // io.sentry.protocol.C1953c
    /* JADX INFO: renamed from: f */
    public final C1963m mo4124f() {
        C1963m r0 = this.f6801e.mo4124f();
        if (r0 == null) goto L5;
        return r0;
    L5:
        C1963m r02 = this.f6800d.mo4124f();
        if (r02 == null) goto L9;
        return r02;
    L9:
        return this.f6799c.mo4124f();
    }

    @Override // io.sentry.protocol.C1953c
    /* JADX INFO: renamed from: g */
    public final C1972v mo4125g() {
        C1972v r0 = this.f6801e.mo4125g();
        if (r0 == null) goto L5;
        return r0;
    L5:
        C1972v r02 = this.f6800d.mo4125g();
        if (r02 == null) goto L9;
        return r02;
    L9:
        return this.f6799c.mo4125g();
    }

    @Override // io.sentry.protocol.C1953c
    /* JADX INFO: renamed from: h */
    public final C1589H2 mo4126h() {
        C1589H2 r0 = this.f6801e.mo4126h();
        if (r0 == null) goto L5;
        return r0;
    L5:
        C1589H2 r02 = this.f6800d.mo4126h();
        if (r02 == null) goto L9;
        return r02;
    L9:
        return this.f6799c.mo4126h();
    }

    @Override // io.sentry.protocol.C1953c
    /* JADX INFO: renamed from: i */
    public final Enumeration mo4127i() {
        return m4140w().f6889a.keys();
    }

    @Override // io.sentry.protocol.C1953c
    /* JADX INFO: renamed from: j */
    public final Object mo4128j(String r2, Object r3) {
        return m4139v().mo4128j(r2, r3);
    }

    @Override // io.sentry.protocol.C1953c
    /* JADX INFO: renamed from: k */
    public final void mo4129k(C1953c r1) {
        throw null;
    }

    @Override // io.sentry.protocol.C1953c
    /* JADX INFO: renamed from: l */
    public final void mo4130l(C1951a r2) {
        m4139v().mo4130l(r2);
    }

    @Override // io.sentry.protocol.C1953c
    /* JADX INFO: renamed from: m */
    public final void mo4131m(C1952b r2) {
        m4139v().mo4131m(r2);
    }

    @Override // io.sentry.protocol.C1953c
    /* JADX INFO: renamed from: n */
    public final void mo4132n(C1956f r2) {
        m4139v().mo4132n(r2);
    }

    @Override // io.sentry.protocol.C1953c
    /* JADX INFO: renamed from: o */
    public final void mo4133o(C1959i r2) {
        m4139v().mo4133o(r2);
    }

    @Override // io.sentry.protocol.C1953c
    /* JADX INFO: renamed from: p */
    public final void mo4134p(C1963m r2) {
        m4139v().mo4134p(r2);
    }

    @Override // io.sentry.protocol.C1953c
    /* JADX INFO: renamed from: q */
    public final void mo4135q(C1966p r2) {
        m4139v().mo4135q(r2);
    }

    @Override // io.sentry.protocol.C1953c
    /* JADX INFO: renamed from: r */
    public final void mo4136r(C1972v r2) {
        m4139v().mo4136r(r2);
    }

    @Override // io.sentry.protocol.C1953c
    /* JADX INFO: renamed from: s */
    public final void mo4137s(C1945B r2) {
        m4139v().mo4137s(r2);
    }

    @Override // io.sentry.protocol.C1953c, io.sentry.InterfaceC1567C0
    public final void serialize(InterfaceC1652Z0 r2, ILogger r3) {
        m4140w().serialize(r2, r3);
    }

    @Override // io.sentry.protocol.C1953c
    /* JADX INFO: renamed from: t */
    public final void mo4138t(C1589H2 r2) {
        m4139v().mo4138t(r2);
    }

    /* JADX INFO: renamed from: v */
    public final C1953c m4139v() {
        int r0 = AbstractC1894i.f6764a[this.f6802f.ordinal()];
        C1953c r2 = this.f6801e;
        if (r0 != 1) goto L5;
        return r2;
    L5:
        if (r0 == 2) goto L12;
        if (r0 == 3) goto L10;
        return r2;
    L10:
        return this.f6799c;
    L12:
        return this.f6800d;
    }

    /* JADX INFO: renamed from: w */
    public final C1953c m4140w() {
        C1953c r0 = new C1953c();
        r0.mo4129k(this.f6799c);
        r0.mo4129k(this.f6800d);
        r0.mo4129k(this.f6801e);
        return r0;
    }
}
