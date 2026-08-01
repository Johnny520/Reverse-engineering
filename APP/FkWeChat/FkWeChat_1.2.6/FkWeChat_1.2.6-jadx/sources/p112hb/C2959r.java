package p112hb;

import gb.AbstractC2687l2;
import gb.AbstractC2706r0;
import gb.C2664g;
import gb.C2713t1;
import p024b9.AbstractC1043k;
import p112hb.AbstractC2948g;
import sa.C7265o;

/* JADX INFO: renamed from: hb.r */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2959r implements InterfaceC2958q {

    /* JADX INFO: renamed from: c */
    public final AbstractC2949h f7805c;

    /* JADX INFO: renamed from: d */
    public final AbstractC2948g f7806d;

    /* JADX INFO: renamed from: e */
    public final C7265o f7807e;

    public C2959r(AbstractC2949h abstractC2949h, AbstractC2948g abstractC2948g) {
        abstractC2949h.getClass();
        abstractC2948g.getClass();
        this.f7805c = abstractC2949h;
        this.f7806d = abstractC2948g;
        C7265o c7265oM28813m = C7265o.m28813m(mo10879c());
        c7265oM28813m.getClass();
        this.f7807e = c7265oM28813m;
    }

    @Override // p112hb.InterfaceC2958q
    /* JADX INFO: renamed from: a */
    public C7265o mo10878a() {
        return this.f7807e;
    }

    @Override // p112hb.InterfaceC2947f
    /* JADX INFO: renamed from: b */
    public boolean mo10840b(AbstractC2706r0 abstractC2706r0, AbstractC2706r0 abstractC2706r02) {
        abstractC2706r0.getClass();
        abstractC2706r02.getClass();
        return m10883g(AbstractC2940a.m10739b(true, false, null, m10882f(), mo10879c(), 6, null), abstractC2706r0.mo9510W0(), abstractC2706r02.mo9510W0());
    }

    @Override // p112hb.InterfaceC2958q
    /* JADX INFO: renamed from: c */
    public AbstractC2949h mo10879c() {
        return this.f7805c;
    }

    @Override // p112hb.InterfaceC2947f
    /* JADX INFO: renamed from: d */
    public boolean mo10841d(AbstractC2706r0 abstractC2706r0, AbstractC2706r0 abstractC2706r02) {
        abstractC2706r0.getClass();
        abstractC2706r02.getClass();
        return m10881e(AbstractC2940a.m10739b(false, false, null, m10882f(), mo10879c(), 6, null), abstractC2706r0.mo9510W0(), abstractC2706r02.mo9510W0());
    }

    /* JADX INFO: renamed from: e */
    public final boolean m10881e(C2713t1 c2713t1, AbstractC2687l2 abstractC2687l2, AbstractC2687l2 abstractC2687l22) {
        c2713t1.getClass();
        abstractC2687l2.getClass();
        abstractC2687l22.getClass();
        return C2664g.f6996a.m9417m(c2713t1, abstractC2687l2, abstractC2687l22);
    }

    /* JADX INFO: renamed from: f */
    public AbstractC2948g m10882f() {
        return this.f7806d;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m10883g(C2713t1 c2713t1, AbstractC2687l2 abstractC2687l2, AbstractC2687l2 abstractC2687l22) {
        c2713t1.getClass();
        abstractC2687l2.getClass();
        abstractC2687l22.getClass();
        return C2664g.m9407v(C2664g.f6996a, c2713t1, abstractC2687l2, abstractC2687l22, false, 8, null);
    }

    public /* synthetic */ C2959r(AbstractC2949h abstractC2949h, AbstractC2948g abstractC2948g, int i10, AbstractC1043k abstractC1043k) {
        this(abstractC2949h, (i10 & 2) != 0 ? AbstractC2948g.a.f7783a : abstractC2948g);
    }
}
