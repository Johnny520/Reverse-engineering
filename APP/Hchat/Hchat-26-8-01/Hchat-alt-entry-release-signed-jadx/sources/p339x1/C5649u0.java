package p339x1;

import gg.AbstractC1417m;
import p069f.C0929d0;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p118i1.C1902b;
import p131j0.C2046b;
import p276sf.C3967n;
import p293u2.C4240j;
import p308v1.AbstractC4374a1;
import p357y1.ViewTreeObserverOnGlobalLayoutListenerC5934t;

/* JADX INFO: renamed from: x1.u0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5649u0 extends AbstractC1417m implements InterfaceC1220a {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f23009g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C5652v0 f23010h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5649u0(C5652v0 c5652v0, int i9) {
        super(0);
        this.f23009g = i9;
        this.f23010h = c5652v0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1220a
    public final Object invoke() {
        AbstractC4374a1 placementScope;
        switch (this.f23009g) {
            case 0:
                C5652v0 c5652v0 = this.f23010h;
                C5616j0 c5616j0 = c5652v0.f23029l;
                c5616j0.f22884i = 0;
                C2046b c2046bM10053y = c5616j0.f22876a.m10053y();
                Object[] objArr = c2046bM10053y.f6891g;
                int i9 = c2046bM10053y.f6893i;
                for (int i10 = 0; i10 < i9; i10++) {
                    C5652v0 c5652v02 = ((C5602f0) objArr[i10]).f22779M.f22891p;
                    c5652v02.f23031n = c5652v02.f23032o;
                    c5652v02.f23032o = Integer.MAX_VALUE;
                    c5652v02.f23043z = false;
                    if (c5652v02.f23035r == EnumC5594d0.f22744h) {
                        c5652v02.f23035r = EnumC5594d0.f22745i;
                    }
                }
                C5602f0 c5602f0 = c5616j0.f22876a;
                C5602f0 c5602f02 = c5616j0.f22876a;
                C2046b c2046bM10053y2 = c5602f0.m10053y();
                Object[] objArr2 = c2046bM10053y2.f6891g;
                int i11 = c2046bM10053y2.f6893i;
                for (int i12 = 0; i12 < i11; i12++) {
                    ((C5602f0) objArr2[i12]).f22779M.f22891p.f23014D.getClass();
                }
                if (c5652v0.mo9967A().f22924q) {
                    C0929d0 c0929d0 = (C0929d0) c5602f02.m10042n();
                    int i13 = ((C2046b) c0929d0.f2909h).f6893i;
                    for (int i14 = 0; i14 < i13; i14++) {
                        ((C5602f0) c0929d0.get(i14)).f22778L.f22717d.f22924q = true;
                    }
                }
                c5652v0.mo9967A().mo10091Z0().mo7600f();
                if (c5652v0.mo9967A().f22924q) {
                    C0929d0 c0929d02 = (C0929d0) c5602f02.m10042n();
                    int i15 = ((C2046b) c0929d02.f2909h).f6893i;
                    for (int i16 = 0; i16 < i15; i16++) {
                        ((C5602f0) c0929d02.get(i16)).f22778L.f22717d.f22924q = false;
                    }
                }
                C2046b c2046bM10053y3 = c5602f02.m10053y();
                Object[] objArr3 = c2046bM10053y3.f6891g;
                int i17 = c2046bM10053y3.f6893i;
                for (int i18 = 0; i18 < i17; i18++) {
                    C5602f0 c5602f03 = (C5602f0) objArr3[i18];
                    C5616j0 c5616j02 = c5602f03.f22779M;
                    if (c5616j02.f22891p.f23031n != c5602f03.m10050v()) {
                        c5602f02.m10017O();
                        c5602f02.m10005B();
                        if (c5602f03.m10050v() == Integer.MAX_VALUE) {
                            if (c5616j02.f22878c || AbstractC5618k.m10161q(c5602f03)) {
                                C5640r0 c5640r0 = c5616j02.f22892q;
                                c5640r0.getClass();
                                c5640r0.m10188K0(false);
                            }
                            c5616j02.f22891p.m10216M0();
                        }
                    }
                }
                C2046b c2046bM10053y4 = c5602f02.m10053y();
                Object[] objArr4 = c2046bM10053y4.f6891g;
                int i19 = c2046bM10053y4.f6893i;
                for (int i20 = 0; i20 < i19; i20++) {
                    C5606g0 c5606g0 = ((C5602f0) objArr4[i20]).f22779M.f22891p.f23014D;
                    c5606g0.getClass();
                    c5606g0.f22818c = false;
                }
                break;
            case 1:
                C5652v0 c5652v03 = this.f23010h;
                c5652v03.f23029l.m10125a().mo8831Q(c5652v03.f23018H);
                break;
            default:
                C5652v0 c5652v04 = this.f23010h;
                C5616j0 c5616j03 = c5652v04.f23029l;
                AbstractC5614i1 abstractC5614i1 = c5616j03.m10125a().f22870w;
                if (abstractC5614i1 == null || (placementScope = abstractC5614i1.f22925r) == null) {
                    placementScope = ((ViewTreeObserverOnGlobalLayoutListenerC5934t) AbstractC5613i0.m10067a(c5616j03.f22876a)).getPlacementScope();
                }
                InterfaceC1231l interfaceC1231l = c5652v04.f23023M;
                C1902b c1902b = c5652v04.f23024N;
                if (c1902b != null) {
                    AbstractC5614i1 abstractC5614i1M10125a = c5616j03.m10125a();
                    long j3 = c5652v04.f23025O;
                    float f3 = c5652v04.f23026P;
                    placementScope.getClass();
                    AbstractC4374a1.m8815e(placementScope, abstractC5614i1M10125a);
                    abstractC5614i1M10125a.mo8821B0(C4240j.m8530d(j3, abstractC5614i1M10125a.f14597k), f3, c1902b);
                } else if (interfaceC1231l == null) {
                    AbstractC5614i1 abstractC5614i1M10125a2 = c5616j03.m10125a();
                    long j4 = c5652v04.f23025O;
                    float f10 = c5652v04.f23026P;
                    placementScope.getClass();
                    AbstractC4374a1.m8815e(placementScope, abstractC5614i1M10125a2);
                    abstractC5614i1M10125a2.mo8820A0(C4240j.m8530d(j4, abstractC5614i1M10125a2.f14597k), f10, null);
                } else {
                    AbstractC5614i1 abstractC5614i1M10125a3 = c5616j03.m10125a();
                    long j5 = c5652v04.f23025O;
                    float f11 = c5652v04.f23026P;
                    placementScope.getClass();
                    AbstractC4374a1.m8815e(placementScope, abstractC5614i1M10125a3);
                    abstractC5614i1M10125a3.mo8820A0(C4240j.m8530d(j5, abstractC5614i1M10125a3.f14597k), f11, interfaceC1231l);
                }
                break;
        }
        return C3967n.f12976a;
    }
}
