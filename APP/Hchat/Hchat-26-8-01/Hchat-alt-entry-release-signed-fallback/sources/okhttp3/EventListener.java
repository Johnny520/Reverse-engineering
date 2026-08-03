package okhttp3;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class EventListener {
    public static final okhttp3.EventListener.Companion Companion = null;
    public static final okhttp3.EventListener NONE = null;

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class Companion {
        private Companion() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ Companion(gg.g r1) {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public interface Factory {
        okhttp3.EventListener create(okhttp3.Call r1);
    }

    static {
            okhttp3.EventListener$Companion r0 = new okhttp3.EventListener$Companion
            r1 = 0
            r0.<init>(r1)
            okhttp3.EventListener.Companion = r0
            okhttp3.EventListener$Companion$NONE$1 r0 = new okhttp3.EventListener$Companion$NONE$1
            r0.<init>()
            okhttp3.EventListener.NONE = r0
            return
    }

    public EventListener() {
            r0 = this;
            r0.<init>()
            return
    }

    public void cacheConditionalHit(okhttp3.Call r1, okhttp3.Response r2) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            return
    }

    public void cacheHit(okhttp3.Call r1, okhttp3.Response r2) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            return
    }

    public void cacheMiss(okhttp3.Call r1) {
            r0 = this;
            r1.getClass()
            return
    }

    public void callEnd(okhttp3.Call r1) {
            r0 = this;
            r1.getClass()
            return
    }

    public void callFailed(okhttp3.Call r1, java.io.IOException r2) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            return
    }

    public void callStart(okhttp3.Call r1) {
            r0 = this;
            r1.getClass()
            return
    }

    public void canceled(okhttp3.Call r1) {
            r0 = this;
            r1.getClass()
            return
    }

    public void connectEnd(okhttp3.Call r1, java.net.InetSocketAddress r2, java.net.Proxy r3, okhttp3.Protocol r4) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            r3.getClass()
            return
    }

    public void connectFailed(okhttp3.Call r1, java.net.InetSocketAddress r2, java.net.Proxy r3, okhttp3.Protocol r4, java.io.IOException r5) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            r3.getClass()
            r5.getClass()
            return
    }

    public void connectStart(okhttp3.Call r1, java.net.InetSocketAddress r2, java.net.Proxy r3) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            r3.getClass()
            return
    }

    public void connectionAcquired(okhttp3.Call r1, okhttp3.Connection r2) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            return
    }

    public void connectionReleased(okhttp3.Call r1, okhttp3.Connection r2) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            return
    }

    public void dnsEnd(okhttp3.Call r1, java.lang.String r2, java.util.List<java.net.InetAddress> r3) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            r3.getClass()
            return
    }

    public void dnsStart(okhttp3.Call r1, java.lang.String r2) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            return
    }

    public void proxySelectEnd(okhttp3.Call r1, okhttp3.HttpUrl r2, java.util.List<java.net.Proxy> r3) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            r3.getClass()
            return
    }

    public void proxySelectStart(okhttp3.Call r1, okhttp3.HttpUrl r2) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            return
    }

    public void requestBodyEnd(okhttp3.Call r1, long r2) {
            r0 = this;
            r1.getClass()
            return
    }

    public void requestBodyStart(okhttp3.Call r1) {
            r0 = this;
            r1.getClass()
            return
    }

    public void requestFailed(okhttp3.Call r1, java.io.IOException r2) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            return
    }

    public void requestHeadersEnd(okhttp3.Call r1, okhttp3.Request r2) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            return
    }

    public void requestHeadersStart(okhttp3.Call r1) {
            r0 = this;
            r1.getClass()
            return
    }

    public void responseBodyEnd(okhttp3.Call r1, long r2) {
            r0 = this;
            r1.getClass()
            return
    }

    public void responseBodyStart(okhttp3.Call r1) {
            r0 = this;
            r1.getClass()
            return
    }

    public void responseFailed(okhttp3.Call r1, java.io.IOException r2) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            return
    }

    public void responseHeadersEnd(okhttp3.Call r1, okhttp3.Response r2) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            return
    }

    public void responseHeadersStart(okhttp3.Call r1) {
            r0 = this;
            r1.getClass()
            return
    }

    public void satisfactionFailure(okhttp3.Call r1, okhttp3.Response r2) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            return
    }

    public void secureConnectEnd(okhttp3.Call r1, okhttp3.Handshake r2) {
            r0 = this;
            r1.getClass()
            return
    }

    public void secureConnectStart(okhttp3.Call r1) {
            r0 = this;
            r1.getClass()
            return
    }
}
