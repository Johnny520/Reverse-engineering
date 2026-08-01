package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.collections.AbstractC5176;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$ValueParameter;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5533;
import p068.InterfaceC7372;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C5654 implements InterfaceC7372 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final AnnotatedCallableKind f14393;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final InterfaceC5533 f14394;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final int f14395;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final ProtoBuf$ValueParameter f14396;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C5655 f14397;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final AbstractC5640 f14398;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f14399;

    public /* synthetic */ C5654(C5655 c5655, AbstractC5640 abstractC5640, InterfaceC5533 interfaceC5533, AnnotatedCallableKind annotatedCallableKind, int i, ProtoBuf$ValueParameter protoBuf$ValueParameter, int i2) {
        this.f14399 = i2;
        this.f14397 = c5655;
        this.f14398 = abstractC5640;
        this.f14394 = interfaceC5533;
        this.f14393 = annotatedCallableKind;
        this.f14395 = i;
        this.f14396 = protoBuf$ValueParameter;
    }

    @Override // p068.InterfaceC7372
    public final Object invoke() {
        int i = this.f14399;
        C5655 c5655 = this.f14397;
        switch (i) {
            case 0:
                return AbstractC5176.m9356(c5655.f14401.f14407.f14433.mo2982(this.f14398, this.f14394, this.f14393, this.f14395, this.f14396));
            default:
                return AbstractC5176.m9356(c5655.f14401.f14407.f14433.mo2980(this.f14398, this.f14394, this.f14393, this.f14395, this.f14396));
        }
    }
}
