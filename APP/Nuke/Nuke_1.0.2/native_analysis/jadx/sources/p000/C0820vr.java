package p000;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: vr */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0820vr implements in0 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ xk1 f12138h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ int f12139i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ C0971zq f12140j;

    public C0820vr(xk1 xk1Var, int i, C0971zq c0971zq) {
        this.f12138h = xk1Var;
        this.f12139i = i;
        this.f12140j = c0971zq;
    }

    @Override // p000.in0
    /* JADX INFO: renamed from: j */
    public final Object mo5j(Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        AtomicLong atomicLong = AbstractC0933yr.f13595a;
        xk1 xk1Var = this.f12138h;
        ArrayList arrayListM1150H0 = AbstractC0142du.m1150H0((List) xk1Var.getValue());
        arrayListM1150H0.set(this.f12139i, C0971zq.m6480a(this.f12140j, null, zBooleanValue, null, null, false, null, null, null, null, 0, 0L, 0L, false, 16379));
        xk1Var.setValue(arrayListM1150H0);
        return a83.f116a;
    }
}
