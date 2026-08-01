package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.List;
import kotlin.collections.AbstractC4343;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property;
import p052.InterfaceC6542;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C4817 implements InterfaceC6542 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final boolean f14031;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final ProtoBuf$Property f14032;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C4822 f14033;

    public C4817(C4822 c4822, boolean z, ProtoBuf$Property protoBuf$Property) {
        this.f14033 = c4822;
        this.f14031 = z;
        this.f14032 = protoBuf$Property;
    }

    @Override // p052.InterfaceC6542
    public final Object invoke() {
        List listM8804;
        C4822 c4822 = this.f14033;
        C4823 c4823 = c4822.f14052;
        AbstractC4807 abstractC4807M9570 = c4822.m9570(c4823.f14056);
        if (abstractC4807M9570 != null) {
            C4832 c4832 = c4823.f14058;
            boolean z = this.f14031;
            ProtoBuf$Property protoBuf$Property = this.f14032;
            listM8804 = z ? AbstractC4343.m8804(c4832.f14084.mo2416(abstractC4807M9570, protoBuf$Property)) : AbstractC4343.m8804(c4832.f14084.mo2398(abstractC4807M9570, protoBuf$Property));
        } else {
            listM8804 = null;
        }
        return listM8804 == null ? EmptyList.INSTANCE : listM8804;
    }
}
