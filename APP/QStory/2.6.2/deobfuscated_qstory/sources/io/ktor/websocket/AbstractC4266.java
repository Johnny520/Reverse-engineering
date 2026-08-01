package io.ktor.websocket;

/* JADX INFO: renamed from: io.ktor.websocket.飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC4266 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final /* synthetic */ int[] f12803;

    static {
        int[] iArr = new int[WebSocketReader$State.values().length];
        try {
            iArr[WebSocketReader$State.HEADER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[WebSocketReader$State.BODY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[WebSocketReader$State.CLOSED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f12803 = iArr;
    }
}
