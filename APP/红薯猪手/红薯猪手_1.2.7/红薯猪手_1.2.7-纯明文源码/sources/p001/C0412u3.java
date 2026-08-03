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
                throw new NullPointerException("classLoader == null");
            }
            try {
                Field declaredField = ClassLoader.class.getDeclaredField("parent");
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
        C0237h4.m1090("clBase", classLoader2);
        this.f1123 = classLoader;
        this.f1124 = classLoader2;
    }

    @Override // java.lang.ClassLoader
    public final URL getResource(String str) {
        C0237h4.m1090("name", str);
        ClassLoader classLoader = this.f1123;
        URL resource = classLoader != null ? classLoader.getResource(str) : null;
        if (resource != null) {
            return resource;
        }
        URL resource2 = this.f1124.getResource(str);
        C0237h4.m1089("getResource(...)", resource2);
        return resource2;
    }

    @Override // java.lang.ClassLoader
    public final Class<?> loadClass(String str, boolean z) throws ClassNotFoundException {
        C0237h4.m1090("name", str);
        try {
            ClassLoader classLoader = this.f1123;
            C0237h4.m865(classLoader);
            Class<?> clsLoadClass = classLoader.loadClass(str);
            C0237h4.m1089("loadClass(...)", clsLoadClass);
            return clsLoadClass;
        } catch (Exception unused) {
            Class<?> clsLoadClass2 = this.f1124.loadClass(str);
            C0237h4.m1089("loadClass(...)", clsLoadClass2);
            return clsLoadClass2;
        }
    }
}
