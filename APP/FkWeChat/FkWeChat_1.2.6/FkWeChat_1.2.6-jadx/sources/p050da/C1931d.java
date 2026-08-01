package p050da;

import gb.InterfaceC2716u1;
import p010a9.InterfaceC0173a;
import p081fa.InterfaceC2382j;
import p229p9.InterfaceC6018l1;

/* JADX INFO: renamed from: da.d */
/* JADX INFO: loaded from: classes2.dex */
public class C1931d implements InterfaceC0173a {

    /* JADX INFO: renamed from: q */
    public final C1932e f5395q;

    /* JADX INFO: renamed from: r */
    public final InterfaceC6018l1 f5396r;

    /* JADX INFO: renamed from: s */
    public final C1928a f5397s;

    /* JADX INFO: renamed from: t */
    public final InterfaceC2716u1 f5398t;

    /* JADX INFO: renamed from: u */
    public final InterfaceC2382j f5399u;

    public C1931d(C1932e c1932e, InterfaceC6018l1 interfaceC6018l1, C1928a c1928a, InterfaceC2716u1 interfaceC2716u1, InterfaceC2382j interfaceC2382j) {
        this.f5395q = c1932e;
        this.f5396r = interfaceC6018l1;
        this.f5397s = c1928a;
        this.f5398t = interfaceC2716u1;
        this.f5399u = interfaceC2382j;
    }

    @Override // p010a9.InterfaceC0173a
    public Object invoke() {
        return C1932e.m7000e(this.f5395q, this.f5396r, this.f5397s, this.f5398t, this.f5399u);
    }
}
