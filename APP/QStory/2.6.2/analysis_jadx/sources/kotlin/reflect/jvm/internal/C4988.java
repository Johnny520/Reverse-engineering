package kotlin.reflect.jvm.internal;

import io.ktor.util.C4210;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.AbstractC4344;
import kotlin.jvm.internal.AbstractC4393;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.reflect.InterfaceC5086;
import kotlin.reflect.KVariance;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4462;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4881;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.types.C4936;
import kotlin.reflect.jvm.internal.types.C4937;
import p097.InterfaceC7227;
import p097.InterfaceC7230;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言子哲世兰苏楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4988 extends AbstractC4393 implements InterfaceC7230, InterfaceC7227 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final InterfaceC4462 f14392;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final KVariance f14393;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public volatile List f14394;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final String f14395;

    /* JADX WARN: Illegal instructions before constructor call */
    public C4988(InterfaceC5010 interfaceC5010, InterfaceC4462 interfaceC4462, C4936 c4936) {
        KVariance kVariance;
        interfaceC5010.getClass();
        c4936.getClass();
        String strM9345 = interfaceC4462.getName().m9345();
        strM9345.getClass();
        Variance varianceMo9013 = interfaceC4462.mo9013();
        varianceMo9013.getClass();
        int i = AbstractC5009.f14437[varianceMo9013.ordinal()];
        if (i == 1) {
            kVariance = KVariance.INVARIANT;
        } else if (i == 2) {
            kVariance = KVariance.IN;
        } else {
            if (i != 3) {
                C4210.m8621();
                throw null;
            }
            kVariance = KVariance.OUT;
        }
        interfaceC4462.mo9014();
        this(interfaceC4462, interfaceC5010, strM9345, kVariance);
        List<AbstractC4881> upperBounds = interfaceC4462.getUpperBounds();
        upperBounds.getClass();
        ArrayList arrayList = new ArrayList(AbstractC4344.m8832(upperBounds, 10));
        for (AbstractC4881 abstractC4881 : upperBounds) {
            abstractC4881.getClass();
            InterfaceC5086 interfaceC5086 = c4936.m9931(new C4937(abstractC4881, null, false), KVariance.INVARIANT).f14637;
            if (interfaceC5086 == null) {
                AbstractC5056.m10006(interfaceC5010);
                throw null;
            }
            arrayList.add(interfaceC5086);
        }
        this.f14394 = arrayList;
    }

    @Override // kotlin.jvm.internal.AbstractC4393
    public final List getUpperBounds() {
        List list = this.f14394;
        if (list != null) {
            return list;
        }
        AbstractC4394.m8918("upperBounds");
        throw null;
    }

    @Override // kotlin.jvm.internal.AbstractC4393
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final KVariance mo8910() {
        return this.f14393;
    }

    @Override // kotlin.jvm.internal.AbstractC4393
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final String mo8911() {
        return this.f14395;
    }

    public C4988(InterfaceC4462 interfaceC4462, InterfaceC5010 interfaceC5010, String str, KVariance kVariance) {
        super(interfaceC5010);
        this.f14395 = str;
        this.f14393 = kVariance;
        this.f14392 = interfaceC4462;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C4988(InterfaceC5010 interfaceC5010, String str, KVariance kVariance) {
        this(null, interfaceC5010, str, kVariance);
        interfaceC5010.getClass();
        str.getClass();
        kVariance.getClass();
    }

    public C4988(InterfaceC5010 interfaceC5010, InterfaceC4462 interfaceC4462) {
        this(interfaceC5010, interfaceC4462, C4936.f14287);
    }
}
