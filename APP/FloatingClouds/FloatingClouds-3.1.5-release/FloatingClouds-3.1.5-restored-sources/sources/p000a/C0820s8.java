package p000a;

import android.content.Context;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import p000a.C0186K3;
import top.mmjz.floatingclouds.plugin.IPlugin;

/* JADX INFO: renamed from: a.s8 */
/* JADX INFO: loaded from: classes.dex */
public final class C0820s8 implements IPlugin {

    /* JADX INFO: renamed from: c */
    public static final Set<String> f3272c = C0726n9.m1681z("find_friends_by_finder", "find_friends_by_finder_live", "find_friends_by_finder_live_above_look", "find_friends_by_look", "app_brand_entrance", "find_friends_by_ting", "find_friends_by_ting_play_state", "find_friends_by_near_v3");

    /* JADX INFO: renamed from: a */
    public volatile Object f3273a;

    /* JADX INFO: renamed from: b */
    public boolean f3274b;

    /* JADX INFO: renamed from: a */
    public static void m1919a(Object obj) {
        Method method;
        C0186K3.f638a.getClass();
        boolean z = C0186K3.a.m511l() && C0186K3.a.m508i().f2437g;
        boolean z2 = C0186K3.a.m511l() && C0186K3.a.m508i().f2438h;
        if (z || z2) {
            try {
                C0112G1 c0112g1M2122I = C0889w1.m2122I(obj.getClass().getFields());
                while (c0112g1M2122I.hasNext()) {
                    Field field = (Field) c0112g1M2122I.next();
                    field.setAccessible(true);
                    Object obj2 = field.get(obj);
                    if (obj2 != null) {
                        Method[] methods = obj2.getClass().getMethods();
                        C0631i9.m1481d(methods, "getMethods(...)");
                        int length = methods.length;
                        int i = 0;
                        while (true) {
                            if (i >= length) {
                                method = null;
                                break;
                            }
                            method = methods[i];
                            if (C0631i9.m1478a(method.getName(), "l") && method.getParameterTypes().length == 2 && C0631i9.m1478a(method.getParameterTypes()[0], String.class) && C0631i9.m1478a(method.getParameterTypes()[1], Boolean.TYPE)) {
                                break;
                            } else {
                                i++;
                            }
                        }
                        if (method != null) {
                            if (z) {
                                method.invoke(obj2, "album_dyna_photo_ui_title", Boolean.TRUE);
                            }
                            if (z2) {
                                Iterator<String> it = f3272c.iterator();
                                while (it.hasNext()) {
                                    method.invoke(obj2, it.next(), Boolean.TRUE);
                                }
                            }
                            C0908x1.m2194b(Arrays.copyOf(new Object[]{"HideSnsEntry: discover tab entries processed (sns=" + z + ", f020=" + z2 + ")"}, 1));
                            return;
                        }
                    }
                }
            } catch (Throwable th) {
                C0908x1.m2197e(Arrays.copyOf(new Object[]{C0944z.m2231k("HideSnsEntry: hideDiscoverTabEntries failed: ", th.getMessage())}, 1));
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m1920b() {
        C0186K3.f638a.getClass();
        return C0186K3.a.m511l() && C0186K3.a.m508i().f2436f;
    }

    @Override // top.mmjz.floatingclouds.plugin.IPlugin
    public final void handleHook(C0173J8 c0173j8) {
        String str;
        C0173J8 c0173j82;
        Method method;
        Class<?> cls;
        int i = 3;
        int i2 = 4;
        C0631i9.m1482e(c0173j8, "session");
        int i3 = -1;
        if (C0021B1.f64a == -1) {
            try {
                Context context = C0889w1.f3488p;
                C0631i9.m1479b(context);
                i3 = context.getPackageManager().getPackageInfo("com.tencent.mm", 0).versionCode;
            } catch (Exception e) {
                C0908x1.m2193a(Arrays.copyOf(new Object[]{e}, 1));
            }
            C0021B1.f64a = i3;
        }
        C0578fd c0578fd = new C0578fd(C0021B1.f64a, c0173j8.f608a);
        C0616hd.f2278a.getClass();
        C0597gd c0597gdM1467a = C0616hd.m1467a("F006_find_more_friends_ui", c0578fd);
        Method method2 = null;
        if (!c0597gdM1467a.f2208a || (cls = c0597gdM1467a.f2209b) == null) {
            C0647j6 c0647j6 = c0597gdM1467a.f2210c;
            C0908x1.m2197e("HideSnsEntry", C0944z.m2231k("Resolver: FindMoreFriendsUI not resolved: ", c0647j6 != null ? c0647j6.f2390c : null));
            ConcurrentHashMap<String, C0101F8> concurrentHashMap = C0083E8.f263a;
            C0647j6 c0647j62 = c0597gdM1467a.f2210c;
            if (c0647j62 == null || (str = c0647j62.f2390c) == null) {
                str = "unknown";
            }
            C0083E8.m208a("F006", "findMoreUI", "FindMoreFriendsUI", str);
        } else {
            C0908x1.m2194b("HideSnsEntry", "Resolver: FindMoreFriendsUI → ".concat(cls.getName()));
            Method method3 = C0616hd.m1467a("F006_entry_control_method", c0578fd).f2213f;
            if (method3 != null) {
                C0908x1.m2194b("HideSnsEntry", C0944z.m2231k("Resolver: C1() → ", method3.getName()));
                C0173J8.m469h(c0173j8, "F006", method3, new C0687l8(this, i2));
                ConcurrentHashMap<String, C0101F8> concurrentHashMap2 = C0083E8.f263a;
                C0083E8.m209b("F006", "entryControl_C1", cls.getName() + "." + method3.getName());
            } else {
                C0908x1.m2197e("HideSnsEntry", "Resolver: C1() not resolved, fallback to reflection");
                Method[] declaredMethods = cls.getDeclaredMethods();
                C0631i9.m1481d(declaredMethods, "getDeclaredMethods(...)");
                int length = declaredMethods.length;
                int i4 = 0;
                while (true) {
                    if (i4 >= length) {
                        break;
                    }
                    Method method4 = declaredMethods[i4];
                    if (C0631i9.m1478a(method4.getReturnType(), Void.TYPE)) {
                        Class<?>[] parameterTypes = method4.getParameterTypes();
                        C0631i9.m1481d(parameterTypes, "getParameterTypes(...)");
                        if (parameterTypes.length == 0 && method4.getName().length() <= 3) {
                            method2 = method4;
                            break;
                        }
                    }
                    i4++;
                }
                if (method2 != null) {
                    C0173J8.m469h(c0173j8, "F006", method2, new C0687l8(this, 5));
                    ConcurrentHashMap<String, C0101F8> concurrentHashMap3 = C0083E8.f263a;
                    C0083E8.m209b("F006", "entryControl_fb", cls.getName() + "." + method2.getName());
                } else {
                    ConcurrentHashMap<String, C0101F8> concurrentHashMap4 = C0083E8.f263a;
                    C0083E8.m208a("F006", "entryControl", cls.getName(), "no void() method");
                }
            }
        }
        if (C0002A1.m13b(c0173j8.f608a, "com.tencent.mm.plugin.profile.ui.ContactInfoUI") == null) {
            c0173j82 = c0173j8;
        } else {
            c0173j82 = c0173j8;
            C0173J8.m466d(c0173j82, "F006", "com.tencent.mm.plugin.profile.ui.ContactInfoUI", "initView", new Class[0], new C0687l8(this, i));
            C0083E8.m209b("F006", "contactProfile", "com.tencent.mm.plugin.profile.ui.ContactInfoUI");
        }
        Class clsM13b = C0002A1.m13b(c0173j82.f608a, "com.tencent.mm.view.recyclerview.WxRecyclerView");
        if (clsM13b == null || (method = (Method) C0238N1.m630d0(C0002A1.m17f(clsM13b, new C0687l8(2)))) == null) {
            return;
        }
        c0173j82.m470f(method).intercept(new C0740o4(this, i2, c0173j82));
    }
}
