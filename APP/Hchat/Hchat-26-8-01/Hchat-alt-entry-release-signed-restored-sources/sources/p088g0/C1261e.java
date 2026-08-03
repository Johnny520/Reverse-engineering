package p088g0;

import ac.AbstractC0063p;
import be.AbstractC0283h;
import p068eh.AbstractC0921a;
import p119i2.AbstractC1923e0;
import p119i2.C1914a;
import p119i2.C1941n0;
import p119i2.InterfaceC1949t;
import p177m2.InterfaceC2760d;
import p237q2.C3430d;
import p293u2.AbstractC4232b;
import p293u2.C4231a;
import p293u2.EnumC4243m;
import p293u2.InterfaceC4233c;
import p321w.AbstractC4634s;
import tf.C4173t;

/* JADX INFO: renamed from: g0.e */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1261e {

    /* JADX INFO: renamed from: a */
    public String f4145a;

    /* JADX INFO: renamed from: b */
    public C1941n0 f4146b;

    /* JADX INFO: renamed from: c */
    public InterfaceC2760d f4147c;

    /* JADX INFO: renamed from: d */
    public int f4148d;

    /* JADX INFO: renamed from: e */
    public boolean f4149e;

    /* JADX INFO: renamed from: f */
    public int f4150f;

    /* JADX INFO: renamed from: g */
    public int f4151g;

    /* JADX INFO: renamed from: i */
    public InterfaceC4233c f4153i;

    /* JADX INFO: renamed from: j */
    public C1914a f4154j;

    /* JADX INFO: renamed from: k */
    public boolean f4155k;

    /* JADX INFO: renamed from: l */
    public long f4156l;

    /* JADX INFO: renamed from: m */
    public C1258b f4157m;

    /* JADX INFO: renamed from: n */
    public InterfaceC1949t f4158n;

    /* JADX INFO: renamed from: o */
    public EnumC4243m f4159o;

    /* JADX INFO: renamed from: s */
    public long f4163s;

    /* JADX INFO: renamed from: h */
    public long f4152h = AbstractC1257a.f4116a;

    /* JADX INFO: renamed from: p */
    public long f4160p = AbstractC4232b.m8515h(0, 0, 0, 0);

    /* JADX INFO: renamed from: q */
    public int f4161q = -1;

    /* JADX INFO: renamed from: r */
    public int f4162r = -1;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1261e(String str, C1941n0 c1941n0, InterfaceC2760d interfaceC2760d, int i9, boolean z9, int i10, int i11) {
        this.f4145a = str;
        this.f4146b = c1941n0;
        this.f4147c = interfaceC2760d;
        this.f4148d = i9;
        this.f4149e = z9;
        this.f4150f = i10;
        this.f4151g = i11;
        long j3 = 0;
        this.f4156l = (j3 & 4294967295L) | (j3 << 32);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static long m3391g(C1261e c1261e, long j3, EnumC4243m enumC4243m) {
        C1941n0 c1941n0 = c1261e.f4146b;
        C1258b c1258b = c1261e.f4157m;
        InterfaceC4233c interfaceC4233c = c1261e.f4153i;
        interfaceC4233c.getClass();
        C1258b c1258bM1187y = AbstractC0283h.m1187y(c1258b, enumC4243m, c1941n0, interfaceC4233c, c1261e.f4147c);
        c1261e.f4157m = c1258bM1187y;
        return c1258bM1187y.m3383a(c1261e.f4151g, j3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final int m3392a(int i9, EnumC4243m enumC4243m) {
        int i10 = this.f4161q;
        int i11 = this.f4162r;
        if (i9 == i10 && i10 != -1) {
            return i11;
        }
        long jM8508a = AbstractC4232b.m8508a(0, i9, 0, Integer.MAX_VALUE);
        if (this.f4151g > 1) {
            jM8508a = m3391g(this, jM8508a, enumC4243m);
        }
        InterfaceC1949t interfaceC1949tM3396e = m3396e(enumC4243m);
        long jM424q = AbstractC0063p.m424q(jM8508a, this.f4149e, this.f4148d, interfaceC1949tM3396e.mo1194c());
        boolean z9 = this.f4149e;
        int i12 = this.f4148d;
        int i13 = this.f4150f;
        int iM9071n = AbstractC4634s.m9071n(new C1914a((C3430d) interfaceC1949tM3396e, ((z9 || !(i12 == 2 || i12 == 4 || i12 == 5)) && i13 >= 1) ? i13 : 1, i12, jM424q).m4767b());
        int iM8505i = C4231a.m8505i(jM8508a);
        if (iM9071n < iM8505i) {
            iM9071n = iM8505i;
        }
        this.f4161q = i9;
        this.f4162r = iM9071n;
        return iM9071n;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final boolean m3393b(long j3, EnumC4243m enumC4243m) {
        InterfaceC1949t interfaceC1949t;
        this.f4163s = (this.f4163s << 2) | 3;
        boolean z9 = true;
        long jM3391g = this.f4151g > 1 ? m3391g(this, j3, enumC4243m) : j3;
        C1914a c1914a = this.f4154j;
        boolean z10 = false;
        if (c1914a != null && (interfaceC1949t = this.f4158n) != null && !interfaceC1949t.mo1192a() && enumC4243m == this.f4159o && (C4231a.m8498b(jM3391g, this.f4160p) || (C4231a.m8504h(jM3391g) == C4231a.m8504h(this.f4160p) && C4231a.m8506j(jM3391g) == C4231a.m8506j(this.f4160p) && C4231a.m8503g(jM3391g) >= c1914a.m4767b() && !c1914a.f6459d.f6918d))) {
            if (!C4231a.m8498b(jM3391g, this.f4160p)) {
                C1914a c1914a2 = this.f4154j;
                c1914a2.getClass();
                this.f4156l = AbstractC4232b.m8511d(jM3391g, (((long) AbstractC4634s.m9071n(Math.min(c1914a2.f6456a.f11107i.m5100c(), c1914a2.m4769d()))) << 32) | (((long) AbstractC4634s.m9071n(c1914a2.m4767b())) & 4294967295L));
                if (this.f4148d == 3 || (((int) (r12 >> 32)) >= c1914a2.m4769d() && ((int) (4294967295L & r12)) >= c1914a2.m4767b())) {
                    z9 = false;
                }
                this.f4155k = z9;
                this.f4160p = jM3391g;
            }
            return false;
        }
        InterfaceC1949t interfaceC1949tM3396e = m3396e(enumC4243m);
        long jM424q = AbstractC0063p.m424q(jM3391g, this.f4149e, this.f4148d, interfaceC1949tM3396e.mo1194c());
        boolean z11 = this.f4149e;
        int i9 = this.f4148d;
        int i10 = this.f4150f;
        C1914a c1914a3 = new C1914a((C3430d) interfaceC1949tM3396e, ((z11 || !(i9 == 2 || i9 == 4 || i9 == 5)) && i10 >= 1) ? i10 : 1, i9, jM424q);
        this.f4160p = jM3391g;
        this.f4156l = AbstractC4232b.m8511d(jM3391g, (((long) AbstractC4634s.m9071n(c1914a3.m4767b())) & 4294967295L) | (((long) AbstractC4634s.m9071n(c1914a3.m4769d())) << 32));
        if (this.f4148d != 3 && (((int) (r1 >> 32)) < c1914a3.m4769d() || ((int) (r1 & 4294967295L)) < c1914a3.m4767b())) {
            z10 = true;
        }
        this.f4155k = z10;
        this.f4154j = c1914a3;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final void m3394c() {
        this.f4154j = null;
        this.f4158n = null;
        this.f4159o = null;
        this.f4161q = -1;
        this.f4162r = -1;
        this.f4160p = AbstractC4232b.m8515h(0, 0, 0, 0);
        long j3 = 0;
        this.f4156l = (j3 & 4294967295L) | (j3 << 32);
        this.f4155k = false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final void m3395d(InterfaceC4233c interfaceC4233c) {
        long jM3381a;
        InterfaceC4233c interfaceC4233c2 = this.f4153i;
        if (interfaceC4233c != null) {
            int i9 = AbstractC1257a.f4117b;
            jM3381a = AbstractC1257a.m3381a(interfaceC4233c.mo1333d(), interfaceC4233c.mo1335q0());
        } else {
            jM3381a = AbstractC1257a.f4116a;
        }
        if (interfaceC4233c2 == null) {
            this.f4153i = interfaceC4233c;
            this.f4152h = jM3381a;
        } else if (interfaceC4233c == null || this.f4152h != jM3381a) {
            this.f4153i = interfaceC4233c;
            this.f4152h = jM3381a;
            this.f4163s = (this.f4163s << 2) | 1;
            m3394c();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final InterfaceC1949t m3396e(EnumC4243m enumC4243m) {
        InterfaceC1949t c3430d = this.f4158n;
        if (c3430d == null || enumC4243m != this.f4159o || c3430d.mo1192a()) {
            this.f4159o = enumC4243m;
            String str = this.f4145a;
            C1941n0 c1941n0M4790h = AbstractC1923e0.m4790h(this.f4146b, enumC4243m);
            InterfaceC4233c interfaceC4233c = this.f4153i;
            interfaceC4233c.getClass();
            InterfaceC2760d interfaceC2760d = this.f4147c;
            C4173t c4173t = C4173t.f13710g;
            c3430d = new C3430d(str, c1941n0M4790h, c4173t, c4173t, interfaceC2760d, interfaceC4233c);
        }
        this.f4158n = c3430d;
        return c3430d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final void m3397f(String str, C1941n0 c1941n0, InterfaceC2760d interfaceC2760d, int i9, boolean z9, int i10, int i11) {
        this.f4145a = str;
        this.f4146b = c1941n0;
        this.f4147c = interfaceC2760d;
        this.f4148d = i9;
        this.f4149e = z9;
        this.f4150f = i10;
        this.f4151g = i11;
        this.f4163s = (this.f4163s << 2) | 2;
        m3394c();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ParagraphLayoutCache(paragraph=");
        sb2.append(this.f4154j != null ? "<paragraph>" : "null");
        sb2.append(", lastDensity=");
        sb2.append((Object) AbstractC1257a.m3382b(this.f4152h));
        sb2.append(", history=");
        return AbstractC0921a.m2253p(sb2, this.f4163s, ", constraints=$)");
    }
}
