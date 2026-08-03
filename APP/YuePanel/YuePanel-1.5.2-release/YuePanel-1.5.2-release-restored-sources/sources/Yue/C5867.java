package Yue;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.LinkedBlockingQueue;
import org.slf4j.ILoggerFactory;
import org.slf4j.impl.StaticLoggerBinder;

/* JADX INFO: renamed from: Yue.ۥ۠ۨۡۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C5867 {

    /* JADX INFO: renamed from: ۥ */
    public static final String f1746 = "http://www.slf4j.org/codes.html";

    /* JADX INFO: renamed from: ۥ۟ */
    public static final String f1747 = "http://www.slf4j.org/codes.html#StaticLoggerBinder";

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final String f14542 = "http://www.slf4j.org/codes.html#multiple_bindings";

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final String f14543 = "http://www.slf4j.org/codes.html#null_LF";

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final String f14544 = "http://www.slf4j.org/codes.html#version_mismatch";

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final String f14545 = "http://www.slf4j.org/codes.html#substituteLogger";

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final String f14546 = "http://www.slf4j.org/codes.html#loggerNameMismatch";

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final String f14547 = "http://www.slf4j.org/codes.html#replay";

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final String f14548 = "http://www.slf4j.org/codes.html#unsuccessfulInit";

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final String f14549 = "org.slf4j.LoggerFactory in failed state. Original exception was thrown EARLIER. See also http://www.slf4j.org/codes.html#unsuccessfulInit";

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final int f14550 = 0;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static final int f14551 = 1;

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static final int f14552 = 2;

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static final int f14553 = 3;

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static final int f14554 = 4;

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static volatile int f14555 = 0;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static final String f14559 = "java.vendor.url";

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static final C7673 f14556 = new C7673();

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static final C6341 f14557 = new C6341();

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static final String f14558 = "slf4j.detectLoggerNameMismatch";

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static boolean f14560 = C8157.m26830(f14558);

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static final String[] f14561 = {"1.6", "1.7"};

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static String f14562 = "org/slf4j/impl/StaticLoggerBinder.class";

    /* JADX INFO: renamed from: ۥ */
    public static final void m2539() {
        Set<URL> setM18159;
        try {
            if (m18165()) {
                setM18159 = null;
            } else {
                setM18159 = m18159();
                m18172(setM18159);
            }
            StaticLoggerBinder.getSingleton();
            f14555 = 3;
            m18171(setM18159);
            m18160();
            m18169();
            f14556.m3777();
        } catch (Exception e) {
            m18158(e);
            throw new IllegalStateException("Unexpected initialization failure", e);
        } catch (NoClassDefFoundError e2) {
            if (!m18166(e2.getMessage())) {
                m18158(e2);
                throw e2;
            }
            f14555 = 4;
            C8157.m26827("Failed to load class \"org.slf4j.impl.StaticLoggerBinder\".");
            C8157.m26827("Defaulting to no-operation (NOP) logger implementation");
            C8157.m26827("See http://www.slf4j.org/codes.html#StaticLoggerBinder for further details.");
        } catch (NoSuchMethodError e3) {
            String message = e3.getMessage();
            if (message != null && message.contains("org.slf4j.impl.StaticLoggerBinder.getSingleton()")) {
                f14555 = 2;
                C8157.m26827("slf4j-api 1.6.x (or later) is incompatible with this binding.");
                C8157.m26827("Your binding is version 1.5.5 or earlier.");
                C8157.m26827("Upgrade your binding to version 1.6.x.");
            }
            throw e3;
        }
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static void m2540(C7674 c7674, int i) {
        if (c7674.m24417().m24408()) {
            m18156(i);
        } else {
            if (c7674.m24417().m24409()) {
                return;
            }
            m18157();
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static void m18156(int i) {
        C8157.m26827("A number (" + i + ") of logging calls during the initialization phase have been intercepted and are");
        C8157.m26827("now being replayed. These are subject to the filtering rules of the underlying logging system.");
        C8157.m26827("See also http://www.slf4j.org/codes.html#replay");
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static void m18157() {
        C8157.m26827("The following set of substitute loggers may have been accessed");
        C8157.m26827("during the initialization phase. Logging calls during this");
        C8157.m26827("phase were not honored. However, subsequent logging calls to these");
        C8157.m26827("loggers will work as normally expected.");
        C8157.m26827("See also http://www.slf4j.org/codes.html#substituteLogger");
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static void m18158(Throwable th) {
        f14555 = 2;
        C8157.m26828("Failed to instantiate SLF4J LoggerFactory", th);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static Set<URL> m18159() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        try {
            ClassLoader classLoader = C5867.class.getClassLoader();
            Enumeration<URL> systemResources = classLoader == null ? ClassLoader.getSystemResources(f14562) : classLoader.getResources(f14562);
            while (systemResources.hasMoreElements()) {
                linkedHashSet.add(systemResources.nextElement());
            }
        } catch (IOException e) {
            C8157.m26828("Error getting resources from path", e);
        }
        return linkedHashSet;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static void m18160() {
        C7673 c7673 = f14556;
        synchronized (c7673) {
            try {
                c7673.m24416();
                for (C7672 c7672 : c7673.m24415()) {
                    c7672.m24412(m18163(c7672.getName()));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static ILoggerFactory m18161() {
        if (f14555 == 0) {
            synchronized (C5867.class) {
                try {
                    if (f14555 == 0) {
                        f14555 = 1;
                        m18168();
                    }
                } finally {
                }
            }
        }
        int i = f14555;
        if (i == 1) {
            return f14556;
        }
        if (i == 2) {
            throw new IllegalStateException(f14549);
        }
        if (i == 3) {
            return StaticLoggerBinder.getSingleton().getLoggerFactory();
        }
        if (i == 4) {
            return f14557;
        }
        throw new IllegalStateException("Unreachable code");
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static InterfaceC5866 m18162(Class<?> cls) {
        Class<?> clsM4182;
        InterfaceC5866 interfaceC5866M18163 = m18163(cls.getName());
        if (f14560 && (clsM4182 = C8157.m4182()) != null && m18167(cls, clsM4182)) {
            C8157.m26827(String.format("Detected logger name mismatch. Given name: \"%s\"; computed name: \"%s\".", interfaceC5866M18163.getName(), clsM4182.getName()));
            C8157.m26827("See http://www.slf4j.org/codes.html#loggerNameMismatch for an explanation");
        }
        return interfaceC5866M18163;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static InterfaceC5866 m18163(String str) {
        return m18161().mo2809(str);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static boolean m18164(Set<URL> set) {
        return set.size() > 1;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static boolean m18165() {
        String strM26831 = C8157.m26831(f14559);
        if (strM26831 == null) {
            return false;
        }
        return strM26831.toLowerCase().contains("android");
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static boolean m18166(String str) {
        if (str == null) {
            return false;
        }
        return str.contains("org/slf4j/impl/StaticLoggerBinder") || str.contains("org.slf4j.impl.StaticLoggerBinder");
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static boolean m18167(Class<?> cls, Class<?> cls2) {
        return !cls2.isAssignableFrom(cls);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static final void m18168() {
        m2539();
        if (f14555 == 3) {
            m18174();
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static void m18169() {
        LinkedBlockingQueue<C7674> linkedBlockingQueueM24413 = f14556.m24413();
        int size = linkedBlockingQueueM24413.size();
        ArrayList<C7674> arrayList = new ArrayList(128);
        int i = 0;
        while (linkedBlockingQueueM24413.drainTo(arrayList, 128) != 0) {
            for (C7674 c7674 : arrayList) {
                m18170(c7674);
                int i2 = i + 1;
                if (i == 0) {
                    m2540(c7674, size);
                }
                i = i2;
            }
            arrayList.clear();
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static void m18170(C7674 c7674) {
        if (c7674 == null) {
            return;
        }
        C7672 c7672M24417 = c7674.m24417();
        String name = c7672M24417.getName();
        if (c7672M24417.m24410()) {
            throw new IllegalStateException("Delegate logger cannot be null at this state.");
        }
        if (c7672M24417.m24409()) {
            return;
        }
        if (c7672M24417.m24408()) {
            c7672M24417.m24411(c7674);
        } else {
            C8157.m26827(name);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static void m18171(Set<URL> set) {
        if (set == null || !m18164(set)) {
            return;
        }
        C8157.m26827("Actual binding is of type [" + StaticLoggerBinder.getSingleton().getLoggerFactoryClassStr() + "]");
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static void m18172(Set<URL> set) {
        if (m18164(set)) {
            C8157.m26827("Class path contains multiple SLF4J bindings.");
            Iterator<URL> it = set.iterator();
            while (it.hasNext()) {
                C8157.m26827("Found binding in [" + it.next() + "]");
            }
            C8157.m26827("See http://www.slf4j.org/codes.html#multiple_bindings for an explanation.");
        }
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static void m18173() {
        f14555 = 0;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static final void m18174() {
        try {
            String str = StaticLoggerBinder.REQUESTED_API_VERSION;
            boolean z = false;
            for (String str2 : f14561) {
                if (str.startsWith(str2)) {
                    z = true;
                }
            }
            if (z) {
                return;
            }
            C8157.m26827("The requested version " + str + " by your slf4j binding is not compatible with " + Arrays.asList(f14561).toString());
            C8157.m26827("See http://www.slf4j.org/codes.html#version_mismatch for further details.");
        } catch (NoSuchFieldError unused) {
        } catch (Throwable th) {
            C8157.m26828("Unexpected problem occured during version sanity check", th);
        }
    }
}
