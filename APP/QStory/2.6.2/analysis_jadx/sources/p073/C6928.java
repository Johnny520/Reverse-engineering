package p073;

import java.util.ArrayList;
import kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType;
import kotlin.reflect.jvm.internal.impl.load.java.C4619;
import kotlin.reflect.jvm.internal.impl.load.java.C4625;
import p052.InterfaceC6542;

/* JADX INFO: renamed from: 飘花落叶言世楪哲子苏兰.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C6928 implements InterfaceC6542 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final ArrayList f18490;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final int f18491;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C6937 f18492;

    public C6928(C6937 c6937, ArrayList arrayList, int i) {
        this.f18492 = c6937;
        this.f18490 = arrayList;
        this.f18491 = i;
    }

    @Override // p052.InterfaceC6542
    public final Object invoke() {
        C6927 c6927 = (C6927) this.f18490.get(this.f18491);
        boolean z = c6927.f18487 == null;
        AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType = this.f18492.f18511;
        boolean z2 = annotationQualifierApplicabilityType == AnnotationQualifierApplicabilityType.TYPE_PARAMETER_BOUNDS;
        if (!z && !z2) {
            annotationQualifierApplicabilityType = AnnotationQualifierApplicabilityType.TYPE_USE;
        }
        C4619 c4619 = c6927.f18488;
        if (c4619 != null) {
            return (C4625) c4619.f13523.get(annotationQualifierApplicabilityType);
        }
        return null;
    }
}
