package kotlin.reflect.jvm.internal.impl.types.checker;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.collections.AbstractC5176;
import kotlin.collections.AbstractC5177;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.reflect.jvm.internal.impl.resolve.constants.AbstractC5597;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5710;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5714;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5725;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5746;
import kotlin.reflect.jvm.internal.impl.types.C5706;
import kotlin.reflect.jvm.internal.impl.types.C5707;
import kotlin.reflect.jvm.internal.impl.types.C5715;
import kotlin.reflect.jvm.internal.impl.types.C5723;
import kotlin.reflect.jvm.internal.impl.types.C5745;
import p068.InterfaceC7383;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.types.checker.飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5689 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C5689 f14484 = new C5689();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static ArrayList m10159(AbstractCollection abstractCollection, InterfaceC7383 interfaceC7383) {
        ArrayList arrayList = new ArrayList(abstractCollection);
        Iterator it = arrayList.iterator();
        it.getClass();
        while (it.hasNext()) {
            AbstractC5710 abstractC5710 = (AbstractC5710) it.next();
            if (!arrayList.isEmpty()) {
                Iterator it2 = arrayList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    AbstractC5710 abstractC57102 = (AbstractC5710) it2.next();
                    if (abstractC57102 != abstractC5710) {
                        abstractC57102.getClass();
                        abstractC5710.getClass();
                        if (((Boolean) interfaceC7383.invoke(abstractC57102, abstractC5710)).booleanValue()) {
                            it.remove();
                            break;
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v9, types: [kotlin.reflect.jvm.internal.impl.types.飘花落叶言子世哲楪兰苏] */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final AbstractC5710 m10160(ArrayList arrayList) {
        AbstractC5710 abstractC5710M10334;
        arrayList.size();
        ArrayList<AbstractC5710> arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AbstractC5710 abstractC5710 = (AbstractC5710) it.next();
            if (abstractC5710.mo10281() instanceof C5715) {
                Collection collectionMo10053 = abstractC5710.mo10281().mo10053();
                collectionMo10053.getClass();
                Collection<AbstractC5714> collection = collectionMo10053;
                ArrayList arrayList3 = new ArrayList(AbstractC5177.m9381(collection, 10));
                for (AbstractC5714 abstractC5714 : collection) {
                    abstractC5714.getClass();
                    AbstractC5710 abstractC5710M10366 = AbstractC5725.m10366(abstractC5714);
                    if (abstractC5710.mo10284()) {
                        abstractC5710M10366 = abstractC5710M10366.mo10290(true);
                    }
                    arrayList3.add(abstractC5710M10366);
                }
                arrayList2.addAll(arrayList3);
            } else {
                arrayList2.add(abstractC5710);
            }
        }
        TypeIntersector$ResultNullability typeIntersector$ResultNullabilityCombine = TypeIntersector$ResultNullability.START;
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            typeIntersector$ResultNullabilityCombine = typeIntersector$ResultNullabilityCombine.combine((AbstractC5746) it2.next());
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (AbstractC5710 abstractC5710Mo10290 : arrayList2) {
            if (typeIntersector$ResultNullabilityCombine == TypeIntersector$ResultNullability.NOT_NULL) {
                if (abstractC5710Mo10290 instanceof C5696) {
                    C5696 c5696 = (C5696) abstractC5710Mo10290;
                    abstractC5710Mo10290 = new C5696(c5696.f14500, c5696.f14501, c5696.f14497, c5696.f14496, c5696.f14498, true);
                }
                abstractC5710Mo10290.getClass();
                AbstractC5710 abstractC5710M10348 = C5723.m10348(abstractC5710Mo10290, false);
                abstractC5710Mo10290 = (abstractC5710M10348 == null && (abstractC5710M10348 = AbstractC5725.m10379(abstractC5710Mo10290)) == null) ? abstractC5710Mo10290.mo10290(false) : abstractC5710M10348;
            }
            linkedHashSet.add(abstractC5710Mo10290);
        }
        ArrayList arrayList4 = new ArrayList(AbstractC5177.m9381(arrayList, 10));
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            arrayList4.add(((AbstractC5710) it3.next()).mo10282());
        }
        Iterator it4 = arrayList4.iterator();
        if (!it4.hasNext()) {
            C6755.m11867("Empty collection can't be reduced.");
            return null;
        }
        Object next = it4.next();
        while (it4.hasNext()) {
            C5706 c5706 = (C5706) it4.next();
            next = (C5706) next;
            next.getClass();
            C5707 c5707 = C5706.f14520;
            c5706.getClass();
            if (!next.isEmpty() || !c5706.isEmpty()) {
                ArrayList arrayList5 = new ArrayList();
                Collection collectionValues = c5707.f14523.values();
                collectionValues.getClass();
                Iterator it5 = collectionValues.iterator();
                while (it5.hasNext()) {
                    int iIntValue = ((Number) it5.next()).intValue();
                    C5745 c5745 = (C5745) next.f14522.get(iIntValue);
                    C5745 c57452 = (C5745) c5706.f14522.get(iIntValue);
                    if (c5745 != null) {
                        if (!AbstractC5227.m9466(c57452, c5745)) {
                            c5745 = null;
                        }
                        c57452 = c5745;
                    } else if (c57452 == null || !AbstractC5227.m9466(c5745, c57452)) {
                        c57452 = null;
                    }
                    if (c57452 != null) {
                        arrayList5.add(c57452);
                    }
                }
                next = C5707.m10326(arrayList5);
            }
        }
        C5706 c57062 = (C5706) next;
        if (linkedHashSet.size() == 1) {
            abstractC5710M10334 = (AbstractC5710) AbstractC5176.m9339(linkedHashSet);
        } else {
            ArrayList arrayListM10159 = m10159(linkedHashSet, new C0390x702eebb8(this));
            arrayListM10159.isEmpty();
            AbstractC5710 abstractC5710M10051 = AbstractC5597.m10051(arrayListM10159);
            if (abstractC5710M10051 != null) {
                abstractC5710M10334 = abstractC5710M10051;
            } else {
                InterfaceC5688.f14483.getClass();
                ArrayList arrayListM101592 = m10159(arrayListM10159, new C0391xc97d8c34(C5695.f14494));
                arrayListM101592.isEmpty();
                abstractC5710M10334 = arrayListM101592.size() < 2 ? (AbstractC5710) AbstractC5176.m9339(arrayListM101592) : new C5715(linkedHashSet).m10334();
            }
        }
        return abstractC5710M10334.mo10329(c57062);
    }
}
