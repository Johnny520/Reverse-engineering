package p207n3;

import p000A.C0033Q0;
import p056K2.C0891q;
import p074O2.InterfaceC1051i;
import p112W2.InterfaceC1604f;
import p121Y1.C1753n;
import p160f3.C2135g;
import p160f3.InterfaceC2133f;
import p160f3.InterfaceC2158r0;
import p190k3.AbstractC2470r;

/* JADX INFO: renamed from: n3.b */
/* JADX INFO: loaded from: classes.dex */
public final class C2694b implements InterfaceC2133f, InterfaceC2158r0 {

    /* JADX INFO: renamed from: d */
    public final C2135g f8596d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C2695c f8597e;

    public C2694b(C2695c c2695c, C2135g c2135g) {
        this.f8597e = c2695c;
        this.f8596d = c2135g;
    }

    @Override // p160f3.InterfaceC2158r0
    /* JADX INFO: renamed from: a */
    public final void mo3961a(AbstractC2470r abstractC2470r, int i5) {
        this.f8596d.mo3961a(abstractC2470r, i5);
    }

    @Override // p074O2.InterfaceC1046d
    /* JADX INFO: renamed from: e */
    public final InterfaceC1051i mo275e() {
        return this.f8596d.f7078h;
    }

    @Override // p074O2.InterfaceC1046d
    /* JADX INFO: renamed from: i */
    public final void mo278i(Object obj) {
        this.f8596d.mo278i(obj);
    }

    @Override // p160f3.InterfaceC2133f
    /* JADX INFO: renamed from: k */
    public final boolean mo3952k(Throwable th) {
        return this.f8596d.mo3952k(th);
    }

    @Override // p160f3.InterfaceC2133f
    /* JADX INFO: renamed from: s */
    public final C1753n mo3953s(Object obj, InterfaceC1604f interfaceC1604f) {
        C2695c c2695c = this.f8597e;
        C0033Q0 c0033q0 = new C0033Q0(c2695c, this);
        C1753n c1753nMo3953s = this.f8596d.mo3953s((C0891q) obj, c0033q0);
        if (c1753nMo3953s != null) {
            C2695c.f8598g.set(c2695c, null);
        }
        return c1753nMo3953s;
    }

    @Override // p160f3.InterfaceC2133f
    /* JADX INFO: renamed from: v */
    public final void mo3954v(Object obj) {
        this.f8596d.mo3954v(obj);
    }
}
