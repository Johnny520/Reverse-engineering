package p058e2;

import ec.InterfaceC2165o0;
import p010a9.InterfaceC0173a;
import p024b9.AbstractC1067w;
import p228p8.InterfaceC5976f;
import p250r1.C6455e;
import p257r8.AbstractC6535d;
import p376zd.C10010p0;

/* JADX INFO: renamed from: e2.b */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C2000b {

    /* JADX INFO: renamed from: a */
    public C2003e f5546a;

    /* JADX INFO: renamed from: b */
    public C2003e f5547b;

    /* JADX INFO: renamed from: c */
    public InterfaceC0173a f5548c = new a();

    /* JADX INFO: renamed from: d */
    public InterfaceC2165o0 f5549d;

    /* JADX INFO: renamed from: e2.b$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends AbstractC1067w implements InterfaceC0173a {
        public a() {
            super(0);
        }

        @Override // p010a9.InterfaceC0173a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC2165o0 invoke() {
            return C2000b.this.m7221h();
        }
    }

    /* JADX INFO: renamed from: e2.b$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b extends AbstractC6535d {

        /* JADX INFO: renamed from: q */
        public /* synthetic */ Object f5551q;

        /* JADX INFO: renamed from: s */
        public int f5553s;

        public b(InterfaceC5976f interfaceC5976f) {
            super(interfaceC5976f);
        }

        @Override // p257r8.AbstractC6532a
        public final Object invokeSuspend(Object obj) {
            this.f5551q = obj;
            this.f5553s |= Integer.MIN_VALUE;
            return C2000b.this.m7214a(0L, 0L, this);
        }
    }

    /* JADX INFO: renamed from: e2.b$c */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class c extends AbstractC6535d {

        /* JADX INFO: renamed from: q */
        public /* synthetic */ Object f5554q;

        /* JADX INFO: renamed from: s */
        public int f5556s;

        public c(InterfaceC5976f interfaceC5976f) {
            super(interfaceC5976f);
        }

        @Override // p257r8.AbstractC6532a
        public final Object invokeSuspend(Object obj) {
            this.f5554q = obj;
            this.f5556s |= Integer.MIN_VALUE;
            return C2000b.this.m7216c(0L, this);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x004e, code lost:
    
        if (r12 == r0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006d, code lost:
    
        if (r12 == r0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006f, code lost:
    
        return r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m7214a(long r8, long r10, p228p8.InterfaceC5976f r12) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r12 instanceof p058e2.C2000b.b
            if (r0 == 0) goto L14
            r0 = r12
            e2.b$b r0 = (p058e2.C2000b.b) r0
            int r1 = r0.f5553s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f5553s = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            e2.b$b r0 = new e2.b$b
            r0.<init>(r12)
            goto L12
        L1a:
            java.lang.Object r12 = r6.f5551q
            java.lang.Object r0 = p242q8.AbstractC6325c.m24992g()
            int r1 = r6.f5553s
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L39
            if (r1 == r3) goto L35
            if (r1 != r2) goto L2e
            p172l8.AbstractC4713t.m18808b(r12)
            goto L70
        L2e:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            p376zd.C10010p0.m38820a(r8)
            r8 = 0
            return r8
        L35:
            p172l8.AbstractC4713t.m18808b(r12)
            goto L51
        L39:
            p172l8.AbstractC4713t.m18808b(r12)
            e2.a r12 = r7.m7220g()
            if (r12 != 0) goto L5f
            e2.e r1 = r7.f5547b
            if (r1 == 0) goto L58
            r6.f5553s = r3
            r2 = r8
            r4 = r10
            java.lang.Object r12 = r1.mo7211V1(r2, r4, r6)
            if (r12 != r0) goto L51
            goto L6f
        L51:
            i3.z r12 = (p121i3.C3196z) r12
            long r8 = r12.m12144o()
            goto L7d
        L58:
            i3.z$a r8 = p121i3.C3196z.f8498b
            long r8 = r8.m12145a()
            goto L7d
        L5f:
            r4 = r10
            e2.a r1 = r7.m7220g()
            if (r1 == 0) goto L77
            r6.f5553s = r2
            r2 = r8
            java.lang.Object r12 = r1.mo7211V1(r2, r4, r6)
            if (r12 != r0) goto L70
        L6f:
            return r0
        L70:
            i3.z r12 = (p121i3.C3196z) r12
            long r8 = r12.m12144o()
            goto L7d
        L77:
            i3.z$a r8 = p121i3.C3196z.f8498b
            long r8 = r8.m12145a()
        L7d:
            i3.z r8 = p121i3.C3196z.m12131b(r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p058e2.C2000b.m7214a(long, long, p8.f):java.lang.Object");
    }

    /* JADX INFO: renamed from: b */
    public final long m7215b(long j10, long j11, int i10) {
        InterfaceC1999a interfaceC1999aM7220g = m7220g();
        return interfaceC1999aM7220g != null ? interfaceC1999aM7220g.mo7210L1(j10, j11, i10) : C6455e.f20314b.m25569c();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m7216c(long r5, p228p8.InterfaceC5976f r7) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r7 instanceof p058e2.C2000b.c
            if (r0 == 0) goto L13
            r0 = r7
            e2.b$c r0 = (p058e2.C2000b.c) r0
            int r1 = r0.f5556s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5556s = r1
            goto L18
        L13:
            e2.b$c r0 = new e2.b$c
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f5554q
            java.lang.Object r1 = p242q8.AbstractC6325c.m24992g()
            int r2 = r0.f5556s
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L29
            p172l8.AbstractC4713t.m18808b(r7)
            goto L42
        L29:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            p376zd.C10010p0.m38820a(r5)
            r5 = 0
            return r5
        L30:
            p172l8.AbstractC4713t.m18808b(r7)
            e2.a r7 = r4.m7220g()
            if (r7 == 0) goto L49
            r0.f5556s = r3
            java.lang.Object r7 = r7.mo7212Z0(r5, r0)
            if (r7 != r1) goto L42
            return r1
        L42:
            i3.z r7 = (p121i3.C3196z) r7
            long r5 = r7.m12144o()
            goto L4f
        L49:
            i3.z$a r5 = p121i3.C3196z.f8498b
            long r5 = r5.m12145a()
        L4f:
            i3.z r5 = p121i3.C3196z.m12131b(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p058e2.C2000b.m7216c(long, p8.f):java.lang.Object");
    }

    /* JADX INFO: renamed from: d */
    public final long m7217d(long j10, int i10) {
        InterfaceC1999a interfaceC1999aM7220g = m7220g();
        return interfaceC1999aM7220g != null ? interfaceC1999aM7220g.mo7213a1(j10, i10) : C6455e.f20314b.m25569c();
    }

    /* JADX INFO: renamed from: e */
    public final InterfaceC2165o0 m7218e() {
        InterfaceC2165o0 interfaceC2165o0 = (InterfaceC2165o0) this.f5548c.invoke();
        if (interfaceC2165o0 != null) {
            return interfaceC2165o0;
        }
        C10010p0.m38820a("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
        return null;
    }

    /* JADX INFO: renamed from: f */
    public final C2003e m7219f() {
        return this.f5546a;
    }

    /* JADX INFO: renamed from: g */
    public final InterfaceC1999a m7220g() {
        C2003e c2003e = this.f5546a;
        if (c2003e != null) {
            return c2003e.m7234J2();
        }
        return null;
    }

    /* JADX INFO: renamed from: h */
    public final InterfaceC2165o0 m7221h() {
        return this.f5549d;
    }

    /* JADX INFO: renamed from: i */
    public final void m7222i(InterfaceC0173a interfaceC0173a) {
        this.f5548c = interfaceC0173a;
    }

    /* JADX INFO: renamed from: j */
    public final void m7223j(C2003e c2003e) {
        this.f5547b = c2003e;
    }

    /* JADX INFO: renamed from: k */
    public final void m7224k(C2003e c2003e) {
        this.f5546a = c2003e;
    }

    /* JADX INFO: renamed from: l */
    public final void m7225l(InterfaceC2165o0 interfaceC2165o0) {
        this.f5549d = interfaceC2165o0;
    }
}
