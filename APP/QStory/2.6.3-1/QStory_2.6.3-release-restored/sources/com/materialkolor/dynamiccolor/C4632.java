package com.materialkolor.dynamiccolor;

import com.materialkolor.scheme.Variant;
import p068.InterfaceC7387;
import p279.AbstractC9085;
import p279.C9084;
import p281.C9089;
import p282.C9092;

/* JADX INFO: renamed from: com.materialkolor.dynamiccolor.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4632 implements InterfaceC7387 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f12311;

    public /* synthetic */ C4632(C4649 c4649) {
        this.f12311 = 14;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0179 A[PHI: r15
  0x0179: PHI (r15v2 double) = (r15v1 double), (r15v1 double), (r15v3 double) binds: [B:60:0x0125, B:63:0x0138, B:127:0x0179] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // p068.InterfaceC7387
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        double d;
        int i = this.f12311;
        C4644 c4644 = C4628.f12307;
        switch (i) {
            case 0:
                ((C9089) obj).getClass();
                return c4644.mo8716();
            case 1:
                ((C9089) obj).getClass();
                return new C4635(3.0d, 4.5d, 7.0d, 11.0d);
            case 2:
                C9089 c9089 = (C9089) obj;
                c9089.getClass();
                return c9089.f23210;
            case 3:
                C9089 c90892 = (C9089) obj;
                c90892.getClass();
                return Double.valueOf(c90892.f23211 ? 40.0d : 80.0d);
            case 4:
                C9089 c90893 = (C9089) obj;
                c90893.getClass();
                return c90893.f23210;
            case 5:
                ((C9089) obj).getClass();
                return c4644.mo8722();
            case 6:
                ((C9089) obj).getClass();
                return new C4635(3.0d, 4.5d, 7.0d, 7.0d);
            case 7:
                C9089 c90894 = (C9089) obj;
                c90894.getClass();
                return c90894.f23209;
            case 8:
                C9089 c90895 = (C9089) obj;
                c90895.getClass();
                boolean z = c90895.f23212 == Variant.MONOCHROME;
                boolean z2 = c90895.f23211;
                if (z) {
                    if (!z2) {
                        d = 100.0d;
                    }
                } else if (z2) {
                    d = 20.0d;
                }
                return Double.valueOf(d);
            case 9:
                ((C9089) obj).getClass();
                return c4644.mo8717();
            case 10:
                ((C9089) obj).getClass();
                return new C4635(4.5d, 7.0d, 11.0d, 21.0d);
            case 11:
                C9089 c90896 = (C9089) obj;
                c90896.getClass();
                return c90896.f23215;
            case 12:
                C9089 c90897 = (C9089) obj;
                c90897.getClass();
                return Double.valueOf(c90897.f23211 ? 22.0d : 90.0d);
            case 13:
                C9089 c90898 = (C9089) obj;
                c90898.getClass();
                return c90898.f23209;
            case 14:
                C9089 c90899 = (C9089) obj;
                c90899.getClass();
                boolean z3 = c90899.f23211;
                double d2 = z3 ? 30.0d : 90.0d;
                if (c90899.f23212 == Variant.MONOCHROME) {
                    if (!z3) {
                        d = 85.0d;
                    }
                } else if (C4649.m8732(c90899)) {
                    C9092 c9092 = c90899.f23209;
                    double d3 = c9092.f23223;
                    double d4 = c9092.f23222;
                    C9084 c9084M14382 = AbstractC9085.m14382(d3, d4, d2);
                    double d5 = c9084M14382.f23200;
                    if (d5 < d4) {
                        double dMax = d5;
                        while (true) {
                            double d6 = c9084M14382.f23200;
                            if (d6 < d4) {
                                d = (!z3 ? -1.0d : 1.0d) + d2;
                                C9084 c9084M143822 = AbstractC9085.m14382(d3, d4, d);
                                double d7 = c9084M143822.f23200;
                                if (dMax <= d7) {
                                    double d8 = d7 - d4;
                                    if (Math.abs(d8) >= 0.4d) {
                                        if (Math.abs(d8) < Math.abs(d6 - d4)) {
                                            c9084M14382 = c9084M143822;
                                        }
                                        dMax = Math.max(dMax, d7);
                                        d2 = d;
                                    }
                                }
                            }
                        }
                        d = d;
                    }
                } else {
                    d = d2;
                }
                return Double.valueOf(d);
            case 15:
                C9089 c908910 = (C9089) obj;
                c908910.getClass();
                return Double.valueOf(c908910.f23211 ? 30.0d : 90.0d);
            case 16:
                ((C9089) obj).getClass();
                return new C4635(1.0d, 1.0d, 3.0d, 4.5d);
            case 17:
                C9089 c908911 = (C9089) obj;
                c908911.getClass();
                return c908911.f23215;
            case 18:
                C9089 c908912 = (C9089) obj;
                c908912.getClass();
                return Double.valueOf(c908912.f23211 ? 90.0d : 10.0d);
            case 19:
                ((C9089) obj).getClass();
                return new C4635(4.5d, 7.0d, 11.0d, 21.0d);
            case 20:
                C9089 c908913 = (C9089) obj;
                c908913.getClass();
                return c908913.f23208;
            case 21:
                C9089 c908914 = (C9089) obj;
                c908914.getClass();
                return Double.valueOf(c908914.f23212 == Variant.MONOCHROME ? 30.0d : 80.0d);
            case 22:
                ((C9089) obj).getClass();
                return new C4635(1.0d, 1.0d, 3.0d, 4.5d);
            case 23:
                C9089 c908915 = (C9089) obj;
                c908915.getClass();
                return c908915.f23209;
            case 24:
                C9089 c908916 = (C9089) obj;
                c908916.getClass();
                return c908916.f23215;
            case 25:
                C9089 c908917 = (C9089) obj;
                c908917.getClass();
                return Double.valueOf(c908917.f23212 == Variant.MONOCHROME ? 25.0d : 30.0d);
            case 26:
                ((C9089) obj).getClass();
                return c4644.mo8721();
            case 27:
                ((C9089) obj).getClass();
                return c4644.mo8720();
            case 28:
                ((C9089) obj).getClass();
                return new C4635(3.0d, 4.5d, 7.0d, 11.0d);
            default:
                C9089 c908918 = (C9089) obj;
                c908918.getClass();
                return c908918.f23210;
        }
    }

    public /* synthetic */ C4632(int i) {
        this.f12311 = i;
    }
}
