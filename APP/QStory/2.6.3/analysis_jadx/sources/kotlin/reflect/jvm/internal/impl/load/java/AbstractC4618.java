package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.AbstractC4339;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier;
import kotlin.reflect.jvm.internal.impl.name.C4687;
import p034.AbstractC6347;
import p073.C6931;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.java.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4618 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final LinkedHashMap f13519;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final Map f13520;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final List f13521;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final List f13522;

    static {
        AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType = AnnotationQualifierApplicabilityType.FIELD;
        AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType2 = AnnotationQualifierApplicabilityType.METHOD_RETURN_TYPE;
        AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType3 = AnnotationQualifierApplicabilityType.VALUE_PARAMETER;
        List listM11931 = AbstractC6347.m11931(annotationQualifierApplicabilityType, annotationQualifierApplicabilityType2, annotationQualifierApplicabilityType3, AnnotationQualifierApplicabilityType.TYPE_PARAMETER_BOUNDS, AnnotationQualifierApplicabilityType.TYPE_USE);
        f13522 = listM11931;
        List listM11928 = AbstractC6347.m11928(annotationQualifierApplicabilityType3);
        f13521 = listM11928;
        C4687 c4687 = AbstractC4616.f13504;
        NullabilityQualifier nullabilityQualifier = NullabilityQualifier.NOT_NULL;
        Map mapM8774 = AbstractC4339.m8774(new Pair(c4687, new C4626(new C6931(nullabilityQualifier, false), listM11931, false, true, true)), new Pair(AbstractC4616.f13503, new C4626(new C6931(nullabilityQualifier, false), listM11931, false, true, true)), new Pair(AbstractC4616.f13502, new C4626(new C6931(NullabilityQualifier.FORCE_FLEXIBILITY, false), listM11931, 4)));
        f13520 = mapM8774;
        Map mapM87742 = AbstractC4339.m8774(new Pair(AbstractC4616.f13509, new C4626(new C6931(nullabilityQualifier, false), listM11928, 28)), new Pair(AbstractC4616.f13513, new C4626(new C6931(NullabilityQualifier.NULLABLE, false), listM11928, 28)));
        LinkedHashMap linkedHashMap = new LinkedHashMap(mapM8774);
        linkedHashMap.putAll(mapM87742);
        f13519 = linkedHashMap;
    }
}
