package tg;

import gg.C1425u;
import p100h0.C1534l0;
import p276sf.C3967n;
import p352xf.EnumC5799a;
import ug.AbstractC4338c;
import wf.InterfaceC5557c;

/* JADX INFO: renamed from: tg.c */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4184c implements InterfaceC4186d {

    /* JADX INFO: renamed from: g */
    public final InterfaceC4186d f13735g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4184c(InterfaceC4186d interfaceC4186d) {
        this.f13735g = interfaceC4186d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // tg.InterfaceC4186d
    /* JADX INFO: renamed from: b */
    public final Object mo6025b(InterfaceC4187e interfaceC4187e, InterfaceC5557c interfaceC5557c) {
        C1425u c1425u = new C1425u();
        c1425u.f4738g = AbstractC4338c.f14500b;
        Object objMo6025b = this.f13735g.mo6025b(new C1534l0(this, c1425u, interfaceC4187e), interfaceC5557c);
        return objMo6025b == EnumC5799a.f23547g ? objMo6025b : C3967n.f12976a;
    }
}
