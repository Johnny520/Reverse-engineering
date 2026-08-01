package p061;

import io.ktor.util.C5043;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.AbstractC5176;
import kotlin.collections.AbstractC5177;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC5323;
import kotlin.reflect.jvm.internal.impl.descriptors.C5293;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5295;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5309;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5318;
import kotlin.reflect.jvm.internal.impl.name.C5520;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5725;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5726;
import kotlin.reflect.jvm.internal.impl.types.C5706;
import kotlin.reflect.jvm.internal.impl.types.C5717;
import p050.AbstractC7176;
import p065.AbstractC7355;
import p095.AbstractC7815;
import p095.AbstractC7818;
import p118.AbstractC8095;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: 飘花落叶言世子兰哲楪苏.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7295 extends AbstractC5726 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ C7294 f18089;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7295(C7294 c7294) {
        super(c7294.f18084);
        this.f18089 = c7294;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.InterfaceC5705
    public final List getParameters() {
        return this.f18089.f18082;
    }

    public final String toString() {
        return this.f18089.toString();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC5741
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final C5293 mo9768() {
        return C5293.f13434;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC5741
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Collection mo9769() {
        List<C5520> listM12490;
        C7294 c7294 = this.f18089;
        int i = c7294.f18085;
        AbstractC7302 abstractC7302 = c7294.f18088;
        C7291 c7291 = C7291.f18079;
        if (AbstractC5227.m9466(abstractC7302, c7291)) {
            listM12490 = AbstractC7176.m12487(C7294.f18081);
        } else if (AbstractC5227.m9466(abstractC7302, C7298.f18093)) {
            listM12490 = AbstractC7176.m12490(C7294.f18080, new C5520(AbstractC7355.f18198, c7291.m12551(i)));
        } else {
            C7301 c7301 = C7301.f18099;
            if (AbstractC5227.m9466(abstractC7302, c7301)) {
                listM12490 = AbstractC7176.m12487(C7294.f18081);
            } else {
                if (!AbstractC5227.m9466(abstractC7302, C7297.f18092)) {
                    int i2 = AbstractC8095.f19707;
                    C6755.m11870("should not be called");
                    return null;
                }
                listM12490 = AbstractC7176.m12490(C7294.f18080, new C5520(AbstractC7355.f18183, c7301.m12551(i)));
            }
        }
        InterfaceC5318 interfaceC5318Mo9587 = ((AbstractC7815) c7294.f18087).mo9587();
        ArrayList arrayList = new ArrayList(AbstractC5177.m9381(listM12490, 10));
        for (C5520 c5520 : listM12490) {
            AbstractC7818 abstractC7818M9636 = AbstractC5323.m9636(interfaceC5318Mo9587, c5520);
            if (abstractC7818M9636 == null) {
                C5043.m9178(c5520, "Built-in class ", " not found");
                return null;
            }
            List listM9359 = AbstractC5176.m9359(abstractC7818M9636.mo9560().getParameters().size(), c7294.f18082);
            ArrayList arrayList2 = new ArrayList(AbstractC5177.m9381(listM9359, 10));
            Iterator it = listM9359.iterator();
            while (it.hasNext()) {
                arrayList2.add(new C5717(((InterfaceC5295) it.next()).mo9584()));
            }
            C5706.f14520.getClass();
            arrayList.add(AbstractC5725.m10373(C5706.f14521, abstractC7818M9636, arrayList2));
        }
        return AbstractC5176.m9356(arrayList);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC5726, kotlin.reflect.jvm.internal.impl.types.InterfaceC5705
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public final InterfaceC5309 mo9770() {
        return this.f18089;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.InterfaceC5705
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public final boolean mo9771() {
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC5726
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final AbstractC7818 mo9770() {
        return this.f18089;
    }
}
