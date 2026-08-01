package com.materialkolor.dynamiccolor;

import com.materialkolor.scheme.Variant;
import p068.InterfaceC7387;
import p281.C9089;

/* JADX INFO: renamed from: com.materialkolor.dynamiccolor.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4629 implements InterfaceC7387 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f12308;

    public /* synthetic */ C4629(C4649 c4649) {
        this.f12308 = 25;
    }

    @Override // p068.InterfaceC7387
    public final Object invoke(Object obj) {
        C9089 c9089 = (C9089) obj;
        switch (this.f12308) {
            case 0:
                c9089.getClass();
                return c9089.f23210;
            case 1:
                c9089.getClass();
                return Double.valueOf(c9089.f23211 ? 80.0d : 40.0d);
            case 2:
                c9089.getClass();
                return c9089.f23215;
            case 3:
                c9089.getClass();
                return Double.valueOf(c9089.f23211 ? 10.0d : 90.0d);
            case 4:
                c9089.getClass();
                return c9089.f23215;
            case 5:
                c9089.getClass();
                return Double.valueOf(c9089.f23211 ? 10.0d : 90.0d);
            case 6:
                c9089.getClass();
                return c9089.f23219;
            case 7:
                c9089.getClass();
                return c9089.f23215;
            case 8:
                c9089.getClass();
                return Double.valueOf(c9089.f23219.f23221.f23199);
            case 9:
                c9089.getClass();
                return c9089.f23215;
            case 10:
                c9089.getClass();
                return Double.valueOf(c9089.f23211 ? 24.0d : 98.0d);
            case 11:
                c9089.getClass();
                return c9089.f23215;
            case 12:
                c9089.getClass();
                return Double.valueOf(c9089.f23211 ? 10.0d : 90.0d);
            case 13:
                c9089.getClass();
                return c9089.f23214;
            case 14:
                c9089.getClass();
                return Double.valueOf(c9089.f23211 ? 30.0d : 80.0d);
            case 15:
                c9089.getClass();
                return c9089.f23208;
            case 16:
                c9089.getClass();
                return Double.valueOf(c9089.f23208.f23221.f23199);
            case 17:
                c9089.getClass();
                return c9089.f23215;
            case 18:
                c9089.getClass();
                return Double.valueOf(0.0d);
            case 19:
                c9089.getClass();
                return Double.valueOf(c9089.f23211 ? 10.0d : 90.0d);
            case 20:
                c9089.getClass();
                return c9089.f23214;
            case 21:
                c9089.getClass();
                return Double.valueOf(c9089.f23214.f23221.f23199);
            case 22:
                c9089.getClass();
                return c9089.f23215;
            case 23:
                c9089.getClass();
                return Double.valueOf(c9089.f23211 ? 90.0d : 20.0d);
            case 24:
                c9089.getClass();
                return c9089.f23210;
            case 25:
                c9089.getClass();
                if (C4649.m8732(c9089)) {
                    d = c9089.f23213.f23199;
                } else {
                    boolean z = c9089.f23212 == Variant.MONOCHROME;
                    boolean z2 = c9089.f23211;
                    if (z) {
                        d = z2 ? 85.0d : 25.0d;
                    } else if (!z2) {
                        d = 90.0d;
                    }
                }
                return Double.valueOf(d);
            case 26:
                c9089.getClass();
                return new C4635(1.0d, 1.0d, 3.0d, 4.5d);
            case 27:
                c9089.getClass();
                return c9089.f23209;
            case 28:
                c9089.getClass();
                return c9089.f23215;
            default:
                c9089.getClass();
                return Double.valueOf(c9089.f23211 ? 80.0d : 40.0d);
        }
    }

    public /* synthetic */ C4629(int i) {
        this.f12308 = i;
    }
}
