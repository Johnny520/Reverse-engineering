package com.materialkolor.dynamiccolor;

import com.materialkolor.scheme.DynamicScheme$Platform;
import com.materialkolor.scheme.Variant;
import io.ktor.client.plugins.api.C3885;
import p052.InterfaceC6557;
import p265.C8259;
import p265.C8260;
import p266.C8262;

/* JADX INFO: renamed from: com.materialkolor.dynamiccolor.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3817 implements InterfaceC6557 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f12005;

    public /* synthetic */ C3817(int i) {
        this.f12005 = i;
    }

    @Override // p052.InterfaceC6557
    public final Object invoke(Object obj) {
        double dM8281;
        int i = this.f12005;
        double d = 1.6d;
        double d2 = 98.0d;
        C3811 c3811 = C3795.f11957;
        switch (i) {
            case 0:
                C8259 c8259 = (C8259) obj;
                c8259.getClass();
                return c8259.f22871;
            case 1:
                C8259 c82592 = (C8259) obj;
                c82592.getClass();
                if (c82592.f22874 != DynamicScheme$Platform.PHONE) {
                    return Double.valueOf(1.0d);
                }
                Variant variant = c82592.f22868;
                if (variant == Variant.NEUTRAL) {
                    d = 2.2d;
                } else if (variant == Variant.TONAL_SPOT) {
                    d = 1.7d;
                } else if (variant != Variant.EXPRESSIVE) {
                    d = 1.0d;
                } else if (c82592.f22871.f22877.m13801()) {
                    d = c82592.f22867 ? 3.0d : 2.3d;
                }
                return Double.valueOf(d);
            case 2:
                C8259 c82593 = (C8259) obj;
                c82593.getClass();
                return c82593.f22874 == DynamicScheme$Platform.PHONE ? c82593.f22867 ? C3885.m8283(6.0d) : C3885.m8283(4.5d) : C3885.m8283(7.0d);
            case 3:
                C8259 c82594 = (C8259) obj;
                c82594.getClass();
                return c82594.f22864;
            case 4:
                C8259 c82595 = (C8259) obj;
                c82595.getClass();
                return c82595.f22866;
            case 5:
                C8259 c82596 = (C8259) obj;
                c82596.getClass();
                return c82596.f22874 == DynamicScheme$Platform.PHONE ? c3811.mo8179() : c3811.m8161();
            case 6:
                C8259 c82597 = (C8259) obj;
                c82597.getClass();
                return c82597.f22874 == DynamicScheme$Platform.PHONE ? C3885.m8283(6.0d) : C3885.m8283(7.0d);
            case 7:
                ((C8259) obj).getClass();
                return c3811.mo8154();
            case 8:
                C8259 c82598 = (C8259) obj;
                c82598.getClass();
                return Double.valueOf(c82598.f22874 != DynamicScheme$Platform.WATCH ? c3811.m8163().m8149(c82598) : 100.0d);
            case 9:
                C8259 c82599 = (C8259) obj;
                c82599.getClass();
                return c82599.f22864;
            case 10:
                C8259 c825910 = (C8259) obj;
                c825910.getClass();
                C8262 c8262 = c825910.f22864;
                boolean z = c825910.f22867;
                DynamicScheme$Platform dynamicScheme$Platform = c825910.f22874;
                DynamicScheme$Platform dynamicScheme$Platform2 = DynamicScheme$Platform.WATCH;
                Variant variant2 = c825910.f22868;
                if (dynamicScheme$Platform == dynamicScheme$Platform2) {
                    dM8281 = variant2 == Variant.TONAL_SPOT ? C3885.m8281(c8262, 0.0d, 90.0d) : C3885.m8281(c8262, 0.0d, 100.0d);
                } else if (variant2 == Variant.EXPRESSIVE || variant2 == Variant.VIBRANT) {
                    dM8281 = C3885.m8281(c8262, 0.0d, c8262.f22877.m13802() ? 88 : z ? 98 : 100);
                } else {
                    dM8281 = z ? C3885.m8281(c8262, 0.0d, 98.0d) : C3885.m8281(c8262, 0.0d, 100.0d);
                }
                return Double.valueOf(dM8281);
            case 11:
                C8259 c825911 = (C8259) obj;
                c825911.getClass();
                return c825911.f22874 == DynamicScheme$Platform.PHONE ? C3885.m8283(4.5d) : C3885.m8283(7.0d);
            case 12:
                C8259 c825912 = (C8259) obj;
                c825912.getClass();
                return c825912.f22865;
            case 13:
                C8259 c825913 = (C8259) obj;
                c825913.getClass();
                return c825913.f22866;
            case 14:
                ((C8259) obj).getClass();
                return C3885.m8283(7.0d);
            case 15:
                C8259 c825914 = (C8259) obj;
                c825914.getClass();
                return c825914.f22865;
            case 16:
                ((C8259) obj).getClass();
                C8260 c8260 = DynamicScheme$Platform.Companion;
                return null;
            case 17:
                C8259 c825915 = (C8259) obj;
                c825915.getClass();
                return c825915.f22875;
            case 18:
                C8259 c825916 = (C8259) obj;
                c825916.getClass();
                return c825916.f22874 == DynamicScheme$Platform.PHONE ? c3811.mo8168() : c3811.m8153();
            case 19:
                C8259 c825917 = (C8259) obj;
                c825917.getClass();
                return c825917.f22874 == DynamicScheme$Platform.PHONE ? C3885.m8283(6.0d) : C3885.m8283(7.0d);
            case 20:
                C8259 c825918 = (C8259) obj;
                c825918.getClass();
                return c825918.f22871;
            case 21:
                C8259 c825919 = (C8259) obj;
                c825919.getClass();
                return c825919.f22865;
            case 22:
                C8259 c825920 = (C8259) obj;
                c825920.getClass();
                if (c825920.f22874 != DynamicScheme$Platform.PHONE) {
                    return Double.valueOf(1.0d);
                }
                Variant variant3 = c825920.f22868;
                if (variant3 == Variant.NEUTRAL) {
                    d = 2.2d;
                } else if (variant3 == Variant.TONAL_SPOT) {
                    d = 1.7d;
                } else if (variant3 != Variant.EXPRESSIVE) {
                    d = variant3 == Variant.VIBRANT ? 1.29d : 1.0d;
                } else if (c825920.f22871.f22877.m13801()) {
                    d = c825920.f22867 ? 3.0d : 2.3d;
                }
                return Double.valueOf(d);
            case 23:
                C8259 c825921 = (C8259) obj;
                c825921.getClass();
                return c825921.f22874 == DynamicScheme$Platform.PHONE ? c825921.f22867 ? c3811.mo8172() : c3811.mo8173() : c3811.m8158();
            case 24:
                C8259 c825922 = (C8259) obj;
                c825922.getClass();
                return c825922.f22874 == DynamicScheme$Platform.PHONE ? C3885.m8283(1.5d) : C3885.m8283(3.0d);
            case 25:
                C8259 c825923 = (C8259) obj;
                c825923.getClass();
                return c825923.f22871;
            case 26:
                C8259 c825924 = (C8259) obj;
                c825924.getClass();
                if (c825924.f22867) {
                    d2 = 18.0d;
                } else if (c825924.f22871.f22877.m13801()) {
                    d2 = 99.0d;
                } else if (c825924.f22868 == Variant.VIBRANT) {
                    d2 = 97.0d;
                }
                return Double.valueOf(d2);
            case 27:
                C8259 c825925 = (C8259) obj;
                c825925.getClass();
                if (c825925.f22867) {
                    Variant variant4 = c825925.f22868;
                    if (variant4 == Variant.NEUTRAL) {
                        return Double.valueOf(2.5d);
                    }
                    if (variant4 == Variant.TONAL_SPOT) {
                        return Double.valueOf(1.7d);
                    }
                    if (variant4 == Variant.EXPRESSIVE) {
                        return c825925.f22871.f22877.m13801() ? Double.valueOf(2.7d) : Double.valueOf(1.75d);
                    }
                    if (variant4 == Variant.VIBRANT) {
                        return Double.valueOf(1.36d);
                    }
                }
                return Double.valueOf(1.0d);
            case 28:
                C8259 c825926 = (C8259) obj;
                c825926.getClass();
                return c825926.f22864;
            default:
                ((C8259) obj).getClass();
                return c3811.mo8154();
        }
    }
}
