package kotlin.reflect.jvm.internal.impl.renderer;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.renderer.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC4741 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final /* synthetic */ int[] f13835;

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
        f13835 = iArr;
    }
}
