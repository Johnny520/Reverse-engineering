package com.materialkolor.dynamiccolor;

import com.materialkolor.scheme.DynamicScheme$Platform;
import p068.InterfaceC7387;
import p281.C9089;

/* JADX INFO: renamed from: com.materialkolor.dynamiccolor.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4645 implements InterfaceC7387 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C4644 f12350;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f12351;

    public /* synthetic */ C4645(C4644 c4644, int i) {
        this.f12351 = i;
        this.f12350 = c4644;
    }

    @Override // p068.InterfaceC7387
    public final Object invoke(Object obj) {
        int i = this.f12351;
        C4644 c4644 = this.f12350;
        C9089 c9089 = (C9089) obj;
        switch (i) {
            case 0:
                c9089.getClass();
                return c4644.mo8722();
            case 1:
                c9089.getClass();
                return Double.valueOf(c4644.mo8702().m8695(new C9089(c9089.f23213, c9089.f23212, false, c9089.f23210, c9089.f23209, c9089.f23208, c9089.f23215, c9089.f23214, c9089.f23218, c9089.f23216, c9089.f23219)));
            case 2:
                c9089.getClass();
                if (c9089.f23218 == DynamicScheme$Platform.PHONE) {
                    return c9089.f23211 ? c4644.mo8718() : c4644.mo8719();
                }
                return null;
            case 3:
                c9089.getClass();
                if (c9089.f23218 == DynamicScheme$Platform.PHONE) {
                    return c9089.f23211 ? c4644.mo8718() : c4644.mo8719();
                }
                return null;
            case 4:
                c9089.getClass();
                if (c9089.f23218 == DynamicScheme$Platform.WATCH) {
                    return new C4627(c4644.mo8726(), c4644.m8707(), 10.0d, TonePolarity.DARKER, false, ToneDeltaPair$DeltaConstraint.FARTHER, 16);
                }
                return null;
            case 5:
                c9089.getClass();
                return c9089.f23218 == DynamicScheme$Platform.PHONE ? c9089.f23211 ? c4644.mo8718() : c4644.mo8719() : c4644.m8704();
            case 6:
                c9089.getClass();
                if (c9089.f23218 == DynamicScheme$Platform.PHONE) {
                    return c9089.f23211 ? c4644.mo8718() : c4644.mo8719();
                }
                return null;
            case 7:
                c9089.getClass();
                if (c9089.f23218 == DynamicScheme$Platform.WATCH) {
                    return new C4627(c4644.mo8716(), c4644.m8706(), 10.0d, TonePolarity.DARKER, false, ToneDeltaPair$DeltaConstraint.FARTHER, 16);
                }
                return null;
            case 8:
                c9089.getClass();
                if (c9089.f23218 == DynamicScheme$Platform.PHONE) {
                    return c9089.f23211 ? c4644.mo8718() : c4644.mo8719();
                }
                return null;
            case 9:
                c9089.getClass();
                if (c9089.f23218 == DynamicScheme$Platform.WATCH) {
                    return new C4627(c4644.mo8702(), c4644.m8696(), 10.0d, TonePolarity.DARKER, false, ToneDeltaPair$DeltaConstraint.FARTHER, 16);
                }
                return null;
            default:
                c9089.getClass();
                if (c9089.f23218 == DynamicScheme$Platform.PHONE) {
                    return new C4627(c4644.mo8716(), c4644.mo8717(), 5.0d, TonePolarity.RELATIVE_LIGHTER, false, ToneDeltaPair$DeltaConstraint.FARTHER, 16);
                }
                return null;
        }
    }
}
