package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.collections.AbstractC4344;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$ValueParameter;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4701;
import p052.InterfaceC6543;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C4822 implements InterfaceC6543 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final AnnotatedCallableKind f14048;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final InterfaceC4701 f14049;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final int f14050;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final ProtoBuf$ValueParameter f14051;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C4823 f14052;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final AbstractC4808 f14053;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f14054;

    public /* synthetic */ C4822(C4823 c4823, AbstractC4808 abstractC4808, InterfaceC4701 interfaceC4701, AnnotatedCallableKind annotatedCallableKind, int i, ProtoBuf$ValueParameter protoBuf$ValueParameter, int i2) {
        this.f14054 = i2;
        this.f14052 = c4823;
        this.f14053 = abstractC4808;
        this.f14049 = interfaceC4701;
        this.f14048 = annotatedCallableKind;
        this.f14050 = i;
        this.f14051 = protoBuf$ValueParameter;
    }

    @Override // p052.InterfaceC6543
    public final Object invoke() {
        int i = this.f14054;
        C4823 c4823 = this.f14052;
        switch (i) {
            case 0:
                return AbstractC4344.m8797(c4823.f14056.f14062.f14088.mo2422(this.f14053, this.f14049, this.f14048, this.f14050, this.f14051));
            default:
                return AbstractC4344.m8797(c4823.f14056.f14062.f14088.mo2420(this.f14053, this.f14049, this.f14048, this.f14050, this.f14051));
        }
    }
}
