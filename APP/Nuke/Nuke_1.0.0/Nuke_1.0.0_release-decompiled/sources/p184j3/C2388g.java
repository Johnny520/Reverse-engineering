package p184j3;

import p056K2.C0891q;
import p074O2.InterfaceC1051i;
import p079P2.EnumC1152a;
import p084Q2.AbstractC1178c;
import p172h3.EnumC2241a;
import p178i3.InterfaceC2323d;
import p178i3.InterfaceC2324e;

/* JADX INFO: renamed from: j3.g */
/* JADX INFO: loaded from: classes.dex */
public final class C2388g extends AbstractC2387f {
    @Override // p184j3.AbstractC2387f
    /* JADX INFO: renamed from: a */
    public final AbstractC2387f mo4237a(InterfaceC1051i interfaceC1051i, int i5, EnumC2241a enumC2241a) {
        return new C2388g(this.f7738g, interfaceC1051i, i5, enumC2241a);
    }

    @Override // p184j3.AbstractC2387f
    /* JADX INFO: renamed from: b */
    public final InterfaceC2323d mo4238b() {
        return this.f7738g;
    }

    @Override // p184j3.AbstractC2387f
    /* JADX INFO: renamed from: c */
    public final Object mo4239c(InterfaceC2324e interfaceC2324e, AbstractC1178c abstractC1178c) {
        Object objMo3119i = this.f7738g.mo3119i(interfaceC2324e, abstractC1178c);
        return objMo3119i == EnumC1152a.f3788d ? objMo3119i : C0891q.f2780a;
    }
}
