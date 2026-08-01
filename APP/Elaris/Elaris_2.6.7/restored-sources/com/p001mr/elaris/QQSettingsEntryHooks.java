package com.p001mr.elaris;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.widget.Toast;
import com.p001mr.elaris.xposedcompat.XposedBridge;
import com.p001mr.elaris.xposedcompat.XposedHelpers;
import java.lang.ref.WeakReference;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p000.AbstractC0000a;
import p000.AbstractC0009a8;
import p000.C0333mb;
import p000.C0479u2;

/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
final class QQSettingsEntryHooks {
    private static volatile C0333mb sProcessorInfo;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private QQSettingsEntryHooks() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static Activity asActivity(Context context) {
        for (int i = 0; i < 6 && context != null; i++) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            if (!(context instanceof ContextWrapper)) {
                return null;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static Object createSettingGroup(ClassLoader classLoader, List list, List list2, CharSequence charSequence) throws NoSuchMethodException {
        Object next;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (next != null) {
                break;
            }
        }
        if (next == null) {
            C0479u2.m1037b("empty settings groups");
            return null;
        }
        Constructor<?> declaredConstructor = next.getClass().getDeclaredConstructor(List.class, CharSequence.class, CharSequence.class, Integer.TYPE, classLoader.loadClass("kotlin.jvm.internal.DefaultConstructorMarker"));
        declaredConstructor.setAccessible(true);
        return declaredConstructor.newInstance(list2, charSequence, null, Integer.valueOf(charSequence == null ? 6 : 4), null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static Object createSettingItem(ClassLoader classLoader, Context context, C0333mb c0333mb) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        int iResolveQQNativeIcon = resolveQQNativeIcon(context);
        Constructor constructor = c0333mb.f570a;
        Object staticObjectField = null;
        Object objNewInstance = constructor.newInstance(constructor.getParameterTypes().length == 5 ? new Object[]{context, 5329240, "Elaris", Integer.valueOf(iResolveQQNativeIcon), null} : new Object[]{context, 5329240, "Elaris", Integer.valueOf(iResolveQQNativeIcon)});
        try {
            staticObjectField = XposedHelpers.getStaticObjectField(classLoader.loadClass("kotlin.Unit"), "INSTANCE");
        } catch (Throwable unused) {
        }
        c0333mb.f571b.invoke(objNewInstance, Proxy.newProxyInstance(classLoader, new Class[]{c0333mb.f572c}, new C0164r(context, staticObjectField)));
        return objNewInstance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static Method findFunction0Setter(Class<?> cls, Class<?> cls2) {
        while (cls != null) {
            for (Method method : cls.getDeclaredMethods()) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (method.getReturnType() == Void.TYPE && parameterTypes.length == 1 && parameterTypes[0].isAssignableFrom(cls2)) {
                    return method;
                }
            }
            cls = cls.getSuperclass();
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static Constructor<?> findSettingItemConstructor(Class<?> cls) {
        for (Constructor<?> constructor : cls.getDeclaredConstructors()) {
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            if ((parameterTypes.length == 4 || parameterTypes.length == 5) && Context.class.isAssignableFrom(parameterTypes[0])) {
                Class<?> cls2 = parameterTypes[1];
                Class<?> cls3 = Integer.TYPE;
                if (cls2 == cls3 && CharSequence.class.isAssignableFrom(parameterTypes[2]) && parameterTypes[3] == cls3 && (parameterTypes.length == 4 || parameterTypes[4] == String.class)) {
                    return constructor;
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static Class<?> findSettingProviderClass(ClassLoader classLoader) {
        String[] strArr = {"com.tencent.mobileqq.setting.main.MainSettingConfigProvider", "com.tencent.mobileqq.setting.main.NewSettingConfigProvider"};
        for (int i = 0; i < 2; i++) {
            try {
                return XposedHelpers.findClass(strArr[i], classLoader);
            } catch (Throwable unused) {
            }
        }
        try {
            return inferProviderFromFragment(XposedHelpers.findClass("com.tencent.mobileqq.setting.main.MainSettingFragment", classLoader));
        } catch (Throwable unused2) {
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static int firstOfficialNativeIndex(List list) {
        if (list == null) {
            return -1;
        }
        for (int i = 0; i < list.size(); i++) {
            if (objectContainsAnyText(list.get(i), Collections.newSetFromMap(new IdentityHashMap()), 0, "账号与安全", "消息通知", "模式选择", "通用", "隐私设置", "关于QQ与帮助", "退出当前账号", "退出当前帐号")) {
                return i;
            }
        }
        return -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void hookProviderEntry(ClassLoader classLoader) {
        try {
            Class<?> clsFindSettingProviderClass = findSettingProviderClass(classLoader);
            if (clsFindSettingProviderClass == null) {
                HookEntry.logAlways("QQ settings provider not found at startup; native settings entry unavailable");
                return;
            }
            Method[] declaredMethods = clsFindSettingProviderClass.getDeclaredMethods();
            boolean z = !"com.tencent.mobileqq.setting.main.MainSettingConfigProvider".equals(clsFindSettingProviderClass.getName());
            int i = 0;
            for (Method method : declaredMethods) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if ((parameterTypes.length == 0 || (parameterTypes.length == 1 && Context.class.isAssignableFrom(parameterTypes[0]))) && List.class.isAssignableFrom(method.getReturnType()) && !Modifier.isAbstract(method.getModifiers())) {
                    method.setAccessible(true);
                    XposedBridge.hookMethod(method, new C0163q(method, classLoader, z));
                    i++;
                    HookEntry.logAlways("hooked QQ settings entry: " + methodSig(method));
                }
            }
            if (i == 0) {
                HookEntry.logAlways("QQ settings build method not found: " + clsFindSettingProviderClass.getName());
                return;
            }
            HookEntry.logAlways("QQ settings entry hooks installed count=" + i + " provider=" + clsFindSettingProviderClass.getName());
        } catch (Throwable th) {
            HookEntry.logAlways("hookQQSettingEntry failed: " + th);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static Class<?> inferProviderFromFragment(Class<?> cls) {
        while (cls != null) {
            for (Field field : cls.getDeclaredFields()) {
                int modifiers = field.getModifiers();
                Class<?> type = field.getType();
                if (!Modifier.isStatic(modifiers) && !type.isPrimitive()) {
                    String name = type.getName();
                    if (!name.startsWith("android.") && !name.startsWith("java.") && !name.startsWith("kotlin.") && (name.contains(".setting.main.") || name.contains(".setting.processor."))) {
                        return type;
                    }
                }
            }
            cls = cls.getSuperclass();
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void insertElarisSettingEntry(ClassLoader classLoader, Context context, List list, boolean z, String str) {
        C0333mb c0333mbResolveProcessorInfo = resolveProcessorInfo(classLoader, list);
        if (c0333mbResolveProcessorInfo == null) {
            StringBuilder sbM1b = AbstractC0000a.m1b("QQ settings entry processor not resolved source=", str, " size=");
            sbM1b.append(list.size());
            HookEntry.logAlways(sbM1b.toString());
            return;
        }
        int iRemoveNativeElarisEntries = removeNativeElarisEntries(list);
        int iStableNativeInsertIndex = stableNativeInsertIndex(list, z);
        list.add(iStableNativeInsertIndex, createSettingGroup(classLoader, list, Collections.singletonList(createSettingItem(classLoader, context, c0333mbResolveProcessorInfo)), null));
        HookEntry.logAlways("QQ settings entry positioned native source=" + str + " index=" + iStableNativeInsertIndex + " removed=" + iRemoveNativeElarisEntries + " size=" + list.size());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static boolean isUsableActivity(Activity activity) {
        return (activity == null || activity.isFinishing() || activity.isDestroyed()) ? false : true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static String methodSig(Method method) {
        return method.getDeclaringClass().getName() + "." + method.getName() + Arrays.toString(method.getParameterTypes());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static boolean objectContainsAnyText(Object obj, Set<Object> set, int i, String... strArr) {
        if (strArr == null) {
            return false;
        }
        for (String str : strArr) {
            if (objectContainsText(obj, str, set, i)) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static boolean objectContainsText(Object obj, String str, Set<Object> set, int i) {
        if (obj != null && str != null && i <= 5) {
            if (obj instanceof CharSequence) {
                return obj.toString().contains(str);
            }
            if (!(obj instanceof Number) && !(obj instanceof Boolean) && !(obj instanceof Character) && !(obj instanceof Enum)) {
                Class<?> superclass = obj.getClass();
                if (superclass.isArray()) {
                    int iMin = Math.min(Array.getLength(obj), 80);
                    for (int i2 = 0; i2 < iMin; i2++) {
                        if (objectContainsText(Array.get(obj, i2), str, set, i + 1)) {
                            return true;
                        }
                    }
                    return false;
                }
                if (obj instanceof Iterable) {
                    int i3 = 0;
                    for (Object obj2 : (Iterable) obj) {
                        int i4 = i3 + 1;
                        if (i3 >= 80) {
                            break;
                        }
                        if (objectContainsText(obj2, str, set, i + 1)) {
                            return true;
                        }
                        i3 = i4;
                    }
                    return false;
                }
                String name = superclass.getName();
                if (!name.startsWith("com.tencent") && !name.startsWith("kotlin.") && !name.startsWith("java.util.")) {
                    return String.valueOf(obj).contains(str);
                }
                if (!set.add(obj)) {
                    return false;
                }
                while (superclass != null && superclass != Object.class) {
                    try {
                        Field[] declaredFields = superclass.getDeclaredFields();
                        int iMin2 = Math.min(declaredFields.length, 96);
                        for (int i5 = 0; i5 < iMin2; i5++) {
                            Field field = declaredFields[i5];
                            if (!Modifier.isStatic(field.getModifiers())) {
                                try {
                                    field.setAccessible(true);
                                    if (objectContainsText(field.get(obj), str, set, i + 1)) {
                                        return true;
                                    }
                                } catch (Throwable unused) {
                                    continue;
                                }
                            }
                        }
                    } catch (Throwable unused2) {
                    }
                    superclass = superclass.getSuperclass();
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void openModuleSettings(Context context) {
        try {
            Activity activityResolveSettingsHost = resolveSettingsHost(context);
            if (activityResolveSettingsHost != null) {
                InAppSettings.show(activityResolveSettingsHost);
            } else if (context != null) {
                Toast.makeText(context, "无法打开 Elaris 设置页，请从 QQ 设置重新进入", 0).show();
                HookEntry.log("open in-app settings failed: context is not Activity: ".concat(context.getClass().getName()));
            }
        } catch (Throwable th) {
            HookEntry.log("open module settings failed: " + th);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static int removeNativeElarisEntries(List list) {
        if (list == null || list.isEmpty()) {
            return 0;
        }
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (objectContainsText(it.next(), "Elaris", Collections.newSetFromMap(new IdentityHashMap()), 0)) {
                it.remove();
                i++;
            }
        }
        return i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static C0333mb resolveProcessorInfo(ClassLoader classLoader, List list) {
        if (sProcessorInfo != null) {
            return sProcessorInfo;
        }
        try {
            HashSet<Class> hashSet = new HashSet();
            for (Object obj : list) {
                if (obj != null) {
                    for (Class<?> superclass = obj.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
                        for (Field field : superclass.getDeclaredFields()) {
                            try {
                                field.setAccessible(true);
                                Object obj2 = field.get(obj);
                                if (obj2 instanceof Collection) {
                                    for (Object obj3 : (Collection) obj2) {
                                        if (obj3 != null) {
                                            hashSet.add(obj3.getClass());
                                        }
                                    }
                                } else if (obj2 instanceof Object[]) {
                                    for (Object obj4 : (Object[]) obj2) {
                                        if (obj4 != null) {
                                            hashSet.add(obj4.getClass());
                                        }
                                    }
                                }
                            } catch (Throwable unused) {
                            }
                        }
                    }
                }
            }
            Class<?> clsLoadClass = classLoader.loadClass("kotlin.jvm.functions.Function0");
            for (Class cls : hashSet) {
                Constructor<?> constructorFindSettingItemConstructor = findSettingItemConstructor(cls);
                Method methodFindFunction0Setter = findFunction0Setter(cls, clsLoadClass);
                if (constructorFindSettingItemConstructor != null && methodFindFunction0Setter != null) {
                    constructorFindSettingItemConstructor.setAccessible(true);
                    methodFindFunction0Setter.setAccessible(true);
                    sProcessorInfo = new C0333mb(constructorFindSettingItemConstructor, methodFindFunction0Setter, clsLoadClass);
                    return sProcessorInfo;
                }
            }
            return null;
        } catch (Throwable th) {
            HookEntry.log("resolve QQ settings processor failed: " + th);
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static int resolveQQNativeIcon(Context context) {
        int identifier;
        if (context == null) {
            return 0;
        }
        try {
            identifier = context.getResources().getIdentifier(new String[]{"qui_safety"}[0], "drawable", context.getPackageName());
        } catch (Throwable unused) {
            identifier = 0;
        }
        if (identifier != 0) {
            return identifier;
        }
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static Activity resolveSettingsHost(Context context) {
        Activity activityAsActivity = asActivity(context);
        if (isUsableActivity(activityAsActivity)) {
            return activityAsActivity;
        }
        Activity activity = topActivity();
        if (isUsableActivity(activity)) {
            return activity;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static int stableNativeInsertIndex(List list, boolean z) {
        int size = list == null ? 0 : list.size();
        int iFirstOfficialNativeIndex = firstOfficialNativeIndex(list);
        if (iFirstOfficialNativeIndex >= 0) {
            return Math.max(0, Math.min(iFirstOfficialNativeIndex, size));
        }
        return Math.min(size, size < 1 ? size : 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static Activity topActivity() {
        WeakReference weakReference = AbstractC0009a8.f37d;
        Activity activity = weakReference == null ? null : (Activity) weakReference.get();
        if (isUsableActivity(activity)) {
            return activity;
        }
        return null;
    }

    public static void insertElarisSettingEntry(ClassLoader classLoader, Context context, List list, boolean z) {
        insertElarisSettingEntry(classLoader, context, list, z, "unknown");
    }

    public static void resetForHotReload() {
    }
}
