package yyds;

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
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: renamed from: yyds.ᛵᛵᛲᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1090 {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public static volatile C0466 f5036;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static volatile int f5037;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public static final C0466 f5038 = new C0466(1);

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public static final C0466 f5039 = new C0466(0);

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public static final String[] f5040;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public static final boolean f5041;

    static {
        String property;
        try {
            property = System.getProperty("slf4j.detectLoggerNameMismatch");
        } catch (SecurityException unused) {
            property = null;
        }
        f5041 = property != null ? property.equalsIgnoreCase("true") : false;
        f5040 = new String[]{"2.0"};
    }

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public static void m2295(ArrayList arrayList) {
        if (arrayList.size() > 1) {
            AbstractC0376.m1078("Class path contains multiple SLF4J providers.");
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                AbstractC0376.m1078("Found provider [" + ((C0466) it.next()) + "]");
            }
            AbstractC0376.m1078("See https://www.slf4j.org/codes.html#multiple_bindings for an explanation.");
        }
    }

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public static void m2296() {
        C0466 c0466 = f5038;
        synchronized (c0466) {
            try {
                ((C2358) c0466.f2318).f11580 = true;
                for (C1064 c1064 : new ArrayList(((C2358) c0466.f2318).f11581.values())) {
                    c1064.f4857 = m2300(c1064.f4855);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        LinkedBlockingQueue linkedBlockingQueue = ((C2358) f5038.f2318).f11579;
        int size = linkedBlockingQueue.size();
        ArrayList<C0268> arrayList = new ArrayList(128);
        int i = 0;
        while (linkedBlockingQueue.drainTo(arrayList, 128) != 0) {
            for (C0268 c0268 : arrayList) {
                if (c0268 != null) {
                    C1064 c10642 = c0268.f1468;
                    String str = c10642.f4855;
                    if (c10642.f4857 == null) {
                        C0188.m800("Delegate logger cannot be null at this state.");
                        return;
                    } else if (!(c10642.f4857 instanceof C1720)) {
                        if (!c10642.m2256()) {
                            AbstractC0376.m1078(str);
                        } else if (c10642.mo1681(c0268.f1467) && c10642.m2256()) {
                            try {
                                c10642.f4856.invoke(c10642.f4857, c0268);
                            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused) {
                            }
                        }
                    }
                }
                int i2 = i + 1;
                if (i == 0) {
                    if (c0268.f1468.m2256()) {
                        AbstractC0376.m1078("A number (" + size + ") of logging calls during the initialization phase have been intercepted and are");
                        AbstractC0376.m1078("now being replayed. These are subject to the filtering rules of the underlying logging system.");
                        AbstractC0376.m1078("See also https://www.slf4j.org/codes.html#replay");
                    } else if (!(c0268.f1468.f4857 instanceof C1720)) {
                        AbstractC0376.m1078("The following set of substitute loggers may have been accessed");
                        AbstractC0376.m1078("during the initialization phase. Logging calls during this");
                        AbstractC0376.m1078("phase were not honored. However, subsequent logging calls to these");
                        AbstractC0376.m1078("loggers will work as normally expected.");
                        AbstractC0376.m1078("See also https://www.slf4j.org/codes.html#substituteLogger");
                    }
                }
                i = i2;
            }
            arrayList.clear();
        }
        C2358 c2358 = (C2358) f5038.f2318;
        c2358.f11581.clear();
        c2358.f11579.clear();
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static ArrayList m2297() {
        ArrayList arrayList = new ArrayList();
        final ClassLoader classLoader = AbstractC1090.class.getClassLoader();
        String property = System.getProperty("slf4j.provider");
        C0466 c0466 = null;
        if (property != null && !property.isEmpty()) {
            try {
                String str = "Attempting to load provider \"" + property + "\" specified via \"slf4j.provider\" system property";
                int i = AbstractC0376.f1917;
                if (AbstractC2104.m4012(2) >= AbstractC2104.m4012(AbstractC0376.f1918)) {
                    AbstractC0376.m1077().println("SLF4J(I): ".concat(str));
                }
                c0466 = (C0466) classLoader.loadClass(property).getConstructor(null).newInstance(null);
            } catch (ClassCastException e) {
                AbstractC0376.m1076("Specified SLF4JServiceProvider (" + property + ") does not implement SLF4JServiceProvider interface", e);
            } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e2) {
                AbstractC0376.m1076("Failed to instantiate the specified SLF4JServiceProvider (" + property + ")", e2);
            }
        }
        if (c0466 != null) {
            arrayList.add(c0466);
            return arrayList;
        }
        Iterator it = (System.getSecurityManager() == null ? ServiceLoader.load(C0466.class, classLoader) : (ServiceLoader) AccessController.doPrivileged(new PrivilegedAction() { // from class: yyds.ᲁᛶᛴ
            @Override // java.security.PrivilegedAction
            public final Object run() {
                return ServiceLoader.load(C0466.class, classLoader);
            }
        })).iterator();
        while (it.hasNext()) {
            try {
                arrayList.add((C0466) it.next());
            } catch (ServiceConfigurationError e3) {
                AbstractC0376.m1077().println("SLF4J(E): ".concat("A service provider failed to instantiate:\n" + e3.getMessage()));
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public static InterfaceC0732 m2298(Class cls) {
        int i;
        InterfaceC0732 interfaceC0732M2300 = m2300(cls.getName());
        if (f5041) {
            C0235 c0235 = AbstractC0902.f4112;
            Class cls2 = null;
            if (c0235 == null) {
                if (AbstractC0902.f4113) {
                    c0235 = null;
                } else {
                    try {
                        c0235 = new C0235();
                    } catch (SecurityException unused) {
                        c0235 = null;
                    }
                    AbstractC0902.f4112 = c0235;
                    AbstractC0902.f4113 = true;
                }
            }
            if (c0235 != null) {
                Class[] classContext = c0235.getClassContext();
                String name = AbstractC0902.class.getName();
                int i2 = 0;
                while (i2 < classContext.length && !name.equals(classContext[i2].getName())) {
                    i2++;
                }
                if (i2 >= classContext.length || (i = i2 + 2) >= classContext.length) {
                    C0188.m800("Failed to find org.slf4j.helpers.Util or its caller in the stack; this should not happen");
                    return null;
                }
                cls2 = classContext[i];
            }
            if (cls2 != null && !cls2.isAssignableFrom(cls)) {
                AbstractC0376.m1078("Detected logger name mismatch. Given name: \"" + interfaceC0732M2300.getName() + "\"; computed name: \"" + cls2.getName() + "\".");
                AbstractC0376.m1078("See https://www.slf4j.org/codes.html#loggerNameMismatch for an explanation");
            }
        }
        return interfaceC0732M2300;
    }

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public static void m2299(LinkedHashSet linkedHashSet) {
        if (linkedHashSet.isEmpty()) {
            return;
        }
        AbstractC0376.m1078("Class path contains SLF4J bindings targeting slf4j-api versions 1.7.x or earlier.");
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            AbstractC0376.m1078("Ignoring binding found at [" + ((URL) it.next()) + "]");
        }
        AbstractC0376.m1078("See https://www.slf4j.org/codes.html#ignoredBindings for an explanation.");
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public static InterfaceC0732 m2300(String str) {
        C0466 c0466;
        InterfaceC2172 interfaceC2172;
        if (f5037 == 0) {
            synchronized (AbstractC1090.class) {
                try {
                    if (f5037 == 0) {
                        f5037 = 1;
                        m2302();
                    }
                } finally {
                }
            }
        }
        int i = f5037;
        if (i == 1) {
            c0466 = f5038;
        } else {
            if (i == 2) {
                C0188.m800("org.slf4j.LoggerFactory in failed state. Original exception was thrown EARLIER. See also https://www.slf4j.org/codes.html#unsuccessfulInit");
                return null;
            }
            if (i == 3) {
                c0466 = f5036;
            } else {
                if (i != 4) {
                    C0188.m800("Unreachable code");
                    return null;
                }
                c0466 = f5039;
            }
        }
        switch (c0466.f2317) {
            case 0:
                interfaceC2172 = (C0135) c0466.f2318;
                break;
            default:
                interfaceC2172 = (C2358) c0466.f2318;
                break;
        }
        return interfaceC2172.mo607(str);
    }

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public static void m2301(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            C0188.m800("No providers were found which is impossible after successful initialization.");
            return;
        }
        if (arrayList.size() > 1) {
            String str = "Actual provider is of type [" + arrayList.get(0) + "]";
            int i = AbstractC0376.f1917;
            if (AbstractC2104.m4012(2) >= AbstractC2104.m4012(AbstractC0376.f1918)) {
                AbstractC0376.m1077().println("SLF4J(I): ".concat(str));
                return;
            }
            return;
        }
        String str2 = "Connected with provider of type [" + ((C0466) arrayList.get(0)).getClass().getName() + "]";
        int i2 = AbstractC0376.f1917;
        if (AbstractC2104.m4012(1) >= AbstractC2104.m4012(AbstractC0376.f1918)) {
            AbstractC0376.m1077().println("SLF4J(D): ".concat(str2));
        }
    }

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public static final void m2302() {
        try {
            ArrayList arrayListM2297 = m2297();
            m2295(arrayListM2297);
            if (arrayListM2297.isEmpty()) {
                f5037 = 4;
                AbstractC0376.m1078("No SLF4J providers were found.");
                AbstractC0376.m1078("Defaulting to no-operation (NOP) logger implementation");
                AbstractC0376.m1078("See https://www.slf4j.org/codes.html#noProviders for further details.");
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                try {
                    ClassLoader classLoader = AbstractC1090.class.getClassLoader();
                    Enumeration<URL> systemResources = classLoader == null ? ClassLoader.getSystemResources("org/slf4j/impl/StaticLoggerBinder.class") : classLoader.getResources("org/slf4j/impl/StaticLoggerBinder.class");
                    while (systemResources.hasMoreElements()) {
                        linkedHashSet.add(systemResources.nextElement());
                    }
                } catch (IOException e) {
                    AbstractC0376.m1076("Error getting resources from path", e);
                }
                m2299(linkedHashSet);
            } else {
                f5036 = (C0466) arrayListM2297.get(0);
                f5036.getClass();
                f5036.getClass();
                f5037 = 3;
                m2301(arrayListM2297);
            }
            m2296();
            if (f5037 == 3) {
                try {
                    switch (f5036.f2317) {
                        case 0:
                            boolean z = false;
                            for (String str : f5040) {
                                if ("2.0.99".startsWith(str)) {
                                    z = true;
                                }
                            }
                            if (z) {
                                return;
                            }
                            AbstractC0376.m1078("The requested version 2.0.99 by your slf4j provider is not compatible with " + Arrays.asList(f5040).toString());
                            AbstractC0376.m1078("See https://www.slf4j.org/codes.html#version_mismatch for further details.");
                            return;
                        default:
                            throw new UnsupportedOperationException();
                    }
                } catch (Throwable th) {
                    AbstractC0376.m1076("Unexpected problem occurred during version sanity check", th);
                }
            }
        } catch (Exception e2) {
            f5037 = 2;
            AbstractC0376.m1076("Failed to instantiate SLF4J LoggerFactory", e2);
            throw new IllegalStateException("Unexpected initialization failure", e2);
        }
    }
}
