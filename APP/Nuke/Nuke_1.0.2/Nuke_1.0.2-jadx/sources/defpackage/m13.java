package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class m13 {
    public static final m13 d = new m13(0, 0, null, 0, 0, 0, null, null, 16777215);
    public final lt2 a;
    public final vw1 b;
    public final w02 c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Illegal instructions before constructor call */
    public m13(long j, long j2, im0 im0Var, long j3, int i, long j4, w02 w02Var, ya1 ya1Var, int i2) {
        long j5 = (i2 & 1) != 0 ? ju.g : j;
        long j6 = (i2 & 2) != 0 ? p13.c : j2;
        im0 im0Var2 = (i2 & 4) != 0 ? null : im0Var;
        o50 o50Var = (i2 & 32) != 0 ? null : mx2.a;
        long j7 = (i2 & 128) != 0 ? p13.c : j3;
        long j8 = ju.g;
        int i3 = (32768 & i2) != 0 ? 0 : i;
        long j9 = (131072 & i2) != 0 ? p13.c : j4;
        w02 w02Var2 = (524288 & i2) != 0 ? null : w02Var;
        ya1 ya1Var2 = (i2 & 1048576) != 0 ? null : ya1Var;
        w02 w02Var3 = w02Var2;
        this(new lt2(j5, j6, im0Var2, null, null, o50Var, null, j7, null, null, null, j8, null, null), new vw1(i3, 0, j9, null, w02Var3 != null ? w02Var3.a : null, ya1Var2, 0, 0, null), w02Var3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static m13 a(m13 m13Var, long j, long j2, im0 im0Var, mx2 mx2Var, long j3, long j4, w02 w02Var, ya1 ya1Var, int i) {
        long jB = (i & 1) != 0 ? m13Var.a.a.b() : j;
        long j5 = (i & 2) != 0 ? m13Var.a.b : j2;
        im0 im0Var2 = (i & 4) != 0 ? m13Var.a.c : im0Var;
        lt2 lt2Var = m13Var.a;
        gm0 gm0Var = lt2Var.d;
        hm0 hm0Var = lt2Var.e;
        mx2 mx2Var2 = (i & 32) != 0 ? lt2Var.f : mx2Var;
        String str = lt2Var.g;
        long j6 = (i & 128) != 0 ? lt2Var.h : j3;
        xj xjVar = lt2Var.i;
        m03 m03Var = lt2Var.j;
        kc1 kc1Var = lt2Var.k;
        long j7 = lt2Var.l;
        gz2 gz2Var = lt2Var.m;
        bq2 bq2Var = lt2Var.n;
        op0 op0Var = lt2Var.o;
        vw1 vw1Var = m13Var.b;
        int i2 = vw1Var.a;
        int i3 = vw1Var.b;
        long j8 = (i & 131072) != 0 ? vw1Var.c : j4;
        n03 n03Var = vw1Var.d;
        w02 w02Var2 = (i & 524288) != 0 ? m13Var.c : w02Var;
        return new m13(new lt2(ju.c(jB, lt2Var.a.b()) ? lt2Var.a : jB != 16 ? new wu(jB) : sn.U, j5, im0Var2, gm0Var, hm0Var, mx2Var2, str, j6, xjVar, m03Var, kc1Var, j7, gz2Var, bq2Var, op0Var), new vw1(i2, i3, j8, n03Var, w02Var2 != null ? w02Var2.a : null, (i & 1048576) != 0 ? vw1Var.f : ya1Var, vw1Var.g, vw1Var.h, vw1Var.i), w02Var2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static m13 d(m13 m13Var, long j, long j2, im0 im0Var, long j3, int i, long j4, int i2) {
        long j5 = (i2 & 2) != 0 ? p13.c : j2;
        im0 im0Var2 = (i2 & 4) != 0 ? null : im0Var;
        long j6 = (i2 & 128) != 0 ? p13.c : j3;
        long j7 = ju.g;
        int i3 = (32768 & i2) != 0 ? 0 : i;
        long j8 = (i2 & 131072) != 0 ? p13.c : j4;
        lt2 lt2VarA = mt2.a(m13Var.a, j, null, Float.NaN, j5, im0Var2, null, null, null, null, j6, null, null, null, j7, null, null, null);
        vw1 vw1VarA = ww1.a(m13Var.b, i3, 0, j8, null, null, null, 0, 0, null);
        return (m13Var.a == lt2VarA && m13Var.b == vw1VarA) ? m13Var : new m13(lt2VarA, vw1VarA);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final long b() {
        return this.a.a.b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean c(m13 m13Var) {
        if (this != m13Var) {
            return t11.l(this.b, m13Var.b) && this.a.a(m13Var.a);
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m13)) {
            return false;
        }
        m13 m13Var = (m13) obj;
        return t11.l(this.a, m13Var.a) && t11.l(this.b, m13Var.b) && t11.l(this.c, m13Var.c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        w02 w02Var = this.c;
        return iHashCode + (w02Var != null ? w02Var.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("TextStyle(color=");
        sb.append((Object) ju.i(b()));
        sb.append(", brush=");
        lt2 lt2Var = this.a;
        sb.append(lt2Var.a.k());
        sb.append(", alpha=");
        sb.append(lt2Var.a.a());
        sb.append(", fontSize=");
        sb.append((Object) p13.d(lt2Var.b));
        sb.append(", fontWeight=");
        sb.append(lt2Var.c);
        sb.append(", fontStyle=");
        sb.append(lt2Var.d);
        sb.append(", fontSynthesis=");
        sb.append(lt2Var.e);
        sb.append(", fontFamily=");
        sb.append(lt2Var.f);
        sb.append(", fontFeatureSettings=");
        sb.append(lt2Var.g);
        sb.append(", letterSpacing=");
        sb.append((Object) p13.d(lt2Var.h));
        sb.append(", baselineShift=");
        sb.append(lt2Var.i);
        sb.append(", textGeometricTransform=");
        sb.append(lt2Var.j);
        sb.append(", localeList=");
        sb.append(lt2Var.k);
        sb.append(", background=");
        hk1.l(lt2Var.l, sb, ", textDecoration=");
        sb.append(lt2Var.m);
        sb.append(", shadow=");
        sb.append(lt2Var.n);
        sb.append(", drawStyle=");
        sb.append(lt2Var.o);
        sb.append(", textAlign=");
        vw1 vw1Var = this.b;
        sb.append((Object) ky2.a(vw1Var.a));
        sb.append(", textDirection=");
        sb.append((Object) jz2.a(vw1Var.b));
        sb.append(", lineHeight=");
        sb.append((Object) p13.d(vw1Var.c));
        sb.append(", textIndent=");
        sb.append(vw1Var.d);
        sb.append(", platformStyle=");
        sb.append(this.c);
        sb.append(", lineHeightStyle=");
        sb.append(vw1Var.f);
        sb.append(", lineBreak=");
        sb.append((Object) ta1.a(vw1Var.g));
        sb.append(", hyphens=");
        sb.append((Object) bx0.a(vw1Var.h));
        sb.append(", textMotion=");
        sb.append(vw1Var.i);
        sb.append(')');
        return sb.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public m13(lt2 lt2Var, vw1 vw1Var) {
        lt2Var.getClass();
        k02 k02Var = vw1Var.e;
        this(lt2Var, vw1Var, k02Var == null ? null : new w02(k02Var));
    }

    public m13(lt2 lt2Var, vw1 vw1Var, w02 w02Var) {
        this.a = lt2Var;
        this.b = vw1Var;
        this.c = w02Var;
    }
}
