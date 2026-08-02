package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class dd0 implements w41 {
    public static final dd0 a = new dd0();
    public static final g32 b = new g32("kotlin.time.Duration", f32.o);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.w41
    public final Object a(y40 y40Var) {
        z8 z8Var = ad0.i;
        String strW = y40Var.w();
        strW.getClass();
        try {
            long jD = pp0.D(strW);
            if (jD == ad0.l) {
                throw new IllegalStateException("invariant failed");
            }
            return new ad0(jD);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(vi0.j("Invalid ISO duration string format: '", strW, "'."), e);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.w41
    public final void d(ve0 ve0Var, Object obj) {
        long j = ((ad0) obj).h;
        z8 z8Var = ad0.i;
        StringBuilder sb = new StringBuilder();
        if (j < 0) {
            sb.append('-');
        }
        sb.append("PT");
        long jG = j < 0 ? ad0.g(j) : j;
        long jF = ad0.f(jG, ed0.HOURS);
        boolean z = false;
        int iF = ad0.d(jG) ? 0 : (int) (ad0.f(jG, ed0.MINUTES) % 60);
        int iF2 = ad0.d(jG) ? 0 : (int) (ad0.f(jG, ed0.SECONDS) % 60);
        int iC = ad0.c(jG);
        if (ad0.d(j)) {
            jF = 9999999999999L;
        }
        boolean z2 = jF != 0;
        boolean z3 = (iF2 == 0 && iC == 0) ? false : true;
        if (iF != 0 || (z3 && z2)) {
            z = true;
        }
        if (z2) {
            sb.append(jF);
            sb.append('H');
        }
        if (z) {
            sb.append(iF);
            sb.append('M');
        }
        if (z3 || (!z2 && !z)) {
            ad0.b(sb, iF2, iC, 9, "S", true);
        }
        ve0Var.p(sb.toString());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.w41
    public final yo2 e() {
        return b;
    }
}
