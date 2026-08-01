package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class he1 {

    /* JADX INFO: renamed from: a */
    public static final ug0 f2223a;

    /* JADX INFO: renamed from: b */
    public static final fe1[] f2224b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        ug0 ug0Var = new ug0(8);
        fe1.f1701a.getClass();
        ge1 ge1Var = ee1.f1432g;
        ug0Var.m4330i(1, ge1Var);
        ge1 ge1Var2 = ee1.f1431f;
        ug0Var.m4330i(2, ge1Var2);
        ge1 ge1Var3 = ee1.f1427b;
        ug0Var.m4330i(4, ge1Var3);
        ge1 ge1Var4 = ee1.f1429d;
        ug0Var.m4330i(8, ge1Var4);
        ge1 ge1Var5 = ee1.f1433h;
        ug0Var.m4330i(16, ge1Var5);
        ge1 ge1Var6 = ee1.f1430e;
        ug0Var.m4330i(32, ge1Var6);
        ge1 ge1Var7 = ee1.f1434i;
        ug0Var.m4330i(64, ge1Var7);
        ge1 ge1Var8 = ee1.f1428c;
        ug0Var.m4330i(128, ge1Var8);
        f2223a = ug0Var;
        f2224b = new fe1[]{ge1Var, ge1Var2, ge1Var3, ge1Var7, ge1Var5, ge1Var6, ge1Var4, ee1.f1435j, ge1Var8};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final void m1301a(vb0 vb0Var, d20 d20Var, long j, int i, int i2) {
        if (u50.m4268i(j, -1L)) {
            return;
        }
        vb0Var.m4473d(d20Var.m625b(), (int) ((j >>> 48) & 65535));
        vb0Var.m4473d(d20Var.m627d(), (int) ((j >>> 32) & 65535));
        vb0Var.m4473d(d20Var.m626c(), i - ((int) ((j >>> 16) & 65535)));
        vb0Var.m4473d(d20Var.m624a(), i2 - ((int) (j & 65535)));
    }
}
