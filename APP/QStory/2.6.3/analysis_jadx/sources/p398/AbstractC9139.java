package p398;

import io.ktor.client.plugins.api.C3886;
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
import org.slf4j.event.C5746;
import org.slf4j.helpers.AbstractC5750;
import org.slf4j.helpers.C5748;
import org.slf4j.helpers.C5749;
import org.slf4j.helpers.C5751;
import org.slf4j.helpers.NOPLogger;
import p336.C8791;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: 飘花落叶言苏楪子哲世兰.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC9139 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final String[] f25541;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static volatile C5751 f25542;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static volatile int f25545;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C5751 f25544 = new C5751(1);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C5751 f25543 = new C5751(0);

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
        f25541 = new String[]{"2.0"};
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static void m14699(LinkedHashSet linkedHashSet) {
        if (linkedHashSet.isEmpty()) {
            return;
        }
        AbstractC5750.m11138("Class path contains SLF4J bindings targeting slf4j-api versions 1.7.x or earlier.");
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            AbstractC5750.m11138("Ignoring binding found at [" + ((URL) it.next()) + "]");
        }
        AbstractC5750.m11138("See https://www.slf4j.org/codes.html#ignoredBindings for an explanation.");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static void m14700(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            C5925.m11311("No providers were found which is impossible after successful initialization.");
            return;
        }
        if (arrayList.size() > 1) {
            AbstractC5750.m11139("Actual provider is of type [" + arrayList.get(0) + "]");
            return;
        }
        AbstractC5750.m11143("Connected with provider of type [" + ((C5751) arrayList.get(0)).getClass().getName() + "]");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static void m14701() {
        C5751 c5751 = f25544;
        synchronized (c5751) {
            try {
                ((C5748) c5751.f15752).f15742 = true;
                C5748 c5748 = (C5748) c5751.f15752;
                c5748.getClass();
                for (C5749 c5749 : new ArrayList(c5748.f15740.values())) {
                    c5749.f15747 = m14703(c5749.f15749);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        LinkedBlockingQueue linkedBlockingQueue = ((C5748) f25544.f15752).f15741;
        int size = linkedBlockingQueue.size();
        ArrayList<C5746> arrayList = new ArrayList(128);
        int i = 0;
        while (linkedBlockingQueue.drainTo(arrayList, 128) != 0) {
            for (C5746 c5746 : arrayList) {
                if (c5746 != null) {
                    C5749 c57492 = c5746.f15738;
                    String str = c57492.f15749;
                    if (c57492.f15747 == null) {
                        C5925.m11311("Delegate logger cannot be null at this state.");
                        return;
                    } else if (!(c57492.f15747 instanceof NOPLogger)) {
                        if (!c57492.m11136()) {
                            AbstractC5750.m11138(str);
                        } else if (c57492.isEnabledForLevel(c5746.f15739) && c57492.m11136()) {
                            try {
                                c57492.f15744.invoke(c57492.f15747, c5746);
                            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused) {
                            }
                        }
                    }
                }
                int i2 = i + 1;
                if (i == 0) {
                    if (c5746.f15738.m11136()) {
                        AbstractC5750.m11138("A number (" + size + ") of logging calls during the initialization phase have been intercepted and are");
                        AbstractC5750.m11138("now being replayed. These are subject to the filtering rules of the underlying logging system.");
                        AbstractC5750.m11138("See also https://www.slf4j.org/codes.html#replay");
                    } else if (!(c5746.f15738.f15747 instanceof NOPLogger)) {
                        AbstractC5750.m11138("The following set of substitute loggers may have been accessed");
                        AbstractC5750.m11138("during the initialization phase. Logging calls during this");
                        AbstractC5750.m11138("phase were not honored. However, subsequent logging calls to these");
                        AbstractC5750.m11138("loggers will work as normally expected.");
                        AbstractC5750.m11138("See also https://www.slf4j.org/codes.html#substituteLogger");
                    }
                }
                i = i2;
            }
            arrayList.clear();
        }
        C5748 c57482 = (C5748) f25544.f15752;
        c57482.f15740.clear();
        c57482.f15741.clear();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final void m14702() {
        try {
            ArrayList arrayListM14704 = m14704();
            m14705(arrayListM14704);
            if (arrayListM14704.isEmpty()) {
                f25545 = 4;
                AbstractC5750.m11138("No SLF4J providers were found.");
                AbstractC5750.m11138("Defaulting to no-operation (NOP) logger implementation");
                AbstractC5750.m11138("See https://www.slf4j.org/codes.html#noProviders for further details.");
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                try {
                    ClassLoader classLoader = AbstractC9139.class.getClassLoader();
                    Enumeration<URL> systemResources = classLoader == null ? ClassLoader.getSystemResources("org/slf4j/impl/StaticLoggerBinder.class") : classLoader.getResources("org/slf4j/impl/StaticLoggerBinder.class");
                    while (systemResources.hasMoreElements()) {
                        linkedHashSet.add(systemResources.nextElement());
                    }
                } catch (IOException e) {
                    AbstractC5750.m11141("Error getting resources from path", e);
                }
                m14699(linkedHashSet);
            } else {
                f25542 = (C5751) arrayListM14704.get(0);
                f25542.getClass();
                f25545 = 3;
                m14700(arrayListM14704);
            }
            m14701();
            if (f25545 == 3) {
                try {
                    switch (f25542.f15753) {
                        case 0:
                            boolean z = false;
                            for (String str : f25541) {
                                if ("2.0.99".startsWith(str)) {
                                    z = true;
                                }
                            }
                            if (z) {
                                return;
                            }
                            AbstractC5750.m11138("The requested version 2.0.99 by your slf4j provider is not compatible with " + Arrays.asList(f25541).toString());
                            AbstractC5750.m11138("See https://www.slf4j.org/codes.html#version_mismatch for further details.");
                            return;
                        default:
                            throw new UnsupportedOperationException();
                    }
                } catch (Throwable th) {
                    AbstractC5750.m11141("Unexpected problem occurred during version sanity check", th);
                }
            }
        } catch (Exception e2) {
            f25545 = 2;
            AbstractC5750.m11141("Failed to instantiate SLF4J LoggerFactory", e2);
            C8791.m14473("Unexpected initialization failure", e2);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static InterfaceC9141 m14703(String str) {
        C5751 c5751;
        InterfaceC9142 interfaceC9142;
        if (f25545 == 0) {
            synchronized (AbstractC9139.class) {
                try {
                    if (f25545 == 0) {
                        f25545 = 1;
                        m14702();
                    }
                } finally {
                }
            }
        }
        int i = f25545;
        if (i != 1) {
            c5751 = null;
            if (i == 2) {
                C5925.m11311("org.slf4j.LoggerFactory in failed state. Original exception was thrown EARLIER. See also https://www.slf4j.org/codes.html#unsuccessfulInit");
            } else if (i == 3) {
                c5751 = f25542;
            } else if (i == 4) {
                c5751 = f25543;
            } else {
                C5925.m11311("Unreachable code");
            }
        } else {
            c5751 = f25544;
        }
        switch (c5751.f15753) {
            case 0:
                interfaceC9142 = (C3886) c5751.f15752;
                break;
            default:
                interfaceC9142 = (C5748) c5751.f15752;
                break;
        }
        return interfaceC9142.mo8276(str);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static ArrayList m14704() {
        ArrayList arrayList = new ArrayList();
        final ClassLoader classLoader = AbstractC9139.class.getClassLoader();
        String property = System.getProperty("slf4j.provider");
        C5751 c5751 = null;
        if (property != null && !property.isEmpty()) {
            try {
                AbstractC5750.m11139("Attempting to load provider \"" + property + "\" specified via \"slf4j.provider\" system property");
                c5751 = (C5751) classLoader.loadClass(property).getConstructor(null).newInstance(null);
            } catch (ClassCastException e) {
                AbstractC5750.m11141("Specified SLF4JServiceProvider (" + property + ") does not implement SLF4JServiceProvider interface", e);
            } catch (ClassNotFoundException e2) {
                e = e2;
                AbstractC5750.m11141("Failed to instantiate the specified SLF4JServiceProvider (" + property + ")", e);
            } catch (IllegalAccessException e3) {
                e = e3;
                AbstractC5750.m11141("Failed to instantiate the specified SLF4JServiceProvider (" + property + ")", e);
            } catch (InstantiationException e4) {
                e = e4;
                AbstractC5750.m11141("Failed to instantiate the specified SLF4JServiceProvider (" + property + ")", e);
            } catch (NoSuchMethodException e5) {
                e = e5;
                AbstractC5750.m11141("Failed to instantiate the specified SLF4JServiceProvider (" + property + ")", e);
            } catch (InvocationTargetException e6) {
                e = e6;
                AbstractC5750.m11141("Failed to instantiate the specified SLF4JServiceProvider (" + property + ")", e);
            }
        }
        if (c5751 != null) {
            arrayList.add(c5751);
            return arrayList;
        }
        Iterator it = (System.getSecurityManager() == null ? ServiceLoader.load(C5751.class, classLoader) : (ServiceLoader) AccessController.doPrivileged(new PrivilegedAction() { // from class: 飘花落叶言苏楪子哲世兰.飘花落叶言子楪世哲苏兰
            @Override // java.security.PrivilegedAction
            public final Object run() {
                return ServiceLoader.load(C5751.class, classLoader);
            }
        })).iterator();
        while (it.hasNext()) {
            try {
                arrayList.add((C5751) it.next());
            } catch (ServiceConfigurationError e7) {
                AbstractC5750.m11142("A service provider failed to instantiate:\n" + e7.getMessage());
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static void m14705(ArrayList arrayList) {
        if (arrayList.size() > 1) {
            AbstractC5750.m11138("Class path contains multiple SLF4J providers.");
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                AbstractC5750.m11138("Found provider [" + ((C5751) it.next()) + "]");
            }
            AbstractC5750.m11138("See https://www.slf4j.org/codes.html#multiple_bindings for an explanation.");
        }
    }
}
