package io.ktor.websocket;

/* JADX INFO: renamed from: io.ktor.websocket.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC4271 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final /* synthetic */ int[] f12825;

    static {
        int[] iArr = new int[FrameParser$State.values().length];
        try {
            iArr[FrameParser$State.HEADER0.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[FrameParser$State.LENGTH.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[FrameParser$State.MASK_KEY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[FrameParser$State.BODY.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f12825 = iArr;
    }
}
