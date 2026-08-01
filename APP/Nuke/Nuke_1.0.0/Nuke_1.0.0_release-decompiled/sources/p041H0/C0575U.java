package p041H0;

import me.dartcv.nuke.BuildConfig;
import p029F0.AbstractC0389a0;
import p047I0.ViewTreeObserverOnGlobalLayoutListenerC0772y;
import p056K2.C0891q;
import p105V.C1480b;
import p105V.C1483e;
import p112W2.InterfaceC1599a;
import p117X2.AbstractC1665j;
import p117X2.AbstractC1666k;

/* JADX INFO: renamed from: H0.U */
/* JADX INFO: loaded from: classes.dex */
public final class C0575U extends AbstractC1666k implements InterfaceC1599a {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f1795e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C0576V f1796f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0575U(C0576V c0576v, int i5) {
        super(0);
        this.f1795e = i5;
        this.f1796f = c0576v;
    }

    @Override // p112W2.InterfaceC1599a
    /* JADX INFO: renamed from: a */
    public final Object mo6a() {
        AbstractC0573S abstractC0573SMo979P0;
        switch (this.f1795e) {
            case 0:
                C0576V c0576v = this.f1796f;
                C0568M c0568m = c0576v.f1801i;
                c0568m.f1752h = 0;
                C1483e c1483eM843y = c0568m.f1745a.m843y();
                Object[] objArr = c1483eM843y.f5181d;
                int i5 = c1483eM843y.f5183f;
                for (int i6 = 0; i6 < i5; i6++) {
                    C0576V c0576v2 = ((C0564I) objArr[i6]).f1700K.f1761q;
                    AbstractC1665j.m2982b(c0576v2);
                    c0576v2.f1803k = c0576v2.f1804l;
                    c0576v2.f1804l = Integer.MAX_VALUE;
                    if (c0576v2.f1805m == EnumC0561G.f1683e) {
                        c0576v2.f1805m = EnumC0561G.f1684f;
                    }
                }
                C0564I c0564i = c0568m.f1745a;
                C0564I c0564i2 = c0568m.f1745a;
                C1483e c1483eM843y2 = c0564i.m843y();
                Object[] objArr2 = c1483eM843y2.f5181d;
                int i7 = c1483eM843y2.f5183f;
                for (int i8 = 0; i8 < i7; i8++) {
                    C0576V c0576v3 = ((C0564I) objArr2[i8]).f1700K.f1761q;
                    AbstractC1665j.m2982b(c0576v3);
                    c0576v3.f1812t.getClass();
                }
                C0615r c0615r = c0576v.mo909w().f1971V;
                if (c0615r != null) {
                    boolean z5 = c0615r.f1781n;
                    C1480b c1480b = (C1480b) c0564i2.m832n();
                    int i9 = ((C1483e) c1480b.f5173e).f5183f;
                    for (int i10 = 0; i10 < i9; i10++) {
                        AbstractC0573S abstractC0573SMo979P02 = ((C0564I) c1480b.get(i10)).f1699J.f1894d.mo979P0();
                        if (abstractC0573SMo979P02 != null) {
                            abstractC0573SMo979P02.f1781n = z5;
                        }
                    }
                }
                C0615r c0615r2 = c0576v.mo909w().f1971V;
                AbstractC1665j.m2982b(c0615r2);
                c0615r2.mo894z0().mo608b();
                if (c0576v.mo909w().f1971V != null) {
                    C1480b c1480b2 = (C1480b) c0564i2.m832n();
                    int i11 = ((C1483e) c1480b2.f5173e).f5183f;
                    for (int i12 = 0; i12 < i11; i12++) {
                        AbstractC0573S abstractC0573SMo979P03 = ((C0564I) c1480b2.get(i12)).f1699J.f1894d.mo979P0();
                        if (abstractC0573SMo979P03 != null) {
                            abstractC0573SMo979P03.f1781n = false;
                        }
                    }
                }
                C1483e c1483eM843y3 = c0564i2.m843y();
                Object[] objArr3 = c1483eM843y3.f5181d;
                int i13 = c1483eM843y3.f5183f;
                for (int i14 = 0; i14 < i13; i14++) {
                    C0576V c0576v4 = ((C0564I) objArr3[i14]).f1700K.f1761q;
                    AbstractC1665j.m2982b(c0576v4);
                    int i15 = c0576v4.f1803k;
                    int i16 = c0576v4.f1804l;
                    if (i15 != i16 && i16 == Integer.MAX_VALUE) {
                        c0576v4.m904n0(true);
                    }
                }
                C1483e c1483eM843y4 = c0564i2.m843y();
                Object[] objArr4 = c1483eM843y4.f5181d;
                int i17 = c1483eM843y4.f5183f;
                for (int i18 = 0; i18 < i17; i18++) {
                    C0576V c0576v5 = ((C0564I) objArr4[i18]).f1700K.f1761q;
                    AbstractC1665j.m2982b(c0576v5);
                    C0565J c0565j = c0576v5.f1812t;
                    c0565j.getClass();
                    c0565j.f1736c = false;
                }
                break;
            case BuildConfig.VERSION_CODE /* 1 */:
                C0576V c0576v6 = this.f1796f;
                C0568M c0568m2 = c0576v6.f1801i;
                AbstractC0389a0 placementScope = null;
                if (AbstractC0601k.m1039o(c0568m2.f1745a) || c0568m2.f1747c) {
                    AbstractC0596h0 abstractC0596h0 = c0568m2.m867a().f1934t;
                    if (abstractC0596h0 != null) {
                        placementScope = abstractC0596h0.f1782o;
                    }
                } else {
                    AbstractC0596h0 abstractC0596h02 = c0568m2.m867a().f1934t;
                    if (abstractC0596h02 != null && (abstractC0573SMo979P0 = abstractC0596h02.mo979P0()) != null) {
                        placementScope = abstractC0573SMo979P0.f1782o;
                    }
                }
                if (placementScope == null) {
                    placementScope = ((ViewTreeObserverOnGlobalLayoutListenerC0772y) AbstractC0567L.m866a(c0568m2.f1745a)).getPlacementScope();
                }
                AbstractC0573S abstractC0573SMo979P04 = c0568m2.m867a().mo979P0();
                AbstractC1665j.m2982b(abstractC0573SMo979P04);
                AbstractC0389a0.m659j(placementScope, abstractC0573SMo979P04, c0576v6.f1809q);
                break;
            default:
                C0576V c0576v7 = this.f1796f;
                AbstractC0573S abstractC0573SMo979P05 = c0576v7.f1801i.m867a().mo979P0();
                AbstractC1665j.m2982b(abstractC0573SMo979P05);
                abstractC0573SMo979P05.mo648e(c0576v7.f1797A);
                break;
        }
        return C0891q.f2780a;
    }
}
