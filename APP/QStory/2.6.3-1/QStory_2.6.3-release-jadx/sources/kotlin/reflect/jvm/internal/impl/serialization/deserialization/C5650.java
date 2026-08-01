package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.List;
import kotlin.collections.AbstractC5176;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property;
import p068.InterfaceC7372;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C5650 implements InterfaceC7372 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final boolean f14380;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final ProtoBuf$Property f14381;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C5655 f14382;

    public C5650(C5655 c5655, boolean z, ProtoBuf$Property protoBuf$Property) {
        this.f14382 = c5655;
        this.f14380 = z;
        this.f14381 = protoBuf$Property;
    }

    @Override // p068.InterfaceC7372
    public final Object invoke() {
        List listM9356;
        C5655 c5655 = this.f14382;
        C5656 c5656 = c5655.f14401;
        AbstractC5640 abstractC5640M10119 = c5655.m10119(c5656.f14405);
        if (abstractC5640M10119 != null) {
            C5665 c5665 = c5656.f14407;
            boolean z = this.f14380;
            ProtoBuf$Property protoBuf$Property = this.f14381;
            listM9356 = z ? AbstractC5176.m9356(c5665.f14433.mo2986(abstractC5640M10119, protoBuf$Property)) : AbstractC5176.m9356(c5665.f14433.mo2968(abstractC5640M10119, protoBuf$Property));
        } else {
            listM9356 = null;
        }
        return listM9356 == null ? EmptyList.INSTANCE : listM9356;
    }
}
