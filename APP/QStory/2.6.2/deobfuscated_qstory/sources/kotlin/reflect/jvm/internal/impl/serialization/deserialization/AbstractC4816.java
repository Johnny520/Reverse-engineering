package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC4816 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final /* synthetic */ int[] f14030;

    static {
        int[] iArr = new int[AnnotatedCallableKind.values().length];
        try {
            iArr[AnnotatedCallableKind.PROPERTY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[AnnotatedCallableKind.PROPERTY_GETTER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[AnnotatedCallableKind.PROPERTY_SETTER.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f14030 = iArr;
    }
}
