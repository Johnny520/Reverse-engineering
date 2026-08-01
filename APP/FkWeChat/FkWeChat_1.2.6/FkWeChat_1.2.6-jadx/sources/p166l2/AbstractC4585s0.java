package p166l2;

import java.util.Map;
import p010a9.InterfaceC0173a;
import p010a9.InterfaceC0184l;
import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;
import p024b9.AbstractC1067w;
import p117i.C3082r0;
import p117i.C3084s0;
import p120i2.AbstractC3167a;
import p121i3.AbstractC3186p;
import p121i3.C3185o;
import p121i3.C3189s;
import p135j2.AbstractC3499a;
import p135j2.AbstractC3545l1;
import p135j2.AbstractC3549m1;
import p135j2.AbstractC3571t1;
import p135j2.AbstractC3581x;
import p135j2.C3526g2;
import p135j2.InterfaceC3558p0;
import p135j2.InterfaceC3577v1;
import p135j2.InterfaceC3578w;
import p166l2.C4554j0;
import p172l8.C4700i0;
import p215oc.C5725t;

/* JADX INFO: renamed from: l2.s0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4585s0 extends AbstractC3545l1 implements InterfaceC4600x0, InterfaceC4519a1 {

    /* JADX INFO: renamed from: E */
    public static final b f13469E = new b(null);

    /* JADX INFO: renamed from: F */
    public static final InterfaceC0184l f13470F = a.f13480r;

    /* JADX INFO: renamed from: A */
    public boolean f13471A;

    /* JADX INFO: renamed from: B */
    public final AbstractC3545l1.a f13472B = AbstractC3549m1.m13298a(this);

    /* JADX INFO: renamed from: C */
    public C4520a2 f13473C;

    /* JADX INFO: renamed from: D */
    public C3082r0 f13474D;

    /* JADX INFO: renamed from: v */
    public c f13475v;

    /* JADX INFO: renamed from: w */
    public InterfaceC0184l f13476w;

    /* JADX INFO: renamed from: x */
    public C4595v1 f13477x;

    /* JADX INFO: renamed from: y */
    public boolean f13478y;

    /* JADX INFO: renamed from: z */
    public boolean f13479z;

    /* JADX INFO: renamed from: l2.s0$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends AbstractC1067w implements InterfaceC0184l {

        /* JADX INFO: renamed from: r */
        public static final a f13480r = new a();

        public a() {
            super(1);
        }

        /* JADX INFO: renamed from: a */
        public final void m18217a(C4595v1 c4595v1) {
            if (c4595v1.mo17556g0()) {
                c4595v1.m18358a().m18213o1(c4595v1);
            }
        }

        @Override // p010a9.InterfaceC0184l
        /* JADX INFO: renamed from: m */
        public /* bridge */ /* synthetic */ Object mo27m(Object obj) {
            m18217a((C4595v1) obj);
            return C4700i0.f13910a;
        }
    }

    /* JADX INFO: renamed from: l2.s0$c */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public final class c implements InterfaceC3577v1 {

        /* JADX INFO: renamed from: q */
        public boolean f13481q;

        /* JADX INFO: renamed from: r */
        public long f13482r = C3185o.f8471b.m12057a();

        /* JADX INFO: renamed from: s */
        public long f13483s = C3189s.f8481b.m12088a();

        public c() {
        }

        /* JADX INFO: renamed from: a */
        public final long m18218a() {
            return this.f13483s;
        }

        @Override // p121i3.InterfaceC3183m
        /* JADX INFO: renamed from: c1 */
        public float mo1231c1() {
            return AbstractC4585s0.this.mo1231c1();
        }

        /* JADX INFO: renamed from: d */
        public final boolean m18219d() {
            return this.f13481q;
        }

        /* JADX INFO: renamed from: g */
        public final long m18220g() {
            return this.f13482r;
        }

        @Override // p121i3.InterfaceC3175e
        public float getDensity() {
            return AbstractC4585s0.this.getDensity();
        }

        @Override // p135j2.InterfaceC3577v1
        /* JADX INFO: renamed from: h1 */
        public void mo13368h1(AbstractC3571t1 abstractC3571t1, float f10) {
            AbstractC4585s0.this.m18208d2(abstractC3571t1, f10);
        }

        /* JADX INFO: renamed from: l */
        public final void m18221l(boolean z10) {
            this.f13481q = z10;
        }

        @Override // p135j2.InterfaceC3577v1
        /* JADX INFO: renamed from: n */
        public InterfaceC3578w mo13369n() {
            this.f13481q = true;
            InterfaceC3578w interfaceC3578wMo17733n = AbstractC4585s0.this.mo17733n();
            if (C3185o.m12048h(this.f13482r, C3185o.f8471b.m12057a())) {
                this.f13482r = AbstractC3186p.m12061c(AbstractC3581x.m13418i(interfaceC3578wMo17733n));
                this.f13483s = interfaceC3578wMo17733n.mo13242a();
            }
            AbstractC4585s0.this.mo17689I1().m17929f0().m18085H();
            return interfaceC3578wMo17733n;
        }

        /* JADX INFO: renamed from: o */
        public final void m18222o(long j10) {
            this.f13482r = j10;
        }

        /* JADX INFO: renamed from: q */
        public final void m18223q(long j10) {
            this.f13483s = j10;
        }
    }

    /* JADX INFO: renamed from: l2.s0$d */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class d extends AbstractC1067w implements InterfaceC0173a {

        /* JADX INFO: renamed from: s */
        public final /* synthetic */ long f13486s;

        /* JADX INFO: renamed from: t */
        public final /* synthetic */ long f13487t;

        /* JADX INFO: renamed from: u */
        public final /* synthetic */ C4595v1 f13488u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(long j10, long j11, C4595v1 c4595v1) {
            super(0);
            this.f13486s = j10;
            this.f13487t = j11;
            this.f13488u = c4595v1;
        }

        /* JADX INFO: renamed from: a */
        public final void m18224a() {
            AbstractC4585s0.this.m18200Q1().m18221l(false);
            AbstractC4585s0.this.m18200Q1().m18222o(this.f13486s);
            AbstractC4585s0.this.m18200Q1().m18223q(this.f13487t);
            InterfaceC0184l interfaceC0184lMo13081p = this.f13488u.m18359b().mo13081p();
            if (interfaceC0184lMo13081p != null) {
                interfaceC0184lMo13081p.mo27m(AbstractC4585s0.this.m18200Q1());
            }
        }

        @Override // p010a9.InterfaceC0173a
        public /* bridge */ /* synthetic */ Object invoke() {
            m18224a();
            return C4700i0.f13910a;
        }
    }

    /* JADX INFO: renamed from: l2.s0$e */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class e implements InterfaceC3558p0 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f13489a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f13490b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Map f13491c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ InterfaceC0184l f13492d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ InterfaceC0184l f13493e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ AbstractC4585s0 f13494f;

        public e(int i10, int i11, Map map, InterfaceC0184l interfaceC0184l, InterfaceC0184l interfaceC0184l2, AbstractC4585s0 abstractC4585s0) {
            this.f13489a = i10;
            this.f13490b = i11;
            this.f13491c = map;
            this.f13492d = interfaceC0184l;
            this.f13493e = interfaceC0184l2;
            this.f13494f = abstractC4585s0;
        }

        @Override // p135j2.InterfaceC3558p0
        /* JADX INFO: renamed from: a */
        public int mo13077a() {
            return this.f13490b;
        }

        @Override // p135j2.InterfaceC3558p0
        /* JADX INFO: renamed from: e */
        public int mo13078e() {
            return this.f13489a;
        }

        @Override // p135j2.InterfaceC3558p0
        /* JADX INFO: renamed from: l */
        public Map mo13079l() {
            return this.f13491c;
        }

        @Override // p135j2.InterfaceC3558p0
        /* JADX INFO: renamed from: m */
        public void mo13080m() {
            this.f13493e.mo27m(this.f13494f.m18199N1());
        }

        @Override // p135j2.InterfaceC3558p0
        /* JADX INFO: renamed from: p */
        public InterfaceC0184l mo13081p() {
            return this.f13492d;
        }
    }

    /* JADX INFO: renamed from: l1 */
    public static /* synthetic */ void m18198l1(AbstractC4585s0 abstractC4585s0, C4595v1 c4595v1, long j10, long j11, int i10, Object obj) {
        if (obj != null) {
            C5725t.m23179a("Super calls with default arguments not supported in this target, function: captureRulers-OSxE8f4");
            return;
        }
        if ((i10 & 2) != 0) {
            j10 = C3185o.f8471b.m12057a();
        }
        long j12 = j10;
        if ((i10 & 4) != 0) {
            j11 = C3189s.f8481b.m12088a();
        }
        abstractC4585s0.m18212k1(c4595v1, j12, j11);
    }

    /* JADX INFO: renamed from: B1 */
    public abstract AbstractC4585s0 mo17675B1();

    @Override // p135j2.InterfaceC3564r0
    /* JADX INFO: renamed from: G */
    public final int mo13237G(AbstractC3499a abstractC3499a) {
        int iMo17652j1;
        if (mo17686H1() && (iMo17652j1 = mo17652j1(abstractC3499a)) != Integer.MIN_VALUE) {
            return iMo17652j1 + (abstractC3499a instanceof C3526g2 ? C3185o.m12049i(m13258E0()) : C3185o.m12050j(m13258E0()));
        }
        return Integer.MIN_VALUE;
    }

    /* JADX INFO: renamed from: H1 */
    public abstract boolean mo17686H1();

    /* JADX INFO: renamed from: I1 */
    public abstract C4554j0 mo17689I1();

    /* JADX INFO: renamed from: L1 */
    public abstract InterfaceC3558p0 mo17696L1();

    /* JADX INFO: renamed from: M1 */
    public abstract AbstractC4585s0 mo17699M1();

    /* JADX INFO: renamed from: N1 */
    public final AbstractC3545l1.a m18199N1() {
        return this.f13472B;
    }

    /* JADX INFO: renamed from: P1 */
    public abstract long mo17705P1();

    /* JADX INFO: renamed from: Q1 */
    public final c m18200Q1() {
        c cVar = this.f13475v;
        if (cVar != null) {
            return cVar;
        }
        c cVar2 = new c();
        this.f13475v = cVar2;
        return cVar2;
    }

    /* JADX INFO: renamed from: R1 */
    public final void m18201R1(AbstractC4539f1 abstractC4539f1) {
        AbstractC4517a abstractC4517aMo17532l;
        AbstractC4539f1 abstractC4539f1M17715W2 = abstractC4539f1.m17715W2();
        if (!AbstractC1061t.m3842c(abstractC4539f1M17715W2 != null ? abstractC4539f1M17715W2.mo17689I1() : null, abstractC4539f1.mo17689I1())) {
            abstractC4539f1.m17690I2().mo17532l().m17502m();
            return;
        }
        InterfaceC4521b interfaceC4521bMo17529O = abstractC4539f1.m17690I2().mo17529O();
        if (interfaceC4521bMo17529O == null || (abstractC4517aMo17532l = interfaceC4521bMo17529O.mo17532l()) == null) {
            return;
        }
        abstractC4517aMo17532l.m17502m();
    }

    @Override // p135j2.InterfaceC3561q0
    /* JADX INFO: renamed from: U1 */
    public InterfaceC3558p0 mo1228U1(int i10, int i11, Map map, InterfaceC0184l interfaceC0184l, InterfaceC0184l interfaceC0184l2) {
        if (!((i10 & (-16777216)) == 0 && ((-16777216) & i11) == 0)) {
            AbstractC3167a.m11956b("Size(" + i10 + " x " + i11 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new e(i10, i11, map, interfaceC0184l, interfaceC0184l2, this);
    }

    /* JADX INFO: renamed from: V1 */
    public final void m18202V1(AbstractC3571t1 abstractC3571t1) {
        C3082r0 c3082r0 = m18215s1(abstractC3571t1).f13474D;
        C3084s0 c3084s0 = c3082r0 != null ? (C3084s0) c3082r0.m11526u(abstractC3571t1) : null;
        if (c3084s0 != null) {
            m18207c2(c3084s0);
        }
    }

    /* JADX INFO: renamed from: X1 */
    public boolean m18203X1() {
        return this.f13478y;
    }

    /* JADX INFO: renamed from: Y1 */
    public final boolean m18204Y1() {
        return this.f13471A;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x009f A[SYNTHETIC] */
    /* JADX INFO: renamed from: a1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m18205a1(p166l2.C4554j0 r32, p135j2.AbstractC3571t1 r33) {
        /*
            Method dump skipped, instruction units count: 392
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p166l2.AbstractC4585s0.m18205a1(l2.j0, j2.t1):void");
    }

    /* JADX INFO: renamed from: b2 */
    public final boolean m18206b2() {
        return this.f13479z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c2 */
    public final void m18207c2(C3084s0 c3084s0) {
        C4554j0 c4554j0;
        Object[] objArr = c3084s0.f8093b;
        long[] jArr = c3084s0.f8092a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128 && (c4554j0 = (C4554j0) ((C4568m2) objArr[(i10 << 3) + i12]).get()) != null) {
                        if (mo1232g1()) {
                            c4554j0.m17852C1(false);
                        } else {
                            c4554j0.m17861G1(false);
                        }
                    }
                    j10 >>= 8;
                }
                if (i11 != 8) {
                    return;
                }
            }
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
    }

    /* JADX INFO: renamed from: d2 */
    public final void m18208d2(AbstractC3571t1 abstractC3571t1, float f10) {
        C4520a2 c4520a2 = this.f13473C;
        if (c4520a2 == null) {
            c4520a2 = new C4520a2();
            this.f13473C = c4520a2;
        }
        c4520a2.m17528e(abstractC3571t1, f10);
    }

    /* JADX INFO: renamed from: e2 */
    public abstract void mo17723e2();

    /* JADX INFO: renamed from: f2 */
    public void m18209f2(boolean z10) {
        this.f13478y = z10;
    }

    @Override // p135j2.InterfaceC3566s
    /* JADX INFO: renamed from: g1 */
    public boolean mo1232g1() {
        return false;
    }

    /* JADX INFO: renamed from: g2 */
    public final void m18210g2(boolean z10) {
        this.f13471A = z10;
    }

    /* JADX INFO: renamed from: h2 */
    public final void m18211h2(boolean z10) {
        this.f13479z = z10;
    }

    @Override // p166l2.InterfaceC4519a1
    /* JADX INFO: renamed from: i0 */
    public void mo17523i0(boolean z10) {
        AbstractC4585s0 abstractC4585s0Mo17699M1 = mo17699M1();
        C4554j0 c4554j0Mo17689I1 = abstractC4585s0Mo17699M1 != null ? abstractC4585s0Mo17699M1.mo17689I1() : null;
        if (AbstractC1061t.m3842c(c4554j0Mo17689I1, mo17689I1())) {
            m18209f2(z10);
            return;
        }
        if ((c4554j0Mo17689I1 != null ? c4554j0Mo17689I1.m17937i0() : null) != C4554j0.e.f13389s) {
            if ((c4554j0Mo17689I1 != null ? c4554j0Mo17689I1.m17937i0() : null) != C4554j0.e.f13390t) {
                return;
            }
        }
        m18209f2(z10);
    }

    /* JADX INFO: renamed from: j1 */
    public abstract int mo17652j1(AbstractC3499a abstractC3499a);

    /* JADX INFO: renamed from: k1 */
    public final void m18212k1(C4595v1 c4595v1, long j10, long j11) {
        C4586s1 snapshotObserver;
        C3082r0 c3082r0 = this.f13474D;
        C4520a2 c4520a2 = this.f13473C;
        if (c4520a2 == null) {
            c4520a2 = new C4520a2();
            this.f13473C = c4520a2;
        }
        InterfaceC4580q1 interfaceC4580q1M17845A0 = mo17689I1().m17845A0();
        if (interfaceC4580q1M17845A0 != null && (snapshotObserver = interfaceC4580q1M17845A0.getSnapshotObserver()) != null) {
            snapshotObserver.f13496a.m11785j(c4595v1, f13470F, new d(j10, j11, c4595v1));
        }
        c4520a2.m17527d(mo1232g1(), this, c3082r0);
    }

    /* JADX INFO: renamed from: n */
    public abstract InterfaceC3578w mo17733n();

    /* JADX WARN: Removed duplicated region for block: B:20:0x0053  */
    /* JADX INFO: renamed from: o1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m18213o1(p166l2.C4595v1 r15) {
        /*
            r14 = this;
            boolean r0 = r14.f13471A
            if (r0 == 0) goto L5
            goto L5b
        L5:
            j2.p0 r0 = r15.m18359b()
            a9.l r0 = r0.mo13081p()
            i.r0 r1 = r14.f13474D
            if (r0 != 0) goto L5c
            if (r1 == 0) goto L5b
            java.lang.Object[] r15 = r1.f8072c
            long[] r0 = r1.f8070a
            int r2 = r0.length
            int r2 = r2 + (-2)
            if (r2 < 0) goto L58
            r3 = 0
            r4 = r3
        L1e:
            r5 = r0[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L53
            int r7 = r4 - r2
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r3
        L38:
            if (r9 >= r7) goto L51
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.3E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L4d
            int r10 = r4 << 3
            int r10 = r10 + r9
            r10 = r15[r10]
            i.s0 r10 = (p117i.C3084s0) r10
            r14.m18207c2(r10)
        L4d:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L38
        L51:
            if (r7 != r8) goto L58
        L53:
            if (r4 == r2) goto L58
            int r4 = r4 + 1
            goto L1e
        L58:
            r1.m11516k()
        L5b:
            return
        L5c:
            r11 = 6
            r12 = 0
            r7 = 0
            r9 = 0
            r5 = r14
            r6 = r15
            m18198l1(r5, r6, r7, r9, r11, r12)
            r5.f13476w = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p166l2.AbstractC4585s0.m18213o1(l2.v1):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x0119  */
    /* JADX INFO: renamed from: q1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m18214q1(p135j2.InterfaceC3558p0 r24) {
        /*
            Method dump skipped, instruction units count: 299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p166l2.AbstractC4585s0.m18214q1(j2.p0):void");
    }

    /* JADX INFO: renamed from: s1 */
    public final AbstractC4585s0 m18215s1(AbstractC3571t1 abstractC3571t1) {
        AbstractC4585s0 abstractC4585s0 = this;
        while (true) {
            C4520a2 c4520a2 = abstractC4585s0.f13473C;
            if (c4520a2 != null && c4520a2.m17525b(abstractC3571t1)) {
                return abstractC4585s0;
            }
            AbstractC4585s0 abstractC4585s0Mo17699M1 = abstractC4585s0.mo17699M1();
            if (abstractC4585s0Mo17699M1 == null) {
                return abstractC4585s0;
            }
            abstractC4585s0 = abstractC4585s0Mo17699M1;
        }
    }

    /* JADX INFO: renamed from: v1 */
    public final float m18216v1(AbstractC3571t1 abstractC3571t1, float f10) {
        if (this.f13471A) {
            return f10;
        }
        AbstractC4585s0 abstractC4585s0 = this;
        while (true) {
            C4520a2 c4520a2 = abstractC4585s0.f13473C;
            float fM17526c = c4520a2 != null ? c4520a2.m17526c(abstractC3571t1, Float.NaN) : Float.NaN;
            if (!Float.isNaN(fM17526c)) {
                abstractC4585s0.m18205a1(mo17689I1(), abstractC3571t1);
                return abstractC3571t1.mo13133a(fM17526c, abstractC4585s0.mo17733n(), mo17733n());
            }
            AbstractC4585s0 abstractC4585s0Mo17699M1 = abstractC4585s0.mo17699M1();
            if (abstractC4585s0Mo17699M1 == null) {
                abstractC4585s0.m18205a1(mo17689I1(), abstractC3571t1);
                return f10;
            }
            abstractC4585s0 = abstractC4585s0Mo17699M1;
        }
    }

    /* JADX INFO: renamed from: l2.s0$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b {
        public /* synthetic */ b(AbstractC1043k abstractC1043k) {
            this();
        }

        public b() {
        }
    }
}
