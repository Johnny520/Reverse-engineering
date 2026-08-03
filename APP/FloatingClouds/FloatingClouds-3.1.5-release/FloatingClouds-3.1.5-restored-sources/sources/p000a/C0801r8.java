package p000a;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import p000a.C0582fh;
import top.mmjz.floatingclouds.plugin.IPlugin;

/* JADX INFO: renamed from: a.r8 */
/* JADX INFO: loaded from: classes.dex */
public final class C0801r8 implements IPlugin {

    /* JADX INFO: renamed from: a */
    public final HashMap<String, List<Field>> f3167a = new HashMap<>();

    /* JADX INFO: renamed from: a */
    public static boolean m1860a(String str) {
        Object next;
        ArrayList<String> arrayList;
        Iterator it = C0938yc.f3550a.values().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (C0582fh.class.isInstance((IPlugin) next)) {
                break;
            }
        }
        IPlugin iPlugin = (IPlugin) next;
        if (iPlugin == null) {
            Log.w("PluginProviders", "Plugin not found: ".concat(C0582fh.class.getSimpleName()));
        }
        C0582fh c0582fh = (C0582fh) (iPlugin != null ? iPlugin : null);
        if (c0582fh != null && (arrayList = c0582fh.f2156a) != null) {
            Iterator<String> it2 = arrayList.iterator();
            C0631i9.m1481d(it2, "iterator(...)");
            while (it2.hasNext()) {
                String next2 = it2.next();
                if (next2 != null && !C0034Be.m101P(next2) && C0034Be.m94I(str, C0034Be.m107V(next2).toString(), false)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m1861b(Object obj) {
        ExecutorService executorService = C0582fh.f2149G;
        C0582fh.a.m1423a("");
        Class<?> superclass = obj.getClass();
        HashMap<String, List<Field>> map = this.f3167a;
        String name = superclass.getName();
        List<Field> list = map.get(name);
        Object obj2 = list;
        if (list == null) {
            ArrayList arrayList = new ArrayList();
            while (superclass != null && !superclass.equals(Object.class)) {
                C0112G1 c0112g1M2122I = C0889w1.m2122I(superclass.getDeclaredFields());
                while (c0112g1M2122I.hasNext()) {
                    Field field = (Field) c0112g1M2122I.next();
                    if (C0631i9.m1478a(field.getType(), String.class)) {
                        field.setAccessible(true);
                        arrayList.add(field);
                    }
                }
                superclass = superclass.getSuperclass();
            }
            map.put(name, arrayList);
            obj2 = arrayList;
        }
        Iterator it = ((List) obj2).iterator();
        while (it.hasNext()) {
            try {
                Object obj3 = ((Field) it.next()).get(obj);
                String str = obj3 instanceof String ? (String) obj3 : null;
                if (str != null && !C0034Be.m101P(str) && m1860a(str)) {
                    return true;
                }
            } catch (Exception unused) {
            }
        }
        return false;
    }

    @Override // top.mmjz.floatingclouds.plugin.IPlugin
    public final void handleHook(C0173J8 c0173j8) {
        String str;
        Object objM2206a;
        Class<?> cls;
        int i = 2;
        C0631i9.m1482e(c0173j8, "session");
        int i2 = -1;
        if (C0021B1.f64a == -1) {
            try {
                Context context = C0889w1.f3488p;
                C0631i9.m1479b(context);
                i2 = context.getPackageManager().getPackageInfo("com.tencent.mm", 0).versionCode;
            } catch (Exception e) {
                C0908x1.m2193a(Arrays.copyOf(new Object[]{e}, 1));
            }
            C0021B1.f64a = i2;
        }
        C0578fd c0578fd = new C0578fd(C0021B1.f64a, c0173j8.f608a);
        C0616hd.f2278a.getClass();
        C0597gd c0597gdM1467a = C0616hd.m1467a("F014_fts_adapter", c0578fd);
        boolean z = c0597gdM1467a.f2208a;
        Class cls2 = Integer.TYPE;
        if (z && (cls = c0597gdM1467a.f2209b) != null) {
            C0908x1.m2194b("HideSearchList", "Resolver: f0 adapter → ".concat(cls.getName()));
            C0173J8.m466d(c0173j8, "F014", cls.getName(), "getView", new Class[]{cls2, View.class, ViewGroup.class}, new C0683l4(this, i, cls));
            ConcurrentHashMap<String, C0101F8> concurrentHashMap = C0083E8.f263a;
            C0083E8.m209b("F014", "getView", cls.getName());
            return;
        }
        C0647j6 c0647j6 = c0597gdM1467a.f2210c;
        Method method = null;
        C0908x1.m2197e("HideSearchList", C0944z.m2231k("Resolver: f0 adapter not resolved: ", c0647j6 != null ? c0647j6.f2390c : null));
        ConcurrentHashMap<String, C0101F8> concurrentHashMap2 = C0083E8.f263a;
        C0647j6 c0647j62 = c0597gdM1467a.f2210c;
        if (c0647j62 == null || (str = c0647j62.f2390c) == null) {
            str = "unknown";
        }
        C0083E8.m208a("F014", "ftsAdapter", "f0", str);
        try {
            Class clsM13b = C0002A1.m13b(c0173j8.f608a, "com.tencent.mm.view.recyclerview.WxRecyclerAdapter");
            if (clsM13b == null) {
                return;
            }
            Method[] declaredMethods = clsM13b.getDeclaredMethods();
            C0631i9.m1481d(declaredMethods, "getDeclaredMethods(...)");
            int length = declaredMethods.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    break;
                }
                Method method2 = declaredMethods[i3];
                if (method2.getParameterTypes().length == 2 && C0631i9.m1478a(method2.getParameterTypes()[1], cls2) && !method2.getParameterTypes()[0].isPrimitive() && !C0015Ae.m49H(method2.getParameterTypes()[0].getName(), "android", false)) {
                    method = method2;
                    break;
                }
                i3++;
            }
            if (method == null) {
                return;
            }
            String name = clsM13b.getName();
            String name2 = method.getName();
            C0631i9.m1481d(name2, "getName(...)");
            C0173J8.m466d(c0173j8, "F014", name, name2, new Class[]{method.getParameterTypes()[0], cls2}, new C0830t(3, this));
            ConcurrentHashMap<String, C0101F8> concurrentHashMap3 = C0083E8.f263a;
            C0083E8.m209b("F014", "recyclerBind", clsM13b.getName());
            C0908x1.m2194b("HideSearchList", "Fallback: hooked WxRecyclerAdapter." + method.getName());
            objM2206a = C0413Wf.f1577a;
        } catch (Throwable th) {
            objM2206a = C0920xd.m2206a(th);
        }
        Throwable thM2189a = C0901wd.m2189a(objM2206a);
        if (thM2189a != null) {
            C0908x1.m2197e("HideSearchList", C0944z.m2231k("Recycler fallback failed: ", thM2189a.getMessage()));
        }
    }
}
