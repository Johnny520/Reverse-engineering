package p000A;

import p084Q2.AbstractC1178c;
import p095T.AbstractC1385s;
import p095T.C1311F;
import p112W2.InterfaceC1599a;
import p112W2.InterfaceC1603e;
import p216p.EnumC2824Q;
import p227r.InterfaceC3017u0;

/* JADX INFO: renamed from: A.M0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0025M0 implements InterfaceC3017u0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC3017u0 f129a;

    /* JADX INFO: renamed from: b */
    public final C1311F f130b;

    /* JADX INFO: renamed from: c */
    public final C1311F f131c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0025M0(InterfaceC3017u0 interfaceC3017u0, final C0029O0 c0029o0) {
        this.f129a = interfaceC3017u0;
        final int i5 = 0;
        this.f130b = AbstractC1385s.m2624n(new InterfaceC1599a() { // from class: A.L0
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // p112W2.InterfaceC1599a
            /* JADX INFO: renamed from: a */
            public final Object mo6a() {
                switch (i5) {
                    case 0:
                        C0029O0 c0029o02 = c0029o0;
                        return Boolean.valueOf(c0029o02.f142a.m2507g() < c0029o02.f143b.m2507g());
                    default:
                        return Boolean.valueOf(c0029o0.f142a.m2507g() > 0.0f);
                }
            }
        });
        final int i6 = 1;
        this.f131c = AbstractC1385s.m2624n(new InterfaceC1599a() { // from class: A.L0
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // p112W2.InterfaceC1599a
            /* JADX INFO: renamed from: a */
            public final Object mo6a() {
                switch (i6) {
                    case 0:
                        C0029O0 c0029o02 = c0029o0;
                        return Boolean.valueOf(c0029o02.f142a.m2507g() < c0029o02.f143b.m2507g());
                    default:
                        return Boolean.valueOf(c0029o0.f142a.m2507g() > 0.0f);
                }
            }
        });
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p227r.InterfaceC3017u0
    /* JADX INFO: renamed from: a */
    public final boolean mo10a() {
        return ((Boolean) this.f131c.getValue()).booleanValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p227r.InterfaceC3017u0
    /* JADX INFO: renamed from: b */
    public final boolean mo11b() {
        return this.f129a.mo11b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p227r.InterfaceC3017u0
    /* JADX INFO: renamed from: c */
    public final Object mo12c(EnumC2824Q enumC2824Q, InterfaceC1603e interfaceC1603e, AbstractC1178c abstractC1178c) {
        return this.f129a.mo12c(enumC2824Q, interfaceC1603e, abstractC1178c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p227r.InterfaceC3017u0
    /* JADX INFO: renamed from: d */
    public final boolean mo13d() {
        return ((Boolean) this.f130b.getValue()).booleanValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p227r.InterfaceC3017u0
    /* JADX INFO: renamed from: e */
    public final float mo14e(float f2) {
        return this.f129a.mo14e(f2);
    }
}
