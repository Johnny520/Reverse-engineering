package p339x6;

import ec.AbstractC2148k;
import ec.C2161n0;
import ec.InterfaceC2165o0;
import java.io.Closeable;
import java.nio.channels.ClosedChannelException;
import java.nio.channels.ClosedSelectorException;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.spi.AbstractSelector;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p010a9.InterfaceC0188p;
import p099gc.C2747p;
import p172l8.AbstractC4713t;
import p172l8.C4700i0;
import p172l8.C4712s;
import p228p8.InterfaceC5976f;
import p228p8.InterfaceC5980j;
import p242q8.AbstractC6325c;
import p257r8.AbstractC6535d;
import p257r8.AbstractC6544m;
import p325w8.AbstractC9202b;
import p376zd.C10010p0;

/* JADX INFO: renamed from: x6.a */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C9448a extends AbstractC9459l implements Closeable, InterfaceC2165o0 {
    private volatile boolean closed;
    private volatile boolean inSelect;
    private volatile Selector selectorRef;

    /* JADX INFO: renamed from: t */
    public final AtomicLong f32094t;

    /* JADX INFO: renamed from: u */
    public final b f32095u;

    /* JADX INFO: renamed from: v */
    public final C9452e f32096v;

    /* JADX INFO: renamed from: w */
    public final InterfaceC5980j f32097w;

    /* JADX INFO: renamed from: x6.a$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends AbstractC6544m implements InterfaceC0188p {

        /* JADX INFO: renamed from: q */
        public Object f32098q;

        /* JADX INFO: renamed from: r */
        public Object f32099r;

        /* JADX INFO: renamed from: s */
        public Object f32100s;

        /* JADX INFO: renamed from: t */
        public int f32101t;

        public a(InterfaceC5976f interfaceC5976f) {
            super(2, interfaceC5976f);
        }

        @Override // p257r8.AbstractC6532a
        public final InterfaceC5976f create(Object obj, InterfaceC5976f interfaceC5976f) {
            return C9448a.this.new a(interfaceC5976f);
        }

        @Override // p010a9.InterfaceC0188p
        public final Object invoke(InterfaceC2165o0 interfaceC2165o0, InterfaceC5976f interfaceC5976f) {
            return ((a) create(interfaceC2165o0, interfaceC5976f)).invokeSuspend(C4700i0.f13910a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v10, types: [java.nio.channels.spi.AbstractSelector] */
        /* JADX WARN: Type inference failed for: r0v11 */
        /* JADX WARN: Type inference failed for: r0v12 */
        /* JADX WARN: Type inference failed for: r0v13 */
        /* JADX WARN: Type inference failed for: r0v14 */
        /* JADX WARN: Type inference failed for: r0v3 */
        /* JADX WARN: Type inference failed for: r0v5, types: [java.nio.channels.Selector] */
        /* JADX WARN: Type inference failed for: r0v6, types: [java.nio.channels.Selector] */
        /* JADX WARN: Type inference failed for: r0v8 */
        /* JADX WARN: Type inference failed for: r1v10 */
        /* JADX WARN: Type inference failed for: r1v11 */
        /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, x6.a] */
        /* JADX WARN: Type inference failed for: r1v3, types: [x6.a, x6.l] */
        /* JADX WARN: Type inference failed for: r1v4, types: [x6.a, x6.l] */
        /* JADX WARN: Type inference failed for: r1v5, types: [x6.a] */
        /* JADX WARN: Type inference failed for: r1v7, types: [x6.a] */
        /* JADX WARN: Type inference failed for: r1v8 */
        /* JADX WARN: Type inference failed for: r1v9 */
        @Override // p257r8.AbstractC6532a
        public final Object invokeSuspend(Object obj) throws Throwable {
            ?? r12;
            Closeable closeable;
            Throwable th;
            ?? r02;
            Closeable closeable2;
            Closeable closeable3;
            ?? r13;
            ?? r03;
            ?? r14;
            ?? r04;
            Object objM24992g = AbstractC6325c.m24992g();
            int i10 = this.f32101t;
            try {
                if (i10 == 0) {
                    AbstractC4713t.m18808b(obj);
                    AbstractSelector abstractSelectorOpenSelector = C9448a.this.getProvider().openSelector();
                    if (abstractSelectorOpenSelector == null) {
                        C10010p0.m38820a("openSelector() = null");
                        return null;
                    }
                    C9448a.this.selectorRef = abstractSelectorOpenSelector;
                    r12 = C9448a.this;
                    try {
                        C9452e c9452e = r12.f32096v;
                        this.f32098q = abstractSelectorOpenSelector;
                        this.f32099r = r12;
                        this.f32100s = abstractSelectorOpenSelector;
                        this.f32101t = 1;
                        if (r12.m36809j0(c9452e, abstractSelectorOpenSelector, this) == objM24992g) {
                            return objM24992g;
                        }
                        AbstractSelector abstractSelector = abstractSelectorOpenSelector;
                        closeable2 = abstractSelector;
                        r04 = abstractSelector;
                        r14 = r12;
                        ((C9448a) r14).closed = true;
                        r14.f32096v.m36828b();
                        r03 = r04;
                        r13 = r14;
                        closeable3 = closeable2;
                    } catch (Throwable th2) {
                        closeable = abstractSelectorOpenSelector;
                        th = th2;
                        r02 = closeable;
                        ((C9448a) r12).closed = true;
                        r12.f32096v.m36828b();
                        r12.m36864f(r02, th);
                        ((C9448a) r12).closed = true;
                        r12.f32096v.m36828b();
                        r03 = r02;
                        r13 = r12;
                        closeable3 = closeable;
                    }
                } else {
                    if (i10 != 1) {
                        C10010p0.m38820a("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r02 = (AbstractSelector) this.f32100s;
                    r12 = (C9448a) this.f32099r;
                    closeable = (Closeable) this.f32098q;
                    try {
                        AbstractC4713t.m18808b(obj);
                        r04 = r02;
                        r14 = r12;
                        closeable2 = closeable;
                        ((C9448a) r14).closed = true;
                        r14.f32096v.m36828b();
                        r03 = r04;
                        r13 = r14;
                        closeable3 = closeable2;
                    } catch (Throwable th3) {
                        th = th3;
                        try {
                            ((C9448a) r12).closed = true;
                            r12.f32096v.m36828b();
                            r12.m36864f(r02, th);
                            ((C9448a) r12).closed = true;
                            r12.f32096v.m36828b();
                            r03 = r02;
                            r13 = r12;
                            closeable3 = closeable;
                        } catch (Throwable th4) {
                            ((C9448a) r12).closed = true;
                            r12.f32096v.m36828b();
                            ((C9448a) r12).selectorRef = null;
                            r12.m36864f(r02, null);
                            throw th4;
                        }
                    }
                }
                ((C9448a) r13).selectorRef = null;
                r13.m36864f(r03, null);
                while (true) {
                    InterfaceC9455h interfaceC9455h = (InterfaceC9455h) r13.f32096v.m36830d();
                    if (interfaceC9455h == null) {
                        C4700i0 c4700i0 = C4700i0.f13910a;
                        AbstractC9202b.m35830a(closeable3, null);
                        return C4700i0.f13910a;
                    }
                    r13.m36865h(interfaceC9455h, new C2747p("Failed to apply interest: selector closed"));
                }
            } finally {
            }
        }
    }

    /* JADX INFO: renamed from: x6.a$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public final AtomicReference f32103a = new AtomicReference(null);

        /* JADX INFO: renamed from: b */
        public final boolean m36815b(Object obj) {
            InterfaceC5976f interfaceC5976f = (InterfaceC5976f) this.f32103a.getAndSet(null);
            if (interfaceC5976f == null) {
                return false;
            }
            interfaceC5976f.resumeWith(C4712s.m18798b(obj));
            return true;
        }
    }

    /* JADX INFO: renamed from: x6.a$c */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class c extends AbstractC6535d {

        /* JADX INFO: renamed from: q */
        public Object f32104q;

        /* JADX INFO: renamed from: r */
        public Object f32105r;

        /* JADX INFO: renamed from: s */
        public /* synthetic */ Object f32106s;

        /* JADX INFO: renamed from: u */
        public int f32108u;

        public c(InterfaceC5976f interfaceC5976f) {
            super(interfaceC5976f);
        }

        @Override // p257r8.AbstractC6532a
        public final Object invokeSuspend(Object obj) {
            this.f32106s = obj;
            this.f32108u |= Integer.MIN_VALUE;
            return C9448a.this.m36809j0(null, null, this);
        }
    }

    /* JADX INFO: renamed from: x6.a$d */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class d extends AbstractC6535d {

        /* JADX INFO: renamed from: q */
        public Object f32109q;

        /* JADX INFO: renamed from: r */
        public /* synthetic */ Object f32110r;

        /* JADX INFO: renamed from: t */
        public int f32112t;

        public d(InterfaceC5976f interfaceC5976f) {
            super(interfaceC5976f);
        }

        @Override // p257r8.AbstractC6532a
        public final Object invokeSuspend(Object obj) {
            this.f32110r = obj;
            this.f32112t |= Integer.MIN_VALUE;
            return C9448a.this.m36812v0(null, this);
        }
    }

    /* JADX INFO: renamed from: x6.a$e */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class e extends AbstractC6535d {

        /* JADX INFO: renamed from: q */
        public Object f32113q;

        /* JADX INFO: renamed from: r */
        public /* synthetic */ Object f32114r;

        /* JADX INFO: renamed from: t */
        public int f32116t;

        public e(InterfaceC5976f interfaceC5976f) {
            super(interfaceC5976f);
        }

        @Override // p257r8.AbstractC6532a
        public final Object invokeSuspend(Object obj) {
            this.f32114r = obj;
            this.f32116t |= Integer.MIN_VALUE;
            return C9448a.this.m36813w0(null, this);
        }
    }

    public C9448a(InterfaceC5980j interfaceC5980j) {
        interfaceC5980j.getClass();
        this.f32094t = new AtomicLong();
        this.f32095u = new b();
        this.f32096v = new C9452e();
        this.f32097w = interfaceC5980j.mo1651c0(new C2161n0("selector"));
        AbstractC2148k.m7817d(this, null, null, new a(null), 3, null);
    }

    @Override // p339x6.InterfaceC9457j
    /* JADX INFO: renamed from: A */
    public void mo36806A(InterfaceC9455h interfaceC9455h) {
        SelectionKey selectionKeyKeyFor;
        interfaceC9455h.getClass();
        m36865h(interfaceC9455h, new ClosedChannelException());
        Selector selector = this.selectorRef;
        if (selector == null || (selectionKeyKeyFor = interfaceC9455h.mo12830Z().keyFor(selector)) == null) {
            return;
        }
        selectionKeyKeyFor.cancel();
        m36807D0();
    }

    /* JADX INFO: renamed from: D0 */
    public final void m36807D0() {
        Selector selector;
        if (this.f32094t.incrementAndGet() == 1 && this.inSelect && (selector = this.selectorRef) != null) {
            selector.wakeup();
        }
    }

    @Override // p339x6.AbstractC9459l
    /* JADX INFO: renamed from: G */
    public void mo36808G(InterfaceC9455h interfaceC9455h) {
        interfaceC9455h.getClass();
        try {
            if (this.f32096v.m36827a(interfaceC9455h)) {
                this.f32095u.m36815b(C4700i0.f13910a);
                m36807D0();
            } else {
                if (!interfaceC9455h.mo12830Z().isOpen()) {
                    throw new ClosedChannelException();
                }
                throw new ClosedSelectorException();
            }
        } catch (Throwable th) {
            m36865h(interfaceC9455h, th);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.closed = true;
        this.f32096v.m36828b();
        if (this.f32095u.m36815b(C4700i0.f13910a)) {
            return;
        }
        m36807D0();
    }

    @Override // ec.InterfaceC2165o0
    public InterfaceC5980j getCoroutineContext() {
        return this.f32097w;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00e0, code lost:
    
        if (r10 == r1) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0085 -> B:19:0x0063). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x009f -> B:19:0x0063). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00ad -> B:19:0x0063). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x00e0 -> B:44:0x00e3). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: j0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m36809j0(p339x6.C9452e r8, java.nio.channels.Selector r9, p228p8.InterfaceC5976f r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p339x6.C9448a.m36809j0(x6.e, java.nio.channels.Selector, p8.f):java.lang.Object");
    }

    /* JADX INFO: renamed from: n0 */
    public final void m36810n0(C9452e c9452e, Selector selector) {
        while (true) {
            InterfaceC9455h interfaceC9455h = (InterfaceC9455h) c9452e.m36830d();
            if (interfaceC9455h == null) {
                return;
            } else {
                m36863c(selector, interfaceC9455h);
            }
        }
    }

    /* JADX INFO: renamed from: r0 */
    public final Object m36811r0(C9452e c9452e, InterfaceC5976f interfaceC5976f) {
        InterfaceC9455h interfaceC9455h = (InterfaceC9455h) c9452e.m36830d();
        return interfaceC9455h == null ? m36812v0(c9452e, interfaceC5976f) : interfaceC9455h;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: v0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m36812v0(p339x6.C9452e r6, p228p8.InterfaceC5976f r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof p339x6.C9448a.d
            if (r0 == 0) goto L13
            r0 = r7
            x6.a$d r0 = (p339x6.C9448a.d) r0
            int r1 = r0.f32112t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f32112t = r1
            goto L18
        L13:
            x6.a$d r0 = new x6.a$d
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f32110r
            java.lang.Object r1 = p242q8.AbstractC6325c.m24992g()
            int r2 = r0.f32112t
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L2a
            java.lang.Object r6 = r0.f32109q
            x6.e r6 = (p339x6.C9452e) r6
            goto L31
        L2a:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            p376zd.C10010p0.m38820a(r6)
        L2f:
            r6 = 0
            return r6
        L31:
            p172l8.AbstractC4713t.m18808b(r7)
        L34:
            java.lang.Object r7 = r6.m36830d()
            x6.h r7 = (p339x6.InterfaceC9455h) r7
            if (r7 == 0) goto L3d
            return r7
        L3d:
            boolean r7 = r5.closed
            r2 = 0
            if (r7 == 0) goto L43
            return r2
        L43:
            r0.f32109q = r6
            r0.f32112t = r3
            x6.a$b r7 = r5.f32095u
            boolean r4 = r6.m36829c()
            if (r4 == 0) goto L7e
            boolean r4 = r5.closed
            if (r4 != 0) goto L7e
            java.util.concurrent.atomic.AtomicReference r4 = p339x6.C9448a.b.m36814a(r7)
            boolean r4 = p163l.AbstractC4284d1.m16830a(r4, r2, r0)
            if (r4 == 0) goto L78
            boolean r4 = r6.m36829c()
            if (r4 == 0) goto L68
            boolean r4 = r5.closed
            if (r4 != 0) goto L68
            goto L73
        L68:
            java.util.concurrent.atomic.AtomicReference r7 = p339x6.C9448a.b.m36814a(r7)
            boolean r7 = p163l.AbstractC4284d1.m16830a(r7, r0, r2)
            if (r7 == 0) goto L73
            goto L7e
        L73:
            java.lang.Object r2 = p242q8.AbstractC6325c.m24992g()
            goto L7e
        L78:
            java.lang.String r6 = "Continuation is already set"
            p376zd.C10010p0.m38820a(r6)
            goto L2f
        L7e:
            if (r2 != 0) goto L82
            l8.i0 r2 = p172l8.C4700i0.f13910a
        L82:
            java.lang.Object r7 = p242q8.AbstractC6325c.m24992g()
            if (r2 != r7) goto L8b
            p257r8.AbstractC6539h.m25860c(r0)
        L8b:
            if (r2 != r1) goto L34
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p339x6.C9448a.m36812v0(x6.e, p8.f):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: w0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m36813w0(java.nio.channels.Selector r5, p228p8.InterfaceC5976f r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof p339x6.C9448a.e
            if (r0 == 0) goto L13
            r0 = r6
            x6.a$e r0 = (p339x6.C9448a.e) r0
            int r1 = r0.f32116t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f32116t = r1
            goto L18
        L13:
            x6.a$e r0 = new x6.a$e
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f32114r
            java.lang.Object r1 = p242q8.AbstractC6325c.m24992g()
            int r2 = r0.f32116t
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.f32113q
            java.nio.channels.Selector r5 = (java.nio.channels.Selector) r5
            p172l8.AbstractC4713t.m18808b(r6)
            goto L44
        L2d:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            p376zd.C10010p0.m38820a(r5)
            r5 = 0
            return r5
        L34:
            p172l8.AbstractC4713t.m18808b(r6)
            r4.inSelect = r3
            r0.f32113q = r5
            r0.f32116t = r3
            java.lang.Object r6 = ec.AbstractC2119c3.m7722a(r0)
            if (r6 != r1) goto L44
            return r1
        L44:
            java.util.concurrent.atomic.AtomicLong r6 = r4.f32094t
            long r0 = r6.get()
            r2 = 0
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r0 = 0
            if (r6 != 0) goto L5a
            r1 = 500(0x1f4, double:2.47E-321)
            int r5 = r5.select(r1)
            r4.inSelect = r0
            goto L65
        L5a:
            r4.inSelect = r0
            java.util.concurrent.atomic.AtomicLong r6 = r4.f32094t
            r6.set(r2)
            int r5 = r5.selectNow()
        L65:
            java.lang.Integer r5 = p257r8.AbstractC6533b.m25848d(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p339x6.C9448a.m36813w0(java.nio.channels.Selector, p8.f):java.lang.Object");
    }
}
