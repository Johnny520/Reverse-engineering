package p045;

import io.ktor.util.C4211;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.AbstractC4344;
import kotlin.collections.AbstractC4345;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC4491;
import kotlin.reflect.jvm.internal.impl.descriptors.C4461;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4463;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4477;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4486;
import kotlin.reflect.jvm.internal.impl.name.C4688;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4893;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4894;
import kotlin.reflect.jvm.internal.impl.types.C4874;
import kotlin.reflect.jvm.internal.impl.types.C4885;
import p034.AbstractC6347;
import p049.AbstractC6526;
import p079.AbstractC6986;
import p079.AbstractC6989;
import p102.AbstractC7266;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: 飘花落叶言世子兰哲楪苏.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6466 extends AbstractC4894 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ C6465 f17744;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6466(C6465 c6465) {
        super(c6465.f17739);
        this.f17744 = c6465;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.InterfaceC4873
    public final List getParameters() {
        return this.f17744.f17737;
    }

    public final String toString() {
        return this.f17744.toString();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4909
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final C4461 mo9209() {
        return C4461.f13089;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4909
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Collection mo9210() {
        List<C4688> listM11931;
        C6465 c6465 = this.f17744;
        int i = c6465.f17740;
        AbstractC6473 abstractC6473 = c6465.f17743;
        C6462 c6462 = C6462.f17734;
        if (AbstractC4395.m8907(abstractC6473, c6462)) {
            listM11931 = AbstractC6347.m11928(C6465.f17736);
        } else if (AbstractC4395.m8907(abstractC6473, C6469.f17748)) {
            listM11931 = AbstractC6347.m11931(C6465.f17735, new C4688(AbstractC6526.f17853, c6462.m11992(i)));
        } else {
            C6472 c6472 = C6472.f17754;
            if (AbstractC4395.m8907(abstractC6473, c6472)) {
                listM11931 = AbstractC6347.m11928(C6465.f17736);
            } else {
                if (!AbstractC4395.m8907(abstractC6473, C6468.f17747)) {
                    int i2 = AbstractC7266.f19362;
                    C5925.m11311("should not be called");
                    return null;
                }
                listM11931 = AbstractC6347.m11931(C6465.f17735, new C4688(AbstractC6526.f17838, c6472.m11992(i)));
            }
        }
        InterfaceC4486 interfaceC4486Mo9028 = ((AbstractC6986) c6465.f17742).mo9028();
        ArrayList arrayList = new ArrayList(AbstractC4345.m8822(listM11931, 10));
        for (C4688 c4688 : listM11931) {
            AbstractC6989 abstractC6989M9077 = AbstractC4491.m9077(interfaceC4486Mo9028, c4688);
            if (abstractC6989M9077 == null) {
                C4211.m8619(c4688, "Built-in class ", " not found");
                return null;
            }
            List listM8800 = AbstractC4344.m8800(abstractC6989M9077.mo9001().getParameters().size(), c6465.f17737);
            ArrayList arrayList2 = new ArrayList(AbstractC4345.m8822(listM8800, 10));
            Iterator it = listM8800.iterator();
            while (it.hasNext()) {
                arrayList2.add(new C4885(((InterfaceC4463) it.next()).mo9025()));
            }
            C4874.f14175.getClass();
            arrayList.add(AbstractC4893.m9814(C4874.f14176, abstractC6989M9077, arrayList2));
        }
        return AbstractC4344.m8797(arrayList);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4894, kotlin.reflect.jvm.internal.impl.types.InterfaceC4873
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public final InterfaceC4477 mo9211() {
        return this.f17744;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.InterfaceC4873
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public final boolean mo9212() {
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4894
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final AbstractC6989 mo9211() {
        return this.f17744;
    }
}
