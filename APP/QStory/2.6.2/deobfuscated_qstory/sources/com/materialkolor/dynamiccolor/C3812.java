package com.materialkolor.dynamiccolor;

import com.materialkolor.scheme.DynamicScheme$Platform;
import p052.InterfaceC6557;
import p265.C8259;

/* JADX INFO: renamed from: com.materialkolor.dynamiccolor.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3812 implements InterfaceC6557 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C3811 f12000;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f12001;

    public /* synthetic */ C3812(C3811 c3811, int i) {
        this.f12001 = i;
        this.f12000 = c3811;
    }

    @Override // p052.InterfaceC6557
    public final Object invoke(Object obj) {
        int i = this.f12001;
        C3811 c3811 = this.f12000;
        C8259 c8259 = (C8259) obj;
        switch (i) {
            case 0:
                c8259.getClass();
                return c3811.mo8176();
            case 1:
                c8259.getClass();
                return Double.valueOf(c3811.mo8156().m8149(new C8259(c8259.f22869, c8259.f22868, false, c8259.f22866, c8259.f22865, c8259.f22864, c8259.f22871, c8259.f22870, c8259.f22874, c8259.f22872, c8259.f22875)));
            case 2:
                c8259.getClass();
                if (c8259.f22874 == DynamicScheme$Platform.PHONE) {
                    return c8259.f22867 ? c3811.mo8172() : c3811.mo8173();
                }
                return null;
            case 3:
                c8259.getClass();
                if (c8259.f22874 == DynamicScheme$Platform.PHONE) {
                    return c8259.f22867 ? c3811.mo8172() : c3811.mo8173();
                }
                return null;
            case 4:
                c8259.getClass();
                if (c8259.f22874 == DynamicScheme$Platform.WATCH) {
                    return new C3794(c3811.mo8180(), c3811.m8161(), 10.0d, TonePolarity.DARKER, false, ToneDeltaPair$DeltaConstraint.FARTHER, 16);
                }
                return null;
            case 5:
                c8259.getClass();
                return c8259.f22874 == DynamicScheme$Platform.PHONE ? c8259.f22867 ? c3811.mo8172() : c3811.mo8173() : c3811.m8158();
            case 6:
                c8259.getClass();
                if (c8259.f22874 == DynamicScheme$Platform.PHONE) {
                    return c8259.f22867 ? c3811.mo8172() : c3811.mo8173();
                }
                return null;
            case 7:
                c8259.getClass();
                if (c8259.f22874 == DynamicScheme$Platform.WATCH) {
                    return new C3794(c3811.mo8170(), c3811.m8160(), 10.0d, TonePolarity.DARKER, false, ToneDeltaPair$DeltaConstraint.FARTHER, 16);
                }
                return null;
            case 8:
                c8259.getClass();
                if (c8259.f22874 == DynamicScheme$Platform.PHONE) {
                    return c8259.f22867 ? c3811.mo8172() : c3811.mo8173();
                }
                return null;
            case 9:
                c8259.getClass();
                if (c8259.f22874 == DynamicScheme$Platform.WATCH) {
                    return new C3794(c3811.mo8156(), c3811.m8150(), 10.0d, TonePolarity.DARKER, false, ToneDeltaPair$DeltaConstraint.FARTHER, 16);
                }
                return null;
            default:
                c8259.getClass();
                if (c8259.f22874 == DynamicScheme$Platform.PHONE) {
                    return new C3794(c3811.mo8170(), c3811.mo8171(), 5.0d, TonePolarity.RELATIVE_LIGHTER, false, ToneDeltaPair$DeltaConstraint.FARTHER, 16);
                }
                return null;
        }
    }
}
