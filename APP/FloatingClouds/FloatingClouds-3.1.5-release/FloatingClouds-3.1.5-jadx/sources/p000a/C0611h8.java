package p000a;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewParent;
import androidx.fragment.app.ComponentCallbacksC1100b;
import java.lang.reflect.Executable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import p000a.C0186K3;
import p000a.C0475a5;
import p000a.C0518ca;
import p000a.C0901wd;
import top.mmjz.floatingclouds.bean.MaskItemBean;
import top.mmjz.floatingclouds.plugin.IPlugin;

/* JADX INFO: renamed from: a.h8 */
/* JADX INFO: loaded from: classes.dex */
public final class C0611h8 implements IPlugin {

    /* JADX INFO: renamed from: k */
    public static volatile C0004A3 f2257k;

    /* JADX INFO: renamed from: l */
    public static volatile C0611h8 f2258l;

    /* JADX INFO: renamed from: a */
    public volatile Object f2259a;

    /* JADX INFO: renamed from: b */
    public volatile C0475a5.c f2260b;

    /* JADX INFO: renamed from: c */
    public volatile boolean f2261c;

    /* JADX INFO: renamed from: d */
    public volatile Object f2262d;

    /* JADX INFO: renamed from: e */
    public volatile Object f2263e;

    /* JADX INFO: renamed from: f */
    public volatile ArrayList f2264f;

    /* JADX INFO: renamed from: g */
    public final C0643j2 f2265g = new C0643j2(3, this);

    /* JADX INFO: renamed from: h */
    public volatile Method f2266h;

    /* JADX INFO: renamed from: i */
    public C0173J8 f2267i;

    /* JADX INFO: renamed from: j */
    public volatile Field f2268j;

    /* JADX INFO: renamed from: a */
    public static String m1454a(Object obj) {
        for (String str : C0739o3.m1757d0("d1", "d", "getUsername", "getWxid")) {
            for (Class<?> superclass = obj.getClass(); superclass != null && !superclass.equals(Object.class); superclass = superclass.getSuperclass()) {
                try {
                    Method declaredMethod = superclass.getDeclaredMethod(str, null);
                    declaredMethod.setAccessible(true);
                    Object objInvoke = declaredMethod.invoke(obj, null);
                    String str2 = objInvoke instanceof String ? (String) objInvoke : null;
                    if (str2 != null && !C0034Be.m101P(str2)) {
                        String lowerCase = str2.toLowerCase(Locale.ROOT);
                        C0631i9.m1481d(lowerCase, "toLowerCase(...)");
                        return lowerCase;
                    }
                    C0413Wf c0413Wf = C0413Wf.f1577a;
                } catch (Throwable th) {
                    C0920xd.m2206a(th);
                }
            }
        }
        for (String str3 : C0739o3.m1757d0("username", "wxid", "field_username", "field_wxid")) {
            for (Class<?> superclass2 = obj.getClass(); superclass2 != null && !superclass2.equals(Object.class); superclass2 = superclass2.getSuperclass()) {
                try {
                    Field declaredField = superclass2.getDeclaredField(str3);
                    declaredField.setAccessible(true);
                    Object obj2 = declaredField.get(obj);
                    String str4 = obj2 instanceof String ? (String) obj2 : null;
                    if (str4 != null && !C0034Be.m101P(str4)) {
                        String lowerCase2 = str4.toLowerCase(Locale.ROOT);
                        C0631i9.m1481d(lowerCase2, "toLowerCase(...)");
                        return lowerCase2;
                    }
                    C0413Wf c0413Wf2 = C0413Wf.f1577a;
                } catch (Throwable th2) {
                    C0920xd.m2206a(th2);
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public static Object m1455d(Object obj, String str) {
        for (Class<?> superclass = obj.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
            C0112G1 c0112g1M2122I = C0889w1.m2122I(superclass.getDeclaredFields());
            while (c0112g1M2122I.hasNext()) {
                Field field = (Field) c0112g1M2122I.next();
                if (C0631i9.m1478a(field.getName(), str)) {
                    field.setAccessible(true);
                    return field.get(obj);
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public static final boolean m1456f(C0611h8 c0611h8, View view, AbstractC0553e7 abstractC0553e7) {
        View view2;
        for (ComponentCallbacksC1100b componentCallbacksC1100b : abstractC0553e7.f2060c.m27g()) {
            if (componentCallbacksC1100b.getClass().getName().equals("com.tencent.mm.ui.contact.address.MvvmAddressUIFragment")) {
                if (componentCallbacksC1100b.f4557a >= 7 && componentCallbacksC1100b.m2536i() && !componentCallbacksC1100b.m2537j() && (view2 = componentCallbacksC1100b.f4543G) != null && view2.getWindowToken() != null && componentCallbacksC1100b.f4543G.getVisibility() == 0) {
                    View view3 = componentCallbacksC1100b.f4543G;
                    if (view3 != null) {
                        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                            if (parent.equals(view3)) {
                                return true;
                            }
                        }
                    }
                }
            }
            AbstractC0553e7 abstractC0553e7M2530c = componentCallbacksC1100b.m2530c();
            C0631i9.m1481d(abstractC0553e7M2530c, "getChildFragmentManager(...)");
            if (m1456f(c0611h8, view, abstractC0553e7M2530c)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    public static boolean m1457g(Object obj) {
        String name = obj.getClass().getName();
        return (C0034Be.m94I(name, "Label", false) || C0034Be.m94I(name, "Sns", false) || C0015Ae.m49H(name, "com.tencent.mm.plugin.sns", false) || C0015Ae.m49H(name, "com.tencent.mm.plugin.fts", false) || C0015Ae.m49H(name, "com.tencent.mm.ui.contact", false)) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0055, code lost:
    
        return false;
     */
    /* JADX INFO: renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m1458h(Object obj) {
        Class<?> superclass = obj.getClass();
        while (true) {
            if (superclass == null || superclass.equals(Object.class)) {
                break;
            }
            if (superclass.getName().equals("androidx.recyclerview.widget.RecyclerView$Adapter") || superclass.getName().equals("android.support.v7.widget.RecyclerView$Adapter")) {
                return true;
            }
            Class<?>[] interfaces = superclass.getInterfaces();
            C0631i9.m1481d(interfaces, "getInterfaces(...)");
            for (Class<?> cls : interfaces) {
                if (cls.getName().equals("androidx.recyclerview.widget.RecyclerView$Adapter") || cls.getName().equals("android.support.v7.widget.RecyclerView$Adapter")) {
                    return true;
                }
            }
            superclass = superclass.getSuperclass();
        }
    }

    /* JADX INFO: renamed from: i */
    public static ArrayList m1459i(Object obj) throws IllegalAccessException {
        for (Class<?> superclass = obj.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
            C0112G1 c0112g1M2122I = C0889w1.m2122I(superclass.getDeclaredFields());
            while (c0112g1M2122I.hasNext()) {
                Field field = (Field) c0112g1M2122I.next();
                if (C0631i9.m1478a(field.getName(), "data")) {
                    field.setAccessible(true);
                    Object obj2 = field.get(obj);
                    if (obj2 instanceof ArrayList) {
                        return (ArrayList) obj2;
                    }
                    return null;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: l */
    public static void m1460l(Object obj, ArrayList arrayList) throws IllegalAccessException {
        for (Class<?> superclass = obj.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
            C0112G1 c0112g1M2122I = C0889w1.m2122I(superclass.getDeclaredFields());
            while (c0112g1M2122I.hasNext()) {
                Field field = (Field) c0112g1M2122I.next();
                if (C0631i9.m1478a(field.getName(), "data")) {
                    field.setAccessible(true);
                    field.set(obj, arrayList);
                    C0908x1.m2194b(Arrays.copyOf(new Object[]{"HideContactList: setAdapterData -> " + arrayList.size() + " items (field in " + superclass.getSimpleName() + ")"}, 1));
                    return;
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Class<?> superclass2 = obj.getClass(); superclass2 != null; superclass2 = superclass2.getSuperclass()) {
            Field[] declaredFields = superclass2.getDeclaredFields();
            C0631i9.m1481d(declaredFields, "getDeclaredFields(...)");
            ArrayList arrayList3 = new ArrayList(declaredFields.length);
            for (Field field2 : declaredFields) {
                arrayList3.add(superclass2.getSimpleName() + "." + field2.getName());
            }
            arrayList2.addAll(arrayList3);
        }
        C0908x1.m2197e(Arrays.copyOf(new Object[]{"HideContactList: setAdapterData: no 'data' field in adapter hierarchy (" + obj.getClass().getName() + "). Fields: " + C0834t3.m1952p0(arrayList2, ", ", null, 62)}, 1));
    }

    /* JADX INFO: renamed from: b */
    public final String m1461b(Object obj) {
        Object objM2206a;
        String strM1454a;
        Field field = this.f2268j;
        if (field != null) {
            try {
                Object obj2 = field.get(obj);
                objM2206a = obj2 == null ? null : m1454a(obj2);
            } catch (Throwable th) {
                objM2206a = C0920xd.m2206a(th);
            }
            return (String) (objM2206a instanceof C0901wd.a ? null : objM2206a);
        }
        for (Class<?> superclass = obj.getClass(); superclass != null && !superclass.equals(Object.class); superclass = superclass.getSuperclass()) {
            C0112G1 c0112g1M2122I = C0889w1.m2122I(superclass.getDeclaredFields());
            while (c0112g1M2122I.hasNext()) {
                Field field2 = (Field) c0112g1M2122I.next();
                if (!field2.getType().isPrimitive() && !C0015Ae.m49H(field2.getType().getName(), "java.", false) && !C0015Ae.m49H(field2.getType().getName(), "android.", false) && !Modifier.isStatic(field2.getModifiers())) {
                    try {
                        field2.setAccessible(true);
                        Object obj3 = field2.get(obj);
                        if (obj3 != null && (strM1454a = m1454a(obj3)) != null) {
                            this.f2268j = field2;
                            C0908x1.m2194b(Arrays.copyOf(new Object[]{"HideContactList: extractWxidFromG cached field=" + field2.getName() + " type=" + field2.getType().getName()}, 1));
                            return strM1454a;
                        }
                        C0413Wf c0413Wf = C0413Wf.f1577a;
                    } catch (Throwable th2) {
                        C0920xd.m2206a(th2);
                    }
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final ArrayList m1462c(List list) {
        C0186K3.f638a.getClass();
        ArrayList arrayListM505f = C0186K3.a.m505f();
        ArrayList arrayList = new ArrayList(C0758p3.m1800g0(arrayListM505f, 10));
        Iterator it = arrayListM505f.iterator();
        while (it.hasNext()) {
            arrayList.add(((MaskItemBean) it.next()).getMaskId());
        }
        HashSet hashSet = new HashSet(arrayList);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list) {
            if (obj != null) {
                String strM1461b = m1461b(obj);
                if (strM1461b == null || !hashSet.contains(strM1461b)) {
                    arrayList2.add(obj);
                } else {
                    C0908x1.m2194b(Arrays.copyOf(new Object[]{"HideContactList: hide contact wxid=".concat(strM1461b)}, 1));
                }
            }
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m1463e(Object obj) throws IllegalAccessException {
        Object next;
        Object next2;
        ArrayList arrayListM1459i = m1459i(obj);
        if (arrayListM1459i == null || arrayListM1459i.isEmpty()) {
            return true;
        }
        Object obj2 = this.f2259a;
        if (obj2 != null) {
            C0475a5.c cVar = this.f2260b;
            Object objM1455d = m1455d(obj2, cVar != null ? cVar.f1759a : "");
            List list = objM1455d instanceof List ? (List) objM1455d : null;
            if (list != null && !list.isEmpty()) {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (next != null && !(next instanceof String)) {
                        break;
                    }
                }
                Class<?> cls = next != null ? next.getClass() : null;
                Iterator it2 = arrayListM1459i.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it2.next();
                    if (next2 != null && !(next2 instanceof String)) {
                        break;
                    }
                }
                Class<?> cls2 = next2 != null ? next2.getClass() : null;
                if (cls != null && cls2 != null && !cls.equals(cls2)) {
                    C0908x1.m2197e(Arrays.copyOf(new Object[]{"HideContactList: isAdapterDataContactCompatible CLASS MISMATCH: ll=" + cls + " adapter=" + cls2}, 1));
                    return false;
                }
            }
        }
        Field field = this.f2268j;
        try {
            Iterator it3 = arrayListM1459i.iterator();
            C0631i9.m1481d(it3, "iterator(...)");
            int i = 0;
            int i2 = 0;
            while (it3.hasNext()) {
                Object next3 = it3.next();
                if (next3 != null && !(next3 instanceof String)) {
                    i++;
                    if (i > 5) {
                        break;
                    }
                    if (m1461b(next3) != null) {
                        i2++;
                    }
                }
            }
            if (i == 0) {
                return true;
            }
            boolean z = i2 >= 1;
            if (!z) {
                C0908x1.m2197e(Arrays.copyOf(new Object[]{"HideContactList: isAdapterDataContactCompatible FAILED: checked=" + i + " wxidFound=0 adapter=" + obj.getClass().getName()}, 1));
            }
            return z;
        } finally {
            this.f2268j = field;
        }
    }

    @Override // top.mmjz.floatingclouds.plugin.IPlugin
    public final void handleHook(C0173J8 c0173j8) {
        int i = 2;
        C0631i9.m1482e(c0173j8, "session");
        C0908x1.m2194b(Arrays.copyOf(new Object[]{"=== HideContactList handleHook START ==="}, 1));
        this.f2267i = c0173j8;
        f2258l = this;
        f2257k = new C0004A3(2, this);
        CopyOnWriteArrayList<C0518ca.d> copyOnWriteArrayList = C0518ca.f1891a;
        C0518ca.f1891a.remove(this.f2265g);
        C0518ca.m1280b(this.f2265g);
        m1465k();
        ClassLoader classLoader = c0173j8.f608a;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add("com.tencent.mm.ui.contact.address.AddressLiveList");
        C0475a5.b bVarM1152a = C0475a5.m1152a();
        if (bVarM1152a != null) {
            linkedHashSet.addAll(bVarM1152a.f1758a);
        }
        Iterator it = linkedHashSet.iterator();
        C0631i9.m1481d(it, "iterator(...)");
        while (true) {
            Method method = null;
            if (!it.hasNext()) {
                C0908x1.m2197e(Arrays.copyOf(new Object[]{C0944z.m2227g("HideContactList: AddressLiveList.e NOT hooked (candidates=", C0834t3.m1952p0(linkedHashSet, null, null, 63), ")")}, 1));
                break;
            }
            String str = (String) it.next();
            Class clsM13b = C0002A1.m13b(classLoader, str);
            if (clsM13b != null) {
                Method[] methodArrM17f = C0002A1.m17f(clsM13b, new C0586g2(19));
                int length = methodArrM17f.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        break;
                    }
                    Method method2 = methodArrM17f[i2];
                    if (method2.getDeclaringClass().getName().equals(str)) {
                        method = method2;
                        break;
                    }
                    i2++;
                }
                if (method == null) {
                    method = (Method) C0238N1.m630d0(C0002A1.m17f(clsM13b, new C0586g2(20)));
                }
                if (method != null) {
                    this.f2266h = method;
                    c0173j8.m470f(method).intercept(new C0700m2(i, this));
                    C0908x1.m2194b(Arrays.copyOf(new Object[]{"HideContactList: hooked " + str + ".e(List) (method cached for refresh)"}, 1));
                    break;
                }
                C0908x1.m2197e(Arrays.copyOf(new Object[]{C0944z.m2227g("HideContactList: ", str, " has no e(List):List")}, 1));
            }
        }
        ClassLoader classLoader2 = c0173j8.f608a;
        if (classLoader2 == null) {
            C0908x1.m2197e(Arrays.copyOf(new Object[]{"HideContactList: hookRecyclerViewSetAdapter: classLoader null"}, 1));
        } else {
            Class clsM13b2 = C0002A1.m13b(classLoader2, "com.tencent.mm.view.recyclerview.WxRecyclerView");
            if (clsM13b2 == null) {
                C0908x1.m2197e(Arrays.copyOf(new Object[]{"HideContactList: com.tencent.mm.view.recyclerview.WxRecyclerView not found"}, 1));
            } else {
                Executable executable = (Method) C0238N1.m630d0(C0002A1.m17f(clsM13b2, new C0586g2(18)));
                if (executable == null) {
                    C0908x1.m2197e(Arrays.copyOf(new Object[]{"HideContactList: com.tencent.mm.view.recyclerview.WxRecyclerView.setAdapter not found"}, 1));
                } else {
                    try {
                        c0173j8.m470f(executable).intercept(new C0740o4(classLoader2, i, this));
                        C0908x1.m2194b(Arrays.copyOf(new Object[]{"HideContactList: hooked com.tencent.mm.view.recyclerview.WxRecyclerView.setAdapter (capture contact adapter)"}, 1));
                    } catch (Throwable th) {
                        C0908x1.m2197e(Arrays.copyOf(new Object[]{"HideContactList: hook setAdapter failed", th}, 2));
                    }
                }
            }
        }
        C0908x1.m2194b(Arrays.copyOf(new Object[]{"=== HideContactList handleHook DONE ==="}, 1));
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01ab  */
    /* JADX INFO: renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m1464j() {
        Object objM2206a;
        Method method;
        Object objM2206a2;
        Object obj = this.f2259a;
        if (obj == null) {
            C0908x1.m2197e(Arrays.copyOf(new Object[]{"HideContactList: refreshContactList skipped, no liveList instance yet"}, 1));
            return;
        }
        if (this.f2260b == null) {
            m1465k();
        }
        Object objInvoke = this.f2262d;
        if (objInvoke == null) {
            Object obj2 = this.f2263e;
            if (obj2 != null) {
                try {
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
                        if (C0631i9.m1478a(method.getName(), "getAdapter")) {
                            Class<?>[] parameterTypes = method.getParameterTypes();
                            C0631i9.m1481d(parameterTypes, "getParameterTypes(...)");
                            if (parameterTypes.length == 0) {
                                break;
                            }
                        }
                        i++;
                    }
                    if (method != null) {
                        method.setAccessible(true);
                    }
                    objInvoke = method != null ? method.invoke(obj2, null) : null;
                } catch (Throwable th) {
                    objM2206a = C0920xd.m2206a(th);
                }
                if (objInvoke != null) {
                    C0908x1.m2194b(Arrays.copyOf(new Object[]{"HideContactList: findContactAdapter via WxRecyclerView.getAdapter -> " + objInvoke.getClass().getName()}, 1));
                    if (objInvoke == null) {
                        C0908x1.m2197e(Arrays.copyOf(new Object[]{"HideContactList: refreshContactList skipped, no visible adapter yet"}, 1));
                        return;
                    }
                } else {
                    objM2206a = C0413Wf.f1577a;
                    Throwable thM2189a = C0901wd.m2189a(objM2206a);
                    if (thM2189a != null) {
                        C0908x1.m2197e(Arrays.copyOf(new Object[]{"HideContactList: findContactAdapter via getAdapter failed", thM2189a}, 2));
                    }
                    objInvoke = this.f2262d;
                    if (objInvoke == null) {
                        C0908x1.m2194b(Arrays.copyOf(new Object[]{"HideContactList: findContactAdapter via currentContactAdapter -> ".concat(objInvoke.getClass().getName())}, 1));
                    } else {
                        objInvoke = this.f2259a;
                        if (objInvoke != null) {
                            loop0: for (Class<?> superclass = objInvoke.getClass(); superclass != null && !superclass.equals(Object.class); superclass = superclass.getSuperclass()) {
                                C0112G1 c0112g1M2122I = C0889w1.m2122I(superclass.getDeclaredFields());
                                while (c0112g1M2122I.hasNext()) {
                                    Field field = (Field) c0112g1M2122I.next();
                                    String name = field.getName();
                                    C0475a5.c cVar = this.f2260b;
                                    if (C0631i9.m1478a(name, cVar != null ? cVar.f1761c : null)) {
                                        try {
                                            field.setAccessible(true);
                                            Object obj3 = field.get(objInvoke);
                                            if (obj3 != null && m1458h(obj3)) {
                                                C0475a5.c cVar2 = this.f2260b;
                                                String str = cVar2 != null ? cVar2.f1761c : null;
                                                C0908x1.m2194b(Arrays.copyOf(new Object[]{"HideContactList: findContactAdapter via MvvmList.adapterField(" + str + ") -> " + obj3.getClass().getName()}, 1));
                                                objInvoke = obj3;
                                                break loop0;
                                            }
                                            objM2206a2 = C0413Wf.f1577a;
                                        } catch (Throwable th2) {
                                            objM2206a2 = C0920xd.m2206a(th2);
                                        }
                                        Throwable thM2189a2 = C0901wd.m2189a(objM2206a2);
                                        if (thM2189a2 != null) {
                                            C0908x1.m2197e(Arrays.copyOf(new Object[]{"HideContactList: findContactAdapter via adapterField failed", thM2189a2}, 2));
                                        }
                                    }
                                }
                            }
                            C0908x1.m2197e(Arrays.copyOf(new Object[]{"HideContactList: findContactAdapter: no adapter (rv=" + (this.f2263e == null) + ", cur=" + (this.f2262d == null) + ", ll=" + (this.f2259a != null) + ")"}, 1));
                            objInvoke = null;
                        } else {
                            if (this.f2263e == null) {
                            }
                            if (this.f2262d == null) {
                            }
                            if (this.f2259a != null) {
                            }
                            C0908x1.m2197e(Arrays.copyOf(new Object[]{"HideContactList: findContactAdapter: no adapter (rv=" + (this.f2263e == null) + ", cur=" + (this.f2262d == null) + ", ll=" + (this.f2259a != null) + ")"}, 1));
                            objInvoke = null;
                        }
                    }
                    if (objInvoke == null) {
                    }
                }
            } else {
                objInvoke = this.f2262d;
                if (objInvoke == null) {
                }
                if (objInvoke == null) {
                }
            }
        }
        if (!m1457g(objInvoke)) {
            C0908x1.m2197e(Arrays.copyOf(new Object[]{C0944z.m2227g("HideContactList: refreshContactList BLOCKED, adapter=", objInvoke.getClass().getName(), " is not contact adapter")}, 1));
            this.f2262d = null;
            this.f2263e = null;
        } else {
            if (m1463e(objInvoke)) {
                new Handler(Looper.getMainLooper()).post(new RunnableC0603h0(this, objInvoke, obj, 3));
                return;
            }
            C0908x1.m2197e(Arrays.copyOf(new Object[]{C0944z.m2227g("HideContactList: refreshContactList BLOCKED, adapter=", objInvoke.getClass().getName(), " data not contact-compatible")}, 1));
            this.f2262d = null;
            this.f2263e = null;
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m1465k() {
        ClassLoader classLoader;
        Object objM2206a;
        C0597gd c0597gdM1467a;
        C0475a5.c cVar;
        String strM1427b;
        String str;
        String strM1427b2;
        if (this.f2260b != null) {
            return;
        }
        C0173J8 c0173j8 = this.f2267i;
        if (c0173j8 == null || (classLoader = c0173j8.f608a) == null) {
            C0908x1.m2197e(Arrays.copyOf(new Object[]{"HideContactList: resolveContactListFields skipped, no classLoader"}, 1));
            return;
        }
        try {
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
            c0597gdM1467a = C0616hd.m1467a("F004_contact_list_fields", c0578fd);
            strM1427b = c0597gdM1467a.m1427b("displayListField");
            str = "";
            if (strM1427b == null) {
                strM1427b = "";
            }
            strM1427b2 = c0597gdM1467a.m1427b("snapshotField");
            if (strM1427b2 == null) {
                strM1427b2 = "";
            }
            String strM1427b3 = c0597gdM1467a.m1427b("adapterField");
            if (strM1427b3 != null) {
                str = strM1427b3;
            }
            cVar = new C0475a5.c(strM1427b, strM1427b2, str);
        } catch (Throwable th) {
            objM2206a = C0920xd.m2206a(th);
        }
        if (!C0034Be.m101P(strM1427b) && !C0034Be.m101P(strM1427b2) && !C0034Be.m101P(str)) {
            this.f2260b = cVar;
            C0908x1.m2194b(Arrays.copyOf(new Object[]{"HideContactList: F004_contact_list_fields resolved via=" + c0597gdM1467a.f2211d + " display=" + strM1427b + " snapshot=" + strM1427b2 + " adapter=" + str}, 1));
            objM2206a = C0413Wf.f1577a;
            Throwable thM2189a = C0901wd.m2189a(objM2206a);
            if (thM2189a != null) {
                C0908x1.m2197e(Arrays.copyOf(new Object[]{"HideContactList: F004_contact_list_fields resolve failed", thM2189a}, 2));
                return;
            }
            return;
        }
        EnumC0521cd enumC0521cd = c0597gdM1467a.f2211d;
        C0647j6 c0647j6 = c0597gdM1467a.f2210c;
        C0908x1.m2197e(Arrays.copyOf(new Object[]{"HideContactList: F004_contact_list_fields resolve INCOMPLETE: path=" + enumC0521cd + " reason=" + (c0647j6 != null ? c0647j6.f2390c : null)}, 1));
    }
}
