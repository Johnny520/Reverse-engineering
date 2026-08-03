package bsh.loader;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class BshPluginLoader extends ClassLoader {
    private final ConcurrentMap<String, Class<?>> clazzMap;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public BshPluginLoader(ClassLoader classLoader) {
        super(classLoader);
        this.clazzMap = new ConcurrentHashMap();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.ClassLoader
    public Class<?> findClass(String str) throws ClassNotFoundException {
        Class<?> cls = this.clazzMap.get(str);
        if (cls != null) {
            return cls;
        }
        throw new ClassNotFoundException(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void putClass(String str, Class<?> cls) {
        this.clazzMap.put(str, cls);
    }
}
