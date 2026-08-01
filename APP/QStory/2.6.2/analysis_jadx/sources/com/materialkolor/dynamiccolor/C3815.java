package com.materialkolor.dynamiccolor;

import com.materialkolor.scheme.Variant;
import p052.InterfaceC6557;
import p265.C8259;

/* JADX INFO: renamed from: com.materialkolor.dynamiccolor.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3815 implements InterfaceC6557 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f12004;

    public /* synthetic */ C3815(int i) {
        this.f12004 = i;
    }

    @Override // p052.InterfaceC6557
    public final Object invoke(Object obj) {
        int i = this.f12004;
        C3811 c3811 = C3795.f11957;
        C8259 c8259 = (C8259) obj;
        switch (i) {
            case 0:
                c8259.getClass();
                return new C3802(3.0d, 4.5d, 7.0d, 7.0d);
            case 1:
                c8259.getClass();
                return c8259.f22870;
            case 2:
                c8259.getClass();
                return Double.valueOf(c8259.f22867 ? 30.0d : 80.0d);
            case 3:
                c8259.getClass();
                return new C3802(1.0d, 1.0d, 3.0d, 4.5d);
            case 4:
                c8259.getClass();
                return c8259.f22871;
            case 5:
                c8259.getClass();
                return Double.valueOf(c8259.f22867 ? 4.0d : 100.0d);
            case 6:
                c8259.getClass();
                return c8259.f22875;
            case 7:
                c8259.getClass();
                return Double.valueOf(c8259.f22867 ? 80.0d : 40.0d);
            case 8:
                c8259.getClass();
                return Double.valueOf(c8259.f22867 ? 6.0d : 87.0d);
            case 9:
                c8259.getClass();
                return new C3802(3.0d, 4.5d, 7.0d, 7.0d);
            case 10:
                c8259.getClass();
                return c8259.f22865;
            case 11:
                c8259.getClass();
                return Double.valueOf(10.0d);
            case 12:
                c8259.getClass();
                return c3811.mo8175();
            case 13:
                c8259.getClass();
                return c3811.mo8174();
            case 14:
                c8259.getClass();
                return new C3802(4.5d, 7.0d, 11.0d, 21.0d);
            case 15:
                c8259.getClass();
                return c8259.f22875;
            case 16:
                c8259.getClass();
                return Double.valueOf(c8259.f22867 ? 20.0d : 100.0d);
            case 17:
                c8259.getClass();
                return c3811.mo8168();
            case 18:
                c8259.getClass();
                return c8259.f22871;
            case 19:
                c8259.getClass();
                return new C3802(4.5d, 7.0d, 11.0d, 21.0d);
            case 20:
                c8259.getClass();
                return c8259.f22864;
            case 21:
                c8259.getClass();
                boolean z = c8259.f22868 == Variant.MONOCHROME;
                boolean z2 = c8259.f22867;
                if (z) {
                    d = z2 ? 90.0d : 25.0d;
                } else if (z2) {
                    d = 80.0d;
                }
                return Double.valueOf(d);
            case 22:
                c8259.getClass();
                return new C3802(3.0d, 4.5d, 7.0d, 7.0d);
            case 23:
                c8259.getClass();
                return c8259.f22875;
            case 24:
                c8259.getClass();
                return Double.valueOf(c8259.f22867 ? 30.0d : 90.0d);
            case 25:
                c8259.getClass();
                return new C3802(1.0d, 1.0d, 3.0d, 4.5d);
            case 26:
                c8259.getClass();
                return c8259.f22871;
            case 27:
                c8259.getClass();
                return Double.valueOf(c8259.f22867 ? 100.0d : 0.0d);
            case 28:
                c8259.getClass();
                return Double.valueOf(c8259.f22867 ? 90.0d : 10.0d);
            default:
                c8259.getClass();
                return c3811.mo8169();
        }
    }
}
