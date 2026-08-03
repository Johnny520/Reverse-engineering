package p000a;

import java.lang.reflect.Method;
import java.util.Arrays;
import top.mmjz.floatingclouds.plugin.IPlugin;

/* JADX INFO: renamed from: a.ch */
/* JADX INFO: loaded from: classes.dex */
public final class C0525ch implements IPlugin {
    @Override // top.mmjz.floatingclouds.plugin.IPlugin
    public final void handleHook(C0173J8 c0173j8) {
        C0631i9.m1482e(c0173j8, "session");
        ClassLoader classLoader = c0173j8.f608a;
        Class clsM13b = classLoader == null ? null : C0002A1.m13b(classLoader, "com.tencent.wcdb.database.SQLiteDatabase");
        if (clsM13b == null) {
            return;
        }
        Class clsM13b2 = classLoader == null ? null : C0002A1.m13b(classLoader, "com.tencent.wcdb.database.SQLiteCipherSpec");
        Class clsM13b3 = classLoader == null ? null : C0002A1.m13b(classLoader, "com.tencent.wcdb.database.SQLiteDatabase$CursorFactory");
        Class clsM13b4 = classLoader != null ? C0002A1.m13b(classLoader, "com.tencent.wcdb.DatabaseErrorHandler") : null;
        Class cls = Integer.TYPE;
        Method methodM15d = C0002A1.m15d(clsM13b, "openDatabase", String.class, byte[].class, clsM13b2, clsM13b3, cls, clsM13b4, cls);
        if (methodM15d == null) {
            C0908x1.m2197e(Arrays.copyOf(new Object[]{"WXDbPlugin: openDatabase method not found"}, 1));
        } else {
            c0173j8.m470f(methodM15d).intercept(new C0877v8());
        }
    }
}
