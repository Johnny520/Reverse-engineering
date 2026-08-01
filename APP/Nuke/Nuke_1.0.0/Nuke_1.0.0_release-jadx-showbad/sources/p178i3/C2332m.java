package p178i3;

import p056K2.C0891q;
import p074O2.InterfaceC1046d;
import p084Q2.AbstractC1184i;
import p112W2.InterfaceC1603e;
import p127Z2.AbstractC1784a;

/* JADX INFO: renamed from: i3.m */
/* JADX INFO: loaded from: classes.dex */
public final class C2332m extends AbstractC1184i implements InterfaceC1603e {

    /* JADX INFO: renamed from: h */
    public /* synthetic */ int f7604h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p112W2.InterfaceC1603e
    /* JADX INFO: renamed from: g */
    public final Object mo0g(Object obj, Object obj2) {
        return ((C2332m) mo7n((InterfaceC1046d) obj2, Integer.valueOf(((Number) obj).intValue()))).mo8p(C0891q.f2780a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p084Q2.AbstractC1176a
    /* JADX INFO: renamed from: n */
    public final InterfaceC1046d mo7n(InterfaceC1046d interfaceC1046d, Object obj) {
        C2332m c2332m = new C2332m(2, interfaceC1046d);
        c2332m.f7604h = ((Number) obj).intValue();
        return c2332m;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p084Q2.AbstractC1176a
    /* JADX INFO: renamed from: p */
    public final Object mo8p(Object obj) {
        AbstractC1784a.m3205S(obj);
        return Boolean.valueOf(this.f7604h > 0);
    }
}
