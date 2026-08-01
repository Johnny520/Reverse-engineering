package p000;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.text.Selection;
import android.text.Spannable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.TextView;
import com.p001mr.elaris.C0166t;
import com.p001mr.elaris.C0167u;
import com.p001mr.elaris.HookEntry;
import com.p001mr.elaris.Prefs;
import com.p001mr.elaris.xposedcompat.XposedBridge;
import com.p001mr.elaris.xposedcompat.XposedHelpers;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: fc */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0219fc {

    /* JADX INFO: renamed from: a */
    public static final String[] f259a = {"com.tencent.qqnt.aio.menu.ui.QQCustomMenuExpandableLayout", "com.tencent.qqnt.aio.menu.ui.QQCustomMenuNoIconLayout", "com.tencent.mobileqq.utils.dialogutils.QQCustomMenuNoIconLayout"};

    /* JADX INFO: renamed from: b */
    public static final String[] f260b = {"com.tencent.mobileqq.activity.aio.item.TextItemBuilder", "com.tencent.mobileqq.activity.aio.item.PicItemBuilder", "com.tencent.mobileqq.activity.aio.item.MixedMsgItemBuilder", "com.tencent.mobileqq.activity.aio.item.ReplyTextItemBuilder", "com.tencent.mobileqq.activity.aio.item.PttItemBuilder", "com.tencent.mobileqq.activity.aio.item.MarketFaceItemBuilder"};

    /* JADX INFO: renamed from: c */
    public static final Map f261c = Collections.synchronizedMap(new WeakHashMap());

    /* JADX INFO: renamed from: d */
    public static final Map f262d = Collections.synchronizedMap(new WeakHashMap());

    /* JADX INFO: renamed from: e */
    public static final Map f263e = Collections.synchronizedMap(new WeakHashMap());

    /* JADX INFO: renamed from: f */
    public static final Set f264f = Collections.synchronizedSet(Collections.newSetFromMap(new IdentityHashMap()));

    /* JADX INFO: renamed from: g */
    public static final Set f265g = Collections.synchronizedSet(Collections.newSetFromMap(new IdentityHashMap()));

    /* JADX INFO: renamed from: h */
    public static final Set f266h = Collections.synchronizedSet(Collections.newSetFromMap(new HashMap()));

    /* JADX INFO: renamed from: i */
    public static volatile boolean f267i;

    /* JADX INFO: renamed from: j */
    public static volatile boolean f268j;

    /* JADX INFO: renamed from: k */
    public static volatile boolean f269k;

    /* JADX INFO: renamed from: l */
    public static volatile boolean f270l;

    /* JADX INFO: renamed from: m */
    public static volatile boolean f271m;

    /* JADX INFO: renamed from: n */
    public static volatile long f272n;

    /* JADX INFO: renamed from: o */
    public static volatile long f273o;

    /* JADX INFO: renamed from: p */
    public static volatile long f274p;

    /* JADX INFO: renamed from: q */
    public static volatile long f275q;

    /* JADX INFO: renamed from: r */
    public static volatile boolean f276r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: A */
    public static String m361A(Class cls) throws NoSuchMethodException {
        for (Method method : cls.getDeclaredMethods()) {
            if (Modifier.isAbstract(method.getModifiers()) && method.getParameterTypes().length == 0 && List.class.isAssignableFrom(method.getReturnType())) {
                return method.getName();
            }
        }
        throw new NoSuchMethodException("menu list method");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: B */
    public static Field m362B(Class cls, Class cls2, String str) {
        Field declaredField;
        while (cls != null && cls != Object.class) {
            try {
                declaredField = cls.getDeclaredField(str);
            } catch (NoSuchFieldException unused) {
            }
            if (!Modifier.isStatic(declaredField.getModifiers()) && declaredField.getType() == cls2) {
                return declaredField;
            }
            cls = cls.getSuperclass();
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: C */
    public static C0203ec m363C(Class cls, Class cls2) throws NoSuchMethodException {
        boolean z;
        C0203ec c0203ec = null;
        C0203ec c0203ec2 = null;
        C0203ec c0203ec3 = null;
        C0203ec c0203ec4 = null;
        for (Constructor<?> constructor : cls.getDeclaredConstructors()) {
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            if (parameterTypes.length == 2 && Context.class.isAssignableFrom(parameterTypes[0]) && parameterTypes[1].isAssignableFrom(cls2)) {
                constructor.setAccessible(true);
                return new C0203ec(constructor, 0);
            }
            if (parameterTypes.length == 1 && parameterTypes[0].isAssignableFrom(cls2)) {
                constructor.setAccessible(true);
                c0203ec = new C0203ec(constructor, 1);
            } else if (parameterTypes.length == 1 && Context.class.isAssignableFrom(parameterTypes[0])) {
                constructor.setAccessible(true);
                c0203ec2 = new C0203ec(constructor, 2);
            } else if (parameterTypes.length == 0) {
                constructor.setAccessible(true);
                c0203ec3 = new C0203ec(constructor, 3);
            } else if (c0203ec4 == null) {
                if (parameterTypes.length == 0 || parameterTypes.length > 6) {
                    z = false;
                } else {
                    z = false;
                    for (Class<?> cls3 : parameterTypes) {
                        if (Context.class.isAssignableFrom(cls3) || cls3.isAssignableFrom(cls2)) {
                            z = true;
                        }
                    }
                }
                if (z) {
                    constructor.setAccessible(true);
                    c0203ec4 = new C0203ec(constructor, 4);
                }
            }
        }
        if (c0203ec != null) {
            return c0203ec;
        }
        if (c0203ec2 != null) {
            return c0203ec2;
        }
        if (c0203ec3 != null) {
            return c0203ec3;
        }
        if (c0203ec4 != null) {
            return c0203ec4;
        }
        throw new NoSuchMethodException("menu item constructor");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: D */
    public static Object m364D(Object obj, String str) {
        if (obj == null) {
            return null;
        }
        for (Class<?> superclass = obj.getClass(); superclass != null && superclass != Object.class; superclass = superclass.getSuperclass()) {
            try {
                Field declaredField = superclass.getDeclaredField(str);
                declaredField.setAccessible(true);
                return declaredField.get(obj);
            } catch (NoSuchFieldException unused) {
            } catch (Throwable unused2) {
                return null;
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: E */
    public static boolean m365E(View view) {
        int i = 0;
        for (Object parent = view; i < 8 && (parent instanceof View); parent = ((View) parent).getParent()) {
            if (m383W((View) parent)) {
                return true;
            }
            try {
                i++;
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: F */
    public static boolean m366F(Object obj, Field field, int i, Set set) {
        Field[] declaredFields;
        if (obj != null && set != null && i <= 2 && set.add(obj)) {
            if (!field.getDeclaringClass().isInstance(obj)) {
                for (Class<?> superclass = obj.getClass(); superclass != null && superclass != Object.class; superclass = superclass.getSuperclass()) {
                    try {
                        declaredFields = superclass.getDeclaredFields();
                    } catch (Throwable unused) {
                        declaredFields = null;
                    }
                    if (declaredFields != null) {
                        for (Field field2 : declaredFields) {
                            if (!Modifier.isStatic(field2.getModifiers())) {
                                try {
                                    field2.setAccessible(true);
                                    if (field2.getType() != String.class && (field2.getType().isPrimitive() || field2.getType().getName().startsWith("java.") || !m366F(field2.get(obj), field, i + 1, set))) {
                                    }
                                } catch (Throwable unused2) {
                                    continue;
                                }
                            }
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: G */
    public static void m367G(View view) {
        Method[] declaredMethods;
        if (view == null) {
            return;
        }
        loop0: for (Class<?> superclass = view.getClass(); superclass != null && superclass != Object.class; superclass = superclass.getSuperclass()) {
            try {
                declaredMethods = superclass.getDeclaredMethods();
            } catch (Throwable unused) {
                declaredMethods = null;
            }
            if (declaredMethods != null) {
                for (Method method : declaredMethods) {
                    String name = method.getName();
                    if (("dismiss".equals(name) || "hide".equals(name) || "close".equals(name) || "cancel".equals(name)) && method.getParameterTypes().length == 0 && !Modifier.isStatic(method.getModifiers())) {
                        try {
                            method.setAccessible(true);
                            method.invoke(view, null);
                            break loop0;
                        } catch (Throwable unused2) {
                            continue;
                        }
                    }
                }
            }
        }
        try {
            view.setVisibility(8);
        } catch (Throwable unused3) {
        }
        try {
            view.setAlpha(0.0f);
        } catch (Throwable unused4) {
        }
        try {
            view.setEnabled(false);
        } catch (Throwable unused5) {
        }
        try {
            Object parent = view.getParent();
            if (parent instanceof View) {
                ((View) parent).invalidate();
            }
        } catch (Throwable unused6) {
        }
        try {
            ViewParent parent2 = view.getParent();
            if ((parent2 instanceof ViewGroup) && m376P(view)) {
                ((ViewGroup) parent2).removeView(view);
            }
        } catch (Throwable unused7) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: H */
    public static boolean m368H(Class cls, String str, Method method, C0203ec c0203ec, Class cls2, Field field, ClassLoader classLoader) {
        if (cls != null && str != null) {
            String lowerCase = cls.getName().toLowerCase();
            if (!lowerCase.contains("graytips") && !lowerCase.contains("graptips.revoke")) {
                Set set = f264f;
                synchronized (set) {
                    try {
                        if (set.contains(cls)) {
                            return false;
                        }
                        set.add(cls);
                        try {
                            Method method2 = cls.getMethod(str, null);
                            if (!Modifier.isAbstract(method2.getModifiers()) && List.class.isAssignableFrom(method2.getReturnType()) && method2.getParameterTypes().length == 0) {
                                method2.setAccessible(true);
                                XposedBridge.hookMethod(method2, new C0013ac(method, cls, c0203ec, cls2, field, classLoader));
                                HookEntry.log("repeater long press menu component hooked class=" + cls.getName() + " method=" + str);
                                return true;
                            }
                            synchronized (set) {
                                set.remove(cls);
                            }
                            return false;
                        } catch (Throwable th) {
                            Set set2 = f264f;
                            synchronized (set2) {
                                set2.remove(cls);
                                HookEntry.log("repeater long press menu component skipped class=" + cls.getName() + " reason=" + th.getClass().getSimpleName() + ": " + th.getMessage());
                                return false;
                            }
                        }
                    } finally {
                    }
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: I */
    public static int m369I(ClassLoader classLoader, Class cls, Class cls2) {
        Set set = f265g;
        synchronized (set) {
            try {
                if (set.contains(cls)) {
                    return 0;
                }
                set.add(cls);
                int i = 0;
                for (Method method : cls.getDeclaredMethods()) {
                    if (!Modifier.isAbstract(method.getModifiers())) {
                        try {
                            Class<?>[] parameterTypes = method.getParameterTypes();
                            if (method.getReturnType().isArray() && !method.getReturnType().getComponentType().isPrimitive() && parameterTypes.length == 1 && View.class.isAssignableFrom(parameterTypes[0])) {
                                method.setAccessible(true);
                                XposedBridge.hookMethod(method, new C0029bc(method));
                            } else {
                                Class<?>[] parameterTypes2 = method.getParameterTypes();
                                if (parameterTypes2.length >= 3 && parameterTypes2[0] == Integer.TYPE && Context.class.isAssignableFrom(parameterTypes2[1]) && parameterTypes2[2].isAssignableFrom(cls2)) {
                                    method.setAccessible(true);
                                    XposedBridge.hookMethod(method, new C0166t(classLoader, method));
                                }
                            }
                            i++;
                        } catch (Throwable th) {
                            StringBuilder sb = new StringBuilder("repeater legacy long press menu method skipped class=");
                            sb.append(cls.getName());
                            sb.append(" method=");
                            sb.append(method.getName());
                            sb.append(" reason=");
                            AbstractC0000a.m3d(th, sb, ": ");
                        }
                    }
                }
                if (i > 0) {
                    HookEntry.log("repeater legacy long press menu builder hooked class=" + cls.getName() + " count=" + i);
                } else {
                    Set set2 = f265g;
                    synchronized (set2) {
                        set2.remove(cls);
                    }
                }
                return i;
            } finally {
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: J */
    public static boolean m370J(ClassLoader classLoader, Class cls) {
        try {
            Method methodM412y = m412y(cls);
            StringBuilder sb = new StringBuilder();
            sb.append(methodM412y.getDeclaringClass().getName());
            sb.append('#');
            sb.append(methodM412y.getName());
            sb.append('(');
            Class<?>[] parameterTypes = methodM412y.getParameterTypes();
            for (int i = 0; i < parameterTypes.length; i++) {
                if (i > 0) {
                    sb.append(',');
                }
                sb.append(parameterTypes[i].getName());
            }
            sb.append("):");
            sb.append(methodM412y.getReturnType().getName());
            String string = sb.toString();
            Set set = f266h;
            synchronized (set) {
                try {
                    if (set.contains(string)) {
                        return true;
                    }
                    set.add(string);
                    try {
                        methodM412y.setAccessible(true);
                        XposedBridge.hookMethod(methodM412y, new C0167u(classLoader, methodM412y));
                        HookEntry.log("repeater long press menu item click hooked class=" + cls.getName() + " method=" + methodM412y.getDeclaringClass().getName() + "#" + methodM412y.getName());
                        return true;
                    } catch (Throwable th) {
                        Set set2 = f266h;
                        synchronized (set2) {
                            set2.remove(string);
                            HookEntry.log("repeater long press menu item click hook failed class=" + cls.getName() + " reason=" + th.getClass().getSimpleName() + ": " + th.getMessage());
                            return false;
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            HookEntry.log("repeater long press menu item click hook skipped class=" + cls.getName() + " reason=" + th3.getClass().getSimpleName() + ": " + th3.getMessage());
            return false;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: K */
    public static int m371K(ClassLoader classLoader) {
        try {
            Class<?> clsFindClassIfExists = XposedHelpers.findClassIfExists("com.tencent.mobileqq.data.ChatMessage", classLoader);
            if (clsFindClassIfExists == null) {
                return 0;
            }
            int i = 0;
            int iM369I = 0;
            while (true) {
                String[] strArr = f260b;
                if (i >= 6) {
                    break;
                }
                Class<?> clsFindClassIfExists2 = XposedHelpers.findClassIfExists(strArr[i], classLoader);
                if (clsFindClassIfExists2 != null) {
                    iM369I += m369I(classLoader, clsFindClassIfExists2, clsFindClassIfExists);
                    Class<? super Object> superclass = clsFindClassIfExists2.getSuperclass();
                    if (superclass != null && superclass != Object.class && superclass.getName().startsWith("com.tencent.mobileqq.activity.aio.item.")) {
                        iM369I += m369I(classLoader, superclass, clsFindClassIfExists);
                    }
                }
                i++;
            }
            if (iM369I > 0) {
                HookEntry.log("repeater legacy long press menu hook installed count=" + iM369I);
            }
            return iM369I;
        } catch (Throwable th) {
            AbstractC0000a.m3d(th, new StringBuilder("repeater legacy long press menu hook failed reason="), ": ");
            return 0;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: L */
    public static int m372L(ClassLoader classLoader, Class cls) {
        String[] strArr = f259a;
        for (int i = 0; i < 3; i++) {
            try {
                Method methodM413z = m413z(XposedHelpers.findClass(strArr[i], classLoader), cls);
                methodM413z.setAccessible(true);
                XposedBridge.hookMethod(methodM413z, new C0045cc(classLoader));
                HookEntry.log("repeater long press menu icon hook installed layout=" + strArr[i]);
                return 1;
            } catch (Throwable th) {
                HookEntry.log("repeater long press menu icon hook skipped layout=" + strArr[i] + " reason=" + th.getClass().getSimpleName() + ": " + th.getMessage());
            }
        }
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: M */
    public static int m373M(ClassLoader classLoader) {
        try {
            C0209f2 c0209f2M384X = m384X(classLoader);
            Class<?> clsFindClass = XposedHelpers.findClass((String) c0209f2M384X.f247c, classLoader);
            Class<?> clsFindClass2 = XposedHelpers.findClass((String) c0209f2M384X.f248d, classLoader);
            Class<?> clsFindClass3 = XposedHelpers.findClass((String) c0209f2M384X.f245a, classLoader);
            Method[] declaredMethods = clsFindClass.getDeclaredMethods();
            int length = declaredMethods.length;
            int i = 0;
            while (i < length) {
                Method method = declaredMethods[i];
                if (method.getParameterTypes().length == 0 && clsFindClass2.isAssignableFrom(method.getReturnType())) {
                    String strM361A = m361A(clsFindClass);
                    C0203ec c0203ecM363C = m363C(clsFindClass3, clsFindClass2);
                    Field fieldM409v = m409v(clsFindClass3, String.class);
                    if (fieldM409v == null) {
                        throw new NoSuchFieldException("menu label");
                    }
                    AbstractC0463t2.m1015p("target.repeater_menu.base_class", clsFindClass.getName());
                    AbstractC0463t2.m1015p("target.repeater_menu.msg_class", clsFindClass2.getName());
                    AbstractC0463t2.m1015p("target.repeater_menu.item_class", clsFindClass3.getName());
                    m381U(c0209f2M384X, clsFindClass, clsFindClass2, clsFindClass3);
                    method.setAccessible(true);
                    fieldM409v.setAccessible(true);
                    m370J(classLoader, clsFindClass3);
                    String strHostVersionSummary = HookEntry.hostVersionSummary();
                    String[] strArr = (strHostVersionSummary == null || !strHostVersionSummary.startsWith("9.3.")) ? new String[0] : (String[]) AbstractC0260i5.f395p.clone();
                    int length2 = strArr.length;
                    int i2 = 0;
                    int i3 = 0;
                    while (i2 < length2) {
                        ClassLoader classLoader2 = classLoader;
                        if (m368H(XposedHelpers.findClassIfExists(strArr[i2], classLoader), strM361A, method, c0203ecM363C, clsFindClass3, fieldM409v, classLoader2)) {
                            i3++;
                        }
                        i2++;
                        classLoader = classLoader2;
                    }
                    ClassLoader classLoader3 = classLoader;
                    HookEntry.hostVersionSummary();
                    if (XposedBridge.hookAllConstructors(clsFindClass, new C0568zb(strM361A, method, c0203ecM363C, clsFindClass3, fieldM409v, classLoader3)).isEmpty()) {
                        HookEntry.log("repeater long press menu hook failed reason=base constructors missing");
                        return 0;
                    }
                    HookEntry.log("repeater long press menu component discovery preload=" + i3 + " constructor_probe=true");
                    return i3 + 2 + m372L(classLoader3, clsFindClass3);
                }
                i++;
                classLoader = classLoader;
            }
            throw new NoSuchMethodException("AIOMsgItem getter");
        } catch (Throwable th) {
            AbstractC0000a.m3d(th, new StringBuilder("repeater long press menu hook failed reason="), ": ");
            return 0;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0139 A[RETURN] */
    /* JADX INFO: renamed from: N */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object m374N(Object obj, Class cls) {
        Object objNewInstance;
        Constructor<?>[] declaredConstructors;
        ArrayList arrayList;
        C0187dc c0187dc;
        Field[] declaredFields;
        if (!Modifier.isAbstract(cls.getModifiers())) {
            try {
                Constructor declaredConstructor = cls.getDeclaredConstructor(null);
                declaredConstructor.setAccessible(true);
                return declaredConstructor.newInstance(null);
            } catch (NoSuchMethodException unused) {
                for (Constructor<?> constructor : cls.getDeclaredConstructors()) {
                    Class<?>[] parameterTypes = constructor.getParameterTypes();
                    if (parameterTypes.length == 1 && parameterTypes[0].isInstance(obj)) {
                        constructor.setAccessible(true);
                        return constructor.newInstance(obj);
                    }
                }
                try {
                    declaredConstructors = cls.getDeclaredConstructors();
                    arrayList = new ArrayList();
                    for (Class<?> superclass = obj.getClass(); superclass != null && superclass != Object.class && arrayList.size() < 24; superclass = superclass.getSuperclass()) {
                        try {
                            declaredFields = superclass.getDeclaredFields();
                        } catch (Throwable unused2) {
                            declaredFields = null;
                        }
                        if (declaredFields != null) {
                            for (int i = 0; i < declaredFields.length && arrayList.size() < 24; i++) {
                                Field field = declaredFields[i];
                                if (!Modifier.isStatic(field.getModifiers()) && !field.isSynthetic()) {
                                    try {
                                        field.setAccessible(true);
                                        arrayList.add(new C0187dc(field.get(obj), field.getType()));
                                    } catch (Throwable unused3) {
                                    }
                                }
                            }
                        }
                    }
                } catch (Throwable unused4) {
                }
                if (arrayList.isEmpty()) {
                    objNewInstance = null;
                    if (objNewInstance == null) {
                        return objNewInstance;
                    }
                } else {
                    for (Constructor<?> constructor2 : declaredConstructors) {
                        Class<?>[] parameterTypes2 = constructor2.getParameterTypes();
                        if (parameterTypes2.length != 0 && parameterTypes2.length <= arrayList.size()) {
                            Object[] objArr = new Object[parameterTypes2.length];
                            boolean[] zArr = new boolean[arrayList.size()];
                            int i2 = 0;
                            while (true) {
                                if (i2 >= parameterTypes2.length) {
                                    break;
                                }
                                Class clsM388a0 = m388a0(parameterTypes2[i2]);
                                int i3 = 0;
                                while (true) {
                                    if (i3 >= arrayList.size()) {
                                        i3 = -1;
                                        break;
                                    }
                                    if (!zArr[i3] && (c0187dc = (C0187dc) arrayList.get(i3)) != null) {
                                        Object obj2 = c0187dc.f195b;
                                        if (obj2 == null) {
                                            if (!parameterTypes2[i2].isPrimitive()) {
                                                break;
                                            }
                                        } else {
                                            Class<?> clsM388a02 = m388a0(c0187dc.f194a);
                                            Class<?> cls2 = obj2.getClass();
                                            if (clsM388a0.isAssignableFrom(clsM388a02) || clsM388a0.isAssignableFrom(cls2)) {
                                                break;
                                            }
                                        }
                                    }
                                    i3++;
                                }
                                if (i3 < 0) {
                                    objArr = null;
                                    break;
                                }
                                zArr[i3] = true;
                                objArr[i2] = clsM388a0 == String.class ? "复读" : ((C0187dc) arrayList.get(i3)).f195b;
                                i2++;
                            }
                            if (objArr == null) {
                                continue;
                            } else {
                                try {
                                    constructor2.setAccessible(true);
                                    objNewInstance = constructor2.newInstance(objArr);
                                    break;
                                } catch (Throwable unused5) {
                                    continue;
                                }
                            }
                        }
                    }
                    objNewInstance = null;
                    if (objNewInstance == null) {
                    }
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: O */
    public static boolean m375O(Object obj, String str) {
        Method[] declaredMethods;
        if (obj != null) {
            for (Class<?> superclass = obj.getClass(); superclass != null && superclass != Object.class; superclass = superclass.getSuperclass()) {
                try {
                    declaredMethods = superclass.getDeclaredMethods();
                } catch (Throwable unused) {
                    declaredMethods = null;
                }
                if (declaredMethods != null) {
                    for (Method method : declaredMethods) {
                        if (str.equals(method.getName()) && method.getParameterTypes().length == 0 && !Modifier.isStatic(method.getModifiers())) {
                            try {
                                method.setAccessible(true);
                                method.invoke(obj, null);
                                return true;
                            } catch (Throwable unused2) {
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
    /* JADX INFO: renamed from: P */
    public static boolean m376P(View view) {
        String lowerCase;
        if (view == null) {
            return false;
        }
        try {
            lowerCase = view.getClass().getName().toLowerCase(Locale.US);
        } catch (Throwable unused) {
            lowerCase = "";
        }
        return lowerCase.contains("qqcustommenu") || lowerCase.contains("menuexpandable") || lowerCase.contains("menulayout") || lowerCase.contains("popup") || lowerCase.contains("aio.menu.ui") || lowerCase.contains("operationmenu");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Q */
    public static boolean m377Q(Object obj) {
        boolean zContainsKey;
        if (obj == null) {
            return false;
        }
        Map map = f261c;
        synchronized (map) {
            zContainsKey = map.containsKey(obj);
        }
        return zContainsKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: R */
    public static boolean m378R(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof View) {
            return true;
        }
        if (!(obj instanceof CharSequence) && !(obj instanceof Number) && !(obj instanceof Boolean) && !(obj instanceof Context)) {
            Class<?> cls = obj.getClass();
            if (!cls.isArray() && !Iterable.class.isAssignableFrom(cls) && !Map.class.isAssignableFrom(cls)) {
                String lowerCase = cls.getName().toLowerCase(Locale.US);
                if (!lowerCase.startsWith("java.") && !lowerCase.startsWith("android.") && !lowerCase.startsWith("kotlin.")) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: S */
    public static boolean m379S(View view) {
        String lowerCase;
        try {
            lowerCase = view.getClass().getName().toLowerCase(Locale.US);
        } catch (Throwable unused) {
            lowerCase = "";
        }
        return lowerCase.contains("edittext") || lowerCase.contains("input");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: T */
    public static void m380T(Object obj, Field field) throws IllegalAccessException {
        Field[] declaredFields;
        if (obj != null) {
            field.setAccessible(true);
            if (field.getDeclaringClass().isInstance(obj)) {
                field.set(obj, "复读");
            }
            int i = 0;
            for (Class<?> superclass = obj.getClass(); superclass != null && superclass != Object.class && i < 3; superclass = superclass.getSuperclass()) {
                try {
                    declaredFields = superclass.getDeclaredFields();
                } catch (Throwable unused) {
                    declaredFields = null;
                }
                if (declaredFields != null) {
                    for (int i2 = 0; i2 < declaredFields.length && i < 3; i2++) {
                        Field field2 = declaredFields[i2];
                        if (!Modifier.isStatic(field2.getModifiers()) && field2.getType() == String.class) {
                            try {
                                field2.setAccessible(true);
                                Object obj2 = field2.get(obj);
                                String str = obj2 instanceof String ? (String) obj2 : null;
                                if (field2.equals(field) || str == null || str.length() == 0 || str.length() <= 12) {
                                    field2.set(obj, "复读");
                                    i++;
                                }
                            } catch (Throwable unused2) {
                            }
                        }
                    }
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: U */
    public static void m381U(C0209f2 c0209f2, Class cls, Class cls2, Class cls3) {
        if (f276r) {
            return;
        }
        f276r = true;
        HookEntry.log("repeater long press menu nt target source=" + ((String) c0209f2.f246b) + " base=" + cls.getName() + " msg=" + cls2.getName() + " item=" + cls3.getName());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: V */
    public static void m382V(int i) {
        if (i <= 0) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - f272n < 700) {
            return;
        }
        f272n = jCurrentTimeMillis;
        HookEntry.log("repeater long press selection cleared views=" + i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: W */
    public static boolean m383W(View view) {
        String lowerCase;
        try {
            lowerCase = view.getClass().getName().toLowerCase(Locale.US);
        } catch (Throwable unused) {
            lowerCase = "";
        }
        return lowerCase.contains("aio") || lowerCase.contains("msg") || lowerCase.contains("bubble") || lowerCase.contains("chat");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: X */
    public static C0209f2 m384X(ClassLoader classLoader) {
        String strTrim = AbstractC0463t2.m1004e("target.repeater_menu.base_class").trim();
        String strTrim2 = AbstractC0463t2.m1004e("target.repeater_menu.msg_class").trim();
        String strTrim3 = AbstractC0463t2.m1004e("target.repeater_menu.item_class").trim();
        if (strTrim.length() > 0 || strTrim2.length() > 0 || strTrim3.length() > 0) {
            if (strTrim.length() > 0 && XposedHelpers.findClassIfExists(strTrim, classLoader) != null && strTrim2 != null && strTrim2.length() > 0 && XposedHelpers.findClassIfExists(strTrim2, classLoader) != null && strTrim3 != null && strTrim3.length() > 0 && XposedHelpers.findClassIfExists(strTrim3, classLoader) != null) {
                return new C0209f2(strTrim, strTrim2, strTrim3, "dexkit-cache");
            }
            HookEntry.log("repeater long press menu dexkit cache invalid base=" + m385Y(strTrim) + " msg=" + m385Y(strTrim2) + " item=" + m385Y(strTrim3));
        }
        return new C0209f2("com.tencent.mobileqq.aio.msglist.holder.component.BaseContentComponent", "com.tencent.mobileqq.aio.msg.AIOMsgItem", "com.tencent.qqnt.aio.menu.c", "static");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Y */
    public static String m385Y(String str) {
        return str == null ? "" : str.length() > 120 ? str.substring(0, 120) : str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Z */
    public static void m386Z(Class cls, Object obj, Class cls2, String str, Object obj2) throws IllegalAccessException, NoSuchFieldException {
        Field fieldM362B = m362B(cls, cls2, str);
        if (fieldM362B == null) {
            fieldM362B = m362B(cls, cls2, "a");
        }
        if (fieldM362B == null) {
            fieldM362B = m409v(cls, cls2);
        }
        if (fieldM362B == null) {
            throw new NoSuchFieldException(str);
        }
        fieldM362B.setAccessible(true);
        fieldM362B.set(obj, obj2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static void m387a() {
        ViewOnAttachStateChangeListenerC0267ic viewOnAttachStateChangeListenerC0267ic;
        View viewM397j = m397j(HookEntry.topActivity());
        if (viewM397j != null) {
            WeakHashMap weakHashMap = AbstractC0302kc.f504a;
            synchronized (weakHashMap) {
                try {
                    Map map = (Map) weakHashMap.get(viewM397j);
                    viewOnAttachStateChangeListenerC0267ic = map != null ? (ViewOnAttachStateChangeListenerC0267ic) map.remove("menu-cleanup") : null;
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (viewOnAttachStateChangeListenerC0267ic != null) {
                viewOnAttachStateChangeListenerC0267ic.m680a(false);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a0 */
    public static Class m388a0(Class cls) {
        return (cls == null || !cls.isPrimitive()) ? cls : cls == Integer.TYPE ? Integer.class : cls == Long.TYPE ? Long.class : cls == Boolean.TYPE ? Boolean.class : cls == Float.TYPE ? Float.class : cls == Double.TYPE ? Double.class : cls == Short.TYPE ? Short.class : cls == Byte.TYPE ? Byte.class : cls == Character.TYPE ? Character.class : cls == Void.TYPE ? Void.class : cls;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static void m389b(View view, Object obj) {
        m408u(view);
        m382V(m398k(view, obj));
        View viewM397j = m397j(HookEntry.topActivity());
        View view2 = viewM397j == null ? view : viewM397j;
        if (view2 == null) {
            return;
        }
        AbstractC0302kc.m744b(view2, "menu-cleanup", new long[]{80, 220, 520, 900, 1400}, new C0527x2(viewM397j), new C0540y(view, obj, false));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static Object m390c(Class cls) throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, InstantiationException, InvocationTargetException {
        Class cls2 = Integer.TYPE;
        try {
            try {
                Constructor declaredConstructor = cls.getDeclaredConstructor(cls2, String.class, cls2);
                declaredConstructor.setAccessible(true);
                return declaredConstructor.newInstance(14787861, "复读", 0);
            } catch (NoSuchMethodException unused) {
                Constructor declaredConstructor2 = cls.getDeclaredConstructor(null);
                declaredConstructor2.setAccessible(true);
                Object objNewInstance = declaredConstructor2.newInstance(null);
                m386Z(cls, objNewInstance, cls2, "id", 14787861);
                m386Z(cls, objNewInstance, String.class, "title", "复读");
                return objNewInstance;
            }
        } catch (NoSuchMethodException unused2) {
            Constructor declaredConstructor3 = cls.getDeclaredConstructor(cls2, String.class);
            declaredConstructor3.setAccessible(true);
            return declaredConstructor3.newInstance(14787861, "复读");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX INFO: renamed from: d */
    public static Object m391d(C0203ec c0203ec, Class cls, Context context, Object obj, List list, Field field) throws Exception {
        try {
            Object objM344a = c0203ec.m344a(context, obj);
            m380T(objM344a, field);
            return objM344a;
        } catch (Throwable th) {
            try {
                Object objM405r = m405r(cls, list, field);
                if (objM405r == null) {
                    throw new Exception("factory=" + m406s(th) + ", fallback=no template");
                }
                m380T(objM405r, field);
                if (!f269k) {
                    f269k = true;
                    HookEntry.log("repeater long press menu fallback copied item class=" + objM405r.getClass().getName() + " primary=" + m406s(th));
                }
                return objM405r;
            } catch (Throwable th2) {
                throw new Exception("factory=" + m406s(th) + ", fallback=" + m406s(th2), th2);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static Object m392e(Class cls) {
        if (cls == null || cls == Void.TYPE) {
            return null;
        }
        if (cls == Boolean.TYPE) {
            return Boolean.TRUE;
        }
        if (cls == Integer.TYPE) {
            return 0;
        }
        if (cls == Short.TYPE) {
            return (short) 0;
        }
        if (cls == Byte.TYPE) {
            return (byte) 0;
        }
        if (cls == Character.TYPE) {
            return (char) 0;
        }
        if (cls == Long.TYPE) {
            return 0L;
        }
        if (cls == Float.TYPE) {
            return Float.valueOf(0.0f);
        }
        if (cls == Double.TYPE) {
            return Double.valueOf(0.0d);
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static boolean m393f() {
        return HookEntry.runtimeBool(Prefs.KEY_MESSAGE_REPEATER_LONG_PRESS_MENU) || HookEntry.runtimeBool(Prefs.KEY_MESSAGE_REPEATER);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static boolean m394g(Object obj) {
        Field[] declaredFields;
        if (m377Q(obj)) {
            return true;
        }
        if (obj != null) {
            int i = 0;
            for (Class<?> superclass = obj.getClass(); superclass != null && superclass != Object.class && i < 8; superclass = superclass.getSuperclass()) {
                try {
                    declaredFields = superclass.getDeclaredFields();
                } catch (Throwable unused) {
                    declaredFields = null;
                }
                if (declaredFields != null) {
                    for (int i2 = 0; i2 < declaredFields.length && i < 8; i2++) {
                        Field field = declaredFields[i2];
                        if (!Modifier.isStatic(field.getModifiers()) && field.getType() == String.class) {
                            i++;
                            try {
                                field.setAccessible(true);
                                if ("复读".equals(field.get(obj))) {
                                    return true;
                                }
                            } catch (Throwable unused2) {
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
    /* JADX INFO: renamed from: h */
    public static void m395h(Class cls, int i) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - f274p < 700) {
            return;
        }
        f274p = jCurrentTimeMillis;
        StringBuilder sb = new StringBuilder("repeater long press menu rebuild suppressed component=");
        sb.append(cls == null ? "null" : cls.getName());
        sb.append(" items=");
        sb.append(i);
        HookEntry.log(sb.toString());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public static void m396i(Class cls, List list) {
        String name;
        if (f270l || list.isEmpty()) {
            return;
        }
        f270l = true;
        StringBuilder sb = new StringBuilder();
        int iMin = Math.min(list.size(), 5);
        int i = 0;
        while (true) {
            name = "null";
            if (i >= iMin) {
                break;
            }
            Object obj = list.get(i);
            if (i > 0) {
                sb.append(", ");
            }
            if (obj != null) {
                name = obj.getClass().getName();
            }
            sb.append(name);
            i++;
        }
        StringBuilder sb2 = new StringBuilder("repeater long press menu source templates component=");
        sb2.append(cls != null ? cls.getName() : "null");
        sb2.append(" items=[");
        sb2.append((Object) sb);
        sb2.append("]");
        HookEntry.log(sb2.toString());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public static View m397j(Activity activity) {
        if (activity == null) {
            return null;
        }
        try {
            View viewFindViewById = activity.findViewById(R.id.content);
            if (viewFindViewById != null) {
                return viewFindViewById;
            }
        } catch (Throwable unused) {
        }
        try {
            if (activity.getWindow() == null) {
                return null;
            }
            return activity.getWindow().getDecorView();
        } catch (Throwable unused2) {
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public static int m398k(View view, Object obj) {
        int iM402o;
        try {
            iM402o = m401n(obj, 0, Collections.newSetFromMap(new IdentityHashMap()));
        } catch (Throwable unused) {
            iM402o = 0;
        }
        try {
            View viewM397j = m397j(HookEntry.topActivity());
            iM402o = iM402o + m402o(viewM397j, 0, new int[]{0}) + m400m(viewM397j, 0, new int[]{0});
            iM402o += m399l(viewM397j, 0, new int[]{0});
        } catch (Throwable unused2) {
        }
        try {
            iM402o = iM402o + m402o(view, 0, new int[]{0}) + m400m(view, 0, new int[]{0});
            return iM402o + m399l(view, 0, new int[]{0});
        } catch (Throwable unused3) {
            return iM402o;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0091  */
    /* JADX INFO: renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int m399l(View view, int i, int[] iArr) {
        int iM399l;
        int iMin;
        boolean z;
        boolean zIsSelected;
        boolean zIsActivated;
        boolean zIsFocused;
        String lowerCase;
        if (view != null && i <= 10) {
            int i2 = iArr[0];
            iArr[0] = i2 + 1;
            if (i2 <= 360) {
                if (m379S(view) || m376P(view)) {
                    iM399l = 0;
                } else {
                    if (view.isPressed()) {
                        view.setPressed(false);
                        z = true;
                    } else {
                        z = false;
                    }
                    try {
                        view.cancelLongPress();
                        view.cancelPendingInputEvents();
                    } catch (Throwable unused) {
                    }
                    try {
                        zIsSelected = view.isSelected();
                    } catch (Throwable unused2) {
                        zIsSelected = false;
                    }
                    try {
                        zIsActivated = view.isActivated();
                    } catch (Throwable unused3) {
                        zIsActivated = false;
                    }
                    try {
                        zIsFocused = view.isFocused();
                    } catch (Throwable unused4) {
                        zIsFocused = false;
                    }
                    if (zIsSelected || zIsActivated || zIsFocused) {
                        try {
                            lowerCase = view.getClass().getName().toLowerCase(Locale.US);
                        } catch (Throwable unused5) {
                            lowerCase = "";
                        }
                        if (lowerCase.contains("aio") || lowerCase.contains("msg") || lowerCase.contains("bubble") || lowerCase.contains("chat") || m365E(view)) {
                            try {
                                view.setSelected(false);
                            } catch (Throwable unused6) {
                            }
                            try {
                                view.setActivated(false);
                            } catch (Throwable unused7) {
                            }
                            if (zIsFocused) {
                                try {
                                    view.clearFocus();
                                } catch (Throwable unused8) {
                                }
                            }
                            z = true;
                        }
                    }
                    if (z) {
                        try {
                            view.jumpDrawablesToCurrentState();
                        } catch (Throwable unused9) {
                        }
                        try {
                            view.invalidate();
                        } catch (Throwable unused10) {
                        }
                        iM399l = 1;
                    }
                }
                if (!(view instanceof ViewGroup)) {
                    return iM399l;
                }
                ViewGroup viewGroup = (ViewGroup) view;
                try {
                    iMin = Math.min(viewGroup.getChildCount(), 80);
                } catch (Throwable unused11) {
                    iMin = 0;
                }
                for (int i3 = 0; i3 < iMin; i3++) {
                    iM399l += m399l(viewGroup.getChildAt(i3), i + 1, iArr);
                }
                return iM399l;
            }
        }
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0046  */
    /* JADX INFO: renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int m400m(View view, int i, int[] iArr) {
        boolean zIsSelected;
        boolean zIsPressed;
        boolean zIsActivated;
        boolean z;
        int iM400m;
        int iMin;
        if (view != null && i <= 10) {
            int i2 = iArr[0];
            iArr[0] = i2 + 1;
            if (i2 <= 260) {
                boolean z2 = m383W(view) || m365E(view);
                try {
                    zIsSelected = view.isSelected();
                } catch (Throwable unused) {
                    zIsSelected = false;
                }
                try {
                    zIsPressed = view.isPressed();
                } catch (Throwable unused2) {
                    zIsPressed = false;
                }
                try {
                    zIsActivated = view.isActivated();
                } catch (Throwable unused3) {
                    zIsActivated = false;
                }
                if (!view.isFocused() || !z2) {
                    z = false;
                } else if (!m379S(view)) {
                    z = true;
                }
                boolean z3 = zIsSelected && z2;
                boolean z4 = zIsActivated && z2;
                if (z3 || zIsPressed || z4 || z) {
                    try {
                        view.setPressed(false);
                    } catch (Throwable unused4) {
                    }
                    try {
                        view.setSelected(false);
                    } catch (Throwable unused5) {
                    }
                    try {
                        view.setActivated(false);
                    } catch (Throwable unused6) {
                    }
                    try {
                        view.cancelLongPress();
                    } catch (Throwable unused7) {
                    }
                    try {
                        view.cancelPendingInputEvents();
                    } catch (Throwable unused8) {
                    }
                    if (z) {
                        try {
                            view.clearFocus();
                        } catch (Throwable unused9) {
                        }
                    }
                    try {
                        view.jumpDrawablesToCurrentState();
                    } catch (Throwable unused10) {
                    }
                    try {
                        view.invalidate();
                    } catch (Throwable unused11) {
                    }
                    iM400m = 1;
                } else {
                    iM400m = 0;
                }
                if (!(view instanceof ViewGroup)) {
                    return iM400m;
                }
                ViewGroup viewGroup = (ViewGroup) view;
                try {
                    iMin = Math.min(viewGroup.getChildCount(), 80);
                } catch (Throwable unused12) {
                    iMin = 0;
                }
                for (int i3 = 0; i3 < iMin; i3++) {
                    iM400m += m400m(viewGroup.getChildAt(i3), i + 1, iArr);
                }
                return iM400m;
            }
        }
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public static int m401n(Object obj, int i, Set set) {
        Field[] declaredFields;
        if (obj != null && i <= 3 && set.add(obj)) {
            if (obj instanceof View) {
                return m400m((View) obj, 0, new int[]{0});
            }
            if (!(obj instanceof CharSequence) && !(obj instanceof Number) && !(obj instanceof Boolean) && !(obj instanceof Context)) {
                Class<?> superclass = obj.getClass();
                String lowerCase = superclass.getName().toLowerCase(Locale.US);
                if (!lowerCase.startsWith("java.") && !lowerCase.startsWith("android.") && !lowerCase.startsWith("kotlin.")) {
                    int i2 = 0;
                    int iM401n = 0;
                    while (superclass != null && superclass != Object.class && i2 < 48) {
                        try {
                            declaredFields = superclass.getDeclaredFields();
                        } catch (Throwable unused) {
                            declaredFields = null;
                        }
                        if (declaredFields != null) {
                            for (int i3 = 0; i3 < declaredFields.length && i2 < 48; i3++) {
                                Field field = declaredFields[i3];
                                try {
                                    if (!Modifier.isStatic(field.getModifiers()) && !field.getType().isPrimitive()) {
                                        field.setAccessible(true);
                                        Object obj2 = field.get(obj);
                                        if (m378R(obj2)) {
                                            i2++;
                                            iM401n += m401n(obj2, 1 + i, set);
                                        }
                                    }
                                } catch (Throwable unused2) {
                                }
                            }
                        }
                        superclass = superclass.getSuperclass();
                    }
                    return iM401n;
                }
            }
        }
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:49:0x0092 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:50:0x0073 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:52:0x0080 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:79:? */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v14, types: [int] */
    /* JADX WARN: Type inference failed for: r4v15, types: [int] */
    /* JADX WARN: Type inference failed for: r4v16, types: [int] */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX INFO: renamed from: o */
    public static int m402o(View view, int i, int[] iArr) {
        ?? M402o;
        int iMin;
        if (view != null && i <= 10) {
            int i2 = iArr[0];
            iArr[0] = i2 + 1;
            if (i2 <= 260) {
                if ((view instanceof TextView) && (m383W(view) || m365E(view))) {
                    TextView textView = (TextView) view;
                    boolean zM375O = m375O(textView, "stopTextActionMode");
                    Object objM364D = m364D(textView, "mEditor");
                    M402o = zM375O;
                    if (objM364D != null) {
                        M402o = (m375O(m364D(objM364D, "mTextActionMode"), "finish") ? 1 : 0) | (m375O(objM364D, "stopTextActionMode") ? 1 : 0) | (zM375O ? 1 : 0) | (m375O(objM364D, "hideInsertionPointCursorController") ? 1 : 0) | (m375O(objM364D, "hideSelectionModifierCursorController") ? 1 : 0);
                    }
                    try {
                        CharSequence text = textView.getText();
                        if (text instanceof Spannable) {
                            Spannable spannable = (Spannable) text;
                            int selectionStart = Selection.getSelectionStart(spannable);
                            int selectionEnd = Selection.getSelectionEnd(spannable);
                            if (selectionStart >= 0 || selectionEnd >= 0) {
                                Selection.removeSelection(spannable);
                                M402o = 1;
                            }
                        }
                    } catch (Throwable unused) {
                    }
                    try {
                        textView.clearComposingText();
                    } catch (Throwable unused2) {
                    }
                    try {
                        if (textView.hasFocus()) {
                            textView.clearFocus();
                            M402o = 1;
                        }
                    } catch (Throwable unused3) {
                    }
                    try {
                        textView.setPressed(false);
                    } catch (Throwable unused4) {
                    }
                    try {
                        textView.setSelected(false);
                    } catch (Throwable unused5) {
                    }
                    try {
                        textView.setActivated(false);
                    } catch (Throwable unused6) {
                    }
                    try {
                        textView.cancelLongPress();
                    } catch (Throwable unused7) {
                    }
                    try {
                        textView.cancelPendingInputEvents();
                    } catch (Throwable unused8) {
                    }
                    try {
                        textView.invalidate();
                    } catch (Throwable unused9) {
                    }
                } else {
                    M402o = 0;
                }
                if (!(view instanceof ViewGroup)) {
                    return M402o;
                }
                ViewGroup viewGroup = (ViewGroup) view;
                try {
                    iMin = Math.min(viewGroup.getChildCount(), 80);
                } catch (Throwable unused10) {
                    iMin = 0;
                }
                for (int i3 = 0; i3 < iMin; i3++) {
                    M402o += m402o(viewGroup.getChildAt(i3), i + 1, iArr);
                }
                return M402o;
            }
        }
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public static void m403p(View view, ArrayList arrayList, int i, int[] iArr) {
        int iMin;
        if (view == null || i > 12) {
            return;
        }
        int i2 = iArr[0];
        iArr[0] = i2 + 1;
        if (i2 > 360) {
            return;
        }
        if (m376P(view) && !arrayList.contains(view)) {
            arrayList.add(view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            try {
                iMin = Math.min(viewGroup.getChildCount(), 80);
            } catch (Throwable unused) {
                iMin = 0;
            }
            for (int i3 = 0; i3 < iMin; i3++) {
                m403p(viewGroup.getChildAt(i3), arrayList, i + 1, iArr);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public static void m404q(Object obj, Object obj2) {
        Field[] declaredFields;
        for (Class<?> superclass = obj.getClass(); superclass != null && superclass != Object.class; superclass = superclass.getSuperclass()) {
            try {
                declaredFields = superclass.getDeclaredFields();
            } catch (Throwable unused) {
                declaredFields = null;
            }
            if (declaredFields != null) {
                for (Field field : declaredFields) {
                    int modifiers = field.getModifiers();
                    if (!Modifier.isStatic(modifiers) && !Modifier.isFinal(modifiers)) {
                        try {
                            field.setAccessible(true);
                            field.set(obj2, field.get(obj));
                        } catch (Throwable unused2) {
                        }
                    }
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r */
    public static Object m405r(Class cls, List list, Field field) {
        Object objM374N;
        if (!list.isEmpty()) {
            Object obj = null;
            for (Object obj2 : list) {
                if (obj2 != null && !m377Q(obj2)) {
                    Class<?> cls2 = obj2.getClass();
                    boolean z = cls.isAssignableFrom(cls2) || field.getDeclaringClass().isAssignableFrom(cls2);
                    boolean z2 = !z && m366F(obj2, field, 0, Collections.newSetFromMap(new IdentityHashMap()));
                    if (z || z2 || obj == null) {
                        Object objM374N2 = m374N(obj2, cls2);
                        if (objM374N2 == null && obj == null) {
                            obj = obj2;
                        } else if (objM374N2 == null) {
                            continue;
                        } else {
                            m404q(obj2, objM374N2);
                            if (z || z2) {
                                return objM374N2;
                            }
                            if (obj == null) {
                                obj = objM374N2;
                            }
                        }
                    }
                }
            }
            if (obj != null && (objM374N = m374N(obj, obj.getClass())) != null) {
                m404q(obj, objM374N);
                return objM374N;
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s */
    public static String m406s(Throwable th) {
        Throwable targetException;
        Throwable th2 = th;
        int i = 0;
        while (th2 instanceof InvocationTargetException) {
            int i2 = i + 1;
            if (i >= 4 || (targetException = ((InvocationTargetException) th2).getTargetException()) == null) {
                break;
            }
            th2 = targetException;
            i = i2;
        }
        String message = th2.getMessage();
        if (message == null || message.length() == 0) {
            message = th.getMessage();
        }
        if (message == null) {
            message = "";
        }
        if (message.length() > 240) {
            message = message.substring(0, 240);
        }
        return th2.getClass().getSimpleName() + ": " + message;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: t */
    public static void m407t() {
        View viewM397j = m397j(HookEntry.topActivity());
        if (viewM397j == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        m403p(viewM397j, arrayList, 0, new int[]{0});
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            m367G((View) arrayList.get(size));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: u */
    public static void m408u(View view) {
        ArrayList arrayList = new ArrayList();
        Object parent = view;
        for (int i = 0; i < 14 && (parent instanceof View); i++) {
            View view2 = (View) parent;
            if (m376P(view2) && !arrayList.contains(view2)) {
                arrayList.add(view2);
            }
            try {
                parent = view2.getParent();
            } catch (Throwable unused) {
            }
        }
        if (arrayList.isEmpty() && view != null) {
            try {
                Object parent2 = view.getParent();
                if (parent2 instanceof View) {
                    arrayList.add((View) parent2);
                }
            } catch (Throwable unused2) {
            }
            if (arrayList.isEmpty()) {
                arrayList.add(view);
            }
        }
        if (arrayList.isEmpty()) {
            m407t();
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            m367G((View) arrayList.get(size));
        }
        HookEntry.log("repeater long press menu dismissed targets=" + arrayList.size());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: v */
    public static Field m409v(Class cls, Class cls2) {
        while (cls != null && cls != Object.class) {
            for (Field field : cls.getDeclaredFields()) {
                if (!Modifier.isStatic(field.getModifiers()) && field.getType() == cls2) {
                    return field;
                }
            }
            cls = cls.getSuperclass();
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: w */
    public static ImageView m410w(View view) {
        if (view instanceof ImageView) {
            return (ImageView) view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            ImageView imageViewM410w = m410w(viewGroup.getChildAt(i));
            if (imageViewM410w != null) {
                return imageViewM410w;
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: x */
    public static TextView m411x(View view) {
        int iMin;
        if (view instanceof TextView) {
            return (TextView) view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        try {
            iMin = Math.min(viewGroup.getChildCount(), 16);
        } catch (Throwable unused) {
            iMin = 0;
        }
        for (int i = 0; i < iMin; i++) {
            TextView textViewM411x = m411x(viewGroup.getChildAt(i));
            if (textViewM411x != null) {
                return textViewM411x;
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: y */
    public static Method m412y(Class cls) throws NoSuchMethodException {
        while (cls != null && cls != Object.class) {
            for (Method method : cls.getDeclaredMethods()) {
                if (!Modifier.isAbstract(method.getModifiers()) && method.getReturnType() == Void.TYPE && method.getParameterTypes().length == 0) {
                    return method;
                }
            }
            cls = cls.getSuperclass();
        }
        throw new NoSuchMethodException("menu click");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: z */
    public static Method m413z(Class cls, Class cls2) throws NoSuchMethodException {
        Class<?> cls3;
        for (Method method : cls.getDeclaredMethods()) {
            Class<?>[] parameterTypes = method.getParameterTypes();
            if (View.class.isAssignableFrom(method.getReturnType()) && parameterTypes.length == 4 && parameterTypes[0] == Integer.TYPE && !parameterTypes[1].isPrimitive() && ((parameterTypes[1].isAssignableFrom(cls2) || Object.class == (cls3 = parameterTypes[1]) || cls3.getName().toLowerCase().contains("menu")) && parameterTypes[2] == Boolean.TYPE && parameterTypes[3] == float[].class)) {
                return method;
            }
        }
        throw new NoSuchMethodException("menu item view builder");
    }
}
