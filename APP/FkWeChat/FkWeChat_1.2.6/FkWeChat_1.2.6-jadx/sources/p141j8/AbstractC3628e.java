package p141j8;

import ec.AbstractC2204y;
import ec.InterfaceC2196w;
import java.util.concurrent.atomic.AtomicBoolean;
import p010a9.InterfaceC0173a;
import p010a9.InterfaceC0184l;
import p010a9.InterfaceC0188p;
import p157k8.InterfaceC4107m1;
import p172l8.AbstractC4713t;
import p172l8.C4700i0;
import p172l8.C4712s;
import p215oc.C5729x;
import p228p8.InterfaceC5976f;
import p242q8.AbstractC6325c;
import p257r8.AbstractC6544m;
import p376zd.C10010p0;

/* JADX INFO: renamed from: j8.e */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3628e implements InterfaceC3625c0 {

    /* JADX INFO: renamed from: a */
    public final AtomicBoolean f10080a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b */
    public InterfaceC0173a f10081b = new InterfaceC0173a() { // from class: j8.c
        @Override // p010a9.InterfaceC0173a
        public final Object invoke() {
            return AbstractC3628e.m13557j();
        }
    };

    /* JADX INFO: renamed from: c */
    public InterfaceC0184l f10082c = new InterfaceC0184l() { // from class: j8.d
        @Override // p010a9.InterfaceC0184l
        /* JADX INFO: renamed from: m */
        public final Object mo27m(Object obj) {
            return AbstractC3628e.m13556i((Throwable) obj);
        }
    };

    /* JADX INFO: renamed from: d */
    public final InterfaceC2196w f10083d = AbstractC2204y.m7936c(null, 1, null);

    /* JADX INFO: renamed from: e */
    public InterfaceC0188p f10084e = new a(null);

    /* JADX INFO: renamed from: j8.e$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends AbstractC6544m implements InterfaceC0188p {

        /* JADX INFO: renamed from: q */
        public int f10085q;

        /* JADX INFO: renamed from: r */
        public /* synthetic */ Object f10086r;

        public a(InterfaceC5976f interfaceC5976f) {
            super(2, interfaceC5976f);
        }

        @Override // p257r8.AbstractC6532a
        public final InterfaceC5976f create(Object obj, InterfaceC5976f interfaceC5976f) {
            a aVar = AbstractC3628e.this.new a(interfaceC5976f);
            aVar.f10086r = obj;
            return aVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0043, code lost:
        
            if (r6.invoke(r0, r5) == r1) goto L15;
         */
        @Override // p257r8.AbstractC6532a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) throws java.lang.Throwable {
            /*
                r5 = this;
                java.lang.Object r0 = r5.f10086r
                k8.m1 r0 = (p157k8.InterfaceC4107m1) r0
                java.lang.Object r1 = p242q8.AbstractC6325c.m24992g()
                int r2 = r5.f10085q
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L21
                if (r2 == r4) goto L1d
                if (r2 != r3) goto L16
                p172l8.AbstractC4713t.m18808b(r6)
                goto L46
            L16:
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                p376zd.C10010p0.m38820a(r6)
                r6 = 0
                return r6
            L1d:
                p172l8.AbstractC4713t.m18808b(r6)
                goto L35
            L21:
                p172l8.AbstractC4713t.m18808b(r6)
                j8.e r6 = p141j8.AbstractC3628e.this
                ec.w r6 = p141j8.AbstractC3628e.m13558k(r6)
                r5.f10086r = r0
                r5.f10085q = r4
                java.lang.Object r6 = r6.mo7915K(r5)
                if (r6 != r1) goto L35
                goto L45
            L35:
                j8.e r6 = p141j8.AbstractC3628e.this
                a9.p r6 = r6.m13560m()
                r5.f10086r = r0
                r5.f10085q = r3
                java.lang.Object r6 = r6.invoke(r0, r5)
                if (r6 != r1) goto L46
            L45:
                return r1
            L46:
                l8.i0 r6 = p172l8.C4700i0.f13910a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: p141j8.AbstractC3628e.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // p010a9.InterfaceC0188p
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC4107m1 interfaceC4107m1, InterfaceC5976f interfaceC5976f) {
            return ((a) create(interfaceC4107m1, interfaceC5976f)).invokeSuspend(C4700i0.f13910a);
        }
    }

    /* JADX INFO: renamed from: j8.e$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b extends AbstractC6544m implements InterfaceC0188p {

        /* JADX INFO: renamed from: q */
        public int f10088q;

        /* JADX INFO: renamed from: r */
        public /* synthetic */ Object f10089r;

        /* JADX INFO: renamed from: s */
        public final /* synthetic */ InterfaceC0188p f10090s;

        /* JADX INFO: renamed from: t */
        public final /* synthetic */ InterfaceC0188p f10091t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC0188p interfaceC0188p, InterfaceC0188p interfaceC0188p2, InterfaceC5976f interfaceC5976f) {
            super(2, interfaceC5976f);
            this.f10090s = interfaceC0188p;
            this.f10091t = interfaceC0188p2;
        }

        @Override // p257r8.AbstractC6532a
        public final InterfaceC5976f create(Object obj, InterfaceC5976f interfaceC5976f) {
            b bVar = new b(this.f10090s, this.f10091t, interfaceC5976f);
            bVar.f10089r = obj;
            return bVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x003b, code lost:
        
            if (r6.invoke(r0, r5) == r1) goto L15;
         */
        @Override // p257r8.AbstractC6532a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) throws java.lang.Throwable {
            /*
                r5 = this;
                java.lang.Object r0 = r5.f10089r
                k8.m1 r0 = (p157k8.InterfaceC4107m1) r0
                java.lang.Object r1 = p242q8.AbstractC6325c.m24992g()
                int r2 = r5.f10088q
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L21
                if (r2 == r4) goto L1d
                if (r2 != r3) goto L16
                p172l8.AbstractC4713t.m18808b(r6)
                goto L3e
            L16:
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                p376zd.C10010p0.m38820a(r6)
                r6 = 0
                return r6
            L1d:
                p172l8.AbstractC4713t.m18808b(r6)
                goto L31
            L21:
                p172l8.AbstractC4713t.m18808b(r6)
                a9.p r6 = r5.f10090s
                r5.f10089r = r0
                r5.f10088q = r4
                java.lang.Object r6 = r6.invoke(r0, r5)
                if (r6 != r1) goto L31
                goto L3d
            L31:
                a9.p r6 = r5.f10091t
                r5.f10089r = r0
                r5.f10088q = r3
                java.lang.Object r6 = r6.invoke(r0, r5)
                if (r6 != r1) goto L3e
            L3d:
                return r1
            L3e:
                l8.i0 r6 = p172l8.C4700i0.f13910a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: p141j8.AbstractC3628e.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // p010a9.InterfaceC0188p
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC4107m1 interfaceC4107m1, InterfaceC5976f interfaceC5976f) {
            return ((b) create(interfaceC4107m1, interfaceC5976f)).invokeSuspend(C4700i0.f13910a);
        }
    }

    /* JADX INFO: renamed from: j8.e$c */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class c extends AbstractC6544m implements InterfaceC0188p {

        /* JADX INFO: renamed from: q */
        public int f10092q;

        public c(InterfaceC5976f interfaceC5976f) {
            super(2, interfaceC5976f);
        }

        @Override // p257r8.AbstractC6532a
        public final InterfaceC5976f create(Object obj, InterfaceC5976f interfaceC5976f) {
            return new c(interfaceC5976f);
        }

        @Override // p257r8.AbstractC6532a
        public final Object invokeSuspend(Object obj) throws Throwable {
            AbstractC6325c.m24992g();
            if (this.f10092q == 0) {
                AbstractC4713t.m18808b(obj);
                return C4700i0.f13910a;
            }
            C10010p0.m38820a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }

        @Override // p010a9.InterfaceC0188p
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC4107m1 interfaceC4107m1, InterfaceC5976f interfaceC5976f) {
            return ((c) create(interfaceC4107m1, interfaceC5976f)).invokeSuspend(C4700i0.f13910a);
        }
    }

    /* JADX INFO: renamed from: g */
    public static C4700i0 m13554g(InterfaceC0184l interfaceC0184l, InterfaceC0184l interfaceC0184l2, Throwable th) {
        th.getClass();
        interfaceC0184l.mo27m(th);
        interfaceC0184l2.mo27m(th);
        return C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: h */
    public static C4700i0 m13555h(InterfaceC0173a interfaceC0173a, InterfaceC0173a interfaceC0173a2) {
        interfaceC0173a.invoke();
        interfaceC0173a2.invoke();
        return C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: i */
    public static C4700i0 m13556i(Throwable th) {
        th.getClass();
        return C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: j */
    public static C4700i0 m13557j() {
        return C4700i0.f13910a;
    }

    @Override // p141j8.InterfaceC3625c0
    /* JADX INFO: renamed from: b */
    public void mo13550b(final InterfaceC0184l interfaceC0184l) {
        interfaceC0184l.getClass();
        final InterfaceC0184l interfaceC0184l2 = this.f10082c;
        this.f10082c = new InterfaceC0184l() { // from class: j8.b
            @Override // p010a9.InterfaceC0184l
            /* JADX INFO: renamed from: m */
            public final Object mo27m(Object obj) {
                return AbstractC3628e.m13554g(interfaceC0184l2, interfaceC0184l, (Throwable) obj);
            }
        };
    }

    @Override // p141j8.InterfaceC3625c0
    /* JADX INFO: renamed from: d */
    public void mo13551d(InterfaceC0188p interfaceC0188p) {
        InterfaceC0188p cVar;
        interfaceC0188p.getClass();
        boolean zMo7693l = this.f10083d.mo7693l();
        if (zMo7693l) {
            cVar = this.f10084e;
        } else {
            if (zMo7693l) {
                C5729x.m23182a();
                return;
            }
            cVar = new c(null);
        }
        this.f10084e = new b(cVar, interfaceC0188p, null);
        this.f10083d.mo7918v0(C4700i0.f13910a);
    }

    @Override // p141j8.InterfaceC3625c0
    /* JADX INFO: renamed from: f */
    public void mo13552f(final InterfaceC0173a interfaceC0173a) {
        interfaceC0173a.getClass();
        final InterfaceC0173a interfaceC0173a2 = this.f10081b;
        this.f10081b = new InterfaceC0173a() { // from class: j8.a
            @Override // p010a9.InterfaceC0173a
            public final Object invoke() {
                return AbstractC3628e.m13555h(interfaceC0173a2, interfaceC0173a);
            }
        };
    }

    /* JADX INFO: renamed from: l */
    public final InterfaceC0184l m13559l() {
        return this.f10082c;
    }

    /* JADX INFO: renamed from: m */
    public final InterfaceC0188p m13560m() {
        return this.f10084e;
    }

    /* JADX INFO: renamed from: n */
    public final void m13561n() {
        if (this.f10080a.compareAndSet(false, true)) {
            try {
                C4712s.a aVar = C4712s.f13928r;
                this.f10081b.invoke();
                C4712s.m18798b(C4700i0.f13910a);
            } catch (Throwable th) {
                C4712s.a aVar2 = C4712s.f13928r;
                C4712s.m18798b(AbstractC4713t.m18807a(th));
            }
        }
    }
}
