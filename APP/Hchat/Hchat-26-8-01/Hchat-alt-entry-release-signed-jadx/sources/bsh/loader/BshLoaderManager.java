package bsh.loader;

import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class BshLoaderManager {
    private final HashSet<ClassLoader> loaders = new HashSet<>();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void addClassLoader(ClassLoader classLoader) {
        if (classLoader != null) {
            this.loaders.add(classLoader);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Class<?> getLoaderClass(String str) {
        Iterator<ClassLoader> it = this.loaders.iterator();
        while (it.hasNext()) {
            try {
                return it.next().loadClass(str);
            } catch (ClassNotFoundException unused) {
            }
        }
        System.err.println("[BeanShell] GetLoaderClass: " + str + " is null");
        return null;
    }
}
