package cd;

import bsh.C1193i2;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import org.luckypray.dexkit.C5823a;
import p010a9.InterfaceC0184l;
import p069ef.C2216a;
import p069ef.C2217b;
import p069ef.C2218c;
import p185m8.AbstractC5114x;
import p299ub.AbstractC8611a0;
import p299ub.AbstractC8621f0;
import p315vd.AbstractC8924d;
import p376zd.C10010p0;
import ve.C8928a;
import ve.C8929b;
import ve.C8930c;
import ye.C9797a;
import ye.C9805i;
import ye.C9806j;
import ye.C9807k;
import ye.C9808l;

/* JADX INFO: renamed from: cd.b */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1517b {
    public static final int $stable = 0;
    public static final C1517b INSTANCE = new C1517b();
    private static final String TAG = "DexKitFinder";

    /* JADX INFO: renamed from: cd.b$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public static final int $stable = 8;
        private String[] excludePkgs;
        private final String key;
        private final C9797a matcher = C9797a.f33082k.m38115a();
        private String[] searchPkgs;

        public a(String str) {
            this.key = str;
        }

        public final a addEqString(String str) {
            str.getClass();
            this.matcher.m38103c(str);
            return this;
        }

        public final Class<?> get() {
            C5823a.e eVarM5934c = C1518c.f4478a.m5934c();
            if (eVarM5934c == null) {
                return null;
            }
            ClassLoader classLoader = C1518c.f4481d;
            if (classLoader == null) {
                C10010p0.m38820a("ClassLoader is null");
                return null;
            }
            try {
                C8928a c8928aM34281f = C8928a.f29543g.m34283a().m34281f(this.matcher);
                String[] strArr = this.searchPkgs;
                if (strArr != null) {
                    c8928aM34281f.m34282g((String[]) Arrays.copyOf(strArr, strArr.length));
                }
                String[] strArr2 = this.excludePkgs;
                if (strArr2 != null) {
                    c8928aM34281f.m34280e((String[]) Arrays.copyOf(strArr2, strArr2.length));
                }
                String str = this.key;
                List listM23451l = str == null ? eVarM5934c.m23451l(c8928aM34281f) : eVarM5934c.m23450k(str, c8928aM34281f);
                if (!listM23451l.isEmpty()) {
                    return ((C2216a) listM23451l.get(0)).m7983a(classLoader);
                }
                String str2 = this.key;
                if (str2 == null) {
                    str2 = "Implicit";
                }
                String str3 = "[Not Found] Class. Key: " + str2 + " | Caller: " + C1517b.INSTANCE.getCallerInfo();
                AbstractC8924d.m34263c(C1517b.TAG, str3);
                C1193i2.m4438a(str3);
                return null;
            } catch (Throwable th) {
                AbstractC8924d.m34264d(C1517b.TAG, "[Search Error] Class Key: " + this.key, th);
                C1516a.m5931a("DexKit class search error for key: ", this.key, th);
                return null;
            }
        }

        public final C9797a getMatcher() {
            return this.matcher;
        }

        public final a inClass(String str) {
            str.getClass();
            C9797a.m38099g(this.matcher, str, null, false, 6, null);
            return this;
        }

        public final a interfaces(String str) {
            str.getClass();
            C9797a c9797a = this.matcher;
            C9806j c9806j = new C9806j();
            C9806j.m38127e(c9806j, str, null, false, 6, null);
            c9797a.m38107i(c9806j);
            return this;
        }

        public final a matcher(Consumer<C9797a> consumer) {
            consumer.getClass();
            consumer.accept(this.matcher);
            return this;
        }

        public final a methods(C9808l c9808l) {
            c9808l.getClass();
            this.matcher.m38108j(c9808l);
            return this;
        }

        public final a modifiers(int i10) {
            C9797a.m38101m(this.matcher, i10, null, 2, null);
            return this;
        }

        public final a notPkg(String... strArr) {
            strArr.getClass();
            this.excludePkgs = strArr;
            return this;
        }

        public final a pkg(String... strArr) {
            strArr.getClass();
            this.searchPkgs = strArr;
            return this;
        }

        public final a superClass(String str) {
            str.getClass();
            C9797a.m38102p(this.matcher, str, null, false, 6, null);
            return this;
        }

        public final a usingEqStrings(String... strArr) {
            strArr.getClass();
            this.matcher.m38113q((String[]) Arrays.copyOf(strArr, strArr.length));
            return this;
        }

        public final a usingStrings(String... strArr) {
            strArr.getClass();
            this.matcher.m38114r((String[]) Arrays.copyOf(strArr, strArr.length));
            return this;
        }
    }

    private C1517b() {
    }

    public static /* synthetic */ Class findClass$default(C1517b c1517b, String str, InterfaceC0184l interfaceC0184l, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        interfaceC0184l.getClass();
        a aVar = new a(str);
        interfaceC0184l.mo27m(aVar);
        return aVar.get();
    }

    public static /* synthetic */ Constructor findConstructor$default(C1517b c1517b, String str, InterfaceC0184l interfaceC0184l, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        interfaceC0184l.getClass();
        c cVar = new c(str);
        interfaceC0184l.mo27m(cVar);
        return cVar.getConstructor();
    }

    public static /* synthetic */ Field findField$default(C1517b c1517b, String str, InterfaceC0184l interfaceC0184l, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        interfaceC0184l.getClass();
        b bVar = new b(str);
        interfaceC0184l.mo27m(bVar);
        return b.get$default(bVar, 0, 1, null);
    }

    public static /* synthetic */ Method findMethod$default(C1517b c1517b, String str, InterfaceC0184l interfaceC0184l, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        interfaceC0184l.getClass();
        c cVar = new c(str);
        interfaceC0184l.mo27m(cVar);
        return cVar.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getCallerInfo() {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        String name = C1517b.class.getName();
        stackTrace.getClass();
        for (StackTraceElement stackTraceElement : stackTrace) {
            String className = stackTraceElement.getClassName();
            className.getClass();
            if (!AbstractC8621f0.m33126a0(className, name, false, 2, null) && !AbstractC8611a0.m33075T(className, "java.", false, 2, null) && !AbstractC8611a0.m33075T(className, "dalvik.", false, 2, null) && !AbstractC8611a0.m33075T(className, "de.robv.android.xposed", false, 2, null) && !AbstractC8611a0.m33075T(className, "kotlin.", false, 2, null)) {
                String className2 = stackTraceElement.getClassName();
                String methodName = stackTraceElement.getMethodName();
                String fileName = stackTraceElement.getFileName();
                if (fileName == null) {
                    fileName = "Unknown";
                }
                return className2 + "." + methodName + "(" + fileName + ":" + stackTraceElement.getLineNumber() + ")";
            }
        }
        return "unknown";
    }

    public final Class<?> findClass(String str, InterfaceC0184l interfaceC0184l) {
        interfaceC0184l.getClass();
        a aVar = new a(str);
        interfaceC0184l.mo27m(aVar);
        return aVar.get();
    }

    public final Constructor<?> findConstructor(String str, InterfaceC0184l interfaceC0184l) {
        interfaceC0184l.getClass();
        c cVar = new c(str);
        interfaceC0184l.mo27m(cVar);
        return cVar.getConstructor();
    }

    public final Field findField(String str, InterfaceC0184l interfaceC0184l) {
        interfaceC0184l.getClass();
        b bVar = new b(str);
        interfaceC0184l.mo27m(bVar);
        return b.get$default(bVar, 0, 1, null);
    }

    public final Method findMethod(String str, InterfaceC0184l interfaceC0184l) {
        interfaceC0184l.getClass();
        c cVar = new c(str);
        interfaceC0184l.mo27m(cVar);
        return cVar.get();
    }

    /* JADX INFO: renamed from: cd.b$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b {
        public static final int $stable = 8;
        private final String key;
        private final C9805i matcher = C9805i.f33099j.m38126a();

        public b(String str) {
            this.key = str;
        }

        public static /* synthetic */ Field get$default(b bVar, int i10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = 0;
            }
            return bVar.get(i10);
        }

        public final Field get(int i10) {
            C5823a.e eVarM5934c = C1518c.f4478a.m5934c();
            if (eVarM5934c == null) {
                return null;
            }
            ClassLoader classLoader = C1518c.f4481d;
            if (classLoader == null) {
                C10010p0.m38820a("ClassLoader is null");
                return null;
            }
            try {
                C8929b c8929bM34284e = C8929b.f29550h.m34285a().m34284e(this.matcher);
                String str = this.key;
                List listM23453n = str == null ? eVarM5934c.m23453n(c8929bM34284e) : eVarM5934c.m23452m(str, c8929bM34284e);
                if (listM23453n.size() > i10) {
                    return C2217b.m7986d((C2217b) listM23453n.get(i10), classLoader, null, 2, null);
                }
                int size = listM23453n.size();
                StringBuilder sb2 = new StringBuilder();
                String str2 = this.key;
                if (str2 == null) {
                    str2 = "Implicit";
                }
                sb2.append("[Field Index Out] Key: " + str2 + "\n");
                sb2.append("   Target Index: " + i10 + ", Actual Size: " + size + "\n");
                if (size > 0) {
                    sb2.append("   Available Fields: \n");
                    int i11 = 0;
                    for (Object obj : listM23453n) {
                        int i12 = i11 + 1;
                        if (i11 < 0) {
                            AbstractC5114x.m20810y();
                        }
                        C2217b c2217b = (C2217b) obj;
                        sb2.append("   [" + i11 + "] " + c2217b.m7989e() + " (" + c2217b.m7991g() + ")\n");
                        i11 = i12;
                    }
                }
                sb2.append("   Caller: " + C1517b.INSTANCE.getCallerInfo());
                String string = sb2.toString();
                AbstractC8924d.m34263c(C1517b.TAG, string);
                throw new RuntimeException(string);
            } catch (Throwable th) {
                if (th instanceof RuntimeException) {
                    throw th;
                }
                AbstractC8924d.m34264d(C1517b.TAG, "[Field Error] Key: " + this.key + "   Caller: " + C1517b.INSTANCE.getCallerInfo(), th);
                C1516a.m5931a("[Field Error] Key: ", this.key, th);
                return null;
            }
        }

        public final C9805i getMatcher() {
            return this.matcher;
        }

        public final b inClass(Class<?> cls) {
            if (cls != null) {
                C9805i.m38116d(this.matcher, cls.getName(), null, false, 6, null);
            }
            return this;
        }

        public final b matcher(Consumer<C9805i> consumer) {
            consumer.getClass();
            consumer.accept(this.matcher);
            return this;
        }

        public final b modifiers(int i10) {
            C9805i.m38117g(this.matcher, i10, null, 2, null);
            return this;
        }

        public final b name(String str) {
            str.getClass();
            C9805i.m38118i(this.matcher, str, null, false, 6, null);
            return this;
        }

        public final b type(String str) {
            str.getClass();
            C9805i.m38119l(this.matcher, str, null, false, 6, null);
            return this;
        }

        public final b inClass(String str) {
            str.getClass();
            C9805i.m38116d(this.matcher, str, null, false, 6, null);
            return this;
        }

        public final Field get() {
            return get$default(this, 0, 1, null);
        }
    }

    /* JADX INFO: renamed from: cd.b$c */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class c {
        public static final int $stable = 8;
        private String[] excludePkgs;
        private final String key;
        private final C9807k matcher = C9807k.f33113o.m38145a();
        private String[] searchPkgs;

        public c(String str) {
            this.key = str;
        }

        public final Method get() {
            C5823a.e eVarM5934c = C1518c.f4478a.m5934c();
            if (eVarM5934c == null) {
                return null;
            }
            ClassLoader classLoader = C1518c.f4481d;
            if (classLoader == null) {
                C10010p0.m38820a("ClassLoader is null");
                return null;
            }
            try {
                C8930c c8930cM34287f = C8930c.f29558h.m34289a().m34287f(this.matcher);
                String[] strArr = this.searchPkgs;
                if (strArr != null) {
                    c8930cM34287f.m34288g((String[]) Arrays.copyOf(strArr, strArr.length));
                }
                String[] strArr2 = this.excludePkgs;
                if (strArr2 != null) {
                    c8930cM34287f.m34286e((String[]) Arrays.copyOf(strArr2, strArr2.length));
                }
                String str = this.key;
                List listM23455t = str == null ? eVarM5934c.m23455t(c8930cM34287f) : eVarM5934c.m23454q(str, c8930cM34287f);
                if (listM23455t.isEmpty()) {
                    String str2 = this.key;
                    if (str2 == null) {
                        str2 = "Implicit";
                    }
                    String str3 = "[Search Failed] Method not found for Key: " + str2 + ". Check your Matcher rules or Package filters.";
                    AbstractC8924d.m34263c(C1517b.TAG, str3);
                    throw new RuntimeException(str3);
                }
                C2218c c2218c = (C2218c) listM23455t.get(0);
                if (c2218c.m8005l()) {
                    String str4 = "[Type Error] Key " + this.key + " matched a CONSTRUCTOR, but .get() expects a METHOD.";
                    AbstractC8924d.m34263c(C1517b.TAG, str4);
                    throw new RuntimeException(str4);
                }
                if (listM23455t.size() > 1) {
                    AbstractC8924d.m34270j(C1517b.TAG, "[Ambiguous Match] Key " + this.key + " matched " + listM23455t.size() + " methods. Caller:" + C1517b.INSTANCE.getCallerInfo());
                }
                return C2218c.m7995f(c2218c, classLoader, null, 2, null);
            } catch (Throwable th) {
                if (th instanceof RuntimeException) {
                    throw th;
                }
                AbstractC8924d.m34264d(C1517b.TAG, "[Method Error] Key: " + this.key + "   Caller: " + C1517b.INSTANCE.getCallerInfo(), th);
                C1516a.m5931a("[Method Error] Key: ", this.key, th);
                return null;
            }
        }

        public final Constructor<?> getConstructor() {
            C5823a.e eVarM5934c = C1518c.f4478a.m5934c();
            if (eVarM5934c == null) {
                return null;
            }
            ClassLoader classLoader = C1518c.f4481d;
            if (classLoader == null) {
                C10010p0.m38820a("ClassLoader is null");
                return null;
            }
            try {
                C8930c c8930cM34287f = C8930c.f29558h.m34289a().m34287f(this.matcher);
                String[] strArr = this.searchPkgs;
                if (strArr != null) {
                    c8930cM34287f.m34288g((String[]) Arrays.copyOf(strArr, strArr.length));
                }
                String[] strArr2 = this.excludePkgs;
                if (strArr2 != null) {
                    c8930cM34287f.m34286e((String[]) Arrays.copyOf(strArr2, strArr2.length));
                }
                String str = this.key;
                List listM23455t = str == null ? eVarM5934c.m23455t(c8930cM34287f) : eVarM5934c.m23454q(str, c8930cM34287f);
                if (!listM23455t.isEmpty()) {
                    return ((C2218c) listM23455t.get(0)).m7998c(classLoader);
                }
                String str2 = "[Constructor Error] No constructor found for key: " + this.key;
                AbstractC8924d.m34263c(C1517b.TAG, str2);
                throw new RuntimeException(str2);
            } catch (Throwable th) {
                if (th instanceof RuntimeException) {
                    throw th;
                }
                AbstractC8924d.m34264d(C1517b.TAG, "[Constructor Error] Key: " + this.key + "   Caller: " + C1517b.INSTANCE.getCallerInfo(), th);
                C1516a.m5931a("[Constructor Error] Key: ", this.key, th);
                return null;
            }
        }

        public final C9807k getMatcher() {
            return this.matcher;
        }

        public final Class<?> getParams(int i10) {
            C5823a.e eVarM5934c = C1518c.f4478a.m5934c();
            if (eVarM5934c == null) {
                return null;
            }
            try {
                C8930c c8930cM34287f = C8930c.f29558h.m34289a().m34287f(this.matcher);
                String[] strArr = this.searchPkgs;
                if (strArr != null) {
                    c8930cM34287f.m34288g((String[]) Arrays.copyOf(strArr, strArr.length));
                }
                String[] strArr2 = this.excludePkgs;
                if (strArr2 != null) {
                    c8930cM34287f.m34286e((String[]) Arrays.copyOf(strArr2, strArr2.length));
                }
                String str = this.key;
                List listM23455t = str == null ? eVarM5934c.m23455t(c8930cM34287f) : eVarM5934c.m23454q(str, c8930cM34287f);
                String str2 = "Implicit";
                if (listM23455t.isEmpty()) {
                    String str3 = this.key;
                    if (str3 != null) {
                        str2 = str3;
                    }
                    String strConcat = "[Param Error] No method found for Key: ".concat(str2);
                    AbstractC8924d.m34263c(C1517b.TAG, strConcat);
                    throw new RuntimeException(strConcat);
                }
                int i11 = 0;
                C2218c c2218c = (C2218c) listM23455t.get(0);
                List listM8003i = c2218c.m8003i();
                if (i10 >= 0 && i10 < listM8003i.size()) {
                    String str4 = (String) listM8003i.get(i10);
                    ClassLoader classLoader = C1518c.f4481d;
                    if (classLoader != null) {
                        return classLoader.loadClass(str4);
                    }
                    return null;
                }
                StringBuilder sb2 = new StringBuilder();
                String str5 = this.key;
                if (str5 != null) {
                    str2 = str5;
                }
                sb2.append("[Param Index Out] Key: " + str2 + "\n");
                sb2.append("   Method: " + c2218c.m7999d() + "->" + c2218c.m8002h() + "\n");
                sb2.append("   Target Index: " + i10 + ", Total Params: " + listM8003i.size() + "\n");
                if (listM8003i.isEmpty()) {
                    sb2.append("   (Method has no parameters)\n");
                } else {
                    sb2.append("   Available Parameters: \n");
                    for (Object obj : listM8003i) {
                        int i12 = i11 + 1;
                        if (i11 < 0) {
                            AbstractC5114x.m20810y();
                        }
                        sb2.append("   [" + i11 + "] " + ((String) obj) + "\n");
                        i11 = i12;
                    }
                }
                String string = sb2.toString();
                AbstractC8924d.m34263c(C1517b.TAG, string);
                throw new RuntimeException(string);
            } catch (Throwable th) {
                if (th instanceof RuntimeException) {
                    throw th;
                }
                AbstractC8924d.m34264d(C1517b.TAG, "[Param Error] Key: " + this.key + "   Caller: " + C1517b.INSTANCE.getCallerInfo(), th);
                C1516a.m5931a("[Param Error] Key: ", this.key, th);
                return null;
            }
        }

        public final c inClass(Class<?> cls) {
            if (cls != null) {
                C9807k.m38131e(this.matcher, cls.getName(), null, false, 6, null);
            }
            return this;
        }

        public final c modifiers(int i10) {
            C9807k.m38132g(this.matcher, i10, null, 2, null);
            return this;
        }

        public final c name(String str) {
            str.getClass();
            C9807k.m38133j(this.matcher, str, null, false, 6, null);
            return this;
        }

        public final c notPkg(String... strArr) {
            strArr.getClass();
            this.excludePkgs = strArr;
            return this;
        }

        public final c paramCount(int i10) {
            this.matcher.m38139k(i10);
            return this;
        }

        public final c params(String... strArr) {
            strArr.getClass();
            this.matcher.m38140l((String[]) Arrays.copyOf(strArr, strArr.length));
            return this;
        }

        public final c pkg(String... strArr) {
            strArr.getClass();
            this.searchPkgs = strArr;
            return this;
        }

        public final c returnType(String str) {
            str.getClass();
            C9807k.m38134o(this.matcher, str, null, false, 6, null);
            return this;
        }

        public final c usingNumbers(Number... numberArr) {
            numberArr.getClass();
            this.matcher.m38143p((Number[]) Arrays.copyOf(numberArr, numberArr.length));
            return this;
        }

        public final c usingStrings(String... strArr) {
            strArr.getClass();
            this.matcher.m38144q((String[]) Arrays.copyOf(strArr, strArr.length));
            return this;
        }

        public final c inClass(String str) {
            str.getClass();
            C9807k.m38131e(this.matcher, str, null, false, 6, null);
            return this;
        }
    }

    public static final a findClass(String str) {
        return new a(str);
    }

    public static final c findMethod(String str) {
        return new c(str);
    }

    public static final a findClass() {
        return findClass$default(null, 1, null);
    }

    public static final c findMethod() {
        return findMethod$default(null, 1, null);
    }

    public static final b findField(String str) {
        return new b(str);
    }

    public static final b findField() {
        return findField$default(null, 1, null);
    }

    public static /* synthetic */ a findClass$default(String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        return findClass(str);
    }

    public static /* synthetic */ c findMethod$default(String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        return findMethod(str);
    }

    public static /* synthetic */ b findField$default(String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        return findField(str);
    }
}
