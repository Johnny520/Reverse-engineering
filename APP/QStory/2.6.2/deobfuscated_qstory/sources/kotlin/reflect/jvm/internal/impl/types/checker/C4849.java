package kotlin.reflect.jvm.internal.impl.types.checker;

import io.ktor.util.C4210;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.collections.AbstractC4344;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4462;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4869;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4877;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4881;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4892;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4895;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4913;
import kotlin.reflect.jvm.internal.impl.types.C4882;
import kotlin.reflect.jvm.internal.impl.types.InterfaceC4872;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus;
import p069.C6894;
import p097.InterfaceC7219;
import p175.AbstractC7738;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.types.checker.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4849 extends AbstractC4892 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C4849 f14128 = new C4849();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [kotlin.reflect.jvm.internal.impl.types.飘花落叶言子世楪苏哲兰] */
    /* JADX WARN: Type inference failed for: r0v2, types: [kotlin.reflect.jvm.internal.impl.types.飘花落叶言子世楪苏哲兰] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r4v0, types: [kotlin.reflect.jvm.internal.impl.descriptors.飘花落叶言子世哲苏兰楪] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public static AbstractC4877 m9597(AbstractC4877 abstractC4877) {
        AbstractC4881 abstractC4881Mo9751;
        InterfaceC4872 interfaceC4872Mo9732 = abstractC4877.mo9732();
        boolean z = false;
        ?? r4 = 0;
        if (interfaceC4872Mo9732 instanceof C6894) {
            C6894 c6894 = (C6894) interfaceC4872Mo9732;
            AbstractC4869 abstractC4869 = c6894.f18355;
            AbstractC4869 abstractC48692 = abstractC4869.mo9752() == Variance.IN_VARIANCE ? abstractC4869 : null;
            AbstractC4913 abstractC4913Mo9778 = (abstractC48692 == null || (abstractC4881Mo9751 = abstractC48692.mo9751()) == null) ? null : abstractC4881Mo9751.mo9778();
            if (c6894.f18354 == null) {
                Collection collectionMo9504 = c6894.mo9504();
                ArrayList arrayList = new ArrayList(AbstractC4344.m8832(collectionMo9504, 10));
                Iterator it = collectionMo9504.iterator();
                while (it.hasNext()) {
                    arrayList.add(((AbstractC4881) it.next()).mo9778());
                }
                c6894.f18354 = new C4861(abstractC4869, new C4864(0, arrayList), (InterfaceC4462) r4, 8);
            }
            CaptureStatus captureStatus = CaptureStatus.FOR_SUBTYPING;
            C4861 c4861 = c6894.f18354;
            c4861.getClass();
            return new C4863(captureStatus, c4861, abstractC4913Mo9778, abstractC4877.mo9733(), abstractC4877.mo9735(), 32);
        }
        if (!(interfaceC4872Mo9732 instanceof C4882) || !abstractC4877.mo9735()) {
            return abstractC4877;
        }
        ?? r0 = (C4882) interfaceC4872Mo9732;
        LinkedHashSet linkedHashSet = r0.f14188;
        ArrayList arrayList2 = new ArrayList(AbstractC4344.m8832(linkedHashSet, 10));
        Iterator it2 = linkedHashSet.iterator();
        while (it2.hasNext()) {
            arrayList2.add(AbstractC7738.m13037((AbstractC4881) it2.next()));
            z = true;
        }
        if (z) {
            AbstractC4881 abstractC4881 = r0.f14190;
            AbstractC4913 abstractC4913M13037 = abstractC4881 != null ? AbstractC7738.m13037(abstractC4881) : null;
            arrayList2.isEmpty();
            LinkedHashSet linkedHashSet2 = new LinkedHashSet(arrayList2);
            linkedHashSet2.hashCode();
            C4882 c4882 = new C4882(linkedHashSet2);
            c4882.f14190 = abstractC4913M13037;
            r4 = c4882;
        }
        if (r4 != 0) {
            r0 = r4;
        }
        return r0.m9781();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4892
    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final AbstractC4913 mo9599(InterfaceC7219 interfaceC7219) {
        AbstractC4913 abstractC4913M9815;
        interfaceC7219.getClass();
        if (!(interfaceC7219 instanceof AbstractC4881)) {
            C5919.m11249("Failed requirement.");
            return null;
        }
        AbstractC4913 abstractC4913Mo9778 = ((AbstractC4881) interfaceC7219).mo9778();
        if (abstractC4913Mo9778 instanceof AbstractC4877) {
            abstractC4913M9815 = m9597((AbstractC4877) abstractC4913Mo9778);
        } else {
            if (!(abstractC4913Mo9778 instanceof AbstractC4895)) {
                C4210.m8621();
                return null;
            }
            AbstractC4895 abstractC4895 = (AbstractC4895) abstractC4913Mo9778;
            AbstractC4877 abstractC4877 = abstractC4895.f14213;
            AbstractC4877 abstractC48772 = abstractC4895.f14212;
            AbstractC4877 abstractC4877M9597 = m9597(abstractC48772);
            AbstractC4877 abstractC4877M95972 = m9597(abstractC4877);
            abstractC4913M9815 = (abstractC4877M9597 == abstractC48772 && abstractC4877M95972 == abstractC4877) ? abstractC4913Mo9778 : AbstractC4892.m9815(abstractC4877M9597, abstractC4877M95972);
        }
        KotlinTypePreparator$prepareType$1 kotlinTypePreparator$prepareType$1 = new KotlinTypePreparator$prepareType$1(this);
        AbstractC4881 abstractC4881M9814 = AbstractC4892.m9814(abstractC4913Mo9778);
        return AbstractC4892.m9811(abstractC4913M9815, abstractC4881M9814 != null ? (AbstractC4881) kotlinTypePreparator$prepareType$1.invoke((Object) abstractC4881M9814) : null);
    }
}
