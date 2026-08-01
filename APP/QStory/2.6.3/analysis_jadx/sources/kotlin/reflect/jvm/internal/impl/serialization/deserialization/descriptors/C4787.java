package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import io.ktor.client.plugins.AbstractC3933;
import io.ktor.util.C4211;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.AbstractC4345;
import kotlin.reflect.jvm.internal.impl.descriptors.C4461;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4499;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter;
import kotlin.reflect.jvm.internal.impl.name.C4691;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.AbstractC4773;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.AbstractC4807;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C4810;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C4824;
import kotlin.reflect.jvm.internal.impl.storage.C4845;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import p034.AbstractC6347;
import p046.C6482;
import p046.InterfaceC6481;
import p070.AbstractC6909;
import p079.AbstractC6999;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4787 extends AbstractC6999 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final C4786 f13936;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final ProtoBuf$TypeParameter f13937;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final C4824 f13938;

    /* JADX WARN: Illegal instructions before constructor call */
    public C4787(C4824 c4824, ProtoBuf$TypeParameter protoBuf$TypeParameter, int i) {
        Variance variance;
        C4845 c4845 = c4824.f14062.f14092;
        InterfaceC4499 interfaceC4499 = c4824.f14060;
        C4691 c4691M8316 = AbstractC3933.m8316(c4824.f14061, protoBuf$TypeParameter.getName());
        ProtoBuf$TypeParameter.Variance variance2 = protoBuf$TypeParameter.getVariance();
        variance2.getClass();
        int i2 = AbstractC4807.f14014[variance2.ordinal()];
        if (i2 == 1) {
            variance = Variance.IN_VARIANCE;
        } else if (i2 == 2) {
            variance = Variance.OUT_VARIANCE;
        } else {
            if (i2 != 3) {
                C4211.m8611();
                throw null;
            }
            variance = Variance.INVARIANT;
        }
        Variance variance3 = variance;
        super(c4845, interfaceC4499, C6482.f17768, c4691M8316, variance3, protoBuf$TypeParameter.getReified(), i, C4461.f13089);
        this.f13938 = c4824;
        this.f13937 = protoBuf$TypeParameter;
        this.f13936 = new C4786(c4845, new C4782(this, 4));
    }

    @Override // androidx.compose.runtime.AbstractC1332, p046.InterfaceC6479
    public final InterfaceC6481 getAnnotations() {
        return this.f13936;
    }

    @Override // p079.AbstractC7014
    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪世兰 */
    public final List mo9174() {
        C4824 c4824 = this.f13938;
        List listM12193 = AbstractC6909.m12193(this.f13937, c4824.f14059);
        if (listM12193.isEmpty()) {
            return AbstractC6347.m11928(AbstractC4773.m9499(this).m12033());
        }
        C4810 c4810 = c4824.f14063;
        ArrayList arrayList = new ArrayList(AbstractC4345.m8822(listM12193, 10));
        Iterator it = listM12193.iterator();
        while (it.hasNext()) {
            arrayList.add(c4810.m9551((ProtoBuf$Type) it.next()));
        }
        return arrayList;
    }
}
