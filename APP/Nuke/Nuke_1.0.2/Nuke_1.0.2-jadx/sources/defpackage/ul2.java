package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ul2 {
    public static final ml2 a = new ml2(1);
    public static final rl2 b = new rl2();
    public static final x80 c = new x80(1);
    public static final sl2 d = new sl2();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(im2 im2Var, long j, u00 u00Var) {
        tl2 tl2Var;
        z62 z62Var;
        im2 im2Var2;
        if (u00Var instanceof tl2) {
            tl2Var = (tl2) u00Var;
            int i = tl2Var.n;
            if ((i & Integer.MIN_VALUE) != 0) {
                tl2Var.n = i - Integer.MIN_VALUE;
            } else {
                tl2Var = new tl2(u00Var);
            }
        }
        Object obj = tl2Var.m;
        int i2 = tl2Var.n;
        if (i2 == 0) {
            fg1.T(obj);
            z62Var = new z62();
            f2 f2Var = new f2(im2Var, j, z62Var, (t00) null, 2);
            tl2Var.k = im2Var;
            tl2Var.l = z62Var;
            tl2Var.n = 1;
            Object objF = im2Var.f(bl1.h, f2Var, tl2Var);
            k20 k20Var = k20.h;
            if (objF == k20Var) {
                return k20Var;
            }
            im2Var2 = im2Var;
        } else {
            if (i2 != 1) {
                s.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z62 z62Var2 = tl2Var.l;
            im2 im2Var3 = tl2Var.k;
            fg1.T(obj);
            z62Var = z62Var2;
            im2Var2 = im2Var3;
        }
        return new rs1(im2Var2.h(z62Var.h));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static uh1 b(sz2 sz2Var, qv1 qv1Var, boolean z, boolean z2) {
        return new ql2(sz2Var, qv1Var, z, z2);
    }
}
