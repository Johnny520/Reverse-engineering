package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.collections.AbstractC4343;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$ValueParameter;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4700;
import p052.InterfaceC6542;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C4821 implements InterfaceC6542 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final AnnotatedCallableKind f14044;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final InterfaceC4700 f14045;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final int f14046;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final ProtoBuf$ValueParameter f14047;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C4822 f14048;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final AbstractC4807 f14049;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f14050;

    public /* synthetic */ C4821(C4822 c4822, AbstractC4807 abstractC4807, InterfaceC4700 interfaceC4700, AnnotatedCallableKind annotatedCallableKind, int i, ProtoBuf$ValueParameter protoBuf$ValueParameter, int i2) {
        this.f14050 = i2;
        this.f14048 = c4822;
        this.f14049 = abstractC4807;
        this.f14045 = interfaceC4700;
        this.f14044 = annotatedCallableKind;
        this.f14046 = i;
        this.f14047 = protoBuf$ValueParameter;
    }

    @Override // p052.InterfaceC6542
    public final Object invoke() {
        int i = this.f14050;
        C4822 c4822 = this.f14048;
        switch (i) {
            case 0:
                return AbstractC4343.m8804(c4822.f14052.f14058.f14084.mo2412(this.f14049, this.f14045, this.f14044, this.f14046, this.f14047));
            default:
                return AbstractC4343.m8804(c4822.f14052.f14058.f14084.mo2410(this.f14049, this.f14045, this.f14044, this.f14046, this.f14047));
        }
    }
}
