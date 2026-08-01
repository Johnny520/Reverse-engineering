package p414;

import io.ktor.client.plugins.api.C4718;
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
import org.slf4j.event.C6576;
import org.slf4j.helpers.AbstractC6580;
import org.slf4j.helpers.C6578;
import org.slf4j.helpers.C6579;
import org.slf4j.helpers.C6581;
import org.slf4j.helpers.NOPLogger;
import p352.C9620;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: 飘花落叶言苏楪子哲世兰.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC9968 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final String[] f25886;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static volatile C6581 f25887;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static volatile int f25890;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C6581 f25889 = new C6581(1);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C6581 f25888 = new C6581(0);

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
        f25886 = new String[]{"2.0"};
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static void m15258(LinkedHashSet linkedHashSet) {
        if (linkedHashSet.isEmpty()) {
            return;
        }
        AbstractC6580.m11697("Class path contains SLF4J bindings targeting slf4j-api versions 1.7.x or earlier.");
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            AbstractC6580.m11697("Ignoring binding found at [" + ((URL) it.next()) + "]");
        }
        AbstractC6580.m11697("See https://www.slf4j.org/codes.html#ignoredBindings for an explanation.");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static void m15259(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            C6755.m11870("No providers were found which is impossible after successful initialization.");
            return;
        }
        if (arrayList.size() > 1) {
            AbstractC6580.m11698("Actual provider is of type [" + arrayList.get(0) + "]");
            return;
        }
        AbstractC6580.m11702("Connected with provider of type [" + ((C6581) arrayList.get(0)).getClass().getName() + "]");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static void m15260() {
        C6581 c6581 = f25889;
        synchronized (c6581) {
            try {
                ((C6578) c6581.f16097).f16087 = true;
                C6578 c6578 = (C6578) c6581.f16097;
                c6578.getClass();
                for (C6579 c6579 : new ArrayList(c6578.f16085.values())) {
                    c6579.f16092 = m15262(c6579.f16094);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        LinkedBlockingQueue linkedBlockingQueue = ((C6578) f25889.f16097).f16086;
        int size = linkedBlockingQueue.size();
        ArrayList<C6576> arrayList = new ArrayList(128);
        int i = 0;
        while (linkedBlockingQueue.drainTo(arrayList, 128) != 0) {
            for (C6576 c6576 : arrayList) {
                if (c6576 != null) {
                    C6579 c65792 = c6576.f16083;
                    String str = c65792.f16094;
                    if (c65792.f16092 == null) {
                        C6755.m11870("Delegate logger cannot be null at this state.");
                        return;
                    } else if (!(c65792.f16092 instanceof NOPLogger)) {
                        if (!c65792.m11695()) {
                            AbstractC6580.m11697(str);
                        } else if (c65792.isEnabledForLevel(c6576.f16084) && c65792.m11695()) {
                            try {
                                c65792.f16089.invoke(c65792.f16092, c6576);
                            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused) {
                            }
                        }
                    }
                }
                int i2 = i + 1;
                if (i == 0) {
                    if (c6576.f16083.m11695()) {
                        AbstractC6580.m11697("A number (" + size + ") of logging calls during the initialization phase have been intercepted and are");
                        AbstractC6580.m11697("now being replayed. These are subject to the filtering rules of the underlying logging system.");
                        AbstractC6580.m11697("See also https://www.slf4j.org/codes.html#replay");
                    } else if (!(c6576.f16083.f16092 instanceof NOPLogger)) {
                        AbstractC6580.m11697("The following set of substitute loggers may have been accessed");
                        AbstractC6580.m11697("during the initialization phase. Logging calls during this");
                        AbstractC6580.m11697("phase were not honored. However, subsequent logging calls to these");
                        AbstractC6580.m11697("loggers will work as normally expected.");
                        AbstractC6580.m11697("See also https://www.slf4j.org/codes.html#substituteLogger");
                    }
                }
                i = i2;
            }
            arrayList.clear();
        }
        C6578 c65782 = (C6578) f25889.f16097;
        c65782.f16085.clear();
        c65782.f16086.clear();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final void m15261() {
        try {
            ArrayList arrayListM15263 = m15263();
            m15264(arrayListM15263);
            if (arrayListM15263.isEmpty()) {
                f25890 = 4;
                AbstractC6580.m11697("No SLF4J providers were found.");
                AbstractC6580.m11697("Defaulting to no-operation (NOP) logger implementation");
                AbstractC6580.m11697("See https://www.slf4j.org/codes.html#noProviders for further details.");
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                try {
                    ClassLoader classLoader = AbstractC9968.class.getClassLoader();
                    Enumeration<URL> systemResources = classLoader == null ? ClassLoader.getSystemResources("org/slf4j/impl/StaticLoggerBinder.class") : classLoader.getResources("org/slf4j/impl/StaticLoggerBinder.class");
                    while (systemResources.hasMoreElements()) {
                        linkedHashSet.add(systemResources.nextElement());
                    }
                } catch (IOException e) {
                    AbstractC6580.m11700("Error getting resources from path", e);
                }
                m15258(linkedHashSet);
            } else {
                f25887 = (C6581) arrayListM15263.get(0);
                f25887.getClass();
                f25890 = 3;
                m15259(arrayListM15263);
            }
            m15260();
            if (f25890 == 3) {
                try {
                    switch (f25887.f16098) {
                        case 0:
                            boolean z = false;
                            for (String str : f25886) {
                                if ("2.0.99".startsWith(str)) {
                                    z = true;
                                }
                            }
                            if (z) {
                                return;
                            }
                            AbstractC6580.m11697("The requested version 2.0.99 by your slf4j provider is not compatible with " + Arrays.asList(f25886).toString());
                            AbstractC6580.m11697("See https://www.slf4j.org/codes.html#version_mismatch for further details.");
                            return;
                        default:
                            throw new UnsupportedOperationException();
                    }
                } catch (Throwable th) {
                    AbstractC6580.m11700("Unexpected problem occurred during version sanity check", th);
                }
            }
        } catch (Exception e2) {
            f25890 = 2;
            AbstractC6580.m11700("Failed to instantiate SLF4J LoggerFactory", e2);
            C9620.m15032("Unexpected initialization failure", e2);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static InterfaceC9970 m15262(String str) {
        C6581 c6581;
        InterfaceC9971 interfaceC9971;
        if (f25890 == 0) {
            synchronized (AbstractC9968.class) {
                try {
                    if (f25890 == 0) {
                        f25890 = 1;
                        m15261();
                    }
                } finally {
                }
            }
        }
        int i = f25890;
        if (i != 1) {
            c6581 = null;
            if (i == 2) {
                C6755.m11870("org.slf4j.LoggerFactory in failed state. Original exception was thrown EARLIER. See also https://www.slf4j.org/codes.html#unsuccessfulInit");
            } else if (i == 3) {
                c6581 = f25887;
            } else if (i == 4) {
                c6581 = f25888;
            } else {
                C6755.m11870("Unreachable code");
            }
        } else {
            c6581 = f25889;
        }
        switch (c6581.f16098) {
            case 0:
                interfaceC9971 = (C4718) c6581.f16097;
                break;
            default:
                interfaceC9971 = (C6578) c6581.f16097;
                break;
        }
        return interfaceC9971.mo8835(str);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static ArrayList m15263() {
        ArrayList arrayList = new ArrayList();
        final ClassLoader classLoader = AbstractC9968.class.getClassLoader();
        String property = System.getProperty("slf4j.provider");
        C6581 c6581 = null;
        if (property != null && !property.isEmpty()) {
            try {
                AbstractC6580.m11698("Attempting to load provider \"" + property + "\" specified via \"slf4j.provider\" system property");
                c6581 = (C6581) classLoader.loadClass(property).getConstructor(null).newInstance(null);
            } catch (ClassCastException e) {
                AbstractC6580.m11700("Specified SLF4JServiceProvider (" + property + ") does not implement SLF4JServiceProvider interface", e);
            } catch (ClassNotFoundException e2) {
                e = e2;
                AbstractC6580.m11700("Failed to instantiate the specified SLF4JServiceProvider (" + property + ")", e);
            } catch (IllegalAccessException e3) {
                e = e3;
                AbstractC6580.m11700("Failed to instantiate the specified SLF4JServiceProvider (" + property + ")", e);
            } catch (InstantiationException e4) {
                e = e4;
                AbstractC6580.m11700("Failed to instantiate the specified SLF4JServiceProvider (" + property + ")", e);
            } catch (NoSuchMethodException e5) {
                e = e5;
                AbstractC6580.m11700("Failed to instantiate the specified SLF4JServiceProvider (" + property + ")", e);
            } catch (InvocationTargetException e6) {
                e = e6;
                AbstractC6580.m11700("Failed to instantiate the specified SLF4JServiceProvider (" + property + ")", e);
            }
        }
        if (c6581 != null) {
            arrayList.add(c6581);
            return arrayList;
        }
        Iterator it = (System.getSecurityManager() == null ? ServiceLoader.load(C6581.class, classLoader) : (ServiceLoader) AccessController.doPrivileged(new PrivilegedAction() { // from class: 飘花落叶言苏楪子哲世兰.飘花落叶言子楪世哲苏兰
            @Override // java.security.PrivilegedAction
            public final Object run() {
                return ServiceLoader.load(C6581.class, classLoader);
            }
        })).iterator();
        while (it.hasNext()) {
            try {
                arrayList.add((C6581) it.next());
            } catch (ServiceConfigurationError e7) {
                AbstractC6580.m11701("A service provider failed to instantiate:\n" + e7.getMessage());
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static void m15264(ArrayList arrayList) {
        if (arrayList.size() > 1) {
            AbstractC6580.m11697("Class path contains multiple SLF4J providers.");
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                AbstractC6580.m11697("Found provider [" + ((C6581) it.next()) + "]");
            }
            AbstractC6580.m11697("See https://www.slf4j.org/codes.html#multiple_bindings for an explanation.");
        }
    }
}
