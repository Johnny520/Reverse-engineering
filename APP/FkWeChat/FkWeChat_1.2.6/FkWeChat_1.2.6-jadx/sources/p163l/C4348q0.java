package p163l;

import androidx.compose.runtime.AbstractC0468c0;
import androidx.compose.runtime.AbstractC0497g1;
import androidx.compose.runtime.AbstractC0522j5;
import androidx.compose.runtime.AbstractC0541m3;
import androidx.compose.runtime.InterfaceC0512i2;
import androidx.compose.runtime.InterfaceC0514i4;
import androidx.compose.runtime.InterfaceC0564p5;
import androidx.compose.runtime.InterfaceC0572r;
import ec.InterfaceC2165o0;
import p010a9.InterfaceC0188p;
import p024b9.C1044k0;
import p172l8.AbstractC4713t;
import p172l8.C4700i0;
import p228p8.InterfaceC5976f;
import p242q8.AbstractC6325c;
import p257r8.AbstractC6533b;
import p257r8.AbstractC6544m;
import p349y0.C9508c;
import p376zd.C10010p0;

/* JADX INFO: renamed from: l.q0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C4348q0 {

    /* JADX INFO: renamed from: f */
    public static final int f12712f = 8;

    /* JADX INFO: renamed from: a */
    public final String f12713a;

    /* JADX INFO: renamed from: b */
    public final C9508c f12714b = new C9508c(new a[16], 0);

    /* JADX INFO: renamed from: c */
    public final InterfaceC0512i2 f12715c = AbstractC0522j5.m1773e(Boolean.FALSE, null, 2, null);

    /* JADX INFO: renamed from: d */
    public long f12716d = Long.MIN_VALUE;

    /* JADX INFO: renamed from: e */
    public final InterfaceC0512i2 f12717e = AbstractC0522j5.m1773e(Boolean.TRUE, null, 2, null);

    /* JADX INFO: renamed from: l.q0$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public final class a implements InterfaceC0564p5 {

        /* JADX INFO: renamed from: q */
        public Object f12719q;

        /* JADX INFO: renamed from: r */
        public Object f12720r;

        /* JADX INFO: renamed from: s */
        public final InterfaceC4365t2 f12721s;

        /* JADX INFO: renamed from: t */
        public final String f12722t;

        /* JADX INFO: renamed from: u */
        public final InterfaceC0512i2 f12723u;

        /* JADX INFO: renamed from: v */
        public InterfaceC4317k f12724v;

        /* JADX INFO: renamed from: w */
        public C4268a2 f12725w;

        /* JADX INFO: renamed from: x */
        public boolean f12726x;

        /* JADX INFO: renamed from: y */
        public boolean f12727y;

        /* JADX INFO: renamed from: z */
        public long f12728z;

        public a(Object obj, Object obj2, InterfaceC4365t2 interfaceC4365t2, InterfaceC4317k interfaceC4317k, String str) {
            this.f12719q = obj;
            this.f12720r = obj2;
            this.f12721s = interfaceC4365t2;
            this.f12722t = str;
            this.f12723u = AbstractC0522j5.m1773e(obj, null, 2, null);
            this.f12724v = interfaceC4317k;
            this.f12725w = new C4268a2(this.f12724v, interfaceC4365t2, this.f12719q, this.f12720r, null, 16, null);
        }

        /* JADX INFO: renamed from: d */
        public final Object m17075d() {
            return this.f12719q;
        }

        /* JADX INFO: renamed from: e */
        public final Object m17076e() {
            return this.f12720r;
        }

        @Override // androidx.compose.runtime.InterfaceC0564p5
        public Object getValue() {
            return this.f12723u.getValue();
        }

        /* JADX INFO: renamed from: k */
        public final boolean m17077k() {
            return this.f12726x;
        }

        /* JADX INFO: renamed from: l */
        public final void m17078l(long j10) {
            C4348q0.this.m17073m(false);
            if (this.f12727y) {
                this.f12727y = false;
                this.f12728z = j10;
            }
            long j11 = j10 - this.f12728z;
            m17080o(this.f12725w.mo16775f(j11));
            this.f12726x = this.f12725w.m16848e(j11);
        }

        /* JADX INFO: renamed from: m */
        public final void m17079m() {
            this.f12727y = true;
        }

        /* JADX INFO: renamed from: o */
        public void m17080o(Object obj) {
            this.f12723u.setValue(obj);
        }

        /* JADX INFO: renamed from: v */
        public final void m17081v() {
            m17080o(this.f12725w.mo16776g());
            this.f12727y = true;
        }

        /* JADX INFO: renamed from: w */
        public final void m17082w(Object obj, Object obj2, InterfaceC4317k interfaceC4317k) {
            this.f12719q = obj;
            this.f12720r = obj2;
            this.f12724v = interfaceC4317k;
            this.f12725w = new C4268a2(interfaceC4317k, this.f12721s, obj, obj2, null, 16, null);
            C4348q0.this.m17073m(true);
            this.f12726x = false;
            this.f12727y = true;
        }
    }

    /* JADX INFO: renamed from: l.q0$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b extends AbstractC6544m implements InterfaceC0188p {

        /* JADX INFO: renamed from: q */
        public Object f12729q;

        /* JADX INFO: renamed from: r */
        public int f12730r;

        /* JADX INFO: renamed from: s */
        public /* synthetic */ Object f12731s;

        /* JADX INFO: renamed from: t */
        public final /* synthetic */ InterfaceC0512i2 f12732t;

        /* JADX INFO: renamed from: u */
        public final /* synthetic */ C4348q0 f12733u;

        /* JADX INFO: renamed from: l.q0$b$a */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public static final class a extends AbstractC6544m implements InterfaceC0188p {

            /* JADX INFO: renamed from: q */
            public int f12734q;

            /* JADX INFO: renamed from: r */
            public /* synthetic */ float f12735r;

            public a(InterfaceC5976f interfaceC5976f) {
                super(2, interfaceC5976f);
            }

            @Override // p257r8.AbstractC6532a
            public final InterfaceC5976f create(Object obj, InterfaceC5976f interfaceC5976f) {
                a aVar = new a(interfaceC5976f);
                aVar.f12735r = ((Number) obj).floatValue();
                return aVar;
            }

            @Override // p010a9.InterfaceC0188p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return m17085r(((Number) obj).floatValue(), (InterfaceC5976f) obj2);
            }

            @Override // p257r8.AbstractC6532a
            public final Object invokeSuspend(Object obj) throws Throwable {
                AbstractC6325c.m24992g();
                if (this.f12734q == 0) {
                    AbstractC4713t.m18808b(obj);
                    return AbstractC6533b.m25845a(this.f12735r > 0.0f);
                }
                C10010p0.m38820a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }

            /* JADX INFO: renamed from: r */
            public final Object m17085r(float f10, InterfaceC5976f interfaceC5976f) {
                return ((a) create(Float.valueOf(f10), interfaceC5976f)).invokeSuspend(C4700i0.f13910a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC0512i2 interfaceC0512i2, C4348q0 c4348q0, InterfaceC5976f interfaceC5976f) {
            super(2, interfaceC5976f);
            this.f12732t = interfaceC0512i2;
            this.f12733u = c4348q0;
        }

        /* JADX INFO: renamed from: r */
        public static float m17083r(InterfaceC2165o0 interfaceC2165o0) {
            return AbstractC4394z1.m17192v(interfaceC2165o0.getCoroutineContext());
        }

        /* JADX INFO: renamed from: w */
        public static C4700i0 m17084w(InterfaceC0512i2 interfaceC0512i2, C4348q0 c4348q0, C1044k0 c1044k0, InterfaceC2165o0 interfaceC2165o0, long j10) {
            InterfaceC0564p5 interfaceC0564p5 = (InterfaceC0564p5) interfaceC0512i2.getValue();
            long jLongValue = interfaceC0564p5 != null ? ((Number) interfaceC0564p5.getValue()).longValue() : j10;
            if (c4348q0.f12716d == Long.MIN_VALUE || c1044k0.f3203q != AbstractC4394z1.m17192v(interfaceC2165o0.getCoroutineContext())) {
                c4348q0.f12716d = j10;
                C9508c c9508c = c4348q0.f12714b;
                Object[] objArr = c9508c.f32299q;
                int iM37039l = c9508c.m37039l();
                for (int i10 = 0; i10 < iM37039l; i10++) {
                    ((a) objArr[i10]).m17079m();
                }
                c1044k0.f3203q = AbstractC4394z1.m17192v(interfaceC2165o0.getCoroutineContext());
            }
            if (c1044k0.f3203q == 0.0f) {
                C9508c c9508c2 = c4348q0.f12714b;
                Object[] objArr2 = c9508c2.f32299q;
                int iM37039l2 = c9508c2.m37039l();
                for (int i11 = 0; i11 < iM37039l2; i11++) {
                    ((a) objArr2[i11]).m17081v();
                }
            } else {
                c4348q0.m17070j((long) ((jLongValue - c4348q0.f12716d) / c1044k0.f3203q));
            }
            return C4700i0.f13910a;
        }

        @Override // p257r8.AbstractC6532a
        public final InterfaceC5976f create(Object obj, InterfaceC5976f interfaceC5976f) {
            b bVar = new b(this.f12732t, this.f12733u, interfaceC5976f);
            bVar.f12731s = obj;
            return bVar;
        }

        @Override // p010a9.InterfaceC0188p
        public final Object invoke(InterfaceC2165o0 interfaceC2165o0, InterfaceC5976f interfaceC5976f) {
            return ((b) create(interfaceC2165o0, interfaceC5976f)).invokeSuspend(C4700i0.f13910a);
        }

        /* JADX WARN: Path cross not found for [B:11:0x003f, B:16:0x005c], limit reached: 18 */
        /* JADX WARN: Path cross not found for [B:16:0x005c, B:11:0x003f], limit reached: 18 */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0055 A[PHI: r1 r8
  0x0055: PHI (r1v2 b9.k0) = (r1v3 b9.k0), (r1v5 b9.k0) binds: [B:12:0x0052, B:9:0x0022] A[DONT_GENERATE, DONT_INLINE]
  0x0055: PHI (r8v3 ec.o0) = (r8v4 ec.o0), (r8v5 ec.o0) binds: [B:12:0x0052, B:9:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:16:0x005c  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x005a -> B:11:0x003f). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0075 -> B:11:0x003f). Please report as a decompilation issue!!! */
        @Override // p257r8.AbstractC6532a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) throws java.lang.Throwable {
            /*
                r7 = this;
                java.lang.Object r0 = p242q8.AbstractC6325c.m24992g()
                int r1 = r7.f12730r
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L2f
                if (r1 == r3) goto L22
                if (r1 != r2) goto L1b
                java.lang.Object r1 = r7.f12729q
                b9.k0 r1 = (p024b9.C1044k0) r1
                java.lang.Object r4 = r7.f12731s
                ec.o0 r4 = (ec.InterfaceC2165o0) r4
                p172l8.AbstractC4713t.m18808b(r8)
                r8 = r4
                goto L3f
            L1b:
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                p376zd.C10010p0.m38820a(r8)
                r8 = 0
                return r8
            L22:
                java.lang.Object r1 = r7.f12729q
                b9.k0 r1 = (p024b9.C1044k0) r1
                java.lang.Object r4 = r7.f12731s
                ec.o0 r4 = (ec.InterfaceC2165o0) r4
                p172l8.AbstractC4713t.m18808b(r8)
                r8 = r4
                goto L55
            L2f:
                p172l8.AbstractC4713t.m18808b(r8)
                java.lang.Object r8 = r7.f12731s
                ec.o0 r8 = (ec.InterfaceC2165o0) r8
                b9.k0 r1 = new b9.k0
                r1.<init>()
                r4 = 1065353216(0x3f800000, float:1.0)
                r1.f3203q = r4
            L3f:
                androidx.compose.runtime.i2 r4 = r7.f12732t
                l.q0 r5 = r7.f12733u
                l.r0 r6 = new l.r0
                r6.<init>()
                r7.f12731s = r8
                r7.f12729q = r1
                r7.f12730r = r3
                java.lang.Object r4 = p163l.AbstractC4333n0.m17001a(r6, r7)
                if (r4 != r0) goto L55
                goto L77
            L55:
                float r4 = r1.f3203q
                r5 = 0
                int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
                if (r4 != 0) goto L3f
                l.s0 r4 = new l.s0
                r4.<init>()
                hc.c r4 = androidx.compose.runtime.AbstractC0473c5.m1578q(r4)
                l.q0$b$a r5 = new l.q0$b$a
                r6 = 0
                r5.<init>(r6)
                r7.f12731s = r8
                r7.f12729q = r1
                r7.f12730r = r2
                java.lang.Object r4 = p113hc.AbstractC2976e.m10984l(r4, r5, r7)
                if (r4 != r0) goto L3f
            L77:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p163l.C4348q0.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public C4348q0(String str) {
        this.f12713a = str;
    }

    /* JADX INFO: renamed from: a */
    public static C4700i0 m17061a(C4348q0 c4348q0, int i10, InterfaceC0572r interfaceC0572r, int i11) {
        c4348q0.m17072l(interfaceC0572r, AbstractC0541m3.m1929a(i10 | 1));
        return C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: g */
    public final void m17067g(a aVar) {
        this.f12714b.m37029b(aVar);
        m17073m(true);
    }

    /* JADX INFO: renamed from: h */
    public final boolean m17068h() {
        return ((Boolean) this.f12715c.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: i */
    public final boolean m17069i() {
        return ((Boolean) this.f12717e.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: j */
    public final void m17070j(long j10) {
        C9508c c9508c = this.f12714b;
        Object[] objArr = c9508c.f32299q;
        int iM37039l = c9508c.m37039l();
        boolean z10 = true;
        for (int i10 = 0; i10 < iM37039l; i10++) {
            a aVar = (a) objArr[i10];
            if (!aVar.m17077k()) {
                aVar.m17078l(j10);
            }
            if (!aVar.m17077k()) {
                z10 = false;
            }
        }
        m17074n(!z10);
    }

    /* JADX INFO: renamed from: k */
    public final void m17071k(a aVar) {
        this.f12714b.m37043p(aVar);
    }

    /* JADX INFO: renamed from: l */
    public final void m17072l(InterfaceC0572r interfaceC0572r, final int i10) {
        int i11;
        InterfaceC0572r interfaceC0572rMo2181q = interfaceC0572r.mo2181q(-318043801);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC0572rMo2181q.mo2175k(this) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if (interfaceC0572rMo2181q.mo2144C((i11 & 3) != 2, i11 & 1)) {
            if (AbstractC0468c0.m1556j()) {
                AbstractC0468c0.m1559m(-318043801, i11, -1, "androidx.compose.animation.core.InfiniteTransition.run (InfiniteTransition.kt:164)");
            }
            Object objMo2170f = interfaceC0572rMo2181q.mo2170f();
            InterfaceC0572r.a aVar = InterfaceC0572r.f1573a;
            if (objMo2170f == aVar.m2191a()) {
                objMo2170f = AbstractC0522j5.m1773e(null, null, 2, null);
                interfaceC0572rMo2181q.mo2153L(objMo2170f);
            }
            InterfaceC0512i2 interfaceC0512i2 = (InterfaceC0512i2) objMo2170f;
            if (m17069i() || m17068h()) {
                interfaceC0572rMo2181q.mo2163V(-144783432);
                boolean zMo2175k = interfaceC0572rMo2181q.mo2175k(this);
                Object objMo2170f2 = interfaceC0572rMo2181q.mo2170f();
                if (zMo2175k || objMo2170f2 == aVar.m2191a()) {
                    objMo2170f2 = new b(interfaceC0512i2, this, null);
                    interfaceC0572rMo2181q.mo2153L(objMo2170f2);
                }
                AbstractC0497g1.m1680d(this, (InterfaceC0188p) objMo2170f2, interfaceC0572rMo2181q, i11 & 14);
                interfaceC0572rMo2181q.mo2152K();
            } else {
                interfaceC0572rMo2181q.mo2163V(-143396709);
                interfaceC0572rMo2181q.mo2152K();
            }
            if (AbstractC0468c0.m1556j()) {
                AbstractC0468c0.m1558l();
            }
        } else {
            interfaceC0572rMo2181q.mo2190z();
        }
        InterfaceC0514i4 interfaceC0514i4Mo2188x = interfaceC0572rMo2181q.mo2188x();
        if (interfaceC0514i4Mo2188x != null) {
            interfaceC0514i4Mo2188x.mo1756a(new InterfaceC0188p() { // from class: l.p0
                @Override // p010a9.InterfaceC0188p
                public final Object invoke(Object obj, Object obj2) {
                    return C4348q0.m17061a(this.f12696q, i10, (InterfaceC0572r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m17073m(boolean z10) {
        this.f12715c.setValue(Boolean.valueOf(z10));
    }

    /* JADX INFO: renamed from: n */
    public final void m17074n(boolean z10) {
        this.f12717e.setValue(Boolean.valueOf(z10));
    }
}
