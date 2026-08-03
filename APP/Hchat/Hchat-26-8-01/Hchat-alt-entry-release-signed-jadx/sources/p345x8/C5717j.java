package p345x8;

import gg.AbstractC1416l;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import okhttp3.Response;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;
import okio.ByteString;
import org.json.JSONException;
import org.json.JSONObject;
import p068eh.AbstractC0921a;
import p218og.AbstractC3149m;
import p276sf.C3959f;
import p276sf.C3960g;
import p276sf.C3967n;

/* JADX INFO: renamed from: x8.j */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5717j extends WebSocketListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f23253a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f23254b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C5717j(Object obj, int i9) {
        this.f23253a = i9;
        this.f23254b = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okhttp3.WebSocketListener
    public final void onClosed(WebSocket webSocket, int i9, String str) {
        int i10 = this.f23253a;
        webSocket.getClass();
        str.getClass();
        switch (i10) {
            case 0:
                C5718k c5718k = (C5718k) this.f23254b;
                AtomicReference atomicReference = c5718k.f23261g;
                while (!atomicReference.compareAndSet(webSocket, null) && atomicReference.get() == webSocket) {
                }
                c5718k.f23264j.set(false);
                if (!c5718k.f23263i.get()) {
                    C5718k.m10315a(c5718k);
                }
                break;
            default:
                C5721n c5721n = (C5721n) this.f23254b;
                c5721n.m10326c(webSocket);
                C5720m c5720m = (C5720m) c5721n.f23287f.getAndSet(null);
                if (c5720m != null) {
                    c5720m.f23279e.invoke();
                }
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okhttp3.WebSocketListener
    public final void onFailure(WebSocket webSocket, Throwable th2, Response response) {
        int i9 = this.f23253a;
        webSocket.getClass();
        th2.getClass();
        switch (i9) {
            case 0:
                C5718k c5718k = (C5718k) this.f23254b;
                AtomicReference atomicReference = c5718k.f23261g;
                while (!atomicReference.compareAndSet(webSocket, null) && atomicReference.get() == webSocket) {
                }
                c5718k.f23264j.set(false);
                C5718k.m10315a(c5718k);
                break;
            default:
                C5721n c5721n = (C5721n) this.f23254b;
                c5721n.m10326c(webSocket);
                C5720m c5720m = (C5720m) c5721n.f23287f.getAndSet(null);
                if (c5720m != null) {
                    c5720m.f23278d.invoke(th2, response);
                }
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okhttp3.WebSocketListener
    public final void onMessage(WebSocket webSocket, String str) {
        Object c3959f;
        Object c3959f2;
        int i9 = this.f23253a;
        webSocket.getClass();
        str.getClass();
        switch (i9) {
            case 0:
                C5718k c5718k = (C5718k) this.f23254b;
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    String strOptString = jSONObject.optString("method");
                    if (!AbstractC1416l.m3825a(strOptString, "ping") && !AbstractC1416l.m3825a(strOptString, "notifications/initialized")) {
                        c5718k.f23266l.set(System.currentTimeMillis());
                    }
                    c5718k.m10321g();
                    JSONObject jSONObjectM10319d = c5718k.m10319d("endpoint", jSONObject);
                    if (jSONObjectM10319d != null) {
                        String string = jSONObjectM10319d.toString();
                        string.getClass();
                        c3959f = Boolean.valueOf(webSocket.send(string));
                    }
                } catch (Throwable th2) {
                    c3959f = new C3959f(th2);
                }
                Throwable thM8182b = C3960g.m8182b(c3959f);
                if (thM8182b != null) {
                    AbstractC0921a.m2261x("[Hchat:AutoReply] 小智MCP桥接消息处理失败: ", thM8182b.getMessage(), thM8182b);
                }
                break;
            default:
                C5721n c5721n = (C5721n) this.f23254b;
                AtomicReference atomicReference = c5721n.f23287f;
                c5721n.m10328e();
                try {
                    JSONObject jSONObject2 = new JSONObject(str);
                    boolean zM3825a = AbstractC1416l.m3825a(jSONObject2.optString("type"), "hello");
                    c3959f2 = null;
                    C3967n c3967n = C3967n.f12976a;
                    if (zM3825a) {
                        JSONObject jSONObjectOptJSONObject = jSONObject2.optJSONObject("audio_params");
                        c5721n.f23291j.set(jSONObjectOptJSONObject);
                        c5721n.f23289h.set(true);
                        C5720m c5720m = (C5720m) atomicReference.get();
                        if (c5720m != null) {
                            if (c5720m.f23281g.compareAndSet(false, true)) {
                                c5720m.f23275a.invoke(webSocket, jSONObjectOptJSONObject);
                            }
                            c3959f2 = c3967n;
                        }
                    } else {
                        C5720m c5720m2 = (C5720m) atomicReference.get();
                        if (c5720m2 != null) {
                            c5720m2.f23276b.invoke(webSocket, jSONObject2);
                            c3959f2 = c3967n;
                        }
                    }
                } catch (Throwable th3) {
                    c3959f2 = new C3959f(th3);
                }
                Throwable thM8182b2 = C3960g.m8182b(c3959f2);
                if (thM8182b2 != null) {
                    AbstractC0921a.m2261x("[Hchat:AutoReply] 小智AI 数据解析失败: ", thM8182b2.getMessage(), thM8182b2);
                }
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okhttp3.WebSocketListener
    public final void onOpen(WebSocket webSocket, Response response) throws JSONException {
        int i9 = this.f23253a;
        Object obj = this.f23254b;
        webSocket.getClass();
        response.getClass();
        switch (i9) {
            case 0:
                C5718k c5718k = (C5718k) obj;
                c5718k.f23266l.set(System.currentTimeMillis());
                c5718k.m10321g();
                c5718k.f23264j.set(false);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("jsonrpc", "2.0");
                jSONObject.put("method", "notifications/initialized");
                jSONObject.put("params", new JSONObject());
                String string = jSONObject.toString();
                string.getClass();
                webSocket.send(string);
                break;
            default:
                C5721n c5721n = (C5721n) obj;
                c5721n.m10328e();
                ExecutorService executorService = C5724q.f23297a;
                C5727t c5727t = c5721n.f23284c;
                boolean z9 = c5721n.f23285d;
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("type", "hello");
                jSONObject2.put("version", 1);
                if (z9 && AbstractC3149m.m6721t0(AbstractC3149m.m6703R0(c5727t.f23327k).toString())) {
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("mcp", true);
                    jSONObject2.put("features", jSONObject3);
                }
                jSONObject2.put("transport", "websocket");
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("format", "opus");
                jSONObject4.put("sample_rate", 16000);
                jSONObject4.put("channels", 1);
                jSONObject4.put("frame_duration", 60);
                jSONObject2.put("audio_params", jSONObject4);
                C5724q.m10330B(jSONObject2, c5727t);
                String string2 = jSONObject2.toString();
                string2.getClass();
                webSocket.send(string2);
                break;
        }
    }

    @Override // okhttp3.WebSocketListener
    public void onMessage(WebSocket webSocket, ByteString byteString) {
        switch (this.f23253a) {
            case 1:
                webSocket.getClass();
                byteString.getClass();
                C5721n c5721n = (C5721n) this.f23254b;
                c5721n.m10328e();
                C5720m c5720m = (C5720m) c5721n.f23287f.get();
                if (c5720m != null) {
                    c5720m.f23277c.invoke(byteString);
                }
                break;
            default:
                super.onMessage(webSocket, byteString);
                break;
        }
    }
}
