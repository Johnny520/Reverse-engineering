package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC4817 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final /* synthetic */ int[] f14034;

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
        f14034 = iArr;
    }
}
