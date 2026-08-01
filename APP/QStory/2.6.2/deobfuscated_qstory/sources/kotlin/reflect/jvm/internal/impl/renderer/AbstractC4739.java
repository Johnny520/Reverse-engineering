package kotlin.reflect.jvm.internal.impl.renderer;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.renderer.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC4739 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final /* synthetic */ int[] f13829;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final /* synthetic */ int[] f13830;

    static {
        int[] iArr = new int[RenderingFormat.values().length];
        try {
            iArr[RenderingFormat.PLAIN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[RenderingFormat.HTML.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f13830 = iArr;
        int[] iArr2 = new int[ParameterNameRenderingPolicy.values().length];
        try {
            iArr2[ParameterNameRenderingPolicy.ALL.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[ParameterNameRenderingPolicy.ONLY_NON_SYNTHESIZED.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[ParameterNameRenderingPolicy.NONE.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        f13829 = iArr2;
    }
}
