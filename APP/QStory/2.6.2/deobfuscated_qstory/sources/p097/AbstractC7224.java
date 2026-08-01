package p097;

import kotlin.reflect.jvm.internal.impl.types.Variance;

/* JADX INFO: renamed from: 飘花落叶言世苏子兰楪哲.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC7224 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final /* synthetic */ int[] f19273;

    static {
        int[] iArr = new int[Variance.values().length];
        try {
            iArr[Variance.INVARIANT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[Variance.IN_VARIANCE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[Variance.OUT_VARIANCE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f19273 = iArr;
    }
}
