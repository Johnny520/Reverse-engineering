package kotlin.reflect.jvm.internal.impl.renderer;

import kotlin.enums.AbstractC5196;
import kotlin.enums.InterfaceC5197;
import kotlin.jvm.internal.AbstractC5217;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class AnnotationArgumentsRenderingPolicy {
    private static final /* synthetic */ InterfaceC5197 $ENTRIES;
    private static final /* synthetic */ AnnotationArgumentsRenderingPolicy[] $VALUES;
    private final boolean includeAnnotationArguments;
    private final boolean includeEmptyAnnotationArguments;
    public static final AnnotationArgumentsRenderingPolicy NO_ARGUMENTS = new AnnotationArgumentsRenderingPolicy("NO_ARGUMENTS", 0, false, false, 3, null);
    public static final AnnotationArgumentsRenderingPolicy UNLESS_EMPTY = new AnnotationArgumentsRenderingPolicy("UNLESS_EMPTY", 1, true, false, 2, null);
    public static final AnnotationArgumentsRenderingPolicy ALWAYS_PARENTHESIZED = new AnnotationArgumentsRenderingPolicy("ALWAYS_PARENTHESIZED", 2, true, true);

    private static final /* synthetic */ AnnotationArgumentsRenderingPolicy[] $values() {
        return new AnnotationArgumentsRenderingPolicy[]{NO_ARGUMENTS, UNLESS_EMPTY, ALWAYS_PARENTHESIZED};
    }

    static {
        AnnotationArgumentsRenderingPolicy[] annotationArgumentsRenderingPolicyArr$values = $values();
        $VALUES = annotationArgumentsRenderingPolicyArr$values;
        $ENTRIES = AbstractC5196.m9425(annotationArgumentsRenderingPolicyArr$values);
    }

    public /* synthetic */ AnnotationArgumentsRenderingPolicy(String str, int i, boolean z, boolean z2, int i2, AbstractC5217 abstractC5217) {
        this(str, i, (i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? false : z2);
    }

    public static AnnotationArgumentsRenderingPolicy valueOf(String str) {
        return (AnnotationArgumentsRenderingPolicy) Enum.valueOf(AnnotationArgumentsRenderingPolicy.class, str);
    }

    public static AnnotationArgumentsRenderingPolicy[] values() {
        return (AnnotationArgumentsRenderingPolicy[]) $VALUES.clone();
    }

    public final boolean getIncludeAnnotationArguments() {
        return this.includeAnnotationArguments;
    }

    public final boolean getIncludeEmptyAnnotationArguments() {
        return this.includeEmptyAnnotationArguments;
    }

    private AnnotationArgumentsRenderingPolicy(String str, int i, boolean z, boolean z2) {
        this.includeAnnotationArguments = z;
        this.includeEmptyAnnotationArguments = z2;
    }
}
