package com.materialkolor.dynamiccolor;

import com.materialkolor.scheme.DynamicScheme$Platform;
import com.materialkolor.scheme.Variant;
import io.ktor.client.plugins.api.C3886;
import p052.InterfaceC6558;
import p265.C8260;
import p265.C8261;
import p266.C8263;

/* JADX INFO: renamed from: com.materialkolor.dynamiccolor.飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3814 implements InterfaceC6558 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f12007;

    public /* synthetic */ C3814(int i) {
        this.f12007 = i;
    }

    @Override // p052.InterfaceC6558
    public final Object invoke(Object obj) {
        double dM8261;
        double dM8262;
        int i = this.f12007;
        double d = 95.0d;
        C3812 c3812 = C3796.f11962;
        double dM82622 = 90.0d;
        switch (i) {
            case 0:
                C8260 c8260 = (C8260) obj;
                c8260.getClass();
                return Double.valueOf(c8260.f22866 ? 15.0d : c8260.f22870.f22876.m13818() ? 92.0d : c8260.f22867 == Variant.VIBRANT ? 88.0d : 90.0d);
            case 1:
                C8260 c82602 = (C8260) obj;
                c82602.getClass();
                Variant variant = c82602.f22867;
                return variant == Variant.NEUTRAL ? Double.valueOf(2.2d) : variant == Variant.TONAL_SPOT ? Double.valueOf(1.7d) : variant == Variant.EXPRESSIVE ? c82602.f22870.f22876.m13818() ? Double.valueOf(2.3d) : Double.valueOf(1.6d) : variant == Variant.VIBRANT ? Double.valueOf(1.29d) : Double.valueOf(1.0d);
            case 2:
                C8260 c82603 = (C8260) obj;
                c82603.getClass();
                C8263 c8263 = c82603.f22864;
                boolean z = c82603.f22866;
                DynamicScheme$Platform dynamicScheme$Platform = c82603.f22873;
                DynamicScheme$Platform dynamicScheme$Platform2 = DynamicScheme$Platform.WATCH;
                Variant variant2 = c82603.f22867;
                if (dynamicScheme$Platform == dynamicScheme$Platform2) {
                    if (variant2 != Variant.NEUTRAL) {
                        dM82622 = C3886.m8262(c8263, 0.0d, 90.0d);
                    }
                } else if (variant2 == Variant.NEUTRAL) {
                    dM82622 = z ? C3886.m8261(c8263, 0.0d, 98.0d) : C3886.m8262(c8263, 0.0d, 100.0d);
                } else if (variant2 == Variant.VIBRANT) {
                    dM82622 = C3886.m8262(c8263, 0.0d, z ? 90 : 98);
                } else {
                    dM82622 = z ? 80.0d : C3886.m8262(c8263, 0.0d, 100.0d);
                }
                return Double.valueOf(dM82622);
            case 3:
                C8260 c82604 = (C8260) obj;
                c82604.getClass();
                return c82604.f22865;
            case 4:
                ((C8260) obj).getClass();
                return c3812.mo8165();
            case 5:
                ((C8260) obj).getClass();
                return C3886.m8268(7.0d);
            case 6:
                C8260 c82605 = (C8260) obj;
                c82605.getClass();
                return c82605.f22870;
            case 7:
                C8260 c82606 = (C8260) obj;
                c82606.getClass();
                if (c82606.f22873 != DynamicScheme$Platform.PHONE) {
                    d = 15.0d;
                } else if (c82606.f22866) {
                    d = 6.0d;
                } else if (c82606.f22870.f22876.m13818()) {
                    d = 98.0d;
                } else if (c82606.f22867 != Variant.VIBRANT) {
                    d = 96.0d;
                }
                return Double.valueOf(d);
            case 8:
                C8260 c82607 = (C8260) obj;
                Double dValueOf = Double.valueOf(1.3d);
                c82607.getClass();
                if (c82607.f22873 == DynamicScheme$Platform.PHONE) {
                    Variant variant3 = c82607.f22867;
                    if (variant3 == Variant.NEUTRAL) {
                        return dValueOf;
                    }
                    if (variant3 == Variant.TONAL_SPOT) {
                        return Double.valueOf(1.25d);
                    }
                    if (variant3 == Variant.EXPRESSIVE) {
                        return c82607.f22870.f22876.m13818() ? dValueOf : Double.valueOf(1.15d);
                    }
                    if (variant3 == Variant.VIBRANT) {
                        return Double.valueOf(1.08d);
                    }
                }
                return Double.valueOf(1.0d);
            case 9:
                C8260 c82608 = (C8260) obj;
                c82608.getClass();
                return c82608.f22870;
            case 10:
                C8260 c82609 = (C8260) obj;
                c82609.getClass();
                return Double.valueOf(c82609.f22866 ? 98.0d : 4.0d);
            case 11:
                C8260 c826010 = (C8260) obj;
                c826010.getClass();
                return c826010.f22870;
            case 12:
                C8260 c826011 = (C8260) obj;
                c826011.getClass();
                return Double.valueOf(c826011.f22873 == DynamicScheme$Platform.PHONE ? c826011.f22866 ? 12.0d : c826011.f22870.f22876.m13818() ? 94.0d : c826011.f22867 == Variant.VIBRANT ? 90.0d : 92.0d : 25.0d);
            case 13:
                C8260 c826012 = (C8260) obj;
                c826012.getClass();
                if (c826012.f22873 == DynamicScheme$Platform.PHONE) {
                    Variant variant4 = c826012.f22867;
                    if (variant4 == Variant.NEUTRAL) {
                        return Double.valueOf(1.9d);
                    }
                    if (variant4 == Variant.TONAL_SPOT) {
                        return Double.valueOf(1.5d);
                    }
                    if (variant4 == Variant.EXPRESSIVE) {
                        return c826012.f22870.f22876.m13818() ? Double.valueOf(1.95d) : Double.valueOf(1.45d);
                    }
                    if (variant4 == Variant.VIBRANT) {
                        return Double.valueOf(1.22d);
                    }
                }
                return Double.valueOf(1.0d);
            case 14:
                C8260 c826013 = (C8260) obj;
                c826013.getClass();
                return c826013.f22864;
            case 15:
                ((C8260) obj).getClass();
                return c3812.mo8162();
            case 16:
                ((C8260) obj).getClass();
                return C3886.m8268(4.5d);
            case 17:
                C8260 c826014 = (C8260) obj;
                c826014.getClass();
                return c826014.f22874;
            case 18:
                ((C8260) obj).getClass();
                return c3812.mo8154();
            case 19:
                C8260 c826015 = (C8260) obj;
                c826015.getClass();
                return c826015.f22873 == DynamicScheme$Platform.PHONE ? C3886.m8268(4.5d) : C3886.m8268(7.0d);
            case 20:
                C8260 c826016 = (C8260) obj;
                c826016.getClass();
                return c826016.f22864;
            case 21:
                C8260 c826017 = (C8260) obj;
                c826017.getClass();
                C8263 c82632 = c826017.f22864;
                boolean z2 = c826017.f22866;
                if (c826017.f22873 == DynamicScheme$Platform.WATCH) {
                    dM8261 = 30.0d;
                } else {
                    Variant variant5 = c826017.f22867;
                    dM8261 = variant5 == Variant.VIBRANT ? z2 ? C3886.m8261(c82632, 30.0d, 40.0d) : C3886.m8262(c82632, 84.0d, 90.0d) : variant5 == Variant.EXPRESSIVE ? z2 ? 15.0d : C3886.m8262(c82632, 90.0d, 95.0d) : z2 ? 25.0d : 90.0d;
                }
                return Double.valueOf(dM8261);
            case 22:
                C8260 c826018 = (C8260) obj;
                c826018.getClass();
                return c826018.f22873 == DynamicScheme$Platform.PHONE ? C3886.m8268(4.5d) : C3886.m8268(7.0d);
            case 23:
                ((C8260) obj).getClass();
                C8261 c8261 = DynamicScheme$Platform.Companion;
                return null;
            case 24:
                C8260 c826019 = (C8260) obj;
                c826019.getClass();
                return c826019.f22870;
            case 25:
                C8260 c826020 = (C8260) obj;
                c826020.getClass();
                if (c826020.f22873 != DynamicScheme$Platform.PHONE) {
                    return Double.valueOf(1.0d);
                }
                Variant variant6 = c826020.f22867;
                return Double.valueOf(variant6 == Variant.NEUTRAL ? 2.2d : variant6 == Variant.TONAL_SPOT ? 1.7d : variant6 == Variant.EXPRESSIVE ? c826020.f22870.f22876.m13818() ? c826020.f22866 ? 3.0d : 2.3d : 1.6d : 1.0d);
            case 26:
                C8260 c826021 = (C8260) obj;
                c826021.getClass();
                return c826021.f22873 == DynamicScheme$Platform.PHONE ? c826021.f22866 ? c3812.mo8159() : c3812.mo8160() : c3812.m8145();
            case 27:
                C8260 c826022 = (C8260) obj;
                c826022.getClass();
                return c826022.f22873 == DynamicScheme$Platform.PHONE ? C3886.m8268(3.0d) : C3886.m8268(4.5d);
            case 28:
                C8260 c826023 = (C8260) obj;
                c826023.getClass();
                return c826023.f22863;
            default:
                C8260 c826024 = (C8260) obj;
                c826024.getClass();
                C8263 c82633 = c826024.f22863;
                boolean z3 = c826024.f22866;
                DynamicScheme$Platform dynamicScheme$Platform3 = c826024.f22873;
                DynamicScheme$Platform dynamicScheme$Platform4 = DynamicScheme$Platform.WATCH;
                Variant variant7 = c826024.f22867;
                if (dynamicScheme$Platform3 == dynamicScheme$Platform4) {
                    dM8262 = variant7 == Variant.TONAL_SPOT ? C3886.m8262(c82633, 0.0d, 90.0d) : C3886.m8262(c82633, 0.0d, 100.0d);
                } else if (variant7 == Variant.NEUTRAL) {
                    dM8262 = z3 ? C3886.m8262(c82633, 0.0d, 93.0d) : C3886.m8262(c82633, 0.0d, 96.0d);
                } else {
                    if (variant7 == Variant.TONAL_SPOT) {
                        dM8262 = C3886.m8262(c82633, 0.0d, z3 ? 93 : 100);
                    } else if (variant7 == Variant.EXPRESSIVE) {
                        if (c82633.f22876.m13819()) {
                            i = 88;
                        } else if (z3) {
                            i = 93;
                        }
                        dM8262 = C3886.m8262(c82633, 75.0d, i);
                    } else {
                        dM8262 = z3 ? C3886.m8262(c82633, 0.0d, 93.0d) : C3886.m8262(c82633, 72.0d, 100.0d);
                    }
                }
                return Double.valueOf(dM8262);
        }
    }
}
