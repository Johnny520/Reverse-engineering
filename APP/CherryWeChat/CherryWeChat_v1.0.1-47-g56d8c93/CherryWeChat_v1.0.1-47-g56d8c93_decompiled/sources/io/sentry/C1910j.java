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

    public C1910j(C1953c c1953c, C1953c c1953c2, C1953c c1953c3, EnumC2027u1 enumC2027u1) {
        this.f6799c = c1953c;
        this.f6800d = c1953c2;
        this.f6801e = c1953c3;
        this.f6802f = enumC2027u1;
    }

    @Override // io.sentry.protocol.C1953c
    /* JADX INFO: renamed from: a */
    public final boolean mo4119a(Object obj) {
        throw null;
    }

    @Override // io.sentry.protocol.C1953c
    /* JADX INFO: renamed from: b */
    public final Set mo4120b() {
        return m4140w().f6889a.entrySet();
    }

    @Override // io.sentry.protocol.C1953c
    /* JADX INFO: renamed from: c */
    public final Object mo4121c(Object obj) {
        Object objMo4121c = this.f6801e.mo4121c(obj);
        if (objMo4121c != null) {
            return objMo4121c;
        }
        Object objMo4121c2 = this.f6800d.mo4121c(obj);
        return objMo4121c2 != null ? objMo4121c2 : this.f6799c.mo4121c(obj);
    }

    @Override // io.sentry.protocol.C1953c
    /* JADX INFO: renamed from: d */
    public final C1951a mo4122d() {
        C1951a c1951aMo4122d = this.f6801e.mo4122d();
        if (c1951aMo4122d != null) {
            return c1951aMo4122d;
        }
        C1951a c1951aMo4122d2 = this.f6800d.mo4122d();
        return c1951aMo4122d2 != null ? c1951aMo4122d2 : this.f6799c.mo4122d();
    }

    @Override // io.sentry.protocol.C1953c
    /* JADX INFO: renamed from: e */
    public final C1956f mo4123e() {
        C1956f c1956fMo4123e = this.f6801e.mo4123e();
        if (c1956fMo4123e != null) {
            return c1956fMo4123e;
        }
        C1956f c1956fMo4123e2 = this.f6800d.mo4123e();
        return c1956fMo4123e2 != null ? c1956fMo4123e2 : this.f6799c.mo4123e();
    }

    @Override // io.sentry.protocol.C1953c
    /* JADX INFO: renamed from: f */
    public final C1963m mo4124f() {
        C1963m c1963mMo4124f = this.f6801e.mo4124f();
        if (c1963mMo4124f != null) {
            return c1963mMo4124f;
        }
        C1963m c1963mMo4124f2 = this.f6800d.mo4124f();
        return c1963mMo4124f2 != null ? c1963mMo4124f2 : this.f6799c.mo4124f();
    }

    @Override // io.sentry.protocol.C1953c
    /* JADX INFO: renamed from: g */
    public final C1972v mo4125g() {
        C1972v c1972vMo4125g = this.f6801e.mo4125g();
        if (c1972vMo4125g != null) {
            return c1972vMo4125g;
        }
        C1972v c1972vMo4125g2 = this.f6800d.mo4125g();
        return c1972vMo4125g2 != null ? c1972vMo4125g2 : this.f6799c.mo4125g();
    }

    @Override // io.sentry.protocol.C1953c
    /* JADX INFO: renamed from: h */
    public final C1589H2 mo4126h() {
        C1589H2 c1589h2Mo4126h = this.f6801e.mo4126h();
        if (c1589h2Mo4126h != null) {
            return c1589h2Mo4126h;
        }
        C1589H2 c1589h2Mo4126h2 = this.f6800d.mo4126h();
        return c1589h2Mo4126h2 != null ? c1589h2Mo4126h2 : this.f6799c.mo4126h();
    }

    @Override // io.sentry.protocol.C1953c
    /* JADX INFO: renamed from: i */
    public final Enumeration mo4127i() {
        return m4140w().f6889a.keys();
    }

    @Override // io.sentry.protocol.C1953c
    /* JADX INFO: renamed from: j */
    public final Object mo4128j(String str, Object obj) {
        return m4139v().mo4128j(str, obj);
    }

    @Override // io.sentry.protocol.C1953c
    /* JADX INFO: renamed from: k */
    public final void mo4129k(C1953c c1953c) {
        throw null;
    }

    @Override // io.sentry.protocol.C1953c
    /* JADX INFO: renamed from: l */
    public final void mo4130l(C1951a c1951a) {
        m4139v().mo4130l(c1951a);
    }

    @Override // io.sentry.protocol.C1953c
    /* JADX INFO: renamed from: m */
    public final void mo4131m(C1952b c1952b) {
        m4139v().mo4131m(c1952b);
    }

    @Override // io.sentry.protocol.C1953c
    /* JADX INFO: renamed from: n */
    public final void mo4132n(C1956f c1956f) {
        m4139v().mo4132n(c1956f);
    }

    @Override // io.sentry.protocol.C1953c
    /* JADX INFO: renamed from: o */
    public final void mo4133o(C1959i c1959i) {
        m4139v().mo4133o(c1959i);
    }

    @Override // io.sentry.protocol.C1953c
    /* JADX INFO: renamed from: p */
    public final void mo4134p(C1963m c1963m) {
        m4139v().mo4134p(c1963m);
    }

    @Override // io.sentry.protocol.C1953c
    /* JADX INFO: renamed from: q */
    public final void mo4135q(C1966p c1966p) {
        m4139v().mo4135q(c1966p);
    }

    @Override // io.sentry.protocol.C1953c
    /* JADX INFO: renamed from: r */
    public final void mo4136r(C1972v c1972v) {
        m4139v().mo4136r(c1972v);
    }

    @Override // io.sentry.protocol.C1953c
    /* JADX INFO: renamed from: s */
    public final void mo4137s(C1945B c1945b) {
        m4139v().mo4137s(c1945b);
    }

    @Override // io.sentry.protocol.C1953c, io.sentry.InterfaceC1567C0
    public final void serialize(InterfaceC1652Z0 interfaceC1652Z0, ILogger iLogger) {
        m4140w().serialize(interfaceC1652Z0, iLogger);
    }

    @Override // io.sentry.protocol.C1953c
    /* JADX INFO: renamed from: t */
    public final void mo4138t(C1589H2 c1589h2) {
        m4139v().mo4138t(c1589h2);
    }

    /* JADX INFO: renamed from: v */
    public final C1953c m4139v() {
        int i = AbstractC1894i.f6764a[this.f6802f.ordinal()];
        C1953c c1953c = this.f6801e;
        return i != 1 ? i != 2 ? i != 3 ? c1953c : this.f6799c : this.f6800d : c1953c;
    }

    /* JADX INFO: renamed from: w */
    public final C1953c m4140w() {
        C1953c c1953c = new C1953c();
        c1953c.mo4129k(this.f6799c);
        c1953c.mo4129k(this.f6800d);
        c1953c.mo4129k(this.f6801e);
        return c1953c;
    }
}
