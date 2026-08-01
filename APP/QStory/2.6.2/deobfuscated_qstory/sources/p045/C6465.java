package p045;

import io.ktor.util.C4210;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.AbstractC4343;
import kotlin.collections.AbstractC4344;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC4490;
import kotlin.reflect.jvm.internal.impl.descriptors.C4460;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4462;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4476;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4485;
import kotlin.reflect.jvm.internal.impl.name.C4687;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4892;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4893;
import kotlin.reflect.jvm.internal.impl.types.C4873;
import kotlin.reflect.jvm.internal.impl.types.C4884;
import p049.AbstractC6525;
import p079.AbstractC6985;
import p079.AbstractC6988;
import p102.AbstractC7265;
import p253.AbstractC8189;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: 飘花落叶言世子兰哲楪苏.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6465 extends AbstractC4893 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ C6464 f17748;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6465(C6464 c6464) {
        super(c6464.f17743);
        this.f17748 = c6464;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.InterfaceC4872
    public final List getParameters() {
        return this.f17748.f17741;
    }

    public final String toString() {
        return this.f17748.toString();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4908
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final C4460 mo9219() {
        return C4460.f13085;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4908
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Collection mo9220() {
        List<C4687> listM13659;
        C6464 c6464 = this.f17748;
        int i = c6464.f17744;
        AbstractC6472 abstractC6472 = c6464.f17747;
        C6461 c6461 = C6461.f17738;
        if (AbstractC4394.m8917(abstractC6472, c6461)) {
            listM13659 = AbstractC8189.m13660(C6464.f17740);
        } else if (AbstractC4394.m8917(abstractC6472, C6468.f17752)) {
            listM13659 = AbstractC8189.m13659(C6464.f17739, new C4687(AbstractC6525.f17857, c6461.m11949(i)));
        } else {
            C6471 c6471 = C6471.f17758;
            if (AbstractC4394.m8917(abstractC6472, c6471)) {
                listM13659 = AbstractC8189.m13660(C6464.f17740);
            } else {
                if (!AbstractC4394.m8917(abstractC6472, C6467.f17751)) {
                    int i2 = AbstractC7265.f19367;
                    C5919.m11250("should not be called");
                    return null;
                }
                listM13659 = AbstractC8189.m13659(C6464.f17739, new C4687(AbstractC6525.f17842, c6471.m11949(i)));
            }
        }
        InterfaceC4485 interfaceC4485Mo9038 = ((AbstractC6985) c6464.f17746).mo9038();
        ArrayList arrayList = new ArrayList(AbstractC4344.m8832(listM13659, 10));
        for (C4687 c4687 : listM13659) {
            AbstractC6988 abstractC6988M9087 = AbstractC4490.m9087(interfaceC4485Mo9038, c4687);
            if (abstractC6988M9087 == null) {
                C4210.m8629(c4687, "Built-in class ", " not found");
                return null;
            }
            List listM8803 = AbstractC4343.m8803(abstractC6988M9087.mo9011().getParameters().size(), c6464.f17741);
            ArrayList arrayList2 = new ArrayList(AbstractC4344.m8832(listM8803, 10));
            Iterator it = listM8803.iterator();
            while (it.hasNext()) {
                arrayList2.add(new C4884(((InterfaceC4462) it.next()).mo9035()));
            }
            C4873.f14171.getClass();
            arrayList.add(AbstractC4892.m9820(C4873.f14172, abstractC6988M9087, arrayList2));
        }
        return AbstractC4343.m8804(arrayList);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4893, kotlin.reflect.jvm.internal.impl.types.InterfaceC4872
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public final InterfaceC4476 mo9221() {
        return this.f17748;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.InterfaceC4872
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public final boolean mo9222() {
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4893
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final AbstractC6988 mo9221() {
        return this.f17748;
    }
}
