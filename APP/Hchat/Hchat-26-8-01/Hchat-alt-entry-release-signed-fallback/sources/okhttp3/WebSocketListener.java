package okhttp3;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class WebSocketListener {
    public WebSocketListener() {
            r0 = this;
            r0.<init>()
            return
    }

    public void onClosed(okhttp3.WebSocket r1, int r2, java.lang.String r3) {
            r0 = this;
            r1.getClass()
            r3.getClass()
            return
    }

    public void onClosing(okhttp3.WebSocket r1, int r2, java.lang.String r3) {
            r0 = this;
            r1.getClass()
            r3.getClass()
            return
    }

    public void onFailure(okhttp3.WebSocket r1, java.lang.Throwable r2, okhttp3.Response r3) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            return
    }

    public void onMessage(okhttp3.WebSocket r1, java.lang.String r2) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            return
    }

    public void onMessage(okhttp3.WebSocket r1, okio.ByteString r2) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            return
    }

    public void onOpen(okhttp3.WebSocket r1, okhttp3.Response r2) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            return
    }
}
