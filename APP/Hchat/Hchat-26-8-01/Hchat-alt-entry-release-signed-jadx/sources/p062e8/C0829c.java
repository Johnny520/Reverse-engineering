package p062e8;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.SparseArray;
import android.view.View;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import ch.C0568c;
import ch.C0570e;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import okhttp3.HttpUrl;
import org.luckypray.dexkit.DexKitBridge;
import p025bc.AbstractC0255e;
import p086fh.C1243a;
import p086fh.C1253k;
import p099h.Hchat.utils.KavaReflector;
import p115hh.C1724i;
import p115hh.C1730o;
import p115hh.C1731p;
import p210o8.C3087k;
import p300ub.AbstractC4302b;
import tf.AbstractC4165l;

/* JADX INFO: renamed from: e8.c */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0829c {

    /* JADX INFO: renamed from: a */
    public final DexKitBridge f2479a;

    /* JADX INFO: renamed from: b */
    public final ClassLoader f2480b;

    /* JADX INFO: renamed from: c */
    public final SharedPreferences f2481c;

    /* JADX INFO: renamed from: d */
    public final String f2482d;

    /* JADX INFO: renamed from: e */
    public Class f2483e;

    /* JADX INFO: renamed from: f */
    public Class f2484f;

    /* JADX INFO: renamed from: g */
    public Method f2485g;

    /* JADX INFO: renamed from: h */
    public Method f2486h;

    /* JADX INFO: renamed from: i */
    public Method f2487i;

    /* JADX INFO: renamed from: j */
    public Method f2488j;

    /* JADX INFO: renamed from: k */
    public Class f2489k;

    /* JADX INFO: renamed from: l */
    public Class f2490l;

    /* JADX INFO: renamed from: m */
    public Class f2491m;

    /* JADX INFO: renamed from: n */
    public Class f2492n;

    /* JADX INFO: renamed from: o */
    public Class f2493o;

    /* JADX INFO: renamed from: p */
    public Class f2494p;

    /* JADX INFO: renamed from: q */
    public Class f2495q;

    /* JADX INFO: renamed from: r */
    public Class f2496r;

    /* JADX INFO: renamed from: s */
    public Class f2497s;

    /* JADX INFO: renamed from: t */
    public Class f2498t;

    /* JADX INFO: renamed from: u */
    public Method f2499u;

    /* JADX INFO: renamed from: v */
    public Method f2500v;

    /* JADX INFO: renamed from: w */
    public Class f2501w;

    /* JADX INFO: renamed from: x */
    public Method f2502x;

    /* JADX INFO: renamed from: y */
    public Method f2503y;

    /* JADX INFO: renamed from: z */
    public Class f2504z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0829c(DexKitBridge dexKitBridge, ClassLoader classLoader, Context context) {
        this.f2479a = dexKitBridge;
        this.f2480b = classLoader;
        this.f2481c = AbstractC4302b.m8640c(context, "Hchat_settings_dex_cache");
        this.f2482d = C3087k.m6557a(context, classLoader).f8202h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static int m2098a(Class cls, Class cls2) {
        int i9 = 0;
        while (cls != null && cls != Object.class) {
            for (Method method : KavaReflector.declaredMethods(cls)) {
                if (method.getParameterCount() == 0 && method.getReturnType() == cls2) {
                    i9++;
                }
            }
            cls = cls.getSuperclass();
        }
        return i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static Method m2099b(Class cls) {
        for (Method method : KavaReflector.declaredMethods(cls)) {
            Class<?>[] parameterTypes = method.getParameterTypes();
            if ("onItemClick".equals(method.getName()) && method.getReturnType() == Void.TYPE && parameterTypes.length == 4 && AdapterView.class.isAssignableFrom(parameterTypes[0]) && View.class.isAssignableFrom(parameterTypes[1]) && parameterTypes[2] == Integer.TYPE && parameterTypes[3] == Long.TYPE) {
                return method;
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static boolean m2100d(Class cls, Class cls2) {
        for (Field field : KavaReflector.declaredFields(cls)) {
            if (!KavaReflector.isStatic(field) && cls2.isAssignableFrom(field.getType())) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public static void m2101i(SharedPreferences.Editor editor, String str, Class cls) {
        editor.putString(str, cls != null ? cls.getName() : HttpUrl.FRAGMENT_ENCODE_SET);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public static void m2102j(SharedPreferences.Editor editor, String str, Method method) {
        String string;
        if (method != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(method.getDeclaringClass().getName());
            sb2.append("#");
            sb2.append(method.getName());
            StringBuilder sb3 = new StringBuilder("(");
            Class<?>[] parameterTypes = method.getParameterTypes();
            for (int i9 = 0; i9 < parameterTypes.length; i9++) {
                if (i9 > 0) {
                    sb3.append(',');
                }
                sb3.append(parameterTypes[i9].getName());
            }
            sb3.append(')');
            sb2.append(sb3.toString());
            string = sb2.toString();
        } else {
            string = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        editor.putString(str, string);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final Class m2103c(String str) {
        try {
            return KavaReflector.loadClass(str, this.f2480b);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final boolean m2104e() {
        return (this.f2483e == null && this.f2485g == null && this.f2486h == null && this.f2487i == null && this.f2488j == null && this.f2489k == null && this.f2490l == null && this.f2491m == null && this.f2492n == null && this.f2493o == null && this.f2494p == null && this.f2495q == null && this.f2496r == null && this.f2497s == null && this.f2498t == null && this.f2501w == null && this.f2502x == null && this.f2503y == null && this.f2504z == null) ? false : true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final Class m2105f(String str) {
        try {
            SharedPreferences sharedPreferences = this.f2481c;
            String string = HttpUrl.FRAGMENT_ENCODE_SET;
            if (sharedPreferences != null) {
                string = sharedPreferences.getString(str, HttpUrl.FRAGMENT_ENCODE_SET);
            }
            if (string != null && !string.isEmpty()) {
                return KavaReflector.loadClass(string, this.f2480b);
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final Method m2106g(String str) {
        try {
            SharedPreferences sharedPreferences = this.f2481c;
            String string = HttpUrl.FRAGMENT_ENCODE_SET;
            if (sharedPreferences != null) {
                string = sharedPreferences.getString(str, HttpUrl.FRAGMENT_ENCODE_SET);
            }
            if (string != null && string.length() != 0) {
                int iIndexOf = string.indexOf(35);
                int i9 = iIndexOf + 1;
                int iIndexOf2 = string.indexOf(40, i9);
                int i10 = iIndexOf2 + 1;
                int iIndexOf3 = string.indexOf(41, i10);
                if (iIndexOf > 0 && iIndexOf2 > iIndexOf && iIndexOf3 >= iIndexOf2) {
                    return KavaReflector.findDeclaredMethod(KavaReflector.loadClass(string.substring(0, iIndexOf), this.f2480b), string.substring(i9, iIndexOf2), m2107h(string.substring(i10, iIndexOf3)));
                }
                return null;
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public final Class[] m2107h(String str) {
        if (str.length() == 0) {
            return new Class[0];
        }
        String[] strArrSplit = str.split(",");
        Class[] clsArr = new Class[strArrSplit.length];
        for (int i9 = 0; i9 < strArrSplit.length; i9++) {
            String strTrim = strArrSplit[i9].trim();
            clsArr[i9] = "boolean".equals(strTrim) ? Boolean.TYPE : "byte".equals(strTrim) ? Byte.TYPE : "char".equals(strTrim) ? Character.TYPE : "short".equals(strTrim) ? Short.TYPE : "int".equals(strTrim) ? Integer.TYPE : "long".equals(strTrim) ? Long.TYPE : "float".equals(strTrim) ? Float.TYPE : "double".equals(strTrim) ? Double.TYPE : "void".equals(strTrim) ? Void.TYPE : KavaReflector.loadClass(strTrim, this.f2480b);
        }
        return clsArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:10:0x001a  */
    /* JADX INFO: renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2108k(boolean z9) {
        boolean zM2104e;
        String str = this.f2482d;
        SharedPreferences sharedPreferences = this.f2481c;
        if (sharedPreferences == null || str == null || str.length() == 0) {
            zM2104e = false;
        } else {
            try {
            } catch (Throwable th2) {
                th2.getMessage();
            }
            if (sharedPreferences.getBoolean("cache.complete", false)) {
                if (str.equals(sharedPreferences.getString("cache.key", HttpUrl.FRAGMENT_ENCODE_SET))) {
                    this.f2483e = m2105f("preferenceClass");
                    this.f2484f = m2105f("iconPreferenceClass");
                    this.f2485g = m2106g("methodSetKey");
                    this.f2486h = m2106g("methodSetTitle");
                    this.f2487i = m2106g("methodGetKey");
                    this.f2488j = m2106g("methodAddPref");
                    this.f2489k = m2105f("settingItemClassesProviderClass");
                    this.f2490l = m2105f("baseSettingItemClass");
                    this.f2491m = m2105f("settingLocationClass");
                    this.f2492n = m2105f("settingGroupMainClass");
                    this.f2493o = m2105f("settingGroupAccountInfoClass");
                    this.f2494p = m2105f("settingGroupPersonalInfoClass");
                    this.f2495q = m2105f("settingAdditionHeaderSearchClass");
                    this.f2496r = m2105f("baseSettingPrefUIClass");
                    this.f2497s = m2105f("baseSettingUIClass");
                    this.f2498t = m2105f("mainSettingsUIClass");
                    this.f2499u = m2106g("methodAccountInfoReturns1");
                    this.f2500v = m2106g("methodAccountInfoSettingKey");
                    this.f2501w = m2105f("plusSubMenuHelperClass");
                    this.f2502x = m2106g("plusSubMenuAdapterMethod");
                    this.f2503y = m2106g("plusSubMenuOnItemClickMethod");
                    this.f2504z = m2105f("settingsUIClass");
                    zM2104e = m2104e();
                } else {
                    try {
                        sharedPreferences.edit().clear().putString("cache.key", str).commit();
                    } catch (Throwable unused) {
                    }
                }
                zM2104e = false;
            }
        }
        if (!zM2104e) {
            m2110m(z9);
            m2111n();
            return;
        }
        m2110m(z9);
        m2111n();
        if (str != null && str.length() > 80) {
            str.substring(0, 80).concat("...");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0057, code lost:
    
        continue;
     */
    /* JADX INFO: renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Class m2109l() {
        Class cls = this.f2493o;
        Class cls2 = null;
        if (cls == null) {
            return null;
        }
        for (Class superclass = cls.getSuperclass(); superclass != null && superclass != Object.class; superclass = superclass.getSuperclass()) {
            try {
                Iterator<Constructor<?>> it = KavaReflector.declaredConstructors(superclass).iterator();
                while (true) {
                    if (it.hasNext()) {
                        Class<?>[] parameterTypes = it.next().getParameterTypes();
                        if (parameterTypes.length == 1 && parameterTypes[0].getName().contains("AppCompatActivity")) {
                            if (cls2 == null) {
                                cls2 = superclass;
                            }
                            if (m2098a(superclass, String.class) > 0 && m2098a(superclass, Class.class) > 0 && m2098a(superclass, Integer.TYPE) > 0) {
                                return superclass;
                            }
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return cls2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x0457, code lost:
    
        if (r2 != null) goto L179;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x0459, code lost:
    
        r2 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x045a, code lost:
    
        r8 = r5.getInterfaces();
        r9 = r8.length;
        r10 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x0461, code lost:
    
        if (r10 >= r9) goto L346;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x046f, code lost:
    
        if (r8[r10].getName().startsWith("com.tencent.mm.plugin.newtips.model") == false) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x0471, code lost:
    
        r17.f2490l = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x0474, code lost:
    
        r10 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:345:0x0417, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:346:0x0417, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0195, code lost:
    
        r17.f2487i = p099h.Hchat.utils.KavaReflector.findMethod(p099h.Hchat.utils.KavaReflector.loadClass(r2.m4348p().f8333g, r3), r2.m4348p().f8334h, new java.lang.Class[0]);
        r0 = r2.m4348p().f8334h;
     */
    /* JADX INFO: renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2110m(boolean z9) {
        int i9;
        String str;
        int i10;
        int i11;
        Method next;
        Class cls;
        Class cls2;
        Class cls3 = this.f2483e;
        ClassLoader classLoader = this.f2480b;
        if (cls3 == null) {
            try {
                this.f2483e = KavaReflector.loadClass("com.tencent.mm.ui.base.preference.Preference", classLoader);
            } catch (Throwable th2) {
                th2.getMessage();
            }
        }
        if (this.f2484f == null) {
            try {
                this.f2484f = KavaReflector.loadClass("com.tencent.mm.ui.base.preference.IconPreference", classLoader);
            } catch (Throwable th3) {
                th3.getMessage();
            }
        }
        Method method = this.f2485g;
        DexKitBridge dexKitBridge = this.f2479a;
        if (method == null && this.f2483e != null) {
            try {
                C0570e c0570e = new C0570e();
                C1253k c1253k = new C1253k();
                c1253k.m3369l0(5, "com.tencent.mm.ui.base.preference.Preference");
                C1253k.m3366q0(c1253k, "void");
                c1253k.m3372o0("java.lang.String");
                c1253k.m3376t0(Arrays.asList("Preference"));
                c0570e.f1764h = c1253k;
                Iterator it = dexKitBridge.findMethod(c0570e).iterator();
                if (it.hasNext()) {
                    C1730o c1730o = (C1730o) it.next();
                    this.f2485g = KavaReflector.findMethod(KavaReflector.loadClass(c1730o.m4348p().f8333g, classLoader), c1730o.m4348p().f8334h, String.class);
                    String str2 = c1730o.m4348p().f8334h;
                }
            } catch (Throwable th4) {
                AbstractC0255e.m1030s(th4, new StringBuilder("[Hchat:SettingsDex] setKey 失败: "), th4);
            }
        }
        if (this.f2486h == null && this.f2483e != null) {
            try {
                C0568c c0568c = new C0568c();
                C1243a c1243a = new C1243a();
                c1243a.m3360m0(5, "com.tencent.mm.ui.base.preference.Preference");
                c0568c.f1762h = c1243a;
                for (C1724i c1724i : dexKitBridge.findClass(c0568c)) {
                    C0570e c0570e2 = new C0570e();
                    C1253k c1253k2 = new C1253k();
                    C1253k.m3366q0(c1253k2, "void");
                    c1253k2.m3372o0("java.lang.CharSequence");
                    c0570e2.f1764h = c1253k2;
                    C1731p<C1730o> c1731pFindMethod = dexKitBridge.findMethod(c0570e2);
                    ArrayList arrayList = new ArrayList();
                    for (C1730o c1730o2 : c1731pFindMethod) {
                        if ("com.tencent.mm.ui.base.preference.Preference".equals(c1730o2.m4348p().f8333g)) {
                            arrayList.add(c1730o2);
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        C1730o c1730o3 = (C1730o) arrayList.get(arrayList.size() - 1);
                        this.f2486h = KavaReflector.findMethod(KavaReflector.loadClass(c1730o3.m4348p().f8333g, classLoader), c1730o3.m4348p().f8334h, CharSequence.class);
                        String str3 = c1730o3.m4348p().f8334h;
                    }
                }
            } catch (Throwable th5) {
                AbstractC0255e.m1030s(th5, new StringBuilder("[Hchat:SettingsDex] setTitle 失败: "), th5);
            }
        }
        int i12 = 0;
        if (this.f2487i == null && this.f2483e != null) {
            try {
                C0570e c0570e3 = new C0570e();
                C1253k c1253k3 = new C1253k();
                c1253k3.m3369l0(5, "com.tencent.mm.ui.base.preference.Preference");
                c1253k3.m3370m0(0);
                C1253k.m3366q0(c1253k3, "java.lang.String");
                c0570e3.f1764h = c1253k3;
                Iterator it2 = dexKitBridge.findMethod(c0570e3).iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    C1730o c1730o4 = (C1730o) it2.next();
                    if (!"toString".equals(c1730o4.m4348p().f8334h)) {
                        break;
                    }
                }
            } catch (Throwable th6) {
                AbstractC0255e.m1030s(th6, new StringBuilder("[Hchat:SettingsDex] getKey 失败: "), th6);
            }
        }
        if (this.f2488j == null && this.f2483e != null) {
            try {
                C0568c c0568c2 = new C0568c();
                C1243a c1243a2 = new C1243a();
                c1243a2.m3362o0("android.widget.BaseAdapter");
                c0568c2.f1761g = AbstractC4165l.m8375L0(new String[]{"com.tencent.mm.ui.base.preference"});
                c0568c2.f1762h = c1243a2;
                Iterator it3 = dexKitBridge.findClass(c0568c2).iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        i9 = i12;
                        str = null;
                        break;
                    }
                    C1724i c1724i2 = (C1724i) it3.next();
                    try {
                        Class<?> clsLoadClass = KavaReflector.loadClass(c1724i2.m4345p().f8327g, classLoader);
                        i10 = i12;
                        for (Method method2 : KavaReflector.declaredMethods(clsLoadClass)) {
                            i9 = i12;
                            try {
                                if ("getView".equals(method2.getName()) && KavaReflector.isPublic(method2) && method2.getParameterCount() == 3) {
                                    i10 = 1;
                                }
                                i12 = i9;
                            } catch (Throwable unused) {
                            }
                        }
                        i9 = i12;
                        Iterator<Constructor<?>> it4 = KavaReflector.declaredConstructors(clsLoadClass).iterator();
                        i11 = i9;
                        while (it4.hasNext()) {
                            if (it4.next().getParameterCount() == 3) {
                                i11 = 1;
                            }
                        }
                    } catch (Throwable unused2) {
                        i9 = i12;
                    }
                    if (i10 != 0 && i11 != 0) {
                        str = c1724i2.m4345p().f8327g;
                        break;
                    }
                    i12 = i9;
                }
                if (str != null) {
                    try {
                        C0570e c0570e4 = new C0570e();
                        C1253k c1253k4 = new C1253k();
                        c1253k4.m3369l0(5, str);
                        c1253k4.m3370m0(2);
                        C1253k.m3366q0(c1253k4, "void");
                        c0570e4.f1763g = AbstractC4165l.m8375L0(new String[]{"com.tencent.mm.ui.base.preference"});
                        c0570e4.f1764h = c1253k4;
                        for (C1730o c1730o5 : dexKitBridge.findMethod(c0570e4)) {
                            try {
                                Class<?> clsLoadClass2 = KavaReflector.loadClass(c1730o5.m4348p().f8333g, classLoader);
                                Method methodFindMethod = KavaReflector.findMethod(clsLoadClass2, c1730o5.m4348p().f8334h, this.f2483e, Integer.TYPE);
                                this.f2488j = methodFindMethod;
                                if (methodFindMethod == null) {
                                    Iterator<Method> it5 = KavaReflector.declaredMethods(clsLoadClass2).iterator();
                                    while (true) {
                                        if (!it5.hasNext()) {
                                            break;
                                        }
                                        Method next2 = it5.next();
                                        if (c1730o5.m4348p().f8334h.equals(next2.getName()) && next2.getParameterCount() == 2 && next2.getReturnType() == Void.TYPE) {
                                            this.f2488j = next2;
                                            break;
                                        }
                                    }
                                }
                                if (this.f2488j != null) {
                                    String str4 = c1730o5.m4348p().f8333g;
                                    String str5 = c1730o5.m4348p().f8334h;
                                }
                            } catch (Throwable unused3) {
                            }
                            if (this.f2488j != null) {
                                break;
                            }
                        }
                    } catch (Throwable th7) {
                        th = th7;
                        AbstractC0255e.m1030s(th, new StringBuilder("[Hchat:SettingsDex] addPreference 失败: "), th);
                    }
                }
            } catch (Throwable th8) {
                th = th8;
                i9 = i12;
            }
        } else {
            i9 = 0;
        }
        if (this.f2504z == null || this.f2498t == null) {
            try {
                this.f2504z = KavaReflector.loadClass("com.tencent.mm.plugin.setting.ui.setting.SettingsUI", classLoader);
            } catch (Throwable unused4) {
            }
            try {
                this.f2498t = KavaReflector.loadClass("com.tencent.mm.plugin.setting.ui.setting_new.MainSettingsUI", classLoader);
            } catch (Throwable unused5) {
            }
        }
        this.f2492n = m2103c("com.tencent.mm.plugin.setting.ui.setting_new.settings.SettingGroupMain");
        this.f2493o = m2103c("com.tencent.mm.plugin.setting.ui.setting_new.settings.SettingGroupAccountInfo");
        this.f2494p = m2103c("com.tencent.mm.plugin.setting.ui.setting_new.settings.SettingGroupPersonalInfo");
        this.f2495q = m2103c("com.tencent.mm.plugin.setting.ui.setting_new.settings.SettingAdditionHeaderSearch");
        this.f2496r = m2103c("com.tencent.mm.plugin.setting.ui.setting_new.base.BaseSettingPrefUI");
        this.f2497s = m2103c("com.tencent.mm.plugin.setting.ui.setting_new.base.BaseSettingUI");
        if (this.f2489k == null) {
            try {
                C0568c c0568c3 = new C0568c();
                C1243a c1243a3 = new C1243a();
                c1243a3.m3363p0("Repairer_Setting");
                c0568c3.f1762h = c1243a3;
                Iterator it6 = dexKitBridge.findClass(c0568c3).iterator();
                Class<?> cls4 = null;
                loop8: while (true) {
                    if (!it6.hasNext()) {
                        break;
                    }
                    Class<?> clsLoadClass3 = KavaReflector.loadClass(((C1724i) it6.next()).m4345p().f8327g, classLoader);
                    if (cls4 == null) {
                        cls4 = clsLoadClass3;
                    }
                    for (Method method3 : KavaReflector.declaredMethods(clsLoadClass3)) {
                        if (method3.getParameterCount() == 0 && Map.class.isAssignableFrom(method3.getReturnType())) {
                            this.f2489k = clsLoadClass3;
                            break loop8;
                        }
                    }
                }
                if (this.f2489k == null) {
                    this.f2489k = cls4;
                }
            } catch (Throwable th9) {
                AbstractC0255e.m1030s(th9, new StringBuilder("[Hchat:SettingsDex] SettingItemClassesProvider 失败: "), th9);
            }
        }
        if (this.f2490l == null) {
            try {
                Class clsM2109l = m2109l();
                this.f2490l = clsM2109l;
                if (clsM2109l == null) {
                    C0568c c0568c4 = new C0568c();
                    C1243a c1243a4 = new C1243a();
                    c1243a4.m3363p0(HttpUrl.FRAGMENT_ENCODE_SET, "activity", "context", "intent");
                    c0568c4.f1762h = c1243a4;
                    Iterator it7 = dexKitBridge.findClass(c0568c4).iterator();
                    Class<?> cls5 = null;
                    while (it7.hasNext()) {
                        try {
                            Class<?> clsLoadClass4 = KavaReflector.loadClass(((C1724i) it7.next()).m4345p().f8327g, classLoader);
                            Iterator<Constructor<?>> it8 = KavaReflector.declaredConstructors(clsLoadClass4).iterator();
                            while (true) {
                                if (it8.hasNext()) {
                                    Class<?>[] parameterTypes = it8.next().getParameterTypes();
                                    if (parameterTypes.length == 1 && parameterTypes[i9].getName().contains("AppCompatActivity")) {
                                        break;
                                    }
                                }
                            }
                        } catch (Throwable unused6) {
                        }
                    }
                    if (this.f2490l == null) {
                        this.f2490l = cls5;
                    }
                }
            } catch (Throwable th10) {
                AbstractC0255e.m1030s(th10, new StringBuilder("[Hchat:SettingsDex] BaseSettingItem 失败: "), th10);
            }
        }
        if (this.f2491m == null) {
            try {
                C0568c c0568c5 = new C0568c();
                C1243a c1243a5 = new C1243a();
                c1243a5.m3363p0("SettingLocation(parentGroup=", ", frontItem=");
                c0568c5.f1762h = c1243a5;
                Iterator it9 = dexKitBridge.findClass(c0568c5).iterator();
                if (it9.hasNext()) {
                    C1724i c1724i3 = (C1724i) it9.next();
                    this.f2491m = KavaReflector.loadClass(c1724i3.m4345p().f8327g, classLoader);
                    String str6 = c1724i3.m4345p().f8327g;
                }
            } catch (Throwable th11) {
                AbstractC0255e.m1030s(th11, new StringBuilder("[Hchat:SettingsDex] SettingLocation 失败: "), th11);
            }
        }
        if (this.f2499u == null && (cls2 = this.f2493o) != null) {
            try {
                C0570e c0570e5 = new C0570e();
                C1253k c1253k5 = new C1253k();
                c1253k5.m3369l0(5, cls2.getName());
                Number[] numberArr = new Number[1];
                numberArr[i9] = 1;
                c1253k5.m3375s0(numberArr);
                C1253k.m3366q0(c1253k5, "int");
                c0570e5.f1764h = c1253k5;
                Iterator it10 = dexKitBridge.findMethod(c0570e5).iterator();
                if (it10.hasNext()) {
                    C1730o c1730o6 = (C1730o) it10.next();
                    this.f2499u = KavaReflector.findMethod(KavaReflector.loadClass(c1730o6.m4348p().f8333g, classLoader), c1730o6.m4348p().f8334h, new Class[i9]);
                    String str7 = c1730o6.m4348p().f8334h;
                }
            } catch (Throwable th12) {
                AbstractC0255e.m1030s(th12, new StringBuilder("[Hchat:SettingsDex] AccountInfo.returns1 失败: "), th12);
            }
        }
        if (this.f2500v == null && (cls = this.f2493o) != null) {
            try {
                C0570e c0570e6 = new C0570e();
                C1253k c1253k6 = new C1253k();
                c1253k6.m3369l0(5, cls.getName());
                c1253k6.m3370m0(0);
                C1253k.m3366q0(c1253k6, "java.lang.String");
                c1253k6.m3376t0(Arrays.asList("SettingGroup_Main_AccountInfo"));
                c0570e6.f1764h = c1253k6;
                Iterator it11 = dexKitBridge.findMethod(c0570e6).iterator();
                if (it11.hasNext()) {
                    C1730o c1730o7 = (C1730o) it11.next();
                    this.f2500v = KavaReflector.findMethod(KavaReflector.loadClass(c1730o7.m4348p().f8333g, classLoader), c1730o7.m4348p().f8334h, new Class[0]);
                    String str8 = c1730o7.m4348p().f8334h;
                }
            } catch (Throwable th13) {
                AbstractC0255e.m1030s(th13, new StringBuilder("[Hchat:SettingsDex] AccountInfo.settingKey 失败: "), th13);
            }
        }
        if (z9) {
            if (this.f2501w == null || this.f2502x == null || this.f2503y == null) {
                try {
                    C0568c c0568c6 = new C0568c();
                    C1243a c1243a6 = new C1243a();
                    List listAsList = Arrays.asList("MicroMsg.PlusSubMenuHelper");
                    listAsList.getClass();
                    C1243a.m3357r0(c1243a6, listAsList);
                    c0568c6.f1762h = c1243a6;
                    Iterator it12 = dexKitBridge.findClass(c0568c6).iterator();
                    while (it12.hasNext()) {
                        try {
                            Class<?> clsLoadClass5 = KavaReflector.loadClass(((C1724i) it12.next()).m4345p().f8327g, classLoader);
                            Method methodM2099b = m2099b(clsLoadClass5);
                            Iterator<Method> it13 = KavaReflector.declaredMethods(clsLoadClass5).iterator();
                            while (true) {
                                if (!it13.hasNext()) {
                                    next = null;
                                    break;
                                }
                                next = it13.next();
                                if (next.getParameterCount() == 0 && BaseAdapter.class.isAssignableFrom(next.getReturnType())) {
                                    break;
                                }
                            }
                            if (methodM2099b != null && next != null && m2100d(clsLoadClass5, SparseArray.class) && m2100d(clsLoadClass5, Context.class)) {
                                this.f2501w = clsLoadClass5;
                                this.f2503y = methodM2099b;
                                this.f2502x = next;
                                clsLoadClass5.getClass();
                                next.getName();
                                return;
                            }
                        } catch (Throwable unused7) {
                        }
                    }
                } catch (Throwable th14) {
                    AbstractC0255e.m1030s(th14, new StringBuilder("[Hchat:SettingsDex] PlusSubMenuHelper 失败: "), th14);
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public final void m2111n() {
        String str;
        SharedPreferences sharedPreferences = this.f2481c;
        if (sharedPreferences == null || (str = this.f2482d) == null || str.length() == 0) {
            return;
        }
        try {
            SharedPreferences.Editor editorClear = sharedPreferences.edit().clear();
            editorClear.putString("cache.key", str);
            m2101i(editorClear, "preferenceClass", this.f2483e);
            m2101i(editorClear, "iconPreferenceClass", this.f2484f);
            m2102j(editorClear, "methodSetKey", this.f2485g);
            m2102j(editorClear, "methodSetTitle", this.f2486h);
            m2102j(editorClear, "methodGetKey", this.f2487i);
            m2102j(editorClear, "methodAddPref", this.f2488j);
            m2101i(editorClear, "settingItemClassesProviderClass", this.f2489k);
            m2101i(editorClear, "baseSettingItemClass", this.f2490l);
            m2101i(editorClear, "settingLocationClass", this.f2491m);
            m2101i(editorClear, "settingGroupMainClass", this.f2492n);
            m2101i(editorClear, "settingGroupAccountInfoClass", this.f2493o);
            m2101i(editorClear, "settingGroupPersonalInfoClass", this.f2494p);
            m2101i(editorClear, "settingAdditionHeaderSearchClass", this.f2495q);
            m2101i(editorClear, "baseSettingPrefUIClass", this.f2496r);
            m2101i(editorClear, "baseSettingUIClass", this.f2497s);
            m2101i(editorClear, "mainSettingsUIClass", this.f2498t);
            m2102j(editorClear, "methodAccountInfoReturns1", this.f2499u);
            m2102j(editorClear, "methodAccountInfoSettingKey", this.f2500v);
            m2101i(editorClear, "plusSubMenuHelperClass", this.f2501w);
            m2102j(editorClear, "plusSubMenuAdapterMethod", this.f2502x);
            m2102j(editorClear, "plusSubMenuOnItemClickMethod", this.f2503y);
            m2101i(editorClear, "settingsUIClass", this.f2504z);
            editorClear.putBoolean("cache.complete", true);
            editorClear.apply();
        } catch (Throwable th2) {
            th2.getMessage();
        }
    }
}
