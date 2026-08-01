package p001A0;

import android.content.Context;
import android.content.SharedPreferences;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.luckypray.dexkit.DexKitBridge;
import p006D.AbstractC0079h;
import p009E0.AbstractC0105e;
import p009E0.C0104d;
import p011F0.C0131s;
import p022L.AbstractC0174d;
import p025M0.InterfaceC0204l;
import p027N0.AbstractC0223g;
import p034R0.C0243b;
import p034R0.C0244c;
import p040U0.AbstractC0307q;
import p052b1.AbstractC0503h;
import p070i0.AbstractC0731a;
import p102z0.AbstractC1135r;

/* JADX INFO: renamed from: A0.l */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0039l {

    /* JADX INFO: renamed from: a */
    public static final Object f252a = new Object();

    /* JADX INFO: renamed from: b */
    public static String f253b;

    /* JADX INFO: renamed from: c */
    public static DexKitBridge f254c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: A */
    public static JSONArray m61A(List list) {
        JSONArray jSONArray = new JSONArray();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C0023X c0023x = (C0023X) it.next();
            jSONArray.put(new JSONObject().put("className", c0023x.f180a).put("methodName", c0023x.f181b).put("methodSign", c0023x.f182c));
        }
        return jSONArray;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: B */
    public static Object m62B(String str, InterfaceC0204l interfaceC0204l) {
        DexKitBridge dexKitBridge;
        Object objMo8c;
        AbstractC0223g.m418e(str, "apkPath");
        synchronized (f252a) {
            if (AbstractC0223g.m414a(f253b, str)) {
                dexKitBridge = f254c;
            } else {
                try {
                    DexKitBridge dexKitBridge2 = f254c;
                    if (dexKitBridge2 != null) {
                        dexKitBridge2.close();
                    }
                } catch (Throwable unused) {
                }
                dexKitBridge = null;
                f254c = null;
                f253b = null;
            }
            if (dexKitBridge == null) {
                dexKitBridge = new DexKitBridge(str);
                f253b = str;
                f254c = dexKitBridge;
            }
            objMo8c = interfaceC0204l.mo8c(dexKitBridge);
        }
        return objMo8c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static void m63a(String str) {
        SharedPreferences sharedPreferences = AbstractC0503h.m991x().getSharedPreferences("hook_point_cache", 0);
        AbstractC0223g.m417d(sharedPreferences, "getSharedPreferences(...)");
        sharedPreferences.edit().remove(str).apply();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009c  */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C0004D m64b(String str) {
        Object c0104d;
        Throwable thM246a;
        JSONObject jSONObject;
        SharedPreferences sharedPreferencesM350f = AbstractC0174d.m350f("hook_point_cache", 0, "getSharedPreferences(...)");
        try {
            Method declaredMethod = sharedPreferencesM350f.getClass().getDeclaredMethod("startReloadIfChangedUnexpectedly", null);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(sharedPreferencesM350f, null);
        } catch (Throwable unused) {
        }
        String string = sharedPreferencesM350f.getString(str, null);
        if (string == null) {
            return null;
        }
        try {
            jSONObject = new JSONObject(string);
        } catch (Throwable th) {
            c0104d = new C0104d(th);
        }
        if (m80r(jSONObject, 2)) {
            String strOptString = jSONObject.optString("className");
            AbstractC0223g.m417d(strOptString, "optString(...)");
            String strOptString2 = jSONObject.optString("methodName");
            AbstractC0223g.m417d(strOptString2, "optString(...)");
            String strOptString3 = jSONObject.optString("methodSign");
            AbstractC0223g.m417d(strOptString3, "optString(...)");
            int iOptInt = jSONObject.optInt("versionCode", -1);
            String strOptString4 = jSONObject.optString("versionName");
            AbstractC0223g.m417d(strOptString4, "optString(...)");
            c0104d = new C0004D(strOptString, strOptString2, strOptString3, iOptInt, strOptString4, jSONObject.optLong("updatedAt", 0L));
            if (!AbstractC0307q.m534d0(strOptString) && !AbstractC0307q.m534d0(strOptString2)) {
                if (AbstractC0307q.m534d0(strOptString3)) {
                }
            }
            thM246a = AbstractC0105e.m246a(c0104d);
            if (thM246a != null) {
                AbstractC0731a.m1387d("hook point cache read fail", str, thM246a);
                m63a(str);
            }
            return (C0004D) (c0104d instanceof C0104d ? null : c0104d);
        }
        c0104d = null;
        thM246a = AbstractC0105e.m246a(c0104d);
        if (thM246a != null) {
        }
        return (C0004D) (c0104d instanceof C0104d ? null : c0104d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static C0028b m65c(Context context) {
        AbstractC0223g.m418e(context, "context");
        C0004D c0004dM64b = m64b("anti_revoke_revoke_method");
        if (c0004dM64b == null) {
            return null;
        }
        if (!c0004dM64b.m0a()) {
            c0004dM64b = null;
        }
        if (c0004dM64b == null) {
            return null;
        }
        return new C0028b(c0004dM64b.f30a, c0004dM64b.f31b, c0004dM64b.f32c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static C0030c m66d(Context context) {
        AbstractC0223g.m418e(context, "context");
        C0004D c0004dM64b = m64b("anti_revoke_message_storage_method_v1");
        if (c0004dM64b == null) {
            return null;
        }
        if (!c0004dM64b.m0a()) {
            c0004dM64b = null;
        }
        if (c0004dM64b == null) {
            return null;
        }
        return new C0030c(c0004dM64b.f30a, c0004dM64b.f31b, c0004dM64b.f32c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:40:0x00e8 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:85:0x00a6 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:89:0x00e8 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x016c  */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v15, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r13v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r14v11, types: [java.lang.Object, java.util.List] */
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C0036i m67e(Context context) {
        String str;
        Object c0104d;
        C0001A c0001a;
        ArrayList arrayList;
        ?? arrayList2;
        SharedPreferences sharedPreferencesM350f = AbstractC0174d.m350f("hook_point_cache", 0, "getSharedPreferences(...)");
        try {
            Method declaredMethod = sharedPreferencesM350f.getClass().getDeclaredMethod("startReloadIfChangedUnexpectedly", null);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(sharedPreferencesM350f, null);
        } catch (Throwable unused) {
        }
        String string = sharedPreferencesM350f.getString("contact_mvvm_address", null);
        if (string == null) {
            c0001a = null;
        } else {
            try {
                JSONObject jSONObject = new JSONObject(string);
                if (m80r(jSONObject, 3)) {
                    String strOptString = jSONObject.optString("mvvmFragmentClassName");
                    AbstractC0223g.m417d(strOptString, "optString(...)");
                    String strOptString2 = jSONObject.optString("addressLiveListClassName");
                    AbstractC0223g.m417d(strOptString2, "optString(...)");
                    String strOptString3 = jSONObject.optString("liveListSubmitMethodName");
                    AbstractC0223g.m417d(strOptString3, "optString(...)");
                    String strOptString4 = jSONObject.optString("liveListGetterName");
                    AbstractC0223g.m417d(strOptString4, "optString(...)");
                    String strOptString5 = jSONObject.optString("adapterGetterName");
                    AbstractC0223g.m417d(strOptString5, "optString(...)");
                    JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("mvvmAdapterClassNames");
                    if (jSONArrayOptJSONArray != null) {
                        C0244c c0244cM176U = AbstractC0079h.m176U(0, jSONArrayOptJSONArray.length());
                        arrayList = new ArrayList();
                        Iterator it = c0244cM176U.iterator();
                        while (((C0243b) it).f588c) {
                            String strOptString6 = jSONArrayOptJSONArray.optString(((C0243b) it).m458a());
                            AbstractC0223g.m415b(strOptString6);
                            if (AbstractC0307q.m534d0(strOptString6)) {
                                strOptString6 = null;
                            }
                            if (strOptString6 != null) {
                                arrayList.add(strOptString6);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                    C0131s c0131s = C0131s.f426a;
                    List list = arrayList;
                    if (arrayList == null) {
                        list = c0131s;
                    }
                    JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("mvvmItemClassNames");
                    if (jSONArrayOptJSONArray2 != null) {
                        C0244c c0244cM176U2 = AbstractC0079h.m176U(0, jSONArrayOptJSONArray2.length());
                        arrayList2 = new ArrayList();
                        Iterator it2 = c0244cM176U2.iterator();
                        while (((C0243b) it2).f588c) {
                            String strOptString7 = jSONArrayOptJSONArray2.optString(((C0243b) it2).m458a());
                            AbstractC0223g.m415b(strOptString7);
                            if (AbstractC0307q.m534d0(strOptString7)) {
                                strOptString7 = null;
                            }
                            if (strOptString7 != null) {
                                arrayList2.add(strOptString7);
                            }
                        }
                    } else {
                        arrayList2 = 0;
                    }
                    if (arrayList2 == 0) {
                        arrayList2 = c0131s;
                    }
                    String strOptString8 = jSONObject.optString("refreshSubmitMethodName");
                    AbstractC0223g.m417d(strOptString8, "optString(...)");
                    int iOptInt = jSONObject.optInt("versionCode", -1);
                    String strOptString9 = jSONObject.optString("versionName");
                    AbstractC0223g.m417d(strOptString9, "optString(...)");
                    str = "contact_mvvm_address";
                    try {
                        c0104d = new C0001A(strOptString, strOptString2, strOptString3, strOptString4, strOptString5, list, arrayList2, strOptString8, iOptInt, strOptString9, jSONObject.optLong("updatedAt", 0L));
                        if (AbstractC0307q.m534d0(strOptString) || AbstractC0307q.m534d0(strOptString2) || AbstractC0307q.m534d0(strOptString3) || AbstractC0307q.m534d0(strOptString4)) {
                            c0104d = null;
                        } else if (AbstractC0307q.m534d0(strOptString5)) {
                        }
                    } catch (Throwable th) {
                        th = th;
                        c0104d = new C0104d(th);
                    }
                } else {
                    c0104d = null;
                    str = "contact_mvvm_address";
                }
            } catch (Throwable th2) {
                th = th2;
                str = "contact_mvvm_address";
            }
            Throwable thM246a = AbstractC0105e.m246a(c0104d);
            if (thM246a != null) {
                AbstractC0731a.m1387d("contact hook point cache read fail", str, thM246a);
                m63a(str);
            }
            if (c0104d instanceof C0104d) {
                c0104d = null;
            }
            c0001a = (C0001A) c0104d;
        }
        if (c0001a != null) {
            if (c0001a.f8i == AbstractC1135r.m2494p()) {
                if (!c0001a.f9j.equals(AbstractC1135r.m2495q())) {
                    c0001a = null;
                }
                if (c0001a != null) {
                    return new C0036i(c0001a.f0a, c0001a.f1b, c0001a.f2c, c0001a.f3d, c0001a.f4e, c0001a.f5f, c0001a.f6g, c0001a.f7h);
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e4  */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, java.util.List] */
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C0037j m68f(Context context) {
        Object c0104d;
        C0002B c0002b;
        SharedPreferences sharedPreferencesM350f = AbstractC0174d.m350f("hook_point_cache", 0, "getSharedPreferences(...)");
        try {
            Method declaredMethod = sharedPreferencesM350f.getClass().getDeclaredMethod("startReloadIfChangedUnexpectedly", null);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(sharedPreferencesM350f, null);
        } catch (Throwable unused) {
        }
        String string = sharedPreferencesM350f.getString("conversation_mvvm_list_v2", null);
        if (string == null) {
            c0002b = null;
        } else {
            try {
                JSONObject jSONObject = new JSONObject(string);
                if (m80r(jSONObject, 5)) {
                    List listM83u = m83u(jSONObject, "adapterClassNames");
                    List listM83u2 = m83u(jSONObject, "dataSourceClassNames");
                    List listM83u3 = m83u(jSONObject, "itemClassNames");
                    List listM83u4 = m83u(jSONObject, "holderClassNames");
                    List listM83u5 = m83u(jSONObject, "requestClassNames");
                    List listM83u6 = m83u(jSONObject, "storageClassNames");
                    String strOptString = jSONObject.optString("getDataSourceMethodName");
                    AbstractC0223g.m417d(strOptString, "optString(...)");
                    String strOptString2 = jSONObject.optString("getConversationListMethodName");
                    AbstractC0223g.m417d(strOptString2, "optString(...)");
                    String strOptString3 = jSONObject.optString("requestRefreshMethodName");
                    AbstractC0223g.m417d(strOptString3, "optString(...)");
                    String strOptString4 = jSONObject.optString("submitListMethodName");
                    AbstractC0223g.m417d(strOptString4, "optString(...)");
                    int iOptInt = jSONObject.optInt("versionCode", -1);
                    String strOptString5 = jSONObject.optString("versionName");
                    AbstractC0223g.m417d(strOptString5, "optString(...)");
                    c0104d = new C0002B(listM83u, listM83u2, listM83u3, listM83u4, listM83u5, listM83u6, strOptString, strOptString2, strOptString3, strOptString4, iOptInt, strOptString5, jSONObject.optLong("updatedAt", 0L));
                    if (!listM83u.isEmpty()) {
                        if (listM83u2.isEmpty()) {
                            c0104d = null;
                        }
                    }
                } else {
                    c0104d = null;
                }
            } catch (Throwable th) {
                c0104d = new C0104d(th);
            }
            Throwable thM246a = AbstractC0105e.m246a(c0104d);
            if (thM246a != null) {
                AbstractC0731a.m1387d("conversation hook point cache read fail", "conversation_mvvm_list_v2", thM246a);
                m63a("conversation_mvvm_list_v2");
            }
            if (c0104d instanceof C0104d) {
                c0104d = null;
            }
            c0002b = (C0002B) c0104d;
        }
        if (c0002b != null) {
            if (c0002b.f21k == AbstractC1135r.m2494p()) {
                if (!c0002b.f22l.equals(AbstractC1135r.m2495q())) {
                    c0002b = null;
                }
                if (c0002b != null) {
                    return new C0037j(c0002b.f11a, c0002b.f12b, c0002b.f13c, c0002b.f14d, c0002b.f16f, c0002b.f15e, c0002b.f17g, c0002b.f18h, c0002b.f19i, c0002b.f20j);
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a7  */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r12v17, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r12v19, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r12v20, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r12v22, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.List] */
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C0053z m69g(Context context) {
        Object c0104d;
        C0003C c0003c;
        AbstractC0223g.m418e(context, "context");
        SharedPreferences sharedPreferences = AbstractC0503h.m991x().getSharedPreferences("hook_point_cache", 0);
        AbstractC0223g.m417d(sharedPreferences, "getSharedPreferences(...)");
        try {
            Method declaredMethod = sharedPreferences.getClass().getDeclaredMethod("startReloadIfChangedUnexpectedly", null);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(sharedPreferences, null);
        } catch (Throwable unused) {
        }
        String string = sharedPreferences.getString("group_create_contact_v1", null);
        if (string == null) {
            c0003c = null;
        } else {
            try {
                JSONObject jSONObject = new JSONObject(string);
                if (m80r(jSONObject, 1)) {
                    List listM83u = m83u(jSONObject, "activityClassNames");
                    List listM83u2 = m83u(jSONObject, "adapterClassNames");
                    List listM83u3 = m83u(jSONObject, "listEntryNames");
                    int iOptInt = jSONObject.optInt("versionCode", -1);
                    String strOptString = jSONObject.optString("versionName");
                    AbstractC0223g.m417d(strOptString, "optString(...)");
                    c0104d = new C0003C(listM83u, listM83u2, listM83u3, iOptInt, strOptString, jSONObject.optLong("updatedAt", 0L));
                } else {
                    c0104d = null;
                }
            } catch (Throwable th) {
                c0104d = new C0104d(th);
            }
            Throwable thM246a = AbstractC0105e.m246a(c0104d);
            if (thM246a != null) {
                AbstractC0731a.m1387d("group create contact hook point cache read fail", thM246a);
                m63a("group_create_contact_v1");
            }
            if (c0104d instanceof C0104d) {
                c0104d = null;
            }
            c0003c = (C0003C) c0104d;
        }
        if (c0003c == null) {
            return null;
        }
        if (c0003c.f27d == AbstractC1135r.m2494p()) {
            if (!c0003c.f28e.equals(AbstractC1135r.m2495q())) {
                c0003c = null;
            }
        }
        if (c0003c == null) {
            return null;
        }
        if (c0003c.f24a.isEmpty() || c0003c.f25b.isEmpty() || c0003c.f26c.isEmpty()) {
            c0003c = null;
        }
        if (c0003c == null) {
            return null;
        }
        return new C0053z(c0003c.f24a, c0003c.f25b, c0003c.f26c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static C0013M m70h(Context context) {
        C0013M c0013m;
        SharedPreferences sharedPreferencesM350f = AbstractC0174d.m350f("hook_point_cache", 0, "getSharedPreferences(...)");
        try {
            Method declaredMethod = sharedPreferencesM350f.getClass().getDeclaredMethod("startReloadIfChangedUnexpectedly", null);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(sharedPreferencesM350f, null);
        } catch (Throwable unused) {
        }
        String string = sharedPreferencesM350f.getString("conversation_legacy_list", null);
        if (string == null) {
            c0013m = null;
        } else {
            try {
                JSONObject jSONObject = new JSONObject(string);
                if (m80r(jSONObject, 2)) {
                    String strOptString = jSONObject.optString("adapterClassName");
                    AbstractC0223g.m417d(strOptString, "optString(...)");
                    String strOptString2 = jSONObject.optString("itemClassName");
                    AbstractC0223g.m417d(strOptString2, "optString(...)");
                    String strOptString3 = jSONObject.optString("getItemMethodName");
                    AbstractC0223g.m417d(strOptString3, "optString(...)");
                    String strOptString4 = jSONObject.optString("usernameMethodName");
                    AbstractC0223g.m417d(strOptString4, "optString(...)");
                    int iOptInt = jSONObject.optInt("versionCode");
                    String strOptString5 = jSONObject.optString("versionName");
                    AbstractC0223g.m417d(strOptString5, "optString(...)");
                    c0013m = new C0013M(strOptString, strOptString2, strOptString3, strOptString4, iOptInt, strOptString5);
                }
            } catch (Throwable th) {
                AbstractC0731a.m1387d("HookPointCache", "read legacy conversation hook point fail", th);
            }
            c0013m = null;
        }
        if (c0013m == null) {
            return null;
        }
        if (c0013m.f124e != AbstractC1135r.m2494p()) {
            return null;
        }
        if (c0013m.f125f.equals(AbstractC1135r.m2495q())) {
            return c0013m;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:95:0x00b4 */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x018e  */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r10v8, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r12v13, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r13v10, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r14v4, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r15v12, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Object, java.util.List] */
    /* JADX INFO: renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C0014N m71i(Context context) {
        String str;
        Object c0104d;
        C0005E c0005e;
        ArrayList arrayList;
        ArrayList arrayList2;
        C0016P c0016p;
        C0015O c0015o;
        SharedPreferences sharedPreferencesM350f = AbstractC0174d.m350f("hook_point_cache", 0, "getSharedPreferences(...)");
        try {
            Method declaredMethod = sharedPreferencesM350f.getClass().getDeclaredMethod("startReloadIfChangedUnexpectedly", null);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(sharedPreferencesM350f, null);
        } catch (Throwable unused) {
        }
        String string = sharedPreferencesM350f.getString("quick_add_menu_v10", null);
        if (string == null) {
            c0005e = null;
        } else {
            try {
                JSONObject jSONObject = new JSONObject(string);
                if (m80r(jSONObject, 5)) {
                    List listM83u = m83u(jSONObject, "conversationLongClickClassNames");
                    List listM83u2 = m83u(jSONObject, "conversationMenuCallbackClassNames");
                    List listM83u3 = m83u(jSONObject, "popupClassNames");
                    JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("popupCreateSpecs");
                    if (jSONArrayOptJSONArray != null) {
                        C0244c c0244cM176U = AbstractC0079h.m176U(0, jSONArrayOptJSONArray.length());
                        arrayList = new ArrayList();
                        Iterator it = c0244cM176U.iterator();
                        while (((C0243b) it).f588c) {
                            JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(((C0243b) it).m458a());
                            if (jSONObjectOptJSONObject == null) {
                                c0015o = null;
                            } else {
                                String strOptString = jSONObjectOptJSONObject.optString("popupClassName");
                                String strOptString2 = jSONObjectOptJSONObject.optString("callbackClassName");
                                String strOptString3 = jSONObjectOptJSONObject.optString("methodName", "g");
                                AbstractC0223g.m415b(strOptString);
                                if (!AbstractC0307q.m534d0(strOptString)) {
                                    AbstractC0223g.m415b(strOptString2);
                                    if (AbstractC0307q.m534d0(strOptString2)) {
                                        c0015o = null;
                                    } else {
                                        AbstractC0223g.m415b(strOptString3);
                                        c0015o = new C0015O(strOptString, strOptString2, strOptString3);
                                    }
                                }
                            }
                            if (c0015o != null) {
                                arrayList.add(c0015o);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                    C0131s c0131s = C0131s.f426a;
                    List list = arrayList;
                    if (arrayList == null) {
                        list = c0131s;
                    }
                    JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("popupBuildSpecs");
                    if (jSONArrayOptJSONArray2 != null) {
                        C0244c c0244cM176U2 = AbstractC0079h.m176U(0, jSONArrayOptJSONArray2.length());
                        arrayList2 = new ArrayList();
                        Iterator it2 = c0244cM176U2.iterator();
                        while (((C0243b) it2).f588c) {
                            JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray2.optJSONObject(((C0243b) it2).m458a());
                            if (jSONObjectOptJSONObject2 != null) {
                                String strOptString4 = jSONObjectOptJSONObject2.optString("popupClassName");
                                String strOptString5 = jSONObjectOptJSONObject2.optString("methodName");
                                AbstractC0223g.m415b(strOptString4);
                                if (!AbstractC0307q.m534d0(strOptString4)) {
                                    AbstractC0223g.m415b(strOptString5);
                                    c0016p = AbstractC0307q.m534d0(strOptString5) ? null : new C0016P(strOptString4, strOptString5);
                                }
                            }
                            if (c0016p != null) {
                                arrayList2.add(c0016p);
                            }
                        }
                    } else {
                        arrayList2 = null;
                    }
                    List list2 = arrayList2 == null ? c0131s : arrayList2;
                    List listM83u4 = m83u(jSONObject, "popupClickHandlerClassNames");
                    List listM83u5 = m83u(jSONObject, "popupAdapterClassNames");
                    List listM83u6 = m83u(jSONObject, "contactMenuCallbackClassNames");
                    List listM83u7 = m83u(jSONObject, "addressMenuCreateClassNames");
                    List listM83u8 = m83u(jSONObject, "addressMenuClickClassNames");
                    int iOptInt = jSONObject.optInt("versionCode", -1);
                    String strOptString6 = jSONObject.optString("versionName");
                    AbstractC0223g.m417d(strOptString6, "optString(...)");
                    str = "quick_add_menu_v10";
                    try {
                        c0104d = new C0005E(listM83u, listM83u2, listM83u3, list, list2, listM83u4, listM83u5, listM83u6, listM83u7, listM83u8, iOptInt, strOptString6, jSONObject.optLong("updatedAt", 0L));
                    } catch (Throwable th) {
                        th = th;
                        c0104d = new C0104d(th);
                    }
                } else {
                    c0104d = null;
                    str = "quick_add_menu_v10";
                }
            } catch (Throwable th2) {
                th = th2;
                str = "quick_add_menu_v10";
            }
            Throwable thM246a = AbstractC0105e.m246a(c0104d);
            if (thM246a != null) {
                AbstractC0731a.m1387d("quick add hook point cache read fail", thM246a);
                m63a(str);
            }
            if (c0104d instanceof C0104d) {
                c0104d = null;
            }
            c0005e = (C0005E) c0104d;
        }
        if (c0005e != null) {
            if (c0005e.f46k == AbstractC1135r.m2494p()) {
                if (!c0005e.f47l.equals(AbstractC1135r.m2495q())) {
                    c0005e = null;
                }
                if (c0005e != null) {
                    if (c0005e.f39d.isEmpty() && c0005e.f44i.isEmpty() && c0005e.f45j.isEmpty()) {
                        c0005e = null;
                    }
                    if (c0005e != null) {
                        return new C0014N(c0005e.f36a, c0005e.f37b, c0005e.f38c, c0005e.f39d, c0005e.f40e, c0005e.f41f, c0005e.f42g, c0005e.f43h, c0005e.f44i, c0005e.f45j);
                    }
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:31:0x00d1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:82:0x00d1 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0166  */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v9, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v21, types: [F0.s] */
    /* JADX WARN: Type inference failed for: r1v22, types: [java.util.ArrayList] */
    /* JADX INFO: renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C0018S m72j(Context context) {
        String str;
        Object c0104d;
        C0006F c0006f;
        ?? arrayList;
        SharedPreferences sharedPreferencesM350f = AbstractC0174d.m350f("hook_point_cache", 0, "getSharedPreferences(...)");
        try {
            Method declaredMethod = sharedPreferencesM350f.getClass().getDeclaredMethod("startReloadIfChangedUnexpectedly", null);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(sharedPreferencesM350f, null);
        } catch (Throwable unused) {
        }
        String string = sharedPreferencesM350f.getString("read_trace_v1", null);
        if (string == null) {
            c0006f = null;
        } else {
            try {
                JSONObject jSONObject = new JSONObject(string);
                if (m80r(jSONObject, 4)) {
                    String strOptString = jSONObject.optString("sendClickClassName");
                    AbstractC0223g.m417d(strOptString, "optString(...)");
                    String strOptString2 = jSONObject.optString("sendClickMethodName");
                    AbstractC0223g.m417d(strOptString2, "optString(...)");
                    String strOptString3 = jSONObject.optString("sendClickMethodSign");
                    AbstractC0223g.m417d(strOptString3, "optString(...)");
                    JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("sendClickMethods");
                    if (jSONArrayOptJSONArray != null) {
                        int length = jSONArrayOptJSONArray.length();
                        ArrayList arrayList2 = new ArrayList(length);
                        for (int i2 = 0; i2 < length; i2++) {
                            JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i2);
                            if (jSONObjectOptJSONObject == null) {
                                jSONObjectOptJSONObject = new JSONObject();
                            }
                            String strOptString4 = jSONObjectOptJSONObject.optString("className");
                            AbstractC0223g.m417d(strOptString4, "optString(...)");
                            String strOptString5 = jSONObjectOptJSONObject.optString("methodName");
                            AbstractC0223g.m417d(strOptString5, "optString(...)");
                            String strOptString6 = jSONObjectOptJSONObject.optString("methodSign");
                            AbstractC0223g.m417d(strOptString6, "optString(...)");
                            arrayList2.add(new C0019T(strOptString4, strOptString5, strOptString6));
                        }
                        arrayList = new ArrayList();
                        for (Object obj : arrayList2) {
                            C0019T c0019t = (C0019T) obj;
                            if (!AbstractC0307q.m534d0(c0019t.f154a) && !AbstractC0307q.m534d0(c0019t.f155b) && !AbstractC0307q.m534d0(c0019t.f156c)) {
                                arrayList.add(obj);
                            }
                        }
                    } else {
                        arrayList = 0;
                    }
                    if (arrayList == 0) {
                        arrayList = C0131s.f426a;
                    }
                    ?? r10 = arrayList;
                    String strOptString7 = jSONObject.optString("appMsgContentClassName");
                    AbstractC0223g.m417d(strOptString7, "optString(...)");
                    String strOptString8 = jSONObject.optString("parseXmlMethodName");
                    AbstractC0223g.m417d(strOptString8, "optString(...)");
                    String strOptString9 = jSONObject.optString("parseXmlMethodSign");
                    AbstractC0223g.m417d(strOptString9, "optString(...)");
                    String strOptString10 = jSONObject.optString("appMsgLogicClassName");
                    AbstractC0223g.m417d(strOptString10, "optString(...)");
                    String strOptString11 = jSONObject.optString("sendAppMsgMethodName");
                    AbstractC0223g.m417d(strOptString11, "optString(...)");
                    String strOptString12 = jSONObject.optString("sendAppMsgMethodSign");
                    AbstractC0223g.m417d(strOptString12, "optString(...)");
                    int iOptInt = jSONObject.optInt("versionCode", -1);
                    String strOptString13 = jSONObject.optString("versionName");
                    AbstractC0223g.m417d(strOptString13, "optString(...)");
                    str = "read_trace_v1";
                    try {
                        c0104d = new C0006F(strOptString, strOptString2, strOptString3, r10, strOptString7, strOptString8, strOptString9, strOptString10, strOptString11, strOptString12, iOptInt, strOptString13, jSONObject.optLong("updatedAt", 0L));
                    } catch (Throwable th) {
                        th = th;
                        c0104d = new C0104d(th);
                    }
                } else {
                    c0104d = null;
                    str = "read_trace_v1";
                }
            } catch (Throwable th2) {
                th = th2;
                str = "read_trace_v1";
            }
            Throwable thM246a = AbstractC0105e.m246a(c0104d);
            if (thM246a != null) {
                AbstractC0731a.m1387d("read trace hook point cache read fail", thM246a);
                m63a(str);
            }
            if (c0104d instanceof C0104d) {
                c0104d = null;
            }
            c0006f = (C0006F) c0104d;
        }
        if (c0006f != null) {
            if (c0006f.f59k == AbstractC1135r.m2494p()) {
                if (!c0006f.f60l.equals(AbstractC1135r.m2495q())) {
                    c0006f = null;
                }
                if (c0006f != null) {
                    if (AbstractC0307q.m534d0(c0006f.f49a) || AbstractC0307q.m534d0(c0006f.f50b) || AbstractC0307q.m534d0(c0006f.f53e) || AbstractC0307q.m534d0(c0006f.f54f) || AbstractC0307q.m534d0(c0006f.f56h) || AbstractC0307q.m534d0(c0006f.f57i)) {
                        c0006f = null;
                    }
                    if (c0006f != null) {
                        return new C0018S(c0006f.f49a, c0006f.f50b, c0006f.f51c, c0006f.f52d, c0006f.f53e, c0006f.f54f, c0006f.f55g, c0006f.f56h, c0006f.f57i, c0006f.f58j);
                    }
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a2  */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r12v19, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r12v21, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r12v22, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r12v24, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.Object, java.util.List] */
    /* JADX INFO: renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C0020U m73k(Context context) {
        Object c0104d;
        C0007G c0007g;
        SharedPreferences sharedPreferencesM350f = AbstractC0174d.m350f("hook_point_cache", 0, "getSharedPreferences(...)");
        try {
            Method declaredMethod = sharedPreferencesM350f.getClass().getDeclaredMethod("startReloadIfChangedUnexpectedly", null);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(sharedPreferencesM350f, null);
        } catch (Throwable unused) {
        }
        String string = sharedPreferencesM350f.getString("recent_forward_v1", null);
        if (string == null) {
            c0007g = null;
        } else {
            try {
                JSONObject jSONObject = new JSONObject(string);
                if (m80r(jSONObject, 2)) {
                    List listM83u = m83u(jSONObject, "activityClassNames");
                    List listM83u2 = m83u(jSONObject, "adapterClassNames");
                    List listM83u3 = m83u(jSONObject, "dataFieldNames");
                    List listM83u4 = m83u(jSONObject, "recyclerEntryNames");
                    int iOptInt = jSONObject.optInt("versionCode", -1);
                    String strOptString = jSONObject.optString("versionName");
                    AbstractC0223g.m417d(strOptString, "optString(...)");
                    c0104d = new C0007G(listM83u, listM83u2, listM83u3, listM83u4, iOptInt, strOptString, jSONObject.optLong("updatedAt", 0L));
                } else {
                    c0104d = null;
                }
            } catch (Throwable th) {
                c0104d = new C0104d(th);
            }
            Throwable thM246a = AbstractC0105e.m246a(c0104d);
            if (thM246a != null) {
                AbstractC0731a.m1387d("recent forward hook point cache read fail", thM246a);
                m63a("recent_forward_v1");
            }
            if (c0104d instanceof C0104d) {
                c0104d = null;
            }
            c0007g = (C0007G) c0104d;
        }
        if (c0007g == null) {
            return null;
        }
        if (c0007g.f66e == AbstractC1135r.m2494p()) {
            if (!c0007g.f67f.equals(AbstractC1135r.m2495q())) {
                c0007g = null;
            }
        }
        if (c0007g == null) {
            return null;
        }
        if (c0007g.f62a.isEmpty() || c0007g.f63b.isEmpty() || c0007g.f64c.isEmpty()) {
            c0007g = null;
        }
        if (c0007g != null) {
            return new C0020U(c0007g.f62a, c0007g.f63b, c0007g.f64c, c0007g.f65d);
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0096  */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r10v17, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r10v19, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r10v20, types: [java.lang.Object, java.util.Collection] */
    /* JADX INFO: renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C0021V m74l(Context context) {
        Object c0104d;
        C0008H c0008h;
        SharedPreferences sharedPreferencesM350f = AbstractC0174d.m350f("hook_point_cache", 0, "getSharedPreferences(...)");
        try {
            Method declaredMethod = sharedPreferencesM350f.getClass().getDeclaredMethod("startReloadIfChangedUnexpectedly", null);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(sharedPreferencesM350f, null);
        } catch (Throwable unused) {
        }
        String string = sharedPreferencesM350f.getString("search_command_v1", null);
        if (string == null) {
            c0008h = null;
        } else {
            try {
                JSONObject jSONObject = new JSONObject(string);
                if (m80r(jSONObject, 2)) {
                    List listM83u = m83u(jSONObject, "searchViewClassNames");
                    List listM83u2 = m83u(jSONObject, "editTextFieldNames");
                    int iOptInt = jSONObject.optInt("versionCode", -1);
                    String strOptString = jSONObject.optString("versionName");
                    AbstractC0223g.m417d(strOptString, "optString(...)");
                    c0104d = new C0008H(listM83u, listM83u2, iOptInt, strOptString, jSONObject.optLong("updatedAt", 0L));
                } else {
                    c0104d = null;
                }
            } catch (Throwable th) {
                c0104d = new C0104d(th);
            }
            Throwable thM246a = AbstractC0105e.m246a(c0104d);
            if (thM246a != null) {
                AbstractC0731a.m1387d("search command hook point cache read fail", thM246a);
                m63a("search_command_v1");
            }
            if (c0104d instanceof C0104d) {
                c0104d = null;
            }
            c0008h = (C0008H) c0104d;
        }
        if (c0008h == null) {
            return null;
        }
        if (c0008h.f71c == AbstractC1135r.m2494p()) {
            if (!c0008h.f72d.equals(AbstractC1135r.m2495q())) {
                c0008h = null;
            }
        }
        if (c0008h == null) {
            return null;
        }
        if (c0008h.f69a.isEmpty() || c0008h.f70b.isEmpty()) {
            c0008h = null;
        }
        if (c0008h != null) {
            return new C0021V(c0008h.f69a, c0008h.f70b);
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0117  */
    /* JADX WARN: Type inference failed for: r0v34, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v35, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v36, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r14v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r15v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v13, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, java.util.List] */
    /* JADX INFO: renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C0022W m75m(Context context) {
        Object c0104d;
        C0009I c0009i;
        SharedPreferences sharedPreferencesM350f = AbstractC0174d.m350f("hook_point_cache", 0, "getSharedPreferences(...)");
        try {
            Method declaredMethod = sharedPreferencesM350f.getClass().getDeclaredMethod("startReloadIfChangedUnexpectedly", null);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(sharedPreferencesM350f, null);
        } catch (Throwable unused) {
        }
        String string = sharedPreferencesM350f.getString("sns_moment_v2", null);
        if (string == null) {
            c0009i = null;
        } else {
            try {
                JSONObject jSONObject = new JSONObject(string);
                if (m80r(jSONObject, 2)) {
                    List listM83u = m83u(jSONObject, "timelineClassNames");
                    List listM83u2 = m83u(jSONObject, "snsObjectProviderClassNames");
                    List listM83u3 = m83u(jSONObject, "detailActivityClassNames");
                    List listM83u4 = m83u(jSONObject, "selfAlbumAdapterClassNames");
                    List listM83u5 = m83u(jSONObject, "snsInfoUserFieldNames");
                    List listM83u6 = m83u(jSONObject, "snsInfoSnsIdFieldNames");
                    List listM83u7 = m83u(jSONObject, "snsInfoLocalIdFieldNames");
                    List listM83u8 = m83u(jSONObject, "timeLineObjectUserFieldNames");
                    List listM83u9 = m83u(jSONObject, "snsObjectExtFlagFieldNames");
                    List listM83u10 = m83u(jSONObject, "snsObjectLikeListFieldNames");
                    List listM83u11 = m83u(jSONObject, "snsObjectLikeCountFieldNames");
                    List listM83u12 = m83u(jSONObject, "snsObjectLikeListCountFieldNames");
                    List listM83u13 = m83u(jSONObject, "snsObjectCommentListFieldNames");
                    List listM83u14 = m83u(jSONObject, "snsObjectCommentCountFieldNames");
                    List listM83u15 = m83u(jSONObject, "snsObjectCommentListCountFieldNames");
                    List listM82t = m82t(jSONObject, "contextMenuCreateMethods");
                    List listM82t2 = m82t(jSONObject, "contextMenuSelectMethods");
                    int iOptInt = jSONObject.optInt("versionCode", -1);
                    String strOptString = jSONObject.optString("versionName");
                    AbstractC0223g.m417d(strOptString, "optString(...)");
                    c0104d = new C0009I(listM83u, listM83u2, listM83u3, listM83u4, listM83u5, listM83u6, listM83u7, listM83u8, listM83u9, listM83u10, listM83u11, listM83u12, listM83u13, listM83u14, listM83u15, listM82t, listM82t2, iOptInt, strOptString, jSONObject.optLong("updatedAt", 0L));
                    if (listM83u.isEmpty() && listM83u2.isEmpty() && listM83u3.isEmpty()) {
                        if (listM83u4.isEmpty()) {
                            c0104d = null;
                        }
                    }
                } else {
                    c0104d = null;
                }
            } catch (Throwable th) {
                c0104d = new C0104d(th);
            }
            Throwable thM246a = AbstractC0105e.m246a(c0104d);
            if (thM246a != null) {
                AbstractC0731a.m1387d("sns hook point cache read fail", thM246a);
                m63a("sns_moment_v2");
            }
            if (c0104d instanceof C0104d) {
                c0104d = null;
            }
            c0009i = (C0009I) c0104d;
        }
        if (c0009i != null) {
            if (c0009i.f91r == AbstractC1135r.m2494p()) {
                if (!c0009i.f92s.equals(AbstractC1135r.m2495q())) {
                    c0009i = null;
                }
                if (c0009i != null) {
                    return new C0022W(c0009i.f74a, c0009i.f75b, c0009i.f76c, c0009i.f77d, c0009i.f78e, c0009i.f79f, c0009i.f80g, c0009i.f81h, c0009i.f82i, c0009i.f83j, c0009i.f84k, c0009i.f85l, c0009i.f86m, c0009i.f87n, c0009i.f88o, c0009i.f89p, c0009i.f90q);
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00bb  */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r14v21, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r14v23, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, java.util.List] */
    /* JADX INFO: renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C0025Z m76n(Context context) {
        Object c0104d;
        C0010J c0010j;
        AbstractC0223g.m418e(context, "context");
        SharedPreferences sharedPreferences = AbstractC0503h.m991x().getSharedPreferences("hook_point_cache", 0);
        AbstractC0223g.m417d(sharedPreferences, "getSharedPreferences(...)");
        try {
            Method declaredMethod = sharedPreferences.getClass().getDeclaredMethod("startReloadIfChangedUnexpectedly", null);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(sharedPreferences, null);
        } catch (Throwable unused) {
        }
        String string = sharedPreferences.getString("storage_chat_history_v4", null);
        if (string == null) {
            c0010j = null;
        } else {
            try {
                JSONObject jSONObject = new JSONObject(string);
                if (m80r(jSONObject, 3)) {
                    List listM83u = m83u(jSONObject, "adapterClassNames");
                    List listM83u2 = m83u(jSONObject, "itemClassNames");
                    List listM83u3 = m83u(jSONObject, "usernameFieldNames");
                    List listM83u4 = m83u(jSONObject, "refreshMethodNames");
                    List listM83u5 = m83u(jSONObject, "fileSortEntryNames");
                    List listM83u6 = m83u(jSONObject, "fileSortActivityClassNames");
                    int iOptInt = jSONObject.optInt("versionCode", -1);
                    String strOptString = jSONObject.optString("versionName");
                    AbstractC0223g.m417d(strOptString, "optString(...)");
                    c0104d = new C0010J(listM83u, listM83u2, listM83u3, listM83u4, listM83u5, listM83u6, iOptInt, strOptString, jSONObject.optLong("updatedAt", 0L));
                } else {
                    c0104d = null;
                }
            } catch (Throwable th) {
                c0104d = new C0104d(th);
            }
            Throwable thM246a = AbstractC0105e.m246a(c0104d);
            if (thM246a != null) {
                AbstractC0731a.m1387d("storage hook point cache read fail", thM246a);
                m63a("storage_chat_history_v4");
            }
            if (c0104d instanceof C0104d) {
                c0104d = null;
            }
            c0010j = (C0010J) c0104d;
        }
        if (c0010j == null) {
            return null;
        }
        if (c0010j.f100g == AbstractC1135r.m2494p()) {
            if (!c0010j.f101h.equals(AbstractC1135r.m2495q())) {
                c0010j = null;
            }
        }
        if (c0010j == null) {
            return null;
        }
        if (c0010j.f94a.isEmpty() || c0010j.f95b.isEmpty()) {
            c0010j = null;
        }
        if (c0010j == null) {
            return null;
        }
        return new C0025Z(c0010j.f94a, c0010j.f95b, c0010j.f96c, c0010j.f97d, c0010j.f98e, c0010j.f99f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a7  */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r12v17, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r12v19, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r12v20, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.List] */
    /* JADX INFO: renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C0027a0 m77o(Context context) {
        Object c0104d;
        C0011K c0011k;
        AbstractC0223g.m418e(context, "context");
        SharedPreferences sharedPreferences = AbstractC0503h.m991x().getSharedPreferences("hook_point_cache", 0);
        AbstractC0223g.m417d(sharedPreferences, "getSharedPreferences(...)");
        try {
            Method declaredMethod = sharedPreferences.getClass().getDeclaredMethod("startReloadIfChangedUnexpectedly", null);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(sharedPreferences, null);
        } catch (Throwable unused) {
        }
        String string = sharedPreferences.getString("tag_contact_v1", null);
        if (string == null) {
            c0011k = null;
        } else {
            try {
                JSONObject jSONObject = new JSONObject(string);
                if (m80r(jSONObject, 1)) {
                    List listM83u = m83u(jSONObject, "activityClassNames");
                    List listM83u2 = m83u(jSONObject, "adapterClassNames");
                    List listM83u3 = m83u(jSONObject, "recyclerEntryNames");
                    int iOptInt = jSONObject.optInt("versionCode", -1);
                    String strOptString = jSONObject.optString("versionName");
                    AbstractC0223g.m417d(strOptString, "optString(...)");
                    c0104d = new C0011K(listM83u, listM83u2, listM83u3, iOptInt, strOptString, jSONObject.optLong("updatedAt", 0L));
                } else {
                    c0104d = null;
                }
            } catch (Throwable th) {
                c0104d = new C0104d(th);
            }
            Throwable thM246a = AbstractC0105e.m246a(c0104d);
            if (thM246a != null) {
                AbstractC0731a.m1387d("tag contact hook point cache read fail", thM246a);
                m63a("tag_contact_v1");
            }
            if (c0104d instanceof C0104d) {
                c0104d = null;
            }
            c0011k = (C0011K) c0104d;
        }
        if (c0011k == null) {
            return null;
        }
        if (c0011k.f106d == AbstractC1135r.m2494p()) {
            if (!c0011k.f107e.equals(AbstractC1135r.m2495q())) {
                c0011k = null;
            }
        }
        if (c0011k == null) {
            return null;
        }
        if (c0011k.f103a.isEmpty() || c0011k.f105c.isEmpty()) {
            c0011k = null;
        }
        if (c0011k == null) {
            return null;
        }
        return new C0027a0(c0011k.f103a, c0011k.f104b, c0011k.f105c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d0  */
    /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r0v29, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r13v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, java.util.List] */
    /* JADX INFO: renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C0029b0 m78p(Context context) {
        String str;
        Object c0104d;
        C0012L c0012l;
        AbstractC0223g.m418e(context, "context");
        SharedPreferences sharedPreferences = AbstractC0503h.m991x().getSharedPreferences("hook_point_cache", 0);
        AbstractC0223g.m417d(sharedPreferences, "getSharedPreferences(...)");
        try {
            Method declaredMethod = sharedPreferences.getClass().getDeclaredMethod("startReloadIfChangedUnexpectedly", null);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(sharedPreferences, null);
        } catch (Throwable unused) {
        }
        String string = sharedPreferences.getString("text_status_v1", null);
        if (string == null) {
            c0012l = null;
        } else {
            try {
                JSONObject jSONObject = new JSONObject(string);
                if (m80r(jSONObject, 2)) {
                    List listM83u = m83u(jSONObject, "activityClassNames");
                    List listM83u2 = m83u(jSONObject, "adapterClassNames");
                    List listM83u3 = m83u(jSONObject, "dataFieldNames");
                    List listM83u4 = m83u(jSONObject, "groupItemClassNames");
                    List listM83u5 = m83u(jSONObject, "titleItemClassNames");
                    List listM83u6 = m83u(jSONObject, "mainRecyclerEntryNames");
                    List listM83u7 = m83u(jSONObject, "titleEntryNames");
                    List listM83u8 = m83u(jSONObject, "avatarContainerEntryNames");
                    int iOptInt = jSONObject.optInt("versionCode", -1);
                    String strOptString = jSONObject.optString("versionName");
                    AbstractC0223g.m417d(strOptString, "optString(...)");
                    str = "text_status_v1";
                    try {
                        c0104d = new C0012L(listM83u, listM83u2, listM83u3, listM83u4, listM83u5, listM83u6, listM83u7, listM83u8, iOptInt, strOptString, jSONObject.optLong("updatedAt", 0L));
                    } catch (Throwable th) {
                        th = th;
                        c0104d = new C0104d(th);
                    }
                } else {
                    c0104d = null;
                    str = "text_status_v1";
                }
            } catch (Throwable th2) {
                th = th2;
                str = "text_status_v1";
            }
            Throwable thM246a = AbstractC0105e.m246a(c0104d);
            if (thM246a != null) {
                AbstractC0731a.m1387d("text status hook point cache read fail", thM246a);
                m63a(str);
            }
            if (c0104d instanceof C0104d) {
                c0104d = null;
            }
            c0012l = (C0012L) c0104d;
        }
        if (c0012l != null) {
            if (c0012l.f117i == AbstractC1135r.m2494p()) {
                if (!c0012l.f118j.equals(AbstractC1135r.m2495q())) {
                    c0012l = null;
                }
                if (c0012l != null) {
                    if (c0012l.f109a.isEmpty() || c0012l.f110b.isEmpty() || c0012l.f112d.isEmpty()) {
                        c0012l = null;
                    }
                    if (c0012l != null) {
                        return new C0029b0(c0012l.f109a, c0012l.f110b, c0012l.f111c, c0012l.f112d, c0012l.f113e, c0012l.f114f, c0012l.f115g, c0012l.f116h);
                    }
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public static C0031d m79q(Context context) {
        AbstractC0223g.m418e(context, "context");
        C0004D c0004dM64b = m64b("wechat_xml_parser_method_v1");
        if (c0004dM64b == null) {
            return null;
        }
        if (!c0004dM64b.m0a()) {
            c0004dM64b = null;
        }
        if (c0004dM64b == null) {
            return null;
        }
        return new C0031d(c0004dM64b.f30a, c0004dM64b.f31b, c0004dM64b.f32c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r */
    public static boolean m80r(JSONObject jSONObject, int i2) {
        if (jSONObject.optInt("cacheSchemaVersion", -1) != 3 || jSONObject.optInt("ruleVersion", -1) != i2) {
            return false;
        }
        String strOptString = jSONObject.optString("ruleHash");
        StringBuilder sb = new StringBuilder("wxmask-dexkit:3:");
        sb.append(i2);
        return AbstractC0223g.m414a(strOptString, sb.toString()) && AbstractC0223g.m414a(jSONObject.optString("packageFingerprint"), AbstractC1135r.m2491m());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s */
    public static void m81s(String str, boolean z2) {
        JSONObject jSONObjectPut = new JSONObject().put("versionCode", AbstractC1135r.m2494p()).put("versionName", AbstractC1135r.m2495q()).put("packageFingerprint", AbstractC1135r.m2491m()).put("cacheSchemaVersion", 3).put("shown", z2).put("updatedAt", System.currentTimeMillis());
        SharedPreferences sharedPreferences = AbstractC0503h.m991x().getSharedPreferences("hook_point_cache", 0);
        AbstractC0223g.m417d(sharedPreferences, "getSharedPreferences(...)");
        sharedPreferences.edit().putString(str, jSONObjectPut.toString()).apply();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: t */
    public static List m82t(JSONObject jSONObject, String str) {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(str);
        if (jSONArrayOptJSONArray == null) {
            return C0131s.f426a;
        }
        C0244c c0244cM176U = AbstractC0079h.m176U(0, jSONArrayOptJSONArray.length());
        ArrayList arrayList = new ArrayList();
        Iterator it = c0244cM176U.iterator();
        while (((C0243b) it).f588c) {
            JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(((C0243b) it).m458a());
            C0023X c0023x = null;
            if (jSONObjectOptJSONObject != null) {
                String strOptString = jSONObjectOptJSONObject.optString("className");
                String strOptString2 = jSONObjectOptJSONObject.optString("methodName");
                String strOptString3 = jSONObjectOptJSONObject.optString("methodSign");
                AbstractC0223g.m415b(strOptString);
                if (!AbstractC0307q.m534d0(strOptString)) {
                    AbstractC0223g.m415b(strOptString2);
                    if (!AbstractC0307q.m534d0(strOptString2)) {
                        AbstractC0223g.m415b(strOptString3);
                        c0023x = new C0023X(strOptString, strOptString2, strOptString3);
                    }
                }
            }
            if (c0023x != null) {
                arrayList.add(c0023x);
            }
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: u */
    public static List m83u(JSONObject jSONObject, String str) {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(str);
        if (jSONArrayOptJSONArray == null) {
            return C0131s.f426a;
        }
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
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: v */
    public static JSONObject m84v(JSONObject jSONObject, int i2) {
        JSONObject jSONObjectPut = jSONObject.put("cacheSchemaVersion", 3).put("ruleVersion", i2).put("ruleHash", "wxmask-dexkit:3:" + i2).put("versionCode", AbstractC1135r.m2494p()).put("versionName", AbstractC1135r.m2495q()).put("packageFingerprint", AbstractC1135r.m2491m()).put("updatedAt", System.currentTimeMillis());
        AbstractC0223g.m417d(jSONObjectPut, "put(...)");
        return jSONObjectPut;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: w */
    public static void m85w(Context context, C0036i c0036i) throws JSONException {
        AbstractC0223g.m418e(context, "context");
        JSONArray jSONArray = new JSONArray();
        Iterator it = c0036i.f238f.iterator();
        while (it.hasNext()) {
            jSONArray.put((String) it.next());
        }
        JSONArray jSONArray2 = new JSONArray();
        Iterator it2 = c0036i.f239g.iterator();
        while (it2.hasNext()) {
            jSONArray2.put((String) it2.next());
        }
        JSONObject jSONObjectPut = new JSONObject().put("mvvmFragmentClassName", c0036i.f233a).put("addressLiveListClassName", c0036i.f234b).put("liveListSubmitMethodName", c0036i.f235c).put("liveListGetterName", c0036i.f236d).put("adapterGetterName", c0036i.f237e).put("mvvmAdapterClassNames", jSONArray).put("mvvmItemClassNames", jSONArray2).put("refreshSubmitMethodName", c0036i.f240h);
        AbstractC0223g.m417d(jSONObjectPut, "put(...)");
        JSONObject jSONObjectM84v = m84v(jSONObjectPut, 3);
        SharedPreferences sharedPreferences = AbstractC0503h.m991x().getSharedPreferences("hook_point_cache", 0);
        AbstractC0223g.m417d(sharedPreferences, "getSharedPreferences(...)");
        sharedPreferences.edit().putString("contact_mvvm_address", jSONObjectM84v.toString()).apply();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: x */
    public static void m86x(Context context, C0037j c0037j) throws JSONException {
        AbstractC0223g.m418e(context, "context");
        JSONObject jSONObjectPut = new JSONObject().put("adapterClassNames", m88z(c0037j.f241a)).put("dataSourceClassNames", m88z(c0037j.f242b)).put("itemClassNames", m88z(c0037j.f243c)).put("holderClassNames", m88z(c0037j.f244d)).put("requestClassNames", m88z(c0037j.f246f)).put("storageClassNames", m88z(c0037j.f245e)).put("getDataSourceMethodName", c0037j.f247g).put("getConversationListMethodName", c0037j.f248h).put("requestRefreshMethodName", c0037j.f249i).put("submitListMethodName", c0037j.f250j);
        AbstractC0223g.m417d(jSONObjectPut, "put(...)");
        JSONObject jSONObjectM84v = m84v(jSONObjectPut, 5);
        SharedPreferences sharedPreferences = AbstractC0503h.m991x().getSharedPreferences("hook_point_cache", 0);
        AbstractC0223g.m417d(sharedPreferences, "getSharedPreferences(...)");
        sharedPreferences.edit().putString("conversation_mvvm_list_v2", jSONObjectM84v.toString()).apply();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: y */
    public static void m87y(Context context, C0025Z c0025z) throws JSONException {
        AbstractC0223g.m418e(context, "context");
        JSONObject jSONObjectPut = new JSONObject().put("adapterClassNames", m88z(c0025z.f197a)).put("itemClassNames", m88z(c0025z.f198b)).put("usernameFieldNames", m88z(c0025z.f199c)).put("refreshMethodNames", m88z(c0025z.f200d)).put("fileSortEntryNames", m88z(c0025z.f201e)).put("fileSortActivityClassNames", m88z(c0025z.f202f));
        AbstractC0223g.m417d(jSONObjectPut, "put(...)");
        JSONObject jSONObjectM84v = m84v(jSONObjectPut, 3);
        SharedPreferences sharedPreferences = AbstractC0503h.m991x().getSharedPreferences("hook_point_cache", 0);
        AbstractC0223g.m417d(sharedPreferences, "getSharedPreferences(...)");
        sharedPreferences.edit().putString("storage_chat_history_v4", jSONObjectM84v.toString()).apply();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: z */
    public static JSONArray m88z(List list) {
        JSONArray jSONArray = new JSONArray();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            jSONArray.put((String) it.next());
        }
        return jSONArray;
    }
}
