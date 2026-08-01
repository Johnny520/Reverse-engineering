package p229p9;

import ae.C0307f;
import gb.AbstractC2657e0;
import gb.AbstractC2706r0;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.ServiceLoader;
import java.util.Set;
import p012ab.InterfaceC0210g;
import p012ab.InterfaceC0211h;
import p185m8.AbstractC5068b1;
import p200nb.InterfaceC5547l;
import p229p9.C6048v1;
import p244qb.AbstractC6370a;
import p273s9.InterfaceC7234q0;
import sa.AbstractC7259i;

/* JADX INFO: renamed from: p9.t */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6040t {

    /* JADX INFO: renamed from: a */
    public static final AbstractC6043u f18982a;

    /* JADX INFO: renamed from: b */
    public static final AbstractC6043u f18983b;

    /* JADX INFO: renamed from: c */
    public static final AbstractC6043u f18984c;

    /* JADX INFO: renamed from: d */
    public static final AbstractC6043u f18985d;

    /* JADX INFO: renamed from: e */
    public static final AbstractC6043u f18986e;

    /* JADX INFO: renamed from: f */
    public static final AbstractC6043u f18987f;

    /* JADX INFO: renamed from: g */
    public static final AbstractC6043u f18988g;

    /* JADX INFO: renamed from: h */
    public static final AbstractC6043u f18989h;

    /* JADX INFO: renamed from: i */
    public static final AbstractC6043u f18990i;

    /* JADX INFO: renamed from: j */
    public static final Set f18991j;

    /* JADX INFO: renamed from: k */
    public static final Map f18992k;

    /* JADX INFO: renamed from: l */
    public static final AbstractC6043u f18993l;

    /* JADX INFO: renamed from: m */
    public static final InterfaceC0210g f18994m;

    /* JADX INFO: renamed from: n */
    public static final InterfaceC0210g f18995n;

    /* JADX INFO: renamed from: o */
    public static final InterfaceC0210g f18996o;

    /* JADX INFO: renamed from: p */
    public static final InterfaceC5547l f18997p;

    /* JADX INFO: renamed from: q */
    public static final Map f18998q;

    /* JADX INFO: renamed from: p9.t$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class a implements InterfaceC0210g {
        @Override // p012ab.InterfaceC0210g
        public AbstractC2706r0 getType() {
            throw new IllegalStateException("This method should not be called");
        }
    }

    /* JADX INFO: renamed from: p9.t$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class b implements InterfaceC0210g {
        @Override // p012ab.InterfaceC0210g
        public AbstractC2706r0 getType() {
            throw new IllegalStateException("This method should not be called");
        }
    }

    /* JADX INFO: renamed from: p9.t$c */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class c implements InterfaceC0210g {
        @Override // p012ab.InterfaceC0210g
        public AbstractC2706r0 getType() {
            throw new IllegalStateException("This method should not be called");
        }
    }

    /* JADX INFO: renamed from: p9.t$d */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class d extends AbstractC6034r {
        public d(AbstractC6051w1 abstractC6051w1) {
            super(abstractC6051w1);
        }

        /* JADX INFO: renamed from: g */
        public static /* synthetic */ void m24082g(int i10) {
            Object[] objArr = new Object[3];
            if (i10 == 1) {
                objArr[0] = "what";
            } else if (i10 != 2) {
                objArr[0] = "descriptor";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$1";
            if (i10 == 1 || i10 == 2) {
                objArr[2] = "isVisible";
            } else {
                objArr[2] = "hasContainingSourceFile";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p229p9.AbstractC6043u
        /* JADX INFO: renamed from: e */
        public boolean mo24083e(InterfaceC0210g interfaceC0210g, InterfaceC6031q interfaceC6031q, InterfaceC6019m interfaceC6019m, boolean z10) {
            if (interfaceC6031q == 0) {
                m24082g(1);
            }
            if (interfaceC6019m == null) {
                m24082g(2);
            }
            if (AbstractC7259i.m28744J(interfaceC6031q) && m24084h(interfaceC6019m)) {
                return AbstractC6040t.m24077f(interfaceC6031q, interfaceC6019m);
            }
            if (interfaceC6031q instanceof InterfaceC6016l) {
                InterfaceC6007i interfaceC6007iMo7443b = ((InterfaceC6016l) interfaceC6031q).mo7443b();
                if (z10 && AbstractC7259i.m28741G(interfaceC6007iMo7443b) && AbstractC7259i.m28744J(interfaceC6007iMo7443b) && (interfaceC6019m instanceof InterfaceC6016l) && AbstractC7259i.m28744J(interfaceC6019m.mo7443b()) && AbstractC6040t.m24077f(interfaceC6031q, interfaceC6019m)) {
                    return true;
                }
            }
            while (interfaceC6031q != 0) {
                interfaceC6031q = interfaceC6031q.mo7443b();
                if (((interfaceC6031q instanceof InterfaceC5995e) && !AbstractC7259i.m28771x(interfaceC6031q)) || (interfaceC6031q instanceof InterfaceC6023n0)) {
                    break;
                }
            }
            if (interfaceC6031q == 0) {
                return false;
            }
            while (interfaceC6019m != null) {
                if (interfaceC6031q == interfaceC6019m) {
                    return true;
                }
                if (interfaceC6019m instanceof InterfaceC6023n0) {
                    return (interfaceC6031q instanceof InterfaceC6023n0) && ((InterfaceC6023n0) interfaceC6031q).mo24031d().equals(((InterfaceC6023n0) interfaceC6019m).mo24031d()) && AbstractC7259i.m28749b(interfaceC6019m, interfaceC6031q);
                }
                interfaceC6019m = interfaceC6019m.mo7443b();
            }
            return false;
        }

        /* JADX INFO: renamed from: h */
        public final boolean m24084h(InterfaceC6019m interfaceC6019m) {
            if (interfaceC6019m == null) {
                m24082g(0);
            }
            return AbstractC7259i.m28757j(interfaceC6019m) != InterfaceC6006h1.f18959a;
        }
    }

    /* JADX INFO: renamed from: p9.t$e */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class e extends AbstractC6034r {
        public e(AbstractC6051w1 abstractC6051w1) {
            super(abstractC6051w1);
        }

        /* JADX INFO: renamed from: g */
        private static /* synthetic */ void m24085g(int i10) {
            Object[] objArr = new Object[3];
            if (i10 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$2";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // p229p9.AbstractC6043u
        /* JADX INFO: renamed from: e */
        public boolean mo24083e(InterfaceC0210g interfaceC0210g, InterfaceC6031q interfaceC6031q, InterfaceC6019m interfaceC6019m, boolean z10) {
            InterfaceC6019m interfaceC6019mM28764q;
            if (interfaceC6031q == null) {
                m24085g(0);
            }
            if (interfaceC6019m == null) {
                m24085g(1);
            }
            if (AbstractC6040t.f18982a.mo24083e(interfaceC0210g, interfaceC6031q, interfaceC6019m, z10)) {
                if (interfaceC0210g == AbstractC6040t.f18995n) {
                    return true;
                }
                if (interfaceC0210g != AbstractC6040t.f18994m && (interfaceC6019mM28764q = AbstractC7259i.m28764q(interfaceC6031q, InterfaceC5995e.class)) != null && (interfaceC0210g instanceof InterfaceC0211h)) {
                    return ((InterfaceC0211h) interfaceC0210g).mo447w().mo12664a().equals(interfaceC6019mM28764q.mo12664a());
                }
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: p9.t$f */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class f extends AbstractC6034r {
        public f(AbstractC6051w1 abstractC6051w1) {
            super(abstractC6051w1);
        }

        /* JADX INFO: renamed from: g */
        private static /* synthetic */ void m24086g(int i10) {
            Object[] objArr = new Object[3];
            if (i10 == 1) {
                objArr[0] = "from";
            } else if (i10 == 2) {
                objArr[0] = "whatDeclaration";
            } else if (i10 != 3) {
                objArr[0] = "what";
            } else {
                objArr[0] = "fromClass";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$3";
            if (i10 == 2 || i10 == 3) {
                objArr[2] = "doesReceiverFitForProtectedVisibility";
            } else {
                objArr[2] = "isVisible";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // p229p9.AbstractC6043u
        /* JADX INFO: renamed from: e */
        public boolean mo24083e(InterfaceC0210g interfaceC0210g, InterfaceC6031q interfaceC6031q, InterfaceC6019m interfaceC6019m, boolean z10) {
            InterfaceC5995e interfaceC5995e;
            if (interfaceC6031q == null) {
                m24086g(0);
            }
            if (interfaceC6019m == null) {
                m24086g(1);
            }
            InterfaceC5995e interfaceC5995e2 = (InterfaceC5995e) AbstractC7259i.m28764q(interfaceC6031q, InterfaceC5995e.class);
            InterfaceC5995e interfaceC5995e3 = (InterfaceC5995e) AbstractC7259i.m28765r(interfaceC6019m, InterfaceC5995e.class, false);
            if (interfaceC5995e3 == null) {
                return false;
            }
            if (interfaceC5995e2 != null && AbstractC7259i.m28771x(interfaceC5995e2) && (interfaceC5995e = (InterfaceC5995e) AbstractC7259i.m28764q(interfaceC5995e2, InterfaceC5995e.class)) != null && AbstractC7259i.m28742H(interfaceC5995e3, interfaceC5995e)) {
                return true;
            }
            InterfaceC6031q interfaceC6031qM28747M = AbstractC7259i.m28747M(interfaceC6031q);
            InterfaceC5995e interfaceC5995e4 = (InterfaceC5995e) AbstractC7259i.m28764q(interfaceC6031qM28747M, InterfaceC5995e.class);
            if (interfaceC5995e4 == null) {
                return false;
            }
            if (AbstractC7259i.m28742H(interfaceC5995e3, interfaceC5995e4) && m24087h(interfaceC0210g, interfaceC6031qM28747M, interfaceC5995e3)) {
                return true;
            }
            return mo24083e(interfaceC0210g, interfaceC6031q, interfaceC5995e3.mo7443b(), z10);
        }

        /* JADX INFO: renamed from: h */
        public final boolean m24087h(InterfaceC0210g interfaceC0210g, InterfaceC6031q interfaceC6031q, InterfaceC5995e interfaceC5995e) {
            if (interfaceC6031q == null) {
                m24086g(2);
            }
            if (interfaceC5995e == null) {
                m24086g(3);
            }
            if (interfaceC0210g == AbstractC6040t.f18996o) {
                return false;
            }
            if (!(interfaceC6031q instanceof InterfaceC5986b) || (interfaceC6031q instanceof InterfaceC6016l) || interfaceC0210g == AbstractC6040t.f18995n) {
                return true;
            }
            if (interfaceC0210g == AbstractC6040t.f18994m || interfaceC0210g == null) {
                return false;
            }
            AbstractC2706r0 type = interfaceC0210g.getType();
            return AbstractC7259i.m28743I(type, interfaceC5995e) || AbstractC2657e0.m9364a(type);
        }
    }

    /* JADX INFO: renamed from: p9.t$g */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class g extends AbstractC6034r {
        public g(AbstractC6051w1 abstractC6051w1) {
            super(abstractC6051w1);
        }

        /* JADX INFO: renamed from: g */
        private static /* synthetic */ void m24088g(int i10) {
            Object[] objArr = new Object[3];
            if (i10 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$4";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // p229p9.AbstractC6043u
        /* JADX INFO: renamed from: e */
        public boolean mo24083e(InterfaceC0210g interfaceC0210g, InterfaceC6031q interfaceC6031q, InterfaceC6019m interfaceC6019m, boolean z10) {
            if (interfaceC6031q == null) {
                m24088g(0);
            }
            if (interfaceC6019m == null) {
                m24088g(1);
            }
            if (AbstractC7259i.m28754g(interfaceC6019m).mo12665b0(AbstractC7259i.m28754g(interfaceC6031q))) {
                return AbstractC6040t.f18997p.mo22581a(interfaceC6031q, interfaceC6019m);
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: p9.t$h */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class h extends AbstractC6034r {
        public h(AbstractC6051w1 abstractC6051w1) {
            super(abstractC6051w1);
        }

        /* JADX INFO: renamed from: g */
        private static /* synthetic */ void m24089g(int i10) {
            Object[] objArr = new Object[3];
            if (i10 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$5";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // p229p9.AbstractC6043u
        /* JADX INFO: renamed from: e */
        public boolean mo24083e(InterfaceC0210g interfaceC0210g, InterfaceC6031q interfaceC6031q, InterfaceC6019m interfaceC6019m, boolean z10) {
            if (interfaceC6031q == null) {
                m24089g(0);
            }
            if (interfaceC6019m == null) {
                m24089g(1);
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: p9.t$i */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class i extends AbstractC6034r {
        public i(AbstractC6051w1 abstractC6051w1) {
            super(abstractC6051w1);
        }

        /* JADX INFO: renamed from: g */
        private static /* synthetic */ void m24090g(int i10) {
            Object[] objArr = new Object[3];
            if (i10 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$6";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // p229p9.AbstractC6043u
        /* JADX INFO: renamed from: e */
        public boolean mo24083e(InterfaceC0210g interfaceC0210g, InterfaceC6031q interfaceC6031q, InterfaceC6019m interfaceC6019m, boolean z10) {
            if (interfaceC6031q == null) {
                m24090g(0);
            }
            if (interfaceC6019m == null) {
                m24090g(1);
            }
            throw new IllegalStateException("This method shouldn't be invoked for LOCAL visibility");
        }
    }

    /* JADX INFO: renamed from: p9.t$j */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class j extends AbstractC6034r {
        public j(AbstractC6051w1 abstractC6051w1) {
            super(abstractC6051w1);
        }

        /* JADX INFO: renamed from: g */
        private static /* synthetic */ void m24091g(int i10) {
            Object[] objArr = new Object[3];
            if (i10 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$7";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // p229p9.AbstractC6043u
        /* JADX INFO: renamed from: e */
        public boolean mo24083e(InterfaceC0210g interfaceC0210g, InterfaceC6031q interfaceC6031q, InterfaceC6019m interfaceC6019m, boolean z10) {
            if (interfaceC6031q == null) {
                m24091g(0);
            }
            if (interfaceC6019m == null) {
                m24091g(1);
            }
            throw new IllegalStateException("Visibility is unknown yet");
        }
    }

    /* JADX INFO: renamed from: p9.t$k */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class k extends AbstractC6034r {
        public k(AbstractC6051w1 abstractC6051w1) {
            super(abstractC6051w1);
        }

        /* JADX INFO: renamed from: g */
        private static /* synthetic */ void m24092g(int i10) {
            Object[] objArr = new Object[3];
            if (i10 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$8";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // p229p9.AbstractC6043u
        /* JADX INFO: renamed from: e */
        public boolean mo24083e(InterfaceC0210g interfaceC0210g, InterfaceC6031q interfaceC6031q, InterfaceC6019m interfaceC6019m, boolean z10) {
            if (interfaceC6031q == null) {
                m24092g(0);
            }
            if (interfaceC6019m == null) {
                m24092g(1);
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: p9.t$l */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class l extends AbstractC6034r {
        public l(AbstractC6051w1 abstractC6051w1) {
            super(abstractC6051w1);
        }

        /* JADX INFO: renamed from: g */
        private static /* synthetic */ void m24093g(int i10) {
            Object[] objArr = new Object[3];
            if (i10 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$9";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // p229p9.AbstractC6043u
        /* JADX INFO: renamed from: e */
        public boolean mo24083e(InterfaceC0210g interfaceC0210g, InterfaceC6031q interfaceC6031q, InterfaceC6019m interfaceC6019m, boolean z10) {
            if (interfaceC6031q == null) {
                m24093g(0);
            }
            if (interfaceC6019m == null) {
                m24093g(1);
            }
            return false;
        }
    }

    static {
        d dVar = new d(C6048v1.e.f19007c);
        f18982a = dVar;
        e eVar = new e(C6048v1.f.f19008c);
        f18983b = eVar;
        f fVar = new f(C6048v1.g.f19009c);
        f18984c = fVar;
        g gVar = new g(C6048v1.b.f19004c);
        f18985d = gVar;
        h hVar = new h(C6048v1.h.f19010c);
        f18986e = hVar;
        i iVar = new i(C6048v1.d.f19006c);
        f18987f = iVar;
        j jVar = new j(C6048v1.a.f19003c);
        f18988g = jVar;
        k kVar = new k(C6048v1.c.f19005c);
        f18989h = kVar;
        l lVar = new l(C6048v1.i.f19011c);
        f18990i = lVar;
        f18991j = Collections.unmodifiableSet(AbstractC5068b1.m20487i(dVar, eVar, gVar, iVar));
        HashMap mapM25343e = AbstractC6370a.m25343e(4);
        mapM25343e.put(eVar, 0);
        mapM25343e.put(dVar, 0);
        mapM25343e.put(gVar, 1);
        mapM25343e.put(fVar, 1);
        mapM25343e.put(hVar, 2);
        f18992k = Collections.unmodifiableMap(mapM25343e);
        f18993l = hVar;
        f18994m = new a();
        f18995n = new b();
        f18996o = new c();
        Iterator it = ServiceLoader.load(InterfaceC5547l.class, InterfaceC5547l.class.getClassLoader()).iterator();
        f18997p = it.hasNext() ? (InterfaceC5547l) it.next() : InterfaceC5547l.a.f17337a;
        f18998q = new HashMap();
        m24080i(dVar);
        m24080i(eVar);
        m24080i(fVar);
        m24080i(gVar);
        m24080i(hVar);
        m24080i(iVar);
        m24080i(jVar);
        m24080i(kVar);
        m24080i(lVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x003a  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void m24072a(int r8) {
        /*
            r0 = 16
            if (r8 == r0) goto L7
            java.lang.String r1 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            goto L9
        L7:
            java.lang.String r1 = "@NotNull method %s.%s must not return null"
        L9:
            r2 = 3
            r3 = 2
            if (r8 == r0) goto Lf
            r4 = r2
            goto L10
        Lf:
            r4 = r3
        L10:
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.String r5 = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities"
            r6 = 1
            r7 = 0
            if (r8 == r6) goto L3a
            if (r8 == r2) goto L3a
            r2 = 5
            if (r8 == r2) goto L3a
            r2 = 7
            if (r8 == r2) goto L3a
            switch(r8) {
                case 9: goto L3a;
                case 10: goto L35;
                case 11: goto L30;
                case 12: goto L35;
                case 13: goto L30;
                case 14: goto L2b;
                case 15: goto L2b;
                case 16: goto L28;
                default: goto L23;
            }
        L23:
            java.lang.String r2 = "what"
            r4[r7] = r2
            goto L3e
        L28:
            r4[r7] = r5
            goto L3e
        L2b:
            java.lang.String r2 = "visibility"
            r4[r7] = r2
            goto L3e
        L30:
            java.lang.String r2 = "second"
            r4[r7] = r2
            goto L3e
        L35:
            java.lang.String r2 = "first"
            r4[r7] = r2
            goto L3e
        L3a:
            java.lang.String r2 = "from"
            r4[r7] = r2
        L3e:
            java.lang.String r2 = "toDescriptorVisibility"
            if (r8 == r0) goto L45
            r4[r6] = r5
            goto L47
        L45:
            r4[r6] = r2
        L47:
            switch(r8) {
                case 2: goto L70;
                case 3: goto L70;
                case 4: goto L6b;
                case 5: goto L6b;
                case 6: goto L66;
                case 7: goto L66;
                case 8: goto L61;
                case 9: goto L61;
                case 10: goto L5c;
                case 11: goto L5c;
                case 12: goto L57;
                case 13: goto L57;
                case 14: goto L52;
                case 15: goto L4f;
                case 16: goto L74;
                default: goto L4a;
            }
        L4a:
            java.lang.String r2 = "isVisible"
            r4[r3] = r2
            goto L74
        L4f:
            r4[r3] = r2
            goto L74
        L52:
            java.lang.String r2 = "isPrivate"
            r4[r3] = r2
            goto L74
        L57:
            java.lang.String r2 = "compare"
            r4[r3] = r2
            goto L74
        L5c:
            java.lang.String r2 = "compareLocal"
            r4[r3] = r2
            goto L74
        L61:
            java.lang.String r2 = "findInvisibleMember"
            r4[r3] = r2
            goto L74
        L66:
            java.lang.String r2 = "inSameFile"
            r4[r3] = r2
            goto L74
        L6b:
            java.lang.String r2 = "isVisibleWithAnyReceiver"
            r4[r3] = r2
            goto L74
        L70:
            java.lang.String r2 = "isVisibleIgnoringReceiver"
            r4[r3] = r2
        L74:
            java.lang.String r1 = java.lang.String.format(r1, r4)
            if (r8 == r0) goto L80
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            r8.<init>(r1)
            goto L85
        L80:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>(r1)
        L85:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p229p9.AbstractC6040t.m24072a(int):void");
    }

    /* JADX INFO: renamed from: d */
    public static Integer m24075d(AbstractC6043u abstractC6043u, AbstractC6043u abstractC6043u2) {
        if (abstractC6043u == null) {
            m24072a(12);
        }
        if (abstractC6043u2 == null) {
            m24072a(13);
        }
        Integer numM24094a = abstractC6043u.m24094a(abstractC6043u2);
        if (numM24094a != null) {
            return numM24094a;
        }
        Integer numM24094a2 = abstractC6043u2.m24094a(abstractC6043u);
        if (numM24094a2 != null) {
            return Integer.valueOf(-numM24094a2.intValue());
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public static InterfaceC6031q m24076e(InterfaceC0210g interfaceC0210g, InterfaceC6031q interfaceC6031q, InterfaceC6019m interfaceC6019m, boolean z10) {
        InterfaceC6031q interfaceC6031qM24076e;
        if (interfaceC6031q == null) {
            m24072a(8);
        }
        if (interfaceC6019m == null) {
            m24072a(9);
        }
        for (InterfaceC6031q interfaceC6031q2 = (InterfaceC6031q) interfaceC6031q.mo12664a(); interfaceC6031q2 != null && interfaceC6031q2.mo5587g() != f18987f; interfaceC6031q2 = (InterfaceC6031q) AbstractC7259i.m28764q(interfaceC6031q2, InterfaceC6031q.class)) {
            if (!interfaceC6031q2.mo5587g().mo24083e(interfaceC0210g, interfaceC6031q2, interfaceC6019m, z10)) {
                return interfaceC6031q2;
            }
        }
        if (!(interfaceC6031q instanceof InterfaceC7234q0) || (interfaceC6031qM24076e = m24076e(interfaceC0210g, ((InterfaceC7234q0) interfaceC6031q).mo28590t0(), interfaceC6019m, z10)) == null) {
            return null;
        }
        return interfaceC6031qM24076e;
    }

    /* JADX INFO: renamed from: f */
    public static boolean m24077f(InterfaceC6019m interfaceC6019m, InterfaceC6019m interfaceC6019m2) {
        if (interfaceC6019m == null) {
            m24072a(6);
        }
        if (interfaceC6019m2 == null) {
            m24072a(7);
        }
        InterfaceC6006h1 interfaceC6006h1M28757j = AbstractC7259i.m28757j(interfaceC6019m2);
        if (interfaceC6006h1M28757j != InterfaceC6006h1.f18959a) {
            return interfaceC6006h1M28757j.equals(AbstractC7259i.m28757j(interfaceC6019m));
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    public static boolean m24078g(AbstractC6043u abstractC6043u) {
        if (abstractC6043u == null) {
            m24072a(14);
        }
        return abstractC6043u == f18982a || abstractC6043u == f18983b;
    }

    /* JADX INFO: renamed from: h */
    public static boolean m24079h(InterfaceC6031q interfaceC6031q, InterfaceC6019m interfaceC6019m, boolean z10) {
        if (interfaceC6031q == null) {
            m24072a(2);
        }
        if (interfaceC6019m == null) {
            m24072a(3);
        }
        return m24076e(f18995n, interfaceC6031q, interfaceC6019m, z10) == null;
    }

    /* JADX INFO: renamed from: i */
    public static void m24080i(AbstractC6043u abstractC6043u) {
        f18998q.put(abstractC6043u.mo24053b(), abstractC6043u);
    }

    /* JADX INFO: renamed from: j */
    public static AbstractC6043u m24081j(AbstractC6051w1 abstractC6051w1) {
        if (abstractC6051w1 == null) {
            m24072a(15);
        }
        AbstractC6043u abstractC6043u = (AbstractC6043u) f18998q.get(abstractC6051w1);
        if (abstractC6043u != null) {
            return abstractC6043u;
        }
        C0307f.m923a("Inapplicable visibility: ", abstractC6051w1);
        return null;
    }
}
