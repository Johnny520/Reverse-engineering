package p086r0;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Canvas;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p055lu.wxmask.bean.MaskItemBean;
import de.robv.android.xposed.XposedBridge;
import de.robv.android.xposed.callbacks.XC_LoadPackage;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import p001A0.AbstractC0039l;
import p001A0.C0026a;
import p001A0.C0027a0;
import p001A0.C0035h;
import p001A0.C0048u;
import p001A0.C0052y;
import p004C.C0060d;
import p006D.AbstractC0079h;
import p009E0.C0104d;
import p011F0.AbstractC0120h;
import p011F0.AbstractC0123k;
import p011F0.AbstractC0129q;
import p011F0.C0131s;
import p011F0.C0133u;
import p022L.AbstractC0174d;
import p027N0.AbstractC0223g;
import p034R0.C0243b;
import p040U0.AbstractC0299i;
import p040U0.AbstractC0307q;
import p052b1.AbstractC0503h;
import p054c0.AbstractC0514f;
import p062e0.InterfaceC0551a;
import p077m0.C0768f;
import p084q0.C0808h;
import p102z0.AbstractC1126i;
import p102z0.C1124g;

/* JADX INFO: renamed from: r0.g0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0903g0 implements InterfaceC0551a {

    /* JADX INFO: renamed from: a */
    public final WeakHashMap f3185a = new WeakHashMap();

    /* JADX INFO: renamed from: b */
    public final Set f3186b = Collections.newSetFromMap(new IdentityHashMap());

    /* JADX INFO: renamed from: c */
    public final Set f3187c = Collections.newSetFromMap(new WeakHashMap());

    /* JADX INFO: renamed from: d */
    public final WeakHashMap f3188d = new WeakHashMap();

    /* JADX INFO: renamed from: e */
    public int f3189e;

    /* JADX INFO: renamed from: f */
    public int f3190f;

    /* JADX INFO: renamed from: g */
    public Context f3191g;

    /* JADX INFO: renamed from: h */
    public C0027a0 f3192h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static Object m1929a(Object obj, String str, Object... objArr) {
        Object c0104d;
        Method method;
        Method method2;
        try {
            Method[] methods = obj.getClass().getMethods();
            AbstractC0223g.m417d(methods, "getMethods(...)");
            int length = methods.length;
            int i2 = 0;
            int i3 = 0;
            loop0: while (true) {
                if (i3 >= length) {
                    method = null;
                    break;
                }
                method = methods[i3];
                if (AbstractC0223g.m414a(method.getName(), str) && method.getParameterTypes().length == objArr.length) {
                    Class<?>[] parameterTypes = method.getParameterTypes();
                    AbstractC0223g.m417d(parameterTypes, "getParameterTypes(...)");
                    Iterable iterableM256d0 = AbstractC0120h.m256d0(parameterTypes);
                    if (!(iterableM256d0 instanceof Collection) || !((Collection) iterableM256d0).isEmpty()) {
                        Iterator it = iterableM256d0.iterator();
                        while (((C0243b) it).f588c) {
                            int iM458a = ((C0243b) it).m458a();
                            if (objArr[iM458a] != null) {
                                Class<?> cls = method.getParameterTypes()[iM458a];
                                Object obj2 = objArr[iM458a];
                                AbstractC0223g.m415b(obj2);
                                if (cls.isAssignableFrom(obj2.getClass())) {
                                }
                            }
                        }
                        break loop0;
                    }
                    break;
                }
                i3++;
            }
            if (method == null || (c0104d = method.invoke(obj, Arrays.copyOf(objArr, objArr.length))) == null) {
                Method[] declaredMethods = obj.getClass().getDeclaredMethods();
                AbstractC0223g.m417d(declaredMethods, "getDeclaredMethods(...)");
                int length2 = declaredMethods.length;
                loop1: while (true) {
                    if (i2 >= length2) {
                        method2 = null;
                        break;
                    }
                    method2 = declaredMethods[i2];
                    if (AbstractC0223g.m414a(method2.getName(), str) && method2.getParameterTypes().length == objArr.length) {
                        Class<?>[] parameterTypes2 = method2.getParameterTypes();
                        AbstractC0223g.m417d(parameterTypes2, "getParameterTypes(...)");
                        Iterable iterableM256d02 = AbstractC0120h.m256d0(parameterTypes2);
                        if (!(iterableM256d02 instanceof Collection) || !((Collection) iterableM256d02).isEmpty()) {
                            Iterator it2 = iterableM256d02.iterator();
                            while (((C0243b) it2).f588c) {
                                int iM458a2 = ((C0243b) it2).m458a();
                                if (objArr[iM458a2] != null) {
                                    Class<?> cls2 = method2.getParameterTypes()[iM458a2];
                                    Object obj3 = objArr[iM458a2];
                                    AbstractC0223g.m415b(obj3);
                                    if (cls2.isAssignableFrom(obj3.getClass())) {
                                    }
                                }
                            }
                            break loop1;
                        }
                        break;
                    }
                    i2++;
                }
                if (method2 != null) {
                    method2.setAccessible(true);
                    c0104d = method2.invoke(obj, Arrays.copyOf(objArr, objArr.length));
                } else {
                    c0104d = null;
                }
            }
        } catch (Throwable th) {
            c0104d = new C0104d(th);
        }
        if (c0104d instanceof C0104d) {
            return null;
        }
        return c0104d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static final void m1930b(ArrayList arrayList, View view) {
        String string;
        if (view instanceof TextView) {
            CharSequence text = ((TextView) view).getText();
            String string2 = (text == null || (string = text.toString()) == null) ? null : AbstractC0299i.m507C0(string).toString();
            if (string2 == null) {
                string2 = "";
            }
            if (!AbstractC0307q.m534d0(string2)) {
                arrayList.add(string2);
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = viewGroup.getChildAt(i2);
                AbstractC0223g.m417d(childAt, "getChildAt(...)");
                m1930b(arrayList, childAt);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static boolean m1931d(View view, String str) {
        if (AbstractC0223g.m414a(m1934i(view), str)) {
            return true;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = viewGroup.getChildAt(i2);
                AbstractC0223g.m417d(childAt, "getChildAt(...)");
                if (m1931d(childAt, str)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static String m1932f(Object obj, int i2, Set set) {
        Object c0104d;
        if (obj != null && i2 <= 3) {
            if (obj instanceof String) {
                String str = (String) obj;
                if (!AbstractC0307q.m538h0(str, false, "wxid_") && !str.endsWith("@chatroom") && !AbstractC0307q.m538h0(str, false, "gh_") && !AbstractC0299i.m511i0(str, "@openim", true)) {
                    obj = null;
                }
                return (String) obj;
            }
            if (set.add(obj)) {
                Field[] declaredFields = obj.getClass().getDeclaredFields();
                AbstractC0223g.m417d(declaredFields, "getDeclaredFields(...)");
                for (Field field : declaredFields) {
                    if (!Modifier.isStatic(field.getModifiers())) {
                        try {
                            field.setAccessible(true);
                            c0104d = m1932f(field.get(obj), i2 + 1, set);
                        } catch (Throwable th) {
                            c0104d = new C0104d(th);
                        }
                        if (c0104d instanceof C0104d) {
                            c0104d = null;
                        }
                        String str2 = (String) c0104d;
                        if (str2 != null) {
                            return str2;
                        }
                    }
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static Object m1933h(View view) {
        Object c0104d;
        try {
            c0104d = AbstractC0514f.f1622b.mo1012c(view, "getAdapter", new Object[0]);
        } catch (Throwable th) {
            c0104d = new C0104d(th);
        }
        if (c0104d instanceof C0104d) {
            return null;
        }
        return c0104d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public static String m1934i(View view) {
        Object c0104d;
        int id = view.getId();
        if (id == -1) {
            return null;
        }
        try {
            c0104d = view.getResources().getResourceEntryName(id);
        } catch (Throwable th) {
            c0104d = new C0104d(th);
        }
        return (String) (c0104d instanceof C0104d ? null : c0104d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public static boolean m1935l(View view) {
        for (Class<?> superclass = view.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
            if (superclass.getName().equals("androidx.recyclerview.widget.RecyclerView") || superclass.getName().equals("android.support.v7.widget.RecyclerView") || superclass.getName().endsWith(".RecyclerView") || superclass.getName().endsWith(".WxRecyclerView")) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final boolean m1936c(ViewGroup viewGroup) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        WeakHashMap weakHashMap = this.f3188d;
        Long l2 = (Long) weakHashMap.get(viewGroup);
        if (jCurrentTimeMillis - (l2 != null ? l2.longValue() : 0L) < 120) {
            return false;
        }
        weakHashMap.put(viewGroup, Long.valueOf(jCurrentTimeMillis));
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final void m1937e(Object... objArr) {
        int i2 = this.f3189e;
        if (i2 >= 80) {
            return;
        }
        this.f3189e = i2 + 1;
        Log.d("MaskTagHide", AbstractC0120h.m260h0(objArr, " | ", new C0863P(4), 30));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final String m1938g(View view) {
        String strM1932f = m1932f(view.getTag(), 0, Collections.newSetFromMap(new IdentityHashMap()));
        if (strM1932f != null) {
            return strM1932f;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            AbstractC0223g.m417d(childAt, "getChildAt(...)");
            String strM1938g = m1938g(childAt);
            if (strM1938g != null) {
                return strM1938g;
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0065 A[PHI: r11
  0x0065: PHI (r11v5 java.lang.Class) = (r11v4 java.lang.Class), (r11v18 java.lang.Class) binds: [B:6:0x0055, B:8:0x0062] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0084 A[PHI: r5
  0x0084: PHI (r5v3 java.lang.Class) = (r5v2 java.lang.Class), (r5v7 java.lang.Class) binds: [B:11:0x0072, B:13:0x0081] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00bc A[PHI: r11
  0x00bc: PHI (r11v9 java.lang.Class) = (r11v8 java.lang.Class), (r11v16 java.lang.Class) binds: [B:19:0x00ac, B:21:0x00b9] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // p062e0.InterfaceC0551a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void handleHook(Context context, XC_LoadPackage.LoadPackageParam loadPackageParam) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            applicationContext = context;
        }
        this.f3191g = applicationContext;
        this.f3192h = AbstractC0039l.m77o(context);
        CopyOnWriteArrayList copyOnWriteArrayList = C0052y.f291a;
        C0052y.m98c(context, new C0048u("tag-contact", "标签页密友隐藏", new C0863P(3), new C0035h(context, 13), new C0060d(1, this), new C0026a(16)));
        m1937e("handleHook", loadPackageParam.packageName, loadPackageParam.processName);
        ClassLoader classLoader = loadPackageParam.classLoader;
        AbstractC0223g.m417d(classLoader, "classLoader");
        Class clsMo1021l = AbstractC0514f.f1622b.mo1021l(classLoader, "androidx.recyclerview.widget.RecyclerView");
        if (clsMo1021l == null) {
            ClassLoader classLoader2 = loadPackageParam.classLoader;
            AbstractC0223g.m417d(classLoader2, "classLoader");
            clsMo1021l = AbstractC0514f.f1622b.mo1021l(classLoader2, "android.support.v7.widget.RecyclerView");
            if (clsMo1021l != null) {
                ClassLoader classLoader3 = loadPackageParam.classLoader;
                AbstractC0223g.m417d(classLoader3, "classLoader");
                Class clsMo1021l2 = AbstractC0514f.f1622b.mo1021l(classLoader3, "androidx.recyclerview.widget.RecyclerView$Adapter");
                if (clsMo1021l2 == null) {
                    ClassLoader classLoader4 = loadPackageParam.classLoader;
                    AbstractC0223g.m417d(classLoader4, "classLoader");
                    clsMo1021l2 = AbstractC0514f.f1622b.mo1021l(classLoader4, "android.support.v7.widget.RecyclerView$Adapter");
                    if (clsMo1021l2 != null) {
                        Method methodMo1011b = AbstractC0514f.f1622b.mo1011b(clsMo1021l, "setAdapter", clsMo1021l2);
                        if (methodMo1011b != null) {
                            AbstractC0514f.m1027d(methodMo1011b, new C0900f0(this, 2));
                        }
                    }
                }
            }
        }
        ClassLoader classLoader5 = loadPackageParam.classLoader;
        AbstractC0223g.m417d(classLoader5, "classLoader");
        Class clsMo1021l3 = AbstractC0514f.f1622b.mo1021l(classLoader5, "androidx.recyclerview.widget.RecyclerView");
        Class cls = Boolean.TYPE;
        if (clsMo1021l3 == null) {
            ClassLoader classLoader6 = loadPackageParam.classLoader;
            AbstractC0223g.m417d(classLoader6, "classLoader");
            clsMo1021l3 = AbstractC0514f.f1622b.mo1021l(classLoader6, "android.support.v7.widget.RecyclerView");
            if (clsMo1021l3 != null) {
                C0900f0 c0900f0 = new C0900f0(this, 1);
                Class cls2 = Integer.TYPE;
                Method methodMo1011b2 = AbstractC0514f.f1622b.mo1011b(clsMo1021l3, "onLayout", cls, cls2, cls2, cls2, cls2);
                if (methodMo1011b2 != null) {
                    AbstractC0514f.m1027d(methodMo1011b2, c0900f0);
                }
                Method methodMo1011b3 = AbstractC0514f.f1622b.mo1011b(clsMo1021l3, "dispatchDraw", Canvas.class);
                if (methodMo1011b3 != null) {
                    AbstractC0514f.m1027d(methodMo1011b3, c0900f0);
                }
            }
        }
        Method methodMo1011b4 = AbstractC0514f.f1622b.mo1011b(Activity.class, "onWindowFocusChanged", cls);
        if (methodMo1011b4 != null) {
            AbstractC0514f.m1027d(methodMo1011b4, new C0900f0(this, 0));
        }
        Method methodMo1011b5 = AbstractC0514f.f1622b.mo1011b(ViewGroup.class, "dispatchDraw", Canvas.class);
        if (methodMo1011b5 != null) {
            AbstractC0514f.m1027d(methodMo1011b5, new C0900f0(this, 3));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public final void m1939j(View view) {
        WeakHashMap weakHashMap = this.f3185a;
        if (!weakHashMap.containsKey(view)) {
            int visibility = view.getVisibility();
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            Integer numValueOf = layoutParams != null ? Integer.valueOf(layoutParams.width) : null;
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            weakHashMap.put(view, new C0897e0(visibility, numValueOf, layoutParams2 != null ? Integer.valueOf(layoutParams2.height) : null));
        }
        view.setVisibility(8);
        ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
        if (layoutParams3 != null) {
            layoutParams3.width = 0;
            layoutParams3.height = 0;
            view.setLayoutParams(layoutParams3);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0014  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0011  */
    /* JADX INFO: renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m1940k(Class cls) {
        List list;
        Set setM265B0;
        boolean z2;
        boolean z3;
        C0027a0 c0027a0M77o = this.f3192h;
        if (c0027a0M77o != null) {
            list = c0027a0M77o == null ? c0027a0M77o.f205b : null;
            if (list == null) {
                list = C0131s.f426a;
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (!AbstractC0307q.m534d0((String) obj)) {
                    arrayList.add(obj);
                }
            }
            setM265B0 = AbstractC0123k.m265B0(arrayList);
        } else {
            Context context = this.f3191g;
            if (context == null) {
                setM265B0 = C0133u.f428a;
            } else {
                c0027a0M77o = AbstractC0039l.m77o(context);
                if (c0027a0M77o == null) {
                }
                if (list == null) {
                }
                ArrayList arrayList2 = new ArrayList();
                while (r0.hasNext()) {
                }
                setM265B0 = AbstractC0123k.m265B0(arrayList2);
            }
        }
        boolean zContains = setM265B0.contains(cls.getName());
        Class cls2 = Integer.TYPE;
        if (!zContains) {
            Method[] methods = cls.getMethods();
            AbstractC0223g.m415b(methods);
            int length = methods.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    z2 = false;
                    break;
                }
                Method method = methods[i2];
                if (AbstractC0223g.m414a(method.getName(), "onBindViewHolder") && method.getParameterTypes().length >= 2 && AbstractC0223g.m414a(method.getParameterTypes()[1], cls2)) {
                    z2 = true;
                    break;
                }
                i2++;
            }
            int length2 = methods.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length2) {
                    z3 = false;
                    break;
                }
                String name = methods[i3].getName();
                AbstractC0223g.m417d(name, "getName(...)");
                if (AbstractC0307q.m538h0(name, false, "notify")) {
                    z3 = true;
                    break;
                }
                i3++;
            }
            if (!z2 || !z3) {
                return;
            }
        }
        if (this.f3186b.add(cls)) {
            Method[] methods2 = cls.getMethods();
            AbstractC0223g.m417d(methods2, "getMethods(...)");
            ArrayList arrayList3 = new ArrayList();
            for (Method method2 : methods2) {
                if (AbstractC0223g.m414a(method2.getName(), "onBindViewHolder") && method2.getParameterTypes().length >= 2 && AbstractC0223g.m414a(method2.getParameterTypes()[1], cls2)) {
                    arrayList3.add(method2);
                }
            }
            Iterator it = arrayList3.iterator();
            while (it.hasNext()) {
                AbstractC0514f.m1027d((Method) it.next(), new C0768f(this, cls, 3));
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0018  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0015  */
    /* JADX INFO: renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m1941m(String str) {
        List list;
        Set setM265B0;
        C0027a0 c0027a0M77o = this.f3192h;
        if (c0027a0M77o != null) {
            list = c0027a0M77o == null ? c0027a0M77o.f204a : null;
            if (list == null) {
                list = C0131s.f426a;
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (!AbstractC0307q.m534d0((String) obj)) {
                    arrayList.add(obj);
                }
            }
            setM265B0 = AbstractC0123k.m265B0(AbstractC0123k.m273o0(arrayList, AbstractC0079h.m167E("com.tencent.mm.ui.mvvm.MvvmContactListUI")));
        } else {
            Context context = this.f3191g;
            if (context == null) {
                setM265B0 = AbstractC0079h.m175T("com.tencent.mm.ui.mvvm.MvvmContactListUI");
            } else {
                c0027a0M77o = AbstractC0039l.m77o(context);
                if (c0027a0M77o == null) {
                }
                if (list == null) {
                }
                ArrayList arrayList2 = new ArrayList();
                while (r0.hasNext()) {
                }
                setM265B0 = AbstractC0123k.m265B0(AbstractC0123k.m273o0(arrayList2, AbstractC0079h.m167E("com.tencent.mm.ui.mvvm.MvvmContactListUI")));
            }
        }
        if (setM265B0.contains(str)) {
            return true;
        }
        return str.equals("com.tencent.mm.ui.mvvm.MvvmContactListUI");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public final boolean m1942n(View view) {
        Activity activity;
        if (view != null) {
            Context context = view.getContext();
            int i2 = 0;
            while (true) {
                activity = null;
                if (i2 < 12) {
                    if (!(context instanceof Activity)) {
                        if (!(context instanceof ContextWrapper)) {
                            break;
                        }
                        context = ((ContextWrapper) context).getBaseContext();
                        i2++;
                    } else {
                        activity = (Activity) context;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (activity != null) {
                if (m1941m(activity.getClass().getName())) {
                    return AbstractC0503h.m970F(activity);
                }
            } else if (m1931d(view, "k13") && (m1931d(view, "oom") || m1931d(view, "q0d"))) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:12:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0033  */
    /* JADX INFO: renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m1943o(View view) {
        List list;
        Set setM265B0;
        if (!m1935l(view)) {
            return false;
        }
        C0027a0 c0027a0M77o = this.f3192h;
        if (c0027a0M77o != null) {
            list = c0027a0M77o == null ? c0027a0M77o.f206c : null;
            if (list == null) {
                list = C0131s.f426a;
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (!AbstractC0307q.m534d0((String) obj)) {
                    arrayList.add(obj);
                }
            }
            setM265B0 = AbstractC0123k.m265B0(AbstractC0123k.m273o0(arrayList, AbstractC0079h.m167E("mim")));
        } else {
            Context context = this.f3191g;
            if (context == null) {
                setM265B0 = AbstractC0079h.m175T("mim");
            } else {
                c0027a0M77o = AbstractC0039l.m77o(context);
                if (c0027a0M77o == null) {
                }
                if (list == null) {
                }
                ArrayList arrayList2 = new ArrayList();
                while (r0.hasNext()) {
                }
                setM265B0 = AbstractC0123k.m265B0(AbstractC0123k.m273o0(arrayList2, AbstractC0079h.m167E("mim")));
            }
        }
        if (setM265B0.contains(m1934i(view))) {
            return m1942n(view.getRootView());
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public final void m1944p(Object... objArr) {
        int i2 = this.f3190f;
        if (i2 >= 80) {
            return;
        }
        this.f3190f = i2 + 1;
        XposedBridge.log("MaskContactSelectProbe(tag): ".concat(AbstractC0120h.m260h0(objArr, " | ", new C0863P(2), 30)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public final void m1945q(View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = viewGroup.getChildAt(i2);
                AbstractC0223g.m417d(childAt, "getChildAt(...)");
                m1945q(childAt);
            }
        }
        m1946r(view);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r */
    public final void m1946r(View view) {
        int iIntValue;
        C0897e0 c0897e0 = (C0897e0) this.f3185a.remove(view);
        if (c0897e0 == null) {
            return;
        }
        view.setVisibility(c0897e0.f3155a);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            boolean z2 = true;
            boolean z3 = false;
            Integer num = c0897e0.f3156b;
            if (num != null && layoutParams.width != (iIntValue = num.intValue())) {
                layoutParams.width = iIntValue;
                z3 = true;
            }
            Integer num2 = c0897e0.f3157c;
            if (num2 != null) {
                int iIntValue2 = num2.intValue();
                if (layoutParams.height != iIntValue2) {
                    layoutParams.height = iIntValue2;
                } else {
                    z2 = z3;
                }
                z3 = z2;
            }
            if (z3) {
                view.setLayoutParams(layoutParams);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Duplicate block (B:46:0x00e4) to fix multi-entry loop: BACK_EDGE: B:46:0x00e4 -> B:47:0x00e5 */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x00e5, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00fc  */
    /* JADX INFO: renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m1947s(View view) {
        Object string;
        View view2;
        Number number;
        Object objM1933h;
        Object c0104d;
        if (!m1942n(view.getRootView())) {
            m1946r(view);
            return;
        }
        if (!m1931d(view, "mjc") || !m1931d(view, "a_4") || !m1931d(view, "kbq")) {
            m1946r(view);
            return;
        }
        boolean z2 = AbstractC1126i.f3786a;
        if (!C1124g.m2448x()) {
            m1946r(view);
            return;
        }
        ((C0808h) AbstractC0503h.m988u(C0808h.class)).m1474c();
        Iterable arrayList = !C1124g.m2443s() ? C0131s.f426a : new ArrayList(((C0808h) AbstractC0503h.m988u(C0808h.class)).f2684a);
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            String str = (String) it.next();
            string = str != null ? AbstractC0299i.m507C0(str).toString() : null;
            if (string != null) {
                arrayList2.add(string);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : arrayList2) {
            String str2 = (String) obj;
            if (!AbstractC0307q.m534d0(str2)) {
                boolean z3 = AbstractC1126i.f3786a;
                if (!C1124g.m2429e(str2)) {
                    arrayList3.add(obj);
                }
            }
        }
        Set setM265B0 = AbstractC0123k.m265B0(arrayList3);
        boolean z4 = AbstractC1126i.f3786a;
        m1937e("tag page switch", AbstractC0174d.m355k("enabled=", C1124g.m2448x()), AbstractC0174d.m351g(setM265B0.size(), "hiddenCount="));
        if (setM265B0.isEmpty()) {
            m1946r(view);
            return;
        }
        String strM1938g = m1938g(view);
        if (strM1938g == null) {
            Object parent = view.getParent();
            if (parent instanceof View) {
                view2 = (View) parent;
                while (true) {
                    if (view2 == null) {
                        view2 = null;
                        break;
                    } else {
                        if (m1935l(view2)) {
                            break;
                        }
                        Object parent2 = view2.getParent();
                        if (parent2 instanceof View) {
                            view2 = (View) parent2;
                        }
                    }
                }
                if (view2 == null) {
                    strM1938g = null;
                } else {
                    String[] strArr = {"getChildAdapterPosition", "getChildLayoutPosition"};
                    int i2 = 0;
                    while (true) {
                        if (i2 < 2) {
                            Object objM1929a = m1929a(view2, strArr[i2], view);
                            number = objM1929a instanceof Number ? (Number) objM1929a : null;
                            if (number != null) {
                                break;
                            } else {
                                i2++;
                            }
                        } else {
                            Object objM1929a2 = m1929a(view2, "findContainingViewHolder", view);
                            if (objM1929a2 == null && (objM1929a2 = m1929a(view2, "getChildViewHolder", view)) == null) {
                                number = null;
                            } else {
                                String[] strArr2 = {"getBindingAdapterPosition", "getAbsoluteAdapterPosition", "getAdapterPosition", "getLayoutPosition"};
                                for (int i3 = 0; i3 < 4; i3++) {
                                    Object objM1929a3 = m1929a(objM1929a2, strArr2[i3], new Object[0]);
                                    Number number2 = objM1929a3 instanceof Number ? (Number) objM1929a3 : null;
                                    if (number2 != null) {
                                        number = number2;
                                        break;
                                    }
                                }
                                number = null;
                            }
                        }
                    }
                    if (number != null) {
                        int iIntValue = number.intValue();
                        if (iIntValue >= 0 && (objM1933h = m1933h(view2)) != null) {
                            String[] strArr3 = {"getItem", "getItemAt", "getItemByPosition"};
                            int i4 = 0;
                            while (true) {
                                if (i4 < 3) {
                                    try {
                                        c0104d = AbstractC0514f.f1622b.mo1012c(objM1933h, strArr3[i4], Integer.valueOf(iIntValue));
                                    } catch (Throwable th) {
                                        c0104d = new C0104d(th);
                                    }
                                    if (c0104d instanceof C0104d) {
                                        c0104d = null;
                                    }
                                    if (c0104d != null) {
                                        break;
                                    } else {
                                        i4++;
                                    }
                                } else {
                                    Field[] declaredFields = objM1933h.getClass().getDeclaredFields();
                                    AbstractC0223g.m417d(declaredFields, "getDeclaredFields(...)");
                                    for (Field field : declaredFields) {
                                        if (!Modifier.isStatic(field.getModifiers())) {
                                            try {
                                                field.setAccessible(true);
                                                Object obj2 = field.get(objM1933h);
                                                c0104d = (!(obj2 instanceof List) || iIntValue >= ((List) obj2).size()) ? null : ((List) obj2).get(iIntValue);
                                            } catch (Throwable th2) {
                                                c0104d = new C0104d(th2);
                                            }
                                            if (c0104d instanceof C0104d) {
                                                c0104d = null;
                                            }
                                            if (c0104d != null) {
                                                m1937e("tag page adapter item", objM1933h.getClass().getName(), field.getName(), c0104d.getClass().getName());
                                                break;
                                            }
                                        }
                                    }
                                }
                            }
                            if (c0104d == null) {
                                strM1938g = m1932f(c0104d, 0, Collections.newSetFromMap(new IdentityHashMap()));
                            }
                        } else {
                            c0104d = null;
                            if (c0104d == null) {
                            }
                        }
                    }
                }
            }
            view2 = null;
        }
        ArrayList arrayList4 = new ArrayList();
        m1930b(arrayList4, view);
        m1937e("tag page row scan", "user=".concat(strM1938g == null ? "" : strM1938g), "texts=".concat(AbstractC0123k.m271m0(arrayList4, "|", null, null, null, 62)), AbstractC0174d.m355k("matchedUser=", (strM1938g == null || AbstractC0307q.m534d0(strM1938g) || !setM265B0.contains(strM1938g)) ? false : true));
        if (strM1938g != null && !AbstractC0307q.m534d0(strM1938g) && setM265B0.contains(strM1938g)) {
            m1939j(view);
            m1937e("tag page row hide", "by=user", strM1938g);
            return;
        }
        boolean z5 = AbstractC1126i.f3786a;
        ArrayList arrayListM2433i = C1124g.m2433i();
        ArrayList<MaskItemBean> arrayList5 = new ArrayList();
        for (Object obj3 : arrayListM2433i) {
            String maskId = ((MaskItemBean) obj3).getMaskId();
            String string2 = maskId != null ? AbstractC0299i.m507C0(maskId).toString() : null;
            if (string2 == null) {
                string2 = "";
            }
            if (setM265B0.contains(string2)) {
                arrayList5.add(obj3);
            }
        }
        ArrayList arrayList6 = new ArrayList();
        for (MaskItemBean maskItemBean : arrayList5) {
            String maskId2 = maskItemBean.getMaskId();
            String string3 = maskId2 != null ? AbstractC0299i.m507C0(maskId2).toString() : null;
            if (string3 == null) {
                string3 = "";
            }
            String tagName = maskItemBean.getTagName();
            String string4 = tagName != null ? AbstractC0299i.m507C0(tagName).toString() : null;
            if (string4 == null) {
                string4 = "";
            }
            AbstractC0129q.m291e0(AbstractC0120h.m252Z(new String[]{string3, string4}), arrayList6);
        }
        ArrayList arrayList7 = new ArrayList();
        for (Object obj4 : arrayList6) {
            if (!AbstractC0307q.m534d0((String) obj4)) {
                arrayList7.add(obj4);
            }
        }
        Set setM265B02 = AbstractC0123k.m265B0(arrayList7);
        Iterator it2 = arrayList4.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (setM265B02.contains((String) next)) {
                string = next;
                break;
            }
        }
        String str3 = (String) string;
        if (str3 == null) {
            m1946r(view);
        } else {
            m1939j(view);
            m1937e("tag page row hide", "by=text", str3);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: t */
    public final void m1948t(View view) {
        if (view == null) {
            return;
        }
        if (m1943o(view)) {
            String name = view.getClass().getName();
            String strM1934i = m1934i(view);
            m1937e("scrub target found", name, strM1934i != null ? strM1934i : "");
            this.f3187c.add(view);
            this.f3188d.put(view, Long.valueOf(System.currentTimeMillis()));
            Object objM1933h = m1933h(view);
            if (objM1933h != null) {
                m1940k(objM1933h.getClass());
            }
            m1949u(view);
            return;
        }
        if (AbstractC0223g.m414a(m1934i(view), "mim") || AbstractC0223g.m414a(m1934i(view), "k12")) {
            String name2 = view.getClass().getName();
            String strM1934i2 = m1934i(view);
            m1937e("scrub target pass", name2, strM1934i2 != null ? strM1934i2 : "");
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                m1948t(viewGroup.getChildAt(i2));
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: u */
    public final void m1949u(View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = viewGroup.getChildAt(i2);
                AbstractC0223g.m417d(childAt, "getChildAt(...)");
                m1947s(childAt);
            }
        }
    }
}
