package com.materialkolor.dynamiccolor;

import com.materialkolor.scheme.Variant;
import kotlin.reflect.jvm.internal.types.AbstractC4921;
import p052.InterfaceC6557;
import p263.AbstractC8255;
import p265.C8259;
import p266.C8262;

/* JADX INFO: renamed from: com.materialkolor.dynamiccolor.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3797 implements InterfaceC6557 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f11959;

    public /* synthetic */ C3797(C3816 c3816) {
        this.f11959 = 23;
    }

    @Override // p052.InterfaceC6557
    public final Object invoke(Object obj) {
        boolean z;
        int i = this.f11959;
        double d = 90.0d;
        C3811 c3811 = C3795.f11957;
        C8259 c8259 = (C8259) obj;
        switch (i) {
            case 0:
                c8259.getClass();
                z = c8259.f22868 == Variant.MONOCHROME;
                boolean z2 = c8259.f22867;
                if (z) {
                    if (!z2) {
                        d = 10.0d;
                    }
                } else if (!z2) {
                    d = 30.0d;
                }
                return Double.valueOf(d);
            case 1:
                c8259.getClass();
                return c3811.mo8167();
            case 2:
                c8259.getClass();
                return new C3802(3.0d, 4.5d, 7.0d, 11.0d);
            case 3:
                c8259.getClass();
                return c8259.f22864;
            case 4:
                c8259.getClass();
                return Double.valueOf(c8259.f22868 == Variant.MONOCHROME ? 100.0d : 10.0d);
            case 5:
                c8259.getClass();
                return c8259.f22871;
            case 6:
                c8259.getClass();
                return c3811.mo8154();
            case 7:
                c8259.getClass();
                return c3811.mo8155();
            case 8:
                c8259.getClass();
                return new C3802(4.5d, 7.0d, 11.0d, 21.0d);
            case 9:
                c8259.getClass();
                return c8259.f22864;
            case 10:
                c8259.getClass();
                z = c8259.f22868 == Variant.MONOCHROME;
                boolean z3 = c8259.f22867;
                if (z) {
                    d = z3 ? 10.0d : 90.0d;
                } else if (z3) {
                    d = 20.0d;
                }
                return Double.valueOf(d);
            case 11:
                c8259.getClass();
                return c3811.mo8157();
            case 12:
                c8259.getClass();
                return new C3802(4.5d, 7.0d, 11.0d, 21.0d);
            case 13:
                c8259.getClass();
                return c8259.f22870;
            case 14:
                c8259.getClass();
                return Double.valueOf(c8259.f22867 ? 80.0d : 30.0d);
            case 15:
                c8259.getClass();
                return new C3802(3.0d, 4.5d, 7.0d, 11.0d);
            case 16:
                c8259.getClass();
                return Double.valueOf(c8259.f22871.f22877.f22855);
            case 17:
                c8259.getClass();
                return c8259.f22866;
            case 18:
                c8259.getClass();
                return Double.valueOf(c8259.f22868 == Variant.MONOCHROME ? 100.0d : 10.0d);
            case 19:
                c8259.getClass();
                return c3811.mo8178();
            case 20:
                c8259.getClass();
                return c3811.mo8177();
            case 21:
                c8259.getClass();
                return new C3802(4.5d, 7.0d, 11.0d, 21.0d);
            case 22:
                c8259.getClass();
                return c8259.f22864;
            case 23:
                c8259.getClass();
                boolean z4 = c8259.f22867;
                if (c8259.f22868 == Variant.MONOCHROME) {
                    d = z4 ? 60.0d : 49.0d;
                } else if (C3816.m8186(c8259)) {
                    C8262 c8262 = c8259.f22864;
                    d = AbstractC4921.m9898(AbstractC8255.m13806(c8262.f22879, c8262.f22878, c8259.f22869.f22855)).f22855;
                } else if (z4) {
                    d = 30.0d;
                }
                return Double.valueOf(d);
            case 24:
                c8259.getClass();
                return new C3802(1.0d, 1.0d, 3.0d, 4.5d);
            case 25:
                c8259.getClass();
                return c8259.f22866;
            case 26:
                c8259.getClass();
                return Double.valueOf(0.0d);
            case 27:
                c8259.getClass();
                return Double.valueOf(c8259.f22866.f22877.f22855);
            case 28:
                c8259.getClass();
                return c8259.f22870;
            default:
                c8259.getClass();
                return Double.valueOf(c8259.f22867 ? 80.0d : 30.0d);
        }
    }

    public /* synthetic */ C3797(int i) {
        this.f11959 = i;
    }
}
