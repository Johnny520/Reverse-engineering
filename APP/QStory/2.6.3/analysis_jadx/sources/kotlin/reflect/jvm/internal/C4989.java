package kotlin.reflect.jvm.internal;

import io.ktor.util.C4211;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.AbstractC4345;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.reflect.InterfaceC5087;
import kotlin.reflect.KVariance;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4463;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4882;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.types.C4937;
import kotlin.reflect.jvm.internal.types.C4938;
import p097.InterfaceC7228;
import p097.InterfaceC7231;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言子哲世兰苏楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4989 extends AbstractC4394 implements InterfaceC7231, InterfaceC7228 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final InterfaceC4463 f14394;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final KVariance f14395;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public volatile List f14396;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final String f14397;

    /* JADX WARN: Illegal instructions before constructor call */
    public C4989(InterfaceC5011 interfaceC5011, InterfaceC4463 interfaceC4463, C4937 c4937) {
        KVariance kVariance;
        interfaceC5011.getClass();
        c4937.getClass();
        String strM9335 = interfaceC4463.getName().m9335();
        strM9335.getClass();
        Variance varianceMo9003 = interfaceC4463.mo9003();
        varianceMo9003.getClass();
        int i = AbstractC5010.f14439[varianceMo9003.ordinal()];
        if (i == 1) {
            kVariance = KVariance.INVARIANT;
        } else if (i == 2) {
            kVariance = KVariance.IN;
        } else {
            if (i != 3) {
                C4211.m8611();
                throw null;
            }
            kVariance = KVariance.OUT;
        }
        interfaceC4463.mo9004();
        this(interfaceC4463, interfaceC5011, strM9335, kVariance);
        List<AbstractC4882> upperBounds = interfaceC4463.getUpperBounds();
        upperBounds.getClass();
        ArrayList arrayList = new ArrayList(AbstractC4345.m8822(upperBounds, 10));
        for (AbstractC4882 abstractC4882 : upperBounds) {
            abstractC4882.getClass();
            InterfaceC5087 interfaceC5087 = c4937.m9928(new C4938(abstractC4882, null, false), KVariance.INVARIANT).f14637;
            if (interfaceC5087 == null) {
                AbstractC5057.m10003(interfaceC5011);
                throw null;
            }
            arrayList.add(interfaceC5087);
        }
        this.f14396 = arrayList;
    }

    @Override // kotlin.jvm.internal.AbstractC4394
    public final List getUpperBounds() {
        List list = this.f14396;
        if (list != null) {
            return list;
        }
        AbstractC4395.m8908("upperBounds");
        throw null;
    }

    @Override // kotlin.jvm.internal.AbstractC4394
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final KVariance mo8900() {
        return this.f14395;
    }

    @Override // kotlin.jvm.internal.AbstractC4394
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final String mo8901() {
        return this.f14397;
    }

    public C4989(InterfaceC4463 interfaceC4463, InterfaceC5011 interfaceC5011, String str, KVariance kVariance) {
        super(interfaceC5011);
        this.f14397 = str;
        this.f14395 = kVariance;
        this.f14394 = interfaceC4463;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C4989(InterfaceC5011 interfaceC5011, String str, KVariance kVariance) {
        this(null, interfaceC5011, str, kVariance);
        interfaceC5011.getClass();
        str.getClass();
        kVariance.getClass();
    }

    public C4989(InterfaceC5011 interfaceC5011, InterfaceC4463 interfaceC4463) {
        this(interfaceC5011, interfaceC4463, C4937.f14289);
    }
}
