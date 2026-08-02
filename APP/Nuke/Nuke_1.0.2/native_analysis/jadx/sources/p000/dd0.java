package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class dd0 implements w41 {

    /* JADX INFO: renamed from: a */
    public static final dd0 f1998a = new dd0();

    /* JADX INFO: renamed from: b */
    public static final g32 f1999b = new g32("kotlin.time.Duration", f32.f2770o);

    @Override // p000.w41
    /* JADX INFO: renamed from: a */
    public final Object mo165a(y40 y40Var) {
        C0953z8 c0953z8 = ad0.f155i;
        String strMo909w = y40Var.mo909w();
        strMo909w.getClass();
        try {
            long jM3892D = pp0.m3892D(strMo909w);
            if (jM3892D == ad0.f158l) {
                throw new IllegalStateException("invariant failed");
            }
            return new ad0(jM3892D);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(vi0.m5691j("Invalid ISO duration string format: '", strMo909w, "'."), e);
        }
    }

    @Override // p000.w41
    /* JADX INFO: renamed from: d */
    public final void mo167d(ve0 ve0Var, Object obj) {
        long j = ((ad0) obj).f159h;
        C0953z8 c0953z8 = ad0.f155i;
        StringBuilder sb = new StringBuilder();
        if (j < 0) {
            sb.append('-');
        }
        sb.append("PT");
        long jM136g = j < 0 ? ad0.m136g(j) : j;
        long jM135f = ad0.m135f(jM136g, ed0.HOURS);
        boolean z = false;
        int iM135f = ad0.m133d(jM136g) ? 0 : (int) (ad0.m135f(jM136g, ed0.MINUTES) % 60);
        int iM135f2 = ad0.m133d(jM136g) ? 0 : (int) (ad0.m135f(jM136g, ed0.SECONDS) % 60);
        int iM132c = ad0.m132c(jM136g);
        if (ad0.m133d(j)) {
            jM135f = 9999999999999L;
        }
        boolean z2 = jM135f != 0;
        boolean z3 = (iM135f2 == 0 && iM132c == 0) ? false : true;
        if (iM135f != 0 || (z3 && z2)) {
            z = true;
        }
        if (z2) {
            sb.append(jM135f);
            sb.append('H');
        }
        if (z) {
            sb.append(iM135f);
            sb.append('M');
        }
        if (z3 || (!z2 && !z)) {
            ad0.m131b(sb, iM135f2, iM132c, 9, "S", true);
        }
        ve0Var.mo1191p(sb.toString());
    }

    @Override // p000.w41
    /* JADX INFO: renamed from: e */
    public final yo2 mo168e() {
        return f1999b;
    }
}
