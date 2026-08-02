package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class jf3 {

    /* JADX INFO: renamed from: a */
    public static final zj1 f5018a;

    /* JADX INFO: renamed from: b */
    public static final hf3[] f5019b;

    static {
        zj1 zj1Var = new zj1(8);
        hf3.f3996a.getClass();
        if3 if3Var = gf3.f3498g;
        zj1Var.m6421h(1, if3Var);
        if3 if3Var2 = gf3.f3497f;
        zj1Var.m6421h(2, if3Var2);
        if3 if3Var3 = gf3.f3493b;
        zj1Var.m6421h(4, if3Var3);
        if3 if3Var4 = gf3.f3495d;
        zj1Var.m6421h(8, if3Var4);
        if3 if3Var5 = gf3.f3499h;
        zj1Var.m6421h(16, if3Var5);
        if3 if3Var6 = gf3.f3496e;
        zj1Var.m6421h(32, if3Var6);
        if3 if3Var7 = gf3.f3500i;
        zj1Var.m6421h(64, if3Var7);
        if3 if3Var8 = gf3.f3494c;
        zj1Var.m6421h(128, if3Var8);
        f5018a = zj1Var;
        f5019b = new hf3[]{if3Var, if3Var2, if3Var3, if3Var7, if3Var5, if3Var6, if3Var4, gf3.f3501j, if3Var8};
    }

    /* JADX INFO: renamed from: a */
    public static final void m2494a(hd1 hd1Var, rz0 rz0Var, long j, int i, int i2) {
        if (n93.m3261b(j, -1L)) {
            return;
        }
        hd1Var.m2142a(rz0Var.m4635b(), (int) ((j >>> 48) & 65535));
        hd1Var.m2142a(rz0Var.m4637d(), (int) ((j >>> 32) & 65535));
        hd1Var.m2142a(rz0Var.m4636c(), i - ((int) ((j >>> 16) & 65535)));
        hd1Var.m2142a(rz0Var.m4634a(), i2 - ((int) (j & 65535)));
    }
}
