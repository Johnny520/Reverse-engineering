package p000a;

import android.content.Context;
import java.util.Arrays;
import p000a.C0186K3;
import top.mmjz.floatingclouds.plugin.IPlugin;

/* JADX INFO: renamed from: a.Db */
/* JADX INFO: loaded from: classes.dex */
public final class C0068Db implements IPlugin {
    @Override // top.mmjz.floatingclouds.plugin.IPlugin
    public final void handleHook(C0173J8 c0173j8) {
        Object objM2206a;
        Object objM2206a2;
        C0631i9.m1482e(c0173j8, "session");
        C0186K3.f638a.getClass();
        if (!C0186K3.a.m508i().f2448r) {
            C0908x1.m2194b("MuteNotifPart", "disabled: hideMaskedMessageNotification=false");
            return;
        }
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
        C0578fd c0578fd = new C0578fd(C0021B1.f64a, c0173j8.f608a);
        C0616hd.f2278a.getClass();
        C0597gd c0597gdM1467a = C0616hd.m1467a("notification_precheck", c0578fd);
        Class<?> cls = c0597gdM1467a.f2209b;
        if (cls != null) {
            String name = cls.getName();
            C0908x1.m2194b("MuteNotifPart", "notification_precheck via=" + c0597gdM1467a.f2211d + " class=" + name);
            try {
                Class cls2 = Integer.TYPE;
                C0631i9.m1479b(cls2);
                Class cls3 = Boolean.TYPE;
                C0631i9.m1479b(cls3);
                C0173J8.m463a(c0173j8, name, "b", new Class[]{String.class, null, cls2, cls3}, new C0263O8(17));
                C0908x1.m2194b("MuteNotifPart", "hook m0.b OK (preNotificationCheck)");
                objM2206a2 = C0413Wf.f1577a;
            } catch (Throwable th) {
                objM2206a2 = C0920xd.m2206a(th);
            }
            Throwable thM2189a = C0901wd.m2189a(objM2206a2);
            if (thM2189a != null) {
                C0908x1.m2193a("MuteNotifPart", C0944z.m2231k("hook m0.b FAILED: ", thM2189a.getMessage()), thM2189a);
                C0908x1.m2197e("MuteNotifPart", "DexKit fallback for m0.b not yet implemented");
            }
        } else {
            C0647j6 c0647j6 = c0597gdM1467a.f2210c;
            C0908x1.m2197e("MuteNotifPart", C0944z.m2231k("notification_precheck resolve FAILED: ", c0647j6 != null ? c0647j6.f2390c : null));
        }
        try {
            C0173J8.m463a(c0173j8, "com.tencent.mm.booter.notification.a", "a", new Class[]{null, null}, new C0263O8(this, 18));
            C0908x1.m2194b("MuteNotifPart", "hook a.a OK (notification base fallback)");
            objM2206a = C0413Wf.f1577a;
        } catch (Throwable th2) {
            objM2206a = C0920xd.m2206a(th2);
        }
        Throwable thM2189a2 = C0901wd.m2189a(objM2206a);
        if (thM2189a2 != null) {
            C0908x1.m2197e("MuteNotifPart", C0944z.m2231k("hook a.a failed (non-critical): ", thM2189a2.getMessage()));
        }
    }
}
