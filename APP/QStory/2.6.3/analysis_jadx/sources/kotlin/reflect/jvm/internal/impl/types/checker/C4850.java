package kotlin.reflect.jvm.internal.impl.types.checker;

import com.alibaba.fastjson2.AbstractC2905;
import io.ktor.util.C4211;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.collections.AbstractC4345;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4463;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4870;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4878;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4882;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4893;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4896;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4914;
import kotlin.reflect.jvm.internal.impl.types.C4883;
import kotlin.reflect.jvm.internal.impl.types.InterfaceC4873;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus;
import p069.C6895;
import p097.InterfaceC7220;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.types.checker.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4850 extends AbstractC4893 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C4850 f14132 = new C4850();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [kotlin.reflect.jvm.internal.impl.types.飘花落叶言子世楪苏哲兰] */
    /* JADX WARN: Type inference failed for: r0v2, types: [kotlin.reflect.jvm.internal.impl.types.飘花落叶言子世楪苏哲兰] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r4v0, types: [kotlin.reflect.jvm.internal.impl.descriptors.飘花落叶言子世哲苏兰楪] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public static AbstractC4878 m9587(AbstractC4878 abstractC4878) {
        AbstractC4882 abstractC4882Mo9741;
        InterfaceC4873 interfaceC4873Mo9722 = abstractC4878.mo9722();
        boolean z = false;
        ?? r4 = 0;
        if (interfaceC4873Mo9722 instanceof C6895) {
            C6895 c6895 = (C6895) interfaceC4873Mo9722;
            AbstractC4870 abstractC4870 = c6895.f18350;
            AbstractC4870 abstractC48702 = abstractC4870.mo9742() == Variance.IN_VARIANCE ? abstractC4870 : null;
            AbstractC4914 abstractC4914Mo9772 = (abstractC48702 == null || (abstractC4882Mo9741 = abstractC48702.mo9741()) == null) ? null : abstractC4882Mo9741.mo9772();
            if (c6895.f18349 == null) {
                Collection collectionMo9494 = c6895.mo9494();
                ArrayList arrayList = new ArrayList(AbstractC4345.m8822(collectionMo9494, 10));
                Iterator it = collectionMo9494.iterator();
                while (it.hasNext()) {
                    arrayList.add(((AbstractC4882) it.next()).mo9772());
                }
                c6895.f18349 = new C4862(abstractC4870, new C4865(0, arrayList), (InterfaceC4463) r4, 8);
            }
            CaptureStatus captureStatus = CaptureStatus.FOR_SUBTYPING;
            C4862 c4862 = c6895.f18349;
            c4862.getClass();
            return new C4864(captureStatus, c4862, abstractC4914Mo9772, abstractC4878.mo9723(), abstractC4878.mo9725(), 32);
        }
        if (!(interfaceC4873Mo9722 instanceof C4883) || !abstractC4878.mo9725()) {
            return abstractC4878;
        }
        ?? r0 = (C4883) interfaceC4873Mo9722;
        LinkedHashSet linkedHashSet = r0.f14192;
        ArrayList arrayList2 = new ArrayList(AbstractC4345.m8822(linkedHashSet, 10));
        Iterator it2 = linkedHashSet.iterator();
        while (it2.hasNext()) {
            arrayList2.add(AbstractC2905.m6289((AbstractC4882) it2.next()));
            z = true;
        }
        if (z) {
            AbstractC4882 abstractC4882 = r0.f14194;
            AbstractC4914 abstractC4914M6289 = abstractC4882 != null ? AbstractC2905.m6289(abstractC4882) : null;
            arrayList2.isEmpty();
            LinkedHashSet linkedHashSet2 = new LinkedHashSet(arrayList2);
            linkedHashSet2.hashCode();
            C4883 c4883 = new C4883(linkedHashSet2);
            c4883.f14194 = abstractC4914M6289;
            r4 = c4883;
        }
        if (r4 != 0) {
            r0 = r4;
        }
        return r0.m9775();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4893
    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final AbstractC4914 mo9589(InterfaceC7220 interfaceC7220) {
        AbstractC4914 abstractC4914M9809;
        interfaceC7220.getClass();
        if (!(interfaceC7220 instanceof AbstractC4882)) {
            C5925.m11310("Failed requirement.");
            return null;
        }
        AbstractC4914 abstractC4914Mo9772 = ((AbstractC4882) interfaceC7220).mo9772();
        if (abstractC4914Mo9772 instanceof AbstractC4878) {
            abstractC4914M9809 = m9587((AbstractC4878) abstractC4914Mo9772);
        } else {
            if (!(abstractC4914Mo9772 instanceof AbstractC4896)) {
                C4211.m8611();
                return null;
            }
            AbstractC4896 abstractC4896 = (AbstractC4896) abstractC4914Mo9772;
            AbstractC4878 abstractC4878 = abstractC4896.f14217;
            AbstractC4878 abstractC48782 = abstractC4896.f14216;
            AbstractC4878 abstractC4878M9587 = m9587(abstractC48782);
            AbstractC4878 abstractC4878M95872 = m9587(abstractC4878);
            abstractC4914M9809 = (abstractC4878M9587 == abstractC48782 && abstractC4878M95872 == abstractC4878) ? abstractC4914Mo9772 : AbstractC4893.m9809(abstractC4878M9587, abstractC4878M95872);
        }
        KotlinTypePreparator$prepareType$1 kotlinTypePreparator$prepareType$1 = new KotlinTypePreparator$prepareType$1(this);
        AbstractC4882 abstractC4882M9808 = AbstractC4893.m9808(abstractC4914Mo9772);
        return AbstractC4893.m9805(abstractC4914M9809, abstractC4882M9808 != null ? (AbstractC4882) kotlinTypePreparator$prepareType$1.invoke((Object) abstractC4882M9808) : null);
    }
}
