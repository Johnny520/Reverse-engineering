package p244qb;

/* JADX INFO: renamed from: qb.l */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6381l {

    /* JADX INFO: renamed from: a */
    public static final Object f20131a = new a();

    /* JADX INFO: renamed from: b */
    public static volatile boolean f20132b = false;

    /* JADX INFO: renamed from: qb.l$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class a {
        public String toString() {
            return "NULL_VALUE";
        }
    }

    /* JADX INFO: renamed from: qb.l$c */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class c extends RuntimeException {
        public c(Throwable th) {
            super("Rethrow stored exception", th);
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m25384a(int i10) {
        String str = (i10 == 1 || i10 == 2) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 1 || i10 == 2) ? 2 : 3];
        if (i10 == 1 || i10 == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/utils/WrappedValues";
        } else if (i10 != 3) {
            objArr[0] = "value";
        } else {
            objArr[0] = "throwable";
        }
        if (i10 == 1 || i10 == 2) {
            objArr[1] = "escapeNull";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/WrappedValues";
        }
        if (i10 != 1 && i10 != 2) {
            if (i10 == 3) {
                objArr[2] = "escapeThrowable";
            } else if (i10 != 4) {
                objArr[2] = "unescapeNull";
            } else {
                objArr[2] = "unescapeExceptionOrNull";
            }
        }
        String str2 = String.format(str, objArr);
        if (i10 != 1 && i10 != 2) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    /* JADX INFO: renamed from: b */
    public static Object m25385b(Object obj) {
        if (obj == null && (obj = f20131a) == null) {
            m25384a(1);
        }
        return obj;
    }

    /* JADX INFO: renamed from: c */
    public static Object m25386c(Throwable th) {
        if (th == null) {
            m25384a(3);
        }
        return new b(th, null);
    }

    /* JADX INFO: renamed from: d */
    public static Object m25387d(Object obj) {
        if (obj == null) {
            m25384a(4);
        }
        return m25388e(m25389f(obj));
    }

    /* JADX INFO: renamed from: e */
    public static Object m25388e(Object obj) {
        if (obj == null) {
            m25384a(0);
        }
        if (obj == f20131a) {
            return null;
        }
        return obj;
    }

    /* JADX INFO: renamed from: f */
    public static Object m25389f(Object obj) {
        if (!(obj instanceof b)) {
            return obj;
        }
        Throwable thM25391b = ((b) obj).m25391b();
        if (f20132b && AbstractC6372c.m25355a(thM25391b)) {
            throw new c(thM25391b);
        }
        throw AbstractC6372c.m25356b(thM25391b);
    }

    /* JADX INFO: renamed from: qb.l$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public final Throwable f20133a;

        public b(Throwable th) {
            if (th == null) {
                m25390a(0);
            }
            this.f20133a = th;
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m25390a(int i10) {
            String str = i10 != 1 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i10 != 1 ? 3 : 2];
            if (i10 != 1) {
                objArr[0] = "throwable";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/utils/WrappedValues$ThrowableWrapper";
            }
            if (i10 != 1) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/WrappedValues$ThrowableWrapper";
            } else {
                objArr[1] = "getThrowable";
            }
            if (i10 != 1) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i10 == 1) {
                throw new IllegalStateException(str2);
            }
        }

        /* JADX INFO: renamed from: b */
        public Throwable m25391b() {
            Throwable th = this.f20133a;
            if (th == null) {
                m25390a(1);
            }
            return th;
        }

        public String toString() {
            return this.f20133a.toString();
        }

        public /* synthetic */ b(Throwable th, a aVar) {
            this(th);
        }
    }
}
