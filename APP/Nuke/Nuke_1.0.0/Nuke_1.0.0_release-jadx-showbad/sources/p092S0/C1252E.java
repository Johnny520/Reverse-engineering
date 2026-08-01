package p092S0;

import p011B4.AbstractC0231b;
import p110W0.AbstractC1592q;
import p110W0.C1585j;
import p110W0.C1586k;
import p110W0.C1587l;
import p117X2.AbstractC1665j;
import p125Z0.C1781b;
import p147d1.C1951a;
import p147d1.C1953c;
import p147d1.C1962l;
import p147d1.C1964n;
import p147d1.C1966p;
import p147d1.InterfaceC1965o;
import p153e1.C2019o;
import p153e1.C2020p;
import p211o0.AbstractC2758q;
import p211o0.C2737L;
import p211o0.C2762u;
import p222q0.AbstractC2902c;

/* JADX INFO: renamed from: S0.E */
/* JADX INFO: loaded from: classes.dex */
public final class C1252E implements InterfaceC1264b {

    /* JADX INFO: renamed from: a */
    public final InterfaceC1965o f4494a;

    /* JADX INFO: renamed from: b */
    public final long f4495b;

    /* JADX INFO: renamed from: c */
    public final C1587l f4496c;

    /* JADX INFO: renamed from: d */
    public final C1585j f4497d;

    /* JADX INFO: renamed from: e */
    public final C1586k f4498e;

    /* JADX INFO: renamed from: f */
    public final AbstractC1592q f4499f;

    /* JADX INFO: renamed from: g */
    public final String f4500g;

    /* JADX INFO: renamed from: h */
    public final long f4501h;

    /* JADX INFO: renamed from: i */
    public final C1951a f4502i;

    /* JADX INFO: renamed from: j */
    public final C1966p f4503j;

    /* JADX INFO: renamed from: k */
    public final C1781b f4504k;

    /* JADX INFO: renamed from: l */
    public final long f4505l;

    /* JADX INFO: renamed from: m */
    public final C1962l f4506m;

    /* JADX INFO: renamed from: n */
    public final C2737L f4507n;

    /* JADX INFO: renamed from: o */
    public final AbstractC2902c f4508o;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1252E(long j5, long j6, C1587l c1587l, C1585j c1585j, C1586k c1586k, AbstractC1592q abstractC1592q, String str, long j7, C1951a c1951a, C1966p c1966p, C1781b c1781b, long j8, C1962l c1962l, C2737L c2737l) {
        this(j5 != 16 ? new C1953c(j5) : C1964n.f6645a, j6, c1587l, c1585j, c1586k, abstractC1592q, str, j7, c1951a, c1966p, c1781b, j8, c1962l, c2737l, (AbstractC2902c) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final boolean m2320a(C1252E c1252e) {
        if (this == c1252e) {
            return true;
        }
        return C2019o.m3708a(this.f4495b, c1252e.f4495b) && AbstractC1665j.m2981a(this.f4496c, c1252e.f4496c) && AbstractC1665j.m2981a(this.f4497d, c1252e.f4497d) && AbstractC1665j.m2981a(this.f4498e, c1252e.f4498e) && AbstractC1665j.m2981a(this.f4499f, c1252e.f4499f) && AbstractC1665j.m2981a(this.f4500g, c1252e.f4500g) && C2019o.m3708a(this.f4501h, c1252e.f4501h) && AbstractC1665j.m2981a(this.f4502i, c1252e.f4502i) && AbstractC1665j.m2981a(this.f4503j, c1252e.f4503j) && AbstractC1665j.m2981a(this.f4504k, c1252e.f4504k) && C2762u.m4921c(this.f4505l, c1252e.f4505l);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final boolean m2321b(C1252E c1252e) {
        return AbstractC1665j.m2981a(this.f4494a, c1252e.f4494a) && AbstractC1665j.m2981a(this.f4506m, c1252e.f4506m) && AbstractC1665j.m2981a(this.f4507n, c1252e.f4507n) && AbstractC1665j.m2981a(this.f4508o, c1252e.f4508o);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final C1252E m2322c(C1252E c1252e) {
        if (c1252e == null) {
            return this;
        }
        InterfaceC1965o interfaceC1965o = c1252e.f4494a;
        return AbstractC1253F.m2323a(this, interfaceC1965o.mo3620b(), interfaceC1965o.mo3621c(), interfaceC1965o.mo3619a(), c1252e.f4495b, c1252e.f4496c, c1252e.f4497d, c1252e.f4498e, c1252e.f4499f, c1252e.f4500g, c1252e.f4501h, c1252e.f4502i, c1252e.f4503j, c1252e.f4504k, c1252e.f4505l, c1252e.f4506m, c1252e.f4507n, c1252e.f4508o);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1252E)) {
            return false;
        }
        C1252E c1252e = (C1252E) obj;
        return m2320a(c1252e) && m2321b(c1252e);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        InterfaceC1965o interfaceC1965o = this.f4494a;
        long jMo3620b = interfaceC1965o.mo3620b();
        int i5 = C2762u.f8763h;
        int iHashCode = Long.hashCode(jMo3620b) * 31;
        AbstractC2758q abstractC2758qMo3621c = interfaceC1965o.mo3621c();
        int iHashCode2 = (Float.hashCode(interfaceC1965o.mo3619a()) + ((iHashCode + (abstractC2758qMo3621c != null ? abstractC2758qMo3621c.hashCode() : 0)) * 31)) * 31;
        C2020p[] c2020pArr = C2019o.f6746b;
        int iM392c = AbstractC0231b.m392c(iHashCode2, 31, this.f4495b);
        C1587l c1587l = this.f4496c;
        int i6 = (iM392c + (c1587l != null ? c1587l.f5507d : 0)) * 31;
        C1585j c1585j = this.f4497d;
        int iHashCode3 = (i6 + (c1585j != null ? Integer.hashCode(c1585j.f5499a) : 0)) * 31;
        C1586k c1586k = this.f4498e;
        int iHashCode4 = (iHashCode3 + (c1586k != null ? Integer.hashCode(c1586k.f5500a) : 0)) * 31;
        AbstractC1592q abstractC1592q = this.f4499f;
        int iHashCode5 = (iHashCode4 + (abstractC1592q != null ? abstractC1592q.hashCode() : 0)) * 31;
        String str = this.f4500g;
        int iM392c2 = AbstractC0231b.m392c((iHashCode5 + (str != null ? str.hashCode() : 0)) * 31, 31, this.f4501h);
        C1951a c1951a = this.f4502i;
        int iHashCode6 = (iM392c2 + (c1951a != null ? Float.hashCode(c1951a.f6619a) : 0)) * 31;
        C1966p c1966p = this.f4503j;
        int iHashCode7 = (iHashCode6 + (c1966p != null ? c1966p.hashCode() : 0)) * 31;
        C1781b c1781b = this.f4504k;
        int iM392c3 = AbstractC0231b.m392c((iHashCode7 + (c1781b != null ? c1781b.f6090d.hashCode() : 0)) * 31, 31, this.f4505l);
        C1962l c1962l = this.f4506m;
        int i7 = (iM392c3 + (c1962l != null ? c1962l.f6643a : 0)) * 31;
        C2737L c2737l = this.f4507n;
        int iHashCode8 = (i7 + (c2737l != null ? c2737l.hashCode() : 0)) * 961;
        AbstractC2902c abstractC2902c = this.f4508o;
        return iHashCode8 + (abstractC2902c != null ? abstractC2902c.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("SpanStyle(color=");
        InterfaceC1965o interfaceC1965o = this.f4494a;
        sb.append((Object) C2762u.m4927i(interfaceC1965o.mo3620b()));
        sb.append(", brush=");
        sb.append(interfaceC1965o.mo3621c());
        sb.append(", alpha=");
        sb.append(interfaceC1965o.mo3619a());
        sb.append(", fontSize=");
        sb.append((Object) C2019o.m3711d(this.f4495b));
        sb.append(", fontWeight=");
        sb.append(this.f4496c);
        sb.append(", fontStyle=");
        sb.append(this.f4497d);
        sb.append(", fontSynthesis=");
        sb.append(this.f4498e);
        sb.append(", fontFamily=");
        sb.append(this.f4499f);
        sb.append(", fontFeatureSettings=");
        sb.append(this.f4500g);
        sb.append(", letterSpacing=");
        sb.append((Object) C2019o.m3711d(this.f4501h));
        sb.append(", baselineShift=");
        sb.append(this.f4502i);
        sb.append(", textGeometricTransform=");
        sb.append(this.f4503j);
        sb.append(", localeList=");
        sb.append(this.f4504k);
        sb.append(", background=");
        AbstractC0231b.m406q(this.f4505l, sb, ", textDecoration=");
        sb.append(this.f4506m);
        sb.append(", shadow=");
        sb.append(this.f4507n);
        sb.append(", platformStyle=null, drawStyle=");
        sb.append(this.f4508o);
        sb.append(')');
        return sb.toString();
    }

    public C1252E(InterfaceC1965o interfaceC1965o, long j5, C1587l c1587l, C1585j c1585j, C1586k c1586k, AbstractC1592q abstractC1592q, String str, long j6, C1951a c1951a, C1966p c1966p, C1781b c1781b, long j7, C1962l c1962l, C2737L c2737l, AbstractC2902c abstractC2902c) {
        this.f4494a = interfaceC1965o;
        this.f4495b = j5;
        this.f4496c = c1587l;
        this.f4497d = c1585j;
        this.f4498e = c1586k;
        this.f4499f = abstractC1592q;
        this.f4500g = str;
        this.f4501h = j6;
        this.f4502i = c1951a;
        this.f4503j = c1966p;
        this.f4504k = c1781b;
        this.f4505l = j7;
        this.f4506m = c1962l;
        this.f4507n = c2737l;
        this.f4508o = abstractC2902c;
    }

    public C1252E(long j5, long j6, C1587l c1587l, C1585j c1585j, C1586k c1586k, AbstractC1592q abstractC1592q, String str, long j7, C1951a c1951a, C1966p c1966p, C1781b c1781b, long j8, C1962l c1962l, C2737L c2737l, int i5) {
        this((i5 & 1) != 0 ? C2762u.f8762g : j5, (i5 & 2) != 0 ? C2019o.f6747c : j6, (i5 & 4) != 0 ? null : c1587l, (i5 & 8) != 0 ? null : c1585j, (i5 & 16) != 0 ? null : c1586k, (i5 & 32) != 0 ? null : abstractC1592q, (i5 & 64) != 0 ? null : str, (i5 & 128) != 0 ? C2019o.f6747c : j7, (i5 & 256) != 0 ? null : c1951a, (i5 & 512) != 0 ? null : c1966p, (i5 & 1024) != 0 ? null : c1781b, (i5 & 2048) != 0 ? C2762u.f8762g : j8, (i5 & 4096) != 0 ? null : c1962l, (i5 & 8192) != 0 ? null : c2737l);
    }
}
