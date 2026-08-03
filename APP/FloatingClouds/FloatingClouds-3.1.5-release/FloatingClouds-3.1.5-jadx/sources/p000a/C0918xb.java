package p000a;

import android.content.Context;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;
import top.mmjz.floatingclouds.plugin.IPlugin;

/* JADX INFO: renamed from: a.xb */
/* JADX INFO: loaded from: classes.dex */
public final class C0918xb implements IPlugin {
    @Override // top.mmjz.floatingclouds.plugin.IPlugin
    public final void handleHook(C0173J8 c0173j8) {
        Object objM2206a;
        C0631i9.m1482e(c0173j8, "session");
        ClassLoader classLoader = c0173j8.f608a;
        int i = -1;
        if (C0021B1.f64a == -1) {
            try {
                Context context = C0889w1.f3488p;
                C0631i9.m1479b(context);
                i = context.getPackageManager().getPackageInfo("com.tencent.mm", 0).versionCode;
            } catch (Exception e) {
                C0908x1.m2193a(Arrays.copyOf(new Object[]{e}, 1));
            }
            C0021B1.f64a = i;
        }
        C0578fd c0578fd = new C0578fd(C0021B1.f64a, classLoader);
        C0616hd.f2278a.getClass();
        C0597gd c0597gdM1467a = C0616hd.m1467a("F017_msg_storage", c0578fd);
        Class<?> cls = c0597gdM1467a.f2209b;
        String name = cls != null ? cls.getName() : "com.tencent.mm.storage.f9";
        String strM1427b = c0597gdM1467a.m1427b("insertMethod");
        if (strM1427b == null) {
            strM1427b = "H9";
        }
        String str = strM1427b;
        Class<?> clsM1426a = c0597gdM1467a.m1426a("msgInfoClass");
        C0908x1.m2194b(Arrays.copyOf(new Object[]{"MsgInsertDisp: resolve via=" + c0597gdM1467a.f2211d + " storage=" + name + " method=" + str + " msgInfo=" + (clsM1426a != null ? clsM1426a.getName() : null)}, 1));
        try {
        } catch (Throwable th) {
            objM2206a = C0920xd.m2206a(th);
        }
        if (clsM1426a == null) {
            C0908x1.m2193a(Arrays.copyOf(new Object[]{"MsgInsertDisp: msgInfoClass is null, cannot hook"}, 1));
            return;
        }
        C0173J8.m466d(c0173j8, "F030", name, str, new Class[]{clsM1426a}, new C0263O8(16));
        ConcurrentHashMap<String, C0101F8> concurrentHashMap = C0083E8.f263a;
        C0083E8.m209b("F030", "msgInsertDispatch", name + "." + str);
        C0908x1.m2194b(Arrays.copyOf(new Object[]{"MsgInsertDisp: hooked " + name + "." + str + " — unified dispatch active"}, 1));
        objM2206a = C0413Wf.f1577a;
        Throwable thM2189a = C0901wd.m2189a(objM2206a);
        if (thM2189a != null) {
            C0908x1.m2193a(Arrays.copyOf(new Object[]{C0944z.m2231k("MsgInsertDisp: hook FAILED: ", thM2189a.getMessage())}, 1));
        }
    }
}
