package com.materialkolor.dynamiccolor;

import com.materialkolor.scheme.Variant;
import p052.InterfaceC6558;
import p265.C8260;

/* JADX INFO: renamed from: com.materialkolor.dynamiccolor.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3816 implements InterfaceC6558 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f12009;

    public /* synthetic */ C3816(int i) {
        this.f12009 = i;
    }

    @Override // p052.InterfaceC6558
    public final Object invoke(Object obj) {
        int i = this.f12009;
        C3812 c3812 = C3796.f11962;
        C8260 c8260 = (C8260) obj;
        switch (i) {
            case 0:
                c8260.getClass();
                return new C3803(3.0d, 4.5d, 7.0d, 7.0d);
            case 1:
                c8260.getClass();
                return c8260.f22869;
            case 2:
                c8260.getClass();
                return Double.valueOf(c8260.f22866 ? 30.0d : 80.0d);
            case 3:
                c8260.getClass();
                return new C3803(1.0d, 1.0d, 3.0d, 4.5d);
            case 4:
                c8260.getClass();
                return c8260.f22870;
            case 5:
                c8260.getClass();
                return Double.valueOf(c8260.f22866 ? 4.0d : 100.0d);
            case 6:
                c8260.getClass();
                return c8260.f22874;
            case 7:
                c8260.getClass();
                return Double.valueOf(c8260.f22866 ? 80.0d : 40.0d);
            case 8:
                c8260.getClass();
                return Double.valueOf(c8260.f22866 ? 6.0d : 87.0d);
            case 9:
                c8260.getClass();
                return new C3803(3.0d, 4.5d, 7.0d, 7.0d);
            case 10:
                c8260.getClass();
                return c8260.f22864;
            case 11:
                c8260.getClass();
                return Double.valueOf(10.0d);
            case 12:
                c8260.getClass();
                return c3812.mo8162();
            case 13:
                c8260.getClass();
                return c3812.mo8161();
            case 14:
                c8260.getClass();
                return new C3803(4.5d, 7.0d, 11.0d, 21.0d);
            case 15:
                c8260.getClass();
                return c8260.f22874;
            case 16:
                c8260.getClass();
                return Double.valueOf(c8260.f22866 ? 20.0d : 100.0d);
            case 17:
                c8260.getClass();
                return c3812.mo8155();
            case 18:
                c8260.getClass();
                return c8260.f22870;
            case 19:
                c8260.getClass();
                return new C3803(4.5d, 7.0d, 11.0d, 21.0d);
            case 20:
                c8260.getClass();
                return c8260.f22863;
            case 21:
                c8260.getClass();
                boolean z = c8260.f22867 == Variant.MONOCHROME;
                boolean z2 = c8260.f22866;
                if (z) {
                    d = z2 ? 90.0d : 25.0d;
                } else if (z2) {
                    d = 80.0d;
                }
                return Double.valueOf(d);
            case 22:
                c8260.getClass();
                return new C3803(3.0d, 4.5d, 7.0d, 7.0d);
            case 23:
                c8260.getClass();
                return c8260.f22874;
            case 24:
                c8260.getClass();
                return Double.valueOf(c8260.f22866 ? 30.0d : 90.0d);
            case 25:
                c8260.getClass();
                return new C3803(1.0d, 1.0d, 3.0d, 4.5d);
            case 26:
                c8260.getClass();
                return c8260.f22870;
            case 27:
                c8260.getClass();
                return Double.valueOf(c8260.f22866 ? 100.0d : 0.0d);
            case 28:
                c8260.getClass();
                return Double.valueOf(c8260.f22866 ? 90.0d : 10.0d);
            default:
                c8260.getClass();
                return c3812.mo8156();
        }
    }
}
