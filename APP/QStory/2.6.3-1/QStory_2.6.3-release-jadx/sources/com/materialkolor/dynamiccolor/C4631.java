package com.materialkolor.dynamiccolor;

import com.materialkolor.scheme.Variant;
import p068.InterfaceC7387;
import p281.C9089;

/* JADX INFO: renamed from: com.materialkolor.dynamiccolor.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4631 implements InterfaceC7387 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f12310;

    public /* synthetic */ C4631(int i) {
        this.f12310 = i;
    }

    @Override // p068.InterfaceC7387
    public final Object invoke(Object obj) {
        int i = this.f12310;
        double dM8691 = 100.0d;
        C4644 c4644 = C4628.f12307;
        switch (i) {
            case 0:
                C9089 c9089 = (C9089) obj;
                c9089.getClass();
                return Double.valueOf(c9089.f23212 == Variant.MONOCHROME ? 90.0d : 30.0d);
            case 1:
                ((C9089) obj).getClass();
                return c4644.mo8724();
            case 2:
                ((C9089) obj).getClass();
                return c4644.mo8723();
            case 3:
                ((C9089) obj).getClass();
                return new C4635(3.0d, 4.5d, 7.0d, 11.0d);
            case 4:
                C9089 c90892 = (C9089) obj;
                c90892.getClass();
                return c90892.f23208;
            case 5:
                C9089 c90893 = (C9089) obj;
                c90893.getClass();
                return Double.valueOf(c90893.f23211 ? 6.0d : 98.0d);
            case 6:
                C9089 c90894 = (C9089) obj;
                c90894.getClass();
                return Double.valueOf(c90894.f23212 == Variant.MONOCHROME ? 40.0d : 90.0d);
            case 7:
                ((C9089) obj).getClass();
                return new C4635(1.0d, 1.0d, 3.0d, 4.5d);
            case 8:
                C9089 c90895 = (C9089) obj;
                c90895.getClass();
                return c90895.f23210;
            case 9:
                C9089 c90896 = (C9089) obj;
                c90896.getClass();
                boolean z = c90896.f23212 == Variant.MONOCHROME;
                boolean z2 = c90896.f23211;
                if (!z) {
                    dM8691 = z2 ? 80.0d : 40.0d;
                } else if (!z2) {
                    dM8691 = 0.0d;
                }
                return Double.valueOf(dM8691);
            case 10:
                ((C9089) obj).getClass();
                return new C4635(3.0d, 4.5d, 7.0d, 7.0d);
            case 11:
                C9089 c90897 = (C9089) obj;
                c90897.getClass();
                return c90897.f23215;
            case 12:
                C9089 c90898 = (C9089) obj;
                c90898.getClass();
                return Double.valueOf(c90898.f23211 ? 10.0d : 96.0d);
            case 13:
                C9089 c90899 = (C9089) obj;
                c90899.getClass();
                return c90899.f23215;
            case 14:
                C9089 c908910 = (C9089) obj;
                c908910.getClass();
                return c908910.f23214;
            case 15:
                C9089 c908911 = (C9089) obj;
                c908911.getClass();
                return Double.valueOf(c908911.f23211 ? 6.0d : 98.0d);
            case 16:
                C9089 c908912 = (C9089) obj;
                c908912.getClass();
                return c908912.f23210;
            case 17:
                C9089 c908913 = (C9089) obj;
                c908913.getClass();
                return Double.valueOf(c908913.f23212 == Variant.MONOCHROME ? 40.0d : 90.0d);
            case 18:
                ((C9089) obj).getClass();
                return new C4635(1.0d, 1.0d, 3.0d, 4.5d);
            case 19:
                C9089 c908914 = (C9089) obj;
                c908914.getClass();
                return c908914.f23208;
            case 20:
                C9089 c908915 = (C9089) obj;
                c908915.getClass();
                return Double.valueOf(c908915.f23212 == Variant.MONOCHROME ? 90.0d : 30.0d);
            case 21:
                ((C9089) obj).getClass();
                return c4644.mo8700();
            case 22:
                ((C9089) obj).getClass();
                return c4644.mo8701();
            case 23:
                ((C9089) obj).getClass();
                return new C4635(3.0d, 4.5d, 7.0d, 11.0d);
            case 24:
                C9089 c908916 = (C9089) obj;
                c908916.getClass();
                return Double.valueOf(c908916.f23211 ? 30.0d : 90.0d);
            case 25:
                C9089 c908917 = (C9089) obj;
                c908917.getClass();
                return c908917.f23208;
            case 26:
                C9089 c908918 = (C9089) obj;
                c908918.getClass();
                boolean z3 = c908918.f23211;
                if (c908918.f23212 != Variant.MONOCHROME) {
                    dM8691 = !C4649.m8732(c908918) ? z3 ? 90.0d : 30.0d : AbstractC4636.m8691(((Number) c4644.mo8702().f12333.invoke(c908918)).doubleValue(), 4.5d);
                } else if (z3) {
                    dM8691 = 0.0d;
                }
                return Double.valueOf(dM8691);
            case 27:
                ((C9089) obj).getClass();
                return c4644.mo8702();
            case 28:
                ((C9089) obj).getClass();
                return new C4635(3.0d, 4.5d, 7.0d, 11.0d);
            default:
                C9089 c908919 = (C9089) obj;
                c908919.getClass();
                return c908919.f23219;
        }
    }
}
