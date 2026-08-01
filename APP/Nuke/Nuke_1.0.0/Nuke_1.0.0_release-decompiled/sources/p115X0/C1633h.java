package p115X0;

import p011B4.AbstractC0231b;
import p058L.C0946r;
import p092S0.AbstractC1251D;
import p092S0.C1259L;
import p092S0.C1269g;
import p101U0.C1470e;
import p120Y0.AbstractC1732a;
import p127Z2.AbstractC1784a;

/* JADX INFO: renamed from: X0.h */
/* JADX INFO: loaded from: classes.dex */
public final class C1633h {

    /* JADX INFO: renamed from: a */
    public final C1470e f5619a;

    /* JADX INFO: renamed from: b */
    public int f5620b;

    /* JADX INFO: renamed from: c */
    public int f5621c;

    /* JADX INFO: renamed from: d */
    public int f5622d;

    /* JADX INFO: renamed from: e */
    public int f5623e;

    public C1633h(C1269g c1269g, long j5) {
        String str = c1269g.f4563e;
        C1470e c1470e = new C1470e();
        c1470e.f5151d = str;
        c1470e.f5149b = -1;
        c1470e.f5150c = -1;
        this.f5619a = c1470e;
        this.f5620b = C1259L.m2338f(j5);
        this.f5621c = C1259L.m2337e(j5);
        this.f5622d = -1;
        this.f5623e = -1;
        int iM2338f = C1259L.m2338f(j5);
        int iM2337e = C1259L.m2337e(j5);
        if (iM2338f < 0 || iM2338f > str.length()) {
            StringBuilder sbM404o = AbstractC0231b.m404o(iM2338f, "start (", ") offset is outside of text region ");
            sbM404o.append(str.length());
            throw new IndexOutOfBoundsException(sbM404o.toString());
        }
        if (iM2337e < 0 || iM2337e > str.length()) {
            StringBuilder sbM404o2 = AbstractC0231b.m404o(iM2337e, "end (", ") offset is outside of text region ");
            sbM404o2.append(str.length());
            throw new IndexOutOfBoundsException(sbM404o2.toString());
        }
        if (iM2338f > iM2337e) {
            throw new IllegalArgumentException(AbstractC0231b.m399j("Do not set reversed range: ", iM2338f, " > ", iM2337e));
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m2929a(int i5, int i6) {
        long jM2313b = AbstractC1251D.m2313b(i5, i6);
        this.f5619a.m2747k(i5, i6, "");
        long jM3210X = AbstractC1784a.m3210X(AbstractC1251D.m2313b(this.f5620b, this.f5621c), jM2313b);
        m2936h(C1259L.m2338f(jM3210X));
        m2935g(C1259L.m2337e(jM3210X));
        int i7 = this.f5622d;
        if (i7 != -1) {
            long jM3210X2 = AbstractC1784a.m3210X(AbstractC1251D.m2313b(i7, this.f5623e), jM2313b);
            if (C1259L.m2335c(jM3210X2)) {
                this.f5622d = -1;
                this.f5623e = -1;
            } else {
                this.f5622d = C1259L.m2338f(jM3210X2);
                this.f5623e = C1259L.m2337e(jM3210X2);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final char m2930b(int i5) {
        C1470e c1470e = this.f5619a;
        C0946r c0946r = (C0946r) c1470e.f5152e;
        if (c0946r == null) {
            return ((String) c1470e.f5151d).charAt(i5);
        }
        if (i5 < c1470e.f5149b) {
            return ((String) c1470e.f5151d).charAt(i5);
        }
        int iM1951b = c0946r.f2975b - c0946r.m1951b();
        int i6 = c1470e.f5149b;
        if (i5 >= iM1951b + i6) {
            return ((String) c1470e.f5151d).charAt(i5 - ((iM1951b - c1470e.f5150c) + i6));
        }
        int i7 = i5 - i6;
        int i8 = c0946r.f2976c;
        return i7 < i8 ? ((char[]) c0946r.f2978e)[i7] : ((char[]) c0946r.f2978e)[(i7 - i8) + c0946r.f2977d];
    }

    /* JADX INFO: renamed from: c */
    public final C1259L m2931c() {
        int i5 = this.f5622d;
        if (i5 != -1) {
            return new C1259L(AbstractC1251D.m2313b(i5, this.f5623e));
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public final void m2932d(int i5, int i6, String str) {
        C1470e c1470e = this.f5619a;
        if (i5 < 0 || i5 > c1470e.m2738b()) {
            StringBuilder sbM404o = AbstractC0231b.m404o(i5, "start (", ") offset is outside of text region ");
            sbM404o.append(c1470e.m2738b());
            throw new IndexOutOfBoundsException(sbM404o.toString());
        }
        if (i6 < 0 || i6 > c1470e.m2738b()) {
            StringBuilder sbM404o2 = AbstractC0231b.m404o(i6, "end (", ") offset is outside of text region ");
            sbM404o2.append(c1470e.m2738b());
            throw new IndexOutOfBoundsException(sbM404o2.toString());
        }
        if (i5 > i6) {
            throw new IllegalArgumentException(AbstractC0231b.m399j("Do not set reversed range: ", i5, " > ", i6));
        }
        c1470e.m2747k(i5, i6, str);
        m2936h(str.length() + i5);
        m2935g(str.length() + i5);
        this.f5622d = -1;
        this.f5623e = -1;
    }

    /* JADX INFO: renamed from: e */
    public final void m2933e(int i5, int i6) {
        C1470e c1470e = this.f5619a;
        if (i5 < 0 || i5 > c1470e.m2738b()) {
            StringBuilder sbM404o = AbstractC0231b.m404o(i5, "start (", ") offset is outside of text region ");
            sbM404o.append(c1470e.m2738b());
            throw new IndexOutOfBoundsException(sbM404o.toString());
        }
        if (i6 < 0 || i6 > c1470e.m2738b()) {
            StringBuilder sbM404o2 = AbstractC0231b.m404o(i6, "end (", ") offset is outside of text region ");
            sbM404o2.append(c1470e.m2738b());
            throw new IndexOutOfBoundsException(sbM404o2.toString());
        }
        if (i5 >= i6) {
            throw new IllegalArgumentException(AbstractC0231b.m399j("Do not set reversed or empty range: ", i5, " > ", i6));
        }
        this.f5622d = i5;
        this.f5623e = i6;
    }

    /* JADX INFO: renamed from: f */
    public final void m2934f(int i5, int i6) {
        C1470e c1470e = this.f5619a;
        if (i5 < 0 || i5 > c1470e.m2738b()) {
            StringBuilder sbM404o = AbstractC0231b.m404o(i5, "start (", ") offset is outside of text region ");
            sbM404o.append(c1470e.m2738b());
            throw new IndexOutOfBoundsException(sbM404o.toString());
        }
        if (i6 < 0 || i6 > c1470e.m2738b()) {
            StringBuilder sbM404o2 = AbstractC0231b.m404o(i6, "end (", ") offset is outside of text region ");
            sbM404o2.append(c1470e.m2738b());
            throw new IndexOutOfBoundsException(sbM404o2.toString());
        }
        if (i5 > i6) {
            throw new IllegalArgumentException(AbstractC0231b.m399j("Do not set reversed range: ", i5, " > ", i6));
        }
        m2936h(i5);
        m2935g(i6);
    }

    /* JADX INFO: renamed from: g */
    public final void m2935g(int i5) {
        if (!(i5 >= 0)) {
            AbstractC1732a.m3085a("Cannot set selectionEnd to a negative value: " + i5);
        }
        this.f5621c = i5;
    }

    /* JADX INFO: renamed from: h */
    public final void m2936h(int i5) {
        if (!(i5 >= 0)) {
            AbstractC1732a.m3085a("Cannot set selectionStart to a negative value: " + i5);
        }
        this.f5620b = i5;
    }

    public final String toString() {
        return this.f5619a.toString();
    }
}
