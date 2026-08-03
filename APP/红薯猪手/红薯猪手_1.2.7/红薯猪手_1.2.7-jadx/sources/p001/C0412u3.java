package p001;

import android.annotation.SuppressLint;
import de.robv.android.xposed.XposedBridge;
import java.lang.reflect.Field;
import java.net.URL;

/* JADX INFO: renamed from: ۟.u3 */
/* JADX INFO: loaded from: classes.dex */
public final class C0412u3 extends ClassLoader {

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final /* synthetic */ int f1825 = 0;

    /* JADX INFO: renamed from: ۥ */
    public final ClassLoader f1123;

    /* JADX INFO: renamed from: ۥ۟ */
    public final ClassLoader f1124;

    /* JADX INFO: renamed from: ۟.u3$a */
    public static final class a {
        @SuppressLint({"DiscouragedPrivateApi"})
        /* JADX INFO: renamed from: ۥ */
        public static void m945(ClassLoader classLoader) {
            if (classLoader == null) {
                throw new NullPointerException(C0341oa.m915(new byte[]{14, -30, 32, 1, 17, -35, 2, -17, 37, 23, 16, -79, 80, -77, 97, 28, 23, -3, 1}, new byte[]{109, -114, 65, 114, 98, -111}));
            }
            try {
                Field declaredField = ClassLoader.class.getDeclaredField(C0341oa.m915(new byte[]{91, -28, 14, 7, -88, -68}, new byte[]{43, -123, 124, 98, -58, -56}));
                declaredField.setAccessible(true);
                ClassLoader classLoader2 = C0412u3.class.getClassLoader();
                Object obj = declaredField.get(classLoader2);
                ClassLoader classLoader3 = obj instanceof ClassLoader ? (ClassLoader) obj : null;
                if (classLoader3 == null) {
                    classLoader3 = XposedBridge.class.getClassLoader();
                }
                if (C0237h4.m864(classLoader3 != null ? classLoader3.getClass().getName() : null, C0412u3.class.getName())) {
                    return;
                }
                declaredField.set(classLoader2, new C0412u3(classLoader3, classLoader));
            } catch (Exception unused) {
            }
        }
    }

    public C0412u3(ClassLoader classLoader, ClassLoader classLoader2) {
        C0237h4.m1090(C0341oa.m915(new byte[]{-24, 79, 20, -23, -111, 42}, new byte[]{-117, 35, 86, -120, -30, 79}), classLoader2);
        this.f1123 = classLoader;
        this.f1124 = classLoader2;
    }

    @Override // java.lang.ClassLoader
    public final URL getResource(String str) {
        C0237h4.m1090(C0341oa.m915(new byte[]{-80, -71, 84, 36}, new byte[]{-34, -40, 57, 65, 71, 89}), str);
        ClassLoader classLoader = this.f1123;
        URL resource = classLoader != null ? classLoader.getResource(str) : null;
        if (resource != null) {
            return resource;
        }
        URL resource2 = this.f1124.getResource(str);
        C0237h4.m1089(C0341oa.m915(new byte[]{61, 41, 97, -124, 114, 21, 53, 57, 103, -75, 114, 78, 116, 98, 59, -1}, new byte[]{90, 76, 21, -42, 23, 102}), resource2);
        return resource2;
    }

    @Override // java.lang.ClassLoader
    public final Class<?> loadClass(String str, boolean z) throws ClassNotFoundException {
        C0237h4.m1090(C0341oa.m915(new byte[]{115, 55, -52, -50}, new byte[]{29, 86, -95, -85, -26, -92}), str);
        try {
            ClassLoader classLoader = this.f1123;
            C0237h4.m865(classLoader);
            Class<?> clsLoadClass = classLoader.loadClass(str);
            C0237h4.m1089(C0341oa.m915(new byte[]{-41, -125, -101, 42, -17, 89, -38, -97, -119, 102, -126, 27, -107, -59}, new byte[]{-69, -20, -6, 78, -84, 53}), clsLoadClass);
            return clsLoadClass;
        } catch (Exception unused) {
            Class<?> clsLoadClass2 = this.f1124.loadClass(str);
            C0237h4.m1089(C0341oa.m915(new byte[]{-18, -36, 77, 64, -6, 41, -29, -64, 95, 12, -105, 107, -84, -102}, new byte[]{-126, -77, 44, 36, -71, 69}), clsLoadClass2);
            return clsLoadClass2;
        }
    }
}
