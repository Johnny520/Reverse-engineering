package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ul2 {

    /* JADX INFO: renamed from: a */
    public static final ml2 f11354a = new ml2(1);

    /* JADX INFO: renamed from: b */
    public static final rl2 f11355b = new rl2();

    /* JADX INFO: renamed from: c */
    public static final x80 f11356c = new x80(1);

    /* JADX INFO: renamed from: d */
    public static final sl2 f11357d = new sl2();

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m5511a(im2 im2Var, long j, u00 u00Var) {
        tl2 tl2Var;
        z62 z62Var;
        im2 im2Var2;
        if (u00Var instanceof tl2) {
            tl2Var = (tl2) u00Var;
            int i = tl2Var.f10843n;
            if ((i & Integer.MIN_VALUE) != 0) {
                tl2Var.f10843n = i - Integer.MIN_VALUE;
            } else {
                tl2Var = new tl2(u00Var);
            }
        }
        Object obj = tl2Var.f10842m;
        int i2 = tl2Var.f10843n;
        if (i2 == 0) {
            fg1.m1627T(obj);
            z62Var = new z62();
            C0188f2 c0188f2 = new C0188f2(im2Var, j, z62Var, (t00) null, 2);
            tl2Var.f10840k = im2Var;
            tl2Var.f10841l = z62Var;
            tl2Var.f10843n = 1;
            Object objM2369f = im2Var.m2369f(bl1.f932h, c0188f2, tl2Var);
            k20 k20Var = k20.f5323h;
            if (objM2369f == k20Var) {
                return k20Var;
            }
            im2Var2 = im2Var;
        } else {
            if (i2 != 1) {
                C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z62 z62Var2 = tl2Var.f10841l;
            im2 im2Var3 = tl2Var.f10840k;
            fg1.m1627T(obj);
            z62Var = z62Var2;
            im2Var2 = im2Var3;
        }
        return new rs1(im2Var2.m2371h(z62Var.f13745h));
    }

    /* JADX INFO: renamed from: b */
    public static uh1 m5512b(sz2 sz2Var, qv1 qv1Var, boolean z, boolean z2) {
        return new ql2(sz2Var, qv1Var, z, z2);
    }
}
