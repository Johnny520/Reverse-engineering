package kotlinx.serialization.protobuf.internal;

import kotlinx.serialization.protobuf.ProtoIntegerType;

/* JADX INFO: renamed from: kotlinx.serialization.protobuf.internal.飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC6355 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final /* synthetic */ int[] f15610;

    static {
        int[] iArr = new int[ProtoIntegerType.values().length];
        try {
            iArr[ProtoIntegerType.FIXED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ProtoIntegerType.DEFAULT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ProtoIntegerType.SIGNED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f15610 = iArr;
    }
}
