package p000;

import com.p001mr.elaris.HookEntry;
import com.p001mr.elaris.xposedcompat.XC_MethodHook;
import com.p001mr.elaris.xposedcompat.XposedBridge;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: z3 */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0560z3 {

    /* JADX INFO: renamed from: a */
    public static final String[] f1129a = {"com.tencent.mobileqq.emoticonview.EmoticonPanelController"};

    /* JADX INFO: renamed from: b */
    public static final String[] f1130b = {"com.tencent.mobileqq.emoticonview.BasePanelView"};

    /* JADX INFO: renamed from: c */
    public static final String[] f1131c = {"com.tencent.mobileqq.emoticonview.EmoticonTabAdapter"};

    /* JADX INFO: renamed from: d */
    public static final String[] f1132d = {"热门表情", "热门", "DIY表情", "DIY", "魔法表情", "魔法", "厘米秀", "超级QQ秀", "QQ秀", "AI表情", "AI创作", "AI玩法", "AI斗图", "AI图片", "AI帮画", "AI写真", "AI生成", "AI头像", "AIAvatar", "AIGC", "ai_avatar", "aiavatar", "aipanel", "智能体"};

    /* JADX INFO: renamed from: e */
    public static final int[] f1133e = {9, 11, 12, 15, 17, 20};

    /* JADX INFO: renamed from: f */
    public static final Set f1134f = Collections.newSetFromMap(new ConcurrentHashMap());

    /* JADX INFO: renamed from: g */
    public static volatile boolean f1135g;

    /* JADX INFO: renamed from: h */
    public static volatile long f1136h;

    /* JADX INFO: renamed from: i */
    public static volatile long f1137i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static void m1179a(Object obj, String str) {
        if (obj == null) {
            return;
        }
        Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap());
        int iM1181c = m1181c(obj, 0, setNewSetFromMap) + m1182d(obj, "mData", setNewSetFromMap, 0);
        if (iM1181c > 0) {
            m1192n(obj, "isAIAvatarRedDotShow");
            m1192n(obj, "aiAvatarRedDotSwitch");
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - f1137i < 3000) {
                return;
            }
            f1137i = jCurrentTimeMillis;
            HookEntry.log("emoji panel tab adapter cleanup removed count=" + iM1181c + " method=" + str);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static void m1180b(String str, int i) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - f1136h < 3000) {
            return;
        }
        f1136h = jCurrentTimeMillis;
        HookEntry.log("emoji panel cleanup removed count=" + i + " method=" + str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static int m1181c(Object obj, int i, Set set) {
        Field[] declaredFields;
        if (obj == null || set == null || i > 4 || !set.add(obj)) {
            return 0;
        }
        if (obj instanceof List) {
            return m1184f((List) obj);
        }
        Class<?> superclass = obj.getClass();
        String name = superclass.getName();
        if (name.startsWith("java.") || name.startsWith("android.")) {
            return 0;
        }
        int iM1182d = m1182d(obj, "mBasePanelModel", set, i) + m1182d(obj, "mPanelController", set, i) + m1182d(obj, "mData", set, i) + m1182d(obj, "panelDataList", set, i);
        while (superclass != null && superclass != Object.class && superclass.getName().startsWith("com.tencent.mobileqq.emoticonview")) {
            try {
                declaredFields = superclass.getDeclaredFields();
            } catch (Throwable unused) {
                declaredFields = null;
            }
            if (declaredFields != null) {
                for (Field field : declaredFields) {
                    if (!Modifier.isStatic(field.getModifiers()) && !field.isSynthetic() && !field.getType().isPrimitive()) {
                        String name2 = field.getType().getName();
                        String name3 = field.getName();
                        if (List.class.isAssignableFrom(field.getType()) || name2.startsWith("com.tencent.mobileqq.emoticonview") || "panelDataList".equals(name3) || "mData".equals(name3) || "mPanelController".equals(name3) || "mBasePanelModel".equals(name3)) {
                            try {
                                field.setAccessible(true);
                                iM1182d += m1181c(field.get(obj), i + 1, set);
                            } catch (Throwable unused2) {
                            }
                        }
                    }
                }
            }
            superclass = superclass.getSuperclass();
        }
        return iM1182d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static int m1182d(Object obj, String str, Set set, int i) {
        Field declaredField = null;
        for (Class<?> superclass = obj == null ? null : obj.getClass(); superclass != null && superclass != Object.class; superclass = superclass.getSuperclass()) {
            try {
                declaredField = superclass.getDeclaredField(str);
                break;
            } catch (Throwable unused) {
            }
        }
        if (declaredField == null) {
            return 0;
        }
        try {
            declaredField.setAccessible(true);
            return m1181c(declaredField.get(obj), i + 1, set);
        } catch (Throwable unused2) {
            return 0;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static String m1183e(Object obj, int i, Set set) {
        Field[] declaredFields;
        String strM1183e;
        if (obj == null || set == null || i > 2 || !set.add(obj)) {
            return "";
        }
        if (obj instanceof CharSequence) {
            return obj.toString();
        }
        if ((obj instanceof Number) || (obj instanceof Boolean)) {
            return "";
        }
        Class<?> superclass = obj.getClass();
        if (superclass.getName().startsWith("java.")) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        while (superclass != null && superclass != Object.class) {
            try {
                declaredFields = superclass.getDeclaredFields();
            } catch (Throwable unused) {
                declaredFields = null;
            }
            if (declaredFields != null) {
                int i2 = 0;
                for (int i3 = 0; i3 < declaredFields.length && i2 < 12; i3++) {
                    Field field = declaredFields[i3];
                    if (!Modifier.isStatic(field.getModifiers()) && !field.isSynthetic()) {
                        i2++;
                        try {
                            field.setAccessible(true);
                            Object obj2 = field.get(obj);
                            if (obj2 instanceof CharSequence) {
                                String string = obj2.toString();
                                if (string != null && string.length() != 0) {
                                    if (sb.length() > 0) {
                                        sb.append(' ');
                                    }
                                    sb.append(string);
                                }
                            } else if (obj2 != null && !field.getType().isPrimitive() && !field.getType().getName().startsWith("java.") && (strM1183e = m1183e(obj2, 1 + i, set)) != null && strM1183e.length() != 0) {
                                if (sb.length() > 0) {
                                    sb.append(' ');
                                }
                                sb.append(strM1183e);
                            }
                        } catch (Throwable unused2) {
                        }
                    }
                }
            }
            superclass = superclass.getSuperclass();
        }
        return sb.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static int m1184f(List list) {
        int i = 0;
        try {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (m1193o(it.next())) {
                    it.remove();
                    i++;
                }
            }
            return i;
        } catch (Throwable th) {
            HookEntry.log("emoji panel cleanup filter failed: " + th);
            return i;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static int m1185g(ClassLoader classLoader, String str) {
        try {
            Class clsM1008i = AbstractC0463t2.m1008i(classLoader, "target.emoji_panel.controller_class", str);
            if (clsM1008i == null) {
                return 0;
            }
            AbstractC0463t2.m1015p("target.emoji_panel.controller_class", clsM1008i.getName());
            int i = 0;
            for (Method method : clsM1008i.getDeclaredMethods()) {
                if (method != null && !Modifier.isAbstract(method.getModifiers()) && List.class.isAssignableFrom(method.getReturnType()) && method.getParameterTypes().length == 0) {
                    String name = method.getName();
                    if ("getPanelDataList".equals(name) || m1190l(name).contains("paneldatalist")) {
                        String strM1078E = AbstractC0497v4.m1078E(method);
                        if (f1134f.add(strM1078E)) {
                            method.setAccessible(true);
                            XposedBridge.hookMethod(method, new C0496v3(strM1078E));
                            i++;
                            HookEntry.log("hooked emoji panel cleanup: " + strM1078E);
                        }
                    }
                }
            }
            return i;
        } catch (Throwable th) {
            HookEntry.log("emoji panel cleanup failed " + str + ": " + th);
            return 0;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static int m1186h(ClassLoader classLoader, String str) {
        int size;
        try {
            Class clsM1091j = AbstractC0497v4.m1091j(classLoader, str);
            if (clsM1091j == null) {
                return 0;
            }
            Set<XC_MethodHook.Unhook> setHookAllConstructors = XposedBridge.hookAllConstructors(clsM1091j, new C0528x3(str));
            if (setHookAllConstructors == null || setHookAllConstructors.isEmpty()) {
                size = 0;
            } else {
                size = setHookAllConstructors.size();
                HookEntry.log("hooked emoji panel tab adapter cleanup: " + str + ".<init> count=" + setHookAllConstructors.size());
            }
            for (Method method : clsM1091j.getDeclaredMethods()) {
                if (method != null && !Modifier.isAbstract(method.getModifiers()) && !Modifier.isStatic(method.getModifiers())) {
                    Class<?>[] parameterTypes = method.getParameterTypes();
                    if (parameterTypes.length == 1 && List.class.isAssignableFrom(parameterTypes[0])) {
                        String strM1078E = AbstractC0497v4.m1078E(method);
                        if (f1134f.add(strM1078E)) {
                            method.setAccessible(true);
                            XposedBridge.hookMethod(method, new C0544y3(strM1078E));
                            size++;
                            HookEntry.log("hooked emoji panel tab adapter cleanup: " + strM1078E);
                        }
                    }
                }
            }
            return size;
        } catch (Throwable th) {
            HookEntry.log("emoji panel tab adapter cleanup failed " + str + ": " + th);
            return 0;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public static int m1187i(ClassLoader classLoader, String str) {
        try {
            Class clsM1091j = AbstractC0497v4.m1091j(classLoader, str);
            if (clsM1091j == null) {
                return 0;
            }
            int i = 0;
            for (Method method : clsM1091j.getDeclaredMethods()) {
                if (method != null && !Modifier.isAbstract(method.getModifiers()) && !Modifier.isStatic(method.getModifiers()) && method.getParameterTypes().length == 0 && ("initTabView".equals(method.getName()) || m1190l(method.getName()).contains("inittabview"))) {
                    String strM1078E = AbstractC0497v4.m1078E(method);
                    if (f1134f.add(strM1078E)) {
                        method.setAccessible(true);
                        XposedBridge.hookMethod(method, new C0512w3(strM1078E));
                        i++;
                        HookEntry.log("hooked emoji panel tab cleanup: " + strM1078E);
                    }
                }
            }
            return i;
        } catch (Throwable th) {
            HookEntry.log("emoji panel tab cleanup failed " + str + ": " + th);
            return 0;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public static synchronized void m1188j(ClassLoader classLoader) {
        try {
            if (!f1135g && classLoader != null) {
                int i = 0;
                int i2 = 0;
                int iM1186h = 0;
                while (true) {
                    String[] strArr = f1129a;
                    if (i2 >= 1) {
                        break;
                    }
                    iM1186h += m1185g(classLoader, strArr[i2]);
                    i2++;
                }
                int i3 = 0;
                while (true) {
                    String[] strArr2 = f1130b;
                    if (i3 >= 1) {
                        break;
                    }
                    iM1186h += m1187i(classLoader, strArr2[i3]);
                    i3++;
                }
                while (true) {
                    String[] strArr3 = f1131c;
                    if (i >= 1) {
                        break;
                    }
                    iM1186h += m1186h(classLoader, strArr3[i]);
                    i++;
                }
                if (iM1186h > 0) {
                    f1135g = true;
                    HookEntry.logAlways("emoji panel cleanup installed count=" + iM1186h + " rev=tab-data-v2");
                } else {
                    HookEntry.log("emoji panel cleanup target not found");
                }
            }
        } finally {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public static boolean m1189k(char c) {
        if (c >= 'A' && c <= 'Z') {
            return true;
        }
        if (c < 'a' || c > 'z') {
            return c >= '0' && c <= '9';
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public static String m1190l(String str) {
        if (str == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder(str.length());
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (Character.isLetterOrDigit(cCharAt)) {
                sb.append(Character.toLowerCase(cCharAt));
            }
        }
        return sb.toString().toLowerCase(Locale.ROOT);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public static synchronized void m1191m() {
        f1135g = false;
        f1134f.clear();
        f1136h = 0L;
        f1137i = 0L;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public static void m1192n(Object obj, String str) {
        Field declaredField = null;
        for (Class<?> superclass = obj == null ? null : obj.getClass(); superclass != null && superclass != Object.class; superclass = superclass.getSuperclass()) {
            try {
                declaredField = superclass.getDeclaredField(str);
                break;
            } catch (Throwable unused) {
            }
        }
        if (declaredField == null) {
            return;
        }
        try {
            declaredField.setAccessible(true);
            if (declaredField.getType() == Boolean.TYPE) {
                declaredField.setBoolean(obj, false);
            } else if (declaredField.getType() == Boolean.class) {
                declaredField.set(obj, Boolean.FALSE);
            }
        } catch (Throwable unused2) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v14, resolved type: java.lang.Object[] */
    /* JADX DEBUG: Multi-variable search result rejected for r4v15, resolved type: java.lang.Object[] */
    /* JADX DEBUG: Multi-variable search result rejected for r4v17, resolved type: java.lang.Object[] */
    /* JADX DEBUG: Multi-variable search result rejected for r6v6, resolved type: java.lang.reflect.Field */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:125:0x012b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00fb  */
    /* JADX INFO: renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m1193o(Object obj) {
        String upperCase;
        int i;
        int iIndexOf;
        Object[] declaredFields;
        Integer numValueOf = null;
        if (obj != null) {
            for (Class<?> superclass = obj.getClass(); superclass != null && superclass != Object.class; superclass = superclass.getSuperclass()) {
                try {
                    declaredFields = superclass.getDeclaredFields();
                } catch (Throwable unused) {
                    declaredFields = numValueOf;
                }
                if (declaredFields != 0) {
                    for (Field field : declaredFields) {
                        if (!Modifier.isStatic(field.getModifiers())) {
                            Class<?> type = field.getType();
                            Class<?> cls = Integer.TYPE;
                            if ((type == cls || field.getType() == Integer.class) && "type".equals(field.getName())) {
                                try {
                                    field.setAccessible(true);
                                    Object obj2 = field.get(obj);
                                    if (obj2 instanceof Number) {
                                        numValueOf = Integer.valueOf(((Number) obj2).intValue());
                                    } else if (field.getType() == cls) {
                                        numValueOf = Integer.valueOf(field.getInt(obj));
                                    } else {
                                        continue;
                                    }
                                } catch (Throwable unused2) {
                                    continue;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (numValueOf != null) {
            for (int i2 = 0; i2 < 6; i2++) {
                if (numValueOf.intValue() == f1133e[i2]) {
                    return true;
                }
            }
        }
        String strM1183e = m1183e(obj, 0, Collections.newSetFromMap(new IdentityHashMap()));
        if (strM1183e.length() == 0) {
            return false;
        }
        Locale locale = Locale.ROOT;
        String lowerCase = strM1183e.toLowerCase(locale);
        int i3 = 0;
        while (true) {
            if (i3 >= 24) {
                String[] strArr = {"ai_avatar", "aiavatar", "aigc", "aipanel"};
                if (lowerCase == null) {
                    upperCase = strM1183e.toUpperCase(locale);
                    i = 0;
                    while (i >= 0 && i < upperCase.length()) {
                        iIndexOf = upperCase.indexOf("AI", i);
                        if (iIndexOf >= 0) {
                            return false;
                        }
                        int i4 = iIndexOf + 2;
                        boolean z = iIndexOf == 0 || !m1189k(upperCase.charAt(iIndexOf + (-1)));
                        boolean z2 = i4 >= upperCase.length() || !m1189k(upperCase.charAt(i4));
                        if (!z || !z2) {
                            i = i4;
                        }
                    }
                    return false;
                }
                for (int i5 = 0; i5 < 4; i5++) {
                    String str = strArr[i5];
                    if (str != null && str.length() > 0 && lowerCase.contains(str)) {
                        break;
                    }
                }
                upperCase = strM1183e.toUpperCase(locale);
                i = 0;
                while (i >= 0) {
                    iIndexOf = upperCase.indexOf("AI", i);
                    if (iIndexOf >= 0) {
                    }
                }
                return false;
            }
            String str2 = f1132d[i3];
            if (str2 != null && str2.length() > 0 && strM1183e.contains(str2)) {
                break;
            }
            i3++;
        }
        return true;
    }
}
