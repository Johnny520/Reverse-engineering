package kotlinx.serialization.protobuf.internal;

import kotlinx.serialization.protobuf.ProtoIntegerType;

/* JADX INFO: renamed from: kotlinx.serialization.protobuf.internal.飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC5522 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final /* synthetic */ int[] f15265;

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
        f15265 = iArr;
    }
}
