package p308v4;

import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: v4.h */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public class C8817h {

    /* JADX INFO: renamed from: a */
    public final HashSet f29333a = new HashSet();

    /* JADX INFO: renamed from: a */
    public void m33817a(ClassLoader classLoader) {
        if (classLoader != null) {
            this.f29333a.add(classLoader);
        }
    }

    /* JADX INFO: renamed from: b */
    public Class m33818b(String str) {
        Iterator it = this.f29333a.iterator();
        while (it.hasNext()) {
            try {
                return ((ClassLoader) it.next()).loadClass(str);
            } catch (ClassNotFoundException unused) {
            }
        }
        System.err.println("[BeanShell] GetLoaderClass: " + str + " is null");
        return null;
    }
}
