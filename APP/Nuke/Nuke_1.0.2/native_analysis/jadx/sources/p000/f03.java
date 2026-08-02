package p000;

import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f03 implements in0 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f2711h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ e70 f2712i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ xk1 f2713j;

    public /* synthetic */ f03(e70 e70Var, xk1 xk1Var, int i) {
        this.f2711h = i;
        this.f2712i = e70Var;
        this.f2713j = xk1Var;
    }

    @Override // p000.in0
    /* JADX INFO: renamed from: j */
    public final Object mo5j(Object obj) {
        int i = this.f2711h;
        xk1 xk1Var = this.f2713j;
        e70 e70Var = this.f2712i;
        switch (i) {
            case 0:
                gp1 gp1Var = new gp1((xm0) obj, 2);
                f03 f03Var = new f03(e70Var, xk1Var, 1);
                if (he1.m2147a()) {
                    return he1.m2147a() ? new ee1(gp1Var, f03Var, Build.VERSION.SDK_INT == 28 ? h02.f3754b : h02.f3755c) : rh1.f9587a;
                }
                c80.m676t("Magnifier is only supported on API level 28 and higher.");
                return null;
            default:
                cb0 cb0Var = (cb0) obj;
                xk1Var.setValue(new h11((((long) e70Var.mo692T(Float.intBitsToFloat((int) (cb0Var.f1296a & 4294967295L)))) & 4294967295L) | (((long) e70Var.mo692T(Float.intBitsToFloat((int) (cb0Var.f1296a >> 32)))) << 32)));
                return a83.f116a;
        }
    }
}
