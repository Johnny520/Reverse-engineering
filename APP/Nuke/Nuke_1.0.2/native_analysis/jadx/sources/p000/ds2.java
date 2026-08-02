package p000;

import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ds2 {

    /* JADX INFO: renamed from: a */
    public static final ml2 f2179a = new ml2(19);

    /* JADX INFO: renamed from: b */
    public static final C0043b5 f2180b = new C0043b5(29);

    /* JADX INFO: renamed from: c */
    public static final Object f2181c = new Object();

    /* JADX INFO: renamed from: d */
    public static bs2 f2182d;

    /* JADX INFO: renamed from: e */
    public static long f2183e;

    /* JADX INFO: renamed from: f */
    public static final zr2 f2184f;

    /* JADX INFO: renamed from: g */
    public static final C0158e9 f2185g;

    /* JADX INFO: renamed from: h */
    public static List f2186h;

    /* JADX INFO: renamed from: i */
    public static List f2187i;

    /* JADX INFO: renamed from: j */
    public static final hq0 f2188j;

    /* JADX INFO: renamed from: k */
    public static final C0885xg f2189k;

    static {
        bs2 bs2Var = bs2.f1003l;
        f2182d = bs2Var;
        f2183e = 2L;
        zr2 zr2Var = new zr2();
        zr2Var.f14076b = new long[16];
        zr2Var.f14077c = new int[16];
        int[] iArr = new int[16];
        byte b = 0;
        int i = 0;
        while (i < 16) {
            int i2 = i + 1;
            iArr[i] = i2;
            i = i2;
        }
        zr2Var.f14078d = iArr;
        f2184f = zr2Var;
        C0158e9 c0158e9 = new C0158e9(b, 8);
        c0158e9.f2353j = new int[16];
        c0158e9.f2354k = new pd3[16];
        f2185g = c0158e9;
        be0 be0Var = be0.f819h;
        f2186h = be0Var;
        f2187i = be0Var;
        long j = f2183e;
        f2183e = 1 + j;
        hq0 hq0Var = new hq0(j, bs2Var, null, new C0251gs(25));
        f2182d = f2182d.m588e(hq0Var.f12147b);
        f2188j = hq0Var;
        f2189k = new C0885xg(0);
    }

    /* JADX INFO: renamed from: a */
    public static final void m1117a() {
        m1121e(f2179a);
    }

    /* JADX INFO: renamed from: b */
    public static final HashMap m1118b(long j, wk1 wk1Var, bs2 bs2Var) {
        long[] jArr;
        bs2 bs2Var2;
        long[] jArr2;
        bs2 bs2Var3;
        int i;
        int i2;
        ru2 ru2VarM1135s;
        sk1 sk1VarMo91x = wk1Var.mo91x();
        if (sk1VarMo91x != null) {
            long jMo79g = wk1Var.mo79g();
            bs2 bs2VarM587d = wk1Var.mo76d().m588e(jMo79g).m587d(wk1Var.f12562j);
            Object[] objArr = sk1VarMo91x.f10175b;
            long[] jArr3 = sk1VarMo91x.f10174a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i3 = 0;
                HashMap map = null;
                while (true) {
                    long j2 = jArr3[i3];
                    if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i4 = 8;
                        int i5 = 8 - ((~(i3 - length)) >>> 31);
                        int i6 = 0;
                        while (i6 < i5) {
                            if ((j2 & 255) < 128) {
                                pu2 pu2Var = (pu2) objArr[(i3 << 3) + i6];
                                ru2 ru2VarMo2588a = pu2Var.mo2588a();
                                jArr2 = jArr3;
                                i = i4;
                                i2 = i6;
                                ru2 ru2VarM1135s2 = m1135s(ru2VarMo2588a, j, bs2Var);
                                if (ru2VarM1135s2 == null || (ru2VarM1135s = m1135s(ru2VarMo2588a, jMo79g, bs2VarM587d)) == null || ru2VarM1135s2.equals(ru2VarM1135s)) {
                                    bs2Var3 = bs2VarM587d;
                                } else {
                                    bs2Var3 = bs2VarM587d;
                                    ru2 ru2VarM1135s3 = m1135s(ru2VarMo2588a, jMo79g, wk1Var.mo76d());
                                    if (ru2VarM1135s3 == null) {
                                        m1134r();
                                        throw null;
                                    }
                                    ru2 ru2VarMo2589b = pu2Var.mo2589b(ru2VarM1135s, ru2VarM1135s2, ru2VarM1135s3);
                                    if (ru2VarMo2589b == null) {
                                        return null;
                                    }
                                    if (map == null) {
                                        map = new HashMap();
                                    }
                                    map.put(ru2VarM1135s2, ru2VarMo2589b);
                                    map = map;
                                }
                            } else {
                                jArr2 = jArr3;
                                bs2Var3 = bs2VarM587d;
                                i = i4;
                                i2 = i6;
                            }
                            j2 >>= i;
                            i6 = i2 + 1;
                            i4 = i;
                            jArr3 = jArr2;
                            bs2VarM587d = bs2Var3;
                        }
                        jArr = jArr3;
                        bs2Var2 = bs2VarM587d;
                        if (i5 != i4) {
                            return map;
                        }
                    } else {
                        jArr = jArr3;
                        bs2Var2 = bs2VarM587d;
                    }
                    if (i3 == length) {
                        return map;
                    }
                    i3++;
                    jArr3 = jArr;
                    bs2VarM587d = bs2Var2;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static final void m1119c(vr2 vr2Var) {
        long j;
        if (f2182d.m586c(vr2Var.mo79g())) {
            return;
        }
        StringBuilder sb = new StringBuilder("Snapshot is not open: snapshotId=");
        sb.append(vr2Var.mo79g());
        sb.append(", disposed=");
        sb.append(vr2Var.f12148c);
        sb.append(", applied=");
        wk1 wk1Var = vr2Var instanceof wk1 ? (wk1) vr2Var : null;
        sb.append(wk1Var != null ? Boolean.valueOf(wk1Var.f12565m) : "read-only");
        sb.append(", lowestPin=");
        synchronized (f2181c) {
            zr2 zr2Var = f2184f;
            j = zr2Var.f14075a > 0 ? zr2Var.f14076b[0] : -1L;
        }
        sb.append(j);
        throw new IllegalStateException(sb.toString().toString());
    }

    /* JADX INFO: renamed from: d */
    public static final bs2 m1120d(bs2 bs2Var, long j, long j2) {
        while (t11.m5090p(j, j2) < 0) {
            bs2Var = bs2Var.m588e(j);
            j++;
        }
        return bs2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x008e  */
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m1121e(in0 in0Var) {
        sk1 sk1Var;
        Object objM1138v;
        hq0 hq0Var = f2188j;
        synchronized (f2181c) {
            try {
                sk1Var = hq0Var.f12560h;
                if (sk1Var != null) {
                    f2189k.addAndGet(1);
                }
                objM1138v = m1138v(hq0Var, in0Var);
            } catch (Throwable th) {
                throw th;
            }
        }
        if (sk1Var != null) {
            try {
                List list = f2186h;
                gd2 gd2Var = new gd2(sk1Var);
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    ((mn0) list.get(i)).mo12g(gd2Var, hq0Var);
                }
            } finally {
                f2189k.addAndGet(-1);
            }
        }
        synchronized (f2181c) {
            m1122f();
            if (sk1Var != null) {
                Object[] objArr = sk1Var.f10175b;
                long[] jArr = sk1Var.f10174a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i2 = 0;
                    while (true) {
                        long j = jArr[i2];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i3 = 8 - ((~(i2 - length)) >>> 31);
                            for (int i4 = 0; i4 < i3; i4++) {
                                if ((255 & j) < 128) {
                                    m1133q((pu2) objArr[(i2 << 3) + i4]);
                                }
                                j >>= 8;
                            }
                            if (i3 != 8) {
                                break;
                            }
                            if (i2 == length) {
                                break;
                            }
                            i2++;
                        }
                    }
                }
            }
        }
        return objM1138v;
    }

    /* JADX INFO: renamed from: f */
    public static final void m1122f() {
        C0158e9 c0158e9 = f2185g;
        int i = c0158e9.f2352i;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= i) {
                break;
            }
            pd3 pd3Var = ((pd3[]) c0158e9.f2354k)[i2];
            Object obj = pd3Var != null ? pd3Var.get() : null;
            if (obj != null && m1132p((pu2) obj)) {
                if (i3 != i2) {
                    ((pd3[]) c0158e9.f2354k)[i3] = pd3Var;
                    int[] iArr = (int[]) c0158e9.f2353j;
                    iArr[i3] = iArr[i2];
                }
                i3++;
            }
            i2++;
        }
        for (int i4 = i3; i4 < i; i4++) {
            ((pd3[]) c0158e9.f2354k)[i4] = null;
            ((int[]) c0158e9.f2353j)[i4] = 0;
        }
        if (i3 != i) {
            c0158e9.f2352i = i3;
        }
    }

    /* JADX INFO: renamed from: g */
    public static final vr2 m1123g(vr2 vr2Var, in0 in0Var, boolean z) {
        boolean z2 = vr2Var instanceof wk1;
        if (z2 || vr2Var == null) {
            return new a43(z2 ? (wk1) vr2Var : null, in0Var, null, false, z);
        }
        return new b43(vr2Var, in0Var, false, z);
    }

    /* JADX INFO: renamed from: h */
    public static final ru2 m1124h(ru2 ru2Var) {
        ru2 ru2VarM1135s;
        vr2 vr2VarM1126j = m1126j();
        ru2 ru2VarM1135s2 = m1135s(ru2Var, vr2VarM1126j.mo79g(), vr2VarM1126j.mo76d());
        if (ru2VarM1135s2 != null) {
            return ru2VarM1135s2;
        }
        synchronized (f2181c) {
            vr2 vr2VarM1126j2 = m1126j();
            ru2VarM1135s = m1135s(ru2Var, vr2VarM1126j2.mo79g(), vr2VarM1126j2.mo76d());
        }
        if (ru2VarM1135s != null) {
            return ru2VarM1135s;
        }
        m1134r();
        throw null;
    }

    /* JADX INFO: renamed from: i */
    public static final ru2 m1125i(ru2 ru2Var, vr2 vr2Var) {
        ru2 ru2VarM1135s;
        ru2 ru2VarM1135s2 = m1135s(ru2Var, vr2Var.mo79g(), vr2Var.mo76d());
        if (ru2VarM1135s2 != null) {
            return ru2VarM1135s2;
        }
        synchronized (f2181c) {
            ru2VarM1135s = m1135s(ru2Var, vr2Var.mo79g(), vr2Var.mo76d());
        }
        if (ru2VarM1135s != null) {
            return ru2VarM1135s;
        }
        m1134r();
        throw null;
    }

    /* JADX INFO: renamed from: j */
    public static final vr2 m1126j() {
        vr2 vr2Var = (vr2) f2180b.m429p();
        return vr2Var == null ? f2188j : vr2Var;
    }

    /* JADX INFO: renamed from: k */
    public static final in0 m1127k(in0 in0Var, in0 in0Var2, boolean z) {
        if (!z) {
            in0Var2 = null;
        }
        return (in0Var == null || in0Var2 == null || in0Var == in0Var2) ? in0Var == null ? in0Var2 : in0Var : new cs2(in0Var, in0Var2, 0);
    }

    /* JADX INFO: renamed from: l */
    public static final in0 m1128l(in0 in0Var, in0 in0Var2) {
        return (in0Var == null || in0Var2 == null || in0Var == in0Var2) ? in0Var == null ? in0Var2 : in0Var : new cs2(in0Var, in0Var2, 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0042, code lost:
    
        r3 = r0;
     */
    /* JADX INFO: renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final ru2 m1129m(ru2 ru2Var, pu2 pu2Var) {
        ru2 ru2VarMo2588a = pu2Var.mo2588a();
        long j = f2183e;
        zr2 zr2Var = f2184f;
        if (zr2Var.f14075a > 0) {
            j = zr2Var.f14076b[0];
        }
        long j2 = j - 1;
        ru2 ru2Var2 = null;
        ru2 ru2Var3 = null;
        while (true) {
            if (ru2VarMo2588a == null) {
                break;
            }
            long j3 = ru2VarMo2588a.f9760a;
            if (j3 == 0) {
                break;
            }
            if (j3 != 0 && t11.m5090p(j3, j2) <= 0 && !bs2.f1003l.m586c(j3)) {
                if (ru2Var3 == null) {
                    ru2Var3 = ru2VarMo2588a;
                } else {
                    if (t11.m5090p(ru2VarMo2588a.f9760a, ru2Var3.f9760a) < 0) {
                        break;
                    }
                    ru2Var2 = ru2Var3;
                }
            }
            ru2VarMo2588a = ru2VarMo2588a.f9761b;
        }
        if (ru2Var2 != null) {
            ru2Var2.f9760a = Long.MAX_VALUE;
            return ru2Var2;
        }
        ru2 ru2VarMo1718b = ru2Var.mo1718b(Long.MAX_VALUE);
        ru2VarMo1718b.f9761b = pu2Var.mo2588a();
        pu2Var.mo2590c(ru2VarMo1718b);
        return ru2VarMo1718b;
    }

    /* JADX INFO: renamed from: n */
    public static final void m1130n(vr2 vr2Var, pu2 pu2Var) {
        vr2Var.mo88t(vr2Var.mo80h() + 1);
        in0 in0VarMo81i = vr2Var.mo81i();
        if (in0VarMo81i != null) {
            in0VarMo81i.mo5j(pu2Var);
        }
    }

    /* JADX INFO: renamed from: o */
    public static final ru2 m1131o(ru2 ru2Var, qu2 qu2Var, vr2 vr2Var, ru2 ru2Var2) {
        ru2 ru2VarM1129m;
        if (vr2Var.mo78f()) {
            vr2Var.mo85n(qu2Var);
        }
        long jMo79g = vr2Var.mo79g();
        if (ru2Var2.f9760a == jMo79g) {
            return ru2Var2;
        }
        synchronized (f2181c) {
            ru2VarM1129m = m1129m(ru2Var, qu2Var);
        }
        ru2VarM1129m.f9760a = jMo79g;
        if (ru2Var2.f9760a != 1) {
            vr2Var.mo85n(qu2Var);
        }
        return ru2VarM1129m;
    }

    /* JADX INFO: renamed from: p */
    public static final boolean m1132p(pu2 pu2Var) {
        ru2 ru2Var;
        long j = f2183e;
        zr2 zr2Var = f2184f;
        if (zr2Var.f14075a > 0) {
            j = zr2Var.f14076b[0];
        }
        ru2 ru2Var2 = null;
        ru2 ru2VarMo2588a = null;
        int i = 0;
        for (ru2 ru2VarMo2588a2 = pu2Var.mo2588a(); ru2VarMo2588a2 != null; ru2VarMo2588a2 = ru2VarMo2588a2.f9761b) {
            long j2 = ru2VarMo2588a2.f9760a;
            if (j2 != 0) {
                if (t11.m5090p(j2, j) >= 0) {
                    i++;
                } else if (ru2Var2 == null) {
                    i++;
                    ru2Var2 = ru2VarMo2588a2;
                } else {
                    if (t11.m5090p(ru2VarMo2588a2.f9760a, ru2Var2.f9760a) < 0) {
                        ru2Var = ru2Var2;
                        ru2Var2 = ru2VarMo2588a2;
                    } else {
                        ru2Var = ru2VarMo2588a2;
                    }
                    if (ru2VarMo2588a == null) {
                        ru2VarMo2588a = pu2Var.mo2588a();
                        ru2 ru2Var3 = ru2VarMo2588a;
                        while (true) {
                            if (ru2VarMo2588a == null) {
                                ru2VarMo2588a = ru2Var3;
                                break;
                            }
                            if (t11.m5090p(ru2VarMo2588a.f9760a, j) >= 0) {
                                break;
                            }
                            if (t11.m5090p(ru2Var3.f9760a, ru2VarMo2588a.f9760a) < 0) {
                                ru2Var3 = ru2VarMo2588a;
                            }
                            ru2VarMo2588a = ru2VarMo2588a.f9761b;
                        }
                    }
                    ru2Var2.f9760a = 0L;
                    ru2Var2.mo1717a(ru2VarMo2588a);
                    ru2Var2 = ru2Var;
                }
            }
        }
        return i > 1;
    }

    /* JADX INFO: renamed from: q */
    public static final void m1133q(pu2 pu2Var) {
        if (m1132p(pu2Var)) {
            C0158e9 c0158e9 = f2185g;
            int i = c0158e9.f2352i;
            int iIdentityHashCode = System.identityHashCode(pu2Var);
            int i2 = -1;
            if (i > 0) {
                int i3 = c0158e9.f2352i - 1;
                int i4 = 0;
                while (true) {
                    if (i4 > i3) {
                        i2 = -(i4 + 1);
                        break;
                    }
                    int i5 = (i4 + i3) >>> 1;
                    int i6 = ((int[]) c0158e9.f2353j)[i5];
                    if (i6 < iIdentityHashCode) {
                        i4 = i5 + 1;
                    } else if (i6 > iIdentityHashCode) {
                        i3 = i5 - 1;
                    } else {
                        pd3 pd3Var = ((pd3[]) c0158e9.f2354k)[i5];
                        if (pu2Var == (pd3Var != null ? pd3Var.get() : null)) {
                            i2 = i5;
                        } else {
                            for (int i7 = i5 - 1; -1 < i7 && ((int[]) c0158e9.f2353j)[i7] == iIdentityHashCode; i7--) {
                                pd3 pd3Var2 = ((pd3[]) c0158e9.f2354k)[i7];
                                if ((pd3Var2 != null ? pd3Var2.get() : null) == pu2Var) {
                                    i2 = i7;
                                    break;
                                }
                            }
                            i5++;
                            int i8 = c0158e9.f2352i;
                            while (true) {
                                if (i5 >= i8) {
                                    i2 = -(c0158e9.f2352i + 1);
                                    break;
                                } else {
                                    if (((int[]) c0158e9.f2353j)[i5] != iIdentityHashCode) {
                                        i2 = -(i5 + 1);
                                        break;
                                    }
                                    pd3 pd3Var3 = ((pd3[]) c0158e9.f2354k)[i5];
                                    if ((pd3Var3 != null ? pd3Var3.get() : null) == pu2Var) {
                                        break;
                                    } else {
                                        i5++;
                                    }
                                }
                            }
                            i2 = i5;
                        }
                    }
                }
                if (i2 >= 0) {
                    return;
                }
            }
            int i9 = -(i2 + 1);
            pd3[] pd3VarArr = (pd3[]) c0158e9.f2354k;
            int length = pd3VarArr.length;
            if (i == length) {
                int i10 = length * 2;
                pd3[] pd3VarArr2 = new pd3[i10];
                int[] iArr = new int[i10];
                int i11 = i9 + 1;
                System.arraycopy(pd3VarArr, i9, pd3VarArr2, i11, i - i9);
                System.arraycopy((pd3[]) c0158e9.f2354k, 0, pd3VarArr2, 0, i9);
                AbstractC0460mg.m3086a0((int[]) c0158e9.f2353j, iArr, i11, i9, i);
                AbstractC0460mg.m3090e0((int[]) c0158e9.f2353j, iArr, 0, i9, 6);
                c0158e9.f2354k = pd3VarArr2;
                c0158e9.f2353j = iArr;
            } else {
                int i12 = i9 + 1;
                System.arraycopy(pd3VarArr, i9, pd3VarArr, i12, i - i9);
                int[] iArr2 = (int[]) c0158e9.f2353j;
                AbstractC0460mg.m3086a0(iArr2, iArr2, i12, i9, i);
            }
            ((pd3[]) c0158e9.f2354k)[i9] = new pd3(pu2Var);
            ((int[]) c0158e9.f2353j)[i9] = iIdentityHashCode;
            c0158e9.f2352i++;
        }
    }

    /* JADX INFO: renamed from: r */
    public static final void m1134r() {
        throw new IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied");
    }

    /* JADX INFO: renamed from: s */
    public static final ru2 m1135s(ru2 ru2Var, long j, bs2 bs2Var) {
        ru2 ru2Var2 = null;
        while (ru2Var != null) {
            long j2 = ru2Var.f9760a;
            if (j2 != 0 && t11.m5090p(j2, j) <= 0 && !bs2Var.m586c(j2) && (ru2Var2 == null || t11.m5090p(ru2Var2.f9760a, ru2Var.f9760a) < 0)) {
                ru2Var2 = ru2Var;
            }
            ru2Var = ru2Var.f9761b;
        }
        if (ru2Var2 != null) {
            return ru2Var2;
        }
        return null;
    }

    /* JADX INFO: renamed from: t */
    public static final ru2 m1136t(ru2 ru2Var, pu2 pu2Var) {
        ru2 ru2VarM1135s;
        vr2 vr2VarM1126j = m1126j();
        in0 in0VarMo77e = vr2VarM1126j.mo77e();
        if (in0VarMo77e != null) {
            in0VarMo77e.mo5j(pu2Var);
        }
        ru2 ru2VarM1135s2 = m1135s(ru2Var, vr2VarM1126j.mo79g(), vr2VarM1126j.mo76d());
        if (ru2VarM1135s2 != null) {
            return ru2VarM1135s2;
        }
        synchronized (f2181c) {
            vr2 vr2VarM1126j2 = m1126j();
            ru2 ru2VarMo2588a = pu2Var.mo2588a();
            ru2VarMo2588a.getClass();
            ru2VarM1135s = m1135s(ru2VarMo2588a, vr2VarM1126j2.mo79g(), vr2VarM1126j2.mo76d());
            if (ru2VarM1135s == null) {
                m1134r();
                throw null;
            }
        }
        return ru2VarM1135s;
    }

    /* JADX INFO: renamed from: u */
    public static final void m1137u(int i) {
        zr2 zr2Var = f2184f;
        int i2 = zr2Var.f14078d[i];
        zr2Var.m6503b(i2, zr2Var.f14075a - 1);
        zr2Var.f14075a--;
        long[] jArr = zr2Var.f14076b;
        long j = jArr[i2];
        int i3 = i2;
        while (i3 > 0) {
            int i4 = ((i3 + 1) >> 1) - 1;
            if (t11.m5090p(jArr[i4], j) <= 0) {
                break;
            }
            zr2Var.m6503b(i4, i3);
            i3 = i4;
        }
        long[] jArr2 = zr2Var.f14076b;
        int i5 = zr2Var.f14075a >> 1;
        while (i2 < i5) {
            int i6 = (i2 + 1) << 1;
            int i7 = i6 - 1;
            if (i6 < zr2Var.f14075a && t11.m5090p(jArr2[i6], jArr2[i7]) < 0) {
                if (t11.m5090p(jArr2[i6], jArr2[i2]) >= 0) {
                    break;
                }
                zr2Var.m6503b(i6, i2);
                i2 = i6;
            } else {
                if (t11.m5090p(jArr2[i7], jArr2[i2]) >= 0) {
                    break;
                }
                zr2Var.m6503b(i7, i2);
                i2 = i7;
            }
        }
        zr2Var.f14078d[i] = zr2Var.f14079e;
        zr2Var.f14079e = i;
    }

    /* JADX INFO: renamed from: v */
    public static final Object m1138v(hq0 hq0Var, in0 in0Var) {
        long j = hq0Var.f12147b;
        Object objMo5j = in0Var.mo5j(f2182d.m585b(j));
        long j2 = f2183e;
        f2183e = 1 + j2;
        bs2 bs2VarM585b = f2182d.m585b(j);
        f2182d = bs2VarM585b;
        hq0Var.f12147b = j2;
        hq0Var.f12146a = bs2VarM585b;
        hq0Var.f12559g = 0;
        hq0Var.f12560h = null;
        hq0Var.m5788o();
        f2182d = f2182d.m588e(j2);
        return objMo5j;
    }

    /* JADX INFO: renamed from: w */
    public static final ru2 m1139w(ru2 ru2Var, pu2 pu2Var, vr2 vr2Var) {
        ru2 ru2VarM1135s;
        if (vr2Var.mo78f()) {
            vr2Var.mo85n(pu2Var);
        }
        long jMo79g = vr2Var.mo79g();
        ru2 ru2VarM1135s2 = m1135s(ru2Var, jMo79g, vr2Var.mo76d());
        if (ru2VarM1135s2 == null) {
            m1134r();
            throw null;
        }
        if (ru2VarM1135s2.f9760a == vr2Var.mo79g()) {
            return ru2VarM1135s2;
        }
        synchronized (f2181c) {
            ru2VarM1135s = m1135s(pu2Var.mo2588a(), jMo79g, vr2Var.mo76d());
            if (ru2VarM1135s == null) {
                m1134r();
                throw null;
            }
            if (ru2VarM1135s.f9760a != jMo79g) {
                ru2 ru2VarM1129m = m1129m(ru2VarM1135s, pu2Var);
                ru2VarM1129m.mo1717a(ru2VarM1135s);
                ru2VarM1129m.f9760a = vr2Var.mo79g();
                ru2VarM1135s = ru2VarM1129m;
            }
        }
        if (ru2VarM1135s2.f9760a != 1) {
            vr2Var.mo85n(pu2Var);
        }
        return ru2VarM1135s;
    }
}
