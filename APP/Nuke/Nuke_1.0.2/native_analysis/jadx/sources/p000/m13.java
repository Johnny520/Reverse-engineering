package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class m13 {

    /* JADX INFO: renamed from: d */
    public static final m13 f6434d = new m13(0, 0, null, 0, 0, 0, null, null, 16777215);

    /* JADX INFO: renamed from: a */
    public final lt2 f6435a;

    /* JADX INFO: renamed from: b */
    public final vw1 f6436b;

    /* JADX INFO: renamed from: c */
    public final w02 f6437c;

    /* JADX WARN: Illegal instructions before constructor call */
    public m13(long j, long j2, im0 im0Var, long j3, int i, long j4, w02 w02Var, ya1 ya1Var, int i2) {
        long j5 = (i2 & 1) != 0 ? C0363ju.f5217g : j;
        long j6 = (i2 & 2) != 0 ? p13.f7928c : j2;
        im0 im0Var2 = (i2 & 4) != 0 ? null : im0Var;
        o50 o50Var = (i2 & 32) != 0 ? null : mx2.f6914a;
        long j7 = (i2 & 128) != 0 ? p13.f7928c : j3;
        long j8 = C0363ju.f5217g;
        int i3 = (32768 & i2) != 0 ? 0 : i;
        long j9 = (131072 & i2) != 0 ? p13.f7928c : j4;
        w02 w02Var2 = (524288 & i2) != 0 ? null : w02Var;
        ya1 ya1Var2 = (i2 & 1048576) != 0 ? null : ya1Var;
        w02 w02Var3 = w02Var2;
        this(new lt2(j5, j6, im0Var2, null, null, o50Var, null, j7, null, null, null, j8, null, null), new vw1(i3, 0, j9, null, w02Var3 != null ? w02Var3.f12240a : null, ya1Var2, 0, 0, null), w02Var3);
    }

    /* JADX INFO: renamed from: a */
    public static m13 m3023a(m13 m13Var, long j, long j2, im0 im0Var, mx2 mx2Var, long j3, long j4, w02 w02Var, ya1 ya1Var, int i) {
        long jMo864b = (i & 1) != 0 ? m13Var.f6435a.f6301a.mo864b() : j;
        long j5 = (i & 2) != 0 ? m13Var.f6435a.f6302b : j2;
        im0 im0Var2 = (i & 4) != 0 ? m13Var.f6435a.f6303c : im0Var;
        lt2 lt2Var = m13Var.f6435a;
        gm0 gm0Var = lt2Var.f6304d;
        hm0 hm0Var = lt2Var.f6305e;
        mx2 mx2Var2 = (i & 32) != 0 ? lt2Var.f6306f : mx2Var;
        String str = lt2Var.f6307g;
        long j6 = (i & 128) != 0 ? lt2Var.f6308h : j3;
        C0888xj c0888xj = lt2Var.f6309i;
        m03 m03Var = lt2Var.f6310j;
        kc1 kc1Var = lt2Var.f6311k;
        long j7 = lt2Var.f6312l;
        gz2 gz2Var = lt2Var.f6313m;
        bq2 bq2Var = lt2Var.f6314n;
        op0 op0Var = lt2Var.f6315o;
        vw1 vw1Var = m13Var.f6436b;
        int i2 = vw1Var.f12198a;
        int i3 = vw1Var.f12199b;
        long j8 = (i & 131072) != 0 ? vw1Var.f12200c : j4;
        n03 n03Var = vw1Var.f12201d;
        w02 w02Var2 = (i & 524288) != 0 ? m13Var.f6437c : w02Var;
        return new m13(new lt2(C0363ju.m2566c(jMo864b, lt2Var.f6301a.mo864b()) ? lt2Var.f6301a : jMo864b != 16 ? new C0860wu(jMo864b) : C0700sn.f10217U, j5, im0Var2, gm0Var, hm0Var, mx2Var2, str, j6, c0888xj, m03Var, kc1Var, j7, gz2Var, bq2Var, op0Var), new vw1(i2, i3, j8, n03Var, w02Var2 != null ? w02Var2.f12240a : null, (i & 1048576) != 0 ? vw1Var.f12203f : ya1Var, vw1Var.f12204g, vw1Var.f12205h, vw1Var.f12206i), w02Var2);
    }

    /* JADX INFO: renamed from: d */
    public static m13 m3024d(m13 m13Var, long j, long j2, im0 im0Var, long j3, int i, long j4, int i2) {
        long j5 = (i2 & 2) != 0 ? p13.f7928c : j2;
        im0 im0Var2 = (i2 & 4) != 0 ? null : im0Var;
        long j6 = (i2 & 128) != 0 ? p13.f7928c : j3;
        long j7 = C0363ju.f5217g;
        int i3 = (32768 & i2) != 0 ? 0 : i;
        long j8 = (i2 & 131072) != 0 ? p13.f7928c : j4;
        lt2 lt2VarM3209a = mt2.m3209a(m13Var.f6435a, j, null, Float.NaN, j5, im0Var2, null, null, null, null, j6, null, null, null, j7, null, null, null);
        vw1 vw1VarM6017a = ww1.m6017a(m13Var.f6436b, i3, 0, j8, null, null, null, 0, 0, null);
        return (m13Var.f6435a == lt2VarM3209a && m13Var.f6436b == vw1VarM6017a) ? m13Var : new m13(lt2VarM3209a, vw1VarM6017a);
    }

    /* JADX INFO: renamed from: b */
    public final long m3025b() {
        return this.f6435a.f6301a.mo864b();
    }

    /* JADX INFO: renamed from: c */
    public final boolean m3026c(m13 m13Var) {
        if (this != m13Var) {
            return t11.m5086l(this.f6436b, m13Var.f6436b) && this.f6435a.m2971a(m13Var.f6435a);
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m13)) {
            return false;
        }
        m13 m13Var = (m13) obj;
        return t11.m5086l(this.f6435a, m13Var.f6435a) && t11.m5086l(this.f6436b, m13Var.f6436b) && t11.m5086l(this.f6437c, m13Var.f6437c);
    }

    public final int hashCode() {
        int iHashCode = (this.f6436b.hashCode() + (this.f6435a.hashCode() * 31)) * 31;
        w02 w02Var = this.f6437c;
        return iHashCode + (w02Var != null ? w02Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextStyle(color=");
        sb.append((Object) C0363ju.m2572i(m3025b()));
        sb.append(", brush=");
        lt2 lt2Var = this.f6435a;
        sb.append(lt2Var.f6301a.mo865k());
        sb.append(", alpha=");
        sb.append(lt2Var.f6301a.mo863a());
        sb.append(", fontSize=");
        sb.append((Object) p13.m3676d(lt2Var.f6302b));
        sb.append(", fontWeight=");
        sb.append(lt2Var.f6303c);
        sb.append(", fontStyle=");
        sb.append(lt2Var.f6304d);
        sb.append(", fontSynthesis=");
        sb.append(lt2Var.f6305e);
        sb.append(", fontFamily=");
        sb.append(lt2Var.f6306f);
        sb.append(", fontFeatureSettings=");
        sb.append(lt2Var.f6307g);
        sb.append(", letterSpacing=");
        sb.append((Object) p13.m3676d(lt2Var.f6308h));
        sb.append(", baselineShift=");
        sb.append(lt2Var.f6309i);
        sb.append(", textGeometricTransform=");
        sb.append(lt2Var.f6310j);
        sb.append(", localeList=");
        sb.append(lt2Var.f6311k);
        sb.append(", background=");
        hk1.m2213l(lt2Var.f6312l, sb, ", textDecoration=");
        sb.append(lt2Var.f6313m);
        sb.append(", shadow=");
        sb.append(lt2Var.f6314n);
        sb.append(", drawStyle=");
        sb.append(lt2Var.f6315o);
        sb.append(", textAlign=");
        vw1 vw1Var = this.f6436b;
        sb.append((Object) ky2.m2761a(vw1Var.f12198a));
        sb.append(", textDirection=");
        sb.append((Object) jz2.m2597a(vw1Var.f12199b));
        sb.append(", lineHeight=");
        sb.append((Object) p13.m3676d(vw1Var.f12200c));
        sb.append(", textIndent=");
        sb.append(vw1Var.f12201d);
        sb.append(", platformStyle=");
        sb.append(this.f6437c);
        sb.append(", lineHeightStyle=");
        sb.append(vw1Var.f12203f);
        sb.append(", lineBreak=");
        sb.append((Object) ta1.m5149a(vw1Var.f12204g));
        sb.append(", hyphens=");
        sb.append((Object) bx0.m598a(vw1Var.f12205h));
        sb.append(", textMotion=");
        sb.append(vw1Var.f12206i);
        sb.append(')');
        return sb.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public m13(lt2 lt2Var, vw1 vw1Var) {
        lt2Var.getClass();
        k02 k02Var = vw1Var.f12202e;
        this(lt2Var, vw1Var, k02Var == null ? null : new w02(k02Var));
    }

    public m13(lt2 lt2Var, vw1 vw1Var, w02 w02Var) {
        this.f6435a = lt2Var;
        this.f6436b = vw1Var;
        this.f6437c = w02Var;
    }
}
