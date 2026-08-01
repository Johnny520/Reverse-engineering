package androidx.annotation;

/* JADX INFO: compiled from: Dimension.kt */
/* JADX INFO: loaded from: classes2.dex */
@java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.PARAMETER, java.lang.annotation.ElementType.LOCAL_VARIABLE, java.lang.annotation.ElementType.ANNOTATION_TYPE})
@kotlin.annotation.Target(allowedTargets = {kotlin.annotation.AnnotationTarget.FUNCTION, kotlin.annotation.AnnotationTarget.PROPERTY_GETTER, kotlin.annotation.AnnotationTarget.PROPERTY_SETTER, kotlin.annotation.AnnotationTarget.VALUE_PARAMETER, kotlin.annotation.AnnotationTarget.FIELD, kotlin.annotation.AnnotationTarget.LOCAL_VARIABLE, kotlin.annotation.AnnotationTarget.ANNOTATION_CLASS})
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
@kotlin.annotation.Retention(kotlin.annotation.AnnotationRetention.BINARY)
@kotlin.annotation.MustBeDocumented
@kotlin.Metadata(m114d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\u0002\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\n\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003R\u000f\u0010\u0002\u001a\u00020\u0003¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0004¨\u0006\u0006"}, m115d2 = {"Landroidx/annotation/Dimension;", "", "unit", "", "()I", "Companion", "annotation"}, m116k = 1, m117mv = {1, 7, 0}, m119xi = 48)
@java.lang.annotation.Documented
public @interface Dimension {
    public static final androidx.annotation.Dimension.Companion Companion = null;

    /* JADX INFO: renamed from: DP */
    public static final int f0DP = 0;

    /* JADX INFO: renamed from: PX */
    public static final int f1PX = 1;

    /* JADX INFO: renamed from: SP */
    public static final int f2SP = 2;

    /* JADX INFO: compiled from: Dimension.kt */
    @kotlin.Metadata(m114d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m115d2 = {"Landroidx/annotation/Dimension$Companion;", "", "()V", "DP", "", "PX", "SP", "annotation"}, m116k = 1, m117mv = {1, 7, 0}, m119xi = 48)
    public static final class Companion {
        static final /* synthetic */ androidx.annotation.Dimension.Companion $$INSTANCE = null;

        /* JADX INFO: renamed from: DP */
        public static final int f3DP = 0;

        /* JADX INFO: renamed from: PX */
        public static final int f4PX = 1;

        /* JADX INFO: renamed from: SP */
        public static final int f5SP = 2;

        static {
                androidx.annotation.Dimension$Companion r0 = new androidx.annotation.Dimension$Companion
                r0.<init>()
                androidx.annotation.Dimension.Companion.$$INSTANCE = r0
                return
        }

        private Companion() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    static {
            androidx.annotation.Dimension$Companion r0 = androidx.annotation.Dimension.Companion.$$INSTANCE
            androidx.annotation.Dimension.Companion = r0
            return
    }

    int unit() default 1;
}
