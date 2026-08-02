package p000;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: ur */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0783ur implements xm0 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f11447h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ int f11448i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ xk1 f11449j;

    public /* synthetic */ C0783ur(int i, xk1 xk1Var, int i2) {
        this.f11447h = i2;
        this.f11448i = i;
        this.f11449j = xk1Var;
    }

    @Override // p000.xm0
    /* JADX INFO: renamed from: a */
    public final Object mo6a() {
        int i = this.f11447h;
        a83 a83Var = a83.f116a;
        int i2 = this.f11448i;
        xk1 xk1Var = this.f11449j;
        switch (i) {
            case 0:
                AtomicLong atomicLong = AbstractC0933yr.f13595a;
                xk1Var.setValue(AbstractC0933yr.m6318g((List) xk1Var.getValue(), i2, i2 - 1));
                break;
            default:
                AtomicLong atomicLong2 = AbstractC0933yr.f13595a;
                xk1Var.setValue(AbstractC0933yr.m6318g((List) xk1Var.getValue(), i2, i2 + 1));
                break;
        }
        return a83Var;
    }
}
