package p050c0;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.TextView;
import androidx.emoji2.text.RunnableC0486k;
import de.robv.android.xposed.AbstractC0762d;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import p001A0.AbstractC0040p;
import p007D0.AbstractC0141g;
import p007D0.C0139e;
import p007D0.C0140f;
import p007D0.C0146l;
import p009E0.AbstractC0179j;
import p009E0.AbstractC0181l;
import p009E0.AbstractC0182m;
import p009E0.AbstractC0188s;
import p009E0.C0172c;
import p026N0.AbstractC0270k;
import p029P0.InterfaceC0286l;
import p031Q0.AbstractC0307g;
import p031Q0.AbstractC0317q;
import p034S.AbstractC0324d;
import p037U.AbstractC0358S;
import p042W0.AbstractC0416a;
import p042W0.AbstractC0425j;
import p042W0.AbstractC0433r;

/* JADX INFO: renamed from: c0.q1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0688q1 {

    /* JADX INFO: renamed from: a */
    public static final C0688q1 f2163a = new C0688q1();

    /* JADX INFO: renamed from: b */
    public static final AtomicBoolean f2164b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c */
    public static final AtomicBoolean f2165c = new AtomicBoolean(false);

    /* JADX INFO: renamed from: d */
    public static final AtomicBoolean f2166d = new AtomicBoolean(false);

    /* JADX INFO: renamed from: e */
    public static final AtomicBoolean f2167e = new AtomicBoolean(false);

    /* JADX INFO: renamed from: f */
    public static final ThreadLocal f2168f = ThreadLocal.withInitial(new C0681o0(3));

    /* JADX INFO: renamed from: g */
    public static final Handler f2169g = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: h */
    public static final ConcurrentHashMap f2170h = new ConcurrentHashMap();

    /* JADX INFO: renamed from: i */
    public static final ConcurrentHashMap.KeySetView f2171i = ConcurrentHashMap.newKeySet();

    /* JADX INFO: renamed from: j */
    public static final ConcurrentHashMap f2172j = new ConcurrentHashMap();

    /* JADX INFO: renamed from: k */
    public static final ConcurrentHashMap f2173k = new ConcurrentHashMap();

    /* JADX INFO: renamed from: l */
    public static final ConcurrentHashMap f2174l = new ConcurrentHashMap();

    /* JADX INFO: renamed from: m */
    public static volatile Constructor f2175m;

    /* JADX INFO: renamed from: n */
    public static volatile Method f2176n;

    /* JADX INFO: renamed from: o */
    public static volatile Object f2177o;

    /* JADX INFO: renamed from: p */
    public static volatile ClassLoader f2178p;

    /* JADX INFO: renamed from: a */
    public static void m1766a(TextView textView, String str, String str2) {
        CharSequence text;
        Object objM116u;
        ThreadLocal threadLocal = f2168f;
        if (AbstractC0307g.m699a(threadLocal.get(), Boolean.TRUE) || !AbstractC0307g.m699a(textView.getTag(2113929217), str) || (text = textView.getText()) == null || text.length() == 0) {
            return;
        }
        String string = text.toString();
        int iM1007L0 = (6 & 2) != 0 ? AbstractC0425j.m1007L0(string) : 0;
        AbstractC0307g.m703e(string, "<this>");
        AbstractC0307g.m703e(" (", "string");
        int iLastIndexOf = string.lastIndexOf(" (", iM1007L0);
        boolean z2 = iLastIndexOf >= 0 && AbstractC0433r.m1028C0(string, ")");
        int length = z2 ? iLastIndexOf : string.length();
        if (length <= 0) {
            return;
        }
        String strM1767b = m1767b(str2);
        if (strM1767b.length() == 0) {
            m1782s("apply skip empty masked=" + str2 + " sender=" + str);
            return;
        }
        String strM723f = AbstractC0324d.m723f(" (", strM1767b, ")");
        if (z2) {
            String strSubstring = string.substring(iLastIndexOf);
            AbstractC0307g.m702d(strSubstring, "substring(...)");
            if (strSubstring.equals(strM723f)) {
                return;
            }
        }
        if (z2 || !AbstractC0433r.m1028C0(string, strM723f)) {
            try {
                C0661h1 c0661h1 = C0661h1.f2048a;
                objM116u = Integer.valueOf(Color.parseColor(C0661h1.m1662d("real_name_tail_color", "#9E9E9E")));
            } catch (Throwable th) {
                objM116u = AbstractC0040p.m116u(th);
            }
            if (objM116u instanceof C0140f) {
                objM116u = -6381922;
            }
            int iIntValue = ((Number) objM116u).intValue();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(text, 0, length);
            spannableStringBuilder.append((CharSequence) strM723f);
            spannableStringBuilder.setSpan(new ForegroundColorSpan(iIntValue), length, spannableStringBuilder.length(), 33);
            threadLocal.set(Boolean.TRUE);
            try {
                if (textView.getVisibility() != 0) {
                    textView.setVisibility(0);
                }
                textView.setText(spannableStringBuilder, TextView.BufferType.SPANNABLE);
                threadLocal.set(Boolean.FALSE);
            } catch (Throwable th2) {
                threadLocal.set(Boolean.FALSE);
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m1767b(String str) {
        String strM1017V0 = AbstractC0425j.m1017V0(AbstractC0425j.m1016U0(AbstractC0425j.m1017V0(AbstractC0425j.m1016U0(AbstractC0425j.m1022a1(str).toString(), "("), ")"), "（"), "）");
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < strM1017V0.length(); i2++) {
            char cCharAt = strM1017V0.charAt(i2);
            if (!AbstractC0358S.m860J(cCharAt)) {
                sb.append(cCharAt);
            }
        }
        String string = sb.toString();
        AbstractC0307g.m702d(string, "toString(...)");
        return (string.length() != 0 && string.length() <= 16) ? string : "";
    }

    /* JADX INFO: renamed from: d */
    public static Method m1768d(Class cls) {
        for (Class superclass = cls; superclass != null && !superclass.equals(Object.class); superclass = superclass.getSuperclass()) {
            C0172c c0172cM714c = AbstractC0317q.m714c(superclass.getDeclaredMethods());
            while (c0172cM714c.hasNext()) {
                Method method = (Method) c0172cM714c.next();
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length == 2) {
                    Class<?> cls2 = parameterTypes[1];
                    AbstractC0307g.m702d(cls2, "get(...)");
                    if (m1772h(cls2) && AbstractC0040p.m92W("h", "g", "a").contains(method.getName())) {
                        method.setAccessible(true);
                        return method;
                    }
                }
            }
        }
        while (cls != null && !cls.equals(Object.class)) {
            C0172c c0172cM714c2 = AbstractC0317q.m714c(cls.getDeclaredMethods());
            while (c0172cM714c2.hasNext()) {
                Method method2 = (Method) c0172cM714c2.next();
                if (!Modifier.isStatic(method2.getModifiers()) && method2.getParameterTypes().length == 1 && AbstractC0040p.m92W("g", "a", "doscene", "doScene").contains(method2.getName())) {
                    method2.setAccessible(true);
                    return method2;
                }
            }
            cls = cls.getSuperclass();
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public static void m1769e(Class cls) {
        Object objM116u;
        C0665j c0665j = new C0665j(27, false);
        C0172c c0172cM714c = AbstractC0317q.m714c(cls.getDeclaredMethods());
        int i2 = 0;
        while (c0172cM714c.hasNext()) {
            Method method = (Method) c0172cM714c.next();
            if (!Modifier.isStatic(method.getModifiers()) && !Modifier.isAbstract(method.getModifiers())) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length >= 4) {
                    Class<?> cls2 = parameterTypes[0];
                    AbstractC0307g.m702d(cls2, "get(...)");
                    if (m1772h(cls2)) {
                        Class<?> cls3 = parameterTypes[1];
                        AbstractC0307g.m702d(cls3, "get(...)");
                        if (m1772h(cls3)) {
                            Class<?> cls4 = parameterTypes[2];
                            AbstractC0307g.m702d(cls4, "get(...)");
                            if (m1772h(cls4) && AbstractC0307g.m699a(parameterTypes[3], String.class)) {
                                method.setAccessible(true);
                                AbstractC0762d.m1952b(method, c0665j);
                                i2++;
                                m1782s("hooked scene#" + method.getName() + " params=" + parameterTypes.length);
                            }
                        }
                    }
                }
            }
        }
        for (Class superclass = cls.getSuperclass(); superclass != null && !superclass.equals(Object.class); superclass = superclass.getSuperclass()) {
            C0172c c0172cM714c2 = AbstractC0317q.m714c(superclass.getDeclaredMethods());
            while (c0172cM714c2.hasNext()) {
                Method method2 = (Method) c0172cM714c2.next();
                if (!Modifier.isStatic(method2.getModifiers()) && !Modifier.isAbstract(method2.getModifiers()) && (AbstractC0307g.m699a(method2.getName(), "onGYNetEnd") || AbstractC0307g.m699a(method2.getName(), "I"))) {
                    Class<?>[] parameterTypes2 = method2.getParameterTypes();
                    if (parameterTypes2.length >= 4) {
                        Class<?> cls5 = parameterTypes2[0];
                        AbstractC0307g.m702d(cls5, "get(...)");
                        if (m1772h(cls5)) {
                            Class<?> cls6 = parameterTypes2[1];
                            AbstractC0307g.m702d(cls6, "get(...)");
                            if (m1772h(cls6)) {
                                Class<?> cls7 = parameterTypes2[2];
                                AbstractC0307g.m702d(cls7, "get(...)");
                                if (m1772h(cls7)) {
                                    try {
                                        method2.setAccessible(true);
                                        AbstractC0762d.m1952b(method2, c0665j);
                                        i2++;
                                        m1782s("hooked " + superclass.getName() + "#" + method2.getName());
                                        objM116u = C0146l.f339a;
                                    } catch (Throwable th) {
                                        objM116u = AbstractC0040p.m116u(th);
                                    }
                                    Throwable thM465a = AbstractC0141g.m465a(objM116u);
                                    if (thM465a != null) {
                                        m1782s("skip hook " + superclass.getName() + "#" + method2.getName() + ": " + thM465a.getMessage());
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        m1782s("scene callback hooks=" + i2);
    }

    /* JADX INFO: renamed from: f */
    public static void m1770f(Activity activity, ClassLoader classLoader) {
        Object objM116u;
        String strM1778o;
        Object objM116u2;
        String strConcat;
        Object objM116u3;
        try {
            strM1778o = m1778o(activity);
        } catch (Throwable th) {
            objM116u = AbstractC0040p.m116u(th);
        }
        if (strM1778o == null || AbstractC0425j.m1013R0(strM1778o) || AbstractC0433r.m1028C0(strM1778o, "@chatroom") || AbstractC0433r.m1028C0(strM1778o, "@im.chatroom")) {
            return;
        }
        try {
            objM116u2 = AbstractC0358S.m887g(activity, "getPreferenceScreen", new Object[0]);
        } catch (Throwable th2) {
            objM116u2 = AbstractC0040p.m116u(th2);
        }
        if (objM116u2 instanceof C0140f) {
            objM116u2 = null;
        }
        if (objM116u2 == null) {
            return;
        }
        String str = (String) f2170h.get(strM1778o);
        if (str == null || (strConcat = "实名: ".concat(str)) == null) {
            strConcat = "点击获取";
        }
        try {
            objM116u3 = AbstractC0358S.m887g(objM116u2, "i", "achat_real_name_tail");
        } catch (Throwable th3) {
            objM116u3 = AbstractC0040p.m116u(th3);
        }
        Object obj = objM116u3 instanceof C0140f ? null : objM116u3;
        if (obj != null) {
            try {
                AbstractC0358S.m887g(obj, "K", "获取实名尾字");
                AbstractC0358S.m887g(obj, "H", strConcat);
                AbstractC0358S.m887g(objM116u2, "notifyDataSetChanged", new Object[0]);
                return;
            } catch (Throwable th4) {
                AbstractC0040p.m116u(th4);
                return;
            }
        }
        Object objNewInstance = AbstractC0358S.m906r(classLoader, "com.tencent.mm.ui.base.preference.Preference").getConstructor(Context.class).newInstance(activity);
        AbstractC0358S.m887g(objNewInstance, "C", "achat_real_name_tail");
        AbstractC0358S.m887g(objNewInstance, "K", "获取实名尾字");
        AbstractC0358S.m887g(objNewInstance, "H", strConcat);
        AbstractC0358S.m887g(objM116u2, "d", objNewInstance, 1);
        objM116u = AbstractC0358S.m887g(objM116u2, "notifyDataSetChanged", new Object[0]);
        Throwable thM465a = AbstractC0141g.m465a(objM116u);
        if (thM465a != null) {
            m1782s("inject profile: " + thM465a.getMessage());
        }
    }

    /* JADX INFO: renamed from: g */
    public static boolean m1771g() {
        Object objM116u;
        try {
            C0661h1 c0661h1 = C0661h1.f2048a;
            objM116u = Boolean.valueOf(C0661h1.m1661c("real_name_tail", false));
        } catch (Throwable th) {
            objM116u = AbstractC0040p.m116u(th);
        }
        Object obj = Boolean.FALSE;
        if (objM116u instanceof C0140f) {
            objM116u = obj;
        }
        return ((Boolean) objM116u).booleanValue();
    }

    /* JADX INFO: renamed from: h */
    public static boolean m1772h(Class cls) {
        return cls.equals(Integer.TYPE) || cls.equals(Integer.class);
    }

    /* JADX INFO: renamed from: i */
    public static void m1773i(Context context, String str) {
        String str2;
        AtomicBoolean atomicBoolean = f2165c;
        if (atomicBoolean.get()) {
            return;
        }
        try {
            System.loadLibrary("dexkit");
            atomicBoolean.set(true);
        } catch (Throwable th) {
            AbstractC0040p.m116u(th);
            if (str == null) {
                return;
            }
            if (Process.is64Bit()) {
                String[] strArr = Build.SUPPORTED_64_BIT_ABIS;
                AbstractC0307g.m702d(strArr, "SUPPORTED_64_BIT_ABIS");
                str2 = (String) AbstractC0179j.m536m0(strArr);
                if (str2 == null) {
                    str2 = "arm64-v8a";
                }
            } else {
                String[] strArr2 = Build.SUPPORTED_32_BIT_ABIS;
                AbstractC0307g.m702d(strArr2, "SUPPORTED_32_BIT_ABIS");
                str2 = (String) AbstractC0179j.m536m0(strArr2);
                if (str2 == null) {
                    str2 = "armeabi-v7a";
                }
            }
            File file = new File(context.getCacheDir(), AbstractC0324d.m723f("abc_", str2, "_libdexkit.so"));
            try {
                ZipFile zipFile = new ZipFile(str);
                try {
                    ZipEntry entry = zipFile.getEntry("lib/" + str2 + "/libdexkit.so");
                    if (entry == null) {
                        AbstractC0040p.m108m(zipFile, null);
                        return;
                    }
                    InputStream inputStream = zipFile.getInputStream(entry);
                    try {
                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                        try {
                            AbstractC0307g.m700b(inputStream);
                            AbstractC0040p.m115t(inputStream, fileOutputStream, 8192);
                            AbstractC0040p.m108m(fileOutputStream, null);
                            AbstractC0040p.m108m(inputStream, null);
                            AbstractC0040p.m108m(zipFile, null);
                            System.load(file.getAbsolutePath());
                            atomicBoolean.set(true);
                            return;
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                }
            } catch (Throwable th2) {
                AbstractC0040p.m116u(th2);
            }
            AbstractC0040p.m116u(th2);
        }
    }

    /* JADX INFO: renamed from: j */
    public static boolean m1774j(String str) {
        String string = AbstractC0425j.m1022a1(str).toString();
        if (string.length() == 0 || string.length() > 16) {
            return false;
        }
        if (AbstractC0425j.m1005J0(string, "*", false) || AbstractC0425j.m1005J0(string, "＊", false)) {
            return true;
        }
        Pattern patternCompile = Pattern.compile("[\\u4e00-\\u9fff·]{1,4}");
        AbstractC0307g.m702d(patternCompile, "compile(...)");
        return patternCompile.matcher(string).matches();
    }

    /* JADX INFO: renamed from: l */
    public static String m1775l(Object obj) {
        Object obj2;
        ArrayList arrayList = new ArrayList();
        Class<?> superclass = obj.getClass();
        while (true) {
            obj2 = null;
            if (superclass == null || superclass.equals(Object.class)) {
                break;
            }
            C0172c c0172cM714c = AbstractC0317q.m714c(superclass.getDeclaredFields());
            while (c0172cM714c.hasNext()) {
                Field field = (Field) c0172cM714c.next();
                if (AbstractC0307g.m699a(field.getType(), String.class)) {
                    field.setAccessible(true);
                    Object obj3 = field.get(obj);
                    String str = obj3 instanceof String ? (String) obj3 : null;
                    String string = str != null ? AbstractC0425j.m1022a1(str).toString() : null;
                    if (string == null) {
                        string = "";
                    }
                    if (m1774j(string)) {
                        arrayList.add(string);
                    }
                }
            }
            superclass = superclass.getSuperclass();
        }
        for (Object obj4 : arrayList) {
            String str2 = (String) obj4;
            if (AbstractC0425j.m1005J0(str2, "*", false) || AbstractC0425j.m1005J0(str2, "＊", false)) {
                obj2 = obj4;
                break;
            }
        }
        String str3 = (String) obj2;
        return str3 == null ? (String) AbstractC0181l.m544p0(arrayList) : str3;
    }

    /* JADX INFO: renamed from: m */
    public static Object m1776m(Object obj, String str) {
        C0140f c0140fM116u;
        try {
            for (Class<?> superclass = obj.getClass(); superclass != null && !superclass.equals(Object.class); superclass = superclass.getSuperclass()) {
                try {
                    Field declaredField = superclass.getDeclaredField(str);
                    declaredField.setAccessible(true);
                    return declaredField.get(obj);
                } catch (Throwable th) {
                    AbstractC0040p.m116u(th);
                }
            }
            c0140fM116u = null;
        } catch (Throwable th2) {
            c0140fM116u = AbstractC0040p.m116u(th2);
        }
        if (c0140fM116u instanceof C0140f) {
            return null;
        }
        return c0140fM116u;
    }

    /* JADX INFO: renamed from: n */
    public static String m1777n(Object obj, String str) {
        String string;
        Object objM1776m = m1776m(obj, str);
        String str2 = objM1776m instanceof String ? (String) objM1776m : null;
        if (str2 == null || (string = AbstractC0425j.m1022a1(str2).toString()) == null || string.length() <= 0) {
            return null;
        }
        return string;
    }

    /* JADX INFO: renamed from: o */
    public static String m1778o(Activity activity) {
        Intent intent = activity.getIntent();
        if (intent == null) {
            return null;
        }
        Iterator it = AbstractC0182m.m556h0("Contact_User", "Contact_UserName", "User", "userName", "Chat_User", "Contact_Alias").iterator();
        while (it.hasNext()) {
            String stringExtra = intent.getStringExtra((String) it.next());
            String string = stringExtra != null ? AbstractC0425j.m1022a1(stringExtra).toString() : null;
            if (string == null) {
                string = "";
            }
            if (string.length() > 0) {
                return string;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: p */
    public static void m1779p(ClassLoader classLoader) {
        Object objM116u;
        Object objM116u2;
        Object objM116u3;
        Method methodM1768d;
        Method method;
        Method method2;
        Object obj;
        Method methodM1768d2;
        try {
            Class<?> clsLoadClass = classLoader.loadClass("rk0.k1");
            Method[] declaredMethods = clsLoadClass.getDeclaredMethods();
            AbstractC0307g.m702d(declaredMethods, "getDeclaredMethods(...)");
            int length = declaredMethods.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    method = null;
                    break;
                }
                method = declaredMethods[i2];
                if (Modifier.isStatic(method.getModifiers()) && AbstractC0307g.m699a(method.getName(), "i")) {
                    Class<?>[] parameterTypes = method.getParameterTypes();
                    AbstractC0307g.m702d(parameterTypes, "getParameterTypes(...)");
                    if (parameterTypes.length == 0) {
                        break;
                    }
                }
                i2++;
            }
            if (method != null) {
                method.setAccessible(true);
                method.invoke(null, null);
            }
            Method[] declaredMethods2 = clsLoadClass.getDeclaredMethods();
            AbstractC0307g.m702d(declaredMethods2, "getDeclaredMethods(...)");
            int length2 = declaredMethods2.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length2) {
                    method2 = null;
                    break;
                }
                method2 = declaredMethods2[i3];
                if (Modifier.isStatic(method2.getModifiers()) && AbstractC0307g.m699a(method2.getName(), "n")) {
                    Class<?>[] parameterTypes2 = method2.getParameterTypes();
                    AbstractC0307g.m702d(parameterTypes2, "getParameterTypes(...)");
                    if (parameterTypes2.length == 0) {
                        break;
                    }
                }
                i3++;
            }
            if (method2 != null) {
                method2.setAccessible(true);
                Object objInvoke = method2.invoke(null, null);
                if (objInvoke != null) {
                    Field[] declaredFields = objInvoke.getClass().getDeclaredFields();
                    AbstractC0307g.m702d(declaredFields, "getDeclaredFields(...)");
                    int length3 = declaredFields.length;
                    int i4 = 0;
                    while (true) {
                        if (i4 >= length3) {
                            obj = null;
                            break;
                        }
                        Field field = declaredFields[i4];
                        field.setAccessible(true);
                        obj = field.get(objInvoke);
                        if (obj == null || m1768d(obj.getClass()) == null) {
                            obj = null;
                        }
                        if (obj != null) {
                            break;
                        } else {
                            i4++;
                        }
                    }
                    if (obj != null && (methodM1768d2 = m1768d(obj.getClass())) != null) {
                        f2177o = obj;
                        f2176n = methodM1768d2;
                        m1782s("net queue=" + obj.getClass().getName() + "#" + methodM1768d2.getName());
                        return;
                    }
                }
            }
            objM116u = C0146l.f339a;
        } catch (Throwable th) {
            objM116u = AbstractC0040p.m116u(th);
        }
        Throwable thM465a = AbstractC0141g.m465a(objM116u);
        if (thM465a != null) {
            m1782s("rk0.k1 queue: " + thM465a.getMessage());
        }
        for (String str : AbstractC0182m.m556h0("com.tencent.mm.modelbase.s1", "com.tencent.mm.modelbase.n1", "com.tencent.mm.kernel.h", "com.tencent.mm.model.bh")) {
            try {
                objM116u2 = classLoader.loadClass(str);
            } catch (Throwable th2) {
                objM116u2 = AbstractC0040p.m116u(th2);
            }
            if (objM116u2 instanceof C0140f) {
                objM116u2 = null;
            }
            Class cls = (Class) objM116u2;
            if (cls != null) {
                C0172c c0172cM714c = AbstractC0317q.m714c(cls.getDeclaredMethods());
                while (c0172cM714c.hasNext()) {
                    Method method3 = (Method) c0172cM714c.next();
                    if (Modifier.isStatic(method3.getModifiers())) {
                        Class<?>[] parameterTypes3 = method3.getParameterTypes();
                        AbstractC0307g.m702d(parameterTypes3, "getParameterTypes(...)");
                        if (!(parameterTypes3.length == 0)) {
                            continue;
                        } else {
                            try {
                                method3.setAccessible(true);
                                objM116u3 = method3.invoke(null, null);
                            } catch (Throwable th3) {
                                objM116u3 = AbstractC0040p.m116u(th3);
                            }
                            if (objM116u3 instanceof C0140f) {
                                objM116u3 = null;
                            }
                            if (objM116u3 != null && (methodM1768d = m1768d(objM116u3.getClass())) != null) {
                                f2177o = objM116u3;
                                f2176n = methodM1768d;
                                m1782s("net queue via " + str);
                                return;
                            }
                        }
                    }
                }
            }
        }
        m1782s("net queue unresolved");
    }

    /* JADX INFO: renamed from: q */
    public static void m1780q() {
        Set setEntrySet = f2170h.entrySet();
        AbstractC0307g.m702d(setEntrySet, "<get-entries>(...)");
        String strM546r0 = AbstractC0181l.m546r0(setEntrySet, ",", "{", "}", new C0570A(23), 24);
        Iterator it = AbstractC0040p.m82F("/storage/emulated/0/Android/media/com.tencent.mm/OKK/real_names.json").iterator();
        while (it.hasNext()) {
            try {
                File file = new File((String) it.next());
                File parentFile = file.getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                }
                AbstractC0270k.m693j0(file, strM546r0, AbstractC0416a.f921a);
            } catch (Throwable th) {
                AbstractC0040p.m116u(th);
            }
        }
    }

    /* JADX INFO: renamed from: r */
    public static boolean m1781r(Class cls) {
        C0172c c0172cM714c = AbstractC0317q.m714c(cls.getDeclaredConstructors());
        while (c0172cM714c.hasNext()) {
            Constructor constructor = (Constructor) c0172cM714c.next();
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            if (parameterTypes.length == 2 && AbstractC0307g.m699a(parameterTypes[0], String.class) && AbstractC0307g.m699a(parameterTypes[1], String.class)) {
                constructor.setAccessible(true);
                f2175m = constructor;
                return true;
            }
        }
        C0172c c0172cM714c2 = AbstractC0317q.m714c(cls.getDeclaredConstructors());
        while (c0172cM714c2.hasNext()) {
            Constructor constructor2 = (Constructor) c0172cM714c2.next();
            Class<?>[] parameterTypes2 = constructor2.getParameterTypes();
            if (parameterTypes2.length == 1 && AbstractC0307g.m699a(parameterTypes2[0], String.class)) {
                constructor2.setAccessible(true);
                f2175m = constructor2;
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: s */
    public static void m1782s(String str) {
        try {
            AbstractC0762d.m1954d("[OKK-RealNameTail] " + str);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m1783c(String str, String str2, InterfaceC0286l interfaceC0286l) {
        Object objM116u;
        Object objNewInstance;
        ConcurrentHashMap concurrentHashMap;
        ConcurrentHashMap concurrentHashMap2;
        Object obj;
        Method method;
        Object objInvoke;
        if (AbstractC0425j.m1013R0(str) || AbstractC0433r.m1028C0(str, "@chatroom")) {
            return;
        }
        String str3 = (String) f2170h.get(str);
        if (str3 != null) {
            if (interfaceC0286l != null) {
                interfaceC0286l.invoke(str3);
                return;
            }
            return;
        }
        if (f2171i.add(str)) {
            C0641b c0641b = new C0641b(str, interfaceC0286l, 2);
            Constructor constructor = f2175m;
            if (constructor == null) {
                c0641b.invoke(new C0676m1("scene not resolved"));
                return;
            }
            try {
                int length = constructor.getParameterTypes().length;
                if (length == 1) {
                    objNewInstance = constructor.newInstance(str);
                } else {
                    if (length != 2) {
                        c0641b.invoke(new C0676m1("bad ctor"));
                        return;
                    }
                    objNewInstance = constructor.newInstance(str, str2 == null ? "" : str2);
                }
                concurrentHashMap = f2173k;
                concurrentHashMap.put(objNewInstance, new C0139e(str, str2));
                concurrentHashMap2 = f2174l;
                concurrentHashMap2.put(objNewInstance, c0641b);
                obj = f2177o;
                method = f2176n;
                if (obj == null || method == null) {
                    ClassLoader classLoader = f2178p;
                    if (classLoader != null) {
                        m1779p(classLoader);
                    }
                    obj = f2177o;
                    method = f2176n;
                }
            } catch (Throwable th) {
                objM116u = AbstractC0040p.m116u(th);
            }
            if (obj != null && method != null) {
                method.setAccessible(true);
                int length2 = method.getParameterTypes().length;
                if (length2 == 1) {
                    objInvoke = method.invoke(obj, objNewInstance);
                } else {
                    if (length2 != 2) {
                        c0641b.invoke(new C0676m1("bad doScene"));
                        return;
                    }
                    objInvoke = method.invoke(obj, objNewInstance, 0);
                }
                m1782s("sent beforetransfer " + str + " room=" + str2 + " doSceneRet=" + objInvoke + " queue=" + obj.getClass().getSimpleName() + "#" + method.getName());
                objM116u = Boolean.valueOf(f2169g.postDelayed(new RunnableC0573B(objNewInstance, str, this, c0641b), 15000L));
                Throwable thM465a = AbstractC0141g.m465a(objM116u);
                if (thM465a != null) {
                    f2171i.remove(str);
                    String message = thM465a.getMessage();
                    if (message == null) {
                        message = "send err";
                    }
                    c0641b.invoke(new C0676m1(message));
                    return;
                }
                return;
            }
            concurrentHashMap.remove(objNewInstance);
            concurrentHashMap2.remove(objNewInstance);
            c0641b.invoke(new C0676m1("no net queue"));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0100 A[EDGE_INSN: B:114:0x0100->B:71:0x0100 BREAK  A[LOOP:2: B:35:0x008b->B:117:0x008b], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0127  */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.lang.Object, java.lang.reflect.Method[]] */
    /* JADX WARN: Type inference failed for: r13v0, types: [D0.f] */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX INFO: renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m1784k(Object obj, View view, Object obj2) {
        Iterator it;
        ?? M116u;
        Object objM116u;
        boolean zBooleanValue;
        Class<?> superclass;
        int i2 = 3;
        if (!m1771g()) {
            return;
        }
        C0621R0 c0621r0 = C0621R0.f1913a;
        C0613O0 c0613o0M1524f = C0621R0.m1524f(obj2);
        AtomicBoolean atomicBoolean = f2167e;
        if (c0613o0M1524f == null) {
            if (atomicBoolean.compareAndSet(false, true)) {
                m1782s("skip: identity null msg=".concat(obj2.getClass().getName()));
                return;
            }
            return;
        }
        if (!c0613o0M1524f.f1893c) {
            return;
        }
        try {
        } catch (Throwable th) {
            AbstractC0040p.m116u(th);
            it = AbstractC0182m.m556h0("getIsSend", "isSend").iterator();
            while (true) {
                if (it.hasNext()) {
                }
            }
            zBooleanValue = false;
            String str = c0613o0M1524f.f1891a;
            String str2 = c0613o0M1524f.f1892b;
            if (zBooleanValue) {
            }
        }
        for (superclass = obj2.getClass(); superclass != null && !superclass.equals(Object.class); superclass = superclass.getSuperclass()) {
            try {
                Field declaredField = superclass.getDeclaredField("field_isSend");
                declaredField.setAccessible(true);
                Object obj3 = declaredField.get(obj2);
                if (obj3 instanceof Number) {
                    if (((Number) obj3).intValue() == 1) {
                        zBooleanValue = true;
                    }
                    String str3 = c0613o0M1524f.f1891a;
                    String str22 = c0613o0M1524f.f1892b;
                    if (zBooleanValue) {
                        if (atomicBoolean.compareAndSet(false, true)) {
                            m1782s("skip self room=" + str3 + " sender=" + str22);
                            return;
                        }
                        return;
                    }
                    TextView textViewM1525d = C0621R0.f1913a.m1525d(view, obj);
                    if (textViewM1525d == null) {
                        m1782s("nickname missing room=" + str3 + " sender=" + str22 + " holder=" + obj.getClass().getName());
                        m1783c(str22, str3, null);
                        return;
                    }
                    textViewM1525d.setTag(2113929217, str22);
                    Object objComputeIfAbsent = f2172j.computeIfAbsent(str22, new C0612O(new C0570A(24), 7));
                    AbstractC0307g.m702d(objComputeIfAbsent, "computeIfAbsent(...)");
                    CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) objComputeIfAbsent;
                    if (copyOnWriteArrayList.isEmpty()) {
                        copyOnWriteArrayList.add(new WeakReference(textViewM1525d));
                    } else {
                        Iterator it2 = copyOnWriteArrayList.iterator();
                        while (it2.hasNext()) {
                            if (((WeakReference) it2.next()).get() == textViewM1525d) {
                                break;
                            }
                        }
                        copyOnWriteArrayList.add(new WeakReference(textViewM1525d));
                    }
                    if (copyOnWriteArrayList.size() > 32) {
                        AbstractC0188s.m562n0(copyOnWriteArrayList, new C0570A(22));
                    }
                    boolean zCompareAndSet = f2166d.compareAndSet(false, true);
                    ConcurrentHashMap concurrentHashMap = f2170h;
                    if (zCompareAndSet) {
                        CharSequence text = textViewM1525d.getText();
                        m1782s("bound room=" + str3 + " sender=" + str22 + " nick=" + ((Object) text) + " vis=" + textViewM1525d.getVisibility() + " cache=" + concurrentHashMap.get(str22));
                    }
                    String str4 = (String) concurrentHashMap.get(str22);
                    if (str4 == null) {
                        m1783c(str22, str3, new C0591H(i2, c0613o0M1524f));
                        return;
                    } else {
                        m1766a(textViewM1525d, str22, str4);
                        textViewM1525d.post(new RunnableC0486k(textViewM1525d, c0613o0M1524f, str4, i2));
                        return;
                    }
                }
                if (obj3 instanceof Boolean) {
                    zBooleanValue = ((Boolean) obj3).booleanValue();
                }
                String str32 = c0613o0M1524f.f1891a;
                String str222 = c0613o0M1524f.f1892b;
                if (zBooleanValue) {
                }
                zBooleanValue = false;
                String str322 = c0613o0M1524f.f1891a;
                String str2222 = c0613o0M1524f.f1892b;
                if (zBooleanValue) {
                }
            } catch (Throwable th2) {
                AbstractC0040p.m116u(th2);
            }
        }
        it = AbstractC0182m.m556h0("getIsSend", "isSend").iterator();
        while (true) {
            if (it.hasNext()) {
                break;
            }
            String str5 = (String) it.next();
            try {
                ?? methods = obj2.getClass().getMethods();
                AbstractC0307g.m702d(methods, "getMethods(...)");
                int length = methods.length;
                int i3 = 0;
                while (true) {
                    if (i3 >= length) {
                        M116u = 0;
                        break;
                    }
                    M116u = methods[i3];
                    if (AbstractC0307g.m699a(M116u.getName(), str5)) {
                        Class<?>[] parameterTypes = M116u.getParameterTypes();
                        AbstractC0307g.m702d(parameterTypes, "getParameterTypes(...)");
                        if (parameterTypes.length == 0) {
                            break;
                        }
                    }
                    i3++;
                }
            } catch (Throwable th3) {
                M116u = AbstractC0040p.m116u(th3);
            }
            boolean z2 = M116u instanceof C0140f;
            ?? r13 = M116u;
            if (z2) {
                r13 = 0;
            }
            Method method = (Method) r13;
            if (method != null) {
                try {
                    method.setAccessible(true);
                    objM116u = method.invoke(obj2, null);
                } catch (Throwable th4) {
                    objM116u = AbstractC0040p.m116u(th4);
                }
                if (objM116u instanceof C0140f) {
                    objM116u = null;
                }
                if (!(objM116u instanceof Number)) {
                    if (objM116u instanceof Boolean) {
                        zBooleanValue = ((Boolean) objM116u).booleanValue();
                        break;
                    }
                } else if (((Number) objM116u).intValue() == 1) {
                }
            }
        }
        zBooleanValue = false;
        String str3222 = c0613o0M1524f.f1891a;
        String str22222 = c0613o0M1524f.f1892b;
        if (zBooleanValue) {
        }
    }
}
