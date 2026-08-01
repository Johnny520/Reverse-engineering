package p000;

import org.luckypray.dexkit.result.MethodData;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class s71 {

    /* JADX INFO: renamed from: d */
    public static final s71 f5668d = new s71(0, null, 0, 0, 16777215);

    /* JADX INFO: renamed from: a */
    public final j31 f5669a;

    /* JADX INFO: renamed from: b */
    public final ap0 f5670b;

    /* JADX INFO: renamed from: c */
    public final hr0 f5671c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Illegal instructions before constructor call */
    public s71(long j, C1018zv c1018zv, long j2, long j3, int i) {
        long j4 = C0207ff.f1707g;
        this(new j31(j4, (i & 2) != 0 ? u71.f6158c : j, (i & 4) != 0 ? null : c1018zv, null, null, (i & 32) != 0 ? null : z51.f7804a, null, (i & 128) != 0 ? u71.f6158c : j2, null, null, null, j4, null, null), new ap0(0, 0, (i & MethodData.ACC_DECLARED_SYNCHRONIZED) != 0 ? u71.f6158c : j3, null, null, null, 0, 0, null), null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static s71 m4010a(s71 s71Var, long j, C1018zv c1018zv, z51 z51Var, long j2, long j3, la0 la0Var, int i) {
        C0992z9 c0992z9;
        y61 y61Var;
        long j4;
        hr0 hr0Var = p30.f4736c;
        long jMo2626a = s71Var.f5669a.f2670a.mo2626a();
        long j5 = (i & 2) != 0 ? s71Var.f5669a.f2671b : j;
        C1018zv c1018zv2 = (i & 4) != 0 ? s71Var.f5669a.f2672c : c1018zv;
        j31 j31Var = s71Var.f5669a;
        C0940xv c0940xv = j31Var.f2673d;
        C0977yv c0977yv = j31Var.f2674e;
        z51 z51Var2 = (i & 32) != 0 ? j31Var.f2675f : z51Var;
        String str = j31Var.f2676g;
        long j6 = (i & 128) != 0 ? j31Var.f2677h : j2;
        C0992z9 c0992z92 = j31Var.f2678i;
        y61 y61Var2 = j31Var.f2679j;
        fb0 fb0Var = j31Var.f2680k;
        long j7 = j31Var.f2681l;
        u61 u61Var = j31Var.f2682m;
        v01 v01Var = j31Var.f2683n;
        o30 o30Var = j31Var.f2684o;
        ap0 ap0Var = s71Var.f5670b;
        int i2 = ap0Var.f224a;
        int i3 = ap0Var.f225b;
        if ((i & MethodData.ACC_DECLARED_SYNCHRONIZED) != 0) {
            c0992z9 = c0992z92;
            y61Var = y61Var2;
            j4 = ap0Var.f226c;
        } else {
            c0992z9 = c0992z92;
            y61Var = y61Var2;
            j4 = j3;
        }
        z61 z61Var = ap0Var.f227d;
        hr0 hr0Var2 = (i & 524288) != 0 ? s71Var.f5671c : hr0Var;
        return new s71(new j31(C0207ff.m1094c(jMo2626a, j31Var.f2670a.mo2626a()) ? j31Var.f2670a : jMo2626a != 16 ? new C0724sf(jMo2626a) : C0496n2.f4142V, j5, c1018zv2, c0940xv, c0977yv, z51Var2, str, j6, c0992z9, y61Var, fb0Var, j7, u61Var, v01Var, o30Var), new ap0(i2, i3, j4, z61Var, hr0Var2 != null ? hr0Var2.f2353a : null, (i & 1048576) != 0 ? ap0Var.f229f : la0Var, ap0Var.f230g, ap0Var.f231h, ap0Var.f232i), hr0Var2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static s71 m4011d(s71 s71Var, long j, long j2, C1018zv c1018zv, z51 z51Var, long j3, int i, long j4, int i2) {
        long j5 = (i2 & 2) != 0 ? u71.f6158c : j2;
        C1018zv c1018zv2 = (i2 & 4) != 0 ? null : c1018zv;
        z51 z51Var2 = (i2 & 32) != 0 ? null : z51Var;
        long j6 = (i2 & 128) != 0 ? u71.f6158c : j3;
        long j7 = C0207ff.f1707g;
        int i3 = (32768 & i2) != 0 ? 0 : i;
        long j8 = (i2 & MethodData.ACC_DECLARED_SYNCHRONIZED) != 0 ? u71.f6158c : j4;
        j31 j31VarM1763a = k31.m1763a(s71Var.f5669a, j, null, Float.NaN, j5, c1018zv2, null, null, z51Var2, null, j6, null, null, null, j7, null, null, null);
        ap0 ap0VarM360a = bp0.m360a(s71Var.f5670b, i3, 0, j8, null, null, null, 0, 0, null);
        return (s71Var.f5669a == j31VarM1763a && s71Var.f5670b == ap0VarM360a) ? s71Var : new s71(j31VarM1763a, ap0VarM360a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final long m4012b() {
        return this.f5669a.f2670a.mo2626a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final s71 m4013c(s71 s71Var) {
        return (s71Var == null || s71Var.equals(f5668d)) ? this : new s71(this.f5669a.m1609c(s71Var.f5669a), this.f5670b.m195a(s71Var.f5670b));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s71)) {
            return false;
        }
        s71 s71Var = (s71) obj;
        return p30.m3002l(this.f5669a, s71Var.f5669a) && p30.m3002l(this.f5670b, s71Var.f5670b) && p30.m3002l(this.f5671c, s71Var.f5671c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iHashCode = (this.f5670b.hashCode() + (this.f5669a.hashCode() * 31)) * 31;
        hr0 hr0Var = this.f5671c;
        return iHashCode + (hr0Var != null ? hr0Var.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("TextStyle(color=");
        sb.append((Object) C0207ff.m1100i(m4012b()));
        sb.append(", brush=");
        j31 j31Var = this.f5669a;
        sb.append(j31Var.f2670a.mo2627e());
        sb.append(", alpha=");
        sb.append(j31Var.f2670a.mo2628f());
        sb.append(", fontSize=");
        sb.append((Object) u71.m4289d(j31Var.f2671b));
        sb.append(", fontWeight=");
        sb.append(j31Var.f2672c);
        sb.append(", fontStyle=");
        sb.append(j31Var.f2673d);
        sb.append(", fontSynthesis=");
        sb.append(j31Var.f2674e);
        sb.append(", fontFamily=");
        sb.append(j31Var.f2675f);
        sb.append(", fontFeatureSettings=");
        sb.append(j31Var.f2676g);
        sb.append(", letterSpacing=");
        sb.append((Object) u71.m4289d(j31Var.f2677h));
        sb.append(", baselineShift=");
        sb.append(j31Var.f2678i);
        sb.append(", textGeometricTransform=");
        sb.append(j31Var.f2679j);
        sb.append(", localeList=");
        sb.append(j31Var.f2680k);
        sb.append(", background=");
        AbstractC0748t1.m4158p(j31Var.f2681l, sb, ", textDecoration=");
        sb.append(j31Var.f2682m);
        sb.append(", shadow=");
        sb.append(j31Var.f2683n);
        sb.append(", drawStyle=");
        sb.append(j31Var.f2684o);
        sb.append(", textAlign=");
        ap0 ap0Var = this.f5670b;
        sb.append((Object) r61.m3425a(ap0Var.f224a));
        sb.append(", textDirection=");
        sb.append((Object) w61.m4920a(ap0Var.f225b));
        sb.append(", lineHeight=");
        sb.append((Object) u71.m4289d(ap0Var.f226c));
        sb.append(", textIndent=");
        sb.append(ap0Var.f227d);
        sb.append(", platformStyle=");
        sb.append(this.f5671c);
        sb.append(", lineHeightStyle=");
        sb.append(ap0Var.f229f);
        sb.append(", lineBreak=");
        sb.append((Object) ga0.m1235a(ap0Var.f230g));
        sb.append(", hyphens=");
        sb.append((Object) C0336iz.m1605a(ap0Var.f231h));
        sb.append(", textMotion=");
        sb.append(ap0Var.f232i);
        sb.append(')');
        return sb.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public s71(j31 j31Var, ap0 ap0Var) {
        j31Var.getClass();
        er0 er0Var = ap0Var.f228e;
        this(j31Var, ap0Var, er0Var == null ? null : new hr0(er0Var));
    }

    public s71(j31 j31Var, ap0 ap0Var, hr0 hr0Var) {
        this.f5669a = j31Var;
        this.f5670b = ap0Var;
        this.f5671c = hr0Var;
    }
}
