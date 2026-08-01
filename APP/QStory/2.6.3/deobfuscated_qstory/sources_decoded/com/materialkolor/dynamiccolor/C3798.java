package com.materialkolor.dynamiccolor;

import com.materialkolor.scheme.Variant;
import p018.AbstractC6253;
import p052.InterfaceC6558;
import p263.AbstractC8256;
import p265.C8260;
import p266.C8263;

/* JADX INFO: renamed from: com.materialkolor.dynamiccolor.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3798 implements InterfaceC6558 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f11964;

    public /* synthetic */ C3798(C3817 c3817) {
        this.f11964 = 23;
    }

    @Override // p052.InterfaceC6558
    public final Object invoke(Object obj) {
        boolean z;
        int i = this.f11964;
        double d = 90.0d;
        C3812 c3812 = C3796.f11962;
        C8260 c8260 = (C8260) obj;
        switch (i) {
            case 0:
                c8260.getClass();
                z = c8260.f22867 == Variant.MONOCHROME;
                boolean z2 = c8260.f22866;
                if (z) {
                    if (!z2) {
                        d = 10.0d;
                    }
                } else if (!z2) {
                    d = 30.0d;
                }
                return Double.valueOf(d);
            case 1:
                c8260.getClass();
                return c3812.mo8154();
            case 2:
                c8260.getClass();
                return new C3803(3.0d, 4.5d, 7.0d, 11.0d);
            case 3:
                c8260.getClass();
                return c8260.f22863;
            case 4:
                c8260.getClass();
                return Double.valueOf(c8260.f22867 == Variant.MONOCHROME ? 100.0d : 10.0d);
            case 5:
                c8260.getClass();
                return c8260.f22870;
            case 6:
                c8260.getClass();
                return c3812.mo8141();
            case 7:
                c8260.getClass();
                return c3812.mo8142();
            case 8:
                c8260.getClass();
                return new C3803(4.5d, 7.0d, 11.0d, 21.0d);
            case 9:
                c8260.getClass();
                return c8260.f22863;
            case 10:
                c8260.getClass();
                z = c8260.f22867 == Variant.MONOCHROME;
                boolean z3 = c8260.f22866;
                if (z) {
                    d = z3 ? 10.0d : 90.0d;
                } else if (z3) {
                    d = 20.0d;
                }
                return Double.valueOf(d);
            case 11:
                c8260.getClass();
                return c3812.mo8144();
            case 12:
                c8260.getClass();
                return new C3803(4.5d, 7.0d, 11.0d, 21.0d);
            case 13:
                c8260.getClass();
                return c8260.f22869;
            case 14:
                c8260.getClass();
                return Double.valueOf(c8260.f22866 ? 80.0d : 30.0d);
            case 15:
                c8260.getClass();
                return new C3803(3.0d, 4.5d, 7.0d, 11.0d);
            case 16:
                c8260.getClass();
                return Double.valueOf(c8260.f22870.f22876.f22854);
            case 17:
                c8260.getClass();
                return c8260.f22865;
            case 18:
                c8260.getClass();
                return Double.valueOf(c8260.f22867 == Variant.MONOCHROME ? 100.0d : 10.0d);
            case 19:
                c8260.getClass();
                return c3812.mo8165();
            case 20:
                c8260.getClass();
                return c3812.mo8164();
            case 21:
                c8260.getClass();
                return new C3803(4.5d, 7.0d, 11.0d, 21.0d);
            case 22:
                c8260.getClass();
                return c8260.f22863;
            case 23:
                c8260.getClass();
                boolean z4 = c8260.f22866;
                if (c8260.f22867 == Variant.MONOCHROME) {
                    d = z4 ? 60.0d : 49.0d;
                } else if (C3817.m8173(c8260)) {
                    C8263 c8263 = c8260.f22863;
                    d = AbstractC6253.m11756(AbstractC8256.m13823(c8263.f22878, c8263.f22877, c8260.f22868.f22854)).f22854;
                } else if (z4) {
                    d = 30.0d;
                }
                return Double.valueOf(d);
            case 24:
                c8260.getClass();
                return new C3803(1.0d, 1.0d, 3.0d, 4.5d);
            case 25:
                c8260.getClass();
                return c8260.f22865;
            case 26:
                c8260.getClass();
                return Double.valueOf(0.0d);
            case 27:
                c8260.getClass();
                return Double.valueOf(c8260.f22865.f22876.f22854);
            case 28:
                c8260.getClass();
                return c8260.f22869;
            default:
                c8260.getClass();
                return Double.valueOf(c8260.f22866 ? 80.0d : 30.0d);
        }
    }

    public /* synthetic */ C3798(int i) {
        this.f11964 = i;
    }
}
