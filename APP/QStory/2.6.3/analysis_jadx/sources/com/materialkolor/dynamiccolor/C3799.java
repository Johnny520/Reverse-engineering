package com.materialkolor.dynamiccolor;

import com.materialkolor.scheme.Variant;
import p052.InterfaceC6558;
import p265.C8260;

/* JADX INFO: renamed from: com.materialkolor.dynamiccolor.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3799 implements InterfaceC6558 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f11965;

    public /* synthetic */ C3799(int i) {
        this.f11965 = i;
    }

    @Override // p052.InterfaceC6558
    public final Object invoke(Object obj) {
        int i = this.f11965;
        double dM8132 = 100.0d;
        C3812 c3812 = C3796.f11962;
        switch (i) {
            case 0:
                C8260 c8260 = (C8260) obj;
                c8260.getClass();
                return Double.valueOf(c8260.f22867 == Variant.MONOCHROME ? 90.0d : 30.0d);
            case 1:
                ((C8260) obj).getClass();
                return c3812.mo8165();
            case 2:
                ((C8260) obj).getClass();
                return c3812.mo8164();
            case 3:
                ((C8260) obj).getClass();
                return new C3803(3.0d, 4.5d, 7.0d, 11.0d);
            case 4:
                C8260 c82602 = (C8260) obj;
                c82602.getClass();
                return c82602.f22863;
            case 5:
                C8260 c82603 = (C8260) obj;
                c82603.getClass();
                return Double.valueOf(c82603.f22866 ? 6.0d : 98.0d);
            case 6:
                C8260 c82604 = (C8260) obj;
                c82604.getClass();
                return Double.valueOf(c82604.f22867 == Variant.MONOCHROME ? 40.0d : 90.0d);
            case 7:
                ((C8260) obj).getClass();
                return new C3803(1.0d, 1.0d, 3.0d, 4.5d);
            case 8:
                C8260 c82605 = (C8260) obj;
                c82605.getClass();
                return c82605.f22865;
            case 9:
                C8260 c82606 = (C8260) obj;
                c82606.getClass();
                boolean z = c82606.f22867 == Variant.MONOCHROME;
                boolean z2 = c82606.f22866;
                if (!z) {
                    dM8132 = z2 ? 80.0d : 40.0d;
                } else if (!z2) {
                    dM8132 = 0.0d;
                }
                return Double.valueOf(dM8132);
            case 10:
                ((C8260) obj).getClass();
                return new C3803(3.0d, 4.5d, 7.0d, 7.0d);
            case 11:
                C8260 c82607 = (C8260) obj;
                c82607.getClass();
                return c82607.f22870;
            case 12:
                C8260 c82608 = (C8260) obj;
                c82608.getClass();
                return Double.valueOf(c82608.f22866 ? 10.0d : 96.0d);
            case 13:
                C8260 c82609 = (C8260) obj;
                c82609.getClass();
                return c82609.f22870;
            case 14:
                C8260 c826010 = (C8260) obj;
                c826010.getClass();
                return c826010.f22869;
            case 15:
                C8260 c826011 = (C8260) obj;
                c826011.getClass();
                return Double.valueOf(c826011.f22866 ? 6.0d : 98.0d);
            case 16:
                C8260 c826012 = (C8260) obj;
                c826012.getClass();
                return c826012.f22865;
            case 17:
                C8260 c826013 = (C8260) obj;
                c826013.getClass();
                return Double.valueOf(c826013.f22867 == Variant.MONOCHROME ? 40.0d : 90.0d);
            case 18:
                ((C8260) obj).getClass();
                return new C3803(1.0d, 1.0d, 3.0d, 4.5d);
            case 19:
                C8260 c826014 = (C8260) obj;
                c826014.getClass();
                return c826014.f22863;
            case 20:
                C8260 c826015 = (C8260) obj;
                c826015.getClass();
                return Double.valueOf(c826015.f22867 == Variant.MONOCHROME ? 90.0d : 30.0d);
            case 21:
                ((C8260) obj).getClass();
                return c3812.mo8141();
            case 22:
                ((C8260) obj).getClass();
                return c3812.mo8142();
            case 23:
                ((C8260) obj).getClass();
                return new C3803(3.0d, 4.5d, 7.0d, 11.0d);
            case 24:
                C8260 c826016 = (C8260) obj;
                c826016.getClass();
                return Double.valueOf(c826016.f22866 ? 30.0d : 90.0d);
            case 25:
                C8260 c826017 = (C8260) obj;
                c826017.getClass();
                return c826017.f22863;
            case 26:
                C8260 c826018 = (C8260) obj;
                c826018.getClass();
                boolean z3 = c826018.f22866;
                if (c826018.f22867 != Variant.MONOCHROME) {
                    dM8132 = !C3817.m8173(c826018) ? z3 ? 90.0d : 30.0d : AbstractC3804.m8132(((Number) c3812.mo8143().f11988.invoke(c826018)).doubleValue(), 4.5d);
                } else if (z3) {
                    dM8132 = 0.0d;
                }
                return Double.valueOf(dM8132);
            case 27:
                ((C8260) obj).getClass();
                return c3812.mo8143();
            case 28:
                ((C8260) obj).getClass();
                return new C3803(3.0d, 4.5d, 7.0d, 11.0d);
            default:
                C8260 c826019 = (C8260) obj;
                c826019.getClass();
                return c826019.f22874;
        }
    }
}
