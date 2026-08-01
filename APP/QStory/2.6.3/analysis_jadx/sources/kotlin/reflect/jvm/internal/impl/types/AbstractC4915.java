package kotlin.reflect.jvm.internal.impl.types;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.types.飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC4915 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final /* synthetic */ int[] f14242;

    static {
        int[] iArr = new int[TypeSubstitutor$VarianceConflictType.values().length];
        f14242 = iArr;
        try {
            iArr[TypeSubstitutor$VarianceConflictType.OUT_IN_IN_POSITION.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f14242[TypeSubstitutor$VarianceConflictType.IN_IN_OUT_POSITION.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f14242[TypeSubstitutor$VarianceConflictType.NO_CONFLICT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
