package kotlin.reflect.jvm.internal.impl.types;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.types.飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC4914 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final /* synthetic */ int[] f14238;

    static {
        int[] iArr = new int[TypeSubstitutor$VarianceConflictType.values().length];
        f14238 = iArr;
        try {
            iArr[TypeSubstitutor$VarianceConflictType.OUT_IN_IN_POSITION.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f14238[TypeSubstitutor$VarianceConflictType.IN_IN_OUT_POSITION.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f14238[TypeSubstitutor$VarianceConflictType.NO_CONFLICT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
