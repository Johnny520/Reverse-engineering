package p000;

import android.view.View;
import android.view.ViewGroup;
import com.p001mr.elaris.HookEntry;
import com.p001mr.elaris.Prefs;
import com.p001mr.elaris.xposedcompat.XC_MethodHook;
import com.p001mr.elaris.xposedcompat.XposedBridge;
import com.p001mr.elaris.xposedcompat.XposedHelpers;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: vc */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0505vc {

    /* JADX INFO: renamed from: a */
    public static final String[] f971a = {"com.tencent.mobileqq.aio.msglist.holder.component.file.AIOFileContentComponent", "com.tencent.mobileqq.aio.msglist.holder.component.msgtail.AIOGeneralMsgTailContentComponent"};

    /* JADX INFO: renamed from: b */
    public static final Object f972b = new Object();

    /* JADX INFO: renamed from: c */
    public static final Set f973c = Collections.synchronizedSet(new HashSet());

    /* JADX INFO: renamed from: d */
    public static final ThreadLocal f974d = new ThreadLocal();

    /* JADX INFO: renamed from: e */
    public static volatile boolean f975e;

    /* JADX INFO: renamed from: f */
    public static volatile long f976f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0017  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m1109a(XC_MethodHook.MethodHookParam methodHookParam, Field field) {
        ViewGroup viewGroup;
        boolean zContainsKey;
        int childCount;
        Object obj;
        if (methodHookParam == null) {
            return;
        }
        Object obj2 = methodHookParam.thisObject;
        Map map = AbstractC0553yc.f1112c;
        if (obj2 == null || field == null) {
            viewGroup = null;
        } else {
            try {
                obj = field.get(obj2);
            } catch (Throwable unused) {
            }
            if (obj instanceof View) {
                View view = (View) obj;
                C0521wc c0521wc = (C0521wc) map.get(obj2);
                if (c0521wc == null || c0521wc.f1020a != view) {
                    for (int i = 0; view != null && i < 8; i++) {
                        if (view instanceof ViewGroup) {
                            try {
                                String name = view.getClass().getName();
                                if (name.endsWith(".TemplateLayout") || name.endsWith(".ChatItemAnimLayout") || name.contains(".aio.holder.template.") || name.contains(".aio.msglist.holder.template.")) {
                                    ViewGroup viewGroup2 = (ViewGroup) view;
                                    map.put(obj2, new C0521wc((View) obj, viewGroup2));
                                    viewGroup = viewGroup2;
                                    break;
                                }
                            } catch (Throwable unused2) {
                            }
                        }
                        Object parent = view.getParent();
                        view = parent instanceof View ? (View) parent : null;
                    }
                    map.remove(obj2);
                    viewGroup = null;
                } else {
                    viewGroup = c0521wc.f1021b;
                }
            }
        }
        ArrayDeque arrayDeque = (ArrayDeque) f974d.get();
        Object objPeek = (arrayDeque == null || arrayDeque.isEmpty()) ? null : arrayDeque.peek();
        if ((objPeek != f972b ? objPeek : null) == null || !HookEntry.runtimeBool(Prefs.KEY_SELF_MESSAGE_LEFT_SIDE)) {
            AbstractC0553yc.m1171a(viewGroup);
            return;
        }
        if (viewGroup == null) {
            return;
        }
        C0537xc c0537xc = (C0537xc) AbstractC0553yc.f1111b.get(viewGroup);
        Map map2 = AbstractC0553yc.f1110a;
        synchronized (map2) {
            zContainsKey = map2.containsKey(viewGroup);
        }
        if (zContainsKey && Float.compare(viewGroup.getScaleX(), -1.0f) == 0 && c0537xc != null && (childCount = viewGroup.getChildCount()) == c0537xc.f1067a && (childCount == 0 || (viewGroup.getChildAt(0) == c0537xc.f1068b && viewGroup.getChildAt(childCount - 1) == c0537xc.f1069c))) {
            int childCount2 = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount2; i2++) {
                if (Float.compare(viewGroup.getChildAt(i2).getRotationY(), 180.0f) == 0) {
                }
            }
            return;
        }
        AbstractC0553yc.m1173c(viewGroup, -1.0f);
        int childCount3 = viewGroup.getChildCount();
        for (int i3 = 0; i3 < childCount3; i3++) {
            View childAt = viewGroup.getChildAt(i3);
            if (childAt != null && childAt.getScaleX() < 0.0f) {
                AbstractC0553yc.m1173c(childAt, 1.0f);
            }
            if (childAt != null && Float.compare(childAt.getRotationY(), 180.0f) != 0) {
                try {
                    childAt.setRotationY(180.0f);
                } catch (Throwable unused3) {
                }
            }
        }
        Map map3 = AbstractC0553yc.f1110a;
        synchronized (map3) {
            map3.put(viewGroup, Boolean.TRUE);
            AbstractC0553yc.f1111b.put(viewGroup, new C0537xc(viewGroup));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static void m1110b() {
        ThreadLocal threadLocal = f974d;
        ArrayDeque arrayDeque = (ArrayDeque) threadLocal.get();
        if (arrayDeque != null && !arrayDeque.isEmpty()) {
            arrayDeque.pop();
        }
        if (arrayDeque == null || arrayDeque.isEmpty()) {
            threadLocal.remove();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static void m1111c(Object obj, Method method, boolean z) {
        ThreadLocal threadLocal = f974d;
        ArrayDeque arrayDeque = (ArrayDeque) threadLocal.get();
        if (arrayDeque == null) {
            arrayDeque = new ArrayDeque();
            threadLocal.set(arrayDeque);
        }
        arrayDeque.push(f972b);
        if (!HookEntry.runtimeBool(Prefs.KEY_SELF_MESSAGE_LEFT_SIDE) || obj == null) {
            return;
        }
        Boolean bool = null;
        if (method != null && method.getDeclaringClass().isInstance(obj)) {
            try {
                Object objInvokeOriginalMethod = XposedBridge.invokeOriginalMethod(method, obj, new Object[0]);
                if (objInvokeOriginalMethod instanceof Boolean) {
                    bool = (Boolean) objInvokeOriginalMethod;
                }
            } catch (Throwable unused) {
            }
        }
        if (Boolean.TRUE.equals(bool)) {
            arrayDeque.pop();
            arrayDeque.push(obj);
            if (z && HookEntry.runtimeBool(Prefs.KEY_DEBUG_LOG)) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (jCurrentTimeMillis - f976f < 60000) {
                    return;
                }
                f976f = jCurrentTimeMillis;
                HookEntry.log("self message left-side layout/style hit item=".concat(obj.getClass().getName()));
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0044, code lost:
    
        r8.setAccessible(true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00b9, code lost:
    
        if (r7 == null) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00bb, code lost:
    
        r7.setAccessible(true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00be, code lost:
    
        r3 = r7;
     */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int m1112d(ClassLoader classLoader, Method method) {
        Field field;
        Field field2;
        Method method2;
        Method[] declaredMethods;
        int i;
        Class<?> clsFindClassIfExists = XposedHelpers.findClassIfExists("com.tencent.mobileqq.aio.msglist.holder.AIOBubbleMsgItemVB", classLoader);
        if (clsFindClassIfExists != null && method != null) {
            Map map = AbstractC0553yc.f1110a;
            Class<?> superclass = clsFindClassIfExists;
            while (true) {
                field = null;
                if (superclass == null || superclass == Object.class) {
                    break;
                }
                try {
                    field2 = null;
                } catch (Throwable unused) {
                }
                for (Field field3 : superclass.getDeclaredFields()) {
                    if (!Modifier.isStatic(field3.getModifiers()) && View.class.isAssignableFrom(field3.getType())) {
                        if (field2 != null) {
                            field2 = null;
                            break;
                        }
                        field2 = field3;
                    }
                }
                if (field2 != null) {
                    try {
                        break;
                    } catch (Throwable unused2) {
                        field2 = null;
                    }
                } else {
                    superclass = superclass.getSuperclass();
                }
            }
            Map map2 = AbstractC0569zc.f1162a;
            loop2: for (Class<?> superclass2 = clsFindClassIfExists; superclass2 != null && superclass2 != Object.class; superclass2 = superclass2.getSuperclass()) {
                try {
                    declaredMethods = superclass2.getDeclaredMethods();
                } catch (Throwable unused3) {
                    declaredMethods = null;
                }
                if (declaredMethods != null) {
                    int length = declaredMethods.length;
                    for (int i2 = 0; i2 < length; i2++) {
                        method2 = declaredMethods[i2];
                        if (AbstractC0569zc.m1211c(method2)) {
                            method2.setAccessible(true);
                            break loop2;
                        }
                    }
                }
            }
            method2 = null;
            Class clsM1091j = AbstractC0497v4.m1091j(classLoader, "com.tencent.mobileqq.aio.msglist.holder.AIOMsgItemUIState$AIOMsgItemState");
            Class clsM1091j2 = AbstractC0497v4.m1091j(classLoader, "com.tencent.mobileqq.aio.msg.AIOMsgItem");
            Class<?> superclass3 = clsM1091j2 == null ? null : clsM1091j2.getSuperclass();
            if (clsM1091j != null && superclass3 != null && superclass3 != Object.class) {
                try {
                    Field[] declaredFields = clsM1091j.getDeclaredFields();
                    int length2 = declaredFields.length;
                    int i3 = 0;
                    Field field4 = null;
                    while (true) {
                        if (i3 >= length2) {
                            break;
                        }
                        Field field5 = declaredFields[i3];
                        if (!Modifier.isStatic(field5.getModifiers()) && field5.getType() == superclass3) {
                            if (field4 == null) {
                                field4 = field5;
                            }
                        }
                        i3++;
                    }
                } catch (Throwable unused4) {
                }
            }
            StringBuilder sb = new StringBuilder("self message left-side state field=");
            sb.append(field == null ? "missing" : field.getName());
            HookEntry.log(sb.toString());
            try {
                int i4 = 0;
                for (Method method3 : clsFindClassIfExists.getDeclaredMethods()) {
                    Class<?> cls = Void.TYPE;
                    if (method3 != null && !Modifier.isAbstract(method3.getModifiers()) && !Modifier.isStatic(method3.getModifiers())) {
                        String name = method3.getName();
                        Class<?>[] parameterTypes = method3.getParameterTypes();
                        if (("handleUIState".equals(name) && method3.getReturnType() == cls && parameterTypes.length == 1) || (method3.getReturnType() == cls && parameterTypes.length == 4 && parameterTypes[0] == Integer.TYPE && List.class.isAssignableFrom(parameterTypes[2]) && !parameterTypes[1].isPrimitive() && !parameterTypes[3].isPrimitive())) {
                            String strM1078E = AbstractC0497v4.m1078E(method3);
                            Set set = f973c;
                            synchronized (set) {
                                try {
                                    if (set.add(strM1078E)) {
                                        try {
                                            method3.setAccessible(true);
                                            XposedBridge.hookMethod(method3, new C0457sc(method2, field, method, field2));
                                            i4++;
                                            HookEntry.log("self message left-side bind hooked: " + strM1078E);
                                        } catch (Throwable th) {
                                            AbstractC0000a.m3d(th, new StringBuilder("self message left-side native bind hook failed: "), ": ");
                                        }
                                    }
                                } finally {
                                }
                            }
                        }
                    }
                }
                return i4;
            } catch (Throwable unused5) {
            }
        }
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static int m1113e(ClassLoader classLoader, Method method) {
        int i;
        Class<?> clsFindClassIfExists = XposedHelpers.findClassIfExists("com.tencent.mobileqq.aio.utils.p", classLoader);
        Class<?> clsFindClassIfExists2 = XposedHelpers.findClassIfExists("com.tencent.mobileqq.aio.msg.AIOMsgItem", classLoader);
        if (clsFindClassIfExists != null && clsFindClassIfExists2 != null && method != null) {
            try {
                int i2 = 0;
                for (Method method2 : clsFindClassIfExists.getDeclaredMethods()) {
                    Class<?>[] parameterTypes = method2.getParameterTypes();
                    int i3 = -1;
                    if (parameterTypes != null) {
                        i = 0;
                        while (i < parameterTypes.length) {
                            if (parameterTypes[i].isAssignableFrom(clsFindClassIfExists2)) {
                                break;
                            }
                            i++;
                        }
                        i = -1;
                    } else {
                        i = -1;
                    }
                    if (!Modifier.isStatic(method2.getModifiers()) && i >= 0 && method2.getReturnType().getName().endsWith(".AIOBubbleSkinInfo")) {
                        if ("e".equals(method2.getName()) && parameterTypes.length == 4 && parameterTypes[2] == Boolean.TYPE) {
                            i3 = 2;
                        }
                        String strM1078E = AbstractC0497v4.m1078E(method2);
                        Set set = f973c;
                        synchronized (set) {
                            try {
                                if (set.add(strM1078E)) {
                                    try {
                                        method2.setAccessible(true);
                                        XposedBridge.hookMethod(method2, new C0473tc(i, method, i3));
                                        i2++;
                                        HookEntry.log("self message left-side bubble skin hooked: " + strM1078E);
                                    } catch (Throwable th) {
                                        AbstractC0000a.m3d(th, new StringBuilder("self message left-side bubble skin hook failed: "), ": ");
                                    }
                                }
                            } finally {
                            }
                        }
                    }
                }
                return i2;
            } catch (Throwable unused) {
            }
        }
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static int m1114f(ClassLoader classLoader) {
        String[] strArr = f971a;
        int i = 0;
        for (int i2 = 0; i2 < 2; i2++) {
            Class<?> clsFindClassIfExists = XposedHelpers.findClassIfExists(strArr[i2], classLoader);
            if (clsFindClassIfExists != null) {
                try {
                    for (Method method : clsFindClassIfExists.getDeclaredMethods()) {
                        Class<?>[] parameterTypes = method.getParameterTypes();
                        if ("K1".equals(method.getName()) && !Modifier.isStatic(method.getModifiers()) && method.getReturnType() == Void.TYPE && parameterTypes.length == 3 && parameterTypes[0] == Integer.TYPE && !parameterTypes[1].isPrimitive()) {
                            String strM1078E = AbstractC0497v4.m1078E(method);
                            Set set = f973c;
                            synchronized (set) {
                                try {
                                    if (set.add(strM1078E)) {
                                        try {
                                            method.setAccessible(true);
                                            XposedBridge.hookMethod(method, new C0489uc(120));
                                            i++;
                                            HookEntry.log("self message left-side file direction mask hooked: " + strM1078E);
                                        } catch (Throwable th) {
                                            AbstractC0000a.m3d(th, new StringBuilder("self message left-side file direction mask failed: "), ": ");
                                        }
                                    }
                                } finally {
                                }
                            }
                        }
                    }
                } catch (Throwable unused) {
                    continue;
                }
            }
        }
        return i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static int m1115g(Method method) {
        if (method == null) {
            return 0;
        }
        String strM1078E = AbstractC0497v4.m1078E(method);
        Set set = f973c;
        synchronized (set) {
            try {
                if (!set.add(strM1078E)) {
                    return 0;
                }
                try {
                    XposedBridge.hookMethod(method, new C0441rc(120));
                    HookEntry.log("self message left-side direction hooked: ".concat(strM1078E));
                    return 1;
                } catch (Throwable th) {
                    AbstractC0000a.m3d(th, new StringBuilder("self message left-side direction hook failed: "), ": ");
                    return 0;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static synchronized void m1116h(ClassLoader classLoader) {
        Method declaredMethod;
        if (classLoader != null) {
            try {
                if (!f975e) {
                    if (AbstractC0569zc.f1164c != classLoader) {
                        AbstractC0569zc.f1164c = classLoader;
                        AbstractC0569zc.m1212d();
                    }
                    f975e = true;
                    Class<?> clsFindClassIfExists = XposedHelpers.findClassIfExists("com.tencent.mobileqq.aio.msg.AIOMsgItem", classLoader);
                    while (true) {
                        declaredMethod = null;
                        if (clsFindClassIfExists == null || clsFindClassIfExists == Object.class) {
                            break;
                        }
                        try {
                            declaredMethod = clsFindClassIfExists.getDeclaredMethod("isSelf", null);
                            if (!Modifier.isStatic(declaredMethod.getModifiers()) && declaredMethod.getReturnType() == Boolean.TYPE && declaredMethod.getParameterTypes().length == 0) {
                                declaredMethod.setAccessible(true);
                                break;
                            }
                        } catch (Throwable unused) {
                        }
                        clsFindClassIfExists = clsFindClassIfExists.getSuperclass();
                    }
                    int iM1115g = m1115g(declaredMethod);
                    int iM1114f = 0;
                    int iM1112d = iM1115g == 0 ? 0 : m1112d(classLoader, declaredMethod);
                    int iM1113e = iM1115g == 0 ? 0 : m1113e(classLoader, declaredMethod);
                    if (iM1115g != 0) {
                        iM1114f = m1114f(classLoader);
                    }
                    if (iM1115g <= 0 || iM1112d <= 0) {
                        HookEntry.log("self message left-side hook skipped reason=native direction target missing");
                    } else {
                        HookEntry.log("self message left-side layout/style hooks installed count=" + (iM1115g + iM1112d + iM1113e + iM1114f) + " skin=" + iM1113e + " file_mask=" + iM1114f);
                    }
                }
            } finally {
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public static synchronized void m1117i() {
        f975e = false;
        Set set = f973c;
        synchronized (set) {
            set.clear();
        }
        f974d.remove();
        AbstractC0553yc.m1172b();
        AbstractC0569zc.m1212d();
    }
}
