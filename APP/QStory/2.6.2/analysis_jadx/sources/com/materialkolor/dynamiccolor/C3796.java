package com.materialkolor.dynamiccolor;

import com.materialkolor.scheme.Variant;
import p052.InterfaceC6557;
import p265.C8259;

/* JADX INFO: renamed from: com.materialkolor.dynamiccolor.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3796 implements InterfaceC6557 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f11958;

    public /* synthetic */ C3796(C3816 c3816) {
        this.f11958 = 25;
    }

    @Override // p052.InterfaceC6557
    public final Object invoke(Object obj) {
        C8259 c8259 = (C8259) obj;
        switch (this.f11958) {
            case 0:
                c8259.getClass();
                return c8259.f22866;
            case 1:
                c8259.getClass();
                return Double.valueOf(c8259.f22867 ? 80.0d : 40.0d);
            case 2:
                c8259.getClass();
                return c8259.f22871;
            case 3:
                c8259.getClass();
                return Double.valueOf(c8259.f22867 ? 10.0d : 90.0d);
            case 4:
                c8259.getClass();
                return c8259.f22871;
            case 5:
                c8259.getClass();
                return Double.valueOf(c8259.f22867 ? 10.0d : 90.0d);
            case 6:
                c8259.getClass();
                return c8259.f22875;
            case 7:
                c8259.getClass();
                return c8259.f22871;
            case 8:
                c8259.getClass();
                return Double.valueOf(c8259.f22875.f22877.f22855);
            case 9:
                c8259.getClass();
                return c8259.f22871;
            case 10:
                c8259.getClass();
                return Double.valueOf(c8259.f22867 ? 24.0d : 98.0d);
            case 11:
                c8259.getClass();
                return c8259.f22871;
            case 12:
                c8259.getClass();
                return Double.valueOf(c8259.f22867 ? 10.0d : 90.0d);
            case 13:
                c8259.getClass();
                return c8259.f22870;
            case 14:
                c8259.getClass();
                return Double.valueOf(c8259.f22867 ? 30.0d : 80.0d);
            case 15:
                c8259.getClass();
                return c8259.f22864;
            case 16:
                c8259.getClass();
                return Double.valueOf(c8259.f22864.f22877.f22855);
            case 17:
                c8259.getClass();
                return c8259.f22871;
            case 18:
                c8259.getClass();
                return Double.valueOf(0.0d);
            case 19:
                c8259.getClass();
                return Double.valueOf(c8259.f22867 ? 10.0d : 90.0d);
            case 20:
                c8259.getClass();
                return c8259.f22870;
            case 21:
                c8259.getClass();
                return Double.valueOf(c8259.f22870.f22877.f22855);
            case 22:
                c8259.getClass();
                return c8259.f22871;
            case 23:
                c8259.getClass();
                return Double.valueOf(c8259.f22867 ? 90.0d : 20.0d);
            case 24:
                c8259.getClass();
                return c8259.f22866;
            case 25:
                c8259.getClass();
                if (C3816.m8186(c8259)) {
                    d = c8259.f22869.f22855;
                } else {
                    boolean z = c8259.f22868 == Variant.MONOCHROME;
                    boolean z2 = c8259.f22867;
                    if (z) {
                        d = z2 ? 85.0d : 25.0d;
                    } else if (!z2) {
                        d = 90.0d;
                    }
                }
                return Double.valueOf(d);
            case 26:
                c8259.getClass();
                return new C3802(1.0d, 1.0d, 3.0d, 4.5d);
            case 27:
                c8259.getClass();
                return c8259.f22865;
            case 28:
                c8259.getClass();
                return c8259.f22871;
            default:
                c8259.getClass();
                return Double.valueOf(c8259.f22867 ? 80.0d : 40.0d);
        }
    }

    public /* synthetic */ C3796(int i) {
        this.f11958 = i;
    }
}
