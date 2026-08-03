package p345x8;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import okhttp3.WebSocket;
import org.json.JSONObject;
import p332wb.RunnableC4794cr;

/* JADX INFO: renamed from: x8.n */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5721n {

    /* JADX INFO: renamed from: a */
    public final String f23282a;

    /* JADX INFO: renamed from: b */
    public final String f23283b;

    /* JADX INFO: renamed from: c */
    public final C5727t f23284c;

    /* JADX INFO: renamed from: d */
    public final boolean f23285d;

    /* JADX INFO: renamed from: e */
    public final AtomicReference f23286e = new AtomicReference();

    /* JADX INFO: renamed from: f */
    public final AtomicReference f23287f = new AtomicReference();

    /* JADX INFO: renamed from: g */
    public final AtomicBoolean f23288g = new AtomicBoolean(false);

    /* JADX INFO: renamed from: h */
    public final AtomicBoolean f23289h = new AtomicBoolean(false);

    /* JADX INFO: renamed from: i */
    public final AtomicLong f23290i = new AtomicLong(System.currentTimeMillis());

    /* JADX INFO: renamed from: j */
    public final AtomicReference f23291j = new AtomicReference();

    /* JADX INFO: renamed from: k */
    public final C5717j f23292k = new C5717j(this, 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C5721n(String str, String str2, C5727t c5727t, boolean z9) {
        this.f23282a = str;
        this.f23283b = str2;
        this.f23284c = c5727t;
        this.f23285d = z9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m10324a(String str) {
        if (this.f23288g.compareAndSet(false, true)) {
            C5724q.f23304h.remove(this.f23282a, this);
            WebSocket webSocket = (WebSocket) this.f23286e.getAndSet(null);
            if (webSocket != null) {
                webSocket.close(1000, str);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final void m10325b(C5720m c5720m) {
        AtomicReference atomicReference;
        c5720m.getClass();
        do {
            atomicReference = this.f23287f;
            if (atomicReference.compareAndSet(c5720m, null)) {
                break;
            }
        } while (atomicReference.get() == c5720m);
        m10328e();
        C5724q.f23298b.schedule(new RunnableC4794cr(this, 4), 90000L, TimeUnit.MILLISECONDS);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final void m10326c(WebSocket webSocket) {
        AtomicReference atomicReference;
        do {
            atomicReference = this.f23286e;
            if (atomicReference.compareAndSet(webSocket, null)) {
                this.f23288g.set(true);
                this.f23289h.set(false);
                C5724q.f23304h.remove(this.f23282a, this);
                return;
            }
        } while (atomicReference.get() == webSocket);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final void m10327d(C5720m c5720m) {
        c5720m.getClass();
        C5720m c5720m2 = (C5720m) this.f23287f.getAndSet(c5720m);
        if (c5720m2 != null) {
            c5720m2.f23280f.invoke();
        }
        m10328e();
        WebSocket webSocket = (WebSocket) this.f23286e.get();
        if (webSocket == null || !this.f23289h.get()) {
            return;
        }
        JSONObject jSONObject = (JSONObject) this.f23291j.get();
        if (c5720m.f23281g.compareAndSet(false, true)) {
            c5720m.f23275a.invoke(webSocket, jSONObject);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final void m10328e() {
        this.f23290i.set(System.currentTimeMillis());
    }
}
