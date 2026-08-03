package p024b9;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import android.widget.TextView;
import ch.C0568c;
import ch.C0570e;
import gg.AbstractC1416l;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import okhttp3.HttpUrl;
import org.luckypray.dexkit.DexKitBridge;
import p000a.AbstractC0000a;
import p011ab.C0042b;
import p062e8.C0828b;
import p068eh.AbstractC0921a;
import p086fh.C1243a;
import p086fh.C1253k;
import p099h.Hchat.hooks.api.core.WeChatApis;
import p099h.Hchat.hooks.api.model.WeChatSnsPost;
import p099h.Hchat.utils.KavaReflector;
import p115hh.C1724i;
import p115hh.C1730o;
import p115hh.C1731p;
import p210o8.C3087k;
import p218og.AbstractC3149m;
import p218og.AbstractC3156t;
import p222p.AbstractC3199a;
import p258r8.C3742g;
import p258r8.C3744i;
import p276sf.C3959f;
import p276sf.C3960g;
import p300ub.AbstractC4302b;
import p300ub.C4301a;
import tf.C4173t;

/* JADX INFO: renamed from: b9.f */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0220f {

    /* JADX INFO: renamed from: a */
    public final C3742g f537a;

    /* JADX INFO: renamed from: b */
    public final Map f538b;

    /* JADX INFO: renamed from: c */
    public final SharedPreferences f539c;

    /* JADX INFO: renamed from: d */
    public volatile boolean f540d;

    /* JADX INFO: renamed from: e */
    public final Object f541e;

    /* JADX INFO: renamed from: f */
    public Serializable f542f;

    /* JADX INFO: renamed from: g */
    public Object f543g;

    /* JADX INFO: renamed from: h */
    public Object f544h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0220f(C3742g c3742g) {
        c3742g.getClass();
        this.f537a = c3742g;
        Context context = c3742g.f12143a;
        SharedPreferences sharedPreferencesM8640c = AbstractC4302b.m8640c(context, "Hchat_chat_time_style_config");
        this.f539c = sharedPreferencesM8640c;
        this.f541e = AbstractC4302b.m8640c(context, "Hchat_chat_time_style_method_cache");
        this.f542f = new ConcurrentHashMap();
        this.f543g = new ConcurrentHashMap();
        this.f544h = ConcurrentHashMap.newKeySet();
        this.f538b = AbstractC3199a.m6843p();
        sharedPreferencesM8640c.registerOnSharedPreferenceChangeListener(new SharedPreferencesOnSharedPreferenceChangeListenerC0216b(this, 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static String m906b() {
        C3087k c3087kVersion = WeChatApis.version();
        return AbstractC0921a.m2251n("feature_", c3087kVersion != null ? c3087kVersion.m6563b().f8198d : WeChatSnsPost.TYPE_UNKNOWN, "_beforetransfer_class");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public static long m907j(Object obj) {
        Long lM908k = m908k(KavaReflector.invoke(KavaReflector.findMethod(obj.getClass(), "getCreateTime", new Class[0]), obj, new Object[0]));
        if (lM908k != null) {
            long jLongValue = lM908k.longValue();
            if (jLongValue > 0) {
                return jLongValue;
            }
        }
        String[] strArr = {"field_createTime", "createTime"};
        for (int i9 = 0; i9 < 2; i9++) {
            Long lM908k2 = m908k(KavaReflector.readField(obj, strArr[i9]));
            if (lM908k2 != null) {
                long jLongValue2 = lM908k2.longValue();
                if (jLongValue2 > 0) {
                    return jLongValue2;
                }
            }
        }
        return 0L;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public static Long m908k(Object obj) {
        if (obj instanceof Number) {
            return Long.valueOf(((Number) obj).longValue());
        }
        if (obj instanceof String) {
            return AbstractC3156t.m6743g0(AbstractC3149m.m6703R0((String) obj).toString());
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public static Object m909l(int i9, Object obj, Set set) {
        Object field;
        Object objM909l;
        long jLongValue;
        if (obj != null && i9 <= 4 && set.add(obj)) {
            if (AbstractC0921a.m2263z("com.tencent.mm.storage.", obj, false) && m907j(obj) > 0) {
                String[] strArr = {"getMsgId", "getMsgID"};
                int i10 = 0;
                while (true) {
                    if (i10 >= 2) {
                        String[] strArr2 = {"field_msgId", "msgId", "msgID"};
                        int i11 = 0;
                        while (true) {
                            if (i11 >= 3) {
                                jLongValue = 0;
                                break;
                            }
                            Long lM908k = m908k(KavaReflector.readField(obj, strArr2[i11]));
                            if (lM908k != null) {
                                jLongValue = lM908k.longValue();
                                if (jLongValue > 0) {
                                    break;
                                }
                            }
                            i11++;
                        }
                    } else {
                        Long lM908k2 = m908k(KavaReflector.invoke(KavaReflector.findMethod(obj.getClass(), strArr[i10], new Class[0]), obj, new Object[0]));
                        if (lM908k2 != null) {
                            jLongValue = lM908k2.longValue();
                            if (jLongValue > 0) {
                                break;
                            }
                        }
                        i10++;
                    }
                }
                if (jLongValue > 0) {
                    return obj;
                }
            }
            if (obj instanceof Object[]) {
                for (Object obj2 : (Object[]) obj) {
                    Object objM909l2 = m909l(i9 + 1, obj2, set);
                    if (objM909l2 != null) {
                        return objM909l2;
                    }
                }
            } else if (obj instanceof Collection) {
                Iterator it = ((Iterable) obj).iterator();
                while (it.hasNext()) {
                    Object objM909l3 = m909l(i9 + 1, it.next(), set);
                    if (objM909l3 != null) {
                        return objM909l3;
                    }
                }
            } else {
                String name = obj.getClass().getName();
                if (AbstractC3156t.m6740d0(name, "java.", false) || AbstractC3156t.m6740d0(name, "android.", false) || (obj instanceof View)) {
                    return null;
                }
                for (Class<?> superclass = obj.getClass(); superclass != null && !superclass.equals(Object.class); superclass = superclass.getSuperclass()) {
                    for (Field field2 : KavaReflector.declaredFields(superclass)) {
                        if (!KavaReflector.isStatic(field2) && !field2.getType().isPrimitive() && !field2.getType().isArray() && !AbstractC1416l.m3825a(field2.getType(), String.class) && !Number.class.isAssignableFrom(field2.getType()) && (field = KavaReflector.readField(field2, obj)) != null && (objM909l = m909l(i9 + 1, field, set)) != null) {
                            return objM909l;
                        }
                    }
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0075  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m910a(TextView textView, C0218d c0218d, String str) {
        String str2;
        Object c3959f;
        if (str.equals("hidden")) {
            textView.setVisibility(8);
            return;
        }
        if (!str.equals("custom")) {
            textView.setText(c0218d.f533b);
            textView.setVisibility(c0218d.f534c);
            return;
        }
        textView.setVisibility(c0218d.f534c);
        if (c0218d.f534c == 0) {
            long j3 = c0218d.f532a;
            if (j3 > 0) {
                String string = this.f539c.getString("chat_time_format", "yyyy-MM-dd HH:mm:ss");
                if (string == null) {
                    string = HttpUrl.FRAGMENT_ENCODE_SET;
                }
                if (AbstractC3149m.m6721t0(string)) {
                    string = "yyyy-MM-dd HH:mm:ss";
                }
                try {
                    c3959f = new SimpleDateFormat(string, Locale.getDefault()).format(new Date(j3));
                } catch (Throwable th2) {
                    c3959f = new C3959f(th2);
                }
                if (C3960g.m8182b(c3959f) != null) {
                    c3959f = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault()).format(new Date(j3));
                }
                c3959f.getClass();
                str2 = (String) c3959f;
            } else {
                str2 = c0218d.f533b;
            }
        }
        textView.setText(str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public boolean m911c() {
        Object c3959f;
        boolean z9 = true;
        if (this.f540d && ((Constructor) this.f543g) != null && ((Method) this.f544h) != null) {
            return true;
        }
        try {
            m917i();
            Method method = (Method) this.f544h;
            if (method != null) {
                C3744i.f12154b.m7763b(method, new C0219e(this, 2));
            }
            if (((Constructor) this.f543g) == null || ((Method) this.f544h) == null) {
                z9 = false;
            }
            this.f540d = z9;
            c3959f = Boolean.valueOf(this.f540d);
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        Throwable thM8182b = C3960g.m8182b(c3959f);
        if (thM8182b != null) {
            ((C0042b) this.f541e).invoke("实名查询初始化失败", thM8182b);
            c3959f = Boolean.FALSE;
        }
        return ((Boolean) c3959f).booleanValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0062, code lost:
    
        return null;
     */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Field m912d(Class cls) {
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.f542f;
        Field field = (Field) concurrentHashMap.get(cls);
        if (field != null) {
            return field;
        }
        Class superclass = cls;
        while (true) {
            Object obj = null;
            if (superclass == null || superclass.equals(Object.class)) {
                break;
            }
            Iterator<T> it = KavaReflector.declaredFields(superclass).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                Field field2 = (Field) next;
                if (Boolean.valueOf(AbstractC1416l.m3825a(field2.getName(), "itemView") || AbstractC1416l.m3825a(field2.getType(), View.class)).booleanValue()) {
                    obj = next;
                    break;
                }
            }
            Field field3 = (Field) obj;
            if (field3 != null) {
                concurrentHashMap.put(cls, field3);
                return field3;
            }
            superclass = superclass.getSuperclass();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public View m913e(Object obj) {
        Object field = KavaReflector.readField(obj, "itemView");
        View view = field instanceof View ? (View) field : null;
        if (view != null) {
            return view;
        }
        Object field2 = KavaReflector.readField(m912d(obj.getClass()), obj);
        if (field2 instanceof View) {
            return (View) field2;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public TextView m914f(Object obj) {
        Object next;
        ConcurrentHashMap.KeySetView keySetView = (ConcurrentHashMap.KeySetView) this.f544h;
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.f543g;
        Field field = (Field) concurrentHashMap.get(obj.getClass());
        if (field != null) {
            Object field2 = KavaReflector.readField(field, obj);
            if (field2 instanceof TextView) {
                return (TextView) field2;
            }
        } else if (!keySetView.contains(obj.getClass())) {
            for (Class<?> superclass = obj.getClass(); superclass != null && !superclass.equals(Object.class); superclass = superclass.getSuperclass()) {
                Iterator<T> it = KavaReflector.declaredFields(superclass).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    Field field3 = (Field) next;
                    if (AbstractC1416l.m3825a(field3.getName(), "timeTV") && TextView.class.isAssignableFrom(field3.getType())) {
                        break;
                    }
                }
                Field field4 = (Field) next;
                if (field4 != null) {
                    concurrentHashMap.put(obj.getClass(), field4);
                    Object field5 = KavaReflector.readField(field4, obj);
                    if (field5 instanceof TextView) {
                        return (TextView) field5;
                    }
                }
            }
            keySetView.add(obj.getClass());
            return null;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public boolean m915g(Method method) {
        boolean z9;
        Class<?>[] parameterTypes = method.getParameterTypes();
        if (AbstractC1416l.m3825a(method.getReturnType(), Void.TYPE) && parameterTypes.length >= 3) {
            int length = parameterTypes.length;
            int i9 = 0;
            while (true) {
                if (i9 >= length) {
                    break;
                }
                Class<?> cls = parameterTypes[i9];
                if (Boolean.valueOf(AbstractC1416l.m3825a(cls, Integer.TYPE) || AbstractC1416l.m3825a(cls, Integer.class)).booleanValue()) {
                    for (Class<?> superclass : parameterTypes) {
                        if (m912d(superclass) != null) {
                            z9 = true;
                            break;
                        }
                        while (superclass != null && !superclass.equals(Object.class)) {
                            List<Field> listDeclaredFields = KavaReflector.declaredFields(superclass);
                            if (listDeclaredFields == null || !listDeclaredFields.isEmpty()) {
                                Iterator<T> it = listDeclaredFields.iterator();
                                while (it.hasNext()) {
                                    if (View.class.isAssignableFrom(((Field) it.next()).getType())) {
                                        z9 = true;
                                        break;
                                    }
                                }
                            }
                            superclass = superclass.getSuperclass();
                        }
                        z9 = false;
                        if (Boolean.valueOf(z9).booleanValue()) {
                            return true;
                        }
                    }
                } else {
                    i9++;
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:64:0x0094 */
    /* JADX DEBUG: Multi-variable search result rejected for r7v2, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1, types: [sf.f] */
    /* JADX WARN: Type inference failed for: r7v11, types: [java.util.ArrayList] */
    /* JADX INFO: renamed from: h */
    public Method m916h() {
        Object c3959f;
        Object c3959f2;
        SharedPreferences sharedPreferences = (SharedPreferences) this.f541e;
        C3742g c3742g = this.f537a;
        Context context = c3742g.f12143a;
        ClassLoader classLoader = c3742g.f12145c;
        classLoader.getClass();
        String str = C3087k.m6557a(context, classLoader).f8202h;
        Object obj = null;
        if (AbstractC3149m.m6721t0(str)) {
            str = null;
        }
        String strConcat = str != null ? str.concat("|chat_time_style_v1") : null;
        if (strConcat == null) {
            strConcat = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        Method methodM2087c = C0828b.m2087c(sharedPreferences, strConcat, classLoader, "chat_time_bind");
        if (methodM2087c != null) {
            if (!m915g(methodM2087c)) {
                methodM2087c = null;
            }
            if (methodM2087c != null) {
                return methodM2087c;
            }
        }
        try {
            DexKitBridge dexKitBridge = c3742g.f12146d;
            C0570e c0570e = new C0570e();
            C1253k c1253k = new C1253k();
            C1253k.m3367u0(c1253k, AbstractC0000a.m101y0("MicroMsg.MvvmChattingItem", "[onBindView]"));
            c0570e.f1764h = c1253k;
            C1731p c1731pFindMethod = dexKitBridge.findMethod(c0570e);
            c3959f = new ArrayList();
            Iterator it = c1731pFindMethod.iterator();
            while (it.hasNext()) {
                try {
                    c3959f2 = ((C1730o) it.next()).m4350r(classLoader);
                } catch (Throwable th2) {
                    c3959f2 = new C3959f(th2);
                }
                if (c3959f2 instanceof C3959f) {
                    c3959f2 = null;
                }
                Method method = (Method) c3959f2;
                if (method != null) {
                    c3959f.add(method);
                }
            }
        } catch (Throwable th3) {
            c3959f = new C3959f(th3);
        }
        Throwable thM8182b = C3960g.m8182b(c3959f);
        Object obj2 = c3959f;
        if (thM8182b != null) {
            AbstractC0921a.m2261x("[Hchat:ChatTimeStyle] 定位聊天时间绑定方法异常: ", thM8182b.getMessage(), thM8182b);
            obj2 = C4173t.f13710g;
        }
        Iterator it2 = ((List) obj2).iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (m915g((Method) next)) {
                obj = next;
                break;
            }
        }
        Method method2 = (Method) obj;
        if (method2 != null) {
            C0828b.m2092h(sharedPreferences, strConcat, "chat_time_bind", method2);
        } else {
            try {
                SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                if (!AbstractC1416l.m3825a(sharedPreferences.getString("cache.key", HttpUrl.FRAGMENT_ENCODE_SET), strConcat)) {
                    editorEdit.clear().putString("cache.key", strConcat);
                }
                editorEdit.remove("chat_time_bind").apply();
            } catch (Throwable unused) {
            }
        }
        return method2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public void m917i() {
        Object c3959f;
        this.f542f = null;
        this.f543g = null;
        this.f544h = null;
        String strM906b = m906b();
        SharedPreferences sharedPreferences = this.f539c;
        String str = HttpUrl.FRAGMENT_ENCODE_SET;
        String string = sharedPreferences.getString(strM906b, HttpUrl.FRAGMENT_ENCODE_SET);
        if (string != null) {
            str = string;
        }
        C3742g c3742g = this.f537a;
        ClassLoader classLoader = c3742g.f12145c;
        ClassLoader classLoader2 = c3742g.f12145c;
        Class<?> clsLoadClass = KavaReflector.loadClass(str, classLoader);
        if (clsLoadClass != null) {
            m918m(clsLoadClass);
        }
        if (((Class) this.f542f) == null) {
            try {
                DexKitBridge dexKitBridge = c3742g.f12146d;
                C0568c c0568c = new C0568c();
                C1243a c1243a = new C1243a();
                C1243a.m3357r0(c1243a, AbstractC0000a.m99x0("/cgi-bin/mmpay-bin/beforetransfer"));
                c0568c.f1762h = c1243a;
                c3959f = dexKitBridge.findClass(c0568c);
            } catch (Throwable th2) {
                c3959f = new C3959f(th2);
            }
            if (c3959f instanceof C3959f) {
                c3959f = C4173t.f13710g;
            }
            Iterator it = ((List) c3959f).iterator();
            while (it.hasNext() && !m918m(KavaReflector.loadClass(((C1724i) it.next()).m4345p().f8327g, classLoader2))) {
            }
        }
        if (((Class) this.f542f) == null) {
            m918m(KavaReflector.loadClass("com.tencent.mm.plugin.remittance.model.i", classLoader2));
        }
        Class cls = (Class) this.f542f;
        if (cls != null) {
            sharedPreferences.edit().putString(m906b(), cls.getName()).apply();
            for (Method method : KavaReflector.declaredMethods(cls)) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length >= 4) {
                    Class<?> cls2 = parameterTypes[0];
                    Class cls3 = Integer.TYPE;
                    if (AbstractC1416l.m3825a(cls2, cls3) && AbstractC1416l.m3825a(parameterTypes[1], cls3) && AbstractC1416l.m3825a(parameterTypes[2], cls3) && AbstractC1416l.m3825a(parameterTypes[3], String.class)) {
                        this.f544h = KavaReflector.accessible(method);
                        return;
                    }
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public boolean m918m(Class cls) {
        if (cls == null) {
            return false;
        }
        for (Constructor<?> constructor : KavaReflector.declaredConstructors(cls)) {
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            if (parameterTypes.length == 2 && AbstractC1416l.m3825a(parameterTypes[0], String.class) && AbstractC1416l.m3825a(parameterTypes[1], String.class)) {
                this.f542f = cls;
                this.f543g = KavaReflector.accessible(constructor);
                return true;
            }
        }
        return false;
    }

    public C0220f(C3742g c3742g, C0042b c0042b) {
        c3742g.getClass();
        this.f537a = c3742g;
        this.f541e = c0042b;
        this.f538b = AbstractC3199a.m6843p();
        C4301a c4301a = c3742g.f12149g;
        c4301a.getClass();
        this.f539c = AbstractC4302b.m8640c(c4301a.f14345a, "Hchat_feature_".concat("real_name_tail_runtime"));
    }
}
