package com.materialkolor.dynamiccolor;

import com.materialkolor.scheme.Variant;
import p034.AbstractC7082;
import p068.InterfaceC7387;
import p279.AbstractC9085;
import p281.C9089;
import p282.C9092;

/* JADX INFO: renamed from: com.materialkolor.dynamiccolor.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4630 implements InterfaceC7387 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f12309;

    public /* synthetic */ C4630(C4649 c4649) {
        this.f12309 = 23;
    }

    @Override // p068.InterfaceC7387
    public final Object invoke(Object obj) {
        boolean z;
        int i = this.f12309;
        double d = 90.0d;
        C4644 c4644 = C4628.f12307;
        C9089 c9089 = (C9089) obj;
        switch (i) {
            case 0:
                c9089.getClass();
                z = c9089.f23212 == Variant.MONOCHROME;
                boolean z2 = c9089.f23211;
                if (z) {
                    if (!z2) {
                        d = 10.0d;
                    }
                } else if (!z2) {
                    d = 30.0d;
                }
                return Double.valueOf(d);
            case 1:
                c9089.getClass();
                return c4644.mo8713();
            case 2:
                c9089.getClass();
                return new C4635(3.0d, 4.5d, 7.0d, 11.0d);
            case 3:
                c9089.getClass();
                return c9089.f23208;
            case 4:
                c9089.getClass();
                return Double.valueOf(c9089.f23212 == Variant.MONOCHROME ? 100.0d : 10.0d);
            case 5:
                c9089.getClass();
                return c9089.f23215;
            case 6:
                c9089.getClass();
                return c4644.mo8700();
            case 7:
                c9089.getClass();
                return c4644.mo8701();
            case 8:
                c9089.getClass();
                return new C4635(4.5d, 7.0d, 11.0d, 21.0d);
            case 9:
                c9089.getClass();
                return c9089.f23208;
            case 10:
                c9089.getClass();
                z = c9089.f23212 == Variant.MONOCHROME;
                boolean z3 = c9089.f23211;
                if (z) {
                    d = z3 ? 10.0d : 90.0d;
                } else if (z3) {
                    d = 20.0d;
                }
                return Double.valueOf(d);
            case 11:
                c9089.getClass();
                return c4644.mo8703();
            case 12:
                c9089.getClass();
                return new C4635(4.5d, 7.0d, 11.0d, 21.0d);
            case 13:
                c9089.getClass();
                return c9089.f23214;
            case 14:
                c9089.getClass();
                return Double.valueOf(c9089.f23211 ? 80.0d : 30.0d);
            case 15:
                c9089.getClass();
                return new C4635(3.0d, 4.5d, 7.0d, 11.0d);
            case 16:
                c9089.getClass();
                return Double.valueOf(c9089.f23215.f23221.f23199);
            case 17:
                c9089.getClass();
                return c9089.f23210;
            case 18:
                c9089.getClass();
                return Double.valueOf(c9089.f23212 == Variant.MONOCHROME ? 100.0d : 10.0d);
            case 19:
                c9089.getClass();
                return c4644.mo8724();
            case 20:
                c9089.getClass();
                return c4644.mo8723();
            case 21:
                c9089.getClass();
                return new C4635(4.5d, 7.0d, 11.0d, 21.0d);
            case 22:
                c9089.getClass();
                return c9089.f23208;
            case 23:
                c9089.getClass();
                boolean z4 = c9089.f23211;
                if (c9089.f23212 == Variant.MONOCHROME) {
                    d = z4 ? 60.0d : 49.0d;
                } else if (C4649.m8732(c9089)) {
                    C9092 c9092 = c9089.f23208;
                    d = AbstractC7082.m12315(AbstractC9085.m14382(c9092.f23223, c9092.f23222, c9089.f23213.f23199)).f23199;
                } else if (z4) {
                    d = 30.0d;
                }
                return Double.valueOf(d);
            case 24:
                c9089.getClass();
                return new C4635(1.0d, 1.0d, 3.0d, 4.5d);
            case 25:
                c9089.getClass();
                return c9089.f23210;
            case 26:
                c9089.getClass();
                return Double.valueOf(0.0d);
            case 27:
                c9089.getClass();
                return Double.valueOf(c9089.f23210.f23221.f23199);
            case 28:
                c9089.getClass();
                return c9089.f23214;
            default:
                c9089.getClass();
                return Double.valueOf(c9089.f23211 ? 80.0d : 30.0d);
        }
    }

    public /* synthetic */ C4630(int i) {
        this.f12309 = i;
    }
}
