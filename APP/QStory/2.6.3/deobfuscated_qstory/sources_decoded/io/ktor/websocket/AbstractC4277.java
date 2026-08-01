package io.ktor.websocket;

/* JADX INFO: renamed from: io.ktor.websocket.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC4277 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final /* synthetic */ int[] f12832;

    static {
        int[] iArr = new int[FrameType.values().length];
        try {
            iArr[FrameType.BINARY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[FrameType.TEXT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[FrameType.CLOSE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[FrameType.PING.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[FrameType.PONG.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f12832 = iArr;
    }
}
