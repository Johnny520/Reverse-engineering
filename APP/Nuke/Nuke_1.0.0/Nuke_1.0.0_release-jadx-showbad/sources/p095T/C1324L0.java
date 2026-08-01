package p095T;

import java.util.ArrayList;
import java.util.HashMap;
import p041H0.C0619t;
import p061L2.AbstractC0972l;
import p112W2.InterfaceC1603e;
import p117X2.AbstractC1665j;
import p186k.AbstractC2430l;
import p186k.C2404A;
import p186k.C2438t;
import p186k.C2439u;
import p186k.C2440v;
import p192l.AbstractC2477a;

/* JADX INFO: renamed from: T.L0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1324L0 {

    /* JADX INFO: renamed from: a */
    public final C1318I0 f4723a;

    /* JADX INFO: renamed from: b */
    public int[] f4724b;

    /* JADX INFO: renamed from: c */
    public Object[] f4725c;

    /* JADX INFO: renamed from: d */
    public ArrayList f4726d;

    /* JADX INFO: renamed from: e */
    public HashMap f4727e;

    /* JADX INFO: renamed from: f */
    public C2439u f4728f;

    /* JADX INFO: renamed from: g */
    public int f4729g;

    /* JADX INFO: renamed from: h */
    public int f4730h;

    /* JADX INFO: renamed from: i */
    public int f4731i;

    /* JADX INFO: renamed from: j */
    public int f4732j;

    /* JADX INFO: renamed from: k */
    public int f4733k;

    /* JADX INFO: renamed from: l */
    public int f4734l;

    /* JADX INFO: renamed from: m */
    public int f4735m;

    /* JADX INFO: renamed from: n */
    public int f4736n;

    /* JADX INFO: renamed from: o */
    public int f4737o;

    /* JADX INFO: renamed from: p */
    public final C0619t f4738p;

    /* JADX INFO: renamed from: q */
    public final C0619t f4739q;

    /* JADX INFO: renamed from: r */
    public final C0619t f4740r;

    /* JADX INFO: renamed from: s */
    public C2439u f4741s;

    /* JADX INFO: renamed from: t */
    public int f4742t;

    /* JADX INFO: renamed from: u */
    public int f4743u;

    /* JADX INFO: renamed from: v */
    public int f4744v;

    /* JADX INFO: renamed from: w */
    public boolean f4745w;

    /* JADX INFO: renamed from: x */
    public C2438t f4746x;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1324L0(C1318I0 c1318i0) {
        this.f4723a = c1318i0;
        int[] iArr = c1318i0.f4705d;
        this.f4724b = iArr;
        Object[] objArr = c1318i0.f4707f;
        this.f4725c = objArr;
        this.f4726d = c1318i0.f4713l;
        this.f4727e = c1318i0.f4714m;
        this.f4728f = c1318i0.f4715n;
        int i5 = c1318i0.f4706e;
        this.f4729g = i5;
        this.f4730h = (iArr.length / 5) - i5;
        int i6 = c1318i0.f4708g;
        this.f4733k = i6;
        this.f4734l = objArr.length - i6;
        this.f4735m = i5;
        this.f4738p = new C0619t();
        this.f4739q = new C0619t();
        this.f4740r = new C0619t();
        this.f4743u = i5;
        this.f4744v = -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public static int m2448i(int i5, int i6, int i7, int i8) {
        return i5 > i6 ? -(((i8 - i7) - i5) + 1) : i5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: z */
    public static void m2449z(C1324L0 c1324l0) {
        int i5 = c1324l0.f4744v;
        int iM2487r = c1324l0.m2487r(i5);
        int[] iArr = c1324l0.f4724b;
        int i6 = (iM2487r * 5) + 1;
        int i7 = iArr[i6];
        if ((i7 & 134217728) != 0) {
            return;
        }
        int i8 = (i7 & (-134217729)) | 134217728;
        iArr[i6] = i8;
        if ((67108864 & i8) != 0) {
            return;
        }
        c1324l0.m2469T(c1324l0.m2454E(iArr, i5));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: A */
    public final void m2450A(C1318I0 c1318i0, int i5) {
        if (this.f4736n <= 0) {
            AbstractC1387t.m2638a("Check failed");
        }
        if (i5 == 0 && this.f4742t == 0 && this.f4723a.f4706e == 0) {
            int[] iArr = c1318i0.f4705d;
            int i6 = iArr[(i5 * 5) + 3];
            int i7 = c1318i0.f4706e;
            if (i6 == i7) {
                int[] iArr2 = this.f4724b;
                Object[] objArr = this.f4725c;
                ArrayList arrayList = this.f4726d;
                HashMap map = this.f4727e;
                C2439u c2439u = this.f4728f;
                Object[] objArr2 = c1318i0.f4707f;
                int i8 = c1318i0.f4708g;
                HashMap map2 = c1318i0.f4714m;
                C2439u c2439u2 = c1318i0.f4715n;
                this.f4724b = iArr;
                this.f4725c = objArr2;
                this.f4726d = c1318i0.f4713l;
                this.f4729g = i7;
                this.f4730h = (iArr.length / 5) - i7;
                this.f4733k = i8;
                this.f4734l = objArr2.length - i8;
                this.f4735m = i7;
                this.f4727e = map2;
                this.f4728f = c2439u2;
                c1318i0.f4705d = iArr2;
                c1318i0.f4706e = 0;
                c1318i0.f4707f = objArr;
                c1318i0.f4708g = 0;
                c1318i0.f4713l = arrayList;
                c1318i0.f4714m = map;
                c1318i0.f4715n = c2439u;
                return;
            }
        }
        C1324L0 c1324l0M2439d = c1318i0.m2439d();
        try {
            AbstractC1385s.m2628r(c1324l0M2439d, i5, this, true, true, false);
            c1324l0M2439d.m2475e(true);
        } catch (Throwable th) {
            c1324l0M2439d.m2475e(false);
            throw th;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: B */
    public final void m2451B(int i5) {
        C1349a c1349a;
        int i6;
        C1349a c1349a2;
        int i7;
        int i8;
        int i9 = this.f4730h;
        int i10 = this.f4729g;
        if (i10 != i5) {
            if (!this.f4726d.isEmpty()) {
                int iM2484o = m2484o() - this.f4730h;
                if (i10 < i5) {
                    for (int iM2443b = AbstractC1322K0.m2443b(this.f4726d, i10, iM2484o); iM2443b < this.f4726d.size() && (i7 = (c1349a2 = (C1349a) this.f4726d.get(iM2443b)).f4783a) < 0 && (i8 = i7 + iM2484o) < i5; iM2443b++) {
                        c1349a2.f4783a = i8;
                    }
                } else {
                    for (int iM2443b2 = AbstractC1322K0.m2443b(this.f4726d, i5, iM2484o); iM2443b2 < this.f4726d.size() && (i6 = (c1349a = (C1349a) this.f4726d.get(iM2443b2)).f4783a) >= 0; iM2443b2++) {
                        c1349a.f4783a = -(iM2484o - i6);
                    }
                }
            }
            if (i9 > 0) {
                int[] iArr = this.f4724b;
                int i11 = i5 * 5;
                int i12 = i9 * 5;
                int i13 = i10 * 5;
                if (i5 < i10) {
                    AbstractC0972l.m1991O(iArr, iArr, i12 + i11, i11, i13);
                } else {
                    AbstractC0972l.m1991O(iArr, iArr, i13, i13 + i12, i11 + i12);
                }
            }
            if (i5 < i10) {
                i10 = i5 + i9;
            }
            int iM2484o2 = m2484o();
            if (i10 >= iM2484o2) {
                AbstractC1387t.m2638a("Check failed");
            }
            while (i10 < iM2484o2) {
                int i14 = (i10 * 5) + 2;
                int i15 = this.f4724b[i14];
                int iM2485p = i15 > -2 ? i15 : (m2485p() + i15) - (-2);
                if (iM2485p >= i5) {
                    iM2485p = -((m2485p() - iM2485p) - (-2));
                }
                if (iM2485p != i15) {
                    this.f4724b[i14] = iM2485p;
                }
                i10++;
                if (i10 == i5) {
                    i10 += i9;
                }
            }
        }
        this.f4729g = i5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: C */
    public final void m2452C(int i5, int i6) {
        int i7 = this.f4734l;
        int i8 = this.f4733k;
        int i9 = this.f4735m;
        if (i8 != i5) {
            Object[] objArr = this.f4725c;
            if (i5 < i8) {
                System.arraycopy(objArr, i5, objArr, i5 + i7, i8 - i5);
            } else {
                int i10 = i8 + i7;
                System.arraycopy(objArr, i10, objArr, i8, (i5 + i7) - i10);
            }
        }
        int iMin = Math.min(i6 + 1, m2485p());
        if (i9 != iMin) {
            int length = this.f4725c.length - i7;
            if (iMin < i9) {
                int iM2487r = m2487r(iMin);
                int iM2487r2 = m2487r(i9);
                int i11 = this.f4729g;
                while (iM2487r < iM2487r2) {
                    int i12 = (iM2487r * 5) + 4;
                    int i13 = this.f4724b[i12];
                    if (!(i13 >= 0)) {
                        AbstractC1387t.m2638a("Unexpected anchor value, expected a positive anchor");
                    }
                    this.f4724b[i12] = -((length - i13) + 1);
                    iM2487r++;
                    if (iM2487r == i11) {
                        iM2487r += this.f4730h;
                    }
                }
            } else {
                int iM2487r3 = m2487r(i9);
                int iM2487r4 = m2487r(iMin);
                while (iM2487r3 < iM2487r4) {
                    int i14 = (iM2487r3 * 5) + 4;
                    int i15 = this.f4724b[i14];
                    if (!(i15 < 0)) {
                        AbstractC1387t.m2638a("Unexpected anchor value, expected a negative anchor");
                    }
                    this.f4724b[i14] = i15 + length + 1;
                    iM2487r3++;
                    if (iM2487r3 == this.f4729g) {
                        iM2487r3 += this.f4730h;
                    }
                }
            }
            this.f4735m = iMin;
        }
        this.f4733k = i5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: D */
    public final Object m2453D(int i5) {
        int iM2487r = m2487r(i5);
        int[] iArr = this.f4724b;
        if ((iArr[(iM2487r * 5) + 1] & 1073741824) != 0) {
            return this.f4725c[m2478h(m2477g(iArr, iM2487r))];
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: E */
    public final int m2454E(int[] iArr, int i5) {
        int i6 = iArr[(m2487r(i5) * 5) + 2];
        return i6 > -2 ? i6 : (m2485p() + i6) - (-2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: F */
    public final Object m2455F(Object obj) {
        if (this.f4736n > 0) {
            m2493x(1, this.f4744v);
        }
        Object[] objArr = this.f4725c;
        int i5 = this.f4731i;
        this.f4731i = i5 + 1;
        Object obj2 = objArr[m2478h(i5)];
        if (this.f4731i > this.f4732j) {
            AbstractC1387t.m2638a("Writing to an invalid slot");
        }
        this.f4725c[m2478h(this.f4731i - 1)] = obj;
        return obj2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: G */
    public final void m2456G() {
        int i5;
        C2438t c2438t = this.f4746x;
        if (c2438t != null) {
            while (c2438t.f7878b != 0) {
                int iM2636z = AbstractC1385s.m2636z(c2438t);
                int iM2487r = m2487r(iM2636z);
                int iM2490u = iM2636z + 1;
                int iM2490u2 = m2490u(iM2636z) + iM2636z;
                while (true) {
                    if (iM2490u >= iM2490u2) {
                        i5 = 0;
                        break;
                    } else {
                        if ((this.f4724b[(m2487r(iM2490u) * 5) + 1] & 201326592) != 0) {
                            i5 = 1;
                            break;
                        }
                        iM2490u += m2490u(iM2490u);
                    }
                }
                int[] iArr = this.f4724b;
                int i6 = (iM2487r * 5) + 1;
                int i7 = iArr[i6];
                if (((67108864 & i7) != 0 ? 1 : 0) != i5) {
                    iArr[i6] = (i5 << 26) | ((-67108865) & i7);
                    int iM2454E = m2454E(iArr, iM2636z);
                    if (iM2454E >= 0) {
                        AbstractC1385s.m2619i(c2438t, iM2454E);
                    }
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: H */
    public final boolean m2457H() {
        if (!(this.f4736n == 0)) {
            AbstractC1387t.m2638a("Cannot remove group while inserting");
        }
        int i5 = this.f4742t;
        int i6 = this.f4731i;
        int iM2477g = m2477g(this.f4724b, m2487r(i5));
        int iM2461L = m2461L();
        m2464O(this.f4744v);
        C2438t c2438t = this.f4746x;
        if (c2438t != null) {
            while (true) {
                int i7 = c2438t.f7878b;
                if (i7 == 0) {
                    break;
                }
                if (i7 == 0) {
                    AbstractC2477a.m4424e("IntList is empty.");
                    throw null;
                }
                if (c2438t.f7877a[0] < i5) {
                    break;
                }
                AbstractC1385s.m2636z(c2438t);
            }
        }
        boolean zM2458I = m2458I(i5, this.f4742t - i5);
        m2459J(iM2477g, this.f4731i - iM2477g, i5 - 1);
        this.f4742t = i5;
        this.f4731i = i6;
        this.f4737o -= iM2461L;
        return zM2458I;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: I */
    public final boolean m2458I(int i5, int i6) {
        if (i6 > 0) {
            ArrayList arrayList = this.f4726d;
            m2451B(i5);
            if (!arrayList.isEmpty()) {
                HashMap map = this.f4727e;
                int i7 = i5 + i6;
                int iM2443b = AbstractC1322K0.m2443b(this.f4726d, i7, m2484o() - this.f4730h);
                if (iM2443b >= this.f4726d.size()) {
                    iM2443b--;
                }
                int i8 = iM2443b + 1;
                int i9 = 0;
                while (iM2443b >= 0) {
                    C1349a c1349a = (C1349a) this.f4726d.get(iM2443b);
                    int iM2473c = m2473c(c1349a);
                    if (iM2473c < i5) {
                        break;
                    }
                    if (iM2473c < i7) {
                        c1349a.f4783a = Integer.MIN_VALUE;
                        if (map != null) {
                        }
                        if (i9 == 0) {
                            i9 = iM2443b + 1;
                        }
                        i8 = iM2443b;
                    }
                    iM2443b--;
                }
                z = i8 < i9;
                if (z) {
                    this.f4726d.subList(i8, i9).clear();
                }
            }
            this.f4729g = i5;
            this.f4730h += i6;
            int i10 = this.f4735m;
            if (i10 > i5) {
                this.f4735m = Math.max(i5, i10 - i6);
            }
            int i11 = this.f4743u;
            if (i11 >= this.f4729g) {
                this.f4743u = i11 - i6;
            }
            int i12 = this.f4744v;
            if (i12 >= 0 && (this.f4724b[(m2487r(i12) * 5) + 1] & 67108864) != 0) {
                m2469T(i12);
            }
        }
        return z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: J */
    public final void m2459J(int i5, int i6, int i7) {
        if (i6 > 0) {
            int i8 = this.f4734l;
            int i9 = i5 + i6;
            m2452C(i9, i7);
            this.f4733k = i5;
            this.f4734l = i8 + i6;
            AbstractC0972l.m1998V(this.f4725c, i5, i9);
            int i10 = this.f4732j;
            if (i10 >= i5) {
                this.f4732j = i10 - i6;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: K */
    public final Object m2460K(int i5, int i6, Object obj) {
        int iM2463N = m2463N(this.f4724b, m2487r(i5));
        int iM2477g = m2477g(this.f4724b, m2487r(i5 + 1));
        int i7 = iM2463N + i6;
        if (i7 < iM2463N || i7 >= iM2477g) {
            AbstractC1387t.m2638a("Write to an invalid slot index " + i6 + " for group " + i5);
        }
        int iM2478h = m2478h(i7);
        Object[] objArr = this.f4725c;
        Object obj2 = objArr[iM2478h];
        objArr[iM2478h] = obj;
        return obj2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: L */
    public final int m2461L() {
        int iM2487r = m2487r(this.f4742t);
        int iM2442a = AbstractC1322K0.m2442a(this.f4724b, iM2487r) + this.f4742t;
        this.f4742t = iM2442a;
        this.f4731i = m2477g(this.f4724b, m2487r(iM2442a));
        int i5 = this.f4724b[(iM2487r * 5) + 1];
        if ((1073741824 & i5) != 0) {
            return 1;
        }
        return i5 & 67108863;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: M */
    public final void m2462M() {
        int i5 = this.f4743u;
        this.f4742t = i5;
        this.f4731i = m2477g(this.f4724b, m2487r(i5));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: N */
    public final int m2463N(int[] iArr, int i5) {
        if (i5 >= m2484o()) {
            return this.f4725c.length - this.f4734l;
        }
        int iM2444c = AbstractC1322K0.m2444c(iArr, i5);
        return iM2444c < 0 ? (this.f4725c.length - this.f4734l) + iM2444c + 1 : iM2444c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: O */
    public final AbstractC1327N m2464O(int i5) {
        C1349a c1349aM2467R;
        HashMap map = this.f4727e;
        if (map == null || (c1349aM2467R = m2467R(i5)) == null) {
            return null;
        }
        return (AbstractC1327N) map.get(c1349aM2467R);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: P */
    public final void m2465P() {
        if (this.f4736n != 0) {
            AbstractC1387t.m2638a("Key must be supplied when inserting");
        }
        C1357e c1357e = C1371l.f4833a;
        m2466Q(0, c1357e, c1357e, false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: java.lang.Object[] */
    /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: java.lang.Object[] */
    /* JADX DEBUG: Multi-variable search result rejected for r1v4, resolved type: java.lang.Object[] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Q */
    public final void m2466Q(int i5, Object obj, Object obj2, boolean z5) {
        int i6;
        int i7 = this.f4744v;
        Object[] objArr = this.f4736n > 0;
        this.f4740r.m1059c(this.f4737o);
        C1357e c1357e = C1371l.f4833a;
        if (objArr == true) {
            int i8 = this.f4742t;
            int iM2477g = m2477g(this.f4724b, m2487r(i8));
            m2492w(1);
            this.f4731i = iM2477g;
            this.f4732j = iM2477g;
            int iM2487r = m2487r(i8);
            int i9 = obj != c1357e ? 1 : 0;
            int i10 = (z5 || obj2 == c1357e) ? 0 : 1;
            int iM2448i = m2448i(iM2477g, this.f4733k, this.f4734l, this.f4725c.length);
            if (iM2448i >= 0 && this.f4735m < i8) {
                iM2448i = -(((this.f4725c.length - this.f4734l) - iM2448i) + 1);
            }
            int[] iArr = this.f4724b;
            int i11 = this.f4744v;
            int i12 = iM2487r * 5;
            iArr[i12] = i5;
            iArr[i12 + 1] = ((z5 ? 1 : 0) << 30) | (i9 << 29) | (i10 << 28);
            iArr[i12 + 2] = i11;
            iArr[i12 + 3] = 0;
            iArr[i12 + 4] = iM2448i;
            int i13 = (z5 ? 1 : 0) + i9 + i10;
            if (i13 > 0) {
                m2493x(i13, i8);
                Object[] objArr2 = this.f4725c;
                int i14 = this.f4731i;
                if (z5) {
                    objArr2[i14] = obj2;
                    i14++;
                }
                if (i9 != 0) {
                    objArr2[i14] = obj;
                    i14++;
                }
                if (i10 != 0) {
                    objArr2[i14] = obj2;
                    i14++;
                }
                this.f4731i = i14;
            }
            this.f4737o = 0;
            i6 = i8 + 1;
            this.f4744v = i8;
            this.f4742t = i6;
            if (i7 >= 0) {
                m2464O(i7);
            }
        } else {
            this.f4738p.m1059c(i7);
            this.f4739q.m1059c((m2484o() - this.f4730h) - this.f4743u);
            int i15 = this.f4742t;
            int iM2487r2 = m2487r(i15);
            if (!AbstractC1665j.m2981a(obj2, c1357e)) {
                if (z5) {
                    m2470U(this.f4742t, obj2);
                } else {
                    m2468S(obj2);
                }
            }
            this.f4731i = m2463N(this.f4724b, iM2487r2);
            this.f4732j = m2477g(this.f4724b, m2487r(this.f4742t + 1));
            int[] iArr2 = this.f4724b;
            int i16 = iM2487r2 * 5;
            this.f4737o = iArr2[i16 + 1] & 67108863;
            this.f4744v = i15;
            this.f4742t = i15 + 1;
            i6 = i15 + iArr2[i16 + 3];
        }
        this.f4743u = i6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: R */
    public final C1349a m2467R(int i5) {
        ArrayList arrayList;
        int iM2446e;
        if (i5 < 0 || i5 >= m2485p() || (iM2446e = AbstractC1322K0.m2446e((arrayList = this.f4726d), i5, m2485p())) < 0) {
            return null;
        }
        return (C1349a) arrayList.get(iM2446e);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: S */
    public final void m2468S(Object obj) {
        int iM2487r = m2487r(this.f4742t);
        int i5 = (iM2487r * 5) + 1;
        if ((this.f4724b[i5] & 268435456) == 0) {
            AbstractC1387t.m2638a("Updating the data of a group that was not created with a data slot");
        }
        Object[] objArr = this.f4725c;
        int[] iArr = this.f4724b;
        objArr[m2478h(Integer.bitCount(iArr[i5] >> 29) + m2477g(iArr, iM2487r))] = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: T */
    public final void m2469T(int i5) {
        if (i5 >= 0) {
            C2438t c2438t = this.f4746x;
            if (c2438t == null) {
                c2438t = new C2438t();
                this.f4746x = c2438t;
            }
            AbstractC1385s.m2619i(c2438t, i5);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX INFO: renamed from: U */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2470U(int i5, Object obj) {
        boolean z5;
        int iM2487r = m2487r(i5);
        int[] iArr = this.f4724b;
        if (iM2487r < iArr.length) {
            z5 = (iArr[(iM2487r * 5) + 1] & 1073741824) != 0;
        }
        if (!z5) {
            AbstractC1387t.m2638a("Updating the node of a group at " + i5 + " that was not created with as a node group");
        }
        this.f4725c[m2478h(m2477g(this.f4724b, iM2487r))] = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m2471a(int i5) {
        boolean z5 = false;
        if (!(i5 >= 0)) {
            AbstractC1387t.m2638a("Cannot seek backwards");
        }
        if (!(this.f4736n <= 0)) {
            AbstractC1380p0.m2543b("Cannot call seek() while inserting");
        }
        if (i5 == 0) {
            return;
        }
        int i6 = this.f4742t + i5;
        if (i6 >= this.f4744v && i6 <= this.f4743u) {
            z5 = true;
        }
        if (!z5) {
            AbstractC1387t.m2638a("Cannot seek outside the current group (" + this.f4744v + '-' + this.f4743u + ')');
        }
        this.f4742t = i6;
        int iM2477g = m2477g(this.f4724b, m2487r(i6));
        this.f4731i = iM2477g;
        this.f4732j = iM2477g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final C1349a m2472b(int i5) {
        ArrayList arrayList = this.f4726d;
        int iM2446e = AbstractC1322K0.m2446e(arrayList, i5, m2485p());
        if (iM2446e >= 0) {
            return (C1349a) arrayList.get(iM2446e);
        }
        if (i5 > this.f4729g) {
            i5 = -(m2485p() - i5);
        }
        C1349a c1349a = new C1349a(i5);
        arrayList.add(-(iM2446e + 1), c1349a);
        return c1349a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final int m2473c(C1349a c1349a) {
        int i5 = c1349a.f4783a;
        return i5 < 0 ? m2485p() + i5 : i5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final void m2474d() {
        int i5 = this.f4736n;
        this.f4736n = i5 + 1;
        if (i5 == 0) {
            this.f4739q.m1059c((m2484o() - this.f4730h) - this.f4743u);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final void m2475e(boolean z5) {
        this.f4745w = true;
        if (z5 && this.f4738p.f1981b == 0) {
            m2451B(m2485p());
            m2452C(this.f4725c.length - this.f4734l, this.f4729g);
            int i5 = this.f4733k;
            AbstractC0972l.m1998V(this.f4725c, i5, this.f4734l + i5);
            m2456G();
        }
        int[] iArr = this.f4724b;
        int i6 = this.f4729g;
        Object[] objArr = this.f4725c;
        int i7 = this.f4733k;
        ArrayList arrayList = this.f4726d;
        HashMap map = this.f4727e;
        C2439u c2439u = this.f4728f;
        C1318I0 c1318i0 = this.f4723a;
        if (!c1318i0.f4711j) {
            AbstractC1380p0.m2542a("Unexpected writer close()");
        }
        c1318i0.f4711j = false;
        c1318i0.f4705d = iArr;
        c1318i0.f4706e = i6;
        c1318i0.f4707f = objArr;
        c1318i0.f4708g = i7;
        c1318i0.f4713l = arrayList;
        c1318i0.f4714m = map;
        c1318i0.f4715n = c2439u;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final int m2476f(int i5) {
        return m2477g(this.f4724b, m2487r(i5));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final int m2477g(int[] iArr, int i5) {
        if (i5 >= m2484o()) {
            return this.f4725c.length - this.f4734l;
        }
        int i6 = iArr[(i5 * 5) + 4];
        return i6 < 0 ? (this.f4725c.length - this.f4734l) + i6 + 1 : i6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public final int m2478h(int i5) {
        return (this.f4734l * (i5 < this.f4733k ? 0 : 1)) + i5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public final void m2479j() {
        C2404A c2404a;
        boolean z5 = this.f4736n > 0;
        int i5 = this.f4742t;
        int i6 = this.f4743u;
        int i7 = this.f4744v;
        int iM2487r = m2487r(i7);
        int i8 = this.f4737o;
        int i9 = i5 - i7;
        int i10 = iM2487r * 5;
        int i11 = i10 + 1;
        boolean z6 = (this.f4724b[i11] & 1073741824) != 0;
        C0619t c0619t = this.f4740r;
        if (z5) {
            C2439u c2439u = this.f4741s;
            if (c2439u != null && (c2404a = (C2404A) c2439u.m4318b(i7)) != null) {
                Object[] objArr = c2404a.f7766a;
                int i12 = c2404a.f7767b;
                for (int i13 = 0; i13 < i12; i13++) {
                    m2455F(objArr[i13]);
                }
            }
            int[] iArr = this.f4724b;
            iArr[i10 + 3] = i9;
            AbstractC1322K0.m2445d(iArr, iM2487r, i8);
            int iM1058b = c0619t.m1058b();
            if (z6) {
                i8 = 1;
            }
            this.f4737o = iM1058b + i8;
            int iM2454E = m2454E(this.f4724b, i7);
            this.f4744v = iM2454E;
            int iM2485p = iM2454E < 0 ? m2485p() : m2487r(iM2454E + 1);
            int iM2477g = iM2485p >= 0 ? m2477g(this.f4724b, iM2485p) : 0;
            this.f4731i = iM2477g;
            this.f4732j = iM2477g;
            return;
        }
        if (i5 != i6) {
            AbstractC1387t.m2638a("Expected to be at the end of a group");
        }
        int[] iArr2 = this.f4724b;
        int i14 = i10 + 3;
        int i15 = iArr2[i14];
        int i16 = iArr2[i11] & 67108863;
        iArr2[i14] = i9;
        AbstractC1322K0.m2445d(iArr2, iM2487r, i8);
        int iM1058b2 = this.f4738p.m1058b();
        this.f4743u = (m2484o() - this.f4730h) - this.f4739q.m1058b();
        this.f4744v = iM1058b2;
        int iM2454E2 = m2454E(this.f4724b, i7);
        int iM1058b3 = c0619t.m1058b();
        this.f4737o = iM1058b3;
        if (iM2454E2 == iM1058b2) {
            this.f4737o = iM1058b3 + (z6 ? 0 : i8 - i16);
            return;
        }
        int i17 = i9 - i15;
        int i18 = z6 ? 0 : i8 - i16;
        if (i17 != 0 || i18 != 0) {
            while (iM2454E2 != 0 && iM2454E2 != iM1058b2 && (i18 != 0 || i17 != 0)) {
                int iM2487r2 = m2487r(iM2454E2);
                if (i17 != 0) {
                    int[] iArr3 = this.f4724b;
                    int i19 = (iM2487r2 * 5) + 3;
                    iArr3[i19] = iArr3[i19] + i17;
                }
                if (i18 != 0) {
                    int[] iArr4 = this.f4724b;
                    AbstractC1322K0.m2445d(iArr4, iM2487r2, (iArr4[(iM2487r2 * 5) + 1] & 67108863) + i18);
                }
                int[] iArr5 = this.f4724b;
                if ((iArr5[(iM2487r2 * 5) + 1] & 1073741824) != 0) {
                    i18 = 0;
                }
                iM2454E2 = m2454E(iArr5, iM2454E2);
            }
        }
        this.f4737o += i18;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public final void m2480k() {
        if (this.f4736n <= 0) {
            AbstractC1380p0.m2543b("Unbalanced begin/end insert");
        }
        int i5 = this.f4736n - 1;
        this.f4736n = i5;
        if (i5 == 0) {
            if (this.f4740r.f1981b != this.f4738p.f1981b) {
                AbstractC1387t.m2638a("startGroup/endGroup mismatch while inserting");
            }
            this.f4743u = (m2484o() - this.f4730h) - this.f4739q.m1058b();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public final void m2481l(int i5) {
        boolean z5 = false;
        if (!(this.f4736n <= 0)) {
            AbstractC1387t.m2638a("Cannot call ensureStarted() while inserting");
        }
        int i6 = this.f4744v;
        if (i6 != i5) {
            if (i5 >= i6 && i5 < this.f4743u) {
                z5 = true;
            }
            if (!z5) {
                AbstractC1387t.m2638a("Started group at " + i5 + " must be a subgroup of the group at " + i6);
            }
            int i7 = this.f4742t;
            int i8 = this.f4731i;
            int i9 = this.f4732j;
            this.f4742t = i5;
            m2465P();
            this.f4742t = i7;
            this.f4731i = i8;
            this.f4732j = i9;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public final void m2482m(int i5, int i6, int i7) {
        if (i5 >= this.f4729g) {
            i5 = -((m2485p() - i5) + 2);
        }
        while (i7 < i6) {
            this.f4724b[(m2487r(i7) * 5) + 2] = i5;
            int i8 = this.f4724b[(m2487r(i7) * 5) + 3] + i7;
            m2482m(i7, i8, i7 + 1);
            i7 = i8;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x011a, code lost:
    
        p192l.AbstractC2477a.m4423d("Index must be between 0 and size");
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x011f, code lost:
    
        throw null;
     */
    /* JADX INFO: renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2483n(int i5, InterfaceC1603e interfaceC1603e) {
        int i6;
        int i7;
        int i8;
        int i9;
        InterfaceC1603e interfaceC1603e2 = interfaceC1603e;
        int iM2454E = m2454E(this.f4724b, i5);
        int iM2485p = m2485p();
        int iM2490u = m2490u(i5) + i5;
        int i10 = i5;
        C2440v c2440v = null;
        C2438t c2438t = null;
        loop0: while (i10 < iM2490u) {
            int iM2476f = m2476f(i10);
            int i11 = i10 + 1;
            int iM2476f2 = m2476f(i11);
            while (iM2476f < iM2476f2) {
                Object obj = this.f4725c[m2478h(iM2476f)];
                if (!(obj instanceof C1308D0) || (i9 = ((C1308D0) obj).f4673b) < 0) {
                    i8 = iM2454E;
                    interfaceC1603e2.mo0g(Integer.valueOf(iM2476f), obj);
                } else {
                    int iM2490u2 = m2490u(i10) + i10;
                    int i12 = i11;
                    int i13 = 0;
                    while (i12 < iM2490u2 && i13 < i9) {
                        int iM2487r = m2487r(i12);
                        int i14 = iM2454E;
                        int[] iArr = this.f4724b;
                        int i15 = iM2487r * 5;
                        i12 = iArr[i15 + 3] + i12;
                        if (i12 < iM2490u2 && (iArr[i15 + 1] & 536870912) == 0) {
                            i13++;
                        }
                        iM2454E = i14;
                    }
                    i8 = iM2454E;
                    if (c2440v == null) {
                        int[] iArr2 = AbstractC2430l.f7851a;
                        c2440v = new C2440v();
                    }
                    if (c2438t == null) {
                        c2438t = new C2438t();
                    }
                    c2440v.m4345a(i12);
                    c2438t.m4334a(i12);
                    c2438t.m4334a(iM2476f);
                }
                iM2476f++;
                iM2454E = i8;
            }
            int i16 = iM2454E;
            iM2454E = i11 < iM2485p ? m2454E(this.f4724b, i11) : -1;
            if (iM2454E != i10) {
                int iM2454E2 = i16;
                while (true) {
                    if (c2438t == null || c2440v == null || !c2440v.m4349e(i10)) {
                        i6 = iM2485p;
                    } else {
                        int i17 = c2438t.f7878b;
                        int i18 = i17 / 2;
                        int i19 = 0;
                        int i20 = 0;
                        while (i19 < i18) {
                            int i21 = i19 * 2;
                            int i22 = iM2485p;
                            int iM4336c = c2438t.m4336c(i21);
                            if (iM4336c == i10) {
                                int iM4336c2 = c2438t.m4336c(i21 + 1);
                                interfaceC1603e2.mo0g(Integer.valueOf(iM4336c2), this.f4725c[m2478h(iM4336c2)]);
                            } else if (i21 != i20) {
                                int i23 = i20 + 1;
                                c2438t.m4338e(i20, iM4336c);
                                i20 += 2;
                                c2438t.m4338e(i23, c2438t.m4336c(i21 + 1));
                            } else {
                                i20 += 2;
                            }
                            i19++;
                            interfaceC1603e2 = interfaceC1603e;
                            iM2485p = i22;
                        }
                        i6 = iM2485p;
                        if (i20 != i17) {
                            if (i20 < 0 || i20 > (i7 = c2438t.f7878b) || i17 < 0 || i17 > i7) {
                                break loop0;
                            }
                            if (i17 < i20) {
                                AbstractC2477a.m4422c("The end index must be < start index");
                                throw null;
                            }
                            if (i17 != i20) {
                                if (i17 < i7) {
                                    int[] iArr3 = c2438t.f7877a;
                                    AbstractC0972l.m1991O(iArr3, iArr3, i20, i17, i7);
                                }
                                c2438t.f7878b -= i17 - i20;
                            }
                        }
                    }
                    if (i10 == i5 || iM2454E2 == iM2454E) {
                        break;
                    }
                    i10 = iM2454E2;
                    iM2485p = i6;
                    iM2454E2 = m2454E(this.f4724b, iM2454E2);
                    interfaceC1603e2 = interfaceC1603e;
                }
            } else {
                i6 = iM2485p;
            }
            interfaceC1603e2 = interfaceC1603e;
            i10 = i11;
            iM2485p = i6;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public final int m2484o() {
        return this.f4724b.length / 5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public final int m2485p() {
        return m2484o() - this.f4730h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public final Object m2486q(int i5) {
        int iM2487r = m2487r(i5);
        int[] iArr = this.f4724b;
        int i6 = (iM2487r * 5) + 1;
        if ((iArr[i6] & 268435456) == 0) {
            return C1371l.f4833a;
        }
        return this.f4725c[Integer.bitCount(iArr[i6] >> 29) + m2477g(iArr, iM2487r)];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r */
    public final int m2487r(int i5) {
        return (this.f4730h * (i5 < this.f4729g ? 0 : 1)) + i5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s */
    public final int m2488s(int i5) {
        return this.f4724b[m2487r(i5) * 5];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: t */
    public final Object m2489t(int i5) {
        int iM2487r = m2487r(i5);
        int[] iArr = this.f4724b;
        int i6 = iM2487r * 5;
        int i7 = iArr[i6 + 1];
        if ((536870912 & i7) == 0) {
            return null;
        }
        return this.f4725c[Integer.bitCount(i7 >> 30) + iArr[i6 + 4]];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "SlotWriter(current = " + this.f4742t + " end=" + this.f4743u + " size = " + m2485p() + " gap=" + this.f4729g + '-' + (this.f4729g + this.f4730h) + ')';
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: u */
    public final int m2490u(int i5) {
        return AbstractC1322K0.m2442a(this.f4724b, m2487r(i5));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: v */
    public final boolean m2491v(int i5, int i6) {
        int iM2484o;
        int iM2490u;
        if (i6 == this.f4744v) {
            iM2484o = this.f4743u;
        } else {
            C0619t c0619t = this.f4738p;
            if (i6 > c0619t.m1057a(0)) {
                iM2490u = m2490u(i6);
            } else {
                int[] iArr = c0619t.f1980a;
                int iMin = Math.min(iArr.length, c0619t.f1981b);
                int i7 = 0;
                while (true) {
                    if (i7 >= iMin) {
                        i7 = -1;
                        break;
                    }
                    if (iArr[i7] == i6) {
                        break;
                    }
                    i7++;
                }
                if (i7 < 0) {
                    iM2490u = m2490u(i6);
                } else {
                    iM2484o = (m2484o() - this.f4730h) - this.f4739q.f1980a[i7];
                }
            }
            iM2484o = iM2490u + i6;
        }
        return i5 > i6 && i5 < iM2484o;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: w */
    public final void m2492w(int i5) {
        if (i5 > 0) {
            int i6 = this.f4742t;
            m2451B(i6);
            int i7 = this.f4729g;
            int i8 = this.f4730h;
            int[] iArr = this.f4724b;
            int length = iArr.length / 5;
            int i9 = length - i8;
            if (i8 < i5) {
                int iMax = Math.max(Math.max(length * 2, i9 + i5), 32);
                int[] iArr2 = new int[iMax * 5];
                int i10 = iMax - i9;
                AbstractC0972l.m1991O(iArr, iArr2, 0, 0, i7 * 5);
                AbstractC0972l.m1991O(iArr, iArr2, (i7 + i10) * 5, (i8 + i7) * 5, length * 5);
                this.f4724b = iArr2;
                i8 = i10;
            }
            int i11 = this.f4743u;
            if (i11 >= i7) {
                this.f4743u = i11 + i5;
            }
            int i12 = i7 + i5;
            this.f4729g = i12;
            this.f4730h = i8 - i5;
            int iM2448i = m2448i(i9 > 0 ? m2476f(i6 + i5) : 0, this.f4735m >= i7 ? this.f4733k : 0, this.f4734l, this.f4725c.length);
            for (int i13 = i7; i13 < i12; i13++) {
                this.f4724b[(i13 * 5) + 4] = iM2448i;
            }
            int i14 = this.f4735m;
            if (i14 >= i7) {
                this.f4735m = i14 + i5;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: x */
    public final void m2493x(int i5, int i6) {
        if (i5 > 0) {
            m2452C(this.f4731i, i6);
            int i7 = this.f4733k;
            int i8 = this.f4734l;
            if (i8 < i5) {
                Object[] objArr = this.f4725c;
                int length = objArr.length;
                int i9 = length - i8;
                int iMax = Math.max(Math.max(length * 2, i9 + i5), 32);
                Object[] objArr2 = new Object[iMax];
                for (int i10 = 0; i10 < iMax; i10++) {
                    objArr2[i10] = null;
                }
                int i11 = iMax - i9;
                int i12 = i8 + i7;
                System.arraycopy(objArr, 0, objArr2, 0, i7);
                System.arraycopy(objArr, i12, objArr2, i7 + i11, length - i12);
                this.f4725c = objArr2;
                i8 = i11;
            }
            int i13 = this.f4732j;
            if (i13 >= i7) {
                this.f4732j = i13 + i5;
            }
            this.f4733k = i7 + i5;
            this.f4734l = i8 - i5;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: y */
    public final boolean m2494y(int i5) {
        return (this.f4724b[(m2487r(i5) * 5) + 1] & 1073741824) != 0;
    }
}
