package com.materialkolor.dynamiccolor;

import com.materialkolor.scheme.DynamicScheme$Platform;
import com.materialkolor.scheme.Variant;
import io.ktor.client.plugins.api.C4718;
import p068.InterfaceC7387;
import p281.C9089;
import p281.C9090;
import p282.C9092;

/* JADX INFO: renamed from: com.materialkolor.dynamiccolor.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4650 implements InterfaceC7387 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f12355;

    public /* synthetic */ C4650(int i) {
        this.f12355 = i;
    }

    @Override // p068.InterfaceC7387
    public final Object invoke(Object obj) {
        double dM8821;
        int i = this.f12355;
        double d = 1.6d;
        double d2 = 98.0d;
        C4644 c4644 = C4628.f12307;
        switch (i) {
            case 0:
                C9089 c9089 = (C9089) obj;
                c9089.getClass();
                return c9089.f23215;
            case 1:
                C9089 c90892 = (C9089) obj;
                c90892.getClass();
                if (c90892.f23218 != DynamicScheme$Platform.PHONE) {
                    return Double.valueOf(1.0d);
                }
                Variant variant = c90892.f23212;
                if (variant == Variant.NEUTRAL) {
                    d = 2.2d;
                } else if (variant == Variant.TONAL_SPOT) {
                    d = 1.7d;
                } else if (variant != Variant.EXPRESSIVE) {
                    d = 1.0d;
                } else if (c90892.f23215.f23221.m14377()) {
                    d = c90892.f23211 ? 3.0d : 2.3d;
                }
                return Double.valueOf(d);
            case 2:
                C9089 c90893 = (C9089) obj;
                c90893.getClass();
                return c90893.f23218 == DynamicScheme$Platform.PHONE ? c90893.f23211 ? C4718.m8827(6.0d) : C4718.m8827(4.5d) : C4718.m8827(7.0d);
            case 3:
                C9089 c90894 = (C9089) obj;
                c90894.getClass();
                return c90894.f23208;
            case 4:
                C9089 c90895 = (C9089) obj;
                c90895.getClass();
                return c90895.f23210;
            case 5:
                C9089 c90896 = (C9089) obj;
                c90896.getClass();
                return c90896.f23218 == DynamicScheme$Platform.PHONE ? c4644.mo8725() : c4644.m8707();
            case 6:
                C9089 c90897 = (C9089) obj;
                c90897.getClass();
                return c90897.f23218 == DynamicScheme$Platform.PHONE ? C4718.m8827(6.0d) : C4718.m8827(7.0d);
            case 7:
                ((C9089) obj).getClass();
                return c4644.mo8700();
            case 8:
                C9089 c90898 = (C9089) obj;
                c90898.getClass();
                return Double.valueOf(c90898.f23218 != DynamicScheme$Platform.WATCH ? c4644.m8709().m8695(c90898) : 100.0d);
            case 9:
                C9089 c90899 = (C9089) obj;
                c90899.getClass();
                return c90899.f23208;
            case 10:
                C9089 c908910 = (C9089) obj;
                c908910.getClass();
                C9092 c9092 = c908910.f23208;
                boolean z = c908910.f23211;
                DynamicScheme$Platform dynamicScheme$Platform = c908910.f23218;
                DynamicScheme$Platform dynamicScheme$Platform2 = DynamicScheme$Platform.WATCH;
                Variant variant2 = c908910.f23212;
                if (dynamicScheme$Platform == dynamicScheme$Platform2) {
                    dM8821 = variant2 == Variant.TONAL_SPOT ? C4718.m8821(c9092, 0.0d, 90.0d) : C4718.m8821(c9092, 0.0d, 100.0d);
                } else if (variant2 == Variant.EXPRESSIVE || variant2 == Variant.VIBRANT) {
                    dM8821 = C4718.m8821(c9092, 0.0d, c9092.f23221.m14378() ? 88 : z ? 98 : 100);
                } else {
                    dM8821 = z ? C4718.m8821(c9092, 0.0d, 98.0d) : C4718.m8821(c9092, 0.0d, 100.0d);
                }
                return Double.valueOf(dM8821);
            case 11:
                C9089 c908911 = (C9089) obj;
                c908911.getClass();
                return c908911.f23218 == DynamicScheme$Platform.PHONE ? C4718.m8827(4.5d) : C4718.m8827(7.0d);
            case 12:
                C9089 c908912 = (C9089) obj;
                c908912.getClass();
                return c908912.f23209;
            case 13:
                C9089 c908913 = (C9089) obj;
                c908913.getClass();
                return c908913.f23210;
            case 14:
                ((C9089) obj).getClass();
                return C4718.m8827(7.0d);
            case 15:
                C9089 c908914 = (C9089) obj;
                c908914.getClass();
                return c908914.f23209;
            case 16:
                ((C9089) obj).getClass();
                C9090 c9090 = DynamicScheme$Platform.Companion;
                return null;
            case 17:
                C9089 c908915 = (C9089) obj;
                c908915.getClass();
                return c908915.f23219;
            case 18:
                C9089 c908916 = (C9089) obj;
                c908916.getClass();
                return c908916.f23218 == DynamicScheme$Platform.PHONE ? c4644.mo8714() : c4644.m8699();
            case 19:
                C9089 c908917 = (C9089) obj;
                c908917.getClass();
                return c908917.f23218 == DynamicScheme$Platform.PHONE ? C4718.m8827(6.0d) : C4718.m8827(7.0d);
            case 20:
                C9089 c908918 = (C9089) obj;
                c908918.getClass();
                return c908918.f23215;
            case 21:
                C9089 c908919 = (C9089) obj;
                c908919.getClass();
                return c908919.f23209;
            case 22:
                C9089 c908920 = (C9089) obj;
                c908920.getClass();
                if (c908920.f23218 != DynamicScheme$Platform.PHONE) {
                    return Double.valueOf(1.0d);
                }
                Variant variant3 = c908920.f23212;
                if (variant3 == Variant.NEUTRAL) {
                    d = 2.2d;
                } else if (variant3 == Variant.TONAL_SPOT) {
                    d = 1.7d;
                } else if (variant3 != Variant.EXPRESSIVE) {
                    d = variant3 == Variant.VIBRANT ? 1.29d : 1.0d;
                } else if (c908920.f23215.f23221.m14377()) {
                    d = c908920.f23211 ? 3.0d : 2.3d;
                }
                return Double.valueOf(d);
            case 23:
                C9089 c908921 = (C9089) obj;
                c908921.getClass();
                return c908921.f23218 == DynamicScheme$Platform.PHONE ? c908921.f23211 ? c4644.mo8718() : c4644.mo8719() : c4644.m8704();
            case 24:
                C9089 c908922 = (C9089) obj;
                c908922.getClass();
                return c908922.f23218 == DynamicScheme$Platform.PHONE ? C4718.m8827(1.5d) : C4718.m8827(3.0d);
            case 25:
                C9089 c908923 = (C9089) obj;
                c908923.getClass();
                return c908923.f23215;
            case 26:
                C9089 c908924 = (C9089) obj;
                c908924.getClass();
                if (c908924.f23211) {
                    d2 = 18.0d;
                } else if (c908924.f23215.f23221.m14377()) {
                    d2 = 99.0d;
                } else if (c908924.f23212 == Variant.VIBRANT) {
                    d2 = 97.0d;
                }
                return Double.valueOf(d2);
            case 27:
                C9089 c908925 = (C9089) obj;
                c908925.getClass();
                if (c908925.f23211) {
                    Variant variant4 = c908925.f23212;
                    if (variant4 == Variant.NEUTRAL) {
                        return Double.valueOf(2.5d);
                    }
                    if (variant4 == Variant.TONAL_SPOT) {
                        return Double.valueOf(1.7d);
                    }
                    if (variant4 == Variant.EXPRESSIVE) {
                        return c908925.f23215.f23221.m14377() ? Double.valueOf(2.7d) : Double.valueOf(1.75d);
                    }
                    if (variant4 == Variant.VIBRANT) {
                        return Double.valueOf(1.36d);
                    }
                }
                return Double.valueOf(1.0d);
            case 28:
                C9089 c908926 = (C9089) obj;
                c908926.getClass();
                return c908926.f23208;
            default:
                ((C9089) obj).getClass();
                return c4644.mo8700();
        }
    }
}
