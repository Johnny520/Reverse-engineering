package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC4630 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final /* synthetic */ int[] f13541;

    static {
        int[] iArr = new int[AnnotatedCallableKind.values().length];
        try {
            iArr[AnnotatedCallableKind.PROPERTY_GETTER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[AnnotatedCallableKind.PROPERTY_SETTER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[AnnotatedCallableKind.PROPERTY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f13541 = iArr;
    }
}
