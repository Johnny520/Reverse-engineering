package defpackage;

import nuke.module.wechat.ai.AIChatConfig;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class lt2 implements od {
    public final l03 a;
    public final long b;
    public final im0 c;
    public final gm0 d;
    public final hm0 e;
    public final mx2 f;
    public final String g;
    public final long h;
    public final xj i;
    public final m03 j;
    public final kc1 k;
    public final long l;
    public final gz2 m;
    public final bq2 n;
    public final op0 o;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public lt2(long j, long j2, im0 im0Var, gm0 gm0Var, hm0 hm0Var, mx2 mx2Var, String str, long j3, xj xjVar, m03 m03Var, kc1 kc1Var, long j4, gz2 gz2Var, bq2 bq2Var, int i) {
        this((i & 1) != 0 ? ju.g : j, (i & 2) != 0 ? p13.c : j2, (i & 4) != 0 ? null : im0Var, (i & 8) != 0 ? null : gm0Var, (i & 16) != 0 ? null : hm0Var, (i & 32) != 0 ? null : mx2Var, (i & 64) != 0 ? null : str, (i & 128) != 0 ? p13.c : j3, (i & 256) != 0 ? null : xjVar, (i & AIChatConfig.DefaultMaxTokens) != 0 ? null : m03Var, (i & 1024) != 0 ? null : kc1Var, (i & 2048) != 0 ? ju.g : j4, (i & 4096) != 0 ? null : gz2Var, (i & 8192) != 0 ? null : bq2Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean a(lt2 lt2Var) {
        if (this == lt2Var) {
            return true;
        }
        return p13.a(this.b, lt2Var.b) && t11.l(this.c, lt2Var.c) && t11.l(this.d, lt2Var.d) && t11.l(this.e, lt2Var.e) && t11.l(this.f, lt2Var.f) && t11.l(this.g, lt2Var.g) && p13.a(this.h, lt2Var.h) && t11.l(this.i, lt2Var.i) && t11.l(this.j, lt2Var.j) && t11.l(this.k, lt2Var.k) && ju.c(this.l, lt2Var.l);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean b(lt2 lt2Var) {
        return t11.l(this.a, lt2Var.a) && t11.l(this.m, lt2Var.m) && t11.l(this.n, lt2Var.n) && t11.l(this.o, lt2Var.o);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final lt2 c(lt2 lt2Var) {
        if (lt2Var == null) {
            return this;
        }
        l03 l03Var = lt2Var.a;
        return mt2.a(this, l03Var.b(), l03Var.k(), l03Var.a(), lt2Var.b, lt2Var.c, lt2Var.d, lt2Var.e, lt2Var.f, lt2Var.g, lt2Var.h, lt2Var.i, lt2Var.j, lt2Var.k, lt2Var.l, lt2Var.m, lt2Var.n, lt2Var.o);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lt2)) {
            return false;
        }
        lt2 lt2Var = (lt2) obj;
        return a(lt2Var) && b(lt2Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        l03 l03Var = this.a;
        long jB = l03Var.b();
        int i = ju.h;
        int iHashCode = Long.hashCode(jB) * 31;
        an anVarK = l03Var.k();
        int iHashCode2 = (Float.hashCode(l03Var.a()) + ((iHashCode + (anVarK != null ? anVarK.hashCode() : 0)) * 31)) * 31;
        q13[] q13VarArr = p13.b;
        int iC = hk1.c(iHashCode2, 31, this.b);
        im0 im0Var = this.c;
        int i2 = (iC + (im0Var != null ? im0Var.h : 0)) * 31;
        gm0 gm0Var = this.d;
        int iHashCode3 = (i2 + (gm0Var != null ? Integer.hashCode(gm0Var.a) : 0)) * 31;
        hm0 hm0Var = this.e;
        int iHashCode4 = (iHashCode3 + (hm0Var != null ? Integer.hashCode(hm0Var.a) : 0)) * 31;
        mx2 mx2Var = this.f;
        int iHashCode5 = (iHashCode4 + (mx2Var != null ? mx2Var.hashCode() : 0)) * 31;
        String str = this.g;
        int iC2 = hk1.c((iHashCode5 + (str != null ? str.hashCode() : 0)) * 31, 31, this.h);
        xj xjVar = this.i;
        int iHashCode6 = (iC2 + (xjVar != null ? Float.hashCode(xjVar.a) : 0)) * 31;
        m03 m03Var = this.j;
        int iHashCode7 = (iHashCode6 + (m03Var != null ? m03Var.hashCode() : 0)) * 31;
        kc1 kc1Var = this.k;
        int iC3 = hk1.c((iHashCode7 + (kc1Var != null ? kc1Var.h.hashCode() : 0)) * 31, 31, this.l);
        gz2 gz2Var = this.m;
        int i3 = (iC3 + (gz2Var != null ? gz2Var.a : 0)) * 31;
        bq2 bq2Var = this.n;
        int iHashCode8 = (i3 + (bq2Var != null ? bq2Var.hashCode() : 0)) * 961;
        op0 op0Var = this.o;
        return iHashCode8 + (op0Var != null ? op0Var.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("SpanStyle(color=");
        l03 l03Var = this.a;
        sb.append((Object) ju.i(l03Var.b()));
        sb.append(", brush=");
        sb.append(l03Var.k());
        sb.append(", alpha=");
        sb.append(l03Var.a());
        sb.append(", fontSize=");
        sb.append((Object) p13.d(this.b));
        sb.append(", fontWeight=");
        sb.append(this.c);
        sb.append(", fontStyle=");
        sb.append(this.d);
        sb.append(", fontSynthesis=");
        sb.append(this.e);
        sb.append(", fontFamily=");
        sb.append(this.f);
        sb.append(", fontFeatureSettings=");
        sb.append(this.g);
        sb.append(", letterSpacing=");
        sb.append((Object) p13.d(this.h));
        sb.append(", baselineShift=");
        sb.append(this.i);
        sb.append(", textGeometricTransform=");
        sb.append(this.j);
        sb.append(", localeList=");
        sb.append(this.k);
        sb.append(", background=");
        hk1.l(this.l, sb, ", textDecoration=");
        sb.append(this.m);
        sb.append(", shadow=");
        sb.append(this.n);
        sb.append(", platformStyle=null, drawStyle=");
        sb.append(this.o);
        sb.append(')');
        return sb.toString();
    }

    public lt2(l03 l03Var, long j, im0 im0Var, gm0 gm0Var, hm0 hm0Var, mx2 mx2Var, String str, long j2, xj xjVar, m03 m03Var, kc1 kc1Var, long j3, gz2 gz2Var, bq2 bq2Var, op0 op0Var) {
        this.a = l03Var;
        this.b = j;
        this.c = im0Var;
        this.d = gm0Var;
        this.e = hm0Var;
        this.f = mx2Var;
        this.g = str;
        this.h = j2;
        this.i = xjVar;
        this.j = m03Var;
        this.k = kc1Var;
        this.l = j3;
        this.m = gz2Var;
        this.n = bq2Var;
        this.o = op0Var;
    }

    public lt2(long j, long j2, im0 im0Var, gm0 gm0Var, hm0 hm0Var, mx2 mx2Var, String str, long j3, xj xjVar, m03 m03Var, kc1 kc1Var, long j4, gz2 gz2Var, bq2 bq2Var) {
        this(j != 16 ? new wu(j) : sn.U, j2, im0Var, gm0Var, hm0Var, mx2Var, str, j3, xjVar, m03Var, kc1Var, j4, gz2Var, bq2Var, (op0) null);
    }
}
