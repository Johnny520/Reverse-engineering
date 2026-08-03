package p000a;

import android.content.Context;
import java.util.Arrays;
import top.mmjz.floatingclouds.plugin.IPlugin;

/* JADX INFO: renamed from: a.g8 */
/* JADX INFO: loaded from: classes.dex */
public final class C0592g8 implements IPlugin {
    @Override // top.mmjz.floatingclouds.plugin.IPlugin
    public final void handleHook(C0173J8 c0173j8) {
        Class<?> cls;
        Object objM2206a;
        Class<?> cls2;
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
        C0597gd c0597gdM1467a = C0616hd.m1467a("F005_hide_contact_label", c0578fd);
        if (!c0597gdM1467a.f2208a || (cls2 = c0597gdM1467a.f2209b) == null) {
            C0647j6 c0647j6 = c0597gdM1467a.f2210c;
            C0908x1.m2197e(Arrays.copyOf(new Object[]{C0944z.m2227g("HideContactLabel: labelStorage resolve FAILED (reason=", c0647j6 != null ? c0647j6.f2390c : null, ")")}, 1));
            cls = null;
        } else {
            C0908x1.m2194b(Arrays.copyOf(new Object[]{"HideContactLabel: labelStorage resolved via " + c0597gdM1467a.f2211d + ": " + cls2.getName()}, 1));
            cls = c0597gdM1467a.f2209b;
        }
        if (cls == null) {
            C0908x1.m2197e(Arrays.copyOf(new Object[]{"HideContactLabel: label storage class not found (DexKit + fallback all failed)"}, 1));
            return;
        }
        String str = C0034Be.m94I(cls.getName(), "storage.g4", false) ? "s2" : "j";
        try {
            C0173J8.m463a(c0173j8, cls.getName(), str, new Class[]{String.class}, new C0168J3(str, 2));
            C0908x1.m2194b(Arrays.copyOf(new Object[]{"HideContactLabel: hooked " + cls.getName() + "." + str}, 1));
            objM2206a = C0413Wf.f1577a;
        } catch (Throwable th) {
            objM2206a = C0920xd.m2206a(th);
        }
        Throwable thM2189a = C0901wd.m2189a(objM2206a);
        if (thM2189a != null) {
            String name = cls.getName();
            String message = thM2189a.getMessage();
            StringBuilder sbM2229i = C0944z.m2229i("HideContactLabel: hook ", name, ".", str, " fail: ");
            sbM2229i.append(message);
            C0908x1.m2193a(Arrays.copyOf(new Object[]{sbM2229i.toString()}, 1));
        }
    }
}
