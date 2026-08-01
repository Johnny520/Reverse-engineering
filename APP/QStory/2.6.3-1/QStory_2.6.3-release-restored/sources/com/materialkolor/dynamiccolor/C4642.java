package com.materialkolor.dynamiccolor;

import androidx.window.area.AbstractC3400;
import com.materialkolor.scheme.DynamicScheme$Platform;
import com.materialkolor.scheme.Variant;
import io.ktor.client.plugins.api.C4718;
import p068.InterfaceC7387;
import p279.AbstractC9085;
import p279.C9084;
import p281.C9089;
import p282.C9092;

/* JADX INFO: renamed from: com.materialkolor.dynamiccolor.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4642 implements InterfaceC7387 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f12347;

    public /* synthetic */ C4642(int i) {
        this.f12347 = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x0136  */
    @Override // p068.InterfaceC7387
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        int i = this.f12347;
        double d = 98.0d;
        C4644 c4644 = C4628.f12307;
        double dM8821 = 90.0d;
        switch (i) {
            case 0:
                ((C9089) obj).getClass();
                return C4718.m8827(4.5d);
            case 1:
                C9089 c9089 = (C9089) obj;
                c9089.getClass();
                return c9089.f23209;
            case 2:
                C9089 c90892 = (C9089) obj;
                c90892.getClass();
                return c90892.f23218 == DynamicScheme$Platform.PHONE ? c4644.mo8717() : c4644.m8706();
            case 3:
                ((C9089) obj).getClass();
                return c4644.mo8721();
            case 4:
                ((C9089) obj).getClass();
                return C4718.m8827(7.0d);
            case 5:
                C9089 c90893 = (C9089) obj;
                c90893.getClass();
                return c90893.f23209;
            case 6:
                C9089 c90894 = (C9089) obj;
                c90894.getClass();
                return Double.valueOf(c90894.f23212 != Variant.NEUTRAL ? C4718.m8821(c90894.f23209, 0.0d, 90.0d) : 85.0d);
            case 7:
                ((C9089) obj).getClass();
                return C4718.m8827(4.5d);
            case 8:
                C9089 c90895 = (C9089) obj;
                c90895.getClass();
                return c90895.f23208;
            case 9:
                C9089 c90896 = (C9089) obj;
                c90896.getClass();
                Variant variant = c90896.f23212;
                Variant variant2 = Variant.TONAL_SPOT;
                C9092 c9092 = c90896.f23208;
                return Double.valueOf(variant == variant2 ? C4718.m8821(c9092, 0.0d, 90.0d) : C4718.m8821(c9092, 0.0d, 100.0d));
            case 10:
                C9089 c90897 = (C9089) obj;
                c90897.getClass();
                return c90897.f23218 == DynamicScheme$Platform.PHONE ? C4718.m8827(6.0d) : C4718.m8827(7.0d);
            case 11:
                ((C9089) obj).getClass();
                return C4718.m8827(4.5d);
            case 12:
                C9089 c90898 = (C9089) obj;
                c90898.getClass();
                return c90898.f23210;
            case 13:
                C9089 c90899 = (C9089) obj;
                c90899.getClass();
                Variant variant3 = c90899.f23212;
                if (variant3 != Variant.NEUTRAL) {
                    Variant variant4 = Variant.TONAL_SPOT;
                    C9092 c90922 = c90899.f23210;
                    dM8821 = variant3 == variant4 ? C4718.m8821(c90922, 0.0d, 90.0d) : C4718.m8821(c90922, 0.0d, 100.0d);
                }
                return Double.valueOf(dM8821);
            case 14:
                ((C9089) obj).getClass();
                return C4718.m8827(4.5d);
            case 15:
                C9089 c908910 = (C9089) obj;
                c908910.getClass();
                return c908910.f23219;
            case 16:
                C9089 c908911 = (C9089) obj;
                c908911.getClass();
                C9092 c90923 = c908911.f23219;
                double d2 = c90923.f23223;
                double d3 = c90923.f23222;
                double d4 = 0.0d;
                C9084 c9084M14382 = AbstractC9085.m14382(d2, d3, 0.0d);
                double d5 = 0.0d;
                while (true) {
                    double d6 = c9084M14382.f23200;
                    if (d6 < d3 && 0.0d <= d4 && d4 <= 100.0d) {
                        d4 += 1.0d;
                        C9084 c9084M143822 = AbstractC9085.m14382(d2, d3, d4);
                        if (d6 < c9084M143822.f23200) {
                            d5 = d4;
                            c9084M14382 = c9084M143822;
                        }
                    }
                }
                return Double.valueOf(AbstractC3400.m5632(d5, 0.0d, 100.0d));
            case 17:
                C9089 c908912 = (C9089) obj;
                c908912.getClass();
                return c908912.f23210;
            case 18:
                ((C9089) obj).getClass();
                return C4718.m8827(4.5d);
            case 19:
                C9089 c908913 = (C9089) obj;
                c908913.getClass();
                C9092 c90924 = c908913.f23210;
                boolean z = c908913.f23211;
                DynamicScheme$Platform dynamicScheme$Platform = c908913.f23218;
                Variant variant5 = c908913.f23212;
                if (variant5 == Variant.NEUTRAL) {
                    if (dynamicScheme$Platform == DynamicScheme$Platform.PHONE) {
                        dM8821 = z ? 80.0d : 40.0d;
                    }
                } else if (variant5 != Variant.TONAL_SPOT) {
                    if (variant5 == Variant.EXPRESSIVE) {
                        if (dynamicScheme$Platform == DynamicScheme$Platform.PHONE) {
                            if (c90924.f23221.m14377()) {
                                i = 25;
                            } else if (c90924.f23221.m14378()) {
                                i = 88;
                            }
                            dM8821 = C4718.m8821(c90924, 0.0d, i);
                        } else {
                            dM8821 = C4718.m8821(c90924, 0.0d, 100.0d);
                        }
                    } else if (dynamicScheme$Platform == DynamicScheme$Platform.PHONE) {
                        dM8821 = C4718.m8821(c90924, 0.0d, c90924.f23221.m14378() ? 88 : 98);
                    } else {
                        dM8821 = C4718.m8821(c90924, 0.0d, 100.0d);
                    }
                } else if (dynamicScheme$Platform != DynamicScheme$Platform.PHONE) {
                    dM8821 = C4718.m8821(c90924, 0.0d, 90.0d);
                } else if (!z) {
                    dM8821 = C4718.m8821(c90924, 0.0d, 100.0d);
                }
                return Double.valueOf(dM8821);
            case 20:
                C9089 c908914 = (C9089) obj;
                c908914.getClass();
                return c908914.f23218 == DynamicScheme$Platform.PHONE ? C4718.m8827(4.5d) : C4718.m8827(7.0d);
            case 21:
                C9089 c908915 = (C9089) obj;
                c908915.getClass();
                double dM8820 = 30.0d;
                if (c908915.f23218 != DynamicScheme$Platform.WATCH) {
                    boolean z2 = c908915.f23211;
                    C9092 c90925 = c908915.f23219;
                    dM8820 = z2 ? C4718.m8820(c90925, 30.0d, 93.0d) : C4718.m8821(c90925, 0.0d, 90.0d);
                }
                return Double.valueOf(dM8820);
            case 22:
                C9089 c908916 = (C9089) obj;
                c908916.getClass();
                return c908916.f23215;
            case 23:
                C9089 c908917 = (C9089) obj;
                c908917.getClass();
                if (c908917.f23218 != DynamicScheme$Platform.PHONE) {
                    d = 0.0d;
                } else if (c908917.f23211) {
                    d = 4.0d;
                } else if (c908917.f23215.f23221.m14377()) {
                    d = 99.0d;
                } else if (c908917.f23212 == Variant.VIBRANT) {
                    d = 97.0d;
                }
                return Double.valueOf(d);
            case 24:
                C9089 c908918 = (C9089) obj;
                c908918.getClass();
                return c908918.f23219;
            case 25:
                C9089 c908919 = (C9089) obj;
                c908919.getClass();
                C9092 c90926 = c908919.f23219;
                return Double.valueOf(c908919.f23218 == DynamicScheme$Platform.PHONE ? c908919.f23211 ? C4718.m8820(c90926, 0.0d, 98.0d) : C4718.m8821(c90926, 0.0d, 100.0d) : C4718.m8820(c90926, 0.0d, 100.0d));
            case 26:
                C9089 c908920 = (C9089) obj;
                c908920.getClass();
                return c908920.f23218 == DynamicScheme$Platform.PHONE ? C4718.m8827(4.5d) : C4718.m8827(7.0d);
            case 27:
                C9089 c908921 = (C9089) obj;
                c908921.getClass();
                return c908921.f23210;
            case 28:
                C9089 c908922 = (C9089) obj;
                c908922.getClass();
                return Double.valueOf(C4718.m8821(c908922.f23210, 0.0d, 100.0d));
            default:
                ((C9089) obj).getClass();
                return c4644.mo8722();
        }
    }
}
