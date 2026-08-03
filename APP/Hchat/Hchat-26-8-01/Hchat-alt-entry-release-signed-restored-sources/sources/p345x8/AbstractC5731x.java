package p345x8;

import de.robv.android.xposed.XposedBridge;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okio.C3193a;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p000a.AbstractC0000a;
import p012ah.C0086a;
import p068eh.AbstractC0921a;
import p136j8.AbstractC2091b;
import p136j8.C2104o;
import p174m.C2571a;
import p218og.AbstractC3149m;
import p218og.AbstractC3156t;
import p276sf.C3959f;
import p304uf.C4329c;
import p332wb.AbstractC4855en;
import tf.C4173t;

/* JADX INFO: renamed from: x8.x */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5731x {

    /* JADX INFO: renamed from: a */
    public static final OkHttpClient f23348a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        OkHttpClient.Builder builderCookieJar = new OkHttpClient.Builder().cookieJar(new C2571a(29));
        TimeUnit timeUnit = TimeUnit.SECONDS;
        f23348a = builderCookieJar.connectTimeout(15L, timeUnit).readTimeout(30L, timeUnit).build();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static void m10400a(Request.Builder builder, String str) {
        String string = AbstractC3149m.m6703R0(str).toString();
        if (AbstractC3149m.m6721t0(string)) {
            return;
        }
        if (!AbstractC3156t.m6740d0(string, "Bearer ", false)) {
            string = "Bearer ".concat(string);
        }
        builder.addHeader("Authorization", string);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static void m10401b(Request.Builder builder, String str) {
        builder.header("User-Agent", "Mozilla/5.0 (Linux; Android 14) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/115.0 Mobile Safari/537.36");
        builder.header("Accept", "*/*");
        builder.header("Accept-Language", "zh-CN,zh;q=0.9,en-US;q=0.8,en;q=0.7");
        if (AbstractC3156t.m6740d0(str, "/api/auth/", false)) {
            builder.header("Referer", "https://xiaozhi.me/login");
        } else {
            builder.header("Referer", "https://xiaozhi.me/console/agents");
        }
        if (str.equals("/api/auth/send-code") || str.equals("/api/auth/phone-login")) {
            builder.header("Origin", "https://xiaozhi.me");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static JSONObject m10402c(String str, String str2) throws IOException {
        JSONObject jSONObjectOptJSONObject;
        str.getClass();
        str2.getClass();
        C5730w c5730wM10408i = m10408i("/api/agents/" + AbstractC3149m.m6703R0(str2).toString(), str);
        if (!c5730wM10408i.f23346b) {
            C3193a.m6815d(c5730wM10408i.f23345a, "拉取智能体配置失败: HTTP ");
            return null;
        }
        String str3 = c5730wM10408i.f23347c;
        if (AbstractC3149m.m6721t0(str3)) {
            str3 = "{}";
        }
        JSONObject jSONObject = new JSONObject(str3);
        if (!jSONObject.optBoolean("success", false)) {
            String strOptString = jSONObject.optString("message");
            if (AbstractC3149m.m6721t0(strOptString)) {
                strOptString = "拉取智能体配置失败";
            }
            C0086a.m449h(strOptString);
            return null;
        }
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("data");
        if (jSONObjectOptJSONObject2 != null && (jSONObjectOptJSONObject = jSONObjectOptJSONObject2.optJSONObject("agent")) != null) {
            return jSONObjectOptJSONObject;
        }
        C2104o.m5276A("智能体配置为空");
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static C4329c m10403d(String str) throws IOException {
        str.getClass();
        C5730w c5730wM10408i = m10408i("/api/agents?page=1&pageSize=24", str);
        if (!c5730wM10408i.f23346b) {
            C3193a.m6815d(c5730wM10408i.f23345a, "拉取智能体失败: HTTP ");
            return null;
        }
        String str2 = c5730wM10408i.f23347c;
        if (AbstractC3149m.m6721t0(str2)) {
            str2 = "{}";
        }
        JSONObject jSONObject = new JSONObject(str2);
        if (!jSONObject.optBoolean("success", false)) {
            String strOptString = jSONObject.optString("message");
            if (AbstractC3149m.m6721t0(strOptString)) {
                strOptString = "拉取智能体失败";
            }
            C0086a.m449h(strOptString);
            return null;
        }
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("data");
        if (jSONArrayOptJSONArray == null) {
            jSONArrayOptJSONArray = new JSONArray();
        }
        JSONArray jSONArray = jSONArrayOptJSONArray;
        C4329c c4329cM7E = AbstractC0000a.m7E();
        int length = jSONArray.length();
        for (int i9 = 0; i9 < length; i9++) {
            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i9);
            if (jSONObjectOptJSONObject != null) {
                String strOptString2 = jSONObjectOptJSONObject.optString("id");
                if (AbstractC3149m.m6721t0(strOptString2)) {
                    long jOptLong = jSONObjectOptJSONObject.optLong("id", 0L);
                    Long lValueOf = Long.valueOf(jOptLong);
                    if (!(jOptLong > 0)) {
                        lValueOf = null;
                    }
                    String strValueOf = lValueOf != null ? String.valueOf(lValueOf.longValue()) : null;
                    strOptString2 = strValueOf == null ? HttpUrl.FRAGMENT_ENCODE_SET : strValueOf;
                }
                String str3 = strOptString2;
                if (!AbstractC3149m.m6721t0(str3)) {
                    String strOptString3 = jSONObjectOptJSONObject.optString("agent_name");
                    if (AbstractC3149m.m6721t0(strOptString3)) {
                        strOptString3 = "智能体 ".concat(str3);
                    }
                    String strOptString4 = jSONObjectOptJSONObject.optString("assistant_name");
                    strOptString4.getClass();
                    String strOptString5 = jSONObjectOptJSONObject.optString("llm_model");
                    strOptString5.getClass();
                    String strOptString6 = jSONObjectOptJSONObject.optString("tts_voice");
                    strOptString6.getClass();
                    c4329cM7E.add(new C5729v(str3, strOptString3, strOptString4, strOptString5, strOptString6));
                }
            }
        }
        C4329c c4329cM90t = AbstractC0000a.m90t(c4329cM7E);
        m10409j("智能体列表已拉取 count=" + c4329cM90t.size());
        return c4329cM90t;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static String m10404e() throws IOException {
        C5730w c5730wM10408i = m10408i("/api/auth/captcha", HttpUrl.FRAGMENT_ENCODE_SET);
        if (!c5730wM10408i.f23346b) {
            C3193a.m6815d(c5730wM10408i.f23345a, "图形验证码请求失败: HTTP ");
            return null;
        }
        String str = c5730wM10408i.f23347c;
        if (!AbstractC3149m.m6709h0(str, "<svg", true)) {
            C2104o.m5276A("图形验证码格式异常");
            return null;
        }
        m10409j("图形验证码已刷新 len=" + str.length());
        return str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static C5732y m10405f(String str, String str2) throws IOException {
        JSONObject jSONObjectOptJSONObject;
        int i9;
        str.getClass();
        str2.getClass();
        String string = AbstractC3149m.m6703R0(str2).toString();
        if (AbstractC3149m.m6721t0(string)) {
            C2104o.m5276A("请先选择小智智能体");
            return null;
        }
        if (!AbstractC3156t.m6740d0(string, "agent_", false)) {
            string = "agent_".concat(string);
        }
        C5730w c5730wM10408i = m10408i("https://api.xiaozhi.me/mcp/endpoints/list?endpoint_ids=".concat(string), str);
        String str3 = c5730wM10408i.f23347c;
        if (!c5730wM10408i.f23346b && (i9 = c5730wM10408i.f23345a) != 304) {
            throw new IllegalStateException(("查询 MCP 状态失败: HTTP " + i9).toString());
        }
        if (AbstractC3149m.m6721t0(str3)) {
            return new C5732y("未知", "控制台返回空内容，请稍后刷新", false);
        }
        JSONArray jSONArrayOptJSONArray = new JSONObject(str3).optJSONArray("endpoints");
        if (jSONArrayOptJSONArray == null || (jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(0)) == null) {
            return new C5732y("离线", "控制台未返回接入点", false);
        }
        int iOptInt = jSONObjectOptJSONObject.optInt("connectionCount", 0);
        String strOptString = jSONObjectOptJSONObject.optString("status");
        JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject.optJSONArray("tools");
        int length = jSONArrayOptJSONArray2 != null ? jSONArrayOptJSONArray2.length() : 0;
        boolean z9 = iOptInt > 0 || AbstractC3156t.m6734X(strOptString, "connected") || AbstractC3156t.m6734X(strOptString, "online");
        String str4 = z9 ? "在线" : "离线";
        StringBuilder sbM2258u = AbstractC0921a.m2258u(iOptInt, "控制台 status=", strOptString, "，连接数=", "，工具=");
        sbM2258u.append(length);
        return new C5732y(str4, sbM2258u.toString(), z9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static C4329c m10406g(String str) throws IOException {
        JSONArray jSONArray;
        str.getClass();
        C5730w c5730wM10408i = m10408i("/api/roles/model-list", str);
        if (!c5730wM10408i.f23346b) {
            C3193a.m6815d(c5730wM10408i.f23345a, "拉取模型列表失败: HTTP ");
            return null;
        }
        String str2 = c5730wM10408i.f23347c;
        if (AbstractC3149m.m6721t0(str2)) {
            str2 = "{}";
        }
        JSONObject jSONObjectOptJSONObject = new JSONObject(str2).optJSONObject("data");
        if (jSONObjectOptJSONObject == null || (jSONArray = jSONObjectOptJSONObject.optJSONArray("modelList")) == null) {
            jSONArray = new JSONArray();
        }
        JSONArray jSONArray2 = jSONArray;
        C4329c c4329cM7E = AbstractC0000a.m7E();
        int length = jSONArray2.length();
        for (int i9 = 0; i9 < length; i9++) {
            JSONObject jSONObjectOptJSONObject2 = jSONArray2.optJSONObject(i9);
            if (jSONObjectOptJSONObject2 != null) {
                String strOptString = jSONObjectOptJSONObject2.optString("name");
                if (AbstractC3149m.m6721t0(strOptString)) {
                    strOptString = jSONObjectOptJSONObject2.optString("model");
                }
                strOptString.getClass();
                if (!AbstractC3149m.m6721t0(strOptString)) {
                    String strOptString2 = jSONObjectOptJSONObject2.optString("description");
                    if (AbstractC3149m.m6721t0(strOptString2)) {
                        strOptString2 = strOptString;
                    }
                    c4329cM7E.add(new C5733z(strOptString, strOptString2));
                }
            }
        }
        C4329c c4329cM90t = AbstractC0000a.m90t(c4329cM7E);
        m10409j("模型列表已拉取 count=" + c4329cM90t.size());
        return c4329cM90t;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static C4329c m10407h(String str) throws IOException {
        JSONArray jSONArray;
        str.getClass();
        C5730w c5730wM10408i = m10408i("/api/roles/tts-list", str);
        if (!c5730wM10408i.f23346b) {
            C3193a.m6815d(c5730wM10408i.f23345a, "拉取语音角色失败: HTTP ");
            return null;
        }
        String str2 = c5730wM10408i.f23347c;
        if (AbstractC3149m.m6721t0(str2)) {
            str2 = "{}";
        }
        JSONObject jSONObjectOptJSONObject = new JSONObject(str2).optJSONObject("data");
        if (jSONObjectOptJSONObject == null || (jSONArray = jSONObjectOptJSONObject.optJSONArray("ttsList")) == null) {
            jSONArray = new JSONArray();
        }
        JSONArray jSONArray2 = jSONArray;
        C4329c c4329cM7E = AbstractC0000a.m7E();
        int length = jSONArray2.length();
        for (int i9 = 0; i9 < length; i9++) {
            JSONObject jSONObjectOptJSONObject2 = jSONArray2.optJSONObject(i9);
            if (jSONObjectOptJSONObject2 != null) {
                String strOptString = jSONObjectOptJSONObject2.optString("voice_id");
                strOptString.getClass();
                if (!AbstractC3149m.m6721t0(strOptString)) {
                    JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject2.optJSONArray("languages");
                    List listM90t = null;
                    if (jSONArrayOptJSONArray != null) {
                        C4329c c4329cM7E2 = AbstractC0000a.m7E();
                        int length2 = jSONArrayOptJSONArray.length();
                        for (int i10 = 0; i10 < length2; i10++) {
                            String strOptString2 = jSONArrayOptJSONArray.optString(i10);
                            strOptString2.getClass();
                            if (AbstractC3149m.m6721t0(strOptString2)) {
                                strOptString2 = null;
                            }
                            if (strOptString2 != null) {
                                c4329cM7E2.add(strOptString2);
                            }
                        }
                        listM90t = AbstractC0000a.m90t(c4329cM7E2);
                    }
                    if (listM90t == null) {
                        listM90t = C4173t.f13710g;
                    }
                    String strOptString3 = jSONObjectOptJSONObject2.optString("name");
                    if (AbstractC3149m.m6721t0(strOptString3)) {
                        strOptString3 = strOptString;
                    }
                    c4329cM7E.add(new C5708a0(strOptString, strOptString3, listM90t));
                }
            }
        }
        C4329c c4329cM90t = AbstractC0000a.m90t(c4329cM7E);
        m10409j("语音角色列表已拉取 count=" + c4329cM90t.size());
        return c4329cM90t;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX INFO: renamed from: i */
    public static C5730w m10408i(String str, String str2) throws IOException {
        Request.Builder builderUrl = new Request.Builder().url((AbstractC3156t.m6740d0(str, "http://", false) || AbstractC3156t.m6740d0(str, "https://", false)) ? str : "https://xiaozhi.me".concat(str));
        m10401b(builderUrl, str);
        m10400a(builderUrl, str2);
        Response responseExecute = f23348a.newCall(builderUrl.get().build()).execute();
        try {
            int iCode = responseExecute.code();
            boolean zIsSuccessful = responseExecute.isSuccessful();
            ResponseBody responseBodyBody = responseExecute.body();
            String strString = responseBodyBody != null ? responseBodyBody.string() : null;
            if (strString == null) {
                strString = HttpUrl.FRAGMENT_ENCODE_SET;
            }
            C5730w c5730w = new C5730w(strString, iCode, zIsSuccessful);
            responseExecute.close();
            return c5730w;
        } finally {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public static void m10409j(String str) {
        XposedBridge.log("[Hchat:XiaozhiConsole] ".concat(str));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public static String m10410k(String str) {
        String strM6737a0 = AbstractC3156t.m6737a0(AbstractC3156t.m6737a0(AbstractC3149m.m6703R0(str).toString(), " ", HttpUrl.FRAGMENT_ENCODE_SET, false), "-", HttpUrl.FRAGMENT_ENCODE_SET, false);
        return AbstractC3156t.m6740d0(strM6737a0, "+", false) ? strM6737a0 : (AbstractC3156t.m6740d0(strM6737a0, "86", false) && strM6737a0.length() == 13) ? "+".concat(strM6737a0) : "+86".concat(strM6737a0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public static String m10411l(String str, String str2) throws JSONException, IOException {
        str.getClass();
        str2.getClass();
        String strM10410k = m10410k(str);
        JSONObject jSONObjectM9267k = AbstractC4855en.m9267k("phone", strM10410k);
        jSONObjectM9267k.put("code", AbstractC3149m.m6703R0(str2).toString());
        m10409j("手机号登录请求: phoneLen=" + strM10410k.length() + " codeLen=" + AbstractC3149m.m6703R0(str2).toString().length());
        String str3 = HttpUrl.FRAGMENT_ENCODE_SET;
        C5730w c5730wM10412m = m10412m("/api/auth/phone-login", HttpUrl.FRAGMENT_ENCODE_SET, jSONObjectM9267k);
        int i9 = c5730wM10412m.f23345a;
        String str4 = c5730wM10412m.f23347c;
        if (!c5730wM10412m.f23346b) {
            int length = strM10410k.length();
            String strM10414o = m10414o(str4);
            StringBuilder sbM2256s = AbstractC0921a.m2256s(i9, length, "手机号登录失败: HTTP ", " phoneLen=", " body=");
            sbM2256s.append(strM10414o);
            m10409j(sbM2256s.toString());
            throw new IllegalStateException(("登录失败: HTTP " + i9 + " " + m10413n(str4)).toString());
        }
        JSONObject jSONObject = new JSONObject(AbstractC3149m.m6721t0(str4) ? "{}" : str4);
        if (jSONObject.optBoolean("success", false)) {
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
            String strOptString = jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optString("token") : null;
            if (strOptString != null) {
                str3 = strOptString;
            }
            if (AbstractC3149m.m6721t0(str3)) {
                C2104o.m5276A("登录成功但未返回 token");
                return null;
            }
            m10409j("手机号登录成功 tokenPresent=true");
            return str3;
        }
        m10409j("手机号登录业务失败: phoneLen=" + strM10410k.length() + " body=" + m10414o(str4));
        String strOptString2 = jSONObject.optString("message");
        if (AbstractC3149m.m6721t0(strOptString2)) {
            strOptString2 = "登录失败";
        }
        C0086a.m449h(strOptString2);
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX INFO: renamed from: m */
    public static C5730w m10412m(String str, String str2, JSONObject jSONObject) throws IOException {
        Request.Builder builderUrl = new Request.Builder().url("https://xiaozhi.me".concat(str));
        m10401b(builderUrl, str);
        m10400a(builderUrl, str2);
        Request.Builder builderAddHeader = builderUrl.addHeader("Content-Type", "application/json");
        RequestBody.Companion companion = RequestBody.Companion;
        String string = jSONObject.toString();
        string.getClass();
        Response responseExecute = f23348a.newCall(builderAddHeader.post(companion.create(string, MediaType.Companion.get("application/json"))).build()).execute();
        try {
            int iCode = responseExecute.code();
            boolean zIsSuccessful = responseExecute.isSuccessful();
            ResponseBody responseBodyBody = responseExecute.body();
            String strString = responseBodyBody != null ? responseBodyBody.string() : null;
            if (strString == null) {
                strString = HttpUrl.FRAGMENT_ENCODE_SET;
            }
            C5730w c5730w = new C5730w(strString, iCode, zIsSuccessful);
            responseExecute.close();
            return c5730w;
        } finally {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public static String m10413n(String str) {
        Object c3959f;
        boolean zM6721t0 = AbstractC3149m.m6721t0(str);
        String str2 = HttpUrl.FRAGMENT_ENCODE_SET;
        if (zM6721t0) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String strOptString = jSONObject.optString("message");
            boolean zM6721t02 = AbstractC3149m.m6721t0(strOptString);
            String strOptString2 = strOptString;
            if (zM6721t02) {
                strOptString2 = jSONObject.optString("msg");
            }
            boolean zM6721t03 = AbstractC3149m.m6721t0(strOptString2);
            c3959f = strOptString2;
            if (zM6721t03) {
                c3959f = jSONObject.optString("code");
            }
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        Object obj = str2;
        if (!(c3959f instanceof C3959f)) {
            obj = c3959f;
        }
        obj.getClass();
        return AbstractC3149m.m6701P0(80, (String) obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public static String m10414o(String str) {
        String strM5161h = AbstractC2091b.m5161h("\"token\"\\s*:\\s*\"[^\"]+\"", str, "\"token\":\"***\"");
        Pattern patternCompile = Pattern.compile("\"phone\"\\s*:\\s*\"[^\"]+\"");
        patternCompile.getClass();
        String strReplaceAll = patternCompile.matcher(strM5161h).replaceAll("\"phone\":\"***\"");
        strReplaceAll.getClass();
        return AbstractC3149m.m6701P0(500, strReplaceAll);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public static C5729v m10415p(String str, String str2, String str3, String str4) throws JSONException, IOException {
        str.getClass();
        str2.getClass();
        JSONObject jSONObjectM10402c = m10402c(str, str2);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("agent_name", jSONObjectM10402c.optString("agent_name"));
        jSONObject.put("assistant_name", jSONObjectM10402c.optString("assistant_name"));
        String string = str3 != null ? AbstractC3149m.m6703R0(str3).toString() : null;
        if (string == null || AbstractC3149m.m6721t0(string)) {
            string = null;
        }
        if (string == null) {
            string = jSONObjectM10402c.optString("llm_model");
        }
        jSONObject.put("llm_model", string);
        String string2 = str4 != null ? AbstractC3149m.m6703R0(str4).toString() : null;
        String strOptString = string2 == null || AbstractC3149m.m6721t0(string2) ? null : string2;
        if (strOptString == null) {
            strOptString = jSONObjectM10402c.optString("tts_voice");
        }
        jSONObject.put("tts_voice", strOptString);
        String strOptString2 = jSONObjectM10402c.optString("tts_speech_speed");
        if (AbstractC3149m.m6721t0(strOptString2)) {
            strOptString2 = "normal";
        }
        jSONObject.put("tts_speech_speed", strOptString2);
        Object objOpt = jSONObjectM10402c.opt("tts_pitch");
        if (objOpt == null) {
            objOpt = 0;
        }
        jSONObject.put("tts_pitch", objOpt);
        jSONObject.put("asr_speed", jSONObjectM10402c.optString("asr_speed"));
        String strOptString3 = jSONObjectM10402c.optString("language");
        if (AbstractC3149m.m6721t0(strOptString3)) {
            strOptString3 = jSONObjectM10402c.optString("lang_code");
            if (AbstractC3149m.m6721t0(strOptString3)) {
                strOptString3 = "zh";
            }
        }
        jSONObject.put("language", strOptString3);
        jSONObject.put("character", jSONObjectM10402c.optString("character"));
        jSONObject.put("memory", jSONObjectM10402c.optString("memory"));
        Object objOpt2 = jSONObjectM10402c.opt("memory_by_speaker");
        if (objOpt2 == null) {
            objOpt2 = Boolean.FALSE;
        }
        jSONObject.put("memory_by_speaker", objOpt2);
        JSONArray jSONArrayOptJSONArray = jSONObjectM10402c.optJSONArray("mcp_endpoints");
        if (jSONArrayOptJSONArray == null) {
            jSONArrayOptJSONArray = new JSONArray();
        }
        jSONObject.put("mcp_endpoints", jSONArrayOptJSONArray);
        jSONObject.put("memory_type", jSONObjectM10402c.optString("memory_type"));
        Object objOpt3 = jSONObjectM10402c.opt("teen_mode");
        if (objOpt3 == null) {
            objOpt3 = Boolean.FALSE;
        }
        jSONObject.put("teen_mode", objOpt3);
        JSONArray jSONArrayOptJSONArray2 = jSONObjectM10402c.optJSONArray("knowledge_base_ids");
        if (jSONArrayOptJSONArray2 == null) {
            jSONArrayOptJSONArray2 = new JSONArray();
        }
        jSONObject.put("knowledge_base_ids", jSONArrayOptJSONArray2);
        C5730w c5730wM10412m = m10412m("/api/agents/" + AbstractC3149m.m6703R0(str2).toString() + "/config", str, jSONObject);
        if (!c5730wM10412m.f23346b) {
            C3193a.m6815d(c5730wM10412m.f23345a, "保存智能体配置失败: HTTP ");
            return null;
        }
        String str5 = c5730wM10412m.f23347c;
        if (AbstractC3149m.m6721t0(str5)) {
            str5 = "{}";
        }
        JSONObject jSONObject2 = new JSONObject(str5);
        if (!jSONObject2.optBoolean("success", false)) {
            String strOptString4 = jSONObject2.optString("message");
            if (AbstractC3149m.m6721t0(strOptString4)) {
                strOptString4 = "保存智能体配置失败";
            }
            C0086a.m449h(strOptString4);
            return null;
        }
        boolean z9 = !(str3 == null || AbstractC3149m.m6721t0(str3));
        boolean z10 = str4 == null || AbstractC3149m.m6721t0(str4);
        StringBuilder sb2 = new StringBuilder("智能体配置已保存 agentId=");
        sb2.append(str2);
        sb2.append(" modelSet=");
        sb2.append(z9);
        sb2.append(" voiceSet=");
        sb2.append(!z10);
        m10409j(sb2.toString());
        JSONObject jSONObjectM10402c2 = m10402c(str, str2);
        String string3 = AbstractC3149m.m6703R0(str2).toString();
        String strOptString5 = jSONObjectM10402c2.optString("agent_name");
        if (AbstractC3149m.m6721t0(strOptString5)) {
            strOptString5 = AbstractC4855en.m9263g("智能体 ", AbstractC3149m.m6703R0(str2).toString());
        }
        String strOptString6 = jSONObjectM10402c2.optString("assistant_name");
        strOptString6.getClass();
        String strOptString7 = jSONObjectM10402c2.optString("llm_model");
        strOptString7.getClass();
        String strOptString8 = jSONObjectM10402c2.optString("tts_voice");
        strOptString8.getClass();
        return new C5729v(string3, strOptString5, strOptString6, strOptString7, strOptString8);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public static void m10416q(String str, String str2) throws JSONException, IOException {
        str.getClass();
        str2.getClass();
        String strM10410k = m10410k(str);
        JSONObject jSONObjectM9267k = AbstractC4855en.m9267k("phone", strM10410k);
        jSONObjectM9267k.put("captcha_code", AbstractC3149m.m6703R0(str2).toString());
        m10409j("短信验证码请求: phoneLen=" + strM10410k.length() + " captchaLen=" + AbstractC3149m.m6703R0(str2).toString().length());
        C5730w c5730wM10412m = m10412m("/api/auth/send-code", HttpUrl.FRAGMENT_ENCODE_SET, jSONObjectM9267k);
        int i9 = c5730wM10412m.f23345a;
        String str3 = c5730wM10412m.f23347c;
        if (!c5730wM10412m.f23346b) {
            int length = strM10410k.length();
            String strM10414o = m10414o(str3);
            StringBuilder sbM2256s = AbstractC0921a.m2256s(i9, length, "短信验证码请求失败: HTTP ", " phoneLen=", " body=");
            sbM2256s.append(strM10414o);
            m10409j(sbM2256s.toString());
            throw new IllegalStateException(("短信验证码请求失败: HTTP " + i9 + " " + m10413n(str3)).toString());
        }
        JSONObject jSONObject = new JSONObject(AbstractC3149m.m6721t0(str3) ? "{}" : str3);
        if (jSONObject.optBoolean("success", false)) {
            m10409j("短信验证码已发送 phoneLen=" + strM10410k.length());
            return;
        }
        m10409j("短信验证码业务失败: phoneLen=" + strM10410k.length() + " body=" + m10414o(str3));
        String strOptString = jSONObject.optString("message");
        if (AbstractC3149m.m6721t0(strOptString)) {
            strOptString = "短信验证码请求失败";
        }
        C0086a.m449h(strOptString);
    }
}
