package p155ka;

import java.util.Map;
import java.util.concurrent.TimeUnit;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p129ig.AbstractC2043a;
import p218og.AbstractC3149m;
import p332wb.AbstractC4855en;

/* JADX INFO: renamed from: ka.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2375a {

    /* JADX INFO: renamed from: b */
    public static final MediaType f7810b = MediaType.Companion.get("application/json; charset=utf-8");

    /* JADX INFO: renamed from: a */
    public final OkHttpClient f7811a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2375a() {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.f7811a = builder.connectTimeout(30L, timeUnit).callTimeout(30L, timeUnit).readTimeout(30L, timeUnit).build();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static JSONObject m5689c() throws JSONException {
        JSONObject jSONObjectM9268l = AbstractC4855en.m9268l("ct", "11", "cv", "22060004");
        jSONObjectM9268l.put("tmeAppID", "ztelite");
        jSONObjectM9268l.put("OpenUDID", "nouid");
        jSONObjectM9268l.put("uid", "3449496653");
        return jSONObjectM9268l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static JSONObject m5690d(String str) {
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectOptJSONObject2;
        JSONObject jSONObjectOptJSONObject3;
        JSONArray jSONArrayOptJSONArray;
        if (str == null || AbstractC3149m.m6721t0(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        JSONObject jSONObjectOptJSONObject4 = jSONObject.optJSONObject("req");
        if ((jSONObjectOptJSONObject4 == null && (jSONObjectOptJSONObject4 = jSONObject.optJSONObject("searchMusic")) == null) || (jSONObjectOptJSONObject = jSONObjectOptJSONObject4.optJSONObject("data")) == null || (jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("body")) == null || (jSONObjectOptJSONObject3 = jSONObjectOptJSONObject2.optJSONObject("song")) == null || (jSONArrayOptJSONArray = jSONObjectOptJSONObject3.optJSONArray("list")) == null) {
            return null;
        }
        return jSONArrayOptJSONArray.optJSONObject(0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX INFO: renamed from: a */
    public final String m5691a(Request request) {
        Response responseExecute = this.f7811a.newCall(request).execute();
        try {
            if (!responseExecute.isSuccessful()) {
                AbstractC2043a.m5035i(responseExecute, null);
                return null;
            }
            ResponseBody responseBodyBody = responseExecute.body();
            String strString = responseBodyBody != null ? responseBodyBody.string() : null;
            AbstractC2043a.m5035i(responseExecute, null);
            return strString;
        } finally {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final String m5692b(String str, Map map) {
        Request.Builder builder = new Request.Builder().url(str).get();
        for (Map.Entry entry : map.entrySet()) {
            builder.addHeader((String) entry.getKey(), (String) entry.getValue());
        }
        return m5691a(builder.build());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final String m5693e(String str) {
        return m5691a(new Request.Builder().url("https://u.y.qq.com/cgi-bin/musicu.fcg").post(RequestBody.Companion.create(str, f7810b)).build());
    }
}
