package p102z0;

import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ThreadPoolExecutor;
import org.json.JSONArray;
import org.json.JSONObject;
import p006D.AbstractC0079h;
import p007D0.AbstractC0096d;
import p009E0.AbstractC0105e;
import p009E0.C0104d;
import p011F0.AbstractC0123k;
import p011F0.C0131s;
import p022L.AbstractC0174d;
import p022L.RunnableC0171a;
import p027N0.AbstractC0223g;
import p031P0.AbstractC0235a;
import p040U0.AbstractC0291a;
import p040U0.AbstractC0299i;
import p040U0.AbstractC0307q;
import p041V.C0318k;
import p052b1.AbstractC0503h;
import p054c0.AbstractC0514f;
import p070i0.AbstractC0731a;
import p081o0.C0781b;

/* JADX INFO: renamed from: z0.q */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1134q {

    /* JADX INFO: renamed from: a */
    public static final Handler f3825a = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: b */
    public static final ConcurrentHashMap f3826b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: c */
    public static final ConcurrentHashMap f3827c = new ConcurrentHashMap();

    /* JADX INFO: renamed from: d */
    public static volatile Object f3828d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static void m2460a(Object obj, Object obj2, String str) {
        Method method;
        Object c0104d;
        Method[] methods = obj.getClass().getMethods();
        AbstractC0223g.m417d(methods, "getMethods(...)");
        int length = methods.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                method = null;
                break;
            }
            method = methods[i2];
            if (AbstractC0223g.m414a(method.getName(), str) && method.getParameterTypes().length == 1) {
                break;
            } else {
                i2++;
            }
        }
        if (method == null) {
            return;
        }
        try {
            c0104d = method.invoke(obj, obj2);
        } catch (Throwable th) {
            c0104d = new C0104d(th);
        }
        Throwable thM246a = AbstractC0105e.m246a(c0104d);
        if (thM246a != null) {
            AbstractC0731a.m1387d("read trace set msg field fail", str, obj2, thM246a);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static List m2461b(ArrayList arrayList) {
        long jCurrentTimeMillis = System.currentTimeMillis() - 604800000;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((C1133p) obj).f3822d >= jCurrentTimeMillis) {
                arrayList2.add(obj);
            }
        }
        return AbstractC0123k.m277s0(AbstractC0123k.m276r0(arrayList2, new C0318k(3)), 100);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static ContentValues m2462c(String str, long j2, String str2) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("msgSvrId", Long.valueOf(((long) AbstractC0235a.f570a.mo448c()) + j2));
        contentValues.put("type", (Integer) 10000);
        contentValues.put("status", (Integer) 3);
        contentValues.put("isSend", (Integer) 0);
        contentValues.put("createTime", Long.valueOf(j2));
        contentValues.put("talker", str);
        contentValues.put("content", str2);
        return contentValues;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static Object m2463d(Context context, C1131n c1131n) {
        Method method;
        Object objInvoke;
        Method method2;
        String str = c1131n.f3811b;
        ClassLoader classLoader = context.getClassLoader();
        AbstractC0223g.m417d(classLoader, "getClassLoader(...)");
        Class clsMo1021l = AbstractC0514f.f1622b.mo1021l(classLoader, str);
        if (clsMo1021l != null) {
            ClassLoader classLoader2 = context.getClassLoader();
            AbstractC0223g.m417d(classLoader2, "getClassLoader(...)");
            Class clsMo1021l2 = AbstractC0514f.f1622b.mo1021l(classLoader2, c1131n.f3812c);
            if (clsMo1021l2 != null) {
                Method[] methods = clsMo1021l2.getMethods();
                AbstractC0223g.m417d(methods, "getMethods(...)");
                int length = methods.length;
                int i2 = 0;
                int i3 = 0;
                while (true) {
                    if (i3 >= length) {
                        method = null;
                        break;
                    }
                    method = methods[i3];
                    if (Modifier.isStatic(method.getModifiers()) && AbstractC0223g.m414a(method.getName(), "s") && method.getParameterTypes().length == 1 && AbstractC0223g.m414a(method.getParameterTypes()[0], Class.class)) {
                        break;
                    }
                    i3++;
                }
                if (method != null && (objInvoke = method.invoke(null, clsMo1021l)) != null) {
                    Method[] methods2 = objInvoke.getClass().getMethods();
                    AbstractC0223g.m417d(methods2, "getMethods(...)");
                    int length2 = methods2.length;
                    while (true) {
                        if (i2 >= length2) {
                            method2 = null;
                            break;
                        }
                        method2 = methods2[i2];
                        if (AbstractC0223g.m414a(method2.getName(), c1131n.f3813d)) {
                            Class<?>[] parameterTypes = method2.getParameterTypes();
                            AbstractC0223g.m417d(parameterTypes, "getParameterTypes(...)");
                            if (parameterTypes.length == 0) {
                                break;
                            }
                        }
                        i2++;
                    }
                    if (method2 != null) {
                        return method2.invoke(objInvoke, null);
                    }
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:38:0x00b1 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX INFO: renamed from: e */
    public static List m2464e() {
        ?? c0104d;
        SharedPreferences sharedPreferencesM350f = AbstractC0174d.m350f("read_trace_monitor", 0, "getSharedPreferences(...)");
        try {
            Method declaredMethod = sharedPreferencesM350f.getClass().getDeclaredMethod("startReloadIfChangedUnexpectedly", null);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(sharedPreferencesM350f, null);
        } catch (Throwable unused) {
        }
        String string = sharedPreferencesM350f.getString("tracks", "[]");
        if (string == null) {
            string = "";
        }
        try {
            JSONArray jSONArray = new JSONArray(string);
            int length = jSONArray.length();
            ArrayList arrayList = new ArrayList(length);
            for (int i2 = 0; i2 < length; i2++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i2);
                if (jSONObjectOptJSONObject == null) {
                    jSONObjectOptJSONObject = new JSONObject();
                }
                String strOptString = jSONObjectOptJSONObject.optString("talker");
                AbstractC0223g.m417d(strOptString, "optString(...)");
                String strOptString2 = jSONObjectOptJSONObject.optString("trackId");
                AbstractC0223g.m417d(strOptString2, "optString(...)");
                String strOptString3 = jSONObjectOptJSONObject.optString("summary");
                AbstractC0223g.m417d(strOptString3, "optString(...)");
                long jOptLong = jSONObjectOptJSONObject.optLong("sendTime");
                String strOptString4 = jSONObjectOptJSONObject.optString("lastSeen");
                AbstractC0223g.m417d(strOptString4, "optString(...)");
                arrayList.add(new C1133p(strOptString, strOptString2, strOptString3, jOptLong, strOptString4, jSONObjectOptJSONObject.optBoolean("completed", false)));
            }
            c0104d = new ArrayList();
            for (Object obj : arrayList) {
                C1133p c1133p = (C1133p) obj;
                if (!AbstractC0307q.m534d0(c1133p.f3819a) && !AbstractC0307q.m534d0(c1133p.f3820b)) {
                    c0104d.add(obj);
                }
            }
        } catch (Throwable th) {
            c0104d = new C0104d(th);
        }
        C0131s c0131s = C0131s.f426a;
        boolean z2 = c0104d instanceof C0104d;
        ?? r02 = c0104d;
        if (z2) {
            r02 = c0131s;
        }
        return (List) r02;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static C1131n m2465f() {
        return (C1131n) AbstractC1135r.m2476D(new C1131n("com.tencent.mm.storage.y8", "sc3.x3", "yj0.j1", "xh", "L9"), new C1131n("com.tencent.mm.storage.f9", "ge3.x3", "tk0.j1", "Ah", "z9"), new C1131n("com.tencent.mm.storage.f9", "ef3.x3", "dl0.k1", "Wh", "z9"), new C1131n("com.tencent.mm.storage.f9", "com.tencent.mm.plugin.messenger.foundation.h2", "gm0.j1", "cj", "M9"));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static void m2466g(String str) {
        if (str != null && !AbstractC0307q.m534d0(str)) {
            m2472m(str);
            return;
        }
        Set setKeySet = f3826b.keySet();
        AbstractC0223g.m417d(setKeySet, "<get-keys>(...)");
        for (String str2 : AbstractC0123k.m281w0(setKeySet)) {
            AbstractC0223g.m415b(str2);
            m2472m(str2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static void m2467h(Context context, String str) {
        Object objPutIfAbsent;
        AbstractC0223g.m418e(str, "talker");
        boolean z2 = AbstractC1126i.f3786a;
        if (!C1124g.m2416G() || AbstractC0307q.m534d0(str)) {
            if (AbstractC0307q.m534d0(str)) {
                return;
            }
            m2472m(str);
            return;
        }
        List listM2464e = m2464e();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM2464e) {
            C1133p c1133p = (C1133p) obj;
            if (c1133p.f3819a.equals(str) && !c1133p.f3824f) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            m2472m(str);
            return;
        }
        ConcurrentHashMap concurrentHashMap = f3826b;
        Object c1132o = concurrentHashMap.get(str);
        if (c1132o == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(str, (c1132o = new C1132o(str)))) != null) {
            c1132o = objPutIfAbsent;
        }
        C1132o c1132o2 = (C1132o) c1132o;
        c1132o2.f3816b = true;
        c1132o2.f3817c++;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        m2469j(context, str, c1132o2.f3817c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public static ArrayList m2468i(String str) {
        JSONArray jSONArray = new JSONArray(str);
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i2 = 0; i2 < length; i2++) {
            Object objOpt = jSONArray.opt(i2);
            if (objOpt instanceof String) {
                arrayList.add(objOpt);
            } else if (objOpt instanceof JSONObject) {
                JSONObject jSONObject = (JSONObject) objOpt;
                String strOptString = jSONObject.optString("timestamp");
                if (AbstractC0307q.m534d0(strOptString)) {
                    strOptString = jSONObject.optString("time");
                }
                arrayList.add(strOptString);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (!AbstractC0307q.m534d0((String) obj)) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public static void m2469j(Context context, String str, int i2) {
        C1132o c1132o = (C1132o) f3826b.get(str);
        if (c1132o != null && c1132o.f3816b && c1132o.f3817c == i2) {
            List listM2464e = m2464e();
            ArrayList<C1133p> arrayList = new ArrayList();
            for (Object obj : listM2464e) {
                C1133p c1133p = (C1133p) obj;
                if (c1133p.f3819a.equals(str) && !c1133p.f3824f) {
                    arrayList.add(obj);
                }
            }
            if (arrayList.isEmpty()) {
                m2472m(str);
                return;
            }
            for (C1133p c1133p2 : arrayList) {
                boolean z2 = AbstractC1126i.f3786a;
                String string = AbstractC0299i.m507C0(C1124g.m2435k().getReadTraceServerUrl()).toString();
                if (AbstractC0307q.m534d0(string)) {
                    string = "https://read.spint.kdns.fr";
                }
                String strM509E0 = AbstractC0299i.m509E0(AbstractC0299i.m507C0(string).toString(), '/');
                if (!AbstractC0307q.m534d0(strM509E0)) {
                    String str2 = c1133p2.f3820b;
                    Charset charset = AbstractC0291a.f663a;
                    String strEncode = URLEncoder.encode(str2, charset.name());
                    AbstractC0223g.m417d(strEncode, "encode(...)");
                    String strEncode2 = URLEncoder.encode(c1133p2.f3823e, charset.name());
                    AbstractC0223g.m417d(strEncode2, "encode(...)");
                    String str3 = strM509E0 + "/times?id=" + strEncode + "&after=" + strEncode2;
                    ThreadPoolExecutor threadPoolExecutor = AbstractC0096d.f381a;
                    AbstractC0079h.m191o(str3, new C0781b(c1133p2, context, 10));
                }
            }
            RunnableC0171a runnableC0171a = c1132o.f3818d;
            if (runnableC0171a != null) {
                f3825a.removeCallbacks(runnableC0171a);
            }
            RunnableC0171a runnableC0171a2 = new RunnableC0171a(context, str, i2);
            c1132o.f3818d = runnableC0171a2;
            f3825a.postDelayed(runnableC0171a2, 10000L);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public static Class m2470k(Method method) {
        if (AbstractC0223g.m414a(method.getReturnType(), Long.TYPE)) {
            return Long.class;
        }
        Class<?> returnType = method.getReturnType();
        AbstractC0223g.m417d(returnType, "getReturnType(...)");
        return returnType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public static void m2471l(List list) {
        JSONArray jSONArray = new JSONArray();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C1133p c1133p = (C1133p) it.next();
            jSONArray.put(new JSONObject().put("talker", c1133p.f3819a).put("trackId", c1133p.f3820b).put("summary", c1133p.f3821c).put("sendTime", c1133p.f3822d).put("lastSeen", c1133p.f3823e).put("completed", c1133p.f3824f));
        }
        SharedPreferences sharedPreferences = AbstractC0503h.m991x().getSharedPreferences("read_trace_monitor", 0);
        AbstractC0223g.m417d(sharedPreferences, "getSharedPreferences(...)");
        sharedPreferences.edit().putString("tracks", jSONArray.toString()).apply();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public static void m2472m(String str) {
        C1132o c1132o = (C1132o) f3826b.get(str);
        if (c1132o != null) {
            c1132o.f3816b = false;
            RunnableC0171a runnableC0171a = c1132o.f3818d;
            if (runnableC0171a != null) {
                f3825a.removeCallbacks(runnableC0171a);
            }
            c1132o.f3818d = null;
        }
    }
}
