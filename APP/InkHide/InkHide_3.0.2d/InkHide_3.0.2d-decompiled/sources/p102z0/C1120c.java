package p102z0;

import android.content.SharedPreferences;
import android.util.Base64;
import java.lang.reflect.Method;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.PublicKey;
import java.security.Signature;
import java.security.spec.X509EncodedKeySpec;
import java.util.concurrent.ThreadPoolExecutor;
import org.json.JSONObject;
import p006D.AbstractC0079h;
import p007D0.AbstractC0096d;
import p009E0.AbstractC0105e;
import p009E0.C0104d;
import p011F0.AbstractC0120h;
import p022L.AbstractC0174d;
import p025M0.InterfaceC0204l;
import p027N0.AbstractC0223g;
import p040U0.AbstractC0291a;
import p040U0.AbstractC0307q;
import p052b1.AbstractC0503h;
import p070i0.AbstractC0731a;
import p081o0.C0780a;
import p086r0.C0925n1;

/* JADX INFO: renamed from: z0.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1120c {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static String m2401b(String str) {
        Object c0104d;
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("hookPoints");
            if (jSONObjectOptJSONObject == null) {
                return null;
            }
            String str2 = jSONObject.optLong("hookPointsVersion", 0L) + "|" + jSONObjectOptJSONObject;
            AbstractC0223g.m418e(str2, "text");
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            byte[] bytes = str2.getBytes(AbstractC0291a.f663a);
            AbstractC0223g.m417d(bytes, "getBytes(...)");
            byte[] bArrDigest = messageDigest.digest(bytes);
            AbstractC0223g.m417d(bArrDigest, "digest(...)");
            c0104d = AbstractC0120h.m259g0(bArrDigest, new C0925n1(23));
        } catch (Throwable th) {
            c0104d = new C0104d(th);
        }
        return (String) (c0104d instanceof C0104d ? null : c0104d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static boolean m2402c(String str) {
        SharedPreferences sharedPreferencesM350f = AbstractC0174d.m350f("app", 4, "getSharedPreferences(...)");
        try {
            Method declaredMethod = sharedPreferencesM350f.getClass().getDeclaredMethod("startReloadIfChangedUnexpectedly", null);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(sharedPreferencesM350f, null);
        } catch (Throwable unused) {
        }
        String string = sharedPreferencesM350f.getString("update_config_cache_digest", null);
        return (string == null || AbstractC0307q.m534d0(string) || !string.equalsIgnoreCase(AbstractC1135r.m2480b(str))) ? false : true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static boolean m2403d(C1119b c1119b) {
        long j2 = c1119b.f3769c;
        return j2 > 0 && System.currentTimeMillis() > j2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static void m2404e(String str) {
        SharedPreferences sharedPreferencesM350f = AbstractC0174d.m350f("app", 4, "getSharedPreferences(...)");
        try {
            Method declaredMethod = sharedPreferencesM350f.getClass().getDeclaredMethod("startReloadIfChangedUnexpectedly", null);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(sharedPreferencesM350f, null);
        } catch (Throwable unused) {
        }
        sharedPreferencesM350f.edit().putLong("update_config_last_refresh_time", System.currentTimeMillis()).putString("update_config_last_wxid", str).apply();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static C1119b m2405f(String str, boolean z2, Throwable th) {
        JSONObject jSONObject = new JSONObject(str);
        boolean zOptBoolean = jSONObject.optBoolean("serviceEnabled", true);
        String strOptString = jSONObject.optString("serviceMessage");
        AbstractC0223g.m417d(strOptString, "optString(...)");
        long jOptLong = jSONObject.optLong("validUntil", 0L);
        boolean zOptBoolean2 = jSONObject.optBoolean("updateEnabled", false);
        int iOptInt = jSONObject.optInt("latestVersionCode", 0);
        String strOptString2 = jSONObject.optString("latestVersionName");
        AbstractC0223g.m417d(strOptString2, "optString(...)");
        boolean zOptBoolean3 = jSONObject.optBoolean("forceUpdate", false);
        String strOptString3 = jSONObject.optString("updateMessage");
        AbstractC0223g.m417d(strOptString3, "optString(...)");
        String strOptString4 = jSONObject.optString("downloadUrl");
        AbstractC0223g.m417d(strOptString4, "optString(...)");
        return new C1119b(zOptBoolean, strOptString, jOptLong, zOptBoolean2, iOptInt, strOptString2, zOptBoolean3, strOptString3, strOptString4, jSONObject.optLong("serverTime", 0L), z2, th);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x000d, code lost:
    
        if (m2403d(r0) != false) goto L25;
     */
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C1119b m2406g(Throwable th, boolean z2) {
        C1119b c1119b = AbstractC1121d.f3781c;
        if (c1119b != null) {
            if (!z2) {
                C1120c c1120c = AbstractC1121d.f3779a;
            }
            return C1119b.m2399a(c1119b, th, 1023);
        }
        SharedPreferences sharedPreferencesM350f = AbstractC0174d.m350f("app", 4, "getSharedPreferences(...)");
        try {
            Method declaredMethod = sharedPreferencesM350f.getClass().getDeclaredMethod("startReloadIfChangedUnexpectedly", null);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(sharedPreferencesM350f, null);
        } catch (Throwable unused) {
        }
        String string = sharedPreferencesM350f.getString("update_config_cache", null);
        if (string != null && m2402c(string)) {
            try {
                C1119b c1119bM2405f = m2405f(string, true, th);
                if (z2 || !m2403d(c1119bM2405f)) {
                    AbstractC1121d.f3782d = string;
                    AbstractC1121d.f3781c = C1119b.m2399a(c1119bM2405f, null, 2047);
                    return c1119bM2405f;
                }
            } catch (Throwable unused2) {
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public static String m2407i(String str) {
        Object c0104d;
        JSONObject jSONObject = new JSONObject(str);
        String strOptString = jSONObject.optString("signature");
        AbstractC0223g.m417d(strOptString, "optString(...)");
        String strM2502x = AbstractC1135r.m2502x(strOptString);
        boolean zBooleanValue = false;
        if (AbstractC0307q.m534d0(strM2502x)) {
            AbstractC0731a.m1387d("remote config signature missing", "required=true");
        } else {
            String strM2502x2 = AbstractC1135r.m2502x("MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAqA8QfKmZm2gatuz87Gn+u4H7VwdM3KUiFo2DKnDFll++TGHnkUoQriPPaFd/i9F6Av/wqQ16q1f+SOlmWoz5yY44Z/kaWgg47kuRiD/zdv6IaZDjeMQ5VGdLlggoLt8l0r2Qn4nw25xxZ/9eTGqKzdBGYQAZKqa1G2+fkNXmJ7ubUlFrxpsISIuaXbObQAS3AYPKE9dD2JjZX3OG4r064rhcP7QnT9PKCp+e0LQdIR8gbvHRdGSRO9KuB03DyZq+eCRqDg62Ix2kE9aAWyvQDWbLSTnIZDgKqzTGpL/HuVKhsaPw9P5FfJ5O9zAPI2+C0WH7IWypLUa3sCBj6ctIcwIDAQAB");
            if (AbstractC0307q.m534d0(strM2502x2)) {
                AbstractC0731a.m1387d("remote config public key missing", "required=true");
            } else {
                try {
                    String strM2487i = AbstractC1135r.m2487i(jSONObject);
                    String strOptString2 = jSONObject.optString("signatureAlgorithm", "SHA256withRSA");
                    PublicKey publicKeyGeneratePublic = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(strM2502x2, 0)));
                    Signature signature = Signature.getInstance(strOptString2);
                    signature.initVerify(publicKeyGeneratePublic);
                    byte[] bytes = strM2487i.getBytes(AbstractC0291a.f663a);
                    AbstractC0223g.m417d(bytes, "getBytes(...)");
                    signature.update(bytes);
                    boolean zVerify = signature.verify(Base64.decode(strM2502x, 0));
                    if (!zVerify) {
                        AbstractC0731a.m1387d("remote config signature verify false", strOptString2, "payloadDigest=".concat(AbstractC1135r.m2481c(strM2487i)));
                    }
                    c0104d = Boolean.valueOf(zVerify);
                } catch (Throwable th) {
                    c0104d = new C0104d(th);
                }
                Throwable thM246a = AbstractC0105e.m246a(c0104d);
                if (thM246a != null) {
                    AbstractC0731a.m1387d("remote config signature verify error", thM246a);
                }
                Boolean bool = Boolean.FALSE;
                if (c0104d instanceof C0104d) {
                    c0104d = bool;
                }
                zBooleanValue = ((Boolean) c0104d).booleanValue();
            }
        }
        if (!zBooleanValue) {
            throw new SecurityException("remote config signature invalid");
        }
        JSONObject jSONObjectOptJSONObject = new JSONObject(str).optJSONObject("payload");
        if (jSONObjectOptJSONObject == null) {
            return str;
        }
        String string = jSONObjectOptJSONObject.toString();
        AbstractC0223g.m417d(string, "toString(...)");
        return string;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public void m2408a(String str) {
        Object c0104d;
        String strM2401b;
        try {
            c0104d = Boolean.valueOf(AbstractC0223g.m414a(AbstractC0503h.m991x().getPackageName(), "com.tencent.mm"));
        } catch (Throwable th) {
            c0104d = new C0104d(th);
        }
        Object obj = Boolean.FALSE;
        if (c0104d instanceof C0104d) {
            c0104d = obj;
        }
        boolean z2 = false;
        if (((Boolean) c0104d).booleanValue() && (strM2401b = m2401b(str)) != null) {
            SharedPreferences sharedPreferencesM350f = AbstractC0174d.m350f("app", 4, "getSharedPreferences(...)");
            try {
                Method declaredMethod = sharedPreferencesM350f.getClass().getDeclaredMethod("startReloadIfChangedUnexpectedly", null);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(sharedPreferencesM350f, null);
            } catch (Throwable unused) {
            }
            String string = sharedPreferencesM350f.getString("update_config_last_applied_hook_points_digest", "");
            String str2 = string != null ? string : "";
            if (!AbstractC0307q.m534d0(strM2401b) && !strM2401b.equals(str2)) {
                z2 = true;
            }
        }
        SharedPreferences sharedPreferencesM350f2 = AbstractC0174d.m350f("app", 4, "getSharedPreferences(...)");
        try {
            Method declaredMethod2 = sharedPreferencesM350f2.getClass().getDeclaredMethod("startReloadIfChangedUnexpectedly", null);
            declaredMethod2.setAccessible(true);
            declaredMethod2.invoke(sharedPreferencesM350f2, null);
        } catch (Throwable unused2) {
        }
        if (sharedPreferencesM350f2.edit().putString("update_config_cache", str).putString("update_config_cache_digest", AbstractC1135r.m2480b(str)).commit()) {
            AbstractC1121d.f3782d = str;
            AbstractC1121d.f3781c = m2405f(str, true, null);
            boolean z3 = AbstractC1126i.f3786a;
            C1124g.m2418I();
            if (z2) {
                String strM2401b2 = m2401b(str);
                if (strM2401b2 != null) {
                    SharedPreferences sharedPreferencesM350f3 = AbstractC0174d.m350f("app", 4, "getSharedPreferences(...)");
                    try {
                        Method declaredMethod3 = sharedPreferencesM350f3.getClass().getDeclaredMethod("startReloadIfChangedUnexpectedly", null);
                        declaredMethod3.setAccessible(true);
                        declaredMethod3.invoke(sharedPreferencesM350f3, null);
                    } catch (Throwable unused3) {
                    }
                    sharedPreferencesM350f3.edit().putString("update_config_last_applied_hook_points_digest", strM2401b2).apply();
                }
                SharedPreferences sharedPreferencesM350f4 = AbstractC0174d.m350f("app", 4, "getSharedPreferences(...)");
                try {
                    Method declaredMethod4 = sharedPreferencesM350f4.getClass().getDeclaredMethod("startReloadIfChangedUnexpectedly", null);
                    declaredMethod4.setAccessible(true);
                    declaredMethod4.invoke(sharedPreferencesM350f4, null);
                } catch (Throwable unused4) {
                }
                sharedPreferencesM350f4.edit().putBoolean("wechat_restart_required_for_hook_points", true).apply();
                AbstractC0731a.m1387d("remote hook points changed, apply on next wechat restart");
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public void m2409h(boolean z2, InterfaceC0204l interfaceC0204l) {
        C1118a c1118aM2490l = AbstractC1135r.m2490l();
        Throwable th = null;
        if (!c1118aM2490l.f3763d || !c1118aM2490l.f3764e) {
            interfaceC0204l.mo8c(new C1119b(th, 4092));
            return;
        }
        C1119b c1119bM2406g = m2406g(null, false);
        boolean z3 = AbstractC1126i.f3786a;
        String strM2437m = C1124g.m2437m();
        if (!z2 && c1119bM2406g != null) {
            SharedPreferences sharedPreferencesM350f = AbstractC0174d.m350f("app", 4, "getSharedPreferences(...)");
            try {
                Method declaredMethod = sharedPreferencesM350f.getClass().getDeclaredMethod("startReloadIfChangedUnexpectedly", null);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(sharedPreferencesM350f, null);
            } catch (Throwable unused) {
            }
            long j2 = sharedPreferencesM350f.getLong("update_config_last_refresh_time", 0L);
            String string = sharedPreferencesM350f.getString("update_config_last_wxid", "");
            String str = string != null ? string : "";
            if (System.currentTimeMillis() - j2 < 86400000 && (AbstractC0307q.m534d0(strM2437m) || strM2437m.equals(str))) {
                interfaceC0204l.mo8c(c1119bM2406g);
                return;
            }
        }
        int i2 = 4095;
        if (!z2) {
            SharedPreferences sharedPreferencesM350f2 = AbstractC0174d.m350f("app", 4, "getSharedPreferences(...)");
            try {
                Method declaredMethod2 = sharedPreferencesM350f2.getClass().getDeclaredMethod("startReloadIfChangedUnexpectedly", null);
                declaredMethod2.setAccessible(true);
                declaredMethod2.invoke(sharedPreferencesM350f2, null);
            } catch (Throwable unused2) {
            }
            if (System.currentTimeMillis() - sharedPreferencesM350f2.getLong("update_config_last_attempt_time", 0L) < 600000) {
                if (c1119bM2406g == null) {
                    c1119bM2406g = new C1119b(th, i2);
                }
                interfaceC0204l.mo8c(c1119bM2406g);
                return;
            }
        }
        if (!AbstractC1121d.f3780b.compareAndSet(false, true)) {
            if (c1119bM2406g == null) {
                c1119bM2406g = new C1119b(th, i2);
            }
            interfaceC0204l.mo8c(c1119bM2406g);
            return;
        }
        SharedPreferences sharedPreferencesM350f3 = AbstractC0174d.m350f("app", 4, "getSharedPreferences(...)");
        try {
            Method declaredMethod3 = sharedPreferencesM350f3.getClass().getDeclaredMethod("startReloadIfChangedUnexpectedly", null);
            declaredMethod3.setAccessible(true);
            declaredMethod3.invoke(sharedPreferencesM350f3, null);
        } catch (Throwable unused3) {
        }
        sharedPreferencesM350f3.edit().putLong("update_config_last_attempt_time", System.currentTimeMillis()).putString("update_config_last_wxid", strM2437m).apply();
        JSONObject jSONObjectPut = new JSONObject().put("wxid", strM2437m).put("appVersionCode", 1027).put("appVersionName", "3.0.2d");
        AbstractC0223g.m417d(jSONObjectPut, "put(...)");
        String string2 = AbstractC1135r.m2479a(jSONObjectPut).toString();
        AbstractC0223g.m417d(string2, "toString(...)");
        ThreadPoolExecutor threadPoolExecutor = AbstractC0096d.f381a;
        AbstractC0079h.m169L(AbstractC1135r.m2482d(new char[]{'c', 'h', 'e', 'c', 'k'}), string2, new C0780a(strM2437m, c1119bM2406g, interfaceC0204l));
    }
}
