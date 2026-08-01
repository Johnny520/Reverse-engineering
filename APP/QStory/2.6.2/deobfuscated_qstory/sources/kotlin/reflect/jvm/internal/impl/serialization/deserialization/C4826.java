package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property;
import kotlin.reflect.jvm.internal.impl.resolve.constants.AbstractC4767;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.C4792;
import kotlin.reflect.jvm.internal.impl.storage.C4842;
import kotlin.reflect.jvm.internal.impl.storage.C4844;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4881;
import p052.InterfaceC6542;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C4826 implements InterfaceC6542 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final C4792 f14073;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C4822 f14074;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final ProtoBuf$Property f14075;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f14076;

    public /* synthetic */ C4826(C4822 c4822, ProtoBuf$Property protoBuf$Property, C4792 c4792, int i) {
        this.f14076 = i;
        this.f14074 = c4822;
        this.f14075 = protoBuf$Property;
        this.f14073 = c4792;
    }

    @Override // p052.InterfaceC6542
    public final Object invoke() {
        int i = this.f14076;
        C4792 c4792 = this.f14073;
        ProtoBuf$Property protoBuf$Property = this.f14075;
        C4822 c4822 = this.f14074;
        switch (i) {
            case 0:
                C4844 c4844 = c4822.f14052.f14058.f14088;
                C4826 c4826 = new C4826(c4822, protoBuf$Property, c4792, 2);
                c4844.getClass();
                return new C4842(c4844, c4826);
            case 1:
                C4844 c48442 = c4822.f14052.f14058.f14088;
                C4826 c48262 = new C4826(c4822, protoBuf$Property, c4792, 3);
                c48442.getClass();
                return new C4842(c48442, c48262);
            case 2:
                C4823 c4823 = c4822.f14052;
                AbstractC4807 abstractC4807M9570 = c4822.m9570(c4823.f14056);
                abstractC4807M9570.getClass();
                InterfaceC4815 interfaceC4815 = c4823.f14058.f14084;
                AbstractC4881 returnType = c4792.getReturnType();
                returnType.getClass();
                return (AbstractC4767) interfaceC4815.mo9259(abstractC4807M9570, protoBuf$Property, returnType);
            default:
                C4823 c48232 = c4822.f14052;
                AbstractC4807 abstractC4807M95702 = c4822.m9570(c48232.f14056);
                abstractC4807M95702.getClass();
                InterfaceC4815 interfaceC48152 = c48232.f14058.f14084;
                AbstractC4881 returnType2 = c4792.getReturnType();
                returnType2.getClass();
                return (AbstractC4767) interfaceC48152.mo9261(abstractC4807M95702, protoBuf$Property, returnType2);
        }
    }
}
