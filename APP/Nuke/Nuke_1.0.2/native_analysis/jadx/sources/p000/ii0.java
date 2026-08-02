package p000;

import org.luckypray.dexkit.DexKitBridge;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ii0 extends w51 implements xm0 {

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ int f4631i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ DexKitBridge f4632j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ ji0 f4633k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ int f4634l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ii0(DexKitBridge dexKitBridge, ji0 ji0Var, int i, int i2) {
        super(0);
        this.f4631i = i2;
        this.f4632j = dexKitBridge;
        this.f4633k = ji0Var;
        this.f4634l = i;
    }

    @Override // p000.xm0
    /* JADX INFO: renamed from: a */
    public final Object mo6a() {
        int i = this.f4631i;
        int i2 = this.f4634l;
        ji0 ji0Var = this.f4633k;
        DexKitBridge dexKitBridge = this.f4632j;
        switch (i) {
            case 0:
                return (C0784us) dexKitBridge.m3629D(new long[]{AbstractC0696sj.m4872f(i2, ji0Var.f5046i)}).first();
            default:
                return (C0784us) dexKitBridge.m3629D(new long[]{AbstractC0696sj.m4872f(i2, ji0Var.f5049l)}).first();
        }
    }
}
