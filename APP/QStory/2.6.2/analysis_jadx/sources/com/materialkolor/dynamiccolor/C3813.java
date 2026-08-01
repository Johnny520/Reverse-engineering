package com.materialkolor.dynamiccolor;

import com.materialkolor.scheme.DynamicScheme$Platform;
import com.materialkolor.scheme.Variant;
import io.ktor.client.plugins.api.C3885;
import p052.InterfaceC6557;
import p265.C8259;
import p265.C8260;
import p266.C8262;

/* JADX INFO: renamed from: com.materialkolor.dynamiccolor.飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3813 implements InterfaceC6557 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f12002;

    public /* synthetic */ C3813(int i) {
        this.f12002 = i;
    }

    @Override // p052.InterfaceC6557
    public final Object invoke(Object obj) {
        double dM8280;
        double dM8281;
        int i = this.f12002;
        double d = 95.0d;
        C3811 c3811 = C3795.f11957;
        double dM82812 = 90.0d;
        switch (i) {
            case 0:
                C8259 c8259 = (C8259) obj;
                c8259.getClass();
                return Double.valueOf(c8259.f22867 ? 15.0d : c8259.f22871.f22877.m13801() ? 92.0d : c8259.f22868 == Variant.VIBRANT ? 88.0d : 90.0d);
            case 1:
                C8259 c82592 = (C8259) obj;
                c82592.getClass();
                Variant variant = c82592.f22868;
                return variant == Variant.NEUTRAL ? Double.valueOf(2.2d) : variant == Variant.TONAL_SPOT ? Double.valueOf(1.7d) : variant == Variant.EXPRESSIVE ? c82592.f22871.f22877.m13801() ? Double.valueOf(2.3d) : Double.valueOf(1.6d) : variant == Variant.VIBRANT ? Double.valueOf(1.29d) : Double.valueOf(1.0d);
            case 2:
                C8259 c82593 = (C8259) obj;
                c82593.getClass();
                C8262 c8262 = c82593.f22865;
                boolean z = c82593.f22867;
                DynamicScheme$Platform dynamicScheme$Platform = c82593.f22874;
                DynamicScheme$Platform dynamicScheme$Platform2 = DynamicScheme$Platform.WATCH;
                Variant variant2 = c82593.f22868;
                if (dynamicScheme$Platform == dynamicScheme$Platform2) {
                    if (variant2 != Variant.NEUTRAL) {
                        dM82812 = C3885.m8281(c8262, 0.0d, 90.0d);
                    }
                } else if (variant2 == Variant.NEUTRAL) {
                    dM82812 = z ? C3885.m8280(c8262, 0.0d, 98.0d) : C3885.m8281(c8262, 0.0d, 100.0d);
                } else if (variant2 == Variant.VIBRANT) {
                    dM82812 = C3885.m8281(c8262, 0.0d, z ? 90 : 98);
                } else {
                    dM82812 = z ? 80.0d : C3885.m8281(c8262, 0.0d, 100.0d);
                }
                return Double.valueOf(dM82812);
            case 3:
                C8259 c82594 = (C8259) obj;
                c82594.getClass();
                return c82594.f22866;
            case 4:
                ((C8259) obj).getClass();
                return c3811.mo8178();
            case 5:
                ((C8259) obj).getClass();
                return C3885.m8283(7.0d);
            case 6:
                C8259 c82595 = (C8259) obj;
                c82595.getClass();
                return c82595.f22871;
            case 7:
                C8259 c82596 = (C8259) obj;
                c82596.getClass();
                if (c82596.f22874 != DynamicScheme$Platform.PHONE) {
                    d = 15.0d;
                } else if (c82596.f22867) {
                    d = 6.0d;
                } else if (c82596.f22871.f22877.m13801()) {
                    d = 98.0d;
                } else if (c82596.f22868 != Variant.VIBRANT) {
                    d = 96.0d;
                }
                return Double.valueOf(d);
            case 8:
                C8259 c82597 = (C8259) obj;
                Double dValueOf = Double.valueOf(1.3d);
                c82597.getClass();
                if (c82597.f22874 == DynamicScheme$Platform.PHONE) {
                    Variant variant3 = c82597.f22868;
                    if (variant3 == Variant.NEUTRAL) {
                        return dValueOf;
                    }
                    if (variant3 == Variant.TONAL_SPOT) {
                        return Double.valueOf(1.25d);
                    }
                    if (variant3 == Variant.EXPRESSIVE) {
                        return c82597.f22871.f22877.m13801() ? dValueOf : Double.valueOf(1.15d);
                    }
                    if (variant3 == Variant.VIBRANT) {
                        return Double.valueOf(1.08d);
                    }
                }
                return Double.valueOf(1.0d);
            case 9:
                C8259 c82598 = (C8259) obj;
                c82598.getClass();
                return c82598.f22871;
            case 10:
                C8259 c82599 = (C8259) obj;
                c82599.getClass();
                return Double.valueOf(c82599.f22867 ? 98.0d : 4.0d);
            case 11:
                C8259 c825910 = (C8259) obj;
                c825910.getClass();
                return c825910.f22871;
            case 12:
                C8259 c825911 = (C8259) obj;
                c825911.getClass();
                return Double.valueOf(c825911.f22874 == DynamicScheme$Platform.PHONE ? c825911.f22867 ? 12.0d : c825911.f22871.f22877.m13801() ? 94.0d : c825911.f22868 == Variant.VIBRANT ? 90.0d : 92.0d : 25.0d);
            case 13:
                C8259 c825912 = (C8259) obj;
                c825912.getClass();
                if (c825912.f22874 == DynamicScheme$Platform.PHONE) {
                    Variant variant4 = c825912.f22868;
                    if (variant4 == Variant.NEUTRAL) {
                        return Double.valueOf(1.9d);
                    }
                    if (variant4 == Variant.TONAL_SPOT) {
                        return Double.valueOf(1.5d);
                    }
                    if (variant4 == Variant.EXPRESSIVE) {
                        return c825912.f22871.f22877.m13801() ? Double.valueOf(1.95d) : Double.valueOf(1.45d);
                    }
                    if (variant4 == Variant.VIBRANT) {
                        return Double.valueOf(1.22d);
                    }
                }
                return Double.valueOf(1.0d);
            case 14:
                C8259 c825913 = (C8259) obj;
                c825913.getClass();
                return c825913.f22865;
            case 15:
                ((C8259) obj).getClass();
                return c3811.mo8175();
            case 16:
                ((C8259) obj).getClass();
                return C3885.m8283(4.5d);
            case 17:
                C8259 c825914 = (C8259) obj;
                c825914.getClass();
                return c825914.f22875;
            case 18:
                ((C8259) obj).getClass();
                return c3811.mo8167();
            case 19:
                C8259 c825915 = (C8259) obj;
                c825915.getClass();
                return c825915.f22874 == DynamicScheme$Platform.PHONE ? C3885.m8283(4.5d) : C3885.m8283(7.0d);
            case 20:
                C8259 c825916 = (C8259) obj;
                c825916.getClass();
                return c825916.f22865;
            case 21:
                C8259 c825917 = (C8259) obj;
                c825917.getClass();
                C8262 c82622 = c825917.f22865;
                boolean z2 = c825917.f22867;
                if (c825917.f22874 == DynamicScheme$Platform.WATCH) {
                    dM8280 = 30.0d;
                } else {
                    Variant variant5 = c825917.f22868;
                    dM8280 = variant5 == Variant.VIBRANT ? z2 ? C3885.m8280(c82622, 30.0d, 40.0d) : C3885.m8281(c82622, 84.0d, 90.0d) : variant5 == Variant.EXPRESSIVE ? z2 ? 15.0d : C3885.m8281(c82622, 90.0d, 95.0d) : z2 ? 25.0d : 90.0d;
                }
                return Double.valueOf(dM8280);
            case 22:
                C8259 c825918 = (C8259) obj;
                c825918.getClass();
                return c825918.f22874 == DynamicScheme$Platform.PHONE ? C3885.m8283(4.5d) : C3885.m8283(7.0d);
            case 23:
                ((C8259) obj).getClass();
                C8260 c8260 = DynamicScheme$Platform.Companion;
                return null;
            case 24:
                C8259 c825919 = (C8259) obj;
                c825919.getClass();
                return c825919.f22871;
            case 25:
                C8259 c825920 = (C8259) obj;
                c825920.getClass();
                if (c825920.f22874 != DynamicScheme$Platform.PHONE) {
                    return Double.valueOf(1.0d);
                }
                Variant variant6 = c825920.f22868;
                return Double.valueOf(variant6 == Variant.NEUTRAL ? 2.2d : variant6 == Variant.TONAL_SPOT ? 1.7d : variant6 == Variant.EXPRESSIVE ? c825920.f22871.f22877.m13801() ? c825920.f22867 ? 3.0d : 2.3d : 1.6d : 1.0d);
            case 26:
                C8259 c825921 = (C8259) obj;
                c825921.getClass();
                return c825921.f22874 == DynamicScheme$Platform.PHONE ? c825921.f22867 ? c3811.mo8172() : c3811.mo8173() : c3811.m8158();
            case 27:
                C8259 c825922 = (C8259) obj;
                c825922.getClass();
                return c825922.f22874 == DynamicScheme$Platform.PHONE ? C3885.m8283(3.0d) : C3885.m8283(4.5d);
            case 28:
                C8259 c825923 = (C8259) obj;
                c825923.getClass();
                return c825923.f22864;
            default:
                C8259 c825924 = (C8259) obj;
                c825924.getClass();
                C8262 c82623 = c825924.f22864;
                boolean z3 = c825924.f22867;
                DynamicScheme$Platform dynamicScheme$Platform3 = c825924.f22874;
                DynamicScheme$Platform dynamicScheme$Platform4 = DynamicScheme$Platform.WATCH;
                Variant variant7 = c825924.f22868;
                if (dynamicScheme$Platform3 == dynamicScheme$Platform4) {
                    dM8281 = variant7 == Variant.TONAL_SPOT ? C3885.m8281(c82623, 0.0d, 90.0d) : C3885.m8281(c82623, 0.0d, 100.0d);
                } else if (variant7 == Variant.NEUTRAL) {
                    dM8281 = z3 ? C3885.m8281(c82623, 0.0d, 93.0d) : C3885.m8281(c82623, 0.0d, 96.0d);
                } else {
                    if (variant7 == Variant.TONAL_SPOT) {
                        dM8281 = C3885.m8281(c82623, 0.0d, z3 ? 93 : 100);
                    } else if (variant7 == Variant.EXPRESSIVE) {
                        if (c82623.f22877.m13802()) {
                            i = 88;
                        } else if (z3) {
                            i = 93;
                        }
                        dM8281 = C3885.m8281(c82623, 75.0d, i);
                    } else {
                        dM8281 = z3 ? C3885.m8281(c82623, 0.0d, 93.0d) : C3885.m8281(c82623, 72.0d, 100.0d);
                    }
                }
                return Double.valueOf(dM8281);
        }
    }
}
