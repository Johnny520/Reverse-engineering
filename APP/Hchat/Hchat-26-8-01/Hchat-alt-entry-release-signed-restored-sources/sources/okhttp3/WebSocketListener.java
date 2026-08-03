package okhttp3;

import okio.ByteString;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class WebSocketListener {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void onClosed(WebSocket webSocket, int i9, String str) {
        webSocket.getClass();
        str.getClass();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void onClosing(WebSocket webSocket, int i9, String str) {
        webSocket.getClass();
        str.getClass();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void onFailure(WebSocket webSocket, Throwable th2, Response response) {
        webSocket.getClass();
        th2.getClass();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void onMessage(WebSocket webSocket, String str) {
        webSocket.getClass();
        str.getClass();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void onOpen(WebSocket webSocket, Response response) {
        webSocket.getClass();
        response.getClass();
    }

    public void onMessage(WebSocket webSocket, ByteString byteString) {
        webSocket.getClass();
        byteString.getClass();
    }
}
