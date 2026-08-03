package p088g0;

import ac.AbstractC0063p;
import be.AbstractC0283h;
import be.C0289k;
import java.util.List;
import p119i2.AbstractC1923e0;
import p119i2.C1926g;
import p119i2.C1933j0;
import p119i2.C1935k0;
import p119i2.C1941n0;
import p119i2.C1942o;
import p177m2.InterfaceC2760d;
import p293u2.AbstractC4232b;
import p293u2.C4231a;
import p293u2.EnumC4243m;
import p293u2.InterfaceC4233c;
import p321w.AbstractC4634s;
import tf.C4173t;

/* JADX INFO: renamed from: g0.d */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1260d {

    /* JADX INFO: renamed from: a */
    public C1926g f4128a;

    /* JADX INFO: renamed from: b */
    public InterfaceC2760d f4129b;

    /* JADX INFO: renamed from: c */
    public int f4130c;

    /* JADX INFO: renamed from: d */
    public boolean f4131d;

    /* JADX INFO: renamed from: e */
    public int f4132e;

    /* JADX INFO: renamed from: f */
    public int f4133f;

    /* JADX INFO: renamed from: g */
    public List f4134g;

    /* JADX INFO: renamed from: h */
    public C1258b f4135h;

    /* JADX INFO: renamed from: j */
    public InterfaceC4233c f4137j;

    /* JADX INFO: renamed from: k */
    public C1941n0 f4138k;

    /* JADX INFO: renamed from: l */
    public C0289k f4139l;

    /* JADX INFO: renamed from: m */
    public EnumC4243m f4140m;

    /* JADX INFO: renamed from: n */
    public C1935k0 f4141n;

    /* JADX INFO: renamed from: q */
    public long f4144q;

    /* JADX INFO: renamed from: i */
    public long f4136i = AbstractC1257a.f4116a;

    /* JADX INFO: renamed from: o */
    public int f4142o = -1;

    /* JADX INFO: renamed from: p */
    public int f4143p = -1;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1260d(C1926g c1926g, C1941n0 c1941n0, InterfaceC2760d interfaceC2760d, int i9, boolean z9, int i10, int i11, List list) {
        this.f4128a = c1926g;
        this.f4129b = interfaceC2760d;
        this.f4130c = i9;
        this.f4131d = z9;
        this.f4132e = i10;
        this.f4133f = i11;
        this.f4134g = list;
        this.f4138k = c1941n0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final int m3384a(int i9, EnumC4243m enumC4243m) {
        int i10 = this.f4142o;
        int i11 = this.f4143p;
        if (i9 == i10 && i10 != -1) {
            return i11;
        }
        long jM8508a = AbstractC4232b.m8508a(0, i9, 0, Integer.MAX_VALUE);
        if (this.f4133f > 1) {
            C1258b c1258b = this.f4135h;
            C1941n0 c1941n0 = this.f4138k;
            InterfaceC4233c interfaceC4233c = this.f4137j;
            interfaceC4233c.getClass();
            C1258b c1258bM1187y = AbstractC0283h.m1187y(c1258b, enumC4243m, c1941n0, interfaceC4233c, this.f4129b);
            this.f4135h = c1258bM1187y;
            jM8508a = c1258bM1187y.m3383a(this.f4133f, jM8508a);
        }
        int iM9071n = AbstractC4634s.m9071n(m3385b(jM8508a, enumC4243m).f6587e);
        int iM8505i = C4231a.m8505i(jM8508a);
        if (iM9071n < iM8505i) {
            iM9071n = iM8505i;
        }
        this.f4142o = i9;
        this.f4143p = iM9071n;
        return iM9071n;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final C1942o m3385b(long j3, EnumC4243m enumC4243m) {
        C0289k c0289kM3388e = m3388e(enumC4243m);
        long jM424q = AbstractC0063p.m424q(j3, this.f4131d, this.f4130c, c0289kM3388e.mo1194c());
        boolean z9 = this.f4131d;
        int i9 = this.f4130c;
        int i10 = this.f4132e;
        return new C1942o(c0289kM3388e, jM424q, ((z9 || !(i9 == 2 || i9 == 4 || i9 == 5)) && i10 >= 1) ? i10 : 1, i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final boolean m3386c(long j3, EnumC4243m enumC4243m) {
        this.f4144q = (this.f4144q << 2) | 3;
        if (this.f4133f > 1) {
            C1258b c1258b = this.f4135h;
            C1941n0 c1941n0 = this.f4138k;
            InterfaceC4233c interfaceC4233c = this.f4137j;
            interfaceC4233c.getClass();
            C1258b c1258bM1187y = AbstractC0283h.m1187y(c1258b, enumC4243m, c1941n0, interfaceC4233c, this.f4129b);
            this.f4135h = c1258bM1187y;
            j3 = c1258bM1187y.m3383a(this.f4133f, j3);
        }
        C1935k0 c1935k0 = this.f4141n;
        if (c1935k0 != null) {
            C1942o c1942o = c1935k0.f6562b;
            C1933j0 c1933j0 = c1935k0.f6561a;
            if (!c1942o.f6583a.mo1192a()) {
                EnumC4243m enumC4243m2 = c1933j0.f6556h;
                long j4 = c1933j0.f6558j;
                if (enumC4243m == enumC4243m2 && (C4231a.m8498b(j3, j4) || (C4231a.m8504h(j3) == C4231a.m8504h(j4) && C4231a.m8506j(j3) == C4231a.m8506j(j4) && C4231a.m8503g(j3) >= c1942o.f6587e && !c1942o.f6585c))) {
                    C1935k0 c1935k02 = this.f4141n;
                    c1935k02.getClass();
                    if (C4231a.m8498b(j3, c1935k02.f6561a.f6558j)) {
                        return false;
                    }
                    C1935k0 c1935k03 = this.f4141n;
                    c1935k03.getClass();
                    this.f4141n = m3389f(enumC4243m, j3, c1935k03.f6562b);
                    return true;
                }
            }
        }
        this.f4141n = m3389f(enumC4243m, j3, m3385b(j3, enumC4243m));
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final void m3387d(InterfaceC4233c interfaceC4233c) {
        long jM3381a;
        InterfaceC4233c interfaceC4233c2 = this.f4137j;
        if (interfaceC4233c != null) {
            int i9 = AbstractC1257a.f4117b;
            jM3381a = AbstractC1257a.m3381a(interfaceC4233c.mo1333d(), interfaceC4233c.mo1335q0());
        } else {
            jM3381a = AbstractC1257a.f4116a;
        }
        if (interfaceC4233c2 == null) {
            this.f4137j = interfaceC4233c;
            this.f4136i = jM3381a;
        } else if (interfaceC4233c == null || this.f4136i != jM3381a) {
            this.f4137j = interfaceC4233c;
            this.f4136i = jM3381a;
            this.f4144q = (this.f4144q << 2) | 1;
            this.f4139l = null;
            this.f4141n = null;
            this.f4143p = -1;
            this.f4142o = -1;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final C0289k m3388e(EnumC4243m enumC4243m) {
        C0289k c0289k = this.f4139l;
        if (c0289k == null || enumC4243m != this.f4140m || c0289k.mo1192a()) {
            this.f4140m = enumC4243m;
            C1926g c1926g = this.f4128a;
            C1941n0 c1941n0M4790h = AbstractC1923e0.m4790h(this.f4138k, enumC4243m);
            InterfaceC4233c interfaceC4233c = this.f4137j;
            interfaceC4233c.getClass();
            InterfaceC2760d interfaceC2760d = this.f4129b;
            List list = this.f4134g;
            if (list == null) {
                list = C4173t.f13710g;
            }
            c0289k = new C0289k(c1926g, c1941n0M4790h, list, interfaceC4233c, interfaceC2760d);
        }
        this.f4139l = c0289k;
        return c0289k;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final C1935k0 m3389f(EnumC4243m enumC4243m, long j3, C1942o c1942o) {
        float fMin = Math.min(c1942o.f6583a.mo1194c(), c1942o.f6586d);
        C1926g c1926g = this.f4128a;
        C1941n0 c1941n0 = this.f4138k;
        List list = this.f4134g;
        if (list == null) {
            list = C4173t.f13710g;
        }
        int i9 = this.f4132e;
        boolean z9 = this.f4131d;
        int i10 = this.f4130c;
        InterfaceC4233c interfaceC4233c = this.f4137j;
        interfaceC4233c.getClass();
        return new C1935k0(new C1933j0(c1926g, c1941n0, list, i9, z9, i10, interfaceC4233c, enumC4243m, this.f4129b, j3), c1942o, AbstractC4232b.m8511d(j3, (((long) AbstractC4634s.m9071n(fMin)) << 32) | (((long) AbstractC4634s.m9071n(c1942o.f6587e)) & 4294967295L)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final void m3390g(C1926g c1926g, C1941n0 c1941n0, InterfaceC2760d interfaceC2760d, int i9, boolean z9, int i10, int i11, List list) {
        this.f4128a = c1926g;
        boolean zM4821b = c1941n0.m4821b(this.f4138k);
        this.f4138k = c1941n0;
        if (!zM4821b) {
            this.f4144q <<= 2;
            this.f4139l = null;
            this.f4141n = null;
            this.f4143p = -1;
            this.f4142o = -1;
        }
        this.f4129b = interfaceC2760d;
        this.f4130c = i9;
        this.f4131d = z9;
        this.f4132e = i10;
        this.f4133f = i11;
        this.f4134g = list;
        this.f4144q = (this.f4144q << 2) | 2;
        this.f4139l = null;
        this.f4141n = null;
        this.f4143p = -1;
        this.f4142o = -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        C1933j0 c1933j0;
        StringBuilder sb2 = new StringBuilder("MultiParagraphLayoutCache(textLayoutResult=");
        Object c4231a = "null";
        sb2.append(this.f4141n != null ? "<TextLayoutResult>" : "null");
        sb2.append(", lastDensity=");
        sb2.append((Object) AbstractC1257a.m3382b(this.f4136i));
        sb2.append(", history=");
        sb2.append(this.f4144q);
        sb2.append(", constraints=");
        C1935k0 c1935k0 = this.f4141n;
        if (c1935k0 != null && (c1933j0 = c1935k0.f6561a) != null) {
            c4231a = new C4231a(c1933j0.f6558j);
        }
        sb2.append(c4231a);
        sb2.append(')');
        return sb2.toString();
    }
}
