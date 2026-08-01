package p393;

import java.util.function.IntUnaryOperator;

/* JADX INFO: renamed from: 飘花落叶言苏子楪兰哲世.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C9818 implements IntUnaryOperator {
    @Override // java.util.function.IntUnaryOperator
    public final int applyAsInt(int i) {
        if (i <= Integer.MAX_VALUE) {
            return i;
        }
        throw new IllegalArgumentException(String.format("Request %,d exceeds maximum %,d", Integer.valueOf(i), Integer.MAX_VALUE));
    }
}
