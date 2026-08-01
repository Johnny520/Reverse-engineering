package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.List;
import kotlin.collections.AbstractC4344;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4701;
import p052.InterfaceC6543;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C4819 implements InterfaceC6543 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final AnnotatedCallableKind f14038;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C4823 f14039;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final InterfaceC4701 f14040;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f14041;

    public /* synthetic */ C4819(C4823 c4823, InterfaceC4701 interfaceC4701, AnnotatedCallableKind annotatedCallableKind, int i) {
        this.f14041 = i;
        this.f14039 = c4823;
        this.f14040 = interfaceC4701;
        this.f14038 = annotatedCallableKind;
    }

    @Override // p052.InterfaceC6543
    public final Object invoke() {
        List listM8797;
        int i = this.f14041;
        AnnotatedCallableKind annotatedCallableKind = this.f14038;
        InterfaceC4701 interfaceC4701 = this.f14040;
        C4823 c4823 = this.f14039;
        switch (i) {
            case 0:
                C4824 c4824 = c4823.f14056;
                AbstractC4808 abstractC4808M9560 = c4823.m9560(c4824.f14060);
                listM8797 = abstractC4808M9560 != null ? AbstractC4344.m8797(c4824.f14062.f14088.mo2424(abstractC4808M9560, interfaceC4701, annotatedCallableKind)) : null;
                if (listM8797 == null) {
                }
                break;
            default:
                C4824 c48242 = c4823.f14056;
                AbstractC4808 abstractC4808M95602 = c4823.m9560(c48242.f14060);
                listM8797 = abstractC4808M95602 != null ? c48242.f14062.f14088.mo2407(abstractC4808M95602, interfaceC4701, annotatedCallableKind) : null;
                if (listM8797 == null) {
                }
                break;
        }
        return EmptyList.INSTANCE;
    }
}
