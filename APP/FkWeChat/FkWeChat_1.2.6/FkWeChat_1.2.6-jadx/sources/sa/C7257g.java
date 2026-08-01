package sa;

import gb.InterfaceC2716u1;
import java.util.Collection;
import p010a9.InterfaceC0188p;
import p024b9.AbstractC1061t;
import p112hb.AbstractC2949h;
import p185m8.AbstractC5081g0;
import p229p9.InterfaceC5983a;
import p229p9.InterfaceC5986b;
import p229p9.InterfaceC5993d0;
import p229p9.InterfaceC5995e;
import p229p9.InterfaceC6003g1;
import p229p9.InterfaceC6004h;
import p229p9.InterfaceC6018l1;
import p229p9.InterfaceC6019m;
import p229p9.InterfaceC6023n0;
import sa.C7265o;

/* JADX INFO: renamed from: sa.g */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7257g {

    /* JADX INFO: renamed from: a */
    public static final C7257g f24129a = new C7257g();

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ boolean m28703f(C7257g c7257g, InterfaceC5983a interfaceC5983a, InterfaceC5983a interfaceC5983a2, boolean z10, boolean z11, boolean z12, AbstractC2949h abstractC2949h, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            z11 = true;
        }
        boolean z13 = z11;
        if ((i10 & 16) != 0) {
            z12 = false;
        }
        return c7257g.m28710e(interfaceC5983a, interfaceC5983a2, z10, z13, z12, abstractC2949h);
    }

    /* JADX INFO: renamed from: g */
    public static final boolean m28704g(InterfaceC6019m interfaceC6019m, InterfaceC6019m interfaceC6019m2) {
        return false;
    }

    /* JADX INFO: renamed from: h */
    public static final boolean m28705h(boolean z10, InterfaceC5983a interfaceC5983a, InterfaceC5983a interfaceC5983a2, InterfaceC2716u1 interfaceC2716u1, InterfaceC2716u1 interfaceC2716u12) {
        interfaceC2716u1.getClass();
        interfaceC2716u12.getClass();
        if (AbstractC1061t.m3842c(interfaceC2716u1, interfaceC2716u12)) {
            return true;
        }
        InterfaceC6004h interfaceC6004hMo5602u = interfaceC2716u1.mo5602u();
        InterfaceC6004h interfaceC6004hMo5602u2 = interfaceC2716u12.mo5602u();
        if ((interfaceC6004hMo5602u instanceof InterfaceC6018l1) && (interfaceC6004hMo5602u2 instanceof InterfaceC6018l1)) {
            return f24129a.m28714n((InterfaceC6018l1) interfaceC6004hMo5602u, (InterfaceC6018l1) interfaceC6004hMo5602u2, z10, new C7256f(interfaceC5983a, interfaceC5983a2));
        }
        return false;
    }

    /* JADX INFO: renamed from: i */
    public static final boolean m28706i(InterfaceC5983a interfaceC5983a, InterfaceC5983a interfaceC5983a2, InterfaceC6019m interfaceC6019m, InterfaceC6019m interfaceC6019m2) {
        return AbstractC1061t.m3842c(interfaceC6019m, interfaceC5983a) && AbstractC1061t.m3842c(interfaceC6019m2, interfaceC5983a2);
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ boolean m28707l(C7257g c7257g, InterfaceC6019m interfaceC6019m, InterfaceC6019m interfaceC6019m2, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            z11 = true;
        }
        return c7257g.m28712k(interfaceC6019m, interfaceC6019m2, z10, z11);
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ boolean m28708o(C7257g c7257g, InterfaceC6018l1 interfaceC6018l1, InterfaceC6018l1 interfaceC6018l12, boolean z10, InterfaceC0188p interfaceC0188p, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            interfaceC0188p = C7253c.f24122q;
        }
        return c7257g.m28714n(interfaceC6018l1, interfaceC6018l12, z10, interfaceC0188p);
    }

    /* JADX INFO: renamed from: p */
    public static final boolean m28709p(InterfaceC6019m interfaceC6019m, InterfaceC6019m interfaceC6019m2) {
        return false;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m28710e(InterfaceC5983a interfaceC5983a, InterfaceC5983a interfaceC5983a2, boolean z10, boolean z11, boolean z12, AbstractC2949h abstractC2949h) {
        interfaceC5983a.getClass();
        interfaceC5983a2.getClass();
        abstractC2949h.getClass();
        if (AbstractC1061t.m3842c(interfaceC5983a, interfaceC5983a2)) {
            return true;
        }
        if (!AbstractC1061t.m3842c(interfaceC5983a.getName(), interfaceC5983a2.getName())) {
            return false;
        }
        if (z11 && (interfaceC5983a instanceof InterfaceC5993d0) && (interfaceC5983a2 instanceof InterfaceC5993d0) && ((InterfaceC5993d0) interfaceC5983a).mo5576R() != ((InterfaceC5993d0) interfaceC5983a2).mo5576R()) {
            return false;
        }
        if ((AbstractC1061t.m3842c(interfaceC5983a.mo7443b(), interfaceC5983a2.mo7443b()) && (!z10 || !AbstractC1061t.m3842c(m28716r(interfaceC5983a), m28716r(interfaceC5983a2)))) || AbstractC7259i.m28739E(interfaceC5983a) || AbstractC7259i.m28739E(interfaceC5983a2) || !m28715q(interfaceC5983a, interfaceC5983a2, C7254d.f24123q, z10)) {
            return false;
        }
        C7265o c7265oM28810i = C7265o.m28810i(abstractC2949h, new C7255e(z10, interfaceC5983a, interfaceC5983a2));
        c7265oM28810i.getClass();
        C7265o.i.a aVarM28842c = c7265oM28810i.m28826E(interfaceC5983a, interfaceC5983a2, null, !z12).m28842c();
        C7265o.i.a aVar = C7265o.i.a.OVERRIDABLE;
        return aVarM28842c == aVar && c7265oM28810i.m28826E(interfaceC5983a2, interfaceC5983a, null, z12 ^ true).m28842c() == aVar;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m28711j(InterfaceC5995e interfaceC5995e, InterfaceC5995e interfaceC5995e2) {
        return AbstractC1061t.m3842c(interfaceC5995e.mo5591o(), interfaceC5995e2.mo5591o());
    }

    /* JADX INFO: renamed from: k */
    public final boolean m28712k(InterfaceC6019m interfaceC6019m, InterfaceC6019m interfaceC6019m2, boolean z10, boolean z11) {
        return ((interfaceC6019m instanceof InterfaceC5995e) && (interfaceC6019m2 instanceof InterfaceC5995e)) ? m28711j((InterfaceC5995e) interfaceC6019m, (InterfaceC5995e) interfaceC6019m2) : ((interfaceC6019m instanceof InterfaceC6018l1) && (interfaceC6019m2 instanceof InterfaceC6018l1)) ? m28708o(this, (InterfaceC6018l1) interfaceC6019m, (InterfaceC6018l1) interfaceC6019m2, z10, null, 8, null) : ((interfaceC6019m instanceof InterfaceC5983a) && (interfaceC6019m2 instanceof InterfaceC5983a)) ? m28703f(this, (InterfaceC5983a) interfaceC6019m, (InterfaceC5983a) interfaceC6019m2, z10, z11, false, AbstractC2949h.a.f7784a, 16, null) : ((interfaceC6019m instanceof InterfaceC6023n0) && (interfaceC6019m2 instanceof InterfaceC6023n0)) ? AbstractC1061t.m3842c(((InterfaceC6023n0) interfaceC6019m).mo24031d(), ((InterfaceC6023n0) interfaceC6019m2).mo24031d()) : AbstractC1061t.m3842c(interfaceC6019m, interfaceC6019m2);
    }

    /* JADX INFO: renamed from: m */
    public final boolean m28713m(InterfaceC6018l1 interfaceC6018l1, InterfaceC6018l1 interfaceC6018l12, boolean z10) {
        interfaceC6018l1.getClass();
        interfaceC6018l12.getClass();
        return m28708o(this, interfaceC6018l1, interfaceC6018l12, z10, null, 8, null);
    }

    /* JADX INFO: renamed from: n */
    public final boolean m28714n(InterfaceC6018l1 interfaceC6018l1, InterfaceC6018l1 interfaceC6018l12, boolean z10, InterfaceC0188p interfaceC0188p) {
        interfaceC6018l1.getClass();
        interfaceC6018l12.getClass();
        interfaceC0188p.getClass();
        if (AbstractC1061t.m3842c(interfaceC6018l1, interfaceC6018l12)) {
            return true;
        }
        return !AbstractC1061t.m3842c(interfaceC6018l1.mo7443b(), interfaceC6018l12.mo7443b()) && m28715q(interfaceC6018l1, interfaceC6018l12, interfaceC0188p, z10) && interfaceC6018l1.getIndex() == interfaceC6018l12.getIndex();
    }

    /* JADX INFO: renamed from: q */
    public final boolean m28715q(InterfaceC6019m interfaceC6019m, InterfaceC6019m interfaceC6019m2, InterfaceC0188p interfaceC0188p, boolean z10) {
        InterfaceC6019m interfaceC6019mMo7443b = interfaceC6019m.mo7443b();
        InterfaceC6019m interfaceC6019mMo7443b2 = interfaceC6019m2.mo7443b();
        return ((interfaceC6019mMo7443b instanceof InterfaceC5986b) || (interfaceC6019mMo7443b2 instanceof InterfaceC5986b)) ? ((Boolean) interfaceC0188p.invoke(interfaceC6019mMo7443b, interfaceC6019mMo7443b2)).booleanValue() : m28707l(this, interfaceC6019mMo7443b, interfaceC6019mMo7443b2, z10, false, 8, null);
    }

    /* JADX INFO: renamed from: r */
    public final InterfaceC6003g1 m28716r(InterfaceC5983a interfaceC5983a) {
        while (interfaceC5983a instanceof InterfaceC5986b) {
            InterfaceC5986b interfaceC5986b = (InterfaceC5986b) interfaceC5983a;
            if (interfaceC5986b.mo12678j() != InterfaceC5986b.a.FAKE_OVERRIDE) {
                break;
            }
            Collection collectionMo12674e = interfaceC5986b.mo12674e();
            collectionMo12674e.getClass();
            interfaceC5983a = (InterfaceC5986b) AbstractC5081g0.m20538J0(collectionMo12674e);
            if (interfaceC5983a == null) {
                return null;
            }
        }
        return interfaceC5983a.getSource();
    }
}
