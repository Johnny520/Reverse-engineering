package kotlin.reflect.jvm.internal;

import kotlin.reflect.jvm.internal.impl.types.Variance;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言子哲苏楪世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC5842 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final /* synthetic */ int[] f14784;

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
        f14784 = iArr;
    }
}
