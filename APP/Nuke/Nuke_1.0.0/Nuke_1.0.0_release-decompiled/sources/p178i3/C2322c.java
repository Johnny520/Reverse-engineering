package p178i3;

import p056K2.C0891q;
import p058L.C0906H;
import p074O2.InterfaceC1046d;
import p079P2.EnumC1152a;
import p117X2.C1675t;
import p184j3.AbstractC2384c;

/* JADX INFO: renamed from: i3.c */
/* JADX INFO: loaded from: classes.dex */
public final class C2322c implements InterfaceC2323d {

    /* JADX INFO: renamed from: d */
    public final InterfaceC2323d f7573d;

    public C2322c(InterfaceC2323d interfaceC2323d) {
        this.f7573d = interfaceC2323d;
    }

    @Override // p178i3.InterfaceC2323d
    /* JADX INFO: renamed from: i */
    public final Object mo3119i(InterfaceC2324e interfaceC2324e, InterfaceC1046d interfaceC1046d) {
        C1675t c1675t = new C1675t();
        c1675t.f5710e = AbstractC2384c.f7730b;
        Object objMo3119i = this.f7573d.mo3119i(new C0906H(this, c1675t, interfaceC2324e), interfaceC1046d);
        return objMo3119i == EnumC1152a.f3788d ? objMo3119i : C0891q.f2780a;
    }
}
