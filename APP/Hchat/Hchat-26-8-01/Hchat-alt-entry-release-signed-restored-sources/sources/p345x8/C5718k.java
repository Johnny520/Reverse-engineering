package p345x8;

import ca.C0512c;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import okhttp3.HttpUrl;
import okhttp3.Request;
import okhttp3.WebSocket;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p068eh.AbstractC0921a;
import p099h.Hchat.hooks.api.core.WeChatApis;
import p099h.Hchat.hooks.api.model.WeChatSnsPost;
import p099h.Hchat.hooks.items.script.ScriptPluginRuntime;
import p136j8.C2105p;
import p218og.AbstractC3149m;
import p261rb.RunnableC3791g;
import p276sf.C3959f;
import p276sf.C3960g;
import p276sf.C3967n;
import p332wb.AbstractC4855en;
import p332wb.RunnableC4794cr;

/* JADX INFO: renamed from: x8.k */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5718k {

    /* JADX INFO: renamed from: a */
    public final String f23255a;

    /* JADX INFO: renamed from: b */
    public final boolean f23256b;

    /* JADX INFO: renamed from: c */
    public final String f23257c;

    /* JADX INFO: renamed from: d */
    public final String f23258d;

    /* JADX INFO: renamed from: e */
    public final long f23259e;

    /* JADX INFO: renamed from: f */
    public final AtomicReference f23260f;

    /* JADX INFO: renamed from: g */
    public final AtomicReference f23261g;

    /* JADX INFO: renamed from: h */
    public final ConcurrentHashMap f23262h;

    /* JADX INFO: renamed from: i */
    public final AtomicBoolean f23263i;

    /* JADX INFO: renamed from: j */
    public final AtomicBoolean f23264j;

    /* JADX INFO: renamed from: k */
    public final AtomicBoolean f23265k;

    /* JADX INFO: renamed from: l */
    public final AtomicLong f23266l;

    /* JADX INFO: renamed from: m */
    public final CountDownLatch f23267m;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C5718k(String str, String str2, boolean z9, String str3, String str4, long j3) {
        str.getClass();
        str3.getClass();
        this.f23255a = str;
        this.f23256b = z9;
        this.f23257c = str3;
        this.f23258d = str4;
        this.f23259e = j3;
        this.f23260f = new AtomicReference(str2);
        this.f23261g = new AtomicReference();
        this.f23262h = new ConcurrentHashMap();
        this.f23263i = new AtomicBoolean(false);
        this.f23264j = new AtomicBoolean(false);
        this.f23265k = new AtomicBoolean(false);
        this.f23266l = new AtomicLong(System.currentTimeMillis());
        this.f23267m = new CountDownLatch(!AbstractC3149m.m6721t0(str) ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final void m10315a(C5718k c5718k) {
        if (!c5718k.f23263i.get() && c5718k.f23264j.compareAndSet(false, true)) {
            Thread thread = new Thread(new RunnableC4794cr(c5718k, 3), "Hchat-Xiaozhi-MCP-Reconnect");
            thread.setDaemon(true);
            thread.start();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static JSONObject m10316e(String str, String str2, JSONObject jSONObject, JSONArray jSONArray) throws JSONException {
        JSONObject jSONObjectM9268l = AbstractC4855en.m9268l("name", str, "description", str2);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("type", "object");
        jSONObject2.put("properties", jSONObject);
        jSONObject2.put("required", jSONArray);
        jSONObjectM9268l.put("inputSchema", jSONObject2);
        return jSONObjectM9268l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final void m10317b(String str) {
        this.f23263i.set(true);
        this.f23262h.clear();
        WebSocket webSocket = (WebSocket) this.f23261g.getAndSet(null);
        if (webSocket != null) {
            webSocket.close(1000, str);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final void m10318c() {
        Object c3959f;
        boolean zM6721t0;
        AtomicReference atomicReference;
        AtomicBoolean atomicBoolean = this.f23264j;
        String str = this.f23255a;
        if (this.f23263i.get()) {
            return;
        }
        try {
            zM6721t0 = AbstractC3149m.m6721t0(str);
            atomicReference = this.f23261g;
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        if (zM6721t0) {
            WebSocket webSocket = (WebSocket) atomicReference.getAndSet(null);
            if (webSocket != null) {
                webSocket.close(1000, "main websocket mcp only");
            }
            atomicBoolean.set(false);
            return;
        }
        atomicReference.set(C5724q.f23299c.newWebSocket(new Request.Builder().url(str).build(), new C5717j(this, 0)));
        c3959f = C3967n.f12976a;
        Throwable thM8182b = C3960g.m8182b(c3959f);
        if (thM8182b != null) {
            atomicBoolean.set(false);
            AbstractC0921a.m2261x("[Hchat:AutoReply] 小智MCP桥接连接失败: ", thM8182b.getMessage(), thM8182b);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02e6  */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final JSONObject m10319d(String str, JSONObject jSONObject) throws JSONException {
        String str2;
        Object obj;
        String str3;
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        String str4;
        JSONObject jSONObject4;
        C2105p c2105pMedia;
        if (jSONObject == null || !jSONObject.has("id")) {
            return null;
        }
        Object objOpt = jSONObject.opt("id");
        String strOptString = jSONObject.optString("method");
        if (strOptString != null) {
            int iHashCode = strOptString.hashCode();
            String str5 = this.f23257c;
            boolean z9 = this.f23256b;
            obj = objOpt;
            str2 = "id";
            switch (iHashCode) {
                case 3441010:
                    str3 = strOptString;
                    jSONObject2 = !str3.equals("ping") ? null : new JSONObject();
                    break;
                case 498659858:
                    str3 = strOptString;
                    if (str3.equals("tools/call")) {
                        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("params");
                        String strOptString2 = jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optString("name") : null;
                        if (strOptString2 == null) {
                            strOptString2 = HttpUrl.FRAGMENT_ENCODE_SET;
                        }
                        if (jSONObjectOptJSONObject == null || (jSONObject3 = jSONObjectOptJSONObject.optJSONObject("arguments")) == null) {
                            jSONObject3 = new JSONObject();
                        }
                        int iHashCode2 = strOptString2.hashCode();
                        str4 = str3;
                        boolean z10 = false;
                        if (iHashCode2 == -907276859) {
                            if (strOptString2.equals("hchat_send_text")) {
                                String strM9266j = AbstractC4855en.m9266j(WeChatSnsPost.TYPE_TEXT, jSONObject3);
                                String strM10322h = m10322h(jSONObject3);
                                if (!AbstractC3149m.m6721t0(strM9266j)) {
                                    ExecutorService executorService = C5724q.f23297a;
                                    if (C5724q.m10337I(strM10322h, strM9266j)) {
                                    }
                                }
                            }
                            jSONObject4 = new JSONObject();
                            JSONArray jSONArray = new JSONArray();
                            JSONObject jSONObjectM9267k = AbstractC4855en.m9267k("type", WeChatSnsPost.TYPE_TEXT);
                            jSONObjectM9267k.put(WeChatSnsPost.TYPE_TEXT, z10 ? "ok" : "failed");
                            jSONObject4.put("content", jSONArray.put(jSONObjectM9267k));
                            jSONObject4.put("isError", !z10);
                            jSONObject2 = jSONObject4;
                            str3 = str4;
                        } else if (iHashCode2 == 483515334) {
                            if (strOptString2.equals("hchat_share_music")) {
                                String strM9266j2 = AbstractC4855en.m9266j("title", jSONObject3);
                                String strM9266j3 = AbstractC4855en.m9266j("description", jSONObject3);
                                String strM9266j4 = AbstractC4855en.m9266j("musicUrl", jSONObject3);
                                String strM9266j5 = AbstractC4855en.m9266j("musicDataUrl", jSONObject3);
                                String strM9266j6 = AbstractC4855en.m9266j("appId", jSONObject3);
                                String strM10322h2 = m10322h(jSONObject3);
                                if (!AbstractC3149m.m6721t0(strM9266j2) && !AbstractC3149m.m6721t0(strM9266j4) && !AbstractC3149m.m6721t0(strM9266j5) && (c2105pMedia = WeChatApis.media()) != null) {
                                    if (AbstractC3149m.m6721t0(strM9266j3)) {
                                        strM9266j3 = "音乐";
                                    }
                                    if (c2105pMedia.f7039e.m593Z(strM10322h2, strM9266j2, strM9266j3, strM9266j4, strM9266j5, HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, null, strM9266j6)) {
                                    }
                                }
                            }
                            jSONObject4 = new JSONObject();
                            JSONArray jSONArray2 = new JSONArray();
                            JSONObject jSONObjectM9267k2 = AbstractC4855en.m9267k("type", WeChatSnsPost.TYPE_TEXT);
                            jSONObjectM9267k2.put(WeChatSnsPost.TYPE_TEXT, z10 ? "ok" : "failed");
                            jSONObject4.put("content", jSONArray2.put(jSONObjectM9267k2));
                            jSONObject4.put("isError", !z10);
                            jSONObject2 = jSONObject4;
                            str3 = str4;
                        } else {
                            if (iHashCode2 == 1725887449 && strOptString2.equals("hchat_kugou_order_music")) {
                                String strM9266j7 = AbstractC4855en.m9266j("keyword", jSONObject3);
                                if (!AbstractC3149m.m6721t0(strM9266j7) && z9 && !AbstractC3149m.m6721t0(str5)) {
                                    if (!(ScriptPluginRuntime.INSTANCE.m10923callPluginFunction0E7RQCE(str5, this.f23258d, m10322h(jSONObject3), strM9266j7) instanceof C3959f)) {
                                        z10 = true;
                                    }
                                }
                            }
                            jSONObject4 = new JSONObject();
                            JSONArray jSONArray22 = new JSONArray();
                            JSONObject jSONObjectM9267k22 = AbstractC4855en.m9267k("type", WeChatSnsPost.TYPE_TEXT);
                            jSONObjectM9267k22.put(WeChatSnsPost.TYPE_TEXT, z10 ? "ok" : "failed");
                            jSONObject4.put("content", jSONArray22.put(jSONObjectM9267k22));
                            jSONObject4.put("isError", !z10);
                            jSONObject2 = jSONObject4;
                            str3 = str4;
                        }
                    }
                    break;
                case 498935890:
                    if (strOptString.equals("tools/list")) {
                        JSONObject jSONObject5 = new JSONObject();
                        JSONArray jSONArray3 = new JSONArray();
                        str4 = strOptString;
                        JSONObject jSONObject6 = new JSONObject();
                        jSONObject6.put(WeChatSnsPost.TYPE_TEXT, AbstractC4855en.m9268l("type", "string", "description", "要发送到当前微信会话的文字内容，尽量少于1024字节"));
                        JSONObject jSONObject7 = new JSONObject();
                        jSONObject7.put("type", "string");
                        jSONObject7.put("description", "当前 Hchat 会话 session_id；如果你拿得到，请使用用户消息里的原值");
                        jSONObject6.put("session_id", jSONObject7);
                        JSONArray jSONArrayPut = new JSONArray().put(WeChatSnsPost.TYPE_TEXT);
                        jSONArrayPut.getClass();
                        jSONArray3.put(m10316e("hchat_send_text", "当用户要求你通过微信发送、通知、回复文字时，使用此工具把文字发送到当前触发自动回复的微信会话。不能指定其他会话。", jSONObject6, jSONArrayPut));
                        JSONObject jSONObject8 = new JSONObject();
                        jSONObject8.put("title", AbstractC4855en.m9268l("type", "string", "description", "歌曲标题"));
                        JSONObject jSONObject9 = new JSONObject();
                        jSONObject9.put("type", "string");
                        jSONObject9.put("description", "歌手或描述");
                        jSONObject8.put("description", jSONObject9);
                        JSONObject jSONObject10 = new JSONObject();
                        jSONObject10.put("type", "string");
                        jSONObject10.put("description", "音乐详情页或分享页 URL");
                        jSONObject8.put("musicUrl", jSONObject10);
                        JSONObject jSONObject11 = new JSONObject();
                        jSONObject11.put("type", "string");
                        jSONObject11.put("description", "可播放的音频直链 URL");
                        jSONObject8.put("musicDataUrl", jSONObject11);
                        JSONObject jSONObject12 = new JSONObject();
                        jSONObject12.put("type", "string");
                        jSONObject12.put("description", "微信 appid，可留空");
                        jSONObject8.put("appId", jSONObject12);
                        JSONObject jSONObject13 = new JSONObject();
                        jSONObject13.put("type", "string");
                        jSONObject13.put("description", "当前 Hchat 会话 session_id；如果你拿得到，请使用用户消息里的原值");
                        jSONObject8.put("session_id", jSONObject13);
                        JSONArray jSONArrayPut2 = new JSONArray().put("title").put("musicUrl").put("musicDataUrl");
                        jSONArrayPut2.getClass();
                        jSONArray3.put(m10316e("hchat_share_music", "当你已经获得歌曲播放链接时，使用此工具发送微信音乐卡片到当前触发自动回复的微信会话。不能指定其他会话。", jSONObject8, jSONArrayPut2));
                        if (z9 && !AbstractC3149m.m6721t0(str5)) {
                            JSONObject jSONObject14 = new JSONObject();
                            jSONObject14.put("keyword", AbstractC4855en.m9268l("type", "string", "description", "从用户请求中提取出的歌曲名、歌手名或组合关键词，例如 晴天、周杰伦 晴天、林俊杰 黑夜问白天"));
                            JSONObject jSONObject15 = new JSONObject();
                            jSONObject15.put("type", "string");
                            jSONObject15.put("description", "当前 Hchat 会话 session_id；如果你拿得到，请使用用户消息里的原值");
                            jSONObject14.put("session_id", jSONObject15);
                            JSONArray jSONArrayPut3 = new JSONArray().put("keyword");
                            jSONArrayPut3.getClass();
                            jSONArray3.put(m10316e("hchat_kugou_order_music", "当用户表达想听歌、放一首歌、播放音乐、来一首某歌手或某歌曲时，先从用户话里提取歌曲名、歌手名或组合关键词，然后使用此工具调用 Hchat 配置的点歌工具，在当前微信会话搜索并发送音乐卡片。", jSONObject14, jSONArrayPut3));
                        }
                        jSONObject4 = jSONObject5;
                        jSONObject4.put("tools", jSONArray3);
                        this.f23267m.countDown();
                        jSONObject2 = jSONObject4;
                        str3 = str4;
                    }
                    break;
                case 871091088:
                    if (strOptString.equals("initialize")) {
                        jSONObject2 = AbstractC4855en.m9267k("protocolVersion", "2024-11-05");
                        JSONObject jSONObject16 = new JSONObject();
                        jSONObject16.put("tools", new JSONObject());
                        jSONObject2.put("capabilities", jSONObject16);
                        JSONObject jSONObject17 = new JSONObject();
                        jSONObject17.put("name", "Hchat");
                        jSONObject17.put("version", "1.0");
                        jSONObject2.put("serverInfo", jSONObject17);
                        str3 = strOptString;
                    }
                    break;
            }
            if (jSONObject2 == null) {
                String str6 = str2;
                JSONObject jSONObjectM9267k3 = AbstractC4855en.m9267k("jsonrpc", "2.0");
                jSONObjectM9267k3.put(str6, obj != null ? obj : JSONObject.NULL);
                jSONObjectM9267k3.put("result", jSONObject2);
                return jSONObjectM9267k3;
            }
            String strM9263g = AbstractC4855en.m9263g("Method not found: ", str3);
            JSONObject jSONObjectM9267k4 = AbstractC4855en.m9267k("jsonrpc", "2.0");
            jSONObjectM9267k4.put(str2, obj != null ? obj : JSONObject.NULL);
            JSONObject jSONObject18 = new JSONObject();
            jSONObject18.put("code", -32601);
            jSONObject18.put("message", strM9263g);
            jSONObjectM9267k4.put("error", jSONObject18);
            return jSONObjectM9267k4;
        }
        str2 = "id";
        obj = objOpt;
        str3 = strOptString;
        if (jSONObject2 == null) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final void m10320f(String str, String str2) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.f23266l.set(jCurrentTimeMillis);
        C5716i c5716i = new C5716i(str2, jCurrentTimeMillis);
        ConcurrentHashMap concurrentHashMap = this.f23262h;
        concurrentHashMap.put(str, c5716i);
        concurrentHashMap.entrySet().removeIf(new C5715h(new C0512c(jCurrentTimeMillis, 21), 0));
        m10321g();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final void m10321g() {
        if (!this.f23263i.get() && this.f23265k.compareAndSet(false, true)) {
            Thread thread = new Thread(new RunnableC3791g(this, 19, this), "Hchat-Xiaozhi-MCP-Idle");
            thread.setDaemon(true);
            thread.start();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public final String m10322h(JSONObject jSONObject) {
        C5716i c5716i = (C5716i) this.f23262h.get(AbstractC4855en.m9266j("session_id", jSONObject));
        String str = c5716i != null ? c5716i.f23251a : (String) this.f23260f.get();
        C5724q.f23306j.put(str, Long.valueOf(System.currentTimeMillis()));
        str.getClass();
        return str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public final void m10323i() {
        if (this.f23263i.get()) {
            return;
        }
        this.f23266l.set(System.currentTimeMillis());
        m10321g();
    }
}
