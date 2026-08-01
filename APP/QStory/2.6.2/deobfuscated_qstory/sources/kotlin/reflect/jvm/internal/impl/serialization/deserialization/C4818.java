package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.List;
import kotlin.collections.AbstractC4343;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4700;
import p052.InterfaceC6542;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C4818 implements InterfaceC6542 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final AnnotatedCallableKind f14034;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C4822 f14035;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final InterfaceC4700 f14036;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f14037;

    public /* synthetic */ C4818(C4822 c4822, InterfaceC4700 interfaceC4700, AnnotatedCallableKind annotatedCallableKind, int i) {
        this.f14037 = i;
        this.f14035 = c4822;
        this.f14036 = interfaceC4700;
        this.f14034 = annotatedCallableKind;
    }

    @Override // p052.InterfaceC6542
    public final Object invoke() {
        List listM8804;
        int i = this.f14037;
        AnnotatedCallableKind annotatedCallableKind = this.f14034;
        InterfaceC4700 interfaceC4700 = this.f14036;
        C4822 c4822 = this.f14035;
        switch (i) {
            case 0:
                C4823 c4823 = c4822.f14052;
                AbstractC4807 abstractC4807M9570 = c4822.m9570(c4823.f14056);
                listM8804 = abstractC4807M9570 != null ? AbstractC4343.m8804(c4823.f14058.f14084.mo2414(abstractC4807M9570, interfaceC4700, annotatedCallableKind)) : null;
                if (listM8804 == null) {
                }
                break;
            default:
                C4823 c48232 = c4822.f14052;
                AbstractC4807 abstractC4807M95702 = c4822.m9570(c48232.f14056);
                listM8804 = abstractC4807M95702 != null ? c48232.f14058.f14084.mo2397(abstractC4807M95702, interfaceC4700, annotatedCallableKind) : null;
                if (listM8804 == null) {
                }
                break;
        }
        return EmptyList.INSTANCE;
    }
}
