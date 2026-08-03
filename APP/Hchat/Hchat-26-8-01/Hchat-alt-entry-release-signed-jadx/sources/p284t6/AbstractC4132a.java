package p284t6;

import java.util.concurrent.ConcurrentHashMap;
import okio.C3193a;

/* JADX INFO: renamed from: t6.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4132a {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        new ConcurrentHashMap();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final Class m8316a(ClassLoader classLoader, String str) {
        if (classLoader == null) {
            classLoader = null;
        }
        Class<?> cls = classLoader != null ? Class.forName(str, false, classLoader) : Class.forName(str);
        if (cls != null) {
            return cls;
        }
        C3193a.m6826p(str, "JVM class not resolved: ");
        return null;
    }
}
