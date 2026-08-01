package p092S0;

import p011B4.AbstractC0231b;
import p110W0.AbstractC1592q;
import p110W0.C1578c;
import p110W0.C1585j;
import p110W0.C1586k;
import p110W0.C1587l;
import p117X2.AbstractC1665j;
import p125Z0.C1781b;
import p147d1.C1951a;
import p147d1.C1953c;
import p147d1.C1954d;
import p147d1.C1955e;
import p147d1.C1959i;
import p147d1.C1961k;
import p147d1.C1962l;
import p147d1.C1963m;
import p147d1.C1964n;
import p147d1.C1966p;
import p147d1.C1967q;
import p153e1.C2019o;
import p211o0.C2737L;
import p211o0.C2762u;
import p222q0.AbstractC2902c;

/* JADX INFO: renamed from: S0.M */
/* JADX INFO: loaded from: classes.dex */
public final class C1260M {

    /* JADX INFO: renamed from: d */
    public static final C1260M f4539d = new C1260M(0, 0, null, 0, 0, 0, null, null, 16777215);

    /* JADX INFO: renamed from: a */
    public final C1252E f4540a;

    /* JADX INFO: renamed from: b */
    public final C1282t f4541b;

    /* JADX INFO: renamed from: c */
    public final C1285w f4542c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1260M(C1252E c1252e, C1282t c1282t, C1285w c1285w) {
        this.f4540a = c1252e;
        this.f4541b = c1282t;
        this.f4542c = c1285w;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static C1260M m2341a(C1260M c1260m, long j5, C1587l c1587l, AbstractC1592q abstractC1592q, long j6, long j7, C1285w c1285w, C1959i c1959i, int i5) {
        long jMo3620b = c1260m.f4540a.f4494a.mo3620b();
        long j8 = (i5 & 2) != 0 ? c1260m.f4540a.f4495b : j5;
        C1587l c1587l2 = (i5 & 4) != 0 ? c1260m.f4540a.f4496c : c1587l;
        C1252E c1252e = c1260m.f4540a;
        C1585j c1585j = c1252e.f4497d;
        C1586k c1586k = c1252e.f4498e;
        AbstractC1592q abstractC1592q2 = (i5 & 32) != 0 ? c1252e.f4499f : abstractC1592q;
        String str = c1252e.f4500g;
        long j9 = (i5 & 128) != 0 ? c1252e.f4501h : j6;
        C1951a c1951a = c1252e.f4502i;
        C1966p c1966p = c1252e.f4503j;
        C1781b c1781b = c1252e.f4504k;
        long j10 = c1252e.f4505l;
        C1962l c1962l = c1252e.f4506m;
        C2737L c2737l = c1252e.f4507n;
        AbstractC2902c abstractC2902c = c1252e.f4508o;
        C1282t c1282t = c1260m.f4541b;
        int i6 = c1282t.f4605a;
        int i7 = c1282t.f4606b;
        long j11 = (i5 & 131072) != 0 ? c1282t.f4607c : j7;
        C1967q c1967q = c1282t.f4608d;
        C1285w c1285w2 = (i5 & 524288) != 0 ? c1260m.f4542c : c1285w;
        return new C1260M(new C1252E(C2762u.m4921c(jMo3620b, c1252e.f4494a.mo3620b()) ? c1252e.f4494a : jMo3620b != 16 ? new C1953c(jMo3620b) : C1964n.f6645a, j8, c1587l2, c1585j, c1586k, abstractC1592q2, str, j9, c1951a, c1966p, c1781b, j10, c1962l, c2737l, abstractC2902c), new C1282t(i6, i7, j11, c1967q, c1285w2 != null ? c1285w2.f4618a : null, (i5 & 1048576) != 0 ? c1282t.f4610f : c1959i, c1282t.f4611g, c1282t.f4612h, c1282t.f4613i), c1285w2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static C1260M m2342e(C1260M c1260m, long j5, long j6, C1587l c1587l, AbstractC1592q abstractC1592q, long j7, int i5, long j8, int i6) {
        long j9 = (i6 & 2) != 0 ? C2019o.f6747c : j6;
        C1587l c1587l2 = (i6 & 4) != 0 ? null : c1587l;
        AbstractC1592q abstractC1592q2 = (i6 & 32) != 0 ? null : abstractC1592q;
        long j10 = (i6 & 128) != 0 ? C2019o.f6747c : j7;
        long j11 = C2762u.f8762g;
        int i7 = (32768 & i6) != 0 ? 0 : i5;
        long j12 = (i6 & 131072) != 0 ? C2019o.f6747c : j8;
        C1252E c1252eM2323a = AbstractC1253F.m2323a(c1260m.f4540a, j5, null, Float.NaN, j9, c1587l2, null, null, abstractC1592q2, null, j10, null, null, null, j11, null, null, null);
        C1282t c1282tM2376a = AbstractC1283u.m2376a(c1260m.f4541b, i7, 0, j12, null, null, null, 0, 0, null);
        return (c1260m.f4540a == c1252eM2323a && c1260m.f4541b == c1282tM2376a) ? c1260m : new C1260M(c1252eM2323a, c1282tM2376a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final long m2343b() {
        return this.f4540a.f4494a.mo3620b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final boolean m2344c(C1260M c1260m) {
        if (this != c1260m) {
            return AbstractC1665j.m2981a(this.f4541b, c1260m.f4541b) && this.f4540a.m2320a(c1260m.f4540a);
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final C1260M m2345d(C1260M c1260m) {
        return (c1260m == null || c1260m.equals(f4539d)) ? this : new C1260M(this.f4540a.m2322c(c1260m.f4540a), this.f4541b.m2375a(c1260m.f4541b));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1260M)) {
            return false;
        }
        C1260M c1260m = (C1260M) obj;
        return AbstractC1665j.m2981a(this.f4540a, c1260m.f4540a) && AbstractC1665j.m2981a(this.f4541b, c1260m.f4541b) && AbstractC1665j.m2981a(this.f4542c, c1260m.f4542c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iHashCode = (this.f4541b.hashCode() + (this.f4540a.hashCode() * 31)) * 31;
        C1285w c1285w = this.f4542c;
        return iHashCode + (c1285w != null ? c1285w.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("TextStyle(color=");
        sb.append((Object) C2762u.m4927i(m2343b()));
        sb.append(", brush=");
        C1252E c1252e = this.f4540a;
        sb.append(c1252e.f4494a.mo3621c());
        sb.append(", alpha=");
        sb.append(c1252e.f4494a.mo3619a());
        sb.append(", fontSize=");
        sb.append((Object) C2019o.m3711d(c1252e.f4495b));
        sb.append(", fontWeight=");
        sb.append(c1252e.f4496c);
        sb.append(", fontStyle=");
        sb.append(c1252e.f4497d);
        sb.append(", fontSynthesis=");
        sb.append(c1252e.f4498e);
        sb.append(", fontFamily=");
        sb.append(c1252e.f4499f);
        sb.append(", fontFeatureSettings=");
        sb.append(c1252e.f4500g);
        sb.append(", letterSpacing=");
        sb.append((Object) C2019o.m3711d(c1252e.f4501h));
        sb.append(", baselineShift=");
        sb.append(c1252e.f4502i);
        sb.append(", textGeometricTransform=");
        sb.append(c1252e.f4503j);
        sb.append(", localeList=");
        sb.append(c1252e.f4504k);
        sb.append(", background=");
        AbstractC0231b.m406q(c1252e.f4505l, sb, ", textDecoration=");
        sb.append(c1252e.f4506m);
        sb.append(", shadow=");
        sb.append(c1252e.f4507n);
        sb.append(", drawStyle=");
        sb.append(c1252e.f4508o);
        sb.append(", textAlign=");
        C1282t c1282t = this.f4541b;
        sb.append((Object) C1961k.m3626a(c1282t.f4605a));
        sb.append(", textDirection=");
        sb.append((Object) C1963m.m3627a(c1282t.f4606b));
        sb.append(", lineHeight=");
        sb.append((Object) C2019o.m3711d(c1282t.f4607c));
        sb.append(", textIndent=");
        sb.append(c1282t.f4608d);
        sb.append(", platformStyle=");
        sb.append(this.f4542c);
        sb.append(", lineHeightStyle=");
        sb.append(c1282t.f4610f);
        sb.append(", lineBreak=");
        sb.append((Object) C1955e.m3623a(c1282t.f4611g));
        sb.append(", hyphens=");
        sb.append((Object) C1954d.m3622a(c1282t.f4612h));
        sb.append(", textMotion=");
        sb.append(c1282t.f4613i);
        sb.append(')');
        return sb.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C1260M(C1252E c1252e, C1282t c1282t) {
        c1252e.getClass();
        C1284v c1284v = c1282t.f4609e;
        this(c1252e, c1282t, c1284v == null ? null : new C1285w(c1284v));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C1260M(long j5, long j6, C1587l c1587l, long j7, int i5, long j8, C1285w c1285w, C1959i c1959i, int i6) {
        long j9 = (i6 & 1) != 0 ? C2762u.f8762g : j5;
        long j10 = (i6 & 2) != 0 ? C2019o.f6747c : j6;
        C1587l c1587l2 = (i6 & 4) != 0 ? null : c1587l;
        C1578c c1578c = (i6 & 32) != 0 ? null : AbstractC1592q.f5512a;
        long j11 = (i6 & 128) != 0 ? C2019o.f6747c : j7;
        long j12 = C2762u.f8762g;
        int i7 = (32768 & i6) != 0 ? 0 : i5;
        long j13 = (131072 & i6) != 0 ? C2019o.f6747c : j8;
        C1285w c1285w2 = (524288 & i6) != 0 ? null : c1285w;
        C1959i c1959i2 = (i6 & 1048576) != 0 ? null : c1959i;
        C1285w c1285w3 = c1285w2;
        this(new C1252E(j9, j10, c1587l2, null, null, c1578c, null, j11, null, null, null, j12, null, null), new C1282t(i7, 0, j13, null, c1285w3 != null ? c1285w3.f4618a : null, c1959i2, 0, 0, null), c1285w3);
    }
}
