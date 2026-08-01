package kotlinx.serialization.protobuf.internal;

/* JADX INFO: renamed from: kotlinx.serialization.protobuf.internal.飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC5521 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final /* synthetic */ int[] f15264;

    static {
        int[] iArr = new int[ProtobufTaggedEncoder$NullableMode.values().length];
        try {
            iArr[ProtobufTaggedEncoder$NullableMode.OPTIONAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ProtobufTaggedEncoder$NullableMode.COLLECTION.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ProtobufTaggedEncoder$NullableMode.LIST_ELEMENT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ProtobufTaggedEncoder$NullableMode.NOT_NULL.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f15264 = iArr;
    }
}
