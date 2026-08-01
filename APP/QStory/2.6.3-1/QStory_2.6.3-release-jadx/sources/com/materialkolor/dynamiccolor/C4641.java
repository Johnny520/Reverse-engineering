package com.materialkolor.dynamiccolor;

import com.materialkolor.scheme.DynamicScheme$Platform;
import com.materialkolor.scheme.Variant;
import io.ktor.client.plugins.api.C4718;
import p068.InterfaceC7387;
import p281.C9089;
import p281.C9090;
import p282.C9092;

/* JADX INFO: renamed from: com.materialkolor.dynamiccolor.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4641 implements InterfaceC7387 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f12346;

    public /* synthetic */ C4641(int i) {
        this.f12346 = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:85:0x017b  */
    @Override // p068.InterfaceC7387
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        int i = this.f12346;
        C4644 c4644 = C4628.f12307;
        double dM8821 = 90.0d;
        double d = 1.7d;
        double d2 = 9.0d;
        switch (i) {
            case 0:
                C9089 c9089 = (C9089) obj;
                c9089.getClass();
                return c9089.f23218 == DynamicScheme$Platform.PHONE ? C4718.m8827(6.0d) : C4718.m8827(7.0d);
            case 1:
                C9089 c90892 = (C9089) obj;
                c90892.getClass();
                return c90892.f23210;
            case 2:
                ((C9089) obj).getClass();
                C9090 c9090 = DynamicScheme$Platform.Companion;
                return null;
            case 3:
                C9089 c90893 = (C9089) obj;
                c90893.getClass();
                return c90893.f23215;
            case 4:
                C9089 c90894 = (C9089) obj;
                c90894.getClass();
                if (c90894.f23218 != DynamicScheme$Platform.PHONE) {
                    return Double.valueOf(1.0d);
                }
                Variant variant = c90894.f23212;
                if (variant == Variant.NEUTRAL) {
                    d = 2.2d;
                } else if (variant != Variant.TONAL_SPOT) {
                    d = variant == Variant.EXPRESSIVE ? c90894.f23215.f23221.m14377() ? c90894.f23211 ? 3.0d : 2.3d : 1.6d : 1.0d;
                }
                return Double.valueOf(d);
            case 5:
                C9089 c90895 = (C9089) obj;
                c90895.getClass();
                return (c90895.f23211 && c90895.f23218 == DynamicScheme$Platform.PHONE) ? C4718.m8827(11.0d) : C4718.m8827(9.0d);
            case 6:
                C9089 c90896 = (C9089) obj;
                c90896.getClass();
                return c90896.f23215;
            case 7:
                C9089 c90897 = (C9089) obj;
                c90897.getClass();
                return Double.valueOf(c90897.f23211 ? 0.0d : 100.0d);
            case 8:
                C9089 c90898 = (C9089) obj;
                c90898.getClass();
                return c90898.f23215;
            case 9:
                ((C9089) obj).getClass();
                return C4718.m8827(7.0d);
            case 10:
                C9089 c90899 = (C9089) obj;
                c90899.getClass();
                return c90899.f23209;
            case 11:
                ((C9089) obj).getClass();
                return c4644.mo8716();
            case 12:
                C9089 c908910 = (C9089) obj;
                c908910.getClass();
                return c908910.f23218 == DynamicScheme$Platform.PHONE ? C4718.m8827(6.0d) : C4718.m8827(7.0d);
            case 13:
                C9089 c908911 = (C9089) obj;
                c908911.getClass();
                return c908911.f23208;
            case 14:
                ((C9089) obj).getClass();
                C9090 c90902 = DynamicScheme$Platform.Companion;
                return null;
            case 15:
                ((C9089) obj).getClass();
                C9090 c90903 = DynamicScheme$Platform.Companion;
                return null;
            case 16:
                C9089 c908912 = (C9089) obj;
                c908912.getClass();
                return c908912.f23208;
            case 17:
                ((C9089) obj).getClass();
                return c4644.mo8702();
            case 18:
                C9089 c908913 = (C9089) obj;
                c908913.getClass();
                return c908913.f23218 == DynamicScheme$Platform.PHONE ? C4718.m8827(6.0d) : C4718.m8827(7.0d);
            case 19:
                C9089 c908914 = (C9089) obj;
                c908914.getClass();
                return c908914.f23210;
            case 20:
                C9089 c908915 = (C9089) obj;
                c908915.getClass();
                C9092 c9092 = c908915.f23210;
                boolean z = c908915.f23211;
                if (c908915.f23218 != DynamicScheme$Platform.WATCH) {
                    Variant variant2 = c908915.f23212;
                    if (variant2 == Variant.NEUTRAL) {
                        if (z) {
                            dM8821 = 30.0d;
                        }
                    } else if (variant2 == Variant.TONAL_SPOT) {
                        dM8821 = z ? C4718.m8820(c9092, 35.0d, 93.0d) : C4718.m8821(c9092, 0.0d, 90.0d);
                    } else {
                        if (variant2 == Variant.EXPRESSIVE) {
                            if (z) {
                                dM8821 = C4718.m8821(c9092, 30.0d, 93.0d);
                            } else {
                                dM8821 = C4718.m8821(c9092, 78.0d, c9092.f23221.m14378() ? 88 : 90);
                            }
                        } else if (z) {
                            dM8821 = C4718.m8820(c9092, 66.0d, 93.0d);
                        } else {
                            dM8821 = C4718.m8821(c9092, 66.0d, c9092.f23221.m14378() ? 88 : 93);
                        }
                    }
                }
                return Double.valueOf(dM8821);
            case 21:
                C9089 c908916 = (C9089) obj;
                c908916.getClass();
                return c908916.f23209;
            case 22:
                ((C9089) obj).getClass();
                C9090 c90904 = DynamicScheme$Platform.Companion;
                return null;
            case 23:
                C9089 c908917 = (C9089) obj;
                c908917.getClass();
                return c908917.f23215;
            case 24:
                C9089 c908918 = (C9089) obj;
                c908918.getClass();
                if (c908918.f23211) {
                    dM8821 = 4.0d;
                } else if (!c908918.f23215.f23221.m14377()) {
                    dM8821 = c908918.f23212 == Variant.VIBRANT ? 85.0d : 87.0d;
                }
                return Double.valueOf(dM8821);
            case 25:
                C9089 c908919 = (C9089) obj;
                c908919.getClass();
                if (!c908919.f23211) {
                    Variant variant3 = c908919.f23212;
                    if (variant3 == Variant.NEUTRAL) {
                        return Double.valueOf(2.5d);
                    }
                    if (variant3 == Variant.TONAL_SPOT) {
                        return Double.valueOf(1.7d);
                    }
                    if (variant3 == Variant.EXPRESSIVE) {
                        return c908919.f23215.f23221.m14377() ? Double.valueOf(2.7d) : Double.valueOf(1.75d);
                    }
                    if (variant3 == Variant.VIBRANT) {
                        return Double.valueOf(1.36d);
                    }
                }
                return Double.valueOf(1.0d);
            case 26:
                C9089 c908920 = (C9089) obj;
                c908920.getClass();
                return c908920.f23215;
            case 27:
                C9089 c908921 = (C9089) obj;
                c908921.getClass();
                if (c908921.f23218 != DynamicScheme$Platform.PHONE) {
                    d2 = 20.0d;
                } else if (!c908921.f23211) {
                    d2 = c908921.f23215.f23221.m14377() ? 96.0d : c908921.f23212 == Variant.VIBRANT ? 92.0d : 94.0d;
                }
                return Double.valueOf(d2);
            case 28:
                C9089 c908922 = (C9089) obj;
                Double dValueOf = Double.valueOf(1.6d);
                c908922.getClass();
                if (c908922.f23218 == DynamicScheme$Platform.PHONE) {
                    Variant variant4 = c908922.f23212;
                    if (variant4 == Variant.NEUTRAL) {
                        return dValueOf;
                    }
                    if (variant4 == Variant.TONAL_SPOT) {
                        return Double.valueOf(1.4d);
                    }
                    if (variant4 == Variant.EXPRESSIVE) {
                        return c908922.f23215.f23221.m14377() ? dValueOf : Double.valueOf(1.3d);
                    }
                    if (variant4 == Variant.VIBRANT) {
                        return Double.valueOf(1.15d);
                    }
                }
                return Double.valueOf(1.0d);
            default:
                C9089 c908923 = (C9089) obj;
                c908923.getClass();
                return c908923.f23215;
        }
    }
}
