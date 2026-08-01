package p358y9;

import java.util.HashMap;
import java.util.Map;
import p012ab.InterfaceC0210g;
import p229p9.AbstractC6034r;
import p229p9.AbstractC6040t;
import p229p9.AbstractC6043u;
import p229p9.AbstractC6051w1;
import p229p9.InterfaceC6019m;
import p229p9.InterfaceC6023n0;
import p229p9.InterfaceC6031q;
import p284t9.C8206a;
import p284t9.C8207b;
import p284t9.C8208c;
import sa.AbstractC7259i;

/* JADX INFO: renamed from: y9.y */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC9654y {

    /* JADX INFO: renamed from: a */
    public static final AbstractC6043u f32886a;

    /* JADX INFO: renamed from: b */
    public static final AbstractC6043u f32887b;

    /* JADX INFO: renamed from: c */
    public static final AbstractC6043u f32888c;

    /* JADX INFO: renamed from: d */
    public static final Map f32889d;

    /* JADX INFO: renamed from: y9.y$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class a extends AbstractC6034r {
        public a(AbstractC6051w1 abstractC6051w1) {
            super(abstractC6051w1);
        }

        /* JADX INFO: renamed from: g */
        private static /* synthetic */ void m37769g(int i10) {
            Object[] objArr = new Object[3];
            if (i10 == 1) {
                objArr[0] = "from";
            } else if (i10 == 2) {
                objArr[0] = "fromPackage";
            } else if (i10 != 3) {
                objArr[0] = "what";
            } else {
                objArr[0] = "myPackage";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$1";
            if (i10 == 2 || i10 == 3) {
                objArr[2] = "visibleFromPackage";
            } else {
                objArr[2] = "isVisible";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // p229p9.AbstractC6043u
        /* JADX INFO: renamed from: e */
        public boolean mo24083e(InterfaceC0210g interfaceC0210g, InterfaceC6031q interfaceC6031q, InterfaceC6019m interfaceC6019m, boolean z10) {
            if (interfaceC6031q == null) {
                m37769g(0);
            }
            if (interfaceC6019m == null) {
                m37769g(1);
            }
            return AbstractC9654y.m37765d(interfaceC6031q, interfaceC6019m);
        }
    }

    /* JADX INFO: renamed from: y9.y$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class b extends AbstractC6034r {
        public b(AbstractC6051w1 abstractC6051w1) {
            super(abstractC6051w1);
        }

        /* JADX INFO: renamed from: g */
        private static /* synthetic */ void m37770g(int i10) {
            Object[] objArr = new Object[3];
            if (i10 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$2";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // p229p9.AbstractC6043u
        /* JADX INFO: renamed from: e */
        public boolean mo24083e(InterfaceC0210g interfaceC0210g, InterfaceC6031q interfaceC6031q, InterfaceC6019m interfaceC6019m, boolean z10) {
            if (interfaceC6031q == null) {
                m37770g(0);
            }
            if (interfaceC6019m == null) {
                m37770g(1);
            }
            return AbstractC9654y.m37766e(interfaceC0210g, interfaceC6031q, interfaceC6019m);
        }
    }

    /* JADX INFO: renamed from: y9.y$c */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class c extends AbstractC6034r {
        public c(AbstractC6051w1 abstractC6051w1) {
            super(abstractC6051w1);
        }

        /* JADX INFO: renamed from: g */
        private static /* synthetic */ void m37771g(int i10) {
            Object[] objArr = new Object[3];
            if (i10 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$3";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // p229p9.AbstractC6043u
        /* JADX INFO: renamed from: e */
        public boolean mo24083e(InterfaceC0210g interfaceC0210g, InterfaceC6031q interfaceC6031q, InterfaceC6019m interfaceC6019m, boolean z10) {
            if (interfaceC6031q == null) {
                m37771g(0);
            }
            if (interfaceC6019m == null) {
                m37771g(1);
            }
            return AbstractC9654y.m37766e(interfaceC0210g, interfaceC6031q, interfaceC6019m);
        }
    }

    static {
        a aVar = new a(C8206a.f27517c);
        f32886a = aVar;
        b bVar = new b(C8208c.f27519c);
        f32887b = bVar;
        c cVar = new c(C8207b.f27518c);
        f32888c = cVar;
        f32889d = new HashMap();
        m37767f(aVar);
        m37767f(bVar);
        m37767f(cVar);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m37762a(int i10) {
        String str = (i10 == 5 || i10 == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 5 || i10 == 6) ? 2 : 3];
        switch (i10) {
            case 1:
                objArr[0] = "from";
                break;
            case 2:
                objArr[0] = "first";
                break;
            case 3:
                objArr[0] = "second";
                break;
            case 4:
                objArr[0] = "visibility";
                break;
            case 5:
            case 6:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities";
                break;
            default:
                objArr[0] = "what";
                break;
        }
        if (i10 == 5 || i10 == 6) {
            objArr[1] = "toDescriptorVisibility";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities";
        }
        if (i10 == 2 || i10 == 3) {
            objArr[2] = "areInSamePackage";
        } else if (i10 == 4) {
            objArr[2] = "toDescriptorVisibility";
        } else if (i10 != 5 && i10 != 6) {
            objArr[2] = "isVisibleForProtectedAndPackage";
        }
        String str2 = String.format(str, objArr);
        if (i10 != 5 && i10 != 6) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    /* JADX INFO: renamed from: d */
    public static boolean m37765d(InterfaceC6019m interfaceC6019m, InterfaceC6019m interfaceC6019m2) {
        if (interfaceC6019m == null) {
            m37762a(2);
        }
        if (interfaceC6019m2 == null) {
            m37762a(3);
        }
        InterfaceC6023n0 interfaceC6023n0 = (InterfaceC6023n0) AbstractC7259i.m28765r(interfaceC6019m, InterfaceC6023n0.class, false);
        InterfaceC6023n0 interfaceC6023n02 = (InterfaceC6023n0) AbstractC7259i.m28765r(interfaceC6019m2, InterfaceC6023n0.class, false);
        return (interfaceC6023n02 == null || interfaceC6023n0 == null || !interfaceC6023n0.mo24031d().equals(interfaceC6023n02.mo24031d())) ? false : true;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m37766e(InterfaceC0210g interfaceC0210g, InterfaceC6031q interfaceC6031q, InterfaceC6019m interfaceC6019m) {
        if (interfaceC6031q == null) {
            m37762a(0);
        }
        if (interfaceC6019m == null) {
            m37762a(1);
        }
        if (m37765d(AbstractC7259i.m28747M(interfaceC6031q), interfaceC6019m)) {
            return true;
        }
        return AbstractC6040t.f18984c.mo24083e(interfaceC0210g, interfaceC6031q, interfaceC6019m, false);
    }

    /* JADX INFO: renamed from: f */
    public static void m37767f(AbstractC6043u abstractC6043u) {
        f32889d.put(abstractC6043u.mo24053b(), abstractC6043u);
    }

    /* JADX INFO: renamed from: g */
    public static AbstractC6043u m37768g(AbstractC6051w1 abstractC6051w1) {
        if (abstractC6051w1 == null) {
            m37762a(4);
        }
        AbstractC6043u abstractC6043u = (AbstractC6043u) f32889d.get(abstractC6051w1);
        if (abstractC6043u != null) {
            return abstractC6043u;
        }
        AbstractC6043u abstractC6043uM24081j = AbstractC6040t.m24081j(abstractC6051w1);
        if (abstractC6043uM24081j == null) {
            m37762a(5);
        }
        return abstractC6043uM24081j;
    }
}
