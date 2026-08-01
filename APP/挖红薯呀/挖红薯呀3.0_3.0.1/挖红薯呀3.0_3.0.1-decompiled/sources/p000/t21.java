package p000;

import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class t21 {

    /* JADX INFO: renamed from: a */
    public static final sx0 f5891a = new sx0(15);

    /* JADX INFO: renamed from: b */
    public static final C0541o8 f5892b = new C0541o8(9);

    /* JADX INFO: renamed from: c */
    public static final Object f5893c = new Object();

    /* JADX INFO: renamed from: d */
    public static q21 f5894d;

    /* JADX INFO: renamed from: e */
    public static long f5895e;

    /* JADX INFO: renamed from: f */
    public static final ng0 f5896f;

    /* JADX INFO: renamed from: g */
    public static final C0791u5 f5897g;

    /* JADX INFO: renamed from: h */
    public static List f5898h;

    /* JADX INFO: renamed from: i */
    public static List f5899i;

    /* JADX INFO: renamed from: j */
    public static final C0668qx f5900j;

    /* JADX INFO: renamed from: k */
    public static final C0238g9 f5901k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        q21 q21Var = q21.f5028h;
        f5894d = q21Var;
        f5895e = 2L;
        ng0 ng0Var = new ng0();
        ng0Var.f4260c = new long[16];
        ng0Var.f4261d = new int[16];
        int[] iArr = new int[16];
        int i = 0;
        while (i < 16) {
            int i2 = i + 1;
            iArr[i] = i2;
            i = i2;
        }
        ng0Var.f4262e = iArr;
        f5896f = ng0Var;
        C0791u5 c0791u5 = new C0791u5();
        c0791u5.f6135b = new int[16];
        c0791u5.f6136c = new bd1[16];
        f5897g = c0791u5;
        C0294hs c0294hs = C0294hs.f2354d;
        f5898h = c0294hs;
        f5899i = c0294hs;
        long j = f5895e;
        f5895e = 1 + j;
        C0668qx c0668qx = new C0668qx(j, q21Var, null, new C0621pn(22));
        f5894d = f5894d.m3193e(c0668qx.f3330b);
        f5900j = c0668qx;
        f5901k = new C0238g9(0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final void m4163a() {
        m4167e(f5891a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static final HashMap m4164b(long j, nh0 nh0Var, q21 q21Var) {
        long[] jArr;
        q21 q21Var2;
        long[] jArr2;
        q21 q21Var3;
        int i;
        int i2;
        f41 f41VarM4181s;
        kh0 kh0VarMo823x = nh0Var.mo823x();
        if (kh0VarMo823x != null) {
            long jMo811g = nh0Var.mo811g();
            q21 q21VarM3192d = nh0Var.mo808d().m3193e(jMo811g).m3192d(nh0Var.f4270j);
            Object[] objArr = kh0VarMo823x.f3151b;
            long[] jArr3 = kh0VarMo823x.f3150a;
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
                                d41 d41Var = (d41) objArr[(i3 << 3) + i6];
                                f41 f41VarMo440a = d41Var.mo440a();
                                jArr2 = jArr3;
                                i = i4;
                                i2 = i6;
                                f41 f41VarM4181s2 = m4181s(f41VarMo440a, j, q21Var);
                                if (f41VarM4181s2 == null || (f41VarM4181s = m4181s(f41VarMo440a, jMo811g, q21VarM3192d)) == null || f41VarM4181s2.equals(f41VarM4181s)) {
                                    q21Var3 = q21VarM3192d;
                                } else {
                                    q21Var3 = q21VarM3192d;
                                    f41 f41VarM4181s3 = m4181s(f41VarMo440a, jMo811g, nh0Var.mo808d());
                                    if (f41VarM4181s3 == null) {
                                        m4180r();
                                        throw null;
                                    }
                                    f41 f41VarMo594b = d41Var.mo594b(f41VarM4181s, f41VarM4181s2, f41VarM4181s3);
                                    if (f41VarMo594b == null) {
                                        return null;
                                    }
                                    if (map == null) {
                                        map = new HashMap();
                                    }
                                    map.put(f41VarM4181s2, f41VarMo594b);
                                    map = map;
                                }
                            } else {
                                jArr2 = jArr3;
                                q21Var3 = q21VarM3192d;
                                i = i4;
                                i2 = i6;
                            }
                            j2 >>= i;
                            i6 = i2 + 1;
                            i4 = i;
                            jArr3 = jArr2;
                            q21VarM3192d = q21Var3;
                        }
                        jArr = jArr3;
                        q21Var2 = q21VarM3192d;
                        if (i5 != i4) {
                            return map;
                        }
                    } else {
                        jArr = jArr3;
                        q21Var2 = q21VarM3192d;
                    }
                    if (i3 == length) {
                        return map;
                    }
                    i3++;
                    jArr3 = jArr;
                    q21VarM3192d = q21Var2;
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static final void m4165c(l21 l21Var) {
        long j;
        if (f5894d.m3191c(l21Var.mo811g())) {
            return;
        }
        StringBuilder sb = new StringBuilder("Snapshot is not open: snapshotId=");
        sb.append(l21Var.mo811g());
        sb.append(", disposed=");
        sb.append(l21Var.f3331c);
        sb.append(", applied=");
        nh0 nh0Var = l21Var instanceof nh0 ? (nh0) l21Var : null;
        sb.append(nh0Var != null ? Boolean.valueOf(nh0Var.f4273m) : "read-only");
        sb.append(", lowestPin=");
        synchronized (f5893c) {
            ng0 ng0Var = f5896f;
            j = ng0Var.f4258a > 0 ? ((long[]) ng0Var.f4260c)[0] : -1L;
        }
        sb.append(j);
        throw new IllegalStateException(sb.toString().toString());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static final q21 m4166d(q21 q21Var, long j, long j2) {
        while (p30.m3009s(j, j2) < 0) {
            q21Var = q21Var.m3193e(j);
            j++;
        }
        return q21Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:42:0x008e  */
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m4167e(InterfaceC0742sw interfaceC0742sw) {
        kh0 kh0Var;
        Object objM4184v;
        C0668qx c0668qx = f5900j;
        synchronized (f5893c) {
            try {
                kh0Var = c0668qx.f4268h;
                if (kh0Var != null) {
                    f5901k.addAndGet(1);
                }
                objM4184v = m4184v(c0668qx, interfaceC0742sw);
            } catch (Throwable th) {
                throw th;
            }
        }
        if (kh0Var != null) {
            try {
                List list = f5898h;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    ((InterfaceC0904ww) list.get(i)).invoke(new fy0(kh0Var), c0668qx);
                }
            } finally {
                f5901k.addAndGet(-1);
            }
        }
        synchronized (f5893c) {
            m4168f();
            if (kh0Var != null) {
                Object[] objArr = kh0Var.f3151b;
                long[] jArr = kh0Var.f3150a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i2 = 0;
                    while (true) {
                        long j = jArr[i2];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i3 = 8 - ((~(i2 - length)) >>> 31);
                            for (int i4 = 0; i4 < i3; i4++) {
                                if ((255 & j) < 128) {
                                    m4179q((d41) objArr[(i2 << 3) + i4]);
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
        return objM4184v;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static final void m4168f() {
        C0791u5 c0791u5 = f5897g;
        int i = c0791u5.f6134a;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= i) {
                break;
            }
            bd1 bd1Var = ((bd1[]) c0791u5.f6136c)[i2];
            Object obj = bd1Var != null ? bd1Var.get() : null;
            if (obj != null && m4178p((d41) obj)) {
                if (i3 != i2) {
                    ((bd1[]) c0791u5.f6136c)[i3] = bd1Var;
                    int[] iArr = (int[]) c0791u5.f6135b;
                    iArr[i3] = iArr[i2];
                }
                i3++;
            }
            i2++;
        }
        for (int i4 = i3; i4 < i; i4++) {
            ((bd1[]) c0791u5.f6136c)[i4] = null;
            ((int[]) c0791u5.f6135b)[i4] = 0;
        }
        if (i3 != i) {
            c0791u5.f6134a = i3;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static final l21 m4169g(l21 l21Var, InterfaceC0742sw interfaceC0742sw, boolean z) {
        boolean z2 = l21Var instanceof nh0;
        if (z2 || l21Var == null) {
            return new e91(z2 ? (nh0) l21Var : null, interfaceC0742sw, null, false, z);
        }
        return new f91(l21Var, interfaceC0742sw, false, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static final f41 m4170h(f41 f41Var) {
        f41 f41VarM4181s;
        l21 l21VarM4172j = m4172j();
        f41 f41VarM4181s2 = m4181s(f41Var, l21VarM4172j.mo811g(), l21VarM4172j.mo808d());
        if (f41VarM4181s2 != null) {
            return f41VarM4181s2;
        }
        synchronized (f5893c) {
            l21 l21VarM4172j2 = m4172j();
            f41VarM4181s = m4181s(f41Var, l21VarM4172j2.mo811g(), l21VarM4172j2.mo808d());
        }
        if (f41VarM4181s != null) {
            return f41VarM4181s;
        }
        m4180r();
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public static final f41 m4171i(f41 f41Var, l21 l21Var) {
        f41 f41VarM4181s;
        f41 f41VarM4181s2 = m4181s(f41Var, l21Var.mo811g(), l21Var.mo808d());
        if (f41VarM4181s2 != null) {
            return f41VarM4181s2;
        }
        synchronized (f5893c) {
            f41VarM4181s = m4181s(f41Var, l21Var.mo811g(), l21Var.mo808d());
        }
        if (f41VarM4181s != null) {
            return f41VarM4181s;
        }
        m4180r();
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public static final l21 m4172j() {
        l21 l21Var = (l21) f5892b.m2801e();
        return l21Var == null ? f5900j : l21Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public static final InterfaceC0742sw m4173k(InterfaceC0742sw interfaceC0742sw, InterfaceC0742sw interfaceC0742sw2, boolean z) {
        if (!z) {
            interfaceC0742sw2 = null;
        }
        return (interfaceC0742sw == null || interfaceC0742sw2 == null || interfaceC0742sw == interfaceC0742sw2) ? interfaceC0742sw == null ? interfaceC0742sw2 : interfaceC0742sw : new r21(interfaceC0742sw, interfaceC0742sw2, 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public static final InterfaceC0742sw m4174l(InterfaceC0742sw interfaceC0742sw, InterfaceC0742sw interfaceC0742sw2) {
        return (interfaceC0742sw == null || interfaceC0742sw2 == null || interfaceC0742sw == interfaceC0742sw2) ? interfaceC0742sw == null ? interfaceC0742sw2 : interfaceC0742sw : new r21(interfaceC0742sw, interfaceC0742sw2, 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0043, code lost:
    
        r3 = r0;
     */
    /* JADX INFO: renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final f41 m4175m(f41 f41Var, d41 d41Var) {
        f41 f41VarMo440a = d41Var.mo440a();
        long j = f5895e;
        ng0 ng0Var = f5896f;
        if (ng0Var.f4258a > 0) {
            j = ((long[]) ng0Var.f4260c)[0];
        }
        long j2 = j - 1;
        f41 f41Var2 = null;
        f41 f41Var3 = null;
        while (true) {
            if (f41VarMo440a == null) {
                break;
            }
            long j3 = f41VarMo440a.f1577a;
            if (j3 == 0) {
                break;
            }
            if (j3 != 0 && p30.m3009s(j3, j2) <= 0 && !q21.f5028h.m3191c(j3)) {
                if (f41Var3 == null) {
                    f41Var3 = f41VarMo440a;
                } else {
                    if (p30.m3009s(f41VarMo440a.f1577a, f41Var3.f1577a) < 0) {
                        break;
                    }
                    f41Var2 = f41Var3;
                }
            }
            f41VarMo440a = f41VarMo440a.f1578b;
        }
        if (f41Var2 != null) {
            f41Var2.f1577a = Long.MAX_VALUE;
            return f41Var2;
        }
        f41 f41VarMo486b = f41Var.mo486b(Long.MAX_VALUE);
        f41VarMo486b.f1578b = d41Var.mo440a();
        d41Var.mo441c(f41VarMo486b);
        return f41VarMo486b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public static final void m4176n(l21 l21Var, d41 d41Var) {
        l21Var.mo820t(l21Var.mo812h() + 1);
        InterfaceC0742sw interfaceC0742swMo813i = l21Var.mo813i();
        if (interfaceC0742swMo813i != null) {
            interfaceC0742swMo813i.invoke(d41Var);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public static final f41 m4177o(f41 f41Var, e41 e41Var, l21 l21Var, f41 f41Var2) {
        f41 f41VarM4175m;
        if (l21Var.mo810f()) {
            l21Var.mo817n(e41Var);
        }
        long jMo811g = l21Var.mo811g();
        if (f41Var2.f1577a == jMo811g) {
            return f41Var2;
        }
        synchronized (f5893c) {
            f41VarM4175m = m4175m(f41Var, e41Var);
        }
        f41VarM4175m.f1577a = jMo811g;
        if (f41Var2.f1577a != 1) {
            l21Var.mo817n(e41Var);
        }
        return f41VarM4175m;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public static final boolean m4178p(d41 d41Var) {
        f41 f41Var;
        long j = f5895e;
        ng0 ng0Var = f5896f;
        if (ng0Var.f4258a > 0) {
            j = ((long[]) ng0Var.f4260c)[0];
        }
        f41 f41Var2 = null;
        f41 f41VarMo440a = null;
        int i = 0;
        for (f41 f41VarMo440a2 = d41Var.mo440a(); f41VarMo440a2 != null; f41VarMo440a2 = f41VarMo440a2.f1578b) {
            long j2 = f41VarMo440a2.f1577a;
            if (j2 != 0) {
                if (p30.m3009s(j2, j) >= 0) {
                    i++;
                } else if (f41Var2 == null) {
                    i++;
                    f41Var2 = f41VarMo440a2;
                } else {
                    if (p30.m3009s(f41VarMo440a2.f1577a, f41Var2.f1577a) < 0) {
                        f41Var = f41Var2;
                        f41Var2 = f41VarMo440a2;
                    } else {
                        f41Var = f41VarMo440a2;
                    }
                    if (f41VarMo440a == null) {
                        f41VarMo440a = d41Var.mo440a();
                        f41 f41Var3 = f41VarMo440a;
                        while (true) {
                            if (f41VarMo440a == null) {
                                f41VarMo440a = f41Var3;
                                break;
                            }
                            if (p30.m3009s(f41VarMo440a.f1577a, j) >= 0) {
                                break;
                            }
                            if (p30.m3009s(f41Var3.f1577a, f41VarMo440a.f1577a) < 0) {
                                f41Var3 = f41VarMo440a;
                            }
                            f41VarMo440a = f41VarMo440a.f1578b;
                        }
                    }
                    f41Var2.f1577a = 0L;
                    f41Var2.mo485a(f41VarMo440a);
                    f41Var2 = f41Var;
                }
            }
        }
        return i > 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public static final void m4179q(d41 d41Var) {
        if (m4178p(d41Var)) {
            C0791u5 c0791u5 = f5897g;
            int i = c0791u5.f6134a;
            int iIdentityHashCode = System.identityHashCode(d41Var);
            int i2 = -1;
            if (i > 0) {
                int i3 = c0791u5.f6134a - 1;
                int i4 = 0;
                while (true) {
                    if (i4 > i3) {
                        i2 = -(i4 + 1);
                        break;
                    }
                    int i5 = (i4 + i3) >>> 1;
                    int i6 = ((int[]) c0791u5.f6135b)[i5];
                    if (i6 < iIdentityHashCode) {
                        i4 = i5 + 1;
                    } else if (i6 > iIdentityHashCode) {
                        i3 = i5 - 1;
                    } else {
                        bd1 bd1Var = ((bd1[]) c0791u5.f6136c)[i5];
                        if (d41Var == (bd1Var != null ? bd1Var.get() : null)) {
                            i2 = i5;
                        } else {
                            for (int i7 = i5 - 1; -1 < i7 && ((int[]) c0791u5.f6135b)[i7] == iIdentityHashCode; i7--) {
                                bd1 bd1Var2 = ((bd1[]) c0791u5.f6136c)[i7];
                                if ((bd1Var2 != null ? bd1Var2.get() : null) == d41Var) {
                                    i2 = i7;
                                    break;
                                }
                            }
                            i5++;
                            int i8 = c0791u5.f6134a;
                            while (true) {
                                if (i5 >= i8) {
                                    i2 = -(c0791u5.f6134a + 1);
                                    break;
                                } else {
                                    if (((int[]) c0791u5.f6135b)[i5] != iIdentityHashCode) {
                                        i2 = -(i5 + 1);
                                        break;
                                    }
                                    bd1 bd1Var3 = ((bd1[]) c0791u5.f6136c)[i5];
                                    if ((bd1Var3 != null ? bd1Var3.get() : null) == d41Var) {
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
            bd1[] bd1VarArr = (bd1[]) c0791u5.f6136c;
            int length = bd1VarArr.length;
            if (i == length) {
                int i10 = length * 2;
                bd1[] bd1VarArr2 = new bd1[i10];
                int[] iArr = new int[i10];
                int i11 = i9 + 1;
                System.arraycopy(bd1VarArr, i9, bd1VarArr2, i11, i - i9);
                System.arraycopy((bd1[]) c0791u5.f6136c, 0, bd1VarArr2, 0, i9);
                AbstractC0201f9.m1055a0((int[]) c0791u5.f6135b, iArr, i11, i9, i);
                AbstractC0201f9.m1058d0((int[]) c0791u5.f6135b, iArr, 0, i9, 6);
                c0791u5.f6136c = bd1VarArr2;
                c0791u5.f6135b = iArr;
            } else {
                int i12 = i9 + 1;
                System.arraycopy(bd1VarArr, i9, bd1VarArr, i12, i - i9);
                int[] iArr2 = (int[]) c0791u5.f6135b;
                AbstractC0201f9.m1055a0(iArr2, iArr2, i12, i9, i);
            }
            ((bd1[]) c0791u5.f6136c)[i9] = new bd1(d41Var);
            ((int[]) c0791u5.f6135b)[i9] = iIdentityHashCode;
            c0791u5.f6134a++;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r */
    public static final void m4180r() {
        throw new IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s */
    public static final f41 m4181s(f41 f41Var, long j, q21 q21Var) {
        f41 f41Var2 = null;
        while (f41Var != null) {
            long j2 = f41Var.f1577a;
            if (j2 != 0 && p30.m3009s(j2, j) <= 0 && !q21Var.m3191c(j2) && (f41Var2 == null || p30.m3009s(f41Var2.f1577a, f41Var.f1577a) < 0)) {
                f41Var2 = f41Var;
            }
            f41Var = f41Var.f1578b;
        }
        if (f41Var2 != null) {
            return f41Var2;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: t */
    public static final f41 m4182t(f41 f41Var, d41 d41Var) {
        f41 f41VarM4181s;
        l21 l21VarM4172j = m4172j();
        InterfaceC0742sw interfaceC0742swMo809e = l21VarM4172j.mo809e();
        if (interfaceC0742swMo809e != null) {
            interfaceC0742swMo809e.invoke(d41Var);
        }
        f41 f41VarM4181s2 = m4181s(f41Var, l21VarM4172j.mo811g(), l21VarM4172j.mo808d());
        if (f41VarM4181s2 != null) {
            return f41VarM4181s2;
        }
        synchronized (f5893c) {
            l21 l21VarM4172j2 = m4172j();
            f41 f41VarMo440a = d41Var.mo440a();
            f41VarMo440a.getClass();
            f41VarM4181s = m4181s(f41VarMo440a, l21VarM4172j2.mo811g(), l21VarM4172j2.mo808d());
            if (f41VarM4181s == null) {
                m4180r();
                throw null;
            }
        }
        return f41VarM4181s;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: u */
    public static final void m4183u(int i) {
        ng0 ng0Var = f5896f;
        int i2 = ((int[]) ng0Var.f4262e)[i];
        ng0Var.m2704c(i2, ng0Var.f4258a - 1);
        ng0Var.f4258a--;
        long[] jArr = (long[]) ng0Var.f4260c;
        long j = jArr[i2];
        int i3 = i2;
        while (i3 > 0) {
            int i4 = ((i3 + 1) >> 1) - 1;
            if (p30.m3009s(jArr[i4], j) <= 0) {
                break;
            }
            ng0Var.m2704c(i4, i3);
            i3 = i4;
        }
        long[] jArr2 = (long[]) ng0Var.f4260c;
        int i5 = ng0Var.f4258a >> 1;
        while (i2 < i5) {
            int i6 = (i2 + 1) << 1;
            int i7 = i6 - 1;
            if (i6 < ng0Var.f4258a && p30.m3009s(jArr2[i6], jArr2[i7]) < 0) {
                if (p30.m3009s(jArr2[i6], jArr2[i2]) >= 0) {
                    break;
                }
                ng0Var.m2704c(i6, i2);
                i2 = i6;
            } else {
                if (p30.m3009s(jArr2[i7], jArr2[i2]) >= 0) {
                    break;
                }
                ng0Var.m2704c(i7, i2);
                i2 = i7;
            }
        }
        ((int[]) ng0Var.f4262e)[i] = ng0Var.f4259b;
        ng0Var.f4259b = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: v */
    public static final Object m4184v(C0668qx c0668qx, InterfaceC0742sw interfaceC0742sw) {
        long j = c0668qx.f3330b;
        Object objInvoke = interfaceC0742sw.invoke(f5894d.m3190b(j));
        long j2 = f5895e;
        f5895e = 1 + j2;
        q21 q21VarM3190b = f5894d.m3190b(j);
        f5894d = q21VarM3190b;
        c0668qx.f3330b = j2;
        c0668qx.f3329a = q21VarM3190b;
        c0668qx.f4267g = 0;
        c0668qx.f4268h = null;
        c0668qx.m1970o();
        f5894d = f5894d.m3193e(j2);
        return objInvoke;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: w */
    public static final f41 m4185w(f41 f41Var, d41 d41Var, l21 l21Var) {
        f41 f41VarM4181s;
        if (l21Var.mo810f()) {
            l21Var.mo817n(d41Var);
        }
        long jMo811g = l21Var.mo811g();
        f41 f41VarM4181s2 = m4181s(f41Var, jMo811g, l21Var.mo808d());
        if (f41VarM4181s2 == null) {
            m4180r();
            throw null;
        }
        if (f41VarM4181s2.f1577a == l21Var.mo811g()) {
            return f41VarM4181s2;
        }
        synchronized (f5893c) {
            f41VarM4181s = m4181s(d41Var.mo440a(), jMo811g, l21Var.mo808d());
            if (f41VarM4181s == null) {
                m4180r();
                throw null;
            }
            if (f41VarM4181s.f1577a != jMo811g) {
                f41 f41VarM4175m = m4175m(f41VarM4181s, d41Var);
                f41VarM4175m.mo485a(f41VarM4181s);
                f41VarM4175m.f1577a = l21Var.mo811g();
                f41VarM4181s = f41VarM4175m;
            }
        }
        if (f41VarM4181s2.f1577a != 1) {
            l21Var.mo817n(d41Var);
        }
        return f41VarM4181s;
    }
}
