package p178i3;

import p074O2.InterfaceC1046d;
import p074O2.InterfaceC1051i;
import p079P2.EnumC1152a;
import p172h3.EnumC2241a;
import p184j3.C2388g;
import p184j3.InterfaceC2394m;

/* JADX INFO: renamed from: i3.p */
/* JADX INFO: loaded from: classes.dex */
public final class C2335p implements InterfaceC2316A, InterfaceC2323d, InterfaceC2394m {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C2318C f7605d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2335p(C2318C c2318c) {
        this.f7605d = c2318c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p178i3.InterfaceC2316A
    public final Object getValue() {
        return this.f7605d.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p178i3.InterfaceC2323d
    /* JADX INFO: renamed from: i */
    public final Object mo3119i(InterfaceC2324e interfaceC2324e, InterfaceC1046d interfaceC1046d) {
        this.f7605d.mo3119i(interfaceC2324e, interfaceC1046d);
        return EnumC1152a.f3788d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p184j3.InterfaceC2394m
    /* JADX INFO: renamed from: n */
    public final InterfaceC2323d mo4148n(InterfaceC1051i interfaceC1051i, int i5, EnumC2241a enumC2241a) {
        return ((((i5 < 0 || i5 >= 2) && i5 != -2) || enumC2241a != EnumC2241a.f7352e) && !((i5 == 0 || i5 == -3) && enumC2241a == EnumC2241a.f7351d)) ? new C2388g(this, interfaceC1051i, i5, enumC2241a) : this;
    }
}
