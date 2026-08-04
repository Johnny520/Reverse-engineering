package yyds;

/* JADX INFO: renamed from: yyds.ᲀᛱᲇᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1932 extends ClassLoader {
    public C1932(ClassLoader classLoader) {
        super(classLoader);
    }

    @Override // java.lang.ClassLoader
    public final Class findClass(String str) {
        return C1932.class.getClassLoader().loadClass(str);
    }

    @Override // java.lang.ClassLoader
    public final Class loadClass(String str) {
        try {
            if (!str.startsWith("com.airbnb.lottie")) {
                Class<?> clsLoadClass = super.loadClass(str);
                if (clsLoadClass != null) {
                    return clsLoadClass;
                }
            }
        } catch (Throwable unused) {
        }
        return findClass(str);
    }

    @Override // java.lang.ClassLoader
    public final Class loadClass(String str, boolean z) {
        try {
            if (!str.startsWith("com.airbnb.lottie")) {
                Class<?> clsLoadClass = super.loadClass(str, z);
                if (clsLoadClass != null) {
                    return clsLoadClass;
                }
            }
        } catch (Throwable unused) {
        }
        return findClass(str);
    }
}
