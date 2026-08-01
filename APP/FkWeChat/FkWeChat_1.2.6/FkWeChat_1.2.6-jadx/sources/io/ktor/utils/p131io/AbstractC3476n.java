package io.ktor.utils.p131io;

import ec.AbstractC2148k;
import ec.InterfaceC2126e1;
import ec.InterfaceC2165o0;
import ec.InterfaceC2198w1;
import java.util.concurrent.CancellationException;
import p010a9.InterfaceC0184l;
import p010a9.InterfaceC0188p;
import p024b9.C1055q;
import p064e8.AbstractC2053f;
import p161kc.AbstractC4243a;
import p172l8.C4700i0;
import p228p8.C5981k;
import p228p8.InterfaceC5976f;
import p228p8.InterfaceC5980j;
import p242q8.AbstractC6325c;
import p257r8.AbstractC6535d;
import p257r8.AbstractC6544m;

/* JADX INFO: renamed from: io.ktor.utils.io.n */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3476n {

    /* JADX INFO: renamed from: a */
    public static final a f9667a = new a();

    /* JADX INFO: renamed from: io.ktor.utils.io.n$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public /* synthetic */ class b extends C1055q implements InterfaceC0184l {
        public b(Object obj) {
            super(1, obj, InterfaceC3473k.class, "flushAndClose", "flushAndClose(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // p010a9.InterfaceC0184l
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public final Object mo27m(InterfaceC5976f interfaceC5976f) {
            return ((InterfaceC3473k) this.f3190r).mo12881f(interfaceC5976f);
        }
    }

    /* JADX INFO: renamed from: io.ktor.utils.io.n$c */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class c extends AbstractC6535d {

        /* JADX INFO: renamed from: q */
        public Object f9669q;

        /* JADX INFO: renamed from: r */
        public Object f9670r;

        /* JADX INFO: renamed from: s */
        public /* synthetic */ Object f9671s;

        /* JADX INFO: renamed from: t */
        public int f9672t;

        public c(InterfaceC5976f interfaceC5976f) {
            super(interfaceC5976f);
        }

        @Override // p257r8.AbstractC6532a
        public final Object invokeSuspend(Object obj) {
            this.f9671s = obj;
            this.f9672t |= Integer.MIN_VALUE;
            return AbstractC3476n.m12983l(null, null, this);
        }
    }

    /* JADX INFO: renamed from: io.ktor.utils.io.n$d */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class d extends AbstractC6544m implements InterfaceC0188p {

        /* JADX INFO: renamed from: q */
        public Object f9673q;

        /* JADX INFO: renamed from: r */
        public int f9674r;

        /* JADX INFO: renamed from: s */
        public /* synthetic */ Object f9675s;

        /* JADX INFO: renamed from: t */
        public final /* synthetic */ InterfaceC0188p f9676t;

        /* JADX INFO: renamed from: u */
        public final /* synthetic */ C3456a f9677u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(InterfaceC0188p interfaceC0188p, C3456a c3456a, InterfaceC5976f interfaceC5976f) {
            super(2, interfaceC5976f);
            this.f9676t = interfaceC0188p;
            this.f9677u = c3456a;
        }

        @Override // p257r8.AbstractC6532a
        public final InterfaceC5976f create(Object obj, InterfaceC5976f interfaceC5976f) {
            d dVar = new d(this.f9676t, this.f9677u, interfaceC5976f);
            dVar.f9675s = obj;
            return dVar;
        }

        @Override // p010a9.InterfaceC0188p
        public final Object invoke(InterfaceC2165o0 interfaceC2165o0, InterfaceC5976f interfaceC5976f) {
            return ((d) create(interfaceC2165o0, interfaceC5976f)).invokeSuspend(C4700i0.f13910a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:31:0x009c A[Catch: all -> 0x0054, TRY_LEAVE, TryCatch #1 {all -> 0x0054, blocks: (B:21:0x0050, B:29:0x008b, B:31:0x009c, B:26:0x006b), top: B:72:0x0007 }] */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00bc  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00cb  */
        /* JADX WARN: Removed duplicated region for block: B:50:0x0103  */
        /* JADX WARN: Removed duplicated region for block: B:63:0x012b  */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1, types: [ec.w1] */
        /* JADX WARN: Type inference failed for: r1v20 */
        /* JADX WARN: Type inference failed for: r1v21 */
        /* JADX WARN: Type inference failed for: r1v9, types: [ec.w1, ec.z] */
        @Override // p257r8.AbstractC6532a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 340
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.p131io.AbstractC3476n.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: a */
    public static C4700i0 m12972a(C3456a c3456a, Throwable th) {
        if (th != null && !c3456a.m12886o()) {
            c3456a.mo8543g(th);
        }
        return C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: b */
    public static final void m12973b(InterfaceC3478p interfaceC3478p) {
        interfaceC3478p.getClass();
        InterfaceC2198w1.a.m7920a(interfaceC3478p.mo12931a(), null, 1, null);
    }

    /* JADX INFO: renamed from: c */
    public static final void m12974c(InterfaceC3473k interfaceC3473k, Throwable th) {
        interfaceC3473k.getClass();
        if (th == null) {
            m12975d(new b(interfaceC3473k));
        } else {
            interfaceC3473k.mo12968g(th);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m12975d(InterfaceC0184l interfaceC0184l) throws Throwable {
        interfaceC0184l.getClass();
        AbstractC4243a.m16721b(interfaceC0184l, f9667a);
    }

    /* JADX INFO: renamed from: e */
    public static final CancellationException m12976e(InterfaceC3478p interfaceC3478p) {
        interfaceC3478p.getClass();
        return interfaceC3478p.mo12931a().mo7669T();
    }

    /* JADX INFO: renamed from: f */
    public static final InterfaceC2126e1 m12977f(InterfaceC3478p interfaceC3478p, InterfaceC0184l interfaceC0184l) {
        interfaceC3478p.getClass();
        interfaceC0184l.getClass();
        return interfaceC3478p.mo12931a().mo7650D0(interfaceC0184l);
    }

    /* JADX INFO: renamed from: g */
    public static final boolean m12978g(InterfaceC3478p interfaceC3478p) {
        interfaceC3478p.getClass();
        return interfaceC3478p.mo12931a().isCancelled();
    }

    /* JADX INFO: renamed from: h */
    public static final boolean m12979h(InterfaceC3478p interfaceC3478p) {
        interfaceC3478p.getClass();
        return interfaceC3478p.mo12931a().mo7693l();
    }

    /* JADX INFO: renamed from: i */
    public static final Object m12980i(InterfaceC3473k interfaceC3473k, byte b10, InterfaceC5976f interfaceC5976f) {
        interfaceC3473k.mo12880d().mo23099I(b10);
        Object objM12970b = AbstractC3474l.m12970b(interfaceC3473k, interfaceC5976f);
        return objM12970b == AbstractC6325c.m24992g() ? objM12970b : C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: j */
    public static final Object m12981j(InterfaceC3473k interfaceC3473k, byte[] bArr, int i10, int i11, InterfaceC5976f interfaceC5976f) {
        interfaceC3473k.mo12880d().write(bArr, i10, i11);
        Object objM12970b = AbstractC3474l.m12970b(interfaceC3473k, interfaceC5976f);
        return objM12970b == AbstractC6325c.m24992g() ? objM12970b : C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ Object m12982k(InterfaceC3473k interfaceC3473k, byte[] bArr, int i10, int i11, InterfaceC5976f interfaceC5976f, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = bArr.length;
        }
        return m12981j(interfaceC3473k, bArr, i10, i11, interfaceC5976f);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m12983l(io.ktor.utils.p131io.InterfaceC3473k r7, p215oc.InterfaceC5728w r8, p228p8.InterfaceC5976f r9) throws java.lang.Throwable {
        /*
            boolean r0 = r9 instanceof io.ktor.utils.p131io.AbstractC3476n.c
            if (r0 == 0) goto L13
            r0 = r9
            io.ktor.utils.io.n$c r0 = (io.ktor.utils.p131io.AbstractC3476n.c) r0
            int r1 = r0.f9672t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f9672t = r1
            goto L18
        L13:
            io.ktor.utils.io.n$c r0 = new io.ktor.utils.io.n$c
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f9671s
            java.lang.Object r1 = p242q8.AbstractC6325c.m24992g()
            int r2 = r0.f9672t
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L34
            java.lang.Object r7 = r0.f9670r
            oc.w r7 = (p215oc.InterfaceC5728w) r7
            java.lang.Object r8 = r0.f9669q
            io.ktor.utils.io.k r8 = (io.ktor.utils.p131io.InterfaceC3473k) r8
            p172l8.AbstractC4713t.m18808b(r9)
            r6 = r8
            r8 = r7
            r7 = r6
            goto L3e
        L34:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            p376zd.C10010p0.m38820a(r7)
            r7 = 0
            return r7
        L3b:
            p172l8.AbstractC4713t.m18808b(r9)
        L3e:
            boolean r9 = r8.mo23108g()
            if (r9 != 0) goto L5c
            oc.u r9 = r7.mo12880d()
            long r4 = p064e8.AbstractC2051d.m7400d(r8)
            r9.mo23101Y(r8, r4)
            r0.f9669q = r7
            r0.f9670r = r8
            r0.f9672t = r3
            java.lang.Object r9 = io.ktor.utils.p131io.AbstractC3474l.m12970b(r7, r0)
            if (r9 != r1) goto L3e
            return r1
        L5c:
            l8.i0 r7 = p172l8.C4700i0.f13910a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.p131io.AbstractC3476n.m12983l(io.ktor.utils.io.k, oc.w, p8.f):java.lang.Object");
    }

    /* JADX INFO: renamed from: m */
    public static final Object m12984m(InterfaceC3473k interfaceC3473k, short s10, InterfaceC5976f interfaceC5976f) {
        interfaceC3473k.mo12880d().mo23122v(s10);
        Object objM12970b = AbstractC3474l.m12970b(interfaceC3473k, interfaceC5976f);
        return objM12970b == AbstractC6325c.m24992g() ? objM12970b : C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: n */
    public static final Object m12985n(InterfaceC3473k interfaceC3473k, String str, InterfaceC5976f interfaceC5976f) {
        AbstractC2053f.m7407f(interfaceC3473k.mo12880d(), str, 0, 0, null, 14, null);
        Object objM12970b = AbstractC3474l.m12970b(interfaceC3473k, interfaceC5976f);
        return objM12970b == AbstractC6325c.m24992g() ? objM12970b : C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: o */
    public static final C3467f0 m12986o(InterfaceC2165o0 interfaceC2165o0, InterfaceC5980j interfaceC5980j, final C3456a c3456a, InterfaceC0188p interfaceC0188p) {
        interfaceC2165o0.getClass();
        interfaceC5980j.getClass();
        c3456a.getClass();
        interfaceC0188p.getClass();
        InterfaceC2198w1 interfaceC2198w1M7817d = AbstractC2148k.m7817d(interfaceC2165o0, interfaceC5980j, null, new d(interfaceC0188p, c3456a, null), 2, null);
        interfaceC2198w1M7817d.mo7650D0(new InterfaceC0184l() { // from class: io.ktor.utils.io.m
            @Override // p010a9.InterfaceC0184l
            /* JADX INFO: renamed from: m */
            public final Object mo27m(Object obj) {
                return AbstractC3476n.m12972a(c3456a, (Throwable) obj);
            }
        });
        return new C3467f0(c3456a, interfaceC2198w1M7817d);
    }

    /* JADX INFO: renamed from: p */
    public static final C3467f0 m12987p(InterfaceC2165o0 interfaceC2165o0, InterfaceC5980j interfaceC5980j, boolean z10, InterfaceC0188p interfaceC0188p) {
        interfaceC2165o0.getClass();
        interfaceC5980j.getClass();
        interfaceC0188p.getClass();
        return m12986o(interfaceC2165o0, interfaceC5980j, new C3456a(false, 1, null), interfaceC0188p);
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ C3467f0 m12988q(InterfaceC2165o0 interfaceC2165o0, InterfaceC5980j interfaceC5980j, boolean z10, InterfaceC0188p interfaceC0188p, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            interfaceC5980j = C5981k.f18917q;
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return m12987p(interfaceC2165o0, interfaceC5980j, z10, interfaceC0188p);
    }

    /* JADX INFO: renamed from: io.ktor.utils.io.n$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a implements InterfaceC5976f {

        /* JADX INFO: renamed from: q */
        public final InterfaceC5980j f9668q = C5981k.f18917q;

        @Override // p228p8.InterfaceC5976f
        public InterfaceC5980j getContext() {
            return this.f9668q;
        }

        @Override // p228p8.InterfaceC5976f
        public void resumeWith(Object obj) {
        }
    }
}
