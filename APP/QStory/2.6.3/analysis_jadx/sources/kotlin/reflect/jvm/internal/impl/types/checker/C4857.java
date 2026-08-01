package kotlin.reflect.jvm.internal.impl.types.checker;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.collections.AbstractC4344;
import kotlin.collections.AbstractC4345;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.reflect.jvm.internal.impl.resolve.constants.AbstractC4765;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4878;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4882;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4893;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4914;
import kotlin.reflect.jvm.internal.impl.types.C4874;
import kotlin.reflect.jvm.internal.impl.types.C4875;
import kotlin.reflect.jvm.internal.impl.types.C4883;
import kotlin.reflect.jvm.internal.impl.types.C4891;
import kotlin.reflect.jvm.internal.impl.types.C4913;
import p052.InterfaceC6554;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.types.checker.飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4857 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C4857 f14139 = new C4857();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static ArrayList m9600(AbstractCollection abstractCollection, InterfaceC6554 interfaceC6554) {
        ArrayList arrayList = new ArrayList(abstractCollection);
        Iterator it = arrayList.iterator();
        it.getClass();
        while (it.hasNext()) {
            AbstractC4878 abstractC4878 = (AbstractC4878) it.next();
            if (!arrayList.isEmpty()) {
                Iterator it2 = arrayList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    AbstractC4878 abstractC48782 = (AbstractC4878) it2.next();
                    if (abstractC48782 != abstractC4878) {
                        abstractC48782.getClass();
                        abstractC4878.getClass();
                        if (((Boolean) interfaceC6554.invoke(abstractC48782, abstractC4878)).booleanValue()) {
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
    public final AbstractC4878 m9601(ArrayList arrayList) {
        AbstractC4878 abstractC4878M9775;
        arrayList.size();
        ArrayList<AbstractC4878> arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AbstractC4878 abstractC4878 = (AbstractC4878) it.next();
            if (abstractC4878.mo9722() instanceof C4883) {
                Collection collectionMo9494 = abstractC4878.mo9722().mo9494();
                collectionMo9494.getClass();
                Collection<AbstractC4882> collection = collectionMo9494;
                ArrayList arrayList3 = new ArrayList(AbstractC4345.m8822(collection, 10));
                for (AbstractC4882 abstractC4882 : collection) {
                    abstractC4882.getClass();
                    AbstractC4878 abstractC4878M9807 = AbstractC4893.m9807(abstractC4882);
                    if (abstractC4878.mo9725()) {
                        abstractC4878M9807 = abstractC4878M9807.mo9731(true);
                    }
                    arrayList3.add(abstractC4878M9807);
                }
                arrayList2.addAll(arrayList3);
            } else {
                arrayList2.add(abstractC4878);
            }
        }
        TypeIntersector$ResultNullability typeIntersector$ResultNullabilityCombine = TypeIntersector$ResultNullability.START;
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            typeIntersector$ResultNullabilityCombine = typeIntersector$ResultNullabilityCombine.combine((AbstractC4914) it2.next());
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (AbstractC4878 abstractC4878Mo9731 : arrayList2) {
            if (typeIntersector$ResultNullabilityCombine == TypeIntersector$ResultNullability.NOT_NULL) {
                if (abstractC4878Mo9731 instanceof C4864) {
                    C4864 c4864 = (C4864) abstractC4878Mo9731;
                    abstractC4878Mo9731 = new C4864(c4864.f14155, c4864.f14156, c4864.f14152, c4864.f14151, c4864.f14153, true);
                }
                abstractC4878Mo9731.getClass();
                AbstractC4878 abstractC4878M9789 = C4891.m9789(abstractC4878Mo9731, false);
                abstractC4878Mo9731 = (abstractC4878M9789 == null && (abstractC4878M9789 = AbstractC4893.m9820(abstractC4878Mo9731)) == null) ? abstractC4878Mo9731.mo9731(false) : abstractC4878M9789;
            }
            linkedHashSet.add(abstractC4878Mo9731);
        }
        ArrayList arrayList4 = new ArrayList(AbstractC4345.m8822(arrayList, 10));
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            arrayList4.add(((AbstractC4878) it3.next()).mo9723());
        }
        Iterator it4 = arrayList4.iterator();
        if (!it4.hasNext()) {
            C5925.m11308("Empty collection can't be reduced.");
            return null;
        }
        Object next = it4.next();
        while (it4.hasNext()) {
            C4874 c4874 = (C4874) it4.next();
            next = (C4874) next;
            next.getClass();
            C4875 c4875 = C4874.f14175;
            c4874.getClass();
            if (!next.isEmpty() || !c4874.isEmpty()) {
                ArrayList arrayList5 = new ArrayList();
                Collection collectionValues = c4875.f14178.values();
                collectionValues.getClass();
                Iterator it5 = collectionValues.iterator();
                while (it5.hasNext()) {
                    int iIntValue = ((Number) it5.next()).intValue();
                    C4913 c4913 = (C4913) next.f14177.get(iIntValue);
                    C4913 c49132 = (C4913) c4874.f14177.get(iIntValue);
                    if (c4913 != null) {
                        if (!AbstractC4395.m8907(c49132, c4913)) {
                            c4913 = null;
                        }
                        c49132 = c4913;
                    } else if (c49132 == null || !AbstractC4395.m8907(c4913, c49132)) {
                        c49132 = null;
                    }
                    if (c49132 != null) {
                        arrayList5.add(c49132);
                    }
                }
                next = C4875.m9767(arrayList5);
            }
        }
        C4874 c48742 = (C4874) next;
        if (linkedHashSet.size() == 1) {
            abstractC4878M9775 = (AbstractC4878) AbstractC4344.m8780(linkedHashSet);
        } else {
            ArrayList arrayListM9600 = m9600(linkedHashSet, new TypeIntersector$intersectTypesWithoutIntersectionType$filteredEqualTypes$1(this));
            arrayListM9600.isEmpty();
            AbstractC4878 abstractC4878M9492 = AbstractC4765.m9492(arrayListM9600);
            if (abstractC4878M9492 != null) {
                abstractC4878M9775 = abstractC4878M9492;
            } else {
                InterfaceC4856.f14138.getClass();
                ArrayList arrayListM96002 = m9600(arrayListM9600, new TypeIntersector$intersectTypesWithoutIntersectionType$filteredSuperAndEqualTypes$1(C4863.f14149));
                arrayListM96002.isEmpty();
                abstractC4878M9775 = arrayListM96002.size() < 2 ? (AbstractC4878) AbstractC4344.m8780(arrayListM96002) : new C4883(linkedHashSet).m9775();
            }
        }
        return abstractC4878M9775.mo9770(c48742);
    }
}
