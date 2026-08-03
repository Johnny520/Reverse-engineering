package ua;

import android.content.Context;
import android.content.SharedPreferences;
import ch.C0570e;
import gg.AbstractC1416l;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import okhttp3.HttpUrl;
import org.json.JSONArray;
import org.json.JSONObject;
import org.luckypray.dexkit.DexKitBridge;
import p000a.AbstractC0000a;
import p036c9.C0417a2;
import p062e8.C0828b;
import p086fh.C1253k;
import p096g8.C1360a;
import p099h.Hchat.hooks.api.core.WeChatApis;
import p115hh.C1730o;
import p115hh.C1731p;
import p126ia.C2026t;
import p218og.AbstractC3149m;
import p218og.AbstractC3156t;
import p258r8.C3742g;
import p258r8.C3744i;
import p276sf.C3959f;
import p276sf.C3960g;
import p300ub.AbstractC4302b;
import p304uf.C4327a;
import p304uf.C4329c;
import p332wb.AbstractC4855en;
import tf.AbstractC4171r;
import tf.C4173t;

/* JADX INFO: renamed from: ua.g */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4296g {

    /* JADX INFO: renamed from: a */
    public static final C4296g f14286a = new C4296g();

    /* JADX INFO: renamed from: b */
    public static volatile boolean f14287b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static String m8622a(int i9, long j3) {
        return i9 + ":" + j3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static String m8623b() {
        WeChatApis.contact().getClass();
        C1360a c1360a = WeChatApis.accountApi;
        String strM3652c = c1360a != null ? c1360a.m3652c() : null;
        if (strM3652c == null) {
            strM3652c = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        String string = AbstractC3149m.m6703R0(strM3652c).toString();
        return AbstractC3149m.m6721t0(string) ? "transfer_receive_accounts" : "transfer_receive_accounts.".concat(string);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static void m8624c(Object obj, ArrayList arrayList) {
        if (obj instanceof JSONObject) {
            JSONObject jSONObject = (JSONObject) obj;
            AbstractC4171r.m8432h1(arrayList, m8629i(jSONObject));
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                m8624c(jSONObject.opt(itKeys.next()), arrayList);
            }
            return;
        }
        if (obj instanceof JSONArray) {
            JSONArray jSONArray = (JSONArray) obj;
            int length = jSONArray.length();
            for (int i9 = 0; i9 < length; i9++) {
                m8624c(jSONArray.opt(i9), arrayList);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static C4295f m8625d(String str, List list) {
        Object obj = null;
        if (AbstractC3149m.m6721t0(str) || str.equals("default")) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (((C4295f) obj2).f14285f) {
                arrayList.add(obj2);
            }
        }
        if (str.equals("preset:lqt")) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (AbstractC3149m.m6709h0(AbstractC3149m.m6703R0(AbstractC3156t.m6737a0(((C4295f) next).f14281b, " ", HttpUrl.FRAGMENT_ENCODE_SET, false)).toString(), "零钱通", false)) {
                    obj = next;
                    break;
                }
            }
            return (C4295f) obj;
        }
        if (!str.equals("preset:business")) {
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next2 = it2.next();
                if (((C4295f) next2).f14280a.equals(str)) {
                    obj = next2;
                    break;
                }
            }
            return (C4295f) obj;
        }
        Iterator it3 = arrayList.iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            Object next3 = it3.next();
            String string = AbstractC3149m.m6703R0(AbstractC3156t.m6737a0(((C4295f) next3).f14281b, " ", HttpUrl.FRAGMENT_ENCODE_SET, false)).toString();
            if (AbstractC3149m.m6709h0(string, "经营", false) || AbstractC3149m.m6709h0(string, "商户", false)) {
                obj = next3;
                break;
            }
        }
        return (C4295f) obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static boolean m8626f(Method method) {
        if (method != null && Modifier.isStatic(method.getModifiers())) {
            Class<?>[] parameterTypes = method.getParameterTypes();
            if (parameterTypes.length == 1 && AbstractC1416l.m3825a(parameterTypes[0], JSONObject.class) && !AbstractC1416l.m3825a(method.getReturnType(), Void.TYPE)) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:42:0x00b2 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r2v2, types: [sf.f] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.util.ArrayList] */
    /* JADX INFO: renamed from: g */
    public static List m8627g(Context context) {
        ?? c3959f;
        C4173t c4173t = C4173t.f13710g;
        if (context != null) {
            SharedPreferences sharedPreferencesM8640c = AbstractC4302b.m8640c(context, "Hchat_transfer_config");
            String strM8623b = m8623b();
            String str = HttpUrl.FRAGMENT_ENCODE_SET;
            String string = sharedPreferencesM8640c.getString(strM8623b, HttpUrl.FRAGMENT_ENCODE_SET);
            if (string != null) {
                str = string;
            }
            if (!AbstractC3149m.m6721t0(str)) {
                try {
                    JSONArray jSONArray = new JSONArray(str);
                    C4329c c4329cM7E = AbstractC0000a.m7E();
                    int length = jSONArray.length();
                    for (int i9 = 0; i9 < length; i9++) {
                        JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i9);
                        if (jSONObjectOptJSONObject != null) {
                            int iOptInt = jSONObjectOptJSONObject.optInt("accountType", 0);
                            long jOptLong = jSONObjectOptJSONObject.optLong("subChannelId", 0L);
                            String strOptString = jSONObjectOptJSONObject.optString("name");
                            strOptString.getClass();
                            String string2 = AbstractC3149m.m6703R0(strOptString).toString();
                            if (!AbstractC3149m.m6721t0(string2)) {
                                String strM8622a = m8622a(iOptInt, jOptLong);
                                String strOptString2 = jSONObjectOptJSONObject.optString("bindSerial");
                                strOptString2.getClass();
                                c4329cM7E.add(new C4295f(iOptInt, jOptLong, strM8622a, string2, strOptString2, jSONObjectOptJSONObject.optBoolean("available", true)));
                            }
                        }
                    }
                    C4329c c4329cM90t = AbstractC0000a.m90t(c4329cM7E);
                    HashSet hashSet = new HashSet();
                    c3959f = new ArrayList();
                    ListIterator listIterator = c4329cM90t.listIterator(0);
                    while (true) {
                        C4327a c4327a = (C4327a) listIterator;
                        if (!c4327a.hasNext()) {
                            break;
                        }
                        Object next = c4327a.next();
                        if (hashSet.add(((C4295f) next).f14280a)) {
                            c3959f.add(next);
                        }
                    }
                } catch (Throwable th2) {
                    c3959f = new C3959f(th2);
                }
                ?? r12 = c4173t;
                if (!(c3959f instanceof C3959f)) {
                    r12 = c3959f;
                }
                return (List) r12;
            }
        }
        return c4173t;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static Method m8628h(C3742g c3742g, C2026t c2026t) {
        Object c3959f;
        Object next;
        Object c3959f2;
        Object obj = null;
        try {
            DexKitBridge dexKitBridge = c3742g.f12146d;
            C0570e c0570e = new C0570e();
            C1253k c1253k = new C1253k();
            c1253k.m3374r0("recv_channel_type", "recv_channel_name", "sub_recv_channel_info");
            c0570e.f1764h = c1253k;
            C1731p c1731pFindMethod = dexKitBridge.findMethod(c0570e);
            ArrayList arrayList = new ArrayList();
            Iterator it = c1731pFindMethod.iterator();
            while (it.hasNext()) {
                try {
                    c3959f2 = ((C1730o) it.next()).m4350r(c3742g.f12145c);
                } catch (Throwable th2) {
                    c3959f2 = new C3959f(th2);
                }
                if (c3959f2 instanceof C3959f) {
                    c3959f2 = null;
                }
                Method method = (Method) c3959f2;
                if (method != null) {
                    arrayList.add(method);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
                if (m8626f((Method) next)) {
                    break;
                }
            }
            c3959f = (Method) next;
        } catch (Throwable th3) {
            c3959f = new C3959f(th3);
        }
        Throwable thM8182b = C3960g.m8182b(c3959f);
        if (thM8182b == null) {
            obj = c3959f;
        } else {
            c2026t.invoke("定位转账收款账户解析方法失败", thM8182b);
        }
        return (Method) obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public static List m8629i(JSONObject jSONObject) {
        if (jSONObject.has("recv_channel_type") && jSONObject.has("recv_channel_name")) {
            int iOptInt = jSONObject.optInt("recv_channel_type", 0);
            String strM9266j = AbstractC4855en.m9266j("recv_channel_name", jSONObject);
            if (!AbstractC3149m.m6721t0(strM9266j)) {
                boolean z9 = jSONObject.optInt("recv_channel_avail_state", 1) == 1;
                String strOptString = jSONObject.optString("bind_serial");
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("sub_recv_channel_info");
                long jOptLong = jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optLong("default_sub_recv_channel_id", 0L) : 0L;
                C4329c c4329cM7E = AbstractC0000a.m7E();
                String strM8622a = m8622a(iOptInt, jOptLong);
                strOptString.getClass();
                c4329cM7E.add(new C4295f(iOptInt, jOptLong, strM8622a, strM9266j, strOptString, z9));
                JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optJSONArray("sub_recv_channel_list") : null;
                if (jSONArrayOptJSONArray != null) {
                    int length = jSONArrayOptJSONArray.length();
                    for (int i9 = 0; i9 < length; i9++) {
                        JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray.optJSONObject(i9);
                        if (jSONObjectOptJSONObject2 != null) {
                            long jOptLong2 = jSONObjectOptJSONObject2.optLong("id", 0L);
                            String strM9266j2 = AbstractC4855en.m9266j("name", jSONObjectOptJSONObject2);
                            if (!AbstractC3149m.m6721t0(strM9266j2)) {
                                c4329cM7E.add(new C4295f(iOptInt, jOptLong2, m8622a(iOptInt, jOptLong2), AbstractC4855en.m9264h(strM9266j, " · ", strM9266j2), strOptString, z9));
                            }
                        }
                    }
                }
                return AbstractC0000a.m90t(c4329cM7E);
            }
        }
        return C4173t.f13710g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public static void m8630j(Context context, ArrayList arrayList) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : arrayList) {
            linkedHashMap.put(((C4295f) obj).f14280a, obj);
        }
        JSONArray jSONArray = new JSONArray();
        Collection<C4295f> collectionValues = linkedHashMap.values();
        collectionValues.getClass();
        for (C4295f c4295f : collectionValues) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("name", c4295f.f14281b);
            jSONObject.put("accountType", c4295f.f14282c);
            jSONObject.put("subChannelId", c4295f.f14283d);
            jSONObject.put("bindSerial", c4295f.f14284e);
            jSONObject.put("available", c4295f.f14285f);
            jSONArray.put(jSONObject);
        }
        AbstractC4302b.m8640c(context, "Hchat_transfer_config").edit().putString(m8623b(), jSONArray.toString()).apply();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0031 A[Catch: all -> 0x002f, TryCatch #0 {all -> 0x002f, blocks: (B:3:0x0001, B:7:0x000a, B:9:0x0024, B:20:0x003c, B:17:0x0031, B:19:0x0037), top: B:27:0x0001 }] */
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void m8631e(C3742g c3742g, C2026t c2026t) {
        try {
            c3742g.getClass();
            if (f14287b) {
                return;
            }
            SharedPreferences sharedPreferencesM8640c = AbstractC4302b.m8640c(c3742g.f12143a, "Hchat_transfer_receive_account_method_cache");
            String strM2091g = C0828b.m2091g(c3742g.f12143a, c3742g.f12145c);
            Method methodM2087c = C0828b.m2087c(sharedPreferencesM8640c, strM2091g, c3742g.f12145c, "receive_account_parser");
            if (methodM2087c == null) {
                methodM2087c = m8628h(c3742g, c2026t);
                if (methodM2087c == null) {
                    return;
                } else {
                    C0828b.m2092h(sharedPreferencesM8640c, strM2091g, "receive_account_parser", methodM2087c);
                }
            } else {
                if (!m8626f(methodM2087c)) {
                    methodM2087c = null;
                }
                if (methodM2087c != null) {
                }
            }
            C3744i.f12154b.m7763b(methodM2087c, new C0417a2(c3742g, 7));
            f14287b = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
