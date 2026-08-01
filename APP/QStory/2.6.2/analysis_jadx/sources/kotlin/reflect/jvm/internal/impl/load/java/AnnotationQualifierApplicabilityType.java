package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.enums.AbstractC4363;
import kotlin.enums.InterfaceC4364;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class AnnotationQualifierApplicabilityType {
    private static final /* synthetic */ InterfaceC4364 $ENTRIES;
    private static final /* synthetic */ AnnotationQualifierApplicabilityType[] $VALUES;
    private final String javaTarget;
    public static final AnnotationQualifierApplicabilityType METHOD_RETURN_TYPE = new AnnotationQualifierApplicabilityType("METHOD_RETURN_TYPE", 0, "METHOD");
    public static final AnnotationQualifierApplicabilityType VALUE_PARAMETER = new AnnotationQualifierApplicabilityType("VALUE_PARAMETER", 1, "PARAMETER");
    public static final AnnotationQualifierApplicabilityType FIELD = new AnnotationQualifierApplicabilityType("FIELD", 2, "FIELD");
    public static final AnnotationQualifierApplicabilityType TYPE_USE = new AnnotationQualifierApplicabilityType("TYPE_USE", 3, "TYPE_USE");
    public static final AnnotationQualifierApplicabilityType TYPE_PARAMETER_BOUNDS = new AnnotationQualifierApplicabilityType("TYPE_PARAMETER_BOUNDS", 4, "TYPE_USE");
    public static final AnnotationQualifierApplicabilityType TYPE_PARAMETER = new AnnotationQualifierApplicabilityType("TYPE_PARAMETER", 5, "TYPE_PARAMETER");

    private static final /* synthetic */ AnnotationQualifierApplicabilityType[] $values() {
        return new AnnotationQualifierApplicabilityType[]{METHOD_RETURN_TYPE, VALUE_PARAMETER, FIELD, TYPE_USE, TYPE_PARAMETER_BOUNDS, TYPE_PARAMETER};
    }

    static {
        AnnotationQualifierApplicabilityType[] annotationQualifierApplicabilityTypeArr$values = $values();
        $VALUES = annotationQualifierApplicabilityTypeArr$values;
        $ENTRIES = AbstractC4363.m8876(annotationQualifierApplicabilityTypeArr$values);
    }

    private AnnotationQualifierApplicabilityType(String str, int i, String str2) {
        this.javaTarget = str2;
    }

    public static AnnotationQualifierApplicabilityType valueOf(String str) {
        return (AnnotationQualifierApplicabilityType) Enum.valueOf(AnnotationQualifierApplicabilityType.class, str);
    }

    public static AnnotationQualifierApplicabilityType[] values() {
        return (AnnotationQualifierApplicabilityType[]) $VALUES.clone();
    }

    public final String getJavaTarget() {
        return this.javaTarget;
    }
}
