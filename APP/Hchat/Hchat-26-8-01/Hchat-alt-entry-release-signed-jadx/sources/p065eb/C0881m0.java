package p065eb;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.view.View;
import android.widget.TextView;
import ca.C0532s;
import gg.AbstractC1416l;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import okhttp3.HttpUrl;
import p003a2.C0014a;
import p024b9.C0219e;
import p025bc.AbstractC0255e;
import p068eh.AbstractC0921a;
import p080fb.AbstractC1184v0;
import p099h.Hchat.dexkit.DexFinder;
import p099h.Hchat.utils.KavaReflector;
import p218og.AbstractC3149m;
import p258r8.C3742g;
import p258r8.C3744i;
import p276sf.C3959f;
import p276sf.C3960g;
import p276sf.C3967n;
import p332wb.AbstractC4855en;
import tf.AbstractC4171r;

/* JADX INFO: renamed from: eb.m0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0881m0 {

    /* JADX INFO: renamed from: b */
    public static volatile boolean f2708b;

    /* JADX INFO: renamed from: a */
    public static final C0881m0 f2707a = new C0881m0();

    /* JADX INFO: renamed from: c */
    public static final LinkedHashMap f2709c = new LinkedHashMap();

    /* JADX INFO: renamed from: d */
    public static final LinkedHashMap f2710d = new LinkedHashMap();

    /* JADX INFO: renamed from: e */
    public static final ConcurrentHashMap f2711e = new ConcurrentHashMap();

    /* JADX INFO: renamed from: f */
    public static final ConcurrentHashMap f2712f = new ConcurrentHashMap();

    /* JADX INFO: renamed from: g */
    public static final CopyOnWriteArrayList f2713g = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: h */
    public static final CopyOnWriteArrayList f2714h = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: i */
    public static final Handler f2715i = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: j */
    public static volatile WeakReference f2716j = new WeakReference(null);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0076  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final C0871h0 m2192a(C0881m0 c0881m0, Object obj, String str) {
        Editable editable;
        Iterator it = f2714h.iterator();
        it.getClass();
        String strM9264h = str;
        String strM1020i = HttpUrl.FRAGMENT_ENCODE_SET;
        String strM1020i2 = strM1020i;
        while (true) {
            C0879l0 c0879l0M7268d = null;
            if (!it.hasNext()) {
                break;
            }
            C0877k0 c0877k0 = (C0877k0) it.next();
            try {
                c0879l0M7268d = c0877k0.f2692a.m7268d(strM9264h);
            } catch (Throwable th2) {
                c0877k0.getClass();
                AbstractC0921a.m2261x("[Hchat:Script] 发送文字装饰回调失败: message_affix ", th2.getMessage(), th2);
            }
            if (c0879l0M7268d != null) {
                String str2 = c0879l0M7268d.f2698b;
                String str3 = c0879l0M7268d.f2697a;
                if (str3.length() != 0 || str2.length() != 0) {
                    strM1020i = AbstractC0255e.m1020i(str3, strM1020i);
                    strM1020i2 = AbstractC0255e.m1020i(strM1020i2, str2);
                    strM9264h = AbstractC4855en.m9264h(str3, strM9264h, str2);
                }
            }
        }
        if (strM1020i.length() == 0 && strM1020i2.length() == 0) {
            return null;
        }
        Object objM2195d = m2195d(obj);
        if (objM2195d instanceof TextView) {
            CharSequence text = ((TextView) objM2195d).getText();
            editable = text instanceof Editable ? (Editable) text : null;
        } else if (objM2195d != null) {
            Object objM2198h = m2198h(objM2195d);
            if (objM2198h instanceof Editable) {
                editable = (Editable) objM2198h;
            }
        }
        if (editable == null) {
            Object obj2 = objM2195d != null ? objM2195d : obj;
            if (m2202l(obj2, strM9264h)) {
                return new C0871h0(obj2, str, strM9264h, strM1020i.length(), strM1020i2.length());
            }
            return null;
        }
        if (strM1020i2.length() > 0) {
            editable.insert(editable.length(), strM1020i2);
        }
        if (strM1020i.length() > 0) {
            editable.insert(0, strM1020i);
        }
        return new C0871h0(objM2195d != null ? objM2195d : obj, str, strM9264h, strM1020i.length(), strM1020i2.length());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static final void m2193b(C0881m0 c0881m0, C0871h0 c0871h0) {
        CharSequence text;
        Object obj = c0871h0.f2671a;
        int i9 = c0871h0.f2675e;
        if (obj instanceof TextView) {
            text = ((TextView) obj).getText();
        } else {
            Object objM2198h = m2198h(obj);
            text = objM2198h instanceof CharSequence ? (CharSequence) objM2198h : null;
        }
        if (text == null || !AbstractC1416l.m3825a(text.toString(), c0871h0.f2673c)) {
            return;
        }
        Editable editable = text instanceof Editable ? (Editable) text : null;
        if (editable == null) {
            m2202l(obj, c0871h0.f2672b);
            return;
        }
        if (i9 > 0) {
            editable.delete(editable.length() - i9, editable.length());
        }
        int i10 = c0871h0.f2674d;
        if (i10 > 0) {
            editable.delete(0, i10);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static Activity m2194c(Context context) {
        for (int i9 = 0; context != null && i9 < 8; i9++) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            ContextWrapper contextWrapper = context instanceof ContextWrapper ? (ContextWrapper) context : null;
            context = contextWrapper != null ? contextWrapper.getBaseContext() : null;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static Object m2195d(Object obj) {
        Field field;
        boolean zContainsKey;
        Class<?> cls = obj.getClass();
        LinkedHashMap linkedHashMap = f2710d;
        synchronized (linkedHashMap) {
            field = linkedHashMap.containsKey(cls) ? (Field) linkedHashMap.get(cls) : null;
        }
        if (field != null) {
            return KavaReflector.readField(field, obj);
        }
        synchronized (linkedHashMap) {
            zContainsKey = linkedHashMap.containsKey(cls);
        }
        if (!zContainsKey) {
            ArrayList arrayList = new ArrayList();
            for (Class<?> superclass = cls; superclass != null && !superclass.equals(Object.class); superclass = superclass.getSuperclass()) {
                AbstractC4171r.m8432h1(arrayList, KavaReflector.declaredFields(superclass));
            }
            Iterator it = arrayList.iterator();
            int i9 = 0;
            Field field2 = null;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Field field3 = (Field) it.next();
                if (!Modifier.isStatic(field3.getModifiers()) && !field3.getType().isPrimitive()) {
                    KavaReflector.accessible(field3);
                    Object field4 = KavaReflector.readField(field3, obj);
                    if (field4 != null) {
                        Class<?> cls2 = field4.getClass();
                        int i10 = m2196e(cls2, "getText") == null ? 0 : 3;
                        if (m2196e(cls2, "clearComposingText") != null) {
                            i10 += 2;
                        }
                        if (m2196e(cls2, "getSimilarPasteSeqStr") != null) {
                            i10 += 2;
                        }
                        if (m2196e(cls2, "getPasterContent") != null) {
                            i10++;
                        }
                        if (View.class.isAssignableFrom(cls2)) {
                            i10++;
                        }
                        if (i10 > i9) {
                            field2 = field3;
                            i9 = i10;
                        }
                    }
                }
            }
            if (i9 < 3) {
                field2 = null;
            }
            LinkedHashMap linkedHashMap2 = f2710d;
            synchronized (linkedHashMap2) {
                linkedHashMap2.put(cls, field2);
            }
            if (field2 != null) {
                return KavaReflector.readField(field2, obj);
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static Method m2196e(Class cls, String str) {
        if (cls == null) {
            return null;
        }
        String strM9264h = AbstractC4855en.m9264h(cls.getName(), "#", str);
        ConcurrentHashMap concurrentHashMap = f2711e;
        Method method = (Method) concurrentHashMap.get(strM9264h);
        if (method != null) {
            return method;
        }
        while (cls != null && !cls.equals(Object.class)) {
            for (Method method2 : KavaReflector.declaredMethods(cls)) {
                if (AbstractC1416l.m3825a(method2.getName(), str)) {
                    Class<?>[] parameterTypes = method2.getParameterTypes();
                    parameterTypes.getClass();
                    if (parameterTypes.length == 0) {
                        Method methodAccessible = KavaReflector.accessible(method2);
                        if (methodAccessible == null) {
                            return null;
                        }
                        concurrentHashMap.put(strM9264h, methodAccessible);
                        return methodAccessible;
                    }
                }
            }
            cls = cls.getSuperclass();
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static Method m2197f(Class cls, Class cls2) {
        String strM9264h = AbstractC4855en.m9264h(cls.getName(), "#setText#", cls2.getName());
        ConcurrentHashMap concurrentHashMap = f2712f;
        Method method = (Method) concurrentHashMap.get(strM9264h);
        if (method != null) {
            return method;
        }
        while (cls != null && !cls.equals(Object.class)) {
            for (Method method2 : KavaReflector.declaredMethods(cls)) {
                if (AbstractC1416l.m3825a(method2.getName(), "setText") && method2.getParameterTypes().length == 1) {
                    Class<?> cls3 = method2.getParameterTypes()[0];
                    cls3.getClass();
                    if (m2203m(cls3).isAssignableFrom(m2203m(cls2))) {
                        Method methodAccessible = KavaReflector.accessible(method2);
                        if (methodAccessible == null) {
                            return null;
                        }
                        concurrentHashMap.put(strM9264h, methodAccessible);
                        return methodAccessible;
                    }
                }
            }
            cls = cls.getSuperclass();
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static Object m2198h(Object obj) {
        Method methodM2196e = m2196e(obj.getClass(), "getText");
        if (methodM2196e != null) {
            return KavaReflector.invoke(methodM2196e, obj, new Object[0]);
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public static String m2199i(Object obj) {
        Object objM2198h;
        Object objM2195d = m2195d(obj);
        if (objM2195d != null && (objM2198h = m2198h(objM2195d)) != null) {
            return objM2198h.toString();
        }
        Object objM2198h2 = m2198h(obj);
        return objM2198h2 != null ? objM2198h2.toString() : HttpUrl.FRAGMENT_ENCODE_SET;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public static C0014a m2200j(String str, InterfaceC0873i0 interfaceC0873i0) {
        C0532s c0532s = new C0532s(str, 2);
        CopyOnWriteArrayList copyOnWriteArrayList = f2713g;
        AbstractC4171r.m8433i1(c0532s, copyOnWriteArrayList);
        copyOnWriteArrayList.add(new C0875j0(str, interfaceC0873i0));
        return new C0014a(10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public static void m2201k(String str, String str2) {
        str.getClass();
        str2.getClass();
        if (AbstractC3149m.m6721t0(str) || str2.length() == 0) {
            return;
        }
        f2715i.post(new RunnableC0869g0(str, str2));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public static boolean m2202l(Object obj, String str) {
        if (obj instanceof TextView) {
            ((TextView) obj).setText(str);
            return true;
        }
        Method methodM2197f = m2197f(obj.getClass(), String.class);
        if (methodM2197f == null) {
            return false;
        }
        KavaReflector.invoke(methodM2197f, obj, str);
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public static Class m2203m(Class cls) {
        return !cls.isPrimitive() ? cls : cls.equals(Boolean.TYPE) ? Boolean.class : cls.equals(Byte.TYPE) ? Byte.class : cls.equals(Character.TYPE) ? Character.class : cls.equals(Short.TYPE) ? Short.class : cls.equals(Integer.TYPE) ? Integer.class : cls.equals(Long.TYPE) ? Long.class : cls.equals(Float.TYPE) ? Float.class : cls.equals(Double.TYPE) ? Double.class : cls.equals(Void.TYPE) ? Void.class : cls;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final synchronized boolean m2204g(C3742g c3742g) {
        Object c3959f;
        Method method;
        c3742g.getClass();
        if (f2708b) {
            return true;
        }
        try {
            DexFinder dexFinder = c3742g.f12147e;
            dexFinder.resolveScriptSendHookApi();
            method = dexFinder.chatFooterSendClickMethod;
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        if (method == null) {
            AbstractC1184v0.m3203m("[Hchat:Script] 发送按钮Hook失败: 未定位到ChatFooter发送入口");
            return false;
        }
        C3744i.f12154b.m7763b(method, new C0219e(this, 9));
        f2708b = true;
        c3959f = C3967n.f12976a;
        Throwable thM8182b = C3960g.m8182b(c3959f);
        if (thM8182b == null) {
            return f2708b;
        }
        AbstractC1184v0.m3204n("[Hchat:Script] 发送按钮Hook异常: " + thM8182b.getMessage(), thM8182b);
        return false;
    }
}
