package p316w;

import androidx.compose.foundation.lazy.layout.AbstractC0353a2;
import androidx.compose.foundation.lazy.layout.C0362d;
import androidx.compose.foundation.lazy.layout.C0386j;
import androidx.compose.foundation.lazy.layout.C0419s;
import androidx.compose.foundation.lazy.layout.C0423t0;
import androidx.compose.foundation.lazy.layout.C0426u0;
import androidx.compose.foundation.lazy.layout.C0432w0;
import androidx.compose.foundation.lazy.layout.InterfaceC0442z1;
import androidx.compose.runtime.AbstractC0473c5;
import androidx.compose.runtime.AbstractC0522j5;
import androidx.compose.runtime.InterfaceC0512i2;
import java.util.ArrayList;
import java.util.List;
import p010a9.InterfaceC0184l;
import p010a9.InterfaceC0188p;
import p024b9.AbstractC1043k;
import p024b9.C1046l0;
import p049d9.AbstractC1927c;
import p080f9.C2363j;
import p102h1.AbstractC2820b;
import p102h1.InterfaceC2821b0;
import p102h1.InterfaceC2843x;
import p119i1.AbstractC3137l;
import p121i3.C3173c;
import p135j2.InterfaceC3562q1;
import p135j2.InterfaceC3565r1;
import p172l8.AbstractC4713t;
import p172l8.C4700i0;
import p172l8.C4711r;
import p185m8.AbstractC5114x;
import p219p.AbstractC5887s1;
import p219p.EnumC5898w0;
import p219p.InterfaceC5836c1;
import p219p.InterfaceC5881q1;
import p228p8.InterfaceC5976f;
import p242q8.AbstractC6325c;
import p248r.AbstractC6433i;
import p248r.InterfaceC6434j;
import p257r8.AbstractC6535d;
import p257r8.AbstractC6544m;
import p263s.AbstractC6635e;
import p316w.C8939c1;
import p376zd.C10010p0;

/* JADX INFO: renamed from: w.c1 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C8939c1 implements InterfaceC5881q1 {

    /* JADX INFO: renamed from: y */
    public static final a f29594y = new a(null);

    /* JADX INFO: renamed from: z */
    public static final InterfaceC2843x f29595z = AbstractC2820b.m10040b(new InterfaceC0188p() { // from class: w.a1
        @Override // p010a9.InterfaceC0188p
        public final Object invoke(Object obj, Object obj2) {
            return C8939c1.m34328h((InterfaceC2821b0) obj, (C8939c1) obj2);
        }
    }, new InterfaceC0184l() { // from class: w.b1
        @Override // p010a9.InterfaceC0184l
        /* JADX INFO: renamed from: m */
        public final Object mo27m(Object obj) {
            return C8939c1.m34327g((List) obj);
        }
    });

    /* JADX INFO: renamed from: a */
    public final InterfaceC8971p0 f29596a;

    /* JADX INFO: renamed from: b */
    public boolean f29597b;

    /* JADX INFO: renamed from: c */
    public C8956i0 f29598c;

    /* JADX INFO: renamed from: d */
    public boolean f29599d;

    /* JADX INFO: renamed from: e */
    public final C8977s0 f29600e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC0512i2 f29601f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC6434j f29602g;

    /* JADX INFO: renamed from: h */
    public float f29603h;

    /* JADX INFO: renamed from: i */
    public final InterfaceC5881q1 f29604i;

    /* JADX INFO: renamed from: j */
    public int f29605j;

    /* JADX INFO: renamed from: k */
    public boolean f29606k;

    /* JADX INFO: renamed from: l */
    public InterfaceC3562q1 f29607l;

    /* JADX INFO: renamed from: m */
    public final InterfaceC3565r1 f29608m;

    /* JADX INFO: renamed from: n */
    public final C0362d f29609n;

    /* JADX INFO: renamed from: o */
    public final C0419s f29610o;

    /* JADX INFO: renamed from: p */
    public final C0386j f29611p;

    /* JADX INFO: renamed from: q */
    public final C0426u0 f29612q;

    /* JADX INFO: renamed from: r */
    public final InterfaceC8969o0 f29613r;

    /* JADX INFO: renamed from: s */
    public final C0423t0 f29614s;

    /* JADX INFO: renamed from: t */
    public final InterfaceC0512i2 f29615t;

    /* JADX INFO: renamed from: u */
    public final InterfaceC0512i2 f29616u;

    /* JADX INFO: renamed from: v */
    public final InterfaceC0512i2 f29617v;

    /* JADX INFO: renamed from: w */
    public final InterfaceC0512i2 f29618w;

    /* JADX INFO: renamed from: x */
    public final C0432w0 f29619x;

    /* JADX INFO: renamed from: w.c1$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b implements InterfaceC8969o0 {
        public b() {
        }

        /* JADX INFO: renamed from: b */
        public static C4700i0 m34361b(List list, C1046l0 c1046l0, List list2, InterfaceC0184l interfaceC0184l, int i10, C8956i0 c8956i0, C0426u0.c cVar) {
            int iMo1171b = cVar.mo1171b();
            int iMo1172c = 0;
            for (int i11 = 0; i11 < iMo1171b; i11++) {
                iMo1172c += (int) (c8956i0.mo34309f() == EnumC5898w0.f18786q ? cVar.mo1172c(i11) & 4294967295L : cVar.mo1172c(i11) >> 32);
            }
            if (list != null) {
                list.add(Integer.valueOf(iMo1172c));
            }
            if (c1046l0.f3205q != list2.size()) {
                c1046l0.f3205q++;
            } else if (interfaceC0184l != null && list != null) {
                interfaceC0184l.mo27m(new C8967n0(i10, list));
            }
            return C4700i0.f13910a;
        }

        @Override // p316w.InterfaceC8969o0
        /* JADX INFO: renamed from: a */
        public List mo34362a(int i10) {
            return m34363c(i10, null);
        }

        /* JADX INFO: renamed from: c */
        public List m34363c(final int i10, final InterfaceC0184l interfaceC0184l) {
            ArrayList arrayList = new ArrayList();
            final ArrayList arrayList2 = interfaceC0184l == null ? null : new ArrayList();
            AbstractC3137l.a aVar = AbstractC3137l.f8345e;
            C8939c1 c8939c1 = C8939c1.this;
            AbstractC3137l abstractC3137lM11765d = aVar.m11765d();
            InterfaceC0184l interfaceC0184lMo11676g = abstractC3137lM11765d != null ? abstractC3137lM11765d.mo11676g() : null;
            AbstractC3137l abstractC3137lM11767f = aVar.m11767f(abstractC3137lM11765d);
            try {
                final C8956i0 c8956i0M34350q = c8939c1.m34355v() ? c8939c1.m34350q() : (C8956i0) c8939c1.f29601f.getValue();
                if (c8956i0M34350q != null) {
                    final C1046l0 c1046l0 = new C1046l0();
                    c1046l0.f3205q = 1;
                    final List list = (List) c8956i0M34350q.m34395w().mo27m(Integer.valueOf(i10));
                    int size = list.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        C4711r c4711r = (C4711r) list.get(i11);
                        arrayList.add(c8939c1.m34339D().m1412i(((Number) c4711r.m18795e()).intValue(), ((C3173c) c4711r.m18796f()).m11978q(), c8939c1.f29599d, new InterfaceC0184l() { // from class: w.d1
                            @Override // p010a9.InterfaceC0184l
                            /* JADX INFO: renamed from: m */
                            public final Object mo27m(Object obj) {
                                return C8939c1.b.m34361b(arrayList2, c1046l0, list, interfaceC0184l, i10, c8956i0M34350q, (C0426u0.c) obj);
                            }
                        }));
                    }
                    C4700i0 c4700i0 = C4700i0.f13910a;
                }
                aVar.m11772k(abstractC3137lM11765d, abstractC3137lM11767f, interfaceC0184lMo11676g);
                return arrayList;
            } catch (Throwable th) {
                aVar.m11772k(abstractC3137lM11765d, abstractC3137lM11767f, interfaceC0184lMo11676g);
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: w.c1$c */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class c implements InterfaceC3565r1 {
        public c() {
        }

        @Override // p135j2.InterfaceC3565r1
        /* JADX INFO: renamed from: e */
        public void mo13347e(InterfaceC3562q1 interfaceC3562q1) {
            C8939c1.this.f29607l = interfaceC3562q1;
        }
    }

    /* JADX INFO: renamed from: w.c1$d */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class d extends AbstractC6535d {

        /* JADX INFO: renamed from: q */
        public Object f29622q;

        /* JADX INFO: renamed from: r */
        public Object f29623r;

        /* JADX INFO: renamed from: s */
        public /* synthetic */ Object f29624s;

        /* JADX INFO: renamed from: u */
        public int f29626u;

        public d(InterfaceC5976f interfaceC5976f) {
            super(interfaceC5976f);
        }

        @Override // p257r8.AbstractC6532a
        public final Object invokeSuspend(Object obj) {
            this.f29624s = obj;
            this.f29626u |= Integer.MIN_VALUE;
            return C8939c1.this.mo2979c(null, null, this);
        }
    }

    /* JADX INFO: renamed from: w.c1$e */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class e extends AbstractC6544m implements InterfaceC0188p {

        /* JADX INFO: renamed from: q */
        public int f29627q;

        /* JADX INFO: renamed from: s */
        public final /* synthetic */ int f29629s;

        /* JADX INFO: renamed from: t */
        public final /* synthetic */ int f29630t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(int i10, int i11, InterfaceC5976f interfaceC5976f) {
            super(2, interfaceC5976f);
            this.f29629s = i10;
            this.f29630t = i11;
        }

        @Override // p257r8.AbstractC6532a
        public final InterfaceC5976f create(Object obj, InterfaceC5976f interfaceC5976f) {
            return C8939c1.this.new e(this.f29629s, this.f29630t, interfaceC5976f);
        }

        @Override // p257r8.AbstractC6532a
        public final Object invokeSuspend(Object obj) throws Throwable {
            AbstractC6325c.m24992g();
            if (this.f29627q != 0) {
                C10010p0.m38820a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC4713t.m18808b(obj);
            C8939c1.this.m34347O(this.f29629s, this.f29630t, true);
            return C4700i0.f13910a;
        }

        @Override // p010a9.InterfaceC0188p
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC5836c1 interfaceC5836c1, InterfaceC5976f interfaceC5976f) {
            return ((e) create(interfaceC5836c1, interfaceC5976f)).invokeSuspend(C4700i0.f13910a);
        }
    }

    public C8939c1(final int i10, int i11, InterfaceC8971p0 interfaceC8971p0) {
        this.f29596a = interfaceC8971p0;
        C8977s0 c8977s0 = new C8977s0(i10, i11);
        this.f29600e = c8977s0;
        this.f29601f = AbstractC0473c5.m1570i(AbstractC8954h1.f29669a, AbstractC0473c5.m1572k());
        this.f29602g = AbstractC6433i.m25463a();
        this.f29604i = AbstractC5887s1.m23707b(new InterfaceC0184l() { // from class: w.y0
            @Override // p010a9.InterfaceC0184l
            /* JADX INFO: renamed from: m */
            public final Object mo27m(Object obj) {
                return Float.valueOf(C8939c1.m34330j(this.f29805q, ((Float) obj).floatValue()));
            }
        });
        this.f29606k = true;
        this.f29608m = new c();
        this.f29609n = new C0362d();
        this.f29610o = new C0419s();
        this.f29611p = new C0386j();
        this.f29612q = new C0426u0(interfaceC8971p0.m34436b(), new InterfaceC0184l() { // from class: w.z0
            @Override // p010a9.InterfaceC0184l
            /* JADX INFO: renamed from: m */
            public final Object mo27m(Object obj) {
                return C8939c1.m34329i(this.f29810q, i10, (InterfaceC0442z1) obj);
            }
        });
        this.f29613r = new b();
        this.f29614s = new C0423t0();
        c8977s0.m34445b();
        this.f29615t = AbstractC0353a2.m1109c(null, 1, null);
        this.f29616u = AbstractC0353a2.m1109c(null, 1, null);
        Boolean bool = Boolean.FALSE;
        this.f29617v = AbstractC0522j5.m1773e(bool, null, 2, null);
        this.f29618w = AbstractC0522j5.m1773e(bool, null, 2, null);
        this.f29619x = new C0432w0();
    }

    /* JADX INFO: renamed from: L */
    public static /* synthetic */ Object m34324L(C8939c1 c8939c1, int i10, int i11, InterfaceC5976f interfaceC5976f, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        return c8939c1.m34346K(i10, i11, interfaceC5976f);
    }

    /* JADX INFO: renamed from: M */
    private void m34325M(boolean z10) {
        this.f29618w.setValue(Boolean.valueOf(z10));
    }

    /* JADX INFO: renamed from: N */
    private void m34326N(boolean z10) {
        this.f29617v.setValue(Boolean.valueOf(z10));
    }

    /* JADX INFO: renamed from: g */
    public static C8939c1 m34327g(List list) {
        return new C8939c1(((Number) list.get(0)).intValue(), ((Number) list.get(1)).intValue());
    }

    /* JADX INFO: renamed from: h */
    public static List m34328h(InterfaceC2821b0 interfaceC2821b0, C8939c1 c8939c1) {
        return AbstractC5114x.m20803r(Integer.valueOf(c8939c1.m34353t()), Integer.valueOf(c8939c1.m34354u()));
    }

    /* JADX INFO: renamed from: i */
    public static C4700i0 m34329i(C8939c1 c8939c1, int i10, InterfaceC0442z1 interfaceC0442z1) {
        InterfaceC8971p0 interfaceC8971p0 = c8939c1.f29596a;
        AbstractC3137l.a aVar = AbstractC3137l.f8345e;
        AbstractC3137l abstractC3137lM11765d = aVar.m11765d();
        aVar.m11772k(abstractC3137lM11765d, aVar.m11767f(abstractC3137lM11765d), abstractC3137lM11765d != null ? abstractC3137lM11765d.mo11676g() : null);
        interfaceC8971p0.mo34290a(interfaceC0442z1, i10);
        return C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: j */
    public static float m34330j(C8939c1 c8939c1, float f10) {
        return -c8939c1.m34345J(-f10);
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m34335p(C8939c1 c8939c1, C8956i0 c8956i0, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z11 = false;
        }
        c8939c1.m34349o(c8956i0, z10, z11);
    }

    /* JADX INFO: renamed from: A */
    public final C2363j m34336A() {
        return (C2363j) this.f29600e.m34445b().getValue();
    }

    /* JADX INFO: renamed from: B */
    public final C0423t0 m34337B() {
        return this.f29614s;
    }

    /* JADX INFO: renamed from: C */
    public final InterfaceC0512i2 m34338C() {
        return this.f29615t;
    }

    /* JADX INFO: renamed from: D */
    public final C0426u0 m34339D() {
        return this.f29612q;
    }

    /* JADX INFO: renamed from: E */
    public final InterfaceC8971p0 m34340E() {
        return this.f29596a;
    }

    /* JADX INFO: renamed from: F */
    public final InterfaceC3565r1 m34341F() {
        return this.f29608m;
    }

    /* JADX INFO: renamed from: G */
    public final float m34342G() {
        return this.f29619x.m1439b();
    }

    /* JADX INFO: renamed from: H */
    public final float m34343H() {
        return this.f29603h;
    }

    /* JADX INFO: renamed from: I */
    public final void m34344I(float f10, InterfaceC8935b0 interfaceC8935b0) {
        if (this.f29606k) {
            this.f29596a.mo34292d(this.f29613r, f10, interfaceC8935b0);
        }
    }

    /* JADX INFO: renamed from: J */
    public final float m34345J(float f10) {
        C8956i0 c8956i0;
        if ((f10 < 0.0f && !mo2980e()) || (f10 > 0.0f && !mo2978b())) {
            return 0.0f;
        }
        if (!(Math.abs(this.f29603h) <= 0.5f)) {
            AbstractC6635e.m26320c("entered drag with non-zero pending scroll");
        }
        float f11 = this.f29603h + f10;
        this.f29603h = f11;
        if (Math.abs(f11) > 0.5f) {
            float f12 = this.f29603h;
            int iM6980d = AbstractC1927c.m6980d(f12);
            C8956i0 c8956i0M34387n = ((C8956i0) this.f29601f.getValue()).m34387n(iM6980d, !this.f29597b);
            if (c8956i0M34387n != null && (c8956i0 = this.f29598c) != null) {
                C8956i0 c8956i0M34387n2 = c8956i0 != null ? c8956i0.m34387n(iM6980d, true) : null;
                if (c8956i0M34387n2 != null) {
                    this.f29598c = c8956i0M34387n2;
                } else {
                    c8956i0M34387n = null;
                }
            }
            if (c8956i0M34387n != null) {
                m34349o(c8956i0M34387n, this.f29597b, true);
                AbstractC0353a2.m1110d(this.f29615t);
                m34344I(f12 - this.f29603h, c8956i0M34387n);
            } else {
                InterfaceC3562q1 interfaceC3562q1 = this.f29607l;
                if (interfaceC3562q1 != null) {
                    interfaceC3562q1.mo13346m();
                }
                m34344I(f12 - this.f29603h, m34358y());
            }
        }
        if (Math.abs(this.f29603h) <= 0.5f) {
            return f10;
        }
        float f13 = f10 - this.f29603h;
        this.f29603h = 0.0f;
        return f13;
    }

    /* JADX INFO: renamed from: K */
    public final Object m34346K(int i10, int i11, InterfaceC5976f interfaceC5976f) {
        Object objM23705d = InterfaceC5881q1.m23705d(this, null, new e(i10, i11, null), interfaceC5976f, 1, null);
        return objM23705d == AbstractC6325c.m24992g() ? objM23705d : C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: O */
    public final void m34347O(int i10, int i11, boolean z10) {
        if (this.f29600e.m34444a() != i10 || this.f29600e.m34446c() != i11) {
            this.f29610o.m1370o();
        }
        this.f29600e.m34447d(i10, i11);
        if (!z10) {
            AbstractC0353a2.m1110d(this.f29616u);
            return;
        }
        InterfaceC3562q1 interfaceC3562q1 = this.f29607l;
        if (interfaceC3562q1 != null) {
            interfaceC3562q1.mo13346m();
        }
    }

    /* JADX INFO: renamed from: P */
    public final int m34348P(InterfaceC8966n interfaceC8966n, int i10) {
        return this.f29600e.m34453j(interfaceC8966n, i10);
    }

    @Override // p219p.InterfaceC5881q1
    /* JADX INFO: renamed from: a */
    public boolean mo2977a() {
        return this.f29604i.mo2977a();
    }

    @Override // p219p.InterfaceC5881q1
    /* JADX INFO: renamed from: b */
    public boolean mo2978b() {
        return ((Boolean) this.f29618w.getValue()).booleanValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x005f, code lost:
    
        if (r8.mo2979c(r6, r7, r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // p219p.InterfaceC5881q1
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo2979c(p189n.EnumC5190a2 r6, p010a9.InterfaceC0188p r7, p228p8.InterfaceC5976f r8) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r8 instanceof p316w.C8939c1.d
            if (r0 == 0) goto L13
            r0 = r8
            w.c1$d r0 = (p316w.C8939c1.d) r0
            int r1 = r0.f29626u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f29626u = r1
            goto L18
        L13:
            w.c1$d r0 = new w.c1$d
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f29624s
            java.lang.Object r1 = p242q8.AbstractC6325c.m24992g()
            int r2 = r0.f29626u
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2c
            p172l8.AbstractC4713t.m18808b(r8)
            goto L62
        L2c:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            p376zd.C10010p0.m38820a(r6)
            r6 = 0
            return r6
        L33:
            java.lang.Object r6 = r0.f29623r
            r7 = r6
            a9.p r7 = (p010a9.InterfaceC0188p) r7
            java.lang.Object r6 = r0.f29622q
            n.a2 r6 = (p189n.EnumC5190a2) r6
            p172l8.AbstractC4713t.m18808b(r8)
            goto L52
        L40:
            p172l8.AbstractC4713t.m18808b(r8)
            androidx.compose.foundation.lazy.layout.d r8 = r5.f29609n
            r0.f29622q = r6
            r0.f29623r = r7
            r0.f29626u = r4
            java.lang.Object r8 = r8.m1154k(r0)
            if (r8 != r1) goto L52
            goto L61
        L52:
            p.q1 r8 = r5.f29604i
            r2 = 0
            r0.f29622q = r2
            r0.f29623r = r2
            r0.f29626u = r3
            java.lang.Object r6 = r8.mo2979c(r6, r7, r0)
            if (r6 != r1) goto L62
        L61:
            return r1
        L62:
            l8.i0 r6 = p172l8.C4700i0.f13910a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p316w.C8939c1.mo2979c(n.a2, a9.p, p8.f):java.lang.Object");
    }

    @Override // p219p.InterfaceC5881q1
    /* JADX INFO: renamed from: e */
    public boolean mo2980e() {
        return ((Boolean) this.f29617v.getValue()).booleanValue();
    }

    @Override // p219p.InterfaceC5881q1
    /* JADX INFO: renamed from: f */
    public float mo2981f(float f10) {
        return this.f29604i.mo2981f(f10);
    }

    /* JADX INFO: renamed from: o */
    public final void m34349o(C8956i0 c8956i0, boolean z10, boolean z11) {
        this.f29612q.m1413j(c8956i0.mo34314k().size());
        if (!z10 && this.f29597b) {
            this.f29598c = c8956i0;
            return;
        }
        if (z10) {
            this.f29597b = true;
        }
        this.f29603h -= c8956i0.m34390r();
        this.f29601f.setValue(c8956i0);
        m34325M(c8956i0.m34388o());
        m34326N(c8956i0.m34389q());
        C8977s0 c8977s0 = this.f29600e;
        if (z11) {
            c8977s0.m34452i(c8956i0.m34394v());
        } else {
            c8977s0.m34451h(c8956i0);
            if (this.f29606k) {
                this.f29596a.mo34291c(this.f29613r, c8956i0);
            }
        }
        if (z10) {
            this.f29619x.m1442e(c8956i0.m34397y(), c8956i0.m34392t(), c8956i0.m34391s());
        }
        this.f29605j++;
    }

    /* JADX INFO: renamed from: q */
    public final C8956i0 m34350q() {
        return this.f29598c;
    }

    /* JADX INFO: renamed from: r */
    public final C0362d m34351r() {
        return this.f29609n;
    }

    /* JADX INFO: renamed from: s */
    public final C0386j m34352s() {
        return this.f29611p;
    }

    /* JADX INFO: renamed from: t */
    public final int m34353t() {
        return this.f29600e.m34444a();
    }

    /* JADX INFO: renamed from: u */
    public final int m34354u() {
        return this.f29600e.m34446c();
    }

    /* JADX INFO: renamed from: v */
    public final boolean m34355v() {
        return this.f29597b;
    }

    /* JADX INFO: renamed from: w */
    public final InterfaceC6434j m34356w() {
        return this.f29602g;
    }

    /* JADX INFO: renamed from: x */
    public final C0419s m34357x() {
        return this.f29610o;
    }

    /* JADX INFO: renamed from: y */
    public final InterfaceC8935b0 m34358y() {
        return (InterfaceC8935b0) this.f29601f.getValue();
    }

    /* JADX INFO: renamed from: z */
    public final InterfaceC0512i2 m34359z() {
        return this.f29616u;
    }

    /* JADX INFO: renamed from: w.c1$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final InterfaceC2843x m34360a() {
            return C8939c1.f29595z;
        }

        public a() {
        }
    }

    public C8939c1(int i10, int i11) {
        this(i10, i11, AbstractC8973q0.m34438b(0, 1, null));
    }
}
