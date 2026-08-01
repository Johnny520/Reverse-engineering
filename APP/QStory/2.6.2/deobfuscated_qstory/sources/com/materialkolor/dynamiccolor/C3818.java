package com.materialkolor.dynamiccolor;

import com.materialkolor.scheme.DynamicScheme$Platform;
import com.materialkolor.scheme.Variant;
import p000.AbstractC6087;
import p052.InterfaceC6557;
import p263.AbstractC8255;
import p263.C8254;
import p265.C8259;
import p266.C8262;

/* JADX INFO: renamed from: com.materialkolor.dynamiccolor.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3818 implements InterfaceC6557 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C3811 f12006;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f12007;

    public /* synthetic */ C3818(C3811 c3811, int i) {
        this.f12007 = i;
        this.f12006 = c3811;
    }

    @Override // p052.InterfaceC6557
    public final Object invoke(Object obj) {
        double dM8149;
        double d;
        double d2;
        C8254 c8254M13806;
        int i = this.f12007;
        C3811 c3811 = this.f12006;
        C8259 c8259 = (C8259) obj;
        switch (i) {
            case 0:
                c8259.getClass();
                return c3811.mo8176();
            case 1:
                c8259.getClass();
                return c8259.f22874 == DynamicScheme$Platform.PHONE ? c8259.f22867 ? c3811.mo8172() : c3811.mo8173() : c3811.m8158();
            case 2:
                c8259.getClass();
                return Double.valueOf(c3811.mo8155().m8149(c8259));
            case 3:
                c8259.getClass();
                return new C3794(c3811.mo8154(), c3811.mo8155(), 5.0d, TonePolarity.DARKER, false, ToneDeltaPair$DeltaConstraint.EXACT, 16);
            case 4:
                c8259.getClass();
                return c8259.f22874 == DynamicScheme$Platform.PHONE ? c8259.f22867 ? c3811.mo8172() : c3811.mo8173() : c3811.m8158();
            case 5:
                c8259.getClass();
                if (c8259.f22874 == DynamicScheme$Platform.PHONE) {
                    return new C3794(c3811.mo8156(), c3811.mo8157(), 5.0d, TonePolarity.RELATIVE_LIGHTER, false, ToneDeltaPair$DeltaConstraint.FARTHER, 16);
                }
                return null;
            case 6:
                c8259.getClass();
                return Double.valueOf(c3811.mo8174().m8149(c8259));
            case 7:
                c8259.getClass();
                return new C3794(c3811.mo8175(), c3811.mo8174(), 5.0d, TonePolarity.DARKER, false, ToneDeltaPair$DeltaConstraint.EXACT, 16);
            case 8:
                c8259.getClass();
                return Double.valueOf(c3811.mo8177().m8149(c8259));
            case 9:
                c8259.getClass();
                return new C3794(c3811.mo8178(), c3811.mo8177(), 5.0d, TonePolarity.DARKER, false, ToneDeltaPair$DeltaConstraint.EXACT, 16);
            case 10:
                c8259.getClass();
                return Double.valueOf(c3811.mo8170().m8149(new C8259(c8259.f22869, c8259.f22868, false, c8259.f22866, c8259.f22865, c8259.f22864, c8259.f22871, c8259.f22870, c8259.f22874, c8259.f22872, c8259.f22875)));
            case 11:
                c8259.getClass();
                if (c8259.f22874 == DynamicScheme$Platform.PHONE) {
                    return c8259.f22867 ? c3811.mo8172() : c3811.mo8173();
                }
                return null;
            case 12:
                c8259.getClass();
                return c3811.m8158();
            case 13:
                c8259.getClass();
                return new C3794(c3811.m8160(), c3811.mo8171(), 5.0d, TonePolarity.DARKER, false, ToneDeltaPair$DeltaConstraint.FARTHER, 16);
            case 14:
                c8259.getClass();
                return c3811.m8158();
            case 15:
                c8259.getClass();
                return new C3794(c3811.m8150(), c3811.mo8157(), 5.0d, TonePolarity.DARKER, false, ToneDeltaPair$DeltaConstraint.FARTHER, 16);
            case 16:
                c8259.getClass();
                return c3811.m8158();
            case 17:
                c8259.getClass();
                return new C3794(c3811.m8161(), c3811.mo8179(), 5.0d, TonePolarity.DARKER, false, ToneDeltaPair$DeltaConstraint.FARTHER, 16);
            case 18:
                c8259.getClass();
                return c3811.m8158();
            case 19:
                c8259.getClass();
                return new C3794(c3811.m8153(), c3811.mo8168(), 5.0d, TonePolarity.DARKER, false, ToneDeltaPair$DeltaConstraint.FARTHER, 16);
            case 20:
                c8259.getClass();
                return c8259.f22874 == DynamicScheme$Platform.PHONE ? c8259.f22867 ? c3811.mo8172() : c3811.mo8173() : c3811.m8158();
            case 21:
                c8259.getClass();
                if (c8259.f22874 == DynamicScheme$Platform.PHONE) {
                    return new C3794(c3811.mo8180(), c3811.mo8179(), 5.0d, TonePolarity.RELATIVE_LIGHTER, false, ToneDeltaPair$DeltaConstraint.FARTHER, 16);
                }
                return null;
            case 22:
                c8259.getClass();
                return c8259.f22874 == DynamicScheme$Platform.PHONE ? c8259.f22867 ? c3811.mo8172() : c3811.mo8173() : c3811.m8158();
            case 23:
                c8259.getClass();
                if (c8259.f22874 == DynamicScheme$Platform.PHONE) {
                    return new C3794(c3811.mo8167(), c3811.mo8168(), 5.0d, TonePolarity.RELATIVE_LIGHTER, false, ToneDeltaPair$DeltaConstraint.FARTHER, 16);
                }
                return null;
            case 24:
                c8259.getClass();
                if (c8259.f22874 == DynamicScheme$Platform.PHONE) {
                    return c8259.f22867 ? c3811.mo8172() : c3811.mo8173();
                }
                return null;
            case 25:
                c8259.getClass();
                return Double.valueOf(c3811.mo8180().m8149(new C8259(c8259.f22869, c8259.f22868, false, c8259.f22866, c8259.f22865, c8259.f22864, c8259.f22871, c8259.f22870, c8259.f22874, c8259.f22872, c8259.f22875)));
            case 26:
                c8259.getClass();
                if (c8259.f22874 == DynamicScheme$Platform.PHONE) {
                    return c8259.f22867 ? c3811.mo8172() : c3811.mo8173();
                }
                return null;
            case 27:
                c8259.getClass();
                if (c8259.f22868 == Variant.VIBRANT) {
                    C8262 c8262 = c8259.f22871;
                    double d3 = c8262.f22879;
                    double d4 = 1.1d * c8262.f22878;
                    double d5 = 100.0d;
                    C8254 c8254M138062 = AbstractC8255.m13806(d3, d4, 100.0d);
                    while (true) {
                        d = d5;
                        do {
                            d2 = c8254M138062.f22856;
                            if (d2 < d4 && 0.0d <= d5 && d5 <= 100.0d) {
                                d5 -= 1.0d;
                                c8254M13806 = AbstractC8255.m13806(d3, d4, d5);
                            }
                        } while (d2 >= c8254M13806.f22856);
                        c8254M138062 = c8254M13806;
                    }
                    dM8149 = AbstractC6087.m11415(d, 0.0d, 100.0d);
                } else {
                    dM8149 = (c8259.f22874 == DynamicScheme$Platform.PHONE ? c8259.f22867 ? c3811.mo8172() : c3811.mo8173() : c3811.m8158()).m8149(c8259);
                }
                return Double.valueOf(dM8149);
            case 28:
                c8259.getClass();
                return c8259.f22874 == DynamicScheme$Platform.PHONE ? c8259.f22867 ? c3811.mo8172() : c3811.mo8173() : c3811.m8158();
            default:
                c8259.getClass();
                if (c8259.f22874 == DynamicScheme$Platform.WATCH) {
                    return new C3794(c3811.mo8167(), c3811.m8153(), 10.0d, TonePolarity.DARKER, false, ToneDeltaPair$DeltaConstraint.FARTHER, 16);
                }
                return null;
        }
    }
}
