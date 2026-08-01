package com.materialkolor.dynamiccolor;

import com.materialkolor.scheme.DynamicScheme$Platform;
import com.materialkolor.scheme.Variant;
import io.ktor.client.plugins.api.C4718;
import p068.InterfaceC7387;
import p281.C9089;
import p281.C9090;
import p282.C9092;

/* JADX INFO: renamed from: com.materialkolor.dynamiccolor.飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4646 implements InterfaceC7387 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f12352;

    public /* synthetic */ C4646(int i) {
        this.f12352 = i;
    }

    @Override // p068.InterfaceC7387
    public final Object invoke(Object obj) {
        double dM8820;
        double dM8821;
        int i = this.f12352;
        double d = 95.0d;
        C4644 c4644 = C4628.f12307;
        double dM88212 = 90.0d;
        switch (i) {
            case 0:
                C9089 c9089 = (C9089) obj;
                c9089.getClass();
                return Double.valueOf(c9089.f23211 ? 15.0d : c9089.f23215.f23221.m14377() ? 92.0d : c9089.f23212 == Variant.VIBRANT ? 88.0d : 90.0d);
            case 1:
                C9089 c90892 = (C9089) obj;
                c90892.getClass();
                Variant variant = c90892.f23212;
                return variant == Variant.NEUTRAL ? Double.valueOf(2.2d) : variant == Variant.TONAL_SPOT ? Double.valueOf(1.7d) : variant == Variant.EXPRESSIVE ? c90892.f23215.f23221.m14377() ? Double.valueOf(2.3d) : Double.valueOf(1.6d) : variant == Variant.VIBRANT ? Double.valueOf(1.29d) : Double.valueOf(1.0d);
            case 2:
                C9089 c90893 = (C9089) obj;
                c90893.getClass();
                C9092 c9092 = c90893.f23209;
                boolean z = c90893.f23211;
                DynamicScheme$Platform dynamicScheme$Platform = c90893.f23218;
                DynamicScheme$Platform dynamicScheme$Platform2 = DynamicScheme$Platform.WATCH;
                Variant variant2 = c90893.f23212;
                if (dynamicScheme$Platform == dynamicScheme$Platform2) {
                    if (variant2 != Variant.NEUTRAL) {
                        dM88212 = C4718.m8821(c9092, 0.0d, 90.0d);
                    }
                } else if (variant2 == Variant.NEUTRAL) {
                    dM88212 = z ? C4718.m8820(c9092, 0.0d, 98.0d) : C4718.m8821(c9092, 0.0d, 100.0d);
                } else if (variant2 == Variant.VIBRANT) {
                    dM88212 = C4718.m8821(c9092, 0.0d, z ? 90 : 98);
                } else {
                    dM88212 = z ? 80.0d : C4718.m8821(c9092, 0.0d, 100.0d);
                }
                return Double.valueOf(dM88212);
            case 3:
                C9089 c90894 = (C9089) obj;
                c90894.getClass();
                return c90894.f23210;
            case 4:
                ((C9089) obj).getClass();
                return c4644.mo8724();
            case 5:
                ((C9089) obj).getClass();
                return C4718.m8827(7.0d);
            case 6:
                C9089 c90895 = (C9089) obj;
                c90895.getClass();
                return c90895.f23215;
            case 7:
                C9089 c90896 = (C9089) obj;
                c90896.getClass();
                if (c90896.f23218 != DynamicScheme$Platform.PHONE) {
                    d = 15.0d;
                } else if (c90896.f23211) {
                    d = 6.0d;
                } else if (c90896.f23215.f23221.m14377()) {
                    d = 98.0d;
                } else if (c90896.f23212 != Variant.VIBRANT) {
                    d = 96.0d;
                }
                return Double.valueOf(d);
            case 8:
                C9089 c90897 = (C9089) obj;
                Double dValueOf = Double.valueOf(1.3d);
                c90897.getClass();
                if (c90897.f23218 == DynamicScheme$Platform.PHONE) {
                    Variant variant3 = c90897.f23212;
                    if (variant3 == Variant.NEUTRAL) {
                        return dValueOf;
                    }
                    if (variant3 == Variant.TONAL_SPOT) {
                        return Double.valueOf(1.25d);
                    }
                    if (variant3 == Variant.EXPRESSIVE) {
                        return c90897.f23215.f23221.m14377() ? dValueOf : Double.valueOf(1.15d);
                    }
                    if (variant3 == Variant.VIBRANT) {
                        return Double.valueOf(1.08d);
                    }
                }
                return Double.valueOf(1.0d);
            case 9:
                C9089 c90898 = (C9089) obj;
                c90898.getClass();
                return c90898.f23215;
            case 10:
                C9089 c90899 = (C9089) obj;
                c90899.getClass();
                return Double.valueOf(c90899.f23211 ? 98.0d : 4.0d);
            case 11:
                C9089 c908910 = (C9089) obj;
                c908910.getClass();
                return c908910.f23215;
            case 12:
                C9089 c908911 = (C9089) obj;
                c908911.getClass();
                return Double.valueOf(c908911.f23218 == DynamicScheme$Platform.PHONE ? c908911.f23211 ? 12.0d : c908911.f23215.f23221.m14377() ? 94.0d : c908911.f23212 == Variant.VIBRANT ? 90.0d : 92.0d : 25.0d);
            case 13:
                C9089 c908912 = (C9089) obj;
                c908912.getClass();
                if (c908912.f23218 == DynamicScheme$Platform.PHONE) {
                    Variant variant4 = c908912.f23212;
                    if (variant4 == Variant.NEUTRAL) {
                        return Double.valueOf(1.9d);
                    }
                    if (variant4 == Variant.TONAL_SPOT) {
                        return Double.valueOf(1.5d);
                    }
                    if (variant4 == Variant.EXPRESSIVE) {
                        return c908912.f23215.f23221.m14377() ? Double.valueOf(1.95d) : Double.valueOf(1.45d);
                    }
                    if (variant4 == Variant.VIBRANT) {
                        return Double.valueOf(1.22d);
                    }
                }
                return Double.valueOf(1.0d);
            case 14:
                C9089 c908913 = (C9089) obj;
                c908913.getClass();
                return c908913.f23209;
            case 15:
                ((C9089) obj).getClass();
                return c4644.mo8721();
            case 16:
                ((C9089) obj).getClass();
                return C4718.m8827(4.5d);
            case 17:
                C9089 c908914 = (C9089) obj;
                c908914.getClass();
                return c908914.f23219;
            case 18:
                ((C9089) obj).getClass();
                return c4644.mo8713();
            case 19:
                C9089 c908915 = (C9089) obj;
                c908915.getClass();
                return c908915.f23218 == DynamicScheme$Platform.PHONE ? C4718.m8827(4.5d) : C4718.m8827(7.0d);
            case 20:
                C9089 c908916 = (C9089) obj;
                c908916.getClass();
                return c908916.f23209;
            case 21:
                C9089 c908917 = (C9089) obj;
                c908917.getClass();
                C9092 c90922 = c908917.f23209;
                boolean z2 = c908917.f23211;
                if (c908917.f23218 == DynamicScheme$Platform.WATCH) {
                    dM8820 = 30.0d;
                } else {
                    Variant variant5 = c908917.f23212;
                    dM8820 = variant5 == Variant.VIBRANT ? z2 ? C4718.m8820(c90922, 30.0d, 40.0d) : C4718.m8821(c90922, 84.0d, 90.0d) : variant5 == Variant.EXPRESSIVE ? z2 ? 15.0d : C4718.m8821(c90922, 90.0d, 95.0d) : z2 ? 25.0d : 90.0d;
                }
                return Double.valueOf(dM8820);
            case 22:
                C9089 c908918 = (C9089) obj;
                c908918.getClass();
                return c908918.f23218 == DynamicScheme$Platform.PHONE ? C4718.m8827(4.5d) : C4718.m8827(7.0d);
            case 23:
                ((C9089) obj).getClass();
                C9090 c9090 = DynamicScheme$Platform.Companion;
                return null;
            case 24:
                C9089 c908919 = (C9089) obj;
                c908919.getClass();
                return c908919.f23215;
            case 25:
                C9089 c908920 = (C9089) obj;
                c908920.getClass();
                if (c908920.f23218 != DynamicScheme$Platform.PHONE) {
                    return Double.valueOf(1.0d);
                }
                Variant variant6 = c908920.f23212;
                return Double.valueOf(variant6 == Variant.NEUTRAL ? 2.2d : variant6 == Variant.TONAL_SPOT ? 1.7d : variant6 == Variant.EXPRESSIVE ? c908920.f23215.f23221.m14377() ? c908920.f23211 ? 3.0d : 2.3d : 1.6d : 1.0d);
            case 26:
                C9089 c908921 = (C9089) obj;
                c908921.getClass();
                return c908921.f23218 == DynamicScheme$Platform.PHONE ? c908921.f23211 ? c4644.mo8718() : c4644.mo8719() : c4644.m8704();
            case 27:
                C9089 c908922 = (C9089) obj;
                c908922.getClass();
                return c908922.f23218 == DynamicScheme$Platform.PHONE ? C4718.m8827(3.0d) : C4718.m8827(4.5d);
            case 28:
                C9089 c908923 = (C9089) obj;
                c908923.getClass();
                return c908923.f23208;
            default:
                C9089 c908924 = (C9089) obj;
                c908924.getClass();
                C9092 c90923 = c908924.f23208;
                boolean z3 = c908924.f23211;
                DynamicScheme$Platform dynamicScheme$Platform3 = c908924.f23218;
                DynamicScheme$Platform dynamicScheme$Platform4 = DynamicScheme$Platform.WATCH;
                Variant variant7 = c908924.f23212;
                if (dynamicScheme$Platform3 == dynamicScheme$Platform4) {
                    dM8821 = variant7 == Variant.TONAL_SPOT ? C4718.m8821(c90923, 0.0d, 90.0d) : C4718.m8821(c90923, 0.0d, 100.0d);
                } else if (variant7 == Variant.NEUTRAL) {
                    dM8821 = z3 ? C4718.m8821(c90923, 0.0d, 93.0d) : C4718.m8821(c90923, 0.0d, 96.0d);
                } else {
                    if (variant7 == Variant.TONAL_SPOT) {
                        dM8821 = C4718.m8821(c90923, 0.0d, z3 ? 93 : 100);
                    } else if (variant7 == Variant.EXPRESSIVE) {
                        if (c90923.f23221.m14378()) {
                            i = 88;
                        } else if (z3) {
                            i = 93;
                        }
                        dM8821 = C4718.m8821(c90923, 75.0d, i);
                    } else {
                        dM8821 = z3 ? C4718.m8821(c90923, 0.0d, 93.0d) : C4718.m8821(c90923, 72.0d, 100.0d);
                    }
                }
                return Double.valueOf(dM8821);
        }
    }
}
