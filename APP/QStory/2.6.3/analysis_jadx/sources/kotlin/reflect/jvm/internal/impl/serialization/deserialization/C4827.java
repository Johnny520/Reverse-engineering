package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property;
import kotlin.reflect.jvm.internal.impl.resolve.constants.AbstractC4768;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.C4793;
import kotlin.reflect.jvm.internal.impl.storage.C4843;
import kotlin.reflect.jvm.internal.impl.storage.C4845;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4882;
import p052.InterfaceC6543;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C4827 implements InterfaceC6543 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final C4793 f14077;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C4823 f14078;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final ProtoBuf$Property f14079;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f14080;

    public /* synthetic */ C4827(C4823 c4823, ProtoBuf$Property protoBuf$Property, C4793 c4793, int i) {
        this.f14080 = i;
        this.f14078 = c4823;
        this.f14079 = protoBuf$Property;
        this.f14077 = c4793;
    }

    @Override // p052.InterfaceC6543
    public final Object invoke() {
        int i = this.f14080;
        C4793 c4793 = this.f14077;
        ProtoBuf$Property protoBuf$Property = this.f14079;
        C4823 c4823 = this.f14078;
        switch (i) {
            case 0:
                C4845 c4845 = c4823.f14056.f14062.f14092;
                C4827 c4827 = new C4827(c4823, protoBuf$Property, c4793, 2);
                c4845.getClass();
                return new C4843(c4845, c4827);
            case 1:
                C4845 c48452 = c4823.f14056.f14062.f14092;
                C4827 c48272 = new C4827(c4823, protoBuf$Property, c4793, 3);
                c48452.getClass();
                return new C4843(c48452, c48272);
            case 2:
                C4824 c4824 = c4823.f14056;
                AbstractC4808 abstractC4808M9560 = c4823.m9560(c4824.f14060);
                abstractC4808M9560.getClass();
                InterfaceC4816 interfaceC4816 = c4824.f14062.f14088;
                AbstractC4882 returnType = c4793.getReturnType();
                returnType.getClass();
                return (AbstractC4768) interfaceC4816.mo9249(abstractC4808M9560, protoBuf$Property, returnType);
            default:
                C4824 c48242 = c4823.f14056;
                AbstractC4808 abstractC4808M95602 = c4823.m9560(c48242.f14060);
                abstractC4808M95602.getClass();
                InterfaceC4816 interfaceC48162 = c48242.f14062.f14088;
                AbstractC4882 returnType2 = c4793.getReturnType();
                returnType2.getClass();
                return (AbstractC4768) interfaceC48162.mo9251(abstractC4808M95602, protoBuf$Property, returnType2);
        }
    }
}
