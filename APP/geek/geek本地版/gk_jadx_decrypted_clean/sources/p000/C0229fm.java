package p000;

import androidx.lifecycle.C0036a;

/* JADX INFO: renamed from: fm */
/* JADX INFO: loaded from: classes.dex */
public final class C0229fm implements InterfaceC0455lo, u10, sa0 {

    /* JADX INFO: renamed from: a */
    public final ra0 f1981a;

    /* JADX INFO: renamed from: b */
    public C0036a f1982b = null;

    /* JADX INFO: renamed from: c */
    public C0266gm f1983c = null;

    public C0229fm(ra0 ra0Var) {
        this.f1981a = ra0Var;
    }

    @Override // p000.u10
    /* JADX INFO: renamed from: b */
    public final C0004a3 mo118b() {
        m1234f();
        return (C0004a3) this.f1983c.f2143c;
    }

    /* JADX INFO: renamed from: c */
    public final void m1233c(EnumC0347iq enumC0347iq) {
        this.f1982b.m277d(enumC0347iq);
    }

    @Override // p000.sa0
    /* JADX INFO: renamed from: d */
    public final ra0 mo119d() {
        m1234f();
        return this.f1981a;
    }

    @Override // p000.InterfaceC0568oq
    /* JADX INFO: renamed from: e */
    public final C0036a mo120e() {
        m1234f();
        return this.f1982b;
    }

    /* JADX INFO: renamed from: f */
    public final void m1234f() {
        if (this.f1982b == null) {
            this.f1982b = new C0036a(this);
            this.f1983c = new C0266gm(this);
        }
    }
}
