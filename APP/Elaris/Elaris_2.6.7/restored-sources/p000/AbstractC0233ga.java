package p000;

import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p001mr.elaris.HookEntry;
import com.p001mr.elaris.Prefs;
import com.p001mr.elaris.xposedcompat.XC_MethodHook;
import com.p001mr.elaris.xposedcompat.XposedBridge;
import com.p001mr.elaris.xposedcompat.XposedHelpers;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: ga */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0233ga {

    /* JADX INFO: renamed from: i */
    public static volatile boolean f320i;

    /* JADX INFO: renamed from: j */
    public static volatile int f321j;

    /* JADX INFO: renamed from: l */
    public static RunnableC0313l7 f323l;

    /* JADX INFO: renamed from: a */
    public static final Set f312a = Collections.synchronizedSet(new HashSet());

    /* JADX INFO: renamed from: b */
    public static final Set f313b = Collections.synchronizedSet(new HashSet());

    /* JADX INFO: renamed from: c */
    public static final Handler f314c = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: d */
    public static final String[] f315d = {"com.qqnt.widget.smartrefreshlayout.SmartRefreshLayout", "com.qqnt.widget.smartrefreshlayout.layout.SmartRefreshLayout", "com.scwang.smart.refresh.layout.SmartRefreshLayout", "com.tencent.richframework.widget.refresh.layout.SmartRefreshLayout"};

    /* JADX INFO: renamed from: e */
    public static final String[] f316e = {"com.tencent.qqnt.chats.view.MiniOldStyleHeaderNew", "com.tencent.qqnt.chats.view.MiniOldStyleHeader", "com.tencent.qqnt.chats.view.QQChatListTwoLevelHeader"};

    /* JADX INFO: renamed from: f */
    public static final Set f317f = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));

    /* JADX INFO: renamed from: g */
    public static final WeakHashMap f318g = new WeakHashMap();

    /* JADX INFO: renamed from: h */
    public static final WeakHashMap f319h = new WeakHashMap();

    /* JADX INFO: renamed from: k */
    public static volatile String f322k = "";

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: A */
    public static void m436A(ClassLoader classLoader, String str) {
        if (classLoader == null || !HookEntry.runtimeBool(Prefs.KEY_HOME_PULL_GUARD)) {
            return;
        }
        synchronized (AbstractC0233ga.class) {
            try {
                if (f323l != null) {
                    return;
                }
                int i = f321j + 1;
                f321j = i;
                if (i > 6) {
                    m461x("mini-conversation-init-giveup", "mini conversation init hook failed reason=class not ready after retries");
                    return;
                }
                long j = i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? 5000L : 3000L : 1500L : 800L : 300L : 100L;
                RunnableC0313l7 runnableC0313l7 = new RunnableC0313l7(2, classLoader, str);
                f323l = runnableC0313l7;
                try {
                    if (f314c.postDelayed(runnableC0313l7, j)) {
                        return;
                    }
                    m440c();
                    HookEntry.logAlways("mini pull retry schedule rejected delay=" + j);
                } catch (Throwable th) {
                    m440c();
                    HookEntry.logAlways("mini pull retry schedule failed: ".concat(th.getClass().getSimpleName()));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: B */
    public static Object m437B(Object obj) {
        Object parent;
        if (obj == null) {
            return null;
        }
        if (!m457t(obj)) {
            if (obj instanceof View) {
                View view = (View) obj;
                for (int i = 0; i < 8; i++) {
                    if (m457t(view)) {
                        return view;
                    }
                    try {
                        parent = view.getParent();
                    } catch (Throwable unused) {
                        parent = null;
                    }
                    if (!(parent instanceof View)) {
                        break;
                    }
                    view = (View) parent;
                }
            }
            if (!m456s(obj)) {
                return null;
            }
        }
        return obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static Object m438a(Object[] objArr) {
        Object obj = null;
        if (objArr == null) {
            return null;
        }
        for (Object obj2 : objArr) {
            if (obj2 != null) {
                if (obj == null) {
                    obj = obj2;
                }
                if (m456s(obj2) || m458u(obj2.getClass().getName())) {
                    return obj2;
                }
            }
        }
        return obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static void m439b(String str, Class cls) {
        String name;
        if (cls == null) {
            return;
        }
        try {
            name = cls.getName();
        } catch (Throwable unused) {
            name = "";
        }
        if (name.length() == 0) {
            return;
        }
        String strM1004e = AbstractC0463t2.m1004e(str);
        if (strM1004e.length() == 0) {
            AbstractC0463t2.m1015p(str, name);
            return;
        }
        for (String str2 : strM1004e.split("\\|")) {
            if (name.equals(str2)) {
                return;
            }
        }
        AbstractC0463t2.m1015p(str, strM1004e + "|" + name);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static void m440c() {
        RunnableC0313l7 runnableC0313l7;
        synchronized (AbstractC0233ga.class) {
            runnableC0313l7 = f323l;
            f323l = null;
            f321j = 0;
        }
        if (runnableC0313l7 != null) {
            f314c.removeCallbacks(runnableC0313l7);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static String m441d(Object obj) {
        if (obj == null) {
            return "";
        }
        try {
            return (obj instanceof Class ? (Class) obj : obj.getClass()).getName().toLowerCase(Locale.US);
        } catch (Throwable unused) {
            return "";
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static boolean m442e(Object obj, int i, Set set) {
        String lowerCase;
        Field[] declaredFields;
        int iMin;
        if (obj != null && i <= 3 && set != null && set.add(obj) && !(obj instanceof CharSequence) && !(obj instanceof Number) && !(obj instanceof Boolean)) {
            if (m454q(obj)) {
                return true;
            }
            if (obj instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) obj;
                try {
                    iMin = Math.min(viewGroup.getChildCount(), 12);
                } catch (Throwable unused) {
                    iMin = 0;
                }
                for (int i2 = 0; i2 < iMin; i2++) {
                    if (m442e(viewGroup.getChildAt(i2), i + 1, set)) {
                        return true;
                    }
                }
            }
            try {
                lowerCase = obj.getClass().getName().toLowerCase(Locale.US);
            } catch (Throwable unused2) {
                lowerCase = "";
            }
            if (!lowerCase.contains("refresh") && !lowerCase.contains("smart") && !lowerCase.contains("twolevel")) {
                return false;
            }
            for (Class<?> superclass = obj.getClass(); superclass != null && superclass != Object.class; superclass = superclass.getSuperclass()) {
                try {
                    declaredFields = superclass.getDeclaredFields();
                } catch (Throwable unused3) {
                    declaredFields = null;
                }
                if (declaredFields != null) {
                    for (Field field : declaredFields) {
                        if (!Modifier.isStatic(field.getModifiers()) && !field.getType().isPrimitive()) {
                            try {
                                field.setAccessible(true);
                                if (m442e(field.get(obj), i + 1, set)) {
                                    return true;
                                }
                            } catch (Throwable unused4) {
                                continue;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static Object m443f(Object obj, Class cls) {
        if (cls == null || cls == Void.TYPE || cls == Void.class) {
            return null;
        }
        if (cls == Boolean.TYPE || cls == Boolean.class) {
            return Boolean.FALSE;
        }
        if (cls == Integer.TYPE || cls == Integer.class) {
            return 0;
        }
        if (cls == Long.TYPE || cls == Long.class) {
            return 0L;
        }
        if (cls == Float.TYPE || cls == Float.class) {
            return Float.valueOf(0.0f);
        }
        if (cls == Double.TYPE || cls == Double.class) {
            return Double.valueOf(0.0d);
        }
        if (cls == Short.TYPE || cls == Short.class) {
            return (short) 0;
        }
        if (cls == Byte.TYPE || cls == Byte.class) {
            return (byte) 0;
        }
        if (cls == Character.TYPE || cls == Character.class) {
            return (char) 0;
        }
        if (obj == null || !cls.isInstance(obj)) {
            return null;
        }
        return obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static boolean m444g(View view, int i, int[] iArr) {
        int iMin;
        if (view != null && i <= 3) {
            int i2 = iArr[0];
            iArr[0] = i2 + 1;
            if (i2 <= 32) {
                StringBuilder sb = new StringBuilder();
                try {
                    sb.append(view.getClass().getName());
                    sb.append(' ');
                } catch (Throwable unused) {
                }
                if (view instanceof TextView) {
                    try {
                        CharSequence text = ((TextView) view).getText();
                        if (text != null) {
                            sb.append(text);
                            sb.append(' ');
                        }
                    } catch (Throwable unused2) {
                    }
                }
                try {
                    CharSequence contentDescription = view.getContentDescription();
                    if (contentDescription != null) {
                        sb.append(contentDescription);
                        sb.append(' ');
                    }
                } catch (Throwable unused3) {
                }
                try {
                    Object tag = view.getTag();
                    if (tag != null) {
                        sb.append(tag);
                        sb.append(' ');
                    }
                } catch (Throwable unused4) {
                }
                String string = sb.toString();
                if (string.length() != 0) {
                    String lowerCase = string.toLowerCase(Locale.US);
                    if (!lowerCase.contains("小程序") && !lowerCase.contains("小游戏") && !lowerCase.contains("minioldstyleheader") && !lowerCase.contains("qqchatlisttwolevelheader") && !lowerCase.contains("twolevelheader") && !lowerCase.contains("miniapp") && !lowerCase.contains("minigame") && !lowerCase.contains("qqmini") && !lowerCase.contains("microapp") && !lowerCase.contains("wxa") && ((!lowerCase.contains("正在") || !lowerCase.contains("接收")) && ((!lowerCase.contains("下拉") || !lowerCase.contains("程序")) && (!lowerCase.contains("松手") || !lowerCase.contains("程序"))))) {
                    }
                    return true;
                }
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    try {
                        iMin = Math.min(viewGroup.getChildCount(), 16);
                    } catch (Throwable unused5) {
                        iMin = 0;
                    }
                    for (int i3 = 0; i3 < iMin; i3++) {
                        if (m444g(viewGroup.getChildAt(i3), i + 1, iArr)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static boolean m445h(Method method, XC_MethodHook xC_MethodHook) {
        if (method != null) {
            String strM463z = m463z(method);
            Set set = f312a;
            if (set.add(strM463z)) {
                try {
                    method.setAccessible(true);
                    XposedBridge.hookMethod(method, xC_MethodHook);
                    return true;
                } catch (Throwable th) {
                    set.remove(strM463z);
                    m461x("mini-hookfail:".concat(strM463z), "hook failed " + strM463z + ": " + th);
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public static synchronized void m446i(ClassLoader classLoader, String str) {
        int iM449l;
        int iM447j;
        if (!HookEntry.runtimeBool(Prefs.KEY_HOME_PULL_GUARD)) {
            m440c();
            return;
        }
        if (!f320i && classLoader != null) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            try {
                iM449l = m449l(classLoader);
                iM447j = m447j(classLoader, null);
                Thread thread = new Thread(new RunnableC0313l7(str, classLoader), "Elaris-mini-dex-hints");
                thread.setDaemon(true);
                thread.start();
            } catch (Throwable th) {
                HookEntry.logAlways("mini pull hide install failed: " + th);
            }
            if (iM447j <= 0) {
                m461x("mini-conversation-init-pending", "mini pull hide hook pending: header class not ready");
                m436A(classLoader, str);
                return;
            }
            f320i = true;
            HookEntry.logAlways("mini pull hide installed: header=" + iM447j + ", source=" + iM449l + ", mode=source-block-no-ui-cleanup, mini pull hook cost=" + (System.currentTimeMillis() - jCurrentTimeMillis) + "ms");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01dc A[PHI: r17
  0x01dc: PHI (r17v3 int) = 
  (r17v1 int)
  (r17v1 int)
  (r17v1 int)
  (r17v1 int)
  (r17v1 int)
  (r17v1 int)
  (r17v1 int)
  (r17v1 int)
  (r17v4 int)
  (r17v4 int)
  (r17v4 int)
 binds: [B:110:0x01da, B:75:0x0166, B:77:0x016c, B:79:0x0174, B:81:0x017c, B:83:0x0184, B:85:0x018c, B:88:0x0194, B:47:0x010b, B:49:0x0113, B:51:0x0119] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x019a  */
    /* JADX INFO: renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int m447j(ClassLoader classLoader, C0358o4 c0358o4) {
        Class<?> clsFindClass;
        int i;
        int i2;
        Set set = f312a;
        int i3 = 0;
        for (String str : AbstractC0463t2.m1005f("target.mini_pull.header_classes", f316e, classLoader)) {
            Method[] declaredMethods = null;
            if (str == null || classLoader == null) {
                clsFindClass = null;
            } else {
                try {
                    clsFindClass = XposedHelpers.findClass(str.replace('/', '.'), classLoader);
                } catch (Throwable unused) {
                    clsFindClass = null;
                }
            }
            if (clsFindClass != null) {
                try {
                    if (set.add("ctor:" + str) && !XposedBridge.hookAllConstructors(clsFindClass, new C0201ea(80)).isEmpty()) {
                        i3++;
                        m439b("target.mini_pull.header_classes", clsFindClass);
                        HookEntry.logAlways("hooked mini header constructors class=" + str);
                    }
                } catch (Throwable th) {
                    set.remove("ctor:" + str);
                    m461x("mini-header-ctor-hook:" + str, "hook mini header constructor failed: " + str + " " + th);
                }
                try {
                    declaredMethods = clsFindClass.getDeclaredMethods();
                } catch (Throwable unused2) {
                }
                if (declaredMethods != null) {
                    for (int i4 = 0; i4 < declaredMethods.length; i4 = i + 1) {
                        Method method = declaredMethods[i4];
                        Class<?> cls = Void.TYPE;
                        if (method == null || Modifier.isStatic(method.getModifiers()) || Modifier.isAbstract(method.getModifiers())) {
                            i = i4;
                            i2 = 1;
                        } else {
                            i2 = 1;
                            Class<?>[] parameterTypes = method.getParameterTypes();
                            i = i4;
                            if (parameterTypes.length == 3 && method.getReturnType() == cls && (m458u(parameterTypes[1].getName()) || m458u(parameterTypes[2].getName()))) {
                                String name = method.getName();
                                if ("a".equals(name) || "c".equals(name) || "onStateChanged".equals(name)) {
                                    if (m445h(method, new C0217fa(70))) {
                                        i3++;
                                    }
                                }
                            }
                        }
                        if (method != null && !Modifier.isStatic(method.getModifiers()) && !Modifier.isAbstract(method.getModifiers())) {
                            Class<?>[] parameterTypes2 = method.getParameterTypes();
                            if (parameterTypes2.length >= i2 && parameterTypes2.length <= 6 && method.getReturnType() == cls) {
                                int i5 = 0;
                                while (true) {
                                    if (i5 >= parameterTypes2.length) {
                                        break;
                                    }
                                    if (m458u(parameterTypes2[i5].getName())) {
                                        String name2 = method.getName();
                                        if (name2 != null && ("onRefresh".equals(name2) || "onStateChanged".equals(name2) || "onHeaderMoving".equals(name2) || "onHeaderReleased".equals(name2) || "onHeaderStartAnimator".equals(name2) || "onHeaderFinish".equals(name2) || name2.length() <= 3)) {
                                        }
                                    } else {
                                        i5++;
                                    }
                                }
                                if (method != null) {
                                }
                            }
                        } else if (method != null || c0358o4 == null || c0358o4.f631a == null || !"com.tencent.qqnt.chats.view.MiniOldStyleHeaderNew".equals(str) || !c0358o4.f631a.equals(method.getName()) || method.getReturnType() != cls || method.getParameterTypes().length != 3 || Modifier.isStatic(method.getModifiers()) || Modifier.isAbstract(method.getModifiers())) {
                        }
                    }
                }
            }
        }
        if (i3 > 0) {
            HookEntry.logAlways("hooked mini header cleanup callbacks count=" + i3);
        }
        return i3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public static int m448k(Class cls) {
        String name;
        String name2;
        Method[] declaredMethods;
        String name3;
        Class<?> returnType;
        if (cls == null) {
            return 0;
        }
        try {
            name = cls.getName();
        } catch (Throwable unused) {
            name = "";
        }
        if (name.startsWith("android.") || name.startsWith("java.") || name.startsWith(Prefs.PACKAGE_NAME)) {
            return 0;
        }
        int i = 0;
        for (Class superclass = cls; superclass != null && superclass != Object.class; superclass = superclass.getSuperclass()) {
            try {
                name2 = superclass.getName();
            } catch (Throwable unused2) {
                name2 = "";
            }
            if (name2.startsWith("android.") || name2.startsWith("java.") || name2.startsWith(Prefs.PACKAGE_NAME)) {
                break;
            }
            try {
                declaredMethods = superclass.getDeclaredMethods();
            } catch (Throwable unused3) {
                declaredMethods = null;
            }
            if (declaredMethods != null) {
                for (Method method : declaredMethods) {
                    if (method != null && !Modifier.isStatic(method.getModifiers()) && !Modifier.isAbstract(method.getModifiers()) && (name3 = method.getName()) != null) {
                        String lowerCase = name3.toLowerCase(Locale.US);
                        Class<?>[] parameterTypes = method.getParameterTypes();
                        if (!m453p(method) && !m459v(method) && (name3.length() > 3 || parameterTypes.length > 3 || ((returnType = method.getReturnType()) != Boolean.TYPE && returnType != Boolean.class && returnType != Void.TYPE && returnType != Void.class))) {
                            Class<?>[] parameterTypes2 = method.getParameterTypes();
                            int i2 = 0;
                            while (true) {
                                if (i2 < parameterTypes2.length) {
                                    if (!MotionEvent.class.isAssignableFrom(parameterTypes2[i2])) {
                                        i2++;
                                    } else if ("ontouchevent".equals(lowerCase) || "onintercepttouchevent".equals(lowerCase)) {
                                    }
                                } else if (parameterTypes.length >= 1 && parameterTypes.length <= 3 && (lowerCase.contains("header") || lowerCase.contains("refresh"))) {
                                    for (Class<?> cls2 : parameterTypes) {
                                        String lowerCase2 = cls2.getName().toLowerCase(Locale.US);
                                        if (!lowerCase2.contains("header") && !lowerCase2.contains("refresh") && !lowerCase2.contains("twolevel")) {
                                        }
                                    }
                                }
                            }
                        }
                        if (m445h(method, new C0185da(method))) {
                            i++;
                            m439b("target.mini_pull.refresh_source_classes", cls);
                        }
                    }
                }
            }
        }
        return i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public static int m449l(ClassLoader classLoader) {
        if (classLoader == null || !HookEntry.runtimeBool(Prefs.KEY_HOME_PULL_GUARD)) {
            return 0;
        }
        int iM448k = 0;
        for (String str : AbstractC0463t2.m1005f("target.mini_pull.refresh_source_classes", f315d, classLoader)) {
            Class<?> clsFindClass = null;
            if (str != null) {
                try {
                    clsFindClass = XposedHelpers.findClass(str.replace('/', '.'), classLoader);
                } catch (Throwable unused) {
                }
            }
            iM448k += m448k(clsFindClass);
        }
        return iM448k;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public static boolean m450m(Object obj) {
        String lowerCase;
        if (obj == null) {
            return false;
        }
        try {
            lowerCase = obj.getClass().getName().toLowerCase(Locale.US);
        } catch (Throwable unused) {
            lowerCase = "";
        }
        return lowerCase.contains("twolevel") || lowerCase.contains("minioldstyleheader");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public static boolean m451n(Object obj) {
        boolean zContains;
        Set set = f317f;
        synchronized (set) {
            try {
                if (set.contains(obj)) {
                    return true;
                }
                Object objM437B = m437B(obj);
                if (objM437B == null) {
                    return false;
                }
                synchronized (set) {
                    zContains = set.contains(objM437B);
                }
                return zContains;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public static boolean m452o(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        return str.contains("qqchatlisttwolevelheader") || str.contains("chatlist") || str.contains("messagelist") || str.contains("msglist") || str.contains("aiomsg") || str.contains(".aio.") || str.contains("conversation") || str.contains("recent") || str.contains("troop") || str.contains("group");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public static boolean m453p(Method method) {
        if (method == null) {
            return false;
        }
        String lowerCase = method.getName() == null ? "" : method.getName().toLowerCase(Locale.US);
        if (lowerCase.contains("refresh") && !lowerCase.contains("twol") && !lowerCase.contains("mini")) {
            return false;
        }
        if (lowerCase.startsWith("auto") || lowerCase.contains("animator")) {
            return lowerCase.contains("twol") || lowerCase.contains("twolevel") || lowerCase.contains("mini");
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public static boolean m454q(Object obj) {
        String lowerCase;
        if (obj == null) {
            return false;
        }
        try {
            lowerCase = obj.getClass().getName().toLowerCase(Locale.US);
        } catch (Throwable unused) {
            lowerCase = "";
        }
        return lowerCase.contains("minioldstyleheader") || lowerCase.contains("qqchatlisttwolevelheader") || lowerCase.contains("twolevelheader");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r */
    public static boolean m455r(Object obj) {
        String strM441d = m441d(obj);
        return strM441d.contains("minioldstyleheader") || strM441d.contains("miniapp") || strM441d.contains("minigame") || strM441d.contains("qqmini") || strM441d.contains("microapp") || strM441d.contains("wxa");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s */
    public static boolean m456s(Object obj) {
        String name;
        if (obj == null) {
            return false;
        }
        try {
            name = obj.getClass().getName();
        } catch (Throwable unused) {
            name = "";
        }
        String lowerCase = name.toLowerCase(Locale.US);
        if (lowerCase.contains("elaris") || lowerCase.contains("setting")) {
            return false;
        }
        return lowerCase.contains("twolevel") || lowerCase.contains("refresh") || lowerCase.contains("pull") || lowerCase.contains("minioldstyleheader") || lowerCase.contains("miniapp") || lowerCase.contains("qqmini") || lowerCase.contains("wxa");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: t */
    public static boolean m457t(Object obj) {
        String lowerCase;
        if (obj == null) {
            return false;
        }
        try {
            lowerCase = obj.getClass().getName().toLowerCase(Locale.US);
        } catch (Throwable unused) {
            lowerCase = "";
        }
        if (lowerCase.contains("elaris") || lowerCase.contains("setting")) {
            return false;
        }
        return lowerCase.contains("smartrefreshlayout") || lowerCase.contains("refreshlayout") || lowerCase.contains(".refresh.") || lowerCase.contains("twolayout") || lowerCase.contains("twolevel");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: u */
    public static boolean m458u(String str) {
        String lowerCase = str.toLowerCase(Locale.US);
        if (lowerCase.contains("elaris") || lowerCase.contains("setting")) {
            return false;
        }
        return lowerCase.contains("refresh") || lowerCase.contains("twolevel") || lowerCase.contains("pull") || lowerCase.contains("header") || lowerCase.contains("smartrefresh") || lowerCase.contains("kernelrefresh");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: v */
    public static boolean m459v(Method method) {
        if (method == null) {
            return false;
        }
        String lowerCase = "";
        String lowerCase2 = method.getName() == null ? "" : method.getName().toLowerCase(Locale.US);
        try {
            lowerCase = method.getDeclaringClass().getName().toLowerCase(Locale.US);
        } catch (Throwable unused) {
        }
        if (lowerCase2.contains("twol") || lowerCase2.contains("twolevel") || lowerCase.contains("twolevel")) {
            return lowerCase2.contains("open") || lowerCase2.contains("anim") || lowerCase2.contains("release");
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: w */
    public static boolean m460w(Object obj) {
        String lowerCase;
        if (obj == null) {
            return true;
        }
        try {
            lowerCase = obj.getClass().getName().toLowerCase(Locale.US);
        } catch (Throwable unused) {
            lowerCase = "";
        }
        return lowerCase.contains("elaris") || lowerCase.contains("setting") || lowerCase.startsWith("java.") || lowerCase.contains("hongbao") || lowerCase.contains("springhb");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: x */
    public static void m461x(String str, String str2) {
        if (f313b.add(str)) {
            HookEntry.logAlways(str2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: y */
    public static void m462y(Object obj) {
        Object objM437B;
        if (obj == null || (objM437B = m437B(obj)) == null || m460w(objM437B)) {
            return;
        }
        Set set = f317f;
        synchronized (set) {
            set.add(objM437B);
        }
        try {
            m448k(objM437B.getClass());
        } catch (Throwable unused) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: z */
    public static String m463z(Method method) {
        if (method == null) {
            return "null";
        }
        return method.getDeclaringClass().getName() + "#" + method.getName() + Arrays.toString(method.getParameterTypes()) + ":" + method.getReturnType().getName();
    }
}
