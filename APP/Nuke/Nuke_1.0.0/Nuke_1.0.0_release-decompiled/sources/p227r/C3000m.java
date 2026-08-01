package p227r;

import p034G.C0466k;
import p056K2.C0891q;
import p079P2.EnumC1152a;
import p084Q2.AbstractC1178c;
import p095T.AbstractC1385s;
import p095T.C1366i0;
import p112W2.InterfaceC1601c;
import p112W2.InterfaceC1603e;
import p160f3.AbstractC2162v;
import p216p.C2828V;
import p216p.EnumC2824Q;

/* JADX INFO: renamed from: r.m */
/* JADX INFO: loaded from: classes.dex */
public final class C3000m implements InterfaceC3017u0 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC1601c f9493a;

    /* JADX INFO: renamed from: b */
    public final C2998l f9494b = new C2998l(this);

    /* JADX INFO: renamed from: c */
    public final C2828V f9495c = new C2828V();

    /* JADX INFO: renamed from: d */
    public final C1366i0 f9496d;

    /* JADX INFO: renamed from: e */
    public final C1366i0 f9497e;

    /* JADX INFO: renamed from: f */
    public final C1366i0 f9498f;

    public C3000m(InterfaceC1601c interfaceC1601c) {
        this.f9493a = interfaceC1601c;
        Boolean bool = Boolean.FALSE;
        this.f9496d = AbstractC1385s.m2629s(bool);
        this.f9497e = AbstractC1385s.m2629s(bool);
        this.f9498f = AbstractC1385s.m2629s(bool);
    }

    @Override // p227r.InterfaceC3017u0
    /* JADX INFO: renamed from: b */
    public final boolean mo11b() {
        return ((Boolean) this.f9496d.getValue()).booleanValue();
    }

    @Override // p227r.InterfaceC3017u0
    /* JADX INFO: renamed from: c */
    public final Object mo12c(EnumC2824Q enumC2824Q, InterfaceC1603e interfaceC1603e, AbstractC1178c abstractC1178c) {
        Object objM3982d = AbstractC2162v.m3982d(new C0466k(this, enumC2824Q, interfaceC1603e, null, 11), abstractC1178c);
        return objM3982d == EnumC1152a.f3788d ? objM3982d : C0891q.f2780a;
    }

    @Override // p227r.InterfaceC3017u0
    /* JADX INFO: renamed from: e */
    public final float mo14e(float f2) {
        return ((Number) this.f9493a.mo1h(Float.valueOf(f2))).floatValue();
    }
}
