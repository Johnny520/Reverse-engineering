package kotlin.reflect.jvm.internal.impl.renderer;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.renderer.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC4740 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final /* synthetic */ int[] f13831;

    static {
        int[] iArr = new int[PropertyAccessorRenderingPolicy.values().length];
        try {
            iArr[PropertyAccessorRenderingPolicy.PRETTY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PropertyAccessorRenderingPolicy.DEBUG.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[PropertyAccessorRenderingPolicy.NONE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f13831 = iArr;
    }
}
