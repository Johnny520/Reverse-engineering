package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class pj extends ClassLoader {
    public final ClassLoader a;
    public final ClassLoader b = c5.e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public pj(ClassLoader classLoader) {
        this.a = classLoader;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.ClassLoader
    public final Class findClass(String str) {
        str.getClass();
        try {
            return this.a.loadClass(str);
        } catch (Exception unused) {
            ClassLoader classLoader = this.b;
            if (classLoader != null) {
                return classLoader.loadClass(str);
            }
            return null;
        }
    }
}
