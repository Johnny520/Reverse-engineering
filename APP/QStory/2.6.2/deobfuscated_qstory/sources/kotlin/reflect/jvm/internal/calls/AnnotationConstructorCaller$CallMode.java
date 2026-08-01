package kotlin.reflect.jvm.internal.calls;

import kotlin.Metadata;
import kotlin.enums.AbstractC4363;
import kotlin.enums.InterfaceC4364;
import net.bytebuddy.description.method.MethodDescription;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"kotlin/reflect/jvm/internal/calls/AnnotationConstructorCaller$CallMode", "", "Lkotlin/reflect/jvm/internal/calls/AnnotationConstructorCaller$CallMode;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;I)V", "CALL_BY_NAME", "POSITIONAL_CALL", "kotlin-reflection"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class AnnotationConstructorCaller$CallMode {
    private static final /* synthetic */ InterfaceC4364 $ENTRIES;
    private static final /* synthetic */ AnnotationConstructorCaller$CallMode[] $VALUES;
    public static final AnnotationConstructorCaller$CallMode CALL_BY_NAME = new AnnotationConstructorCaller$CallMode("CALL_BY_NAME", 0);
    public static final AnnotationConstructorCaller$CallMode POSITIONAL_CALL = new AnnotationConstructorCaller$CallMode("POSITIONAL_CALL", 1);

    private static final /* synthetic */ AnnotationConstructorCaller$CallMode[] $values() {
        return new AnnotationConstructorCaller$CallMode[]{CALL_BY_NAME, POSITIONAL_CALL};
    }

    static {
        AnnotationConstructorCaller$CallMode[] annotationConstructorCaller$CallModeArr$values = $values();
        $VALUES = annotationConstructorCaller$CallModeArr$values;
        $ENTRIES = AbstractC4363.m8876(annotationConstructorCaller$CallModeArr$values);
    }

    private AnnotationConstructorCaller$CallMode(String str, int i) {
    }

    public static AnnotationConstructorCaller$CallMode valueOf(String str) {
        return (AnnotationConstructorCaller$CallMode) Enum.valueOf(AnnotationConstructorCaller$CallMode.class, str);
    }

    public static AnnotationConstructorCaller$CallMode[] values() {
        return (AnnotationConstructorCaller$CallMode[]) $VALUES.clone();
    }
}
