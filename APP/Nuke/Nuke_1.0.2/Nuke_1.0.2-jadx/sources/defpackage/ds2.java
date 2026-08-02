package defpackage;

import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ds2 {
    public static final ml2 a = new ml2(19);
    public static final b5 b = new b5(29);
    public static final Object c = new Object();
    public static bs2 d;
    public static long e;
    public static final zr2 f;
    public static final e9 g;
    public static List h;
    public static List i;
    public static final hq0 j;
    public static final xg k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        bs2 bs2Var = bs2.l;
        d = bs2Var;
        e = 2L;
        zr2 zr2Var = new zr2();
        zr2Var.b = new long[16];
        zr2Var.c = new int[16];
        int[] iArr = new int[16];
        byte b2 = 0;
        int i2 = 0;
        while (i2 < 16) {
            int i3 = i2 + 1;
            iArr[i2] = i3;
            i2 = i3;
        }
        zr2Var.d = iArr;
        f = zr2Var;
        e9 e9Var = new e9(b2, 8);
        e9Var.j = new int[16];
        e9Var.k = new pd3[16];
        g = e9Var;
        be0 be0Var = be0.h;
        h = be0Var;
        i = be0Var;
        long j2 = e;
        e = 1 + j2;
        hq0 hq0Var = new hq0(j2, bs2Var, null, new gs(25));
        d = d.e(hq0Var.b);
        j = hq0Var;
        k = new xg(0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void a() {
        e(a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final HashMap b(long j2, wk1 wk1Var, bs2 bs2Var) {
        long[] jArr;
        bs2 bs2Var2;
        long[] jArr2;
        bs2 bs2Var3;
        int i2;
        int i3;
        ru2 ru2VarS;
        sk1 sk1VarX = wk1Var.x();
        if (sk1VarX != null) {
            long jG = wk1Var.g();
            bs2 bs2VarD = wk1Var.d().e(jG).d(wk1Var.j);
            Object[] objArr = sk1VarX.b;
            long[] jArr3 = sk1VarX.a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i4 = 0;
                HashMap map = null;
                while (true) {
                    long j3 = jArr3[i4];
                    if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i5 = 8;
                        int i6 = 8 - ((~(i4 - length)) >>> 31);
                        int i7 = 0;
                        while (i7 < i6) {
                            if ((j3 & 255) < 128) {
                                pu2 pu2Var = (pu2) objArr[(i4 << 3) + i7];
                                ru2 ru2VarA = pu2Var.a();
                                jArr2 = jArr3;
                                i2 = i5;
                                i3 = i7;
                                ru2 ru2VarS2 = s(ru2VarA, j2, bs2Var);
                                if (ru2VarS2 == null || (ru2VarS = s(ru2VarA, jG, bs2VarD)) == null || ru2VarS2.equals(ru2VarS)) {
                                    bs2Var3 = bs2VarD;
                                } else {
                                    bs2Var3 = bs2VarD;
                                    ru2 ru2VarS3 = s(ru2VarA, jG, wk1Var.d());
                                    if (ru2VarS3 == null) {
                                        r();
                                        throw null;
                                    }
                                    ru2 ru2VarB = pu2Var.b(ru2VarS, ru2VarS2, ru2VarS3);
                                    if (ru2VarB == null) {
                                        return null;
                                    }
                                    if (map == null) {
                                        map = new HashMap();
                                    }
                                    map.put(ru2VarS2, ru2VarB);
                                    map = map;
                                }
                            } else {
                                jArr2 = jArr3;
                                bs2Var3 = bs2VarD;
                                i2 = i5;
                                i3 = i7;
                            }
                            j3 >>= i2;
                            i7 = i3 + 1;
                            i5 = i2;
                            jArr3 = jArr2;
                            bs2VarD = bs2Var3;
                        }
                        jArr = jArr3;
                        bs2Var2 = bs2VarD;
                        if (i6 != i5) {
                            return map;
                        }
                    } else {
                        jArr = jArr3;
                        bs2Var2 = bs2VarD;
                    }
                    if (i4 == length) {
                        return map;
                    }
                    i4++;
                    jArr3 = jArr;
                    bs2VarD = bs2Var2;
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void c(vr2 vr2Var) {
        long j2;
        if (d.c(vr2Var.g())) {
            return;
        }
        StringBuilder sb = new StringBuilder("Snapshot is not open: snapshotId=");
        sb.append(vr2Var.g());
        sb.append(", disposed=");
        sb.append(vr2Var.c);
        sb.append(", applied=");
        wk1 wk1Var = vr2Var instanceof wk1 ? (wk1) vr2Var : null;
        sb.append(wk1Var != null ? Boolean.valueOf(wk1Var.m) : "read-only");
        sb.append(", lowestPin=");
        synchronized (c) {
            zr2 zr2Var = f;
            j2 = zr2Var.a > 0 ? zr2Var.b[0] : -1L;
        }
        sb.append(j2);
        throw new IllegalStateException(sb.toString().toString());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final bs2 d(bs2 bs2Var, long j2, long j3) {
        while (t11.p(j2, j3) < 0) {
            bs2Var = bs2Var.e(j2);
            j2++;
        }
        return bs2Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:42:0x008e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object e(in0 in0Var) {
        sk1 sk1Var;
        Object objV;
        hq0 hq0Var = j;
        synchronized (c) {
            try {
                sk1Var = hq0Var.h;
                if (sk1Var != null) {
                    k.addAndGet(1);
                }
                objV = v(hq0Var, in0Var);
            } catch (Throwable th) {
                throw th;
            }
        }
        if (sk1Var != null) {
            try {
                List list = h;
                gd2 gd2Var = new gd2(sk1Var);
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((mn0) list.get(i2)).g(gd2Var, hq0Var);
                }
            } finally {
                k.addAndGet(-1);
            }
        }
        synchronized (c) {
            f();
            if (sk1Var != null) {
                Object[] objArr = sk1Var.b;
                long[] jArr = sk1Var.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i3 = 0;
                    while (true) {
                        long j2 = jArr[i3];
                        if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i4 = 8 - ((~(i3 - length)) >>> 31);
                            for (int i5 = 0; i5 < i4; i5++) {
                                if ((255 & j2) < 128) {
                                    q((pu2) objArr[(i3 << 3) + i5]);
                                }
                                j2 >>= 8;
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
                }
            }
        }
        return objV;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void f() {
        e9 e9Var = g;
        int i2 = e9Var.i;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i3 >= i2) {
                break;
            }
            pd3 pd3Var = ((pd3[]) e9Var.k)[i3];
            Object obj = pd3Var != null ? pd3Var.get() : null;
            if (obj != null && p((pu2) obj)) {
                if (i4 != i3) {
                    ((pd3[]) e9Var.k)[i4] = pd3Var;
                    int[] iArr = (int[]) e9Var.j;
                    iArr[i4] = iArr[i3];
                }
                i4++;
            }
            i3++;
        }
        for (int i5 = i4; i5 < i2; i5++) {
            ((pd3[]) e9Var.k)[i5] = null;
            ((int[]) e9Var.j)[i5] = 0;
        }
        if (i4 != i2) {
            e9Var.i = i4;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final vr2 g(vr2 vr2Var, in0 in0Var, boolean z) {
        boolean z2 = vr2Var instanceof wk1;
        if (z2 || vr2Var == null) {
            return new a43(z2 ? (wk1) vr2Var : null, in0Var, null, false, z);
        }
        return new b43(vr2Var, in0Var, false, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final ru2 h(ru2 ru2Var) {
        ru2 ru2VarS;
        vr2 vr2VarJ = j();
        ru2 ru2VarS2 = s(ru2Var, vr2VarJ.g(), vr2VarJ.d());
        if (ru2VarS2 != null) {
            return ru2VarS2;
        }
        synchronized (c) {
            vr2 vr2VarJ2 = j();
            ru2VarS = s(ru2Var, vr2VarJ2.g(), vr2VarJ2.d());
        }
        if (ru2VarS != null) {
            return ru2VarS;
        }
        r();
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final ru2 i(ru2 ru2Var, vr2 vr2Var) {
        ru2 ru2VarS;
        ru2 ru2VarS2 = s(ru2Var, vr2Var.g(), vr2Var.d());
        if (ru2VarS2 != null) {
            return ru2VarS2;
        }
        synchronized (c) {
            ru2VarS = s(ru2Var, vr2Var.g(), vr2Var.d());
        }
        if (ru2VarS != null) {
            return ru2VarS;
        }
        r();
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final vr2 j() {
        vr2 vr2Var = (vr2) b.p();
        return vr2Var == null ? j : vr2Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final in0 k(in0 in0Var, in0 in0Var2, boolean z) {
        if (!z) {
            in0Var2 = null;
        }
        return (in0Var == null || in0Var2 == null || in0Var == in0Var2) ? in0Var == null ? in0Var2 : in0Var : new cs2(in0Var, in0Var2, 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final in0 l(in0 in0Var, in0 in0Var2) {
        return (in0Var == null || in0Var2 == null || in0Var == in0Var2) ? in0Var == null ? in0Var2 : in0Var : new cs2(in0Var, in0Var2, 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0042, code lost:
    
        r3 = r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final ru2 m(ru2 ru2Var, pu2 pu2Var) {
        ru2 ru2VarA = pu2Var.a();
        long j2 = e;
        zr2 zr2Var = f;
        if (zr2Var.a > 0) {
            j2 = zr2Var.b[0];
        }
        long j3 = j2 - 1;
        ru2 ru2Var2 = null;
        ru2 ru2Var3 = null;
        while (true) {
            if (ru2VarA == null) {
                break;
            }
            long j4 = ru2VarA.a;
            if (j4 == 0) {
                break;
            }
            if (j4 != 0 && t11.p(j4, j3) <= 0 && !bs2.l.c(j4)) {
                if (ru2Var3 == null) {
                    ru2Var3 = ru2VarA;
                } else {
                    if (t11.p(ru2VarA.a, ru2Var3.a) < 0) {
                        break;
                    }
                    ru2Var2 = ru2Var3;
                }
            }
            ru2VarA = ru2VarA.b;
        }
        if (ru2Var2 != null) {
            ru2Var2.a = Long.MAX_VALUE;
            return ru2Var2;
        }
        ru2 ru2VarB = ru2Var.b(Long.MAX_VALUE);
        ru2VarB.b = pu2Var.a();
        pu2Var.c(ru2VarB);
        return ru2VarB;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void n(vr2 vr2Var, pu2 pu2Var) {
        vr2Var.t(vr2Var.h() + 1);
        in0 in0VarI = vr2Var.i();
        if (in0VarI != null) {
            in0VarI.j(pu2Var);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final ru2 o(ru2 ru2Var, qu2 qu2Var, vr2 vr2Var, ru2 ru2Var2) {
        ru2 ru2VarM;
        if (vr2Var.f()) {
            vr2Var.n(qu2Var);
        }
        long jG = vr2Var.g();
        if (ru2Var2.a == jG) {
            return ru2Var2;
        }
        synchronized (c) {
            ru2VarM = m(ru2Var, qu2Var);
        }
        ru2VarM.a = jG;
        if (ru2Var2.a != 1) {
            vr2Var.n(qu2Var);
        }
        return ru2VarM;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean p(pu2 pu2Var) {
        ru2 ru2Var;
        long j2 = e;
        zr2 zr2Var = f;
        if (zr2Var.a > 0) {
            j2 = zr2Var.b[0];
        }
        ru2 ru2Var2 = null;
        ru2 ru2VarA = null;
        int i2 = 0;
        for (ru2 ru2VarA2 = pu2Var.a(); ru2VarA2 != null; ru2VarA2 = ru2VarA2.b) {
            long j3 = ru2VarA2.a;
            if (j3 != 0) {
                if (t11.p(j3, j2) >= 0) {
                    i2++;
                } else if (ru2Var2 == null) {
                    i2++;
                    ru2Var2 = ru2VarA2;
                } else {
                    if (t11.p(ru2VarA2.a, ru2Var2.a) < 0) {
                        ru2Var = ru2Var2;
                        ru2Var2 = ru2VarA2;
                    } else {
                        ru2Var = ru2VarA2;
                    }
                    if (ru2VarA == null) {
                        ru2VarA = pu2Var.a();
                        ru2 ru2Var3 = ru2VarA;
                        while (true) {
                            if (ru2VarA == null) {
                                ru2VarA = ru2Var3;
                                break;
                            }
                            if (t11.p(ru2VarA.a, j2) >= 0) {
                                break;
                            }
                            if (t11.p(ru2Var3.a, ru2VarA.a) < 0) {
                                ru2Var3 = ru2VarA;
                            }
                            ru2VarA = ru2VarA.b;
                        }
                    }
                    ru2Var2.a = 0L;
                    ru2Var2.a(ru2VarA);
                    ru2Var2 = ru2Var;
                }
            }
        }
        return i2 > 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void q(pu2 pu2Var) {
        if (p(pu2Var)) {
            e9 e9Var = g;
            int i2 = e9Var.i;
            int iIdentityHashCode = System.identityHashCode(pu2Var);
            int i3 = -1;
            if (i2 > 0) {
                int i4 = e9Var.i - 1;
                int i5 = 0;
                while (true) {
                    if (i5 > i4) {
                        i3 = -(i5 + 1);
                        break;
                    }
                    int i6 = (i5 + i4) >>> 1;
                    int i7 = ((int[]) e9Var.j)[i6];
                    if (i7 < iIdentityHashCode) {
                        i5 = i6 + 1;
                    } else if (i7 > iIdentityHashCode) {
                        i4 = i6 - 1;
                    } else {
                        pd3 pd3Var = ((pd3[]) e9Var.k)[i6];
                        if (pu2Var == (pd3Var != null ? pd3Var.get() : null)) {
                            i3 = i6;
                        } else {
                            for (int i8 = i6 - 1; -1 < i8 && ((int[]) e9Var.j)[i8] == iIdentityHashCode; i8--) {
                                pd3 pd3Var2 = ((pd3[]) e9Var.k)[i8];
                                if ((pd3Var2 != null ? pd3Var2.get() : null) == pu2Var) {
                                    i3 = i8;
                                    break;
                                }
                            }
                            i6++;
                            int i9 = e9Var.i;
                            while (true) {
                                if (i6 >= i9) {
                                    i3 = -(e9Var.i + 1);
                                    break;
                                } else {
                                    if (((int[]) e9Var.j)[i6] != iIdentityHashCode) {
                                        i3 = -(i6 + 1);
                                        break;
                                    }
                                    pd3 pd3Var3 = ((pd3[]) e9Var.k)[i6];
                                    if ((pd3Var3 != null ? pd3Var3.get() : null) == pu2Var) {
                                        break;
                                    } else {
                                        i6++;
                                    }
                                }
                            }
                            i3 = i6;
                        }
                    }
                }
                if (i3 >= 0) {
                    return;
                }
            }
            int i10 = -(i3 + 1);
            pd3[] pd3VarArr = (pd3[]) e9Var.k;
            int length = pd3VarArr.length;
            if (i2 == length) {
                int i11 = length * 2;
                pd3[] pd3VarArr2 = new pd3[i11];
                int[] iArr = new int[i11];
                int i12 = i10 + 1;
                System.arraycopy(pd3VarArr, i10, pd3VarArr2, i12, i2 - i10);
                System.arraycopy((pd3[]) e9Var.k, 0, pd3VarArr2, 0, i10);
                mg.a0((int[]) e9Var.j, iArr, i12, i10, i2);
                mg.e0((int[]) e9Var.j, iArr, 0, i10, 6);
                e9Var.k = pd3VarArr2;
                e9Var.j = iArr;
            } else {
                int i13 = i10 + 1;
                System.arraycopy(pd3VarArr, i10, pd3VarArr, i13, i2 - i10);
                int[] iArr2 = (int[]) e9Var.j;
                mg.a0(iArr2, iArr2, i13, i10, i2);
            }
            ((pd3[]) e9Var.k)[i10] = new pd3(pu2Var);
            ((int[]) e9Var.j)[i10] = iIdentityHashCode;
            e9Var.i++;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void r() {
        throw new IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final ru2 s(ru2 ru2Var, long j2, bs2 bs2Var) {
        ru2 ru2Var2 = null;
        while (ru2Var != null) {
            long j3 = ru2Var.a;
            if (j3 != 0 && t11.p(j3, j2) <= 0 && !bs2Var.c(j3) && (ru2Var2 == null || t11.p(ru2Var2.a, ru2Var.a) < 0)) {
                ru2Var2 = ru2Var;
            }
            ru2Var = ru2Var.b;
        }
        if (ru2Var2 != null) {
            return ru2Var2;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final ru2 t(ru2 ru2Var, pu2 pu2Var) {
        ru2 ru2VarS;
        vr2 vr2VarJ = j();
        in0 in0VarE = vr2VarJ.e();
        if (in0VarE != null) {
            in0VarE.j(pu2Var);
        }
        ru2 ru2VarS2 = s(ru2Var, vr2VarJ.g(), vr2VarJ.d());
        if (ru2VarS2 != null) {
            return ru2VarS2;
        }
        synchronized (c) {
            vr2 vr2VarJ2 = j();
            ru2 ru2VarA = pu2Var.a();
            ru2VarA.getClass();
            ru2VarS = s(ru2VarA, vr2VarJ2.g(), vr2VarJ2.d());
            if (ru2VarS == null) {
                r();
                throw null;
            }
        }
        return ru2VarS;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void u(int i2) {
        zr2 zr2Var = f;
        int i3 = zr2Var.d[i2];
        zr2Var.b(i3, zr2Var.a - 1);
        zr2Var.a--;
        long[] jArr = zr2Var.b;
        long j2 = jArr[i3];
        int i4 = i3;
        while (i4 > 0) {
            int i5 = ((i4 + 1) >> 1) - 1;
            if (t11.p(jArr[i5], j2) <= 0) {
                break;
            }
            zr2Var.b(i5, i4);
            i4 = i5;
        }
        long[] jArr2 = zr2Var.b;
        int i6 = zr2Var.a >> 1;
        while (i3 < i6) {
            int i7 = (i3 + 1) << 1;
            int i8 = i7 - 1;
            if (i7 < zr2Var.a && t11.p(jArr2[i7], jArr2[i8]) < 0) {
                if (t11.p(jArr2[i7], jArr2[i3]) >= 0) {
                    break;
                }
                zr2Var.b(i7, i3);
                i3 = i7;
            } else {
                if (t11.p(jArr2[i8], jArr2[i3]) >= 0) {
                    break;
                }
                zr2Var.b(i8, i3);
                i3 = i8;
            }
        }
        zr2Var.d[i2] = zr2Var.e;
        zr2Var.e = i2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final Object v(hq0 hq0Var, in0 in0Var) {
        long j2 = hq0Var.b;
        Object objJ = in0Var.j(d.b(j2));
        long j3 = e;
        e = 1 + j3;
        bs2 bs2VarB = d.b(j2);
        d = bs2VarB;
        hq0Var.b = j3;
        hq0Var.a = bs2VarB;
        hq0Var.g = 0;
        hq0Var.h = null;
        hq0Var.o();
        d = d.e(j3);
        return objJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final ru2 w(ru2 ru2Var, pu2 pu2Var, vr2 vr2Var) {
        ru2 ru2VarS;
        if (vr2Var.f()) {
            vr2Var.n(pu2Var);
        }
        long jG = vr2Var.g();
        ru2 ru2VarS2 = s(ru2Var, jG, vr2Var.d());
        if (ru2VarS2 == null) {
            r();
            throw null;
        }
        if (ru2VarS2.a == vr2Var.g()) {
            return ru2VarS2;
        }
        synchronized (c) {
            ru2VarS = s(pu2Var.a(), jG, vr2Var.d());
            if (ru2VarS == null) {
                r();
                throw null;
            }
            if (ru2VarS.a != jG) {
                ru2 ru2VarM = m(ru2VarS, pu2Var);
                ru2VarM.a(ru2VarS);
                ru2VarM.a = vr2Var.g();
                ru2VarS = ru2VarM;
            }
        }
        if (ru2VarS2.a != 1) {
            vr2Var.n(pu2Var);
        }
        return ru2VarS;
    }
}
