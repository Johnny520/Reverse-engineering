package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class j31 implements InterfaceC0120d8 {

    /* JADX INFO: renamed from: a */
    public final x61 f2670a;

    /* JADX INFO: renamed from: b */
    public final long f2671b;

    /* JADX INFO: renamed from: c */
    public final C1018zv f2672c;

    /* JADX INFO: renamed from: d */
    public final C0940xv f2673d;

    /* JADX INFO: renamed from: e */
    public final C0977yv f2674e;

    /* JADX INFO: renamed from: f */
    public final z51 f2675f;

    /* JADX INFO: renamed from: g */
    public final String f2676g;

    /* JADX INFO: renamed from: h */
    public final long f2677h;

    /* JADX INFO: renamed from: i */
    public final C0992z9 f2678i;

    /* JADX INFO: renamed from: j */
    public final y61 f2679j;

    /* JADX INFO: renamed from: k */
    public final fb0 f2680k;

    /* JADX INFO: renamed from: l */
    public final long f2681l;

    /* JADX INFO: renamed from: m */
    public final u61 f2682m;

    /* JADX INFO: renamed from: n */
    public final v01 f2683n;

    /* JADX INFO: renamed from: o */
    public final o30 f2684o;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public j31(long j, long j2, C1018zv c1018zv, C0940xv c0940xv, C0977yv c0977yv, z51 z51Var, String str, long j3, C0992z9 c0992z9, y61 y61Var, fb0 fb0Var, long j4, u61 u61Var, v01 v01Var, int i) {
        this((i & 1) != 0 ? C0207ff.f1707g : j, (i & 2) != 0 ? u71.f6158c : j2, (i & 4) != 0 ? null : c1018zv, (i & 8) != 0 ? null : c0940xv, (i & 16) != 0 ? null : c0977yv, (i & 32) != 0 ? null : z51Var, (i & 64) != 0 ? null : str, (i & 128) != 0 ? u71.f6158c : j3, (i & 256) != 0 ? null : c0992z9, (i & 512) != 0 ? null : y61Var, (i & 1024) != 0 ? null : fb0Var, (i & 2048) != 0 ? C0207ff.f1707g : j4, (i & 4096) != 0 ? null : u61Var, (i & 8192) != 0 ? null : v01Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final boolean m1607a(j31 j31Var) {
        if (this == j31Var) {
            return true;
        }
        return u71.m4286a(this.f2671b, j31Var.f2671b) && p30.m3002l(this.f2672c, j31Var.f2672c) && p30.m3002l(this.f2673d, j31Var.f2673d) && p30.m3002l(this.f2674e, j31Var.f2674e) && p30.m3002l(this.f2675f, j31Var.f2675f) && p30.m3002l(this.f2676g, j31Var.f2676g) && u71.m4286a(this.f2677h, j31Var.f2677h) && p30.m3002l(this.f2678i, j31Var.f2678i) && p30.m3002l(this.f2679j, j31Var.f2679j) && p30.m3002l(this.f2680k, j31Var.f2680k) && C0207ff.m1094c(this.f2681l, j31Var.f2681l);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final boolean m1608b(j31 j31Var) {
        return p30.m3002l(this.f2670a, j31Var.f2670a) && p30.m3002l(this.f2682m, j31Var.f2682m) && p30.m3002l(this.f2683n, j31Var.f2683n) && p30.m3002l(this.f2684o, j31Var.f2684o);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final j31 m1609c(j31 j31Var) {
        if (j31Var == null) {
            return this;
        }
        x61 x61Var = j31Var.f2670a;
        return k31.m1763a(this, x61Var.mo2626a(), x61Var.mo2627e(), x61Var.mo2628f(), j31Var.f2671b, j31Var.f2672c, j31Var.f2673d, j31Var.f2674e, j31Var.f2675f, j31Var.f2676g, j31Var.f2677h, j31Var.f2678i, j31Var.f2679j, j31Var.f2680k, j31Var.f2681l, j31Var.f2682m, j31Var.f2683n, j31Var.f2684o);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j31)) {
            return false;
        }
        j31 j31Var = (j31) obj;
        return m1607a(j31Var) && m1608b(j31Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        x61 x61Var = this.f2670a;
        long jMo2626a = x61Var.mo2626a();
        int i = C0207ff.f1708h;
        int iHashCode = Long.hashCode(jMo2626a) * 31;
        pf1 pf1VarMo2627e = x61Var.mo2627e();
        int iHashCode2 = (Float.hashCode(x61Var.mo2628f()) + ((iHashCode + (pf1VarMo2627e != null ? pf1VarMo2627e.hashCode() : 0)) * 31)) * 31;
        v71[] v71VarArr = u71.f6157b;
        int iM4146d = AbstractC0748t1.m4146d(this.f2671b, iHashCode2, 31);
        C1018zv c1018zv = this.f2672c;
        int i2 = (iM4146d + (c1018zv != null ? c1018zv.f8009d : 0)) * 31;
        C0940xv c0940xv = this.f2673d;
        int iHashCode3 = (i2 + (c0940xv != null ? Integer.hashCode(c0940xv.f7426a) : 0)) * 31;
        C0977yv c0977yv = this.f2674e;
        int iHashCode4 = (iHashCode3 + (c0977yv != null ? Integer.hashCode(c0977yv.f7696a) : 0)) * 31;
        z51 z51Var = this.f2675f;
        int iHashCode5 = (iHashCode4 + (z51Var != null ? z51Var.hashCode() : 0)) * 31;
        String str = this.f2676g;
        int iM4146d2 = AbstractC0748t1.m4146d(this.f2677h, (iHashCode5 + (str != null ? str.hashCode() : 0)) * 31, 31);
        C0992z9 c0992z9 = this.f2678i;
        int iHashCode6 = (iM4146d2 + (c0992z9 != null ? Float.hashCode(c0992z9.f7838a) : 0)) * 31;
        y61 y61Var = this.f2679j;
        int iHashCode7 = (iHashCode6 + (y61Var != null ? y61Var.hashCode() : 0)) * 31;
        fb0 fb0Var = this.f2680k;
        int iM4146d3 = AbstractC0748t1.m4146d(this.f2681l, (iHashCode7 + (fb0Var != null ? fb0Var.f1651d.hashCode() : 0)) * 31, 31);
        u61 u61Var = this.f2682m;
        int i3 = (iM4146d3 + (u61Var != null ? u61Var.f6145a : 0)) * 31;
        v01 v01Var = this.f2683n;
        int iHashCode8 = (i3 + (v01Var != null ? v01Var.hashCode() : 0)) * 961;
        o30 o30Var = this.f2684o;
        return iHashCode8 + (o30Var != null ? o30Var.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("SpanStyle(color=");
        x61 x61Var = this.f2670a;
        sb.append((Object) C0207ff.m1100i(x61Var.mo2626a()));
        sb.append(", brush=");
        sb.append(x61Var.mo2627e());
        sb.append(", alpha=");
        sb.append(x61Var.mo2628f());
        sb.append(", fontSize=");
        sb.append((Object) u71.m4289d(this.f2671b));
        sb.append(", fontWeight=");
        sb.append(this.f2672c);
        sb.append(", fontStyle=");
        sb.append(this.f2673d);
        sb.append(", fontSynthesis=");
        sb.append(this.f2674e);
        sb.append(", fontFamily=");
        sb.append(this.f2675f);
        sb.append(", fontFeatureSettings=");
        sb.append(this.f2676g);
        sb.append(", letterSpacing=");
        sb.append((Object) u71.m4289d(this.f2677h));
        sb.append(", baselineShift=");
        sb.append(this.f2678i);
        sb.append(", textGeometricTransform=");
        sb.append(this.f2679j);
        sb.append(", localeList=");
        sb.append(this.f2680k);
        sb.append(", background=");
        AbstractC0748t1.m4158p(this.f2681l, sb, ", textDecoration=");
        sb.append(this.f2682m);
        sb.append(", shadow=");
        sb.append(this.f2683n);
        sb.append(", platformStyle=null, drawStyle=");
        sb.append(this.f2684o);
        sb.append(')');
        return sb.toString();
    }

    public j31(x61 x61Var, long j, C1018zv c1018zv, C0940xv c0940xv, C0977yv c0977yv, z51 z51Var, String str, long j2, C0992z9 c0992z9, y61 y61Var, fb0 fb0Var, long j3, u61 u61Var, v01 v01Var, o30 o30Var) {
        this.f2670a = x61Var;
        this.f2671b = j;
        this.f2672c = c1018zv;
        this.f2673d = c0940xv;
        this.f2674e = c0977yv;
        this.f2675f = z51Var;
        this.f2676g = str;
        this.f2677h = j2;
        this.f2678i = c0992z9;
        this.f2679j = y61Var;
        this.f2680k = fb0Var;
        this.f2681l = j3;
        this.f2682m = u61Var;
        this.f2683n = v01Var;
        this.f2684o = o30Var;
    }

    public j31(long j, long j2, C1018zv c1018zv, C0940xv c0940xv, C0977yv c0977yv, z51 z51Var, String str, long j3, C0992z9 c0992z9, y61 y61Var, fb0 fb0Var, long j4, u61 u61Var, v01 v01Var) {
        this(j != 16 ? new C0724sf(j) : C0496n2.f4142V, j2, c1018zv, c0940xv, c0977yv, z51Var, str, j3, c0992z9, y61Var, fb0Var, j4, u61Var, v01Var, (o30) null);
    }
}
