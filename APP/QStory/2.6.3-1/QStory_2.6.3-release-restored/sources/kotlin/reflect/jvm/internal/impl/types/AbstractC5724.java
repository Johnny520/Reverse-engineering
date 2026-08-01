package kotlin.reflect.jvm.internal.impl.types;

import kotlin.reflect.jvm.internal.impl.types.model.TypeVariance;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.types.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC5724 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final /* synthetic */ int[] f14557;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final /* synthetic */ int[] f14558;

    static {
        int[] iArr = new int[TypeVariance.values().length];
        try {
            iArr[TypeVariance.INV.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TypeVariance.OUT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[TypeVariance.f309IN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f14558 = iArr;
        int[] iArr2 = new int[TypeCheckerState$LowerCapturedTypePolicy.values().length];
        try {
            iArr2[TypeCheckerState$LowerCapturedTypePolicy.CHECK_ONLY_LOWER.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[TypeCheckerState$LowerCapturedTypePolicy.CHECK_SUBTYPE_AND_LOWER.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[TypeCheckerState$LowerCapturedTypePolicy.SKIP_LOWER.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        f14557 = iArr2;
    }
}
