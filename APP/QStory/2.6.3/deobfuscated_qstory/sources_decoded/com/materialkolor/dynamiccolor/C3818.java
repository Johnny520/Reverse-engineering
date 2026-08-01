package com.materialkolor.dynamiccolor;

import com.materialkolor.scheme.DynamicScheme$Platform;
import com.materialkolor.scheme.Variant;
import io.ktor.client.plugins.api.C3886;
import p052.InterfaceC6558;
import p265.C8260;
import p265.C8261;
import p266.C8263;

/* JADX INFO: renamed from: com.materialkolor.dynamiccolor.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3818 implements InterfaceC6558 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f12010;

    public /* synthetic */ C3818(int i) {
        this.f12010 = i;
    }

    @Override // p052.InterfaceC6558
    public final Object invoke(Object obj) {
        double dM8262;
        int i = this.f12010;
        double d = 1.6d;
        double d2 = 98.0d;
        C3812 c3812 = C3796.f11962;
        switch (i) {
            case 0:
                C8260 c8260 = (C8260) obj;
                c8260.getClass();
                return c8260.f22870;
            case 1:
                C8260 c82602 = (C8260) obj;
                c82602.getClass();
                if (c82602.f22873 != DynamicScheme$Platform.PHONE) {
                    return Double.valueOf(1.0d);
                }
                Variant variant = c82602.f22867;
                if (variant == Variant.NEUTRAL) {
                    d = 2.2d;
                } else if (variant == Variant.TONAL_SPOT) {
                    d = 1.7d;
                } else if (variant != Variant.EXPRESSIVE) {
                    d = 1.0d;
                } else if (c82602.f22870.f22876.m13818()) {
                    d = c82602.f22866 ? 3.0d : 2.3d;
                }
                return Double.valueOf(d);
            case 2:
                C8260 c82603 = (C8260) obj;
                c82603.getClass();
                return c82603.f22873 == DynamicScheme$Platform.PHONE ? c82603.f22866 ? C3886.m8268(6.0d) : C3886.m8268(4.5d) : C3886.m8268(7.0d);
            case 3:
                C8260 c82604 = (C8260) obj;
                c82604.getClass();
                return c82604.f22863;
            case 4:
                C8260 c82605 = (C8260) obj;
                c82605.getClass();
                return c82605.f22865;
            case 5:
                C8260 c82606 = (C8260) obj;
                c82606.getClass();
                return c82606.f22873 == DynamicScheme$Platform.PHONE ? c3812.mo8166() : c3812.m8148();
            case 6:
                C8260 c82607 = (C8260) obj;
                c82607.getClass();
                return c82607.f22873 == DynamicScheme$Platform.PHONE ? C3886.m8268(6.0d) : C3886.m8268(7.0d);
            case 7:
                ((C8260) obj).getClass();
                return c3812.mo8141();
            case 8:
                C8260 c82608 = (C8260) obj;
                c82608.getClass();
                return Double.valueOf(c82608.f22873 != DynamicScheme$Platform.WATCH ? c3812.m8150().m8136(c82608) : 100.0d);
            case 9:
                C8260 c82609 = (C8260) obj;
                c82609.getClass();
                return c82609.f22863;
            case 10:
                C8260 c826010 = (C8260) obj;
                c826010.getClass();
                C8263 c8263 = c826010.f22863;
                boolean z = c826010.f22866;
                DynamicScheme$Platform dynamicScheme$Platform = c826010.f22873;
                DynamicScheme$Platform dynamicScheme$Platform2 = DynamicScheme$Platform.WATCH;
                Variant variant2 = c826010.f22867;
                if (dynamicScheme$Platform == dynamicScheme$Platform2) {
                    dM8262 = variant2 == Variant.TONAL_SPOT ? C3886.m8262(c8263, 0.0d, 90.0d) : C3886.m8262(c8263, 0.0d, 100.0d);
                } else if (variant2 == Variant.EXPRESSIVE || variant2 == Variant.VIBRANT) {
                    dM8262 = C3886.m8262(c8263, 0.0d, c8263.f22876.m13819() ? 88 : z ? 98 : 100);
                } else {
                    dM8262 = z ? C3886.m8262(c8263, 0.0d, 98.0d) : C3886.m8262(c8263, 0.0d, 100.0d);
                }
                return Double.valueOf(dM8262);
            case 11:
                C8260 c826011 = (C8260) obj;
                c826011.getClass();
                return c826011.f22873 == DynamicScheme$Platform.PHONE ? C3886.m8268(4.5d) : C3886.m8268(7.0d);
            case 12:
                C8260 c826012 = (C8260) obj;
                c826012.getClass();
                return c826012.f22864;
            case 13:
                C8260 c826013 = (C8260) obj;
                c826013.getClass();
                return c826013.f22865;
            case 14:
                ((C8260) obj).getClass();
                return C3886.m8268(7.0d);
            case 15:
                C8260 c826014 = (C8260) obj;
                c826014.getClass();
                return c826014.f22864;
            case 16:
                ((C8260) obj).getClass();
                C8261 c8261 = DynamicScheme$Platform.Companion;
                return null;
            case 17:
                C8260 c826015 = (C8260) obj;
                c826015.getClass();
                return c826015.f22874;
            case 18:
                C8260 c826016 = (C8260) obj;
                c826016.getClass();
                return c826016.f22873 == DynamicScheme$Platform.PHONE ? c3812.mo8155() : c3812.m8140();
            case 19:
                C8260 c826017 = (C8260) obj;
                c826017.getClass();
                return c826017.f22873 == DynamicScheme$Platform.PHONE ? C3886.m8268(6.0d) : C3886.m8268(7.0d);
            case 20:
                C8260 c826018 = (C8260) obj;
                c826018.getClass();
                return c826018.f22870;
            case 21:
                C8260 c826019 = (C8260) obj;
                c826019.getClass();
                return c826019.f22864;
            case 22:
                C8260 c826020 = (C8260) obj;
                c826020.getClass();
                if (c826020.f22873 != DynamicScheme$Platform.PHONE) {
                    return Double.valueOf(1.0d);
                }
                Variant variant3 = c826020.f22867;
                if (variant3 == Variant.NEUTRAL) {
                    d = 2.2d;
                } else if (variant3 == Variant.TONAL_SPOT) {
                    d = 1.7d;
                } else if (variant3 != Variant.EXPRESSIVE) {
                    d = variant3 == Variant.VIBRANT ? 1.29d : 1.0d;
                } else if (c826020.f22870.f22876.m13818()) {
                    d = c826020.f22866 ? 3.0d : 2.3d;
                }
                return Double.valueOf(d);
            case 23:
                C8260 c826021 = (C8260) obj;
                c826021.getClass();
                return c826021.f22873 == DynamicScheme$Platform.PHONE ? c826021.f22866 ? c3812.mo8159() : c3812.mo8160() : c3812.m8145();
            case 24:
                C8260 c826022 = (C8260) obj;
                c826022.getClass();
                return c826022.f22873 == DynamicScheme$Platform.PHONE ? C3886.m8268(1.5d) : C3886.m8268(3.0d);
            case 25:
                C8260 c826023 = (C8260) obj;
                c826023.getClass();
                return c826023.f22870;
            case 26:
                C8260 c826024 = (C8260) obj;
                c826024.getClass();
                if (c826024.f22866) {
                    d2 = 18.0d;
                } else if (c826024.f22870.f22876.m13818()) {
                    d2 = 99.0d;
                } else if (c826024.f22867 == Variant.VIBRANT) {
                    d2 = 97.0d;
                }
                return Double.valueOf(d2);
            case 27:
                C8260 c826025 = (C8260) obj;
                c826025.getClass();
                if (c826025.f22866) {
                    Variant variant4 = c826025.f22867;
                    if (variant4 == Variant.NEUTRAL) {
                        return Double.valueOf(2.5d);
                    }
                    if (variant4 == Variant.TONAL_SPOT) {
                        return Double.valueOf(1.7d);
                    }
                    if (variant4 == Variant.EXPRESSIVE) {
                        return c826025.f22870.f22876.m13818() ? Double.valueOf(2.7d) : Double.valueOf(1.75d);
                    }
                    if (variant4 == Variant.VIBRANT) {
                        return Double.valueOf(1.36d);
                    }
                }
                return Double.valueOf(1.0d);
            case 28:
                C8260 c826026 = (C8260) obj;
                c826026.getClass();
                return c826026.f22863;
            default:
                ((C8260) obj).getClass();
                return c3812.mo8141();
        }
    }
}
