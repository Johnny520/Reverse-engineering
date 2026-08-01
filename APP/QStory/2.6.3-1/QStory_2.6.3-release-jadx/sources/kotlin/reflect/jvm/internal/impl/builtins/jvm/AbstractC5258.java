package kotlin.reflect.jvm.internal.impl.builtins.jvm;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.builtins.jvm.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC5258 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final /* synthetic */ int[] f13388;

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
        f13388 = iArr;
    }
}
