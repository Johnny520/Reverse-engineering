package defpackage;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ur implements xm0 {
    public final /* synthetic */ int h;
    public final /* synthetic */ int i;
    public final /* synthetic */ xk1 j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ ur(int i, xk1 xk1Var, int i2) {
        this.h = i2;
        this.i = i;
        this.j = xk1Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.xm0
    public final Object a() {
        int i = this.h;
        a83 a83Var = a83.a;
        int i2 = this.i;
        xk1 xk1Var = this.j;
        switch (i) {
            case 0:
                AtomicLong atomicLong = yr.a;
                xk1Var.setValue(yr.g((List) xk1Var.getValue(), i2, i2 - 1));
                break;
            default:
                AtomicLong atomicLong2 = yr.a;
                xk1Var.setValue(yr.g((List) xk1Var.getValue(), i2, i2 + 1));
                break;
        }
        return a83Var;
    }
}
