package p000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class z11 {

    /* JADX INFO: renamed from: a */
    public final w11 f7751a;

    /* JADX INFO: renamed from: b */
    public int[] f7752b;

    /* JADX INFO: renamed from: c */
    public Object[] f7753c;

    /* JADX INFO: renamed from: d */
    public ArrayList f7754d;

    /* JADX INFO: renamed from: e */
    public HashMap f7755e;

    /* JADX INFO: renamed from: f */
    public ug0 f7756f;

    /* JADX INFO: renamed from: g */
    public int f7757g;

    /* JADX INFO: renamed from: h */
    public int f7758h;

    /* JADX INFO: renamed from: i */
    public int f7759i;

    /* JADX INFO: renamed from: j */
    public int f7760j;

    /* JADX INFO: renamed from: k */
    public int f7761k;

    /* JADX INFO: renamed from: l */
    public int f7762l;

    /* JADX INFO: renamed from: m */
    public int f7763m;

    /* JADX INFO: renamed from: n */
    public int f7764n;

    /* JADX INFO: renamed from: o */
    public int f7765o;

    /* JADX INFO: renamed from: p */
    public final e30 f7766p;

    /* JADX INFO: renamed from: q */
    public final e30 f7767q;

    /* JADX INFO: renamed from: r */
    public final e30 f7768r;

    /* JADX INFO: renamed from: s */
    public ug0 f7769s;

    /* JADX INFO: renamed from: t */
    public int f7770t;

    /* JADX INFO: renamed from: u */
    public int f7771u;

    /* JADX INFO: renamed from: v */
    public int f7772v;

    /* JADX INFO: renamed from: w */
    public boolean f7773w;

    /* JADX INFO: renamed from: x */
    public tg0 f7774x;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public z11(w11 w11Var) {
        this.f7751a = w11Var;
        int[] iArr = w11Var.f6893d;
        this.f7752b = iArr;
        Object[] objArr = w11Var.f6895f;
        this.f7753c = objArr;
        this.f7754d = w11Var.f6901l;
        this.f7755e = w11Var.f6902m;
        this.f7756f = w11Var.f6903n;
        int i = w11Var.f6894e;
        this.f7757g = i;
        this.f7758h = (iArr.length / 5) - i;
        int i2 = w11Var.f6896g;
        this.f7761k = i2;
        this.f7762l = objArr.length - i2;
        this.f7763m = i;
        this.f7766p = new e30();
        this.f7767q = new e30();
        this.f7768r = new e30();
        this.f7771u = i;
        this.f7772v = -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public static int m5365i(int i, int i2, int i3, int i4) {
        return i > i2 ? -(((i4 - i3) - i) + 1) : i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: z */
    public static void m5366z(z11 z11Var) {
        int i = z11Var.f7772v;
        int iM5404r = z11Var.m5404r(i);
        int[] iArr = z11Var.f7752b;
        int i2 = (iM5404r * 5) + 1;
        int i3 = iArr[i2];
        if ((i3 & 134217728) != 0) {
            return;
        }
        int i4 = (i3 & (-134217729)) | 134217728;
        iArr[i2] = i4;
        if ((67108864 & i4) != 0) {
            return;
        }
        z11Var.m5386T(z11Var.m5371E(iArr, i));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: A */
    public final void m5367A(w11 w11Var, int i) {
        if (this.f7764n <= 0) {
            AbstractC0653qi.m3252a("Check failed");
        }
        if (i == 0 && this.f7770t == 0 && this.f7751a.f6894e == 0) {
            int[] iArr = w11Var.f6893d;
            int i2 = iArr[(i * 5) + 3];
            int i3 = w11Var.f6894e;
            if (i2 == i3) {
                int[] iArr2 = this.f7752b;
                Object[] objArr = this.f7753c;
                ArrayList arrayList = this.f7754d;
                HashMap map = this.f7755e;
                ug0 ug0Var = this.f7756f;
                Object[] objArr2 = w11Var.f6895f;
                int i4 = w11Var.f6896g;
                HashMap map2 = w11Var.f6902m;
                ug0 ug0Var2 = w11Var.f6903n;
                this.f7752b = iArr;
                this.f7753c = objArr2;
                this.f7754d = w11Var.f6901l;
                this.f7757g = i3;
                this.f7758h = (iArr.length / 5) - i3;
                this.f7761k = i4;
                this.f7762l = objArr2.length - i4;
                this.f7763m = i3;
                this.f7755e = map2;
                this.f7756f = ug0Var2;
                w11Var.f6893d = iArr2;
                w11Var.f6894e = 0;
                w11Var.f6895f = objArr;
                w11Var.f6896g = 0;
                w11Var.f6901l = arrayList;
                w11Var.f6902m = map;
                w11Var.f6903n = ug0Var;
                return;
            }
        }
        z11 z11VarM4830d = w11Var.m4830d();
        try {
            w60.m4880B(z11VarM4830d, i, this, true, true, false);
            z11VarM4830d.m5392e(true);
        } catch (Throwable th) {
            z11VarM4830d.m5392e(false);
            throw th;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: B */
    public final void m5368B(int i) {
        C0788u2 c0788u2;
        int i2;
        C0788u2 c0788u22;
        int i3;
        int i4;
        int i5 = this.f7758h;
        int i6 = this.f7757g;
        if (i6 != i) {
            if (!this.f7754d.isEmpty()) {
                int iM5401o = m5401o() - this.f7758h;
                ArrayList arrayList = this.f7754d;
                if (i6 < i) {
                    for (int iM5199a = y11.m5199a(arrayList, i6, iM5401o); iM5199a < this.f7754d.size() && (i3 = (c0788u22 = (C0788u2) this.f7754d.get(iM5199a)).f6110a) < 0 && (i4 = i3 + iM5401o) < i; iM5199a++) {
                        c0788u22.f6110a = i4;
                    }
                } else {
                    for (int iM5199a2 = y11.m5199a(arrayList, i, iM5401o); iM5199a2 < this.f7754d.size() && (i2 = (c0788u2 = (C0788u2) this.f7754d.get(iM5199a2)).f6110a) >= 0; iM5199a2++) {
                        c0788u2.f6110a = -(iM5401o - i2);
                    }
                }
            }
            if (i5 > 0) {
                int[] iArr = this.f7752b;
                int i7 = i * 5;
                int i8 = i5 * 5;
                int i9 = i6 * 5;
                if (i < i6) {
                    AbstractC0201f9.m1055a0(iArr, iArr, i8 + i7, i7, i9);
                } else {
                    AbstractC0201f9.m1055a0(iArr, iArr, i9, i9 + i8, i7 + i8);
                }
            }
            if (i < i6) {
                i6 = i + i5;
            }
            int iM5401o2 = m5401o();
            if (i6 >= iM5401o2) {
                AbstractC0653qi.m3252a("Check failed");
            }
            while (i6 < iM5401o2) {
                int i10 = (i6 * 5) + 2;
                int i11 = this.f7752b[i10];
                int iM5402p = i11 > -2 ? i11 : (m5402p() + i11) - (-2);
                if (iM5402p >= i) {
                    iM5402p = -((m5402p() - iM5402p) - (-2));
                }
                if (iM5402p != i11) {
                    this.f7752b[i10] = iM5402p;
                }
                i6++;
                if (i6 == i) {
                    i6 += i5;
                }
            }
        }
        this.f7757g = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: C */
    public final void m5369C(int i, int i2) {
        int i3 = this.f7762l;
        int i4 = this.f7761k;
        int i5 = this.f7763m;
        if (i4 != i) {
            Object[] objArr = this.f7753c;
            if (i < i4) {
                System.arraycopy(objArr, i, objArr, i + i3, i4 - i);
            } else {
                int i6 = i4 + i3;
                System.arraycopy(objArr, i6, objArr, i4, (i + i3) - i6);
            }
        }
        int iMin = Math.min(i2 + 1, m5402p());
        if (i5 != iMin) {
            int length = this.f7753c.length - i3;
            if (iMin < i5) {
                int iM5404r = m5404r(iMin);
                int iM5404r2 = m5404r(i5);
                int i7 = this.f7757g;
                while (iM5404r < iM5404r2) {
                    int i8 = (iM5404r * 5) + 4;
                    int i9 = this.f7752b[i8];
                    if (i9 < 0) {
                        AbstractC0653qi.m3252a("Unexpected anchor value, expected a positive anchor");
                    }
                    this.f7752b[i8] = -((length - i9) + 1);
                    iM5404r++;
                    if (iM5404r == i7) {
                        iM5404r += this.f7758h;
                    }
                }
            } else {
                int iM5404r3 = m5404r(i5);
                int iM5404r4 = m5404r(iMin);
                while (iM5404r3 < iM5404r4) {
                    int i10 = (iM5404r3 * 5) + 4;
                    int i11 = this.f7752b[i10];
                    if (i11 >= 0) {
                        AbstractC0653qi.m3252a("Unexpected anchor value, expected a negative anchor");
                    }
                    this.f7752b[i10] = i11 + length + 1;
                    iM5404r3++;
                    if (iM5404r3 == this.f7757g) {
                        iM5404r3 += this.f7758h;
                    }
                }
            }
            this.f7763m = iMin;
        }
        this.f7761k = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: D */
    public final Object m5370D(int i) {
        int iM5404r = m5404r(i);
        int[] iArr = this.f7752b;
        if ((iArr[(iM5404r * 5) + 1] & 1073741824) != 0) {
            return this.f7753c[m5395h(m5394g(iArr, iM5404r))];
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: E */
    public final int m5371E(int[] iArr, int i) {
        int i2 = iArr[(m5404r(i) * 5) + 2];
        return i2 > -2 ? i2 : (m5402p() + i2) - (-2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: F */
    public final Object m5372F(Object obj) {
        if (this.f7764n > 0) {
            m5410x(1, this.f7772v);
        }
        Object[] objArr = this.f7753c;
        int i = this.f7759i;
        this.f7759i = i + 1;
        Object obj2 = objArr[m5395h(i)];
        if (this.f7759i > this.f7760j) {
            AbstractC0653qi.m3252a("Writing to an invalid slot");
        }
        this.f7753c[m5395h(this.f7759i - 1)] = obj;
        return obj2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: G */
    public final void m5373G() {
        int i;
        tg0 tg0Var = this.f7774x;
        if (tg0Var != null) {
            while (tg0Var.f6001b != 0) {
                int iM1221t = g60.m1221t(tg0Var);
                int iM5404r = m5404r(iM1221t);
                int iM5407u = iM1221t + 1;
                int iM5407u2 = m5407u(iM1221t) + iM1221t;
                while (true) {
                    if (iM5407u >= iM5407u2) {
                        i = 0;
                        break;
                    } else {
                        if ((this.f7752b[(m5404r(iM5407u) * 5) + 1] & 201326592) != 0) {
                            i = 1;
                            break;
                        }
                        iM5407u += m5407u(iM5407u);
                    }
                }
                int[] iArr = this.f7752b;
                int i2 = (iM5404r * 5) + 1;
                int i3 = iArr[i2];
                if (((67108864 & i3) != 0 ? 1 : 0) != i) {
                    iArr[i2] = (i << 26) | ((-67108865) & i3);
                    int iM5371E = m5371E(iArr, iM1221t);
                    if (iM5371E >= 0) {
                        g60.m1206e(tg0Var, iM5371E);
                    }
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: H */
    public final boolean m5374H() {
        if (this.f7764n != 0) {
            AbstractC0653qi.m3252a("Cannot remove group while inserting");
        }
        int i = this.f7770t;
        int i2 = this.f7759i;
        int iM5394g = m5394g(this.f7752b, m5404r(i));
        int iM5378L = m5378L();
        m5381O(this.f7772v);
        tg0 tg0Var = this.f7774x;
        if (tg0Var != null) {
            while (true) {
                int i3 = tg0Var.f6001b;
                if (i3 == 0) {
                    break;
                }
                if (i3 == 0) {
                    throw new NoSuchElementException("IntList is empty.");
                }
                if (tg0Var.f6000a[0] < i) {
                    break;
                }
                g60.m1221t(tg0Var);
            }
        }
        boolean zM5375I = m5375I(i, this.f7770t - i);
        m5376J(iM5394g, this.f7759i - iM5394g, i - 1);
        this.f7770t = i;
        this.f7759i = i2;
        this.f7765o -= iM5378L;
        return zM5375I;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: I */
    public final boolean m5375I(int i, int i2) {
        if (i2 > 0) {
            ArrayList arrayList = this.f7754d;
            m5368B(i);
            if (!arrayList.isEmpty()) {
                HashMap map = this.f7755e;
                int i3 = i + i2;
                int iM5199a = y11.m5199a(this.f7754d, i3, m5401o() - this.f7758h);
                if (iM5199a >= this.f7754d.size()) {
                    iM5199a--;
                }
                int i4 = iM5199a + 1;
                int i5 = 0;
                while (iM5199a >= 0) {
                    C0788u2 c0788u2 = (C0788u2) this.f7754d.get(iM5199a);
                    int iM5390c = m5390c(c0788u2);
                    if (iM5390c < i) {
                        break;
                    }
                    if (iM5390c < i3) {
                        c0788u2.f6110a = Integer.MIN_VALUE;
                        if (map != null) {
                        }
                        if (i5 == 0) {
                            i5 = iM5199a + 1;
                        }
                        i4 = iM5199a;
                    }
                    iM5199a--;
                }
                z = i4 < i5;
                if (z) {
                    this.f7754d.subList(i4, i5).clear();
                }
            }
            this.f7757g = i;
            this.f7758h += i2;
            int i6 = this.f7763m;
            if (i6 > i) {
                this.f7763m = Math.max(i, i6 - i2);
            }
            int i7 = this.f7771u;
            if (i7 >= this.f7757g) {
                this.f7771u = i7 - i2;
            }
            int i8 = this.f7772v;
            if (i8 >= 0 && (this.f7752b[(m5404r(i8) * 5) + 1] & 67108864) != 0) {
                m5386T(i8);
            }
        }
        return z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: J */
    public final void m5376J(int i, int i2, int i3) {
        if (i2 > 0) {
            int i4 = this.f7762l;
            int i5 = i + i2;
            m5369C(i5, i3);
            this.f7761k = i;
            this.f7762l = i4 + i2;
            Arrays.fill(this.f7753c, i, i5, (Object) null);
            int i6 = this.f7760j;
            if (i6 >= i) {
                this.f7760j = i6 - i2;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: K */
    public final Object m5377K(int i, int i2, Object obj) {
        int iM5380N = m5380N(this.f7752b, m5404r(i));
        int iM5394g = m5394g(this.f7752b, m5404r(i + 1));
        int i3 = iM5380N + i2;
        if (i3 < iM5380N || i3 >= iM5394g) {
            AbstractC0653qi.m3252a("Write to an invalid slot index " + i2 + " for group " + i);
        }
        int iM5395h = m5395h(i3);
        Object[] objArr = this.f7753c;
        Object obj2 = objArr[iM5395h];
        objArr[iM5395h] = obj;
        return obj2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: L */
    public final int m5378L() {
        int iM5404r = m5404r(this.f7770t);
        int i = this.f7770t;
        int[] iArr = this.f7752b;
        int i2 = iM5404r * 5;
        int i3 = iArr[i2 + 3] + i;
        this.f7770t = i3;
        this.f7759i = m5394g(iArr, m5404r(i3));
        int i4 = this.f7752b[i2 + 1];
        if ((1073741824 & i4) != 0) {
            return 1;
        }
        return i4 & 67108863;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: M */
    public final void m5379M() {
        int i = this.f7771u;
        this.f7770t = i;
        this.f7759i = m5394g(this.f7752b, m5404r(i));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: N */
    public final int m5380N(int[] iArr, int i) {
        if (i >= m5401o()) {
            return this.f7753c.length - this.f7762l;
        }
        int iM5200b = y11.m5200b(iArr, i);
        return iM5200b < 0 ? (this.f7753c.length - this.f7762l) + iM5200b + 1 : iM5200b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: O */
    public final AbstractC0189ey m5381O(int i) {
        C0788u2 c0788u2M5384R;
        HashMap map = this.f7755e;
        if (map == null || (c0788u2M5384R = m5384R(i)) == null) {
            return null;
        }
        return (AbstractC0189ey) map.get(c0788u2M5384R);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: P */
    public final void m5382P() {
        if (this.f7764n != 0) {
            AbstractC0653qi.m3252a("Key must be supplied when inserting");
        }
        C0675r3 c0675r3 = C0320ii.f2572a;
        m5383Q(0, c0675r3, c0675r3, false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: java.lang.Object[] */
    /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: java.lang.Object[] */
    /* JADX DEBUG: Multi-variable search result rejected for r1v4, resolved type: java.lang.Object[] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Q */
    public final void m5383Q(int i, Object obj, Object obj2, boolean z) {
        int i2;
        int i3 = this.f7772v;
        Object[] objArr = this.f7764n > 0;
        this.f7768r.m771c(this.f7765o);
        C0675r3 c0675r3 = C0320ii.f2572a;
        if (objArr == true) {
            int i4 = this.f7770t;
            int iM5394g = m5394g(this.f7752b, m5404r(i4));
            m5409w(1);
            this.f7759i = iM5394g;
            this.f7760j = iM5394g;
            int iM5404r = m5404r(i4);
            int i5 = obj != c0675r3 ? 1 : 0;
            int i6 = (z || obj2 == c0675r3) ? 0 : 1;
            int iM5365i = m5365i(iM5394g, this.f7761k, this.f7762l, this.f7753c.length);
            if (iM5365i >= 0 && this.f7763m < i4) {
                iM5365i = -(((this.f7753c.length - this.f7762l) - iM5365i) + 1);
            }
            int[] iArr = this.f7752b;
            int i7 = this.f7772v;
            int i8 = iM5404r * 5;
            iArr[i8] = i;
            iArr[i8 + 1] = ((z ? 1 : 0) << 30) | (i5 << 29) | (i6 << 28);
            iArr[i8 + 2] = i7;
            iArr[i8 + 3] = 0;
            iArr[i8 + 4] = iM5365i;
            int i9 = (z ? 1 : 0) + i5 + i6;
            if (i9 > 0) {
                m5410x(i9, i4);
                Object[] objArr2 = this.f7753c;
                int i10 = this.f7759i;
                if (z) {
                    objArr2[i10] = obj2;
                    i10++;
                }
                if (i5 != 0) {
                    objArr2[i10] = obj;
                    i10++;
                }
                if (i6 != 0) {
                    objArr2[i10] = obj2;
                    i10++;
                }
                this.f7759i = i10;
            }
            this.f7765o = 0;
            i2 = i4 + 1;
            this.f7772v = i4;
            this.f7770t = i2;
            if (i3 >= 0) {
                m5381O(i3);
            }
        } else {
            this.f7766p.m771c(i3);
            this.f7767q.m771c((m5401o() - this.f7758h) - this.f7771u);
            int i11 = this.f7770t;
            int iM5404r2 = m5404r(i11);
            if (!p30.m3002l(obj2, c0675r3)) {
                if (z) {
                    m5387U(this.f7770t, obj2);
                } else {
                    m5385S(obj2);
                }
            }
            this.f7759i = m5380N(this.f7752b, iM5404r2);
            this.f7760j = m5394g(this.f7752b, m5404r(this.f7770t + 1));
            int[] iArr2 = this.f7752b;
            int i12 = iM5404r2 * 5;
            this.f7765o = iArr2[i12 + 1] & 67108863;
            this.f7772v = i11;
            this.f7770t = i11 + 1;
            i2 = i11 + iArr2[i12 + 3];
        }
        this.f7771u = i2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: R */
    public final C0788u2 m5384R(int i) {
        ArrayList arrayList;
        int iM5202d;
        if (i < 0 || i >= m5402p() || (iM5202d = y11.m5202d((arrayList = this.f7754d), i, m5402p())) < 0) {
            return null;
        }
        return (C0788u2) arrayList.get(iM5202d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: S */
    public final void m5385S(Object obj) {
        int iM5404r = m5404r(this.f7770t);
        int i = (iM5404r * 5) + 1;
        if ((this.f7752b[i] & 268435456) == 0) {
            AbstractC0653qi.m3252a("Updating the data of a group that was not created with a data slot");
        }
        Object[] objArr = this.f7753c;
        int[] iArr = this.f7752b;
        objArr[m5395h(Integer.bitCount(iArr[i] >> 29) + m5394g(iArr, iM5404r))] = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: T */
    public final void m5386T(int i) {
        if (i >= 0) {
            tg0 tg0Var = this.f7774x;
            if (tg0Var == null) {
                tg0Var = new tg0();
                this.f7774x = tg0Var;
            }
            g60.m1206e(tg0Var, i);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: U */
    public final void m5387U(int i, Object obj) {
        int iM5404r = m5404r(i);
        int[] iArr = this.f7752b;
        if (iM5404r >= iArr.length || (iArr[(iM5404r * 5) + 1] & 1073741824) == 0) {
            AbstractC0653qi.m3252a("Updating the node of a group at " + i + " that was not created with as a node group");
        }
        this.f7753c[m5395h(m5394g(this.f7752b, iM5404r))] = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m5388a(int i) {
        if (i < 0) {
            AbstractC0653qi.m3252a("Cannot seek backwards");
        }
        if (this.f7764n > 0) {
            wr0.m5025b("Cannot call seek() while inserting");
        }
        if (i == 0) {
            return;
        }
        int i2 = this.f7770t + i;
        if (i2 < this.f7772v || i2 > this.f7771u) {
            AbstractC0653qi.m3252a("Cannot seek outside the current group (" + this.f7772v + '-' + this.f7771u + ')');
        }
        this.f7770t = i2;
        int iM5394g = m5394g(this.f7752b, m5404r(i2));
        this.f7759i = iM5394g;
        this.f7760j = iM5394g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final C0788u2 m5389b(int i) {
        ArrayList arrayList = this.f7754d;
        int iM5202d = y11.m5202d(arrayList, i, m5402p());
        if (iM5202d >= 0) {
            return (C0788u2) arrayList.get(iM5202d);
        }
        if (i > this.f7757g) {
            i = -(m5402p() - i);
        }
        C0788u2 c0788u2 = new C0788u2(i);
        arrayList.add(-(iM5202d + 1), c0788u2);
        return c0788u2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final int m5390c(C0788u2 c0788u2) {
        int i = c0788u2.f6110a;
        return i < 0 ? m5402p() + i : i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final void m5391d() {
        int i = this.f7764n;
        this.f7764n = i + 1;
        if (i == 0) {
            this.f7767q.m771c((m5401o() - this.f7758h) - this.f7771u);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final void m5392e(boolean z) {
        this.f7773w = true;
        if (z && this.f7766p.f1283b == 0) {
            m5368B(m5402p());
            m5369C(this.f7753c.length - this.f7762l, this.f7757g);
            int i = this.f7761k;
            Arrays.fill(this.f7753c, i, this.f7762l + i, (Object) null);
            m5373G();
        }
        int[] iArr = this.f7752b;
        int i2 = this.f7757g;
        Object[] objArr = this.f7753c;
        int i3 = this.f7761k;
        ArrayList arrayList = this.f7754d;
        HashMap map = this.f7755e;
        ug0 ug0Var = this.f7756f;
        w11 w11Var = this.f7751a;
        if (!w11Var.f6899j) {
            wr0.m5024a("Unexpected writer close()");
        }
        w11Var.f6899j = false;
        w11Var.f6893d = iArr;
        w11Var.f6894e = i2;
        w11Var.f6895f = objArr;
        w11Var.f6896g = i3;
        w11Var.f6901l = arrayList;
        w11Var.f6902m = map;
        w11Var.f6903n = ug0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final int m5393f(int i) {
        return m5394g(this.f7752b, m5404r(i));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final int m5394g(int[] iArr, int i) {
        if (i >= m5401o()) {
            return this.f7753c.length - this.f7762l;
        }
        int i2 = iArr[(i * 5) + 4];
        return i2 < 0 ? (this.f7753c.length - this.f7762l) + i2 + 1 : i2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public final int m5395h(int i) {
        return (this.f7762l * (i < this.f7761k ? 0 : 1)) + i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public final void m5396j() {
        dh0 dh0Var;
        boolean z = this.f7764n > 0;
        int i = this.f7770t;
        int i2 = this.f7771u;
        int i3 = this.f7772v;
        int iM5404r = m5404r(i3);
        int i4 = this.f7765o;
        int i5 = i - i3;
        int i6 = iM5404r * 5;
        int i7 = i6 + 1;
        boolean z2 = (this.f7752b[i7] & 1073741824) != 0;
        e30 e30Var = this.f7768r;
        if (z) {
            ug0 ug0Var = this.f7769s;
            if (ug0Var != null && (dh0Var = (dh0) ug0Var.m4248b(i3)) != null) {
                Object[] objArr = dh0Var.f1108a;
                int i8 = dh0Var.f1109b;
                for (int i9 = 0; i9 < i8; i9++) {
                    m5372F(objArr[i9]);
                }
            }
            int[] iArr = this.f7752b;
            iArr[i6 + 3] = i5;
            y11.m5201c(iArr, iM5404r, i4);
            int iM770b = e30Var.m770b();
            if (z2) {
                i4 = 1;
            }
            this.f7765o = iM770b + i4;
            int iM5371E = m5371E(this.f7752b, i3);
            this.f7772v = iM5371E;
            int iM5402p = iM5371E < 0 ? m5402p() : m5404r(iM5371E + 1);
            int iM5394g = iM5402p >= 0 ? m5394g(this.f7752b, iM5402p) : 0;
            this.f7759i = iM5394g;
            this.f7760j = iM5394g;
            return;
        }
        if (i != i2) {
            AbstractC0653qi.m3252a("Expected to be at the end of a group");
        }
        int[] iArr2 = this.f7752b;
        int i10 = i6 + 3;
        int i11 = iArr2[i10];
        int i12 = iArr2[i7] & 67108863;
        iArr2[i10] = i5;
        y11.m5201c(iArr2, iM5404r, i4);
        int iM770b2 = this.f7766p.m770b();
        this.f7771u = (m5401o() - this.f7758h) - this.f7767q.m770b();
        this.f7772v = iM770b2;
        int iM5371E2 = m5371E(this.f7752b, i3);
        int iM770b3 = e30Var.m770b();
        this.f7765o = iM770b3;
        if (iM5371E2 == iM770b2) {
            this.f7765o = iM770b3 + (z2 ? 0 : i4 - i12);
            return;
        }
        int i13 = i5 - i11;
        int i14 = z2 ? 0 : i4 - i12;
        if (i13 != 0 || i14 != 0) {
            while (iM5371E2 != 0 && iM5371E2 != iM770b2 && (i14 != 0 || i13 != 0)) {
                int iM5404r2 = m5404r(iM5371E2);
                if (i13 != 0) {
                    int[] iArr3 = this.f7752b;
                    int i15 = (iM5404r2 * 5) + 3;
                    iArr3[i15] = iArr3[i15] + i13;
                }
                if (i14 != 0) {
                    int[] iArr4 = this.f7752b;
                    y11.m5201c(iArr4, iM5404r2, (iArr4[(iM5404r2 * 5) + 1] & 67108863) + i14);
                }
                int[] iArr5 = this.f7752b;
                if ((iArr5[(iM5404r2 * 5) + 1] & 1073741824) != 0) {
                    i14 = 0;
                }
                iM5371E2 = m5371E(iArr5, iM5371E2);
            }
        }
        this.f7765o += i14;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public final void m5397k() {
        if (this.f7764n <= 0) {
            wr0.m5025b("Unbalanced begin/end insert");
        }
        int i = this.f7764n - 1;
        this.f7764n = i;
        if (i == 0) {
            if (this.f7768r.f1283b != this.f7766p.f1283b) {
                AbstractC0653qi.m3252a("startGroup/endGroup mismatch while inserting");
            }
            this.f7771u = (m5401o() - this.f7758h) - this.f7767q.m770b();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public final void m5398l(int i) {
        boolean z = false;
        if (!(this.f7764n <= 0)) {
            AbstractC0653qi.m3252a("Cannot call ensureStarted() while inserting");
        }
        int i2 = this.f7772v;
        if (i2 != i) {
            if (i >= i2 && i < this.f7771u) {
                z = true;
            }
            if (!z) {
                AbstractC0653qi.m3252a("Started group at " + i + " must be a subgroup of the group at " + i2);
            }
            int i3 = this.f7770t;
            int i4 = this.f7759i;
            int i5 = this.f7760j;
            this.f7770t = i;
            m5382P();
            this.f7770t = i3;
            this.f7759i = i4;
            this.f7760j = i5;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public final void m5399m(int i, int i2, int i3) {
        if (i >= this.f7757g) {
            i = -((m5402p() - i) + 2);
        }
        while (i3 < i2) {
            this.f7752b[(m5404r(i3) * 5) + 2] = i;
            int i4 = this.f7752b[(m5404r(i3) * 5) + 3] + i3;
            m5399m(i3, i4, i3 + 1);
            i3 = i4;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0117, code lost:
    
        p000.C0921xc.m5125f("Index must be between 0 and size");
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x011c, code lost:
    
        return;
     */
    /* JADX INFO: renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m5400n(int i, InterfaceC0904ww interfaceC0904ww) {
        int i2;
        int i3;
        int i4;
        int i5;
        InterfaceC0904ww interfaceC0904ww2 = interfaceC0904ww;
        int iM5371E = m5371E(this.f7752b, i);
        int iM5402p = m5402p();
        int iM5407u = m5407u(i) + i;
        vg0 vg0Var = null;
        int i6 = i;
        tg0 tg0Var = null;
        loop0: while (i6 < iM5407u) {
            int iM5393f = m5393f(i6);
            int i7 = i6 + 1;
            int iM5393f2 = m5393f(i7);
            while (iM5393f < iM5393f2) {
                Object obj = this.f7753c[m5395h(iM5393f)];
                if (!(obj instanceof ku0) || (i5 = ((ku0) obj).f3271b) < 0) {
                    i4 = iM5371E;
                    interfaceC0904ww2.invoke(Integer.valueOf(iM5393f), obj);
                } else {
                    int iM5407u2 = m5407u(i6) + i6;
                    int i8 = i7;
                    int i9 = 0;
                    while (i8 < iM5407u2 && i9 < i5) {
                        int iM5404r = m5404r(i8);
                        int i10 = iM5371E;
                        int[] iArr = this.f7752b;
                        int i11 = iM5404r * 5;
                        i8 = iArr[i11 + 3] + i8;
                        if (i8 < iM5407u2 && (iArr[i11 + 1] & 536870912) == 0) {
                            i9++;
                        }
                        iM5371E = i10;
                    }
                    i4 = iM5371E;
                    if (vg0Var == null) {
                        int[] iArr2 = c30.f649a;
                        vg0Var = new vg0();
                    }
                    if (tg0Var == null) {
                        tg0Var = new tg0();
                    }
                    vg0Var.m4744a(i8);
                    tg0Var.m4198a(i8);
                    tg0Var.m4198a(iM5393f);
                }
                iM5393f++;
                iM5371E = i4;
            }
            int i12 = iM5371E;
            iM5371E = i7 < iM5402p ? m5371E(this.f7752b, i7) : -1;
            if (iM5371E != i6) {
                int i13 = i6;
                int iM5371E2 = i12;
                while (true) {
                    if (tg0Var == null || vg0Var == null || !vg0Var.m4748e(i13)) {
                        i2 = iM5402p;
                    } else {
                        int i14 = tg0Var.f6001b;
                        int i15 = i14 / 2;
                        int i16 = 0;
                        int i17 = 0;
                        while (i16 < i15) {
                            int i18 = i16 * 2;
                            int i19 = iM5402p;
                            int iM4199b = tg0Var.m4199b(i18);
                            if (iM4199b == i13) {
                                int iM4199b2 = tg0Var.m4199b(i18 + 1);
                                interfaceC0904ww2.invoke(Integer.valueOf(iM4199b2), this.f7753c[m5395h(iM4199b2)]);
                            } else if (i18 != i17) {
                                int i20 = i17 + 1;
                                tg0Var.m4201d(i17, iM4199b);
                                i17 += 2;
                                tg0Var.m4201d(i20, tg0Var.m4199b(i18 + 1));
                            } else {
                                i17 += 2;
                            }
                            i16++;
                            interfaceC0904ww2 = interfaceC0904ww;
                            iM5402p = i19;
                        }
                        i2 = iM5402p;
                        if (i17 != i14) {
                            if (i17 < 0 || i17 > (i3 = tg0Var.f6001b) || i14 < 0 || i14 > i3) {
                                break loop0;
                            }
                            if (i14 < i17) {
                                C0921xc.m5131l("The end index must be < start index");
                                return;
                            } else if (i14 != i17) {
                                if (i14 < i3) {
                                    int[] iArr3 = tg0Var.f6000a;
                                    AbstractC0201f9.m1055a0(iArr3, iArr3, i17, i14, i3);
                                }
                                tg0Var.f6001b -= i14 - i17;
                            }
                        }
                    }
                    if (i13 == i || iM5371E2 == iM5371E) {
                        break;
                    }
                    i13 = iM5371E2;
                    iM5402p = i2;
                    iM5371E2 = m5371E(this.f7752b, iM5371E2);
                    interfaceC0904ww2 = interfaceC0904ww;
                }
            } else {
                i2 = iM5402p;
            }
            interfaceC0904ww2 = interfaceC0904ww;
            i6 = i7;
            iM5402p = i2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public final int m5401o() {
        return this.f7752b.length / 5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public final int m5402p() {
        return m5401o() - this.f7758h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public final Object m5403q(int i) {
        int iM5404r = m5404r(i);
        int[] iArr = this.f7752b;
        int i2 = (iM5404r * 5) + 1;
        if ((iArr[i2] & 268435456) == 0) {
            return C0320ii.f2572a;
        }
        return this.f7753c[Integer.bitCount(iArr[i2] >> 29) + m5394g(iArr, iM5404r)];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r */
    public final int m5404r(int i) {
        return (this.f7758h * (i < this.f7757g ? 0 : 1)) + i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s */
    public final int m5405s(int i) {
        return this.f7752b[m5404r(i) * 5];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: t */
    public final Object m5406t(int i) {
        int iM5404r = m5404r(i);
        int[] iArr = this.f7752b;
        int i2 = iM5404r * 5;
        int i3 = iArr[i2 + 1];
        if ((536870912 & i3) == 0) {
            return null;
        }
        return this.f7753c[Integer.bitCount(i3 >> 30) + iArr[i2 + 4]];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "SlotWriter(current = " + this.f7770t + " end=" + this.f7771u + " size = " + m5402p() + " gap=" + this.f7757g + '-' + (this.f7757g + this.f7758h) + ')';
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: u */
    public final int m5407u(int i) {
        return this.f7752b[(m5404r(i) * 5) + 3];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: v */
    public final boolean m5408v(int i, int i2) {
        int iM5401o;
        int iM5407u;
        if (i2 == this.f7772v) {
            iM5401o = this.f7771u;
        } else {
            e30 e30Var = this.f7766p;
            if (i2 > e30Var.m769a(0)) {
                iM5407u = m5407u(i2);
            } else {
                int[] iArr = e30Var.f1282a;
                int iMin = Math.min(iArr.length, e30Var.f1283b);
                int i3 = 0;
                while (true) {
                    if (i3 >= iMin) {
                        i3 = -1;
                        break;
                    }
                    if (iArr[i3] == i2) {
                        break;
                    }
                    i3++;
                }
                if (i3 < 0) {
                    iM5407u = m5407u(i2);
                } else {
                    iM5401o = (m5401o() - this.f7758h) - this.f7767q.f1282a[i3];
                }
            }
            iM5401o = iM5407u + i2;
        }
        return i > i2 && i < iM5401o;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: w */
    public final void m5409w(int i) {
        if (i > 0) {
            int i2 = this.f7770t;
            m5368B(i2);
            int i3 = this.f7757g;
            int i4 = this.f7758h;
            int[] iArr = this.f7752b;
            int length = iArr.length / 5;
            int i5 = length - i4;
            if (i4 < i) {
                int iMax = Math.max(Math.max(length * 2, i5 + i), 32);
                int[] iArr2 = new int[iMax * 5];
                int i6 = iMax - i5;
                AbstractC0201f9.m1055a0(iArr, iArr2, 0, 0, i3 * 5);
                AbstractC0201f9.m1055a0(iArr, iArr2, (i3 + i6) * 5, (i4 + i3) * 5, length * 5);
                this.f7752b = iArr2;
                i4 = i6;
            }
            int i7 = this.f7771u;
            if (i7 >= i3) {
                this.f7771u = i7 + i;
            }
            int i8 = i3 + i;
            this.f7757g = i8;
            this.f7758h = i4 - i;
            int iM5365i = m5365i(i5 > 0 ? m5393f(i2 + i) : 0, this.f7763m >= i3 ? this.f7761k : 0, this.f7762l, this.f7753c.length);
            for (int i9 = i3; i9 < i8; i9++) {
                this.f7752b[(i9 * 5) + 4] = iM5365i;
            }
            int i10 = this.f7763m;
            if (i10 >= i3) {
                this.f7763m = i10 + i;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: x */
    public final void m5410x(int i, int i2) {
        if (i > 0) {
            m5369C(this.f7759i, i2);
            int i3 = this.f7761k;
            int i4 = this.f7762l;
            if (i4 < i) {
                Object[] objArr = this.f7753c;
                int length = objArr.length;
                int i5 = length - i4;
                int iMax = Math.max(Math.max(length * 2, i5 + i), 32);
                Object[] objArr2 = new Object[iMax];
                for (int i6 = 0; i6 < iMax; i6++) {
                    objArr2[i6] = null;
                }
                int i7 = iMax - i5;
                int i8 = i4 + i3;
                System.arraycopy(objArr, 0, objArr2, 0, i3);
                System.arraycopy(objArr, i8, objArr2, i3 + i7, length - i8);
                this.f7753c = objArr2;
                i4 = i7;
            }
            int i9 = this.f7760j;
            if (i9 >= i3) {
                this.f7760j = i9 + i;
            }
            this.f7761k = i3 + i;
            this.f7762l = i4 - i;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: y */
    public final boolean m5411y(int i) {
        return (this.f7752b[(m5404r(i) * 5) + 1] & 1073741824) != 0;
    }
}
