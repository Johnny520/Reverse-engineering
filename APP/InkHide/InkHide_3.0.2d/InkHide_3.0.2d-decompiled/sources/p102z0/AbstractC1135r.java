package p102z0;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build;
import android.view.View;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.UUID;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p001A0.AbstractC0039l;
import p001A0.C0018S;
import p006D.AbstractC0079h;
import p007D0.AbstractC0096d;
import p009E0.AbstractC0105e;
import p009E0.C0104d;
import p011F0.AbstractC0120h;
import p011F0.AbstractC0123k;
import p011F0.C0122j;
import p011F0.C0131s;
import p022L.AbstractC0174d;
import p025M0.InterfaceC0193a;
import p027N0.AbstractC0223g;
import p034R0.C0243b;
import p034R0.C0244c;
import p038T0.AbstractC0284i;
import p038T0.C0276a;
import p040U0.AbstractC0291a;
import p040U0.AbstractC0307q;
import p052b1.AbstractC0503h;
import p054c0.AbstractC0514f;
import p070i0.AbstractC0731a;
import p086r0.C0925n1;
import p086r0.C0942t0;

/* JADX INFO: renamed from: z0.r */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1135r {

    /* JADX INFO: renamed from: a */
    public static final char[] f3829a = {'h', 't', 't', 'p', 's'};

    /* JADX INFO: renamed from: b */
    public static final char[][] f3830b = {new char[]{'m', 'y'}, new char[]{'3', '1', '8', '4', '5', '8', '3'}, new char[]{'b', 'e', 's', 't'}};

    /* JADX INFO: renamed from: c */
    public static volatile String f3831c = null;

    /* JADX INFO: renamed from: d */
    public static volatile C1118a f3832d = null;

    /* JADX INFO: renamed from: e */
    public static int f3833e = -1;

    /* JADX INFO: renamed from: f */
    public static String f3834f = "";

    /* JADX INFO: renamed from: g */
    public static String f3835g = "";

    /* JADX INFO: renamed from: h */
    public static C0018S f3836h;

    /* JADX INFO: renamed from: i */
    public static Method f3837i;

    /* JADX INFO: renamed from: j */
    public static Method f3838j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: A */
    public static void m2473A(View view, InterfaceC0193a interfaceC0193a, int i2, View.OnClickListener onClickListener) {
        if (view == null) {
            return;
        }
        View.OnClickListener onClickListener2 = null;
        try {
            if (view.hasOnClickListeners()) {
                onClickListener2 = (View.OnClickListener) AbstractC0514f.f1622b.mo1015f(AbstractC0514f.f1622b.mo1012c(view, "getListenerInfo", new Object[0]), "mOnClickListener");
            }
        } catch (Throwable unused) {
        }
        if (onClickListener2 instanceof ViewOnClickListenerC1130m) {
            onClickListener2 = ((ViewOnClickListenerC1130m) onClickListener2).f3804b;
        }
        ViewOnClickListenerC1130m viewOnClickListenerC1130m = new ViewOnClickListenerC1130m();
        viewOnClickListenerC1130m.f3804b = onClickListener2;
        viewOnClickListenerC1130m.f3805c = onClickListener;
        viewOnClickListenerC1130m.f3806d = interfaceC0193a;
        viewOnClickListenerC1130m.f3807e = i2;
        view.setOnClickListener(viewOnClickListenerC1130m);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: B */
    public static void m2474B(boolean z2) {
        SharedPreferences sharedPreferencesM350f = AbstractC0174d.m350f("app", 4, "getSharedPreferences(...)");
        try {
            Method declaredMethod = sharedPreferencesM350f.getClass().getDeclaredMethod("startReloadIfChangedUnexpectedly", null);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(sharedPreferencesM350f, null);
        } catch (Throwable unused) {
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j2 = sharedPreferencesM350f.getLong("usage_stats_last_report_time", 0L);
        boolean z3 = AbstractC1126i.f3786a;
        String strM2437m = C1124g.m2437m();
        String str = "";
        String string = sharedPreferencesM350f.getString("usage_stats_last_report_wxid", "");
        if (string == null) {
            string = "";
        }
        if (z2 || jCurrentTimeMillis - j2 >= 86400000 || !(AbstractC0307q.m534d0(strM2437m) || strM2437m.equals(string))) {
            sharedPreferencesM350f.edit().putLong("usage_stats_last_report_time", jCurrentTimeMillis).putString("usage_stats_last_report_wxid", strM2437m).apply();
            SharedPreferences sharedPreferences = AbstractC0503h.m991x().getSharedPreferences("app", 4);
            AbstractC0223g.m417d(sharedPreferences, "getSharedPreferences(...)");
            try {
                Method declaredMethod2 = sharedPreferences.getClass().getDeclaredMethod("startReloadIfChangedUnexpectedly", null);
                declaredMethod2.setAccessible(true);
                declaredMethod2.invoke(sharedPreferences, null);
            } catch (Throwable unused2) {
            }
            String string2 = sharedPreferences.getString("usage_stats_install_id", null);
            if (string2 == null || AbstractC0307q.m534d0(string2)) {
                string2 = UUID.randomUUID().toString();
                AbstractC0223g.m417d(string2, "toString(...)");
                sharedPreferences.edit().putString("usage_stats_install_id", string2).apply();
            }
            JSONObject jSONObjectPut = new JSONObject().put("installId", string2).put("wxid", strM2437m).put("appVersionCode", 1027).put("appVersionName", "3.0.2d");
            if (AbstractC0307q.m534d0(f3834f)) {
                try {
                    String str2 = AbstractC0503h.m991x().getPackageManager().getPackageInfo(AbstractC0503h.m991x().getPackageName(), 0).versionName;
                    if (str2 != null) {
                        str = str2;
                    }
                } catch (Exception e2) {
                    AbstractC0731a.m1385b(e2);
                }
                f3834f = str;
            }
            JSONObject jSONObjectPut2 = jSONObjectPut.put("wechatVersion", f3834f).put("androidVersion", "Android " + Build.VERSION.RELEASE).put("sdkInt", Build.VERSION.SDK_INT);
            AbstractC0223g.m417d(jSONObjectPut2, "put(...)");
            String string3 = m2479a(jSONObjectPut2).toString();
            AbstractC0223g.m417d(string3, "toString(...)");
            ThreadPoolExecutor threadPoolExecutor = AbstractC0096d.f381a;
            AbstractC0079h.m169L(m2482d(new char[]{'r', 'e', 'p', 'o', 'r', 't'}), string3, new C0925n1(28));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: C */
    public static final Object m2475C(String str, String str2, String str3, String str4, String str5) {
        EnumC1115A enumC1115AM2485g = m2485g();
        int i2 = enumC1115AM2485g == null ? -1 : AbstractC1116B.f3758a[enumC1115AM2485g.ordinal()];
        return i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? str5 : str : str4 : str3 : str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: D */
    public static final Object m2476D(Object obj, Object obj2, Object obj3, Object obj4) {
        EnumC1115A enumC1115AM2485g = m2485g();
        int i2 = enumC1115AM2485g == null ? -1 : AbstractC1116B.f3758a[enumC1115AM2485g.ordinal()];
        if (i2 == 1) {
            return obj2;
        }
        if (i2 == 2) {
            return obj3;
        }
        if (i2 == 3) {
            return obj4;
        }
        if (i2 != 4) {
            return null;
        }
        return obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: E */
    public static List m2477E(String str, String str2, List list) {
        Object c0104d;
        JSONObject jSONObject;
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectOptJSONObject2;
        JSONObject jSONObjectOptJSONObject3;
        JSONArray jSONArrayOptJSONArray;
        C1120c c1120c = AbstractC1121d.f3779a;
        String string = AbstractC1121d.f3782d;
        List list2 = null;
        if (string == null) {
            SharedPreferences sharedPreferencesM350f = AbstractC0174d.m350f("app", 4, "getSharedPreferences(...)");
            try {
                Method declaredMethod = sharedPreferencesM350f.getClass().getDeclaredMethod("startReloadIfChangedUnexpectedly", null);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(sharedPreferencesM350f, null);
            } catch (Throwable unused) {
            }
            string = sharedPreferencesM350f.getString("update_config_cache", null);
            if (string != null && C1120c.m2402c(string)) {
                AbstractC1121d.f3782d = string;
            } else {
                string = null;
            }
        }
        if (string == null) {
            jSONObject = null;
        } else {
            try {
                c0104d = new JSONObject(string);
            } catch (Throwable th) {
                c0104d = new C0104d(th);
            }
            if (c0104d instanceof C0104d) {
                c0104d = null;
            }
            jSONObject = (JSONObject) c0104d;
        }
        if (jSONObject == null || (jSONObjectOptJSONObject = jSONObject.optJSONObject("hookPoints")) == null) {
            jSONObjectOptJSONObject2 = null;
        } else {
            jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject(String.valueOf(m2494p()));
            if (jSONObjectOptJSONObject2 == null) {
                jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject(m2495q());
            }
        }
        if (jSONObjectOptJSONObject2 != null && (jSONObjectOptJSONObject3 = jSONObjectOptJSONObject2.optJSONObject(str)) != null && (jSONArrayOptJSONArray = jSONObjectOptJSONObject3.optJSONArray(str2)) != null) {
            C0244c c0244cM176U = AbstractC0079h.m176U(0, jSONArrayOptJSONArray.length());
            ArrayList arrayList = new ArrayList();
            Iterator it = c0244cM176U.iterator();
            while (((C0243b) it).f588c) {
                String strOptString = jSONArrayOptJSONArray.optString(((C0243b) it).m458a());
                AbstractC0223g.m415b(strOptString);
                if (AbstractC0307q.m534d0(strOptString)) {
                    strOptString = null;
                }
                if (strOptString != null) {
                    arrayList.add(strOptString);
                }
            }
            list2 = arrayList;
        }
        if (list2 == null) {
            list2 = C0131s.f426a;
        }
        return AbstractC0123k.m281w0(AbstractC0123k.m264A0(AbstractC0123k.m273o0(list2, list)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: F */
    public static String m2478F(Class cls) {
        return cls.isArray() ? AbstractC0307q.m536f0(cls.getName(), '.', '/') : cls.equals(Void.TYPE) ? "V" : cls.equals(Boolean.TYPE) ? "Z" : cls.equals(Byte.TYPE) ? "B" : cls.equals(Character.TYPE) ? "C" : cls.equals(Short.TYPE) ? "S" : cls.equals(Integer.TYPE) ? "I" : cls.equals(Long.TYPE) ? "J" : cls.equals(Float.TYPE) ? "F" : cls.equals(Double.TYPE) ? "D" : AbstractC0174d.m353i("L", AbstractC0307q.m536f0(cls.getName(), '.', '/'), ";");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static JSONObject m2479a(JSONObject jSONObject) throws JSONException {
        C1118a c1118aM2490l = m2490l();
        JSONObject jSONObjectPut = jSONObject.put("packageName", c1118aM2490l.f3760a).put("runtimePackageName", c1118aM2490l.f3761b).put("signatureSha256", c1118aM2490l.f3762c);
        boolean z2 = c1118aM2490l.f3764e;
        boolean z3 = c1118aM2490l.f3763d;
        JSONObject jSONObjectPut2 = jSONObjectPut.put("integrityOk", z3 && z2).put("packageMatched", z3).put("signatureMatched", z2).put("moduleApkKnown", c1118aM2490l.f3765f).put("buildDebug", false);
        AbstractC0223g.m417d(jSONObjectPut2, "put(...)");
        return jSONObjectPut2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static String m2480b(String str) {
        return m2481c(str + "|" + m2490l().f3762c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static String m2481c(String str) throws NoSuchAlgorithmException {
        AbstractC0223g.m418e(str, "text");
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        byte[] bytes = str.getBytes(AbstractC0291a.f663a);
        AbstractC0223g.m417d(bytes, "getBytes(...)");
        byte[] bArrDigest = messageDigest.digest(bytes);
        AbstractC0223g.m417d(bArrDigest, "digest(...)");
        return AbstractC0120h.m259g0(bArrDigest, new C0925n1(23));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static String m2482d(char[] cArr) {
        StringBuilder sb = new StringBuilder();
        sb.append(f3829a);
        sb.append("://");
        char[][] cArr2 = f3830b;
        int i2 = 0;
        int i3 = 0;
        while (i2 < 3) {
            char[] cArr3 = cArr2[i2];
            int i4 = i3 + 1;
            if (i3 > 0) {
                sb.append('.');
            }
            sb.append(cArr3);
            i2++;
            i3 = i4;
        }
        sb.append('/');
        sb.append(new char[]{'a', 'p', 'i'});
        sb.append('/');
        sb.append(cArr);
        String string = sb.toString();
        AbstractC0223g.m417d(string, "toString(...)");
        return string;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static String m2483e(Object obj) {
        if (obj == null || obj.equals(JSONObject.NULL)) {
            return "null";
        }
        if (!(obj instanceof JSONObject)) {
            return obj instanceof JSONArray ? AbstractC0123k.m271m0(AbstractC0079h.m176U(0, ((JSONArray) obj).length()), null, "[", "]", new C0942t0(2, obj), 25) : obj instanceof String ? m2504z((String) obj) : ((obj instanceof Number) || (obj instanceof Boolean)) ? obj.toString() : m2504z(obj.toString());
        }
        Iterator<String> itKeys = ((JSONObject) obj).keys();
        AbstractC0223g.m417d(itKeys, "keys(...)");
        return AbstractC0123k.m271m0(AbstractC0123k.m275q0(AbstractC0284i.m498Z(new C0276a(new C0122j(2, itKeys)))), null, "{", "}", new C0942t0(1, obj), 25);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static boolean m2484f(CharSequence charSequence) {
        try {
            ((ClipboardManager) AbstractC0503h.m991x().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("Label", charSequence));
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static final EnumC1115A m2485g() {
        EnumC1115A enumC1115A;
        int iM2486h = m2486h();
        String str = "";
        if (AbstractC0307q.m534d0(f3834f)) {
            try {
                String str2 = AbstractC0503h.m991x().getPackageManager().getPackageInfo(AbstractC0503h.m991x().getPackageName(), 0).versionName;
                if (str2 != null) {
                    str = str2;
                }
            } catch (Exception e2) {
                AbstractC0731a.m1385b(e2);
            }
            f3834f = str;
        }
        String str3 = f3834f;
        EnumC1115A.f3751c.getClass();
        EnumC1115A[] enumC1115AArrValues = EnumC1115A.values();
        int length = enumC1115AArrValues.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                enumC1115A = null;
                break;
            }
            enumC1115A = enumC1115AArrValues[i2];
            if (enumC1115A.f3756a == iM2486h && AbstractC0307q.m538h0(str3, false, enumC1115A.f3757b)) {
                break;
            }
            i2++;
        }
        if (enumC1115A != null) {
            return enumC1115A;
        }
        for (EnumC1115A enumC1115A2 : EnumC1115A.values()) {
            if (AbstractC0307q.m538h0(str3, false, enumC1115A2.f3757b)) {
                return enumC1115A2;
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static final int m2486h() {
        int i2 = -1;
        if (f3833e == -1) {
            try {
                i2 = AbstractC0503h.m991x().getPackageManager().getPackageInfo(AbstractC0503h.m991x().getPackageName(), 0).versionCode;
            } catch (Exception e2) {
                AbstractC0731a.m1385b(e2);
            }
            f3833e = i2;
        }
        return f3833e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public static String m2487i(JSONObject jSONObject) {
        String strOptString = jSONObject.optString("payloadText");
        AbstractC0223g.m415b(strOptString);
        if (AbstractC0307q.m534d0(strOptString)) {
            strOptString = null;
        }
        if (strOptString != null) {
            return strOptString;
        }
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("payload");
        if (jSONObjectOptJSONObject != null) {
            return m2483e(jSONObjectOptJSONObject);
        }
        JSONObject jSONObject2 = new JSONObject(jSONObject.toString());
        jSONObject2.remove("signature");
        jSONObject2.remove("signatureAlgorithm");
        return m2483e(jSONObject2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public static Method m2488j(Class cls, String str, String str2) {
        Method[] declaredMethods = cls.getDeclaredMethods();
        AbstractC0223g.m417d(declaredMethods, "getDeclaredMethods(...)");
        for (Method method : declaredMethods) {
            if (AbstractC0223g.m414a(method.getName(), str) && AbstractC0223g.m414a(m2501w(method), str2) && Modifier.isStatic(method.getModifiers()) && Arrays.equals(method.getParameterTypes(), new Class[]{String.class}) && AbstractC0223g.m414a(method.getReturnType(), cls)) {
                return method;
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public static Method m2489k(Class cls, String str, String str2, Class cls2) {
        Object obj;
        Object next;
        Method[] declaredMethods = cls.getDeclaredMethods();
        AbstractC0223g.m417d(declaredMethods, "getDeclaredMethods(...)");
        ArrayList arrayList = new ArrayList();
        for (Method method : declaredMethods) {
            if (AbstractC0223g.m414a(method.getName(), str) && Modifier.isStatic(method.getModifiers()) && method.getParameterTypes().length == 6) {
                arrayList.add(method);
            }
        }
        Iterator it = arrayList.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            Method method2 = (Method) next;
            if (AbstractC0223g.m414a(method2.getName(), str) && AbstractC0223g.m414a(m2501w(method2), str2) && Modifier.isStatic(method2.getModifiers()) && method2.getParameterTypes().length == 6) {
                break;
            }
        }
        Method method3 = (Method) next;
        if (method3 != null) {
            return method3;
        }
        AbstractC0731a.m1387d("read trace send appmsg exact method missing", AbstractC0174d.m353i("expected=", str, str2), AbstractC0123k.m271m0(arrayList, ";", null, null, new C0925n1(26), 30));
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next2 = it2.next();
            Method method4 = (Method) next2;
            if (AbstractC0223g.m414a(method4.getParameterTypes()[0], cls2) && AbstractC0223g.m414a(method4.getParameterTypes()[1], String.class) && AbstractC0223g.m414a(method4.getParameterTypes()[2], String.class) && AbstractC0223g.m414a(method4.getParameterTypes()[3], String.class) && AbstractC0223g.m414a(method4.getParameterTypes()[4], String.class) && AbstractC0223g.m414a(method4.getParameterTypes()[5], byte[].class)) {
                obj = next2;
                break;
            }
        }
        return (Method) obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x008a  */
    /* JADX INFO: renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final C1118a m2490l() {
        Object c0104d;
        Throwable thM246a;
        Object c0104d2;
        PackageInfo packageArchiveInfo;
        C1118a c1118a = f3832d;
        if (c1118a != null) {
            return c1118a;
        }
        try {
            Context contextM991x = AbstractC0503h.m991x();
            PackageManager packageManager = contextM991x.getPackageManager();
            AbstractC0223g.m415b(packageManager);
            int i2 = Build.VERSION.SDK_INT >= 28 ? 134217728 : 64;
            try {
                packageArchiveInfo = packageManager.getPackageInfo("com.lu.wxmask272", i2);
            } catch (Throwable unused) {
                String str = f3831c;
                if (str == null) {
                    packageArchiveInfo = null;
                } else {
                    if (AbstractC0307q.m534d0(str)) {
                        str = null;
                    }
                    if (str == null || (packageArchiveInfo = packageManager.getPackageArchiveInfo(str, i2)) == null) {
                    }
                }
                thM246a = AbstractC0105e.m246a(c0104d);
                if (thM246a != null) {
                }
                C1118a c1118a2 = (C1118a) c0104d;
                f3832d = c1118a2;
                return c1118a2;
            }
            String str2 = packageArchiveInfo != null ? packageArchiveInfo.packageName : null;
            String str3 = str2 == null ? "" : str2;
            String strM2492n = packageArchiveInfo != null ? m2492n(packageArchiveInfo) : null;
            String str4 = strM2492n == null ? "" : strM2492n;
            String packageName = contextM991x.getPackageName();
            String str5 = packageName == null ? "" : packageName;
            boolean zEquals = str3.equals("com.lu.wxmask272");
            boolean zEqualsIgnoreCase = str4.equalsIgnoreCase("144F663F47B90C07DB065B5DBD7DDB20FC5794083D7B40AC266581AAE69D8928");
            String str6 = f3831c;
            c0104d = new C1118a(str3, str5, str4, zEquals, zEqualsIgnoreCase, (str6 == null || AbstractC0307q.m534d0(str6)) ? false : true, "");
        } catch (Throwable th) {
            c0104d = new C0104d(th);
        }
        thM246a = AbstractC0105e.m246a(c0104d);
        if (thM246a != null) {
            AbstractC0731a.m1387d("app integrity check failed", thM246a);
            try {
                c0104d2 = AbstractC0503h.m991x().getPackageName();
            } catch (Throwable th2) {
                c0104d2 = new C0104d(th2);
            }
            if (c0104d2 instanceof C0104d) {
                c0104d2 = "";
            }
            AbstractC0223g.m417d(c0104d2, "getOrDefault(...)");
            String str7 = (String) c0104d2;
            String str8 = f3831c;
            boolean z2 = !(str8 == null || AbstractC0307q.m534d0(str8));
            String simpleName = thM246a.getClass().getSimpleName();
            String message = thM246a.getMessage();
            c0104d = new C1118a("", str7, "", false, false, z2, simpleName + ": " + (message != null ? message : ""));
        }
        C1118a c1118a22 = (C1118a) c0104d;
        f3832d = c1118a22;
        return c1118a22;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public static String m2491m() {
        String strM259g0;
        if (!AbstractC0307q.m534d0(f3835g)) {
            return f3835g;
        }
        try {
            Context contextM991x = AbstractC0503h.m991x();
            PackageInfo packageInfo = contextM991x.getPackageManager().getPackageInfo(contextM991x.getPackageName(), 0);
            ApplicationInfo applicationInfo = packageInfo.applicationInfo;
            String strM271m0 = null;
            String str = applicationInfo != null ? applicationInfo.sourceDir : null;
            String str2 = "";
            if (str == null) {
                str = "";
            }
            String[] strArr = packageInfo.splitNames;
            if (strArr != null) {
                String[] strArr2 = strArr;
                if (strArr2.length != 0) {
                    Object[] objArrCopyOf = Arrays.copyOf(strArr2, strArr2.length);
                    AbstractC0223g.m417d(objArrCopyOf, "copyOf(...)");
                    strArr2 = (Comparable[]) objArrCopyOf;
                    if (strArr2.length > 1) {
                        Arrays.sort(strArr2);
                    }
                }
                strM271m0 = AbstractC0123k.m271m0(AbstractC0120h.m252Z(strArr2), ",", null, null, null, 62);
            }
            if (strM271m0 == null) {
                strM271m0 = "";
            }
            String strValueOf = String.valueOf(packageInfo.versionCode);
            String str3 = packageInfo.versionName;
            if (str3 != null) {
                str2 = str3;
            }
            String strM271m02 = AbstractC0123k.m271m0(AbstractC0120h.m252Z(new String[]{strValueOf, str2, String.valueOf(packageInfo.lastUpdateTime), str, strM271m0}), "|", null, null, null, 62);
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            byte[] bytes = strM271m02.getBytes(AbstractC0291a.f663a);
            AbstractC0223g.m417d(bytes, "getBytes(...)");
            byte[] bArrDigest = messageDigest.digest(bytes);
            AbstractC0223g.m417d(bArrDigest, "digest(...)");
            strM259g0 = AbstractC0120h.m259g0(bArrDigest, new C0925n1(22));
        } catch (Exception e2) {
            AbstractC0731a.m1385b(e2);
            strM259g0 = m2494p() + ":" + m2495q();
        }
        f3835g = strM259g0;
        return strM259g0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public static String m2492n(PackageInfo packageInfo) {
        Signature[] apkContentsSigners;
        byte[] byteArray = null;
        if (Build.VERSION.SDK_INT >= 28) {
            SigningInfo signingInfo = packageInfo.signingInfo;
            if (signingInfo != null && (apkContentsSigners = signingInfo.getApkContentsSigners()) != null) {
                Signature signature = apkContentsSigners.length == 0 ? null : apkContentsSigners[0];
                if (signature != null) {
                    byteArray = signature.toByteArray();
                }
            }
        } else {
            Signature[] signatureArr = packageInfo.signatures;
            if (signatureArr != null) {
                Signature signature2 = signatureArr.length == 0 ? null : signatureArr[0];
                if (signature2 != null) {
                    byteArray = signature2.toByteArray();
                }
            }
        }
        if (byteArray == null) {
            return "";
        }
        byte[] bArrDigest = MessageDigest.getInstance("SHA-256").digest(byteArray);
        AbstractC0223g.m417d(bArrDigest, "digest(...)");
        return AbstractC0120h.m259g0(bArrDigest, new C0925n1(18));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public static String m2493o() {
        return m2495q() + "(" + m2494p() + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public static int m2494p() {
        int i2 = -1;
        if (f3833e == -1) {
            try {
                i2 = AbstractC0503h.m991x().getPackageManager().getPackageInfo(AbstractC0503h.m991x().getPackageName(), 0).versionCode;
            } catch (Exception e2) {
                AbstractC0731a.m1385b(e2);
            }
            f3833e = i2;
        }
        return f3833e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public static String m2495q() {
        String str = "";
        if (AbstractC0307q.m534d0(f3834f)) {
            try {
                String str2 = AbstractC0503h.m991x().getPackageManager().getPackageInfo(AbstractC0503h.m991x().getPackageName(), 0).versionName;
                if (str2 != null) {
                    str = str2;
                }
            } catch (Exception e2) {
                AbstractC0731a.m1385b(e2);
            }
            f3834f = str;
        }
        return f3834f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r */
    public static final boolean m2496r(int i2) {
        return m2486h() < i2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s */
    public static final boolean m2497s(int... iArr) {
        int iM2486h = m2486h();
        int length = iArr.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                i2 = -1;
                break;
            }
            if (iM2486h == iArr[i2]) {
                break;
            }
            i2++;
        }
        return i2 >= 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: t */
    public static boolean m2498t() {
        boolean z2;
        Object c0104d;
        try {
            PackageManager packageManager = AbstractC0503h.m991x().getPackageManager();
            String[] strArr = packageManager.getPackageInfo(AbstractC0503h.m991x().getPackageName(), 0).splitNames;
            if (strArr != null) {
                for (String str : strArr) {
                    if (!AbstractC0223g.m414a(str, "delivery")) {
                        AbstractC0223g.m415b(str);
                        if (!AbstractC0307q.m538h0(str, false, "delivery.") && !AbstractC0307q.m538h0(str, false, "config.")) {
                        }
                    }
                    z2 = true;
                    break;
                }
                z2 = false;
            } else {
                z2 = false;
            }
            try {
                c0104d = Boolean.valueOf(AbstractC0223g.m414a(packageManager.getInstallerPackageName(AbstractC0503h.m991x().getPackageName()), "com.android.vending"));
            } catch (Throwable th) {
                c0104d = new C0104d(th);
            }
            Object obj = Boolean.FALSE;
            if (c0104d instanceof C0104d) {
                c0104d = obj;
            }
            return z2 || ((Boolean) c0104d).booleanValue();
        } catch (Exception e2) {
            AbstractC0731a.m1385b(e2);
            return false;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: u */
    public static final boolean m2499u() {
        EnumC1115A enumC1115AM2485g = m2485g();
        int i2 = enumC1115AM2485g == null ? -1 : AbstractC1116B.f3758a[enumC1115AM2485g.ordinal()];
        return i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: v */
    public static final boolean m2500v() {
        return m2485g() == EnumC1115A.WX_8_0_74;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: w */
    public static String m2501w(Method method) {
        Class<?>[] parameterTypes = method.getParameterTypes();
        AbstractC0223g.m417d(parameterTypes, "getParameterTypes(...)");
        String strM260h0 = AbstractC0120h.m260h0(parameterTypes, "", new C0925n1(25), 24);
        Class<?> returnType = method.getReturnType();
        AbstractC0223g.m417d(returnType, "getReturnType(...)");
        return strM260h0 + m2478F(returnType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: x */
    public static String m2502x(String str) {
        Pattern patternCompile = Pattern.compile("\\s+");
        AbstractC0223g.m417d(patternCompile, "compile(...)");
        String strReplaceAll = patternCompile.matcher(str).replaceAll("");
        AbstractC0223g.m417d(strReplaceAll, "replaceAll(...)");
        return strReplaceAll;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: y */
    public static boolean m2503y(Context context) {
        Object c0104d;
        String str;
        boolean z2 = true;
        if (f3837i != null && f3838j != null) {
            return true;
        }
        C0018S c0018sM72j = f3836h;
        String str2 = null;
        if (c0018sM72j == null) {
            c0018sM72j = AbstractC0039l.m72j(context);
            if (c0018sM72j != null) {
                f3836h = c0018sM72j;
            } else {
                c0018sM72j = null;
            }
            if (c0018sM72j == null) {
                return false;
            }
        }
        try {
            ClassLoader classLoader = context.getClassLoader();
            Class<?> cls = Class.forName(c0018sM72j.f148e, false, classLoader);
            Class<?> cls2 = Class.forName(c0018sM72j.f151h, false, classLoader);
            AbstractC0223g.m415b(cls);
            f3837i = m2488j(cls, c0018sM72j.f149f, c0018sM72j.f150g);
            AbstractC0223g.m415b(cls2);
            f3838j = m2489k(cls2, c0018sM72j.f152i, c0018sM72j.f153j, cls);
            Method method = f3837i;
            if (method != null) {
                method.setAccessible(true);
            }
            Method method2 = f3838j;
            if (method2 != null) {
                method2.setAccessible(true);
            }
            Method method3 = f3837i;
            if (method3 != null) {
                str = method3.getDeclaringClass().getName() + "#" + method3.getName() + m2501w(method3);
            } else {
                str = null;
            }
            String str3 = "";
            if (str == null) {
                str = "";
            }
            Method method4 = f3838j;
            if (method4 != null) {
                str2 = method4.getDeclaringClass().getName() + "#" + method4.getName() + m2501w(method4);
            }
            if (str2 != null) {
                str3 = str2;
            }
            AbstractC0731a.m1384a("read trace sender prepared", str, str3);
            if (f3837i == null || f3838j == null) {
                z2 = false;
            }
            c0104d = Boolean.valueOf(z2);
        } catch (Throwable th) {
            c0104d = new C0104d(th);
        }
        Throwable thM246a = AbstractC0105e.m246a(c0104d);
        if (thM246a != null) {
            AbstractC0731a.m1387d("read trace prepare sender fail", thM246a);
        }
        Boolean bool = Boolean.FALSE;
        if (c0104d instanceof C0104d) {
            c0104d = bool;
        }
        return ((Boolean) c0104d).booleanValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: z */
    public static String m2504z(String str) {
        CharSequence charSequenceSubSequence;
        StringBuilder sb = new StringBuilder(str.length() + 2);
        sb.append('\"');
        for (int i2 = 0; i2 < str.length(); i2++) {
            char cCharAt = str.charAt(i2);
            if (cCharAt == '\f') {
                sb.append("\\f");
            } else if (cCharAt == '\r') {
                sb.append("\\r");
            } else if (cCharAt == '\"') {
                sb.append("\\\"");
            } else if (cCharAt != '\\') {
                switch (cCharAt) {
                    case '\b':
                        sb.append("\\b");
                        break;
                    case '\t':
                        sb.append("\\t");
                        break;
                    case '\n':
                        sb.append("\\n");
                        break;
                    default:
                        if (cCharAt <= 31) {
                            sb.append("\\u");
                            AbstractC0079h.m181e(16);
                            String string = Integer.toString(cCharAt, 16);
                            AbstractC0223g.m417d(string, "toString(...)");
                            if (4 <= string.length()) {
                                charSequenceSubSequence = string.subSequence(0, string.length());
                            } else {
                                StringBuilder sb2 = new StringBuilder(4);
                                int i3 = new C0244c(1, 4 - string.length(), 1).f584b;
                                boolean z2 = 1 <= i3;
                                int i4 = z2 ? 1 : i3;
                                while (z2) {
                                    if (i4 != i3) {
                                        i4++;
                                    } else {
                                        if (!z2) {
                                            throw new NoSuchElementException();
                                        }
                                        z2 = false;
                                    }
                                    sb2.append('0');
                                }
                                sb2.append((CharSequence) string);
                                charSequenceSubSequence = sb2;
                            }
                            sb.append(charSequenceSubSequence.toString());
                        } else {
                            sb.append(cCharAt);
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        sb.append('\"');
        String string2 = sb.toString();
        AbstractC0223g.m417d(string2, "toString(...)");
        return string2;
    }
}
