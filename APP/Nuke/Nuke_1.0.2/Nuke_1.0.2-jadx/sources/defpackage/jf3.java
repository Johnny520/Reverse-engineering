package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class jf3 {
    public static final zj1 a;
    public static final hf3[] b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        zj1 zj1Var = new zj1(8);
        hf3.a.getClass();
        if3 if3Var = gf3.g;
        zj1Var.h(1, if3Var);
        if3 if3Var2 = gf3.f;
        zj1Var.h(2, if3Var2);
        if3 if3Var3 = gf3.b;
        zj1Var.h(4, if3Var3);
        if3 if3Var4 = gf3.d;
        zj1Var.h(8, if3Var4);
        if3 if3Var5 = gf3.h;
        zj1Var.h(16, if3Var5);
        if3 if3Var6 = gf3.e;
        zj1Var.h(32, if3Var6);
        if3 if3Var7 = gf3.i;
        zj1Var.h(64, if3Var7);
        if3 if3Var8 = gf3.c;
        zj1Var.h(128, if3Var8);
        a = zj1Var;
        b = new hf3[]{if3Var, if3Var2, if3Var3, if3Var7, if3Var5, if3Var6, if3Var4, gf3.j, if3Var8};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void a(hd1 hd1Var, rz0 rz0Var, long j, int i, int i2) {
        if (n93.b(j, -1L)) {
            return;
        }
        hd1Var.a(rz0Var.b(), (int) ((j >>> 48) & 65535));
        hd1Var.a(rz0Var.d(), (int) ((j >>> 32) & 65535));
        hd1Var.a(rz0Var.c(), i - ((int) ((j >>> 16) & 65535)));
        hd1Var.a(rz0Var.a(), i2 - ((int) (j & 65535)));
    }
}
