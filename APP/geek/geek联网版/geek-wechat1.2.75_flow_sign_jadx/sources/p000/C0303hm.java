package p000;

import androidx.lifecycle.C0036a;

/* JADX INFO: renamed from: hm */
/* JADX INFO: loaded from: classes.dex */
public final class C0303hm implements InterfaceC0603po, b20, xa0 {

    /* JADX INFO: renamed from: a */
    public final wa0 f2240a;

    /* JADX INFO: renamed from: b */
    public C0036a f2241b = null;

    /* JADX INFO: renamed from: c */
    public C0339im f2242c = null;

    public C0303hm(wa0 wa0Var) {
        this.f2240a = wa0Var;
    }

    @Override // p000.b20
    /* JADX INFO: renamed from: b */
    public final C0004a3 mo103b() {
        m1407f();
        return (C0004a3) this.f2242c.f2555c;
    }

    /* JADX INFO: renamed from: c */
    public final void m1406c(EnumC0494mq enumC0494mq) {
        this.f2241b.m262d(enumC0494mq);
    }

    @Override // p000.xa0
    /* JADX INFO: renamed from: d */
    public final wa0 mo104d() {
        m1407f();
        return this.f2240a;
    }

    @Override // p000.InterfaceC0716sq
    /* JADX INFO: renamed from: e */
    public final C0036a mo105e() {
        m1407f();
        return this.f2241b;
    }

    /* JADX INFO: renamed from: f */
    public final void m1407f() {
        if (this.f2241b == null) {
            this.f2241b = new C0036a(this);
            this.f2242c = new C0339im(this);
        }
    }
}
