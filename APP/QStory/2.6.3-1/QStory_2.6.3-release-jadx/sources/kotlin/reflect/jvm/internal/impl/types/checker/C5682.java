package kotlin.reflect.jvm.internal.impl.types.checker;

import com.alibaba.fastjson2.AbstractC3738;
import io.ktor.util.C5043;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.collections.AbstractC5177;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5295;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5702;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5710;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5714;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5725;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5728;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5746;
import kotlin.reflect.jvm.internal.impl.types.C5715;
import kotlin.reflect.jvm.internal.impl.types.InterfaceC5705;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus;
import p085.C7724;
import p113.InterfaceC8049;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.types.checker.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5682 extends AbstractC5725 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C5682 f14477 = new C5682();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [kotlin.reflect.jvm.internal.impl.types.飘花落叶言子世楪苏哲兰] */
    /* JADX WARN: Type inference failed for: r0v2, types: [kotlin.reflect.jvm.internal.impl.types.飘花落叶言子世楪苏哲兰] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r4v0, types: [kotlin.reflect.jvm.internal.impl.descriptors.飘花落叶言子世哲苏兰楪] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public static AbstractC5710 m10146(AbstractC5710 abstractC5710) {
        AbstractC5714 abstractC5714Mo10300;
        InterfaceC5705 interfaceC5705Mo10281 = abstractC5710.mo10281();
        boolean z = false;
        ?? r4 = 0;
        if (interfaceC5705Mo10281 instanceof C7724) {
            C7724 c7724 = (C7724) interfaceC5705Mo10281;
            AbstractC5702 abstractC5702 = c7724.f18695;
            AbstractC5702 abstractC57022 = abstractC5702.mo10301() == Variance.IN_VARIANCE ? abstractC5702 : null;
            AbstractC5746 abstractC5746Mo10331 = (abstractC57022 == null || (abstractC5714Mo10300 = abstractC57022.mo10300()) == null) ? null : abstractC5714Mo10300.mo10331();
            if (c7724.f18694 == null) {
                Collection collectionMo10053 = c7724.mo10053();
                ArrayList arrayList = new ArrayList(AbstractC5177.m9381(collectionMo10053, 10));
                Iterator it = collectionMo10053.iterator();
                while (it.hasNext()) {
                    arrayList.add(((AbstractC5714) it.next()).mo10331());
                }
                c7724.f18694 = new C5694(abstractC5702, new C5697(0, arrayList), (InterfaceC5295) r4, 8);
            }
            CaptureStatus captureStatus = CaptureStatus.FOR_SUBTYPING;
            C5694 c5694 = c7724.f18694;
            c5694.getClass();
            return new C5696(captureStatus, c5694, abstractC5746Mo10331, abstractC5710.mo10282(), abstractC5710.mo10284(), 32);
        }
        if (!(interfaceC5705Mo10281 instanceof C5715) || !abstractC5710.mo10284()) {
            return abstractC5710;
        }
        ?? r0 = (C5715) interfaceC5705Mo10281;
        LinkedHashSet linkedHashSet = r0.f14537;
        ArrayList arrayList2 = new ArrayList(AbstractC5177.m9381(linkedHashSet, 10));
        Iterator it2 = linkedHashSet.iterator();
        while (it2.hasNext()) {
            arrayList2.add(AbstractC3738.m6849((AbstractC5714) it2.next()));
            z = true;
        }
        if (z) {
            AbstractC5714 abstractC5714 = r0.f14539;
            AbstractC5746 abstractC5746M6849 = abstractC5714 != null ? AbstractC3738.m6849(abstractC5714) : null;
            arrayList2.isEmpty();
            LinkedHashSet linkedHashSet2 = new LinkedHashSet(arrayList2);
            linkedHashSet2.hashCode();
            C5715 c5715 = new C5715(linkedHashSet2);
            c5715.f14539 = abstractC5746M6849;
            r4 = c5715;
        }
        if (r4 != 0) {
            r0 = r4;
        }
        return r0.m10334();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC5725
    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final AbstractC5746 mo10148(InterfaceC8049 interfaceC8049) {
        AbstractC5746 abstractC5746M10368;
        interfaceC8049.getClass();
        if (!(interfaceC8049 instanceof AbstractC5714)) {
            C6755.m11869("Failed requirement.");
            return null;
        }
        AbstractC5746 abstractC5746Mo10331 = ((AbstractC5714) interfaceC8049).mo10331();
        if (abstractC5746Mo10331 instanceof AbstractC5710) {
            abstractC5746M10368 = m10146((AbstractC5710) abstractC5746Mo10331);
        } else {
            if (!(abstractC5746Mo10331 instanceof AbstractC5728)) {
                C5043.m9170();
                return null;
            }
            AbstractC5728 abstractC5728 = (AbstractC5728) abstractC5746Mo10331;
            AbstractC5710 abstractC5710 = abstractC5728.f14562;
            AbstractC5710 abstractC57102 = abstractC5728.f14561;
            AbstractC5710 abstractC5710M10146 = m10146(abstractC57102);
            AbstractC5710 abstractC5710M101462 = m10146(abstractC5710);
            abstractC5746M10368 = (abstractC5710M10146 == abstractC57102 && abstractC5710M101462 == abstractC5710) ? abstractC5746Mo10331 : AbstractC5725.m10368(abstractC5710M10146, abstractC5710M101462);
        }
        KotlinTypePreparator$prepareType$1 kotlinTypePreparator$prepareType$1 = new KotlinTypePreparator$prepareType$1(this);
        AbstractC5714 abstractC5714M10367 = AbstractC5725.m10367(abstractC5746Mo10331);
        return AbstractC5725.m10364(abstractC5746M10368, abstractC5714M10367 != null ? (AbstractC5714) kotlinTypePreparator$prepareType$1.invoke((Object) abstractC5714M10367) : null);
    }
}
