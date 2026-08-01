package p082fb;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import okhttp3.internal.url._UrlKt;
import p010a9.InterfaceC0173a;
import p010a9.InterfaceC0184l;
import p244qb.AbstractC6372c;
import p299ub.AbstractC8621f0;

/* JADX INFO: renamed from: fb.f */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public class C2404f implements InterfaceC2412n {

    /* JADX INFO: renamed from: d */
    public static final String f6515d = AbstractC8621f0.m33157p1(C2404f.class.getCanonicalName(), ".", _UrlKt.FRAGMENT_ENCODE_SET);

    /* JADX INFO: renamed from: e */
    public static final InterfaceC2412n f6516e = new a("NO_LOCKS", f.f6525a, C2403e.f6514b);

    /* JADX INFO: renamed from: a */
    public final InterfaceC2409k f6517a;

    /* JADX INFO: renamed from: b */
    public final f f6518b;

    /* JADX INFO: renamed from: c */
    public final String f6519c;

    /* JADX INFO: renamed from: fb.f$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class a extends C2404f {
        public a(String str, f fVar, InterfaceC2409k interfaceC2409k) {
            super(str, fVar, interfaceC2409k, null);
        }

        /* JADX INFO: renamed from: j */
        public static /* synthetic */ void m8670j(int i10) {
            String str = i10 != 1 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i10 != 1 ? 3 : 2];
            if (i10 != 1) {
                objArr[0] = "source";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$1";
            }
            if (i10 != 1) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$1";
            } else {
                objArr[1] = "recursionDetectedDefault";
            }
            if (i10 != 1) {
                objArr[2] = "recursionDetectedDefault";
            }
            String str2 = String.format(str, objArr);
            if (i10 == 1) {
                throw new IllegalStateException(str2);
            }
        }

        @Override // p082fb.C2404f
        /* JADX INFO: renamed from: p */
        public o mo8669p(String str, Object obj) {
            if (str == null) {
                m8670j(0);
            }
            o oVarM8694a = o.m8694a();
            if (oVarM8694a == null) {
                m8670j(1);
            }
            return oVarM8694a;
        }
    }

    /* JADX INFO: renamed from: fb.f$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public class b extends j {

        /* JADX INFO: renamed from: t */
        public final /* synthetic */ Object f6520t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C2404f c2404f, InterfaceC0173a interfaceC0173a, Object obj) {
            super(c2404f, interfaceC0173a);
            this.f6520t = obj;
        }

        /* JADX INFO: renamed from: a */
        private static /* synthetic */ void m8671a(int i10) {
            throw new IllegalStateException(String.format("@NotNull method %s.%s must not return null", "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$4", "recursionDetected"));
        }

        @Override // p082fb.C2404f.h
        /* JADX INFO: renamed from: d */
        public o mo8672d(boolean z10) {
            o oVarM8695d = o.m8695d(this.f6520t);
            if (oVarM8695d == null) {
                m8671a(0);
            }
            return oVarM8695d;
        }
    }

    /* JADX INFO: renamed from: fb.f$c */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public class c extends k {

        /* JADX INFO: renamed from: u */
        public final /* synthetic */ InterfaceC0184l f6522u;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ InterfaceC0184l f6523v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C2404f c2404f, InterfaceC0173a interfaceC0173a, InterfaceC0184l interfaceC0184l, InterfaceC0184l interfaceC0184l2) {
            super(c2404f, interfaceC0173a);
            this.f6522u = interfaceC0184l;
            this.f6523v = interfaceC0184l2;
        }

        /* JADX INFO: renamed from: a */
        private static /* synthetic */ void m8673a(int i10) {
            String str = i10 != 2 ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[i10 != 2 ? 2 : 3];
            if (i10 != 2) {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$5";
            } else {
                objArr[0] = "value";
            }
            if (i10 != 2) {
                objArr[1] = "recursionDetected";
            } else {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$5";
            }
            if (i10 == 2) {
                objArr[2] = "doPostCompute";
            }
            String str2 = String.format(str, objArr);
            if (i10 == 2) {
                throw new IllegalArgumentException(str2);
            }
        }

        @Override // p082fb.C2404f.h
        /* JADX INFO: renamed from: d */
        public o mo8672d(boolean z10) {
            InterfaceC0184l interfaceC0184l = this.f6522u;
            if (interfaceC0184l == null) {
                o oVarMo8672d = super.mo8672d(z10);
                if (oVarMo8672d == null) {
                    m8673a(0);
                }
                return oVarMo8672d;
            }
            o oVarM8695d = o.m8695d(interfaceC0184l.mo27m(Boolean.valueOf(z10)));
            if (oVarM8695d == null) {
                m8673a(1);
            }
            return oVarM8695d;
        }

        @Override // p082fb.C2404f.i
        /* JADX INFO: renamed from: f */
        public void mo8674f(Object obj) {
            if (obj == null) {
                m8673a(2);
            }
            this.f6523v.mo27m(obj);
        }
    }

    /* JADX INFO: renamed from: fb.f$f */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public interface f {

        /* JADX INFO: renamed from: a */
        public static final f f6525a = new a();

        /* JADX INFO: renamed from: fb.f$f$a */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public static class a implements f {
            /* JADX INFO: renamed from: b */
            public static /* synthetic */ void m8679b(int i10) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "throwable", "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$ExceptionHandlingStrategy$1", "handleException"));
            }

            @Override // p082fb.C2404f.f
            /* JADX INFO: renamed from: a */
            public RuntimeException mo8678a(Throwable th) {
                if (th == null) {
                    m8679b(0);
                }
                throw AbstractC6372c.m25356b(th);
            }
        }

        /* JADX INFO: renamed from: a */
        RuntimeException mo8678a(Throwable th);
    }

    /* JADX INFO: renamed from: fb.f$g */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class g {

        /* JADX INFO: renamed from: a */
        public final Object f6526a;

        /* JADX INFO: renamed from: b */
        public final InterfaceC0173a f6527b;

        public g(Object obj, InterfaceC0173a interfaceC0173a) {
            this.f6526a = obj;
            this.f6527b = interfaceC0173a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && getClass() == obj.getClass() && this.f6526a.equals(((g) obj).f6526a);
        }

        public int hashCode() {
            return this.f6526a.hashCode();
        }
    }

    /* JADX INFO: renamed from: fb.f$i */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static abstract class i extends h {

        /* JADX INFO: renamed from: t */
        public volatile C2410l f6531t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(C2404f c2404f, InterfaceC0173a interfaceC0173a) {
            super(c2404f, interfaceC0173a);
            if (c2404f == null) {
                m8684a(0);
            }
            if (interfaceC0173a == null) {
                m8684a(1);
            }
            this.f6531t = null;
        }

        /* JADX INFO: renamed from: a */
        private static /* synthetic */ void m8684a(int i10) {
            Object[] objArr = new Object[3];
            if (i10 != 1) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "computable";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValueWithPostCompute";
            objArr[2] = "<init>";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // p082fb.C2404f.h
        /* JADX INFO: renamed from: c */
        public final void mo8683c(Object obj) {
            this.f6531t = new C2410l(obj);
            try {
                mo8674f(obj);
            } finally {
                this.f6531t = null;
            }
        }

        /* JADX INFO: renamed from: f */
        public abstract void mo8674f(Object obj);

        @Override // p082fb.C2404f.h, p010a9.InterfaceC0173a
        public Object invoke() {
            C2410l c2410l = this.f6531t;
            return (c2410l == null || !c2410l.m8701b()) ? super.invoke() : c2410l.m8700a();
        }
    }

    /* JADX INFO: renamed from: fb.f$j */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class j extends h implements InterfaceC2407i {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(C2404f c2404f, InterfaceC0173a interfaceC0173a) {
            super(c2404f, interfaceC0173a);
            if (c2404f == null) {
                m8685a(0);
            }
            if (interfaceC0173a == null) {
                m8685a(1);
            }
        }

        /* JADX INFO: renamed from: a */
        private static /* synthetic */ void m8685a(int i10) {
            String str = i10 != 2 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i10 != 2 ? 3 : 2];
            if (i10 == 1) {
                objArr[0] = "computable";
            } else if (i10 != 2) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValue";
            }
            if (i10 != 2) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValue";
            } else {
                objArr[1] = "invoke";
            }
            if (i10 != 2) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i10 == 2) {
                throw new IllegalStateException(str2);
            }
        }

        @Override // p082fb.C2404f.h, p010a9.InterfaceC0173a
        public Object invoke() {
            Object objInvoke = super.invoke();
            if (objInvoke == null) {
                m8685a(2);
            }
            return objInvoke;
        }
    }

    /* JADX INFO: renamed from: fb.f$k */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static abstract class k extends i implements InterfaceC2407i {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(C2404f c2404f, InterfaceC0173a interfaceC0173a) {
            super(c2404f, interfaceC0173a);
            if (c2404f == null) {
                m8686a(0);
            }
            if (interfaceC0173a == null) {
                m8686a(1);
            }
        }

        /* JADX INFO: renamed from: a */
        private static /* synthetic */ void m8686a(int i10) {
            String str = i10 != 2 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i10 != 2 ? 3 : 2];
            if (i10 == 1) {
                objArr[0] = "computable";
            } else if (i10 != 2) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValueWithPostCompute";
            }
            if (i10 != 2) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValueWithPostCompute";
            } else {
                objArr[1] = "invoke";
            }
            if (i10 != 2) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i10 == 2) {
                throw new IllegalStateException(str2);
            }
        }

        @Override // p082fb.C2404f.i, p082fb.C2404f.h, p010a9.InterfaceC0173a
        public Object invoke() {
            Object objInvoke = super.invoke();
            if (objInvoke == null) {
                m8686a(2);
            }
            return objInvoke;
        }
    }

    /* JADX INFO: renamed from: fb.f$l */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class l implements InterfaceC2406h {

        /* JADX INFO: renamed from: q */
        public final C2404f f6532q;

        /* JADX INFO: renamed from: r */
        public final ConcurrentMap f6533r;

        /* JADX INFO: renamed from: s */
        public final InterfaceC0184l f6534s;

        public l(C2404f c2404f, ConcurrentMap concurrentMap, InterfaceC0184l interfaceC0184l) {
            if (c2404f == null) {
                m8687c(0);
            }
            if (concurrentMap == null) {
                m8687c(1);
            }
            if (interfaceC0184l == null) {
                m8687c(2);
            }
            this.f6532q = c2404f;
            this.f6533r = concurrentMap;
            this.f6534s = interfaceC0184l;
        }

        /* JADX INFO: renamed from: c */
        private static /* synthetic */ void m8687c(int i10) {
            String str = (i10 == 3 || i10 == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i10 == 3 || i10 == 4) ? 2 : 3];
            if (i10 == 1) {
                objArr[0] = "map";
            } else if (i10 == 2) {
                objArr[0] = "compute";
            } else if (i10 == 3 || i10 == 4) {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunction";
            } else {
                objArr[0] = "storageManager";
            }
            if (i10 == 3) {
                objArr[1] = "recursionDetected";
            } else if (i10 != 4) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunction";
            } else {
                objArr[1] = "raceCondition";
            }
            if (i10 != 3 && i10 != 4) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i10 != 3 && i10 != 4) {
                throw new IllegalArgumentException(str2);
            }
            throw new IllegalStateException(str2);
        }

        /* JADX INFO: renamed from: d */
        public final AssertionError m8688d(Object obj, Object obj2) {
            return (AssertionError) C2404f.m8657q(new AssertionError("Inconsistent key detected. " + n.COMPUTING + " is expected, was: " + obj2 + ", most probably race condition detected on input " + obj + " under " + this.f6532q));
        }

        /* JADX INFO: renamed from: f */
        public final AssertionError m8689f(Object obj, Object obj2) {
            AssertionError assertionError = (AssertionError) C2404f.m8657q(new AssertionError("Race condition detected on input " + obj + ". Old value is " + obj2 + " under " + this.f6532q));
            if (assertionError == null) {
                m8687c(4);
            }
            return assertionError;
        }

        /* JADX INFO: renamed from: g */
        public o m8690g(Object obj, boolean z10) {
            o oVarMo8669p = this.f6532q.mo8669p(_UrlKt.FRAGMENT_ENCODE_SET, obj);
            if (oVarMo8669p == null) {
                m8687c(3);
            }
            return oVarMo8669p;
        }

        /* JADX INFO: renamed from: j */
        public final AssertionError m8691j(Object obj, Throwable th) {
            return (AssertionError) C2404f.m8657q(new AssertionError("Unable to remove " + obj + " under " + this.f6532q, th));
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x003e A[Catch: all -> 0x003b, PHI: r0
  0x003e: PHI (r0v8 java.lang.Object) = (r0v7 java.lang.Object), (r0v20 java.lang.Object) binds: [B:10:0x0020, B:12:0x002d] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TryCatch #2 {all -> 0x003b, blocks: (B:9:0x0018, B:11:0x0022, B:13:0x002f, B:18:0x003e, B:20:0x0042, B:22:0x004d, B:24:0x0054, B:34:0x007f, B:37:0x008b, B:39:0x008f, B:40:0x0093, B:41:0x0094, B:42:0x0096, B:48:0x00a1, B:50:0x00ad, B:51:0x00b1, B:52:0x00b2, B:53:0x00bc, B:55:0x00c0, B:56:0x00ca, B:58:0x00cc, B:59:0x00d0, B:44:0x0098, B:45:0x009c, B:36:0x0085, B:54:0x00bd, B:27:0x005a, B:31:0x0079, B:32:0x007d), top: B:66:0x0018, inners: #0, #1, #3 }] */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0052  */
        @Override // p010a9.InterfaceC0184l
        /* JADX INFO: renamed from: m */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object mo27m(java.lang.Object r6) {
            /*
                Method dump skipped, instruction units count: 217
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: p082fb.C2404f.l.mo27m(java.lang.Object):java.lang.Object");
        }

        @Override // p082fb.InterfaceC2406h
        /* JADX INFO: renamed from: q */
        public boolean mo8692q(Object obj) {
            Object obj2 = this.f6533r.get(obj);
            return (obj2 == null || obj2 == n.COMPUTING) ? false : true;
        }
    }

    /* JADX INFO: renamed from: fb.f$m */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class m extends l implements InterfaceC2405g {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(C2404f c2404f, ConcurrentMap concurrentMap, InterfaceC0184l interfaceC0184l) {
            super(c2404f, concurrentMap, interfaceC0184l);
            if (c2404f == null) {
                m8693c(0);
            }
            if (concurrentMap == null) {
                m8693c(1);
            }
            if (interfaceC0184l == null) {
                m8693c(2);
            }
        }

        /* JADX INFO: renamed from: c */
        private static /* synthetic */ void m8693c(int i10) {
            String str = i10 != 3 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i10 != 3 ? 3 : 2];
            if (i10 == 1) {
                objArr[0] = "map";
            } else if (i10 == 2) {
                objArr[0] = "compute";
            } else if (i10 != 3) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunctionToNotNull";
            }
            if (i10 != 3) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunctionToNotNull";
            } else {
                objArr[1] = "invoke";
            }
            if (i10 != 3) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i10 == 3) {
                throw new IllegalStateException(str2);
            }
        }

        @Override // p082fb.C2404f.l, p010a9.InterfaceC0184l
        /* JADX INFO: renamed from: m */
        public Object mo27m(Object obj) {
            Object objMo27m = super.mo27m(obj);
            if (objMo27m == null) {
                m8693c(3);
            }
            return objMo27m;
        }
    }

    /* JADX INFO: renamed from: fb.f$n */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public enum n {
        NOT_COMPUTED,
        COMPUTING,
        RECURSION_WAS_DETECTED
    }

    /* JADX INFO: renamed from: fb.f$o */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class o {

        /* JADX INFO: renamed from: a */
        public final Object f6539a;

        /* JADX INFO: renamed from: b */
        public final boolean f6540b;

        public o(Object obj, boolean z10) {
            this.f6539a = obj;
            this.f6540b = z10;
        }

        /* JADX INFO: renamed from: a */
        public static o m8694a() {
            return new o(null, true);
        }

        /* JADX INFO: renamed from: d */
        public static o m8695d(Object obj) {
            return new o(obj, false);
        }

        /* JADX INFO: renamed from: b */
        public Object m8696b() {
            return this.f6539a;
        }

        /* JADX INFO: renamed from: c */
        public boolean m8697c() {
            return this.f6540b;
        }

        public String toString() {
            return m8697c() ? "FALL_THROUGH" : String.valueOf(this.f6539a);
        }
    }

    public C2404f(String str, f fVar, InterfaceC2409k interfaceC2409k) {
        if (str == null) {
            m8653j(4);
        }
        if (fVar == null) {
            m8653j(5);
        }
        if (interfaceC2409k == null) {
            m8653j(6);
        }
        this.f6517a = interfaceC2409k;
        this.f6518b = fVar;
        this.f6519c = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0065  */
    /* JADX INFO: renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ void m8653j(int r13) {
        /*
            Method dump skipped, instruction units count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p082fb.C2404f.m8653j(int):void");
    }

    /* JADX INFO: renamed from: m */
    public static ConcurrentMap m8656m() {
        return new ConcurrentHashMap(3, 1.0f, 2);
    }

    /* JADX INFO: renamed from: q */
    public static Throwable m8657q(Throwable th) {
        if (th == null) {
            m8653j(36);
        }
        StackTraceElement[] stackTrace = th.getStackTrace();
        int length = stackTrace.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                i10 = -1;
                break;
            }
            if (!stackTrace[i10].getClassName().startsWith(f6515d)) {
                break;
            }
            i10++;
        }
        List listSubList = Arrays.asList(stackTrace).subList(i10, length);
        th.setStackTrace((StackTraceElement[]) listSubList.toArray(new StackTraceElement[listSubList.size()]));
        return th;
    }

    @Override // p082fb.InterfaceC2412n
    /* JADX INFO: renamed from: a */
    public InterfaceC2407i mo8658a(InterfaceC0173a interfaceC0173a, Object obj) {
        if (interfaceC0173a == null) {
            m8653j(26);
        }
        if (obj == null) {
            m8653j(27);
        }
        return new b(this, interfaceC0173a, obj);
    }

    @Override // p082fb.InterfaceC2412n
    /* JADX INFO: renamed from: b */
    public InterfaceC2405g mo8659b(InterfaceC0184l interfaceC0184l) {
        if (interfaceC0184l == null) {
            m8653j(9);
        }
        InterfaceC2405g interfaceC2405gM8667n = m8667n(interfaceC0184l, m8656m());
        if (interfaceC2405gM8667n == null) {
            m8653j(10);
        }
        return interfaceC2405gM8667n;
    }

    @Override // p082fb.InterfaceC2412n
    /* JADX INFO: renamed from: c */
    public InterfaceC2400b mo8660c() {
        return new e(this, m8656m(), null);
    }

    @Override // p082fb.InterfaceC2412n
    /* JADX INFO: renamed from: d */
    public InterfaceC2399a mo8661d() {
        return new d(this, m8656m(), null);
    }

    @Override // p082fb.InterfaceC2412n
    /* JADX INFO: renamed from: e */
    public InterfaceC2408j mo8662e(InterfaceC0173a interfaceC0173a) {
        if (interfaceC0173a == null) {
            m8653j(30);
        }
        return new h(this, interfaceC0173a);
    }

    @Override // p082fb.InterfaceC2412n
    /* JADX INFO: renamed from: f */
    public InterfaceC2407i mo8663f(InterfaceC0173a interfaceC0173a) {
        if (interfaceC0173a == null) {
            m8653j(23);
        }
        return new j(this, interfaceC0173a);
    }

    @Override // p082fb.InterfaceC2412n
    /* JADX INFO: renamed from: g */
    public Object mo8664g(InterfaceC0173a interfaceC0173a) {
        if (interfaceC0173a == null) {
            m8653j(34);
        }
        this.f6517a.lock();
        try {
            return interfaceC0173a.invoke();
        } finally {
        }
    }

    @Override // p082fb.InterfaceC2412n
    /* JADX INFO: renamed from: h */
    public InterfaceC2406h mo8665h(InterfaceC0184l interfaceC0184l) {
        if (interfaceC0184l == null) {
            m8653j(19);
        }
        InterfaceC2406h interfaceC2406hM8668o = m8668o(interfaceC0184l, m8656m());
        if (interfaceC2406hM8668o == null) {
            m8653j(20);
        }
        return interfaceC2406hM8668o;
    }

    @Override // p082fb.InterfaceC2412n
    /* JADX INFO: renamed from: i */
    public InterfaceC2407i mo8666i(InterfaceC0173a interfaceC0173a, InterfaceC0184l interfaceC0184l, InterfaceC0184l interfaceC0184l2) {
        if (interfaceC0173a == null) {
            m8653j(28);
        }
        if (interfaceC0184l2 == null) {
            m8653j(29);
        }
        return new c(this, interfaceC0173a, interfaceC0184l, interfaceC0184l2);
    }

    /* JADX INFO: renamed from: n */
    public InterfaceC2405g m8667n(InterfaceC0184l interfaceC0184l, ConcurrentMap concurrentMap) {
        if (interfaceC0184l == null) {
            m8653j(14);
        }
        if (concurrentMap == null) {
            m8653j(15);
        }
        return new m(this, concurrentMap, interfaceC0184l);
    }

    /* JADX INFO: renamed from: o */
    public InterfaceC2406h m8668o(InterfaceC0184l interfaceC0184l, ConcurrentMap concurrentMap) {
        if (interfaceC0184l == null) {
            m8653j(21);
        }
        if (concurrentMap == null) {
            m8653j(22);
        }
        return new l(this, concurrentMap, interfaceC0184l);
    }

    /* JADX INFO: renamed from: p */
    public o mo8669p(String str, Object obj) {
        String str2;
        if (str == null) {
            m8653j(35);
        }
        StringBuilder sb2 = new StringBuilder("Recursion detected ");
        sb2.append(str);
        if (obj == null) {
            str2 = _UrlKt.FRAGMENT_ENCODE_SET;
        } else {
            str2 = "on input: " + obj;
        }
        sb2.append(str2);
        sb2.append(" under ");
        sb2.append(this);
        throw ((AssertionError) m8657q(new AssertionError(sb2.toString())));
    }

    public String toString() {
        return getClass().getSimpleName() + "@" + Integer.toHexString(hashCode()) + " (" + this.f6519c + ")";
    }

    /* JADX INFO: renamed from: fb.f$d */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class d extends e implements InterfaceC2399a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(C2404f c2404f, ConcurrentMap concurrentMap) {
            super(c2404f, concurrentMap, null);
            if (c2404f == null) {
                m8675c(0);
            }
            if (concurrentMap == null) {
                m8675c(1);
            }
        }

        /* JADX INFO: renamed from: c */
        private static /* synthetic */ void m8675c(int i10) {
            String str = i10 != 3 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i10 != 3 ? 3 : 2];
            if (i10 == 1) {
                objArr[0] = "map";
            } else if (i10 == 2) {
                objArr[0] = "computation";
            } else if (i10 != 3) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNotNullValuesBasedOnMemoizedFunction";
            }
            if (i10 != 3) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNotNullValuesBasedOnMemoizedFunction";
            } else {
                objArr[1] = "computeIfAbsent";
            }
            if (i10 == 2) {
                objArr[2] = "computeIfAbsent";
            } else if (i10 != 3) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i10 == 3) {
                throw new IllegalStateException(str2);
            }
        }

        @Override // p082fb.C2404f.e, p082fb.InterfaceC2399a
        /* JADX INFO: renamed from: a */
        public Object mo8651a(Object obj, InterfaceC0173a interfaceC0173a) {
            if (interfaceC0173a == null) {
                m8675c(2);
            }
            Object objMo8651a = super.mo8651a(obj, interfaceC0173a);
            if (objMo8651a == null) {
                m8675c(3);
            }
            return objMo8651a;
        }

        public /* synthetic */ d(C2404f c2404f, ConcurrentMap concurrentMap, a aVar) {
            this(c2404f, concurrentMap);
        }
    }

    /* JADX INFO: renamed from: fb.f$e */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class e extends l implements InterfaceC2400b {

        /* JADX INFO: renamed from: fb.f$e$a */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public class a implements InterfaceC0184l {
            @Override // p010a9.InterfaceC0184l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Object mo27m(g gVar) {
                return gVar.f6527b.invoke();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(C2404f c2404f, ConcurrentMap concurrentMap) {
            super(c2404f, concurrentMap, new a());
            if (c2404f == null) {
                m8676c(0);
            }
            if (concurrentMap == null) {
                m8676c(1);
            }
        }

        /* JADX INFO: renamed from: c */
        private static /* synthetic */ void m8676c(int i10) {
            Object[] objArr = new Object[3];
            if (i10 == 1) {
                objArr[0] = "map";
            } else if (i10 != 2) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "computation";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNullableValuesBasedOnMemoizedFunction";
            if (i10 != 2) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "computeIfAbsent";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        /* JADX INFO: renamed from: a */
        public Object mo8651a(Object obj, InterfaceC0173a interfaceC0173a) {
            if (interfaceC0173a == null) {
                m8676c(2);
            }
            return mo27m(new g(obj, interfaceC0173a));
        }

        public /* synthetic */ e(C2404f c2404f, ConcurrentMap concurrentMap, a aVar) {
            this(c2404f, concurrentMap);
        }
    }

    public /* synthetic */ C2404f(String str, f fVar, InterfaceC2409k interfaceC2409k, a aVar) {
        this(str, fVar, interfaceC2409k);
    }

    public C2404f(String str) {
        this(str, (Runnable) null, (InterfaceC0184l) null);
    }

    public C2404f(String str, Runnable runnable, InterfaceC0184l interfaceC0184l) {
        this(str, f.f6525a, InterfaceC2409k.f6541a.m8699a(runnable, interfaceC0184l));
    }

    /* JADX INFO: renamed from: fb.f$h */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class h implements InterfaceC2408j {

        /* JADX INFO: renamed from: q */
        public final C2404f f6528q;

        /* JADX INFO: renamed from: r */
        public final InterfaceC0173a f6529r;

        /* JADX INFO: renamed from: s */
        public volatile Object f6530s;

        public h(C2404f c2404f, InterfaceC0173a interfaceC0173a) {
            if (c2404f == null) {
                m8681a(0);
            }
            if (interfaceC0173a == null) {
                m8681a(1);
            }
            this.f6530s = n.NOT_COMPUTED;
            this.f6528q = c2404f;
            this.f6529r = interfaceC0173a;
        }

        /* JADX INFO: renamed from: a */
        private static /* synthetic */ void m8681a(int i10) {
            String str = (i10 == 2 || i10 == 3) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i10 == 2 || i10 == 3) ? 2 : 3];
            if (i10 == 1) {
                objArr[0] = "computable";
            } else if (i10 == 2 || i10 == 3) {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValue";
            } else {
                objArr[0] = "storageManager";
            }
            if (i10 == 2) {
                objArr[1] = "recursionDetected";
            } else if (i10 != 3) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValue";
            } else {
                objArr[1] = "renderDebugInformation";
            }
            if (i10 != 2 && i10 != 3) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i10 != 2 && i10 != 3) {
                throw new IllegalArgumentException(str2);
            }
            throw new IllegalStateException(str2);
        }

        /* JADX INFO: renamed from: b */
        public boolean m8682b() {
            return (this.f6530s == n.NOT_COMPUTED || this.f6530s == n.COMPUTING) ? false : true;
        }

        /* JADX INFO: renamed from: d */
        public o mo8672d(boolean z10) {
            o oVarMo8669p = this.f6528q.mo8669p("in a lazy value", null);
            if (oVarMo8669p == null) {
                m8681a(2);
            }
            return oVarMo8669p;
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x003e A[Catch: all -> 0x0024, TryCatch #1 {all -> 0x0024, blocks: (B:7:0x0012, B:9:0x0018, B:14:0x0026, B:16:0x002a, B:18:0x0039, B:19:0x003e, B:21:0x0042, B:23:0x004d, B:24:0x0052, B:28:0x0061, B:30:0x0067, B:32:0x006d, B:33:0x0073, B:34:0x007d, B:35:0x007e, B:36:0x0084, B:25:0x0054), top: B:41:0x0012, inners: #0 }] */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0052 A[Catch: all -> 0x0024, TRY_LEAVE, TryCatch #1 {all -> 0x0024, blocks: (B:7:0x0012, B:9:0x0018, B:14:0x0026, B:16:0x002a, B:18:0x0039, B:19:0x003e, B:21:0x0042, B:23:0x004d, B:24:0x0052, B:28:0x0061, B:30:0x0067, B:32:0x006d, B:33:0x0073, B:34:0x007d, B:35:0x007e, B:36:0x0084, B:25:0x0054), top: B:41:0x0012, inners: #0 }] */
        @Override // p010a9.InterfaceC0173a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object invoke() {
            /*
                r4 = this;
                java.lang.Object r0 = r4.f6530s
                boolean r1 = r0 instanceof p082fb.C2404f.n
                if (r1 != 0) goto Lb
                java.lang.Object r0 = p244qb.AbstractC6381l.m25389f(r0)
                return r0
            Lb:
                fb.f r0 = r4.f6528q
                fb.k r0 = r0.f6517a
                r0.lock()
                java.lang.Object r0 = r4.f6530s     // Catch: java.lang.Throwable -> L24
                boolean r1 = r0 instanceof p082fb.C2404f.n     // Catch: java.lang.Throwable -> L24
                if (r1 != 0) goto L26
                java.lang.Object r0 = p244qb.AbstractC6381l.m25389f(r0)     // Catch: java.lang.Throwable -> L24
            L1c:
                fb.f r1 = r4.f6528q
                fb.k r1 = r1.f6517a
                r1.unlock()
                return r0
            L24:
                r0 = move-exception
                goto L85
            L26:
                fb.f$n r1 = p082fb.C2404f.n.COMPUTING     // Catch: java.lang.Throwable -> L24
                if (r0 != r1) goto L3e
                fb.f$n r2 = p082fb.C2404f.n.RECURSION_WAS_DETECTED     // Catch: java.lang.Throwable -> L24
                r4.f6530s = r2     // Catch: java.lang.Throwable -> L24
                r2 = 1
                fb.f$o r2 = r4.mo8672d(r2)     // Catch: java.lang.Throwable -> L24
                boolean r3 = r2.m8697c()     // Catch: java.lang.Throwable -> L24
                if (r3 != 0) goto L3e
                java.lang.Object r0 = r2.m8696b()     // Catch: java.lang.Throwable -> L24
                goto L1c
            L3e:
                fb.f$n r2 = p082fb.C2404f.n.RECURSION_WAS_DETECTED     // Catch: java.lang.Throwable -> L24
                if (r0 != r2) goto L52
                r0 = 0
                fb.f$o r0 = r4.mo8672d(r0)     // Catch: java.lang.Throwable -> L24
                boolean r2 = r0.m8697c()     // Catch: java.lang.Throwable -> L24
                if (r2 != 0) goto L52
                java.lang.Object r0 = r0.m8696b()     // Catch: java.lang.Throwable -> L24
                goto L1c
            L52:
                r4.f6530s = r1     // Catch: java.lang.Throwable -> L24
                a9.a r0 = r4.f6529r     // Catch: java.lang.Throwable -> L60
                java.lang.Object r0 = r0.invoke()     // Catch: java.lang.Throwable -> L60
                r4.mo8683c(r0)     // Catch: java.lang.Throwable -> L60
                r4.f6530s = r0     // Catch: java.lang.Throwable -> L60
                goto L1c
            L60:
                r0 = move-exception
                boolean r1 = p244qb.AbstractC6372c.m25355a(r0)     // Catch: java.lang.Throwable -> L24
                if (r1 != 0) goto L7e
                java.lang.Object r1 = r4.f6530s     // Catch: java.lang.Throwable -> L24
                fb.f$n r2 = p082fb.C2404f.n.COMPUTING     // Catch: java.lang.Throwable -> L24
                if (r1 != r2) goto L73
                java.lang.Object r1 = p244qb.AbstractC6381l.m25386c(r0)     // Catch: java.lang.Throwable -> L24
                r4.f6530s = r1     // Catch: java.lang.Throwable -> L24
            L73:
                fb.f r1 = r4.f6528q     // Catch: java.lang.Throwable -> L24
                fb.f$f r1 = p082fb.C2404f.m8654k(r1)     // Catch: java.lang.Throwable -> L24
                java.lang.RuntimeException r0 = r1.mo8678a(r0)     // Catch: java.lang.Throwable -> L24
                throw r0     // Catch: java.lang.Throwable -> L24
            L7e:
                fb.f$n r1 = p082fb.C2404f.n.NOT_COMPUTED     // Catch: java.lang.Throwable -> L24
                r4.f6530s = r1     // Catch: java.lang.Throwable -> L24
                java.lang.RuntimeException r0 = (java.lang.RuntimeException) r0     // Catch: java.lang.Throwable -> L24
                throw r0     // Catch: java.lang.Throwable -> L24
            L85:
                fb.f r1 = r4.f6528q
                fb.k r1 = r1.f6517a
                r1.unlock()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p082fb.C2404f.h.invoke():java.lang.Object");
        }

        /* JADX INFO: renamed from: c */
        public void mo8683c(Object obj) {
        }
    }
}
