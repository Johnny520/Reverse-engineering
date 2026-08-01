package io.ktor.websocket;

/* JADX INFO: renamed from: io.ktor.websocket.飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC4267 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final /* synthetic */ int[] f12807;

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
        f12807 = iArr;
    }
}
