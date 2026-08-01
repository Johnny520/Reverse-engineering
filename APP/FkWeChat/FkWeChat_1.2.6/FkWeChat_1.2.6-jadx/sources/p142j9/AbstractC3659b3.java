package p142j9;

import java.lang.ref.SoftReference;
import p010a9.InterfaceC0173a;

/* JADX INFO: renamed from: j9.b3 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3659b3 {

    /* JADX INFO: renamed from: j9.b3$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class a extends b implements InterfaceC0173a {

        /* JADX INFO: renamed from: r */
        public final InterfaceC0173a f10158r;

        /* JADX INFO: renamed from: s */
        public volatile SoftReference f10159s;

        public a(Object obj, InterfaceC0173a interfaceC0173a) {
            if (interfaceC0173a == null) {
                m13647f(0);
            }
            this.f10159s = null;
            this.f10158r = interfaceC0173a;
            if (obj != null) {
                this.f10159s = new SoftReference(m13648a(obj));
            }
        }

        /* JADX INFO: renamed from: f */
        public static /* synthetic */ void m13647f(int i10) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "initializer", "kotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal", "<init>"));
        }

        @Override // p142j9.AbstractC3659b3.b, p010a9.InterfaceC0173a
        public Object invoke() {
            Object obj;
            SoftReference softReference = this.f10159s;
            if (softReference != null && (obj = softReference.get()) != null) {
                return m13650d(obj);
            }
            Object objInvoke = this.f10158r.invoke();
            this.f10159s = new SoftReference(m13648a(objInvoke));
            return objInvoke;
        }
    }

    /* JADX INFO: renamed from: j9.b3$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static abstract class b {

        /* JADX INFO: renamed from: q */
        public static final Object f10160q = new a();

        /* JADX INFO: renamed from: j9.b3$b$a */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public static class a {
        }

        /* JADX INFO: renamed from: a */
        public Object m13648a(Object obj) {
            return obj == null ? f10160q : obj;
        }

        /* JADX INFO: renamed from: c */
        public final Object m13649c(Object obj, Object obj2) {
            return invoke();
        }

        /* JADX INFO: renamed from: d */
        public Object m13650d(Object obj) {
            if (obj == f10160q) {
                return null;
            }
            return obj;
        }

        public abstract Object invoke();
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m13644a(int i10) {
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "initializer", "kotlin/reflect/jvm/internal/ReflectProperties", "lazySoft"));
    }

    /* JADX INFO: renamed from: b */
    public static a m13645b(InterfaceC0173a interfaceC0173a) {
        if (interfaceC0173a == null) {
            m13644a(1);
        }
        return m13646c(null, interfaceC0173a);
    }

    /* JADX INFO: renamed from: c */
    public static a m13646c(Object obj, InterfaceC0173a interfaceC0173a) {
        if (interfaceC0173a == null) {
            m13644a(0);
        }
        return new a(obj, interfaceC0173a);
    }
}
