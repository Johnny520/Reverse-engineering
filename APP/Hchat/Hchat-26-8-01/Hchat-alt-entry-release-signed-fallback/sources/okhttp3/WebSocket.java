package okhttp3;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public interface WebSocket {

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public interface Factory {
        okhttp3.WebSocket newWebSocket(okhttp3.Request r1, okhttp3.WebSocketListener r2);
    }

    void cancel();

    boolean close(int r1, java.lang.String r2);

    long queueSize();

    okhttp3.Request request();

    boolean send(java.lang.String r1);

    boolean send(okio.ByteString r1);
}
