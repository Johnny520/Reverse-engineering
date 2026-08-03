package p251r;

import java.util.List;
import okio.C3193a;
import p118i1.C1902b;
import p201o.AbstractC3026b;
import p249qg.AbstractC3603v;
import p265s.C3855s;
import p265s.C3857t;
import p265s.C3865x;
import p265s.C3869z;
import p293u2.C4240j;
import p293u2.EnumC4243m;
import p308v1.AbstractC4374a1;
import p308v1.AbstractC4377b1;
import p308v1.AbstractC4383d1;
import p308v1.C4380c1;
import p356y0.C5843e;
import p356y0.C5844f;

/* JADX INFO: renamed from: r.q */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3632q {

    /* JADX INFO: renamed from: a */
    public final int f11753a;

    /* JADX INFO: renamed from: b */
    public final List f11754b;

    /* JADX INFO: renamed from: c */
    public final boolean f11755c;

    /* JADX INFO: renamed from: d */
    public final C5843e f11756d;

    /* JADX INFO: renamed from: e */
    public final C5844f f11757e;

    /* JADX INFO: renamed from: f */
    public final EnumC4243m f11758f;

    /* JADX INFO: renamed from: g */
    public final int f11759g;

    /* JADX INFO: renamed from: h */
    public final int f11760h;

    /* JADX INFO: renamed from: i */
    public final int f11761i;

    /* JADX INFO: renamed from: j */
    public final long f11762j;

    /* JADX INFO: renamed from: k */
    public final Object f11763k;

    /* JADX INFO: renamed from: l */
    public final Object f11764l;

    /* JADX INFO: renamed from: m */
    public final C3869z f11765m;

    /* JADX INFO: renamed from: n */
    public final long f11766n;

    /* JADX INFO: renamed from: o */
    public int f11767o;

    /* JADX INFO: renamed from: p */
    public final int f11768p;

    /* JADX INFO: renamed from: q */
    public final int f11769q;

    /* JADX INFO: renamed from: r */
    public final int f11770r;

    /* JADX INFO: renamed from: s */
    public boolean f11771s;

    /* JADX INFO: renamed from: t */
    public int f11772t = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: u */
    public int f11773u;

    /* JADX INFO: renamed from: v */
    public int f11774v;

    /* JADX INFO: renamed from: w */
    public final int[] f11775w;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3632q(int i9, List list, boolean z9, C5843e c5843e, C5844f c5844f, EnumC4243m enumC4243m, int i10, int i11, int i12, long j3, Object obj, Object obj2, C3869z c3869z, long j4) {
        this.f11753a = i9;
        this.f11754b = list;
        this.f11755c = z9;
        this.f11756d = c5843e;
        this.f11757e = c5844f;
        this.f11758f = enumC4243m;
        this.f11759g = i10;
        this.f11760h = i11;
        this.f11761i = i12;
        this.f11762j = j3;
        this.f11763k = obj;
        this.f11764l = obj2;
        this.f11765m = c3869z;
        this.f11766n = j4;
        int size = list.size();
        int i13 = 0;
        int iMax = 0;
        for (int i14 = 0; i14 < size; i14++) {
            AbstractC4377b1 abstractC4377b1 = (AbstractC4377b1) list.get(i14);
            boolean z10 = this.f11755c;
            i13 += z10 ? abstractC4377b1.f14594h : abstractC4377b1.f14593g;
            iMax = Math.max(iMax, !z10 ? abstractC4377b1.f14594h : abstractC4377b1.f14593g);
        }
        this.f11768p = i13;
        int i15 = i13 + this.f11761i;
        this.f11769q = i15 >= 0 ? i15 : 0;
        this.f11770r = iMax;
        this.f11775w = new int[this.f11754b.size() * 2];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final int m7613a(long j3) {
        return (int) (this.f11755c ? j3 & 4294967295L : j3 >> 32);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final long m7614b(int i9) {
        if (i9 == 0 && this.f11754b.size() == 0) {
            int i10 = this.f11767o;
            if (this.f11755c) {
                return (4294967295L & ((long) i10)) | (((long) 0) << 32);
            }
            return (4294967295L & ((long) 0)) | (((long) i10) << 32);
        }
        int i11 = i9 * 2;
        int[] iArr = this.f11775w;
        int i12 = iArr[i11];
        return (4294967295L & ((long) iArr[i11 + 1])) | (((long) i12) << 32);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r12v10, resolved type: java.lang.Object[] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    public final void m7615c(AbstractC4374a1 abstractC4374a1, boolean z9) {
        List list;
        int i9;
        if (this.f11772t == Integer.MIN_VALUE) {
            AbstractC3026b.m6428a("position() should be called first");
        }
        List list2 = this.f11754b;
        int size = list2.size();
        int i10 = 0;
        while (i10 < size) {
            AbstractC4377b1 abstractC4377b1 = (AbstractC4377b1) list2.get(i10);
            int i11 = this.f11773u;
            boolean z10 = this.f11755c;
            int i12 = i11 - (z10 ? abstractC4377b1.f14594h : abstractC4377b1.f14593g);
            int i13 = this.f11774v;
            long jM7614b = m7614b(i10);
            C3865x c3865x = (C3865x) this.f11765m.f12684a.m2320g(this.f11763k);
            C1902b c1902b = null;
            Object[] objArr = 0;
            C3857t c3857t = c3865x != null ? c3865x.f12665a[i10] : null;
            if (c3857t != null) {
                if (z9) {
                    c3857t.f12647p = jM7614b;
                    list = list2;
                    i9 = size;
                } else {
                    list = list2;
                    i9 = size;
                    if (!C4240j.m8528b(c3857t.f12647p, C3857t.f12630q)) {
                        jM7614b = c3857t.f12647p;
                    }
                    long jM8530d = C4240j.m8530d(jM7614b, ((C4240j) c3857t.f12646o.getValue()).f13912a);
                    if (((m7613a(jM7614b) <= i12 && m7613a(jM8530d) <= i12) || (m7613a(jM7614b) >= i13 && m7613a(jM8530d) >= i13)) && ((Boolean) c3857t.f12637f.getValue()).booleanValue()) {
                        AbstractC3603v.m7563q(c3857t.f12632a, null, new C3855s(c3857t, objArr == true ? 1 : 0, 1), 3);
                    }
                    jM7614b = jM8530d;
                }
                c1902b = c3857t.f12643l;
            } else {
                list = list2;
                i9 = size;
            }
            long jM8530d2 = C4240j.m8530d(jM7614b, this.f11762j);
            if (!z9 && c3857t != null) {
                c3857t.f12642k = jM8530d2;
            }
            if (!z10) {
                EnumC4243m enumC4243m = EnumC4243m.f13919g;
                if (c1902b == null) {
                    int i14 = AbstractC4383d1.f14615b;
                    C4380c1 c4380c1 = C4380c1.f14607h;
                    if (abstractC4374a1.mo8818m() == enumC4243m || abstractC4374a1.mo8819w() == 0) {
                        AbstractC4374a1.m8815e(abstractC4374a1, abstractC4377b1);
                        abstractC4377b1.mo8820A0(C4240j.m8530d(jM8530d2, abstractC4377b1.f14597k), 0.0f, c4380c1);
                    } else {
                        long jMo8819w = (((long) ((abstractC4374a1.mo8819w() - abstractC4377b1.f14593g) - ((int) (jM8530d2 >> 32)))) << 32) | (4294967295L & ((long) ((int) (jM8530d2 & 4294967295L))));
                        AbstractC4374a1.m8815e(abstractC4374a1, abstractC4377b1);
                        abstractC4377b1.mo8820A0(C4240j.m8530d(jMo8819w, abstractC4377b1.f14597k), 0.0f, c4380c1);
                    }
                } else if (abstractC4374a1.mo8818m() == enumC4243m || abstractC4374a1.mo8819w() == 0) {
                    AbstractC4374a1.m8815e(abstractC4374a1, abstractC4377b1);
                    abstractC4377b1.mo8821B0(C4240j.m8530d(jM8530d2, abstractC4377b1.f14597k), 0.0f, c1902b);
                } else {
                    long jMo8819w2 = (((long) ((abstractC4374a1.mo8819w() - abstractC4377b1.f14593g) - ((int) (jM8530d2 >> 32)))) << 32) | (4294967295L & ((long) ((int) (jM8530d2 & 4294967295L))));
                    AbstractC4374a1.m8815e(abstractC4374a1, abstractC4377b1);
                    abstractC4377b1.mo8821B0(C4240j.m8530d(jMo8819w2, abstractC4377b1.f14597k), 0.0f, c1902b);
                }
            } else if (c1902b != null) {
                abstractC4374a1.getClass();
                AbstractC4374a1.m8815e(abstractC4374a1, abstractC4377b1);
                abstractC4377b1.mo8821B0(C4240j.m8530d(jM8530d2, abstractC4377b1.f14597k), 0.0f, c1902b);
            } else {
                AbstractC4374a1.m8814H(abstractC4374a1, abstractC4377b1, jM8530d2, null, 6);
            }
            i10++;
            list2 = list;
            size = i9;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final void m7616d(int i9, int i10, int i11) {
        int i12;
        this.f11767o = i9;
        boolean z9 = this.f11755c;
        this.f11772t = z9 ? i11 : i10;
        List list = this.f11754b;
        int size = list.size();
        for (int i13 = 0; i13 < size; i13++) {
            AbstractC4377b1 abstractC4377b1 = (AbstractC4377b1) list.get(i13);
            int i14 = i13 * 2;
            int[] iArr = this.f11775w;
            if (z9) {
                C5843e c5843e = this.f11756d;
                if (c5843e == null) {
                    AbstractC3026b.m6429b("null horizontalAlignment when isVertical == true");
                    C3193a.m6814c();
                    return;
                } else {
                    iArr[i14] = c5843e.m10545a(abstractC4377b1.f14593g, i10, this.f11758f);
                    iArr[i14 + 1] = i9;
                    i12 = abstractC4377b1.f14594h;
                }
            } else {
                iArr[i14] = i9;
                int i15 = i14 + 1;
                C5844f c5844f = this.f11757e;
                if (c5844f == null) {
                    AbstractC3026b.m6429b("null verticalAlignment when isVertical == false");
                    C3193a.m6814c();
                    return;
                } else {
                    iArr[i15] = c5844f.m10546a(abstractC4377b1.f14594h, i11);
                    i12 = abstractC4377b1.f14593g;
                }
            }
            i9 += i12;
        }
        this.f11773u = -this.f11759g;
        this.f11774v = this.f11772t + this.f11760h;
    }
}
