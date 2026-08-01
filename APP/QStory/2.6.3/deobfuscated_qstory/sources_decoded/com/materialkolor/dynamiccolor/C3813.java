package com.materialkolor.dynamiccolor;

import com.materialkolor.scheme.DynamicScheme$Platform;
import p052.InterfaceC6558;
import p265.C8260;

/* JADX INFO: renamed from: com.materialkolor.dynamiccolor.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3813 implements InterfaceC6558 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C3812 f12005;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f12006;

    public /* synthetic */ C3813(C3812 c3812, int i) {
        this.f12006 = i;
        this.f12005 = c3812;
    }

    @Override // p052.InterfaceC6558
    public final Object invoke(Object obj) {
        int i = this.f12006;
        C3812 c3812 = this.f12005;
        C8260 c8260 = (C8260) obj;
        switch (i) {
            case 0:
                c8260.getClass();
                return c3812.mo8163();
            case 1:
                c8260.getClass();
                return Double.valueOf(c3812.mo8143().m8136(new C8260(c8260.f22868, c8260.f22867, false, c8260.f22865, c8260.f22864, c8260.f22863, c8260.f22870, c8260.f22869, c8260.f22873, c8260.f22871, c8260.f22874)));
            case 2:
                c8260.getClass();
                if (c8260.f22873 == DynamicScheme$Platform.PHONE) {
                    return c8260.f22866 ? c3812.mo8159() : c3812.mo8160();
                }
                return null;
            case 3:
                c8260.getClass();
                if (c8260.f22873 == DynamicScheme$Platform.PHONE) {
                    return c8260.f22866 ? c3812.mo8159() : c3812.mo8160();
                }
                return null;
            case 4:
                c8260.getClass();
                if (c8260.f22873 == DynamicScheme$Platform.WATCH) {
                    return new C3795(c3812.mo8167(), c3812.m8148(), 10.0d, TonePolarity.DARKER, false, ToneDeltaPair$DeltaConstraint.FARTHER, 16);
                }
                return null;
            case 5:
                c8260.getClass();
                return c8260.f22873 == DynamicScheme$Platform.PHONE ? c8260.f22866 ? c3812.mo8159() : c3812.mo8160() : c3812.m8145();
            case 6:
                c8260.getClass();
                if (c8260.f22873 == DynamicScheme$Platform.PHONE) {
                    return c8260.f22866 ? c3812.mo8159() : c3812.mo8160();
                }
                return null;
            case 7:
                c8260.getClass();
                if (c8260.f22873 == DynamicScheme$Platform.WATCH) {
                    return new C3795(c3812.mo8157(), c3812.m8147(), 10.0d, TonePolarity.DARKER, false, ToneDeltaPair$DeltaConstraint.FARTHER, 16);
                }
                return null;
            case 8:
                c8260.getClass();
                if (c8260.f22873 == DynamicScheme$Platform.PHONE) {
                    return c8260.f22866 ? c3812.mo8159() : c3812.mo8160();
                }
                return null;
            case 9:
                c8260.getClass();
                if (c8260.f22873 == DynamicScheme$Platform.WATCH) {
                    return new C3795(c3812.mo8143(), c3812.m8137(), 10.0d, TonePolarity.DARKER, false, ToneDeltaPair$DeltaConstraint.FARTHER, 16);
                }
                return null;
            default:
                c8260.getClass();
                if (c8260.f22873 == DynamicScheme$Platform.PHONE) {
                    return new C3795(c3812.mo8157(), c3812.mo8158(), 5.0d, TonePolarity.RELATIVE_LIGHTER, false, ToneDeltaPair$DeltaConstraint.FARTHER, 16);
                }
                return null;
        }
    }
}
