package p041H0;

import me.dartcv.nuke.BuildConfig;
import p029F0.AbstractC0389a0;
import p047I0.ViewTreeObserverOnGlobalLayoutListenerC0772y;
import p056K2.C0891q;
import p105V.C1480b;
import p105V.C1483e;
import p112W2.InterfaceC1599a;
import p112W2.InterfaceC1601c;
import p117X2.AbstractC1665j;
import p117X2.AbstractC1666k;
import p153e1.C2014j;

/* JADX INFO: renamed from: H0.Y */
/* JADX INFO: loaded from: classes.dex */
public final class C0579Y extends AbstractC1666k implements InterfaceC1599a {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f1831e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C0580Z f1832f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0579Y(C0580Z c0580z, int i5) {
        super(0);
        this.f1831e = i5;
        this.f1832f = c0580z;
    }

    @Override // p112W2.InterfaceC1599a
    /* JADX INFO: renamed from: a */
    public final Object mo6a() {
        AbstractC0389a0 placementScope;
        switch (this.f1831e) {
            case 0:
                C0580Z c0580z = this.f1832f;
                C0568M c0568m = c0580z.f1846i;
                c0568m.f1753i = 0;
                C1483e c1483eM843y = c0568m.f1745a.m843y();
                Object[] objArr = c1483eM843y.f5181d;
                int i5 = c1483eM843y.f5183f;
                for (int i6 = 0; i6 < i5; i6++) {
                    C0580Z c0580z2 = ((C0564I) objArr[i6]).f1700K.f1760p;
                    c0580z2.f1848k = c0580z2.f1849l;
                    c0580z2.f1849l = Integer.MAX_VALUE;
                    c0580z2.f1859v = false;
                    if (c0580z2.f1852o == EnumC0561G.f1683e) {
                        c0580z2.f1852o = EnumC0561G.f1684f;
                    }
                }
                C0564I c0564i = c0568m.f1745a;
                C0564I c0564i2 = c0568m.f1745a;
                C1483e c1483eM843y2 = c0564i.m843y();
                Object[] objArr2 = c1483eM843y2.f5181d;
                int i7 = c1483eM843y2.f5183f;
                for (int i8 = 0; i8 < i7; i8++) {
                    ((C0564I) objArr2[i8]).f1700K.f1760p.f1863z.getClass();
                }
                if (c0580z.mo909w().f1781n) {
                    C1480b c1480b = (C1480b) c0564i2.m832n();
                    int i9 = ((C1483e) c1480b.f5173e).f5183f;
                    for (int i10 = 0; i10 < i9; i10++) {
                        ((C0564I) c1480b.get(i10)).f1699J.f1894d.f1781n = true;
                    }
                }
                c0580z.mo909w().mo894z0().mo608b();
                if (c0580z.mo909w().f1781n) {
                    C1480b c1480b2 = (C1480b) c0564i2.m832n();
                    int i11 = ((C1483e) c1480b2.f5173e).f5183f;
                    for (int i12 = 0; i12 < i11; i12++) {
                        ((C0564I) c1480b2.get(i12)).f1699J.f1894d.f1781n = false;
                    }
                }
                C1483e c1483eM843y3 = c0564i2.m843y();
                Object[] objArr3 = c1483eM843y3.f5181d;
                int i13 = c1483eM843y3.f5183f;
                for (int i14 = 0; i14 < i13; i14++) {
                    C0564I c0564i3 = (C0564I) objArr3[i14];
                    C0568M c0568m2 = c0564i3.f1700K;
                    if (c0568m2.f1760p.f1848k != c0564i3.m840v()) {
                        c0564i2.m807O();
                        c0564i2.m794B();
                        if (c0564i3.m840v() == Integer.MAX_VALUE) {
                            if (c0568m2.f1747c || AbstractC0601k.m1039o(c0564i3)) {
                                C0576V c0576v = c0568m2.f1761q;
                                AbstractC1665j.m2982b(c0576v);
                                c0576v.m904n0(false);
                            }
                            c0568m2.f1760p.m933p0();
                        }
                    }
                }
                C1483e c1483eM843y4 = c0564i2.m843y();
                Object[] objArr4 = c1483eM843y4.f5181d;
                int i15 = c1483eM843y4.f5183f;
                for (int i16 = 0; i16 < i15; i16++) {
                    C0565J c0565j = ((C0564I) objArr4[i16]).f1700K.f1760p.f1863z;
                    c0565j.getClass();
                    c0565j.f1736c = false;
                }
                break;
            case BuildConfig.VERSION_CODE /* 1 */:
                C0580Z c0580z3 = this.f1832f;
                c0580z3.f1846i.m867a().mo648e(c0580z3.f1836D);
                break;
            default:
                C0580Z c0580z4 = this.f1832f;
                C0568M c0568m3 = c0580z4.f1846i;
                AbstractC0596h0 abstractC0596h0 = c0568m3.m867a().f1934t;
                if (abstractC0596h0 == null || (placementScope = abstractC0596h0.f1782o) == null) {
                    placementScope = ((ViewTreeObserverOnGlobalLayoutListenerC0772y) AbstractC0567L.m866a(c0568m3.f1745a)).getPlacementScope();
                }
                InterfaceC1601c interfaceC1601c = c0580z4.f1841I;
                if (interfaceC1601c == null) {
                    AbstractC0596h0 abstractC0596h0M867a = c0568m3.m867a();
                    long j5 = c0580z4.f1842J;
                    float f2 = c0580z4.f1843K;
                    placementScope.getClass();
                    AbstractC0389a0.m657a(placementScope, abstractC0596h0M867a);
                    abstractC0596h0M867a.mo666i0(C2014j.m3702c(j5, abstractC0596h0M867a.f1210h), f2, null);
                } else {
                    AbstractC0596h0 abstractC0596h0M867a2 = c0568m3.m867a();
                    long j6 = c0580z4.f1842J;
                    float f5 = c0580z4.f1843K;
                    placementScope.getClass();
                    AbstractC0389a0.m657a(placementScope, abstractC0596h0M867a2);
                    abstractC0596h0M867a2.mo666i0(C2014j.m3702c(j6, abstractC0596h0M867a2.f1210h), f5, interfaceC1601c);
                }
                break;
        }
        return C0891q.f2780a;
    }
}
