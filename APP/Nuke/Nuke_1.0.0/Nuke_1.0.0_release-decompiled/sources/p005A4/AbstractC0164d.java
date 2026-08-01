package p005A4;

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
import p002A1.C0115D;
import p011B4.C0232c;
import p017C4.AbstractC0249d;
import p017C4.C0247b;
import p017C4.C0248c;
import p017C4.C0250e;
import p017C4.C0251f;
import p042H1.AbstractC0636d;

/* JADX INFO: renamed from: A4.d */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0164d {

    /* JADX INFO: renamed from: a */
    public static volatile int f589a;

    /* JADX INFO: renamed from: b */
    public static final C0248c f590b = new C0248c(1);

    /* JADX INFO: renamed from: c */
    public static final C0248c f591c = new C0248c(0);

    /* JADX INFO: renamed from: d */
    public static volatile C0248c f592d;

    /* JADX INFO: renamed from: e */
    public static final String[] f593e;

    static {
        String property;
        try {
            property = System.getProperty("slf4j.detectLoggerNameMismatch");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property != null) {
            property.equalsIgnoreCase("true");
        }
        f593e = new String[]{"2.0"};
    }

    /* JADX INFO: renamed from: a */
    public static ArrayList m237a() {
        ArrayList arrayList = new ArrayList();
        final ClassLoader classLoader = AbstractC0164d.class.getClassLoader();
        String property = System.getProperty("slf4j.provider");
        C0248c c0248c = null;
        if (property != null && !property.isEmpty()) {
            try {
                String str = "Attempting to load provider \"" + property + "\" specified via \"slf4j.provider\" system property";
                int i5 = AbstractC0249d.f827a;
                if (AbstractC0636d.m1088a(2) >= AbstractC0636d.m1088a(AbstractC0249d.f828b)) {
                    AbstractC0249d.m453b().println("SLF4J(I): " + str);
                }
                c0248c = (C0248c) classLoader.loadClass(property).getConstructor(null).newInstance(null);
            } catch (ClassCastException e5) {
                AbstractC0249d.m452a("Specified SLF4JServiceProvider (" + property + ") does not implement SLF4JServiceProvider interface", e5);
            } catch (ClassNotFoundException e6) {
                e = e6;
                AbstractC0249d.m452a("Failed to instantiate the specified SLF4JServiceProvider (" + property + ")", e);
            } catch (IllegalAccessException e7) {
                e = e7;
                AbstractC0249d.m452a("Failed to instantiate the specified SLF4JServiceProvider (" + property + ")", e);
            } catch (InstantiationException e8) {
                e = e8;
                AbstractC0249d.m452a("Failed to instantiate the specified SLF4JServiceProvider (" + property + ")", e);
            } catch (NoSuchMethodException e9) {
                e = e9;
                AbstractC0249d.m452a("Failed to instantiate the specified SLF4JServiceProvider (" + property + ")", e);
            } catch (InvocationTargetException e10) {
                e = e10;
                AbstractC0249d.m452a("Failed to instantiate the specified SLF4JServiceProvider (" + property + ")", e);
            }
        }
        if (c0248c != null) {
            arrayList.add(c0248c);
            return arrayList;
        }
        Iterator it = (System.getSecurityManager() == null ? ServiceLoader.load(C0248c.class, classLoader) : (ServiceLoader) AccessController.doPrivileged(new PrivilegedAction() { // from class: A4.c
            @Override // java.security.PrivilegedAction
            public final Object run() {
                return ServiceLoader.load(C0248c.class, classLoader);
            }
        })).iterator();
        while (it.hasNext()) {
            try {
                arrayList.add((C0248c) it.next());
            } catch (ServiceConfigurationError e11) {
                String str2 = "A service provider failed to instantiate:\n" + e11.getMessage();
                AbstractC0249d.m453b().println("SLF4J(E): " + str2);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: b */
    public static InterfaceC0162b m238b() {
        C0248c c0248c;
        InterfaceC0161a interfaceC0161a;
        if (f589a == 0) {
            synchronized (AbstractC0164d.class) {
                try {
                    if (f589a == 0) {
                        f589a = 1;
                        m239c();
                    }
                } finally {
                }
            }
        }
        int i5 = f589a;
        if (i5 == 1) {
            c0248c = f590b;
        } else {
            if (i5 == 2) {
                throw new IllegalStateException("org.slf4j.LoggerFactory in failed state. Original exception was thrown EARLIER. See also https://www.slf4j.org/codes.html#unsuccessfulInit");
            }
            if (i5 == 3) {
                c0248c = f592d;
            } else {
                if (i5 != 4) {
                    throw new IllegalStateException("Unreachable code");
                }
                c0248c = f591c;
            }
        }
        switch (c0248c.f825a) {
            case 0:
                interfaceC0161a = (C0115D) c0248c.f826b;
                break;
            default:
                interfaceC0161a = (C0251f) c0248c.f826b;
                break;
        }
        return interfaceC0161a.mo155g();
    }

    /* JADX INFO: renamed from: c */
    public static final void m239c() {
        try {
            ArrayList arrayListM237a = m237a();
            m243g(arrayListM237a);
            if (arrayListM237a.isEmpty()) {
                f589a = 4;
                AbstractC0249d.m454c("No SLF4J providers were found.");
                AbstractC0249d.m454c("Defaulting to no-operation (NOP) logger implementation");
                AbstractC0249d.m454c("See https://www.slf4j.org/codes.html#noProviders for further details.");
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                try {
                    ClassLoader classLoader = AbstractC0164d.class.getClassLoader();
                    Enumeration<URL> systemResources = classLoader == null ? ClassLoader.getSystemResources("org/slf4j/impl/StaticLoggerBinder.class") : classLoader.getResources("org/slf4j/impl/StaticLoggerBinder.class");
                    while (systemResources.hasMoreElements()) {
                        linkedHashSet.add(systemResources.nextElement());
                    }
                } catch (IOException e5) {
                    AbstractC0249d.m452a("Error getting resources from path", e5);
                }
                m242f(linkedHashSet);
            } else {
                f592d = (C0248c) arrayListM237a.get(0);
                f592d.getClass();
                f592d.getClass();
                f589a = 3;
                m241e(arrayListM237a);
            }
            m240d();
            if (f589a == 3) {
                try {
                    switch (f592d.f825a) {
                        case 0:
                            boolean z5 = false;
                            for (String str : f593e) {
                                if ("2.0.99".startsWith(str)) {
                                    z5 = true;
                                }
                            }
                            if (z5) {
                                return;
                            }
                            AbstractC0249d.m454c("The requested version 2.0.99 by your slf4j provider is not compatible with " + Arrays.asList(f593e).toString());
                            AbstractC0249d.m454c("See https://www.slf4j.org/codes.html#version_mismatch for further details.");
                            return;
                        default:
                            throw new UnsupportedOperationException();
                    }
                } catch (Throwable th) {
                    AbstractC0249d.m452a("Unexpected problem occurred during version sanity check", th);
                }
            }
        } catch (Exception e6) {
            f589a = 2;
            AbstractC0249d.m452a("Failed to instantiate SLF4J LoggerFactory", e6);
            throw new IllegalStateException("Unexpected initialization failure", e6);
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m240d() {
        C0248c c0248c = f590b;
        synchronized (c0248c) {
            try {
                ((C0251f) c0248c.f826b).f835d = true;
                C0251f c0251f = (C0251f) c0248c.f826b;
                c0251f.getClass();
                for (C0250e c0250e : new ArrayList(c0251f.f836e.values())) {
                    c0250e.getClass();
                    c0250e.f829d = m238b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        LinkedBlockingQueue linkedBlockingQueue = ((C0251f) f590b.f826b).f837f;
        int size = linkedBlockingQueue.size();
        ArrayList<C0232c> arrayList = new ArrayList(128);
        int i5 = 0;
        while (linkedBlockingQueue.drainTo(arrayList, 128) != 0) {
            for (C0232c c0232c : arrayList) {
                if (c0232c != null) {
                    C0250e c0250e2 = c0232c.f784b;
                    c0250e2.getClass();
                    if (c0250e2.f829d == null) {
                        throw new IllegalStateException("Delegate logger cannot be null at this state.");
                    }
                    if (!(c0250e2.f829d instanceof C0247b)) {
                        if (!c0250e2.m456j()) {
                            AbstractC0249d.m454c("KavaRef");
                        } else if (c0250e2.mo233e(c0232c.f783a) && c0250e2.m456j()) {
                            try {
                                c0250e2.f831f.invoke(c0250e2.f829d, c0232c);
                            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused) {
                            }
                        }
                    }
                }
                int i6 = i5 + 1;
                if (i5 == 0) {
                    if (c0232c.f784b.m456j()) {
                        AbstractC0249d.m454c("A number (" + size + ") of logging calls during the initialization phase have been intercepted and are");
                        AbstractC0249d.m454c("now being replayed. These are subject to the filtering rules of the underlying logging system.");
                        AbstractC0249d.m454c("See also https://www.slf4j.org/codes.html#replay");
                    } else if (!(c0232c.f784b.f829d instanceof C0247b)) {
                        AbstractC0249d.m454c("The following set of substitute loggers may have been accessed");
                        AbstractC0249d.m454c("during the initialization phase. Logging calls during this");
                        AbstractC0249d.m454c("phase were not honored. However, subsequent logging calls to these");
                        AbstractC0249d.m454c("loggers will work as normally expected.");
                        AbstractC0249d.m454c("See also https://www.slf4j.org/codes.html#substituteLogger");
                    }
                }
                i5 = i6;
            }
            arrayList.clear();
        }
        C0251f c0251f2 = (C0251f) f590b.f826b;
        c0251f2.f836e.clear();
        c0251f2.f837f.clear();
    }

    /* JADX INFO: renamed from: e */
    public static void m241e(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            throw new IllegalStateException("No providers were found which is impossible after successful initialization.");
        }
        if (arrayList.size() > 1) {
            String str = "Actual provider is of type [" + arrayList.get(0) + "]";
            int i5 = AbstractC0249d.f827a;
            if (AbstractC0636d.m1088a(2) >= AbstractC0636d.m1088a(AbstractC0249d.f828b)) {
                AbstractC0249d.m453b().println("SLF4J(I): " + str);
                return;
            }
            return;
        }
        String str2 = "Connected with provider of type [" + ((C0248c) arrayList.get(0)).getClass().getName() + "]";
        int i6 = AbstractC0249d.f827a;
        if (AbstractC0636d.m1088a(1) >= AbstractC0636d.m1088a(AbstractC0249d.f828b)) {
            AbstractC0249d.m453b().println("SLF4J(D): " + str2);
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m242f(LinkedHashSet linkedHashSet) {
        if (linkedHashSet.isEmpty()) {
            return;
        }
        AbstractC0249d.m454c("Class path contains SLF4J bindings targeting slf4j-api versions 1.7.x or earlier.");
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            AbstractC0249d.m454c("Ignoring binding found at [" + ((URL) it.next()) + "]");
        }
        AbstractC0249d.m454c("See https://www.slf4j.org/codes.html#ignoredBindings for an explanation.");
    }

    /* JADX INFO: renamed from: g */
    public static void m243g(ArrayList arrayList) {
        if (arrayList.size() > 1) {
            AbstractC0249d.m454c("Class path contains multiple SLF4J providers.");
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                AbstractC0249d.m454c("Found provider [" + ((C0248c) it.next()) + "]");
            }
            AbstractC0249d.m454c("See https://www.slf4j.org/codes.html#multiple_bindings for an explanation.");
        }
    }
}
