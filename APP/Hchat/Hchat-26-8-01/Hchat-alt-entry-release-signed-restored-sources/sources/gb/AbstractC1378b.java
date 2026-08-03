package gb;

import android.content.Context;
import gg.AbstractC1416l;
import java.io.IOException;
import java.io.Serializable;
import java.net.SocketTimeoutException;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okio.C3193a;
import org.json.JSONArray;
import org.json.JSONObject;
import p000a.AbstractC0000a;
import p003a2.C0014a;
import p025bc.AbstractC0255e;
import p068eh.AbstractC0921a;
import p080fb.AbstractC1184v0;
import p136j8.C2104o;
import p218og.AbstractC3149m;
import p259r9.AbstractC3754e0;
import p276sf.C3959f;
import p276sf.C3960g;
import p276sf.C3967n;
import p300ub.AbstractC4302b;
import p304uf.C4329c;
import p304uf.C4333g;
import tf.AbstractC4166m;
import tf.C4174u;

/* JADX INFO: renamed from: gb.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1378b {

    /* JADX INFO: renamed from: a */
    public static final MediaType f4576a = MediaType.Companion.get("application/json; charset=utf-8");

    /* JADX INFO: renamed from: b */
    public static final OkHttpClient f4577b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        f4577b = builder.connectTimeout(15L, timeUnit).readTimeout(120L, timeUnit).writeTimeout(120L, timeUnit).callTimeout(180L, timeUnit).build();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static Object m3749a(Context context, C1395s c1395s, String str, String str2) {
        try {
            if (AbstractC3149m.m6721t0(str)) {
                throw new IllegalArgumentException("远程插件 ID 不能为空");
            }
            EnumC1377a enumC1377a = EnumC1377a.f4573h;
            List listM101y0 = AbstractC0000a.m101y0("v1", "plugins", str, "comments");
            JSONObject jSONObjectM3801a = c1395s.m3801a();
            jSONObjectM3801a.put("content", str2);
            JSONObject jSONObjectM3751c = m3751c(m3760l(context, enumC1377a, listM101y0, jSONObjectM3801a, null, C4174u.f13711g));
            JSONObject jSONObjectOptJSONObject = jSONObjectM3751c.optJSONObject("comment");
            if (jSONObjectOptJSONObject == null) {
                throw new IllegalStateException("插件仓库未返回新评论");
            }
            C1379c c1379cM3790b = AbstractC1393q.m3790b(jSONObjectOptJSONObject);
            long j3 = 0;
            long jOptLong = jSONObjectM3751c.optLong("commentCount", 0L);
            if (jOptLong >= 0) {
                j3 = jOptLong;
            }
            return new C1380d(c1379cM3790b, j3);
        } catch (Throwable th2) {
            return new C3959f(th2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static Object m3750b(Context context, String str, C1395s c1395s) {
        try {
            if (AbstractC3149m.m6721t0(str)) {
                throw new IllegalArgumentException("远程插件 ID 不能为空");
            }
            int iM7909r = AbstractC3754e0.m7909r(100, 1, 100);
            EnumC1377a enumC1377a = EnumC1377a.f4572g;
            List listM101y0 = AbstractC0000a.m101y0("v1", "plugins", str, "comments");
            C4333g c4333g = new C4333g();
            c4333g.put("limit", String.valueOf(iM7909r));
            if (c1395s != null) {
                String str2 = c1395s.f4644a;
                if (AbstractC3149m.m6721t0(str2)) {
                    str2 = null;
                }
                if (str2 != null) {
                    c4333g.put("userWxId", str2);
                }
            }
            JSONObject jSONObjectM3751c = m3751c(m3760l(context, enumC1377a, listM101y0, null, null, c4333g.m8780c()));
            JSONArray jSONArrayOptJSONArray = jSONObjectM3751c.optJSONArray("items");
            if (jSONArrayOptJSONArray == null) {
                jSONArrayOptJSONArray = new JSONArray();
            }
            C4329c c4329cM7E = AbstractC0000a.m7E();
            int length = jSONArrayOptJSONArray.length();
            for (int i9 = 0; i9 < length; i9++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i9);
                if (jSONObjectOptJSONObject != null) {
                    c4329cM7E.add(AbstractC1393q.m3790b(jSONObjectOptJSONObject));
                }
            }
            C4329c c4329cM90t = AbstractC0000a.m90t(c4329cM7E);
            long j3 = 0;
            long jOptLong = jSONObjectM3751c.optLong("total", 0L);
            if (jOptLong >= 0) {
                j3 = jOptLong;
            }
            return new C1381e(c4329cM90t, j3, AbstractC3754e0.m7909r(jSONObjectM3751c.optInt("limit", iM7909r), 1, 100));
        } catch (Throwable th2) {
            return new C3959f(th2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static JSONObject m3751c(JSONObject jSONObject) {
        Object objOpt = jSONObject.opt("data");
        return objOpt instanceof JSONObject ? (JSONObject) objOpt : new JSONObject();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static Object m3752d(Context context, C1389m c1389m) {
        String str = c1389m.f4611a;
        try {
            if (AbstractC3149m.m6721t0(str)) {
                throw new IllegalArgumentException("远程插件 ID 不能为空");
            }
            List listM101y0 = AbstractC0000a.m101y0("v1", "plugins", str);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("installId", AbstractC1393q.m3792d(context));
            jSONObject.put("ownerToken", c1389m.f4612b);
            m3760l(context, EnumC1377a.f4574i, listM101y0, jSONObject, c1389m.f4612b, C4174u.f13711g);
            return C3967n.f12976a;
        } catch (Throwable th2) {
            return new C3959f(th2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static Object m3753e(Context context, C1395s c1395s, String str, String str2) {
        str2.getClass();
        try {
            if (AbstractC3149m.m6721t0(str)) {
                throw new IllegalArgumentException("远程插件 ID 不能为空");
            }
            if (AbstractC3149m.m6721t0(str2)) {
                throw new IllegalArgumentException("评论 ID 不能为空");
            }
            JSONObject jSONObjectM3751c = m3751c(m3760l(context, EnumC1377a.f4574i, AbstractC0000a.m101y0("v1", "plugins", str, "comments", str2), c1395s.m3801a(), null, C4174u.f13711g));
            if (!jSONObjectM3751c.optBoolean("deleted", false)) {
                throw new IllegalArgumentException("插件仓库未确认评论已删除");
            }
            long j3 = 0;
            long jOptLong = jSONObjectM3751c.optLong("commentCount", 0L);
            if (jOptLong >= 0) {
                j3 = jOptLong;
            }
            return new C1380d(null, j3);
        } catch (Throwable th2) {
            return new C3959f(th2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static Object m3754f(Context context, String str) {
        try {
            if (AbstractC3149m.m6721t0(str)) {
                throw new IllegalArgumentException("远程插件 ID 不能为空");
            }
            return AbstractC1393q.m3791c(m3751c(m3760l(context, EnumC1377a.f4572g, AbstractC0000a.m101y0("v1", "plugins", str), null, null, C4174u.f13711g)));
        } catch (Throwable th2) {
            return new C3959f(th2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static String m3755g(JSONObject jSONObject, int i9) {
        String string;
        Object objOpt = jSONObject.opt("error");
        if (objOpt instanceof JSONObject) {
            JSONObject jSONObject2 = (JSONObject) objOpt;
            string = jSONObject2.optString("message");
            if (AbstractC3149m.m6721t0(string)) {
                string = jSONObject2.toString();
            }
        } else {
            string = (objOpt == null || objOpt.equals(JSONObject.NULL)) ? HttpUrl.FRAGMENT_ENCODE_SET : objOpt.toString();
        }
        return AbstractC3149m.m6721t0(string) ? AbstractC0921a.m2249l(i9, "插件仓库请求失败: HTTP ") : string;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static Object m3756h(Context context, String str, String str2) {
        try {
            if (AbstractC3149m.m6721t0(str)) {
                throw new IllegalArgumentException("远程插件 ID 不能为空");
            }
            if (AbstractC3149m.m6721t0(str2)) {
                throw new IllegalArgumentException("历史版本 ID 不能为空");
            }
            return AbstractC1393q.m3791c(m3751c(m3760l(context, EnumC1377a.f4572g, AbstractC0000a.m101y0("v1", "plugins", str, "snapshots", str2), null, null, C4174u.f13711g)));
        } catch (Throwable th2) {
            return new C3959f(th2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public static Object m3757i(Context context, String str, C1395s c1395s) {
        try {
            if (AbstractC3149m.m6721t0(str)) {
                throw new IllegalArgumentException("远程插件 ID 不能为空");
            }
            JSONObject jSONObjectM3751c = m3751c(m3760l(context, EnumC1377a.f4573h, AbstractC0000a.m101y0("v1", "plugins", str, "likes"), c1395s.m3801a(), null, C4174u.f13711g));
            boolean zOptBoolean = jSONObjectM3751c.optBoolean("liked", false);
            long j3 = 0;
            long jOptLong = jSONObjectM3751c.optLong("likeCount", 0L);
            if (jOptLong >= 0) {
                j3 = jOptLong;
            }
            return new C1388l(j3, zOptBoolean);
        } catch (Throwable th2) {
            return new C3959f(th2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public static Object m3758j(Context context, String str, C1395s c1395s) {
        try {
            if (AbstractC3149m.m6721t0(str)) {
                throw new IllegalArgumentException("远程插件 ID 不能为空");
            }
            EnumC1377a enumC1377a = EnumC1377a.f4572g;
            List listM101y0 = AbstractC0000a.m101y0("v1", "plugins", str, "likes");
            Map mapSingletonMap = Collections.singletonMap("userWxId", c1395s.f4644a);
            mapSingletonMap.getClass();
            JSONObject jSONObjectM3751c = m3751c(m3760l(context, enumC1377a, listM101y0, null, null, mapSingletonMap));
            boolean zOptBoolean = jSONObjectM3751c.optBoolean("liked", false);
            long j3 = 0;
            long jOptLong = jSONObjectM3751c.optLong("likeCount", 0L);
            if (jOptLong >= 0) {
                j3 = jOptLong;
            }
            return new C1388l(j3, zOptBoolean);
        } catch (Throwable th2) {
            return new C3959f(th2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public static Serializable m3759k(Context context, String str, String str2, String str3) {
        try {
            if (AbstractC3149m.m6721t0(str)) {
                throw new IllegalArgumentException("远程插件 ID 不能为空");
            }
            if (AbstractC3149m.m6721t0(str2)) {
                throw new IllegalArgumentException("远程插件版本 ID 不能为空");
            }
            if (AbstractC3149m.m6721t0(str3)) {
                throw new IllegalArgumentException("下载事件 ID 不能为空");
            }
            EnumC1377a enumC1377a = EnumC1377a.f4573h;
            List listM101y0 = AbstractC0000a.m101y0("v1", "plugins", str, "downloads");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("versionId", str2);
            jSONObject.put("eventId", str3);
            long jOptLong = m3751c(m3760l(context, enumC1377a, listM101y0, jSONObject, null, C4174u.f13711g)).optLong("downloadCount", -1L);
            if (jOptLong >= 0) {
                return Long.valueOf(jOptLong);
            }
            throw new IllegalArgumentException("插件仓库未返回有效下载量");
        } catch (Throwable th2) {
            return new C3959f(th2);
        }
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX INFO: renamed from: l */
    public static JSONObject m3760l(Context context, EnumC1377a enumC1377a, List list, JSONObject jSONObject, String str, Map map) {
        Object c3959f;
        List list2;
        IOException iOException;
        List list3;
        C1382f c1382f;
        String strConcat;
        Object c3959f2;
        String string;
        String strOptString;
        String string2;
        String string3;
        context.getClass();
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            applicationContext = context;
        }
        String string4 = AbstractC4302b.m8640c(applicationContext, "Hchat_script_plugin_market").getString("service_url", "https://hchat.208.75.133.91.sslip.io");
        String strM6706U0 = (string4 == null || (string3 = AbstractC3149m.m6703R0(string4).toString()) == null) ? null : AbstractC3149m.m6706U0(string3, '/');
        String str2 = HttpUrl.FRAGMENT_ENCODE_SET;
        if (strM6706U0 == null) {
            strM6706U0 = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        try {
            c3959f = HttpUrl.Companion.parse(AbstractC3149m.m6703R0(AbstractC3149m.m6721t0(strM6706U0) ? "https://hchat.208.75.133.91.sslip.io" : strM6706U0).toString());
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        if (c3959f instanceof C3959f) {
            c3959f = null;
        }
        HttpUrl httpUrl = (HttpUrl) c3959f;
        if (httpUrl == null) {
            throw new C1382f("插件仓库地址无效，请先配置完整的 HTTPS 地址", 14, null, null);
        }
        if (!AbstractC1416l.m3825a(httpUrl.scheme(), "https") && !AbstractC1416l.m3825a(httpUrl.scheme(), "http")) {
            C2104o.m5294t("插件仓库只支持 HTTP/HTTPS 地址");
            return null;
        }
        HttpUrl.Builder builderNewBuilder = httpUrl.newBuilder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str3 = (String) it.next();
            if (AbstractC3149m.m6721t0(str3) || str3.equals(".") || str3.equals("..")) {
                C2104o.m5294t("插件仓库路径无效");
                return null;
            }
            builderNewBuilder.addPathSegment(str3);
        }
        for (Map.Entry entry : map.entrySet()) {
            String str4 = (String) entry.getKey();
            String str5 = (String) entry.getValue();
            if (!AbstractC3149m.m6721t0(str5)) {
                builderNewBuilder.addQueryParameter(str4, str5);
            }
        }
        Request.Builder builderHeader = new Request.Builder().url(builderNewBuilder.build()).header("Accept", "application/json").header("X-Hchat-Install-Id", AbstractC1393q.m3792d(context));
        if (str != null && (string2 = AbstractC3149m.m6703R0(str).toString()) != null) {
            if (AbstractC3149m.m6721t0(string2)) {
                string2 = null;
            }
            if (string2 != null) {
                builderHeader.header("Authorization", "Bearer ".concat(string2));
            }
        }
        int iOrdinal = enumC1377a.ordinal();
        if (iOrdinal != 0) {
            MediaType mediaType = f4576a;
            if (iOrdinal == 1) {
                RequestBody.Companion companion = RequestBody.Companion;
                if (jSONObject == null) {
                    jSONObject = new JSONObject();
                }
                String string5 = jSONObject.toString();
                string5.getClass();
                builderHeader.post(companion.create(string5, mediaType));
            } else {
                if (iOrdinal != 2) {
                    C3193a.m6822k();
                    return null;
                }
                RequestBody.Companion companion2 = RequestBody.Companion;
                if (jSONObject == null) {
                    jSONObject = new JSONObject();
                }
                String string6 = jSONObject.toString();
                string6.getClass();
                builderHeader.delete(companion2.create(string6, mediaType));
            }
        } else {
            builderHeader.get();
        }
        try {
            try {
                try {
                    Response responseExecute = f4577b.newCall(builderHeader.build()).execute();
                    try {
                        ResponseBody responseBodyBody = responseExecute.body();
                        String strString = responseBodyBody != null ? responseBodyBody.string() : null;
                        if (strString != null) {
                            str2 = strString;
                        }
                        try {
                            if (AbstractC3149m.m6721t0(str2)) {
                                str2 = "{}";
                            }
                            c3959f2 = new JSONObject(str2);
                        } catch (Throwable th3) {
                            c3959f2 = new C3959f(th3);
                        }
                        Throwable thM8182b = C3960g.m8182b(c3959f2);
                        if (thM8182b != null) {
                            String str6 = "插件仓库返回了无效 JSON: HTTP " + responseExecute.code();
                            responseExecute.code();
                            throw new C1382f(str6, 8, null, thM8182b);
                        }
                        JSONObject jSONObject2 = (JSONObject) c3959f2;
                        if (!jSONObject2.has("ok")) {
                            responseExecute.code();
                            throw new C1382f("插件仓库响应缺少 ok 字段", 12, null, null);
                        }
                        boolean zOptBoolean = jSONObject2.optBoolean("ok", false);
                        if (responseExecute.isSuccessful() && zOptBoolean) {
                            responseExecute.close();
                            return jSONObject2;
                        }
                        String strM3755g = m3755g(jSONObject2, responseExecute.code());
                        responseExecute.code();
                        JSONObject jSONObjectOptJSONObject = jSONObject2.optJSONObject("error");
                        if (jSONObjectOptJSONObject == null || (strOptString = jSONObjectOptJSONObject.optString("code")) == null || (string = AbstractC3149m.m6703R0(strOptString).toString()) == null || AbstractC3149m.m6721t0(string)) {
                            string = null;
                        }
                        throw new C1382f(strM3755g, 4, string, null);
                    } finally {
                    }
                } catch (C1382f e6) {
                    c1382f = e6;
                    list3 = list;
                    String strName = enumC1377a.name();
                    String strM8392A1 = AbstractC4166m.m8392A1(list3, "/", null, null, null, 62);
                    String message = c1382f.getMessage();
                    StringBuilder sbM1027p = AbstractC0255e.m1027p("[Hchat:PluginMarket] 请求失败 method=", strName, " path=/", strM8392A1, " ");
                    sbM1027p.append(message);
                    AbstractC1184v0.m3204n(sbM1027p.toString(), c1382f);
                    throw c1382f;
                } catch (IOException e7) {
                    iOException = e7;
                    list2 = list;
                    if (iOException instanceof SocketTimeoutException) {
                        strConcat = "插件仓库请求超时";
                    } else {
                        String message2 = iOException.getMessage();
                        if (message2 == null) {
                            message2 = "网络不可用";
                        }
                        strConcat = "插件仓库网络请求失败: ".concat(message2);
                    }
                    C1382f c1382f2 = new C1382f(strConcat, 10, null, iOException);
                    AbstractC1184v0.m3204n("[Hchat:PluginMarket] 网络请求失败 method=" + enumC1377a.name() + " path=/" + AbstractC4166m.m8392A1(list2, "/", null, null, null, 62), c1382f2);
                    throw c1382f2;
                }
            } catch (Throwable th4) {
                String message3 = th4.getMessage();
                if (message3 == null) {
                    message3 = th4.getClass().getSimpleName();
                }
                C1382f c1382f3 = new C1382f("插件仓库请求失败: ".concat(message3), 10, null, th4);
                AbstractC1184v0.m3204n("[Hchat:PluginMarket] 请求异常 method=" + enumC1377a.name() + " path=/" + AbstractC4166m.m8392A1(list, "/", null, null, null, 62), c1382f3);
                throw c1382f3;
            }
        } catch (C1382f e10) {
            list3 = list;
            c1382f = e10;
        } catch (IOException e11) {
            list2 = list;
            iOException = e11;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public static Object m3761m(Context context, String str, C1395s c1395s) {
        try {
            if (AbstractC3149m.m6721t0(str)) {
                throw new IllegalArgumentException("远程插件 ID 不能为空");
            }
            JSONObject jSONObjectM3751c = m3751c(m3760l(context, EnumC1377a.f4574i, AbstractC0000a.m101y0("v1", "plugins", str, "likes"), c1395s.m3801a(), null, C4174u.f13711g));
            boolean zOptBoolean = jSONObjectM3751c.optBoolean("liked", false);
            long j3 = 0;
            long jOptLong = jSONObjectM3751c.optLong("likeCount", 0L);
            if (jOptLong >= 0) {
                j3 = jOptLong;
            }
            return new C1388l(j3, zOptBoolean);
        } catch (Throwable th2) {
            return new C3959f(th2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public static Object m3762n(Context context, C1394r c1394r, C1389m c1389m) {
        String string;
        context.getClass();
        try {
            String lowerCase = null;
            JSONObject jSONObjectM3751c = m3751c(m3760l(context, EnumC1377a.f4573h, AbstractC0000a.m101y0("v1", "plugins"), c1394r.m3800a(c1389m != null ? c1389m.f4611a : null), c1389m != null ? c1389m.f4612b : null, C4174u.f13711g));
            JSONObject jSONObjectOptJSONObject = jSONObjectM3751c.optJSONObject("ownership");
            if (jSONObjectOptJSONObject == null) {
                jSONObjectOptJSONObject = jSONObjectM3751c;
            }
            String strOptString = jSONObjectOptJSONObject.optString("remotePluginId");
            if (AbstractC3149m.m6721t0(strOptString)) {
                strOptString = jSONObjectOptJSONObject.optString("pluginId");
            }
            if (AbstractC3149m.m6721t0(strOptString)) {
                strOptString = jSONObjectOptJSONObject.optString("id");
            }
            boolean zM6721t0 = AbstractC3149m.m6721t0(strOptString);
            String str = HttpUrl.FRAGMENT_ENCODE_SET;
            if (zM6721t0) {
                strOptString = c1389m != null ? c1389m.f4611a : null;
                if (strOptString == null) {
                    strOptString = HttpUrl.FRAGMENT_ENCODE_SET;
                }
            }
            String string2 = AbstractC3149m.m6703R0(strOptString).toString();
            String strOptString2 = jSONObjectOptJSONObject.optString("ownerToken");
            if (AbstractC3149m.m6721t0(strOptString2)) {
                String str2 = c1389m != null ? c1389m.f4612b : null;
                if (str2 != null) {
                    str = str2;
                }
                strOptString2 = str;
            }
            String string3 = AbstractC3149m.m6703R0(strOptString2).toString();
            if (AbstractC3149m.m6721t0(string2)) {
                throw new IllegalArgumentException("上传成功但服务端未返回 remotePluginId");
            }
            if (AbstractC3149m.m6721t0(string3)) {
                throw new IllegalArgumentException("上传成功但服务端未返回 ownerToken");
            }
            C0014a c0014a = EnumC1392p.f4629g;
            String strOptString3 = jSONObjectM3751c.optString("reviewStatus");
            c0014a.getClass();
            if (strOptString3 != null && (string = AbstractC3149m.m6703R0(strOptString3).toString()) != null) {
                lowerCase = string.toLowerCase(Locale.ROOT);
                lowerCase.getClass();
            }
            return new C1389m(string2, string3, AbstractC1416l.m3825a(lowerCase, "pending") ? EnumC1392p.f4630h : EnumC1392p.f4631i);
        } catch (Throwable th2) {
            return new C3959f(th2);
        }
    }
}
