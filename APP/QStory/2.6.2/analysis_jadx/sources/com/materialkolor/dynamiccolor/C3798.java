package com.materialkolor.dynamiccolor;

import com.materialkolor.scheme.Variant;
import p052.InterfaceC6557;
import p265.C8259;

/* JADX INFO: renamed from: com.materialkolor.dynamiccolor.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3798 implements InterfaceC6557 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f11960;

    public /* synthetic */ C3798(int i) {
        this.f11960 = i;
    }

    @Override // p052.InterfaceC6557
    public final Object invoke(Object obj) {
        int i = this.f11960;
        double dM8145 = 100.0d;
        C3811 c3811 = C3795.f11957;
        switch (i) {
            case 0:
                C8259 c8259 = (C8259) obj;
                c8259.getClass();
                return Double.valueOf(c8259.f22868 == Variant.MONOCHROME ? 90.0d : 30.0d);
            case 1:
                ((C8259) obj).getClass();
                return c3811.mo8178();
            case 2:
                ((C8259) obj).getClass();
                return c3811.mo8177();
            case 3:
                ((C8259) obj).getClass();
                return new C3802(3.0d, 4.5d, 7.0d, 11.0d);
            case 4:
                C8259 c82592 = (C8259) obj;
                c82592.getClass();
                return c82592.f22864;
            case 5:
                C8259 c82593 = (C8259) obj;
                c82593.getClass();
                return Double.valueOf(c82593.f22867 ? 6.0d : 98.0d);
            case 6:
                C8259 c82594 = (C8259) obj;
                c82594.getClass();
                return Double.valueOf(c82594.f22868 == Variant.MONOCHROME ? 40.0d : 90.0d);
            case 7:
                ((C8259) obj).getClass();
                return new C3802(1.0d, 1.0d, 3.0d, 4.5d);
            case 8:
                C8259 c82595 = (C8259) obj;
                c82595.getClass();
                return c82595.f22866;
            case 9:
                C8259 c82596 = (C8259) obj;
                c82596.getClass();
                boolean z = c82596.f22868 == Variant.MONOCHROME;
                boolean z2 = c82596.f22867;
                if (!z) {
                    dM8145 = z2 ? 80.0d : 40.0d;
                } else if (!z2) {
                    dM8145 = 0.0d;
                }
                return Double.valueOf(dM8145);
            case 10:
                ((C8259) obj).getClass();
                return new C3802(3.0d, 4.5d, 7.0d, 7.0d);
            case 11:
                C8259 c82597 = (C8259) obj;
                c82597.getClass();
                return c82597.f22871;
            case 12:
                C8259 c82598 = (C8259) obj;
                c82598.getClass();
                return Double.valueOf(c82598.f22867 ? 10.0d : 96.0d);
            case 13:
                C8259 c82599 = (C8259) obj;
                c82599.getClass();
                return c82599.f22871;
            case 14:
                C8259 c825910 = (C8259) obj;
                c825910.getClass();
                return c825910.f22870;
            case 15:
                C8259 c825911 = (C8259) obj;
                c825911.getClass();
                return Double.valueOf(c825911.f22867 ? 6.0d : 98.0d);
            case 16:
                C8259 c825912 = (C8259) obj;
                c825912.getClass();
                return c825912.f22866;
            case 17:
                C8259 c825913 = (C8259) obj;
                c825913.getClass();
                return Double.valueOf(c825913.f22868 == Variant.MONOCHROME ? 40.0d : 90.0d);
            case 18:
                ((C8259) obj).getClass();
                return new C3802(1.0d, 1.0d, 3.0d, 4.5d);
            case 19:
                C8259 c825914 = (C8259) obj;
                c825914.getClass();
                return c825914.f22864;
            case 20:
                C8259 c825915 = (C8259) obj;
                c825915.getClass();
                return Double.valueOf(c825915.f22868 == Variant.MONOCHROME ? 90.0d : 30.0d);
            case 21:
                ((C8259) obj).getClass();
                return c3811.mo8154();
            case 22:
                ((C8259) obj).getClass();
                return c3811.mo8155();
            case 23:
                ((C8259) obj).getClass();
                return new C3802(3.0d, 4.5d, 7.0d, 11.0d);
            case 24:
                C8259 c825916 = (C8259) obj;
                c825916.getClass();
                return Double.valueOf(c825916.f22867 ? 30.0d : 90.0d);
            case 25:
                C8259 c825917 = (C8259) obj;
                c825917.getClass();
                return c825917.f22864;
            case 26:
                C8259 c825918 = (C8259) obj;
                c825918.getClass();
                boolean z3 = c825918.f22867;
                if (c825918.f22868 != Variant.MONOCHROME) {
                    dM8145 = !C3816.m8186(c825918) ? z3 ? 90.0d : 30.0d : AbstractC3803.m8145(((Number) c3811.mo8156().f11983.invoke(c825918)).doubleValue(), 4.5d);
                } else if (z3) {
                    dM8145 = 0.0d;
                }
                return Double.valueOf(dM8145);
            case 27:
                ((C8259) obj).getClass();
                return c3811.mo8156();
            case 28:
                ((C8259) obj).getClass();
                return new C3802(3.0d, 4.5d, 7.0d, 11.0d);
            default:
                C8259 c825919 = (C8259) obj;
                c825919.getClass();
                return c825919.f22875;
        }
    }
}
