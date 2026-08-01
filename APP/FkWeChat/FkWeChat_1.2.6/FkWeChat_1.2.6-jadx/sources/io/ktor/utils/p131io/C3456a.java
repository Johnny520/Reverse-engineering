package io.ktor.utils.p131io;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p010a9.InterfaceC0184l;
import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;
import p024b9.C1055q;
import p172l8.AbstractC4693f;
import p172l8.AbstractC4713t;
import p172l8.C4700i0;
import p172l8.C4712s;
import p193n3.AbstractC5489b;
import p215oc.C5708d;
import p215oc.InterfaceC5726u;
import p215oc.InterfaceC5728w;
import p228p8.InterfaceC5976f;
import p257r8.AbstractC6535d;
import p299ub.AbstractC8610a;

/* JADX INFO: renamed from: io.ktor.utils.io.a */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C3456a implements InterfaceC3468g, InterfaceC3473k {

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f9525g = AtomicReferenceFieldUpdater.newUpdater(C3456a.class, Object.class, "suspensionSlot");

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f9526h = AtomicReferenceFieldUpdater.newUpdater(C3456a.class, Object.class, "_closedCause");
    volatile /* synthetic */ Object _closedCause;

    /* JADX INFO: renamed from: b */
    public final boolean f9527b;

    /* JADX INFO: renamed from: c */
    public final C5708d f9528c;

    /* JADX INFO: renamed from: d */
    public final Object f9529d;

    /* JADX INFO: renamed from: e */
    public final C5708d f9530e;

    /* JADX INFO: renamed from: f */
    public final C5708d f9531f;
    private volatile int flushBufferSize;
    volatile /* synthetic */ Object suspensionSlot;

    /* JADX INFO: renamed from: io.ktor.utils.io.a$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public interface a {

        /* JADX INFO: renamed from: a */
        public static final b f9532a = b.f9534a;

        /* JADX INFO: renamed from: io.ktor.utils.io.a$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public static final class C10114a implements a {

            /* JADX INFO: renamed from: b */
            public final Throwable f9533b;

            public C10114a(Throwable th) {
                this.f9533b = th;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C10114a) && AbstractC1061t.m3842c(this.f9533b, ((C10114a) obj).f9533b);
            }

            /* JADX INFO: renamed from: f */
            public final Throwable m12888f() {
                return this.f9533b;
            }

            public int hashCode() {
                Throwable th = this.f9533b;
                if (th == null) {
                    return 0;
                }
                return th.hashCode();
            }

            public String toString() {
                return "Closed(cause=" + this.f9533b + ')';
            }
        }

        /* JADX INFO: renamed from: io.ktor.utils.io.a$a$b */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public static final class b {

            /* JADX INFO: renamed from: a */
            public static final /* synthetic */ b f9534a = new b();

            /* JADX INFO: renamed from: b */
            public static final C10114a f9535b = new C10114a(null);

            /* JADX INFO: renamed from: c */
            public static final Object f9536c;

            static {
                C4712s.a aVar = C4712s.f13928r;
                f9536c = C4712s.m18798b(C4700i0.f13910a);
            }

            /* JADX INFO: renamed from: a */
            public final C10114a m12889a() {
                return f9535b;
            }

            /* JADX INFO: renamed from: b */
            public final Object m12890b() {
                return f9536c;
            }
        }

        /* JADX INFO: renamed from: io.ktor.utils.io.a$a$c */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public static final class c implements a {

            /* JADX INFO: renamed from: b */
            public static final c f9537b = new c();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public int hashCode() {
                return -231472095;
            }

            public String toString() {
                return "Empty";
            }
        }

        /* JADX INFO: renamed from: io.ktor.utils.io.a$a$d */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public static final class d implements e {

            /* JADX INFO: renamed from: b */
            public final InterfaceC5976f f9538b;

            /* JADX INFO: renamed from: c */
            public Throwable f9539c;

            public d(InterfaceC5976f interfaceC5976f) {
                interfaceC5976f.getClass();
                this.f9538b = interfaceC5976f;
                if (AbstractC3466f.m12938a()) {
                    StringBuilder sb2 = new StringBuilder("ReadTask 0x");
                    String string = Integer.toString(mo12895e().hashCode(), AbstractC8610a.m33053a(16));
                    string.getClass();
                    sb2.append(string);
                    Throwable th = new Throwable(sb2.toString());
                    AbstractC4693f.m18755c(th);
                    m12896f(th);
                }
            }

            @Override // io.ktor.utils.p131io.C3456a.a.e
            /* JADX INFO: renamed from: a */
            public String mo12891a() {
                return "read";
            }

            @Override // io.ktor.utils.p131io.C3456a.a.e
            /* JADX INFO: renamed from: b */
            public void mo12892b(Throwable th) {
                e.C10115a.m12898b(this, th);
            }

            @Override // io.ktor.utils.p131io.C3456a.a.e
            /* JADX INFO: renamed from: c */
            public void mo12893c() {
                e.C10115a.m12897a(this);
            }

            @Override // io.ktor.utils.p131io.C3456a.a.e
            /* JADX INFO: renamed from: d */
            public Throwable mo12894d() {
                return this.f9539c;
            }

            @Override // io.ktor.utils.p131io.C3456a.a.e
            /* JADX INFO: renamed from: e */
            public InterfaceC5976f mo12895e() {
                return this.f9538b;
            }

            /* JADX INFO: renamed from: f */
            public void m12896f(Throwable th) {
                this.f9539c = th;
            }
        }

        /* JADX INFO: renamed from: io.ktor.utils.io.a$a$e */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public interface e extends a {

            /* JADX INFO: renamed from: io.ktor.utils.io.a$a$e$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
            public static final class C10115a {
                /* JADX INFO: renamed from: a */
                public static void m12897a(e eVar) {
                    eVar.mo12895e().resumeWith(a.f9532a.m12890b());
                }

                /* JADX INFO: renamed from: b */
                public static void m12898b(e eVar, Throwable th) {
                    Object objM12890b;
                    InterfaceC5976f interfaceC5976fMo12895e = eVar.mo12895e();
                    if (th != null) {
                        C4712s.a aVar = C4712s.f13928r;
                        objM12890b = C4712s.m18798b(AbstractC4713t.m18807a(th));
                    } else {
                        objM12890b = a.f9532a.m12890b();
                    }
                    interfaceC5976fMo12895e.resumeWith(objM12890b);
                }
            }

            /* JADX INFO: renamed from: a */
            String mo12891a();

            /* JADX INFO: renamed from: b */
            void mo12892b(Throwable th);

            /* JADX INFO: renamed from: c */
            void mo12893c();

            /* JADX INFO: renamed from: d */
            Throwable mo12894d();

            /* JADX INFO: renamed from: e */
            InterfaceC5976f mo12895e();
        }

        /* JADX INFO: renamed from: io.ktor.utils.io.a$a$f */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public static final class f implements e {

            /* JADX INFO: renamed from: b */
            public final InterfaceC5976f f9540b;

            /* JADX INFO: renamed from: c */
            public Throwable f9541c;

            public f(InterfaceC5976f interfaceC5976f) {
                interfaceC5976f.getClass();
                this.f9540b = interfaceC5976f;
                if (AbstractC3466f.m12938a()) {
                    StringBuilder sb2 = new StringBuilder("WriteTask 0x");
                    String string = Integer.toString(mo12895e().hashCode(), AbstractC8610a.m33053a(16));
                    string.getClass();
                    sb2.append(string);
                    Throwable th = new Throwable(sb2.toString());
                    AbstractC4693f.m18755c(th);
                    m12899f(th);
                }
            }

            @Override // io.ktor.utils.p131io.C3456a.a.e
            /* JADX INFO: renamed from: a */
            public String mo12891a() {
                return "write";
            }

            @Override // io.ktor.utils.p131io.C3456a.a.e
            /* JADX INFO: renamed from: b */
            public void mo12892b(Throwable th) {
                e.C10115a.m12898b(this, th);
            }

            @Override // io.ktor.utils.p131io.C3456a.a.e
            /* JADX INFO: renamed from: c */
            public void mo12893c() {
                e.C10115a.m12897a(this);
            }

            @Override // io.ktor.utils.p131io.C3456a.a.e
            /* JADX INFO: renamed from: d */
            public Throwable mo12894d() {
                return this.f9541c;
            }

            @Override // io.ktor.utils.p131io.C3456a.a.e
            /* JADX INFO: renamed from: e */
            public InterfaceC5976f mo12895e() {
                return this.f9540b;
            }

            /* JADX INFO: renamed from: f */
            public void m12899f(Throwable th) {
                this.f9541c = th;
            }
        }
    }

    /* JADX INFO: renamed from: io.ktor.utils.io.a$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b extends AbstractC6535d {

        /* JADX INFO: renamed from: q */
        public int f9542q;

        /* JADX INFO: renamed from: r */
        public Object f9543r;

        /* JADX INFO: renamed from: s */
        public /* synthetic */ Object f9544s;

        /* JADX INFO: renamed from: u */
        public int f9546u;

        public b(InterfaceC5976f interfaceC5976f) {
            super(interfaceC5976f);
        }

        @Override // p257r8.AbstractC6532a
        public final Object invokeSuspend(Object obj) {
            this.f9544s = obj;
            this.f9546u |= Integer.MIN_VALUE;
            return C3456a.this.mo8541c(0, this);
        }
    }

    /* JADX INFO: renamed from: io.ktor.utils.io.a$c */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class c extends AbstractC6535d {

        /* JADX INFO: renamed from: q */
        public Object f9547q;

        /* JADX INFO: renamed from: r */
        public /* synthetic */ Object f9548r;

        /* JADX INFO: renamed from: t */
        public int f9550t;

        public c(InterfaceC5976f interfaceC5976f) {
            super(interfaceC5976f);
        }

        @Override // p257r8.AbstractC6532a
        public final Object invokeSuspend(Object obj) {
            this.f9548r = obj;
            this.f9550t |= Integer.MIN_VALUE;
            return C3456a.this.mo12879b(this);
        }
    }

    /* JADX INFO: renamed from: io.ktor.utils.io.a$d */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class d extends AbstractC6535d {

        /* JADX INFO: renamed from: q */
        public /* synthetic */ Object f9551q;

        /* JADX INFO: renamed from: s */
        public int f9553s;

        public d(InterfaceC5976f interfaceC5976f) {
            super(interfaceC5976f);
        }

        @Override // p257r8.AbstractC6532a
        public final Object invokeSuspend(Object obj) {
            this.f9551q = obj;
            this.f9553s |= Integer.MIN_VALUE;
            return C3456a.this.mo12881f(this);
        }
    }

    /* JADX INFO: renamed from: io.ktor.utils.io.a$e */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public /* synthetic */ class e extends C1055q implements InterfaceC0184l {

        /* JADX INFO: renamed from: y */
        public static final e f9554y = new e();

        public e() {
            super(1, C3484v.class, "<init>", "<init>(Ljava/lang/Throwable;)V", 0);
        }

        @Override // p010a9.InterfaceC0184l
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public final C3484v mo27m(Throwable th) {
            return new C3484v(th);
        }
    }

    /* JADX INFO: renamed from: io.ktor.utils.io.a$f */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public /* synthetic */ class f extends C1055q implements InterfaceC0184l {

        /* JADX INFO: renamed from: y */
        public static final f f9555y = new f();

        public f() {
            super(1, C3485w.class, "<init>", "<init>(Ljava/lang/Throwable;)V", 0);
        }

        @Override // p010a9.InterfaceC0184l
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public final C3485w mo27m(Throwable th) {
            return new C3485w(th);
        }
    }

    public C3456a(boolean z10) {
        this.f9527b = z10;
        this.f9528c = new C5708d();
        this.f9529d = new Object();
        this.suspensionSlot = a.c.f9537b;
        this.f9530e = new C5708d();
        this.f9531f = new C5708d();
        this._closedCause = null;
    }

    @Override // io.ktor.utils.p131io.InterfaceC3468g
    /* JADX INFO: renamed from: a */
    public Throwable mo8540a() {
        C3481s c3481s = (C3481s) this._closedCause;
        if (c3481s != null) {
            return C3481s.m12994c(c3481s, null, 1, null);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // io.ktor.utils.p131io.InterfaceC3473k
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo12879b(p228p8.InterfaceC5976f r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.p131io.C3456a.mo12879b(p8.f):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // io.ktor.utils.p131io.InterfaceC3468g
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo8541c(int r11, p228p8.InterfaceC5976f r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.p131io.C3456a.mo8541c(int, p8.f):java.lang.Object");
    }

    @Override // io.ktor.utils.p131io.InterfaceC3473k
    /* JADX INFO: renamed from: d */
    public InterfaceC5726u mo12880d() throws C3485w {
        C3481s c3481s;
        if (m12886o() && ((c3481s = (C3481s) this._closedCause) == null || c3481s.m12995a(f.f9555y) == null)) {
            throw new C3485w(null, 1, null);
        }
        return this.f9531f;
    }

    @Override // io.ktor.utils.p131io.InterfaceC3468g
    /* JADX INFO: renamed from: e */
    public InterfaceC5728w mo8542e() throws Throwable {
        C3481s c3481s = (C3481s) this._closedCause;
        if (c3481s != null) {
            c3481s.m12995a(e.f9554y);
        }
        if (this.f9530e.mo23108g()) {
            m12887p();
        }
        return this.f9530e;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // io.ktor.utils.p131io.InterfaceC3473k
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo12881f(p228p8.InterfaceC5976f r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof io.ktor.utils.p131io.C3456a.d
            if (r0 == 0) goto L13
            r0 = r6
            io.ktor.utils.io.a$d r0 = (io.ktor.utils.p131io.C3456a.d) r0
            int r1 = r0.f9553s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f9553s = r1
            goto L18
        L13:
            io.ktor.utils.io.a$d r0 = new io.ktor.utils.io.a$d
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f9551q
            java.lang.Object r1 = p242q8.AbstractC6325c.m24992g()
            int r2 = r0.f9553s
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L32
            if (r2 != r4) goto L2c
            p172l8.AbstractC4713t.m18808b(r6)     // Catch: java.lang.Throwable -> L2a
            goto L40
        L2a:
            r6 = move-exception
            goto L46
        L2c:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            p376zd.C10010p0.m38820a(r6)
            return r3
        L32:
            p172l8.AbstractC4713t.m18808b(r6)
            l8.s$a r6 = p172l8.C4712s.f13928r     // Catch: java.lang.Throwable -> L2a
            r0.f9553s = r4     // Catch: java.lang.Throwable -> L2a
            java.lang.Object r6 = r5.mo12879b(r0)     // Catch: java.lang.Throwable -> L2a
            if (r6 != r1) goto L40
            return r1
        L40:
            l8.i0 r6 = p172l8.C4700i0.f13910a     // Catch: java.lang.Throwable -> L2a
            p172l8.C4712s.m18798b(r6)     // Catch: java.lang.Throwable -> L2a
            goto L4f
        L46:
            l8.s$a r0 = p172l8.C4712s.f13928r
            java.lang.Object r6 = p172l8.AbstractC4713t.m18807a(r6)
            p172l8.C4712s.m18798b(r6)
        L4f:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = io.ktor.utils.p131io.C3456a.f9526h
            io.ktor.utils.io.s r0 = io.ktor.utils.p131io.AbstractC3482t.m12998a()
            boolean r6 = p193n3.AbstractC5489b.m22334a(r6, r5, r3, r0)
            if (r6 != 0) goto L5e
            l8.i0 r6 = p172l8.C4700i0.f13910a
            return r6
        L5e:
            r5.m12883l(r3)
            l8.i0 r6 = p172l8.C4700i0.f13910a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.p131io.C3456a.mo12881f(p8.f):java.lang.Object");
    }

    @Override // io.ktor.utils.p131io.InterfaceC3468g
    /* JADX INFO: renamed from: g */
    public void mo8543g(Throwable th) {
        if (this._closedCause != null) {
            return;
        }
        C3481s c3481s = new C3481s(th);
        AbstractC5489b.m22334a(f9526h, this, null, c3481s);
        m12883l(C3481s.m12994c(c3481s, null, 1, null));
    }

    @Override // io.ktor.utils.p131io.InterfaceC3468g
    /* JADX INFO: renamed from: h */
    public boolean mo8544h() {
        if (mo8540a() == null) {
            return m12886o() && this.flushBufferSize == 0 && this.f9530e.mo23108g();
        }
        return true;
    }

    /* JADX INFO: renamed from: k */
    public void m12882k() {
        m12884m();
        if (AbstractC5489b.m22334a(f9526h, this, null, AbstractC3482t.m12998a())) {
            m12883l(null);
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m12883l(Throwable th) {
        a aVar = (a) f9525g.getAndSet(this, th != null ? new a.C10114a(th) : a.f9532a.m12889a());
        if (aVar instanceof a.e) {
            ((a.e) aVar).mo12892b(th);
        }
    }

    /* JADX INFO: renamed from: m */
    public void m12884m() {
        if (this.f9531f.mo23108g()) {
            return;
        }
        synchronized (this.f9529d) {
            int iM23111j = (int) this.f9531f.m23111j();
            this.f9528c.mo23120s0(this.f9531f);
            this.flushBufferSize += iM23111j;
            C4700i0 c4700i0 = C4700i0.f13910a;
        }
        a aVar = (a) this.suspensionSlot;
        if ((aVar instanceof a.d) && AbstractC5489b.m22334a(f9525g, this, aVar, a.c.f9537b)) {
            ((a.e) aVar).mo12893c();
        }
    }

    /* JADX INFO: renamed from: n */
    public final boolean m12885n() {
        return this.f9527b;
    }

    /* JADX INFO: renamed from: o */
    public boolean m12886o() {
        return this._closedCause != null;
    }

    /* JADX INFO: renamed from: p */
    public final void m12887p() {
        synchronized (this.f9529d) {
            this.f9528c.mo23095D(this.f9530e);
            this.flushBufferSize = 0;
            C4700i0 c4700i0 = C4700i0.f13910a;
        }
        a aVar = (a) this.suspensionSlot;
        if ((aVar instanceof a.f) && AbstractC5489b.m22334a(f9525g, this, aVar, a.c.f9537b)) {
            ((a.e) aVar).mo12893c();
        }
    }

    public String toString() {
        return "ByteChannel[" + hashCode() + ']';
    }

    public /* synthetic */ C3456a(boolean z10, int i10, AbstractC1043k abstractC1043k) {
        this((i10 & 1) != 0 ? false : z10);
    }
}
