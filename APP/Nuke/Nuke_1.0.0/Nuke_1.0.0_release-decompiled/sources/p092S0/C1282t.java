package p092S0;

import p011B4.AbstractC0231b;
import p117X2.AbstractC1665j;
import p120Y0.AbstractC1732a;
import p147d1.C1954d;
import p147d1.C1955e;
import p147d1.C1959i;
import p147d1.C1961k;
import p147d1.C1963m;
import p147d1.C1967q;
import p147d1.C1969s;
import p153e1.C2019o;
import p153e1.C2020p;

/* JADX INFO: renamed from: S0.t */
/* JADX INFO: loaded from: classes.dex */
public final class C1282t implements InterfaceC1264b {

    /* JADX INFO: renamed from: a */
    public final int f4605a;

    /* JADX INFO: renamed from: b */
    public final int f4606b;

    /* JADX INFO: renamed from: c */
    public final long f4607c;

    /* JADX INFO: renamed from: d */
    public final C1967q f4608d;

    /* JADX INFO: renamed from: e */
    public final C1284v f4609e;

    /* JADX INFO: renamed from: f */
    public final C1959i f4610f;

    /* JADX INFO: renamed from: g */
    public final int f4611g;

    /* JADX INFO: renamed from: h */
    public final int f4612h;

    /* JADX INFO: renamed from: i */
    public final C1969s f4613i;

    public C1282t(int i5, int i6, long j5, C1967q c1967q, C1284v c1284v, C1959i c1959i, int i7, int i8, C1969s c1969s) {
        this.f4605a = i5;
        this.f4606b = i6;
        this.f4607c = j5;
        this.f4608d = c1967q;
        this.f4609e = c1284v;
        this.f4610f = c1959i;
        this.f4611g = i7;
        this.f4612h = i8;
        this.f4613i = c1969s;
        if (C2019o.m3708a(j5, C2019o.f6747c) || C2019o.m3710c(j5) >= 0.0f) {
            return;
        }
        AbstractC1732a.m3086b("lineHeight can't be negative (" + C2019o.m3710c(j5) + ')');
    }

    /* JADX INFO: renamed from: a */
    public final C1282t m2375a(C1282t c1282t) {
        return c1282t == null ? this : AbstractC1283u.m2376a(this, c1282t.f4605a, c1282t.f4606b, c1282t.f4607c, c1282t.f4608d, c1282t.f4609e, c1282t.f4610f, c1282t.f4611g, c1282t.f4612h, c1282t.f4613i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1282t)) {
            return false;
        }
        C1282t c1282t = (C1282t) obj;
        return this.f4605a == c1282t.f4605a && this.f4606b == c1282t.f4606b && C2019o.m3708a(this.f4607c, c1282t.f4607c) && AbstractC1665j.m2981a(this.f4608d, c1282t.f4608d) && AbstractC1665j.m2981a(this.f4609e, c1282t.f4609e) && AbstractC1665j.m2981a(this.f4610f, c1282t.f4610f) && this.f4611g == c1282t.f4611g && this.f4612h == c1282t.f4612h && AbstractC1665j.m2981a(this.f4613i, c1282t.f4613i);
    }

    public final int hashCode() {
        int iM391b = AbstractC0231b.m391b(this.f4606b, Integer.hashCode(this.f4605a) * 31, 31);
        C2020p[] c2020pArr = C2019o.f6746b;
        int iM392c = AbstractC0231b.m392c(iM391b, 31, this.f4607c);
        C1967q c1967q = this.f4608d;
        int iHashCode = (iM392c + (c1967q != null ? c1967q.hashCode() : 0)) * 31;
        C1284v c1284v = this.f4609e;
        int iHashCode2 = (iHashCode + (c1284v != null ? c1284v.hashCode() : 0)) * 31;
        C1959i c1959i = this.f4610f;
        int iM391b2 = AbstractC0231b.m391b(this.f4612h, AbstractC0231b.m391b(this.f4611g, (iHashCode2 + (c1959i != null ? c1959i.hashCode() : 0)) * 31, 31), 31);
        C1969s c1969s = this.f4613i;
        return iM391b2 + (c1969s != null ? c1969s.hashCode() : 0);
    }

    public final String toString() {
        return "ParagraphStyle(textAlign=" + ((Object) C1961k.m3626a(this.f4605a)) + ", textDirection=" + ((Object) C1963m.m3627a(this.f4606b)) + ", lineHeight=" + ((Object) C2019o.m3711d(this.f4607c)) + ", textIndent=" + this.f4608d + ", platformStyle=" + this.f4609e + ", lineHeightStyle=" + this.f4610f + ", lineBreak=" + ((Object) C1955e.m3623a(this.f4611g)) + ", hyphens=" + ((Object) C1954d.m3622a(this.f4612h)) + ", textMotion=" + this.f4613i + ')';
    }
}
