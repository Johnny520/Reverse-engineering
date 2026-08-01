package p176i1;

import java.util.List;
import p029F0.InterfaceC0377O;
import p029F0.InterfaceC0378P;
import p029F0.InterfaceC0379Q;
import p061L2.C0982v;
import p153e1.EnumC2017m;

/* JADX INFO: renamed from: i1.k */
/* JADX INFO: loaded from: classes.dex */
public final class C2295k implements InterfaceC0377O {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C2310z f7479a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ EnumC2017m f7480b;

    public C2295k(C2310z c2310z, EnumC2017m enumC2017m) {
        this.f7479a = c2310z;
        this.f7480b = enumC2017m;
    }

    @Override // p029F0.InterfaceC0377O
    /* JADX INFO: renamed from: i */
    public final InterfaceC0378P mo16i(InterfaceC0379Q interfaceC0379Q, List list, long j5) {
        this.f7479a.setParentLayoutDirection(this.f7480b);
        return interfaceC0379Q.mo604f0(0, 0, C0982v.f3048d, C2287c.f7451h);
    }
}
