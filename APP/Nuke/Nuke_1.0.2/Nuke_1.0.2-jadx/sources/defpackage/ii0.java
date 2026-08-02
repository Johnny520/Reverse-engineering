package defpackage;

import org.luckypray.dexkit.DexKitBridge;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ii0 extends w51 implements xm0 {
    public final /* synthetic */ int i;
    public final /* synthetic */ DexKitBridge j;
    public final /* synthetic */ ji0 k;
    public final /* synthetic */ int l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ii0(DexKitBridge dexKitBridge, ji0 ji0Var, int i, int i2) {
        super(0);
        this.i = i2;
        this.j = dexKitBridge;
        this.k = ji0Var;
        this.l = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.xm0
    public final Object a() {
        int i = this.i;
        int i2 = this.l;
        ji0 ji0Var = this.k;
        DexKitBridge dexKitBridge = this.j;
        switch (i) {
            case 0:
                return (us) dexKitBridge.D(new long[]{sj.f(i2, ji0Var.i)}).first();
            default:
                return (us) dexKitBridge.D(new long[]{sj.f(i2, ji0Var.l)}).first();
        }
    }
}
