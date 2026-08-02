package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ph1 extends ClassLoader {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ph1(ClassLoader classLoader) {
        super(classLoader);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.ClassLoader
    public final Class findClass(String str) throws ClassNotFoundException {
        str.getClass();
        Class<?> clsLoadClass = c5.d.loadClass(str);
        clsLoadClass.getClass();
        return clsLoadClass;
    }
}
