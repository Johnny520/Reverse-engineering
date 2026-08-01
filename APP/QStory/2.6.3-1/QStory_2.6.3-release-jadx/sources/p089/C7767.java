package p089;

import androidx.compose.animation.core.C1171;
import androidx.compose.foundation.text.C1850;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.AbstractC6019;
import kotlin.InterfaceC6016;
import kotlin.LazyThreadSafetyMode;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.C5242;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5295;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5309;
import kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType;
import kotlin.reflect.jvm.internal.impl.load.java.C5442;
import kotlin.reflect.jvm.internal.impl.load.java.C5452;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.C5409;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5710;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5714;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5728;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5749;
import kotlin.reflect.jvm.internal.impl.types.checker.AbstractC5692;
import p062.InterfaceC7308;
import p082.AbstractC7699;
import p095.AbstractC7818;
import p099.C7870;
import p113.InterfaceC8049;
import p113.InterfaceC8057;
import p114.C8068;

/* JADX INFO: renamed from: 飘花落叶言世楪哲子苏兰.飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7767 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final boolean f18850;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final AnnotationQualifierApplicabilityType f18851;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C1171 f18852;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final boolean f18853;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC7308 f18854;

    public C7767(InterfaceC7308 interfaceC7308, boolean z, C1171 c1171, AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType, boolean z2) {
        c1171.getClass();
        annotationQualifierApplicabilityType.getClass();
        this.f18854 = interfaceC7308;
        this.f18853 = z;
        this.f18852 = c1171;
        this.f18851 = annotationQualifierApplicabilityType;
        this.f18850 = z2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static NullabilityQualifier m12791(InterfaceC8049 interfaceC8049) {
        AbstractC5710 abstractC5710M10265;
        AbstractC5710 abstractC5710M102652;
        interfaceC8049.getClass();
        AbstractC5728 abstractC5728M10266 = AbstractC5692.m10266(interfaceC8049);
        if (abstractC5728M10266 == null || (abstractC5710M10265 = AbstractC5692.m10226(abstractC5728M10266)) == null) {
            abstractC5710M10265 = AbstractC5692.m10265(interfaceC8049);
            abstractC5710M10265.getClass();
        }
        if (AbstractC5692.m10242(abstractC5710M10265)) {
            return NullabilityQualifier.NULLABLE;
        }
        AbstractC5728 abstractC5728M102662 = AbstractC5692.m10266(interfaceC8049);
        if (abstractC5728M102662 == null || (abstractC5710M102652 = AbstractC5692.m10276(abstractC5728M102662)) == null) {
            abstractC5710M102652 = AbstractC5692.m10265(interfaceC8049);
            abstractC5710M102652.getClass();
        }
        if (AbstractC5692.m10242(abstractC5710M102652)) {
            return null;
        }
        return NullabilityQualifier.NOT_NULL;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static MutabilityQualifier m12792(InterfaceC8049 interfaceC8049) {
        AbstractC5710 abstractC5710M10265;
        AbstractC5710 abstractC5710M102652;
        String str = C5242.f13332;
        interfaceC8049.getClass();
        AbstractC5728 abstractC5728M10266 = AbstractC5692.m10266(interfaceC8049);
        if (abstractC5728M10266 == null || (abstractC5710M10265 = AbstractC5692.m10226(abstractC5728M10266)) == null) {
            abstractC5710M10265 = AbstractC5692.m10265(interfaceC8049);
            abstractC5710M10265.getClass();
        }
        C8068 c8068 = AbstractC5749.f14592;
        InterfaceC5309 interfaceC5309Mo9770 = abstractC5710M10265.mo10281().mo9770();
        AbstractC7818 abstractC7818 = interfaceC5309Mo9770 instanceof AbstractC7818 ? (AbstractC7818) interfaceC5309Mo9770 : null;
        if (C5242.f13338.containsKey(abstractC7818 != null ? AbstractC7699.m12660(abstractC7818) : null)) {
            return MutabilityQualifier.READ_ONLY;
        }
        AbstractC5728 abstractC5728M102662 = AbstractC5692.m10266(interfaceC8049);
        if (abstractC5728M102662 == null || (abstractC5710M102652 = AbstractC5692.m10276(abstractC5728M102662)) == null) {
            abstractC5710M102652 = AbstractC5692.m10265(interfaceC8049);
            abstractC5710M102652.getClass();
        }
        InterfaceC5309 interfaceC5309Mo97702 = abstractC5710M102652.mo10281().mo9770();
        AbstractC7818 abstractC78182 = interfaceC5309Mo97702 instanceof AbstractC7818 ? (AbstractC7818) interfaceC5309Mo97702 : null;
        if (C5242.f13341.containsKey(abstractC78182 != null ? AbstractC7699.m12660(abstractC78182) : null)) {
            return MutabilityQualifier.MUTABLE;
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static void m12793(Object obj, ArrayList arrayList, C1850 c1850) {
        arrayList.add(obj);
        Iterable iterable = (Iterable) c1850.invoke(obj);
        if (iterable != null) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                m12793(it.next(), arrayList, c1850);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final ArrayList m12794(InterfaceC8049 interfaceC8049) {
        C1171 c1171 = this.f18852;
        C5452 c5452 = (C5452) ((InterfaceC6016) c1171.f1439).getValue();
        C5442 c5442 = ((C7870) c1171.f1440).f19248;
        interfaceC8049.getClass();
        C7757 c7757 = new C7757(interfaceC8049, C5442.m9777(c5442, c5452, ((AbstractC5714) interfaceC8049).getAnnotations()), null);
        C1850 c1850 = new C1850(this, 22);
        ArrayList arrayList = new ArrayList(1);
        m12793(c7757, arrayList, c1850);
        return arrayList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C7760 m12795(InterfaceC8057 interfaceC8057) {
        List list;
        NullabilityQualifier nullabilityQualifier;
        interfaceC8057.getClass();
        if (!(interfaceC8057 instanceof C5409)) {
            return null;
        }
        List upperBounds = ((InterfaceC5295) interfaceC8057).getUpperBounds();
        upperBounds.getClass();
        if (upperBounds.isEmpty()) {
            return null;
        }
        Iterator it = upperBounds.iterator();
        while (it.hasNext()) {
            if (!AbstractC5692.m10246((InterfaceC8049) it.next())) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : upperBounds) {
                    if (m12791((InterfaceC8049) obj) != null) {
                        arrayList.add(obj);
                    }
                }
                InterfaceC6016 interfaceC6016M10774 = AbstractC6019.m10774(LazyThreadSafetyMode.NONE, new C7759(upperBounds, this));
                if (!arrayList.isEmpty()) {
                    if (!arrayList.isEmpty()) {
                        Iterator it2 = arrayList.iterator();
                        if (it2.hasNext()) {
                            ((InterfaceC8049) it2.next()).getClass();
                            list = upperBounds;
                        }
                    }
                    return new C7760(NullabilityQualifier.FORCE_FLEXIBILITY, false);
                }
                if (((List) interfaceC6016M10774.getValue()).isEmpty()) {
                    return null;
                }
                List list2 = (List) interfaceC6016M10774.getValue();
                if (list2 == null || !list2.isEmpty()) {
                    Iterator it3 = list2.iterator();
                    if (it3.hasNext()) {
                        ((InterfaceC8049) it3.next()).getClass();
                        list = (List) interfaceC6016M10774.getValue();
                    }
                }
                return new C7760(NullabilityQualifier.FORCE_FLEXIBILITY, true);
                if (list == null || !list.isEmpty()) {
                    Iterator it4 = list.iterator();
                    while (it4.hasNext()) {
                        if (!AbstractC5692.m10232((InterfaceC8049) it4.next())) {
                            nullabilityQualifier = NullabilityQualifier.NOT_NULL;
                            break;
                        }
                    }
                    nullabilityQualifier = NullabilityQualifier.NULLABLE;
                } else {
                    nullabilityQualifier = NullabilityQualifier.NULLABLE;
                }
                return new C7760(nullabilityQualifier, list != upperBounds);
            }
        }
        return null;
    }
}
