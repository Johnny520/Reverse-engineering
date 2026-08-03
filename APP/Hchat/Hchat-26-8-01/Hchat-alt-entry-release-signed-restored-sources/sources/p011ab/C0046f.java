package p011ab;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.TextView;
import ch.C0570e;
import gg.AbstractC1416l;
import gh.C1431c;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import okhttp3.HttpUrl;
import org.luckypray.dexkit.DexKitBridge;
import p062e8.C0828b;
import p068eh.AbstractC0921a;
import p086fh.C1253k;
import p099h.Hchat.utils.KavaReflector;
import p115hh.C1730o;
import p210o8.C3087k;
import p258r8.C3742g;
import p258r8.C3744i;
import p276sf.C3959f;
import p276sf.C3960g;
import p300ub.AbstractC4302b;

/* JADX INFO: renamed from: ab.f */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0046f {

    /* JADX INFO: renamed from: a */
    public final C3742g f152a;

    /* JADX INFO: renamed from: b */
    public final C0042b f153b;

    /* JADX INFO: renamed from: c */
    public final SharedPreferences f154c;

    /* JADX INFO: renamed from: d */
    public final ConcurrentHashMap f155d;

    /* JADX INFO: renamed from: e */
    public volatile WeakReference f156e;

    /* JADX INFO: renamed from: f */
    public volatile boolean f157f;

    /* JADX INFO: renamed from: g */
    public volatile boolean f158g;

    /* JADX INFO: renamed from: h */
    public volatile boolean f159h;

    /* JADX INFO: renamed from: i */
    public volatile boolean f160i;

    /* JADX INFO: renamed from: j */
    public volatile Method f161j;

    /* JADX INFO: renamed from: k */
    public volatile Method f162k;

    /* JADX INFO: renamed from: l */
    public volatile boolean f163l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0046f(C3742g c3742g, C0042b c0042b) {
        c3742g.getClass();
        this.f152a = c3742g;
        this.f153b = c0042b;
        this.f154c = AbstractC4302b.m8640c(c3742g.f12143a, "Hchat_quote_delete_clear_method_cache");
        this.f155d = new ConcurrentHashMap();
        this.f156e = new WeakReference(null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static View m316c(View view) {
        int i9 = 0;
        while (true) {
            if (i9 >= 12) {
                return null;
            }
            if (view != null) {
                if (m317g(view)) {
                    return view;
                }
                Object parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
            i9++;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static boolean m317g(Object obj) {
        for (Class<?> superclass = obj.getClass(); superclass != null && !superclass.equals(Object.class); superclass = superclass.getSuperclass()) {
            if (superclass.getName().equals("com.tencent.mm.pluginsdk.ui.chat.ChatFooter")) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static boolean m318h(Method method) {
        Class<?>[] parameterTypes = method.getParameterTypes();
        if (!method.getDeclaringClass().getName().equals("com.tencent.mm.pluginsdk.ui.chat.ChatFooter") || !AbstractC1416l.m3825a(method.getReturnType(), Void.TYPE) || parameterTypes.length != 2) {
            return false;
        }
        Class<?> cls = parameterTypes[0];
        Class cls2 = Boolean.TYPE;
        if (!AbstractC1416l.m3825a(cls, cls2) && !AbstractC1416l.m3825a(cls, cls2)) {
            return false;
        }
        Class<?> cls3 = parameterTypes[1];
        return AbstractC1416l.m3825a(cls3, cls2) || AbstractC1416l.m3825a(cls3, cls2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public static boolean m319i(Method method) {
        Class<?>[] parameterTypes = method.getParameterTypes();
        if (AbstractC1416l.m3825a(method.getName(), "onKey") && AbstractC1416l.m3825a(method.getReturnType(), Boolean.TYPE) && parameterTypes.length == 3 && View.class.isAssignableFrom(parameterTypes[0])) {
            Class<?> cls = parameterTypes[1];
            Class cls2 = Integer.TYPE;
            if ((AbstractC1416l.m3825a(cls, cls2) || AbstractC1416l.m3825a(parameterTypes[1], cls2)) && AbstractC1416l.m3825a(parameterTypes[2], KeyEvent.class)) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final boolean m320a(Object obj) {
        Class<?> cls = obj.getClass();
        Method methodM325j = m325j();
        if (methodM325j == null || (!cls.isAssignableFrom(methodM325j.getDeclaringClass()) && !methodM325j.getDeclaringClass().isAssignableFrom(cls))) {
            methodM325j = null;
        }
        if (!(methodM325j != null ? KavaReflector.invokeSuccessfully(methodM325j, obj, Boolean.FALSE, Boolean.TRUE) : false)) {
            return false;
        }
        View view = obj instanceof View ? (View) obj : null;
        for (int i9 = 0; i9 < 4 && view != null; i9++) {
            view.requestLayout();
            view.invalidate();
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final Object m321b(int i9, Object obj) {
        Object field;
        Object objM321b;
        if (obj == null || i9 > 2) {
            return null;
        }
        if (m317g(obj)) {
            return obj;
        }
        Class<?> cls = obj.getClass();
        ConcurrentHashMap concurrentHashMap = this.f155d;
        Field field2 = (Field) concurrentHashMap.get(cls);
        if (field2 != null) {
            Object field3 = KavaReflector.readField(field2, obj);
            if (field3 != null && m317g(field3)) {
                return field3;
            }
            concurrentHashMap.remove(obj.getClass(), field2);
        }
        for (Class<?> superclass = obj.getClass(); superclass != null && !superclass.equals(Object.class); superclass = superclass.getSuperclass()) {
            for (Field field4 : KavaReflector.declaredFields(superclass)) {
                if (!Modifier.isStatic(field4.getModifiers()) && (field = KavaReflector.readField(field4, obj)) != null) {
                    if (m317g(field)) {
                        concurrentHashMap.put(obj.getClass(), field4);
                        return field;
                    }
                    if (AbstractC0921a.m2263z("com.tencent.mm.pluginsdk.ui.chat.", field, false) && (objM321b = m321b(i9 + 1, field)) != null) {
                        return objM321b;
                    }
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final boolean m322d() {
        Method methodFindMethodRecursive;
        Object c3959f;
        if (this.f158g) {
            return true;
        }
        Class<?> clsLoadClass = KavaReflector.loadClass("com.tencent.mm.pluginsdk.ui.chat.ChatFooter", this.f152a.f12145c);
        if (clsLoadClass == null || (methodFindMethodRecursive = KavaReflector.findMethodRecursive(clsLoadClass, "onAttachedToWindow", new Class[0])) == null) {
            return false;
        }
        Method methodFindMethodRecursive2 = KavaReflector.findMethodRecursive(clsLoadClass, "onDetachedFromWindow", new Class[0]);
        try {
            C3744i c3744i = C3744i.f12154b;
            c3744i.m7763b(methodFindMethodRecursive, new C0044d(this, 0));
            if (methodFindMethodRecursive2 != null) {
                c3744i.m7763b(methodFindMethodRecursive2, new C0044d(this, 1));
            }
            this.f158g = true;
            c3959f = Boolean.TRUE;
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        Throwable thM8182b = C3960g.m8182b(c3959f);
        if (thM8182b != null) {
            this.f153b.invoke("删除键清引用输入栏生命周期Hook失败", thM8182b);
            c3959f = Boolean.FALSE;
        }
        return ((Boolean) c3959f).booleanValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final boolean m323e() {
        Object c3959f;
        if (this.f159h) {
            return true;
        }
        Method methodFindMethodRecursive = KavaReflector.findMethodRecursive(TextView.class, "onCreateInputConnection", EditorInfo.class);
        if (methodFindMethodRecursive == null) {
            return false;
        }
        try {
            C3744i.f12154b.m7763b(methodFindMethodRecursive, new C0044d(this, 2));
            this.f159h = true;
            c3959f = Boolean.TRUE;
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        Throwable thM8182b = C3960g.m8182b(c3959f);
        if (thM8182b != null) {
            this.f153b.invoke("删除键清引用输入法删除Hook失败", thM8182b);
            c3959f = Boolean.FALSE;
        }
        return ((Boolean) c3959f).booleanValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:65:0x003e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m324f() {
        Object c3959f;
        Method method;
        Object c3959f2;
        if (this.f160i) {
            return true;
        }
        Method method2 = this.f161j;
        if (method2 == null) {
            C3742g c3742g = this.f152a;
            Context context = c3742g.f12143a;
            ClassLoader classLoader = c3742g.f12145c;
            classLoader.getClass();
            String str = C3087k.m6557a(context, classLoader).f8202h;
            Method methodM2087c = C0828b.m2087c(this.f154c, str, this.f152a.f12145c, "support_auto_complete_on_key");
            if (methodM2087c == null) {
                try {
                    DexKitBridge dexKitBridge = this.f152a.f12146d;
                    C0570e c0570e = new C0570e();
                    C1253k c1253k = new C1253k();
                    c1253k.f4103g = new C1431c("onKey", 5);
                    c1253k.m3374r0("ChatFooterKtHelper", "supportAutoComplete err");
                    c0570e.f1764h = c1253k;
                    Iterator it = dexKitBridge.findMethod(c0570e).iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            method = null;
                            break;
                        }
                        try {
                            c3959f2 = ((C1730o) it.next()).m4350r(this.f152a.f12145c);
                        } catch (Throwable th2) {
                            c3959f2 = new C3959f(th2);
                        }
                        if (c3959f2 instanceof C3959f) {
                            c3959f2 = null;
                        }
                        method = (Method) c3959f2;
                        if (method == null || !m319i(method)) {
                            method = null;
                        }
                        if (method != null) {
                            break;
                        }
                    }
                    if (method != null) {
                        this.f161j = KavaReflector.accessible(method);
                        C0828b.m2092h(this.f154c, str, "support_auto_complete_on_key", method);
                    } else {
                        SharedPreferences sharedPreferences = this.f154c;
                        sharedPreferences.getClass();
                        try {
                            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                            if (!AbstractC1416l.m3825a(sharedPreferences.getString("cache.key", HttpUrl.FRAGMENT_ENCODE_SET), str)) {
                                editorEdit.clear().putString("cache.key", str);
                            }
                            editorEdit.remove("support_auto_complete_on_key").apply();
                        } catch (Throwable unused) {
                        }
                    }
                    method2 = this.f161j;
                } catch (Throwable th3) {
                    this.f153b.invoke("删除键清引用定位按键入口异常", th3);
                    method2 = null;
                }
            } else {
                if (!m319i(methodM2087c)) {
                    methodM2087c = null;
                }
                if (methodM2087c != null) {
                    this.f161j = KavaReflector.accessible(methodM2087c);
                    method2 = this.f161j;
                }
            }
        }
        if (method2 == null) {
            this.f153b.invoke("删除键清引用定位按键入口失败", null);
            return false;
        }
        try {
            C3744i.f12154b.m7763b(method2, new C0044d(this, 3));
            this.f160i = true;
            c3959f = Boolean.TRUE;
        } catch (Throwable th4) {
            c3959f = new C3959f(th4);
        }
        Throwable thM8182b = C3960g.m8182b(c3959f);
        if (thM8182b != null) {
            this.f153b.invoke("删除键清引用按键Hook失败", thM8182b);
            c3959f = Boolean.FALSE;
        }
        return ((Boolean) c3959f).booleanValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public final Method m325j() {
        Method method = this.f162k;
        if (method != null) {
            return method;
        }
        if (this.f163l) {
            return null;
        }
        C3742g c3742g = this.f152a;
        Context context = c3742g.f12143a;
        ClassLoader classLoader = c3742g.f12145c;
        classLoader.getClass();
        String str = C3087k.m6557a(context, classLoader).f8202h;
        Method methodM2087c = C0828b.m2087c(this.f154c, str, this.f152a.f12145c, "quote_clear_method");
        if (methodM2087c != null) {
            if (!m318h(methodM2087c)) {
                methodM2087c = null;
            }
            if (methodM2087c != null) {
                this.f162k = KavaReflector.accessible(methodM2087c);
                this.f163l = true;
                return this.f162k;
            }
        }
        try {
            Method methodM326k = m326k("handleQuoteMsgFillingFrom");
            if (methodM326k == null) {
                methodM326k = m326k("openim_card_type_name", "err_not_started");
            }
            if (methodM326k != null) {
                this.f162k = KavaReflector.accessible(methodM326k);
                this.f163l = true;
                C0828b.m2092h(this.f154c, str, "quote_clear_method", methodM326k);
            } else {
                this.f163l = true;
                C0828b.m2085a(this.f154c, str, "quote_clear_method");
            }
            return this.f162k;
        } catch (Throwable th2) {
            this.f153b.invoke("删除键清引用定位原生清理方法失败", th2);
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public final Method m326k(String... strArr) {
        Method method;
        Object c3959f;
        C3742g c3742g = this.f152a;
        DexKitBridge dexKitBridge = c3742g.f12146d;
        C0570e c0570e = new C0570e();
        C1253k c1253k = new C1253k();
        c1253k.m3369l0(5, "com.tencent.mm.pluginsdk.ui.chat.ChatFooter");
        C1253k.m3366q0(c1253k, "void");
        c1253k.m3372o0("boolean", "boolean");
        c1253k.m3374r0((String[]) Arrays.copyOf(strArr, strArr.length));
        c0570e.f1764h = c1253k;
        Iterator it = dexKitBridge.findMethod(c0570e).iterator();
        do {
            method = null;
            if (!it.hasNext()) {
                break;
            }
            try {
                c3959f = ((C1730o) it.next()).m4350r(c3742g.f12145c);
            } catch (Throwable th2) {
                c3959f = new C3959f(th2);
            }
            if (c3959f instanceof C3959f) {
                c3959f = null;
            }
            Method method2 = (Method) c3959f;
            if (method2 != null && m318h(method2)) {
                method = method2;
            }
        } while (method == null);
        return method;
    }
}
