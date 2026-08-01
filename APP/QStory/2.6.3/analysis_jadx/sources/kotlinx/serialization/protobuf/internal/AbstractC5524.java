package kotlinx.serialization.protobuf.internal;

import kotlinx.serialization.protobuf.ProtoIntegerType;

/* JADX INFO: renamed from: kotlinx.serialization.protobuf.internal.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC5524 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final /* synthetic */ int[] f15266;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final /* synthetic */ int[] f15267;

    static {
        int[] iArr = new int[ProtoWireType.values().length];
        try {
            iArr[ProtoWireType.VARINT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ProtoWireType.i64.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ProtoWireType.SIZE_DELIMITED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ProtoWireType.i32.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f15267 = iArr;
        int[] iArr2 = new int[ProtoIntegerType.values().length];
        try {
            iArr2[ProtoIntegerType.DEFAULT.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[ProtoIntegerType.SIGNED.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[ProtoIntegerType.FIXED.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        f15266 = iArr2;
    }
}
