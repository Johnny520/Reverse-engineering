package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public class lq2 extends n3 implements vk1, zj0 {
    public final int l;
    public final int m;
    public final hn n;
    public Object[] o;
    public long p;
    public long q;
    public int r;
    public int s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public lq2(int i, int i2, hn hnVar) {
        this.l = i;
        this.m = i2;
        this.n = hnVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:17:0x0036 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:53:0x001e */
    /* JADX WARN: Can't wrap try/catch for region: R(12:0|2|(2:4|(1:6)(1:7))(0)|8|(1:53)|(2:10|(1:(1:(7:14|15|16|31|59|(5:32|33|(10:57|(2:42|43)|44|(1:61)|16|31|59|32|33|(0)(1:35))(0)|49|50)|46)(2:19|20))(5:21|22|59|(5:32|33|(0)(0)|49|50)|46))(4:24|55|25|26))(1:29)|51|30|31|59|(5:32|33|(0)(0)|49|50)|46) */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00b0, code lost:
    
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00b1, code lost:
    
        r4 = r8;
        r8 = r10;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0080 A[Catch: all -> 0x0036, TRY_ENTER, TryCatch #1 {all -> 0x0036, blocks: (B:15:0x002f, B:32:0x0076, B:35:0x0080, B:39:0x0093, B:42:0x009a, B:43:0x009e, B:44:0x009f, B:22:0x0047), top: B:53:0x001e }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0091 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v4, types: [ak0] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r4v1, types: [n3] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v4, types: [lq2] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r9v0, types: [ak0] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v2, types: [o3] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [mq2] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8, types: [mq2] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x00ad -> B:16:0x0032). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void i(lq2 lq2Var, ak0 ak0Var, t00 t00Var) throws Throwable {
        kq2 kq2Var;
        ?? r4;
        ?? r10;
        lq2 lq2Var2;
        k21 k21Var;
        k21 k21Var2;
        ?? r1;
        Object objS;
        hh1 hh1Var;
        k20 k20Var;
        ?? r102;
        ?? r9;
        ?? r8;
        if (t00Var instanceof kq2) {
            kq2Var = (kq2) t00Var;
            int i = kq2Var.q;
            if ((i & Integer.MIN_VALUE) != 0) {
                kq2Var.q = i - Integer.MIN_VALUE;
            } else {
                kq2Var = new kq2(lq2Var, t00Var);
            }
        }
        Object obj = kq2Var.o;
        int i2 = kq2Var.q;
        try {
        } catch (Throwable th) {
            th = th;
        }
        if (i2 == 0) {
            fg1.T(obj);
            r10 = ak0Var;
            ak0Var = (mq2) lq2Var.b();
            lq2Var2 = lq2Var;
        } else {
            if (i2 != 1) {
                if (i2 == 2) {
                    k21Var2 = kq2Var.n;
                    mq2 mq2Var = kq2Var.m;
                    ak0 ak0Var2 = kq2Var.l;
                    lq2 lq2Var3 = kq2Var.k;
                    fg1.T(obj);
                    r1 = ak0Var2;
                    r4 = lq2Var3;
                    ak0Var = mq2Var;
                    do {
                        objS = r4.s(ak0Var);
                        hh1Var = p7.f;
                        k20Var = k20.h;
                        if (objS == hh1Var) {
                        }
                        r4.e(ak0Var);
                        throw th;
                    } while (r4.g(ak0Var, kq2Var) != k20Var);
                }
                if (i2 != 3) {
                    s.l("call to 'resume' before 'invoke' with coroutine");
                    return;
                }
                k21Var2 = kq2Var.n;
                mq2 mq2Var2 = kq2Var.m;
                ak0 ak0Var3 = kq2Var.l;
                lq2 lq2Var4 = kq2Var.k;
                fg1.T(obj);
                ?? r12 = ak0Var3;
                ?? r42 = lq2Var4;
                ?? r92 = mq2Var2;
                r102 = r12;
                k21Var = k21Var2;
                r8 = r42;
                r9 = r92;
                r4 = r8;
                k21Var2 = k21Var;
                r1 = r102;
                ak0Var = r9;
                do {
                    objS = r4.s(ak0Var);
                    hh1Var = p7.f;
                    k20Var = k20.h;
                    if (objS == hh1Var) {
                        if (k21Var2 != null && !k21Var2.b()) {
                            throw k21Var2.q();
                        }
                        kq2Var.k = r4;
                        kq2Var.l = r1;
                        kq2Var.m = ak0Var;
                        kq2Var.n = k21Var2;
                        kq2Var.q = 3;
                        Object objM = r1.m(objS, kq2Var);
                        r12 = r1;
                        r42 = r4;
                        r92 = ak0Var;
                        if (objM == k20Var) {
                            return;
                        }
                        r102 = r12;
                        k21Var = k21Var2;
                        r8 = r42;
                        r9 = r92;
                        r4 = r8;
                        k21Var2 = k21Var;
                        r1 = r102;
                        ak0Var = r9;
                        objS = r4.s(ak0Var);
                        hh1Var = p7.f;
                        k20Var = k20.h;
                        if (objS == hh1Var) {
                            kq2Var.k = r4;
                            kq2Var.l = r1;
                            kq2Var.m = ak0Var;
                            kq2Var.n = k21Var2;
                            kq2Var.q = 2;
                        }
                    }
                    r4.e(ak0Var);
                    throw th;
                } while (r4.g(ak0Var, kq2Var) != k20Var);
            }
            ak0Var = kq2Var.m;
            ak0 ak0Var4 = kq2Var.l;
            lq2 lq2Var5 = kq2Var.k;
            try {
                fg1.T(obj);
                r10 = ak0Var4;
                lq2Var2 = lq2Var5;
                ak0Var = ak0Var;
            } catch (Throwable th2) {
                th = th2;
                r4 = lq2Var5;
            }
        }
        a20 a20Var = kq2Var.i;
        a20Var.getClass();
        k21Var = (k21) a20Var.o(sn.K);
        r8 = lq2Var2;
        r9 = ak0Var;
        r102 = r10;
        r4 = r8;
        k21Var2 = k21Var;
        r1 = r102;
        ak0Var = r9;
        do {
            objS = r4.s(ak0Var);
            hh1Var = p7.f;
            k20Var = k20.h;
            if (objS == hh1Var) {
            }
            r4.e(ak0Var);
            throw th;
        } while (r4.g(ak0Var, kq2Var) != k20Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.zj0
    public final Object a(ak0 ak0Var, t00 t00Var) throws Throwable {
        i(this, ak0Var, t00Var);
        return k20.h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.n3
    public final o3 c() {
        mq2 mq2Var = new mq2();
        mq2Var.a = -1L;
        return mq2Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.n3
    public final o3[] d() {
        return new mq2[2];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object g(mq2 mq2Var, kq2 kq2Var) {
        mp mpVar = new mp(1, gf1.z(kq2Var));
        mpVar.u();
        synchronized (this) {
            try {
                if (r(mq2Var) < 0) {
                    mq2Var.b = mpVar;
                } else {
                    mpVar.h(a83.a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Object objT = mpVar.t();
        return objT == k20.h ? objT : a83.a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void h() {
        if (this.m != 0 || this.s > 1) {
            Object[] objArr = this.o;
            objArr.getClass();
            while (this.s > 0) {
                long jN = n();
                int i = this.r;
                int i2 = this.s;
                if (objArr[((int) ((jN + ((long) (i + i2))) - 1)) & (objArr.length - 1)] != p7.f) {
                    return;
                }
                this.s = i2 - 1;
                p7.j(objArr, n() + ((long) (this.r + this.s)), null);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void j() {
        o3[] o3VarArr;
        Object[] objArr = this.o;
        objArr.getClass();
        p7.j(objArr, n(), null);
        this.r--;
        long jN = n() + 1;
        if (this.p < jN) {
            this.p = jN;
        }
        if (this.q < jN) {
            if (this.i != 0 && (o3VarArr = this.h) != null) {
                for (o3 o3Var : o3VarArr) {
                    if (o3Var != null) {
                        mq2 mq2Var = (mq2) o3Var;
                        long j = mq2Var.a;
                        if (0 <= j && j < jN) {
                            mq2Var.a = jN;
                        }
                    }
                }
            }
            this.q = jN;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void k(Object obj) {
        int i = this.r + this.s;
        Object[] objArrO = this.o;
        if (objArrO == null) {
            objArrO = o(null, 0, 2);
        } else if (i >= objArrO.length) {
            objArrO = o(objArrO, i, objArrO.length * 2);
        }
        p7.j(objArrO, n() + ((long) i), obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:22:0x003e */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:24:0x003b */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [t00[]] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r6v3 */
    public final t00[] l(t00[] t00VarArr) {
        o3[] o3VarArr;
        mq2 mq2Var;
        mp mpVar;
        int length = t00VarArr.length;
        if (this.i != 0 && (o3VarArr = this.h) != null) {
            int length2 = o3VarArr.length;
            int i = 0;
            t00VarArr = t00VarArr;
            while (i < length2) {
                o3 o3Var = o3VarArr[i];
                if (o3Var != null && (mpVar = (mq2Var = (mq2) o3Var).b) != null && r(mq2Var) >= 0) {
                    int length3 = t00VarArr.length;
                    t00VarArr = t00VarArr;
                    if (length >= length3) {
                        t00VarArr = Arrays.copyOf((Object[]) t00VarArr, Math.max(2, t00VarArr.length * 2));
                    }
                    ((t00[]) t00VarArr)[length] = mpVar;
                    mq2Var.b = null;
                    length++;
                }
                i++;
                t00VarArr = t00VarArr;
            }
        }
        return (t00[]) t00VarArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0081 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0082  */
    @Override // defpackage.ak0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m(Object obj, t00 t00Var) throws Throwable {
        lq2 lq2Var;
        Throwable th;
        t00[] t00VarArrL;
        jq2 jq2Var;
        Object objT;
        k20 k20Var;
        if (p(obj)) {
            return a83.a;
        }
        int i = 1;
        mp mpVar = new mp(1, gf1.z(t00Var));
        mpVar.u();
        t00[] t00VarArrL2 = p40.a;
        synchronized (this) {
            try {
                if (q(obj)) {
                    try {
                        mpVar.h(a83.a);
                        t00VarArrL = l(t00VarArrL2);
                        jq2Var = null;
                        lq2Var = this;
                        if (jq2Var != null) {
                            mpVar.x(new hp(i, jq2Var));
                        }
                        for (t00 t00Var2 : t00VarArrL) {
                            if (t00Var2 != null) {
                                t00Var2.h(a83.a);
                            }
                        }
                        objT = mpVar.t();
                        k20Var = k20.h;
                        if (objT != k20Var) {
                            objT = a83.a;
                        }
                        return objT != k20Var ? objT : a83.a;
                    } catch (Throwable th2) {
                        th = th2;
                        lq2Var = this;
                    }
                } else {
                    try {
                        lq2Var = this;
                        try {
                            jq2 jq2Var2 = new jq2(lq2Var, n() + ((long) (this.r + this.s)), obj, mpVar);
                            lq2Var.k(jq2Var2);
                            lq2Var.s++;
                            if (lq2Var.m == 0) {
                                t00VarArrL2 = lq2Var.l(t00VarArrL2);
                            }
                            t00VarArrL = t00VarArrL2;
                            jq2Var = jq2Var2;
                            if (jq2Var != null) {
                            }
                            while (i < r7) {
                            }
                            objT = mpVar.t();
                            k20Var = k20.h;
                            if (objT != k20Var) {
                            }
                            if (objT != k20Var) {
                            }
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    } catch (Throwable th4) {
                        lq2Var = this;
                        th = th4;
                    }
                }
            } catch (Throwable th5) {
                th = th5;
                lq2Var = this;
            }
            th = th;
            throw th;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final long n() {
        return Math.min(this.q, this.p);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object[] o(Object[] objArr, int i, int i2) {
        if (i2 <= 0) {
            s.l("Buffer size overflow");
            return null;
        }
        Object[] objArr2 = new Object[i2];
        this.o = objArr2;
        if (objArr != null) {
            long jN = n();
            for (int i3 = 0; i3 < i; i3++) {
                long j = ((long) i3) + jN;
                p7.j(objArr2, j, objArr[((int) j) & (objArr.length - 1)]);
            }
        }
        return objArr2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean p(Object obj) {
        int i;
        boolean z;
        t00[] t00VarArrL = p40.a;
        synchronized (this) {
            if (q(obj)) {
                t00VarArrL = l(t00VarArrL);
                z = true;
            } else {
                z = false;
            }
        }
        for (t00 t00Var : t00VarArrL) {
            if (t00Var != null) {
                t00Var.h(a83.a);
            }
        }
        return z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean q(Object obj) {
        int i = this.i;
        int i2 = this.l;
        if (i != 0) {
            int i3 = this.r;
            int i4 = this.m;
            if (i3 >= i4 && this.q <= this.p) {
                int iOrdinal = this.n.ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal != 1) {
                        if (iOrdinal != 2) {
                            c80.s();
                        }
                    }
                }
                return false;
            }
            k(obj);
            int i5 = this.r + 1;
            this.r = i5;
            if (i5 > i4) {
                j();
            }
            long jN = n() + ((long) this.r);
            long j = this.p;
            if (((int) (jN - j)) > i2) {
                t(1 + j, this.q, n() + ((long) this.r), n() + ((long) this.r) + ((long) this.s));
            }
        } else if (i2 != 0) {
            k(obj);
            int i6 = this.r + 1;
            this.r = i6;
            if (i6 > i2) {
                j();
            }
            this.q = n() + ((long) this.r);
            return true;
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final long r(mq2 mq2Var) {
        long j = mq2Var.a;
        if (j >= n() + ((long) this.r) && (this.m > 0 || j > n() || this.s == 0)) {
            return -1L;
        }
        return j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object s(mq2 mq2Var) {
        Object obj;
        t00[] t00VarArrU = p40.a;
        synchronized (this) {
            try {
                long jR = r(mq2Var);
                if (jR < 0) {
                    obj = p7.f;
                } else {
                    long j = mq2Var.a;
                    Object[] objArr = this.o;
                    objArr.getClass();
                    Object obj2 = objArr[((int) jR) & (objArr.length - 1)];
                    if (obj2 instanceof jq2) {
                        obj2 = ((jq2) obj2).j;
                    }
                    mq2Var.a = jR + 1;
                    Object obj3 = obj2;
                    t00VarArrU = u(j);
                    obj = obj3;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        for (t00 t00Var : t00VarArrU) {
            if (t00Var != null) {
                t00Var.h(a83.a);
            }
        }
        return obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void t(long j, long j2, long j3, long j4) {
        long jMin = Math.min(j2, j);
        for (long jN = n(); jN < jMin; jN++) {
            Object[] objArr = this.o;
            objArr.getClass();
            p7.j(objArr, jN, null);
        }
        this.p = j;
        this.q = j2;
        this.r = (int) (j3 - jMin);
        this.s = (int) (j4 - j3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final t00[] u(long j) {
        long j2;
        long j3;
        int i;
        long j4;
        t00[] t00VarArr;
        t00[] t00VarArr2;
        o3[] o3VarArr;
        hh1 hh1Var = p7.f;
        t00[] t00VarArr3 = p40.a;
        if (j <= this.q) {
            long jN = n();
            long j5 = ((long) this.r) + jN;
            int i2 = this.m;
            if (i2 == 0 && this.s > 0) {
                j5++;
            }
            int i3 = 0;
            if (this.i != 0 && (o3VarArr = this.h) != null) {
                for (o3 o3Var : o3VarArr) {
                    if (o3Var != null) {
                        long j6 = ((mq2) o3Var).a;
                        if (0 <= j6 && j6 < j5) {
                            j5 = j6;
                        }
                    }
                }
            }
            if (j5 > this.q) {
                long jN2 = n() + ((long) this.r);
                int i4 = this.i;
                int iMin = this.s;
                if (i4 > 0) {
                    j2 = 1;
                    iMin = Math.min(iMin, i2 - ((int) (jN2 - j5)));
                } else {
                    j2 = 1;
                }
                long j7 = ((long) this.s) + jN2;
                if (iMin > 0) {
                    t00[] t00VarArr4 = new t00[iMin];
                    Object[] objArr = this.o;
                    objArr.getClass();
                    j3 = j5;
                    long j8 = jN2;
                    while (true) {
                        if (jN2 >= j7) {
                            t00VarArr2 = t00VarArr4;
                            i = i2;
                            j4 = j7;
                            break;
                        }
                        t00VarArr2 = t00VarArr4;
                        Object obj = objArr[((int) jN2) & (objArr.length - 1)];
                        if (obj != hh1Var) {
                            obj.getClass();
                            jq2 jq2Var = (jq2) obj;
                            i = i2;
                            int i5 = i3 + 1;
                            j4 = j7;
                            t00VarArr2[i3] = jq2Var.k;
                            p7.j(objArr, jN2, hh1Var);
                            p7.j(objArr, j8, jq2Var.j);
                            j8 += j2;
                            if (i5 >= iMin) {
                                break;
                            }
                            i3 = i5;
                        } else {
                            i = i2;
                            j4 = j7;
                        }
                        jN2 += j2;
                        t00VarArr4 = t00VarArr2;
                        i2 = i;
                        j7 = j4;
                    }
                    jN2 = j8;
                    t00VarArr = t00VarArr2;
                } else {
                    j3 = j5;
                    i = i2;
                    j4 = j7;
                    t00VarArr = t00VarArr3;
                }
                long jMax = Math.max(this.p, Math.max(jN, jN2 - ((long) this.l)));
                if (i == 0 && jMax < j4) {
                    Object[] objArr2 = this.o;
                    objArr2.getClass();
                    if (t11.l(objArr2[((int) jMax) & (objArr2.length - 1)], hh1Var)) {
                        jN2 += j2;
                        jMax += j2;
                    }
                }
                long j9 = jN2;
                t(jMax, this.i == 0 ? j9 : j3, j9, j4);
                h();
                return t00VarArr.length == 0 ? t00VarArr : l(t00VarArr);
            }
        }
        return t00VarArr3;
    }
}
