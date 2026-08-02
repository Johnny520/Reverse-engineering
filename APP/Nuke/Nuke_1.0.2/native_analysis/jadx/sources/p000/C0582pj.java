package p000;

/* JADX INFO: renamed from: pj */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0582pj extends ClassLoader {

    /* JADX INFO: renamed from: a */
    public final ClassLoader f8370a;

    /* JADX INFO: renamed from: b */
    public final ClassLoader f8371b = AbstractC0079c5.f1154e;

    public C0582pj(ClassLoader classLoader) {
        this.f8370a = classLoader;
    }

    @Override // java.lang.ClassLoader
    public final Class findClass(String str) {
        str.getClass();
        try {
            return this.f8370a.loadClass(str);
        } catch (Exception unused) {
            ClassLoader classLoader = this.f8371b;
            if (classLoader != null) {
                return classLoader.loadClass(str);
            }
            return null;
        }
    }
}
