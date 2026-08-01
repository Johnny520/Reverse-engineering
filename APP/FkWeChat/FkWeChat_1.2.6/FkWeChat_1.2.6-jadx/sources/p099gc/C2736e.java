package p099gc;

import com.alibaba.fastjson2.codec.FieldInfo;
import ec.AbstractC2172q;
import ec.C2164o;
import ec.InterfaceC2109a3;
import ec.InterfaceC2156m;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import mc.InterfaceC5145a;
import okhttp3.C5793k;
import p010a9.InterfaceC0184l;
import p010a9.InterfaceC0188p;
import p010a9.InterfaceC0189q;
import p024b9.C1055q;
import p055e.AbstractC1960a;
import p098g9.InterfaceC2552f;
import p145jc.AbstractC3794a;
import p145jc.AbstractC3795a0;
import p145jc.AbstractC3796b;
import p145jc.AbstractC3797b0;
import p145jc.AbstractC3799c0;
import p145jc.AbstractC3812j;
import p145jc.AbstractC3832w;
import p145jc.C3825p0;
import p172l8.AbstractC4693f;
import p172l8.AbstractC4713t;
import p172l8.C4700i0;
import p172l8.C4712s;
import p193n3.AbstractC5489b;
import p215oc.C5704b;
import p215oc.C5725t;
import p228p8.InterfaceC5976f;
import p228p8.InterfaceC5980j;
import p242q8.AbstractC6324b;
import p242q8.AbstractC6325c;
import p257r8.AbstractC6533b;
import p257r8.AbstractC6535d;
import p257r8.AbstractC6539h;
import p314vb.C8897d;
import p376zd.C10010p0;

/* JADX INFO: renamed from: gc.e */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public class C2736e implements InterfaceC2738g {
    private volatile /* synthetic */ Object _closeCause$volatile;
    private volatile /* synthetic */ long bufferEnd$volatile;
    private volatile /* synthetic */ Object bufferEndSegment$volatile;
    private volatile /* synthetic */ Object closeHandler$volatile;
    private volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;

    /* JADX INFO: renamed from: q */
    public final int f7157q;

    /* JADX INFO: renamed from: r */
    public final InterfaceC0184l f7158r;
    private volatile /* synthetic */ Object receiveSegment$volatile;
    private volatile /* synthetic */ long receivers$volatile;

    /* JADX INFO: renamed from: s */
    public final InterfaceC0189q f7159s;
    private volatile /* synthetic */ Object sendSegment$volatile;
    private volatile /* synthetic */ long sendersAndCloseStatus$volatile;

    /* JADX INFO: renamed from: t */
    public static final /* synthetic */ AtomicLongFieldUpdater f7150t = AtomicLongFieldUpdater.newUpdater(C2736e.class, "sendersAndCloseStatus$volatile");

    /* JADX INFO: renamed from: u */
    public static final /* synthetic */ AtomicLongFieldUpdater f7151u = AtomicLongFieldUpdater.newUpdater(C2736e.class, "receivers$volatile");

    /* JADX INFO: renamed from: v */
    public static final /* synthetic */ AtomicLongFieldUpdater f7152v = AtomicLongFieldUpdater.newUpdater(C2736e.class, "bufferEnd$volatile");

    /* JADX INFO: renamed from: w */
    public static final /* synthetic */ AtomicLongFieldUpdater f7153w = AtomicLongFieldUpdater.newUpdater(C2736e.class, "completedExpandBuffersAndPauseFlag$volatile");

    /* JADX INFO: renamed from: x */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f7154x = AtomicReferenceFieldUpdater.newUpdater(C2736e.class, Object.class, "sendSegment$volatile");

    /* JADX INFO: renamed from: y */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f7155y = AtomicReferenceFieldUpdater.newUpdater(C2736e.class, Object.class, "receiveSegment$volatile");

    /* JADX INFO: renamed from: z */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f7156z = AtomicReferenceFieldUpdater.newUpdater(C2736e.class, Object.class, "bufferEndSegment$volatile");

    /* JADX INFO: renamed from: A */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f7148A = AtomicReferenceFieldUpdater.newUpdater(C2736e.class, Object.class, "_closeCause$volatile");

    /* JADX INFO: renamed from: B */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f7149B = AtomicReferenceFieldUpdater.newUpdater(C2736e.class, Object.class, "closeHandler$volatile");

    /* JADX INFO: renamed from: gc.e$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public final class a implements InterfaceC2740i, InterfaceC2109a3 {

        /* JADX INFO: renamed from: q */
        public Object f7160q = AbstractC2737f.f7188p;

        /* JADX INFO: renamed from: r */
        public C2164o f7161r;

        public a() {
        }

        @Override // ec.InterfaceC2109a3
        /* JADX INFO: renamed from: a */
        public void mo7618a(AbstractC3795a0 abstractC3795a0, int i10) {
            C2164o c2164o = this.f7161r;
            if (c2164o != null) {
                c2164o.mo7618a(abstractC3795a0, i10);
            }
        }

        @Override // p099gc.InterfaceC2740i
        /* JADX INFO: renamed from: b */
        public Object mo9793b(InterfaceC5976f interfaceC5976f) throws Throwable {
            C2743l c2743lM9745T;
            boolean zM9795g = true;
            if (this.f7160q == AbstractC2737f.f7188p || this.f7160q == AbstractC2737f.m9829z()) {
                C2736e c2736e = C2736e.this;
                C2743l c2743l = (C2743l) C2736e.m9690c0().get(c2736e);
                while (!c2736e.m9778q0()) {
                    long andIncrement = C2736e.m9692d0().getAndIncrement(c2736e);
                    int i10 = AbstractC2737f.f7174b;
                    long j10 = andIncrement / ((long) i10);
                    int i11 = (int) (andIncrement % ((long) i10));
                    if (c2743l.f10969c != j10) {
                        c2743lM9745T = c2736e.m9745T(j10, c2743l);
                        if (c2743lM9745T == null) {
                            continue;
                        }
                    } else {
                        c2743lM9745T = c2743l;
                    }
                    Object objM9760c1 = c2736e.m9760c1(c2743lM9745T, i11, andIncrement, null);
                    if (objM9760c1 == AbstractC2737f.f7185m) {
                        C10010p0.m38820a("unreachable");
                        return null;
                    }
                    if (objM9760c1 == AbstractC2737f.f7187o) {
                        if (andIncrement < c2736e.m9769i0()) {
                            c2743lM9745T.m15134c();
                        }
                        c2743l = c2743lM9745T;
                    } else {
                        if (objM9760c1 == AbstractC2737f.f7186n) {
                            return m9794f(c2743lM9745T, i11, andIncrement, interfaceC5976f);
                        }
                        c2743lM9745T.m15134c();
                        this.f7160q = objM9760c1;
                    }
                }
                zM9795g = m9795g();
            }
            return AbstractC6533b.m25845a(zM9795g);
        }

        /* JADX INFO: renamed from: f */
        public final Object m9794f(C2743l c2743l, int i10, long j10, InterfaceC5976f interfaceC5976f) throws Throwable {
            Boolean boolM25845a;
            InterfaceC0184l interfaceC0184l;
            C2743l c2743lM9745T;
            C2736e c2736e = C2736e.this;
            C2164o c2164oM7888b = AbstractC2172q.m7888b(AbstractC6324b.m24989d(interfaceC5976f));
            try {
                this.f7161r = c2164oM7888b;
                try {
                    Object objM9760c1 = c2736e.m9760c1(c2743l, i10, j10, this);
                    if (objM9760c1 == AbstractC2737f.f7185m) {
                        c2736e.m9730K0(this, c2743l, i10);
                    } else {
                        InterfaceC0189q interfaceC0189qM9719F = null;
                        if (objM9760c1 == AbstractC2737f.f7187o) {
                            if (j10 < c2736e.m9769i0()) {
                                c2743l.m15134c();
                            }
                            C2743l c2743l2 = (C2743l) C2736e.m9690c0().get(c2736e);
                            while (true) {
                                if (c2736e.m9778q0()) {
                                    m9796h();
                                    break;
                                }
                                long andIncrement = C2736e.m9692d0().getAndIncrement(c2736e);
                                int i11 = AbstractC2737f.f7174b;
                                long j11 = andIncrement / ((long) i11);
                                int i12 = (int) (andIncrement % ((long) i11));
                                if (c2743l2.f10969c != j11) {
                                    c2743lM9745T = c2736e.m9745T(j11, c2743l2);
                                    if (c2743lM9745T == null) {
                                    }
                                } else {
                                    c2743lM9745T = c2743l2;
                                }
                                objM9760c1 = c2736e.m9760c1(c2743lM9745T, i12, andIncrement, this);
                                if (objM9760c1 == AbstractC2737f.f7185m) {
                                    c2736e.m9730K0(this, c2743lM9745T, i12);
                                    break;
                                }
                                if (objM9760c1 == AbstractC2737f.f7187o) {
                                    if (andIncrement < c2736e.m9769i0()) {
                                        c2743lM9745T.m15134c();
                                    }
                                    c2743l2 = c2743lM9745T;
                                } else {
                                    if (objM9760c1 == AbstractC2737f.f7186n) {
                                        throw new IllegalStateException("unexpected");
                                    }
                                    c2743lM9745T.m15134c();
                                    this.f7160q = objM9760c1;
                                    this.f7161r = null;
                                    boolM25845a = AbstractC6533b.m25845a(true);
                                    interfaceC0184l = c2736e.f7158r;
                                    if (interfaceC0184l != null) {
                                    }
                                }
                            }
                            c2164oM7888b.mo7836v(boolM25845a, interfaceC0189qM9719F);
                        } else {
                            c2743l.m15134c();
                            this.f7160q = objM9760c1;
                            this.f7161r = null;
                            boolM25845a = AbstractC6533b.m25845a(true);
                            interfaceC0184l = c2736e.f7158r;
                            if (interfaceC0184l != null) {
                                interfaceC0189qM9719F = c2736e.m9719F(interfaceC0184l, objM9760c1);
                            }
                            c2164oM7888b.mo7836v(boolM25845a, interfaceC0189qM9719F);
                        }
                    }
                    Object objM7875w = c2164oM7888b.m7875w();
                    if (objM7875w == AbstractC6325c.m24992g()) {
                        AbstractC6539h.m25860c(interfaceC5976f);
                    }
                    return objM7875w;
                } catch (Throwable th) {
                    th = th;
                    Throwable th2 = th;
                    c2164oM7888b.m7858M();
                    throw th2;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }

        /* JADX INFO: renamed from: g */
        public final boolean m9795g() throws Throwable {
            this.f7160q = AbstractC2737f.m9829z();
            Throwable thM9752Y = C2736e.this.m9752Y();
            if (thM9752Y == null) {
                return false;
            }
            throw AbstractC3799c0.m15149a(thM9752Y);
        }

        /* JADX INFO: renamed from: h */
        public final void m9796h() {
            C2164o c2164o = this.f7161r;
            c2164o.getClass();
            this.f7161r = null;
            this.f7160q = AbstractC2737f.m9829z();
            Throwable thM9752Y = C2736e.this.m9752Y();
            if (thM9752Y == null) {
                C4712s.a aVar = C4712s.f13928r;
                c2164o.resumeWith(C4712s.m18798b(Boolean.FALSE));
            } else {
                C4712s.a aVar2 = C4712s.f13928r;
                c2164o.resumeWith(C4712s.m18798b(AbstractC4713t.m18807a(thM9752Y)));
            }
        }

        /* JADX INFO: renamed from: i */
        public final boolean m9797i(Object obj) {
            C2164o c2164o = this.f7161r;
            c2164o.getClass();
            this.f7161r = null;
            this.f7160q = obj;
            Boolean bool = Boolean.TRUE;
            C2736e c2736e = C2736e.this;
            InterfaceC0184l interfaceC0184l = c2736e.f7158r;
            return AbstractC2737f.m9802B(c2164o, bool, interfaceC0184l != null ? c2736e.m9719F(interfaceC0184l, obj) : null);
        }

        /* JADX INFO: renamed from: j */
        public final void m9798j() {
            C2164o c2164o = this.f7161r;
            c2164o.getClass();
            this.f7161r = null;
            this.f7160q = AbstractC2737f.m9829z();
            Throwable thM9752Y = C2736e.this.m9752Y();
            if (thM9752Y == null) {
                C4712s.a aVar = C4712s.f13928r;
                c2164o.resumeWith(C4712s.m18798b(Boolean.FALSE));
            } else {
                C4712s.a aVar2 = C4712s.f13928r;
                c2164o.resumeWith(C4712s.m18798b(AbstractC4713t.m18807a(thM9752Y)));
            }
        }

        @Override // p099gc.InterfaceC2740i
        public Object next() throws Throwable {
            Object obj = this.f7160q;
            if (obj == AbstractC2737f.f7188p) {
                C10010p0.m38820a("`hasNext()` has not been invoked");
                return null;
            }
            this.f7160q = AbstractC2737f.f7188p;
            if (obj != AbstractC2737f.m9829z()) {
                return obj;
            }
            throw AbstractC3799c0.m15149a(C2736e.this.m9758b0());
        }
    }

    /* JADX INFO: renamed from: gc.e$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public /* synthetic */ class b extends C1055q implements InterfaceC0189q {
        public b(Object obj) {
            super(3, obj, C2736e.class, "onCancellationImplDoNotCall", "onCancellationImplDoNotCall(Ljava/lang/Throwable;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V", 0);
        }

        @Override // p010a9.InterfaceC0189q
        /* JADX INFO: renamed from: e */
        public /* bridge */ /* synthetic */ Object mo236e(Object obj, Object obj2, Object obj3) throws IllegalAccessException, InvocationTargetException {
            m9799y((Throwable) obj, obj2, (InterfaceC5980j) obj3);
            return C4700i0.f13910a;
        }

        /* JADX INFO: renamed from: y */
        public final void m9799y(Throwable th, Object obj, InterfaceC5980j interfaceC5980j) throws IllegalAccessException, InvocationTargetException {
            ((C2736e) this.f3190r).m9716C0(th, obj, interfaceC5980j);
        }
    }

    /* JADX INFO: renamed from: gc.e$c */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public /* synthetic */ class c extends C1055q implements InterfaceC0189q {
        public c(Object obj) {
            super(3, obj, C2736e.class, "onCancellationChannelResultImplDoNotCall", "onCancellationChannelResultImplDoNotCall-5_sEAP8(Ljava/lang/Throwable;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V", 0);
        }

        @Override // p010a9.InterfaceC0189q
        /* JADX INFO: renamed from: e */
        public /* bridge */ /* synthetic */ Object mo236e(Object obj, Object obj2, Object obj3) throws IllegalAccessException, InvocationTargetException {
            m9800y((Throwable) obj, ((C2742k) obj2).m9845k(), (InterfaceC5980j) obj3);
            return C4700i0.f13910a;
        }

        /* JADX INFO: renamed from: y */
        public final void m9800y(Throwable th, Object obj, InterfaceC5980j interfaceC5980j) throws IllegalAccessException, InvocationTargetException {
            ((C2736e) this.f3190r).m9715B0(th, obj, interfaceC5980j);
        }
    }

    /* JADX INFO: renamed from: gc.e$d */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class d extends AbstractC6535d {

        /* JADX INFO: renamed from: q */
        public /* synthetic */ Object f7163q;

        /* JADX INFO: renamed from: s */
        public int f7165s;

        public d(InterfaceC5976f interfaceC5976f) {
            super(interfaceC5976f);
        }

        @Override // p257r8.AbstractC6532a
        public final Object invokeSuspend(Object obj) throws Throwable {
            this.f7163q = obj;
            this.f7165s |= Integer.MIN_VALUE;
            Object objM9683N0 = C2736e.m9683N0(C2736e.this, this);
            return objM9683N0 == AbstractC6325c.m24992g() ? objM9683N0 : C2742k.m9836b(objM9683N0);
        }
    }

    /* JADX INFO: renamed from: gc.e$e */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class e extends AbstractC6535d {

        /* JADX INFO: renamed from: q */
        public Object f7166q;

        /* JADX INFO: renamed from: r */
        public Object f7167r;

        /* JADX INFO: renamed from: s */
        public int f7168s;

        /* JADX INFO: renamed from: t */
        public long f7169t;

        /* JADX INFO: renamed from: u */
        public /* synthetic */ Object f7170u;

        /* JADX INFO: renamed from: w */
        public int f7172w;

        public e(InterfaceC5976f interfaceC5976f) {
            super(interfaceC5976f);
        }

        @Override // p257r8.AbstractC6532a
        public final Object invokeSuspend(Object obj) throws Throwable {
            this.f7170u = obj;
            this.f7172w |= Integer.MIN_VALUE;
            Object objM9736O0 = C2736e.this.m9736O0(null, 0, 0L, this);
            return objM9736O0 == AbstractC6325c.m24992g() ? objM9736O0 : C2742k.m9836b(objM9736O0);
        }
    }

    public C2736e(int i10, InterfaceC0184l interfaceC0184l) {
        this.f7157q = i10;
        this.f7158r = interfaceC0184l;
        if (i10 < 0) {
            C5704b.m23087a("Invalid channel capacity: ", i10, ", should be >=0");
            throw null;
        }
        this.bufferEnd$volatile = AbstractC2737f.m9801A(i10);
        this.completedExpandBuffersAndPauseFlag$volatile = m9749W();
        C2743l c2743l = new C2743l(0L, null, this, 3);
        this.sendSegment$volatile = c2743l;
        this.receiveSegment$volatile = c2743l;
        if (m9785v0()) {
            c2743l = AbstractC2737f.f7173a;
            c2743l.getClass();
        }
        this.bufferEndSegment$volatile = c2743l;
        this.f7159s = interfaceC0184l != null ? new InterfaceC0189q() { // from class: gc.b
            @Override // p010a9.InterfaceC0189q
            /* JADX INFO: renamed from: e */
            public final Object mo236e(Object obj, Object obj2, Object obj3) {
                C2736e c2736e = this.f7143q;
                AbstractC1960a.m7104a(obj);
                return C2736e.m9691d(c2736e, null, obj2, obj3);
            }
        } : null;
        this._closeCause$volatile = AbstractC2737f.f7191s;
    }

    /* JADX INFO: renamed from: M0 */
    public static /* synthetic */ Object m9682M0(C2736e c2736e, InterfaceC5976f interfaceC5976f) throws Throwable {
        C2743l c2743l;
        C2743l c2743l2 = (C2743l) m9690c0().get(c2736e);
        while (!c2736e.m9778q0()) {
            long andIncrement = m9692d0().getAndIncrement(c2736e);
            int i10 = AbstractC2737f.f7174b;
            long j10 = andIncrement / ((long) i10);
            int i11 = (int) (andIncrement % ((long) i10));
            if (c2743l2.f10969c != j10) {
                C2743l c2743lM9745T = c2736e.m9745T(j10, c2743l2);
                if (c2743lM9745T == null) {
                    continue;
                } else {
                    c2743l = c2743lM9745T;
                }
            } else {
                c2743l = c2743l2;
            }
            C2736e c2736e2 = c2736e;
            Object objM9760c1 = c2736e2.m9760c1(c2743l, i11, andIncrement, null);
            if (objM9760c1 == AbstractC2737f.f7185m) {
                C10010p0.m38820a("unexpected");
                return null;
            }
            if (objM9760c1 != AbstractC2737f.f7187o) {
                if (objM9760c1 == AbstractC2737f.f7186n) {
                    return c2736e2.m9738P0(c2743l, i11, andIncrement, interfaceC5976f);
                }
                c2743l.m15134c();
                return objM9760c1;
            }
            if (andIncrement < c2736e2.m9769i0()) {
                c2743l.m15134c();
            }
            c2736e = c2736e2;
            c2743l2 = c2743l;
        }
        throw AbstractC3799c0.m15149a(c2736e.m9758b0());
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /* JADX INFO: renamed from: N0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object m9683N0(p099gc.C2736e r13, p228p8.InterfaceC5976f r14) throws java.lang.Throwable {
        /*
            boolean r0 = r14 instanceof p099gc.C2736e.d
            if (r0 == 0) goto L14
            r0 = r14
            gc.e$d r0 = (p099gc.C2736e.d) r0
            int r1 = r0.f7165s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f7165s = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            gc.e$d r0 = new gc.e$d
            r0.<init>(r14)
            goto L12
        L1a:
            java.lang.Object r14 = r6.f7163q
            java.lang.Object r0 = p242q8.AbstractC6325c.m24992g()
            int r1 = r6.f7165s
            r2 = 1
            if (r1 == 0) goto L38
            if (r1 != r2) goto L31
            p172l8.AbstractC4713t.m18808b(r14)
            gc.k r14 = (p099gc.C2742k) r14
            java.lang.Object r13 = r14.m9845k()
            return r13
        L31:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            p376zd.C10010p0.m38820a(r13)
            r13 = 0
            return r13
        L38:
            p172l8.AbstractC4713t.m18808b(r14)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r14 = m9703m()
            java.lang.Object r14 = r14.get(r13)
            gc.l r14 = (p099gc.C2743l) r14
        L45:
            boolean r1 = r13.m9778q0()
            if (r1 == 0) goto L56
            gc.k$b r14 = p099gc.C2742k.f7197b
            java.lang.Throwable r13 = r13.m9752Y()
            java.lang.Object r13 = r14.m9846a(r13)
            return r13
        L56:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = m9705o()
            long r4 = r1.getAndIncrement(r13)
            int r1 = p099gc.AbstractC2737f.f7174b
            long r7 = (long) r1
            long r7 = r4 / r7
            long r9 = (long) r1
            long r9 = r4 % r9
            int r3 = (int) r9
            long r9 = r14.f10969c
            int r1 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r1 == 0) goto L76
            gc.l r1 = m9699j(r13, r7, r14)
            if (r1 != 0) goto L74
            goto L45
        L74:
            r8 = r1
            goto L77
        L76:
            r8 = r14
        L77:
            r12 = 0
            r7 = r13
            r9 = r3
            r10 = r4
            java.lang.Object r13 = m9680D(r7, r8, r9, r10, r12)
            r1 = r7
            jc.d0 r14 = p099gc.AbstractC2737f.m9821r()
            if (r13 == r14) goto Lb5
            jc.d0 r14 = p099gc.AbstractC2737f.m9811h()
            if (r13 != r14) goto L9a
            long r13 = r1.m9769i0()
            int r13 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r13 >= 0) goto L97
            r8.m15134c()
        L97:
            r13 = r1
            r14 = r8
            goto L45
        L9a:
            jc.d0 r14 = p099gc.AbstractC2737f.m9822s()
            if (r13 != r14) goto Lab
            r6.f7165s = r2
            r2 = r8
            java.lang.Object r13 = r1.m9736O0(r2, r3, r4, r6)
            if (r13 != r0) goto Laa
            return r0
        Laa:
            return r13
        Lab:
            r8.m15134c()
            gc.k$b r14 = p099gc.C2742k.f7197b
            java.lang.Object r13 = r14.m9848c(r13)
            return r13
        Lb5:
            java.lang.String r13 = "unexpected"
            p376zd.C10010p0.m38820a(r13)
            r13 = 0
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: p099gc.C2736e.m9683N0(gc.e, p8.f):java.lang.Object");
    }

    /* JADX INFO: renamed from: U0 */
    public static /* synthetic */ Object m9684U0(C2736e c2736e, Object obj, InterfaceC5976f interfaceC5976f) throws IllegalAccessException, InvocationTargetException {
        C2743l c2743l;
        C2743l c2743l2 = (C2743l) m9696g0().get(c2736e);
        while (true) {
            long andIncrement = m9698h0().getAndIncrement(c2736e);
            long j10 = andIncrement & 1152921504606846975L;
            boolean zM9783t0 = c2736e.m9783t0(andIncrement);
            int i10 = AbstractC2737f.f7174b;
            long j11 = j10 / ((long) i10);
            int i11 = (int) (j10 % ((long) i10));
            if (c2743l2.f10969c != j11) {
                C2743l c2743lM9747U = c2736e.m9747U(j11, c2743l2);
                if (c2743lM9747U != null) {
                    c2743l = c2743lM9747U;
                } else if (zM9783t0) {
                    Object objM9722G0 = c2736e.m9722G0(obj, interfaceC5976f);
                    if (objM9722G0 == AbstractC6325c.m24992g()) {
                        return objM9722G0;
                    }
                }
            } else {
                c2743l = c2743l2;
            }
            C2736e c2736e2 = c2736e;
            Object obj2 = obj;
            int iM9763e1 = c2736e2.m9763e1(c2743l, i11, obj2, j10, null, zM9783t0);
            if (iM9763e1 == 0) {
                c2743l.m15134c();
                break;
            }
            if (iM9763e1 == 1) {
                break;
            }
            if (iM9763e1 != 2) {
                if (iM9763e1 == 3) {
                    Object objM9748V0 = c2736e2.m9748V0(c2743l, i11, obj2, j10, interfaceC5976f);
                    if (objM9748V0 == AbstractC6325c.m24992g()) {
                        return objM9748V0;
                    }
                } else if (iM9763e1 != 4) {
                    if (iM9763e1 == 5) {
                        c2743l.m15134c();
                    }
                    c2736e = c2736e2;
                    c2743l2 = c2743l;
                    obj = obj2;
                } else {
                    if (j10 < c2736e2.m9762e0()) {
                        c2743l.m15134c();
                    }
                    Object objM9722G02 = c2736e2.m9722G0(obj2, interfaceC5976f);
                    if (objM9722G02 == AbstractC6325c.m24992g()) {
                        return objM9722G02;
                    }
                }
            } else if (zM9783t0) {
                c2743l.m15129t();
                Object objM9722G03 = c2736e2.m9722G0(obj2, interfaceC5976f);
                if (objM9722G03 == AbstractC6325c.m24992g()) {
                    return objM9722G03;
                }
            }
        }
        return C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: c */
    public static C4700i0 m9689c(Object obj, C2736e c2736e, InterfaceC5145a interfaceC5145a, Throwable th, Object obj2, InterfaceC5980j interfaceC5980j) throws IllegalAccessException, InvocationTargetException {
        if (obj != AbstractC2737f.m9829z()) {
            AbstractC3832w.m15263a(c2736e.f7158r, obj, interfaceC5145a.getContext());
        }
        return C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: c0 */
    public static final /* synthetic */ AtomicReferenceFieldUpdater m9690c0() {
        return f7155y;
    }

    /* JADX INFO: renamed from: d */
    public static InterfaceC0189q m9691d(final C2736e c2736e, final InterfaceC5145a interfaceC5145a, Object obj, final Object obj2) {
        return new InterfaceC0189q(obj2, c2736e, interfaceC5145a) { // from class: gc.d

            /* JADX INFO: renamed from: q */
            public final /* synthetic */ Object f7146q;

            /* JADX INFO: renamed from: r */
            public final /* synthetic */ C2736e f7147r;

            @Override // p010a9.InterfaceC0189q
            /* JADX INFO: renamed from: e */
            public final Object mo236e(Object obj3, Object obj4, Object obj5) {
                return C2736e.m9689c(this.f7146q, this.f7147r, null, (Throwable) obj3, obj4, (InterfaceC5980j) obj5);
            }
        };
    }

    /* JADX INFO: renamed from: d0 */
    public static final /* synthetic */ AtomicLongFieldUpdater m9692d0() {
        return f7151u;
    }

    /* JADX INFO: renamed from: e */
    public static C4700i0 m9693e(InterfaceC0184l interfaceC0184l, Object obj, Throwable th, Object obj2, InterfaceC5980j interfaceC5980j) throws IllegalAccessException, InvocationTargetException {
        AbstractC3832w.m15263a(interfaceC0184l, obj, interfaceC5980j);
        return C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: g0 */
    public static final /* synthetic */ AtomicReferenceFieldUpdater m9696g0() {
        return f7154x;
    }

    /* JADX INFO: renamed from: h0 */
    public static final /* synthetic */ AtomicLongFieldUpdater m9698h0() {
        return f7150t;
    }

    /* JADX INFO: renamed from: m0 */
    public static /* synthetic */ void m9704m0(C2736e c2736e, long j10, int i10, Object obj) {
        if (obj != null) {
            C5725t.m23179a("Super calls with default arguments not supported in this target, function: incCompletedExpandBufferAttempts");
            return;
        }
        if ((i10 & 1) != 0) {
            j10 = 1;
        }
        c2736e.m9772l0(j10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0011, code lost:
    
        continue;
     */
    /* JADX INFO: renamed from: A0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m9714A0(long r5, p099gc.C2743l r7) {
        /*
            r4 = this;
        L0:
            long r0 = r7.f10969c
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 >= 0) goto L11
            jc.b r0 = r7.m15137f()
            gc.l r0 = (p099gc.C2743l) r0
            if (r0 != 0) goto Lf
            goto L11
        Lf:
            r7 = r0
            goto L0
        L11:
            boolean r5 = r7.mo15127k()
            if (r5 == 0) goto L22
            jc.b r5 = r7.m15137f()
            gc.l r5 = (p099gc.C2743l) r5
            if (r5 != 0) goto L20
            goto L22
        L20:
            r7 = r5
            goto L11
        L22:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = m9686X()
        L26:
            java.lang.Object r6 = r5.get(r4)
            jc.a0 r6 = (p145jc.AbstractC3795a0) r6
            long r0 = r6.f10969c
            long r2 = r7.f10969c
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto L35
            return
        L35:
            boolean r0 = r7.m15130u()
            if (r0 != 0) goto L3c
            goto L11
        L3c:
            boolean r0 = p193n3.AbstractC5489b.m22334a(r5, r4, r6, r7)
            if (r0 == 0) goto L4c
            boolean r5 = r6.m15128p()
            if (r5 == 0) goto L4b
            r6.m15142n()
        L4b:
            return
        L4c:
            boolean r6 = r7.m15128p()
            if (r6 == 0) goto L26
            r7.m15142n()
            goto L26
        */
        throw new UnsupportedOperationException("Method not decompiled: p099gc.C2736e.m9714A0(long, gc.l):void");
    }

    /* JADX INFO: renamed from: B0 */
    public final void m9715B0(Throwable th, Object obj, InterfaceC5980j interfaceC5980j) throws IllegalAccessException, InvocationTargetException {
        InterfaceC0184l interfaceC0184l = this.f7158r;
        interfaceC0184l.getClass();
        Object objM9840f = C2742k.m9840f(obj);
        objM9840f.getClass();
        AbstractC3832w.m15263a(interfaceC0184l, objM9840f, interfaceC5980j);
    }

    /* JADX INFO: renamed from: C0 */
    public final void m9716C0(Throwable th, Object obj, InterfaceC5980j interfaceC5980j) throws IllegalAccessException, InvocationTargetException {
        InterfaceC0184l interfaceC0184l = this.f7158r;
        interfaceC0184l.getClass();
        AbstractC3832w.m15263a(interfaceC0184l, obj, interfaceC5980j);
    }

    /* JADX INFO: renamed from: E0 */
    public final void m9718E0(InterfaceC2156m interfaceC2156m) {
        C4712s.a aVar = C4712s.f13928r;
        interfaceC2156m.resumeWith(C4712s.m18798b(C2742k.m9836b(C2742k.f7197b.m9846a(m9752Y()))));
    }

    /* JADX INFO: renamed from: F */
    public final InterfaceC0189q m9719F(final InterfaceC0184l interfaceC0184l, final Object obj) {
        return new InterfaceC0189q() { // from class: gc.c
            @Override // p010a9.InterfaceC0189q
            /* JADX INFO: renamed from: e */
            public final Object mo236e(Object obj2, Object obj3, Object obj4) {
                return C2736e.m9693e(interfaceC0184l, obj, (Throwable) obj2, obj3, (InterfaceC5980j) obj4);
            }
        };
    }

    /* JADX INFO: renamed from: F0 */
    public final void m9720F0(InterfaceC2156m interfaceC2156m) {
        C4712s.a aVar = C4712s.f13928r;
        interfaceC2156m.resumeWith(C4712s.m18798b(AbstractC4713t.m18807a(m9758b0())));
    }

    /* JADX INFO: renamed from: G */
    public final InterfaceC2552f m9721G(InterfaceC0184l interfaceC0184l) {
        return new b(this);
    }

    /* JADX INFO: renamed from: G0 */
    public final Object m9722G0(Object obj, InterfaceC5976f interfaceC5976f) throws IllegalAccessException, InvocationTargetException {
        C3825p0 c3825p0M15265c;
        C2164o c2164o = new C2164o(AbstractC6324b.m24989d(interfaceC5976f), 1);
        c2164o.m7851E();
        InterfaceC0184l interfaceC0184l = this.f7158r;
        if (interfaceC0184l == null || (c3825p0M15265c = AbstractC3832w.m15265c(interfaceC0184l, obj, null, 2, null)) == null) {
            Throwable thM9764f0 = m9764f0();
            C4712s.a aVar = C4712s.f13928r;
            c2164o.resumeWith(C4712s.m18798b(AbstractC4713t.m18807a(thM9764f0)));
        } else {
            AbstractC4693f.m18753a(c3825p0M15265c, m9764f0());
            C4712s.a aVar2 = C4712s.f13928r;
            c2164o.resumeWith(C4712s.m18798b(AbstractC4713t.m18807a(c3825p0M15265c)));
        }
        Object objM7875w = c2164o.m7875w();
        if (objM7875w == AbstractC6325c.m24992g()) {
            AbstractC6539h.m25860c(interfaceC5976f);
        }
        return objM7875w == AbstractC6325c.m24992g() ? objM7875w : C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: H */
    public final InterfaceC2552f m9723H(InterfaceC0184l interfaceC0184l) {
        return new c(this);
    }

    /* JADX INFO: renamed from: H0 */
    public final void m9724H0(Object obj, InterfaceC2156m interfaceC2156m) throws IllegalAccessException, InvocationTargetException {
        InterfaceC0184l interfaceC0184l = this.f7158r;
        if (interfaceC0184l != null) {
            AbstractC3832w.m15263a(interfaceC0184l, obj, interfaceC2156m.getContext());
        }
        Throwable thM9764f0 = m9764f0();
        C4712s.a aVar = C4712s.f13928r;
        interfaceC2156m.resumeWith(C4712s.m18798b(AbstractC4713t.m18807a(thM9764f0)));
    }

    /* JADX INFO: renamed from: I */
    public final boolean m9725I(long j10) {
        return j10 < m9749W() || j10 < m9762e0() + ((long) this.f7157q);
    }

    /* JADX INFO: renamed from: J */
    public boolean m9727J(Throwable th) {
        if (th == null) {
            th = new CancellationException("Channel was cancelled");
        }
        return m9733M(th, true);
    }

    /* JADX INFO: renamed from: K */
    public final void m9729K(C2743l c2743l, long j10) {
        Object objM15184b = AbstractC3812j.m15184b(null, 1, null);
        loop0: while (c2743l != null) {
            for (int i10 = AbstractC2737f.f7174b - 1; -1 < i10; i10--) {
                if ((c2743l.f10969c * ((long) AbstractC2737f.f7174b)) + ((long) i10) < j10) {
                    break loop0;
                }
                while (true) {
                    Object objM9850B = c2743l.m9850B(i10);
                    if (objM9850B != null && objM9850B != AbstractC2737f.f7177e) {
                        if (!(objM9850B instanceof C2755x)) {
                            if (!(objM9850B instanceof InterfaceC2109a3)) {
                                break;
                            }
                            if (c2743l.m9858v(i10, objM9850B, AbstractC2737f.m9829z())) {
                                objM15184b = AbstractC3812j.m15185c(objM15184b, objM9850B);
                                c2743l.m9851C(i10, true);
                                break;
                            }
                        } else {
                            if (c2743l.m9858v(i10, objM9850B, AbstractC2737f.m9829z())) {
                                objM15184b = AbstractC3812j.m15185c(objM15184b, ((C2755x) objM9850B).f7206a);
                                c2743l.m9851C(i10, true);
                                break;
                            }
                        }
                    } else {
                        if (c2743l.m9858v(i10, objM9850B, AbstractC2737f.m9829z())) {
                            c2743l.m15129t();
                            break;
                        }
                    }
                }
            }
            c2743l = (C2743l) c2743l.m15139h();
        }
        if (objM15184b != null) {
            if (!(objM15184b instanceof ArrayList)) {
                m9742R0((InterfaceC2109a3) objM15184b);
                return;
            }
            ArrayList arrayList = (ArrayList) objM15184b;
            for (int size = arrayList.size() - 1; -1 < size; size--) {
                m9742R0((InterfaceC2109a3) arrayList.get(size));
            }
        }
    }

    /* JADX INFO: renamed from: K0 */
    public final void m9730K0(InterfaceC2109a3 interfaceC2109a3, C2743l c2743l, int i10) {
        m9728J0();
        interfaceC2109a3.mo7618a(c2743l, i10);
    }

    /* JADX INFO: renamed from: L */
    public final C2743l m9731L() {
        Object obj = f7156z.get(this);
        C2743l c2743l = (C2743l) f7154x.get(this);
        if (c2743l.f10969c > ((C2743l) obj).f10969c) {
            obj = c2743l;
        }
        C2743l c2743l2 = (C2743l) f7155y.get(this);
        if (c2743l2.f10969c > ((C2743l) obj).f10969c) {
            obj = c2743l2;
        }
        return (C2743l) AbstractC3794a.m15124b((AbstractC3796b) obj);
    }

    /* JADX INFO: renamed from: L0 */
    public final void m9732L0(InterfaceC2109a3 interfaceC2109a3, C2743l c2743l, int i10) {
        interfaceC2109a3.mo7618a(c2743l, i10 + AbstractC2737f.f7174b);
    }

    /* JADX INFO: renamed from: M */
    public boolean m9733M(Throwable th, boolean z10) {
        if (z10) {
            m9787x0();
        }
        boolean zM22334a = AbstractC5489b.m22334a(f7148A, this, AbstractC2737f.f7191s, th);
        if (z10) {
            m9788y0();
        } else {
            m9789z0();
        }
        m9737P();
        m9717D0();
        if (zM22334a) {
            m9774n0();
        }
        return zM22334a;
    }

    /* JADX INFO: renamed from: N */
    public final void m9734N(long j10) throws IllegalAccessException, InvocationTargetException {
        m9740Q0(m9735O(j10));
    }

    /* JADX INFO: renamed from: O */
    public final C2743l m9735O(long j10) {
        C2743l c2743lM9731L = m9731L();
        if (mo9784u0()) {
            long jM9786w0 = m9786w0(c2743lM9731L);
            if (jM9786w0 != -1) {
                m9739Q(jM9786w0);
            }
        }
        m9729K(c2743lM9731L, j10);
        return c2743lM9731L;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: O0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m9736O0(p099gc.C2743l r11, int r12, long r13, p228p8.InterfaceC5976f r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p099gc.C2736e.m9736O0(gc.l, int, long, p8.f):java.lang.Object");
    }

    /* JADX INFO: renamed from: P */
    public final void m9737P() {
        m9782s0();
    }

    /* JADX INFO: renamed from: P0 */
    public final Object m9738P0(C2743l c2743l, int i10, long j10, InterfaceC5976f interfaceC5976f) {
        C2743l c2743l2;
        C2164o c2164oM7888b = AbstractC2172q.m7888b(AbstractC6324b.m24989d(interfaceC5976f));
        try {
            Object objM9760c1 = m9760c1(c2743l, i10, j10, c2164oM7888b);
            if (objM9760c1 == AbstractC2737f.f7185m) {
                m9730K0(c2164oM7888b, c2743l, i10);
            } else {
                InterfaceC2552f interfaceC2552fM9721G = null;
                interfaceC2552fM9721G = null;
                if (objM9760c1 == AbstractC2737f.f7187o) {
                    if (j10 < m9769i0()) {
                        c2743l.m15134c();
                    }
                    C2743l c2743l3 = (C2743l) m9690c0().get(this);
                    while (true) {
                        if (m9778q0()) {
                            m9720F0(c2164oM7888b);
                            break;
                        }
                        long andIncrement = m9692d0().getAndIncrement(this);
                        int i11 = AbstractC2737f.f7174b;
                        long j11 = andIncrement / ((long) i11);
                        int i12 = (int) (andIncrement % ((long) i11));
                        if (c2743l3.f10969c != j11) {
                            C2743l c2743lM9745T = m9745T(j11, c2743l3);
                            if (c2743lM9745T != null) {
                                c2743l2 = c2743lM9745T;
                            }
                        } else {
                            c2743l2 = c2743l3;
                        }
                        objM9760c1 = m9760c1(c2743l2, i12, andIncrement, c2164oM7888b);
                        C2743l c2743l4 = c2743l2;
                        if (objM9760c1 == AbstractC2737f.f7185m) {
                            C2164o c2164o = c2164oM7888b != null ? c2164oM7888b : null;
                            if (c2164o != null) {
                                m9730K0(c2164o, c2743l4, i12);
                            }
                        } else if (objM9760c1 == AbstractC2737f.f7187o) {
                            if (andIncrement < m9769i0()) {
                                c2743l4.m15134c();
                            }
                            c2743l3 = c2743l4;
                        } else {
                            if (objM9760c1 == AbstractC2737f.f7186n) {
                                throw new IllegalStateException("unexpected");
                            }
                            c2743l4.m15134c();
                            InterfaceC0184l interfaceC0184l = this.f7158r;
                            if (interfaceC0184l != null) {
                                interfaceC2552fM9721G = m9721G(interfaceC0184l);
                            }
                        }
                    }
                } else {
                    c2743l.m15134c();
                    InterfaceC0184l interfaceC0184l2 = this.f7158r;
                    if (interfaceC0184l2 != null) {
                        interfaceC2552fM9721G = m9721G(interfaceC0184l2);
                    }
                }
                c2164oM7888b.mo7836v(objM9760c1, (InterfaceC0189q) interfaceC2552fM9721G);
            }
            Object objM7875w = c2164oM7888b.m7875w();
            if (objM7875w == AbstractC6325c.m24992g()) {
                AbstractC6539h.m25860c(interfaceC5976f);
            }
            return objM7875w;
        } catch (Throwable th) {
            c2164oM7888b.m7858M();
            throw th;
        }
    }

    /* JADX INFO: renamed from: Q */
    public final void m9739Q(long j10) {
        C2743l c2743lM9745T;
        C3825p0 c3825p0M15265c;
        C2743l c2743l = (C2743l) f7155y.get(this);
        while (true) {
            long j11 = f7151u.get(this);
            if (j10 < Math.max(((long) this.f7157q) + j11, m9749W())) {
                return;
            }
            if (f7151u.compareAndSet(this, j11, 1 + j11)) {
                int i10 = AbstractC2737f.f7174b;
                long j12 = j11 / ((long) i10);
                int i11 = (int) (j11 % ((long) i10));
                if (c2743l.f10969c != j12) {
                    c2743lM9745T = m9745T(j12, c2743l);
                    if (c2743lM9745T == null) {
                        continue;
                    }
                } else {
                    c2743lM9745T = c2743l;
                }
                Object objM9760c1 = m9760c1(c2743lM9745T, i11, j11, null);
                if (objM9760c1 != AbstractC2737f.f7187o) {
                    c2743lM9745T.m15134c();
                    InterfaceC0184l interfaceC0184l = this.f7158r;
                    if (interfaceC0184l != null && (c3825p0M15265c = AbstractC3832w.m15265c(interfaceC0184l, objM9760c1, null, 2, null)) != null) {
                        throw c3825p0M15265c;
                    }
                } else if (j11 < m9769i0()) {
                    c2743lM9745T.m15134c();
                }
                c2743l = c2743lM9745T;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00b3, code lost:
    
        r12 = (p099gc.C2743l) r12.m15139h();
     */
    /* JADX INFO: renamed from: Q0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m9740Q0(p099gc.C2743l r12) throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instruction units count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p099gc.C2736e.m9740Q0(gc.l):void");
    }

    /* JADX INFO: renamed from: R */
    public final void m9741R() {
        if (m9785v0()) {
            return;
        }
        C2743l c2743l = (C2743l) f7156z.get(this);
        while (true) {
            long andIncrement = f7152v.getAndIncrement(this);
            int i10 = AbstractC2737f.f7174b;
            long j10 = andIncrement / ((long) i10);
            if (m9769i0() <= andIncrement) {
                if (c2743l.f10969c < j10 && c2743l.m15137f() != null) {
                    m9714A0(j10, c2743l);
                }
                m9704m0(this, 0L, 1, null);
                return;
            }
            if (c2743l.f10969c != j10) {
                C2743l c2743lM9743S = m9743S(j10, c2743l, andIncrement);
                if (c2743lM9743S == null) {
                    continue;
                } else {
                    c2743l = c2743lM9743S;
                }
            }
            if (m9756a1(c2743l, (int) (andIncrement % ((long) i10)), andIncrement)) {
                m9704m0(this, 0L, 1, null);
                return;
            }
            m9704m0(this, 0L, 1, null);
        }
    }

    /* JADX INFO: renamed from: R0 */
    public final void m9742R0(InterfaceC2109a3 interfaceC2109a3) {
        m9746T0(interfaceC2109a3, true);
    }

    /* JADX INFO: renamed from: S */
    public final C2743l m9743S(long j10, C2743l c2743l, long j11) {
        Object objM15125c;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7156z;
        InterfaceC0188p interfaceC0188p = (InterfaceC0188p) AbstractC2737f.m9828y();
        loop0: while (true) {
            objM15125c = AbstractC3794a.m15125c(c2743l, j10, interfaceC0188p);
            if (!AbstractC3797b0.m15146c(objM15125c)) {
                AbstractC3795a0 abstractC3795a0M15145b = AbstractC3797b0.m15145b(objM15125c);
                while (true) {
                    AbstractC3795a0 abstractC3795a0 = (AbstractC3795a0) atomicReferenceFieldUpdater.get(this);
                    if (abstractC3795a0.f10969c >= abstractC3795a0M15145b.f10969c) {
                        break loop0;
                    }
                    if (!abstractC3795a0M15145b.m15130u()) {
                        break;
                    }
                    if (AbstractC5489b.m22334a(atomicReferenceFieldUpdater, this, abstractC3795a0, abstractC3795a0M15145b)) {
                        if (abstractC3795a0.m15128p()) {
                            abstractC3795a0.m15142n();
                        }
                    } else if (abstractC3795a0M15145b.m15128p()) {
                        abstractC3795a0M15145b.m15142n();
                    }
                }
            } else {
                break;
            }
        }
        if (AbstractC3797b0.m15146c(objM15125c)) {
            m9737P();
            m9714A0(j10, c2743l);
            m9704m0(this, 0L, 1, null);
            return null;
        }
        C2743l c2743l2 = (C2743l) AbstractC3797b0.m15145b(objM15125c);
        if (c2743l2.f10969c <= j10) {
            return c2743l2;
        }
        long j12 = c2743l2.f10969c;
        int i10 = AbstractC2737f.f7174b;
        if (f7152v.compareAndSet(this, j11 + 1, j12 * ((long) i10))) {
            m9772l0((c2743l2.f10969c * ((long) i10)) - j11);
        } else {
            m9704m0(this, 0L, 1, null);
        }
        return null;
    }

    /* JADX INFO: renamed from: S0 */
    public final void m9744S0(InterfaceC2109a3 interfaceC2109a3) {
        m9746T0(interfaceC2109a3, false);
    }

    /* JADX INFO: renamed from: T */
    public final C2743l m9745T(long j10, C2743l c2743l) {
        Object objM15125c;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7155y;
        InterfaceC0188p interfaceC0188p = (InterfaceC0188p) AbstractC2737f.m9828y();
        loop0: while (true) {
            objM15125c = AbstractC3794a.m15125c(c2743l, j10, interfaceC0188p);
            if (!AbstractC3797b0.m15146c(objM15125c)) {
                AbstractC3795a0 abstractC3795a0M15145b = AbstractC3797b0.m15145b(objM15125c);
                while (true) {
                    AbstractC3795a0 abstractC3795a0 = (AbstractC3795a0) atomicReferenceFieldUpdater.get(this);
                    if (abstractC3795a0.f10969c >= abstractC3795a0M15145b.f10969c) {
                        break loop0;
                    }
                    if (!abstractC3795a0M15145b.m15130u()) {
                        break;
                    }
                    if (AbstractC5489b.m22334a(atomicReferenceFieldUpdater, this, abstractC3795a0, abstractC3795a0M15145b)) {
                        if (abstractC3795a0.m15128p()) {
                            abstractC3795a0.m15142n();
                        }
                    } else if (abstractC3795a0M15145b.m15128p()) {
                        abstractC3795a0M15145b.m15142n();
                    }
                }
            } else {
                break;
            }
        }
        if (AbstractC3797b0.m15146c(objM15125c)) {
            m9737P();
            if (c2743l.f10969c * ((long) AbstractC2737f.f7174b) < m9769i0()) {
                c2743l.m15134c();
            }
            return null;
        }
        C2743l c2743l2 = (C2743l) AbstractC3797b0.m15145b(objM15125c);
        if (!m9785v0() && j10 <= m9749W() / ((long) AbstractC2737f.f7174b)) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f7156z;
            while (true) {
                AbstractC3795a0 abstractC3795a02 = (AbstractC3795a0) atomicReferenceFieldUpdater2.get(this);
                if (abstractC3795a02.f10969c >= c2743l2.f10969c || !c2743l2.m15130u()) {
                    break;
                }
                if (AbstractC5489b.m22334a(atomicReferenceFieldUpdater2, this, abstractC3795a02, c2743l2)) {
                    if (abstractC3795a02.m15128p()) {
                        abstractC3795a02.m15142n();
                    }
                } else if (c2743l2.m15128p()) {
                    c2743l2.m15142n();
                }
            }
        }
        long j11 = c2743l2.f10969c;
        if (j11 <= j10) {
            return c2743l2;
        }
        int i10 = AbstractC2737f.f7174b;
        m9766g1(j11 * ((long) i10));
        if (c2743l2.f10969c * ((long) i10) < m9769i0()) {
            c2743l2.m15134c();
        }
        return null;
    }

    /* JADX INFO: renamed from: T0 */
    public final void m9746T0(InterfaceC2109a3 interfaceC2109a3, boolean z10) {
        if (interfaceC2109a3 instanceof InterfaceC2156m) {
            InterfaceC5976f interfaceC5976f = (InterfaceC5976f) interfaceC2109a3;
            C4712s.a aVar = C4712s.f13928r;
            interfaceC5976f.resumeWith(C4712s.m18798b(AbstractC4713t.m18807a(z10 ? m9758b0() : m9764f0())));
        } else if (interfaceC2109a3 instanceof C2752u) {
            C2164o c2164o = ((C2752u) interfaceC2109a3).f7205q;
            C4712s.a aVar2 = C4712s.f13928r;
            c2164o.resumeWith(C4712s.m18798b(C2742k.m9836b(C2742k.f7197b.m9846a(m9752Y()))));
        } else if (interfaceC2109a3 instanceof a) {
            ((a) interfaceC2109a3).m9798j();
        } else {
            C8897d.m34134a("Unexpected waiter: ", interfaceC2109a3);
        }
    }

    /* JADX INFO: renamed from: U */
    public final C2743l m9747U(long j10, C2743l c2743l) {
        Object objM15125c;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7154x;
        InterfaceC0188p interfaceC0188p = (InterfaceC0188p) AbstractC2737f.m9828y();
        loop0: while (true) {
            objM15125c = AbstractC3794a.m15125c(c2743l, j10, interfaceC0188p);
            if (!AbstractC3797b0.m15146c(objM15125c)) {
                AbstractC3795a0 abstractC3795a0M15145b = AbstractC3797b0.m15145b(objM15125c);
                while (true) {
                    AbstractC3795a0 abstractC3795a0 = (AbstractC3795a0) atomicReferenceFieldUpdater.get(this);
                    if (abstractC3795a0.f10969c >= abstractC3795a0M15145b.f10969c) {
                        break loop0;
                    }
                    if (!abstractC3795a0M15145b.m15130u()) {
                        break;
                    }
                    if (AbstractC5489b.m22334a(atomicReferenceFieldUpdater, this, abstractC3795a0, abstractC3795a0M15145b)) {
                        if (abstractC3795a0.m15128p()) {
                            abstractC3795a0.m15142n();
                        }
                    } else if (abstractC3795a0M15145b.m15128p()) {
                        abstractC3795a0M15145b.m15142n();
                    }
                }
            } else {
                break;
            }
        }
        if (AbstractC3797b0.m15146c(objM15125c)) {
            m9737P();
            if (c2743l.f10969c * ((long) AbstractC2737f.f7174b) < m9762e0()) {
                c2743l.m15134c();
            }
            return null;
        }
        C2743l c2743l2 = (C2743l) AbstractC3797b0.m15145b(objM15125c);
        long j11 = c2743l2.f10969c;
        if (j11 <= j10) {
            return c2743l2;
        }
        int i10 = AbstractC2737f.f7174b;
        m9767h1(j11 * ((long) i10));
        if (c2743l2.f10969c * ((long) i10) < m9762e0()) {
            c2743l2.m15134c();
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00fd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00fe  */
    /* JADX INFO: renamed from: V0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m9748V0(p099gc.C2743l r17, int r18, java.lang.Object r19, long r20, p228p8.InterfaceC5976f r22) {
        /*
            Method dump skipped, instruction units count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p099gc.C2736e.m9748V0(gc.l, int, java.lang.Object, long, p8.f):java.lang.Object");
    }

    /* JADX INFO: renamed from: W */
    public final long m9749W() {
        return f7152v.get(this);
    }

    /* JADX INFO: renamed from: W0 */
    public final boolean m9750W0(long j10) {
        if (m9783t0(j10)) {
            return false;
        }
        return !m9725I(j10 & 1152921504606846975L);
    }

    /* JADX INFO: renamed from: X0 */
    public final boolean m9751X0(Object obj, Object obj2) {
        if (obj instanceof C2752u) {
            C2164o c2164o = ((C2752u) obj).f7205q;
            C2742k c2742kM9836b = C2742k.m9836b(C2742k.f7197b.m9848c(obj2));
            InterfaceC0184l interfaceC0184l = this.f7158r;
            return AbstractC2737f.m9802B(c2164o, c2742kM9836b, (InterfaceC0189q) (interfaceC0184l != null ? m9723H(interfaceC0184l) : null));
        }
        if (obj instanceof a) {
            return ((a) obj).m9797i(obj2);
        }
        if (!(obj instanceof InterfaceC2156m)) {
            C8897d.m34134a("Unexpected receiver type: ", obj);
            return false;
        }
        InterfaceC2156m interfaceC2156m = (InterfaceC2156m) obj;
        InterfaceC0184l interfaceC0184l2 = this.f7158r;
        return AbstractC2737f.m9802B(interfaceC2156m, obj2, (InterfaceC0189q) (interfaceC0184l2 != null ? m9721G(interfaceC0184l2) : null));
    }

    /* JADX INFO: renamed from: Y */
    public final Throwable m9752Y() {
        return (Throwable) f7148A.get(this);
    }

    /* JADX INFO: renamed from: Y0 */
    public final boolean m9753Y0(Object obj, C2743l c2743l, int i10) {
        if (obj instanceof InterfaceC2156m) {
            return AbstractC2737f.m9803C((InterfaceC2156m) obj, C4700i0.f13910a, null, 2, null);
        }
        C8897d.m34134a("Unexpected waiter: ", obj);
        return false;
    }

    /* JADX INFO: renamed from: Z0 */
    public final Object m9754Z0(Object obj) {
        C2743l c2743lM9747U;
        int i10;
        C2736e c2736e;
        Object obj2 = AbstractC2737f.f7176d;
        C2743l c2743l = (C2743l) m9696g0().get(this);
        while (true) {
            long andIncrement = m9698h0().getAndIncrement(this);
            long j10 = andIncrement & 1152921504606846975L;
            boolean zM9783t0 = m9783t0(andIncrement);
            int i11 = AbstractC2737f.f7174b;
            long j11 = j10 / ((long) i11);
            int i12 = (int) (j10 % ((long) i11));
            if (c2743l.f10969c != j11) {
                c2743lM9747U = m9747U(j11, c2743l);
                if (c2743lM9747U != null) {
                    c2736e = this;
                    i10 = i12;
                } else if (zM9783t0) {
                    return C2742k.f7197b.m9846a(m9764f0());
                }
            } else {
                c2743lM9747U = c2743l;
                i10 = i12;
                c2736e = this;
            }
            Object obj3 = obj;
            int iM9763e1 = c2736e.m9763e1(c2743lM9747U, i10, obj3, j10, obj2, zM9783t0);
            c2743l = c2743lM9747U;
            if (iM9763e1 == 0) {
                c2743l.m15134c();
                return C2742k.f7197b.m9848c(C4700i0.f13910a);
            }
            if (iM9763e1 == 1) {
                return C2742k.f7197b.m9848c(C4700i0.f13910a);
            }
            if (iM9763e1 == 2) {
                if (zM9783t0) {
                    c2743l.m15129t();
                    return C2742k.f7197b.m9846a(m9764f0());
                }
                InterfaceC2109a3 interfaceC2109a3 = obj2 instanceof InterfaceC2109a3 ? (InterfaceC2109a3) obj2 : null;
                if (interfaceC2109a3 != null) {
                    m9732L0(interfaceC2109a3, c2743l, i10);
                }
                m9739Q((c2743l.f10969c * ((long) i11)) + ((long) i10));
                return C2742k.f7197b.m9848c(C4700i0.f13910a);
            }
            if (iM9763e1 == 3) {
                C10010p0.m38820a("unexpected");
                return null;
            }
            if (iM9763e1 == 4) {
                if (j10 < m9762e0()) {
                    c2743l.m15134c();
                }
                return C2742k.f7197b.m9846a(m9764f0());
            }
            if (iM9763e1 == 5) {
                c2743l.m15134c();
            }
            obj = obj3;
        }
    }

    @Override // p099gc.InterfaceC2753v
    /* JADX INFO: renamed from: a */
    public Object mo9755a() {
        C2743l c2743lM9745T;
        long j10 = f7151u.get(this);
        long j11 = f7150t.get(this);
        if (m9780r0(j11)) {
            return C2742k.f7197b.m9846a(m9752Y());
        }
        if (j10 >= (j11 & 1152921504606846975L)) {
            return C2742k.f7197b.m9847b();
        }
        Object obj = AbstractC2737f.f7183k;
        C2743l c2743l = (C2743l) m9690c0().get(this);
        while (!m9778q0()) {
            long andIncrement = m9692d0().getAndIncrement(this);
            int i10 = AbstractC2737f.f7174b;
            long j12 = andIncrement / ((long) i10);
            int i11 = (int) (andIncrement % ((long) i10));
            if (c2743l.f10969c != j12) {
                c2743lM9745T = m9745T(j12, c2743l);
                if (c2743lM9745T == null) {
                    continue;
                }
            } else {
                c2743lM9745T = c2743l;
            }
            Object objM9760c1 = m9760c1(c2743lM9745T, i11, andIncrement, obj);
            if (objM9760c1 == AbstractC2737f.f7185m) {
                InterfaceC2109a3 interfaceC2109a3 = obj instanceof InterfaceC2109a3 ? (InterfaceC2109a3) obj : null;
                if (interfaceC2109a3 != null) {
                    m9730K0(interfaceC2109a3, c2743lM9745T, i11);
                }
                m9770i1(andIncrement);
                c2743lM9745T.m15129t();
                return C2742k.f7197b.m9847b();
            }
            if (objM9760c1 != AbstractC2737f.f7187o) {
                if (objM9760c1 != AbstractC2737f.f7186n) {
                    c2743lM9745T.m15134c();
                    return C2742k.f7197b.m9848c(objM9760c1);
                }
                C10010p0.m38820a("unexpected");
                return null;
            }
            if (andIncrement < m9769i0()) {
                c2743lM9745T.m15134c();
            }
            c2743l = c2743lM9745T;
        }
        return C2742k.f7197b.m9846a(m9752Y());
    }

    /* JADX INFO: renamed from: a1 */
    public final boolean m9756a1(C2743l c2743l, int i10, long j10) {
        Object objM9850B = c2743l.m9850B(i10);
        if (!(objM9850B instanceof InterfaceC2109a3) || j10 < f7151u.get(this) || !c2743l.m9858v(i10, objM9850B, AbstractC2737f.f7179g)) {
            return m9759b1(c2743l, i10, j10);
        }
        if (m9753Y0(objM9850B, c2743l, i10)) {
            c2743l.m9854F(i10, AbstractC2737f.f7176d);
            return true;
        }
        c2743l.m9854F(i10, AbstractC2737f.f7182j);
        c2743l.m9851C(i10, false);
        return false;
    }

    @Override // p099gc.InterfaceC2753v
    /* JADX INFO: renamed from: b */
    public Object mo9757b(InterfaceC5976f interfaceC5976f) {
        return m9682M0(this, interfaceC5976f);
    }

    /* JADX INFO: renamed from: b0 */
    public final Throwable m9758b0() {
        Throwable thM9752Y = m9752Y();
        return thM9752Y == null ? new C2746o("Channel was closed") : thM9752Y;
    }

    /* JADX INFO: renamed from: b1 */
    public final boolean m9759b1(C2743l c2743l, int i10, long j10) {
        while (true) {
            Object objM9850B = c2743l.m9850B(i10);
            if (objM9850B instanceof InterfaceC2109a3) {
                if (j10 < f7151u.get(this)) {
                    if (c2743l.m9858v(i10, objM9850B, new C2755x((InterfaceC2109a3) objM9850B))) {
                        return true;
                    }
                } else if (c2743l.m9858v(i10, objM9850B, AbstractC2737f.f7179g)) {
                    if (m9753Y0(objM9850B, c2743l, i10)) {
                        c2743l.m9854F(i10, AbstractC2737f.f7176d);
                        return true;
                    }
                    c2743l.m9854F(i10, AbstractC2737f.f7182j);
                    c2743l.m9851C(i10, false);
                    return false;
                }
            } else {
                if (objM9850B == AbstractC2737f.f7182j) {
                    return false;
                }
                if (objM9850B == null) {
                    if (c2743l.m9858v(i10, objM9850B, AbstractC2737f.f7177e)) {
                        return true;
                    }
                } else {
                    if (objM9850B == AbstractC2737f.f7176d || objM9850B == AbstractC2737f.f7180h || objM9850B == AbstractC2737f.f7181i || objM9850B == AbstractC2737f.f7183k || objM9850B == AbstractC2737f.m9829z()) {
                        return true;
                    }
                    if (objM9850B != AbstractC2737f.f7178f) {
                        C8897d.m34134a("Unexpected cell state: ", objM9850B);
                        return false;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: c1 */
    public final Object m9760c1(C2743l c2743l, int i10, long j10, Object obj) {
        Object objM9850B = c2743l.m9850B(i10);
        if (objM9850B == null) {
            if (j10 >= (f7150t.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return AbstractC2737f.f7186n;
                }
                if (c2743l.m9858v(i10, objM9850B, obj)) {
                    m9741R();
                    return AbstractC2737f.f7185m;
                }
            }
        } else if (objM9850B == AbstractC2737f.f7176d && c2743l.m9858v(i10, objM9850B, AbstractC2737f.f7181i)) {
            m9741R();
            return c2743l.m9852D(i10);
        }
        return m9761d1(c2743l, i10, j10, obj);
    }

    /* JADX INFO: renamed from: d1 */
    public final Object m9761d1(C2743l c2743l, int i10, long j10, Object obj) {
        while (true) {
            Object objM9850B = c2743l.m9850B(i10);
            if (objM9850B == null || objM9850B == AbstractC2737f.f7177e) {
                if (j10 < (f7150t.get(this) & 1152921504606846975L)) {
                    if (c2743l.m9858v(i10, objM9850B, AbstractC2737f.f7180h)) {
                        m9741R();
                        return AbstractC2737f.f7187o;
                    }
                } else {
                    if (obj == null) {
                        return AbstractC2737f.f7186n;
                    }
                    if (c2743l.m9858v(i10, objM9850B, obj)) {
                        m9741R();
                        return AbstractC2737f.f7185m;
                    }
                }
            } else {
                if (objM9850B != AbstractC2737f.f7176d) {
                    if (objM9850B != AbstractC2737f.f7182j && objM9850B != AbstractC2737f.f7180h) {
                        if (objM9850B == AbstractC2737f.m9829z()) {
                            m9741R();
                            return AbstractC2737f.f7187o;
                        }
                        if (objM9850B != AbstractC2737f.f7179g && c2743l.m9858v(i10, objM9850B, AbstractC2737f.f7178f)) {
                            boolean z10 = objM9850B instanceof C2755x;
                            if (z10) {
                                objM9850B = ((C2755x) objM9850B).f7206a;
                            }
                            if (m9753Y0(objM9850B, c2743l, i10)) {
                                c2743l.m9854F(i10, AbstractC2737f.f7181i);
                                m9741R();
                                return c2743l.m9852D(i10);
                            }
                            c2743l.m9854F(i10, AbstractC2737f.f7182j);
                            c2743l.m9851C(i10, false);
                            if (z10) {
                                m9741R();
                            }
                            return AbstractC2737f.f7187o;
                        }
                    }
                    return AbstractC2737f.f7187o;
                }
                if (c2743l.m9858v(i10, objM9850B, AbstractC2737f.f7181i)) {
                    m9741R();
                    return c2743l.m9852D(i10);
                }
            }
        }
    }

    /* JADX INFO: renamed from: e0 */
    public final long m9762e0() {
        return f7151u.get(this);
    }

    /* JADX INFO: renamed from: e1 */
    public final int m9763e1(C2743l c2743l, int i10, Object obj, long j10, Object obj2, boolean z10) {
        c2743l.m9855G(i10, obj);
        if (z10) {
            return m9765f1(c2743l, i10, obj, j10, obj2, z10);
        }
        Object objM9850B = c2743l.m9850B(i10);
        if (objM9850B == null) {
            if (m9725I(j10)) {
                if (c2743l.m9858v(i10, null, AbstractC2737f.f7176d)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (c2743l.m9858v(i10, null, obj2)) {
                    return 2;
                }
            }
        } else if (objM9850B instanceof InterfaceC2109a3) {
            c2743l.m9859w(i10);
            if (m9751X0(objM9850B, obj)) {
                c2743l.m9854F(i10, AbstractC2737f.f7181i);
                m9726I0();
                return 0;
            }
            if (c2743l.m9860x(i10, AbstractC2737f.f7183k) == AbstractC2737f.f7183k) {
                return 5;
            }
            c2743l.m9851C(i10, true);
            return 5;
        }
        return m9765f1(c2743l, i10, obj, j10, obj2, z10);
    }

    /* JADX INFO: renamed from: f0 */
    public final Throwable m9764f0() {
        Throwable thM9752Y = m9752Y();
        return thM9752Y == null ? new C2747p("Channel was closed") : thM9752Y;
    }

    /* JADX INFO: renamed from: f1 */
    public final int m9765f1(C2743l c2743l, int i10, Object obj, long j10, Object obj2, boolean z10) {
        while (true) {
            Object objM9850B = c2743l.m9850B(i10);
            if (objM9850B == null) {
                if (!m9725I(j10) || z10) {
                    if (z10) {
                        if (c2743l.m9858v(i10, null, AbstractC2737f.f7182j)) {
                            c2743l.m9851C(i10, false);
                            return 4;
                        }
                    } else {
                        if (obj2 == null) {
                            return 3;
                        }
                        if (c2743l.m9858v(i10, null, obj2)) {
                            return 2;
                        }
                    }
                } else if (c2743l.m9858v(i10, null, AbstractC2737f.f7176d)) {
                    return 1;
                }
            } else {
                if (objM9850B != AbstractC2737f.f7177e) {
                    if (objM9850B == AbstractC2737f.f7183k) {
                        c2743l.m9859w(i10);
                        return 5;
                    }
                    if (objM9850B == AbstractC2737f.f7180h) {
                        c2743l.m9859w(i10);
                        return 5;
                    }
                    if (objM9850B == AbstractC2737f.m9829z()) {
                        c2743l.m9859w(i10);
                        m9737P();
                        return 4;
                    }
                    c2743l.m9859w(i10);
                    if (objM9850B instanceof C2755x) {
                        objM9850B = ((C2755x) objM9850B).f7206a;
                    }
                    if (m9751X0(objM9850B, obj)) {
                        c2743l.m9854F(i10, AbstractC2737f.f7181i);
                        m9726I0();
                        return 0;
                    }
                    if (c2743l.m9860x(i10, AbstractC2737f.f7183k) != AbstractC2737f.f7183k) {
                        c2743l.m9851C(i10, true);
                    }
                    return 5;
                }
                if (c2743l.m9858v(i10, objM9850B, AbstractC2737f.f7176d)) {
                    return 1;
                }
            }
        }
    }

    /* JADX INFO: renamed from: g1 */
    public final void m9766g1(long j10) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f7151u;
        while (true) {
            long j11 = atomicLongFieldUpdater.get(this);
            if (j11 >= j10) {
                return;
            }
            long j12 = j10;
            if (f7151u.compareAndSet(this, j11, j12)) {
                return;
            } else {
                j10 = j12;
            }
        }
    }

    /* JADX INFO: renamed from: h1 */
    public final void m9767h1(long j10) {
        long j11;
        long j12;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f7150t;
        do {
            j11 = atomicLongFieldUpdater.get(this);
            j12 = 1152921504606846975L & j11;
            if (j12 >= j10) {
                return;
            }
        } while (!f7150t.compareAndSet(this, j11, AbstractC2737f.m9826w(j12, (int) (j11 >> 60))));
    }

    @Override // p099gc.InterfaceC2754w
    /* JADX INFO: renamed from: i */
    public Object mo9768i(Object obj, InterfaceC5976f interfaceC5976f) {
        return m9684U0(this, obj, interfaceC5976f);
    }

    /* JADX INFO: renamed from: i0 */
    public final long m9769i0() {
        return f7150t.get(this) & 1152921504606846975L;
    }

    /* JADX INFO: renamed from: i1 */
    public final void m9770i1(long j10) {
        C2736e c2736e = this;
        if (c2736e.m9785v0()) {
            return;
        }
        while (c2736e.m9749W() <= j10) {
            c2736e = this;
        }
        int i10 = AbstractC2737f.f7175c;
        for (int i11 = 0; i11 < i10; i11++) {
            long jM9749W = c2736e.m9749W();
            if (jM9749W == (4611686018427387903L & f7153w.get(c2736e)) && jM9749W == c2736e.m9749W()) {
                return;
            }
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater = f7153w;
        while (true) {
            long j11 = atomicLongFieldUpdater.get(c2736e);
            if (atomicLongFieldUpdater.compareAndSet(c2736e, j11, AbstractC2737f.m9825v(j11 & 4611686018427387903L, true))) {
                break;
            } else {
                c2736e = this;
            }
        }
        while (true) {
            long jM9749W2 = c2736e.m9749W();
            long j12 = f7153w.get(c2736e);
            long j13 = j12 & 4611686018427387903L;
            boolean z10 = (FieldInfo.RECORD & j12) != 0;
            if (jM9749W2 == j13 && jM9749W2 == c2736e.m9749W()) {
                break;
            }
            if (z10) {
                c2736e = this;
            } else {
                c2736e = this;
                f7153w.compareAndSet(c2736e, j12, AbstractC2737f.m9825v(j13, true));
            }
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater2 = f7153w;
        while (true) {
            long j14 = atomicLongFieldUpdater2.get(c2736e);
            boolean zCompareAndSet = atomicLongFieldUpdater2.compareAndSet(c2736e, j14, AbstractC2737f.m9825v(j14 & 4611686018427387903L, false));
            AtomicLongFieldUpdater atomicLongFieldUpdater3 = atomicLongFieldUpdater2;
            if (zCompareAndSet) {
                return;
            }
            atomicLongFieldUpdater2 = atomicLongFieldUpdater3;
            c2736e = this;
        }
    }

    @Override // p099gc.InterfaceC2753v
    public InterfaceC2740i iterator() {
        return new a();
    }

    /* JADX INFO: renamed from: k0 */
    public final boolean m9771k0() {
        while (true) {
            C2743l c2743lM9745T = (C2743l) f7155y.get(this);
            long jM9762e0 = m9762e0();
            if (m9769i0() <= jM9762e0) {
                return false;
            }
            int i10 = AbstractC2737f.f7174b;
            long j10 = jM9762e0 / ((long) i10);
            if (c2743lM9745T.f10969c == j10 || (c2743lM9745T = m9745T(j10, c2743lM9745T)) != null) {
                c2743lM9745T.m15134c();
                if (m9775o0(c2743lM9745T, (int) (jM9762e0 % ((long) i10)), jM9762e0)) {
                    return true;
                }
                f7151u.compareAndSet(this, jM9762e0, 1 + jM9762e0);
            } else if (((C2743l) f7155y.get(this)).f10969c < j10) {
                return false;
            }
        }
    }

    /* JADX INFO: renamed from: l0 */
    public final void m9772l0(long j10) {
        if ((f7153w.addAndGet(this, j10) & FieldInfo.RECORD) != 0) {
            while ((f7153w.get(this) & FieldInfo.RECORD) != 0) {
            }
        }
    }

    @Override // p099gc.InterfaceC2753v
    /* JADX INFO: renamed from: n */
    public final void mo9773n(CancellationException cancellationException) {
        m9727J(cancellationException);
    }

    /* JADX INFO: renamed from: n0 */
    public final void m9774n0() {
        Object obj;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7149B;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
        } while (!AbstractC5489b.m22334a(atomicReferenceFieldUpdater, this, obj, obj == null ? AbstractC2737f.f7189q : AbstractC2737f.f7190r));
        if (obj == null) {
            return;
        }
        ((InterfaceC0184l) obj).mo27m(m9752Y());
    }

    /* JADX INFO: renamed from: o0 */
    public final boolean m9775o0(C2743l c2743l, int i10, long j10) {
        Object objM9850B;
        do {
            objM9850B = c2743l.m9850B(i10);
            if (objM9850B != null && objM9850B != AbstractC2737f.f7177e) {
                if (objM9850B == AbstractC2737f.f7176d) {
                    return true;
                }
                if (objM9850B == AbstractC2737f.f7182j || objM9850B == AbstractC2737f.m9829z() || objM9850B == AbstractC2737f.f7181i || objM9850B == AbstractC2737f.f7180h) {
                    return false;
                }
                if (objM9850B == AbstractC2737f.f7179g) {
                    return true;
                }
                return objM9850B != AbstractC2737f.f7178f && j10 == m9762e0();
            }
        } while (!c2743l.m9858v(i10, objM9850B, AbstractC2737f.f7180h));
        m9741R();
        return false;
    }

    @Override // p099gc.InterfaceC2754w
    /* JADX INFO: renamed from: p */
    public boolean mo9776p(Throwable th) {
        return m9733M(th, false);
    }

    /* JADX INFO: renamed from: p0 */
    public final boolean m9777p0(long j10, boolean z10) throws IllegalAccessException, InvocationTargetException {
        int i10 = (int) (j10 >> 60);
        if (i10 == 0 || i10 == 1) {
            return false;
        }
        if (i10 == 2) {
            m9735O(j10 & 1152921504606846975L);
            return (z10 && m9771k0()) ? false : true;
        }
        if (i10 == 3) {
            m9734N(j10 & 1152921504606846975L);
            return true;
        }
        C5793k.m23285a("unexpected close status: ", i10);
        return false;
    }

    /* JADX INFO: renamed from: q0 */
    public boolean m9778q0() {
        return m9780r0(f7150t.get(this));
    }

    @Override // p099gc.InterfaceC2753v
    /* JADX INFO: renamed from: r */
    public Object mo9779r(InterfaceC5976f interfaceC5976f) {
        return m9683N0(this, interfaceC5976f);
    }

    /* JADX INFO: renamed from: r0 */
    public final boolean m9780r0(long j10) {
        return m9777p0(j10, true);
    }

    @Override // p099gc.InterfaceC2754w
    /* JADX INFO: renamed from: s */
    public Object mo9781s(Object obj) {
        Object obj2;
        int i10;
        C2743l c2743l;
        C2736e c2736e;
        if (m9750W0(f7150t.get(this))) {
            return C2742k.f7197b.m9847b();
        }
        Object obj3 = AbstractC2737f.f7182j;
        C2743l c2743l2 = (C2743l) m9696g0().get(this);
        while (true) {
            long andIncrement = m9698h0().getAndIncrement(this);
            long j10 = andIncrement & 1152921504606846975L;
            boolean zM9783t0 = m9783t0(andIncrement);
            int i11 = AbstractC2737f.f7174b;
            long j11 = j10 / ((long) i11);
            int i12 = (int) (j10 % ((long) i11));
            if (c2743l2.f10969c != j11) {
                C2743l c2743lM9747U = m9747U(j11, c2743l2);
                if (c2743lM9747U != null) {
                    i10 = i12;
                    c2743l = c2743lM9747U;
                    c2736e = this;
                    obj2 = obj;
                } else if (zM9783t0) {
                    return C2742k.f7197b.m9846a(m9764f0());
                }
            } else {
                obj2 = obj;
                i10 = i12;
                c2743l = c2743l2;
                c2736e = this;
            }
            int iM9763e1 = c2736e.m9763e1(c2743l, i10, obj2, j10, obj3, zM9783t0);
            c2743l2 = c2743l;
            if (iM9763e1 == 0) {
                c2743l2.m15134c();
                return C2742k.f7197b.m9848c(C4700i0.f13910a);
            }
            if (iM9763e1 == 1) {
                return C2742k.f7197b.m9848c(C4700i0.f13910a);
            }
            if (iM9763e1 == 2) {
                if (zM9783t0) {
                    c2743l2.m15129t();
                    return C2742k.f7197b.m9846a(m9764f0());
                }
                InterfaceC2109a3 interfaceC2109a3 = obj3 instanceof InterfaceC2109a3 ? (InterfaceC2109a3) obj3 : null;
                if (interfaceC2109a3 != null) {
                    m9732L0(interfaceC2109a3, c2743l2, i10);
                }
                c2743l2.m15129t();
                return C2742k.f7197b.m9847b();
            }
            if (iM9763e1 == 3) {
                C10010p0.m38820a("unexpected");
                return null;
            }
            if (iM9763e1 == 4) {
                if (j10 < m9762e0()) {
                    c2743l2.m15134c();
                }
                return C2742k.f7197b.m9846a(m9764f0());
            }
            if (iM9763e1 == 5) {
                c2743l2.m15134c();
            }
            obj = obj2;
        }
    }

    /* JADX INFO: renamed from: s0 */
    public boolean m9782s0() {
        return m9783t0(f7150t.get(this));
    }

    /* JADX INFO: renamed from: t0 */
    public final boolean m9783t0(long j10) {
        return m9777p0(j10, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x01b2, code lost:
    
        r16 = r7;
        r3 = (p099gc.C2743l) r3.m15137f();
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01bb, code lost:
    
        if (r3 != null) goto L82;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String toString() {
        /*
            Method dump skipped, instruction units count: 484
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p099gc.C2736e.toString():java.lang.String");
    }

    /* JADX INFO: renamed from: u0 */
    public boolean mo9784u0() {
        return false;
    }

    /* JADX INFO: renamed from: v0 */
    public final boolean m9785v0() {
        long jM9749W = m9749W();
        return jM9749W == 0 || jM9749W == Long.MAX_VALUE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x003c, code lost:
    
        r8 = (p099gc.C2743l) r8.m15139h();
     */
    /* JADX INFO: renamed from: w0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long m9786w0(p099gc.C2743l r8) {
        /*
            r7 = this;
        L0:
            int r0 = p099gc.AbstractC2737f.f7174b
            int r0 = r0 + (-1)
        L4:
            r1 = -1
            r3 = -1
            if (r3 >= r0) goto L3c
            long r3 = r8.f10969c
            int r5 = p099gc.AbstractC2737f.f7174b
            long r5 = (long) r5
            long r3 = r3 * r5
            long r5 = (long) r0
            long r3 = r3 + r5
            long r5 = r7.m9762e0()
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 >= 0) goto L1a
            return r1
        L1a:
            java.lang.Object r1 = r8.m9850B(r0)
            if (r1 == 0) goto L2c
            jc.d0 r2 = p099gc.AbstractC2737f.m9814k()
            if (r1 != r2) goto L27
            goto L2c
        L27:
            jc.d0 r2 = p099gc.AbstractC2737f.f7176d
            if (r1 != r2) goto L39
            return r3
        L2c:
            jc.d0 r2 = p099gc.AbstractC2737f.m9829z()
            boolean r1 = r8.m9858v(r0, r1, r2)
            if (r1 == 0) goto L1a
            r8.m15129t()
        L39:
            int r0 = r0 + (-1)
            goto L4
        L3c:
            jc.b r8 = r8.m15139h()
            gc.l r8 = (p099gc.C2743l) r8
            if (r8 != 0) goto L0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p099gc.C2736e.m9786w0(gc.l):long");
    }

    /* JADX INFO: renamed from: x0 */
    public final void m9787x0() {
        long j10;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f7150t;
        do {
            j10 = atomicLongFieldUpdater.get(this);
            if (((int) (j10 >> 60)) != 0) {
                return;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j10, AbstractC2737f.m9826w(1152921504606846975L & j10, 1)));
    }

    /* JADX INFO: renamed from: y0 */
    public final void m9788y0() {
        long j10;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f7150t;
        do {
            j10 = atomicLongFieldUpdater.get(this);
        } while (!atomicLongFieldUpdater.compareAndSet(this, j10, AbstractC2737f.m9826w(1152921504606846975L & j10, 3)));
    }

    /* JADX INFO: renamed from: z0 */
    public final void m9789z0() {
        long j10;
        long jM9826w;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f7150t;
        do {
            j10 = atomicLongFieldUpdater.get(this);
            int i10 = (int) (j10 >> 60);
            if (i10 == 0) {
                jM9826w = AbstractC2737f.m9826w(1152921504606846975L & j10, 2);
            } else if (i10 != 1) {
                return;
            } else {
                jM9826w = AbstractC2737f.m9826w(1152921504606846975L & j10, 3);
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j10, jM9826w));
    }

    /* JADX INFO: renamed from: D0 */
    public void m9717D0() {
    }

    /* JADX INFO: renamed from: I0 */
    public void m9726I0() {
    }

    /* JADX INFO: renamed from: J0 */
    public void m9728J0() {
    }
}
