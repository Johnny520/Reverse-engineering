package p184j3;

import p056K2.C0891q;
import p074O2.InterfaceC1051i;
import p079P2.EnumC1152a;
import p084Q2.AbstractC1178c;
import p084Q2.AbstractC1184i;
import p112W2.InterfaceC1604f;
import p160f3.AbstractC2162v;
import p172h3.EnumC2241a;
import p178i3.InterfaceC2323d;
import p178i3.InterfaceC2324e;

/* JADX INFO: renamed from: j3.j */
/* JADX INFO: loaded from: classes.dex */
public final class C2391j extends AbstractC2387f {

    /* JADX INFO: renamed from: h */
    public final AbstractC1184i f7749h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: W2.f */
    /* JADX WARN: Multi-variable type inference failed */
    public C2391j(InterfaceC1604f interfaceC1604f, InterfaceC2323d interfaceC2323d, InterfaceC1051i interfaceC1051i, int i5, EnumC2241a enumC2241a) {
        super(interfaceC2323d, interfaceC1051i, i5, enumC2241a);
        this.f7749h = (AbstractC1184i) interfaceC1604f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r1v0, types: [Q2.i, W2.f] */
    @Override // p184j3.AbstractC2387f
    /* JADX INFO: renamed from: a */
    public final AbstractC2387f mo4237a(InterfaceC1051i interfaceC1051i, int i5, EnumC2241a enumC2241a) {
        return new C2391j(this.f7749h, this.f7738g, interfaceC1051i, i5, enumC2241a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p184j3.AbstractC2387f
    /* JADX INFO: renamed from: c */
    public final Object mo4239c(InterfaceC2324e interfaceC2324e, AbstractC1178c abstractC1178c) {
        Object objM3982d = AbstractC2162v.m3982d(new C2389h(this, interfaceC2324e, null), abstractC1178c);
        return objM3982d == EnumC1152a.f3788d ? objM3982d : C0891q.f2780a;
    }
}
