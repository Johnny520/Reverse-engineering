package kotlin.reflect.jvm.internal.impl.renderer;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.renderer.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC4740 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final /* synthetic */ int[] f13833;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final /* synthetic */ int[] f13834;

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
        f13834 = iArr;
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
        f13833 = iArr2;
    }
}
