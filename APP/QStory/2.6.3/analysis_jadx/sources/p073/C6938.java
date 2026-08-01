package p073;

import androidx.compose.animation.core.C0325;
import androidx.compose.foundation.text.C1012;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.AbstractC5187;
import kotlin.InterfaceC5184;
import kotlin.LazyThreadSafetyMode;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.C4410;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4463;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4477;
import kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType;
import kotlin.reflect.jvm.internal.impl.load.java.C4610;
import kotlin.reflect.jvm.internal.impl.load.java.C4620;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.C4577;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4878;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4882;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4896;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4917;
import kotlin.reflect.jvm.internal.impl.types.checker.AbstractC4860;
import p046.InterfaceC6479;
import p066.AbstractC6870;
import p079.AbstractC6989;
import p083.C7041;
import p097.InterfaceC7220;
import p097.InterfaceC7228;
import p098.C7239;

/* JADX INFO: renamed from: 飘花落叶言世楪哲子苏兰.飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6938 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final boolean f18505;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final AnnotationQualifierApplicabilityType f18506;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C0325 f18507;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final boolean f18508;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC6479 f18509;

    public C6938(InterfaceC6479 interfaceC6479, boolean z, C0325 c0325, AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType, boolean z2) {
        c0325.getClass();
        annotationQualifierApplicabilityType.getClass();
        this.f18509 = interfaceC6479;
        this.f18508 = z;
        this.f18507 = c0325;
        this.f18506 = annotationQualifierApplicabilityType;
        this.f18505 = z2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static NullabilityQualifier m12232(InterfaceC7220 interfaceC7220) {
        AbstractC4878 abstractC4878M9706;
        AbstractC4878 abstractC4878M97062;
        interfaceC7220.getClass();
        AbstractC4896 abstractC4896M9707 = AbstractC4860.m9707(interfaceC7220);
        if (abstractC4896M9707 == null || (abstractC4878M9706 = AbstractC4860.m9667(abstractC4896M9707)) == null) {
            abstractC4878M9706 = AbstractC4860.m9706(interfaceC7220);
            abstractC4878M9706.getClass();
        }
        if (AbstractC4860.m9683(abstractC4878M9706)) {
            return NullabilityQualifier.NULLABLE;
        }
        AbstractC4896 abstractC4896M97072 = AbstractC4860.m9707(interfaceC7220);
        if (abstractC4896M97072 == null || (abstractC4878M97062 = AbstractC4860.m9717(abstractC4896M97072)) == null) {
            abstractC4878M97062 = AbstractC4860.m9706(interfaceC7220);
            abstractC4878M97062.getClass();
        }
        if (AbstractC4860.m9683(abstractC4878M97062)) {
            return null;
        }
        return NullabilityQualifier.NOT_NULL;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static MutabilityQualifier m12233(InterfaceC7220 interfaceC7220) {
        AbstractC4878 abstractC4878M9706;
        AbstractC4878 abstractC4878M97062;
        String str = C4410.f12987;
        interfaceC7220.getClass();
        AbstractC4896 abstractC4896M9707 = AbstractC4860.m9707(interfaceC7220);
        if (abstractC4896M9707 == null || (abstractC4878M9706 = AbstractC4860.m9667(abstractC4896M9707)) == null) {
            abstractC4878M9706 = AbstractC4860.m9706(interfaceC7220);
            abstractC4878M9706.getClass();
        }
        C7239 c7239 = AbstractC4917.f14247;
        InterfaceC4477 interfaceC4477Mo9211 = abstractC4878M9706.mo9722().mo9211();
        AbstractC6989 abstractC6989 = interfaceC4477Mo9211 instanceof AbstractC6989 ? (AbstractC6989) interfaceC4477Mo9211 : null;
        if (C4410.f12993.containsKey(abstractC6989 != null ? AbstractC6870.m12101(abstractC6989) : null)) {
            return MutabilityQualifier.READ_ONLY;
        }
        AbstractC4896 abstractC4896M97072 = AbstractC4860.m9707(interfaceC7220);
        if (abstractC4896M97072 == null || (abstractC4878M97062 = AbstractC4860.m9717(abstractC4896M97072)) == null) {
            abstractC4878M97062 = AbstractC4860.m9706(interfaceC7220);
            abstractC4878M97062.getClass();
        }
        InterfaceC4477 interfaceC4477Mo92112 = abstractC4878M97062.mo9722().mo9211();
        AbstractC6989 abstractC69892 = interfaceC4477Mo92112 instanceof AbstractC6989 ? (AbstractC6989) interfaceC4477Mo92112 : null;
        if (C4410.f12996.containsKey(abstractC69892 != null ? AbstractC6870.m12101(abstractC69892) : null)) {
            return MutabilityQualifier.MUTABLE;
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static void m12234(Object obj, ArrayList arrayList, C1012 c1012) {
        arrayList.add(obj);
        Iterable iterable = (Iterable) c1012.invoke(obj);
        if (iterable != null) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                m12234(it.next(), arrayList, c1012);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final ArrayList m12235(InterfaceC7220 interfaceC7220) {
        C0325 c0325 = this.f18507;
        C4620 c4620 = (C4620) ((InterfaceC5184) c0325.f1094).getValue();
        C4610 c4610 = ((C7041) c0325.f1095).f18903;
        interfaceC7220.getClass();
        C6928 c6928 = new C6928(interfaceC7220, C4610.m9218(c4610, c4620, ((AbstractC4882) interfaceC7220).getAnnotations()), null);
        C1012 c1012 = new C1012(this, 22);
        ArrayList arrayList = new ArrayList(1);
        m12234(c6928, arrayList, c1012);
        return arrayList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C6931 m12236(InterfaceC7228 interfaceC7228) {
        List list;
        NullabilityQualifier nullabilityQualifier;
        interfaceC7228.getClass();
        if (!(interfaceC7228 instanceof C4577)) {
            return null;
        }
        List upperBounds = ((InterfaceC4463) interfaceC7228).getUpperBounds();
        upperBounds.getClass();
        if (upperBounds.isEmpty()) {
            return null;
        }
        Iterator it = upperBounds.iterator();
        while (it.hasNext()) {
            if (!AbstractC4860.m9687((InterfaceC7220) it.next())) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : upperBounds) {
                    if (m12232((InterfaceC7220) obj) != null) {
                        arrayList.add(obj);
                    }
                }
                InterfaceC5184 interfaceC5184M10215 = AbstractC5187.m10215(LazyThreadSafetyMode.NONE, new C6930(upperBounds, this));
                if (!arrayList.isEmpty()) {
                    if (!arrayList.isEmpty()) {
                        Iterator it2 = arrayList.iterator();
                        if (it2.hasNext()) {
                            ((InterfaceC7220) it2.next()).getClass();
                            list = upperBounds;
                        }
                    }
                    return new C6931(NullabilityQualifier.FORCE_FLEXIBILITY, false);
                }
                if (((List) interfaceC5184M10215.getValue()).isEmpty()) {
                    return null;
                }
                List list2 = (List) interfaceC5184M10215.getValue();
                if (list2 == null || !list2.isEmpty()) {
                    Iterator it3 = list2.iterator();
                    if (it3.hasNext()) {
                        ((InterfaceC7220) it3.next()).getClass();
                        list = (List) interfaceC5184M10215.getValue();
                    }
                }
                return new C6931(NullabilityQualifier.FORCE_FLEXIBILITY, true);
                if (list == null || !list.isEmpty()) {
                    Iterator it4 = list.iterator();
                    while (it4.hasNext()) {
                        if (!AbstractC4860.m9673((InterfaceC7220) it4.next())) {
                            nullabilityQualifier = NullabilityQualifier.NOT_NULL;
                            break;
                        }
                    }
                    nullabilityQualifier = NullabilityQualifier.NULLABLE;
                } else {
                    nullabilityQualifier = NullabilityQualifier.NULLABLE;
                }
                return new C6931(nullabilityQualifier, list != upperBounds);
            }
        }
        return null;
    }
}
