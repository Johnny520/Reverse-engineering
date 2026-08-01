package p073;

import java.util.ArrayList;
import kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType;
import kotlin.reflect.jvm.internal.impl.load.java.C4620;
import kotlin.reflect.jvm.internal.impl.load.java.C4626;
import p052.InterfaceC6543;

/* JADX INFO: renamed from: 飘花落叶言世楪哲子苏兰.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C6929 implements InterfaceC6543 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final ArrayList f18485;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final int f18486;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C6938 f18487;

    public C6929(C6938 c6938, ArrayList arrayList, int i) {
        this.f18487 = c6938;
        this.f18485 = arrayList;
        this.f18486 = i;
    }

    @Override // p052.InterfaceC6543
    public final Object invoke() {
        C6928 c6928 = (C6928) this.f18485.get(this.f18486);
        boolean z = c6928.f18482 == null;
        AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType = this.f18487.f18506;
        boolean z2 = annotationQualifierApplicabilityType == AnnotationQualifierApplicabilityType.TYPE_PARAMETER_BOUNDS;
        if (!z && !z2) {
            annotationQualifierApplicabilityType = AnnotationQualifierApplicabilityType.TYPE_USE;
        }
        C4620 c4620 = c6928.f18483;
        if (c4620 != null) {
            return (C4626) c4620.f13527.get(annotationQualifierApplicabilityType);
        }
        return null;
    }
}
