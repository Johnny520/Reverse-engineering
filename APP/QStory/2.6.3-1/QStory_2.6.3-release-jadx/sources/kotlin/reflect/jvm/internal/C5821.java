package kotlin.reflect.jvm.internal;

import io.ktor.util.C5043;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.AbstractC5177;
import kotlin.jvm.internal.AbstractC5226;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.reflect.InterfaceC5919;
import kotlin.reflect.KVariance;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5295;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5714;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.types.C5769;
import kotlin.reflect.jvm.internal.types.C5770;
import p113.InterfaceC8057;
import p113.InterfaceC8060;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言子哲世兰苏楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5821 extends AbstractC5226 implements InterfaceC8060, InterfaceC8057 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final InterfaceC5295 f14739;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final KVariance f14740;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public volatile List f14741;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final String f14742;

    /* JADX WARN: Illegal instructions before constructor call */
    public C5821(InterfaceC5843 interfaceC5843, InterfaceC5295 interfaceC5295, C5769 c5769) {
        KVariance kVariance;
        interfaceC5843.getClass();
        c5769.getClass();
        String strM9894 = interfaceC5295.getName().m9894();
        strM9894.getClass();
        Variance varianceMo9562 = interfaceC5295.mo9562();
        varianceMo9562.getClass();
        int i = AbstractC5842.f14784[varianceMo9562.ordinal()];
        if (i == 1) {
            kVariance = KVariance.INVARIANT;
        } else if (i == 2) {
            kVariance = KVariance.f304IN;
        } else {
            if (i != 3) {
                C5043.m9170();
                throw null;
            }
            kVariance = KVariance.OUT;
        }
        interfaceC5295.mo9563();
        this(interfaceC5295, interfaceC5843, strM9894, kVariance);
        List<AbstractC5714> upperBounds = interfaceC5295.getUpperBounds();
        upperBounds.getClass();
        ArrayList arrayList = new ArrayList(AbstractC5177.m9381(upperBounds, 10));
        for (AbstractC5714 abstractC5714 : upperBounds) {
            abstractC5714.getClass();
            InterfaceC5919 interfaceC5919 = c5769.m10487(new C5770(abstractC5714, null, false), KVariance.INVARIANT).f14982;
            if (interfaceC5919 == null) {
                AbstractC5889.m10562(interfaceC5843);
                throw null;
            }
            arrayList.add(interfaceC5919);
        }
        this.f14741 = arrayList;
    }

    @Override // kotlin.jvm.internal.AbstractC5226
    public final List getUpperBounds() {
        List list = this.f14741;
        if (list != null) {
            return list;
        }
        AbstractC5227.m9467("upperBounds");
        throw null;
    }

    @Override // kotlin.jvm.internal.AbstractC5226
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final KVariance mo9459() {
        return this.f14740;
    }

    @Override // kotlin.jvm.internal.AbstractC5226
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final String mo9460() {
        return this.f14742;
    }

    public C5821(InterfaceC5295 interfaceC5295, InterfaceC5843 interfaceC5843, String str, KVariance kVariance) {
        super(interfaceC5843);
        this.f14742 = str;
        this.f14740 = kVariance;
        this.f14739 = interfaceC5295;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C5821(InterfaceC5843 interfaceC5843, String str, KVariance kVariance) {
        this(null, interfaceC5843, str, kVariance);
        interfaceC5843.getClass();
        str.getClass();
        kVariance.getClass();
    }

    public C5821(InterfaceC5843 interfaceC5843, InterfaceC5295 interfaceC5295) {
        this(interfaceC5843, interfaceC5295, C5769.f14634);
    }
}
