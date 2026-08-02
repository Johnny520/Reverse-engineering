package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public class wk1 extends vr2 {
    public static final int[] n = new int[0];
    public final in0 e;
    public final in0 f;
    public int g;
    public sk1 h;
    public ArrayList i;
    public bs2 j;
    public int[] k;
    public int l;
    public boolean m;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public wk1(long j, bs2 bs2Var, in0 in0Var, in0 in0Var2) {
        super(j, bs2Var);
        this.e = in0Var;
        this.f = in0Var2;
        this.j = bs2.l;
        this.k = n;
        this.l = 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void A(long j) {
        synchronized (ds2.c) {
            this.j = this.j.e(j);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void B(sk1 sk1Var) {
        this.h = sk1Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public wk1 C(in0 in0Var, in0 in0Var2) {
        om1 om1Var;
        if (this.c) {
            j22.a("Cannot use a disposed snapshot");
        }
        if (this.m && this.d < 0) {
            j22.b("Unsupported operation on a disposed or applied snapshot");
        }
        A(g());
        Object obj = ds2.c;
        synchronized (obj) {
            long j = ds2.e;
            ds2.e = j + 1;
            ds2.d = ds2.d.e(j);
            bs2 bs2VarD = d();
            r(bs2VarD.e(j));
            om1Var = new om1(j, ds2.d(bs2VarD, g() + 1, j), ds2.k(in0Var, e(), true), ds2.l(in0Var2, i()), this);
        }
        if (this.m || this.c) {
            return om1Var;
        }
        long jG = g();
        synchronized (obj) {
            long j2 = ds2.e;
            ds2.e = j2 + 1;
            s(j2);
            ds2.d = ds2.d.e(g());
        }
        r(ds2.d(d(), jG + 1, g()));
        return om1Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.vr2
    public final void b() {
        ds2.d = ds2.d.b(g()).a(this.j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.vr2
    public void c() {
        if (this.c) {
            return;
        }
        this.c = true;
        synchronized (ds2.c) {
            o();
        }
        l();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.vr2
    public boolean f() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.vr2
    public int h() {
        return this.g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.vr2
    public in0 i() {
        return this.f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.vr2
    public void k() {
        this.l++;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008c  */
    @Override // defpackage.vr2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void l() {
        if (this.l <= 0) {
            j22.a("no pending nested snapshots");
        }
        int i = this.l - 1;
        this.l = i;
        if (i != 0 || this.m) {
            return;
        }
        sk1 sk1VarX = x();
        if (sk1VarX != null) {
            if (this.m) {
                j22.b("Unsupported operation on a snapshot that has been applied");
            }
            B(null);
            long jG = g();
            Object[] objArr = sk1VarX.b;
            long[] jArr = sk1VarX.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i2 = 0;
                while (true) {
                    long j = jArr[i2];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i3 = 8 - ((~(i2 - length)) >>> 31);
                        for (int i4 = 0; i4 < i3; i4++) {
                            if ((255 & j) < 128) {
                                for (ru2 ru2VarA = ((pu2) objArr[(i2 << 3) + i4]).a(); ru2VarA != null; ru2VarA = ru2VarA.b) {
                                    long j2 = ru2VarA.a;
                                    if (j2 == jG || du.m0(this.j, Long.valueOf(j2))) {
                                        ml2 ml2Var = ds2.a;
                                        ru2VarA.a = 0L;
                                    }
                                }
                            }
                            j >>= 8;
                        }
                        if (i3 != 8) {
                            break;
                        } else if (i2 == length) {
                            break;
                        } else {
                            i2++;
                        }
                    }
                }
            }
        }
        a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.vr2
    public void m() {
        if (this.m || this.c) {
            return;
        }
        v();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.vr2
    public void n(pu2 pu2Var) {
        sk1 sk1VarX = x();
        if (sk1VarX == null) {
            sk1 sk1Var = fd2.a;
            sk1VarX = new sk1();
            B(sk1VarX);
        }
        sk1VarX.a(pu2Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.vr2
    public final void p() {
        int length = this.k.length;
        for (int i = 0; i < length; i++) {
            ds2.u(this.k[i]);
        }
        o();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.vr2
    public void t(int i) {
        this.g = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.vr2
    public vr2 u(in0 in0Var) {
        pm1 pm1Var;
        if (this.c) {
            j22.a("Cannot use a disposed snapshot");
        }
        if (this.m && this.d < 0) {
            j22.b("Unsupported operation on a disposed or applied snapshot");
        }
        long jG = g();
        A(g());
        Object obj = ds2.c;
        synchronized (obj) {
            long j = ds2.e;
            ds2.e = j + 1;
            ds2.d = ds2.d.e(j);
            pm1Var = new pm1(j, ds2.d(d(), jG + 1, j), ds2.k(in0Var, e(), true), this);
        }
        if (this.m || this.c) {
            return pm1Var;
        }
        long jG2 = g();
        synchronized (obj) {
            long j2 = ds2.e;
            ds2.e = j2 + 1;
            s(j2);
            ds2.d = ds2.d.e(g());
        }
        r(ds2.d(d(), jG2 + 1, g()));
        return pm1Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void v() {
        A(g());
        if (this.m || this.c) {
            return;
        }
        long jG = g();
        synchronized (ds2.c) {
            long j = ds2.e;
            ds2.e = j + 1;
            s(j);
            ds2.d = ds2.d.e(g());
        }
        r(ds2.d(d(), jG + 1, g()));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0145  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public p40 w() {
        HashMap mapB;
        List list;
        sk1 sk1Var;
        long j;
        long j2;
        sk1 sk1VarX = x();
        if (sk1VarX != null) {
            long j3 = ds2.j.b;
            mapB = ds2.b(j3, this, ds2.d.b(j3));
        } else {
            mapB = null;
        }
        be0 be0Var = be0.h;
        synchronized (ds2.c) {
            try {
                ds2.c(this);
                if (sk1VarX == null || sk1VarX.d == 0) {
                    b();
                    hq0 hq0Var = ds2.j;
                    sk1 sk1Var2 = hq0Var.h;
                    ds2.v(hq0Var, ds2.a);
                    if (sk1Var2 == null || !sk1Var2.h()) {
                        list = be0Var;
                        sk1Var = null;
                    } else {
                        list = ds2.h;
                        sk1Var = sk1Var2;
                    }
                } else {
                    hq0 hq0Var2 = ds2.j;
                    p40 p40VarZ = z(ds2.e, sk1VarX, mapB, ds2.d.b(hq0Var2.b));
                    if (!p40VarZ.equals(yr2.n)) {
                        return p40VarZ;
                    }
                    b();
                    sk1Var = hq0Var2.h;
                    ds2.v(hq0Var2, ds2.a);
                    B(null);
                    hq0Var2.h = null;
                    list = ds2.h;
                }
                this.m = true;
                if (sk1Var != null) {
                    gd2 gd2Var = new gd2(sk1Var);
                    if (!sk1Var.g()) {
                        int size = list.size();
                        for (int i = 0; i < size; i++) {
                            ((mn0) list.get(i)).g(gd2Var, this);
                        }
                    }
                }
                if (sk1VarX != null && sk1VarX.h()) {
                    gd2 gd2Var2 = new gd2(sk1VarX);
                    int size2 = list.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        ((mn0) list.get(i2)).g(gd2Var2, this);
                    }
                }
                synchronized (ds2.c) {
                    try {
                        p();
                        ds2.f();
                        if (sk1Var != null) {
                            Object[] objArr = sk1Var.b;
                            long[] jArr = sk1Var.a;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                int i3 = 0;
                                j = 128;
                                while (true) {
                                    long j4 = jArr[i3];
                                    j2 = 255;
                                    if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i4 = 8 - ((~(i3 - length)) >>> 31);
                                        for (int i5 = 0; i5 < i4; i5++) {
                                            if ((j4 & 255) < 128) {
                                                ds2.q((pu2) objArr[(i3 << 3) + i5]);
                                            }
                                            j4 >>= 8;
                                        }
                                        if (i4 != 8) {
                                            break;
                                        }
                                        if (i3 == length) {
                                            break;
                                        }
                                        i3++;
                                    }
                                }
                            } else {
                                j = 128;
                                j2 = 255;
                            }
                        }
                        if (sk1VarX != null) {
                            Object[] objArr2 = sk1VarX.b;
                            long[] jArr2 = sk1VarX.a;
                            int length2 = jArr2.length - 2;
                            if (length2 >= 0) {
                                int i6 = 0;
                                while (true) {
                                    long j5 = jArr2[i6];
                                    if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i7 = 8 - ((~(i6 - length2)) >>> 31);
                                        for (int i8 = 0; i8 < i7; i8++) {
                                            if ((j5 & j2) < j) {
                                                ds2.q((pu2) objArr2[(i6 << 3) + i8]);
                                            }
                                            j5 >>= 8;
                                        }
                                        if (i7 != 8) {
                                            break;
                                        }
                                        if (i6 == length2) {
                                            break;
                                        }
                                        i6++;
                                    }
                                }
                            }
                        }
                        ArrayList arrayList = this.i;
                        if (arrayList != null) {
                            int size3 = arrayList.size();
                            for (int i9 = 0; i9 < size3; i9++) {
                                ds2.q((pu2) arrayList.get(i9));
                            }
                        }
                        this.i = null;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return yr2.n;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public sk1 x() {
        return this.h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method merged with bridge method: e()Lin0; */
    @Override // defpackage.vr2
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public in0 e() {
        return this.e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final p40 z(long j, sk1 sk1Var, HashMap map, bs2 bs2Var) {
        ArrayList arrayList;
        ArrayList arrayListX0;
        ArrayList arrayList2;
        bs2 bs2Var2;
        Object[] objArr;
        long[] jArr;
        bs2 bs2Var3;
        Object[] objArr2;
        long[] jArr2;
        int i;
        long j2;
        ArrayList arrayList3;
        ru2 ru2VarB;
        bs2 bs2VarD = d().e(g()).d(this.j);
        Object[] objArr3 = sk1Var.b;
        long[] jArr3 = sk1Var.a;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i2 = 0;
            arrayList2 = null;
            arrayListX0 = null;
            while (true) {
                long j3 = jArr3[i2];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    int i4 = 0;
                    while (i4 < i3) {
                        if ((j3 & 255) < 128) {
                            objArr2 = objArr3;
                            pu2 pu2Var = (pu2) objArr3[(i2 << 3) + i4];
                            jArr2 = jArr3;
                            ru2 ru2VarA = pu2Var.a();
                            i = i4;
                            ArrayList arrayList4 = arrayList2;
                            ru2 ru2VarS = ds2.s(ru2VarA, j, bs2Var);
                            if (ru2VarS == null) {
                                arrayList3 = arrayListX0;
                                j2 = j3;
                            } else {
                                arrayList3 = arrayListX0;
                                j2 = j3;
                                ru2 ru2VarS2 = ds2.s(ru2VarA, g(), bs2VarD);
                                if (ru2VarS2 != null && ru2VarS2.a != 1 && !ru2VarS.equals(ru2VarS2)) {
                                    bs2Var3 = bs2VarD;
                                    ru2 ru2VarS3 = ds2.s(ru2VarA, g(), d());
                                    if (ru2VarS3 == null) {
                                        ds2.r();
                                        throw null;
                                    }
                                    if (map == null || (ru2VarB = (ru2) map.get(ru2VarS)) == null) {
                                        ru2VarB = pu2Var.b(ru2VarS2, ru2VarS, ru2VarS3);
                                    }
                                    if (ru2VarB == null) {
                                        return new xr2(this);
                                    }
                                    if (!ru2VarB.equals(ru2VarS3)) {
                                        if (ru2VarB.equals(ru2VarS)) {
                                            ArrayList arrayList5 = arrayList4 == null ? new ArrayList() : arrayList4;
                                            arrayList5.add(new ow1(pu2Var, ru2VarS.b(g())));
                                            arrayListX0 = arrayList3 == null ? new ArrayList() : arrayList3;
                                            arrayListX0.add(pu2Var);
                                            arrayList2 = arrayList5;
                                        } else {
                                            arrayList2 = arrayList4 == null ? new ArrayList() : arrayList4;
                                            arrayList2.add(!ru2VarB.equals(ru2VarS2) ? new ow1(pu2Var, ru2VarB) : new ow1(pu2Var, ru2VarS2.b(g())));
                                        }
                                    }
                                    arrayListX0 = arrayList3;
                                }
                                arrayList2 = arrayList4;
                                arrayListX0 = arrayList3;
                            }
                            bs2Var3 = bs2VarD;
                            arrayList2 = arrayList4;
                            arrayListX0 = arrayList3;
                        } else {
                            bs2Var3 = bs2VarD;
                            objArr2 = objArr3;
                            jArr2 = jArr3;
                            i = i4;
                            j2 = j3;
                        }
                        j3 = j2 >> 8;
                        i4 = i + 1;
                        jArr3 = jArr2;
                        objArr3 = objArr2;
                        bs2VarD = bs2Var3;
                    }
                    bs2Var2 = bs2VarD;
                    objArr = objArr3;
                    jArr = jArr3;
                    if (i3 != 8) {
                        break;
                    }
                } else {
                    bs2Var2 = bs2VarD;
                    objArr = objArr3;
                    jArr = jArr3;
                }
                if (i2 == length) {
                    arrayList = arrayList2;
                    break;
                }
                i2++;
                jArr3 = jArr;
                objArr3 = objArr;
                bs2VarD = bs2Var2;
            }
        } else {
            arrayList = null;
            arrayListX0 = null;
        }
        arrayList2 = arrayList;
        if (arrayList2 != null) {
            v();
            int size = arrayList2.size();
            for (int i5 = 0; i5 < size; i5++) {
                ow1 ow1Var = (ow1) arrayList2.get(i5);
                pu2 pu2Var2 = (pu2) ow1Var.h;
                ru2 ru2Var = (ru2) ow1Var.i;
                ru2Var.a = j;
                synchronized (ds2.c) {
                    ru2Var.b = pu2Var2.a();
                    pu2Var2.c(ru2Var);
                }
            }
        }
        if (arrayListX0 != null) {
            int size2 = arrayListX0.size();
            for (int i6 = 0; i6 < size2; i6++) {
                sk1Var.l((pu2) arrayListX0.get(i6));
            }
            ArrayList arrayList6 = this.i;
            if (arrayList6 != null) {
                arrayListX0 = du.x0(arrayList6, arrayListX0);
            }
            this.i = arrayListX0;
        }
        return yr2.n;
    }
}
