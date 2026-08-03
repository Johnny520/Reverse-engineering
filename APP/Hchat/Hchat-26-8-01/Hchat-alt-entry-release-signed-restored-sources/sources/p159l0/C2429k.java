package p159l0;

import gg.AbstractC1416l;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import okio.C3193a;
import p069f.AbstractC0946m;
import p069f.C0933f0;
import p069f.C0964v;
import p069f.C0965w;
import p069f.C0966x;
import p085fg.InterfaceC1235p;
import p092g4.AbstractC1341a;
import p117i0.AbstractC1855m;
import p117i0.AbstractC1861n1;
import p117i0.C1823e;
import p117i0.C1848k0;
import p117i0.C1851l;
import p117i0.C1856m0;
import p129ig.AbstractC2043a;
import p136j8.C2104o;
import tf.AbstractC4165l;

/* JADX INFO: renamed from: l0.k */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2429k {

    /* JADX INFO: renamed from: a */
    public final C2426h f7963a;

    /* JADX INFO: renamed from: b */
    public int[] f7964b;

    /* JADX INFO: renamed from: c */
    public Object[] f7965c;

    /* JADX INFO: renamed from: d */
    public ArrayList f7966d;

    /* JADX INFO: renamed from: e */
    public HashMap f7967e;

    /* JADX INFO: renamed from: f */
    public C0965w f7968f;

    /* JADX INFO: renamed from: g */
    public int f7969g;

    /* JADX INFO: renamed from: h */
    public int f7970h;

    /* JADX INFO: renamed from: i */
    public int f7971i;

    /* JADX INFO: renamed from: j */
    public int f7972j;

    /* JADX INFO: renamed from: k */
    public int f7973k;

    /* JADX INFO: renamed from: l */
    public int f7974l;

    /* JADX INFO: renamed from: m */
    public int f7975m;

    /* JADX INFO: renamed from: n */
    public int f7976n;

    /* JADX INFO: renamed from: o */
    public int f7977o;

    /* JADX INFO: renamed from: p */
    public final C1856m0 f7978p;

    /* JADX INFO: renamed from: q */
    public final C1856m0 f7979q;

    /* JADX INFO: renamed from: r */
    public final C1856m0 f7980r;

    /* JADX INFO: renamed from: s */
    public C0965w f7981s;

    /* JADX INFO: renamed from: t */
    public int f7982t;

    /* JADX INFO: renamed from: u */
    public int f7983u;

    /* JADX INFO: renamed from: v */
    public int f7984v;

    /* JADX INFO: renamed from: w */
    public boolean f7985w;

    /* JADX INFO: renamed from: x */
    public C0964v f7986x;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2429k(C2426h c2426h) {
        this.f7963a = c2426h;
        int[] iArr = c2426h.f7949g;
        this.f7964b = iArr;
        Object[] objArr = c2426h.f7951i;
        this.f7965c = objArr;
        this.f7966d = c2426h.f7957o;
        this.f7967e = c2426h.f7958p;
        this.f7968f = c2426h.f7959q;
        int i9 = c2426h.f7950h;
        this.f7969g = i9;
        this.f7970h = (iArr.length / 5) - i9;
        int i10 = c2426h.f7952j;
        this.f7973k = i10;
        this.f7974l = objArr.length - i10;
        this.f7975m = i9;
        this.f7978p = new C1856m0();
        this.f7979q = new C1856m0();
        this.f7980r = new C1856m0();
        this.f7983u = i9;
        this.f7984v = -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public static int m5793i(int i9, int i10, int i11, int i12) {
        return i9 > i10 ? -(((i12 - i11) - i9) + 1) : i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: z */
    public static void m5794z(C2429k c2429k) {
        int i9 = c2429k.f7984v;
        int iM5832r = c2429k.m5832r(i9);
        int[] iArr = c2429k.f7964b;
        int i10 = (iM5832r * 5) + 1;
        int i11 = iArr[i10];
        if ((i11 & 134217728) != 0) {
            return;
        }
        int i12 = (i11 & (-134217729)) | 134217728;
        iArr[i10] = i12;
        if ((67108864 & i12) != 0) {
            return;
        }
        c2429k.m5814T(c2429k.m5799E(iArr, i9));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: A */
    public final void m5795A(C2426h c2426h, int i9) {
        if (this.f7976n <= 0) {
            AbstractC1855m.m4573a("Check failed");
        }
        if (i9 == 0 && this.f7982t == 0 && this.f7963a.f7950h == 0) {
            int[] iArr = c2426h.f7949g;
            int i10 = iArr[(i9 * 5) + 3];
            int i11 = c2426h.f7950h;
            if (i10 == i11) {
                int[] iArr2 = this.f7964b;
                Object[] objArr = this.f7965c;
                ArrayList arrayList = this.f7966d;
                HashMap map = this.f7967e;
                C0965w c0965w = this.f7968f;
                Object[] objArr2 = c2426h.f7951i;
                int i12 = c2426h.f7952j;
                HashMap map2 = c2426h.f7958p;
                C0965w c0965w2 = c2426h.f7959q;
                this.f7964b = iArr;
                this.f7965c = objArr2;
                this.f7966d = c2426h.f7957o;
                this.f7969g = i11;
                this.f7970h = (iArr.length / 5) - i11;
                this.f7973k = i12;
                this.f7974l = objArr2.length - i12;
                this.f7975m = i11;
                this.f7967e = map2;
                this.f7968f = c0965w2;
                c2426h.f7949g = iArr2;
                c2426h.f7950h = 0;
                c2426h.f7951i = objArr;
                c2426h.f7952j = 0;
                c2426h.f7957o = arrayList;
                c2426h.f7958p = map;
                c2426h.f7959q = c0965w;
                return;
            }
        }
        C2429k c2429kM5784e = c2426h.m5784e();
        try {
            AbstractC2043a.m5009O(c2429kM5784e, i9, this, true, true, false);
            c2429kM5784e.m5820e(true);
        } catch (Throwable th2) {
            c2429kM5784e.m5820e(false);
            throw th2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: B */
    public final void m5796B(int i9) {
        C2420b c2420b;
        int i10;
        C2420b c2420b2;
        int i11;
        int i12;
        int i13 = this.f7970h;
        int i14 = this.f7969g;
        if (i14 != i9) {
            if (!this.f7966d.isEmpty()) {
                int iM5829o = m5829o() - this.f7970h;
                ArrayList arrayList = this.f7966d;
                if (i14 < i9) {
                    for (int iM5787a = AbstractC2428j.m5787a(arrayList, i14, iM5829o); iM5787a < this.f7966d.size() && (i11 = (c2420b2 = (C2420b) this.f7966d.get(iM5787a)).f7923a) < 0 && (i12 = i11 + iM5829o) < i9; iM5787a++) {
                        c2420b2.f7923a = i12;
                    }
                } else {
                    for (int iM5787a2 = AbstractC2428j.m5787a(arrayList, i9, iM5829o); iM5787a2 < this.f7966d.size() && (i10 = (c2420b = (C2420b) this.f7966d.get(iM5787a2)).f7923a) >= 0; iM5787a2++) {
                        c2420b.f7923a = -(iM5829o - i10);
                    }
                }
            }
            if (i13 > 0) {
                int[] iArr = this.f7964b;
                int i15 = i9 * 5;
                int i16 = i13 * 5;
                int i17 = i14 * 5;
                if (i9 < i14) {
                    AbstractC4165l.m8381p0(iArr, iArr, i16 + i15, i15, i17);
                } else {
                    AbstractC4165l.m8381p0(iArr, iArr, i17, i17 + i16, i15 + i16);
                }
            }
            if (i9 < i14) {
                i14 = i9 + i13;
            }
            int iM5829o2 = m5829o();
            if (i14 >= iM5829o2) {
                AbstractC1855m.m4573a("Check failed");
            }
            while (i14 < iM5829o2) {
                int i18 = (i14 * 5) + 2;
                int i19 = this.f7964b[i18];
                int iM5830p = i19 > -2 ? i19 : (m5830p() + i19) - (-2);
                if (iM5830p >= i9) {
                    iM5830p = -((m5830p() - iM5830p) - (-2));
                }
                if (iM5830p != i19) {
                    this.f7964b[i18] = iM5830p;
                }
                i14++;
                if (i14 == i9) {
                    i14 += i13;
                }
            }
        }
        this.f7969g = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: C */
    public final void m5797C(int i9, int i10) {
        int i11 = this.f7974l;
        int i12 = this.f7973k;
        int i13 = this.f7975m;
        if (i12 != i9) {
            Object[] objArr = this.f7965c;
            if (i9 < i12) {
                System.arraycopy(objArr, i9, objArr, i9 + i11, i12 - i9);
            } else {
                int i14 = i12 + i11;
                System.arraycopy(objArr, i14, objArr, i12, (i9 + i11) - i14);
            }
        }
        int iMin = Math.min(i10 + 1, m5830p());
        if (i13 != iMin) {
            int length = this.f7965c.length - i11;
            if (iMin < i13) {
                int iM5832r = m5832r(iMin);
                int iM5832r2 = m5832r(i13);
                int i15 = this.f7969g;
                while (iM5832r < iM5832r2) {
                    int i16 = (iM5832r * 5) + 4;
                    int i17 = this.f7964b[i16];
                    if (i17 < 0) {
                        AbstractC1855m.m4573a("Unexpected anchor value, expected a positive anchor");
                    }
                    this.f7964b[i16] = -((length - i17) + 1);
                    iM5832r++;
                    if (iM5832r == i15) {
                        iM5832r += this.f7970h;
                    }
                }
            } else {
                int iM5832r3 = m5832r(i13);
                int iM5832r4 = m5832r(iMin);
                while (iM5832r3 < iM5832r4) {
                    int i18 = (iM5832r3 * 5) + 4;
                    int i19 = this.f7964b[i18];
                    if (i19 >= 0) {
                        AbstractC1855m.m4573a("Unexpected anchor value, expected a negative anchor");
                    }
                    this.f7964b[i18] = i19 + length + 1;
                    iM5832r3++;
                    if (iM5832r3 == this.f7969g) {
                        iM5832r3 += this.f7970h;
                    }
                }
            }
            this.f7975m = iMin;
        }
        this.f7973k = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: D */
    public final Object m5798D(int i9) {
        int iM5832r = m5832r(i9);
        int[] iArr = this.f7964b;
        if ((iArr[(iM5832r * 5) + 1] & 1073741824) != 0) {
            return this.f7965c[m5823h(m5822g(iArr, iM5832r))];
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: E */
    public final int m5799E(int[] iArr, int i9) {
        int i10 = iArr[(m5832r(i9) * 5) + 2];
        return i10 > -2 ? i10 : (m5830p() + i10) - (-2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: F */
    public final Object m5800F(Object obj) {
        if (this.f7976n > 0) {
            m5838x(1, this.f7984v);
        }
        Object[] objArr = this.f7965c;
        int i9 = this.f7971i;
        this.f7971i = i9 + 1;
        Object obj2 = objArr[m5823h(i9)];
        if (this.f7971i > this.f7972j) {
            AbstractC1855m.m4573a("Writing to an invalid slot");
        }
        this.f7965c[m5823h(this.f7971i - 1)] = obj;
        return obj2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: G */
    public final void m5801G() {
        int i9;
        C0964v c0964v = this.f7986x;
        if (c0964v != null) {
            while (c0964v.f3036b != 0) {
                int iM3581L = AbstractC1341a.m3581L(c0964v);
                int iM5832r = m5832r(iM3581L);
                int iM5835u = iM3581L + 1;
                int iM5835u2 = m5835u(iM3581L) + iM3581L;
                while (true) {
                    if (iM5835u >= iM5835u2) {
                        i9 = 0;
                        break;
                    } else {
                        if ((this.f7964b[(m5832r(iM5835u) * 5) + 1] & 201326592) != 0) {
                            i9 = 1;
                            break;
                        }
                        iM5835u += m5835u(iM5835u);
                    }
                }
                int[] iArr = this.f7964b;
                int i10 = (iM5832r * 5) + 1;
                int i11 = iArr[i10];
                if (((67108864 & i11) != 0 ? 1 : 0) != i9) {
                    iArr[i10] = (i9 << 26) | ((-67108865) & i11);
                    int iM5799E = m5799E(iArr, iM3581L);
                    if (iM5799E >= 0) {
                        AbstractC1341a.m3589e(c0964v, iM5799E);
                    }
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: H */
    public final boolean m5802H() {
        if (this.f7976n != 0) {
            AbstractC1855m.m4573a("Cannot remove group while inserting");
        }
        int i9 = this.f7982t;
        int i10 = this.f7971i;
        int iM5822g = m5822g(this.f7964b, m5832r(i9));
        int iM5806L = m5806L();
        m5809O(this.f7984v);
        C0964v c0964v = this.f7986x;
        if (c0964v != null) {
            while (true) {
                int i11 = c0964v.f3036b;
                if (i11 == 0) {
                    break;
                }
                if (i11 == 0) {
                    C2104o.m5287l("IntList is empty.");
                    return false;
                }
                if (c0964v.f3035a[0] < i9) {
                    break;
                }
                AbstractC1341a.m3581L(c0964v);
            }
        }
        boolean zM5803I = m5803I(i9, this.f7982t - i9);
        m5804J(iM5822g, this.f7971i - iM5822g, i9 - 1);
        this.f7982t = i9;
        this.f7971i = i10;
        this.f7977o -= iM5806L;
        return zM5803I;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: I */
    public final boolean m5803I(int i9, int i10) {
        if (i10 > 0) {
            ArrayList arrayList = this.f7966d;
            m5796B(i9);
            if (!arrayList.isEmpty()) {
                HashMap map = this.f7967e;
                int i11 = i9 + i10;
                int iM5787a = AbstractC2428j.m5787a(this.f7966d, i11, m5829o() - this.f7970h);
                if (iM5787a >= this.f7966d.size()) {
                    iM5787a--;
                }
                int i12 = iM5787a + 1;
                int i13 = 0;
                while (iM5787a >= 0) {
                    C2420b c2420b = (C2420b) this.f7966d.get(iM5787a);
                    int iM5818c = m5818c(c2420b);
                    if (iM5818c < i9) {
                        break;
                    }
                    if (iM5818c < i11) {
                        c2420b.f7923a = Integer.MIN_VALUE;
                        if (map != null) {
                        }
                        if (i13 == 0) {
                            i13 = iM5787a + 1;
                        }
                        i12 = iM5787a;
                    }
                    iM5787a--;
                }
                z = i12 < i13;
                if (z) {
                    this.f7966d.subList(i12, i13).clear();
                }
            }
            this.f7969g = i9;
            this.f7970h += i10;
            int i14 = this.f7975m;
            if (i14 > i9) {
                this.f7975m = Math.max(i9, i14 - i10);
            }
            int i15 = this.f7983u;
            if (i15 >= this.f7969g) {
                this.f7983u = i15 - i10;
            }
            int i16 = this.f7984v;
            if (i16 >= 0 && (this.f7964b[(m5832r(i16) * 5) + 1] & 67108864) != 0) {
                m5814T(i16);
            }
        }
        return z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: J */
    public final void m5804J(int i9, int i10, int i11) {
        if (i10 > 0) {
            int i12 = this.f7974l;
            int i13 = i9 + i10;
            m5797C(i13, i11);
            this.f7973k = i9;
            this.f7974l = i12 + i10;
            Arrays.fill(this.f7965c, i9, i13, (Object) null);
            int i14 = this.f7972j;
            if (i14 >= i9) {
                this.f7972j = i14 - i10;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: K */
    public final Object m5805K(int i9, int i10, Object obj) {
        int iM5808N = m5808N(this.f7964b, m5832r(i9));
        int iM5822g = m5822g(this.f7964b, m5832r(i9 + 1));
        int i11 = iM5808N + i10;
        if (i11 < iM5808N || i11 >= iM5822g) {
            AbstractC1855m.m4573a("Write to an invalid slot index " + i10 + " for group " + i9);
        }
        int iM5823h = m5823h(i11);
        Object[] objArr = this.f7965c;
        Object obj2 = objArr[iM5823h];
        objArr[iM5823h] = obj;
        return obj2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: L */
    public final int m5806L() {
        int iM5832r = m5832r(this.f7982t);
        int i9 = this.f7982t;
        int[] iArr = this.f7964b;
        int i10 = iM5832r * 5;
        int i11 = iArr[i10 + 3] + i9;
        this.f7982t = i11;
        this.f7971i = m5822g(iArr, m5832r(i11));
        int i12 = this.f7964b[i10 + 1];
        if ((1073741824 & i12) != 0) {
            return 1;
        }
        return i12 & 67108863;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: M */
    public final void m5807M() {
        int i9 = this.f7983u;
        this.f7982t = i9;
        this.f7971i = m5822g(this.f7964b, m5832r(i9));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: N */
    public final int m5808N(int[] iArr, int i9) {
        if (i9 >= m5829o()) {
            return this.f7965c.length - this.f7974l;
        }
        int iM5788b = AbstractC2428j.m5788b(iArr, i9);
        return iM5788b < 0 ? (this.f7965c.length - this.f7974l) + iM5788b + 1 : iM5788b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: O */
    public final AbstractC2421c m5809O(int i9) {
        C2420b c2420bM5812R;
        HashMap map = this.f7967e;
        if (map == null || (c2420bM5812R = m5812R(i9)) == null) {
            return null;
        }
        return (AbstractC2421c) map.get(c2420bM5812R);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: P */
    public final void m5810P() {
        if (this.f7976n != 0) {
            AbstractC1855m.m4573a("Key must be supplied when inserting");
        }
        C1823e c1823e = C1851l.f6155a;
        m5811Q(0, c1823e, c1823e, false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: java.lang.Object[] */
    /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: java.lang.Object[] */
    /* JADX DEBUG: Multi-variable search result rejected for r1v4, resolved type: java.lang.Object[] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Q */
    public final void m5811Q(int i9, Object obj, Object obj2, boolean z9) {
        int i10;
        int i11 = this.f7984v;
        Object[] objArr = this.f7976n > 0;
        this.f7980r.m4577c(this.f7977o);
        C1823e c1823e = C1851l.f6155a;
        if (objArr == true) {
            int i12 = this.f7982t;
            int iM5822g = m5822g(this.f7964b, m5832r(i12));
            m5837w(1);
            this.f7971i = iM5822g;
            this.f7972j = iM5822g;
            int iM5832r = m5832r(i12);
            int i13 = obj != c1823e ? 1 : 0;
            int i14 = (z9 || obj2 == c1823e) ? 0 : 1;
            int iM5793i = m5793i(iM5822g, this.f7973k, this.f7974l, this.f7965c.length);
            if (iM5793i >= 0 && this.f7975m < i12) {
                iM5793i = -(((this.f7965c.length - this.f7974l) - iM5793i) + 1);
            }
            int[] iArr = this.f7964b;
            int i15 = this.f7984v;
            int i16 = iM5832r * 5;
            iArr[i16] = i9;
            iArr[i16 + 1] = ((z9 ? 1 : 0) << 30) | (i13 << 29) | (i14 << 28);
            iArr[i16 + 2] = i15;
            iArr[i16 + 3] = 0;
            iArr[i16 + 4] = iM5793i;
            int i17 = (z9 ? 1 : 0) + i13 + i14;
            if (i17 > 0) {
                m5838x(i17, i12);
                Object[] objArr2 = this.f7965c;
                int i18 = this.f7971i;
                if (z9) {
                    objArr2[i18] = obj2;
                    i18++;
                }
                if (i13 != 0) {
                    objArr2[i18] = obj;
                    i18++;
                }
                if (i14 != 0) {
                    objArr2[i18] = obj2;
                    i18++;
                }
                this.f7971i = i18;
            }
            this.f7977o = 0;
            i10 = i12 + 1;
            this.f7984v = i12;
            this.f7982t = i10;
            if (i11 >= 0) {
                m5809O(i11);
            }
        } else {
            this.f7978p.m4577c(i11);
            this.f7979q.m4577c((m5829o() - this.f7970h) - this.f7983u);
            int i19 = this.f7982t;
            int iM5832r2 = m5832r(i19);
            if (!AbstractC1416l.m3825a(obj2, c1823e)) {
                if (z9) {
                    m5815U(this.f7982t, obj2);
                } else {
                    m5813S(obj2);
                }
            }
            this.f7971i = m5808N(this.f7964b, iM5832r2);
            this.f7972j = m5822g(this.f7964b, m5832r(this.f7982t + 1));
            int[] iArr2 = this.f7964b;
            int i20 = iM5832r2 * 5;
            this.f7977o = iArr2[i20 + 1] & 67108863;
            this.f7984v = i19;
            this.f7982t = i19 + 1;
            i10 = i19 + iArr2[i20 + 3];
        }
        this.f7983u = i10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: R */
    public final C2420b m5812R(int i9) {
        ArrayList arrayList;
        int iM5791e;
        if (i9 < 0 || i9 >= m5830p() || (iM5791e = AbstractC2428j.m5791e((arrayList = this.f7966d), i9, m5830p())) < 0) {
            return null;
        }
        return (C2420b) arrayList.get(iM5791e);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: S */
    public final void m5813S(Object obj) {
        int iM5832r = m5832r(this.f7982t);
        int i9 = (iM5832r * 5) + 1;
        if ((this.f7964b[i9] & 268435456) == 0) {
            AbstractC1855m.m4573a("Updating the data of a group that was not created with a data slot");
        }
        Object[] objArr = this.f7965c;
        int[] iArr = this.f7964b;
        objArr[m5823h(Integer.bitCount(iArr[i9] >> 29) + m5822g(iArr, iM5832r))] = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: T */
    public final void m5814T(int i9) {
        if (i9 >= 0) {
            C0964v c0964v = this.f7986x;
            if (c0964v == null) {
                c0964v = new C0964v();
                this.f7986x = c0964v;
            }
            AbstractC1341a.m3589e(c0964v, i9);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: U */
    public final void m5815U(int i9, Object obj) {
        int iM5832r = m5832r(i9);
        int[] iArr = this.f7964b;
        if (iM5832r >= iArr.length || (iArr[(iM5832r * 5) + 1] & 1073741824) == 0) {
            AbstractC1855m.m4573a("Updating the node of a group at " + i9 + " that was not created with as a node group");
        }
        this.f7965c[m5823h(m5822g(this.f7964b, iM5832r))] = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m5816a(int i9) {
        if (i9 < 0) {
            AbstractC1855m.m4573a("Cannot seek backwards");
        }
        if (this.f7976n > 0) {
            AbstractC1861n1.m4584b("Cannot call seek() while inserting");
        }
        if (i9 == 0) {
            return;
        }
        int i10 = this.f7982t + i9;
        if (i10 < this.f7984v || i10 > this.f7983u) {
            AbstractC1855m.m4573a("Cannot seek outside the current group (" + this.f7984v + '-' + this.f7983u + ')');
        }
        this.f7982t = i10;
        int iM5822g = m5822g(this.f7964b, m5832r(i10));
        this.f7971i = iM5822g;
        this.f7972j = iM5822g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final C2420b m5817b(int i9) {
        ArrayList arrayList = this.f7966d;
        int iM5791e = AbstractC2428j.m5791e(arrayList, i9, m5830p());
        if (iM5791e >= 0) {
            return (C2420b) arrayList.get(iM5791e);
        }
        if (i9 > this.f7969g) {
            i9 = -(m5830p() - i9);
        }
        C2420b c2420b = new C2420b(i9);
        arrayList.add(-(iM5791e + 1), c2420b);
        return c2420b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final int m5818c(C2420b c2420b) {
        int i9 = c2420b.f7923a;
        return i9 < 0 ? m5830p() + i9 : i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final void m5819d() {
        int i9 = this.f7976n;
        this.f7976n = i9 + 1;
        if (i9 == 0) {
            this.f7979q.m4577c((m5829o() - this.f7970h) - this.f7983u);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final void m5820e(boolean z9) {
        this.f7985w = true;
        if (z9 && this.f7978p.f6175b == 0) {
            m5796B(m5830p());
            m5797C(this.f7965c.length - this.f7974l, this.f7969g);
            int i9 = this.f7973k;
            Arrays.fill(this.f7965c, i9, this.f7974l + i9, (Object) null);
            m5801G();
        }
        int[] iArr = this.f7964b;
        int i10 = this.f7969g;
        Object[] objArr = this.f7965c;
        int i11 = this.f7973k;
        ArrayList arrayList = this.f7966d;
        HashMap map = this.f7967e;
        C0965w c0965w = this.f7968f;
        C2426h c2426h = this.f7963a;
        if (!c2426h.f7955m) {
            AbstractC1861n1.m4583a("Unexpected writer close()");
        }
        c2426h.f7955m = false;
        c2426h.f7949g = iArr;
        c2426h.f7950h = i10;
        c2426h.f7951i = objArr;
        c2426h.f7952j = i11;
        c2426h.f7957o = arrayList;
        c2426h.f7958p = map;
        c2426h.f7959q = c0965w;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final int m5821f(int i9) {
        return m5822g(this.f7964b, m5832r(i9));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final int m5822g(int[] iArr, int i9) {
        if (i9 >= m5829o()) {
            return this.f7965c.length - this.f7974l;
        }
        int i10 = iArr[(i9 * 5) + 4];
        return i10 < 0 ? (this.f7965c.length - this.f7974l) + i10 + 1 : i10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public final int m5823h(int i9) {
        return (this.f7974l * (i9 < this.f7973k ? 0 : 1)) + i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public final void m5824j() {
        C0933f0 c0933f0;
        boolean z9 = this.f7976n > 0;
        int i9 = this.f7982t;
        int i10 = this.f7983u;
        int i11 = this.f7984v;
        int iM5832r = m5832r(i11);
        int i12 = this.f7977o;
        int i13 = i9 - i11;
        int i14 = iM5832r * 5;
        int i15 = i14 + 1;
        boolean z10 = (this.f7964b[i15] & 1073741824) != 0;
        C1856m0 c1856m0 = this.f7980r;
        if (z9) {
            C0965w c0965w = this.f7981s;
            if (c0965w != null && (c0933f0 = (C0933f0) c0965w.m2313b(i11)) != null) {
                Object[] objArr = c0933f0.f2923a;
                int i16 = c0933f0.f2924b;
                for (int i17 = 0; i17 < i16; i17++) {
                    m5800F(objArr[i17]);
                }
            }
            int[] iArr = this.f7964b;
            iArr[i14 + 3] = i13;
            AbstractC2428j.m5789c(iArr, iM5832r, i12);
            int iM4576b = c1856m0.m4576b();
            if (z10) {
                i12 = 1;
            }
            this.f7977o = iM4576b + i12;
            int iM5799E = m5799E(this.f7964b, i11);
            this.f7984v = iM5799E;
            int iM5830p = iM5799E < 0 ? m5830p() : m5832r(iM5799E + 1);
            int iM5822g = iM5830p >= 0 ? m5822g(this.f7964b, iM5830p) : 0;
            this.f7971i = iM5822g;
            this.f7972j = iM5822g;
            return;
        }
        if (i9 != i10) {
            AbstractC1855m.m4573a("Expected to be at the end of a group");
        }
        int[] iArr2 = this.f7964b;
        int i18 = i14 + 3;
        int i19 = iArr2[i18];
        int i20 = iArr2[i15] & 67108863;
        iArr2[i18] = i13;
        AbstractC2428j.m5789c(iArr2, iM5832r, i12);
        int iM4576b2 = this.f7978p.m4576b();
        this.f7983u = (m5829o() - this.f7970h) - this.f7979q.m4576b();
        this.f7984v = iM4576b2;
        int iM5799E2 = m5799E(this.f7964b, i11);
        int iM4576b3 = c1856m0.m4576b();
        this.f7977o = iM4576b3;
        if (iM5799E2 == iM4576b2) {
            this.f7977o = iM4576b3 + (z10 ? 0 : i12 - i20);
            return;
        }
        int i21 = i13 - i19;
        int i22 = z10 ? 0 : i12 - i20;
        if (i21 != 0 || i22 != 0) {
            while (iM5799E2 != 0 && iM5799E2 != iM4576b2 && (i22 != 0 || i21 != 0)) {
                int iM5832r2 = m5832r(iM5799E2);
                if (i21 != 0) {
                    int[] iArr3 = this.f7964b;
                    int i23 = (iM5832r2 * 5) + 3;
                    iArr3[i23] = iArr3[i23] + i21;
                }
                if (i22 != 0) {
                    int[] iArr4 = this.f7964b;
                    AbstractC2428j.m5789c(iArr4, iM5832r2, (iArr4[(iM5832r2 * 5) + 1] & 67108863) + i22);
                }
                int[] iArr5 = this.f7964b;
                if ((iArr5[(iM5832r2 * 5) + 1] & 1073741824) != 0) {
                    i22 = 0;
                }
                iM5799E2 = m5799E(iArr5, iM5799E2);
            }
        }
        this.f7977o += i22;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public final void m5825k() {
        if (this.f7976n <= 0) {
            AbstractC1861n1.m4584b("Unbalanced begin/end insert");
        }
        int i9 = this.f7976n - 1;
        this.f7976n = i9;
        if (i9 == 0) {
            if (this.f7980r.f6175b != this.f7978p.f6175b) {
                AbstractC1855m.m4573a("startGroup/endGroup mismatch while inserting");
            }
            this.f7983u = (m5829o() - this.f7970h) - this.f7979q.m4576b();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public final void m5826l(int i9) {
        boolean z9 = false;
        if (!(this.f7976n <= 0)) {
            AbstractC1855m.m4573a("Cannot call ensureStarted() while inserting");
        }
        int i10 = this.f7984v;
        if (i10 != i9) {
            if (i9 >= i10 && i9 < this.f7983u) {
                z9 = true;
            }
            if (!z9) {
                AbstractC1855m.m4573a("Started group at " + i9 + " must be a subgroup of the group at " + i10);
            }
            int i11 = this.f7982t;
            int i12 = this.f7971i;
            int i13 = this.f7972j;
            this.f7982t = i9;
            m5810P();
            this.f7982t = i11;
            this.f7971i = i12;
            this.f7972j = i13;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public final void m5827m(int i9, int i10, int i11) {
        if (i9 >= this.f7969g) {
            i9 = -((m5830p() - i9) + 2);
        }
        while (i11 < i10) {
            this.f7964b[(m5832r(i11) * 5) + 2] = i9;
            int i12 = this.f7964b[(m5832r(i11) * 5) + 3] + i11;
            m5827m(i11, i12, i11 + 1);
            i11 = i12;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0126, code lost:
    
        okio.C3193a.m6820i("Index must be between 0 and size");
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x012b, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008a  */
    /* JADX INFO: renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m5828n(int i9, InterfaceC1235p interfaceC1235p) {
        int i10;
        int i11;
        int i12;
        InterfaceC1235p interfaceC1235p2 = interfaceC1235p;
        int iM5799E = m5799E(this.f7964b, i9);
        int iM5830p = m5830p();
        int iM5835u = m5835u(i9) + i9;
        int i13 = i9;
        C0966x c0966x = null;
        C0964v c0964v = null;
        loop0: while (i13 < iM5835u) {
            int iM5821f = m5821f(i13);
            int i14 = i13 + 1;
            int iM5821f2 = m5821f(i14);
            while (iM5821f < iM5821f2) {
                Object obj = this.f7965c[m5823h(iM5821f)];
                if (obj instanceof C1848k0) {
                    C1848k0 c1848k0 = (C1848k0) obj;
                    if (!(c1848k0 instanceof C1848k0)) {
                        c1848k0 = null;
                    }
                    if (c1848k0 == null) {
                        AbstractC1855m.m4574b("Inconsistent composition");
                        C3193a.m6814c();
                        return;
                    }
                    int i15 = c1848k0.f6148b;
                    if (i15 >= 0) {
                        int iM5835u2 = m5835u(i13) + i13;
                        int i16 = i14;
                        int i17 = 0;
                        while (i16 < iM5835u2 && i17 < i15) {
                            int iM5832r = m5832r(i16);
                            int i18 = iM5799E;
                            int[] iArr = this.f7964b;
                            int i19 = iM5832r * 5;
                            i16 = iArr[i19 + 3] + i16;
                            if (i16 < iM5835u2 && (iArr[i19 + 1] & 536870912) == 0) {
                                i17++;
                            }
                            iM5799E = i18;
                        }
                        i12 = iM5799E;
                        if (c0966x == null) {
                            int[] iArr2 = AbstractC0946m.f2980a;
                            c0966x = new C0966x();
                        }
                        if (c0964v == null) {
                            c0964v = new C0964v();
                        }
                        c0966x.m2380a(i16);
                        c0964v.m2369a(i16);
                        c0964v.m2369a(iM5821f);
                    } else {
                        i12 = iM5799E;
                        interfaceC1235p2.invoke(Integer.valueOf(iM5821f), obj);
                    }
                }
                iM5821f++;
                iM5799E = i12;
            }
            int i20 = iM5799E;
            iM5799E = i14 < iM5830p ? m5799E(this.f7964b, i14) : -1;
            if (iM5799E != i13) {
                int iM5799E2 = i20;
                while (true) {
                    if (c0964v == null || c0966x == null || !c0966x.m2384e(i13)) {
                        i10 = iM5830p;
                    } else {
                        int i21 = c0964v.f3036b;
                        int i22 = i21 / 2;
                        int i23 = 0;
                        int i24 = 0;
                        while (i23 < i22) {
                            int i25 = i23 * 2;
                            int i26 = iM5830p;
                            int iM2371c = c0964v.m2371c(i25);
                            if (iM2371c == i13) {
                                int iM2371c2 = c0964v.m2371c(i25 + 1);
                                interfaceC1235p2.invoke(Integer.valueOf(iM2371c2), this.f7965c[m5823h(iM2371c2)]);
                            } else if (i25 != i24) {
                                int i27 = i24 + 1;
                                c0964v.m2373e(i24, iM2371c);
                                i24 += 2;
                                c0964v.m2373e(i27, c0964v.m2371c(i25 + 1));
                            } else {
                                i24 += 2;
                            }
                            i23++;
                            interfaceC1235p2 = interfaceC1235p;
                            iM5830p = i26;
                        }
                        i10 = iM5830p;
                        if (i24 != i21) {
                            if (i24 < 0 || i24 > (i11 = c0964v.f3036b) || i21 < 0 || i21 > i11) {
                                break loop0;
                            }
                            if (i21 < i24) {
                                C2104o.m5294t("The end index must be < start index");
                                return;
                            } else if (i21 != i24) {
                                if (i21 < i11) {
                                    int[] iArr3 = c0964v.f3035a;
                                    AbstractC4165l.m8381p0(iArr3, iArr3, i24, i21, i11);
                                }
                                c0964v.f3036b -= i21 - i24;
                            }
                        }
                    }
                    if (i13 == i9 || iM5799E2 == iM5799E) {
                        break;
                    }
                    i13 = iM5799E2;
                    iM5830p = i10;
                    iM5799E2 = m5799E(this.f7964b, iM5799E2);
                    interfaceC1235p2 = interfaceC1235p;
                }
            } else {
                i10 = iM5830p;
            }
            interfaceC1235p2 = interfaceC1235p;
            i13 = i14;
            iM5830p = i10;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public final int m5829o() {
        return this.f7964b.length / 5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public final int m5830p() {
        return m5829o() - this.f7970h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public final Object m5831q(int i9) {
        int iM5832r = m5832r(i9);
        int[] iArr = this.f7964b;
        int i10 = (iM5832r * 5) + 1;
        if ((iArr[i10] & 268435456) == 0) {
            return C1851l.f6155a;
        }
        return this.f7965c[Integer.bitCount(iArr[i10] >> 29) + m5822g(iArr, iM5832r)];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r */
    public final int m5832r(int i9) {
        return (this.f7970h * (i9 < this.f7969g ? 0 : 1)) + i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s */
    public final int m5833s(int i9) {
        return this.f7964b[m5832r(i9) * 5];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: t */
    public final Object m5834t(int i9) {
        int iM5832r = m5832r(i9);
        int[] iArr = this.f7964b;
        int i10 = iM5832r * 5;
        int i11 = iArr[i10 + 1];
        if ((536870912 & i11) == 0) {
            return null;
        }
        return this.f7965c[Integer.bitCount(i11 >> 30) + iArr[i10 + 4]];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "SlotWriter(current = " + this.f7982t + " end=" + this.f7983u + " size = " + m5830p() + " gap=" + this.f7969g + '-' + (this.f7969g + this.f7970h) + ')';
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: u */
    public final int m5835u(int i9) {
        return this.f7964b[(m5832r(i9) * 5) + 3];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: v */
    public final boolean m5836v(int i9, int i10) {
        int iM5829o;
        int iM5835u;
        if (i10 == this.f7984v) {
            iM5829o = this.f7983u;
        } else {
            C1856m0 c1856m0 = this.f7978p;
            if (i10 > c1856m0.m4575a(0)) {
                iM5835u = m5835u(i10);
            } else {
                int[] iArr = c1856m0.f6174a;
                int iMin = Math.min(iArr.length, c1856m0.f6175b);
                int i11 = 0;
                while (true) {
                    if (i11 >= iMin) {
                        i11 = -1;
                        break;
                    }
                    if (iArr[i11] == i10) {
                        break;
                    }
                    i11++;
                }
                if (i11 < 0) {
                    iM5835u = m5835u(i10);
                } else {
                    iM5829o = (m5829o() - this.f7970h) - this.f7979q.f6174a[i11];
                }
            }
            iM5829o = iM5835u + i10;
        }
        return i9 > i10 && i9 < iM5829o;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: w */
    public final void m5837w(int i9) {
        if (i9 > 0) {
            int i10 = this.f7982t;
            m5796B(i10);
            int i11 = this.f7969g;
            int i12 = this.f7970h;
            int[] iArr = this.f7964b;
            int length = iArr.length / 5;
            int i13 = length - i12;
            if (i12 < i9) {
                int iMax = Math.max(Math.max(length * 2, i13 + i9), 32);
                int[] iArr2 = new int[iMax * 5];
                int i14 = iMax - i13;
                AbstractC4165l.m8381p0(iArr, iArr2, 0, 0, i11 * 5);
                AbstractC4165l.m8381p0(iArr, iArr2, (i11 + i14) * 5, (i12 + i11) * 5, length * 5);
                this.f7964b = iArr2;
                i12 = i14;
            }
            int i15 = this.f7983u;
            if (i15 >= i11) {
                this.f7983u = i15 + i9;
            }
            int i16 = i11 + i9;
            this.f7969g = i16;
            this.f7970h = i12 - i9;
            int iM5793i = m5793i(i13 > 0 ? m5821f(i10 + i9) : 0, this.f7975m >= i11 ? this.f7973k : 0, this.f7974l, this.f7965c.length);
            for (int i17 = i11; i17 < i16; i17++) {
                this.f7964b[(i17 * 5) + 4] = iM5793i;
            }
            int i18 = this.f7975m;
            if (i18 >= i11) {
                this.f7975m = i18 + i9;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: x */
    public final void m5838x(int i9, int i10) {
        if (i9 > 0) {
            m5797C(this.f7971i, i10);
            int i11 = this.f7973k;
            int i12 = this.f7974l;
            if (i12 < i9) {
                Object[] objArr = this.f7965c;
                int length = objArr.length;
                int i13 = length - i12;
                int iMax = Math.max(Math.max(length * 2, i13 + i9), 32);
                Object[] objArr2 = new Object[iMax];
                for (int i14 = 0; i14 < iMax; i14++) {
                    objArr2[i14] = null;
                }
                int i15 = iMax - i13;
                int i16 = i12 + i11;
                System.arraycopy(objArr, 0, objArr2, 0, i11);
                System.arraycopy(objArr, i16, objArr2, i11 + i15, length - i16);
                this.f7965c = objArr2;
                i12 = i15;
            }
            int i17 = this.f7972j;
            if (i17 >= i11) {
                this.f7972j = i17 + i9;
            }
            this.f7973k = i11 + i9;
            this.f7974l = i12 - i9;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: y */
    public final boolean m5839y(int i9) {
        return (this.f7964b[(m5832r(i9) * 5) + 1] & 1073741824) != 0;
    }
}
