package com.materialkolor.dynamiccolor;

import androidx.window.area.AbstractC3400;
import com.materialkolor.scheme.DynamicScheme$Platform;
import com.materialkolor.scheme.Variant;
import p068.InterfaceC7387;
import p279.AbstractC9085;
import p279.C9084;
import p281.C9089;
import p282.C9092;

/* JADX INFO: renamed from: com.materialkolor.dynamiccolor.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4651 implements InterfaceC7387 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C4644 f12356;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f12357;

    public /* synthetic */ C4651(C4644 c4644, int i) {
        this.f12357 = i;
        this.f12356 = c4644;
    }

    @Override // p068.InterfaceC7387
    public final Object invoke(Object obj) {
        double dM8695;
        double d;
        double d2;
        C9084 c9084M14382;
        int i = this.f12357;
        C4644 c4644 = this.f12356;
        C9089 c9089 = (C9089) obj;
        switch (i) {
            case 0:
                c9089.getClass();
                return c4644.mo8722();
            case 1:
                c9089.getClass();
                return c9089.f23218 == DynamicScheme$Platform.PHONE ? c9089.f23211 ? c4644.mo8718() : c4644.mo8719() : c4644.m8704();
            case 2:
                c9089.getClass();
                return Double.valueOf(c4644.mo8701().m8695(c9089));
            case 3:
                c9089.getClass();
                return new C4627(c4644.mo8700(), c4644.mo8701(), 5.0d, TonePolarity.DARKER, false, ToneDeltaPair$DeltaConstraint.EXACT, 16);
            case 4:
                c9089.getClass();
                return c9089.f23218 == DynamicScheme$Platform.PHONE ? c9089.f23211 ? c4644.mo8718() : c4644.mo8719() : c4644.m8704();
            case 5:
                c9089.getClass();
                if (c9089.f23218 == DynamicScheme$Platform.PHONE) {
                    return new C4627(c4644.mo8702(), c4644.mo8703(), 5.0d, TonePolarity.RELATIVE_LIGHTER, false, ToneDeltaPair$DeltaConstraint.FARTHER, 16);
                }
                return null;
            case 6:
                c9089.getClass();
                return Double.valueOf(c4644.mo8720().m8695(c9089));
            case 7:
                c9089.getClass();
                return new C4627(c4644.mo8721(), c4644.mo8720(), 5.0d, TonePolarity.DARKER, false, ToneDeltaPair$DeltaConstraint.EXACT, 16);
            case 8:
                c9089.getClass();
                return Double.valueOf(c4644.mo8723().m8695(c9089));
            case 9:
                c9089.getClass();
                return new C4627(c4644.mo8724(), c4644.mo8723(), 5.0d, TonePolarity.DARKER, false, ToneDeltaPair$DeltaConstraint.EXACT, 16);
            case 10:
                c9089.getClass();
                return Double.valueOf(c4644.mo8716().m8695(new C9089(c9089.f23213, c9089.f23212, false, c9089.f23210, c9089.f23209, c9089.f23208, c9089.f23215, c9089.f23214, c9089.f23218, c9089.f23216, c9089.f23219)));
            case 11:
                c9089.getClass();
                if (c9089.f23218 == DynamicScheme$Platform.PHONE) {
                    return c9089.f23211 ? c4644.mo8718() : c4644.mo8719();
                }
                return null;
            case 12:
                c9089.getClass();
                return c4644.m8704();
            case 13:
                c9089.getClass();
                return new C4627(c4644.m8706(), c4644.mo8717(), 5.0d, TonePolarity.DARKER, false, ToneDeltaPair$DeltaConstraint.FARTHER, 16);
            case 14:
                c9089.getClass();
                return c4644.m8704();
            case 15:
                c9089.getClass();
                return new C4627(c4644.m8696(), c4644.mo8703(), 5.0d, TonePolarity.DARKER, false, ToneDeltaPair$DeltaConstraint.FARTHER, 16);
            case 16:
                c9089.getClass();
                return c4644.m8704();
            case 17:
                c9089.getClass();
                return new C4627(c4644.m8707(), c4644.mo8725(), 5.0d, TonePolarity.DARKER, false, ToneDeltaPair$DeltaConstraint.FARTHER, 16);
            case 18:
                c9089.getClass();
                return c4644.m8704();
            case 19:
                c9089.getClass();
                return new C4627(c4644.m8699(), c4644.mo8714(), 5.0d, TonePolarity.DARKER, false, ToneDeltaPair$DeltaConstraint.FARTHER, 16);
            case 20:
                c9089.getClass();
                return c9089.f23218 == DynamicScheme$Platform.PHONE ? c9089.f23211 ? c4644.mo8718() : c4644.mo8719() : c4644.m8704();
            case 21:
                c9089.getClass();
                if (c9089.f23218 == DynamicScheme$Platform.PHONE) {
                    return new C4627(c4644.mo8726(), c4644.mo8725(), 5.0d, TonePolarity.RELATIVE_LIGHTER, false, ToneDeltaPair$DeltaConstraint.FARTHER, 16);
                }
                return null;
            case 22:
                c9089.getClass();
                return c9089.f23218 == DynamicScheme$Platform.PHONE ? c9089.f23211 ? c4644.mo8718() : c4644.mo8719() : c4644.m8704();
            case 23:
                c9089.getClass();
                if (c9089.f23218 == DynamicScheme$Platform.PHONE) {
                    return new C4627(c4644.mo8713(), c4644.mo8714(), 5.0d, TonePolarity.RELATIVE_LIGHTER, false, ToneDeltaPair$DeltaConstraint.FARTHER, 16);
                }
                return null;
            case 24:
                c9089.getClass();
                if (c9089.f23218 == DynamicScheme$Platform.PHONE) {
                    return c9089.f23211 ? c4644.mo8718() : c4644.mo8719();
                }
                return null;
            case 25:
                c9089.getClass();
                return Double.valueOf(c4644.mo8726().m8695(new C9089(c9089.f23213, c9089.f23212, false, c9089.f23210, c9089.f23209, c9089.f23208, c9089.f23215, c9089.f23214, c9089.f23218, c9089.f23216, c9089.f23219)));
            case 26:
                c9089.getClass();
                if (c9089.f23218 == DynamicScheme$Platform.PHONE) {
                    return c9089.f23211 ? c4644.mo8718() : c4644.mo8719();
                }
                return null;
            case 27:
                c9089.getClass();
                if (c9089.f23212 == Variant.VIBRANT) {
                    C9092 c9092 = c9089.f23215;
                    double d3 = c9092.f23223;
                    double d4 = 1.1d * c9092.f23222;
                    double d5 = 100.0d;
                    C9084 c9084M143822 = AbstractC9085.m14382(d3, d4, 100.0d);
                    while (true) {
                        d = d5;
                        do {
                            d2 = c9084M143822.f23200;
                            if (d2 < d4 && 0.0d <= d5 && d5 <= 100.0d) {
                                d5 -= 1.0d;
                                c9084M14382 = AbstractC9085.m14382(d3, d4, d5);
                            }
                        } while (d2 >= c9084M14382.f23200);
                        c9084M143822 = c9084M14382;
                    }
                    dM8695 = AbstractC3400.m5632(d, 0.0d, 100.0d);
                } else {
                    dM8695 = (c9089.f23218 == DynamicScheme$Platform.PHONE ? c9089.f23211 ? c4644.mo8718() : c4644.mo8719() : c4644.m8704()).m8695(c9089);
                }
                return Double.valueOf(dM8695);
            case 28:
                c9089.getClass();
                return c9089.f23218 == DynamicScheme$Platform.PHONE ? c9089.f23211 ? c4644.mo8718() : c4644.mo8719() : c4644.m8704();
            default:
                c9089.getClass();
                if (c9089.f23218 == DynamicScheme$Platform.WATCH) {
                    return new C4627(c4644.mo8713(), c4644.m8699(), 10.0d, TonePolarity.DARKER, false, ToneDeltaPair$DeltaConstraint.FARTHER, 16);
                }
                return null;
        }
    }
}
