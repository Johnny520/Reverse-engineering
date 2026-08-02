package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import org.luckypray.dexkit.DexKitBridge;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class tg1 extends w51 implements xm0 {
    public final /* synthetic */ int i;
    public final /* synthetic */ DexKitBridge j;
    public final /* synthetic */ ug1 k;
    public final /* synthetic */ int l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tg1(DexKitBridge dexKitBridge, ug1 ug1Var, int i, int i2) {
        super(0);
        this.i = i2;
        this.j = dexKitBridge;
        this.k = ug1Var;
        this.l = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.xm0
    public final Object a() {
        int i = this.i;
        int i2 = this.l;
        ug1 ug1Var = this.k;
        DexKitBridge dexKitBridge = this.j;
        switch (i) {
            case 0:
                ws wsVarD = dexKitBridge.D(new long[]{sj.f(i2, ug1Var.i)});
                return (us) (wsVarD.isEmpty() ? null : wsVarD.first());
            case 1:
                ArrayList arrayList = ug1Var.m;
                ArrayList arrayList2 = new ArrayList(eu.B(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(Long.valueOf(sj.f(i2, ((Number) it.next()).intValue())));
                }
                return dexKitBridge.D(du.G0(arrayList2));
            default:
                ws wsVarD2 = dexKitBridge.D(new long[]{sj.f(i2, ug1Var.l)});
                return (us) (wsVarD2.isEmpty() ? null : wsVarD2.first());
        }
    }
}
