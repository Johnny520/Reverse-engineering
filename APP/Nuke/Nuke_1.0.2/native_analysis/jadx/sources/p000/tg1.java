package p000;

import java.util.ArrayList;
import java.util.Iterator;
import org.luckypray.dexkit.DexKitBridge;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class tg1 extends w51 implements xm0 {

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ int f10738i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ DexKitBridge f10739j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ ug1 f10740k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ int f10741l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tg1(DexKitBridge dexKitBridge, ug1 ug1Var, int i, int i2) {
        super(0);
        this.f10738i = i2;
        this.f10739j = dexKitBridge;
        this.f10740k = ug1Var;
        this.f10741l = i;
    }

    @Override // p000.xm0
    /* JADX INFO: renamed from: a */
    public final Object mo6a() {
        int i = this.f10738i;
        int i2 = this.f10741l;
        ug1 ug1Var = this.f10740k;
        DexKitBridge dexKitBridge = this.f10739j;
        switch (i) {
            case 0:
                C0858ws c0858wsM3629D = dexKitBridge.m3629D(new long[]{AbstractC0696sj.m4872f(i2, ug1Var.f11290i)});
                return (C0784us) (c0858wsM3629D.isEmpty() ? null : c0858wsM3629D.first());
            case 1:
                ArrayList arrayList = ug1Var.f11294m;
                ArrayList arrayList2 = new ArrayList(AbstractC0179eu.m1421B(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(Long.valueOf(AbstractC0696sj.m4872f(i2, ((Number) it.next()).intValue())));
                }
                return dexKitBridge.m3629D(AbstractC0142du.m1149G0(arrayList2));
            default:
                C0858ws c0858wsM3629D2 = dexKitBridge.m3629D(new long[]{AbstractC0696sj.m4872f(i2, ug1Var.f11293l)});
                return (C0784us) (c0858wsM3629D2.isEmpty() ? null : c0858wsM3629D2.first());
        }
    }
}
