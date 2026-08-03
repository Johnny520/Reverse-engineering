package p000a;

import java.lang.reflect.Method;
import top.mmjz.floatingclouds.plugin.IPlugin;

/* JADX INFO: renamed from: a.x3 */
/* JADX INFO: loaded from: classes.dex */
public final class C0910x3 implements IPlugin {

    /* JADX INFO: renamed from: a */
    public final C0233Me f3514a = new C0233Me(new C0891w3(0));

    @Override // top.mmjz.floatingclouds.plugin.IPlugin
    public final void handleHook(C0173J8 c0173j8) {
        C0631i9.m1482e(c0173j8, "session");
        ClassLoader classLoader = c0173j8.f608a;
        Class clsM13b = classLoader == null ? null : C0002A1.m13b(classLoader, "com.tencent.wcdb.database.SQLiteDatabase");
        if (clsM13b == null) {
            return;
        }
        for (Method method : C0002A1.m17f(clsM13b, new C0586g2(3))) {
            c0173j8.m470f(method).intercept(new C0700m2(1, this));
        }
    }
}
