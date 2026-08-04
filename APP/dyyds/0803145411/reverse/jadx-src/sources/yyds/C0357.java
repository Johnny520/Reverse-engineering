package yyds;

import java.lang.reflect.Method;

/* JADX INFO: renamed from: yyds.ᛲᛵᲁᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0357 extends ClassLoader {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static final String f1865 = AbstractC1324.class.getName();

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public static final Class[] f1866;

    static {
        Class cls = Integer.TYPE;
        f1866 = new Class[]{String.class, byte[].class, cls, cls};
    }

    public C0357(ClassLoader classLoader) {
        super(classLoader);
    }

    @Override // java.lang.ClassLoader
    public final synchronized Class loadClass(String str, boolean z) {
        if (str.equals(f1865)) {
            return AbstractC1324.class;
        }
        return super.loadClass(str, z);
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final Class m1057(String str, byte[] bArr) {
        try {
            Method declaredMethod = ClassLoader.class.getDeclaredMethod("defineClass", f1866);
            declaredMethod.setAccessible(true);
            return (Class) declaredMethod.invoke(getParent(), str, bArr, 0, Integer.valueOf(bArr.length));
        } catch (Exception unused) {
            return defineClass(str, bArr, 0, bArr.length);
        }
    }
}
