package p345x8;

import android.content.Context;
import android.content.SharedPreferences;
import gg.AbstractC1416l;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import okhttp3.HttpUrl;
import org.json.JSONArray;
import org.json.JSONObject;
import p000a.AbstractC0000a;
import p218og.AbstractC3149m;
import p259r9.AbstractC3754e0;
import p276sf.C3959f;
import p300ub.AbstractC4302b;
import p304uf.C4329c;
import tf.AbstractC4166m;
import tf.AbstractC4167n;
import tf.C4173t;

/* JADX INFO: renamed from: x8.r */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5725r {

    /* JADX INFO: renamed from: a */
    public final SharedPreferences f23311a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C5725r(Context context) {
        this.f23311a = context != null ? AbstractC4302b.m8640c(context, "Hchat_auto_reply_config") : null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final C5728u m10381a() {
        Object next;
        m10384d();
        List listM10396p = m10396p();
        String strM10382b = m10382b();
        Iterator it = listM10396p.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (AbstractC1416l.m3825a(((C5728u) next).f23333a, strM10382b)) {
                break;
            }
        }
        C5728u c5728u = (C5728u) next;
        if (c5728u != null) {
            return c5728u;
        }
        C5728u c5728u2 = (C5728u) AbstractC4166m.m8424v1(listM10396p);
        return c5728u2 != null ? c5728u2 : m10390j();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final String m10382b() {
        m10384d();
        String strM10388h = m10388h("zhilia_active_config_name_v1", "默认配置");
        return AbstractC3149m.m6721t0(strM10388h) ? "默认配置" : strM10388h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final List m10383c() {
        List listM7879V = AbstractC3754e0.m7879V(m10388h("auto_accept_steps_v1", HttpUrl.FRAGMENT_ENCODE_SET));
        return listM7879V.isEmpty() ? AbstractC0000a.m99x0(new C5726s(25, null, "你好，%friendName%")) : listM7879V;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final void m10384d() {
        if (AbstractC3149m.m6721t0(m10388h("zhilia_multi_configs_v1", HttpUrl.FRAGMENT_ENCODE_SET))) {
            m10394n(m10388h("zhilia_active_config_name_v1", "默认配置"), AbstractC0000a.m99x0(m10390j()));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final boolean m10385e(String str) {
        Object c3959f;
        str.getClass();
        try {
            SharedPreferences sharedPreferences = this.f23311a;
            c3959f = Boolean.valueOf(sharedPreferences != null ? sharedPreferences.getBoolean(str, false) : false);
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        Object obj = Boolean.FALSE;
        if (c3959f instanceof C3959f) {
            c3959f = obj;
        }
        return ((Boolean) c3959f).booleanValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final int m10386f(String str, int i9) {
        Object c3959f;
        try {
            SharedPreferences sharedPreferences = this.f23311a;
            c3959f = Integer.valueOf(sharedPreferences != null ? sharedPreferences.getInt(str, i9) : i9);
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        Object objValueOf = Integer.valueOf(i9);
        if (c3959f instanceof C3959f) {
            c3959f = objValueOf;
        }
        return ((Number) c3959f).intValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final long m10387g(String str) {
        Object c3959f;
        try {
            SharedPreferences sharedPreferences = this.f23311a;
            c3959f = Long.valueOf(sharedPreferences != null ? sharedPreferences.getLong(str, 2000L) : 2000L);
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        if (c3959f instanceof C3959f) {
            c3959f = 2000L;
        }
        return ((Number) c3959f).longValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0010  */
    /* JADX INFO: renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String m10388h(String str, String str2) {
        Object c3959f;
        str.getClass();
        try {
            SharedPreferences sharedPreferences = this.f23311a;
            if (sharedPreferences != null) {
                String string = sharedPreferences.getString(str, str2);
                c3959f = string;
                if (string == null) {
                    c3959f = str2;
                }
            }
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        Object obj = str2;
        if (!(c3959f instanceof C3959f)) {
            obj = c3959f;
        }
        return (String) obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public final List m10389i() {
        List listM7879V = AbstractC3754e0.m7879V(m10388h("greet_accepted_steps_v1", HttpUrl.FRAGMENT_ENCODE_SET));
        return listM7879V.isEmpty() ? AbstractC0000a.m99x0(new C5726s(25, null, "哈喽，%friendName%！感谢通过好友请求，以后请多指教啦！")) : listM7879V;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public final C5728u m10390j() {
        AbstractC3149m.m6721t0("默认配置");
        return new C5728u("默认配置", m10388h("ai_api_key", HttpUrl.FRAGMENT_ENCODE_SET), m10388h("ai_api_base", "https://api.siliconflow.cn/v1"), m10388h("ai_api_path", "/chat/completions"), m10388h("ai_model", "deepseek-ai/DeepSeek-V3"), m10388h("ai_system_prompt", "你是一个简洁、有帮助的聊天助手"), AbstractC3754e0.m7909r(m10386f("ai_context_limit", 10), 0, 50));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public final void m10391k(String str, String str2) {
        SharedPreferences.Editor editorEdit;
        SharedPreferences.Editor editorPutString;
        SharedPreferences sharedPreferences = this.f23311a;
        if (sharedPreferences == null || (editorEdit = sharedPreferences.edit()) == null || (editorPutString = editorEdit.putString(str, str2)) == null) {
            return;
        }
        editorPutString.apply();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0137  */
    /* JADX INFO: renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List m10392l() {
        C4173t c4173t;
        Object c3959f;
        JSONArray jSONArray;
        int i9;
        String strM10388h = m10388h("auto_reply_rules_v1", HttpUrl.FRAGMENT_ENCODE_SET);
        boolean zM6721t0 = AbstractC3149m.m6721t0(strM10388h);
        C4173t c4173t2 = C4173t.f13710g;
        if (zM6721t0) {
            return c4173t2;
        }
        try {
            JSONArray jSONArray2 = new JSONArray(strM10388h);
            C4329c c4329cM7E = AbstractC0000a.m7E();
            int length = jSONArray2.length();
            int i10 = 0;
            int i11 = 0;
            while (i11 < length) {
                JSONObject jSONObjectOptJSONObject = jSONArray2.optJSONObject(i11);
                if (jSONObjectOptJSONObject != null) {
                    String strOptString = jSONObjectOptJSONObject.optString("id");
                    if (AbstractC3149m.m6721t0(strOptString)) {
                        strOptString = System.currentTimeMillis() + "_" + i11;
                    }
                    String strOptString2 = jSONObjectOptJSONObject.optString("name", "规则 " + (i11 + 1));
                    strOptString2.getClass();
                    boolean zOptBoolean = jSONObjectOptJSONObject.optBoolean("enabled", true);
                    String strOptString3 = jSONObjectOptJSONObject.optString("keyword", HttpUrl.FRAGMENT_ENCODE_SET);
                    strOptString3.getClass();
                    String strOptString4 = jSONObjectOptJSONObject.optString("excludedKeywords", HttpUrl.FRAGMENT_ENCODE_SET);
                    strOptString4.getClass();
                    int iOptInt = jSONObjectOptJSONObject.optInt("matchType", i10);
                    int iOptInt2 = jSONObjectOptJSONObject.optInt("targetMode", i10);
                    Set setM7880W = AbstractC3754e0.m7880W(jSONObjectOptJSONObject.optJSONArray("targetIds"));
                    Set setM7880W2 = AbstractC3754e0.m7880W(jSONObjectOptJSONObject.optJSONArray("excludedIds"));
                    Set setM7880W3 = AbstractC3754e0.m7880W(jSONObjectOptJSONObject.optJSONArray("includedGroupMembers"));
                    Set setM7880W4 = AbstractC3754e0.m7880W(jSONObjectOptJSONObject.optJSONArray("excludedGroupMembers"));
                    int iOptInt3 = jSONObjectOptJSONObject.optInt("atTrigger", 0);
                    int iOptInt4 = jSONObjectOptJSONObject.optInt("patTrigger", 0);
                    String strOptString5 = jSONObjectOptJSONObject.optString("startTime", HttpUrl.FRAGMENT_ENCODE_SET);
                    strOptString5.getClass();
                    String strOptString6 = jSONObjectOptJSONObject.optString("endTime", HttpUrl.FRAGMENT_ENCODE_SET);
                    strOptString6.getClass();
                    int iOptInt5 = jSONObjectOptJSONObject.optInt("maxReplyCount", 0);
                    int i12 = iOptInt5 < 0 ? 0 : iOptInt5;
                    jSONArray = jSONArray2;
                    c4173t = c4173t2;
                    try {
                        long jOptLong = jSONObjectOptJSONObject.optLong("cooldownSeconds", 0L);
                        if (jOptLong < 0) {
                            jOptLong = 0;
                        }
                        i9 = 0;
                        c4329cM7E.add(new C5709b(strOptString, strOptString2, zOptBoolean, strOptString3, strOptString4, iOptInt, iOptInt2, setM7880W, setM7880W2, setM7880W3, setM7880W4, iOptInt3, iOptInt4, strOptString5, strOptString6, i12, jOptLong, jSONObjectOptJSONObject.optBoolean("replyAsQuote", false), AbstractC3754e0.m7879V(jSONObjectOptJSONObject.optString("steps", HttpUrl.FRAGMENT_ENCODE_SET))));
                    } catch (Throwable th2) {
                        th = th2;
                        c3959f = new C3959f(th);
                        return (List) (!(c3959f instanceof C3959f) ? c4173t : c3959f);
                    }
                } else {
                    jSONArray = jSONArray2;
                    i9 = i10;
                    c4173t = c4173t2;
                }
                i11++;
                c4173t2 = c4173t;
                i10 = i9;
                jSONArray2 = jSONArray;
            }
            c3959f = AbstractC0000a.m90t(c4329cM7E);
            c4173t = c4173t2;
        } catch (Throwable th3) {
            th = th3;
            c4173t = c4173t2;
        }
        return (List) (!(c3959f instanceof C3959f) ? c4173t : c3959f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public final void m10393m(C5727t c5727t) {
        SharedPreferences.Editor editorEdit;
        SharedPreferences.Editor editorPutString;
        SharedPreferences.Editor editorPutString2;
        SharedPreferences.Editor editorPutString3;
        SharedPreferences.Editor editorPutString4;
        SharedPreferences.Editor editorPutString5;
        SharedPreferences.Editor editorPutBoolean;
        SharedPreferences.Editor editorPutBoolean2;
        SharedPreferences.Editor editorPutString6;
        SharedPreferences.Editor editorPutBoolean3;
        SharedPreferences.Editor editorPutString7;
        SharedPreferences.Editor editorPutInt;
        SharedPreferences.Editor editorPutInt2;
        SharedPreferences sharedPreferences = this.f23311a;
        if (sharedPreferences == null || (editorEdit = sharedPreferences.edit()) == null) {
            return;
        }
        String string = AbstractC3149m.m6703R0(c5727t.f23317a).toString();
        if (AbstractC3149m.m6721t0(string)) {
            string = "wss://api.tenclass.net/xiaozhi/v1/";
        }
        SharedPreferences.Editor editorPutString8 = editorEdit.putString("xiaozhi_serve_url", string);
        if (editorPutString8 != null) {
            String string2 = AbstractC3149m.m6703R0(c5727t.f23318b).toString();
            if (AbstractC3149m.m6721t0(string2)) {
                string2 = "https://api.tenclass.net/xiaozhi/ota/";
            }
            SharedPreferences.Editor editorPutString9 = editorPutString8.putString("xiaozhi_ota_url", string2);
            if (editorPutString9 != null) {
                String string3 = AbstractC3149m.m6703R0(c5727t.f23319c).toString();
                if (AbstractC3149m.m6721t0(string3)) {
                    string3 = "https://xiaozhi.me/console/agents";
                }
                SharedPreferences.Editor editorPutString10 = editorPutString9.putString("xiaozhi_console_url", string3);
                if (editorPutString10 == null || (editorPutString = editorPutString10.putString("xiaozhi_console_phone", AbstractC3149m.m6703R0(c5727t.f23320d).toString())) == null || (editorPutString2 = editorPutString.putString("xiaozhi_console_token", AbstractC3149m.m6703R0(c5727t.f23321e).toString())) == null || (editorPutString3 = editorPutString2.putString("xiaozhi_console_agent_id", AbstractC3149m.m6703R0(c5727t.f23322f).toString())) == null || (editorPutString4 = editorPutString3.putString("xiaozhi_console_model", AbstractC3149m.m6703R0(c5727t.f23323g).toString())) == null || (editorPutString5 = editorPutString4.putString("xiaozhi_voice_role", AbstractC3149m.m6703R0(c5727t.f23324h).toString())) == null || (editorPutBoolean = editorPutString5.putBoolean("xiaozhi_music_mcp", c5727t.f23325i)) == null || (editorPutBoolean2 = editorPutBoolean.putBoolean("xiaozhi_mcp_bridge_enable", c5727t.f23326j)) == null || (editorPutString6 = editorPutBoolean2.putString("xiaozhi_mcp_endpoint_url", AbstractC3149m.m6703R0(c5727t.f23327k).toString())) == null || (editorPutBoolean3 = editorPutString6.putBoolean("xiaozhi_mcp_kugou_enable", c5727t.f23328l)) == null || (editorPutString7 = editorPutBoolean3.putString("xiaozhi_mcp_kugou_plugin_id", AbstractC3149m.m6703R0(c5727t.f23329m).toString())) == null) {
                    return;
                }
                String string4 = AbstractC3149m.m6703R0(c5727t.f23330n).toString();
                if (AbstractC3149m.m6721t0(string4)) {
                    string4 = "queryKugouMusic";
                }
                SharedPreferences.Editor editorPutString11 = editorPutString7.putString("xiaozhi_mcp_kugou_function", string4);
                if (editorPutString11 == null || (editorPutInt = editorPutString11.putInt("xiaozhi_mcp_ready_seconds", AbstractC3754e0.m7909r(c5727t.f23331o, 1, 30))) == null || (editorPutInt2 = editorPutInt.putInt("xiaozhi_mcp_idle_seconds", AbstractC3754e0.m7909r(c5727t.f23332p, 10, 600))) == null) {
                    return;
                }
                editorPutInt2.apply();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public final void m10394n(String str, List list) {
        Object obj;
        Object next;
        String str2;
        SharedPreferences.Editor editorEdit;
        SharedPreferences.Editor editorPutString;
        SharedPreferences.Editor editorPutString2;
        SharedPreferences.Editor editorPutString3;
        SharedPreferences.Editor editorPutString4;
        SharedPreferences.Editor editorPutString5;
        SharedPreferences.Editor editorPutInt;
        SharedPreferences.Editor editorEdit2;
        SharedPreferences.Editor editorPutString6;
        SharedPreferences.Editor editorPutString7;
        str.getClass();
        ArrayList arrayList = new ArrayList(AbstractC4167n.m8429e1(list));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((C5728u) it.next()).m10399b());
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (!AbstractC3149m.m6721t0(((C5728u) obj2).f23333a)) {
                arrayList2.add(obj2);
            }
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList3 = new ArrayList();
        for (Object obj3 : arrayList2) {
            if (hashSet.add(((C5728u) obj3).f23333a)) {
                arrayList3.add(obj3);
            }
        }
        boolean zIsEmpty = arrayList3.isEmpty();
        List<C5728u> listM99x0 = arrayList3;
        if (zIsEmpty) {
            listM99x0 = AbstractC0000a.m99x0(m10390j());
        }
        JSONObject jSONObject = new JSONObject();
        for (C5728u c5728u : listM99x0) {
            String str3 = c5728u.f23333a;
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("apiKey", c5728u.f23334b);
            jSONObject2.put("apiUrl", c5728u.f23335c);
            jSONObject2.put("apiPath", c5728u.f23336d);
            jSONObject2.put("modelName", c5728u.f23337e);
            jSONObject2.put("systemPrompt", c5728u.f23338f);
            jSONObject2.put("contextLimit", AbstractC3754e0.m7909r(c5728u.f23339g, 0, 50));
            jSONObject.put(str3, jSONObject2);
        }
        Iterator it2 = listM99x0.iterator();
        while (true) {
            obj = null;
            if (it2.hasNext()) {
                next = it2.next();
                if (AbstractC1416l.m3825a(((C5728u) next).f23333a, str)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        C5728u c5728u2 = (C5728u) next;
        if (c5728u2 == null || (str2 = c5728u2.f23333a) == null) {
            str2 = ((C5728u) AbstractC4166m.m8422t1(listM99x0)).f23333a;
        }
        SharedPreferences sharedPreferences = this.f23311a;
        if (sharedPreferences != null && (editorEdit2 = sharedPreferences.edit()) != null && (editorPutString6 = editorEdit2.putString("zhilia_multi_configs_v1", jSONObject.toString())) != null && (editorPutString7 = editorPutString6.putString("zhilia_active_config_name_v1", str2)) != null) {
            editorPutString7.apply();
        }
        Iterator it3 = listM99x0.iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            Object next2 = it3.next();
            if (AbstractC1416l.m3825a(((C5728u) next2).f23333a, str2)) {
                obj = next2;
                break;
            }
        }
        C5728u c5728u3 = (C5728u) obj;
        if (c5728u3 == null || sharedPreferences == null || (editorEdit = sharedPreferences.edit()) == null || (editorPutString = editorEdit.putString("ai_api_key", c5728u3.f23334b)) == null || (editorPutString2 = editorPutString.putString("ai_api_base", c5728u3.f23335c)) == null || (editorPutString3 = editorPutString2.putString("ai_api_path", c5728u3.f23336d)) == null || (editorPutString4 = editorPutString3.putString("ai_model", c5728u3.f23337e)) == null || (editorPutString5 = editorPutString4.putString("ai_system_prompt", c5728u3.f23338f)) == null || (editorPutInt = editorPutString5.putInt("ai_context_limit", AbstractC3754e0.m7909r(c5728u3.f23339g, 0, 50))) == null) {
            return;
        }
        editorPutInt.apply();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public final C5727t m10395o() {
        return new C5727t(m10388h("xiaozhi_serve_url", "wss://api.tenclass.net/xiaozhi/v1/"), m10388h("xiaozhi_ota_url", "https://api.tenclass.net/xiaozhi/ota/"), m10388h("xiaozhi_console_url", "https://xiaozhi.me/console/agents"), m10388h("xiaozhi_console_phone", HttpUrl.FRAGMENT_ENCODE_SET), m10388h("xiaozhi_console_token", HttpUrl.FRAGMENT_ENCODE_SET), m10388h("xiaozhi_console_agent_id", HttpUrl.FRAGMENT_ENCODE_SET), m10388h("xiaozhi_console_model", HttpUrl.FRAGMENT_ENCODE_SET), m10388h("xiaozhi_voice_role", HttpUrl.FRAGMENT_ENCODE_SET), m10385e("xiaozhi_music_mcp"), m10385e("xiaozhi_mcp_bridge_enable"), m10388h("xiaozhi_mcp_endpoint_url", HttpUrl.FRAGMENT_ENCODE_SET), m10385e("xiaozhi_mcp_kugou_enable"), m10388h("xiaozhi_mcp_kugou_plugin_id", "QQ点歌"), m10388h("xiaozhi_mcp_kugou_function", "queryKugouMusic"), m10386f("xiaozhi_mcp_ready_seconds", 5), m10386f("xiaozhi_mcp_idle_seconds", 90));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public final List m10396p() {
        Object c3959f;
        String str;
        String str2 = "deepseek-ai/DeepSeek-V3";
        Object obj = C4173t.f13710g;
        String strM10388h = m10388h("zhilia_multi_configs_v1", HttpUrl.FRAGMENT_ENCODE_SET);
        try {
            if (AbstractC3149m.m6721t0(strM10388h)) {
                c3959f = obj;
            } else {
                JSONObject jSONObject = new JSONObject(strM10388h);
                C4329c c4329cM7E = AbstractC0000a.m7E();
                Iterator<String> itKeys = jSONObject.keys();
                itKeys.getClass();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(next);
                    if (jSONObjectOptJSONObject != null) {
                        next.getClass();
                        String strOptString = jSONObjectOptJSONObject.optString("apiKey", HttpUrl.FRAGMENT_ENCODE_SET);
                        strOptString.getClass();
                        String strOptString2 = jSONObjectOptJSONObject.optString("apiUrl", "https://api.siliconflow.cn/v1");
                        String str3 = AbstractC3149m.m6721t0(strOptString2) ? "https://api.siliconflow.cn/v1" : strOptString2;
                        String strOptString3 = jSONObjectOptJSONObject.optString("apiPath", "/chat/completions");
                        String str4 = AbstractC3149m.m6721t0(strOptString3) ? "/chat/completions" : strOptString3;
                        String strOptString4 = jSONObjectOptJSONObject.optString("modelName", str2);
                        String str5 = AbstractC3149m.m6721t0(strOptString4) ? str2 : strOptString4;
                        str = str2;
                        String strOptString5 = jSONObjectOptJSONObject.optString("systemPrompt", "你是一个简洁、有帮助的聊天助手");
                        strOptString5.getClass();
                        c4329cM7E.add(new C5728u(next, strOptString, str3, str4, str5, strOptString5, AbstractC3754e0.m7909r(jSONObjectOptJSONObject.optInt("contextLimit", 10), 0, 50)));
                    } else {
                        str = str2;
                    }
                    str2 = str;
                }
                c3959f = AbstractC0000a.m90t(c4329cM7E);
            }
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        if (!(c3959f instanceof C3959f)) {
            obj = c3959f;
        }
        List list = (List) obj;
        return list.isEmpty() ? AbstractC0000a.m99x0(m10390j()) : list;
    }
}
