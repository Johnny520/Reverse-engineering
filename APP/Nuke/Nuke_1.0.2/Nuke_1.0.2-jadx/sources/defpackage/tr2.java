package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class tr2 {
    public final qr2 a;
    public int[] b;
    public Object[] c;
    public ArrayList d;
    public HashMap e;
    public zj1 f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public final i11 p;
    public final i11 q;
    public final i11 r;
    public zj1 s;
    public int t;
    public int u;
    public int v;
    public boolean w;
    public yj1 x;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public tr2(qr2 qr2Var) {
        this.a = qr2Var;
        int[] iArr = qr2Var.h;
        this.b = iArr;
        Object[] objArr = qr2Var.j;
        this.c = objArr;
        this.d = qr2Var.p;
        this.e = qr2Var.q;
        this.f = qr2Var.r;
        int i = qr2Var.i;
        this.g = i;
        this.h = (iArr.length / 5) - i;
        int i2 = qr2Var.k;
        this.k = i2;
        this.l = objArr.length - i2;
        this.m = i;
        this.p = new i11();
        this.q = new i11();
        this.r = new i11();
        this.u = i;
        this.v = -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int i(int i, int i2, int i3, int i4) {
        return i > i2 ? -(((i4 - i3) - i) + 1) : i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void z(tr2 tr2Var) {
        int i = tr2Var.v;
        int iR = tr2Var.r(i);
        int[] iArr = tr2Var.b;
        int i2 = (iR * 5) + 1;
        int i3 = iArr[i2];
        if ((i3 & 134217728) != 0) {
            return;
        }
        int i4 = (i3 & (-134217729)) | 134217728;
        iArr[i2] = i4;
        if ((67108864 & i4) != 0) {
            return;
        }
        tr2Var.T(tr2Var.E(iArr, i));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void A(qr2 qr2Var, int i) {
        if (this.n <= 0) {
            tx.a("Check failed");
        }
        if (i == 0 && this.t == 0 && this.a.i == 0) {
            int[] iArr = qr2Var.h;
            int i2 = iArr[(i * 5) + 3];
            int i3 = qr2Var.i;
            if (i2 == i3) {
                int[] iArr2 = this.b;
                Object[] objArr = this.c;
                ArrayList arrayList = this.d;
                HashMap map = this.e;
                zj1 zj1Var = this.f;
                Object[] objArr2 = qr2Var.j;
                int i4 = qr2Var.k;
                HashMap map2 = qr2Var.q;
                zj1 zj1Var2 = qr2Var.r;
                this.b = iArr;
                this.c = objArr2;
                this.d = qr2Var.p;
                this.g = i3;
                this.h = (iArr.length / 5) - i3;
                this.k = i4;
                this.l = objArr2.length - i4;
                this.m = i3;
                this.e = map2;
                this.f = zj1Var2;
                qr2Var.h = iArr2;
                qr2Var.i = 0;
                qr2Var.j = objArr;
                qr2Var.k = 0;
                qr2Var.p = arrayList;
                qr2Var.q = map;
                qr2Var.r = zj1Var;
                return;
            }
        }
        tr2 tr2VarD = qr2Var.d();
        try {
            se.P(tr2VarD, i, this, true, true, false);
            tr2VarD.e(true);
        } catch (Throwable th) {
            tr2VarD.e(false);
            throw th;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void B(int i) {
        ao0 ao0Var;
        int i2;
        ao0 ao0Var2;
        int i3;
        int i4;
        int i5 = this.h;
        int i6 = this.g;
        if (i6 != i) {
            if (!this.d.isEmpty()) {
                int iO = o() - this.h;
                ArrayList arrayList = this.d;
                if (i6 < i) {
                    for (int iA = sr2.a(arrayList, i6, iO); iA < this.d.size() && (i3 = (ao0Var2 = (ao0) this.d.get(iA)).a) < 0 && (i4 = i3 + iO) < i; iA++) {
                        ao0Var2.a = i4;
                    }
                } else {
                    for (int iA2 = sr2.a(arrayList, i, iO); iA2 < this.d.size() && (i2 = (ao0Var = (ao0) this.d.get(iA2)).a) >= 0; iA2++) {
                        ao0Var.a = -(iO - i2);
                    }
                }
            }
            if (i5 > 0) {
                int[] iArr = this.b;
                int i7 = i * 5;
                int i8 = i5 * 5;
                int i9 = i6 * 5;
                if (i < i6) {
                    mg.a0(iArr, iArr, i8 + i7, i7, i9);
                } else {
                    mg.a0(iArr, iArr, i9, i9 + i8, i7 + i8);
                }
            }
            if (i < i6) {
                i6 = i + i5;
            }
            int iO2 = o();
            if (i6 >= iO2) {
                tx.a("Check failed");
            }
            while (i6 < iO2) {
                int i10 = (i6 * 5) + 2;
                int i11 = this.b[i10];
                int iP = i11 > -2 ? i11 : (p() + i11) - (-2);
                if (iP >= i) {
                    iP = -((p() - iP) - (-2));
                }
                if (iP != i11) {
                    this.b[i10] = iP;
                }
                i6++;
                if (i6 == i) {
                    i6 += i5;
                }
            }
        }
        this.g = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void C(int i, int i2) {
        int i3 = this.l;
        int i4 = this.k;
        int i5 = this.m;
        if (i4 != i) {
            Object[] objArr = this.c;
            if (i < i4) {
                System.arraycopy(objArr, i, objArr, i + i3, i4 - i);
            } else {
                int i6 = i4 + i3;
                System.arraycopy(objArr, i6, objArr, i4, (i + i3) - i6);
            }
        }
        int iMin = Math.min(i2 + 1, p());
        if (i5 != iMin) {
            int length = this.c.length - i3;
            if (iMin < i5) {
                int iR = r(iMin);
                int iR2 = r(i5);
                int i7 = this.g;
                while (iR < iR2) {
                    int i8 = (iR * 5) + 4;
                    int i9 = this.b[i8];
                    if (i9 < 0) {
                        tx.a("Unexpected anchor value, expected a positive anchor");
                    }
                    this.b[i8] = -((length - i9) + 1);
                    iR++;
                    if (iR == i7) {
                        iR += this.h;
                    }
                }
            } else {
                int iR3 = r(i5);
                int iR4 = r(iMin);
                while (iR3 < iR4) {
                    int i10 = (iR3 * 5) + 4;
                    int i11 = this.b[i10];
                    if (i11 >= 0) {
                        tx.a("Unexpected anchor value, expected a negative anchor");
                    }
                    this.b[i10] = i11 + length + 1;
                    iR3++;
                    if (iR3 == this.g) {
                        iR3 += this.h;
                    }
                }
            }
            this.m = iMin;
        }
        this.k = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object D(int i) {
        int iR = r(i);
        int[] iArr = this.b;
        if ((iArr[(iR * 5) + 1] & 1073741824) != 0) {
            return this.c[h(g(iArr, iR))];
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int E(int[] iArr, int i) {
        int i2 = iArr[(r(i) * 5) + 2];
        return i2 > -2 ? i2 : (p() + i2) - (-2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object F(Object obj) {
        if (this.n > 0) {
            x(1, this.v);
        }
        Object[] objArr = this.c;
        int i = this.i;
        this.i = i + 1;
        Object obj2 = objArr[h(i)];
        if (this.i > this.j) {
            tx.a("Writing to an invalid slot");
        }
        this.c[h(this.i - 1)] = obj;
        return obj2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void G() {
        int i;
        yj1 yj1Var = this.x;
        if (yj1Var != null) {
            while (yj1Var.b != 0) {
                int iQ = se.Q(yj1Var);
                int iR = r(iQ);
                int iU = iQ + 1;
                int iU2 = u(iQ) + iQ;
                while (true) {
                    if (iU >= iU2) {
                        i = 0;
                        break;
                    } else {
                        if ((this.b[(r(iU) * 5) + 1] & 201326592) != 0) {
                            i = 1;
                            break;
                        }
                        iU += u(iU);
                    }
                }
                int[] iArr = this.b;
                int i2 = (iR * 5) + 1;
                int i3 = iArr[i2];
                if (((67108864 & i3) != 0 ? 1 : 0) != i) {
                    iArr[i2] = (i << 26) | ((-67108865) & i3);
                    int iE = E(iArr, iQ);
                    if (iE >= 0) {
                        se.x(yj1Var, iE);
                    }
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean H() {
        if (this.n != 0) {
            tx.a("Cannot remove group while inserting");
        }
        int i = this.t;
        int i2 = this.i;
        int iG = g(this.b, r(i));
        int iL = L();
        O(this.v);
        yj1 yj1Var = this.x;
        if (yj1Var != null) {
            while (true) {
                int i3 = yj1Var.b;
                if (i3 == 0) {
                    break;
                }
                if (i3 == 0) {
                    um2.i("IntList is empty.");
                    return false;
                }
                if (yj1Var.a[0] < i) {
                    break;
                }
                se.Q(yj1Var);
            }
        }
        boolean zI = I(i, this.t - i);
        J(iG, this.i - iG, i - 1);
        this.t = i;
        this.i = i2;
        this.o -= iL;
        return zI;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean I(int i, int i2) {
        if (i2 > 0) {
            ArrayList arrayList = this.d;
            B(i);
            if (!arrayList.isEmpty()) {
                HashMap map = this.e;
                int i3 = i + i2;
                int iA = sr2.a(this.d, i3, o() - this.h);
                if (iA >= this.d.size()) {
                    iA--;
                }
                int i4 = iA + 1;
                int i5 = 0;
                while (iA >= 0) {
                    ao0 ao0Var = (ao0) this.d.get(iA);
                    int iC = c(ao0Var);
                    if (iC < i) {
                        break;
                    }
                    if (iC < i3) {
                        ao0Var.a = Integer.MIN_VALUE;
                        if (map != null) {
                        }
                        if (i5 == 0) {
                            i5 = iA + 1;
                        }
                        i4 = iA;
                    }
                    iA--;
                }
                z = i4 < i5;
                if (z) {
                    this.d.subList(i4, i5).clear();
                }
            }
            this.g = i;
            this.h += i2;
            int i6 = this.m;
            if (i6 > i) {
                this.m = Math.max(i, i6 - i2);
            }
            int i7 = this.u;
            if (i7 >= this.g) {
                this.u = i7 - i2;
            }
            int i8 = this.v;
            if (i8 >= 0 && (this.b[(r(i8) * 5) + 1] & 67108864) != 0) {
                T(i8);
            }
        }
        return z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void J(int i, int i2, int i3) {
        if (i2 > 0) {
            int i4 = this.l;
            int i5 = i + i2;
            C(i5, i3);
            this.k = i;
            this.l = i4 + i2;
            Arrays.fill(this.c, i, i5, (Object) null);
            int i6 = this.j;
            if (i6 >= i) {
                this.j = i6 - i2;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object K(int i, int i2, Object obj) {
        int iN = N(this.b, r(i));
        int iG = g(this.b, r(i + 1));
        int i3 = iN + i2;
        if (i3 < iN || i3 >= iG) {
            tx.a("Write to an invalid slot index " + i2 + " for group " + i);
        }
        int iH = h(i3);
        Object[] objArr = this.c;
        Object obj2 = objArr[iH];
        objArr[iH] = obj;
        return obj2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int L() {
        int iR = r(this.t);
        int i = this.t;
        int[] iArr = this.b;
        int i2 = iR * 5;
        int i3 = iArr[i2 + 3] + i;
        this.t = i3;
        this.i = g(iArr, r(i3));
        int i4 = this.b[i2 + 1];
        if ((1073741824 & i4) != 0) {
            return 1;
        }
        return i4 & 67108863;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void M() {
        int i = this.u;
        this.t = i;
        this.i = g(this.b, r(i));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int N(int[] iArr, int i) {
        if (i >= o()) {
            return this.c.length - this.l;
        }
        int iB = sr2.b(iArr, i);
        return iB < 0 ? (this.c.length - this.l) + iB + 1 : iB;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final io0 O(int i) {
        ao0 ao0VarR;
        HashMap map = this.e;
        if (map == null || (ao0VarR = R(i)) == null) {
            return null;
        }
        return (io0) map.get(ao0VarR);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void P() {
        if (this.n != 0) {
            tx.a("Key must be supplied when inserting");
        }
        eb ebVar = nx.a;
        Q(0, ebVar, ebVar, false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: java.lang.Object[] */
    /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: java.lang.Object[] */
    /* JADX DEBUG: Multi-variable search result rejected for r1v4, resolved type: java.lang.Object[] */
    /* JADX WARN: Multi-variable type inference failed */
    public final void Q(int i, Object obj, Object obj2, boolean z) {
        int i2;
        int i3 = this.v;
        Object[] objArr = this.n > 0;
        this.r.c(this.o);
        eb ebVar = nx.a;
        if (objArr == true) {
            int i4 = this.t;
            int iG = g(this.b, r(i4));
            w(1);
            this.i = iG;
            this.j = iG;
            int iR = r(i4);
            int i5 = obj != ebVar ? 1 : 0;
            int i6 = (z || obj2 == ebVar) ? 0 : 1;
            int i7 = i(iG, this.k, this.l, this.c.length);
            if (i7 >= 0 && this.m < i4) {
                i7 = -(((this.c.length - this.l) - i7) + 1);
            }
            int[] iArr = this.b;
            int i8 = this.v;
            int i9 = iR * 5;
            iArr[i9] = i;
            iArr[i9 + 1] = ((z ? 1 : 0) << 30) | (i5 << 29) | (i6 << 28);
            iArr[i9 + 2] = i8;
            iArr[i9 + 3] = 0;
            iArr[i9 + 4] = i7;
            int i10 = (z ? 1 : 0) + i5 + i6;
            if (i10 > 0) {
                x(i10, i4);
                Object[] objArr2 = this.c;
                int i11 = this.i;
                if (z) {
                    objArr2[i11] = obj2;
                    i11++;
                }
                if (i5 != 0) {
                    objArr2[i11] = obj;
                    i11++;
                }
                if (i6 != 0) {
                    objArr2[i11] = obj2;
                    i11++;
                }
                this.i = i11;
            }
            this.o = 0;
            i2 = i4 + 1;
            this.v = i4;
            this.t = i2;
            if (i3 >= 0) {
                O(i3);
            }
        } else {
            this.p.c(i3);
            this.q.c((o() - this.h) - this.u);
            int i12 = this.t;
            int iR2 = r(i12);
            if (!t11.l(obj2, ebVar)) {
                if (z) {
                    U(this.t, obj2);
                } else {
                    S(obj2);
                }
            }
            this.i = N(this.b, iR2);
            this.j = g(this.b, r(this.t + 1));
            int[] iArr2 = this.b;
            int i13 = iR2 * 5;
            this.o = iArr2[i13 + 1] & 67108863;
            this.v = i12;
            this.t = i12 + 1;
            i2 = i12 + iArr2[i13 + 3];
        }
        this.u = i2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final ao0 R(int i) {
        ArrayList arrayList;
        int iE;
        if (i < 0 || i >= p() || (iE = sr2.e((arrayList = this.d), i, p())) < 0) {
            return null;
        }
        return (ao0) arrayList.get(iE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void S(Object obj) {
        int iR = r(this.t);
        int i = (iR * 5) + 1;
        if ((this.b[i] & 268435456) == 0) {
            tx.a("Updating the data of a group that was not created with a data slot");
        }
        Object[] objArr = this.c;
        int[] iArr = this.b;
        objArr[h(Integer.bitCount(iArr[i] >> 29) + g(iArr, iR))] = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void T(int i) {
        if (i >= 0) {
            yj1 yj1Var = this.x;
            if (yj1Var == null) {
                yj1Var = new yj1();
                this.x = yj1Var;
            }
            se.x(yj1Var, i);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void U(int i, Object obj) {
        int iR = r(i);
        int[] iArr = this.b;
        if (iR >= iArr.length || (iArr[(iR * 5) + 1] & 1073741824) == 0) {
            tx.a("Updating the node of a group at " + i + " that was not created with as a node group");
        }
        this.c[h(g(this.b, iR))] = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a(int i) {
        if (i < 0) {
            tx.a("Cannot seek backwards");
        }
        if (this.n > 0) {
            j22.b("Cannot call seek() while inserting");
        }
        if (i == 0) {
            return;
        }
        int i2 = this.t + i;
        if (i2 < this.v || i2 > this.u) {
            tx.a("Cannot seek outside the current group (" + this.v + '-' + this.u + ')');
        }
        this.t = i2;
        int iG = g(this.b, r(i2));
        this.i = iG;
        this.j = iG;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final ao0 b(int i) {
        ArrayList arrayList = this.d;
        int iE = sr2.e(arrayList, i, p());
        if (iE >= 0) {
            return (ao0) arrayList.get(iE);
        }
        if (i > this.g) {
            i = -(p() - i);
        }
        ao0 ao0Var = new ao0(i);
        arrayList.add(-(iE + 1), ao0Var);
        return ao0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int c(ao0 ao0Var) {
        int i = ao0Var.a;
        return i < 0 ? p() + i : i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void d() {
        int i = this.n;
        this.n = i + 1;
        if (i == 0) {
            this.q.c((o() - this.h) - this.u);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void e(boolean z) {
        this.w = true;
        if (z && this.p.b == 0) {
            B(p());
            C(this.c.length - this.l, this.g);
            int i = this.k;
            Arrays.fill(this.c, i, this.l + i, (Object) null);
            G();
        }
        int[] iArr = this.b;
        int i2 = this.g;
        Object[] objArr = this.c;
        int i3 = this.k;
        ArrayList arrayList = this.d;
        HashMap map = this.e;
        zj1 zj1Var = this.f;
        qr2 qr2Var = this.a;
        if (!qr2Var.n) {
            j22.a("Unexpected writer close()");
        }
        qr2Var.n = false;
        qr2Var.h = iArr;
        qr2Var.i = i2;
        qr2Var.j = objArr;
        qr2Var.k = i3;
        qr2Var.p = arrayList;
        qr2Var.q = map;
        qr2Var.r = zj1Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int f(int i) {
        return g(this.b, r(i));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int g(int[] iArr, int i) {
        if (i >= o()) {
            return this.c.length - this.l;
        }
        int i2 = iArr[(i * 5) + 4];
        return i2 < 0 ? (this.c.length - this.l) + i2 + 1 : i2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int h(int i) {
        return (this.l * (i < this.k ? 0 : 1)) + i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void j() {
        lk1 lk1Var;
        boolean z = this.n > 0;
        int i = this.t;
        int i2 = this.u;
        int i3 = this.v;
        int iR = r(i3);
        int i4 = this.o;
        int i5 = i - i3;
        int i6 = iR * 5;
        int i7 = i6 + 1;
        boolean z2 = (this.b[i7] & 1073741824) != 0;
        i11 i11Var = this.r;
        if (z) {
            zj1 zj1Var = this.s;
            if (zj1Var != null && (lk1Var = (lk1) zj1Var.b(i3)) != null) {
                Object[] objArr = lk1Var.a;
                int i8 = lk1Var.b;
                for (int i9 = 0; i9 < i8; i9++) {
                    F(objArr[i9]);
                }
            }
            int[] iArr = this.b;
            iArr[i6 + 3] = i5;
            sr2.c(iArr, iR, i4);
            int iB = i11Var.b();
            if (z2) {
                i4 = 1;
            }
            this.o = iB + i4;
            int iE = E(this.b, i3);
            this.v = iE;
            int iP = iE < 0 ? p() : r(iE + 1);
            int iG = iP >= 0 ? g(this.b, iP) : 0;
            this.i = iG;
            this.j = iG;
            return;
        }
        if (i != i2) {
            tx.a("Expected to be at the end of a group");
        }
        int[] iArr2 = this.b;
        int i10 = i6 + 3;
        int i11 = iArr2[i10];
        int i12 = iArr2[i7] & 67108863;
        iArr2[i10] = i5;
        sr2.c(iArr2, iR, i4);
        int iB2 = this.p.b();
        this.u = (o() - this.h) - this.q.b();
        this.v = iB2;
        int iE2 = E(this.b, i3);
        int iB3 = i11Var.b();
        this.o = iB3;
        if (iE2 == iB2) {
            this.o = iB3 + (z2 ? 0 : i4 - i12);
            return;
        }
        int i13 = i5 - i11;
        int i14 = z2 ? 0 : i4 - i12;
        if (i13 != 0 || i14 != 0) {
            while (iE2 != 0 && iE2 != iB2 && (i14 != 0 || i13 != 0)) {
                int iR2 = r(iE2);
                if (i13 != 0) {
                    int[] iArr3 = this.b;
                    int i15 = (iR2 * 5) + 3;
                    iArr3[i15] = iArr3[i15] + i13;
                }
                if (i14 != 0) {
                    int[] iArr4 = this.b;
                    sr2.c(iArr4, iR2, (iArr4[(iR2 * 5) + 1] & 67108863) + i14);
                }
                int[] iArr5 = this.b;
                if ((iArr5[(iR2 * 5) + 1] & 1073741824) != 0) {
                    i14 = 0;
                }
                iE2 = E(iArr5, iE2);
            }
        }
        this.o += i14;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void k() {
        if (this.n <= 0) {
            j22.b("Unbalanced begin/end insert");
        }
        int i = this.n - 1;
        this.n = i;
        if (i == 0) {
            if (this.r.b != this.p.b) {
                tx.a("startGroup/endGroup mismatch while inserting");
            }
            this.u = (o() - this.h) - this.q.b();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void l(int i) {
        boolean z = false;
        if (!(this.n <= 0)) {
            tx.a("Cannot call ensureStarted() while inserting");
        }
        int i2 = this.v;
        if (i2 != i) {
            if (i >= i2 && i < this.u) {
                z = true;
            }
            if (!z) {
                tx.a("Started group at " + i + " must be a subgroup of the group at " + i2);
            }
            int i3 = this.t;
            int i4 = this.i;
            int i5 = this.j;
            this.t = i;
            P();
            this.t = i3;
            this.i = i4;
            this.j = i5;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void m(int i, int i2, int i3) {
        if (i >= this.g) {
            i = -((p() - i) + 2);
        }
        while (i3 < i2) {
            this.b[(r(i3) * 5) + 2] = i;
            int i4 = this.b[(r(i3) * 5) + 3] + i3;
            m(i3, i4, i3 + 1);
            i3 = i4;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0126, code lost:
    
        defpackage.s.d("Index must be between 0 and size");
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x012b, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void n(int i, mn0 mn0Var) {
        int i2;
        int i3;
        int i4;
        mn0 mn0Var2 = mn0Var;
        int iE = E(this.b, i);
        int iP = p();
        int iU = u(i) + i;
        int i5 = i;
        ak1 ak1Var = null;
        yj1 yj1Var = null;
        loop0: while (i5 < iU) {
            int iF = f(i5);
            int i6 = i5 + 1;
            int iF2 = f(i6);
            while (iF < iF2) {
                Object obj = this.c[h(iF)];
                if (obj instanceof lo0) {
                    lo0 lo0Var = (lo0) obj;
                    if (!(lo0Var instanceof lo0)) {
                        lo0Var = null;
                    }
                    if (lo0Var == null) {
                        tx.b("Inconsistent composition");
                        s.b();
                        return;
                    }
                    int i7 = lo0Var.b;
                    if (i7 >= 0) {
                        int iU2 = u(i5) + i5;
                        int i8 = i6;
                        int i9 = 0;
                        while (i8 < iU2 && i9 < i7) {
                            int iR = r(i8);
                            int i10 = iE;
                            int[] iArr = this.b;
                            int i11 = iR * 5;
                            i8 = iArr[i11 + 3] + i8;
                            if (i8 < iU2 && (iArr[i11 + 1] & 536870912) == 0) {
                                i9++;
                            }
                            iE = i10;
                        }
                        i4 = iE;
                        if (ak1Var == null) {
                            int[] iArr2 = g11.a;
                            ak1Var = new ak1();
                        }
                        if (yj1Var == null) {
                            yj1Var = new yj1();
                        }
                        ak1Var.a(i8);
                        yj1Var.a(i8);
                        yj1Var.a(iF);
                    } else {
                        i4 = iE;
                        mn0Var2.g(Integer.valueOf(iF), obj);
                    }
                }
                iF++;
                iE = i4;
            }
            int i12 = iE;
            iE = i6 < iP ? E(this.b, i6) : -1;
            if (iE != i5) {
                int iE2 = i12;
                while (true) {
                    if (yj1Var == null || ak1Var == null || !ak1Var.e(i5)) {
                        i2 = iP;
                    } else {
                        int i13 = yj1Var.b;
                        int i14 = i13 / 2;
                        int i15 = 0;
                        int i16 = 0;
                        while (i15 < i14) {
                            int i17 = i15 * 2;
                            int i18 = iP;
                            int iC = yj1Var.c(i17);
                            if (iC == i5) {
                                int iC2 = yj1Var.c(i17 + 1);
                                mn0Var2.g(Integer.valueOf(iC2), this.c[h(iC2)]);
                            } else if (i17 != i16) {
                                int i19 = i16 + 1;
                                yj1Var.e(i16, iC);
                                i16 += 2;
                                yj1Var.e(i19, yj1Var.c(i17 + 1));
                            } else {
                                i16 += 2;
                            }
                            i15++;
                            mn0Var2 = mn0Var;
                            iP = i18;
                        }
                        i2 = iP;
                        if (i16 != i13) {
                            if (i16 < 0 || i16 > (i3 = yj1Var.b) || i13 < 0 || i13 > i3) {
                                break loop0;
                            }
                            if (i13 < i16) {
                                s.j("The end index must be < start index");
                                return;
                            } else if (i13 != i16) {
                                if (i13 < i3) {
                                    int[] iArr3 = yj1Var.a;
                                    mg.a0(iArr3, iArr3, i16, i13, i3);
                                }
                                yj1Var.b -= i13 - i16;
                            }
                        }
                    }
                    if (i5 == i || iE2 == iE) {
                        break;
                    }
                    i5 = iE2;
                    iP = i2;
                    iE2 = E(this.b, iE2);
                    mn0Var2 = mn0Var;
                }
            } else {
                i2 = iP;
            }
            mn0Var2 = mn0Var;
            i5 = i6;
            iP = i2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int o() {
        return this.b.length / 5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int p() {
        return o() - this.h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object q(int i) {
        int iR = r(i);
        int[] iArr = this.b;
        int i2 = (iR * 5) + 1;
        if ((iArr[i2] & 268435456) == 0) {
            return nx.a;
        }
        return this.c[Integer.bitCount(iArr[i2] >> 29) + g(iArr, iR)];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int r(int i) {
        return (this.h * (i < this.g ? 0 : 1)) + i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int s(int i) {
        return this.b[r(i) * 5];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object t(int i) {
        int iR = r(i);
        int[] iArr = this.b;
        int i2 = iR * 5;
        int i3 = iArr[i2 + 1];
        if ((536870912 & i3) == 0) {
            return null;
        }
        return this.c[Integer.bitCount(i3 >> 30) + iArr[i2 + 4]];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "SlotWriter(current = " + this.t + " end=" + this.u + " size = " + p() + " gap=" + this.g + '-' + (this.g + this.h) + ')';
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int u(int i) {
        return this.b[(r(i) * 5) + 3];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean v(int i, int i2) {
        int iO;
        int iU;
        if (i2 == this.v) {
            iO = this.u;
        } else {
            i11 i11Var = this.p;
            if (i2 > i11Var.a(0)) {
                iU = u(i2);
            } else {
                int[] iArr = i11Var.a;
                int iMin = Math.min(iArr.length, i11Var.b);
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
                    iU = u(i2);
                } else {
                    iO = (o() - this.h) - this.q.a[i3];
                }
            }
            iO = iU + i2;
        }
        return i > i2 && i < iO;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void w(int i) {
        if (i > 0) {
            int i2 = this.t;
            B(i2);
            int i3 = this.g;
            int i4 = this.h;
            int[] iArr = this.b;
            int length = iArr.length / 5;
            int i5 = length - i4;
            if (i4 < i) {
                int iMax = Math.max(Math.max(length * 2, i5 + i), 32);
                int[] iArr2 = new int[iMax * 5];
                int i6 = iMax - i5;
                mg.a0(iArr, iArr2, 0, 0, i3 * 5);
                mg.a0(iArr, iArr2, (i3 + i6) * 5, (i4 + i3) * 5, length * 5);
                this.b = iArr2;
                i4 = i6;
            }
            int i7 = this.u;
            if (i7 >= i3) {
                this.u = i7 + i;
            }
            int i8 = i3 + i;
            this.g = i8;
            this.h = i4 - i;
            int i9 = i(i5 > 0 ? f(i2 + i) : 0, this.m >= i3 ? this.k : 0, this.l, this.c.length);
            for (int i10 = i3; i10 < i8; i10++) {
                this.b[(i10 * 5) + 4] = i9;
            }
            int i11 = this.m;
            if (i11 >= i3) {
                this.m = i11 + i;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void x(int i, int i2) {
        if (i > 0) {
            C(this.i, i2);
            int i3 = this.k;
            int i4 = this.l;
            if (i4 < i) {
                Object[] objArr = this.c;
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
                this.c = objArr2;
                i4 = i7;
            }
            int i9 = this.j;
            if (i9 >= i3) {
                this.j = i9 + i;
            }
            this.k = i3 + i;
            this.l = i4 - i;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean y(int i) {
        return (this.b[(r(i) * 5) + 1] & 1073741824) != 0;
    }
}
