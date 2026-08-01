package kotlin.reflect.jvm.internal.impl.types;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.AbstractC4344;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4463;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import p052.InterfaceC6558;
import p079.AbstractC6989;
import p082.C7034;
import p098.C7239;
import p098.C7240;
import p103.AbstractC7275;
import p103.C7273;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.types.飘花落叶言子苏楪兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4917 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C7239 f14247 = C7240.m12470(ErrorTypeKind.DONT_CARE, new String[0]);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C7239 f14246 = C7240.m12470(ErrorTypeKind.UNINFERRED_LAMBDA_PARAMETER_TYPE, new String[0]);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C4920 f14245 = new C4920("NO_EXPECTED_TYPE");

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C4920 f14244 = new C4920("UNIT_EXPECTED_TYPE");

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static boolean m9843(AbstractC4882 abstractC4882) {
        if (abstractC4882 == null) {
            m9848(60);
            throw null;
        }
        if ((abstractC4882.mo9722().mo9211() instanceof InterfaceC4463 ? (InterfaceC4463) abstractC4882.mo9722().mo9211() : null) != null) {
            return true;
        }
        abstractC4882.mo9722();
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static boolean m9844(AbstractC4882 abstractC4882) throws Exception {
        if (abstractC4882 == null) {
            m9848(27);
            throw null;
        }
        if (!abstractC4882.mo9725() && (!(abstractC4882.mo9772() instanceof AbstractC4896) || !m9844(((AbstractC4896) abstractC4882.mo9772()).f14217))) {
            if (!(abstractC4882.mo9772() instanceof C4906)) {
                if (m9843(abstractC4882)) {
                    if (!(abstractC4882.mo9722().mo9211() instanceof AbstractC6989)) {
                        C4919 c4919M9856 = C4919.m9856(abstractC4882);
                        Collection<AbstractC4882> collectionMo9494 = abstractC4882.mo9722().mo9494();
                        ArrayList arrayList = new ArrayList(collectionMo9494.size());
                        for (AbstractC4882 abstractC48822 : collectionMo9494) {
                            if (abstractC48822 == null) {
                                m9848(21);
                                throw null;
                            }
                            AbstractC4882 abstractC4882M9862 = c4919M9856.m9862(abstractC48822, Variance.INVARIANT);
                            AbstractC4882 abstractC4882M9849 = abstractC4882M9862 != null ? m9849(abstractC4882M9862, abstractC4882.mo9725()) : null;
                            if (abstractC4882M9849 != null) {
                                arrayList.add(abstractC4882M9849);
                            }
                        }
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            if (m9844((AbstractC4882) it.next())) {
                                return true;
                            }
                        }
                    }
                    return false;
                }
                InterfaceC4873 interfaceC4873Mo9722 = abstractC4882.mo9722();
                if (interfaceC4873Mo9722 instanceof C4883) {
                    Iterator it2 = ((C4883) interfaceC4873Mo9722).f14192.iterator();
                    while (it2.hasNext()) {
                        if (m9844((AbstractC4882) it2.next())) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static List m9845(List list) {
        if (list == null) {
            m9848(16);
            throw null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new C4885(((InterfaceC4463) it.next()).mo9025()));
        }
        List listM8797 = AbstractC4344.m8797(arrayList);
        if (listM8797 != null) {
            return listM8797;
        }
        m9848(17);
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static boolean m9846(AbstractC4882 abstractC4882, InterfaceC6558 interfaceC6558, C7273 c7273) {
        if (abstractC4882 == null) {
            return false;
        }
        AbstractC4914 abstractC4914Mo9772 = abstractC4882.mo9772();
        if (m9852(abstractC4882)) {
            return ((Boolean) interfaceC6558.invoke(abstractC4914Mo9772)).booleanValue();
        }
        if (c7273 != null && c7273.contains(abstractC4882)) {
            return false;
        }
        if (((Boolean) interfaceC6558.invoke(abstractC4914Mo9772)).booleanValue()) {
            return true;
        }
        if (c7273 == null) {
            int i = C7273.f19370;
            c7273 = AbstractC7275.m12489();
        }
        c7273.add(abstractC4882);
        AbstractC4896 abstractC4896 = abstractC4914Mo9772 instanceof AbstractC4896 ? (AbstractC4896) abstractC4914Mo9772 : null;
        if (abstractC4896 != null && (m9846(abstractC4896.f14216, interfaceC6558, c7273) || m9846(abstractC4896.f14217, interfaceC6558, c7273))) {
            return true;
        }
        if ((abstractC4914Mo9772 instanceof C4906) && m9846(((C4906) abstractC4914Mo9772).f14230, interfaceC6558, c7273)) {
            return true;
        }
        InterfaceC4873 interfaceC4873Mo9722 = abstractC4882.mo9722();
        if (interfaceC4873Mo9722 instanceof C4883) {
            Iterator it = ((C4883) interfaceC4873Mo9722).f14192.iterator();
            while (it.hasNext()) {
                if (m9846((AbstractC4882) it.next(), interfaceC6558, c7273)) {
                    return true;
                }
            }
            return false;
        }
        for (AbstractC4870 abstractC4870 : abstractC4882.mo9726()) {
            if (!abstractC4870.mo9740() && m9846(abstractC4870.mo9741(), interfaceC6558, c7273)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static boolean m9847(AbstractC4882 abstractC4882) {
        if (abstractC4882 == null) {
            m9848(28);
            throw null;
        }
        if (abstractC4882.mo9725()) {
            return true;
        }
        return (abstractC4882.mo9772() instanceof AbstractC4896) && m9847(((AbstractC4896) abstractC4882.mo9772()).f14217);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0120  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void m9848(int r27) {
        /*
            Method dump skipped, instruction units count: 774
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.types.AbstractC4917.m9848(int):void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static AbstractC4882 m9849(AbstractC4882 abstractC4882, boolean z) {
        if (abstractC4882 != null) {
            return z ? m9850(abstractC4882, true) : abstractC4882;
        }
        m9848(8);
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static AbstractC4914 m9850(AbstractC4882 abstractC4882, boolean z) {
        if (abstractC4882 == null) {
            m9848(3);
            throw null;
        }
        AbstractC4914 abstractC4914Mo9731 = abstractC4882.mo9772().mo9731(z);
        if (abstractC4914Mo9731 != null) {
            return abstractC4914Mo9731;
        }
        m9848(4);
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static AbstractC4870 m9851(InterfaceC4463 interfaceC4463, C7034 c7034) {
        if (interfaceC4463 != null) {
            return c7034.f18879 == TypeUsage.SUPERTYPE ? new C4885(AbstractC4893.m9817(interfaceC4463)) : new C4885(interfaceC4463);
        }
        m9848(46);
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static boolean m9852(AbstractC4882 abstractC4882) {
        if (abstractC4882 != null) {
            return abstractC4882 == f14245 || abstractC4882 == f14244;
        }
        m9848(0);
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static AbstractC4878 m9853(AbstractC4878 abstractC4878, boolean z) {
        if (abstractC4878 == null) {
            m9848(5);
            throw null;
        }
        if (!z) {
            return abstractC4878;
        }
        AbstractC4878 abstractC4878Mo9731 = abstractC4878.mo9731(true);
        if (abstractC4878Mo9731 != null) {
            return abstractC4878Mo9731;
        }
        m9848(6);
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static C4885 m9854(InterfaceC4463 interfaceC4463) {
        if (interfaceC4463 != null) {
            return new C4885(interfaceC4463);
        }
        m9848(45);
        throw null;
    }
}
