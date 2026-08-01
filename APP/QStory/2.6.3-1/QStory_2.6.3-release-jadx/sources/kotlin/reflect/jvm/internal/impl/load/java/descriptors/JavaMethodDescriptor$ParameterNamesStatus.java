package kotlin.reflect.jvm.internal.impl.load.java.descriptors;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
enum JavaMethodDescriptor$ParameterNamesStatus {
    NON_STABLE_DECLARED(false, false),
    STABLE_DECLARED(true, false),
    NON_STABLE_SYNTHESIZED(false, true),
    STABLE_SYNTHESIZED(true, true);

    public final boolean isStable;
    public final boolean isSynthesized;

    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        throw new IllegalStateException("@NotNull method kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor$ParameterNamesStatus.get must not return null");
    }

    JavaMethodDescriptor$ParameterNamesStatus(boolean z, boolean z2) {
        this.isStable = z;
        this.isSynthesized = z2;
    }

    public static JavaMethodDescriptor$ParameterNamesStatus get(boolean z, boolean z2) {
        JavaMethodDescriptor$ParameterNamesStatus javaMethodDescriptor$ParameterNamesStatus = z ? z2 ? STABLE_SYNTHESIZED : STABLE_DECLARED : z2 ? NON_STABLE_SYNTHESIZED : NON_STABLE_DECLARED;
        if (javaMethodDescriptor$ParameterNamesStatus == null) {
            $$$reportNull$$$0(0);
        }
        return javaMethodDescriptor$ParameterNamesStatus;
    }
}
