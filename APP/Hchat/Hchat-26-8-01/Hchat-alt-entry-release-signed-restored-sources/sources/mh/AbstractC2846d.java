package mh;

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
import p136j8.C2104o;
import p162l3.C2469w;
import p200nh.C3024b;
import p219oh.AbstractC3161d;
import p219oh.AbstractC3165h;
import p219oh.C3159b;
import p219oh.C3160c;
import p219oh.C3162e;
import p219oh.C3163f;
import p219oh.C3164g;
import p281t3.AbstractC4106c;

/* JADX INFO: renamed from: mh.d */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2846d {

    /* JADX INFO: renamed from: a */
    public static volatile int f9234a;

    /* JADX INFO: renamed from: b */
    public static final C3160c f9235b = new C3160c(1);

    /* JADX INFO: renamed from: c */
    public static final C3160c f9236c = new C3160c(0);

    /* JADX INFO: renamed from: d */
    public static final boolean f9237d;

    /* JADX INFO: renamed from: e */
    public static volatile C3160c f9238e;

    /* JADX INFO: renamed from: f */
    public static final String[] f9239f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        String property;
        try {
            property = System.getProperty("slf4j.detectLoggerNameMismatch");
        } catch (SecurityException unused) {
            property = null;
        }
        f9237d = property == null ? false : property.equalsIgnoreCase("true");
        f9239f = new String[]{"2.0"};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static ArrayList m6273a() {
        ArrayList arrayList = new ArrayList();
        final ClassLoader classLoader = AbstractC2846d.class.getClassLoader();
        String property = System.getProperty("slf4j.provider");
        C3160c c3160c = null;
        if (property != null && !property.isEmpty()) {
            try {
                String str = "Attempting to load provider \"" + property + "\" specified via \"slf4j.provider\" system property";
                int i9 = AbstractC3161d.f10216a;
                if (AbstractC4106c.m8279b(2) >= AbstractC4106c.m8279b(AbstractC3161d.f10217b)) {
                    AbstractC3161d.m6745b().println("SLF4J(I): ".concat(str));
                }
                c3160c = (C3160c) classLoader.loadClass(property).getConstructor(null).newInstance(null);
            } catch (ClassCastException e6) {
                AbstractC3161d.m6744a("Specified SLF4JServiceProvider (" + property + ") does not implement SLF4JServiceProvider interface", e6);
            } catch (ClassNotFoundException e7) {
                e = e7;
                AbstractC3161d.m6744a("Failed to instantiate the specified SLF4JServiceProvider (" + property + ")", e);
            } catch (IllegalAccessException e10) {
                e = e10;
                AbstractC3161d.m6744a("Failed to instantiate the specified SLF4JServiceProvider (" + property + ")", e);
            } catch (InstantiationException e11) {
                e = e11;
                AbstractC3161d.m6744a("Failed to instantiate the specified SLF4JServiceProvider (" + property + ")", e);
            } catch (NoSuchMethodException e12) {
                e = e12;
                AbstractC3161d.m6744a("Failed to instantiate the specified SLF4JServiceProvider (" + property + ")", e);
            } catch (InvocationTargetException e13) {
                e = e13;
                AbstractC3161d.m6744a("Failed to instantiate the specified SLF4JServiceProvider (" + property + ")", e);
            }
        }
        if (c3160c != null) {
            arrayList.add(c3160c);
            return arrayList;
        }
        Iterator it = (System.getSecurityManager() == null ? ServiceLoader.load(C3160c.class, classLoader) : (ServiceLoader) AccessController.doPrivileged(new PrivilegedAction() { // from class: mh.c
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // java.security.PrivilegedAction
            public final Object run() {
                return ServiceLoader.load(C3160c.class, classLoader);
            }
        })).iterator();
        while (it.hasNext()) {
            try {
                arrayList.add((C3160c) it.next());
            } catch (ServiceConfigurationError e14) {
                AbstractC3161d.m6745b().println("SLF4J(E): ".concat("A service provider failed to instantiate:\n" + e14.getMessage()));
            }
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static InterfaceC2844b m6274b(Class cls) {
        int i9;
        InterfaceC2844b interfaceC2844bM6275c = m6275c(cls.getName());
        if (f9237d) {
            C3164g c3164g = AbstractC3165h.f10228a;
            Class cls2 = null;
            if (c3164g == null) {
                if (AbstractC3165h.f10229b) {
                    c3164g = null;
                } else {
                    try {
                        c3164g = new C3164g();
                    } catch (SecurityException unused) {
                        c3164g = null;
                    }
                    AbstractC3165h.f10228a = c3164g;
                    AbstractC3165h.f10229b = true;
                }
            }
            if (c3164g != null) {
                Class[] classContext = c3164g.getClassContext();
                String name = AbstractC3165h.class.getName();
                int i10 = 0;
                while (i10 < classContext.length && !name.equals(classContext[i10].getName())) {
                    i10++;
                }
                if (i10 >= classContext.length || (i9 = i10 + 2) >= classContext.length) {
                    C2104o.m5276A("Failed to find org.slf4j.helpers.Util or its caller in the stack; this should not happen");
                    return null;
                }
                cls2 = classContext[i9];
            }
            if (cls2 != null && !cls2.isAssignableFrom(cls)) {
                AbstractC3161d.m6746c("Detected logger name mismatch. Given name: \"" + interfaceC2844bM6275c.getName() + "\"; computed name: \"" + cls2.getName() + "\".");
                AbstractC3161d.m6746c("See https://www.slf4j.org/codes.html#loggerNameMismatch for an explanation");
            }
        }
        return interfaceC2844bM6275c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static InterfaceC2844b m6275c(String str) {
        C3160c c3160c;
        InterfaceC2843a interfaceC2843a;
        if (f9234a == 0) {
            synchronized (AbstractC2846d.class) {
                try {
                    if (f9234a == 0) {
                        f9234a = 1;
                        m6276d();
                    }
                } finally {
                }
            }
        }
        int i9 = f9234a;
        if (i9 == 1) {
            c3160c = f9235b;
        } else {
            if (i9 == 2) {
                C2104o.m5276A("org.slf4j.LoggerFactory in failed state. Original exception was thrown EARLIER. See also https://www.slf4j.org/codes.html#unsuccessfulInit");
                return null;
            }
            if (i9 == 3) {
                c3160c = f9238e;
            } else {
                if (i9 != 4) {
                    C2104o.m5276A("Unreachable code");
                    return null;
                }
                c3160c = f9236c;
            }
        }
        switch (c3160c.f10214a) {
            case 0:
                interfaceC2843a = (C2469w) c3160c.f10215b;
                break;
            default:
                interfaceC2843a = (C3163f) c3160c.f10215b;
                break;
        }
        return interfaceC2843a.mo5872d(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static final void m6276d() {
        try {
            ArrayList arrayListM6273a = m6273a();
            m6280h(arrayListM6273a);
            if (arrayListM6273a.isEmpty()) {
                f9234a = 4;
                AbstractC3161d.m6746c("No SLF4J providers were found.");
                AbstractC3161d.m6746c("Defaulting to no-operation (NOP) logger implementation");
                AbstractC3161d.m6746c("See https://www.slf4j.org/codes.html#noProviders for further details.");
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                try {
                    ClassLoader classLoader = AbstractC2846d.class.getClassLoader();
                    Enumeration<URL> systemResources = classLoader == null ? ClassLoader.getSystemResources("org/slf4j/impl/StaticLoggerBinder.class") : classLoader.getResources("org/slf4j/impl/StaticLoggerBinder.class");
                    while (systemResources.hasMoreElements()) {
                        linkedHashSet.add(systemResources.nextElement());
                    }
                } catch (IOException e6) {
                    AbstractC3161d.m6744a("Error getting resources from path", e6);
                }
                m6279g(linkedHashSet);
            } else {
                f9238e = (C3160c) arrayListM6273a.get(0);
                f9238e.getClass();
                f9238e.getClass();
                f9234a = 3;
                m6278f(arrayListM6273a);
            }
            m6277e();
            if (f9234a == 3) {
                try {
                    switch (f9238e.f10214a) {
                        case 0:
                            boolean z9 = false;
                            for (String str : f9239f) {
                                if ("2.0.99".startsWith(str)) {
                                    z9 = true;
                                }
                            }
                            if (z9) {
                                return;
                            }
                            AbstractC3161d.m6746c("The requested version 2.0.99 by your slf4j provider is not compatible with " + Arrays.asList(f9239f).toString());
                            AbstractC3161d.m6746c("See https://www.slf4j.org/codes.html#version_mismatch for further details.");
                            return;
                        default:
                            throw new UnsupportedOperationException();
                    }
                } catch (Throwable th2) {
                    AbstractC3161d.m6744a("Unexpected problem occurred during version sanity check", th2);
                }
            }
        } catch (Exception e7) {
            f9234a = 2;
            AbstractC3161d.m6744a("Failed to instantiate SLF4J LoggerFactory", e7);
            throw new IllegalStateException("Unexpected initialization failure", e7);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static void m6277e() {
        C3160c c3160c = f9235b;
        synchronized (c3160c) {
            try {
                ((C3163f) c3160c.f10215b).f10225g = true;
                C3163f c3163f = (C3163f) c3160c.f10215b;
                c3163f.getClass();
                for (C3162e c3162e : new ArrayList(c3163f.f10226h.values())) {
                    c3162e.f10219h = m6275c(c3162e.f10218g);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        LinkedBlockingQueue linkedBlockingQueue = ((C3163f) f9235b.f10215b).f10227i;
        int size = linkedBlockingQueue.size();
        ArrayList<C3024b> arrayList = new ArrayList(128);
        int i9 = 0;
        while (linkedBlockingQueue.drainTo(arrayList, 128) != 0) {
            for (C3024b c3024b : arrayList) {
                if (c3024b != null) {
                    C3162e c3162e2 = c3024b.f9828b;
                    String str = c3162e2.f10218g;
                    if (c3162e2.f10219h == null) {
                        C2104o.m5276A("Delegate logger cannot be null at this state.");
                        return;
                    } else if (!(c3162e2.f10219h instanceof C3159b)) {
                        if (!c3162e2.m6748B()) {
                            AbstractC3161d.m6746c(str);
                        } else if (c3162e2.mo6269w(c3024b.f9827a) && c3162e2.m6748B()) {
                            try {
                                c3162e2.f10221j.invoke(c3162e2.f10219h, c3024b);
                            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused) {
                            }
                        }
                    }
                }
                int i10 = i9 + 1;
                if (i9 == 0) {
                    if (c3024b.f9828b.m6748B()) {
                        AbstractC3161d.m6746c("A number (" + size + ") of logging calls during the initialization phase have been intercepted and are");
                        AbstractC3161d.m6746c("now being replayed. These are subject to the filtering rules of the underlying logging system.");
                        AbstractC3161d.m6746c("See also https://www.slf4j.org/codes.html#replay");
                    } else if (!(c3024b.f9828b.f10219h instanceof C3159b)) {
                        AbstractC3161d.m6746c("The following set of substitute loggers may have been accessed");
                        AbstractC3161d.m6746c("during the initialization phase. Logging calls during this");
                        AbstractC3161d.m6746c("phase were not honored. However, subsequent logging calls to these");
                        AbstractC3161d.m6746c("loggers will work as normally expected.");
                        AbstractC3161d.m6746c("See also https://www.slf4j.org/codes.html#substituteLogger");
                    }
                }
                i9 = i10;
            }
            arrayList.clear();
        }
        C3163f c3163f2 = (C3163f) f9235b.f10215b;
        c3163f2.f10226h.clear();
        c3163f2.f10227i.clear();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static void m6278f(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            C2104o.m5276A("No providers were found which is impossible after successful initialization.");
            return;
        }
        if (arrayList.size() > 1) {
            String str = "Actual provider is of type [" + arrayList.get(0) + "]";
            int i9 = AbstractC3161d.f10216a;
            if (AbstractC4106c.m8279b(2) >= AbstractC4106c.m8279b(AbstractC3161d.f10217b)) {
                AbstractC3161d.m6745b().println("SLF4J(I): ".concat(str));
                return;
            }
            return;
        }
        String str2 = "Connected with provider of type [" + ((C3160c) arrayList.get(0)).getClass().getName() + "]";
        int i10 = AbstractC3161d.f10216a;
        if (AbstractC4106c.m8279b(1) >= AbstractC4106c.m8279b(AbstractC3161d.f10217b)) {
            AbstractC3161d.m6745b().println("SLF4J(D): ".concat(str2));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static void m6279g(LinkedHashSet linkedHashSet) {
        if (linkedHashSet.isEmpty()) {
            return;
        }
        AbstractC3161d.m6746c("Class path contains SLF4J bindings targeting slf4j-api versions 1.7.x or earlier.");
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            AbstractC3161d.m6746c("Ignoring binding found at [" + ((URL) it.next()) + "]");
        }
        AbstractC3161d.m6746c("See https://www.slf4j.org/codes.html#ignoredBindings for an explanation.");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static void m6280h(ArrayList arrayList) {
        if (arrayList.size() > 1) {
            AbstractC3161d.m6746c("Class path contains multiple SLF4J providers.");
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                AbstractC3161d.m6746c("Found provider [" + ((C3160c) it.next()) + "]");
            }
            AbstractC3161d.m6746c("See https://www.slf4j.org/codes.html#multiple_bindings for an explanation.");
        }
    }
}
