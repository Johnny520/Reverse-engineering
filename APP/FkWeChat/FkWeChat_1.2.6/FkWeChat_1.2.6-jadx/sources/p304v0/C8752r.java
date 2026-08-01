package p304v0;

import androidx.compose.runtime.AbstractC0471c3;
import androidx.compose.runtime.InterfaceC0491f2;
import ec.AbstractC2148k;
import ec.InterfaceC2165o0;
import p010a9.InterfaceC0173a;
import p010a9.InterfaceC0188p;
import p024b9.AbstractC1043k;
import p058e2.AbstractC2004f;
import p058e2.AbstractC2005g;
import p058e2.InterfaceC1999a;
import p080f9.AbstractC2368o;
import p166l2.AbstractC4557k;
import p166l2.AbstractC4565m;
import p166l2.InterfaceC4553j;
import p172l8.AbstractC4713t;
import p172l8.C4700i0;
import p228p8.InterfaceC5976f;
import p242q8.AbstractC6325c;
import p250r1.C6455e;
import p257r8.AbstractC6535d;
import p257r8.AbstractC6544m;
import p376zd.C10010p0;

/* JADX INFO: renamed from: v0.r */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C8752r extends AbstractC4565m implements InterfaceC1999a {

    /* JADX INFO: renamed from: H */
    public boolean f29114H;

    /* JADX INFO: renamed from: I */
    public InterfaceC0173a f29115I;

    /* JADX INFO: renamed from: J */
    public boolean f29116J;

    /* JADX INFO: renamed from: K */
    public InterfaceC8753s f29117K;

    /* JADX INFO: renamed from: L */
    public float f29118L;

    /* JADX INFO: renamed from: M */
    public InterfaceC4553j f29119M;

    /* JADX INFO: renamed from: N */
    public final InterfaceC0491f2 f29120N;

    /* JADX INFO: renamed from: O */
    public final InterfaceC0491f2 f29121O;

    /* JADX INFO: renamed from: v0.r$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends AbstractC6535d {

        /* JADX INFO: renamed from: q */
        public /* synthetic */ Object f29122q;

        /* JADX INFO: renamed from: s */
        public int f29124s;

        public a(InterfaceC5976f interfaceC5976f) {
            super(interfaceC5976f);
        }

        @Override // p257r8.AbstractC6532a
        public final Object invokeSuspend(Object obj) {
            this.f29122q = obj;
            this.f29124s |= Integer.MIN_VALUE;
            return C8752r.this.m33562R2(this);
        }
    }

    /* JADX INFO: renamed from: v0.r$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b extends AbstractC6535d {

        /* JADX INFO: renamed from: q */
        public /* synthetic */ Object f29125q;

        /* JADX INFO: renamed from: s */
        public int f29127s;

        public b(InterfaceC5976f interfaceC5976f) {
            super(interfaceC5976f);
        }

        @Override // p257r8.AbstractC6532a
        public final Object invokeSuspend(Object obj) {
            this.f29125q = obj;
            this.f29127s |= Integer.MIN_VALUE;
            return C8752r.this.m33563S2(this);
        }
    }

    /* JADX INFO: renamed from: v0.r$c */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class c extends AbstractC6544m implements InterfaceC0188p {

        /* JADX INFO: renamed from: q */
        public int f29128q;

        public c(InterfaceC5976f interfaceC5976f) {
            super(2, interfaceC5976f);
        }

        @Override // p257r8.AbstractC6532a
        public final InterfaceC5976f create(Object obj, InterfaceC5976f interfaceC5976f) {
            return C8752r.this.new c(interfaceC5976f);
        }

        @Override // p010a9.InterfaceC0188p
        public final Object invoke(InterfaceC2165o0 interfaceC2165o0, InterfaceC5976f interfaceC5976f) {
            return ((c) create(interfaceC2165o0, interfaceC5976f)).invokeSuspend(C4700i0.f13910a);
        }

        @Override // p257r8.AbstractC6532a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM24992g = AbstractC6325c.m24992g();
            int i10 = this.f29128q;
            if (i10 == 0) {
                AbstractC4713t.m18808b(obj);
                InterfaceC8753s interfaceC8753sM33569Y2 = C8752r.this.m33569Y2();
                float f10 = C8752r.this.m33572b3() ? 1.0f : 0.0f;
                this.f29128q = 1;
                if (interfaceC8753sM33569Y2.mo33583b(f10, this) == objM24992g) {
                    return objM24992g;
                }
            } else {
                if (i10 != 1) {
                    C10010p0.m38820a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC4713t.m18808b(obj);
            }
            return C4700i0.f13910a;
        }
    }

    /* JADX INFO: renamed from: v0.r$d */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class d extends AbstractC6544m implements InterfaceC0188p {

        /* JADX INFO: renamed from: q */
        public int f29130q;

        public d(InterfaceC5976f interfaceC5976f) {
            super(2, interfaceC5976f);
        }

        @Override // p257r8.AbstractC6532a
        public final InterfaceC5976f create(Object obj, InterfaceC5976f interfaceC5976f) {
            return C8752r.this.new d(interfaceC5976f);
        }

        @Override // p010a9.InterfaceC0188p
        public final Object invoke(InterfaceC2165o0 interfaceC2165o0, InterfaceC5976f interfaceC5976f) {
            return ((d) create(interfaceC2165o0, interfaceC5976f)).invokeSuspend(C4700i0.f13910a);
        }

        @Override // p257r8.AbstractC6532a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM24992g = AbstractC6325c.m24992g();
            int i10 = this.f29130q;
            if (i10 == 0) {
                AbstractC4713t.m18808b(obj);
                if (!C8752r.this.m33569Y2().mo33585d()) {
                    InterfaceC8753s interfaceC8753sM33569Y2 = C8752r.this.m33569Y2();
                    float fM33571a3 = C8752r.this.m33571a3() / C8752r.this.m33570Z2();
                    this.f29130q = 1;
                    if (interfaceC8753sM33569Y2.mo33583b(fM33571a3, this) == objM24992g) {
                        return objM24992g;
                    }
                }
            } else {
                if (i10 != 1) {
                    C10010p0.m38820a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC4713t.m18808b(obj);
            }
            return C4700i0.f13910a;
        }
    }

    /* JADX INFO: renamed from: v0.r$e */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class e extends AbstractC6535d {

        /* JADX INFO: renamed from: q */
        public float f29132q;

        /* JADX INFO: renamed from: r */
        public /* synthetic */ Object f29133r;

        /* JADX INFO: renamed from: t */
        public int f29135t;

        public e(InterfaceC5976f interfaceC5976f) {
            super(interfaceC5976f);
        }

        @Override // p257r8.AbstractC6532a
        public final Object invokeSuspend(Object obj) {
            this.f29133r = obj;
            this.f29135t |= Integer.MIN_VALUE;
            return C8752r.this.mo7212Z0(0L, this);
        }
    }

    /* JADX INFO: renamed from: v0.r$f */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class f extends AbstractC6535d {

        /* JADX INFO: renamed from: q */
        public float f29136q;

        /* JADX INFO: renamed from: r */
        public /* synthetic */ Object f29137r;

        /* JADX INFO: renamed from: t */
        public int f29139t;

        public f(InterfaceC5976f interfaceC5976f) {
            super(interfaceC5976f);
        }

        @Override // p257r8.AbstractC6532a
        public final Object invokeSuspend(Object obj) {
            this.f29137r = obj;
            this.f29139t |= Integer.MIN_VALUE;
            return C8752r.this.m33573c3(0.0f, this);
        }
    }

    /* JADX INFO: renamed from: v0.r$g */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class g extends AbstractC6544m implements InterfaceC0188p {

        /* JADX INFO: renamed from: q */
        public int f29140q;

        public g(InterfaceC5976f interfaceC5976f) {
            super(2, interfaceC5976f);
        }

        @Override // p257r8.AbstractC6532a
        public final InterfaceC5976f create(Object obj, InterfaceC5976f interfaceC5976f) {
            return C8752r.this.new g(interfaceC5976f);
        }

        @Override // p010a9.InterfaceC0188p
        public final Object invoke(InterfaceC2165o0 interfaceC2165o0, InterfaceC5976f interfaceC5976f) {
            return ((g) create(interfaceC2165o0, interfaceC5976f)).invokeSuspend(C4700i0.f13910a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x002d, code lost:
        
            if (r1.m33562R2(r4) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0036, code lost:
        
            if (r1.m33563S2(r4) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0038, code lost:
        
            return r0;
         */
        @Override // p257r8.AbstractC6532a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) throws java.lang.Throwable {
            /*
                r4 = this;
                java.lang.Object r0 = p242q8.AbstractC6325c.m24992g()
                int r1 = r4.f29140q
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1a
                if (r1 == r3) goto L16
                if (r1 != r2) goto Lf
                goto L16
            Lf:
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                p376zd.C10010p0.m38820a(r5)
                r5 = 0
                return r5
            L16:
                p172l8.AbstractC4713t.m18808b(r5)
                goto L39
            L1a:
                p172l8.AbstractC4713t.m18808b(r5)
                v0.r r5 = p304v0.C8752r.this
                boolean r5 = r5.m33572b3()
                v0.r r1 = p304v0.C8752r.this
                if (r5 != 0) goto L30
                r4.f29140q = r3
                java.lang.Object r5 = p304v0.C8752r.m33557M2(r1, r4)
                if (r5 != r0) goto L39
                goto L38
            L30:
                r4.f29140q = r2
                java.lang.Object r5 = p304v0.C8752r.m33558N2(r1, r4)
                if (r5 != r0) goto L39
            L38:
                return r0
            L39:
                l8.i0 r5 = p172l8.C4700i0.f13910a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: p304v0.C8752r.g.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public C8752r(boolean z10, InterfaceC0173a interfaceC0173a, boolean z11, InterfaceC8753s interfaceC8753s, float f10) {
        this.f29114H = z10;
        this.f29115I = interfaceC0173a;
        this.f29116J = z11;
        this.f29117K = interfaceC8753s;
        this.f29118L = f10;
        this.f29119M = AbstractC2004f.m7242c(this, null);
        this.f29120N = AbstractC0471c3.m1561a(0.0f);
        this.f29121O = AbstractC0471c3.m1561a(0.0f);
    }

    @Override // p058e2.InterfaceC1999a
    /* JADX INFO: renamed from: L1 */
    public long mo7210L1(long j10, long j11, int i10) {
        if (this.f29117K.mo33585d()) {
            return C6455e.f20314b.m25569c();
        }
        if (!this.f29116J) {
            return C6455e.f20314b.m25569c();
        }
        if (!AbstractC2005g.m7247d(i10, AbstractC2005g.f5574a.m7249b())) {
            return C6455e.f20314b.m25569c();
        }
        long jM33565U2 = m33565U2(j11);
        AbstractC2148k.m7817d(m17455f2(), null, null, new d(null), 3, null);
        return jM33565U2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: R2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m33562R2(p228p8.InterfaceC5976f r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof p304v0.C8752r.a
            if (r0 == 0) goto L13
            r0 = r6
            v0.r$a r0 = (p304v0.C8752r.a) r0
            int r1 = r0.f29124s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f29124s = r1
            goto L18
        L13:
            v0.r$a r0 = new v0.r$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f29122q
            java.lang.Object r1 = p242q8.AbstractC6325c.m24992g()
            int r2 = r0.f29124s
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2c
            p172l8.AbstractC4713t.m18808b(r6)     // Catch: java.lang.Throwable -> L2a
            goto L41
        L2a:
            r6 = move-exception
            goto L4a
        L2c:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            p376zd.C10010p0.m38820a(r6)
            r6 = 0
            return r6
        L33:
            p172l8.AbstractC4713t.m18808b(r6)
            v0.s r6 = r5.f29117K     // Catch: java.lang.Throwable -> L2a
            r0.f29124s = r3     // Catch: java.lang.Throwable -> L2a
            java.lang.Object r6 = r6.mo33586e(r0)     // Catch: java.lang.Throwable -> L2a
            if (r6 != r1) goto L41
            return r1
        L41:
            r5.m33574d3(r4)
            r5.m33580j3(r4)
            l8.i0 r6 = p172l8.C4700i0.f13910a
            return r6
        L4a:
            r5.m33574d3(r4)
            r5.m33580j3(r4)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p304v0.C8752r.m33562R2(p8.f):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: S2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m33563S2(p228p8.InterfaceC5976f r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof p304v0.C8752r.b
            if (r0 == 0) goto L13
            r0 = r5
            v0.r$b r0 = (p304v0.C8752r.b) r0
            int r1 = r0.f29127s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f29127s = r1
            goto L18
        L13:
            v0.r$b r0 = new v0.r$b
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f29125q
            java.lang.Object r1 = p242q8.AbstractC6325c.m24992g()
            int r2 = r0.f29127s
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2b
            p172l8.AbstractC4713t.m18808b(r5)     // Catch: java.lang.Throwable -> L29
            goto L40
        L29:
            r5 = move-exception
            goto L59
        L2b:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            p376zd.C10010p0.m38820a(r5)
            r5 = 0
            return r5
        L32:
            p172l8.AbstractC4713t.m18808b(r5)
            v0.s r5 = r4.f29117K     // Catch: java.lang.Throwable -> L29
            r0.f29127s = r3     // Catch: java.lang.Throwable -> L29
            java.lang.Object r5 = r5.mo33584c(r0)     // Catch: java.lang.Throwable -> L29
            if (r5 != r1) goto L40
            return r1
        L40:
            boolean r5 = r4.m17461m2()
            if (r5 == 0) goto L56
            int r5 = r4.m33570Z2()
            float r5 = (float) r5
            r4.m33574d3(r5)
            int r5 = r4.m33570Z2()
            float r5 = (float) r5
            r4.m33580j3(r5)
        L56:
            l8.i0 r5 = p172l8.C4700i0.f13910a
            return r5
        L59:
            boolean r0 = r4.m17461m2()
            if (r0 == 0) goto L6f
            int r0 = r4.m33570Z2()
            float r0 = (float) r0
            r4.m33574d3(r0)
            int r0 = r4.m33570Z2()
            float r0 = (float) r0
            r4.m33580j3(r0)
        L6f:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p304v0.C8752r.m33563S2(p8.f):java.lang.Object");
    }

    /* JADX INFO: renamed from: T2 */
    public final float m33564T2() {
        if (m33566V2() <= m33570Z2()) {
            return m33566V2();
        }
        float fM8585l = AbstractC2368o.m8585l(Math.abs(m33568X2()) - 1.0f, 0.0f, 2.0f);
        return m33570Z2() + (m33570Z2() * (fM8585l - (((float) Math.pow(fM8585l, 2)) / 4)));
    }

    /* JADX INFO: renamed from: U2 */
    public final long m33565U2(long j10) {
        float fM33567W2;
        if (this.f29114H) {
            fM33567W2 = 0.0f;
        } else {
            float fM8577d = AbstractC2368o.m8577d(m33567W2() + Float.intBitsToFloat((int) (j10 & 4294967295L)), 0.0f);
            fM33567W2 = fM8577d - m33567W2();
            m33574d3(fM8577d);
            m33580j3(m33564T2());
        }
        return C6455e.m25551e((((long) Float.floatToRawIntBits(fM33567W2)) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32));
    }

    /* JADX INFO: renamed from: V2 */
    public final float m33566V2() {
        return m33567W2() * 0.5f;
    }

    /* JADX INFO: renamed from: W2 */
    public final float m33567W2() {
        return this.f29121O.mo1663b();
    }

    /* JADX INFO: renamed from: X2 */
    public final float m33568X2() {
        return m33566V2() / m33570Z2();
    }

    /* JADX INFO: renamed from: Y2 */
    public final InterfaceC8753s m33569Y2() {
        return this.f29117K;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // p058e2.InterfaceC1999a
    /* JADX INFO: renamed from: Z0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo7212Z0(long r5, p228p8.InterfaceC5976f r7) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r7 instanceof p304v0.C8752r.e
            if (r0 == 0) goto L13
            r0 = r7
            v0.r$e r0 = (p304v0.C8752r.e) r0
            int r1 = r0.f29135t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f29135t = r1
            goto L18
        L13:
            v0.r$e r0 = new v0.r$e
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f29133r
            java.lang.Object r1 = p242q8.AbstractC6325c.m24992g()
            int r2 = r0.f29135t
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2b
            float r5 = r0.f29132q
            p172l8.AbstractC4713t.m18808b(r7)
            goto L46
        L2b:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            p376zd.C10010p0.m38820a(r5)
            r5 = 0
            return r5
        L32:
            p172l8.AbstractC4713t.m18808b(r7)
            float r5 = p121i3.C3196z.m12138i(r5)
            r6 = 0
            r0.f29132q = r6
            r0.f29135t = r3
            java.lang.Object r7 = r4.m33573c3(r5, r0)
            if (r7 != r1) goto L45
            return r1
        L45:
            r5 = r6
        L46:
            java.lang.Number r7 = (java.lang.Number) r7
            float r6 = r7.floatValue()
            long r5 = p121i3.AbstractC3171a0.m11961a(r5, r6)
            i3.z r5 = p121i3.C3196z.m12131b(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p304v0.C8752r.mo7212Z0(long, p8.f):java.lang.Object");
    }

    /* JADX INFO: renamed from: Z2 */
    public final int m33570Z2() {
        return AbstractC4557k.m18011m(this).mo1236x1(this.f29118L);
    }

    @Override // p058e2.InterfaceC1999a
    /* JADX INFO: renamed from: a1 */
    public long mo7213a1(long j10, int i10) {
        return this.f29117K.mo33585d() ? C6455e.f20314b.m25569c() : !this.f29116J ? C6455e.f20314b.m25569c() : (!AbstractC2005g.m7247d(i10, AbstractC2005g.f5574a.m7249b()) || Float.intBitsToFloat((int) (4294967295L & j10)) >= 0.0f) ? C6455e.f20314b.m25569c() : m33565U2(j10);
    }

    /* JADX INFO: renamed from: a3 */
    public final float m33571a3() {
        return this.f29120N.mo1663b();
    }

    /* JADX INFO: renamed from: b3 */
    public final boolean m33572b3() {
        return this.f29114H;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: c3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m33573c3(float r6, p228p8.InterfaceC5976f r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof p304v0.C8752r.f
            if (r0 == 0) goto L13
            r0 = r7
            v0.r$f r0 = (p304v0.C8752r.f) r0
            int r1 = r0.f29139t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f29139t = r1
            goto L18
        L13:
            v0.r$f r0 = new v0.r$f
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f29137r
            java.lang.Object r1 = p242q8.AbstractC6325c.m24992g()
            int r2 = r0.f29139t
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2c
            float r6 = r0.f29136q
            p172l8.AbstractC4713t.m18808b(r7)
            goto L6b
        L2c:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            p376zd.C10010p0.m38820a(r6)
            r6 = 0
            return r6
        L33:
            p172l8.AbstractC4713t.m18808b(r7)
            boolean r7 = r5.f29114H
            if (r7 == 0) goto L3f
            java.lang.Float r6 = p257r8.AbstractC6533b.m25847c(r4)
            return r6
        L3f:
            float r7 = r5.m33566V2()
            int r2 = r5.m33570Z2()
            float r2 = (float) r2
            int r7 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r7 <= 0) goto L51
            a9.a r7 = r5.f29115I
            r7.invoke()
        L51:
            float r7 = r5.m33567W2()
            int r7 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r7 != 0) goto L5b
        L59:
            r6 = r4
            goto L60
        L5b:
            int r7 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r7 >= 0) goto L60
            goto L59
        L60:
            r0.f29136q = r6
            r0.f29139t = r3
            java.lang.Object r7 = r5.m33562R2(r0)
            if (r7 != r1) goto L6b
            return r1
        L6b:
            r5.m33574d3(r4)
            java.lang.Float r6 = p257r8.AbstractC6533b.m25847c(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p304v0.C8752r.m33573c3(float, p8.f):java.lang.Object");
    }

    /* JADX INFO: renamed from: d3 */
    public final void m33574d3(float f10) {
        this.f29121O.mo1664h(f10);
    }

    /* JADX INFO: renamed from: e3 */
    public final void m33575e3(boolean z10) {
        this.f29116J = z10;
    }

    /* JADX INFO: renamed from: f3 */
    public final void m33576f3(InterfaceC0173a interfaceC0173a) {
        this.f29115I = interfaceC0173a;
    }

    /* JADX INFO: renamed from: g3 */
    public final void m33577g3(boolean z10) {
        this.f29114H = z10;
    }

    /* JADX INFO: renamed from: h3 */
    public final void m33578h3(InterfaceC8753s interfaceC8753s) {
        this.f29117K = interfaceC8753s;
    }

    /* JADX INFO: renamed from: i3 */
    public final void m33579i3(float f10) {
        this.f29118L = f10;
    }

    /* JADX INFO: renamed from: j3 */
    public final void m33580j3(float f10) {
        this.f29120N.mo1664h(f10);
    }

    @Override // p165l1.InterfaceC4507m.c
    /* JADX INFO: renamed from: k2 */
    public boolean mo1260k2() {
        return false;
    }

    /* JADX INFO: renamed from: k3 */
    public final void m33581k3() {
        AbstractC2148k.m7817d(m17455f2(), null, null, new g(null), 3, null);
    }

    @Override // p165l1.InterfaceC4507m.c
    /* JADX INFO: renamed from: p2 */
    public void mo1377p2() {
        m18049G2(this.f29119M);
        AbstractC2148k.m7817d(m17455f2(), null, null, new c(null), 3, null);
        m33580j3(this.f29114H ? m33570Z2() : 0.0f);
    }

    public /* synthetic */ C8752r(boolean z10, InterfaceC0173a interfaceC0173a, boolean z11, InterfaceC8753s interfaceC8753s, float f10, AbstractC1043k abstractC1043k) {
        this(z10, interfaceC0173a, z11, interfaceC8753s, f10);
    }
}
