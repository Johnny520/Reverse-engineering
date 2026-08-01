package p158f0;

import java.util.ArrayList;
import java.util.HashMap;
import p056K2.C0882h;
import p061L2.AbstractC0973m;
import p095T.AbstractC1380p0;
import p112W2.InterfaceC1601c;
import p186k.AbstractC2416M;
import p186k.C2409F;

/* JADX INFO: renamed from: f0.b */
/* JADX INFO: loaded from: classes.dex */
public class C2070b extends AbstractC2074f {

    /* JADX INFO: renamed from: n */
    public static final int[] f6929n = new int[0];

    /* JADX INFO: renamed from: e */
    public final InterfaceC1601c f6930e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC1601c f6931f;

    /* JADX INFO: renamed from: g */
    public int f6932g;

    /* JADX INFO: renamed from: h */
    public C2409F f6933h;

    /* JADX INFO: renamed from: i */
    public ArrayList f6934i;

    /* JADX INFO: renamed from: j */
    public C2080l f6935j;

    /* JADX INFO: renamed from: k */
    public int[] f6936k;

    /* JADX INFO: renamed from: l */
    public int f6937l;

    /* JADX INFO: renamed from: m */
    public boolean f6938m;

    public C2070b(long j5, C2080l c2080l, InterfaceC1601c interfaceC1601c, InterfaceC1601c interfaceC1601c2) {
        super(j5, c2080l);
        this.f6930e = interfaceC1601c;
        this.f6931f = interfaceC1601c2;
        this.f6935j = C2080l.f6962h;
        this.f6936k = f6929n;
        this.f6937l = 1;
    }

    /* JADX INFO: renamed from: A */
    public final void m3801A(long j5) {
        synchronized (AbstractC2082n.f6972c) {
            this.f6935j = this.f6935j.m3824e(j5);
        }
    }

    /* JADX INFO: renamed from: B */
    public void mo3802B(C2409F c2409f) {
        this.f6933h = c2409f;
    }

    /* JADX INFO: renamed from: C */
    public C2070b mo3799C(InterfaceC1601c interfaceC1601c, InterfaceC1601c interfaceC1601c2) throws Throwable {
        if (this.f6947c) {
            AbstractC1380p0.m2542a("Cannot use a disposed snapshot");
        }
        if (this.f6938m && this.f6948d < 0) {
            AbstractC1380p0.m2543b("Unsupported operation on a disposed or applied snapshot");
        }
        m3801A(mo3791g());
        Object obj = AbstractC2082n.f6972c;
        synchronized (obj) {
            try {
                long j5 = AbstractC2082n.f6974e;
                long j6 = 1;
                AbstractC2082n.f6974e = j5 + j6;
                AbstractC2082n.f6973d = AbstractC2082n.f6973d.m3824e(j5);
                C2080l c2080lMo3788d = mo3788d();
                mo3815r(c2080lMo3788d.m3824e(j5));
                try {
                    C2071c c2071c = new C2071c(j5, AbstractC2082n.m3828d(c2080lMo3788d, mo3791g() + j6, j5), AbstractC2082n.m3835k(interfaceC1601c, mo3789e(), true), AbstractC2082n.m3836l(interfaceC1601c2, mo3792i()), this);
                    if (this.f6938m || this.f6947c) {
                        return c2071c;
                    }
                    long jMo3791g = mo3791g();
                    synchronized (obj) {
                        long j7 = AbstractC2082n.f6974e;
                        AbstractC2082n.f6974e = j7 + j6;
                        mo3816s(j7);
                        AbstractC2082n.f6973d = AbstractC2082n.f6973d.m3824e(mo3791g());
                    }
                    mo3815r(AbstractC2082n.m3828d(mo3788d(), jMo3791g + j6, mo3791g()));
                    return c2071c;
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    @Override // p158f0.AbstractC2074f
    /* JADX INFO: renamed from: b */
    public final void mo3803b() {
        AbstractC2082n.f6973d = AbstractC2082n.f6973d.m3821b(mo3791g()).m3820a(this.f6935j);
    }

    @Override // p158f0.AbstractC2074f
    /* JADX INFO: renamed from: c */
    public void mo3787c() {
        if (this.f6947c) {
            return;
        }
        this.f6947c = true;
        synchronized (AbstractC2082n.f6972c) {
            m3814o();
        }
        mo3794l();
    }

    @Override // p158f0.AbstractC2074f
    /* JADX INFO: renamed from: f */
    public boolean mo3790f() {
        return false;
    }

    @Override // p158f0.AbstractC2074f
    /* JADX INFO: renamed from: h */
    public int mo3804h() {
        return this.f6932g;
    }

    @Override // p158f0.AbstractC2074f
    /* JADX INFO: renamed from: i */
    public InterfaceC1601c mo3792i() {
        return this.f6931f;
    }

    @Override // p158f0.AbstractC2074f
    /* JADX INFO: renamed from: k */
    public void mo3793k() {
        this.f6937l++;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x008c  */
    @Override // p158f0.AbstractC2074f
    /* JADX INFO: renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo3794l() {
        /*
            r17 = this;
            r0 = r17
            int r1 = r0.f6937l
            if (r1 <= 0) goto L7
            goto Lc
        L7:
            java.lang.String r1 = "no pending nested snapshots"
            p095T.AbstractC1380p0.m2542a(r1)
        Lc:
            int r1 = r0.f6937l
            int r1 = r1 + (-1)
            r0.f6937l = r1
            if (r1 != 0) goto L94
            boolean r1 = r0.f6938m
            if (r1 != 0) goto L94
            k.F r1 = r0.mo3808x()
            if (r1 == 0) goto L91
            boolean r2 = r0.f6938m
            if (r2 == 0) goto L27
            java.lang.String r2 = "Unsupported operation on a snapshot that has been applied"
            p095T.AbstractC1380p0.m2543b(r2)
        L27:
            r2 = 0
            r0.mo3802B(r2)
            long r2 = r0.mo3791g()
            java.lang.Object[] r4 = r1.f7794b
            long[] r1 = r1.f7793a
            int r5 = r1.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L91
            r7 = 0
        L39:
            r8 = r1[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L8c
            int r10 = r7 - r5
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = 0
        L53:
            if (r12 >= r10) goto L8a
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L86
            int r13 = r7 << 3
            int r13 = r13 + r12
            r13 = r4[r13]
            f0.v r13 = (p158f0.InterfaceC2090v) r13
            f0.x r13 = r13.mo2410a()
        L69:
            if (r13 == 0) goto L86
            long r14 = r13.f7010a
            int r16 = (r14 > r2 ? 1 : (r14 == r2 ? 0 : -1))
            if (r16 == 0) goto L7d
            f0.l r6 = r0.f6935j
            java.lang.Long r14 = java.lang.Long.valueOf(r14)
            boolean r6 = p061L2.AbstractC0973m.m2010Q(r6, r14)
            if (r6 == 0) goto L83
        L7d:
            S0.x r6 = p158f0.AbstractC2082n.f6970a
            r14 = 0
            r13.f7010a = r14
        L83:
            f0.x r13 = r13.f7011b
            goto L69
        L86:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L53
        L8a:
            if (r10 != r11) goto L91
        L8c:
            if (r7 == r5) goto L91
            int r7 = r7 + 1
            goto L39
        L91:
            r0.m3812a()
        L94:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p158f0.C2070b.mo3794l():void");
    }

    @Override // p158f0.AbstractC2074f
    /* JADX INFO: renamed from: m */
    public void mo3795m() {
        if (this.f6938m || this.f6947c) {
            return;
        }
        m3807v();
    }

    @Override // p158f0.AbstractC2074f
    /* JADX INFO: renamed from: n */
    public void mo3796n(InterfaceC2090v interfaceC2090v) {
        C2409F c2409fMo3808x = mo3808x();
        if (c2409fMo3808x == null) {
            C2409F c2409f = AbstractC2416M.f7817a;
            c2409fMo3808x = new C2409F();
            mo3802B(c2409fMo3808x);
        }
        c2409fMo3808x.m4279a(interfaceC2090v);
    }

    @Override // p158f0.AbstractC2074f
    /* JADX INFO: renamed from: p */
    public final void mo3805p() {
        int length = this.f6936k.length;
        for (int i5 = 0; i5 < length; i5++) {
            AbstractC2082n.m3845u(this.f6936k[i5]);
        }
        m3814o();
    }

    @Override // p158f0.AbstractC2074f
    /* JADX INFO: renamed from: t */
    public void mo3806t(int i5) {
        this.f6932g = i5;
    }

    @Override // p158f0.AbstractC2074f
    /* JADX INFO: renamed from: u */
    public AbstractC2074f mo3797u(InterfaceC1601c interfaceC1601c) throws Throwable {
        if (this.f6947c) {
            AbstractC1380p0.m2542a("Cannot use a disposed snapshot");
        }
        if (this.f6938m && this.f6948d < 0) {
            AbstractC1380p0.m2543b("Unsupported operation on a disposed or applied snapshot");
        }
        long jMo3791g = mo3791g();
        m3801A(mo3791g());
        Object obj = AbstractC2082n.f6972c;
        synchronized (obj) {
            try {
                long j5 = AbstractC2082n.f6974e;
                long j6 = 1;
                AbstractC2082n.f6974e = j5 + j6;
                AbstractC2082n.f6973d = AbstractC2082n.f6973d.m3824e(j5);
                try {
                    C2072d c2072d = new C2072d(j5, AbstractC2082n.m3828d(mo3788d(), jMo3791g + j6, j5), AbstractC2082n.m3835k(interfaceC1601c, mo3789e(), true), this);
                    if (this.f6938m || this.f6947c) {
                        return c2072d;
                    }
                    long jMo3791g2 = mo3791g();
                    synchronized (obj) {
                        long j7 = AbstractC2082n.f6974e;
                        AbstractC2082n.f6974e = j7 + j6;
                        mo3816s(j7);
                        AbstractC2082n.f6973d = AbstractC2082n.f6973d.m3824e(mo3791g());
                    }
                    mo3815r(AbstractC2082n.m3828d(mo3788d(), jMo3791g2 + j6, mo3791g()));
                    return c2072d;
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m3807v() {
        long j5;
        m3801A(mo3791g());
        if (this.f6938m || this.f6947c) {
            return;
        }
        long jMo3791g = mo3791g();
        synchronized (AbstractC2082n.f6972c) {
            long j6 = AbstractC2082n.f6974e;
            j5 = 1;
            AbstractC2082n.f6974e = j6 + j5;
            mo3816s(j6);
            AbstractC2082n.f6973d = AbstractC2082n.f6973d.m3824e(mo3791g());
        }
        mo3815r(AbstractC2082n.m3828d(mo3788d(), jMo3791g + j5, mo3791g()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0145  */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.Collection, java.util.List] */
    /* JADX INFO: renamed from: w */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public p158f0.AbstractC2086r mo3800w() {
        /*
            Method dump skipped, instruction units count: 363
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p158f0.C2070b.mo3800w():f0.r");
    }

    /* JADX INFO: renamed from: x */
    public C2409F mo3808x() {
        return this.f6933h;
    }

    @Override // p158f0.AbstractC2074f
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public InterfaceC1601c mo3789e() {
        return this.f6930e;
    }

    /* JADX INFO: renamed from: z */
    public final AbstractC2086r m3810z(long j5, C2409F c2409f, HashMap map, C2080l c2080l) {
        ArrayList arrayList;
        ArrayList arrayListM2019Z;
        ArrayList arrayList2;
        C2080l c2080l2;
        Object[] objArr;
        long[] jArr;
        C2080l c2080l3;
        Object[] objArr2;
        long[] jArr2;
        int i5;
        long j6;
        ArrayList arrayList3;
        AbstractC2092x abstractC2092xMo2505b;
        C2080l c2080lM3823d = mo3788d().m3824e(mo3791g()).m3823d(this.f6935j);
        Object[] objArr3 = c2409f.f7794b;
        long[] jArr3 = c2409f.f7793a;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i6 = 0;
            arrayList2 = null;
            arrayListM2019Z = null;
            while (true) {
                long j7 = jArr3[i6];
                if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i7 = 8 - ((~(i6 - length)) >>> 31);
                    int i8 = 0;
                    while (i8 < i7) {
                        if ((j7 & 255) < 128) {
                            objArr2 = objArr3;
                            InterfaceC2090v interfaceC2090v = (InterfaceC2090v) objArr3[(i6 << 3) + i8];
                            jArr2 = jArr3;
                            AbstractC2092x abstractC2092xMo2410a = interfaceC2090v.mo2410a();
                            i5 = i8;
                            ArrayList arrayList4 = arrayList2;
                            AbstractC2092x abstractC2092xM3843s = AbstractC2082n.m3843s(abstractC2092xMo2410a, j5, c2080l);
                            if (abstractC2092xM3843s == null) {
                                c2080l3 = c2080lM3823d;
                                arrayList3 = arrayListM2019Z;
                                j6 = j7;
                            } else {
                                arrayList3 = arrayListM2019Z;
                                j6 = j7;
                                AbstractC2092x abstractC2092xM3843s2 = AbstractC2082n.m3843s(abstractC2092xMo2410a, mo3791g(), c2080lM3823d);
                                if (abstractC2092xM3843s2 == null) {
                                    c2080l3 = c2080lM3823d;
                                } else {
                                    c2080l3 = c2080lM3823d;
                                    if (abstractC2092xM3843s2.f7010a != 1 && !abstractC2092xM3843s.equals(abstractC2092xM3843s2)) {
                                        AbstractC2092x abstractC2092xM3843s3 = AbstractC2082n.m3843s(abstractC2092xMo2410a, mo3791g(), mo3788d());
                                        if (abstractC2092xM3843s3 == null) {
                                            AbstractC2082n.m3842r();
                                            throw null;
                                        }
                                        if (map == null || (abstractC2092xMo2505b = (AbstractC2092x) map.get(abstractC2092xM3843s)) == null) {
                                            abstractC2092xMo2505b = interfaceC2090v.mo2505b(abstractC2092xM3843s2, abstractC2092xM3843s, abstractC2092xM3843s3);
                                        }
                                        if (abstractC2092xMo2505b == null) {
                                            return new C2076h(this);
                                        }
                                        if (!abstractC2092xMo2505b.equals(abstractC2092xM3843s3)) {
                                            if (abstractC2092xMo2505b.equals(abstractC2092xM3843s)) {
                                                ArrayList arrayList5 = arrayList4 == null ? new ArrayList() : arrayList4;
                                                arrayList5.add(new C0882h(interfaceC2090v, abstractC2092xM3843s.mo2406b(mo3791g())));
                                                arrayListM2019Z = arrayList3 == null ? new ArrayList() : arrayList3;
                                                arrayListM2019Z.add(interfaceC2090v);
                                                arrayList2 = arrayList5;
                                            } else {
                                                arrayList2 = arrayList4 == null ? new ArrayList() : arrayList4;
                                                arrayList2.add(!abstractC2092xMo2505b.equals(abstractC2092xM3843s2) ? new C0882h(interfaceC2090v, abstractC2092xMo2505b) : new C0882h(interfaceC2090v, abstractC2092xM3843s2.mo2406b(mo3791g())));
                                            }
                                        }
                                        arrayListM2019Z = arrayList3;
                                    }
                                }
                            }
                            arrayList2 = arrayList4;
                            arrayListM2019Z = arrayList3;
                        } else {
                            c2080l3 = c2080lM3823d;
                            objArr2 = objArr3;
                            jArr2 = jArr3;
                            i5 = i8;
                            j6 = j7;
                        }
                        j7 = j6 >> 8;
                        i8 = i5 + 1;
                        jArr3 = jArr2;
                        objArr3 = objArr2;
                        c2080lM3823d = c2080l3;
                    }
                    c2080l2 = c2080lM3823d;
                    objArr = objArr3;
                    jArr = jArr3;
                    if (i7 != 8) {
                        break;
                    }
                } else {
                    c2080l2 = c2080lM3823d;
                    objArr = objArr3;
                    jArr = jArr3;
                }
                if (i6 == length) {
                    arrayList = arrayList2;
                    break;
                }
                i6++;
                jArr3 = jArr;
                objArr3 = objArr;
                c2080lM3823d = c2080l2;
            }
        } else {
            arrayList = null;
            arrayListM2019Z = null;
        }
        arrayList2 = arrayList;
        if (arrayList2 != null) {
            m3807v();
            int size = arrayList2.size();
            for (int i9 = 0; i9 < size; i9++) {
                C0882h c0882h = (C0882h) arrayList2.get(i9);
                InterfaceC2090v interfaceC2090v2 = (InterfaceC2090v) c0882h.f2769d;
                AbstractC2092x abstractC2092x = (AbstractC2092x) c0882h.f2770e;
                abstractC2092x.f7010a = j5;
                synchronized (AbstractC2082n.f6972c) {
                    abstractC2092x.f7011b = interfaceC2090v2.mo2410a();
                    interfaceC2090v2.mo2411c(abstractC2092x);
                }
            }
        }
        if (arrayListM2019Z != null) {
            int size2 = arrayListM2019Z.size();
            for (int i10 = 0; i10 < size2; i10++) {
                c2409f.m4290l((InterfaceC2090v) arrayListM2019Z.get(i10));
            }
            ArrayList arrayList6 = this.f6934i;
            if (arrayList6 != null) {
                arrayListM2019Z = AbstractC0973m.m2019Z(arrayList6, arrayListM2019Z);
            }
            this.f6934i = arrayListM2019Z;
        }
        return C2077i.f6950b;
    }
}
