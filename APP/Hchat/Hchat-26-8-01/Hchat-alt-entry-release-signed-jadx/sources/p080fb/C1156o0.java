package p080fb;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import ng.AbstractC3015m;
import ng.C3010h;
import ng.C3011i;
import okhttp3.Call;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p025bc.AbstractC0255e;
import p054dg.C0795n;
import p068eh.AbstractC0921a;
import p136j8.C2104o;
import p218og.AbstractC3149m;
import p218og.AbstractC3156t;
import p332wb.AbstractC4855en;

/* JADX INFO: renamed from: fb.o0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1156o0 {

    /* JADX INFO: renamed from: a */
    public final String f3833a;

    /* JADX INFO: renamed from: b */
    public final String f3834b;

    /* JADX INFO: renamed from: c */
    public final C1103b f3835c;

    /* JADX INFO: renamed from: d */
    public final OkHttpClient f3836d;

    /* JADX INFO: renamed from: e */
    public final AtomicLong f3837e;

    /* JADX INFO: renamed from: f */
    public String f3838f;

    /* JADX INFO: renamed from: g */
    public boolean f3839g;

    /* JADX INFO: renamed from: h */
    public String f3840h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1156o0(String str, String str2, C1103b c1103b) {
        this.f3833a = str;
        this.f3834b = str2;
        this.f3835c = c1103b;
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.f3836d = builder.connectTimeout(15L, timeUnit).readTimeout(60L, timeUnit).writeTimeout(30L, timeUnit).build();
        this.f3837e = new AtomicLong(0L);
        this.f3838f = HttpUrl.FRAGMENT_ENCODE_SET;
        this.f3840h = HttpUrl.FRAGMENT_ENCODE_SET;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m2974a() {
        if (this.f3839g) {
            return;
        }
        JSONObject jSONObjectM9267k = AbstractC4855en.m9267k("protocolVersion", "2024-11-05");
        jSONObjectM9267k.put("capabilities", new JSONObject());
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("name", "Hchat Plugin Agent");
        jSONObject.put("version", "1.0");
        jSONObjectM9267k.put("clientInfo", jSONObject);
        JSONObject jSONObjectM2977d = m2977d("initialize", jSONObjectM9267k);
        String strOptString = jSONObjectM2977d.optString("protocolVersion");
        strOptString.getClass();
        if (AbstractC3149m.m6721t0(strOptString)) {
            C2104o.m5276A("MCP initialize 返回无效");
            return;
        }
        String strOptString2 = jSONObjectM2977d.optString("instructions", HttpUrl.FRAGMENT_ENCODE_SET);
        strOptString2.getClass();
        this.f3840h = AbstractC3149m.m6701P0(4000, AbstractC3149m.m6703R0(strOptString2).toString());
        Object jSONObject2 = new JSONObject();
        JSONObject jSONObjectM9268l = AbstractC4855en.m9268l("jsonrpc", "2.0", "method", "notifications/initialized");
        jSONObjectM9268l.put("params", jSONObject2);
        m2976c(jSONObjectM9268l, false);
        this.f3839g = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final String m2975b() throws JSONException {
        m2974a();
        JSONArray jSONArray = new JSONArray();
        HashSet hashSet = new HashSet();
        String strM1023l = HttpUrl.FRAGMENT_ENCODE_SET;
        do {
            if (!AbstractC3149m.m6721t0(strM1023l) && !hashSet.add(strM1023l)) {
                break;
            }
            JSONObject jSONObject = new JSONObject();
            if (!AbstractC3149m.m6721t0(strM1023l)) {
                jSONObject.put("cursor", strM1023l);
            }
            JSONObject jSONObjectM2977d = m2977d("tools/list", jSONObject);
            JSONArray jSONArrayOptJSONArray = jSONObjectM2977d.optJSONArray("tools");
            if (jSONArrayOptJSONArray == null) {
                jSONArrayOptJSONArray = new JSONArray();
            }
            int length = jSONArrayOptJSONArray.length();
            for (int i9 = 0; i9 < length; i9++) {
                jSONArray.put(jSONArrayOptJSONArray.opt(i9));
            }
            strM1023l = AbstractC0255e.m1023l("nextCursor", HttpUrl.FRAGMENT_ENCODE_SET, jSONObjectM2977d);
        } while (!AbstractC3149m.m6721t0(strM1023l));
        JSONObject jSONObject2 = new JSONObject();
        if (!AbstractC3149m.m6721t0(this.f3840h)) {
            jSONObject2.put("instructions", this.f3840h);
        }
        jSONObject2.put("tools", jSONArray);
        String string = jSONObject2.toString();
        string.getClass();
        return string;
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[GOTO]}, finally: {[GOTO, THROW, INVOKE, MOVE_EXCEPTION, THROW, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 3, expect 1 */
    /* JADX INFO: renamed from: c */
    public final String m2976c(JSONObject jSONObject, boolean z9) {
        C1103b c1103b = this.f3835c;
        Set set = c1103b.f3554b;
        c1103b.m2828d();
        Request.Builder builderHeader = new Request.Builder().url(this.f3833a).header("Accept", "application/json, text/event-stream").header("Content-Type", "application/json").header("MCP-Protocol-Version", "2024-11-05");
        if (!AbstractC3149m.m6721t0(this.f3838f)) {
            builderHeader.header("Mcp-Session-Id", this.f3838f);
        }
        String str = this.f3834b;
        if (!AbstractC3149m.m6721t0(str)) {
            builderHeader.header("Authorization", str);
        }
        RequestBody.Companion companion = RequestBody.Companion;
        String string = jSONObject.toString();
        string.getClass();
        Call callNewCall = this.f3836d.newCall(builderHeader.post(companion.create(string, MediaType.Companion.get("application/json"))).build());
        c1103b.m2825a(callNewCall);
        try {
            Response responseExecute = callNewCall.execute();
            try {
                c1103b.m2828d();
                String strHeader$default = Response.header$default(responseExecute, "Mcp-Session-Id", null, 2, null);
                String str2 = HttpUrl.FRAGMENT_ENCODE_SET;
                if (strHeader$default == null) {
                    strHeader$default = HttpUrl.FRAGMENT_ENCODE_SET;
                }
                if (!AbstractC3149m.m6721t0(strHeader$default)) {
                    String strHeader$default2 = Response.header$default(responseExecute, "Mcp-Session-Id", null, 2, null);
                    if (strHeader$default2 == null) {
                        strHeader$default2 = HttpUrl.FRAGMENT_ENCODE_SET;
                    }
                    this.f3838f = strHeader$default2;
                }
                if (!responseExecute.isSuccessful()) {
                    throw new IllegalStateException("MCP HTTP " + responseExecute.code());
                }
                if (z9) {
                    ResponseBody responseBodyBody = responseExecute.body();
                    String strString = responseBodyBody != null ? responseBodyBody.string() : null;
                    if (strString != null) {
                        str2 = strString;
                    }
                    if (AbstractC3149m.m6721t0(str2)) {
                        throw new IllegalStateException("MCP 返回为空");
                    }
                }
                responseExecute.close();
                set.remove(callNewCall);
                return str2;
            } finally {
            }
        } catch (Throwable th2) {
            try {
                if (c1103b.m2826b(th2)) {
                    throw new CancellationException("Agent 已中断");
                }
                throw th2;
            } catch (Throwable th3) {
                callNewCall.getClass();
                set.remove(callNewCall);
                throw th3;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final JSONObject m2977d(String str, JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2;
        long jIncrementAndGet = this.f3837e.incrementAndGet();
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("jsonrpc", "2.0");
        jSONObject3.put("id", jIncrementAndGet);
        jSONObject3.put("method", str);
        jSONObject3.put("params", jSONObject);
        String string = AbstractC3149m.m6703R0(m2976c(jSONObject3, true)).toString();
        Object obj = null;
        if (AbstractC3156t.m6740d0(string, "{", false)) {
            JSONObject jSONObject4 = new JSONObject(string);
            jSONObject2 = jSONObject4.optLong("id", Long.MIN_VALUE) == jIncrementAndGet ? jSONObject4 : null;
            if (jSONObject2 == null) {
                C2104o.m5276A("MCP 返回的请求 ID 不匹配");
                return null;
            }
        } else {
            C3010h c3010h = new C3010h(AbstractC3015m.m6414X(new C3011i(AbstractC3015m.m6413W(new C3011i(AbstractC3015m.m6413W(new C0795n(string, 4), new C1124g0(3)), true, new C1124g0(4)), new C1124g0(5)), true, new C1124g0(6)), new C1124g0(7)));
            while (true) {
                if (!c3010h.hasNext()) {
                    break;
                }
                Object next = c3010h.next();
                if (((JSONObject) next).optLong("id", Long.MIN_VALUE) == jIncrementAndGet) {
                    obj = next;
                    break;
                }
            }
            jSONObject2 = (JSONObject) obj;
            if (jSONObject2 == null) {
                C2104o.m5276A("MCP SSE 中没有匹配的请求响应");
                return null;
            }
        }
        JSONObject jSONObjectOptJSONObject = jSONObject2.optJSONObject("error");
        if (jSONObjectOptJSONObject != null) {
            C2104o.m5276A(AbstractC0255e.m1021j("MCP ", str, " 失败: ", jSONObjectOptJSONObject.optString("message", jSONObjectOptJSONObject.toString())));
            return null;
        }
        JSONObject jSONObjectOptJSONObject2 = jSONObject2.optJSONObject("result");
        if (jSONObjectOptJSONObject2 != null) {
            return jSONObjectOptJSONObject2;
        }
        C2104o.m5276A(AbstractC0921a.m2251n("MCP ", str, " 缺少 result"));
        return null;
    }
}
