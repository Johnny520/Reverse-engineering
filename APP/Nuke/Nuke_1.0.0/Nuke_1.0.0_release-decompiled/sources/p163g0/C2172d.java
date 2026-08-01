package p163g0;

import java.util.List;
import p074O2.InterfaceC1049g;
import p074O2.InterfaceC1050h;
import p074O2.InterfaceC1051i;
import p095T.C1383r;
import p100U.InterfaceC1438K;
import p110W0.C1577b;
import p112W2.InterfaceC1603e;
import p128a.AbstractC1785a;

/* JADX INFO: renamed from: g0.d */
/* JADX INFO: loaded from: classes.dex */
public final class C2172d implements InterfaceC1438K, InterfaceC1049g {

    /* JADX INFO: renamed from: e */
    public static final C1577b f7131e = new C1577b(24);

    /* JADX INFO: renamed from: d */
    public final C1383r f7132d;

    public C2172d(C1383r c1383r) {
        this.f7132d = c1383r;
    }

    @Override // p074O2.InterfaceC1051i
    /* JADX INFO: renamed from: A */
    public final Object mo1165A(InterfaceC1603e interfaceC1603e, Object obj) {
        return interfaceC1603e.mo0g(obj, this);
    }

    @Override // p074O2.InterfaceC1051i
    /* JADX INFO: renamed from: C */
    public final /* bridge */ InterfaceC1049g mo1166C(InterfaceC1050h interfaceC1050h) {
        return AbstractC1785a.m3250j(this, interfaceC1050h);
    }

    @Override // p100U.InterfaceC1438K
    /* JADX INFO: renamed from: f */
    public final List mo37f(Integer num) {
        return this.f7132d.m2551E();
    }

    @Override // p074O2.InterfaceC1049g
    public final InterfaceC1050h getKey() {
        return f7131e;
    }

    @Override // p074O2.InterfaceC1051i
    /* JADX INFO: renamed from: j */
    public final /* bridge */ InterfaceC1051i mo1167j(InterfaceC1050h interfaceC1050h) {
        return AbstractC1785a.m3253n(this, interfaceC1050h);
    }

    @Override // p074O2.InterfaceC1051i
    /* JADX INFO: renamed from: m */
    public final /* bridge */ InterfaceC1051i mo1168m(InterfaceC1051i interfaceC1051i) {
        return AbstractC1785a.m3254o(this, interfaceC1051i);
    }
}
