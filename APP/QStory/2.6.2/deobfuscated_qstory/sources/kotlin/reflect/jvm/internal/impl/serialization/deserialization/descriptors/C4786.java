package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import io.ktor.util.C4210;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.AbstractC4344;
import kotlin.reflect.jvm.internal.impl.descriptors.C4460;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4498;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter;
import kotlin.reflect.jvm.internal.impl.name.C4690;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.AbstractC4772;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.AbstractC4806;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C4809;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C4823;
import kotlin.reflect.jvm.internal.impl.storage.C4844;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import p046.C6481;
import p046.InterfaceC6480;
import p070.AbstractC6908;
import p079.AbstractC6998;
import p175.AbstractC7738;
import p253.AbstractC8189;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4786 extends AbstractC6998 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final C4785 f13932;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final ProtoBuf$TypeParameter f13933;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final C4823 f13934;

    /* JADX WARN: Illegal instructions before constructor call */
    public C4786(C4823 c4823, ProtoBuf$TypeParameter protoBuf$TypeParameter, int i) {
        Variance variance;
        C4844 c4844 = c4823.f14058.f14088;
        InterfaceC4498 interfaceC4498 = c4823.f14056;
        C4690 c4690M13047 = AbstractC7738.m13047(c4823.f14057, protoBuf$TypeParameter.getName());
        ProtoBuf$TypeParameter.Variance variance2 = protoBuf$TypeParameter.getVariance();
        variance2.getClass();
        int i2 = AbstractC4806.f14010[variance2.ordinal()];
        if (i2 == 1) {
            variance = Variance.IN_VARIANCE;
        } else if (i2 == 2) {
            variance = Variance.OUT_VARIANCE;
        } else {
            if (i2 != 3) {
                C4210.m8621();
                throw null;
            }
            variance = Variance.INVARIANT;
        }
        Variance variance3 = variance;
        super(c4844, interfaceC4498, C6481.f17772, c4690M13047, variance3, protoBuf$TypeParameter.getReified(), i, C4460.f13085);
        this.f13934 = c4823;
        this.f13933 = protoBuf$TypeParameter;
        this.f13932 = new C4785(c4844, new C4781(this, 4));
    }

    @Override // androidx.compose.runtime.AbstractC1332, p046.InterfaceC6478
    public final InterfaceC6480 getAnnotations() {
        return this.f13932;
    }

    @Override // p079.AbstractC7013
    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪世兰 */
    public final List mo9184() {
        C4823 c4823 = this.f13934;
        List listM12165 = AbstractC6908.m12165(this.f13933, c4823.f14055);
        if (listM12165.isEmpty()) {
            return AbstractC8189.m13660(AbstractC4772.m9509(this).m11990());
        }
        C4809 c4809 = c4823.f14059;
        ArrayList arrayList = new ArrayList(AbstractC4344.m8832(listM12165, 10));
        Iterator it = listM12165.iterator();
        while (it.hasNext()) {
            arrayList.add(c4809.m9561((ProtoBuf$Type) it.next()));
        }
        return arrayList;
    }
}
