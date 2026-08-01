package p158f0;

import java.util.HashMap;
import p000A.C0072l0;
import p049I2.C0793k;
import p061L2.AbstractC0972l;
import p061L2.C0981u;
import p092S0.C1286x;
import p112W2.InterfaceC1601c;
import p117X2.AbstractC1665j;
import p136b0.C1839a;
import p136b0.C1852n;
import p186k.C2409F;

/* JADX INFO: renamed from: f0.n */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2082n {

    /* JADX INFO: renamed from: a */
    public static final C1286x f6970a = new C1286x(24);

    /* JADX INFO: renamed from: b */
    public static final C0072l0 f6971b = new C0072l0(16);

    /* JADX INFO: renamed from: c */
    public static final Object f6972c = new Object();

    /* JADX INFO: renamed from: d */
    public static C2080l f6973d;

    /* JADX INFO: renamed from: e */
    public static long f6974e;

    /* JADX INFO: renamed from: f */
    public static final C2078j f6975f;

    /* JADX INFO: renamed from: g */
    public static final C0793k f6976g;

    /* JADX INFO: renamed from: h */
    public static Object f6977h;

    /* JADX INFO: renamed from: i */
    public static Object f6978i;

    /* JADX INFO: renamed from: j */
    public static final C2069a f6979j;

    /* JADX INFO: renamed from: k */
    public static final C1839a f6980k;

    static {
        C2080l c2080l = C2080l.f6962h;
        f6973d = c2080l;
        long j5 = 1;
        f6974e = j5 + j5;
        C2078j c2078j = new C2078j();
        c2078j.f6952b = new long[16];
        c2078j.f6953c = new int[16];
        int[] iArr = new int[16];
        int i5 = 0;
        while (i5 < 16) {
            int i6 = i5 + 1;
            iArr[i5] = i6;
            i5 = i6;
        }
        c2078j.f6954d = iArr;
        f6975f = c2078j;
        C0793k c0793k = new C0793k((byte) 0, 5);
        c0793k.f2538f = new int[16];
        c0793k.f2539g = new C1852n[16];
        f6976g = c0793k;
        C0981u c0981u = C0981u.f3047d;
        f6977h = c0981u;
        f6978i = c0981u;
        long j6 = f6974e;
        f6974e = j5 + j6;
        C2069a c2069a = new C2069a(j6, c2080l, null, new C1286x(23));
        f6973d = f6973d.m3824e(c2069a.f6946b);
        f6979j = c2069a;
        f6980k = new C1839a(0);
    }

    /* JADX INFO: renamed from: a */
    public static final void m3825a() {
        m3829e(f6970a);
    }

    /* JADX INFO: renamed from: b */
    public static final HashMap m3826b(long j5, C2070b c2070b, C2080l c2080l) {
        long[] jArr;
        C2080l c2080l2;
        long[] jArr2;
        C2080l c2080l3;
        int i5;
        int i6;
        AbstractC2092x abstractC2092xM3843s;
        C2409F c2409fMo3808x = c2070b.mo3808x();
        if (c2409fMo3808x != null) {
            long jMo3791g = c2070b.mo3791g();
            C2080l c2080lM3823d = c2070b.mo3788d().m3824e(jMo3791g).m3823d(c2070b.f6935j);
            Object[] objArr = c2409fMo3808x.f7794b;
            long[] jArr3 = c2409fMo3808x.f7793a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i7 = 0;
                HashMap map = null;
                while (true) {
                    long j6 = jArr3[i7];
                    if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i8 = 8;
                        int i9 = 8 - ((~(i7 - length)) >>> 31);
                        int i10 = 0;
                        while (i10 < i9) {
                            if ((j6 & 255) < 128) {
                                InterfaceC2090v interfaceC2090v = (InterfaceC2090v) objArr[(i7 << 3) + i10];
                                AbstractC2092x abstractC2092xMo2410a = interfaceC2090v.mo2410a();
                                jArr2 = jArr3;
                                i5 = i8;
                                i6 = i10;
                                AbstractC2092x abstractC2092xM3843s2 = m3843s(abstractC2092xMo2410a, j5, c2080l);
                                if (abstractC2092xM3843s2 == null || (abstractC2092xM3843s = m3843s(abstractC2092xMo2410a, jMo3791g, c2080lM3823d)) == null || abstractC2092xM3843s2.equals(abstractC2092xM3843s)) {
                                    c2080l3 = c2080lM3823d;
                                } else {
                                    c2080l3 = c2080lM3823d;
                                    AbstractC2092x abstractC2092xM3843s3 = m3843s(abstractC2092xMo2410a, jMo3791g, c2070b.mo3788d());
                                    if (abstractC2092xM3843s3 == null) {
                                        m3842r();
                                        throw null;
                                    }
                                    AbstractC2092x abstractC2092xMo2505b = interfaceC2090v.mo2505b(abstractC2092xM3843s, abstractC2092xM3843s2, abstractC2092xM3843s3);
                                    if (abstractC2092xMo2505b == null) {
                                        return null;
                                    }
                                    if (map == null) {
                                        map = new HashMap();
                                    }
                                    map.put(abstractC2092xM3843s2, abstractC2092xMo2505b);
                                    map = map;
                                }
                            } else {
                                jArr2 = jArr3;
                                c2080l3 = c2080lM3823d;
                                i5 = i8;
                                i6 = i10;
                            }
                            j6 >>= i5;
                            i10 = i6 + 1;
                            i8 = i5;
                            jArr3 = jArr2;
                            c2080lM3823d = c2080l3;
                        }
                        jArr = jArr3;
                        c2080l2 = c2080lM3823d;
                        if (i9 != i8) {
                            return map;
                        }
                    } else {
                        jArr = jArr3;
                        c2080l2 = c2080lM3823d;
                    }
                    if (i7 == length) {
                        return map;
                    }
                    i7++;
                    jArr3 = jArr;
                    c2080lM3823d = c2080l2;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static final void m3827c(AbstractC2074f abstractC2074f) {
        long j5;
        if (f6973d.m3822c(abstractC2074f.mo3791g())) {
            return;
        }
        StringBuilder sb = new StringBuilder("Snapshot is not open: snapshotId=");
        sb.append(abstractC2074f.mo3791g());
        sb.append(", disposed=");
        sb.append(abstractC2074f.f6947c);
        sb.append(", applied=");
        C2070b c2070b = abstractC2074f instanceof C2070b ? (C2070b) abstractC2074f : null;
        sb.append(c2070b != null ? Boolean.valueOf(c2070b.f6938m) : "read-only");
        sb.append(", lowestPin=");
        synchronized (f6972c) {
            C2078j c2078j = f6975f;
            j5 = c2078j.f6951a > 0 ? c2078j.f6952b[0] : -1L;
        }
        sb.append(j5);
        throw new IllegalStateException(sb.toString().toString());
    }

    /* JADX INFO: renamed from: d */
    public static final C2080l m3828d(C2080l c2080l, long j5, long j6) {
        while (AbstractC1665j.m2988h(j5, j6) < 0) {
            c2080l = c2080l.m3824e(j5);
            j5 += (long) 1;
        }
        return c2080l;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x008e  */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m3829e(p112W2.InterfaceC1601c r15) {
        /*
            f0.a r0 = p158f0.AbstractC2082n.f6979j
            java.lang.Object r1 = p158f0.AbstractC2082n.f6972c
            monitor-enter(r1)
            k.F r2 = r0.f6933h     // Catch: java.lang.Throwable -> L10
            if (r2 == 0) goto L13
            b0.a r3 = p158f0.AbstractC2082n.f6980k     // Catch: java.lang.Throwable -> L10
            r4 = 1
            r3.addAndGet(r4)     // Catch: java.lang.Throwable -> L10
            goto L13
        L10:
            r15 = move-exception
            goto L97
        L13:
            java.lang.Object r15 = m3846v(r0, r15)     // Catch: java.lang.Throwable -> L10
            monitor-exit(r1)
            r1 = 0
            if (r2 == 0) goto L44
            r3 = -1
            java.lang.Object r4 = p158f0.AbstractC2082n.f6977h     // Catch: java.lang.Throwable -> L36
            int r5 = r4.size()     // Catch: java.lang.Throwable -> L36
            r6 = r1
        L23:
            if (r6 >= r5) goto L38
            java.lang.Object r7 = r4.get(r6)     // Catch: java.lang.Throwable -> L36
            W2.e r7 = (p112W2.InterfaceC1603e) r7     // Catch: java.lang.Throwable -> L36
            V.h r8 = new V.h     // Catch: java.lang.Throwable -> L36
            r8.<init>(r2)     // Catch: java.lang.Throwable -> L36
            r7.mo0g(r8, r0)     // Catch: java.lang.Throwable -> L36
            int r6 = r6 + 1
            goto L23
        L36:
            r15 = move-exception
            goto L3e
        L38:
            b0.a r0 = p158f0.AbstractC2082n.f6980k
            r0.addAndGet(r3)
            goto L44
        L3e:
            b0.a r0 = p158f0.AbstractC2082n.f6980k
            r0.addAndGet(r3)
            throw r15
        L44:
            java.lang.Object r0 = p158f0.AbstractC2082n.f6972c
            monitor-enter(r0)
            m3830f()     // Catch: java.lang.Throwable -> L86
            if (r2 == 0) goto L93
            java.lang.Object[] r3 = r2.f7794b     // Catch: java.lang.Throwable -> L86
            long[] r2 = r2.f7793a     // Catch: java.lang.Throwable -> L86
            int r4 = r2.length     // Catch: java.lang.Throwable -> L86
            int r4 = r4 + (-2)
            if (r4 < 0) goto L93
            r5 = r1
        L56:
            r6 = r2[r5]     // Catch: java.lang.Throwable -> L86
            long r8 = ~r6     // Catch: java.lang.Throwable -> L86
            r10 = 7
            long r8 = r8 << r10
            long r8 = r8 & r6
            r10 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r8 = r8 & r10
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 == 0) goto L8e
            int r8 = r5 - r4
            int r8 = ~r8     // Catch: java.lang.Throwable -> L86
            int r8 = r8 >>> 31
            r9 = 8
            int r8 = 8 - r8
            r10 = r1
        L70:
            if (r10 >= r8) goto L8c
            r11 = 255(0xff, double:1.26E-321)
            long r11 = r11 & r6
            r13 = 128(0x80, double:6.3E-322)
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 >= 0) goto L88
            int r11 = r5 << 3
            int r11 = r11 + r10
            r11 = r3[r11]     // Catch: java.lang.Throwable -> L86
            f0.v r11 = (p158f0.InterfaceC2090v) r11     // Catch: java.lang.Throwable -> L86
            m3841q(r11)     // Catch: java.lang.Throwable -> L86
            goto L88
        L86:
            r15 = move-exception
            goto L95
        L88:
            long r6 = r6 >> r9
            int r10 = r10 + 1
            goto L70
        L8c:
            if (r8 != r9) goto L93
        L8e:
            if (r5 == r4) goto L93
            int r5 = r5 + 1
            goto L56
        L93:
            monitor-exit(r0)
            return r15
        L95:
            monitor-exit(r0)
            throw r15
        L97:
            monitor-exit(r1)
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: p158f0.AbstractC2082n.m3829e(W2.c):java.lang.Object");
    }

    /* JADX INFO: renamed from: f */
    public static final void m3830f() {
        C0793k c0793k = f6976g;
        int i5 = c0793k.f2537e;
        int i6 = 0;
        int i7 = 0;
        while (true) {
            if (i6 >= i5) {
                break;
            }
            C1852n c1852n = ((C1852n[]) c0793k.f2539g)[i6];
            Object obj = c1852n != null ? c1852n.get() : null;
            if (obj != null && m3840p((InterfaceC2090v) obj)) {
                if (i7 != i6) {
                    ((C1852n[]) c0793k.f2539g)[i7] = c1852n;
                    int[] iArr = (int[]) c0793k.f2538f;
                    iArr[i7] = iArr[i6];
                }
                i7++;
            }
            i6++;
        }
        for (int i8 = i7; i8 < i5; i8++) {
            ((C1852n[]) c0793k.f2539g)[i8] = null;
            ((int[]) c0793k.f2538f)[i8] = 0;
        }
        if (i7 != i5) {
            c0793k.f2537e = i7;
        }
    }

    /* JADX INFO: renamed from: g */
    public static final AbstractC2074f m3831g(AbstractC2074f abstractC2074f, InterfaceC1601c interfaceC1601c, boolean z5) {
        boolean z6 = abstractC2074f instanceof C2070b;
        if (z6 || abstractC2074f == null) {
            return new C2094z(z6 ? (C2070b) abstractC2074f : null, interfaceC1601c, null, false, z5);
        }
        return new C2068A(abstractC2074f, interfaceC1601c, false, z5);
    }

    /* JADX INFO: renamed from: h */
    public static final AbstractC2092x m3832h(AbstractC2092x abstractC2092x) {
        AbstractC2092x abstractC2092xM3843s;
        AbstractC2074f abstractC2074fM3834j = m3834j();
        AbstractC2092x abstractC2092xM3843s2 = m3843s(abstractC2092x, abstractC2074fM3834j.mo3791g(), abstractC2074fM3834j.mo3788d());
        if (abstractC2092xM3843s2 != null) {
            return abstractC2092xM3843s2;
        }
        synchronized (f6972c) {
            AbstractC2074f abstractC2074fM3834j2 = m3834j();
            abstractC2092xM3843s = m3843s(abstractC2092x, abstractC2074fM3834j2.mo3791g(), abstractC2074fM3834j2.mo3788d());
        }
        if (abstractC2092xM3843s != null) {
            return abstractC2092xM3843s;
        }
        m3842r();
        throw null;
    }

    /* JADX INFO: renamed from: i */
    public static final AbstractC2092x m3833i(AbstractC2092x abstractC2092x, AbstractC2074f abstractC2074f) {
        AbstractC2092x abstractC2092xM3843s;
        AbstractC2092x abstractC2092xM3843s2 = m3843s(abstractC2092x, abstractC2074f.mo3791g(), abstractC2074f.mo3788d());
        if (abstractC2092xM3843s2 != null) {
            return abstractC2092xM3843s2;
        }
        synchronized (f6972c) {
            abstractC2092xM3843s = m3843s(abstractC2092x, abstractC2074f.mo3791g(), abstractC2074f.mo3788d());
        }
        if (abstractC2092xM3843s != null) {
            return abstractC2092xM3843s;
        }
        m3842r();
        throw null;
    }

    /* JADX INFO: renamed from: j */
    public static final AbstractC2074f m3834j() {
        AbstractC2074f abstractC2074f = (AbstractC2074f) f6971b.m105i();
        return abstractC2074f == null ? f6979j : abstractC2074f;
    }

    /* JADX INFO: renamed from: k */
    public static final InterfaceC1601c m3835k(InterfaceC1601c interfaceC1601c, InterfaceC1601c interfaceC1601c2, boolean z5) {
        if (!z5) {
            interfaceC1601c2 = null;
        }
        return (interfaceC1601c == null || interfaceC1601c2 == null || interfaceC1601c == interfaceC1601c2) ? interfaceC1601c == null ? interfaceC1601c2 : interfaceC1601c : new C2081m(interfaceC1601c, interfaceC1601c2, 0);
    }

    /* JADX INFO: renamed from: l */
    public static final InterfaceC1601c m3836l(InterfaceC1601c interfaceC1601c, InterfaceC1601c interfaceC1601c2) {
        return (interfaceC1601c == null || interfaceC1601c2 == null || interfaceC1601c == interfaceC1601c2) ? interfaceC1601c == null ? interfaceC1601c2 : interfaceC1601c : new C2081m(interfaceC1601c, interfaceC1601c2, 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0042, code lost:
    
        r3 = r0;
     */
    /* JADX INFO: renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final p158f0.AbstractC2092x m3837m(p158f0.AbstractC2092x r10, p158f0.InterfaceC2090v r11) {
        /*
            f0.x r0 = r11.mo2410a()
            long r1 = p158f0.AbstractC2082n.f6974e
            f0.j r3 = p158f0.AbstractC2082n.f6975f
            int r4 = r3.f6951a
            if (r4 <= 0) goto L12
            long[] r1 = r3.f6952b
            r2 = 0
            r2 = r1[r2]
            r1 = r2
        L12:
            r3 = 1
            long r3 = (long) r3
            long r1 = r1 - r3
            r3 = 0
            r4 = r3
        L17:
            if (r0 == 0) goto L49
            long r5 = r0.f7010a
            r7 = 0
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 != 0) goto L22
            goto L42
        L22:
            int r7 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r7 == 0) goto L46
            int r7 = p117X2.AbstractC1665j.m2988h(r5, r1)
            if (r7 > 0) goto L46
            f0.l r7 = p158f0.C2080l.f6962h
            boolean r5 = r7.m3822c(r5)
            if (r5 != 0) goto L46
            if (r4 != 0) goto L38
            r4 = r0
            goto L46
        L38:
            long r1 = r0.f7010a
            long r5 = r4.f7010a
            int r1 = p117X2.AbstractC1665j.m2988h(r1, r5)
            if (r1 >= 0) goto L44
        L42:
            r3 = r0
            goto L49
        L44:
            r3 = r4
            goto L49
        L46:
            f0.x r0 = r0.f7011b
            goto L17
        L49:
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r3 == 0) goto L53
            r3.f7010a = r0
            return r3
        L53:
            f0.x r10 = r10.mo2406b(r0)
            f0.x r0 = r11.mo2410a()
            r10.f7011b = r0
            r11.mo2411c(r10)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p158f0.AbstractC2082n.m3837m(f0.x, f0.v):f0.x");
    }

    /* JADX INFO: renamed from: n */
    public static final void m3838n(AbstractC2074f abstractC2074f, InterfaceC2090v interfaceC2090v) {
        abstractC2074f.mo3806t(abstractC2074f.mo3804h() + 1);
        InterfaceC1601c interfaceC1601cMo3792i = abstractC2074f.mo3792i();
        if (interfaceC1601cMo3792i != null) {
            interfaceC1601cMo3792i.mo1h(interfaceC2090v);
        }
    }

    /* JADX INFO: renamed from: o */
    public static final AbstractC2092x m3839o(AbstractC2092x abstractC2092x, AbstractC2091w abstractC2091w, AbstractC2074f abstractC2074f, AbstractC2092x abstractC2092x2) {
        AbstractC2092x abstractC2092xM3837m;
        if (abstractC2074f.mo3790f()) {
            abstractC2074f.mo3796n(abstractC2091w);
        }
        long jMo3791g = abstractC2074f.mo3791g();
        if (abstractC2092x2.f7010a == jMo3791g) {
            return abstractC2092x2;
        }
        synchronized (f6972c) {
            abstractC2092xM3837m = m3837m(abstractC2092x, abstractC2091w);
        }
        abstractC2092xM3837m.f7010a = jMo3791g;
        if (abstractC2092x2.f7010a != 1) {
            abstractC2074f.mo3796n(abstractC2091w);
        }
        return abstractC2092xM3837m;
    }

    /* JADX INFO: renamed from: p */
    public static final boolean m3840p(InterfaceC2090v interfaceC2090v) {
        AbstractC2092x abstractC2092x;
        long j5 = f6974e;
        C2078j c2078j = f6975f;
        if (c2078j.f6951a > 0) {
            j5 = c2078j.f6952b[0];
        }
        AbstractC2092x abstractC2092x2 = null;
        AbstractC2092x abstractC2092xMo2410a = null;
        int i5 = 0;
        for (AbstractC2092x abstractC2092xMo2410a2 = interfaceC2090v.mo2410a(); abstractC2092xMo2410a2 != null; abstractC2092xMo2410a2 = abstractC2092xMo2410a2.f7011b) {
            long j6 = abstractC2092xMo2410a2.f7010a;
            if (j6 != 0) {
                if (AbstractC1665j.m2988h(j6, j5) >= 0) {
                    i5++;
                } else if (abstractC2092x2 == null) {
                    i5++;
                    abstractC2092x2 = abstractC2092xMo2410a2;
                } else {
                    if (AbstractC1665j.m2988h(abstractC2092xMo2410a2.f7010a, abstractC2092x2.f7010a) < 0) {
                        abstractC2092x = abstractC2092x2;
                        abstractC2092x2 = abstractC2092xMo2410a2;
                    } else {
                        abstractC2092x = abstractC2092xMo2410a2;
                    }
                    if (abstractC2092xMo2410a == null) {
                        abstractC2092xMo2410a = interfaceC2090v.mo2410a();
                        AbstractC2092x abstractC2092x3 = abstractC2092xMo2410a;
                        while (true) {
                            if (abstractC2092xMo2410a == null) {
                                abstractC2092xMo2410a = abstractC2092x3;
                                break;
                            }
                            if (AbstractC1665j.m2988h(abstractC2092xMo2410a.f7010a, j5) >= 0) {
                                break;
                            }
                            if (AbstractC1665j.m2988h(abstractC2092x3.f7010a, abstractC2092xMo2410a.f7010a) < 0) {
                                abstractC2092x3 = abstractC2092xMo2410a;
                            }
                            abstractC2092xMo2410a = abstractC2092xMo2410a.f7011b;
                        }
                    }
                    abstractC2092x2.f7010a = 0L;
                    abstractC2092x2.mo2405a(abstractC2092xMo2410a);
                    abstractC2092x2 = abstractC2092x;
                }
            }
        }
        return i5 > 1;
    }

    /* JADX INFO: renamed from: q */
    public static final void m3841q(InterfaceC2090v interfaceC2090v) {
        if (m3840p(interfaceC2090v)) {
            C0793k c0793k = f6976g;
            int i5 = c0793k.f2537e;
            int iIdentityHashCode = System.identityHashCode(interfaceC2090v);
            int i6 = -1;
            if (i5 > 0) {
                int i7 = c0793k.f2537e - 1;
                int i8 = 0;
                while (true) {
                    if (i8 > i7) {
                        i6 = -(i8 + 1);
                        break;
                    }
                    int i9 = (i8 + i7) >>> 1;
                    int i10 = ((int[]) c0793k.f2538f)[i9];
                    if (i10 < iIdentityHashCode) {
                        i8 = i9 + 1;
                    } else if (i10 > iIdentityHashCode) {
                        i7 = i9 - 1;
                    } else {
                        C1852n c1852n = ((C1852n[]) c0793k.f2539g)[i9];
                        if (interfaceC2090v == (c1852n != null ? c1852n.get() : null)) {
                            i6 = i9;
                        } else {
                            for (int i11 = i9 - 1; -1 < i11 && ((int[]) c0793k.f2538f)[i11] == iIdentityHashCode; i11--) {
                                C1852n c1852n2 = ((C1852n[]) c0793k.f2539g)[i11];
                                if ((c1852n2 != null ? c1852n2.get() : null) == interfaceC2090v) {
                                    i6 = i11;
                                    break;
                                }
                            }
                            i9++;
                            int i12 = c0793k.f2537e;
                            while (true) {
                                if (i9 >= i12) {
                                    i6 = -(c0793k.f2537e + 1);
                                    break;
                                } else {
                                    if (((int[]) c0793k.f2538f)[i9] != iIdentityHashCode) {
                                        i6 = -(i9 + 1);
                                        break;
                                    }
                                    C1852n c1852n3 = ((C1852n[]) c0793k.f2539g)[i9];
                                    if ((c1852n3 != null ? c1852n3.get() : null) == interfaceC2090v) {
                                        break;
                                    } else {
                                        i9++;
                                    }
                                }
                            }
                            i6 = i9;
                        }
                    }
                }
                if (i6 >= 0) {
                    return;
                }
            }
            int i13 = -(i6 + 1);
            C1852n[] c1852nArr = (C1852n[]) c0793k.f2539g;
            int length = c1852nArr.length;
            if (i5 == length) {
                int i14 = length * 2;
                C1852n[] c1852nArr2 = new C1852n[i14];
                int[] iArr = new int[i14];
                int i15 = i13 + 1;
                System.arraycopy(c1852nArr, i13, c1852nArr2, i15, i5 - i13);
                System.arraycopy((C1852n[]) c0793k.f2539g, 0, c1852nArr2, 0, i13);
                AbstractC0972l.m1991O((int[]) c0793k.f2538f, iArr, i15, i13, i5);
                AbstractC0972l.m1994R((int[]) c0793k.f2538f, iArr, 0, i13, 6);
                c0793k.f2539g = c1852nArr2;
                c0793k.f2538f = iArr;
            } else {
                int i16 = i13 + 1;
                System.arraycopy(c1852nArr, i13, c1852nArr, i16, i5 - i13);
                int[] iArr2 = (int[]) c0793k.f2538f;
                AbstractC0972l.m1991O(iArr2, iArr2, i16, i13, i5);
            }
            ((C1852n[]) c0793k.f2539g)[i13] = new C1852n(interfaceC2090v);
            ((int[]) c0793k.f2538f)[i13] = iIdentityHashCode;
            c0793k.f2537e++;
        }
    }

    /* JADX INFO: renamed from: r */
    public static final void m3842r() {
        throw new IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied");
    }

    /* JADX INFO: renamed from: s */
    public static final AbstractC2092x m3843s(AbstractC2092x abstractC2092x, long j5, C2080l c2080l) {
        AbstractC2092x abstractC2092x2 = null;
        while (abstractC2092x != null) {
            long j6 = abstractC2092x.f7010a;
            if (j6 != 0 && AbstractC1665j.m2988h(j6, j5) <= 0 && !c2080l.m3822c(j6) && (abstractC2092x2 == null || AbstractC1665j.m2988h(abstractC2092x2.f7010a, abstractC2092x.f7010a) < 0)) {
                abstractC2092x2 = abstractC2092x;
            }
            abstractC2092x = abstractC2092x.f7011b;
        }
        if (abstractC2092x2 != null) {
            return abstractC2092x2;
        }
        return null;
    }

    /* JADX INFO: renamed from: t */
    public static final AbstractC2092x m3844t(AbstractC2092x abstractC2092x, InterfaceC2090v interfaceC2090v) {
        AbstractC2092x abstractC2092xM3843s;
        AbstractC2074f abstractC2074fM3834j = m3834j();
        InterfaceC1601c interfaceC1601cMo3789e = abstractC2074fM3834j.mo3789e();
        if (interfaceC1601cMo3789e != null) {
            interfaceC1601cMo3789e.mo1h(interfaceC2090v);
        }
        AbstractC2092x abstractC2092xM3843s2 = m3843s(abstractC2092x, abstractC2074fM3834j.mo3791g(), abstractC2074fM3834j.mo3788d());
        if (abstractC2092xM3843s2 != null) {
            return abstractC2092xM3843s2;
        }
        synchronized (f6972c) {
            AbstractC2074f abstractC2074fM3834j2 = m3834j();
            AbstractC2092x abstractC2092xMo2410a = interfaceC2090v.mo2410a();
            AbstractC1665j.m2983c(abstractC2092xMo2410a, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.readable");
            abstractC2092xM3843s = m3843s(abstractC2092xMo2410a, abstractC2074fM3834j2.mo3791g(), abstractC2074fM3834j2.mo3788d());
            if (abstractC2092xM3843s == null) {
                m3842r();
                throw null;
            }
        }
        return abstractC2092xM3843s;
    }

    /* JADX INFO: renamed from: u */
    public static final void m3845u(int i5) {
        C2078j c2078j = f6975f;
        int i6 = c2078j.f6954d[i5];
        c2078j.m3819b(i6, c2078j.f6951a - 1);
        c2078j.f6951a--;
        long[] jArr = c2078j.f6952b;
        long j5 = jArr[i6];
        int i7 = i6;
        while (i7 > 0) {
            int i8 = ((i7 + 1) >> 1) - 1;
            if (AbstractC1665j.m2988h(jArr[i8], j5) <= 0) {
                break;
            }
            c2078j.m3819b(i8, i7);
            i7 = i8;
        }
        long[] jArr2 = c2078j.f6952b;
        int i9 = c2078j.f6951a >> 1;
        while (i6 < i9) {
            int i10 = (i6 + 1) << 1;
            int i11 = i10 - 1;
            if (i10 < c2078j.f6951a && AbstractC1665j.m2988h(jArr2[i10], jArr2[i11]) < 0) {
                if (AbstractC1665j.m2988h(jArr2[i10], jArr2[i6]) >= 0) {
                    break;
                }
                c2078j.m3819b(i10, i6);
                i6 = i10;
            } else {
                if (AbstractC1665j.m2988h(jArr2[i11], jArr2[i6]) >= 0) {
                    break;
                }
                c2078j.m3819b(i11, i6);
                i6 = i11;
            }
        }
        c2078j.f6954d[i5] = c2078j.f6955e;
        c2078j.f6955e = i5;
    }

    /* JADX INFO: renamed from: v */
    public static final Object m3846v(C2069a c2069a, InterfaceC1601c interfaceC1601c) {
        long j5 = c2069a.f6946b;
        Object objMo1h = interfaceC1601c.mo1h(f6973d.m3821b(j5));
        long j6 = f6974e;
        f6974e = ((long) 1) + j6;
        C2080l c2080lM3821b = f6973d.m3821b(j5);
        f6973d = c2080lM3821b;
        c2069a.f6946b = j6;
        c2069a.f6945a = c2080lM3821b;
        c2069a.f6932g = 0;
        c2069a.f6933h = null;
        c2069a.m3814o();
        f6973d = f6973d.m3824e(j6);
        return objMo1h;
    }

    /* JADX INFO: renamed from: w */
    public static final AbstractC2092x m3847w(AbstractC2092x abstractC2092x, InterfaceC2090v interfaceC2090v, AbstractC2074f abstractC2074f) {
        AbstractC2092x abstractC2092xM3843s;
        if (abstractC2074f.mo3790f()) {
            abstractC2074f.mo3796n(interfaceC2090v);
        }
        long jMo3791g = abstractC2074f.mo3791g();
        AbstractC2092x abstractC2092xM3843s2 = m3843s(abstractC2092x, jMo3791g, abstractC2074f.mo3788d());
        if (abstractC2092xM3843s2 == null) {
            m3842r();
            throw null;
        }
        if (abstractC2092xM3843s2.f7010a == abstractC2074f.mo3791g()) {
            return abstractC2092xM3843s2;
        }
        synchronized (f6972c) {
            abstractC2092xM3843s = m3843s(interfaceC2090v.mo2410a(), jMo3791g, abstractC2074f.mo3788d());
            if (abstractC2092xM3843s == null) {
                m3842r();
                throw null;
            }
            if (abstractC2092xM3843s.f7010a != jMo3791g) {
                AbstractC2092x abstractC2092xM3837m = m3837m(abstractC2092xM3843s, interfaceC2090v);
                abstractC2092xM3837m.mo2405a(abstractC2092xM3843s);
                abstractC2092xM3837m.f7010a = abstractC2074f.mo3791g();
                abstractC2092xM3843s = abstractC2092xM3837m;
            }
        }
        if (abstractC2092xM3843s2.f7010a != 1) {
            abstractC2074f.mo3796n(interfaceC2090v);
        }
        return abstractC2092xM3843s;
    }
}
