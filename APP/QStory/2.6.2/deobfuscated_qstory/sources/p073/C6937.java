package p073;

import androidx.compose.animation.core.C0325;
import androidx.compose.foundation.text.C1012;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.AbstractC5186;
import kotlin.InterfaceC5183;
import kotlin.LazyThreadSafetyMode;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.C4409;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4462;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4476;
import kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType;
import kotlin.reflect.jvm.internal.impl.load.java.C4609;
import kotlin.reflect.jvm.internal.impl.load.java.C4619;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.C4576;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4877;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4881;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4895;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4916;
import kotlin.reflect.jvm.internal.impl.types.checker.AbstractC4859;
import p046.InterfaceC6478;
import p066.AbstractC6869;
import p079.AbstractC6988;
import p083.C7040;
import p097.InterfaceC7219;
import p097.InterfaceC7227;
import p098.C7238;

/* JADX INFO: renamed from: 飘花落叶言世楪哲子苏兰.飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6937 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final boolean f18510;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final AnnotationQualifierApplicabilityType f18511;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C0325 f18512;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final boolean f18513;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC6478 f18514;

    public C6937(InterfaceC6478 interfaceC6478, boolean z, C0325 c0325, AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType, boolean z2) {
        c0325.getClass();
        annotationQualifierApplicabilityType.getClass();
        this.f18514 = interfaceC6478;
        this.f18513 = z;
        this.f18512 = c0325;
        this.f18511 = annotationQualifierApplicabilityType;
        this.f18510 = z2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static NullabilityQualifier m12204(InterfaceC7219 interfaceC7219) {
        AbstractC4877 abstractC4877M9716;
        AbstractC4877 abstractC4877M97162;
        interfaceC7219.getClass();
        AbstractC4895 abstractC4895M9717 = AbstractC4859.m9717(interfaceC7219);
        if (abstractC4895M9717 == null || (abstractC4877M9716 = AbstractC4859.m9677(abstractC4895M9717)) == null) {
            abstractC4877M9716 = AbstractC4859.m9716(interfaceC7219);
            abstractC4877M9716.getClass();
        }
        if (AbstractC4859.m9693(abstractC4877M9716)) {
            return NullabilityQualifier.NULLABLE;
        }
        AbstractC4895 abstractC4895M97172 = AbstractC4859.m9717(interfaceC7219);
        if (abstractC4895M97172 == null || (abstractC4877M97162 = AbstractC4859.m9727(abstractC4895M97172)) == null) {
            abstractC4877M97162 = AbstractC4859.m9716(interfaceC7219);
            abstractC4877M97162.getClass();
        }
        if (AbstractC4859.m9693(abstractC4877M97162)) {
            return null;
        }
        return NullabilityQualifier.NOT_NULL;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static MutabilityQualifier m12205(InterfaceC7219 interfaceC7219) {
        AbstractC4877 abstractC4877M9716;
        AbstractC4877 abstractC4877M97162;
        String str = C4409.f12983;
        interfaceC7219.getClass();
        AbstractC4895 abstractC4895M9717 = AbstractC4859.m9717(interfaceC7219);
        if (abstractC4895M9717 == null || (abstractC4877M9716 = AbstractC4859.m9677(abstractC4895M9717)) == null) {
            abstractC4877M9716 = AbstractC4859.m9716(interfaceC7219);
            abstractC4877M9716.getClass();
        }
        C7238 c7238 = AbstractC4916.f14243;
        InterfaceC4476 interfaceC4476Mo9221 = abstractC4877M9716.mo9732().mo9221();
        AbstractC6988 abstractC6988 = interfaceC4476Mo9221 instanceof AbstractC6988 ? (AbstractC6988) interfaceC4476Mo9221 : null;
        if (C4409.f12989.containsKey(abstractC6988 != null ? AbstractC6869.m12073(abstractC6988) : null)) {
            return MutabilityQualifier.READ_ONLY;
        }
        AbstractC4895 abstractC4895M97172 = AbstractC4859.m9717(interfaceC7219);
        if (abstractC4895M97172 == null || (abstractC4877M97162 = AbstractC4859.m9727(abstractC4895M97172)) == null) {
            abstractC4877M97162 = AbstractC4859.m9716(interfaceC7219);
            abstractC4877M97162.getClass();
        }
        InterfaceC4476 interfaceC4476Mo92212 = abstractC4877M97162.mo9732().mo9221();
        AbstractC6988 abstractC69882 = interfaceC4476Mo92212 instanceof AbstractC6988 ? (AbstractC6988) interfaceC4476Mo92212 : null;
        if (C4409.f12992.containsKey(abstractC69882 != null ? AbstractC6869.m12073(abstractC69882) : null)) {
            return MutabilityQualifier.MUTABLE;
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static void m12206(Object obj, ArrayList arrayList, C1012 c1012) {
        arrayList.add(obj);
        Iterable iterable = (Iterable) c1012.invoke(obj);
        if (iterable != null) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                m12206(it.next(), arrayList, c1012);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final ArrayList m12207(InterfaceC7219 interfaceC7219) {
        C0325 c0325 = this.f18512;
        C4619 c4619 = (C4619) ((InterfaceC5183) c0325.f1094).getValue();
        C4609 c4609 = ((C7040) c0325.f1095).f18908;
        interfaceC7219.getClass();
        C6927 c6927 = new C6927(interfaceC7219, C4609.m9228(c4609, c4619, ((AbstractC4881) interfaceC7219).getAnnotations()), null);
        C1012 c1012 = new C1012(this, 22);
        ArrayList arrayList = new ArrayList(1);
        m12206(c6927, arrayList, c1012);
        return arrayList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C6930 m12208(InterfaceC7227 interfaceC7227) {
        List list;
        NullabilityQualifier nullabilityQualifier;
        interfaceC7227.getClass();
        if (!(interfaceC7227 instanceof C4576)) {
            return null;
        }
        List upperBounds = ((InterfaceC4462) interfaceC7227).getUpperBounds();
        upperBounds.getClass();
        if (upperBounds.isEmpty()) {
            return null;
        }
        Iterator it = upperBounds.iterator();
        while (it.hasNext()) {
            if (!AbstractC4859.m9697((InterfaceC7219) it.next())) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : upperBounds) {
                    if (m12204((InterfaceC7219) obj) != null) {
                        arrayList.add(obj);
                    }
                }
                InterfaceC5183 interfaceC5183M10211 = AbstractC5186.m10211(LazyThreadSafetyMode.NONE, new C6929(upperBounds, this));
                if (!arrayList.isEmpty()) {
                    if (!arrayList.isEmpty()) {
                        Iterator it2 = arrayList.iterator();
                        if (it2.hasNext()) {
                            ((InterfaceC7219) it2.next()).getClass();
                            list = upperBounds;
                        }
                    }
                    return new C6930(NullabilityQualifier.FORCE_FLEXIBILITY, false);
                }
                if (((List) interfaceC5183M10211.getValue()).isEmpty()) {
                    return null;
                }
                List list2 = (List) interfaceC5183M10211.getValue();
                if (list2 == null || !list2.isEmpty()) {
                    Iterator it3 = list2.iterator();
                    if (it3.hasNext()) {
                        ((InterfaceC7219) it3.next()).getClass();
                        list = (List) interfaceC5183M10211.getValue();
                    }
                }
                return new C6930(NullabilityQualifier.FORCE_FLEXIBILITY, true);
                if (list == null || !list.isEmpty()) {
                    Iterator it4 = list.iterator();
                    while (it4.hasNext()) {
                        if (!AbstractC4859.m9683((InterfaceC7219) it4.next())) {
                            nullabilityQualifier = NullabilityQualifier.NOT_NULL;
                            break;
                        }
                    }
                    nullabilityQualifier = NullabilityQualifier.NULLABLE;
                } else {
                    nullabilityQualifier = NullabilityQualifier.NULLABLE;
                }
                return new C6930(nullabilityQualifier, list != upperBounds);
            }
        }
        return null;
    }
}
