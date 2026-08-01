package p400;

import io.ktor.client.plugins.api.C3885;
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
import org.slf4j.event.C5745;
import org.slf4j.helpers.AbstractC5749;
import org.slf4j.helpers.C5747;
import org.slf4j.helpers.C5748;
import org.slf4j.helpers.C5750;
import org.slf4j.helpers.NOPLogger;
import p330.C8796;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: 飘花落叶言苏楪子哲兰世.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC9154 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final String[] f25556;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static volatile C5750 f25557;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static volatile int f25560;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C5750 f25559 = new C5750(1);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C5750 f25558 = new C5750(0);

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
        f25556 = new String[]{"2.0"};
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static void m14708(LinkedHashSet linkedHashSet) {
        if (linkedHashSet.isEmpty()) {
            return;
        }
        AbstractC5749.m11081("Class path contains SLF4J bindings targeting slf4j-api versions 1.7.x or earlier.");
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            AbstractC5749.m11081("Ignoring binding found at [" + ((URL) it.next()) + "]");
        }
        AbstractC5749.m11081("See https://www.slf4j.org/codes.html#ignoredBindings for an explanation.");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static void m14709(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            C5919.m11250("No providers were found which is impossible after successful initialization.");
            return;
        }
        if (arrayList.size() > 1) {
            AbstractC5749.m11082("Actual provider is of type [" + arrayList.get(0) + "]");
            return;
        }
        AbstractC5749.m11086("Connected with provider of type [" + ((C5750) arrayList.get(0)).getClass().getName() + "]");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static void m14710() {
        C5750 c5750 = f25559;
        synchronized (c5750) {
            try {
                ((C5747) c5750.f15752).f15742 = true;
                C5747 c5747 = (C5747) c5750.f15752;
                c5747.getClass();
                for (C5748 c5748 : new ArrayList(c5747.f15740.values())) {
                    c5748.f15747 = m14712(c5748.f15749);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        LinkedBlockingQueue linkedBlockingQueue = ((C5747) f25559.f15752).f15741;
        int size = linkedBlockingQueue.size();
        ArrayList<C5745> arrayList = new ArrayList(128);
        int i = 0;
        while (linkedBlockingQueue.drainTo(arrayList, 128) != 0) {
            for (C5745 c5745 : arrayList) {
                if (c5745 != null) {
                    C5748 c57482 = c5745.f15738;
                    String str = c57482.f15749;
                    if (c57482.f15747 == null) {
                        C5919.m11250("Delegate logger cannot be null at this state.");
                        return;
                    } else if (!(c57482.f15747 instanceof NOPLogger)) {
                        if (!c57482.m11079()) {
                            AbstractC5749.m11081(str);
                        } else if (c57482.isEnabledForLevel(c5745.f15739) && c57482.m11079()) {
                            try {
                                c57482.f15744.invoke(c57482.f15747, c5745);
                            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused) {
                            }
                        }
                    }
                }
                int i2 = i + 1;
                if (i == 0) {
                    if (c5745.f15738.m11079()) {
                        AbstractC5749.m11081("A number (" + size + ") of logging calls during the initialization phase have been intercepted and are");
                        AbstractC5749.m11081("now being replayed. These are subject to the filtering rules of the underlying logging system.");
                        AbstractC5749.m11081("See also https://www.slf4j.org/codes.html#replay");
                    } else if (!(c5745.f15738.f15747 instanceof NOPLogger)) {
                        AbstractC5749.m11081("The following set of substitute loggers may have been accessed");
                        AbstractC5749.m11081("during the initialization phase. Logging calls during this");
                        AbstractC5749.m11081("phase were not honored. However, subsequent logging calls to these");
                        AbstractC5749.m11081("loggers will work as normally expected.");
                        AbstractC5749.m11081("See also https://www.slf4j.org/codes.html#substituteLogger");
                    }
                }
                i = i2;
            }
            arrayList.clear();
        }
        C5747 c57472 = (C5747) f25559.f15752;
        c57472.f15740.clear();
        c57472.f15741.clear();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final void m14711() {
        try {
            ArrayList arrayListM14713 = m14713();
            m14714(arrayListM14713);
            if (arrayListM14713.isEmpty()) {
                f25560 = 4;
                AbstractC5749.m11081("No SLF4J providers were found.");
                AbstractC5749.m11081("Defaulting to no-operation (NOP) logger implementation");
                AbstractC5749.m11081("See https://www.slf4j.org/codes.html#noProviders for further details.");
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                try {
                    ClassLoader classLoader = AbstractC9154.class.getClassLoader();
                    Enumeration<URL> systemResources = classLoader == null ? ClassLoader.getSystemResources("org/slf4j/impl/StaticLoggerBinder.class") : classLoader.getResources("org/slf4j/impl/StaticLoggerBinder.class");
                    while (systemResources.hasMoreElements()) {
                        linkedHashSet.add(systemResources.nextElement());
                    }
                } catch (IOException e) {
                    AbstractC5749.m11084("Error getting resources from path", e);
                }
                m14708(linkedHashSet);
            } else {
                f25557 = (C5750) arrayListM14713.get(0);
                f25557.getClass();
                f25560 = 3;
                m14709(arrayListM14713);
            }
            m14710();
            if (f25560 == 3) {
                try {
                    switch (f25557.f15753) {
                        case 0:
                            boolean z = false;
                            for (String str : f25556) {
                                if ("2.0.99".startsWith(str)) {
                                    z = true;
                                }
                            }
                            if (z) {
                                return;
                            }
                            AbstractC5749.m11081("The requested version 2.0.99 by your slf4j provider is not compatible with " + Arrays.asList(f25556).toString());
                            AbstractC5749.m11081("See https://www.slf4j.org/codes.html#version_mismatch for further details.");
                            return;
                        default:
                            throw new UnsupportedOperationException();
                    }
                } catch (Throwable th) {
                    AbstractC5749.m11084("Unexpected problem occurred during version sanity check", th);
                }
            }
        } catch (Exception e2) {
            f25560 = 2;
            AbstractC5749.m11084("Failed to instantiate SLF4J LoggerFactory", e2);
            C8796.m14449("Unexpected initialization failure", e2);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static InterfaceC9156 m14712(String str) {
        C5750 c5750;
        InterfaceC9157 interfaceC9157;
        if (f25560 == 0) {
            synchronized (AbstractC9154.class) {
                try {
                    if (f25560 == 0) {
                        f25560 = 1;
                        m14711();
                    }
                } finally {
                }
            }
        }
        int i = f25560;
        if (i != 1) {
            c5750 = null;
            if (i == 2) {
                C5919.m11250("org.slf4j.LoggerFactory in failed state. Original exception was thrown EARLIER. See also https://www.slf4j.org/codes.html#unsuccessfulInit");
            } else if (i == 3) {
                c5750 = f25557;
            } else if (i == 4) {
                c5750 = f25558;
            } else {
                C5919.m11250("Unreachable code");
            }
        } else {
            c5750 = f25559;
        }
        switch (c5750.f15753) {
            case 0:
                interfaceC9157 = (C3885) c5750.f15752;
                break;
            default:
                interfaceC9157 = (C5747) c5750.f15752;
                break;
        }
        return interfaceC9157.mo8286(str);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static ArrayList m14713() {
        ArrayList arrayList = new ArrayList();
        final ClassLoader classLoader = AbstractC9154.class.getClassLoader();
        String property = System.getProperty("slf4j.provider");
        C5750 c5750 = null;
        if (property != null && !property.isEmpty()) {
            try {
                AbstractC5749.m11082("Attempting to load provider \"" + property + "\" specified via \"slf4j.provider\" system property");
                c5750 = (C5750) classLoader.loadClass(property).getConstructor(null).newInstance(null);
            } catch (ClassCastException e) {
                AbstractC5749.m11084("Specified SLF4JServiceProvider (" + property + ") does not implement SLF4JServiceProvider interface", e);
            } catch (ClassNotFoundException e2) {
                e = e2;
                AbstractC5749.m11084("Failed to instantiate the specified SLF4JServiceProvider (" + property + ")", e);
            } catch (IllegalAccessException e3) {
                e = e3;
                AbstractC5749.m11084("Failed to instantiate the specified SLF4JServiceProvider (" + property + ")", e);
            } catch (InstantiationException e4) {
                e = e4;
                AbstractC5749.m11084("Failed to instantiate the specified SLF4JServiceProvider (" + property + ")", e);
            } catch (NoSuchMethodException e5) {
                e = e5;
                AbstractC5749.m11084("Failed to instantiate the specified SLF4JServiceProvider (" + property + ")", e);
            } catch (InvocationTargetException e6) {
                e = e6;
                AbstractC5749.m11084("Failed to instantiate the specified SLF4JServiceProvider (" + property + ")", e);
            }
        }
        if (c5750 != null) {
            arrayList.add(c5750);
            return arrayList;
        }
        Iterator it = (System.getSecurityManager() == null ? ServiceLoader.load(C5750.class, classLoader) : (ServiceLoader) AccessController.doPrivileged(new PrivilegedAction() { // from class: 飘花落叶言苏楪子哲兰世.飘花落叶言子楪世哲苏兰
            @Override // java.security.PrivilegedAction
            public final Object run() {
                return ServiceLoader.load(C5750.class, classLoader);
            }
        })).iterator();
        while (it.hasNext()) {
            try {
                arrayList.add((C5750) it.next());
            } catch (ServiceConfigurationError e7) {
                AbstractC5749.m11085("A service provider failed to instantiate:\n" + e7.getMessage());
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static void m14714(ArrayList arrayList) {
        if (arrayList.size() > 1) {
            AbstractC5749.m11081("Class path contains multiple SLF4J providers.");
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                AbstractC5749.m11081("Found provider [" + ((C5750) it.next()) + "]");
            }
            AbstractC5749.m11081("See https://www.slf4j.org/codes.html#multiple_bindings for an explanation.");
        }
    }
}
