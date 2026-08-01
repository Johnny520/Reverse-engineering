package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property;
import kotlin.reflect.jvm.internal.impl.resolve.constants.AbstractC5600;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.C5625;
import kotlin.reflect.jvm.internal.impl.storage.C5675;
import kotlin.reflect.jvm.internal.impl.storage.C5677;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5714;
import p068.InterfaceC7372;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C5659 implements InterfaceC7372 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final C5625 f14422;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C5655 f14423;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final ProtoBuf$Property f14424;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f14425;

    public /* synthetic */ C5659(C5655 c5655, ProtoBuf$Property protoBuf$Property, C5625 c5625, int i) {
        this.f14425 = i;
        this.f14423 = c5655;
        this.f14424 = protoBuf$Property;
        this.f14422 = c5625;
    }

    @Override // p068.InterfaceC7372
    public final Object invoke() {
        int i = this.f14425;
        C5625 c5625 = this.f14422;
        ProtoBuf$Property protoBuf$Property = this.f14424;
        C5655 c5655 = this.f14423;
        switch (i) {
            case 0:
                C5677 c5677 = c5655.f14401.f14407.f14437;
                C5659 c5659 = new C5659(c5655, protoBuf$Property, c5625, 2);
                c5677.getClass();
                return new C5675(c5677, c5659);
            case 1:
                C5677 c56772 = c5655.f14401.f14407.f14437;
                C5659 c56592 = new C5659(c5655, protoBuf$Property, c5625, 3);
                c56772.getClass();
                return new C5675(c56772, c56592);
            case 2:
                C5656 c5656 = c5655.f14401;
                AbstractC5640 abstractC5640M10119 = c5655.m10119(c5656.f14405);
                abstractC5640M10119.getClass();
                InterfaceC5648 interfaceC5648 = c5656.f14407.f14433;
                AbstractC5714 returnType = c5625.getReturnType();
                returnType.getClass();
                return (AbstractC5600) interfaceC5648.mo9808(abstractC5640M10119, protoBuf$Property, returnType);
            default:
                C5656 c56562 = c5655.f14401;
                AbstractC5640 abstractC5640M101192 = c5655.m10119(c56562.f14405);
                abstractC5640M101192.getClass();
                InterfaceC5648 interfaceC56482 = c56562.f14407.f14433;
                AbstractC5714 returnType2 = c5625.getReturnType();
                returnType2.getClass();
                return (AbstractC5600) interfaceC56482.mo9810(abstractC5640M101192, protoBuf$Property, returnType2);
        }
    }
}
