package p178i3;

import com.bumptech.glide.AbstractC1923e;
import java.util.Arrays;
import p056K2.C0891q;
import p074O2.InterfaceC1046d;
import p074O2.InterfaceC1051i;
import p079P2.EnumC1152a;
import p117X2.AbstractC1665j;
import p121Y1.C1753n;
import p160f3.C2131e;
import p160f3.C2135g;
import p172h3.EnumC2241a;
import p184j3.AbstractC2383b;
import p184j3.AbstractC2384c;
import p184j3.AbstractC2385d;
import p184j3.C2388g;
import p184j3.InterfaceC2394m;

/* JADX INFO: renamed from: i3.s */
/* JADX INFO: loaded from: classes.dex */
public class C2338s extends AbstractC2383b implements InterfaceC2333n, InterfaceC2323d, InterfaceC2394m {

    /* JADX INFO: renamed from: h */
    public final int f7617h;

    /* JADX INFO: renamed from: i */
    public final int f7618i;

    /* JADX INFO: renamed from: j */
    public final EnumC2241a f7619j;

    /* JADX INFO: renamed from: k */
    public Object[] f7620k;

    /* JADX INFO: renamed from: l */
    public long f7621l;

    /* JADX INFO: renamed from: m */
    public long f7622m;

    /* JADX INFO: renamed from: n */
    public int f7623n;

    /* JADX INFO: renamed from: o */
    public int f7624o;

    public C2338s(int i5, int i6, EnumC2241a enumC2241a) {
        this.f7617h = i5;
        this.f7618i = i6;
        this.f7619j = enumC2241a;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|2|(2:4|(1:6)(1:7))(0)|8|(1:53)|(2:10|(1:(1:(7:14|15|16|31|59|(5:32|33|(10:57|(2:42|43)|44|(1:61)|16|31|59|32|33|(0)(1:35))(0)|49|50)|46)(2:19|20))(5:21|22|59|(5:32|33|(0)(0)|49|50)|46))(4:24|55|25|26))(1:29)|51|30|31|59|(5:32|33|(0)(0)|49|50)|46) */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00b2, code lost:
    
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00b3, code lost:
    
        r4 = r8;
        r8 = r10;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0082 A[Catch: all -> 0x0036, TRY_ENTER, TryCatch #1 {all -> 0x0036, blocks: (B:15:0x002f, B:32:0x0078, B:35:0x0082, B:39:0x0095, B:42:0x009c, B:43:0x00a0, B:44:0x00a1, B:22:0x0049), top: B:53:0x001e }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0093 A[SYNTHETIC] */
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
    /* JADX WARN: Type inference failed for: r1v4, types: [i3.e] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r4v1, types: [j3.b] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v4, types: [i3.s] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r9v0, types: [i3.e] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v2, types: [j3.d] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [i3.u] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8, types: [i3.u] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x00af -> B:16:0x0032). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m4151j(p178i3.C2338s r8, p178i3.InterfaceC2324e r9, p074O2.InterfaceC1046d r10) throws java.lang.Throwable {
        /*
            boolean r0 = r10 instanceof p178i3.C2337r
            if (r0 == 0) goto L13
            r0 = r10
            i3.r r0 = (p178i3.C2337r) r0
            int r1 = r0.f7616m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f7616m = r1
            goto L18
        L13:
            i3.r r0 = new i3.r
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.f7614k
            int r1 = r0.f7616m
            r2 = 3
            r3 = 2
            if (r1 == 0) goto L5c
            r8 = 1
            if (r1 == r8) goto L4d
            if (r1 == r3) goto L41
            if (r1 != r2) goto L39
            f3.S r8 = r0.f7613j
            i3.u r9 = r0.f7612i
            i3.e r1 = r0.f7611h
            i3.s r4 = r0.f7610g
            p127Z2.AbstractC1784a.m3205S(r10)     // Catch: java.lang.Throwable -> L36
        L32:
            r10 = r1
            r1 = r8
            r8 = r4
            goto L75
        L36:
            r8 = move-exception
            goto Lb5
        L39:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L41:
            f3.S r8 = r0.f7613j
            i3.u r9 = r0.f7612i
            i3.e r1 = r0.f7611h
            i3.s r4 = r0.f7610g
            p127Z2.AbstractC1784a.m3205S(r10)     // Catch: java.lang.Throwable -> L36
            goto L78
        L4d:
            i3.u r9 = r0.f7612i
            i3.e r8 = r0.f7611h
            i3.s r1 = r0.f7610g
            p127Z2.AbstractC1784a.m3205S(r10)     // Catch: java.lang.Throwable -> L59
            r10 = r8
            r8 = r1
            goto L68
        L59:
            r8 = move-exception
            r4 = r1
            goto Lb5
        L5c:
            p127Z2.AbstractC1784a.m3205S(r10)
            j3.d r10 = r8.m4233a()
            i3.u r10 = (p178i3.C2340u) r10
            r7 = r10
            r10 = r9
            r9 = r7
        L68:
            O2.i r1 = r0.f3866e     // Catch: java.lang.Throwable -> Lb2
            p117X2.AbstractC1665j.m2982b(r1)     // Catch: java.lang.Throwable -> Lb2
            f3.q r4 = p160f3.C2155q.f7102e     // Catch: java.lang.Throwable -> Lb2
            O2.g r1 = r1.mo1166C(r4)     // Catch: java.lang.Throwable -> Lb2
            f3.S r1 = (p160f3.InterfaceC2115S) r1     // Catch: java.lang.Throwable -> Lb2
        L75:
            r4 = r8
            r8 = r1
            r1 = r10
        L78:
            java.lang.Object r10 = r4.m4162t(r9)     // Catch: java.lang.Throwable -> L36
            Y1.n r5 = p178i3.AbstractC2339t.f7625a     // Catch: java.lang.Throwable -> L36
            P2.a r6 = p079P2.EnumC1152a.f3788d
            if (r10 != r5) goto L93
            r0.f7610g = r4     // Catch: java.lang.Throwable -> L36
            r0.f7611h = r1     // Catch: java.lang.Throwable -> L36
            r0.f7612i = r9     // Catch: java.lang.Throwable -> L36
            r0.f7613j = r8     // Catch: java.lang.Throwable -> L36
            r0.f7616m = r3     // Catch: java.lang.Throwable -> L36
            java.lang.Object r10 = r4.m4152g(r9, r0)     // Catch: java.lang.Throwable -> L36
            if (r10 != r6) goto L78
            goto Lb1
        L93:
            if (r8 == 0) goto La1
            boolean r5 = r8.mo3904b()     // Catch: java.lang.Throwable -> L36
            if (r5 == 0) goto L9c
            goto La1
        L9c:
            java.util.concurrent.CancellationException r8 = r8.mo3907n()     // Catch: java.lang.Throwable -> L36
            throw r8     // Catch: java.lang.Throwable -> L36
        La1:
            r0.f7610g = r4     // Catch: java.lang.Throwable -> L36
            r0.f7611h = r1     // Catch: java.lang.Throwable -> L36
            r0.f7612i = r9     // Catch: java.lang.Throwable -> L36
            r0.f7613j = r8     // Catch: java.lang.Throwable -> L36
            r0.f7616m = r2     // Catch: java.lang.Throwable -> L36
            java.lang.Object r10 = r1.mo9c(r10, r0)     // Catch: java.lang.Throwable -> L36
            if (r10 != r6) goto L32
        Lb1:
            return
        Lb2:
            r10 = move-exception
            r4 = r8
            r8 = r10
        Lb5:
            r4.m4234e(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p178i3.C2338s.m4151j(i3.s, i3.e, O2.d):void");
    }

    @Override // p184j3.AbstractC2383b
    /* JADX INFO: renamed from: b */
    public final AbstractC2385d mo4145b() {
        C2340u c2340u = new C2340u();
        c2340u.f7628a = -1L;
        return c2340u;
    }

    @Override // p178i3.InterfaceC2324e
    /* JADX INFO: renamed from: c */
    public final Object mo9c(Object obj, InterfaceC1046d interfaceC1046d) throws Throwable {
        Throwable th;
        InterfaceC1046d[] interfaceC1046dArrM4156m;
        C2336q c2336q;
        if (m4159q(obj)) {
            return C0891q.f2780a;
        }
        C2135g c2135g = new C2135g(1, AbstractC1923e.m3448G(interfaceC1046d));
        c2135g.m3968t();
        InterfaceC1046d[] interfaceC1046dArrM4156m2 = AbstractC2384c.f7729a;
        synchronized (this) {
            try {
                if (m4160r(obj)) {
                    try {
                        c2135g.mo278i(C0891q.f2780a);
                        interfaceC1046dArrM4156m = m4156m(interfaceC1046dArrM4156m2);
                        c2336q = null;
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                } else {
                    try {
                        C2336q c2336q2 = new C2336q(this, m4157o() + ((long) (this.f7623n + this.f7624o)), obj, c2135g);
                        m4155l(c2336q2);
                        this.f7624o++;
                        if (this.f7618i == 0) {
                            interfaceC1046dArrM4156m2 = m4156m(interfaceC1046dArrM4156m2);
                        }
                        interfaceC1046dArrM4156m = interfaceC1046dArrM4156m2;
                        c2336q = c2336q2;
                    } catch (Throwable th3) {
                        th = th3;
                        th = th;
                        throw th;
                    }
                }
                if (c2336q != null) {
                    c2135g.m3971x(new C2131e(1, c2336q));
                }
                for (InterfaceC1046d interfaceC1046d2 : interfaceC1046dArrM4156m) {
                    if (interfaceC1046d2 != null) {
                        interfaceC1046d2.mo278i(C0891q.f2780a);
                    }
                }
                Object objM3967r = c2135g.m3967r();
                EnumC1152a enumC1152a = EnumC1152a.f3788d;
                if (objM3967r != enumC1152a) {
                    objM3967r = C0891q.f2780a;
                }
                return objM3967r == enumC1152a ? objM3967r : C0891q.f2780a;
            } catch (Throwable th4) {
                th = th4;
            }
        }
    }

    @Override // p184j3.AbstractC2383b
    /* JADX INFO: renamed from: d */
    public final AbstractC2385d[] mo4146d() {
        return new C2340u[2];
    }

    /* JADX INFO: renamed from: g */
    public final Object m4152g(C2340u c2340u, C2337r c2337r) {
        C2135g c2135g = new C2135g(1, AbstractC1923e.m3448G(c2337r));
        c2135g.m3968t();
        synchronized (this) {
            try {
                if (m4161s(c2340u) < 0) {
                    c2340u.f7629b = c2135g;
                } else {
                    c2135g.mo278i(C0891q.f2780a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Object objM3967r = c2135g.m3967r();
        return objM3967r == EnumC1152a.f3788d ? objM3967r : C0891q.f2780a;
    }

    /* JADX INFO: renamed from: h */
    public final void m4153h() {
        if (this.f7618i != 0 || this.f7624o > 1) {
            Object[] objArr = this.f7620k;
            AbstractC1665j.m2982b(objArr);
            while (this.f7624o > 0) {
                long jM4157o = m4157o();
                int i5 = this.f7623n;
                int i6 = this.f7624o;
                if (objArr[((int) ((jM4157o + ((long) (i5 + i6))) - 1)) & (objArr.length - 1)] != AbstractC2339t.f7625a) {
                    return;
                }
                this.f7624o = i6 - 1;
                AbstractC2339t.m4167c(objArr, m4157o() + ((long) (this.f7623n + this.f7624o)), null);
            }
        }
    }

    @Override // p178i3.InterfaceC2323d
    /* JADX INFO: renamed from: i */
    public final Object mo3119i(InterfaceC2324e interfaceC2324e, InterfaceC1046d interfaceC1046d) throws Throwable {
        m4151j(this, interfaceC2324e, interfaceC1046d);
        return EnumC1152a.f3788d;
    }

    /* JADX INFO: renamed from: k */
    public final void m4154k() {
        AbstractC2385d[] abstractC2385dArr;
        Object[] objArr = this.f7620k;
        AbstractC1665j.m2982b(objArr);
        AbstractC2339t.m4167c(objArr, m4157o(), null);
        this.f7623n--;
        long jM4157o = m4157o() + 1;
        if (this.f7621l < jM4157o) {
            this.f7621l = jM4157o;
        }
        if (this.f7622m < jM4157o) {
            if (this.f7726e != 0 && (abstractC2385dArr = this.f7725d) != null) {
                for (AbstractC2385d abstractC2385d : abstractC2385dArr) {
                    if (abstractC2385d != null) {
                        C2340u c2340u = (C2340u) abstractC2385d;
                        long j5 = c2340u.f7628a;
                        if (j5 >= 0 && j5 < jM4157o) {
                            c2340u.f7628a = jM4157o;
                        }
                    }
                }
            }
            this.f7622m = jM4157o;
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m4155l(Object obj) {
        int i5 = this.f7623n + this.f7624o;
        Object[] objArrM4158p = this.f7620k;
        if (objArrM4158p == null) {
            objArrM4158p = m4158p(null, 0, 2);
        } else if (i5 >= objArrM4158p.length) {
            objArrM4158p = m4158p(objArrM4158p, i5, objArrM4158p.length * 2);
        }
        AbstractC2339t.m4167c(objArrM4158p, m4157o() + ((long) i5), obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [O2.d[]] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX INFO: renamed from: m */
    public final InterfaceC1046d[] m4156m(InterfaceC1046d[] interfaceC1046dArr) {
        AbstractC2385d[] abstractC2385dArr;
        C2340u c2340u;
        C2135g c2135g;
        int length = interfaceC1046dArr.length;
        if (this.f7726e != 0 && (abstractC2385dArr = this.f7725d) != null) {
            int length2 = abstractC2385dArr.length;
            int i5 = 0;
            interfaceC1046dArr = interfaceC1046dArr;
            while (i5 < length2) {
                AbstractC2385d abstractC2385d = abstractC2385dArr[i5];
                if (abstractC2385d != null && (c2135g = (c2340u = (C2340u) abstractC2385d).f7629b) != null && m4161s(c2340u) >= 0) {
                    int length3 = interfaceC1046dArr.length;
                    interfaceC1046dArr = interfaceC1046dArr;
                    if (length >= length3) {
                        Object[] objArrCopyOf = Arrays.copyOf((Object[]) interfaceC1046dArr, Math.max(2, interfaceC1046dArr.length * 2));
                        AbstractC1665j.m2984d(objArrCopyOf, "copyOf(...)");
                        interfaceC1046dArr = objArrCopyOf;
                    }
                    ((InterfaceC1046d[]) interfaceC1046dArr)[length] = c2135g;
                    c2340u.f7629b = null;
                    length++;
                }
                i5++;
                interfaceC1046dArr = interfaceC1046dArr;
            }
        }
        return (InterfaceC1046d[]) interfaceC1046dArr;
    }

    @Override // p184j3.InterfaceC2394m
    /* JADX INFO: renamed from: n */
    public final InterfaceC2323d mo4148n(InterfaceC1051i interfaceC1051i, int i5, EnumC2241a enumC2241a) {
        return ((i5 == 0 || i5 == -3) && enumC2241a == EnumC2241a.f7351d) ? this : new C2388g(this, interfaceC1051i, i5, enumC2241a);
    }

    /* JADX INFO: renamed from: o */
    public final long m4157o() {
        return Math.min(this.f7622m, this.f7621l);
    }

    /* JADX INFO: renamed from: p */
    public final Object[] m4158p(Object[] objArr, int i5, int i6) {
        if (i6 <= 0) {
            throw new IllegalStateException("Buffer size overflow");
        }
        Object[] objArr2 = new Object[i6];
        this.f7620k = objArr2;
        if (objArr != null) {
            long jM4157o = m4157o();
            for (int i7 = 0; i7 < i5; i7++) {
                long j5 = ((long) i7) + jM4157o;
                AbstractC2339t.m4167c(objArr2, j5, objArr[((int) j5) & (objArr.length - 1)]);
            }
        }
        return objArr2;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m4159q(Object obj) {
        int i5;
        boolean z5;
        InterfaceC1046d[] interfaceC1046dArrM4156m = AbstractC2384c.f7729a;
        synchronized (this) {
            if (m4160r(obj)) {
                interfaceC1046dArrM4156m = m4156m(interfaceC1046dArrM4156m);
                z5 = true;
            } else {
                z5 = false;
            }
        }
        for (InterfaceC1046d interfaceC1046d : interfaceC1046dArrM4156m) {
            if (interfaceC1046d != null) {
                interfaceC1046d.mo278i(C0891q.f2780a);
            }
        }
        return z5;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0047  */
    /* JADX INFO: renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m4160r(java.lang.Object r13) {
        /*
            r12 = this;
            int r1 = r12.f7726e
            int r2 = r12.f7617h
            r9 = 1
            if (r1 != 0) goto L23
            if (r2 != 0) goto Lb
            goto L7f
        Lb:
            r12.m4155l(r13)
            int r1 = r12.f7623n
            int r1 = r1 + r9
            r12.f7623n = r1
            if (r1 <= r2) goto L18
            r12.m4154k()
        L18:
            long r1 = r12.m4157o()
            int r3 = r12.f7623n
            long r3 = (long) r3
            long r1 = r1 + r3
            r12.f7622m = r1
            return r9
        L23:
            int r1 = r12.f7623n
            int r3 = r12.f7618i
            if (r1 < r3) goto L47
            long r4 = r12.f7622m
            long r6 = r12.f7621l
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 > 0) goto L47
            h3.a r1 = r12.f7619j
            int r1 = r1.ordinal()
            if (r1 == 0) goto L45
            if (r1 == r9) goto L47
            r2 = 2
            if (r1 != r2) goto L3f
            goto L7f
        L3f:
            E4.q r1 = new E4.q
            r1.<init>()
            throw r1
        L45:
            r1 = 0
            return r1
        L47:
            r12.m4155l(r13)
            int r1 = r12.f7623n
            int r1 = r1 + r9
            r12.f7623n = r1
            if (r1 <= r3) goto L54
            r12.m4154k()
        L54:
            long r3 = r12.m4157o()
            int r1 = r12.f7623n
            long r5 = (long) r1
            long r3 = r3 + r5
            long r5 = r12.f7621l
            long r3 = r3 - r5
            int r1 = (int) r3
            if (r1 <= r2) goto L7f
            r1 = 1
            long r1 = r1 + r5
            long r3 = r12.f7622m
            long r5 = r12.m4157o()
            int r7 = r12.f7623n
            long r7 = (long) r7
            long r5 = r5 + r7
            long r7 = r12.m4157o()
            int r10 = r12.f7623n
            long r10 = (long) r10
            long r7 = r7 + r10
            int r10 = r12.f7624o
            long r10 = (long) r10
            long r7 = r7 + r10
            r0 = r12
            r0.m4163u(r1, r3, r5, r7)
        L7f:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p178i3.C2338s.m4160r(java.lang.Object):boolean");
    }

    /* JADX INFO: renamed from: s */
    public final long m4161s(C2340u c2340u) {
        long j5 = c2340u.f7628a;
        if (j5 < m4157o() + ((long) this.f7623n)) {
            return j5;
        }
        if (this.f7618i <= 0 && j5 <= m4157o() && this.f7624o != 0) {
            return j5;
        }
        return -1L;
    }

    /* JADX INFO: renamed from: t */
    public final Object m4162t(C2340u c2340u) {
        Object obj;
        InterfaceC1046d[] interfaceC1046dArrM4164v = AbstractC2384c.f7729a;
        synchronized (this) {
            try {
                long jM4161s = m4161s(c2340u);
                if (jM4161s < 0) {
                    obj = AbstractC2339t.f7625a;
                } else {
                    long j5 = c2340u.f7628a;
                    Object[] objArr = this.f7620k;
                    AbstractC1665j.m2982b(objArr);
                    Object obj2 = objArr[((int) jM4161s) & (objArr.length - 1)];
                    if (obj2 instanceof C2336q) {
                        obj2 = ((C2336q) obj2).f7608f;
                    }
                    c2340u.f7628a = jM4161s + 1;
                    Object obj3 = obj2;
                    interfaceC1046dArrM4164v = m4164v(j5);
                    obj = obj3;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        for (InterfaceC1046d interfaceC1046d : interfaceC1046dArrM4164v) {
            if (interfaceC1046d != null) {
                interfaceC1046d.mo278i(C0891q.f2780a);
            }
        }
        return obj;
    }

    /* JADX INFO: renamed from: u */
    public final void m4163u(long j5, long j6, long j7, long j8) {
        long jMin = Math.min(j6, j5);
        for (long jM4157o = m4157o(); jM4157o < jMin; jM4157o++) {
            Object[] objArr = this.f7620k;
            AbstractC1665j.m2982b(objArr);
            AbstractC2339t.m4167c(objArr, jM4157o, null);
        }
        this.f7621l = j5;
        this.f7622m = j6;
        this.f7623n = (int) (j7 - jMin);
        this.f7624o = (int) (j8 - j7);
    }

    /* JADX INFO: renamed from: v */
    public final InterfaceC1046d[] m4164v(long j5) {
        long j6;
        long j7;
        long j8;
        InterfaceC1046d[] interfaceC1046dArr;
        InterfaceC1046d[] interfaceC1046dArr2;
        AbstractC2385d[] abstractC2385dArr;
        C1753n c1753n = AbstractC2339t.f7625a;
        InterfaceC1046d[] interfaceC1046dArr3 = AbstractC2384c.f7729a;
        if (j5 <= this.f7622m) {
            long jM4157o = m4157o();
            long j9 = ((long) this.f7623n) + jM4157o;
            int i5 = this.f7618i;
            if (i5 == 0 && this.f7624o > 0) {
                j9++;
            }
            int i6 = 0;
            if (this.f7726e != 0 && (abstractC2385dArr = this.f7725d) != null) {
                for (AbstractC2385d abstractC2385d : abstractC2385dArr) {
                    if (abstractC2385d != null) {
                        long j10 = ((C2340u) abstractC2385d).f7628a;
                        if (j10 >= 0 && j10 < j9) {
                            j9 = j10;
                        }
                    }
                }
            }
            if (j9 > this.f7622m) {
                long jM4157o2 = m4157o() + ((long) this.f7623n);
                int iMin = this.f7726e > 0 ? Math.min(this.f7624o, i5 - ((int) (jM4157o2 - j9))) : this.f7624o;
                long j11 = ((long) this.f7624o) + jM4157o2;
                if (iMin > 0) {
                    j8 = 1;
                    Object[] objArr = this.f7620k;
                    AbstractC1665j.m2982b(objArr);
                    j6 = jM4157o;
                    InterfaceC1046d[] interfaceC1046dArr4 = new InterfaceC1046d[iMin];
                    long j12 = jM4157o2;
                    while (true) {
                        if (jM4157o2 >= j11) {
                            interfaceC1046dArr2 = interfaceC1046dArr4;
                            j7 = j9;
                            break;
                        }
                        interfaceC1046dArr2 = interfaceC1046dArr4;
                        Object obj = objArr[(objArr.length - 1) & ((int) jM4157o2)];
                        if (obj != c1753n) {
                            AbstractC1665j.m2983c(obj, "null cannot be cast to non-null type kotlinx.coroutines.flow.SharedFlowImpl.Emitter");
                            C2336q c2336q = (C2336q) obj;
                            int i7 = i6 + 1;
                            j7 = j9;
                            interfaceC1046dArr2[i6] = c2336q.f7609g;
                            AbstractC2339t.m4167c(objArr, jM4157o2, c1753n);
                            AbstractC2339t.m4167c(objArr, j12, c2336q.f7608f);
                            j12++;
                            if (i7 >= iMin) {
                                break;
                            }
                            i6 = i7;
                        } else {
                            j7 = j9;
                        }
                        jM4157o2++;
                        interfaceC1046dArr4 = interfaceC1046dArr2;
                        j9 = j7;
                    }
                    jM4157o2 = j12;
                    interfaceC1046dArr = interfaceC1046dArr2;
                } else {
                    j6 = jM4157o;
                    j7 = j9;
                    j8 = 1;
                    interfaceC1046dArr = interfaceC1046dArr3;
                }
                int i8 = (int) (jM4157o2 - j6);
                long j13 = this.f7726e == 0 ? jM4157o2 : j7;
                long jMax = Math.max(this.f7621l, jM4157o2 - ((long) Math.min(this.f7617h, i8)));
                if (i5 == 0 && jMax < j11) {
                    Object[] objArr2 = this.f7620k;
                    AbstractC1665j.m2982b(objArr2);
                    if (AbstractC1665j.m2981a(objArr2[((int) jMax) & (objArr2.length - 1)], c1753n)) {
                        jM4157o2 += j8;
                        jMax += j8;
                    }
                }
                m4163u(jMax, j13, jM4157o2, j11);
                m4153h();
                return interfaceC1046dArr.length == 0 ? interfaceC1046dArr : m4156m(interfaceC1046dArr);
            }
        }
        return interfaceC1046dArr3;
    }
}
