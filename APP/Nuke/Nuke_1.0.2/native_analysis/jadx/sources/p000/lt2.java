package p000;

import nuke.module.wechat.p002ai.AIChatConfig;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class lt2 implements InterfaceC0539od {

    /* JADX INFO: renamed from: a */
    public final l03 f6301a;

    /* JADX INFO: renamed from: b */
    public final long f6302b;

    /* JADX INFO: renamed from: c */
    public final im0 f6303c;

    /* JADX INFO: renamed from: d */
    public final gm0 f6304d;

    /* JADX INFO: renamed from: e */
    public final hm0 f6305e;

    /* JADX INFO: renamed from: f */
    public final mx2 f6306f;

    /* JADX INFO: renamed from: g */
    public final String f6307g;

    /* JADX INFO: renamed from: h */
    public final long f6308h;

    /* JADX INFO: renamed from: i */
    public final C0888xj f6309i;

    /* JADX INFO: renamed from: j */
    public final m03 f6310j;

    /* JADX INFO: renamed from: k */
    public final kc1 f6311k;

    /* JADX INFO: renamed from: l */
    public final long f6312l;

    /* JADX INFO: renamed from: m */
    public final gz2 f6313m;

    /* JADX INFO: renamed from: n */
    public final bq2 f6314n;

    /* JADX INFO: renamed from: o */
    public final op0 f6315o;

    public lt2(long j, long j2, im0 im0Var, gm0 gm0Var, hm0 hm0Var, mx2 mx2Var, String str, long j3, C0888xj c0888xj, m03 m03Var, kc1 kc1Var, long j4, gz2 gz2Var, bq2 bq2Var, int i) {
        this((i & 1) != 0 ? C0363ju.f5217g : j, (i & 2) != 0 ? p13.f7928c : j2, (i & 4) != 0 ? null : im0Var, (i & 8) != 0 ? null : gm0Var, (i & 16) != 0 ? null : hm0Var, (i & 32) != 0 ? null : mx2Var, (i & 64) != 0 ? null : str, (i & 128) != 0 ? p13.f7928c : j3, (i & 256) != 0 ? null : c0888xj, (i & AIChatConfig.DefaultMaxTokens) != 0 ? null : m03Var, (i & 1024) != 0 ? null : kc1Var, (i & 2048) != 0 ? C0363ju.f5217g : j4, (i & 4096) != 0 ? null : gz2Var, (i & 8192) != 0 ? null : bq2Var);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m2971a(lt2 lt2Var) {
        if (this == lt2Var) {
            return true;
        }
        return p13.m3673a(this.f6302b, lt2Var.f6302b) && t11.m5086l(this.f6303c, lt2Var.f6303c) && t11.m5086l(this.f6304d, lt2Var.f6304d) && t11.m5086l(this.f6305e, lt2Var.f6305e) && t11.m5086l(this.f6306f, lt2Var.f6306f) && t11.m5086l(this.f6307g, lt2Var.f6307g) && p13.m3673a(this.f6308h, lt2Var.f6308h) && t11.m5086l(this.f6309i, lt2Var.f6309i) && t11.m5086l(this.f6310j, lt2Var.f6310j) && t11.m5086l(this.f6311k, lt2Var.f6311k) && C0363ju.m2566c(this.f6312l, lt2Var.f6312l);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m2972b(lt2 lt2Var) {
        return t11.m5086l(this.f6301a, lt2Var.f6301a) && t11.m5086l(this.f6313m, lt2Var.f6313m) && t11.m5086l(this.f6314n, lt2Var.f6314n) && t11.m5086l(this.f6315o, lt2Var.f6315o);
    }

    /* JADX INFO: renamed from: c */
    public final lt2 m2973c(lt2 lt2Var) {
        if (lt2Var == null) {
            return this;
        }
        l03 l03Var = lt2Var.f6301a;
        return mt2.m3209a(this, l03Var.mo864b(), l03Var.mo865k(), l03Var.mo863a(), lt2Var.f6302b, lt2Var.f6303c, lt2Var.f6304d, lt2Var.f6305e, lt2Var.f6306f, lt2Var.f6307g, lt2Var.f6308h, lt2Var.f6309i, lt2Var.f6310j, lt2Var.f6311k, lt2Var.f6312l, lt2Var.f6313m, lt2Var.f6314n, lt2Var.f6315o);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lt2)) {
            return false;
        }
        lt2 lt2Var = (lt2) obj;
        return m2971a(lt2Var) && m2972b(lt2Var);
    }

    public final int hashCode() {
        l03 l03Var = this.f6301a;
        long jMo864b = l03Var.mo864b();
        int i = C0363ju.f5218h;
        int iHashCode = Long.hashCode(jMo864b) * 31;
        AbstractC0024an abstractC0024anMo865k = l03Var.mo865k();
        int iHashCode2 = (Float.hashCode(l03Var.mo863a()) + ((iHashCode + (abstractC0024anMo865k != null ? abstractC0024anMo865k.hashCode() : 0)) * 31)) * 31;
        q13[] q13VarArr = p13.f7927b;
        int iM2204c = hk1.m2204c(iHashCode2, 31, this.f6302b);
        im0 im0Var = this.f6303c;
        int i2 = (iM2204c + (im0Var != null ? im0Var.f4684h : 0)) * 31;
        gm0 gm0Var = this.f6304d;
        int iHashCode3 = (i2 + (gm0Var != null ? Integer.hashCode(gm0Var.f3581a) : 0)) * 31;
        hm0 hm0Var = this.f6305e;
        int iHashCode4 = (iHashCode3 + (hm0Var != null ? Integer.hashCode(hm0Var.f4076a) : 0)) * 31;
        mx2 mx2Var = this.f6306f;
        int iHashCode5 = (iHashCode4 + (mx2Var != null ? mx2Var.hashCode() : 0)) * 31;
        String str = this.f6307g;
        int iM2204c2 = hk1.m2204c((iHashCode5 + (str != null ? str.hashCode() : 0)) * 31, 31, this.f6308h);
        C0888xj c0888xj = this.f6309i;
        int iHashCode6 = (iM2204c2 + (c0888xj != null ? Float.hashCode(c0888xj.f13048a) : 0)) * 31;
        m03 m03Var = this.f6310j;
        int iHashCode7 = (iHashCode6 + (m03Var != null ? m03Var.hashCode() : 0)) * 31;
        kc1 kc1Var = this.f6311k;
        int iM2204c3 = hk1.m2204c((iHashCode7 + (kc1Var != null ? kc1Var.f5454h.hashCode() : 0)) * 31, 31, this.f6312l);
        gz2 gz2Var = this.f6313m;
        int i3 = (iM2204c3 + (gz2Var != null ? gz2Var.f3749a : 0)) * 31;
        bq2 bq2Var = this.f6314n;
        int iHashCode8 = (i3 + (bq2Var != null ? bq2Var.hashCode() : 0)) * 961;
        op0 op0Var = this.f6315o;
        return iHashCode8 + (op0Var != null ? op0Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SpanStyle(color=");
        l03 l03Var = this.f6301a;
        sb.append((Object) C0363ju.m2572i(l03Var.mo864b()));
        sb.append(", brush=");
        sb.append(l03Var.mo865k());
        sb.append(", alpha=");
        sb.append(l03Var.mo863a());
        sb.append(", fontSize=");
        sb.append((Object) p13.m3676d(this.f6302b));
        sb.append(", fontWeight=");
        sb.append(this.f6303c);
        sb.append(", fontStyle=");
        sb.append(this.f6304d);
        sb.append(", fontSynthesis=");
        sb.append(this.f6305e);
        sb.append(", fontFamily=");
        sb.append(this.f6306f);
        sb.append(", fontFeatureSettings=");
        sb.append(this.f6307g);
        sb.append(", letterSpacing=");
        sb.append((Object) p13.m3676d(this.f6308h));
        sb.append(", baselineShift=");
        sb.append(this.f6309i);
        sb.append(", textGeometricTransform=");
        sb.append(this.f6310j);
        sb.append(", localeList=");
        sb.append(this.f6311k);
        sb.append(", background=");
        hk1.m2213l(this.f6312l, sb, ", textDecoration=");
        sb.append(this.f6313m);
        sb.append(", shadow=");
        sb.append(this.f6314n);
        sb.append(", platformStyle=null, drawStyle=");
        sb.append(this.f6315o);
        sb.append(')');
        return sb.toString();
    }

    public lt2(l03 l03Var, long j, im0 im0Var, gm0 gm0Var, hm0 hm0Var, mx2 mx2Var, String str, long j2, C0888xj c0888xj, m03 m03Var, kc1 kc1Var, long j3, gz2 gz2Var, bq2 bq2Var, op0 op0Var) {
        this.f6301a = l03Var;
        this.f6302b = j;
        this.f6303c = im0Var;
        this.f6304d = gm0Var;
        this.f6305e = hm0Var;
        this.f6306f = mx2Var;
        this.f6307g = str;
        this.f6308h = j2;
        this.f6309i = c0888xj;
        this.f6310j = m03Var;
        this.f6311k = kc1Var;
        this.f6312l = j3;
        this.f6313m = gz2Var;
        this.f6314n = bq2Var;
        this.f6315o = op0Var;
    }

    public lt2(long j, long j2, im0 im0Var, gm0 gm0Var, hm0 hm0Var, mx2 mx2Var, String str, long j3, C0888xj c0888xj, m03 m03Var, kc1 kc1Var, long j4, gz2 gz2Var, bq2 bq2Var) {
        this(j != 16 ? new C0860wu(j) : C0700sn.f10217U, j2, im0Var, gm0Var, hm0Var, mx2Var, str, j3, c0888xj, m03Var, kc1Var, j4, gz2Var, bq2Var, (op0) null);
    }
}
