package p010B3;

import p117X2.AbstractC1665j;

/* JADX INFO: renamed from: B3.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0223b extends ClassLoader {

    /* JADX INFO: renamed from: a */
    public final ClassLoader f775a;

    /* JADX INFO: renamed from: b */
    public final ClassLoader f776b = AbstractC0222a.f774f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0223b(ClassLoader classLoader) {
        this.f775a = classLoader;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.ClassLoader
    public final Class findClass(String str) {
        AbstractC1665j.m2985e(str, "name");
        try {
            return this.f775a.loadClass(str);
        } catch (Exception unused) {
            ClassLoader classLoader = this.f776b;
            if (classLoader != null) {
                return classLoader.loadClass(str);
            }
            return null;
        }
    }
}
