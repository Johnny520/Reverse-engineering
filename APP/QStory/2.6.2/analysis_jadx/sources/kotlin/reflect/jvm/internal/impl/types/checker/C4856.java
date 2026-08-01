package kotlin.reflect.jvm.internal.impl.types.checker;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.collections.AbstractC4343;
import kotlin.collections.AbstractC4344;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.reflect.jvm.internal.impl.resolve.constants.AbstractC4764;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4877;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4881;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4892;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4913;
import kotlin.reflect.jvm.internal.impl.types.C4873;
import kotlin.reflect.jvm.internal.impl.types.C4874;
import kotlin.reflect.jvm.internal.impl.types.C4882;
import kotlin.reflect.jvm.internal.impl.types.C4890;
import kotlin.reflect.jvm.internal.impl.types.C4912;
import p052.InterfaceC6553;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.types.checker.飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4856 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C4856 f14135 = new C4856();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static ArrayList m9610(AbstractCollection abstractCollection, InterfaceC6553 interfaceC6553) {
        ArrayList arrayList = new ArrayList(abstractCollection);
        Iterator it = arrayList.iterator();
        it.getClass();
        while (it.hasNext()) {
            AbstractC4877 abstractC4877 = (AbstractC4877) it.next();
            if (!arrayList.isEmpty()) {
                Iterator it2 = arrayList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    AbstractC4877 abstractC48772 = (AbstractC4877) it2.next();
                    if (abstractC48772 != abstractC4877) {
                        abstractC48772.getClass();
                        abstractC4877.getClass();
                        if (((Boolean) interfaceC6553.invoke(abstractC48772, abstractC4877)).booleanValue()) {
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
    public final AbstractC4877 m9611(ArrayList arrayList) {
        AbstractC4877 abstractC4877M9781;
        arrayList.size();
        ArrayList<AbstractC4877> arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AbstractC4877 abstractC4877 = (AbstractC4877) it.next();
            if (abstractC4877.mo9732() instanceof C4882) {
                Collection collectionMo9504 = abstractC4877.mo9732().mo9504();
                collectionMo9504.getClass();
                Collection<AbstractC4881> collection = collectionMo9504;
                ArrayList arrayList3 = new ArrayList(AbstractC4344.m8832(collection, 10));
                for (AbstractC4881 abstractC4881 : collection) {
                    abstractC4881.getClass();
                    AbstractC4877 abstractC4877M9813 = AbstractC4892.m9813(abstractC4881);
                    if (abstractC4877.mo9735()) {
                        abstractC4877M9813 = abstractC4877M9813.mo9741(true);
                    }
                    arrayList3.add(abstractC4877M9813);
                }
                arrayList2.addAll(arrayList3);
            } else {
                arrayList2.add(abstractC4877);
            }
        }
        TypeIntersector$ResultNullability typeIntersector$ResultNullabilityCombine = TypeIntersector$ResultNullability.START;
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            typeIntersector$ResultNullabilityCombine = typeIntersector$ResultNullabilityCombine.combine((AbstractC4913) it2.next());
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (AbstractC4877 abstractC4877Mo9741 : arrayList2) {
            if (typeIntersector$ResultNullabilityCombine == TypeIntersector$ResultNullability.NOT_NULL) {
                if (abstractC4877Mo9741 instanceof C4863) {
                    C4863 c4863 = (C4863) abstractC4877Mo9741;
                    abstractC4877Mo9741 = new C4863(c4863.f14151, c4863.f14152, c4863.f14148, c4863.f14147, c4863.f14149, true);
                }
                abstractC4877Mo9741.getClass();
                AbstractC4877 abstractC4877M9795 = C4890.m9795(abstractC4877Mo9741, false);
                abstractC4877Mo9741 = (abstractC4877M9795 == null && (abstractC4877M9795 = AbstractC4892.m9826(abstractC4877Mo9741)) == null) ? abstractC4877Mo9741.mo9741(false) : abstractC4877M9795;
            }
            linkedHashSet.add(abstractC4877Mo9741);
        }
        ArrayList arrayList4 = new ArrayList(AbstractC4344.m8832(arrayList, 10));
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            arrayList4.add(((AbstractC4877) it3.next()).mo9733());
        }
        Iterator it4 = arrayList4.iterator();
        if (!it4.hasNext()) {
            C5919.m11247("Empty collection can't be reduced.");
            return null;
        }
        Object next = it4.next();
        while (it4.hasNext()) {
            C4873 c4873 = (C4873) it4.next();
            next = (C4873) next;
            next.getClass();
            C4874 c4874 = C4873.f14171;
            c4873.getClass();
            if (!next.isEmpty() || !c4873.isEmpty()) {
                ArrayList arrayList5 = new ArrayList();
                Collection collectionValues = c4874.f14174.values();
                collectionValues.getClass();
                Iterator it5 = collectionValues.iterator();
                while (it5.hasNext()) {
                    int iIntValue = ((Number) it5.next()).intValue();
                    C4912 c4912 = (C4912) next.f14173.get(iIntValue);
                    C4912 c49122 = (C4912) c4873.f14173.get(iIntValue);
                    if (c4912 != null) {
                        if (!AbstractC4394.m8917(c49122, c4912)) {
                            c4912 = null;
                        }
                        c49122 = c4912;
                    } else if (c49122 == null || !AbstractC4394.m8917(c4912, c49122)) {
                        c49122 = null;
                    }
                    if (c49122 != null) {
                        arrayList5.add(c49122);
                    }
                }
                next = C4874.m9773(arrayList5);
            }
        }
        C4873 c48732 = (C4873) next;
        if (linkedHashSet.size() == 1) {
            abstractC4877M9781 = (AbstractC4877) AbstractC4343.m8822(linkedHashSet);
        } else {
            ArrayList arrayListM9610 = m9610(linkedHashSet, new TypeIntersector$intersectTypesWithoutIntersectionType$filteredEqualTypes$1(this));
            arrayListM9610.isEmpty();
            AbstractC4877 abstractC4877M9502 = AbstractC4764.m9502(arrayListM9610);
            if (abstractC4877M9502 != null) {
                abstractC4877M9781 = abstractC4877M9502;
            } else {
                InterfaceC4855.f14134.getClass();
                ArrayList arrayListM96102 = m9610(arrayListM9610, new TypeIntersector$intersectTypesWithoutIntersectionType$filteredSuperAndEqualTypes$1(C4862.f14145));
                arrayListM96102.isEmpty();
                abstractC4877M9781 = arrayListM96102.size() < 2 ? (AbstractC4877) AbstractC4343.m8822(arrayListM96102) : new C4882(linkedHashSet).m9781();
            }
        }
        return abstractC4877M9781.mo9776(c48732);
    }
}
