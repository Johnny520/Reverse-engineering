package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.List;
import kotlin.collections.AbstractC5176;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5533;
import p068.InterfaceC7372;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C5651 implements InterfaceC7372 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final AnnotatedCallableKind f14383;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C5655 f14384;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final InterfaceC5533 f14385;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f14386;

    public /* synthetic */ C5651(C5655 c5655, InterfaceC5533 interfaceC5533, AnnotatedCallableKind annotatedCallableKind, int i) {
        this.f14386 = i;
        this.f14384 = c5655;
        this.f14385 = interfaceC5533;
        this.f14383 = annotatedCallableKind;
    }

    @Override // p068.InterfaceC7372
    public final Object invoke() {
        List listM9356;
        int i = this.f14386;
        AnnotatedCallableKind annotatedCallableKind = this.f14383;
        InterfaceC5533 interfaceC5533 = this.f14385;
        C5655 c5655 = this.f14384;
        switch (i) {
            case 0:
                C5656 c5656 = c5655.f14401;
                AbstractC5640 abstractC5640M10119 = c5655.m10119(c5656.f14405);
                listM9356 = abstractC5640M10119 != null ? AbstractC5176.m9356(c5656.f14407.f14433.mo2984(abstractC5640M10119, interfaceC5533, annotatedCallableKind)) : null;
                if (listM9356 == null) {
                }
                break;
            default:
                C5656 c56562 = c5655.f14401;
                AbstractC5640 abstractC5640M101192 = c5655.m10119(c56562.f14405);
                listM9356 = abstractC5640M101192 != null ? c56562.f14407.f14433.mo2967(abstractC5640M101192, interfaceC5533, annotatedCallableKind) : null;
                if (listM9356 == null) {
                }
                break;
        }
        return EmptyList.INSTANCE;
    }
}
