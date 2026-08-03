package p062e8;

import android.content.Context;
import android.content.SharedPreferences;
import gg.AbstractC1416l;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import okhttp3.HttpUrl;
import p019b4.C0178b;
import p068eh.AbstractC0921a;
import p173lh.C2570d;
import p210o8.C3087k;
import p218og.AbstractC3149m;
import p276sf.C3959f;
import tf.AbstractC4166m;
import tf.C4173t;

/* JADX INFO: renamed from: e8.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0828b {

    /* JADX INFO: renamed from: a */
    public static final C0828b f2478a = new C0828b();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static void m2085a(SharedPreferences sharedPreferences, String str, String str2) {
        sharedPreferences.getClass();
        try {
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            if (!AbstractC1416l.m3825a(sharedPreferences.getString("cache.key", HttpUrl.FRAGMENT_ENCODE_SET), str)) {
                editorEdit.clear().putString("cache.key", str);
            }
            editorEdit.remove(str2).apply();
        } catch (Throwable unused) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static boolean m2086b(SharedPreferences sharedPreferences, String str) {
        Object c3959f;
        if (AbstractC3149m.m6721t0(str)) {
            return false;
        }
        if (AbstractC1416l.m3825a(sharedPreferences.getString("cache.key", HttpUrl.FRAGMENT_ENCODE_SET), str)) {
            return true;
        }
        try {
            c3959f = Boolean.valueOf(sharedPreferences.edit().clear().putString("cache.key", str).commit());
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        Object obj = Boolean.FALSE;
        if (c3959f instanceof C3959f) {
            c3959f = obj;
        }
        return ((Boolean) c3959f).booleanValue() && AbstractC1416l.m3825a(sharedPreferences.getString("cache.key", HttpUrl.FRAGMENT_ENCODE_SET), str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static Method m2087c(SharedPreferences sharedPreferences, String str, ClassLoader classLoader, String str2) {
        String string;
        Object c3959f;
        sharedPreferences.getClass();
        classLoader.getClass();
        if (AbstractC3149m.m6721t0(str) || !m2086b(sharedPreferences, str) || (string = sharedPreferences.getString(str2, HttpUrl.FRAGMENT_ENCODE_SET)) == null) {
            return null;
        }
        if (AbstractC3149m.m6721t0(string)) {
            string = null;
        }
        if (string == null) {
            return null;
        }
        try {
            c3959f = new C2570d(string).m6023b(classLoader);
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        return (Method) (c3959f instanceof C3959f ? null : c3959f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static Constructor m2088d(SharedPreferences sharedPreferences, String str, ClassLoader classLoader, String str2) {
        String string;
        Object c3959f;
        sharedPreferences.getClass();
        classLoader.getClass();
        if (AbstractC3149m.m6721t0(str) || !m2086b(sharedPreferences, str) || (string = sharedPreferences.getString(str2, HttpUrl.FRAGMENT_ENCODE_SET)) == null) {
            return null;
        }
        if (AbstractC3149m.m6721t0(string)) {
            string = null;
        }
        if (string == null) {
            return null;
        }
        try {
            c3959f = new C2570d(string).m6022a(classLoader);
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        return (Constructor) (c3959f instanceof C3959f ? null : c3959f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static Method m2089e(SharedPreferences sharedPreferences, String str, ClassLoader classLoader, String str2) {
        Object c3959f;
        classLoader.getClass();
        if (AbstractC3149m.m6721t0(str)) {
            return null;
        }
        String string = sharedPreferences.getString("cache.key", HttpUrl.FRAGMENT_ENCODE_SET);
        if (string == null) {
            string = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        if (AbstractC3149m.m6721t0(string) || AbstractC3149m.m6721t0(str)) {
            return null;
        }
        if (!string.equals(str)) {
            String strM6700O0 = AbstractC3149m.m6700O0(string, '|', HttpUrl.FRAGMENT_ENCODE_SET);
            String strM6700O02 = AbstractC3149m.m6700O0(str, '|', HttpUrl.FRAGMENT_ENCODE_SET);
            if (AbstractC3149m.m6721t0(strM6700O0) || !strM6700O0.equals(strM6700O02)) {
                return null;
            }
        }
        String string2 = sharedPreferences.getString(str2, HttpUrl.FRAGMENT_ENCODE_SET);
        if (string2 == null) {
            return null;
        }
        if (AbstractC3149m.m6721t0(string2)) {
            string2 = null;
        }
        if (string2 == null) {
            return null;
        }
        try {
            c3959f = new C2570d(string2).m6023b(classLoader);
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        return (Method) (c3959f instanceof C3959f ? null : c3959f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static List m2090f(SharedPreferences sharedPreferences, String str, ClassLoader classLoader, String str2) {
        String string;
        Object c3959f;
        Method method;
        sharedPreferences.getClass();
        classLoader.getClass();
        if (!AbstractC3149m.m6721t0(str) && m2086b(sharedPreferences, str) && (string = sharedPreferences.getString(str2, HttpUrl.FRAGMENT_ENCODE_SET)) != null) {
            if (AbstractC3149m.m6721t0(string)) {
                string = null;
            }
            if (string != null) {
                List<String> listM6691F0 = AbstractC3149m.m6691F0(string, new char[]{'\n'}, 6);
                ArrayList arrayList = new ArrayList();
                for (String str3 : listM6691F0) {
                    if (AbstractC3149m.m6721t0(str3)) {
                        str3 = null;
                    }
                    if (str3 != null) {
                        try {
                            c3959f = new C2570d(str3).m6023b(classLoader);
                        } catch (Throwable th2) {
                            c3959f = new C3959f(th2);
                        }
                        if (c3959f instanceof C3959f) {
                            c3959f = null;
                        }
                        method = (Method) c3959f;
                    } else {
                        method = null;
                    }
                    if (method != null) {
                        arrayList.add(method);
                    }
                }
                return arrayList;
            }
        }
        return C4173t.f13710g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static String m2091g(Context context, ClassLoader classLoader) {
        context.getClass();
        classLoader.getClass();
        return C3087k.m6557a(context, classLoader).f8202h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static void m2092h(SharedPreferences sharedPreferences, String str, String str2, Method method) {
        sharedPreferences.getClass();
        if (AbstractC3149m.m6721t0(str) || method == null) {
            return;
        }
        try {
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            if (!AbstractC1416l.m3825a(sharedPreferences.getString("cache.key", HttpUrl.FRAGMENT_ENCODE_SET), str)) {
                editorEdit.clear();
            }
            editorEdit.putString("cache.key", str).putString(str2, m2095l(method)).apply();
        } catch (Throwable unused) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public static void m2093i(SharedPreferences sharedPreferences, String str, String str2, Constructor constructor) {
        sharedPreferences.getClass();
        if (AbstractC3149m.m6721t0(str)) {
            return;
        }
        try {
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            if (!AbstractC1416l.m3825a(sharedPreferences.getString("cache.key", HttpUrl.FRAGMENT_ENCODE_SET), str)) {
                editorEdit.clear();
            }
            editorEdit.putString("cache.key", str).putString(str2, m2094k(constructor)).apply();
        } catch (Throwable unused) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public static String m2094k(Constructor constructor) {
        StringBuilder sb2 = new StringBuilder("L");
        String strReplace = constructor.getDeclaringClass().getName().replace('.', '/');
        strReplace.getClass();
        sb2.append(strReplace);
        sb2.append(";-><init>(");
        Class<?>[] parameterTypes = constructor.getParameterTypes();
        parameterTypes.getClass();
        for (Class<?> cls : parameterTypes) {
            cls.getClass();
            sb2.append(m2096m(cls));
        }
        sb2.append(")V");
        return sb2.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public static String m2095l(Method method) {
        StringBuilder sb2 = new StringBuilder("L");
        String strReplace = method.getDeclaringClass().getName().replace('.', '/');
        strReplace.getClass();
        sb2.append(strReplace);
        sb2.append(";->");
        sb2.append(method.getName());
        sb2.append('(');
        Class<?>[] parameterTypes = method.getParameterTypes();
        parameterTypes.getClass();
        for (Class<?> cls : parameterTypes) {
            cls.getClass();
            sb2.append(m2096m(cls));
        }
        sb2.append(')');
        Class<?> returnType = method.getReturnType();
        returnType.getClass();
        sb2.append(m2096m(returnType));
        return sb2.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public static String m2096m(Class cls) {
        if (cls.isPrimitive()) {
            return cls.equals(Void.TYPE) ? "V" : cls.equals(Boolean.TYPE) ? "Z" : cls.equals(Byte.TYPE) ? "B" : cls.equals(Character.TYPE) ? "C" : cls.equals(Short.TYPE) ? "S" : cls.equals(Integer.TYPE) ? "I" : cls.equals(Long.TYPE) ? "J" : cls.equals(Float.TYPE) ? "F" : cls.equals(Double.TYPE) ? "D" : "V";
        }
        if (cls.isArray()) {
            String strReplace = cls.getName().replace('.', '/');
            strReplace.getClass();
            return strReplace;
        }
        String strReplace2 = cls.getName().replace('.', '/');
        strReplace2.getClass();
        return AbstractC0921a.m2251n("L", strReplace2, ";");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public final void m2097j(SharedPreferences sharedPreferences, String str, String str2, List list) {
        sharedPreferences.getClass();
        if (AbstractC3149m.m6721t0(str) || list.isEmpty()) {
            return;
        }
        try {
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            if (!AbstractC1416l.m3825a(sharedPreferences.getString("cache.key", HttpUrl.FRAGMENT_ENCODE_SET), str)) {
                editorEdit.clear();
            }
            SharedPreferences.Editor editorPutString = editorEdit.putString("cache.key", str);
            HashSet hashSet = new HashSet();
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (hashSet.add(((Method) obj).toGenericString())) {
                    arrayList.add(obj);
                }
            }
            editorPutString.putString(str2, AbstractC4166m.m8392A1(arrayList, "\n", null, null, new C0178b(this), 30)).apply();
        } catch (Throwable unused) {
        }
    }
}
