package p009B2;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: B2.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0220a {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f766a = 0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        new ConcurrentHashMap();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final Class m324a(ClassLoader classLoader, String str) {
        if (classLoader == null) {
            classLoader = null;
        }
        Class<?> cls = classLoader != null ? Class.forName(str, false, classLoader) : Class.forName(str);
        if (cls != null) {
            return cls;
        }
        throw new IllegalStateException(("JVM class not resolved: " + str).toString());
    }
}
