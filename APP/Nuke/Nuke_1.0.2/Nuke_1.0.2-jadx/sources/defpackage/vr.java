package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class vr implements in0 {
    public final /* synthetic */ xk1 h;
    public final /* synthetic */ int i;
    public final /* synthetic */ zq j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public vr(xk1 xk1Var, int i, zq zqVar) {
        this.h = xk1Var;
        this.i = i;
        this.j = zqVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.in0
    public final Object j(Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        AtomicLong atomicLong = yr.a;
        xk1 xk1Var = this.h;
        ArrayList arrayListH0 = du.H0((List) xk1Var.getValue());
        arrayListH0.set(this.i, zq.a(this.j, null, zBooleanValue, null, null, false, null, null, null, null, 0, 0L, 0L, false, 16379));
        xk1Var.setValue(arrayListH0);
        return a83.a;
    }
}
