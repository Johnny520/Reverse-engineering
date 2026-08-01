package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import io.ktor.client.plugins.AbstractC4765;
import io.ktor.util.C5043;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.AbstractC5177;
import kotlin.reflect.jvm.internal.impl.descriptors.C5293;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5331;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter;
import kotlin.reflect.jvm.internal.impl.name.C5523;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.AbstractC5605;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.AbstractC5639;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C5642;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C5656;
import kotlin.reflect.jvm.internal.impl.storage.C5677;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import p050.AbstractC7176;
import p062.C7311;
import p062.InterfaceC7310;
import p086.AbstractC7738;
import p095.AbstractC7828;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5619 extends AbstractC7828 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final C5618 f14281;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final ProtoBuf$TypeParameter f14282;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final C5656 f14283;

    /* JADX WARN: Illegal instructions before constructor call */
    public C5619(C5656 c5656, ProtoBuf$TypeParameter protoBuf$TypeParameter, int i) {
        Variance variance;
        C5677 c5677 = c5656.f14407.f14437;
        InterfaceC5331 interfaceC5331 = c5656.f14405;
        C5523 c5523M8875 = AbstractC4765.m8875(c5656.f14406, protoBuf$TypeParameter.getName());
        ProtoBuf$TypeParameter.Variance variance2 = protoBuf$TypeParameter.getVariance();
        variance2.getClass();
        int i2 = AbstractC5639.f14359[variance2.ordinal()];
        if (i2 == 1) {
            variance = Variance.IN_VARIANCE;
        } else if (i2 == 2) {
            variance = Variance.OUT_VARIANCE;
        } else {
            if (i2 != 3) {
                C5043.m9170();
                throw null;
            }
            variance = Variance.INVARIANT;
        }
        Variance variance3 = variance;
        super(c5677, interfaceC5331, C7311.f18113, c5523M8875, variance3, protoBuf$TypeParameter.getReified(), i, C5293.f13434);
        this.f14283 = c5656;
        this.f14282 = protoBuf$TypeParameter;
        this.f14281 = new C5618(c5677, new C5614(this, 4));
    }

    @Override // androidx.compose.runtime.AbstractC2167, p062.InterfaceC7308
    public final InterfaceC7310 getAnnotations() {
        return this.f14281;
    }

    @Override // p095.AbstractC7843
    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪世兰 */
    public final List mo9733() {
        C5656 c5656 = this.f14283;
        List listM12752 = AbstractC7738.m12752(this.f14282, c5656.f14404);
        if (listM12752.isEmpty()) {
            return AbstractC7176.m12487(AbstractC5605.m10058(this).m12592());
        }
        C5642 c5642 = c5656.f14408;
        ArrayList arrayList = new ArrayList(AbstractC5177.m9381(listM12752, 10));
        Iterator it = listM12752.iterator();
        while (it.hasNext()) {
            arrayList.add(c5642.m10110((ProtoBuf$Type) it.next()));
        }
        return arrayList;
    }
}
