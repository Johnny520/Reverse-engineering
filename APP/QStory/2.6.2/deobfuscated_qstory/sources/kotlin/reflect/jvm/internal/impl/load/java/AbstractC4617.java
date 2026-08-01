package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.AbstractC4338;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier;
import kotlin.reflect.jvm.internal.impl.name.C4686;
import p073.C6930;
import p253.AbstractC8189;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.java.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4617 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final LinkedHashMap f13515;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final Map f13516;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final List f13517;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final List f13518;

    static {
        AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType = AnnotationQualifierApplicabilityType.FIELD;
        AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType2 = AnnotationQualifierApplicabilityType.METHOD_RETURN_TYPE;
        AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType3 = AnnotationQualifierApplicabilityType.VALUE_PARAMETER;
        List listM13659 = AbstractC8189.m13659(annotationQualifierApplicabilityType, annotationQualifierApplicabilityType2, annotationQualifierApplicabilityType3, AnnotationQualifierApplicabilityType.TYPE_PARAMETER_BOUNDS, AnnotationQualifierApplicabilityType.TYPE_USE);
        f13518 = listM13659;
        List listM13660 = AbstractC8189.m13660(annotationQualifierApplicabilityType3);
        f13517 = listM13660;
        C4686 c4686 = AbstractC4615.f13500;
        NullabilityQualifier nullabilityQualifier = NullabilityQualifier.NOT_NULL;
        Map mapM8777 = AbstractC4338.m8777(new Pair(c4686, new C4625(new C6930(nullabilityQualifier, false), listM13659, false, true, true)), new Pair(AbstractC4615.f13499, new C4625(new C6930(nullabilityQualifier, false), listM13659, false, true, true)), new Pair(AbstractC4615.f13498, new C4625(new C6930(NullabilityQualifier.FORCE_FLEXIBILITY, false), listM13659, 4)));
        f13516 = mapM8777;
        Map mapM87772 = AbstractC4338.m8777(new Pair(AbstractC4615.f13505, new C4625(new C6930(nullabilityQualifier, false), listM13660, 28)), new Pair(AbstractC4615.f13509, new C4625(new C6930(NullabilityQualifier.NULLABLE, false), listM13660, 28)));
        LinkedHashMap linkedHashMap = new LinkedHashMap(mapM8777);
        linkedHashMap.putAll(mapM87772);
        f13515 = linkedHashMap;
    }
}
