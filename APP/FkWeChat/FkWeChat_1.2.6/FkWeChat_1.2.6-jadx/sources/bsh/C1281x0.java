package bsh;

import bsh.C1180g1;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;
import okhttp3.internal.url._UrlKt;
import p308v4.C8817h;
import p368z4.C9849a;

/* JADX INFO: renamed from: bsh.x0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public class C1281x0 {
    static final C9849a memberCache = new C9849a(new Function() { // from class: bsh.w0
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return C1281x0.m5175a((Class) obj);
        }
    }, C9849a.a.Soft);
    private RunnableC1205k2 declaringInterpreter;
    protected ClassLoader externalClassLoader;
    protected C8817h loaderManager = new C8817h();
    protected final transient Map<String, Class<?>> absoluteClassCache = new ConcurrentHashMap();
    protected final transient Set<String> absoluteNonClasses = ConcurrentHashMap.newKeySet();
    protected final transient Map<String, Class<?>> associatedClasses = new ConcurrentHashMap();

    /* JADX INFO: renamed from: bsh.x0$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public interface a {
        /* JADX INFO: renamed from: b */
        void mo4283b();
    }

    /* JADX INFO: renamed from: bsh.x0$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public final Map f3868a = new ConcurrentHashMap();

        /* JADX INFO: renamed from: b */
        public final Map f3869b = new ConcurrentHashMap();

        public b(Class cls) {
            Class superclass = cls;
            while (superclass != null) {
                if (AbstractC1143c4.m4176j0(superclass) && ((AbstractC1143c4.m4178k0(superclass) && !AbstractC1143c4.m4180l0(superclass)) || AbstractC1143c4.m4182m0(superclass) || C1180g1.m4328e())) {
                    b bVar = cls == superclass ? null : (b) C1281x0.memberCache.m38264c(superclass);
                    for (Field field : superclass.getDeclaredFields()) {
                        if (AbstractC1143c4.m4184n0(field) || C1180g1.m4328e()) {
                            m5176a(AbstractC1241q2.m5052f(field));
                        }
                    }
                    for (Method method : superclass.getDeclaredMethods()) {
                        if (AbstractC1143c4.m4184n0(method) || C1180g1.m4328e()) {
                            if (cls == superclass) {
                                m5177b(AbstractC1241q2.m5054h(method));
                            } else {
                                m5177b(bVar.m5183h(method.getName(), method.getParameterTypes()));
                            }
                        }
                    }
                    for (Constructor<?> constructor : superclass.getDeclaredConstructors()) {
                        if (cls == superclass) {
                            m5177b(AbstractC1241q2.m5053g(constructor));
                        } else {
                            m5177b(bVar.m5183h(constructor.getName(), constructor.getParameterTypes()));
                        }
                    }
                }
                m5191p(superclass.getInterfaces());
                superclass = superclass.getSuperclass();
            }
        }

        /* JADX INFO: renamed from: a */
        public final boolean m5176a(C1181g2 c1181g2) {
            return !m5187l(c1181g2.getName()) && this.f3869b.put(c1181g2.getName(), c1181g2) == null;
        }

        /* JADX INFO: renamed from: b */
        public final boolean m5177b(AbstractC1241q2 abstractC1241q2) {
            if (abstractC1241q2 == null) {
                return false;
            }
            if (!abstractC1241q2.mo5061s() && !abstractC1241q2.mo5062u()) {
                return m5178c(abstractC1241q2.getName(), abstractC1241q2);
            }
            String name = abstractC1241q2.getName();
            String strReplaceFirst = name.replaceFirst("[gs]et|is", _UrlKt.FRAGMENT_ENCODE_SET);
            if (strReplaceFirst.length() == 1 || Character.isLowerCase(name.charAt(1))) {
                char[] charArray = strReplaceFirst.toCharArray();
                charArray[0] = Character.toLowerCase(charArray[0]);
                strReplaceFirst = new String(charArray);
            }
            return m5178c(name, abstractC1241q2) && m5178c(strReplaceFirst, abstractC1241q2);
        }

        /* JADX INFO: renamed from: c */
        public final boolean m5178c(String str, AbstractC1241q2 abstractC1241q2) {
            if (!m5188m(str)) {
                return this.f3868a.put(str, Collections.singletonList(abstractC1241q2)) == null;
            }
            if (m5189n(str) == 1) {
                this.f3868a.put(str, new ArrayList(m5190o(str)));
            }
            return m5190o(str).add(abstractC1241q2);
        }

        /* JADX INFO: renamed from: d */
        public final AbstractC1241q2 m5179d(List list, Class[] clsArr) {
            if (list.isEmpty()) {
                return null;
            }
            return list.size() == 1 ? (AbstractC1241q2) list.get(0) : AbstractC1143c4.m4189q(clsArr, list);
        }

        /* JADX INFO: renamed from: e */
        public AbstractC1241q2 m5180e(String str) {
            if (m5187l(str)) {
                return (AbstractC1241q2) this.f3869b.get(str);
            }
            return null;
        }

        /* JADX INFO: renamed from: f */
        public AbstractC1241q2 m5181f(String str) {
            if (!m5188m(str)) {
                return null;
            }
            for (AbstractC1241q2 abstractC1241q2 : m5190o(str)) {
                if (abstractC1241q2.mo5061s()) {
                    return abstractC1241q2;
                }
            }
            return null;
        }

        /* JADX INFO: renamed from: g */
        public int m5182g(String str, Class[] clsArr) {
            return AbstractC1143c4.m4191r(clsArr, m5190o(str));
        }

        /* JADX INFO: renamed from: h */
        public AbstractC1241q2 m5183h(String str, Class... clsArr) {
            if (m5188m(str)) {
                return m5179d(m5190o(str), clsArr);
            }
            return null;
        }

        /* JADX INFO: renamed from: i */
        public AbstractC1241q2 m5184i(String str, Object... objArr) {
            return m5183h(str, AbstractC1273v4.m5143m(objArr));
        }

        /* JADX INFO: renamed from: j */
        public AbstractC1241q2 m5185j(String str) {
            if (!m5188m(str)) {
                return null;
            }
            for (AbstractC1241q2 abstractC1241q2 : m5190o(str)) {
                if (abstractC1241q2.mo5062u()) {
                    return abstractC1241q2;
                }
            }
            return null;
        }

        /* JADX INFO: renamed from: k */
        public AbstractC1241q2 m5186k(String str) {
            if (m5188m(str)) {
                return (AbstractC1241q2) m5190o(str).stream().filter(new Predicate() { // from class: bsh.y0
                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj) {
                        return ((AbstractC1241q2) obj).mo4109v();
                    }
                }).findFirst().get();
            }
            return null;
        }

        /* JADX INFO: renamed from: l */
        public boolean m5187l(String str) {
            return this.f3869b.containsKey(str);
        }

        /* JADX INFO: renamed from: m */
        public boolean m5188m(String str) {
            return this.f3868a.containsKey(str);
        }

        /* JADX INFO: renamed from: n */
        public int m5189n(String str) {
            return m5190o(str).size();
        }

        /* JADX INFO: renamed from: o */
        public List m5190o(String str) {
            return (List) this.f3868a.get(str);
        }

        /* JADX INFO: renamed from: p */
        public final void m5191p(Class[] clsArr) {
            for (Class cls : clsArr) {
                if (AbstractC1143c4.m4176j0(cls)) {
                    b bVar = (b) C1281x0.memberCache.m38264c(cls);
                    for (Field field : cls.getDeclaredFields()) {
                        m5176a(AbstractC1241q2.m5052f(field));
                    }
                    for (Method method : cls.getDeclaredMethods()) {
                        if (AbstractC1143c4.m4184n0(method) || C1180g1.m4328e()) {
                            m5177b(bVar.m5183h(method.getName(), method.getParameterTypes()));
                        }
                    }
                }
                m5191p(cls.getInterfaces());
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ b m5175a(Class cls) {
        return new b(cls);
    }

    public static C1279w4 cmUnavailable() {
        return new C1180g1.a("ClassLoading features unavailable.");
    }

    public static C1281x0 createClassManager(RunnableC1205k2 runnableC1205k2) {
        C1281x0 c1281x0;
        if (C1180g1.m4326b("bsh.classpath.ClassManagerImpl")) {
            try {
                c1281x0 = (C1281x0) C1180g1.m4327d("bsh.classpath.ClassManagerImpl").getConstructor(null).newInstance(null);
            } catch (IllegalArgumentException | ReflectiveOperationException | SecurityException e10) {
                throw new C1211l2("Error loading classmanager", e10);
            }
        } else {
            c1281x0 = new C1281x0();
        }
        c1281x0.declaringInterpreter = runnableC1205k2;
        return c1281x0;
    }

    public void addClassLoader(ClassLoader classLoader) {
        this.loaderManager.m33817a(classLoader);
        classLoaderChanged();
    }

    public void associateClass(Class<?> cls) {
        if (AbstractC1143c4.m4174i0(cls)) {
            this.associatedClasses.put(cls.getName(), cls);
        }
    }

    public void cacheClassInfo(String str, Class<?> cls) {
        if (cls == null) {
            this.absoluteNonClasses.add(str);
        } else {
            this.absoluteClassCache.put(str, cls);
            memberCache.m38264c(cls);
        }
    }

    public boolean classExists(String str) {
        return classForName(str) != null;
    }

    public Class classForName(String str) {
        Class<?> clsPlainClassForName;
        try {
            clsPlainClassForName = plainClassForName(str);
        } catch (ClassNotFoundException unused) {
            clsPlainClassForName = null;
        }
        return (clsPlainClassForName == null && this.declaringInterpreter.m4493n()) ? loadSourceClass(str) : clsPlainClassForName;
    }

    public void clearCaches() {
        this.absoluteNonClasses.clear();
        this.absoluteClassCache.clear();
        memberCache.m38263b();
    }

    public Class defineClass(String str, byte[] bArr) {
        throw new C1211l2("Can't create class (" + str + ") without class manager package.");
    }

    public void doSuperImport() {
        throw cmUnavailable();
    }

    public Class<?> getAssociatedClass(String str) {
        return this.associatedClasses.get(str);
    }

    public String getClassNameByUnqName(String str) throws C1279w4 {
        throw cmUnavailable();
    }

    public URL getResource(String str) {
        ClassLoader classLoader = this.externalClassLoader;
        URL resource = classLoader != null ? classLoader.getResource(str.substring(1)) : null;
        return resource == null ? RunnableC1205k2.class.getResource(str) : resource;
    }

    public InputStream getResourceAsStream(String str) {
        ClassLoader classLoader = this.externalClassLoader;
        InputStream resourceAsStream = classLoader != null ? classLoader.getResourceAsStream(str.substring(1)) : null;
        return resourceAsStream == null ? RunnableC1205k2.class.getResourceAsStream(str) : resourceAsStream;
    }

    public boolean getStrictJava() {
        RunnableC1205k2 runnableC1205k2 = this.declaringInterpreter;
        return runnableC1205k2 != null && runnableC1205k2.m4499v();
    }

    public boolean hasSuperImport() {
        return false;
    }

    public Class<?> loadSourceClass(String str) {
        String str2 = "/" + str.replace('.', '/') + ".java";
        URL resource = getResource(str2);
        if (resource == null) {
            return null;
        }
        try {
            C1187h2 c1187h2 = new C1187h2((InputStream) resource.getContent());
            try {
                RunnableC1205k2.m4462e("Loading class from source file: ".concat(str2));
                this.declaringInterpreter.m4486g(c1187h2);
                c1187h2.close();
            } catch (Throwable th) {
                try {
                    c1187h2.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (C1163d2 | IOException e10) {
            if (((Boolean) RunnableC1205k2.f3633D.get()).booleanValue()) {
                e10.printStackTrace();
            }
        }
        try {
            return plainClassForName(str);
        } catch (ClassNotFoundException unused) {
            RunnableC1205k2.m4462e("Class not found in source file: ".concat(str));
            return null;
        }
    }

    public Class<?> plainClassForName(String str) {
        ClassLoader classLoader = this.externalClassLoader;
        Class<?> clsLoadClass = classLoader != null ? classLoader.loadClass(str) : Class.forName(str);
        cacheClassInfo(str, clsLoadClass);
        return clsLoadClass;
    }

    public void reset() {
        clearCaches();
    }

    public void setClassLoader(ClassLoader classLoader) {
        this.externalClassLoader = classLoader;
        classLoaderChanged();
    }

    public void classLoaderChanged() {
    }

    public void addListener(a aVar) {
    }
}
