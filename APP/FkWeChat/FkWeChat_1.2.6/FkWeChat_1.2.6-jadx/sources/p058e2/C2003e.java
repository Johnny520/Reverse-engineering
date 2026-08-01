package p058e2;

import ec.AbstractC2169p0;
import ec.InterfaceC2165o0;
import p010a9.InterfaceC0173a;
import p024b9.AbstractC1061t;
import p024b9.AbstractC1067w;
import p165l1.InterfaceC4507m;
import p166l2.AbstractC4560k2;
import p166l2.InterfaceC4556j2;
import p228p8.InterfaceC5976f;
import p250r1.C6455e;
import p257r8.AbstractC6535d;
import p376zd.C10010p0;

/* JADX INFO: renamed from: e2.e */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C2003e extends InterfaceC4507m.c implements InterfaceC4556j2, InterfaceC1999a {

    /* JADX INFO: renamed from: F */
    public InterfaceC1999a f5559F;

    /* JADX INFO: renamed from: G */
    public C2000b f5560G;

    /* JADX INFO: renamed from: H */
    public C2003e f5561H;

    /* JADX INFO: renamed from: I */
    public final Object f5562I;

    /* JADX INFO: renamed from: e2.e$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends AbstractC6535d {

        /* JADX INFO: renamed from: q */
        public long f5563q;

        /* JADX INFO: renamed from: r */
        public long f5564r;

        /* JADX INFO: renamed from: s */
        public /* synthetic */ Object f5565s;

        /* JADX INFO: renamed from: u */
        public int f5567u;

        public a(InterfaceC5976f interfaceC5976f) {
            super(interfaceC5976f);
        }

        @Override // p257r8.AbstractC6532a
        public final Object invokeSuspend(Object obj) {
            this.f5565s = obj;
            this.f5567u |= Integer.MIN_VALUE;
            return C2003e.this.mo7211V1(0L, 0L, this);
        }
    }

    /* JADX INFO: renamed from: e2.e$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b extends AbstractC6535d {

        /* JADX INFO: renamed from: q */
        public long f5568q;

        /* JADX INFO: renamed from: r */
        public /* synthetic */ Object f5569r;

        /* JADX INFO: renamed from: t */
        public int f5571t;

        public b(InterfaceC5976f interfaceC5976f) {
            super(interfaceC5976f);
        }

        @Override // p257r8.AbstractC6532a
        public final Object invokeSuspend(Object obj) {
            this.f5569r = obj;
            this.f5571t |= Integer.MIN_VALUE;
            return C2003e.this.mo7212Z0(0L, this);
        }
    }

    /* JADX INFO: renamed from: e2.e$c */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class c extends AbstractC1067w implements InterfaceC0173a {
        public c() {
            super(0);
        }

        @Override // p010a9.InterfaceC0173a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC2165o0 invoke() {
            return C2003e.this.m7232H2();
        }
    }

    public C2003e(InterfaceC1999a interfaceC1999a, C2000b c2000b) {
        this.f5559F = interfaceC1999a;
        this.f5560G = c2000b == null ? new C2000b() : c2000b;
        this.f5562I = "androidx.compose.ui.input.nestedscroll.NestedScrollNode";
    }

    /* JADX INFO: renamed from: H2 */
    public final InterfaceC2165o0 m7232H2() {
        C2003e c2003eM7234J2 = m7234J2();
        InterfaceC2165o0 interfaceC2165o0M7232H2 = c2003eM7234J2 != null ? c2003eM7234J2.m7232H2() : null;
        if (interfaceC2165o0M7232H2 != null && AbstractC2169p0.m7884g(interfaceC2165o0M7232H2)) {
            return interfaceC2165o0M7232H2;
        }
        InterfaceC2165o0 interfaceC2165o0M7221h = this.f5560G.m7221h();
        if (interfaceC2165o0M7221h != null) {
            return interfaceC2165o0M7221h;
        }
        C10010p0.m38820a("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
        return null;
    }

    /* JADX INFO: renamed from: I2 */
    public final InterfaceC1999a m7233I2() {
        if (m17461m2()) {
            return m7234J2();
        }
        return null;
    }

    /* JADX INFO: renamed from: J2 */
    public final C2003e m7234J2() {
        if (m17461m2()) {
            return (C2003e) AbstractC4560k2.m18020b(this);
        }
        return null;
    }

    /* JADX INFO: renamed from: K2 */
    public final void m7235K2() {
        if (this.f5560G.m7219f() == this) {
            this.f5560G.m7224k(null);
        }
    }

    @Override // p058e2.InterfaceC1999a
    /* JADX INFO: renamed from: L1 */
    public long mo7210L1(long j10, long j11, int i10) {
        long jMo7210L1 = this.f5559F.mo7210L1(j10, j11, i10);
        InterfaceC1999a interfaceC1999aM7233I2 = m7233I2();
        return C6455e.m25563q(jMo7210L1, interfaceC1999aM7233I2 != null ? interfaceC1999aM7233I2.mo7210L1(C6455e.m25563q(j10, jMo7210L1), C6455e.m25562p(j11, jMo7210L1), i10) : C6455e.f20314b.m25569c());
    }

    /* JADX INFO: renamed from: L2 */
    public final void m7236L2(C2000b c2000b) {
        m7235K2();
        if (c2000b == null) {
            this.f5560G = new C2000b();
        } else if (!AbstractC1061t.m3842c(c2000b, this.f5560G)) {
            this.f5560G = c2000b;
        }
        if (m17461m2()) {
            m7237M2();
        }
    }

    /* JADX INFO: renamed from: M2 */
    public final void m7237M2() {
        this.f5560G.m7224k(this);
        this.f5560G.m7223j(null);
        this.f5561H = null;
        this.f5560G.m7222i(new c());
        this.f5560G.m7225l(m17455f2());
    }

    /* JADX INFO: renamed from: N2 */
    public final void m7238N2(InterfaceC1999a interfaceC1999a, C2000b c2000b) {
        this.f5559F = interfaceC1999a;
        m7236L2(c2000b);
    }

    @Override // p166l2.InterfaceC4556j2
    /* JADX INFO: renamed from: T */
    public Object mo1308T() {
        return this.f5562I;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @Override // p058e2.InterfaceC1999a
    /* JADX INFO: renamed from: V1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo7211V1(long r11, long r13, p228p8.InterfaceC5976f r15) {
        /*
            r10 = this;
            boolean r0 = r15 instanceof p058e2.C2003e.a
            if (r0 == 0) goto L14
            r0 = r15
            e2.e$a r0 = (p058e2.C2003e.a) r0
            int r1 = r0.f5567u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f5567u = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            e2.e$a r0 = new e2.e$a
            r0.<init>(r15)
            goto L12
        L1a:
            java.lang.Object r15 = r6.f5565s
            java.lang.Object r0 = p242q8.AbstractC6325c.m24992g()
            int r1 = r6.f5567u
            r7 = 2
            r2 = 1
            if (r1 == 0) goto L3f
            if (r1 == r2) goto L37
            if (r1 != r7) goto L30
            long r11 = r6.f5563q
            p172l8.AbstractC4713t.m18808b(r15)
            goto L80
        L30:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            p376zd.C10010p0.m38820a(r11)
            r11 = 0
            return r11
        L37:
            long r13 = r6.f5564r
            long r11 = r6.f5563q
            p172l8.AbstractC4713t.m18808b(r15)
            goto L55
        L3f:
            p172l8.AbstractC4713t.m18808b(r15)
            e2.a r1 = r10.f5559F
            r6.f5563q = r11
            r6.f5564r = r13
            r6.f5567u = r2
            r2 = r11
            r4 = r13
            java.lang.Object r15 = r1.mo7211V1(r2, r4, r6)
            if (r15 != r0) goto L53
            goto L7e
        L53:
            r11 = r2
            r13 = r4
        L55:
            i3.z r15 = (p121i3.C3196z) r15
            long r8 = r15.m12144o()
            boolean r15 = r10.m17461m2()
            if (r15 == 0) goto L67
            e2.a r15 = r10.m7233I2()
        L65:
            r1 = r15
            goto L6a
        L67:
            e2.e r15 = r10.f5561H
            goto L65
        L6a:
            if (r1 == 0) goto L88
            long r2 = p121i3.C3196z.m12141l(r11, r8)
            long r4 = p121i3.C3196z.m12140k(r13, r8)
            r6.f5563q = r8
            r6.f5567u = r7
            java.lang.Object r15 = r1.mo7211V1(r2, r4, r6)
            if (r15 != r0) goto L7f
        L7e:
            return r0
        L7f:
            r11 = r8
        L80:
            i3.z r15 = (p121i3.C3196z) r15
            long r13 = r15.m12144o()
            r8 = r11
            goto L8e
        L88:
            i3.z$a r11 = p121i3.C3196z.f8498b
            long r13 = r11.m12145a()
        L8e:
            long r11 = p121i3.C3196z.m12141l(r8, r13)
            i3.z r11 = p121i3.C3196z.m12131b(r11)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p058e2.C2003e.mo7211V1(long, long, p8.f):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004c, code lost:
    
        if (r11 == r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006e, code lost:
    
        if (r11 != r1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0070, code lost:
    
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // p058e2.InterfaceC1999a
    /* JADX INFO: renamed from: Z0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo7212Z0(long r9, p228p8.InterfaceC5976f r11) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r11 instanceof p058e2.C2003e.b
            if (r0 == 0) goto L13
            r0 = r11
            e2.e$b r0 = (p058e2.C2003e.b) r0
            int r1 = r0.f5571t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5571t = r1
            goto L18
        L13:
            e2.e$b r0 = new e2.e$b
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f5569r
            java.lang.Object r1 = p242q8.AbstractC6325c.m24992g()
            int r2 = r0.f5571t
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3b
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2e
            long r9 = r0.f5568q
            p172l8.AbstractC4713t.m18808b(r11)
            goto L71
        L2e:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            p376zd.C10010p0.m38820a(r9)
            r9 = 0
            return r9
        L35:
            long r9 = r0.f5568q
            p172l8.AbstractC4713t.m18808b(r11)
            goto L4f
        L3b:
            p172l8.AbstractC4713t.m18808b(r11)
            e2.a r11 = r8.m7233I2()
            if (r11 == 0) goto L59
            r0.f5568q = r9
            r0.f5571t = r4
            java.lang.Object r11 = r11.mo7212Z0(r9, r0)
            if (r11 != r1) goto L4f
            goto L70
        L4f:
            i3.z r11 = (p121i3.C3196z) r11
            long r4 = r11.m12144o()
        L55:
            r6 = r4
            r4 = r9
            r9 = r6
            goto L60
        L59:
            i3.z$a r11 = p121i3.C3196z.f8498b
            long r4 = r11.m12145a()
            goto L55
        L60:
            e2.a r11 = r8.f5559F
            long r4 = p121i3.C3196z.m12140k(r4, r9)
            r0.f5568q = r9
            r0.f5571t = r3
            java.lang.Object r11 = r11.mo7212Z0(r4, r0)
            if (r11 != r1) goto L71
        L70:
            return r1
        L71:
            i3.z r11 = (p121i3.C3196z) r11
            long r0 = r11.m12144o()
            long r9 = p121i3.C3196z.m12141l(r9, r0)
            i3.z r9 = p121i3.C3196z.m12131b(r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p058e2.C2003e.mo7212Z0(long, p8.f):java.lang.Object");
    }

    @Override // p058e2.InterfaceC1999a
    /* JADX INFO: renamed from: a1 */
    public long mo7213a1(long j10, int i10) {
        InterfaceC1999a interfaceC1999aM7233I2 = m7233I2();
        long jMo7213a1 = interfaceC1999aM7233I2 != null ? interfaceC1999aM7233I2.mo7213a1(j10, i10) : C6455e.f20314b.m25569c();
        return C6455e.m25563q(jMo7213a1, this.f5559F.mo7213a1(C6455e.m25562p(j10, jMo7213a1), i10));
    }

    @Override // p165l1.InterfaceC4507m.c
    /* JADX INFO: renamed from: p2 */
    public void mo1377p2() {
        m7237M2();
    }

    @Override // p165l1.InterfaceC4507m.c
    /* JADX INFO: renamed from: q2 */
    public void mo1378q2() {
        C2003e c2003e = (C2003e) AbstractC2004f.m7241b(this);
        this.f5561H = c2003e;
        this.f5560G.m7223j(c2003e);
        m7235K2();
    }
}
