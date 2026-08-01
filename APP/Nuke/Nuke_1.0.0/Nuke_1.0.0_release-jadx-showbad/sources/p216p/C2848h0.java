package p216p;

import p000A.C0038T0;
import p000A.C0049a;
import p056K2.C0891q;
import p079P2.EnumC1152a;
import p084Q2.AbstractC1178c;
import p092S0.C1287y;
import p095T.AbstractC1385s;
import p095T.C1311F;
import p095T.C1360f0;
import p112W2.InterfaceC1599a;
import p112W2.InterfaceC1603e;
import p203n.C2654f0;
import p227r.C3000m;
import p227r.InterfaceC3017u0;
import p232s.C3162i;

/* JADX INFO: renamed from: p.h0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2848h0 implements InterfaceC3017u0 {

    /* JADX INFO: renamed from: j */
    public static final C0038T0 f8951j;

    /* JADX INFO: renamed from: a */
    public final C1360f0 f8952a;

    /* JADX INFO: renamed from: f */
    public float f8957f;

    /* JADX INFO: renamed from: h */
    public final C1311F f8959h;

    /* JADX INFO: renamed from: i */
    public final C1311F f8960i;

    /* JADX INFO: renamed from: b */
    public final C1360f0 f8953b = new C1360f0(0);

    /* JADX INFO: renamed from: c */
    public final C1360f0 f8954c = new C1360f0(0);

    /* JADX INFO: renamed from: d */
    public final C3162i f8955d = new C3162i();

    /* JADX INFO: renamed from: e */
    public final C1360f0 f8956e = new C1360f0(Integer.MAX_VALUE);

    /* JADX INFO: renamed from: g */
    public final C3000m f8958g = new C3000m(new C0049a(25, this));

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        int i5 = 29;
        f8951j = new C0038T0(i5, new C1287y((byte) 0, 23), new C2654f0(19));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2848h0(int i5) {
        this.f8952a = new C1360f0(i5);
        final int i6 = 0;
        this.f8959h = AbstractC1385s.m2624n(new InterfaceC1599a(this) { // from class: p.g0

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ C2848h0 f8941e;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.f8941e = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // p112W2.InterfaceC1599a
            /* JADX INFO: renamed from: a */
            public final Object mo6a() {
                switch (i6) {
                    case 0:
                        C2848h0 c2848h0 = this.f8941e;
                        return Boolean.valueOf(c2848h0.f8952a.m2509g() < c2848h0.f8956e.m2509g());
                    default:
                        return Boolean.valueOf(this.f8941e.f8952a.m2509g() > 0);
                }
            }
        });
        final int i7 = 1;
        this.f8960i = AbstractC1385s.m2624n(new InterfaceC1599a(this) { // from class: p.g0

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ C2848h0 f8941e;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.f8941e = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // p112W2.InterfaceC1599a
            /* JADX INFO: renamed from: a */
            public final Object mo6a() {
                switch (i7) {
                    case 0:
                        C2848h0 c2848h0 = this.f8941e;
                        return Boolean.valueOf(c2848h0.f8952a.m2509g() < c2848h0.f8956e.m2509g());
                    default:
                        return Boolean.valueOf(this.f8941e.f8952a.m2509g() > 0);
                }
            }
        });
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p227r.InterfaceC3017u0
    /* JADX INFO: renamed from: a */
    public final boolean mo10a() {
        return ((Boolean) this.f8960i.getValue()).booleanValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p227r.InterfaceC3017u0
    /* JADX INFO: renamed from: b */
    public final boolean mo11b() {
        return this.f8958g.mo11b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p227r.InterfaceC3017u0
    /* JADX INFO: renamed from: c */
    public final Object mo12c(EnumC2824Q enumC2824Q, InterfaceC1603e interfaceC1603e, AbstractC1178c abstractC1178c) {
        Object objMo12c = this.f8958g.mo12c(enumC2824Q, interfaceC1603e, abstractC1178c);
        return objMo12c == EnumC1152a.f3788d ? objMo12c : C0891q.f2780a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p227r.InterfaceC3017u0
    /* JADX INFO: renamed from: d */
    public final boolean mo13d() {
        return ((Boolean) this.f8959h.getValue()).booleanValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p227r.InterfaceC3017u0
    /* JADX INFO: renamed from: e */
    public final float mo14e(float f2) {
        return this.f8958g.mo14e(f2);
    }
}
