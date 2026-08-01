package p086ff;

import gf.C2797f;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.Set;
import java.util.concurrent.LinkedBlockingQueue;
import p116hf.AbstractC3030m;
import p116hf.AbstractC3035r;
import p116hf.C3027j;
import p116hf.C3031n;
import p116hf.C3033p;
import p147jf.InterfaceC3861c;
import p147jf.InterfaceC3863e;
import p376zd.C10010p0;

/* JADX INFO: renamed from: ff.f */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2438f {

    /* JADX INFO: renamed from: a */
    public static volatile int f6607a;

    /* JADX INFO: renamed from: e */
    public static volatile InterfaceC3863e f6611e;

    /* JADX INFO: renamed from: b */
    public static final C3033p f6608b = new C3033p();

    /* JADX INFO: renamed from: c */
    public static final C3027j f6609c = new C3027j();

    /* JADX INFO: renamed from: d */
    public static boolean f6610d = AbstractC3035r.m11211a("slf4j.detectLoggerNameMismatch");

    /* JADX INFO: renamed from: f */
    public static final String[] f6612f = {"2.0"};

    /* JADX INFO: renamed from: b */
    public static final void m8830b() {
        try {
            List listM8837i = m8837i();
            m8851w(listM8837i);
            if (listM8837i == null || listM8837i.isEmpty()) {
                f6607a = 4;
                AbstractC3030m.m11195i("No SLF4J providers were found.");
                AbstractC3030m.m11195i("Defaulting to no-operation (NOP) logger implementation");
                AbstractC3030m.m11195i("See https://www.slf4j.org/codes.html#noProviders for further details.");
                m8850v(m8836h());
            } else {
                f6611e = (InterfaceC3863e) listM8837i.get(0);
                m8831c();
                f6611e.mo11180a();
                f6607a = 3;
                m8849u(listM8837i);
            }
            m8846r();
        } catch (Exception e10) {
            m8835g(e10);
            throw new IllegalStateException("Unexpected initialization failure", e10);
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m8831c() {
        InterfaceC3861c interfaceC3861cMo11182c = f6611e.mo11182c();
        if (interfaceC3861cMo11182c != null) {
            AbstractC2439g.m8854a(interfaceC3861cMo11182c);
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m8832d(C2797f c2797f, int i10) {
        if (c2797f.m9963i().m11201J()) {
            m8833e(i10);
        } else {
            if (c2797f.m9963i().m11202K()) {
                return;
            }
            m8834f();
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m8833e(int i10) {
        AbstractC3030m.m11195i("A number (" + i10 + ") of logging calls during the initialization phase have been intercepted and are");
        AbstractC3030m.m11195i("now being replayed. These are subject to the filtering rules of the underlying logging system.");
        AbstractC3030m.m11195i("See also https://www.slf4j.org/codes.html#replay");
    }

    /* JADX INFO: renamed from: f */
    public static void m8834f() {
        AbstractC3030m.m11195i("The following set of substitute loggers may have been accessed");
        AbstractC3030m.m11195i("during the initialization phase. Logging calls during this");
        AbstractC3030m.m11195i("phase were not honored. However, subsequent logging calls to these");
        AbstractC3030m.m11195i("loggers will work as normally expected.");
        AbstractC3030m.m11195i("See also https://www.slf4j.org/codes.html#substituteLogger");
    }

    /* JADX INFO: renamed from: g */
    public static void m8835g(Throwable th) {
        f6607a = 2;
        AbstractC3030m.m11189c("Failed to instantiate SLF4J LoggerFactory", th);
    }

    /* JADX INFO: renamed from: h */
    public static Set m8836h() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        try {
            ClassLoader classLoader = AbstractC2438f.class.getClassLoader();
            Enumeration<URL> systemResources = classLoader == null ? ClassLoader.getSystemResources("org/slf4j/impl/StaticLoggerBinder.class") : classLoader.getResources("org/slf4j/impl/StaticLoggerBinder.class");
            while (systemResources.hasMoreElements()) {
                linkedHashSet.add(systemResources.nextElement());
            }
            return linkedHashSet;
        } catch (IOException e10) {
            AbstractC3030m.m11189c("Error getting resources from path", e10);
            return linkedHashSet;
        }
    }

    /* JADX INFO: renamed from: i */
    public static List m8837i() {
        ArrayList arrayList = new ArrayList();
        ClassLoader classLoader = AbstractC2438f.class.getClassLoader();
        InterfaceC3863e interfaceC3863eM8844p = m8844p(classLoader);
        if (interfaceC3863eM8844p != null) {
            arrayList.add(interfaceC3863eM8844p);
            return arrayList;
        }
        Iterator it = m8842n(classLoader).iterator();
        while (it.hasNext()) {
            m8852x(arrayList, it);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: j */
    public static void m8838j() {
        C3033p c3033p = f6608b;
        synchronized (c3033p) {
            try {
                c3033p.m11210f().m11209e();
                for (C3031n c3031n : c3033p.m11210f().m11208d()) {
                    c3031n.m11205N(m8840l(c3031n.m11200I()));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public static InterfaceC2433a m8839k() {
        return m8841m().mo11183d();
    }

    /* JADX INFO: renamed from: l */
    public static InterfaceC2436d m8840l(String str) {
        return m8839k().mo8794a(str);
    }

    /* JADX INFO: renamed from: m */
    public static InterfaceC3863e m8841m() {
        if (f6607a == 0) {
            synchronized (AbstractC2438f.class) {
                try {
                    if (f6607a == 0) {
                        f6607a = 1;
                        m8845q();
                    }
                } finally {
                }
            }
        }
        int i10 = f6607a;
        if (i10 == 1) {
            return f6608b;
        }
        if (i10 == 2) {
            C10010p0.m38820a("org.slf4j.LoggerFactory in failed state. Original exception was thrown EARLIER. See also https://www.slf4j.org/codes.html#unsuccessfulInit");
            return null;
        }
        if (i10 == 3) {
            return f6611e;
        }
        if (i10 == 4) {
            return f6609c;
        }
        C10010p0.m38820a("Unreachable code");
        return null;
    }

    /* JADX INFO: renamed from: n */
    public static ServiceLoader m8842n(final ClassLoader classLoader) {
        return System.getSecurityManager() == null ? ServiceLoader.load(InterfaceC3863e.class, classLoader) : (ServiceLoader) AccessController.doPrivileged(new PrivilegedAction() { // from class: ff.e
            @Override // java.security.PrivilegedAction
            public final Object run() {
                return ServiceLoader.load(InterfaceC3863e.class, classLoader);
            }
        });
    }

    /* JADX INFO: renamed from: o */
    public static boolean m8843o(List list) {
        return list.size() > 1;
    }

    /* JADX INFO: renamed from: p */
    public static InterfaceC3863e m8844p(ClassLoader classLoader) {
        String property = System.getProperty("slf4j.provider");
        if (property != null && !property.isEmpty()) {
            try {
                AbstractC3030m.m11192f(String.format("Attempting to load provider \"%s\" specified via \"%s\" system property", property, "slf4j.provider"));
                return (InterfaceC3863e) classLoader.loadClass(property).getConstructor(null).newInstance(null);
            } catch (ClassCastException e10) {
                AbstractC3030m.m11189c(String.format("Specified SLF4JServiceProvider (%s) does not implement SLF4JServiceProvider interface", property), e10);
                return null;
            } catch (ClassNotFoundException e11) {
                e = e11;
                AbstractC3030m.m11189c(String.format("Failed to instantiate the specified SLF4JServiceProvider (%s)", property), e);
                return null;
            } catch (IllegalAccessException e12) {
                e = e12;
                AbstractC3030m.m11189c(String.format("Failed to instantiate the specified SLF4JServiceProvider (%s)", property), e);
                return null;
            } catch (InstantiationException e13) {
                e = e13;
                AbstractC3030m.m11189c(String.format("Failed to instantiate the specified SLF4JServiceProvider (%s)", property), e);
                return null;
            } catch (NoSuchMethodException e14) {
                e = e14;
                AbstractC3030m.m11189c(String.format("Failed to instantiate the specified SLF4JServiceProvider (%s)", property), e);
                return null;
            } catch (InvocationTargetException e15) {
                e = e15;
                AbstractC3030m.m11189c(String.format("Failed to instantiate the specified SLF4JServiceProvider (%s)", property), e);
                return null;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: q */
    public static final void m8845q() {
        m8830b();
        if (f6607a == 3) {
            m8853y();
        }
    }

    /* JADX INFO: renamed from: r */
    public static void m8846r() {
        m8838j();
        m8847s();
        f6608b.m11210f().m11206b();
    }

    /* JADX INFO: renamed from: s */
    public static void m8847s() {
        LinkedBlockingQueue linkedBlockingQueueM11207c = f6608b.m11210f().m11207c();
        int size = linkedBlockingQueueM11207c.size();
        ArrayList<C2797f> arrayList = new ArrayList(128);
        int i10 = 0;
        while (linkedBlockingQueueM11207c.drainTo(arrayList, 128) != 0) {
            for (C2797f c2797f : arrayList) {
                m8848t(c2797f);
                int i11 = i10 + 1;
                if (i10 == 0) {
                    m8832d(c2797f, size);
                }
                i10 = i11;
            }
            arrayList.clear();
        }
    }

    /* JADX INFO: renamed from: t */
    public static void m8848t(C2797f c2797f) {
        if (c2797f == null) {
            return;
        }
        C3031n c3031nM9963i = c2797f.m9963i();
        String strM11200I = c3031nM9963i.m11200I();
        if (c3031nM9963i.m11203L()) {
            C10010p0.m38820a("Delegate logger cannot be null at this state.");
            return;
        }
        if (c3031nM9963i.m11202K()) {
            return;
        }
        if (!c3031nM9963i.m11201J()) {
            AbstractC3030m.m11195i(strM11200I);
        } else if (c3031nM9963i.mo8809g(c2797f.mo9948e())) {
            c3031nM9963i.m11204M(c2797f);
        }
    }

    /* JADX INFO: renamed from: u */
    public static void m8849u(List list) {
        if (list.isEmpty()) {
            C10010p0.m38820a("No providers were found which is impossible after successful initialization.");
            return;
        }
        if (m8843o(list)) {
            AbstractC3030m.m11192f("Actual provider is of type [" + list.get(0) + "]");
            return;
        }
        AbstractC3030m.m11187a("Connected with provider of type [" + ((InterfaceC3863e) list.get(0)).getClass().getName() + "]");
    }

    /* JADX INFO: renamed from: v */
    public static void m8850v(Set set) {
        if (set.isEmpty()) {
            return;
        }
        AbstractC3030m.m11195i("Class path contains SLF4J bindings targeting slf4j-api versions 1.7.x or earlier.");
        Iterator it = set.iterator();
        while (it.hasNext()) {
            AbstractC3030m.m11195i("Ignoring binding found at [" + ((URL) it.next()) + "]");
        }
        AbstractC3030m.m11195i("See https://www.slf4j.org/codes.html#ignoredBindings for an explanation.");
    }

    /* JADX INFO: renamed from: w */
    public static void m8851w(List list) {
        if (m8843o(list)) {
            AbstractC3030m.m11195i("Class path contains multiple SLF4J providers.");
            Iterator it = list.iterator();
            while (it.hasNext()) {
                AbstractC3030m.m11195i("Found provider [" + ((InterfaceC3863e) it.next()) + "]");
            }
            AbstractC3030m.m11195i("See https://www.slf4j.org/codes.html#multiple_bindings for an explanation.");
        }
    }

    /* JADX INFO: renamed from: x */
    public static void m8852x(List list, Iterator it) {
        try {
            list.add((InterfaceC3863e) it.next());
        } catch (ServiceConfigurationError e10) {
            AbstractC3030m.m11188b("A service provider failed to instantiate:\n" + e10.getMessage());
        }
    }

    /* JADX INFO: renamed from: y */
    public static final void m8853y() {
        try {
            String strMo11184e = f6611e.mo11184e();
            boolean z10 = false;
            for (String str : f6612f) {
                if (strMo11184e.startsWith(str)) {
                    z10 = true;
                }
            }
            if (z10) {
                return;
            }
            AbstractC3030m.m11195i("The requested version " + strMo11184e + " by your slf4j provider is not compatible with " + Arrays.asList(f6612f).toString());
            AbstractC3030m.m11195i("See https://www.slf4j.org/codes.html#version_mismatch for further details.");
        } catch (Throwable th) {
            AbstractC3030m.m11189c("Unexpected problem occurred during version sanity check", th);
        }
    }
}
