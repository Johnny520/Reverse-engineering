package p000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class tr2 {

    /* JADX INFO: renamed from: a */
    public final qr2 f10913a;

    /* JADX INFO: renamed from: b */
    public int[] f10914b;

    /* JADX INFO: renamed from: c */
    public Object[] f10915c;

    /* JADX INFO: renamed from: d */
    public ArrayList f10916d;

    /* JADX INFO: renamed from: e */
    public HashMap f10917e;

    /* JADX INFO: renamed from: f */
    public zj1 f10918f;

    /* JADX INFO: renamed from: g */
    public int f10919g;

    /* JADX INFO: renamed from: h */
    public int f10920h;

    /* JADX INFO: renamed from: i */
    public int f10921i;

    /* JADX INFO: renamed from: j */
    public int f10922j;

    /* JADX INFO: renamed from: k */
    public int f10923k;

    /* JADX INFO: renamed from: l */
    public int f10924l;

    /* JADX INFO: renamed from: m */
    public int f10925m;

    /* JADX INFO: renamed from: n */
    public int f10926n;

    /* JADX INFO: renamed from: o */
    public int f10927o;

    /* JADX INFO: renamed from: p */
    public final i11 f10928p;

    /* JADX INFO: renamed from: q */
    public final i11 f10929q;

    /* JADX INFO: renamed from: r */
    public final i11 f10930r;

    /* JADX INFO: renamed from: s */
    public zj1 f10931s;

    /* JADX INFO: renamed from: t */
    public int f10932t;

    /* JADX INFO: renamed from: u */
    public int f10933u;

    /* JADX INFO: renamed from: v */
    public int f10934v;

    /* JADX INFO: renamed from: w */
    public boolean f10935w;

    /* JADX INFO: renamed from: x */
    public yj1 f10936x;

    public tr2(qr2 qr2Var) {
        this.f10913a = qr2Var;
        int[] iArr = qr2Var.f9132h;
        this.f10914b = iArr;
        Object[] objArr = qr2Var.f9134j;
        this.f10915c = objArr;
        this.f10916d = qr2Var.f9140p;
        this.f10917e = qr2Var.f9141q;
        this.f10918f = qr2Var.f9142r;
        int i = qr2Var.f9133i;
        this.f10919g = i;
        this.f10920h = (iArr.length / 5) - i;
        int i2 = qr2Var.f9135k;
        this.f10923k = i2;
        this.f10924l = objArr.length - i2;
        this.f10925m = i;
        this.f10928p = new i11();
        this.f10929q = new i11();
        this.f10930r = new i11();
        this.f10933u = i;
        this.f10934v = -1;
    }

    /* JADX INFO: renamed from: i */
    public static int m5387i(int i, int i2, int i3, int i4) {
        return i > i2 ? -(((i4 - i3) - i) + 1) : i;
    }

    /* JADX INFO: renamed from: z */
    public static void m5388z(tr2 tr2Var) {
        int i = tr2Var.f10934v;
        int iM5426r = tr2Var.m5426r(i);
        int[] iArr = tr2Var.f10914b;
        int i2 = (iM5426r * 5) + 1;
        int i3 = iArr[i2];
        if ((i3 & 134217728) != 0) {
            return;
        }
        int i4 = (i3 & (-134217729)) | 134217728;
        iArr[i2] = i4;
        if ((67108864 & i4) != 0) {
            return;
        }
        tr2Var.m5408T(tr2Var.m5393E(iArr, i));
    }

    /* JADX INFO: renamed from: A */
    public final void m5389A(qr2 qr2Var, int i) {
        if (this.f10926n <= 0) {
            AbstractC0752tx.m5443a("Check failed");
        }
        if (i == 0 && this.f10932t == 0 && this.f10913a.f9133i == 0) {
            int[] iArr = qr2Var.f9132h;
            int i2 = iArr[(i * 5) + 3];
            int i3 = qr2Var.f9133i;
            if (i2 == i3) {
                int[] iArr2 = this.f10914b;
                Object[] objArr = this.f10915c;
                ArrayList arrayList = this.f10916d;
                HashMap map = this.f10917e;
                zj1 zj1Var = this.f10918f;
                Object[] objArr2 = qr2Var.f9134j;
                int i4 = qr2Var.f9135k;
                HashMap map2 = qr2Var.f9141q;
                zj1 zj1Var2 = qr2Var.f9142r;
                this.f10914b = iArr;
                this.f10915c = objArr2;
                this.f10916d = qr2Var.f9140p;
                this.f10919g = i3;
                this.f10920h = (iArr.length / 5) - i3;
                this.f10923k = i4;
                this.f10924l = objArr2.length - i4;
                this.f10925m = i3;
                this.f10917e = map2;
                this.f10918f = zj1Var2;
                qr2Var.f9132h = iArr2;
                qr2Var.f9133i = 0;
                qr2Var.f9134j = objArr;
                qr2Var.f9135k = 0;
                qr2Var.f9140p = arrayList;
                qr2Var.f9141q = map;
                qr2Var.f9142r = zj1Var;
                return;
            }
        }
        tr2 tr2VarM4275d = qr2Var.m4275d();
        try {
            AbstractC0691se.m4827P(tr2VarM4275d, i, this, true, true, false);
            tr2VarM4275d.m5414e(true);
        } catch (Throwable th) {
            tr2VarM4275d.m5414e(false);
            throw th;
        }
    }

    /* JADX INFO: renamed from: B */
    public final void m5390B(int i) {
        ao0 ao0Var;
        int i2;
        ao0 ao0Var2;
        int i3;
        int i4;
        int i5 = this.f10920h;
        int i6 = this.f10919g;
        if (i6 != i) {
            if (!this.f10916d.isEmpty()) {
                int iM5423o = m5423o() - this.f10920h;
                ArrayList arrayList = this.f10916d;
                if (i6 < i) {
                    for (int iM4989a = sr2.m4989a(arrayList, i6, iM5423o); iM4989a < this.f10916d.size() && (i3 = (ao0Var2 = (ao0) this.f10916d.get(iM4989a)).f313a) < 0 && (i4 = i3 + iM5423o) < i; iM4989a++) {
                        ao0Var2.f313a = i4;
                    }
                } else {
                    for (int iM4989a2 = sr2.m4989a(arrayList, i, iM5423o); iM4989a2 < this.f10916d.size() && (i2 = (ao0Var = (ao0) this.f10916d.get(iM4989a2)).f313a) >= 0; iM4989a2++) {
                        ao0Var.f313a = -(iM5423o - i2);
                    }
                }
            }
            if (i5 > 0) {
                int[] iArr = this.f10914b;
                int i7 = i * 5;
                int i8 = i5 * 5;
                int i9 = i6 * 5;
                if (i < i6) {
                    AbstractC0460mg.m3086a0(iArr, iArr, i8 + i7, i7, i9);
                } else {
                    AbstractC0460mg.m3086a0(iArr, iArr, i9, i9 + i8, i7 + i8);
                }
            }
            if (i < i6) {
                i6 = i + i5;
            }
            int iM5423o2 = m5423o();
            if (i6 >= iM5423o2) {
                AbstractC0752tx.m5443a("Check failed");
            }
            while (i6 < iM5423o2) {
                int i10 = (i6 * 5) + 2;
                int i11 = this.f10914b[i10];
                int iM5424p = i11 > -2 ? i11 : (m5424p() + i11) - (-2);
                if (iM5424p >= i) {
                    iM5424p = -((m5424p() - iM5424p) - (-2));
                }
                if (iM5424p != i11) {
                    this.f10914b[i10] = iM5424p;
                }
                i6++;
                if (i6 == i) {
                    i6 += i5;
                }
            }
        }
        this.f10919g = i;
    }

    /* JADX INFO: renamed from: C */
    public final void m5391C(int i, int i2) {
        int i3 = this.f10924l;
        int i4 = this.f10923k;
        int i5 = this.f10925m;
        if (i4 != i) {
            Object[] objArr = this.f10915c;
            if (i < i4) {
                System.arraycopy(objArr, i, objArr, i + i3, i4 - i);
            } else {
                int i6 = i4 + i3;
                System.arraycopy(objArr, i6, objArr, i4, (i + i3) - i6);
            }
        }
        int iMin = Math.min(i2 + 1, m5424p());
        if (i5 != iMin) {
            int length = this.f10915c.length - i3;
            if (iMin < i5) {
                int iM5426r = m5426r(iMin);
                int iM5426r2 = m5426r(i5);
                int i7 = this.f10919g;
                while (iM5426r < iM5426r2) {
                    int i8 = (iM5426r * 5) + 4;
                    int i9 = this.f10914b[i8];
                    if (i9 < 0) {
                        AbstractC0752tx.m5443a("Unexpected anchor value, expected a positive anchor");
                    }
                    this.f10914b[i8] = -((length - i9) + 1);
                    iM5426r++;
                    if (iM5426r == i7) {
                        iM5426r += this.f10920h;
                    }
                }
            } else {
                int iM5426r3 = m5426r(i5);
                int iM5426r4 = m5426r(iMin);
                while (iM5426r3 < iM5426r4) {
                    int i10 = (iM5426r3 * 5) + 4;
                    int i11 = this.f10914b[i10];
                    if (i11 >= 0) {
                        AbstractC0752tx.m5443a("Unexpected anchor value, expected a negative anchor");
                    }
                    this.f10914b[i10] = i11 + length + 1;
                    iM5426r3++;
                    if (iM5426r3 == this.f10919g) {
                        iM5426r3 += this.f10920h;
                    }
                }
            }
            this.f10925m = iMin;
        }
        this.f10923k = i;
    }

    /* JADX INFO: renamed from: D */
    public final Object m5392D(int i) {
        int iM5426r = m5426r(i);
        int[] iArr = this.f10914b;
        if ((iArr[(iM5426r * 5) + 1] & 1073741824) != 0) {
            return this.f10915c[m5417h(m5416g(iArr, iM5426r))];
        }
        return null;
    }

    /* JADX INFO: renamed from: E */
    public final int m5393E(int[] iArr, int i) {
        int i2 = iArr[(m5426r(i) * 5) + 2];
        return i2 > -2 ? i2 : (m5424p() + i2) - (-2);
    }

    /* JADX INFO: renamed from: F */
    public final Object m5394F(Object obj) {
        if (this.f10926n > 0) {
            m5432x(1, this.f10934v);
        }
        Object[] objArr = this.f10915c;
        int i = this.f10921i;
        this.f10921i = i + 1;
        Object obj2 = objArr[m5417h(i)];
        if (this.f10921i > this.f10922j) {
            AbstractC0752tx.m5443a("Writing to an invalid slot");
        }
        this.f10915c[m5417h(this.f10921i - 1)] = obj;
        return obj2;
    }

    /* JADX INFO: renamed from: G */
    public final void m5395G() {
        int i;
        yj1 yj1Var = this.f10936x;
        if (yj1Var != null) {
            while (yj1Var.f13491b != 0) {
                int iM4828Q = AbstractC0691se.m4828Q(yj1Var);
                int iM5426r = m5426r(iM4828Q);
                int iM5429u = iM4828Q + 1;
                int iM5429u2 = m5429u(iM4828Q) + iM4828Q;
                while (true) {
                    if (iM5429u >= iM5429u2) {
                        i = 0;
                        break;
                    } else {
                        if ((this.f10914b[(m5426r(iM5429u) * 5) + 1] & 201326592) != 0) {
                            i = 1;
                            break;
                        }
                        iM5429u += m5429u(iM5429u);
                    }
                }
                int[] iArr = this.f10914b;
                int i2 = (iM5426r * 5) + 1;
                int i3 = iArr[i2];
                if (((67108864 & i3) != 0 ? 1 : 0) != i) {
                    iArr[i2] = (i << 26) | ((-67108865) & i3);
                    int iM5393E = m5393E(iArr, iM4828Q);
                    if (iM5393E >= 0) {
                        AbstractC0691se.m4853x(yj1Var, iM5393E);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: H */
    public final boolean m5396H() {
        if (this.f10926n != 0) {
            AbstractC0752tx.m5443a("Cannot remove group while inserting");
        }
        int i = this.f10932t;
        int i2 = this.f10921i;
        int iM5416g = m5416g(this.f10914b, m5426r(i));
        int iM5400L = m5400L();
        m5403O(this.f10934v);
        yj1 yj1Var = this.f10936x;
        if (yj1Var != null) {
            while (true) {
                int i3 = yj1Var.f13491b;
                if (i3 == 0) {
                    break;
                }
                if (i3 == 0) {
                    um2.m5519i("IntList is empty.");
                    return false;
                }
                if (yj1Var.f13490a[0] < i) {
                    break;
                }
                AbstractC0691se.m4828Q(yj1Var);
            }
        }
        boolean zM5397I = m5397I(i, this.f10932t - i);
        m5398J(iM5416g, this.f10921i - iM5416g, i - 1);
        this.f10932t = i;
        this.f10921i = i2;
        this.f10927o -= iM5400L;
        return zM5397I;
    }

    /* JADX INFO: renamed from: I */
    public final boolean m5397I(int i, int i2) {
        if (i2 > 0) {
            ArrayList arrayList = this.f10916d;
            m5390B(i);
            if (!arrayList.isEmpty()) {
                HashMap map = this.f10917e;
                int i3 = i + i2;
                int iM4989a = sr2.m4989a(this.f10916d, i3, m5423o() - this.f10920h);
                if (iM4989a >= this.f10916d.size()) {
                    iM4989a--;
                }
                int i4 = iM4989a + 1;
                int i5 = 0;
                while (iM4989a >= 0) {
                    ao0 ao0Var = (ao0) this.f10916d.get(iM4989a);
                    int iM5412c = m5412c(ao0Var);
                    if (iM5412c < i) {
                        break;
                    }
                    if (iM5412c < i3) {
                        ao0Var.f313a = Integer.MIN_VALUE;
                        if (map != null) {
                        }
                        if (i5 == 0) {
                            i5 = iM4989a + 1;
                        }
                        i4 = iM4989a;
                    }
                    iM4989a--;
                }
                z = i4 < i5;
                if (z) {
                    this.f10916d.subList(i4, i5).clear();
                }
            }
            this.f10919g = i;
            this.f10920h += i2;
            int i6 = this.f10925m;
            if (i6 > i) {
                this.f10925m = Math.max(i, i6 - i2);
            }
            int i7 = this.f10933u;
            if (i7 >= this.f10919g) {
                this.f10933u = i7 - i2;
            }
            int i8 = this.f10934v;
            if (i8 >= 0 && (this.f10914b[(m5426r(i8) * 5) + 1] & 67108864) != 0) {
                m5408T(i8);
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: J */
    public final void m5398J(int i, int i2, int i3) {
        if (i2 > 0) {
            int i4 = this.f10924l;
            int i5 = i + i2;
            m5391C(i5, i3);
            this.f10923k = i;
            this.f10924l = i4 + i2;
            Arrays.fill(this.f10915c, i, i5, (Object) null);
            int i6 = this.f10922j;
            if (i6 >= i) {
                this.f10922j = i6 - i2;
            }
        }
    }

    /* JADX INFO: renamed from: K */
    public final Object m5399K(int i, int i2, Object obj) {
        int iM5402N = m5402N(this.f10914b, m5426r(i));
        int iM5416g = m5416g(this.f10914b, m5426r(i + 1));
        int i3 = iM5402N + i2;
        if (i3 < iM5402N || i3 >= iM5416g) {
            AbstractC0752tx.m5443a("Write to an invalid slot index " + i2 + " for group " + i);
        }
        int iM5417h = m5417h(i3);
        Object[] objArr = this.f10915c;
        Object obj2 = objArr[iM5417h];
        objArr[iM5417h] = obj;
        return obj2;
    }

    /* JADX INFO: renamed from: L */
    public final int m5400L() {
        int iM5426r = m5426r(this.f10932t);
        int i = this.f10932t;
        int[] iArr = this.f10914b;
        int i2 = iM5426r * 5;
        int i3 = iArr[i2 + 3] + i;
        this.f10932t = i3;
        this.f10921i = m5416g(iArr, m5426r(i3));
        int i4 = this.f10914b[i2 + 1];
        if ((1073741824 & i4) != 0) {
            return 1;
        }
        return i4 & 67108863;
    }

    /* JADX INFO: renamed from: M */
    public final void m5401M() {
        int i = this.f10933u;
        this.f10932t = i;
        this.f10921i = m5416g(this.f10914b, m5426r(i));
    }

    /* JADX INFO: renamed from: N */
    public final int m5402N(int[] iArr, int i) {
        if (i >= m5423o()) {
            return this.f10915c.length - this.f10924l;
        }
        int iM4990b = sr2.m4990b(iArr, i);
        return iM4990b < 0 ? (this.f10915c.length - this.f10924l) + iM4990b + 1 : iM4990b;
    }

    /* JADX INFO: renamed from: O */
    public final io0 m5403O(int i) {
        ao0 ao0VarM5406R;
        HashMap map = this.f10917e;
        if (map == null || (ao0VarM5406R = m5406R(i)) == null) {
            return null;
        }
        return (io0) map.get(ao0VarM5406R);
    }

    /* JADX INFO: renamed from: P */
    public final void m5404P() {
        if (this.f10926n != 0) {
            AbstractC0752tx.m5443a("Key must be supplied when inserting");
        }
        C0160eb c0160eb = C0520nx.f7360a;
        m5405Q(0, c0160eb, c0160eb, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Q */
    public final void m5405Q(int i, Object obj, Object obj2, boolean z) {
        int i2;
        int i3 = this.f10934v;
        Object[] objArr = this.f10926n > 0;
        this.f10930r.m2243c(this.f10927o);
        C0160eb c0160eb = C0520nx.f7360a;
        if (objArr == true) {
            int i4 = this.f10932t;
            int iM5416g = m5416g(this.f10914b, m5426r(i4));
            m5431w(1);
            this.f10921i = iM5416g;
            this.f10922j = iM5416g;
            int iM5426r = m5426r(i4);
            int i5 = obj != c0160eb ? 1 : 0;
            int i6 = (z || obj2 == c0160eb) ? 0 : 1;
            int iM5387i = m5387i(iM5416g, this.f10923k, this.f10924l, this.f10915c.length);
            if (iM5387i >= 0 && this.f10925m < i4) {
                iM5387i = -(((this.f10915c.length - this.f10924l) - iM5387i) + 1);
            }
            int[] iArr = this.f10914b;
            int i7 = this.f10934v;
            int i8 = iM5426r * 5;
            iArr[i8] = i;
            iArr[i8 + 1] = ((z ? 1 : 0) << 30) | (i5 << 29) | (i6 << 28);
            iArr[i8 + 2] = i7;
            iArr[i8 + 3] = 0;
            iArr[i8 + 4] = iM5387i;
            int i9 = (z ? 1 : 0) + i5 + i6;
            if (i9 > 0) {
                m5432x(i9, i4);
                Object[] objArr2 = this.f10915c;
                int i10 = this.f10921i;
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
                this.f10921i = i10;
            }
            this.f10927o = 0;
            i2 = i4 + 1;
            this.f10934v = i4;
            this.f10932t = i2;
            if (i3 >= 0) {
                m5403O(i3);
            }
        } else {
            this.f10928p.m2243c(i3);
            this.f10929q.m2243c((m5423o() - this.f10920h) - this.f10933u);
            int i11 = this.f10932t;
            int iM5426r2 = m5426r(i11);
            if (!t11.m5086l(obj2, c0160eb)) {
                if (z) {
                    m5409U(this.f10932t, obj2);
                } else {
                    m5407S(obj2);
                }
            }
            this.f10921i = m5402N(this.f10914b, iM5426r2);
            this.f10922j = m5416g(this.f10914b, m5426r(this.f10932t + 1));
            int[] iArr2 = this.f10914b;
            int i12 = iM5426r2 * 5;
            this.f10927o = iArr2[i12 + 1] & 67108863;
            this.f10934v = i11;
            this.f10932t = i11 + 1;
            i2 = i11 + iArr2[i12 + 3];
        }
        this.f10933u = i2;
    }

    /* JADX INFO: renamed from: R */
    public final ao0 m5406R(int i) {
        ArrayList arrayList;
        int iM4993e;
        if (i < 0 || i >= m5424p() || (iM4993e = sr2.m4993e((arrayList = this.f10916d), i, m5424p())) < 0) {
            return null;
        }
        return (ao0) arrayList.get(iM4993e);
    }

    /* JADX INFO: renamed from: S */
    public final void m5407S(Object obj) {
        int iM5426r = m5426r(this.f10932t);
        int i = (iM5426r * 5) + 1;
        if ((this.f10914b[i] & 268435456) == 0) {
            AbstractC0752tx.m5443a("Updating the data of a group that was not created with a data slot");
        }
        Object[] objArr = this.f10915c;
        int[] iArr = this.f10914b;
        objArr[m5417h(Integer.bitCount(iArr[i] >> 29) + m5416g(iArr, iM5426r))] = obj;
    }

    /* JADX INFO: renamed from: T */
    public final void m5408T(int i) {
        if (i >= 0) {
            yj1 yj1Var = this.f10936x;
            if (yj1Var == null) {
                yj1Var = new yj1();
                this.f10936x = yj1Var;
            }
            AbstractC0691se.m4853x(yj1Var, i);
        }
    }

    /* JADX INFO: renamed from: U */
    public final void m5409U(int i, Object obj) {
        int iM5426r = m5426r(i);
        int[] iArr = this.f10914b;
        if (iM5426r >= iArr.length || (iArr[(iM5426r * 5) + 1] & 1073741824) == 0) {
            AbstractC0752tx.m5443a("Updating the node of a group at " + i + " that was not created with as a node group");
        }
        this.f10915c[m5417h(m5416g(this.f10914b, iM5426r))] = obj;
    }

    /* JADX INFO: renamed from: a */
    public final void m5410a(int i) {
        if (i < 0) {
            AbstractC0752tx.m5443a("Cannot seek backwards");
        }
        if (this.f10926n > 0) {
            j22.m2430b("Cannot call seek() while inserting");
        }
        if (i == 0) {
            return;
        }
        int i2 = this.f10932t + i;
        if (i2 < this.f10934v || i2 > this.f10933u) {
            AbstractC0752tx.m5443a("Cannot seek outside the current group (" + this.f10934v + '-' + this.f10933u + ')');
        }
        this.f10932t = i2;
        int iM5416g = m5416g(this.f10914b, m5426r(i2));
        this.f10921i = iM5416g;
        this.f10922j = iM5416g;
    }

    /* JADX INFO: renamed from: b */
    public final ao0 m5411b(int i) {
        ArrayList arrayList = this.f10916d;
        int iM4993e = sr2.m4993e(arrayList, i, m5424p());
        if (iM4993e >= 0) {
            return (ao0) arrayList.get(iM4993e);
        }
        if (i > this.f10919g) {
            i = -(m5424p() - i);
        }
        ao0 ao0Var = new ao0(i);
        arrayList.add(-(iM4993e + 1), ao0Var);
        return ao0Var;
    }

    /* JADX INFO: renamed from: c */
    public final int m5412c(ao0 ao0Var) {
        int i = ao0Var.f313a;
        return i < 0 ? m5424p() + i : i;
    }

    /* JADX INFO: renamed from: d */
    public final void m5413d() {
        int i = this.f10926n;
        this.f10926n = i + 1;
        if (i == 0) {
            this.f10929q.m2243c((m5423o() - this.f10920h) - this.f10933u);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m5414e(boolean z) {
        this.f10935w = true;
        if (z && this.f10928p.f4215b == 0) {
            m5390B(m5424p());
            m5391C(this.f10915c.length - this.f10924l, this.f10919g);
            int i = this.f10923k;
            Arrays.fill(this.f10915c, i, this.f10924l + i, (Object) null);
            m5395G();
        }
        int[] iArr = this.f10914b;
        int i2 = this.f10919g;
        Object[] objArr = this.f10915c;
        int i3 = this.f10923k;
        ArrayList arrayList = this.f10916d;
        HashMap map = this.f10917e;
        zj1 zj1Var = this.f10918f;
        qr2 qr2Var = this.f10913a;
        if (!qr2Var.f9138n) {
            j22.m2429a("Unexpected writer close()");
        }
        qr2Var.f9138n = false;
        qr2Var.f9132h = iArr;
        qr2Var.f9133i = i2;
        qr2Var.f9134j = objArr;
        qr2Var.f9135k = i3;
        qr2Var.f9140p = arrayList;
        qr2Var.f9141q = map;
        qr2Var.f9142r = zj1Var;
    }

    /* JADX INFO: renamed from: f */
    public final int m5415f(int i) {
        return m5416g(this.f10914b, m5426r(i));
    }

    /* JADX INFO: renamed from: g */
    public final int m5416g(int[] iArr, int i) {
        if (i >= m5423o()) {
            return this.f10915c.length - this.f10924l;
        }
        int i2 = iArr[(i * 5) + 4];
        return i2 < 0 ? (this.f10915c.length - this.f10924l) + i2 + 1 : i2;
    }

    /* JADX INFO: renamed from: h */
    public final int m5417h(int i) {
        return (this.f10924l * (i < this.f10923k ? 0 : 1)) + i;
    }

    /* JADX INFO: renamed from: j */
    public final void m5418j() {
        lk1 lk1Var;
        boolean z = this.f10926n > 0;
        int i = this.f10932t;
        int i2 = this.f10933u;
        int i3 = this.f10934v;
        int iM5426r = m5426r(i3);
        int i4 = this.f10927o;
        int i5 = i - i3;
        int i6 = iM5426r * 5;
        int i7 = i6 + 1;
        boolean z2 = (this.f10914b[i7] & 1073741824) != 0;
        i11 i11Var = this.f10930r;
        if (z) {
            zj1 zj1Var = this.f10931s;
            if (zj1Var != null && (lk1Var = (lk1) zj1Var.m6022b(i3)) != null) {
                Object[] objArr = lk1Var.f6163a;
                int i8 = lk1Var.f6164b;
                for (int i9 = 0; i9 < i8; i9++) {
                    m5394F(objArr[i9]);
                }
            }
            int[] iArr = this.f10914b;
            iArr[i6 + 3] = i5;
            sr2.m4991c(iArr, iM5426r, i4);
            int iM2242b = i11Var.m2242b();
            if (z2) {
                i4 = 1;
            }
            this.f10927o = iM2242b + i4;
            int iM5393E = m5393E(this.f10914b, i3);
            this.f10934v = iM5393E;
            int iM5424p = iM5393E < 0 ? m5424p() : m5426r(iM5393E + 1);
            int iM5416g = iM5424p >= 0 ? m5416g(this.f10914b, iM5424p) : 0;
            this.f10921i = iM5416g;
            this.f10922j = iM5416g;
            return;
        }
        if (i != i2) {
            AbstractC0752tx.m5443a("Expected to be at the end of a group");
        }
        int[] iArr2 = this.f10914b;
        int i10 = i6 + 3;
        int i11 = iArr2[i10];
        int i12 = iArr2[i7] & 67108863;
        iArr2[i10] = i5;
        sr2.m4991c(iArr2, iM5426r, i4);
        int iM2242b2 = this.f10928p.m2242b();
        this.f10933u = (m5423o() - this.f10920h) - this.f10929q.m2242b();
        this.f10934v = iM2242b2;
        int iM5393E2 = m5393E(this.f10914b, i3);
        int iM2242b3 = i11Var.m2242b();
        this.f10927o = iM2242b3;
        if (iM5393E2 == iM2242b2) {
            this.f10927o = iM2242b3 + (z2 ? 0 : i4 - i12);
            return;
        }
        int i13 = i5 - i11;
        int i14 = z2 ? 0 : i4 - i12;
        if (i13 != 0 || i14 != 0) {
            while (iM5393E2 != 0 && iM5393E2 != iM2242b2 && (i14 != 0 || i13 != 0)) {
                int iM5426r2 = m5426r(iM5393E2);
                if (i13 != 0) {
                    int[] iArr3 = this.f10914b;
                    int i15 = (iM5426r2 * 5) + 3;
                    iArr3[i15] = iArr3[i15] + i13;
                }
                if (i14 != 0) {
                    int[] iArr4 = this.f10914b;
                    sr2.m4991c(iArr4, iM5426r2, (iArr4[(iM5426r2 * 5) + 1] & 67108863) + i14);
                }
                int[] iArr5 = this.f10914b;
                if ((iArr5[(iM5426r2 * 5) + 1] & 1073741824) != 0) {
                    i14 = 0;
                }
                iM5393E2 = m5393E(iArr5, iM5393E2);
            }
        }
        this.f10927o += i14;
    }

    /* JADX INFO: renamed from: k */
    public final void m5419k() {
        if (this.f10926n <= 0) {
            j22.m2430b("Unbalanced begin/end insert");
        }
        int i = this.f10926n - 1;
        this.f10926n = i;
        if (i == 0) {
            if (this.f10930r.f4215b != this.f10928p.f4215b) {
                AbstractC0752tx.m5443a("startGroup/endGroup mismatch while inserting");
            }
            this.f10933u = (m5423o() - this.f10920h) - this.f10929q.m2242b();
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m5420l(int i) {
        boolean z = false;
        if (!(this.f10926n <= 0)) {
            AbstractC0752tx.m5443a("Cannot call ensureStarted() while inserting");
        }
        int i2 = this.f10934v;
        if (i2 != i) {
            if (i >= i2 && i < this.f10933u) {
                z = true;
            }
            if (!z) {
                AbstractC0752tx.m5443a("Started group at " + i + " must be a subgroup of the group at " + i2);
            }
            int i3 = this.f10932t;
            int i4 = this.f10921i;
            int i5 = this.f10922j;
            this.f10932t = i;
            m5404P();
            this.f10932t = i3;
            this.f10921i = i4;
            this.f10922j = i5;
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m5421m(int i, int i2, int i3) {
        if (i >= this.f10919g) {
            i = -((m5424p() - i) + 2);
        }
        while (i3 < i2) {
            this.f10914b[(m5426r(i3) * 5) + 2] = i;
            int i4 = this.f10914b[(m5426r(i3) * 5) + 3] + i3;
            m5421m(i3, i4, i3 + 1);
            i3 = i4;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x0126, code lost:
    
        p000.C0676s.m4646d("Index must be between 0 and size");
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x012b, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008a  */
    /* JADX INFO: renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m5422n(int i, mn0 mn0Var) {
        int i2;
        int i3;
        int i4;
        mn0 mn0Var2 = mn0Var;
        int iM5393E = m5393E(this.f10914b, i);
        int iM5424p = m5424p();
        int iM5429u = m5429u(i) + i;
        int i5 = i;
        ak1 ak1Var = null;
        yj1 yj1Var = null;
        loop0: while (i5 < iM5429u) {
            int iM5415f = m5415f(i5);
            int i6 = i5 + 1;
            int iM5415f2 = m5415f(i6);
            while (iM5415f < iM5415f2) {
                Object obj = this.f10915c[m5417h(iM5415f)];
                if (obj instanceof lo0) {
                    lo0 lo0Var = (lo0) obj;
                    if (!(lo0Var instanceof lo0)) {
                        lo0Var = null;
                    }
                    if (lo0Var == null) {
                        AbstractC0752tx.m5444b("Inconsistent composition");
                        C0676s.m4644b();
                        return;
                    }
                    int i7 = lo0Var.f6227b;
                    if (i7 >= 0) {
                        int iM5429u2 = m5429u(i5) + i5;
                        int i8 = i6;
                        int i9 = 0;
                        while (i8 < iM5429u2 && i9 < i7) {
                            int iM5426r = m5426r(i8);
                            int i10 = iM5393E;
                            int[] iArr = this.f10914b;
                            int i11 = iM5426r * 5;
                            i8 = iArr[i11 + 3] + i8;
                            if (i8 < iM5429u2 && (iArr[i11 + 1] & 536870912) == 0) {
                                i9++;
                            }
                            iM5393E = i10;
                        }
                        i4 = iM5393E;
                        if (ak1Var == null) {
                            int[] iArr2 = g11.f3247a;
                            ak1Var = new ak1();
                        }
                        if (yj1Var == null) {
                            yj1Var = new yj1();
                        }
                        ak1Var.m182a(i8);
                        yj1Var.m6281a(i8);
                        yj1Var.m6281a(iM5415f);
                    } else {
                        i4 = iM5393E;
                        mn0Var2.mo12g(Integer.valueOf(iM5415f), obj);
                    }
                }
                iM5415f++;
                iM5393E = i4;
            }
            int i12 = iM5393E;
            iM5393E = i6 < iM5424p ? m5393E(this.f10914b, i6) : -1;
            if (iM5393E != i5) {
                int iM5393E2 = i12;
                while (true) {
                    if (yj1Var == null || ak1Var == null || !ak1Var.m186e(i5)) {
                        i2 = iM5424p;
                    } else {
                        int i13 = yj1Var.f13491b;
                        int i14 = i13 / 2;
                        int i15 = 0;
                        int i16 = 0;
                        while (i15 < i14) {
                            int i17 = i15 * 2;
                            int i18 = iM5424p;
                            int iM6283c = yj1Var.m6283c(i17);
                            if (iM6283c == i5) {
                                int iM6283c2 = yj1Var.m6283c(i17 + 1);
                                mn0Var2.mo12g(Integer.valueOf(iM6283c2), this.f10915c[m5417h(iM6283c2)]);
                            } else if (i17 != i16) {
                                int i19 = i16 + 1;
                                yj1Var.m6285e(i16, iM6283c);
                                i16 += 2;
                                yj1Var.m6285e(i19, yj1Var.m6283c(i17 + 1));
                            } else {
                                i16 += 2;
                            }
                            i15++;
                            mn0Var2 = mn0Var;
                            iM5424p = i18;
                        }
                        i2 = iM5424p;
                        if (i16 != i13) {
                            if (i16 < 0 || i16 > (i3 = yj1Var.f13491b) || i13 < 0 || i13 > i3) {
                                break loop0;
                            }
                            if (i13 < i16) {
                                C0676s.m4651j("The end index must be < start index");
                                return;
                            } else if (i13 != i16) {
                                if (i13 < i3) {
                                    int[] iArr3 = yj1Var.f13490a;
                                    AbstractC0460mg.m3086a0(iArr3, iArr3, i16, i13, i3);
                                }
                                yj1Var.f13491b -= i13 - i16;
                            }
                        }
                    }
                    if (i5 == i || iM5393E2 == iM5393E) {
                        break;
                    }
                    i5 = iM5393E2;
                    iM5424p = i2;
                    iM5393E2 = m5393E(this.f10914b, iM5393E2);
                    mn0Var2 = mn0Var;
                }
            } else {
                i2 = iM5424p;
            }
            mn0Var2 = mn0Var;
            i5 = i6;
            iM5424p = i2;
        }
    }

    /* JADX INFO: renamed from: o */
    public final int m5423o() {
        return this.f10914b.length / 5;
    }

    /* JADX INFO: renamed from: p */
    public final int m5424p() {
        return m5423o() - this.f10920h;
    }

    /* JADX INFO: renamed from: q */
    public final Object m5425q(int i) {
        int iM5426r = m5426r(i);
        int[] iArr = this.f10914b;
        int i2 = (iM5426r * 5) + 1;
        if ((iArr[i2] & 268435456) == 0) {
            return C0520nx.f7360a;
        }
        return this.f10915c[Integer.bitCount(iArr[i2] >> 29) + m5416g(iArr, iM5426r)];
    }

    /* JADX INFO: renamed from: r */
    public final int m5426r(int i) {
        return (this.f10920h * (i < this.f10919g ? 0 : 1)) + i;
    }

    /* JADX INFO: renamed from: s */
    public final int m5427s(int i) {
        return this.f10914b[m5426r(i) * 5];
    }

    /* JADX INFO: renamed from: t */
    public final Object m5428t(int i) {
        int iM5426r = m5426r(i);
        int[] iArr = this.f10914b;
        int i2 = iM5426r * 5;
        int i3 = iArr[i2 + 1];
        if ((536870912 & i3) == 0) {
            return null;
        }
        return this.f10915c[Integer.bitCount(i3 >> 30) + iArr[i2 + 4]];
    }

    public final String toString() {
        return "SlotWriter(current = " + this.f10932t + " end=" + this.f10933u + " size = " + m5424p() + " gap=" + this.f10919g + '-' + (this.f10919g + this.f10920h) + ')';
    }

    /* JADX INFO: renamed from: u */
    public final int m5429u(int i) {
        return this.f10914b[(m5426r(i) * 5) + 3];
    }

    /* JADX INFO: renamed from: v */
    public final boolean m5430v(int i, int i2) {
        int iM5423o;
        int iM5429u;
        if (i2 == this.f10934v) {
            iM5423o = this.f10933u;
        } else {
            i11 i11Var = this.f10928p;
            if (i2 > i11Var.m2241a(0)) {
                iM5429u = m5429u(i2);
            } else {
                int[] iArr = i11Var.f4214a;
                int iMin = Math.min(iArr.length, i11Var.f4215b);
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
                    iM5429u = m5429u(i2);
                } else {
                    iM5423o = (m5423o() - this.f10920h) - this.f10929q.f4214a[i3];
                }
            }
            iM5423o = iM5429u + i2;
        }
        return i > i2 && i < iM5423o;
    }

    /* JADX INFO: renamed from: w */
    public final void m5431w(int i) {
        if (i > 0) {
            int i2 = this.f10932t;
            m5390B(i2);
            int i3 = this.f10919g;
            int i4 = this.f10920h;
            int[] iArr = this.f10914b;
            int length = iArr.length / 5;
            int i5 = length - i4;
            if (i4 < i) {
                int iMax = Math.max(Math.max(length * 2, i5 + i), 32);
                int[] iArr2 = new int[iMax * 5];
                int i6 = iMax - i5;
                AbstractC0460mg.m3086a0(iArr, iArr2, 0, 0, i3 * 5);
                AbstractC0460mg.m3086a0(iArr, iArr2, (i3 + i6) * 5, (i4 + i3) * 5, length * 5);
                this.f10914b = iArr2;
                i4 = i6;
            }
            int i7 = this.f10933u;
            if (i7 >= i3) {
                this.f10933u = i7 + i;
            }
            int i8 = i3 + i;
            this.f10919g = i8;
            this.f10920h = i4 - i;
            int iM5387i = m5387i(i5 > 0 ? m5415f(i2 + i) : 0, this.f10925m >= i3 ? this.f10923k : 0, this.f10924l, this.f10915c.length);
            for (int i9 = i3; i9 < i8; i9++) {
                this.f10914b[(i9 * 5) + 4] = iM5387i;
            }
            int i10 = this.f10925m;
            if (i10 >= i3) {
                this.f10925m = i10 + i;
            }
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m5432x(int i, int i2) {
        if (i > 0) {
            m5391C(this.f10921i, i2);
            int i3 = this.f10923k;
            int i4 = this.f10924l;
            if (i4 < i) {
                Object[] objArr = this.f10915c;
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
                this.f10915c = objArr2;
                i4 = i7;
            }
            int i9 = this.f10922j;
            if (i9 >= i3) {
                this.f10922j = i9 + i;
            }
            this.f10923k = i3 + i;
            this.f10924l = i4 - i;
        }
    }

    /* JADX INFO: renamed from: y */
    public final boolean m5433y(int i) {
        return (this.f10914b[(m5426r(i) * 5) + 1] & 1073741824) != 0;
    }
}
