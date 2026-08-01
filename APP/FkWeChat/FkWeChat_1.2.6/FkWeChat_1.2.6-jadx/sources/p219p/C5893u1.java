package p219p;

import p010a9.InterfaceC0173a;
import p010a9.InterfaceC0184l;
import p010a9.InterfaceC0188p;
import p024b9.AbstractC1061t;
import p024b9.C1048m0;
import p058e2.AbstractC2005g;
import p058e2.C2000b;
import p121i3.AbstractC3171a0;
import p121i3.C3196z;
import p172l8.AbstractC4713t;
import p172l8.C4700i0;
import p189n.C5258o0;
import p189n.EnumC5190a2;
import p189n.InterfaceC5225h2;
import p228p8.InterfaceC5976f;
import p242q8.AbstractC6325c;
import p250r1.C6455e;
import p257r8.AbstractC6535d;
import p257r8.AbstractC6544m;
import p376zd.C10010p0;

/* JADX INFO: renamed from: p.u1 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C5893u1 implements InterfaceC5832b1 {

    /* JADX INFO: renamed from: a */
    public InterfaceC5881q1 f18647a;

    /* JADX INFO: renamed from: b */
    public InterfaceC5225h2 f18648b;

    /* JADX INFO: renamed from: c */
    public InterfaceC5859j0 f18649c;

    /* JADX INFO: renamed from: d */
    public EnumC5898w0 f18650d;

    /* JADX INFO: renamed from: e */
    public boolean f18651e;

    /* JADX INFO: renamed from: f */
    public C2000b f18652f;

    /* JADX INFO: renamed from: g */
    public InterfaceC5895v0 f18653g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC0173a f18654h;

    /* JADX INFO: renamed from: i */
    public boolean f18655i;

    /* JADX INFO: renamed from: j */
    public int f18656j = AbstractC2005g.f5574a.m7249b();

    /* JADX INFO: renamed from: k */
    public InterfaceC5836c1 f18657k = AbstractC5857i1.f18411b;

    /* JADX INFO: renamed from: l */
    public final c f18658l = new c();

    /* JADX INFO: renamed from: m */
    public final InterfaceC0184l f18659m = new InterfaceC0184l() { // from class: p.t1
        @Override // p010a9.InterfaceC0184l
        /* JADX INFO: renamed from: m */
        public final Object mo27m(Object obj) {
            return C5893u1.m23732d(this.f18591q, (C6455e) obj);
        }
    };

    /* JADX INFO: renamed from: p.u1$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends AbstractC6535d {

        /* JADX INFO: renamed from: q */
        public Object f18660q;

        /* JADX INFO: renamed from: r */
        public /* synthetic */ Object f18661r;

        /* JADX INFO: renamed from: t */
        public int f18663t;

        public a(InterfaceC5976f interfaceC5976f) {
            super(interfaceC5976f);
        }

        @Override // p257r8.AbstractC6532a
        public final Object invokeSuspend(Object obj) {
            this.f18661r = obj;
            this.f18663t |= Integer.MIN_VALUE;
            return C5893u1.this.mo23520b(0L, this);
        }
    }

    /* JADX INFO: renamed from: p.u1$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b extends AbstractC6544m implements InterfaceC0188p {

        /* JADX INFO: renamed from: q */
        public Object f18664q;

        /* JADX INFO: renamed from: r */
        public Object f18665r;

        /* JADX INFO: renamed from: s */
        public long f18666s;

        /* JADX INFO: renamed from: t */
        public int f18667t;

        /* JADX INFO: renamed from: u */
        public /* synthetic */ Object f18668u;

        /* JADX INFO: renamed from: w */
        public final /* synthetic */ C1048m0 f18670w;

        /* JADX INFO: renamed from: x */
        public final /* synthetic */ long f18671x;

        /* JADX INFO: renamed from: p.u1$b$a */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public static final class a implements InterfaceC5836c1 {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ C5893u1 f18672a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ InterfaceC5892u0 f18673b;

            public a(C5893u1 c5893u1, InterfaceC5892u0 interfaceC5892u0) {
                this.f18672a = c5893u1;
                this.f18673b = interfaceC5892u0;
            }

            @Override // p219p.InterfaceC5836c1
            /* JADX INFO: renamed from: g */
            public float mo23523g(float f10) {
                boolean z10 = C5258o0.f16167k;
                C5893u1 c5893u1 = this.f18672a;
                boolean zM23750C = z10 ? !((Boolean) c5893u1.f18654h.invoke()).booleanValue() : c5893u1.m23750C(f10);
                if (Math.abs(f10) != 0.0f && zM23750C) {
                    throw new C5862k0();
                }
                C5893u1 c5893u12 = this.f18672a;
                return c5893u12.m23766z(c5893u12.m23755H(this.f18673b.mo23730a(c5893u12.m23748A(c5893u12.m23756I(f10)), AbstractC2005g.f5574a.m7248a())));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C1048m0 c1048m0, long j10, InterfaceC5976f interfaceC5976f) {
            super(2, interfaceC5976f);
            this.f18670w = c1048m0;
            this.f18671x = j10;
        }

        @Override // p257r8.AbstractC6532a
        public final InterfaceC5976f create(Object obj, InterfaceC5976f interfaceC5976f) {
            b bVar = C5893u1.this.new b(this.f18670w, this.f18671x, interfaceC5976f);
            bVar.f18668u = obj;
            return bVar;
        }

        @Override // p257r8.AbstractC6532a
        public final Object invokeSuspend(Object obj) throws Throwable {
            C5893u1 c5893u1;
            C1048m0 c1048m0;
            C5893u1 c5893u12;
            long j10;
            Object objM24992g = AbstractC6325c.m24992g();
            int i10 = this.f18667t;
            if (i10 == 0) {
                AbstractC4713t.m18808b(obj);
                a aVar = new a(C5893u1.this, (InterfaceC5892u0) this.f18668u);
                c5893u1 = C5893u1.this;
                C1048m0 c1048m02 = this.f18670w;
                long j11 = this.f18671x;
                InterfaceC5859j0 interfaceC5859j0 = c5893u1.f18649c;
                long j12 = c1048m02.f3207q;
                float fM23766z = c5893u1.m23766z(c5893u1.m23754G(j11));
                this.f18668u = c5893u1;
                this.f18664q = c5893u1;
                this.f18665r = c1048m02;
                this.f18666s = j12;
                this.f18667t = 1;
                Object objMo23621a = interfaceC5859j0.mo23621a(aVar, fM23766z, this);
                if (objMo23621a == objM24992g) {
                    return objM24992g;
                }
                c1048m0 = c1048m02;
                obj = objMo23621a;
                c5893u12 = c5893u1;
                j10 = j12;
            } else {
                if (i10 != 1) {
                    C10010p0.m38820a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                j10 = this.f18666s;
                c1048m0 = (C1048m0) this.f18665r;
                c5893u1 = (C5893u1) this.f18664q;
                c5893u12 = (C5893u1) this.f18668u;
                AbstractC4713t.m18808b(obj);
            }
            c1048m0.f3207q = c5893u1.m23759L(j10, c5893u12.m23766z(((Number) obj).floatValue()));
            return C4700i0.f13910a;
        }

        @Override // p010a9.InterfaceC0188p
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC5892u0 interfaceC5892u0, InterfaceC5976f interfaceC5976f) {
            return ((b) create(interfaceC5892u0, interfaceC5976f)).invokeSuspend(C4700i0.f13910a);
        }
    }

    /* JADX INFO: renamed from: p.u1$c */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class c implements InterfaceC5892u0 {
        public c() {
        }

        @Override // p219p.InterfaceC5892u0
        /* JADX INFO: renamed from: a */
        public long mo23730a(long j10, int i10) {
            C5893u1.this.f18656j = i10;
            InterfaceC5225h2 interfaceC5225h2 = C5893u1.this.f18648b;
            if (interfaceC5225h2 != null && C5893u1.this.m23762v()) {
                return interfaceC5225h2.mo21342c(j10, C5893u1.this.f18656j, C5893u1.this.f18659m);
            }
            return C5893u1.this.m23765y(C5893u1.this.f18657k, j10, i10);
        }

        @Override // p219p.InterfaceC5892u0
        /* JADX INFO: renamed from: b */
        public long mo23731b(long j10, int i10) {
            return C5893u1.this.m23765y(C5893u1.this.f18657k, j10, i10);
        }
    }

    /* JADX INFO: renamed from: p.u1$d */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class d extends AbstractC6544m implements InterfaceC0188p {

        /* JADX INFO: renamed from: q */
        public long f18675q;

        /* JADX INFO: renamed from: r */
        public int f18676r;

        /* JADX INFO: renamed from: s */
        public /* synthetic */ long f18677s;

        public d(InterfaceC5976f interfaceC5976f) {
            super(2, interfaceC5976f);
        }

        @Override // p257r8.AbstractC6532a
        public final InterfaceC5976f create(Object obj, InterfaceC5976f interfaceC5976f) {
            d dVar = C5893u1.this.new d(interfaceC5976f);
            dVar.f18677s = ((C3196z) obj).m12144o();
            return dVar;
        }

        @Override // p010a9.InterfaceC0188p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return m23768r(((C3196z) obj).m12144o(), (InterfaceC5976f) obj2);
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x0084, code lost:
        
            if (r0 != r6) goto L23;
         */
        @Override // p257r8.AbstractC6532a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) throws java.lang.Throwable {
            /*
                r13 = this;
                java.lang.Object r6 = p242q8.AbstractC6325c.m24992g()
                int r0 = r13.f18676r
                r1 = 3
                r2 = 2
                r3 = 1
                if (r0 == 0) goto L34
                if (r0 == r3) goto L2d
                if (r0 == r2) goto L24
                if (r0 != r1) goto L1d
                long r0 = r13.f18675q
                long r2 = r13.f18677s
                p172l8.AbstractC4713t.m18808b(r14)
                r7 = r2
                r3 = r0
                r0 = r14
                goto L87
            L1d:
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                p376zd.C10010p0.m38820a(r0)
                r0 = 0
                return r0
            L24:
                long r2 = r13.f18675q
                long r7 = r13.f18677s
                p172l8.AbstractC4713t.m18808b(r14)
                r0 = r14
                goto L67
            L2d:
                long r3 = r13.f18677s
                p172l8.AbstractC4713t.m18808b(r14)
                r0 = r14
                goto L4b
            L34:
                p172l8.AbstractC4713t.m18808b(r14)
                long r7 = r13.f18677s
                p.u1 r0 = p219p.C5893u1.this
                e2.b r0 = p219p.C5893u1.m23735g(r0)
                r13.f18677s = r7
                r13.f18676r = r3
                java.lang.Object r0 = r0.m7216c(r7, r13)
                if (r0 != r6) goto L4a
                goto L86
            L4a:
                r3 = r7
            L4b:
                i3.z r0 = (p121i3.C3196z) r0
                long r7 = r0.m12144o()
                long r7 = p121i3.C3196z.m12140k(r3, r7)
                p.u1 r0 = p219p.C5893u1.this
                r13.f18677s = r3
                r13.f18675q = r7
                r13.f18676r = r2
                java.lang.Object r0 = r0.mo23520b(r7, r13)
                if (r0 != r6) goto L64
                goto L86
            L64:
                r11 = r7
                r7 = r3
                r2 = r11
            L67:
                i3.z r0 = (p121i3.C3196z) r0
                long r9 = r0.m12144o()
                p.u1 r0 = p219p.C5893u1.this
                e2.b r0 = p219p.C5893u1.m23735g(r0)
                long r2 = p121i3.C3196z.m12140k(r2, r9)
                r13.f18677s = r7
                r13.f18675q = r9
                r13.f18676r = r1
                r5 = r13
                r1 = r2
                r3 = r9
                java.lang.Object r0 = r0.m7214a(r1, r3, r5)
                if (r0 != r6) goto L87
            L86:
                return r6
            L87:
                i3.z r0 = (p121i3.C3196z) r0
                long r0 = r0.m12144o()
                long r0 = p121i3.C3196z.m12140k(r3, r0)
                long r0 = p121i3.C3196z.m12140k(r7, r0)
                i3.z r0 = p121i3.C3196z.m12131b(r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p219p.C5893u1.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX INFO: renamed from: r */
        public final Object m23768r(long j10, InterfaceC5976f interfaceC5976f) {
            return ((d) create(C3196z.m12131b(j10), interfaceC5976f)).invokeSuspend(C4700i0.f13910a);
        }
    }

    /* JADX INFO: renamed from: p.u1$e */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class e extends AbstractC6544m implements InterfaceC0188p {

        /* JADX INFO: renamed from: q */
        public int f18679q;

        /* JADX INFO: renamed from: r */
        public /* synthetic */ Object f18680r;

        /* JADX INFO: renamed from: t */
        public final /* synthetic */ InterfaceC0188p f18682t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(InterfaceC0188p interfaceC0188p, InterfaceC5976f interfaceC5976f) {
            super(2, interfaceC5976f);
            this.f18682t = interfaceC0188p;
        }

        @Override // p257r8.AbstractC6532a
        public final InterfaceC5976f create(Object obj, InterfaceC5976f interfaceC5976f) {
            e eVar = C5893u1.this.new e(this.f18682t, interfaceC5976f);
            eVar.f18680r = obj;
            return eVar;
        }

        @Override // p257r8.AbstractC6532a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM24992g = AbstractC6325c.m24992g();
            int i10 = this.f18679q;
            if (i10 == 0) {
                AbstractC4713t.m18808b(obj);
                C5893u1.this.f18657k = (InterfaceC5836c1) this.f18680r;
                InterfaceC0188p interfaceC0188p = this.f18682t;
                c cVar = C5893u1.this.f18658l;
                this.f18679q = 1;
                if (interfaceC0188p.invoke(cVar, this) == objM24992g) {
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

        @Override // p010a9.InterfaceC0188p
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC5836c1 interfaceC5836c1, InterfaceC5976f interfaceC5976f) {
            return ((e) create(interfaceC5836c1, interfaceC5976f)).invokeSuspend(C4700i0.f13910a);
        }
    }

    public C5893u1(InterfaceC5881q1 interfaceC5881q1, InterfaceC5225h2 interfaceC5225h2, InterfaceC5859j0 interfaceC5859j0, EnumC5898w0 enumC5898w0, boolean z10, C2000b c2000b, InterfaceC5895v0 interfaceC5895v0, InterfaceC0173a interfaceC0173a) {
        this.f18647a = interfaceC5881q1;
        this.f18648b = interfaceC5225h2;
        this.f18649c = interfaceC5859j0;
        this.f18650d = enumC5898w0;
        this.f18651e = z10;
        this.f18652f = c2000b;
        this.f18653g = interfaceC5895v0;
        this.f18654h = interfaceC0173a;
    }

    /* JADX INFO: renamed from: d */
    public static C6455e m23732d(C5893u1 c5893u1, C6455e c6455e) {
        return C6455e.m25550d(c5893u1.m23765y(c5893u1.f18657k, c6455e.m25566t(), c5893u1.f18656j));
    }

    /* JADX INFO: renamed from: A */
    public final long m23748A(long j10) {
        return this.f18651e ? C6455e.m25564r(j10, -1.0f) : j10;
    }

    /* JADX INFO: renamed from: B */
    public final Object m23749B(EnumC5190a2 enumC5190a2, InterfaceC0188p interfaceC0188p, InterfaceC5976f interfaceC5976f) {
        Object objMo2979c = this.f18647a.mo2979c(enumC5190a2, new e(interfaceC0188p, null), interfaceC5976f);
        return objMo2979c == AbstractC6325c.m24992g() ? objMo2979c : C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: C */
    public final boolean m23750C(float f10) {
        if (f10 <= 0.0f || this.f18647a.mo2980e()) {
            return (f10 < 0.0f && !this.f18647a.mo2978b()) || !((Boolean) this.f18654h.invoke()).booleanValue();
        }
        return true;
    }

    /* JADX INFO: renamed from: D */
    public final boolean m23751D() {
        if (this.f18647a.mo2977a()) {
            return true;
        }
        InterfaceC5225h2 interfaceC5225h2 = this.f18648b;
        return interfaceC5225h2 != null ? interfaceC5225h2.mo21341b() : false;
    }

    /* JADX INFO: renamed from: E */
    public final long m23752E(long j10) {
        return this.f18650d == EnumC5898w0.f18787r ? C6455e.m25553g(j10, 0.0f, 0.0f, 1, null) : C6455e.m25553g(j10, 0.0f, 0.0f, 2, null);
    }

    /* JADX INFO: renamed from: F */
    public final long m23753F(long j10) {
        return this.f18650d == EnumC5898w0.f18787r ? C3196z.m12134e(j10, 0.0f, 0.0f, 1, null) : C3196z.m12134e(j10, 0.0f, 0.0f, 2, null);
    }

    /* JADX INFO: renamed from: G */
    public final float m23754G(long j10) {
        return this.f18650d == EnumC5898w0.f18787r ? C3196z.m12137h(j10) : C3196z.m12138i(j10);
    }

    /* JADX INFO: renamed from: H */
    public final float m23755H(long j10) {
        return Float.intBitsToFloat((int) (this.f18650d == EnumC5898w0.f18787r ? j10 >> 32 : j10 & 4294967295L));
    }

    /* JADX INFO: renamed from: I */
    public final long m23756I(float f10) {
        if (f10 == 0.0f) {
            return C6455e.f20314b.m25569c();
        }
        if (this.f18650d == EnumC5898w0.f18787r) {
            return C6455e.m25551e((((long) Float.floatToRawIntBits(f10)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L));
        }
        return C6455e.m25551e((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f10)) & 4294967295L));
    }

    /* JADX INFO: renamed from: J */
    public final long m23757J(float f10) {
        return f10 == 0.0f ? C3196z.f8498b.m12145a() : this.f18650d == EnumC5898w0.f18787r ? AbstractC3171a0.m11961a(f10, 0.0f) : AbstractC3171a0.m11961a(0.0f, f10);
    }

    /* JADX INFO: renamed from: K */
    public final boolean m23758K(InterfaceC5881q1 interfaceC5881q1, EnumC5898w0 enumC5898w0, InterfaceC5225h2 interfaceC5225h2, boolean z10, InterfaceC5859j0 interfaceC5859j0, C2000b c2000b) {
        boolean z11;
        boolean z12 = true;
        if (AbstractC1061t.m3842c(this.f18647a, interfaceC5881q1)) {
            z11 = false;
        } else {
            this.f18647a = interfaceC5881q1;
            z11 = true;
        }
        this.f18648b = interfaceC5225h2;
        if (this.f18650d != enumC5898w0) {
            this.f18650d = enumC5898w0;
            z11 = true;
        }
        if (this.f18651e != z10) {
            this.f18651e = z10;
        } else {
            z12 = z11;
        }
        this.f18649c = interfaceC5859j0;
        this.f18652f = c2000b;
        return z12;
    }

    /* JADX INFO: renamed from: L */
    public final long m23759L(long j10, float f10) {
        return this.f18650d == EnumC5898w0.f18787r ? C3196z.m12134e(j10, f10, 0.0f, 2, null) : C3196z.m12134e(j10, 0.0f, f10, 1, null);
    }

    @Override // p219p.InterfaceC5832b1
    /* JADX INFO: renamed from: a */
    public boolean mo23519a() {
        return this.f18655i;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // p219p.InterfaceC5832b1
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo23520b(long r12, p228p8.InterfaceC5976f r14) throws java.lang.Throwable {
        /*
            r11 = this;
            boolean r0 = r14 instanceof p219p.C5893u1.a
            if (r0 == 0) goto L13
            r0 = r14
            p.u1$a r0 = (p219p.C5893u1.a) r0
            int r1 = r0.f18663t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f18663t = r1
            goto L18
        L13:
            p.u1$a r0 = new p.u1$a
            r0.<init>(r14)
        L18:
            java.lang.Object r14 = r0.f18661r
            java.lang.Object r1 = p242q8.AbstractC6325c.m24992g()
            int r2 = r0.f18663t
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 != r4) goto L33
            java.lang.Object r12 = r0.f18660q
            b9.m0 r12 = (p024b9.C1048m0) r12
            p172l8.AbstractC4713t.m18808b(r14)     // Catch: java.lang.Throwable -> L2f
            r6 = r11
            goto L5c
        L2f:
            r0 = move-exception
            r12 = r0
            r6 = r11
            goto L6b
        L33:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            p376zd.C10010p0.m38820a(r12)
            r12 = 0
            return r12
        L3a:
            p172l8.AbstractC4713t.m18808b(r14)
            b9.m0 r7 = new b9.m0
            r7.<init>()
            r7.f3207q = r12
            r11.f18655i = r4
            n.a2 r14 = p189n.EnumC5190a2.f15823q     // Catch: java.lang.Throwable -> L68
            p.u1$b r5 = new p.u1$b     // Catch: java.lang.Throwable -> L68
            r10 = 0
            r6 = r11
            r8 = r12
            r5.<init>(r7, r8, r10)     // Catch: java.lang.Throwable -> L65
            r0.f18660q = r7     // Catch: java.lang.Throwable -> L65
            r0.f18663t = r4     // Catch: java.lang.Throwable -> L65
            java.lang.Object r12 = r11.m23749B(r14, r5, r0)     // Catch: java.lang.Throwable -> L65
            if (r12 != r1) goto L5b
            return r1
        L5b:
            r12 = r7
        L5c:
            r6.f18655i = r3
            long r12 = r12.f3207q
            i3.z r12 = p121i3.C3196z.m12131b(r12)
            return r12
        L65:
            r0 = move-exception
        L66:
            r12 = r0
            goto L6b
        L68:
            r0 = move-exception
            r6 = r11
            goto L66
        L6b:
            r6.f18655i = r3
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: p219p.C5893u1.mo23520b(long, p8.f):java.lang.Object");
    }

    @Override // p219p.InterfaceC5832b1
    /* JADX INFO: renamed from: c */
    public long mo23521c(long j10) {
        return this.f18647a.mo2977a() ? C6455e.f20314b.m25569c() : m23760t(j10);
    }

    /* JADX INFO: renamed from: t */
    public final long m23760t(long j10) {
        return m23756I(m23766z(this.f18647a.mo2981f(m23766z(m23755H(j10)))));
    }

    /* JADX INFO: renamed from: u */
    public final InterfaceC5881q1 m23761u() {
        return this.f18647a;
    }

    /* JADX INFO: renamed from: v */
    public final boolean m23762v() {
        return this.f18647a.mo2980e() || this.f18647a.mo2978b();
    }

    /* JADX INFO: renamed from: w */
    public final boolean m23763w() {
        return this.f18650d == EnumC5898w0.f18786q;
    }

    /* JADX INFO: renamed from: x */
    public final Object m23764x(long j10, boolean z10, InterfaceC5976f interfaceC5976f) {
        if (z10 && !AbstractC5857i1.m23612g(this.f18649c)) {
            return C4700i0.f13910a;
        }
        long jM23753F = m23753F(j10);
        d dVar = new d(null);
        InterfaceC5225h2 interfaceC5225h2 = this.f18648b;
        if (interfaceC5225h2 == null || !m23762v()) {
            Object objInvoke = dVar.invoke(C3196z.m12131b(jM23753F), interfaceC5976f);
            return objInvoke == AbstractC6325c.m24992g() ? objInvoke : C4700i0.f13910a;
        }
        Object objMo21340a = interfaceC5225h2.mo21340a(jM23753F, dVar, interfaceC5976f);
        return objMo21340a == AbstractC6325c.m24992g() ? objMo21340a : C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: y */
    public final long m23765y(InterfaceC5836c1 interfaceC5836c1, long j10, int i10) {
        long jM7217d = this.f18652f.m7217d(j10, i10);
        long jM25562p = C6455e.m25562p(j10, jM7217d);
        long jM23748A = m23748A(m23756I(interfaceC5836c1.mo23523g(m23755H(m23748A(m23752E(jM25562p))))));
        if (C5258o0.f16165i) {
            this.f18653g.mo23654S0(jM23748A);
        }
        return C6455e.m25563q(C6455e.m25563q(jM7217d, jM23748A), this.f18652f.m7215b(jM23748A, C6455e.m25562p(jM25562p, jM23748A), i10));
    }

    /* JADX INFO: renamed from: z */
    public final float m23766z(float f10) {
        return this.f18651e ? f10 * (-1) : f10;
    }
}
