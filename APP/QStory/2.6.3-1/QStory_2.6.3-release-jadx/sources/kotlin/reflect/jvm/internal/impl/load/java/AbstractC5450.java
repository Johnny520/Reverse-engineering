package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.AbstractC5171;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier;
import kotlin.reflect.jvm.internal.impl.name.C5519;
import p050.AbstractC7176;
import p089.C7760;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.java.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5450 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final LinkedHashMap f13864;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final Map f13865;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final List f13866;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final List f13867;

    static {
        AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType = AnnotationQualifierApplicabilityType.FIELD;
        AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType2 = AnnotationQualifierApplicabilityType.METHOD_RETURN_TYPE;
        AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType3 = AnnotationQualifierApplicabilityType.VALUE_PARAMETER;
        List listM12490 = AbstractC7176.m12490(annotationQualifierApplicabilityType, annotationQualifierApplicabilityType2, annotationQualifierApplicabilityType3, AnnotationQualifierApplicabilityType.TYPE_PARAMETER_BOUNDS, AnnotationQualifierApplicabilityType.TYPE_USE);
        f13867 = listM12490;
        List listM12487 = AbstractC7176.m12487(annotationQualifierApplicabilityType3);
        f13866 = listM12487;
        C5519 c5519 = AbstractC5448.f13849;
        NullabilityQualifier nullabilityQualifier = NullabilityQualifier.NOT_NULL;
        Map mapM9333 = AbstractC5171.m9333(new Pair(c5519, new C5458(new C7760(nullabilityQualifier, false), listM12490, false, true, true)), new Pair(AbstractC5448.f13848, new C5458(new C7760(nullabilityQualifier, false), listM12490, false, true, true)), new Pair(AbstractC5448.f13847, new C5458(new C7760(NullabilityQualifier.FORCE_FLEXIBILITY, false), listM12490, 4)));
        f13865 = mapM9333;
        Map mapM93332 = AbstractC5171.m9333(new Pair(AbstractC5448.f13854, new C5458(new C7760(nullabilityQualifier, false), listM12487, 28)), new Pair(AbstractC5448.f13858, new C5458(new C7760(NullabilityQualifier.NULLABLE, false), listM12487, 28)));
        LinkedHashMap linkedHashMap = new LinkedHashMap(mapM9333);
        linkedHashMap.putAll(mapM93332);
        f13864 = linkedHashMap;
    }
}
