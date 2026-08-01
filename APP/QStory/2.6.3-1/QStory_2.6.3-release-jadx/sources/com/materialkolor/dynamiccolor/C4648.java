package com.materialkolor.dynamiccolor;

import com.materialkolor.scheme.Variant;
import p068.InterfaceC7387;
import p281.C9089;

/* JADX INFO: renamed from: com.materialkolor.dynamiccolor.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4648 implements InterfaceC7387 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f12354;

    public /* synthetic */ C4648(int i) {
        this.f12354 = i;
    }

    @Override // p068.InterfaceC7387
    public final Object invoke(Object obj) {
        int i = this.f12354;
        C4644 c4644 = C4628.f12307;
        C9089 c9089 = (C9089) obj;
        switch (i) {
            case 0:
                c9089.getClass();
                return new C4635(3.0d, 4.5d, 7.0d, 7.0d);
            case 1:
                c9089.getClass();
                return c9089.f23214;
            case 2:
                c9089.getClass();
                return Double.valueOf(c9089.f23211 ? 30.0d : 80.0d);
            case 3:
                c9089.getClass();
                return new C4635(1.0d, 1.0d, 3.0d, 4.5d);
            case 4:
                c9089.getClass();
                return c9089.f23215;
            case 5:
                c9089.getClass();
                return Double.valueOf(c9089.f23211 ? 4.0d : 100.0d);
            case 6:
                c9089.getClass();
                return c9089.f23219;
            case 7:
                c9089.getClass();
                return Double.valueOf(c9089.f23211 ? 80.0d : 40.0d);
            case 8:
                c9089.getClass();
                return Double.valueOf(c9089.f23211 ? 6.0d : 87.0d);
            case 9:
                c9089.getClass();
                return new C4635(3.0d, 4.5d, 7.0d, 7.0d);
            case 10:
                c9089.getClass();
                return c9089.f23209;
            case 11:
                c9089.getClass();
                return Double.valueOf(10.0d);
            case 12:
                c9089.getClass();
                return c4644.mo8721();
            case 13:
                c9089.getClass();
                return c4644.mo8720();
            case 14:
                c9089.getClass();
                return new C4635(4.5d, 7.0d, 11.0d, 21.0d);
            case 15:
                c9089.getClass();
                return c9089.f23219;
            case 16:
                c9089.getClass();
                return Double.valueOf(c9089.f23211 ? 20.0d : 100.0d);
            case 17:
                c9089.getClass();
                return c4644.mo8714();
            case 18:
                c9089.getClass();
                return c9089.f23215;
            case 19:
                c9089.getClass();
                return new C4635(4.5d, 7.0d, 11.0d, 21.0d);
            case 20:
                c9089.getClass();
                return c9089.f23208;
            case 21:
                c9089.getClass();
                boolean z = c9089.f23212 == Variant.MONOCHROME;
                boolean z2 = c9089.f23211;
                if (z) {
                    d = z2 ? 90.0d : 25.0d;
                } else if (z2) {
                    d = 80.0d;
                }
                return Double.valueOf(d);
            case 22:
                c9089.getClass();
                return new C4635(3.0d, 4.5d, 7.0d, 7.0d);
            case 23:
                c9089.getClass();
                return c9089.f23219;
            case 24:
                c9089.getClass();
                return Double.valueOf(c9089.f23211 ? 30.0d : 90.0d);
            case 25:
                c9089.getClass();
                return new C4635(1.0d, 1.0d, 3.0d, 4.5d);
            case 26:
                c9089.getClass();
                return c9089.f23215;
            case 27:
                c9089.getClass();
                return Double.valueOf(c9089.f23211 ? 100.0d : 0.0d);
            case 28:
                c9089.getClass();
                return Double.valueOf(c9089.f23211 ? 90.0d : 10.0d);
            default:
                c9089.getClass();
                return c4644.mo8715();
        }
    }
}
