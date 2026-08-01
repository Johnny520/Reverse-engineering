package kotlin.reflect.jvm.internal.impl.builtins.jvm;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.builtins.jvm.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC4425 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final /* synthetic */ int[] f13039;

    static {
        int[] iArr = new int[JvmBuiltIns$Kind.values().length];
        try {
            iArr[JvmBuiltIns$Kind.FROM_DEPENDENCIES.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[JvmBuiltIns$Kind.FROM_CLASS_LOADER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[JvmBuiltIns$Kind.FALLBACK.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f13039 = iArr;
    }
}
