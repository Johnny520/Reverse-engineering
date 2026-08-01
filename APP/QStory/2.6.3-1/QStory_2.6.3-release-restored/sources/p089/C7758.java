package p089;

import java.util.ArrayList;
import kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType;
import kotlin.reflect.jvm.internal.impl.load.java.C5452;
import kotlin.reflect.jvm.internal.impl.load.java.C5458;
import p068.InterfaceC7372;

/* JADX INFO: renamed from: 飘花落叶言世楪哲子苏兰.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C7758 implements InterfaceC7372 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final ArrayList f18830;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final int f18831;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C7767 f18832;

    public C7758(C7767 c7767, ArrayList arrayList, int i) {
        this.f18832 = c7767;
        this.f18830 = arrayList;
        this.f18831 = i;
    }

    @Override // p068.InterfaceC7372
    public final Object invoke() {
        C7757 c7757 = (C7757) this.f18830.get(this.f18831);
        boolean z = c7757.f18827 == null;
        AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType = this.f18832.f18851;
        boolean z2 = annotationQualifierApplicabilityType == AnnotationQualifierApplicabilityType.TYPE_PARAMETER_BOUNDS;
        if (!z && !z2) {
            annotationQualifierApplicabilityType = AnnotationQualifierApplicabilityType.TYPE_USE;
        }
        C5452 c5452 = c7757.f18828;
        if (c5452 != null) {
            return (C5458) c5452.f13872.get(annotationQualifierApplicabilityType);
        }
        return null;
    }
}
