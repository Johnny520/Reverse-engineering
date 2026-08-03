package p080fb;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import bsh.org.objectweb.asm.Opcodes;
import gg.AbstractC1416l;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;
import okhttp3.Dns;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p000a.AbstractC0000a;
import p025bc.AbstractC0255e;
import p068eh.AbstractC0921a;
import p136j8.AbstractC2091b;
import p136j8.C2104o;
import p172lg.C2563c;
import p218og.AbstractC3149m;
import p218og.AbstractC3156t;
import p259r9.AbstractC3754e0;
import p276sf.C3958e;
import p276sf.C3959f;
import p276sf.C3960g;
import p288tb.C4143c;
import p300ub.AbstractC4302b;
import p304uf.C4327a;
import p304uf.C4329c;
import p332wb.AbstractC4855en;
import tf.AbstractC4166m;
import tf.AbstractC4167n;
import tf.C4173t;

/* JADX INFO: renamed from: fb.w */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1186w implements Dns {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3991a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [fb.h2.<clinit>():void] */
    public /* synthetic */ C1186w(int i9) {
        this.f3991a = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static String m3217a(String str, String str2, String str3, JSONObject jSONObject) throws JSONException {
        str.getClass();
        str3.getClass();
        JSONArray jSONArrayM3236t = m3236t(str);
        JSONObject jSONObject2 = new JSONObject(jSONObject.toString());
        if (!AbstractC3149m.m6721t0(str2)) {
            jSONObject2.put("hchat_message_id", str2);
        }
        if (!AbstractC3149m.m6721t0(str3)) {
            jSONObject2.put("hchat_runtime_state", str3);
        }
        jSONArrayM3236t.put(jSONObject2);
        String string = jSONArrayM3236t.toString();
        string.getClass();
        return string;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ String m3218b(String str, JSONObject jSONObject, String str2, int i9) {
        if ((i9 & 8) != 0) {
            str2 = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        return m3217a(str, HttpUrl.FRAGMENT_ENCODE_SET, str2, jSONObject);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static String m3219c(String str) {
        String string = AbstractC3149m.m6703R0(str).toString();
        Pattern patternCompile = Pattern.compile("\\s+");
        patternCompile.getClass();
        string.getClass();
        String strReplaceAll = patternCompile.matcher(string).replaceAll(" ");
        strReplaceAll.getClass();
        String strM6701P0 = AbstractC3149m.m6701P0(32, strReplaceAll);
        return AbstractC3149m.m6721t0(strM6701P0) ? "未命名配置" : strM6701P0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static boolean m3220d(String str, String str2) {
        str.getClass();
        str2.getClass();
        if (!AbstractC3149m.m6721t0(str2)) {
            JSONArray jSONArrayM3236t = m3236t(str);
            int length = jSONArrayM3236t.length();
            for (int i9 = 0; i9 < length; i9++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayM3236t.optJSONObject(i9);
                if (AbstractC1416l.m3825a(jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optString("hchat_message_id") : null, str2)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static C1176t0 m3221e(Context context, String str, C1183v c1183v) throws JSONException {
        str.getClass();
        List listM3225i = m3225i(AbstractC4302b.m8640c(context, "Hchat_script_plugin_config"));
        String strM3219c = m3219c(str);
        if (!listM3225i.isEmpty()) {
            Iterator it = listM3225i.iterator();
            while (it.hasNext()) {
                if (AbstractC3156t.m6734X(((C1176t0) it.next()).f3937b, strM3219c)) {
                    C2104o.m5294t("配置名称已存在");
                    return null;
                }
            }
        }
        String string = UUID.randomUUID().toString();
        string.getClass();
        C1176t0 c1176t0 = new C1176t0(AbstractC3156t.m6737a0(string, "-", HttpUrl.FRAGMENT_ENCODE_SET, false), strM3219c, m3233q(c1183v));
        m3240x(context, c1176t0);
        return c1176t0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0079  */
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C1183v m3222f(JSONObject jSONObject) {
        List listM3229m;
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("mcpServers");
        if (jSONArrayOptJSONArray != null) {
            C4329c c4329cM7E = AbstractC0000a.m7E();
            int length = jSONArrayOptJSONArray.length();
            for (int i9 = 0; i9 < length; i9++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i9);
                if (jSONObjectOptJSONObject != null) {
                    int i10 = i9 + 1;
                    String strOptString = jSONObjectOptJSONObject.optString("id", "mcp-" + i10);
                    strOptString.getClass();
                    String strOptString2 = jSONObjectOptJSONObject.optString("name", "MCP " + i10);
                    strOptString2.getClass();
                    boolean zOptBoolean = jSONObjectOptJSONObject.optBoolean("enabled", true);
                    String strOptString3 = jSONObjectOptJSONObject.optString("endpoint", HttpUrl.FRAGMENT_ENCODE_SET);
                    c4329cM7E.add(new C1168r0(strOptString, strOptString2, strOptString3, AbstractC2091b.m5162i(strOptString3, "authorization", HttpUrl.FRAGMENT_ENCODE_SET, jSONObjectOptJSONObject), zOptBoolean));
                }
            }
            listM3229m = AbstractC0000a.m90t(c4329cM7E);
            if (listM3229m == null) {
                boolean zOptBoolean2 = jSONObject.optBoolean("mcpEnabled", false);
                String strOptString4 = jSONObject.optString("mcpEndpoint", HttpUrl.FRAGMENT_ENCODE_SET);
                listM3229m = m3229m(strOptString4, AbstractC2091b.m5162i(strOptString4, "mcpAuthorization", HttpUrl.FRAGMENT_ENCODE_SET, jSONObject), zOptBoolean2);
            }
        }
        List list = listM3229m;
        String strOptString5 = jSONObject.optString("apiEndpoint", jSONObject.optString("apiBaseUrl", HttpUrl.FRAGMENT_ENCODE_SET));
        strOptString5.getClass();
        String strOptString6 = jSONObject.optString("apiPath", HttpUrl.FRAGMENT_ENCODE_SET);
        String strM5162i = AbstractC2091b.m5162i(strOptString6, "apiKey", HttpUrl.FRAGMENT_ENCODE_SET, jSONObject);
        String strOptString7 = jSONObject.optString("model", "deepseek-ai/DeepSeek-V3");
        strOptString7.getClass();
        boolean zOptBoolean3 = jSONObject.optBoolean("autoCompactEnabled", true);
        int iOptInt = jSONObject.optInt("compactTokenThreshold", C4143c.DEFAULT_HZ);
        boolean zOptBoolean4 = jSONObject.optBoolean("webSearchEnabled", true);
        String strOptString8 = jSONObject.optString("workspaceWriteApprovalMode", "ask");
        String strM5162i2 = AbstractC2091b.m5162i(strOptString8, "promptCacheMode", "force", jSONObject);
        String strOptString9 = jSONObject.optString("endpointMode", "openai_compatible");
        strOptString9.getClass();
        return m3233q(new C1183v(strOptString5, strOptString6, strM5162i, strOptString7, list, zOptBoolean3, iOptInt, zOptBoolean4, strOptString8, strM5162i2, strOptString9));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0052  */
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C1176t0 m3223g(Context context, String str) throws JSONException {
        Object next;
        C1176t0 c1176t0;
        str.getClass();
        SharedPreferences sharedPreferencesM8640c = AbstractC4302b.m8640c(context, "Hchat_script_plugin_config");
        List listM3225i = m3225i(sharedPreferencesM8640c);
        if (listM3225i.size() <= 1) {
            C2104o.m5294t("至少保留一个配置");
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM3225i) {
            if (!AbstractC1416l.m3825a(((C1176t0) obj).f3936a, str)) {
                arrayList.add(obj);
            }
        }
        if (arrayList.size() == listM3225i.size()) {
            C2104o.m5294t("配置不存在");
            return null;
        }
        String str2 = HttpUrl.FRAGMENT_ENCODE_SET;
        String string = sharedPreferencesM8640c.getString("script_plugin_agent_active_profile", HttpUrl.FRAGMENT_ENCODE_SET);
        if (string != null) {
            str2 = string;
        }
        if (str2.equals(str)) {
            c1176t0 = (C1176t0) AbstractC4166m.m8422t1(arrayList);
        } else {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (AbstractC1416l.m3825a(((C1176t0) next).f3936a, str2)) {
                    break;
                }
            }
            c1176t0 = (C1176t0) next;
            if (c1176t0 == null) {
            }
        }
        m3241y(sharedPreferencesM8640c, arrayList, c1176t0.f3936a);
        return c1176t0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static String m3224h(List list) {
        return "/".concat(AbstractC4166m.m8392A1(AbstractC4166m.m8397F1(list, AbstractC0000a.m101y0("v1", "chat", "completions")), "/", null, null, null, 62));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public static List m3225i(SharedPreferences sharedPreferences) throws JSONException {
        Object c3959f;
        String string = sharedPreferences.getString("script_plugin_agent_profiles_v1", HttpUrl.FRAGMENT_ENCODE_SET);
        if (string == null) {
            string = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        boolean zM6721t0 = AbstractC3149m.m6721t0(string);
        C4173t c4173t = C4173t.f13710g;
        List list = c4173t;
        if (!zM6721t0) {
            try {
                JSONArray jSONArray = new JSONArray(string);
                C4329c c4329cM7E = AbstractC0000a.m7E();
                int length = jSONArray.length();
                for (int i9 = 0; i9 < length; i9++) {
                    JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i9);
                    if (jSONObjectOptJSONObject != null) {
                        String strOptString = jSONObjectOptJSONObject.optString("id", HttpUrl.FRAGMENT_ENCODE_SET);
                        strOptString.getClass();
                        String string2 = AbstractC3149m.m6703R0(strOptString).toString();
                        String strOptString2 = jSONObjectOptJSONObject.optString("name", HttpUrl.FRAGMENT_ENCODE_SET);
                        strOptString2.getClass();
                        String string3 = AbstractC3149m.m6703R0(strOptString2).toString();
                        JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("config");
                        if (jSONObjectOptJSONObject2 != null && !AbstractC3149m.m6721t0(string2) && !AbstractC3149m.m6721t0(string3)) {
                            c4329cM7E.add(new C1176t0(string2, string3, m3222f(jSONObjectOptJSONObject2)));
                        }
                    }
                }
                c3959f = AbstractC0000a.m90t(c4329cM7E);
            } catch (Throwable th2) {
                c3959f = new C3959f(th2);
            }
            Object obj = c4173t;
            if (!(c3959f instanceof C3959f)) {
                obj = c3959f;
            }
            list = (List) obj;
        }
        if (!list.isEmpty()) {
            return list;
        }
        String string4 = sharedPreferences.getString("script_plugin_agent_api_base", HttpUrl.FRAGMENT_ENCODE_SET);
        String str = string4 == null ? HttpUrl.FRAGMENT_ENCODE_SET : string4;
        String string5 = sharedPreferences.getString("script_plugin_agent_api_path", "/chat/completions");
        String str2 = string5 == null ? HttpUrl.FRAGMENT_ENCODE_SET : string5;
        String string6 = sharedPreferences.getString("script_plugin_agent_api_key", HttpUrl.FRAGMENT_ENCODE_SET);
        String str3 = string6 == null ? HttpUrl.FRAGMENT_ENCODE_SET : string6;
        String string7 = sharedPreferences.getString("script_plugin_agent_model", "deepseek-ai/DeepSeek-V3");
        String str4 = string7 == null ? HttpUrl.FRAGMENT_ENCODE_SET : string7;
        boolean z9 = sharedPreferences.getBoolean("script_plugin_agent_mcp_enable", false);
        String string8 = sharedPreferences.getString("script_plugin_agent_mcp_endpoint", HttpUrl.FRAGMENT_ENCODE_SET);
        if (string8 == null) {
            string8 = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        String string9 = sharedPreferences.getString("script_plugin_agent_mcp_authorization", HttpUrl.FRAGMENT_ENCODE_SET);
        if (string9 == null) {
            string9 = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        List listM3229m = m3229m(string8, string9, z9);
        boolean z10 = sharedPreferences.getBoolean("script_plugin_agent_auto_compact", true);
        int iM7909r = AbstractC3754e0.m7909r(sharedPreferences.getInt("script_plugin_agent_compact_token_threshold", C4143c.DEFAULT_HZ), 2000, 1000000);
        boolean z11 = sharedPreferences.getBoolean("script_plugin_agent_web_search_enabled", true);
        String string10 = sharedPreferences.getString("script_plugin_agent_workspace_write_approval", "ask");
        C1176t0 c1176t0 = new C1176t0("default", "默认配置", m3233q(new C1183v(str, str2, str3, str4, listM3229m, z10, iM7909r, z11, string10 == null ? HttpUrl.FRAGMENT_ENCODE_SET : string10, "force", "openai_compatible")));
        m3241y(sharedPreferences, AbstractC0000a.m99x0(c1176t0), "default");
        return AbstractC0000a.m99x0(c1176t0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public static int m3226j(String str, List list, C1192y c1192y, String str2, String str3) {
        int iNextIndex;
        str.getClass();
        str2.getClass();
        str3.getClass();
        boolean z9 = !AbstractC3149m.m6721t0(str3) && m3227k(str3);
        int length = z9 ? str3.length() : str.length() + str2.length();
        if (z9) {
            ListIterator listIterator = list.listIterator(list.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    iNextIndex = -1;
                    break;
                }
                C1107c c1107c = (C1107c) listIterator.previous();
                if (AbstractC1416l.m3825a(c1107c.f3584a, "user") && !m3220d(str3, c1107c.f3586c)) {
                    iNextIndex = listIterator.nextIndex();
                    break;
                }
            }
            list = iNextIndex >= 0 ? AbstractC4166m.m8419q1(iNextIndex, list) : C4173t.f13710g;
        }
        for (C1107c c1107c2 : list) {
            int length2 = c1107c2.f3592i.length() + c1107c2.f3591h.length() + c1107c2.f3585b.length() + length;
            C1101a1 c1101a1 = c1107c2.f3595l;
            int length3 = length2 + (c1101a1 != null ? c1101a1.f3548b.length() : 0);
            if (!z9 && AbstractC3149m.m6721t0(str2)) {
                for (C1165q1 c1165q1 : c1107c2.f3593j) {
                    length3 += c1165q1.f3879f.length() + c1165q1.f3878e.length() + c1165q1.f3877d.length() + c1165q1.f3876c.length();
                }
            }
            for (C1099a c1099a : c1107c2.f3594k) {
                length3 += c1099a.f3539a.length() + (AbstractC3156t.m6740d0(c1099a.f3541c, "image/", false) ? 4000 : (int) AbstractC3754e0.m7911s(c1099a.f3542d, 1000L, 524288L));
            }
            length = length3;
        }
        if (c1192y != null) {
            length += c1192y.f4009e.length() + c1192y.f4005a.length() + c1192y.f4006b.length() + Opcodes.ACC_NATIVE;
        }
        int i9 = length / 4;
        if (i9 < 1) {
            return 1;
        }
        return i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public static boolean m3227k(String str) {
        Object c3959f;
        C2563c c2563c;
        boolean z9;
        str.getClass();
        if (AbstractC3149m.m6721t0(str)) {
            return true;
        }
        try {
            c3959f = new JSONArray(str);
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        if (c3959f instanceof C3959f) {
            c3959f = null;
        }
        JSONArray jSONArray = (JSONArray) c3959f;
        if (jSONArray == null) {
            return false;
        }
        Iterable iterableM7910r0 = AbstractC3754e0.m7910r0(0, jSONArray.length());
        if ((iterableM7910r0 instanceof Collection) && ((Collection) iterableM7910r0).isEmpty()) {
            z9 = true;
            break;
        }
        Iterator it = iterableM7910r0.iterator();
        do {
            c2563c = (C2563c) it;
            if (!c2563c.f8317i) {
                z9 = true;
                break;
            }
        } while (jSONArray.optJSONObject(((Number) c2563c.next()).intValue()) != null);
        z9 = false;
        return z9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public static boolean m3228l(C1183v c1183v) {
        Object c3959f;
        String host;
        try {
            c3959f = Uri.parse(m3238v(c1183v.f3976a, c1183v.f3986k, c1183v.f3979d, true));
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        if (c3959f instanceof C3959f) {
            c3959f = null;
        }
        Uri uri = (Uri) c3959f;
        if (uri != null) {
            return ((!AbstractC3156t.m6734X(uri.getScheme(), "http") && !AbstractC3156t.m6734X(uri.getScheme(), "https")) || (host = uri.getHost()) == null || AbstractC3149m.m6721t0(host)) ? false : true;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public static List m3229m(String str, String str2, boolean z9) {
        return (AbstractC3149m.m6721t0(str) && AbstractC3149m.m6721t0(str2) && !z9) ? C4173t.f13710g : AbstractC0000a.m99x0(new C1168r0("legacy", "MCP 1", str, str2, z9));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public static C1176t0 m3230n(Context context) throws JSONException {
        Object next;
        context.getClass();
        SharedPreferences sharedPreferencesM8640c = AbstractC4302b.m8640c(context, "Hchat_script_plugin_config");
        List listM3225i = m3225i(sharedPreferencesM8640c);
        String str = HttpUrl.FRAGMENT_ENCODE_SET;
        String string = sharedPreferencesM8640c.getString("script_plugin_agent_active_profile", HttpUrl.FRAGMENT_ENCODE_SET);
        if (string != null) {
            str = string;
        }
        Iterator it = listM3225i.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (AbstractC1416l.m3825a(((C1176t0) next).f3936a, str)) {
                break;
            }
        }
        C1176t0 c1176t0 = (C1176t0) next;
        return c1176t0 != null ? c1176t0 : (C1176t0) AbstractC4166m.m8422t1(listM3225i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005b  */
    /* JADX INFO: renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ArrayList m3231o(String str, List list) {
        boolean z9;
        str.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C1107c c1107cM2840a = (C1107c) it.next();
            String str2 = c1107cM2840a.f3584a;
            List list2 = c1107cM2840a.f3593j;
            if (AbstractC1416l.m3825a(str2, "tool") && !AbstractC1416l.m3825a(c1107cM2840a.f3587d, str)) {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : list2) {
                    C1165q1 c1165q1 = (C1165q1) obj;
                    if (!AbstractC1416l.m3825a(c1165q1.f3875b, "workspace")) {
                        z9 = AbstractC3156t.m6740d0(c1165q1.f3886m, "hchat_workspace_", false);
                    }
                    if (!z9) {
                        arrayList2.add(obj);
                    }
                }
                if (arrayList2.isEmpty()) {
                    c1107cM2840a = null;
                } else if (arrayList2.size() != list2.size()) {
                    c1107cM2840a = C1107c.m2840a(c1107cM2840a, null, null, null, null, null, null, null, null, arrayList2, null, null, false, null, 0L, 261631);
                }
            }
            if (c1107cM2840a != null) {
                arrayList.add(c1107cM2840a);
            }
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:269:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String m3232p(String str, String str2, String str3) {
        String string;
        Object c3959f;
        String scheme;
        String host;
        Object c3959f2;
        String strM6706U0;
        String str4;
        String scheme2;
        String host2;
        int iNextIndex;
        Object c3959f3;
        String scheme3;
        String host3;
        Object c3959f4;
        String scheme4;
        String host4;
        str.getClass();
        str2.getClass();
        str3.getClass();
        String strM3234r = m3234r(str2);
        int iHashCode = strM3234r.hashCode();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        String str5 = HttpUrl.FRAGMENT_ENCODE_SET;
        switch (iHashCode) {
            case -2131439764:
                if (strM3234r.equals("anthropic")) {
                    String string2 = AbstractC3149m.m6703R0(str).toString();
                    if (AbstractC3149m.m6721t0(string2)) {
                        return HttpUrl.FRAGMENT_ENCODE_SET;
                    }
                    if (!AbstractC3149m.m6709h0(string2, "://", false)) {
                        string2 = "https://" + ((Object) string2);
                    }
                    String str6 = string2;
                    try {
                        c3959f2 = Uri.parse(str6);
                    } catch (Throwable th2) {
                        c3959f2 = new C3959f(th2);
                    }
                    boolean z9 = c3959f2 instanceof C3959f;
                    Object obj4 = c3959f2;
                    if (z9) {
                        obj4 = null;
                    }
                    Uri uri = (Uri) obj4;
                    if (uri == null || (scheme2 = uri.getScheme()) == null || AbstractC3149m.m6721t0(scheme2) || (host2 = uri.getHost()) == null || AbstractC3149m.m6721t0(host2)) {
                        strM6706U0 = AbstractC3149m.m6706U0(str6, '/');
                        str4 = "/v1/messages";
                        return AbstractC0255e.m1020i(strM6706U0, str4);
                    }
                    String encodedPath = uri.getEncodedPath();
                    if (encodedPath != null) {
                        str5 = encodedPath;
                    }
                    List listM6691F0 = AbstractC3149m.m6691F0(str5, new char[]{'/'}, 6);
                    ArrayList arrayList = new ArrayList();
                    for (Object obj5 : listM6691F0) {
                        if (!AbstractC3149m.m6721t0((String) obj5)) {
                            arrayList.add(obj5);
                        }
                    }
                    ListIterator listIterator = arrayList.listIterator(arrayList.size());
                    while (true) {
                        if (!listIterator.hasPrevious()) {
                            iNextIndex = -1;
                        } else if (AbstractC3156t.m6734X((String) listIterator.previous(), "v1")) {
                            iNextIndex = listIterator.nextIndex();
                        }
                    }
                    Iterator it = AbstractC0000a.m45X(arrayList).iterator();
                    while (true) {
                        C2563c c2563c = (C2563c) it;
                        if (!c2563c.f8317i) {
                            Integer num = (Integer) obj3;
                            List listM8403L1 = arrayList;
                            if (iNextIndex >= 0) {
                                listM8403L1 = AbstractC4166m.m8403L1(iNextIndex, arrayList);
                            } else if (num != null) {
                                listM8403L1 = AbstractC4166m.m8403L1(num.intValue(), arrayList);
                            }
                            String string3 = uri.buildUpon().encodedPath("/".concat(AbstractC4166m.m8392A1(AbstractC4166m.m8397F1(listM8403L1, AbstractC0000a.m101y0("v1", "messages")), "/", null, null, null, 62))).build().toString();
                            string3.getClass();
                            return AbstractC3149m.m6706U0(string3, '/');
                        }
                        Object next = c2563c.next();
                        if (AbstractC3156t.m6740d0("messages", (String) arrayList.get(((Number) next).intValue()), true)) {
                            obj3 = next;
                        }
                    }
                    break;
                }
                string = AbstractC3149m.m6703R0(str).toString();
                if (AbstractC3149m.m6721t0(string)) {
                    return HttpUrl.FRAGMENT_ENCODE_SET;
                }
                if (!AbstractC3149m.m6709h0(string, "://", false)) {
                    string = "https://" + ((Object) string);
                }
                if (!AbstractC3149m.m6721t0(str3) && !AbstractC3156t.m6733W(AbstractC3149m.m6706U0(string, '/'), "/chat/completions", false)) {
                    string = AbstractC4855en.m9264h(AbstractC3149m.m6706U0(string, '/'), "/", AbstractC3149m.m6708W0(AbstractC3149m.m6703R0(str3).toString(), '/'));
                }
                String str7 = string;
                try {
                    c3959f = Uri.parse(str7);
                    break;
                } catch (Throwable th3) {
                    c3959f = new C3959f(th3);
                }
                boolean z10 = c3959f instanceof C3959f;
                Object obj6 = c3959f;
                if (z10) {
                    obj6 = null;
                }
                Uri uri2 = (Uri) obj6;
                if (uri2 == null || (scheme = uri2.getScheme()) == null || AbstractC3149m.m6721t0(scheme) || (host = uri2.getHost()) == null || AbstractC3149m.m6721t0(host)) {
                    String strM6706U02 = AbstractC3149m.m6706U0(AbstractC3149m.m6703R0(str7).toString(), '/');
                    int iM6719r0 = AbstractC3149m.m6719r0(strM6706U02, "://", 0, false, 6);
                    Integer numValueOf = iM6719r0 >= 0 ? Integer.valueOf(iM6719r0) : null;
                    int iM6718q0 = AbstractC3149m.m6718q0(strM6706U02, '/', numValueOf != null ? numValueOf.intValue() + 3 : 0, 4);
                    return iM6718q0 < 0 ? strM6706U02.concat("/v1/chat/completions") : AbstractC0255e.m1020i(AbstractC3149m.m6706U0(strM6706U02.substring(0, iM6718q0), '/'), m3235s(strM6706U02.substring(iM6718q0)));
                }
                String encodedPath2 = uri2.getEncodedPath();
                if (encodedPath2 != null) {
                    str5 = encodedPath2;
                }
                String string4 = uri2.buildUpon().encodedPath(m3235s(str5)).build().toString();
                string4.getClass();
                return AbstractC3149m.m6706U0(string4, '/');
            case -1581359199:
                if (strM3234r.equals("custom_url")) {
                    return AbstractC3149m.m6703R0(str).toString();
                }
                string = AbstractC3149m.m6703R0(str).toString();
                if (AbstractC3149m.m6721t0(string)) {
                }
                break;
            case -1249537483:
                if (strM3234r.equals("gemini")) {
                    String string5 = AbstractC3149m.m6703R0(str).toString();
                    if (AbstractC3149m.m6721t0(string5)) {
                        return HttpUrl.FRAGMENT_ENCODE_SET;
                    }
                    if (!AbstractC3149m.m6709h0(string5, "://", false)) {
                        string5 = "https://" + ((Object) string5);
                    }
                    String str8 = string5;
                    try {
                        c3959f3 = Uri.parse(str8);
                    } catch (Throwable th4) {
                        c3959f3 = new C3959f(th4);
                    }
                    boolean z11 = c3959f3 instanceof C3959f;
                    Object obj7 = c3959f3;
                    if (z11) {
                        obj7 = null;
                    }
                    Uri uri3 = (Uri) obj7;
                    if (uri3 == null || (scheme3 = uri3.getScheme()) == null || AbstractC3149m.m6721t0(scheme3) || (host3 = uri3.getHost()) == null || AbstractC3149m.m6721t0(host3)) {
                        strM6706U0 = AbstractC3149m.m6706U0(str8, '/');
                        str4 = "/v1beta";
                        return AbstractC0255e.m1020i(strM6706U0, str4);
                    }
                    String encodedPath3 = uri3.getEncodedPath();
                    if (encodedPath3 != null) {
                        str5 = encodedPath3;
                    }
                    List listM6691F02 = AbstractC3149m.m6691F0(str5, new char[]{'/'}, 6);
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj8 : listM6691F02) {
                        if (!AbstractC3149m.m6721t0((String) obj8)) {
                            arrayList2.add(obj8);
                        }
                    }
                    Iterator it2 = AbstractC0000a.m45X(arrayList2).iterator();
                    while (true) {
                        C2563c c2563c2 = (C2563c) it2;
                        if (!c2563c2.f8317i) {
                            Integer num2 = (Integer) obj2;
                            List listM8403L12 = arrayList2;
                            if (num2 != null) {
                                listM8403L12 = AbstractC4166m.m8403L1(num2.intValue(), arrayList2);
                            }
                            String string6 = uri3.buildUpon().encodedPath("/".concat(AbstractC4166m.m8392A1(AbstractC4166m.m8398G1(listM8403L12, "v1beta"), "/", null, null, null, 62))).build().toString();
                            string6.getClass();
                            return AbstractC3149m.m6706U0(string6, '/');
                        }
                        Object next2 = c2563c2.next();
                        int iIntValue = ((Number) next2).intValue();
                        if (AbstractC3156t.m6740d0("v1beta", (String) arrayList2.get(iIntValue), true) || AbstractC3156t.m6734X((String) arrayList2.get(iIntValue), "v1")) {
                            obj2 = next2;
                        }
                    }
                }
                string = AbstractC3149m.m6703R0(str).toString();
                if (AbstractC3149m.m6721t0(string)) {
                }
                break;
            case 629437796:
                if (strM3234r.equals("deepseek")) {
                    String string7 = AbstractC3149m.m6703R0(str).toString();
                    if (AbstractC3149m.m6721t0(string7)) {
                        return HttpUrl.FRAGMENT_ENCODE_SET;
                    }
                    if (!AbstractC3149m.m6709h0(string7, "://", false)) {
                        string7 = "https://" + ((Object) string7);
                    }
                    String str9 = string7;
                    try {
                        c3959f4 = Uri.parse(str9);
                    } catch (Throwable th5) {
                        c3959f4 = new C3959f(th5);
                    }
                    boolean z12 = c3959f4 instanceof C3959f;
                    Object obj9 = c3959f4;
                    if (z12) {
                        obj9 = null;
                    }
                    Uri uri4 = (Uri) obj9;
                    if (uri4 == null || (scheme4 = uri4.getScheme()) == null || AbstractC3149m.m6721t0(scheme4) || (host4 = uri4.getHost()) == null || AbstractC3149m.m6721t0(host4)) {
                        return AbstractC0255e.m1020i(AbstractC3149m.m6706U0(str9, '/'), "/chat/completions");
                    }
                    String encodedPath4 = uri4.getEncodedPath();
                    if (encodedPath4 != null) {
                        str5 = encodedPath4;
                    }
                    List listM6691F03 = AbstractC3149m.m6691F0(str5, new char[]{'/'}, 6);
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj10 : listM6691F03) {
                        if (!AbstractC3149m.m6721t0((String) obj10)) {
                            arrayList3.add(obj10);
                        }
                    }
                    Iterator it3 = AbstractC0000a.m45X(arrayList3).iterator();
                    while (true) {
                        C2563c c2563c3 = (C2563c) it3;
                        if (!c2563c3.f8317i) {
                            Integer num3 = (Integer) obj;
                            List listM8403L13 = arrayList3;
                            if (num3 != null) {
                                listM8403L13 = AbstractC4166m.m8403L1(num3.intValue(), arrayList3);
                            }
                            String string8 = uri4.buildUpon().encodedPath("/".concat(AbstractC4166m.m8392A1(AbstractC4166m.m8397F1(listM8403L13, AbstractC0000a.m101y0("chat", "completions")), "/", null, null, null, 62))).build().toString();
                            string8.getClass();
                            return AbstractC3149m.m6706U0(string8, '/');
                        }
                        Object next3 = c2563c3.next();
                        if (AbstractC3156t.m6740d0("chat", (String) arrayList3.get(((Number) next3).intValue()), true)) {
                            obj = next3;
                        }
                    }
                }
                string = AbstractC3149m.m6703R0(str).toString();
                if (AbstractC3149m.m6721t0(string)) {
                }
                break;
            default:
                string = AbstractC3149m.m6703R0(str).toString();
                if (AbstractC3149m.m6721t0(string)) {
                }
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public static C1183v m3233q(C1183v c1183v) {
        String strM3234r = m3234r(c1183v.f3986k);
        String strM3232p = m3232p(c1183v.f3976a, strM3234r, c1183v.f3977b);
        String string = AbstractC3149m.m6703R0(c1183v.f3978c).toString();
        String string2 = AbstractC3149m.m6703R0(c1183v.f3979d).toString();
        List list = c1183v.f3980e;
        ArrayList arrayList = new ArrayList(AbstractC4167n.m8429e1(list));
        Iterator it = list.iterator();
        int i9 = 0;
        while (true) {
            if (!it.hasNext()) {
                HashSet hashSet = new HashSet();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : arrayList) {
                    if (hashSet.add(((C1168r0) obj).f3897a)) {
                        arrayList2.add(obj);
                    }
                }
                int iM7909r = AbstractC3754e0.m7909r(c1183v.f3982g, 2000, 1000000);
                String str = c1183v.f3984i;
                if (!AbstractC1416l.m3825a(str, "ask") && !AbstractC1416l.m3825a(str, "always_allow")) {
                    str = null;
                }
                String str2 = str != null ? str : "ask";
                String str3 = c1183v.f3985j;
                String str4 = (AbstractC1416l.m3825a(str3, "auto") || AbstractC1416l.m3825a(str3, "force") || AbstractC1416l.m3825a(str3, "off")) ? str3 : null;
                if (str4 == null) {
                    str4 = "force";
                }
                return C1183v.m3168a(c1183v, strM3232p, string, string2, arrayList2, iM7909r, false, str2, str4, strM3234r, Opcodes.IF_ICMPNE);
            }
            Object next = it.next();
            int i10 = i9 + 1;
            if (i9 < 0) {
                AbstractC0000a.m32Q0();
                throw null;
            }
            C1168r0 c1168r0 = (C1168r0) next;
            String string3 = AbstractC3149m.m6703R0(c1168r0.f3897a).toString();
            if (AbstractC3149m.m6721t0(string3)) {
                string3 = AbstractC0921a.m2249l(i10, "mcp-");
            }
            String str5 = string3;
            String string4 = AbstractC3149m.m6703R0(c1168r0.f3898b).toString();
            Pattern patternCompile = Pattern.compile("\\s+");
            patternCompile.getClass();
            string4.getClass();
            String strReplaceAll = patternCompile.matcher(string4).replaceAll(" ");
            strReplaceAll.getClass();
            String strM6701P0 = AbstractC3149m.m6701P0(32, strReplaceAll);
            if (AbstractC3149m.m6721t0(strM6701P0)) {
                strM6701P0 = AbstractC0921a.m2249l(i10, "MCP ");
            }
            arrayList.add(C1168r0.m2981a(c1168r0, str5, strM6701P0, false, AbstractC3149m.m6703R0(c1168r0.f3900d).toString(), AbstractC3149m.m6703R0(c1168r0.f3901e).toString(), 4));
            i9 = i10;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r */
    public static String m3234r(String str) {
        if (!(AbstractC1416l.m3825a(str, "openai_compatible") || AbstractC1416l.m3825a(str, "openai") || AbstractC1416l.m3825a(str, "deepseek") || AbstractC1416l.m3825a(str, "openrouter") || AbstractC1416l.m3825a(str, "siliconflow") || AbstractC1416l.m3825a(str, "gemini") || AbstractC1416l.m3825a(str, "anthropic") || AbstractC1416l.m3825a(str, "custom_url"))) {
            str = null;
        }
        return str != null ? str : "openai_compatible";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s */
    public static String m3235s(String str) {
        int iNextIndex;
        boolean zM6740d0;
        List listM6691F0 = AbstractC3149m.m6691F0(str, new char[]{'/'}, 6);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM6691F0) {
            if (!AbstractC3149m.m6721t0((String) obj)) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return "/v1/chat/completions";
        }
        ListIterator listIterator = arrayList.listIterator(arrayList.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                iNextIndex = -1;
                break;
            }
            if (AbstractC3156t.m6734X((String) listIterator.previous(), "v1")) {
                iNextIndex = listIterator.nextIndex();
                break;
            }
        }
        if (iNextIndex >= 0) {
            return m3224h(AbstractC4166m.m8403L1(iNextIndex, arrayList));
        }
        Iterator it = AbstractC0000a.m45X(arrayList).iterator();
        Object obj2 = null;
        while (true) {
            C2563c c2563c = (C2563c) it;
            if (!c2563c.f8317i) {
                break;
            }
            Object next = c2563c.next();
            int iIntValue = ((Number) next).intValue();
            if (AbstractC3156t.m6734X((String) arrayList.get(iIntValue), "chat")) {
                String str2 = (String) AbstractC4166m.m8425w1(iIntValue + 1, arrayList);
                zM6740d0 = str2 != null ? AbstractC3156t.m6740d0("completions", str2, true) : true;
            } else {
                zM6740d0 = false;
            }
            if (zM6740d0) {
                obj2 = next;
            }
        }
        Integer num = (Integer) obj2;
        return num != null ? m3224h(AbstractC4166m.m8403L1(num.intValue(), arrayList)) : m3224h(arrayList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: t */
    public static JSONArray m3236t(String str) {
        Object c3959f;
        if (AbstractC3149m.m6721t0(str)) {
            return new JSONArray();
        }
        try {
            c3959f = new JSONArray(str);
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        if (C3960g.m8182b(c3959f) != null) {
            c3959f = new JSONArray();
        }
        return (JSONArray) c3959f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: u */
    public static C1176t0 m3237u(Context context, String str, String str2) throws JSONException {
        Object next;
        str.getClass();
        str2.getClass();
        List<C1176t0> listM3225i = m3225i(AbstractC4302b.m8640c(context, "Hchat_script_plugin_config"));
        Iterator it = listM3225i.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (AbstractC1416l.m3825a(((C1176t0) next).f3936a, str)) {
                break;
            }
        }
        C1176t0 c1176t0 = (C1176t0) next;
        if (c1176t0 == null) {
            C2104o.m5294t("配置不存在");
            return null;
        }
        String strM3219c = m3219c(str2);
        if (!listM3225i.isEmpty()) {
            for (C1176t0 c1176t02 : listM3225i) {
                if (!AbstractC1416l.m3825a(c1176t02.f3936a, str) && AbstractC3156t.m6734X(c1176t02.f3937b, strM3219c)) {
                    C2104o.m5294t("配置名称已存在");
                    return null;
                }
            }
        }
        C1176t0 c1176t0M3021a = C1176t0.m3021a(c1176t0, strM3219c, null, 5);
        m3240x(context, c1176t0M3021a);
        return c1176t0M3021a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: v */
    public static String m3238v(String str, String str2, String str3, boolean z9) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        String strM3234r = m3234r(str2);
        String str4 = HttpUrl.FRAGMENT_ENCODE_SET;
        String strM3232p = m3232p(str, strM3234r, HttpUrl.FRAGMENT_ENCODE_SET);
        if (!strM3234r.equals("gemini")) {
            return strM3232p;
        }
        String string = AbstractC3149m.m6703R0(strM3232p).toString();
        String strM6686A0 = AbstractC3149m.m6686A0(AbstractC3149m.m6703R0(str3).toString(), "models/");
        if (AbstractC3149m.m6721t0(string) || AbstractC3149m.m6721t0(strM6686A0)) {
            return string;
        }
        String str5 = z9 ? "streamGenerateContent" : "generateContent";
        Uri uri = Uri.parse(string);
        String encodedPath = uri.getEncodedPath();
        if (encodedPath != null) {
            str4 = encodedPath;
        }
        Uri.Builder builderEncodedPath = uri.buildUpon().encodedPath(AbstractC0255e.m1033v(AbstractC3149m.m6706U0(str4, '/'), "/models/", Uri.encode(strM6686A0), ":", str5));
        if (z9) {
            builderEncodedPath.appendQueryParameter("alt", "sse");
        }
        String string2 = builderEncodedPath.build().toString();
        string2.getClass();
        return string2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: w */
    public static void m3239w(Context context, C1183v c1183v) throws JSONException {
        context.getClass();
        m3240x(context, C1176t0.m3021a(m3230n(context), null, m3233q(c1183v), 3));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: x */
    public static void m3240x(Context context, C1176t0 c1176t0) throws JSONException {
        context.getClass();
        SharedPreferences sharedPreferencesM8640c = AbstractC4302b.m8640c(context, "Hchat_script_plugin_config");
        ArrayList arrayList = new ArrayList(m3225i(sharedPreferencesM8640c));
        C1176t0 c1176t0M3021a = C1176t0.m3021a(c1176t0, m3219c(c1176t0.f3937b), m3233q(c1176t0.f3938c), 1);
        String str = c1176t0M3021a.f3936a;
        Iterator it = arrayList.iterator();
        int i9 = 0;
        while (true) {
            if (!it.hasNext()) {
                i9 = -1;
                break;
            } else if (AbstractC1416l.m3825a(((C1176t0) it.next()).f3936a, str)) {
                break;
            } else {
                i9++;
            }
        }
        if (i9 >= 0) {
            arrayList.set(i9, c1176t0M3021a);
        } else {
            arrayList.add(c1176t0M3021a);
        }
        m3241y(sharedPreferencesM8640c, arrayList, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: y */
    public static void m3241y(SharedPreferences sharedPreferences, List list, String str) throws JSONException {
        Object next;
        Object next2;
        Object next3;
        Iterator it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                next = it.next();
                if (AbstractC1416l.m3825a(((C1176t0) next).f3936a, str)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        C1176t0 c1176t0 = (C1176t0) next;
        if (c1176t0 == null) {
            c1176t0 = (C1176t0) AbstractC4166m.m8422t1(list);
        }
        C1183v c1183v = c1176t0.f3938c;
        List list2 = c1183v.f3980e;
        String str2 = c1183v.f3976a;
        String str3 = c1183v.f3986k;
        String str4 = HttpUrl.FRAGMENT_ENCODE_SET;
        String strM3232p = m3232p(str2, str3, HttpUrl.FRAGMENT_ENCODE_SET);
        C3958e c3958e = (str3.equals("openai_compatible") && AbstractC3156t.m6733W(strM3232p, "/chat/completions", true)) ? new C3958e(AbstractC3149m.m6706U0(AbstractC3149m.m6712k0(17, strM3232p), '/'), "/chat/completions") : new C3958e(strM3232p, HttpUrl.FRAGMENT_ENCODE_SET);
        Iterator it2 = list2.iterator();
        while (true) {
            if (it2.hasNext()) {
                next2 = it2.next();
                if (((C1168r0) next2).f3899c) {
                    break;
                }
            } else {
                next2 = null;
                break;
            }
        }
        C1168r0 c1168r0 = (C1168r0) next2;
        if (c1168r0 == null) {
            c1168r0 = (C1168r0) AbstractC4166m.m8424v1(list2);
        }
        JSONArray jSONArray = new JSONArray();
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            C1176t0 c1176t02 = (C1176t0) it3.next();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", c1176t02.f3936a);
            jSONObject.put("name", c1176t02.f3937b);
            C1183v c1183vM3233q = m3233q(c1176t02.f3938c);
            List<C1168r0> list3 = c1183vM3233q.f3980e;
            Iterator it4 = list3.iterator();
            while (true) {
                if (it4.hasNext()) {
                    next3 = it4.next();
                    if (((C1168r0) next3).f3899c) {
                        break;
                    }
                } else {
                    next3 = null;
                    break;
                }
            }
            C1168r0 c1168r02 = (C1168r0) next3;
            if (c1168r02 == null) {
                c1168r02 = (C1168r0) AbstractC4166m.m8424v1(list3);
            }
            C1168r0 c1168r03 = c1168r02;
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("apiEndpoint", c1183vM3233q.f3976a);
            jSONObject2.put("endpointMode", c1183vM3233q.f3986k);
            jSONObject2.put("apiKey", c1183vM3233q.f3978c);
            jSONObject2.put("model", c1183vM3233q.f3979d);
            jSONObject2.put("mcpEnabled", c1168r03 != null && c1168r03.f3899c);
            Object obj = c1168r03 != null ? c1168r03.f3900d : null;
            if (obj == null) {
                obj = str4;
            }
            jSONObject2.put("mcpEndpoint", obj);
            Object obj2 = c1168r03 != null ? c1168r03.f3901e : null;
            if (obj2 == null) {
                obj2 = str4;
            }
            jSONObject2.put("mcpAuthorization", obj2);
            JSONArray jSONArray2 = new JSONArray();
            for (C1168r0 c1168r04 : list3) {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("id", c1168r04.f3897a);
                jSONObject3.put("name", c1168r04.f3898b);
                jSONObject3.put("enabled", c1168r04.f3899c);
                jSONObject3.put("endpoint", c1168r04.f3900d);
                jSONObject3.put("authorization", c1168r04.f3901e);
                jSONArray2.put(jSONObject3);
                it3 = it3;
                str4 = str4;
            }
            jSONObject2.put("mcpServers", jSONArray2);
            jSONObject2.put("autoCompactEnabled", c1183vM3233q.f3981f);
            jSONObject2.put("compactTokenThreshold", c1183vM3233q.f3982g);
            jSONObject2.put("webSearchEnabled", c1183vM3233q.f3983h);
            jSONObject2.put("workspaceWriteApprovalMode", c1183vM3233q.f3984i);
            jSONObject2.put("promptCacheMode", c1183vM3233q.f3985j);
            jSONObject.put("config", jSONObject2);
            jSONArray.put(jSONObject);
            it3 = it3;
        }
        String str5 = str4;
        SharedPreferences.Editor editorPutBoolean = sharedPreferences.edit().putString("script_plugin_agent_profiles_v1", jSONArray.toString()).putString("script_plugin_agent_active_profile", c1176t0.f3936a).putString("script_plugin_agent_api_base", (String) c3958e.f12961g).putString("script_plugin_agent_api_path", (String) c3958e.f12962h).putString("script_plugin_agent_api_key", c1183v.f3978c).putString("script_plugin_agent_model", c1183v.f3979d).putBoolean("script_plugin_agent_mcp_enable", c1168r0 != null && c1168r0.f3899c);
        String str6 = c1168r0 != null ? c1168r0.f3900d : null;
        if (str6 == null) {
            str6 = str5;
        }
        SharedPreferences.Editor editorPutString = editorPutBoolean.putString("script_plugin_agent_mcp_endpoint", str6);
        String str7 = c1168r0 != null ? c1168r0.f3901e : null;
        editorPutString.putString("script_plugin_agent_mcp_authorization", str7 == null ? str5 : str7).putBoolean("script_plugin_agent_auto_compact", c1183v.f3981f).putInt("script_plugin_agent_compact_token_threshold", c1183v.f3982g).putBoolean("script_plugin_agent_web_search_enabled", c1183v.f3983h).putString("script_plugin_agent_workspace_write_approval", c1183v.f3984i).apply();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:163:0x020a */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:169:0x00c7 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:145:0x010a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:174:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x015e  */
    /* JADX WARN: Type inference failed for: r0v27, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4 */
    @Override // okhttp3.Dns
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public List lookup(String str) throws UnknownHostException {
        UnknownHostException unknownHostException;
        List<InetAddress> listLookup;
        ?? arrayList;
        List<InetAddress> list;
        Object obj;
        ?? c3959f;
        List list2;
        Response responseExecute;
        ResponseBody responseBodyBody;
        String strString;
        JSONArray jSONArrayOptJSONArray;
        ?? arrayList2;
        int i9;
        JSONArray jSONArray;
        InetAddress inetAddressM2885k;
        int i10 = 0;
        switch (this.f3991a) {
            case 3:
                str.getClass();
                return AbstractC3156t.m6734X(AbstractC3149m.m6706U0(str, '.'), "cloudflare-dns.com") ? AbstractC0000a.m101y0(InetAddress.getByAddress(new byte[]{1, 1, 1, 1}), InetAddress.getByAddress(new byte[]{1, 0, 0, 1})) : Dns.SYSTEM.lookup(str);
            default:
                C4173t c4173t = C4173t.f13710g;
                str.getClass();
                try {
                    listLookup = Dns.SYSTEM.lookup(str);
                    unknownHostException = null;
                } catch (UnknownHostException e6) {
                    unknownHostException = e6;
                    listLookup = c4173t;
                }
                ConcurrentHashMap concurrentHashMap = C1130h2.f3696a;
                ArrayList arrayList3 = new ArrayList();
                for (Object obj2 : listLookup) {
                    if (!C1130h2.m2883i((InetAddress) obj2)) {
                        arrayList3.add(obj2);
                    }
                }
                if (!arrayList3.isEmpty()) {
                    return arrayList3;
                }
                ConcurrentHashMap concurrentHashMap2 = C1130h2.f3696a;
                String strM6687B0 = AbstractC3149m.m6687B0(AbstractC3149m.m6686A0(AbstractC3149m.m6703R0(str).toString(), "["), "]");
                boolean z9 = AbstractC3149m.m6710i0(strM6687B0, ':') || C1130h2.f3701f.m6683d(strM6687B0);
                if (z9) {
                    arrayList = c4173t;
                } else {
                    arrayList = new ArrayList();
                    for (Object obj3 : listLookup) {
                        String hostAddress = ((InetAddress) obj3).getHostAddress();
                        if (hostAddress == null) {
                            hostAddress = HttpUrl.FRAGMENT_ENCODE_SET;
                        }
                        String strM6698M0 = AbstractC3149m.m6698M0(hostAddress, '%');
                        Locale locale = Locale.US;
                        locale.getClass();
                        String lowerCase = strM6698M0.toLowerCase(locale);
                        lowerCase.getClass();
                        String strM6687B02 = AbstractC3149m.m6687B0(lowerCase, ".");
                        if (strM6687B02.equals("fdfe:dcba:9876::") || AbstractC3156t.m6740d0(strM6687B02, "fdfe:dcba:9876:", false)) {
                            arrayList.add(obj3);
                        }
                    }
                }
                if (z9 || (!listLookup.isEmpty() && arrayList.isEmpty())) {
                    list = listLookup;
                } else {
                    ConcurrentHashMap concurrentHashMap3 = C1130h2.f3696a;
                    String strM6706U0 = AbstractC3149m.m6706U0(str, '.');
                    Locale locale2 = Locale.US;
                    String strM5165l = AbstractC2091b.m5165l(locale2, strM6706U0, locale2);
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    ConcurrentHashMap concurrentHashMap4 = C1130h2.f3696a;
                    C1106b2 c1106b2 = (C1106b2) concurrentHashMap4.get(strM5165l);
                    list = listLookup;
                    if (c1106b2 == null) {
                        try {
                            HttpUrl httpUrlM2892r = C1130h2.m2892r("https://cloudflare-dns.com/dns-query");
                            httpUrlM2892r.getClass();
                            responseExecute = ((OkHttpClient) C1130h2.f3698c.getValue()).newCall(new Request.Builder().url(httpUrlM2892r.newBuilder().addQueryParameter("name", strM5165l).addQueryParameter("type", "A").build()).header("Accept", "application/dns-json").header("User-Agent", "Mozilla/5.0 (Linux; Android 14) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/126.0.0.0 Mobile Safari/537.36 Hchat-Plugin-Agent/1.1").get().build()).execute();
                            try {
                            } finally {
                            }
                        } catch (Throwable th2) {
                            c3959f = new C3959f(th2);
                        }
                        if (responseExecute.isSuccessful() && (responseBodyBody = responseExecute.body()) != null && (strString = responseBodyBody.string()) != null) {
                            JSONObject jSONObject = new JSONObject(strString);
                            if (jSONObject.optInt("Status", -1) == 0 && (jSONArrayOptJSONArray = jSONObject.optJSONArray("Answer")) != null) {
                                C4329c c4329cM7E = AbstractC0000a.m7E();
                                int length = jSONArrayOptJSONArray.length();
                                while (i10 < length) {
                                    JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i10);
                                    if (jSONObjectOptJSONObject != null) {
                                        i9 = i10;
                                        jSONArray = jSONArrayOptJSONArray;
                                        if (jSONObjectOptJSONObject.optInt("type", 0) == 1) {
                                            String strOptString = jSONObjectOptJSONObject.optString("data", HttpUrl.FRAGMENT_ENCODE_SET);
                                            strOptString.getClass();
                                            String string = AbstractC3149m.m6703R0(strOptString).toString();
                                            if (C1130h2.f3701f.m6683d(string) && (inetAddressM2885k = C1130h2.m2885k(string)) != null && !C1130h2.m2883i(inetAddressM2885k)) {
                                                c4329cM7E.add(inetAddressM2885k);
                                            }
                                        }
                                    } else {
                                        i9 = i10;
                                        jSONArray = jSONArrayOptJSONArray;
                                    }
                                    i10 = i9 + 1;
                                    jSONArrayOptJSONArray = jSONArray;
                                }
                                C4329c c4329cM90t = AbstractC0000a.m90t(c4329cM7E);
                                HashSet hashSet = new HashSet();
                                arrayList2 = new ArrayList();
                                ListIterator listIterator = c4329cM90t.listIterator(0);
                                while (true) {
                                    C4327a c4327a = (C4327a) listIterator;
                                    if (c4327a.hasNext()) {
                                        Object next = c4327a.next();
                                        if (hashSet.add(((InetAddress) next).getHostAddress())) {
                                            arrayList2.add(next);
                                        }
                                    }
                                }
                            } else {
                                arrayList2 = c4173t;
                            }
                            responseExecute.close();
                            c3959f = arrayList2;
                            ?? r62 = c4173t;
                            if (!(c3959f instanceof C3959f)) {
                                r62 = c3959f;
                            }
                            List list3 = (List) r62;
                            if (!list3.isEmpty()) {
                                concurrentHashMap4.put(strM5165l, new C1106b2(list3, jCurrentTimeMillis + 300000));
                            }
                            list2 = list3;
                            if (!list2.isEmpty()) {
                                return list2;
                            }
                        }
                    } else {
                        if (c1106b2.f3583b <= jCurrentTimeMillis) {
                            c1106b2 = null;
                        }
                        if (c1106b2 != null) {
                            list2 = c1106b2.f3582a;
                        }
                        if (!list2.isEmpty()) {
                        }
                    }
                }
                if (!arrayList.isEmpty()) {
                    return arrayList;
                }
                ConcurrentHashMap concurrentHashMap5 = C1130h2.f3696a;
                Iterator it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        Object next2 = it.next();
                        if (C1130h2.m2883i((InetAddress) next2)) {
                            obj = next2;
                        }
                    } else {
                        obj = null;
                    }
                }
                InetAddress inetAddress = (InetAddress) obj;
                if (inetAddress != null) {
                    throw new UnknownHostException(AbstractC4855en.m9263g("拒绝访问内网地址: ", inetAddress.getHostAddress()));
                }
                if (unknownHostException != null) {
                    throw unknownHostException;
                }
                throw new UnknownHostException("域名解析失败: ".concat(str));
        }
    }
}
