package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.List;
import kotlin.collections.AbstractC4344;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property;
import p052.InterfaceC6543;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C4818 implements InterfaceC6543 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final boolean f14035;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final ProtoBuf$Property f14036;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C4823 f14037;

    public C4818(C4823 c4823, boolean z, ProtoBuf$Property protoBuf$Property) {
        this.f14037 = c4823;
        this.f14035 = z;
        this.f14036 = protoBuf$Property;
    }

    @Override // p052.InterfaceC6543
    public final Object invoke() {
        List listM8797;
        C4823 c4823 = this.f14037;
        C4824 c4824 = c4823.f14056;
        AbstractC4808 abstractC4808M9560 = c4823.m9560(c4824.f14060);
        if (abstractC4808M9560 != null) {
            C4833 c4833 = c4824.f14062;
            boolean z = this.f14035;
            ProtoBuf$Property protoBuf$Property = this.f14036;
            listM8797 = z ? AbstractC4344.m8797(c4833.f14088.mo2426(abstractC4808M9560, protoBuf$Property)) : AbstractC4344.m8797(c4833.f14088.mo2408(abstractC4808M9560, protoBuf$Property));
        } else {
            listM8797 = null;
        }
        return listM8797 == null ? EmptyList.INSTANCE : listM8797;
    }
}
