package p212o9;

import androidx.compose.runtime.C0503h0;
import ca.C1434n;
import ca.C1458z;
import gb.AbstractC2650c1;
import gb.AbstractC2706r0;
import gb.C2663f2;
import gb.C2724x0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p010a9.InterfaceC0173a;
import p010a9.InterfaceC0184l;
import p024b9.AbstractC1052o0;
import p024b9.AbstractC1061t;
import p024b9.C1038h0;
import p024b9.C1050n0;
import p037cb.AbstractC1483l0;
import p067eb.C2084m;
import p082fb.AbstractC2411m;
import p082fb.InterfaceC2399a;
import p082fb.InterfaceC2405g;
import p082fb.InterfaceC2407i;
import p082fb.InterfaceC2412n;
import p098g9.InterfaceC2557k;
import p111ha.AbstractC2907b0;
import p111ha.AbstractC2909c0;
import p111ha.C2915f0;
import p143ja.C3777j;
import p172l8.AbstractC4717x;
import p172l8.C4700i0;
import p172l8.C4711r;
import p185m8.AbstractC5068b1;
import p185m8.AbstractC5081g0;
import p185m8.AbstractC5112w;
import p185m8.AbstractC5114x;
import p185m8.AbstractC5116y;
import p186m9.AbstractC5128i;
import p212o9.C5675k;
import p213oa.C5691b;
import p213oa.C5692c;
import p213oa.C5693d;
import p213oa.C5695f;
import p215oc.C5729x;
import p229p9.AbstractC5999f0;
import p229p9.AbstractC6037s;
import p229p9.AbstractC6040t;
import p229p9.AbstractC6054y;
import p229p9.C6020m0;
import p229p9.EnumC5996e0;
import p229p9.EnumC5998f;
import p229p9.InterfaceC5986b;
import p229p9.InterfaceC5992d;
import p229p9.InterfaceC5995e;
import p229p9.InterfaceC6000f1;
import p229p9.InterfaceC6003g1;
import p229p9.InterfaceC6004h;
import p229p9.InterfaceC6005h0;
import p229p9.InterfaceC6016l;
import p229p9.InterfaceC6019m;
import p229p9.InterfaceC6039s1;
import p229p9.InterfaceC6056z;
import p243q9.AbstractC6332g;
import p243q9.InterfaceC6333h;
import p244qb.AbstractC6371b;
import p244qb.C6380k;
import p258r9.AbstractC6548d;
import p258r9.InterfaceC6545a;
import p258r9.InterfaceC6547c;
import p272s8.AbstractC7198b;
import p272s8.InterfaceC7197a;
import p273s9.AbstractC7216h0;
import p273s9.C7221k;
import p327wa.AbstractC9211e;
import p342x9.EnumC9470d;
import p373z9.InterfaceC9897j;
import sa.C7265o;
import za.InterfaceC9913k;

/* JADX INFO: renamed from: o9.u */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5685u implements InterfaceC6545a, InterfaceC6547c {

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ InterfaceC2557k[] f17856i = {AbstractC1052o0.m3814i(new C1038h0(C5685u.class, "settings", "getSettings()Lorg/jetbrains/kotlin/builtins/jvm/JvmBuiltIns$Settings;", 0)), AbstractC1052o0.m3814i(new C1038h0(C5685u.class, "cloneableType", "getCloneableType()Lorg/jetbrains/kotlin/types/SimpleType;", 0)), AbstractC1052o0.m3814i(new C1038h0(C5685u.class, "notConsideredDeprecation", "getNotConsideredDeprecation()Lorg/jetbrains/kotlin/descriptors/annotations/Annotations;", 0))};

    /* JADX INFO: renamed from: a */
    public final InterfaceC6005h0 f17857a;

    /* JADX INFO: renamed from: b */
    public final C5668d f17858b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC2407i f17859c;

    /* JADX INFO: renamed from: d */
    public final AbstractC2706r0 f17860d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC2407i f17861e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC2399a f17862f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC2407i f17863g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC2405g f17864h;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: o9.u$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {

        /* JADX INFO: renamed from: q */
        public static final a f17865q = new a("HIDDEN", 0);

        /* JADX INFO: renamed from: r */
        public static final a f17866r = new a("VISIBLE", 1);

        /* JADX INFO: renamed from: s */
        public static final a f17867s = new a("DEPRECATED_LIST_METHODS", 2);

        /* JADX INFO: renamed from: t */
        public static final a f17868t = new a("NOT_CONSIDERED", 3);

        /* JADX INFO: renamed from: u */
        public static final a f17869u = new a("DROP", 4);

        /* JADX INFO: renamed from: v */
        public static final /* synthetic */ a[] f17870v;

        /* JADX INFO: renamed from: w */
        public static final /* synthetic */ InterfaceC7197a f17871w;

        static {
            a[] aVarArrM22962a = m22962a();
            f17870v = aVarArrM22962a;
            f17871w = AbstractC7198b.m28437a(aVarArrM22962a);
        }

        public a(String str, int i10) {
        }

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ a[] m22962a() {
            return new a[]{f17865q, f17866r, f17867s, f17868t, f17869u};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f17870v.clone();
        }
    }

    /* JADX INFO: renamed from: o9.u$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f17872a;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.f17865q.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.f17867s.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.f17868t.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[a.f17869u.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[a.f17866r.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f17872a = iArr;
        }
    }

    /* JADX INFO: renamed from: o9.u$c */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class c extends AbstractC7216h0 {
        public c(InterfaceC6005h0 interfaceC6005h0, C5692c c5692c) {
            super(interfaceC6005h0, c5692c);
        }

        @Override // p229p9.InterfaceC6023n0
        /* JADX INFO: renamed from: L0, reason: merged with bridge method [inline-methods] */
        public InterfaceC9913k.b mo5510v() {
            return InterfaceC9913k.b.f33436b;
        }
    }

    /* JADX INFO: renamed from: o9.u$d */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class d extends AbstractC6371b.b {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f17873a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C1050n0 f17874b;

        public d(String str, C1050n0 c1050n0) {
            this.f17873a = str;
            this.f17874b = c1050n0;
        }

        @Override // p244qb.AbstractC6371b.d
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean mo5739c(InterfaceC5995e interfaceC5995e) {
            interfaceC5995e.getClass();
            String strM10559a = AbstractC2907b0.m10559a(C2915f0.f7680a, interfaceC5995e, this.f17873a);
            C5688x c5688x = C5688x.f17878a;
            if (c5688x.m22973f().contains(strM10559a)) {
                this.f17874b.f3208q = a.f17865q;
            } else if (c5688x.m22976i().contains(strM10559a)) {
                this.f17874b.f3208q = a.f17866r;
            } else if (c5688x.m22970c().contains(strM10559a)) {
                this.f17874b.f3208q = a.f17867s;
            } else if (c5688x.m22971d().contains(strM10559a)) {
                this.f17874b.f3208q = a.f17869u;
            }
            return this.f17874b.f3208q == null;
        }

        @Override // p244qb.AbstractC6371b.d
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public a mo5738a() {
            a aVar = (a) this.f17874b.f3208q;
            return aVar == null ? a.f17868t : aVar;
        }
    }

    public C5685u(InterfaceC6005h0 interfaceC6005h0, InterfaceC2412n interfaceC2412n, InterfaceC0173a interfaceC0173a) {
        interfaceC6005h0.getClass();
        interfaceC2412n.getClass();
        interfaceC0173a.getClass();
        this.f17857a = interfaceC6005h0;
        this.f17858b = C5668d.f17816a;
        this.f17859c = interfaceC2412n.mo8663f(interfaceC0173a);
        this.f17860d = m22957q(interfaceC2412n);
        this.f17861e = interfaceC2412n.mo8663f(new C5676l(this, interfaceC2412n));
        this.f17862f = interfaceC2412n.mo8661d();
        this.f17863g = interfaceC2412n.mo8663f(new C5677m(this));
        this.f17864h = interfaceC2412n.mo8659b(new C5678n(this));
    }

    /* JADX INFO: renamed from: B */
    public static final Iterable m22927B(C5685u c5685u, InterfaceC5995e interfaceC5995e) {
        Collection collectionMo9546n = interfaceC5995e.mo5591o().mo9546n();
        collectionMo9546n.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = collectionMo9546n.iterator();
        while (it.hasNext()) {
            InterfaceC6004h interfaceC6004hMo5602u = ((AbstractC2706r0) it.next()).mo9332T0().mo5602u();
            InterfaceC5995e interfaceC5995eM22961z = null;
            InterfaceC6004h interfaceC6004hMo12664a = interfaceC6004hMo5602u != null ? interfaceC6004hMo5602u.mo12664a() : null;
            InterfaceC5995e interfaceC5995e2 = interfaceC6004hMo12664a instanceof InterfaceC5995e ? (InterfaceC5995e) interfaceC6004hMo12664a : null;
            if (interfaceC5995e2 != null && (interfaceC5995eM22961z = c5685u.m22961z(interfaceC5995e2)) == null) {
                interfaceC5995eM22961z = interfaceC5995e2;
            }
            if (interfaceC5995eM22961z != null) {
                arrayList.add(interfaceC5995eM22961z);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: F */
    public static final Iterable m22928F(InterfaceC5986b interfaceC5986b) {
        return interfaceC5986b.mo12664a().mo12674e();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX INFO: renamed from: G */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Boolean m22929G(p212o9.C5685u r2, p229p9.InterfaceC5986b r3) {
        /*
            p9.b$a r0 = r3.mo12678j()
            p9.b$a r1 = p229p9.InterfaceC5986b.a.DECLARATION
            if (r0 != r1) goto L1b
            o9.d r2 = r2.f17858b
            p9.m r3 = r3.mo7443b()
            r3.getClass()
            p9.e r3 = (p229p9.InterfaceC5995e) r3
            boolean r2 = r2.m22903c(r3)
            if (r2 == 0) goto L1b
            r2 = 1
            goto L1c
        L1b:
            r2 = 0
        L1c:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p212o9.C5685u.m22929G(o9.u, p9.b):java.lang.Boolean");
    }

    /* JADX INFO: renamed from: I */
    public static final InterfaceC6333h m22930I(C5685u c5685u) {
        return InterfaceC6333h.f19873o.m25002a(AbstractC5112w.m20789e(AbstractC6332g.m25000c(c5685u.f17857a.mo12669t(), "This member is not fully supported by Kotlin compiler, so it may be absent or have different signature in next major version", null, null, true, 6, null)));
    }

    /* JADX INFO: renamed from: o */
    public static final AbstractC2650c1 m22940o(C5685u c5685u, InterfaceC2412n interfaceC2412n) {
        return AbstractC6054y.m24114d(c5685u.m22948D().m22925a(), C5671g.f17820d.m22913a(), new C6020m0(interfaceC2412n, c5685u.m22948D().m22925a())).mo7508x();
    }

    /* JADX INFO: renamed from: r */
    public static final AbstractC2706r0 m22941r(C5685u c5685u) {
        AbstractC2650c1 abstractC2650c1M20920i = c5685u.f17857a.mo12669t().m20920i();
        abstractC2650c1M20920i.getClass();
        return abstractC2650c1M20920i;
    }

    /* JADX INFO: renamed from: s */
    public static final InterfaceC6333h m22942s(C5685u c5685u, C4711r c4711r) {
        c4711r.getClass();
        String str = (String) c4711r.m18792a();
        String str2 = (String) c4711r.m18793b();
        return InterfaceC6333h.f19873o.m25002a(AbstractC5112w.m20789e(AbstractC6332g.m24999b(c5685u.f17857a.mo12669t(), "'" + str + "()' member of List is redundant in Kotlin and might be removed soon. Please use '" + str2 + "()' stdlib extension instead", str2 + "()", "HIDDEN", false)));
    }

    /* JADX INFO: renamed from: u */
    public static final InterfaceC5995e m22943u(C1434n c1434n, InterfaceC5995e interfaceC5995e) {
        InterfaceC9897j interfaceC9897j = InterfaceC9897j.f33375a;
        interfaceC9897j.getClass();
        return c1434n.m5579V0(interfaceC9897j, interfaceC5995e);
    }

    /* JADX INFO: renamed from: w */
    public static final boolean m22944w(InterfaceC6016l interfaceC6016l, C2663f2 c2663f2, InterfaceC6016l interfaceC6016l2) {
        return C7265o.m28822x(interfaceC6016l, interfaceC6016l2.mo7503c(c2663f2)) == C7265o.i.a.OVERRIDABLE;
    }

    /* JADX INFO: renamed from: x */
    public static final Collection m22945x(C5695f c5695f, InterfaceC9913k interfaceC9913k) {
        interfaceC9913k.getClass();
        return interfaceC9913k.mo5513a(c5695f, EnumC9470d.f32176t);
    }

    /* JADX INFO: renamed from: A */
    public final a m22946A(InterfaceC6056z interfaceC6056z) {
        InterfaceC6019m interfaceC6019mMo7443b = interfaceC6056z.mo7443b();
        interfaceC6019mMo7443b.getClass();
        Object objM25347b = AbstractC6371b.m25347b(AbstractC5112w.m20789e((InterfaceC5995e) interfaceC6019mMo7443b), new C5684t(this), new d(AbstractC2909c0.m10562c(interfaceC6056z, false, false, 3, null), new C1050n0()));
        objM25347b.getClass();
        return (a) objM25347b;
    }

    /* JADX INFO: renamed from: C */
    public final InterfaceC6333h m22947C() {
        return (InterfaceC6333h) AbstractC2411m.m8702a(this.f17863g, this, f17856i[2]);
    }

    /* JADX INFO: renamed from: D */
    public final C5675k.b m22948D() {
        return (C5675k.b) AbstractC2411m.m8702a(this.f17859c, this, f17856i[0]);
    }

    /* JADX INFO: renamed from: E */
    public final boolean m22949E(InterfaceC6000f1 interfaceC6000f1, boolean z10) {
        InterfaceC6019m interfaceC6019mMo7443b = interfaceC6000f1.mo7443b();
        interfaceC6019mMo7443b.getClass();
        String strM10562c = AbstractC2909c0.m10562c(interfaceC6000f1, false, false, 3, null);
        if (z10 ^ C5688x.f17878a.m22974g().contains(AbstractC2907b0.m10559a(C2915f0.f7680a, (InterfaceC5995e) interfaceC6019mMo7443b, strM10562c))) {
            return true;
        }
        Boolean boolM25350e = AbstractC6371b.m25350e(AbstractC5112w.m20789e(interfaceC6000f1), C5682r.f17853a, new C5683s(this));
        boolM25350e.getClass();
        return boolM25350e.booleanValue();
    }

    /* JADX INFO: renamed from: H */
    public final boolean m22950H(InterfaceC6016l interfaceC6016l, InterfaceC5995e interfaceC5995e) {
        if (interfaceC6016l.mo12680m().size() != 1) {
            return false;
        }
        List listMo12680m = interfaceC6016l.mo12680m();
        listMo12680m.getClass();
        InterfaceC6004h interfaceC6004hMo5602u = ((InterfaceC6039s1) AbstractC5081g0.m20537I0(listMo12680m)).getType().mo9332T0().mo5602u();
        return AbstractC1061t.m3842c(interfaceC6004hMo5602u != null ? AbstractC9211e.m35861p(interfaceC6004hMo5602u) : null, AbstractC9211e.m35861p(interfaceC5995e));
    }

    @Override // p258r9.InterfaceC6545a
    /* JADX INFO: renamed from: b */
    public Collection mo22952b(InterfaceC5995e interfaceC5995e) {
        interfaceC5995e.getClass();
        if (interfaceC5995e.mo5588j() != EnumC5998f.f18948r || !m22948D().m22926b()) {
            return AbstractC5114x.m20800o();
        }
        C1434n c1434nM22961z = m22961z(interfaceC5995e);
        if (c1434nM22961z == null) {
            return AbstractC5114x.m20800o();
        }
        InterfaceC5995e interfaceC5995eM22900f = C5668d.m22900f(this.f17858b, AbstractC9211e.m35860o(c1434nM22961z), C5666b.f17794h.m22879a(), null, 4, null);
        if (interfaceC5995eM22900f == null) {
            return AbstractC5114x.m20800o();
        }
        C2663f2 c2663f2M9361c = AbstractC5689y.m22979a(interfaceC5995eM22900f, c1434nM22961z).m9361c();
        List listM5581X0 = c1434nM22961z.mo5590l();
        ArrayList<InterfaceC5992d> arrayList = new ArrayList();
        for (Object obj : listM5581X0) {
            InterfaceC5992d interfaceC5992d = (InterfaceC5992d) obj;
            if (interfaceC5992d.mo5587g().m24095d()) {
                Collection collectionMo5590l = interfaceC5995eM22900f.mo5590l();
                collectionMo5590l.getClass();
                Collection<InterfaceC5992d> collection = collectionMo5590l;
                if (!(collection instanceof Collection) || !collection.isEmpty()) {
                    for (InterfaceC5992d interfaceC5992d2 : collection) {
                        interfaceC5992d2.getClass();
                        if (m22944w(interfaceC5992d2, c2663f2M9361c, interfaceC5992d)) {
                            break;
                        }
                    }
                }
                if (!m22950H(interfaceC5992d, interfaceC5995e) && !AbstractC5128i.m20878l0(interfaceC5992d) && !C5688x.f17878a.m22972e().contains(AbstractC2907b0.m10559a(C2915f0.f7680a, c1434nM22961z, AbstractC2909c0.m10562c(interfaceC5992d, false, false, 3, null)))) {
                    arrayList.add(obj);
                }
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC5116y.m20814z(arrayList, 10));
        for (InterfaceC5992d interfaceC5992d3 : arrayList) {
            InterfaceC6056z.a aVarMo12638y = interfaceC5992d3.mo12638y();
            aVarMo12638y.mo12648j(interfaceC5995e);
            aVarMo12638y.mo12649k(interfaceC5995e.mo7508x());
            aVarMo12638y.mo12643e();
            aVarMo12638y.mo12655q(c2663f2M9361c.m9389j());
            if (!C5688x.f17878a.m22975h().contains(AbstractC2907b0.m10559a(C2915f0.f7680a, c1434nM22961z, AbstractC2909c0.m10562c(interfaceC5992d3, false, false, 3, null)))) {
                aVarMo12638y.mo12642d(m22947C());
            }
            InterfaceC6056z interfaceC6056zBuild = aVarMo12638y.build();
            interfaceC6056zBuild.getClass();
            arrayList2.add((InterfaceC5992d) interfaceC6056zBuild);
        }
        return arrayList2;
    }

    @Override // p258r9.InterfaceC6545a
    /* JADX INFO: renamed from: c */
    public Collection mo22953c(C5695f c5695f, InterfaceC5995e interfaceC5995e) {
        InterfaceC6333h interfaceC6333h;
        c5695f.getClass();
        interfaceC5995e.getClass();
        if (AbstractC1061t.m3842c(c5695f, C5665a.f17792e.m22876a()) && (interfaceC5995e instanceof C2084m) && AbstractC5128i.m20872f0(interfaceC5995e)) {
            C2084m c2084m = (C2084m) interfaceC5995e;
            List listM14165L0 = c2084m.m7451k1().m14165L0();
            listM14165L0.getClass();
            if (listM14165L0 == null || !listM14165L0.isEmpty()) {
                Iterator it = listM14165L0.iterator();
                while (it.hasNext()) {
                    if (AbstractC1061t.m3842c(AbstractC1483l0.m5819b(c2084m.m7450j1().m5871g(), ((C3777j) it.next()).m14483h0()), C5665a.f17792e.m22876a())) {
                        return AbstractC5114x.m20800o();
                    }
                }
            }
            return AbstractC5112w.m20789e(m22956p(c2084m, (InterfaceC6000f1) AbstractC5081g0.m20536H0(m22959v().mo7040v().mo5513a(c5695f, EnumC9470d.f32176t))));
        }
        if (!m22948D().m22926b()) {
            return AbstractC5114x.m20800o();
        }
        Collection<InterfaceC6000f1> collectionM22958t = m22958t(interfaceC5995e, new C5680p(c5695f));
        ArrayList arrayList = new ArrayList();
        for (InterfaceC6000f1 interfaceC6000f1 : collectionM22958t) {
            InterfaceC6019m interfaceC6019mMo7443b = interfaceC6000f1.mo7443b();
            interfaceC6019mMo7443b.getClass();
            InterfaceC6056z interfaceC6056zMo7503c = interfaceC6000f1.mo7503c(AbstractC5689y.m22979a((InterfaceC5995e) interfaceC6019mMo7443b, interfaceC5995e).m9361c());
            interfaceC6056zMo7503c.getClass();
            InterfaceC6056z.a aVarMo12638y = ((InterfaceC6000f1) interfaceC6056zMo7503c).mo12638y();
            aVarMo12638y.mo12648j(interfaceC5995e);
            aVarMo12638y.mo12647i(interfaceC5995e.mo23999P0());
            aVarMo12638y.mo12643e();
            int i10 = b.f17872a[m22946A(interfaceC6000f1).ordinal()];
            InterfaceC6000f1 interfaceC6000f12 = null;
            if (i10 != 1) {
                if (i10 == 2) {
                    C5695f name = interfaceC6000f1.getName();
                    if (AbstractC1061t.m3842c(name, AbstractC5686v.f17875a)) {
                        interfaceC6333h = (InterfaceC6333h) this.f17864h.mo27m(AbstractC4717x.m18815a(interfaceC6000f1.getName().m23030c(), "first"));
                    } else {
                        if (!AbstractC1061t.m3842c(name, AbstractC5686v.f17876b)) {
                            C0503h0.m1691a("Unexpected name: ", interfaceC6000f1.getName());
                            return null;
                        }
                        interfaceC6333h = (InterfaceC6333h) this.f17864h.mo27m(AbstractC4717x.m18815a(interfaceC6000f1.getName().m23030c(), "last"));
                    }
                    aVarMo12638y.mo12642d(interfaceC6333h);
                } else if (i10 == 3) {
                    aVarMo12638y.mo12642d(m22947C());
                } else if (i10 != 4) {
                    if (i10 != 5) {
                        C5729x.m23182a();
                        return null;
                    }
                    C4700i0 c4700i0 = C4700i0.f13910a;
                }
                InterfaceC6056z interfaceC6056zBuild = aVarMo12638y.build();
                interfaceC6056zBuild.getClass();
                interfaceC6000f12 = (InterfaceC6000f1) interfaceC6056zBuild;
            } else if (!AbstractC5999f0.m24011a(interfaceC5995e)) {
                aVarMo12638y.mo12645g();
                InterfaceC6056z interfaceC6056zBuild2 = aVarMo12638y.build();
                interfaceC6056zBuild2.getClass();
                interfaceC6000f12 = (InterfaceC6000f1) interfaceC6056zBuild2;
            }
            if (interfaceC6000f12 != null) {
                arrayList.add(interfaceC6000f12);
            }
        }
        return arrayList;
    }

    @Override // p258r9.InterfaceC6547c
    /* JADX INFO: renamed from: d */
    public boolean mo22954d(InterfaceC5995e interfaceC5995e, InterfaceC6000f1 interfaceC6000f1) {
        interfaceC5995e.getClass();
        interfaceC6000f1.getClass();
        C1434n c1434nM22961z = m22961z(interfaceC5995e);
        if (c1434nM22961z == null || !interfaceC6000f1.getAnnotations().mo3927i(AbstractC6548d.m25864a())) {
            return true;
        }
        if (!m22948D().m22926b()) {
            return false;
        }
        String strM10562c = AbstractC2909c0.m10562c(interfaceC6000f1, false, false, 3, null);
        C1458z c1458zM5585a1 = c1434nM22961z.mo5571H0();
        C5695f name = interfaceC6000f1.getName();
        name.getClass();
        Collection collectionMo5513a = c1458zM5585a1.mo5513a(name, EnumC9470d.f32176t);
        if ((collectionMo5513a instanceof Collection) && collectionMo5513a.isEmpty()) {
            return false;
        }
        Iterator it = collectionMo5513a.iterator();
        while (it.hasNext()) {
            if (AbstractC1061t.m3842c(AbstractC2909c0.m10562c((InterfaceC6000f1) it.next(), false, false, 3, null), strM10562c)) {
                return true;
            }
        }
        return false;
    }

    @Override // p258r9.InterfaceC6545a
    /* JADX INFO: renamed from: e */
    public Collection mo22955e(InterfaceC5995e interfaceC5995e) {
        interfaceC5995e.getClass();
        C5693d c5693dM35861p = AbstractC9211e.m35861p(interfaceC5995e);
        C5688x c5688x = C5688x.f17878a;
        return c5688x.m22977j(c5693dM35861p) ? AbstractC5114x.m20803r(m22959v(), this.f17860d) : c5688x.m22978k(c5693dM35861p) ? AbstractC5112w.m20789e(this.f17860d) : AbstractC5114x.m20800o();
    }

    /* JADX INFO: renamed from: p */
    public final InterfaceC6000f1 m22956p(C2084m c2084m, InterfaceC6000f1 interfaceC6000f1) {
        InterfaceC6056z.a aVarMo12638y = interfaceC6000f1.mo12638y();
        aVarMo12638y.mo12648j(c2084m);
        aVarMo12638y.mo12657s(AbstractC6040t.f18986e);
        aVarMo12638y.mo12649k(c2084m.mo7508x());
        aVarMo12638y.mo12647i(c2084m.mo23999P0());
        InterfaceC6056z interfaceC6056zBuild = aVarMo12638y.build();
        interfaceC6056zBuild.getClass();
        return (InterfaceC6000f1) interfaceC6056zBuild;
    }

    /* JADX INFO: renamed from: q */
    public final AbstractC2706r0 m22957q(InterfaceC2412n interfaceC2412n) {
        C7221k c7221k = new C7221k(new c(this.f17857a, new C5692c("java.io")), C5695f.m23027j("Serializable"), EnumC5996e0.f18939u, EnumC5998f.f18949s, AbstractC5112w.m20789e(new C2724x0(interfaceC2412n, new C5679o(this))), InterfaceC6003g1.f18958a, false, interfaceC2412n);
        c7221k.m28512Q0(InterfaceC9913k.b.f33436b, AbstractC5068b1.m20483e(), null);
        AbstractC2650c1 abstractC2650c1Mo7508x = c7221k.mo7508x();
        abstractC2650c1Mo7508x.getClass();
        return abstractC2650c1Mo7508x;
    }

    /* JADX INFO: renamed from: t */
    public final Collection m22958t(InterfaceC5995e interfaceC5995e, InterfaceC0184l interfaceC0184l) {
        C1434n c1434nM22961z = m22961z(interfaceC5995e);
        if (c1434nM22961z == null) {
            return AbstractC5114x.m20800o();
        }
        Collection collectionM22906g = this.f17858b.m22906g(AbstractC9211e.m35860o(c1434nM22961z), C5666b.f17794h.m22879a());
        InterfaceC5995e interfaceC5995e2 = (InterfaceC5995e) AbstractC5081g0.m20588v0(collectionM22906g);
        if (interfaceC5995e2 == null) {
            return AbstractC5114x.m20800o();
        }
        C6380k.b bVar = C6380k.f20125s;
        ArrayList arrayList = new ArrayList(AbstractC5116y.m20814z(collectionM22906g, 10));
        Iterator it = collectionM22906g.iterator();
        while (it.hasNext()) {
            arrayList.add(AbstractC9211e.m35860o((InterfaceC5995e) it.next()));
        }
        C6380k c6380kM25382b = bVar.m25382b(arrayList);
        boolean zM22903c = this.f17858b.m22903c(interfaceC5995e);
        InterfaceC9913k interfaceC9913kMo5571H0 = ((InterfaceC5995e) this.f17862f.mo8651a(AbstractC9211e.m35860o(c1434nM22961z), new C5681q(c1434nM22961z, interfaceC5995e2))).mo5571H0();
        interfaceC9913kMo5571H0.getClass();
        Iterable iterable = (Iterable) interfaceC0184l.mo27m(interfaceC9913kMo5571H0);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : iterable) {
            InterfaceC6000f1 interfaceC6000f1 = (InterfaceC6000f1) obj;
            if (interfaceC6000f1.mo12678j() == InterfaceC5986b.a.DECLARATION && interfaceC6000f1.mo5587g().m24095d() && !AbstractC5128i.m20878l0(interfaceC6000f1)) {
                Collection collectionMo12674e = interfaceC6000f1.mo12674e();
                collectionMo12674e.getClass();
                Collection collection = collectionMo12674e;
                if (!(collection instanceof Collection) || !collection.isEmpty()) {
                    Iterator it2 = collection.iterator();
                    while (it2.hasNext()) {
                        InterfaceC6019m interfaceC6019mMo7443b = ((InterfaceC6056z) it2.next()).mo7443b();
                        interfaceC6019mMo7443b.getClass();
                        if (c6380kM25382b.contains(AbstractC9211e.m35860o(interfaceC6019mMo7443b))) {
                            break;
                        }
                    }
                }
                if (!m22949E(interfaceC6000f1, zM22903c)) {
                    arrayList2.add(obj);
                }
            }
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: v */
    public final AbstractC2650c1 m22959v() {
        return (AbstractC2650c1) AbstractC2411m.m8702a(this.f17861e, this, f17856i[1]);
    }

    @Override // p258r9.InterfaceC6545a
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public Set mo22951a(InterfaceC5995e interfaceC5995e) {
        C1458z c1458zM5585a1;
        Set setMo5514b;
        interfaceC5995e.getClass();
        if (!m22948D().m22926b()) {
            return AbstractC5068b1.m20483e();
        }
        C1434n c1434nM22961z = m22961z(interfaceC5995e);
        return (c1434nM22961z == null || (c1458zM5585a1 = c1434nM22961z.mo5571H0()) == null || (setMo5514b = c1458zM5585a1.mo5514b()) == null) ? AbstractC5068b1.m20483e() : setMo5514b;
    }

    /* JADX INFO: renamed from: z */
    public final C1434n m22961z(InterfaceC5995e interfaceC5995e) {
        C5691b c5691bM22893n;
        C5692c c5692cM22982a;
        if (AbstractC5128i.m20865b0(interfaceC5995e) || !AbstractC5128i.m20857C0(interfaceC5995e)) {
            return null;
        }
        C5693d c5693dM35861p = AbstractC9211e.m35861p(interfaceC5995e);
        if (c5693dM35861p.m23010f() && (c5691bM22893n = C5667c.f17796a.m22893n(c5693dM35861p)) != null && (c5692cM22982a = c5691bM22893n.m22982a()) != null) {
            InterfaceC5995e interfaceC5995eM24063d = AbstractC6037s.m24063d(m22948D().m22925a(), c5692cM22982a, EnumC9470d.f32176t);
            if (interfaceC5995eM24063d instanceof C1434n) {
                return (C1434n) interfaceC5995eM24063d;
            }
        }
        return null;
    }
}
