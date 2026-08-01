package p184j3;

import p056K2.C0891q;
import p074O2.InterfaceC1046d;
import p079P2.EnumC1152a;
import p172h3.InterfaceC2258r;
import p178i3.InterfaceC2324e;

/* JADX INFO: renamed from: j3.s */
/* JADX INFO: loaded from: classes.dex */
public final class C2400s implements InterfaceC2324e {

    /* JADX INFO: renamed from: d */
    public final InterfaceC2258r f7762d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2400s(InterfaceC2258r interfaceC2258r) {
        this.f7762d = interfaceC2258r;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p178i3.InterfaceC2324e
    /* JADX INFO: renamed from: c */
    public final Object mo9c(Object obj, InterfaceC1046d interfaceC1046d) {
        Object objMo4079a = this.f7762d.mo4079a(interfaceC1046d, obj);
        return objMo4079a == EnumC1152a.f3788d ? objMo4079a : C0891q.f2780a;
    }
}
