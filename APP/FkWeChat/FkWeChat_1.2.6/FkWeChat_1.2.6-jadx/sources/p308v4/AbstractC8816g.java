package p308v4;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.function.Function;

/* JADX INFO: renamed from: v4.g */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8816g {

    /* JADX INFO: renamed from: a */
    public static final ConcurrentMap f29331a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b */
    public static final ConcurrentMap f29332b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Class m33807a(String str, byte[] bArr, ClassLoader classLoader, String str2) {
        try {
            return new C8811b().m33802f(str, bArr, classLoader).loadClass(str);
        } catch (Exception e10) {
            System.err.println("[BeanShell] getClassByCode: " + e10);
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ ClassLoader m33808b(String str, ClassLoader classLoader, String str2) {
        try {
            return new C8811b().m33805i(str, classLoader);
        } catch (Exception e10) {
            System.err.println("[BeanShell] GetLoaderByJar: " + e10);
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ ClassLoader m33809c(String str, ClassLoader classLoader, String str2) {
        try {
            return new C8811b().m33803g(str, classLoader);
        } catch (Exception e10) {
            System.err.println("[BeanShell] GetLoaderByDex: " + e10);
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ ClassLoader m33810d(String str, ClassLoader classLoader, String str2) {
        try {
            return new C8811b().m33800d(str, classLoader);
        } catch (Exception e10) {
            System.err.println("[BeanShell] GetLoaderByAar: " + e10);
            return null;
        }
    }

    /* JADX INFO: renamed from: e */
    public static String m33811e(String str, String str2, ClassLoader classLoader) {
        return str + "#" + str2 + "#" + System.identityHashCode(classLoader);
    }

    /* JADX INFO: renamed from: f */
    public static Class m33812f(String str, byte[] bArr) {
        return m33813g(str, bArr, AbstractC8816g.class.getClassLoader());
    }

    /* JADX INFO: renamed from: g */
    public static Class m33813g(final String str, final byte[] bArr, final ClassLoader classLoader) {
        String strM33820b = AbstractC8818i.m33820b(bArr);
        if (strM33820b == null) {
            return null;
        }
        return (Class) f29331a.computeIfAbsent(m33811e(str, strM33820b, classLoader), new Function() { // from class: v4.c
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return AbstractC8816g.m33807a(str, bArr, classLoader, (String) obj);
            }
        });
    }

    /* JADX INFO: renamed from: h */
    public static ClassLoader m33814h(final String str, final ClassLoader classLoader) {
        String strM33821c = AbstractC8818i.m33821c(str);
        if (strM33821c == null) {
            return null;
        }
        return (ClassLoader) f29332b.computeIfAbsent(m33811e("aar", strM33821c, classLoader), new Function() { // from class: v4.f
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return AbstractC8816g.m33810d(str, classLoader, (String) obj);
            }
        });
    }

    /* JADX INFO: renamed from: i */
    public static ClassLoader m33815i(final String str, final ClassLoader classLoader) {
        String strM33821c = AbstractC8818i.m33821c(str);
        if (strM33821c == null) {
            return null;
        }
        return (ClassLoader) f29332b.computeIfAbsent(m33811e("dex", strM33821c, classLoader), new Function() { // from class: v4.e
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return AbstractC8816g.m33809c(str, classLoader, (String) obj);
            }
        });
    }

    /* JADX INFO: renamed from: j */
    public static ClassLoader m33816j(final String str, final ClassLoader classLoader) {
        String strM33821c = AbstractC8818i.m33821c(str);
        if (strM33821c == null) {
            return null;
        }
        return (ClassLoader) f29332b.computeIfAbsent(m33811e("jar", strM33821c, classLoader), new Function() { // from class: v4.d
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return AbstractC8816g.m33808b(str, classLoader, (String) obj);
            }
        });
    }
}
