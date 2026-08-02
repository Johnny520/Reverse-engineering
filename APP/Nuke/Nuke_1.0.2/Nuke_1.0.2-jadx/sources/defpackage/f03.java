package defpackage;

import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f03 implements in0 {
    public final /* synthetic */ int h;
    public final /* synthetic */ e70 i;
    public final /* synthetic */ xk1 j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ f03(e70 e70Var, xk1 xk1Var, int i) {
        this.h = i;
        this.i = e70Var;
        this.j = xk1Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.in0
    public final Object j(Object obj) {
        int i = this.h;
        xk1 xk1Var = this.j;
        e70 e70Var = this.i;
        switch (i) {
            case 0:
                gp1 gp1Var = new gp1((xm0) obj, 2);
                f03 f03Var = new f03(e70Var, xk1Var, 1);
                if (he1.a()) {
                    return he1.a() ? new ee1(gp1Var, f03Var, Build.VERSION.SDK_INT == 28 ? h02.b : h02.c) : rh1.a;
                }
                c80.t("Magnifier is only supported on API level 28 and higher.");
                return null;
            default:
                cb0 cb0Var = (cb0) obj;
                xk1Var.setValue(new h11((((long) e70Var.T(Float.intBitsToFloat((int) (cb0Var.a & 4294967295L)))) & 4294967295L) | (((long) e70Var.T(Float.intBitsToFloat((int) (cb0Var.a >> 32)))) << 32)));
                return a83.a;
        }
    }
}
