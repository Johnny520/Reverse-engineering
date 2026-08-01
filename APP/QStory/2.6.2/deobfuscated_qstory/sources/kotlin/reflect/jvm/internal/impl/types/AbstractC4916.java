package kotlin.reflect.jvm.internal.impl.types;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.AbstractC4343;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4462;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import p052.InterfaceC6557;
import p079.AbstractC6988;
import p082.C7033;
import p098.C7238;
import p098.C7239;
import p103.AbstractC7274;
import p103.C7272;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.types.飘花落叶言子苏楪兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4916 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C7238 f14243 = C7239.m12443(ErrorTypeKind.DONT_CARE, new String[0]);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C7238 f14242 = C7239.m12443(ErrorTypeKind.UNINFERRED_LAMBDA_PARAMETER_TYPE, new String[0]);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C4919 f14241 = new C4919("NO_EXPECTED_TYPE");

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C4919 f14240 = new C4919("UNIT_EXPECTED_TYPE");

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static boolean m9849(AbstractC4881 abstractC4881) {
        if (abstractC4881 == null) {
            m9854(60);
            throw null;
        }
        if ((abstractC4881.mo9732().mo9221() instanceof InterfaceC4462 ? (InterfaceC4462) abstractC4881.mo9732().mo9221() : null) != null) {
            return true;
        }
        abstractC4881.mo9732();
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static boolean m9850(AbstractC4881 abstractC4881) throws Exception {
        if (abstractC4881 == null) {
            m9854(27);
            throw null;
        }
        if (!abstractC4881.mo9735() && (!(abstractC4881.mo9778() instanceof AbstractC4895) || !m9850(((AbstractC4895) abstractC4881.mo9778()).f14213))) {
            if (!(abstractC4881.mo9778() instanceof C4905)) {
                if (m9849(abstractC4881)) {
                    if (!(abstractC4881.mo9732().mo9221() instanceof AbstractC6988)) {
                        C4918 c4918M9862 = C4918.m9862(abstractC4881);
                        Collection<AbstractC4881> collectionMo9504 = abstractC4881.mo9732().mo9504();
                        ArrayList arrayList = new ArrayList(collectionMo9504.size());
                        for (AbstractC4881 abstractC48812 : collectionMo9504) {
                            if (abstractC48812 == null) {
                                m9854(21);
                                throw null;
                            }
                            AbstractC4881 abstractC4881M9868 = c4918M9862.m9868(abstractC48812, Variance.INVARIANT);
                            AbstractC4881 abstractC4881M9855 = abstractC4881M9868 != null ? m9855(abstractC4881M9868, abstractC4881.mo9735()) : null;
                            if (abstractC4881M9855 != null) {
                                arrayList.add(abstractC4881M9855);
                            }
                        }
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            if (m9850((AbstractC4881) it.next())) {
                                return true;
                            }
                        }
                    }
                    return false;
                }
                InterfaceC4872 interfaceC4872Mo9732 = abstractC4881.mo9732();
                if (interfaceC4872Mo9732 instanceof C4882) {
                    Iterator it2 = ((C4882) interfaceC4872Mo9732).f14188.iterator();
                    while (it2.hasNext()) {
                        if (m9850((AbstractC4881) it2.next())) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static List m9851(List list) {
        if (list == null) {
            m9854(16);
            throw null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new C4884(((InterfaceC4462) it.next()).mo9035()));
        }
        List listM8804 = AbstractC4343.m8804(arrayList);
        if (listM8804 != null) {
            return listM8804;
        }
        m9854(17);
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static boolean m9852(AbstractC4881 abstractC4881, InterfaceC6557 interfaceC6557, C7272 c7272) {
        if (abstractC4881 == null) {
            return false;
        }
        AbstractC4913 abstractC4913Mo9778 = abstractC4881.mo9778();
        if (m9858(abstractC4881)) {
            return ((Boolean) interfaceC6557.invoke(abstractC4913Mo9778)).booleanValue();
        }
        if (c7272 != null && c7272.contains(abstractC4881)) {
            return false;
        }
        if (((Boolean) interfaceC6557.invoke(abstractC4913Mo9778)).booleanValue()) {
            return true;
        }
        if (c7272 == null) {
            int i = C7272.f19375;
            c7272 = AbstractC7274.m12462();
        }
        c7272.add(abstractC4881);
        AbstractC4895 abstractC4895 = abstractC4913Mo9778 instanceof AbstractC4895 ? (AbstractC4895) abstractC4913Mo9778 : null;
        if (abstractC4895 != null && (m9852(abstractC4895.f14212, interfaceC6557, c7272) || m9852(abstractC4895.f14213, interfaceC6557, c7272))) {
            return true;
        }
        if ((abstractC4913Mo9778 instanceof C4905) && m9852(((C4905) abstractC4913Mo9778).f14226, interfaceC6557, c7272)) {
            return true;
        }
        InterfaceC4872 interfaceC4872Mo9732 = abstractC4881.mo9732();
        if (interfaceC4872Mo9732 instanceof C4882) {
            Iterator it = ((C4882) interfaceC4872Mo9732).f14188.iterator();
            while (it.hasNext()) {
                if (m9852((AbstractC4881) it.next(), interfaceC6557, c7272)) {
                    return true;
                }
            }
            return false;
        }
        for (AbstractC4869 abstractC4869 : abstractC4881.mo9736()) {
            if (!abstractC4869.mo9750() && m9852(abstractC4869.mo9751(), interfaceC6557, c7272)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static boolean m9853(AbstractC4881 abstractC4881) {
        if (abstractC4881 == null) {
            m9854(28);
            throw null;
        }
        if (abstractC4881.mo9735()) {
            return true;
        }
        return (abstractC4881.mo9778() instanceof AbstractC4895) && m9853(((AbstractC4895) abstractC4881.mo9778()).f14213);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0120  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void m9854(int r27) {
        /*
            Method dump skipped, instruction units count: 774
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.types.AbstractC4916.m9854(int):void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static AbstractC4881 m9855(AbstractC4881 abstractC4881, boolean z) {
        if (abstractC4881 != null) {
            return z ? m9856(abstractC4881, true) : abstractC4881;
        }
        m9854(8);
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static AbstractC4913 m9856(AbstractC4881 abstractC4881, boolean z) {
        if (abstractC4881 == null) {
            m9854(3);
            throw null;
        }
        AbstractC4913 abstractC4913Mo9741 = abstractC4881.mo9778().mo9741(z);
        if (abstractC4913Mo9741 != null) {
            return abstractC4913Mo9741;
        }
        m9854(4);
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static AbstractC4869 m9857(InterfaceC4462 interfaceC4462, C7033 c7033) {
        if (interfaceC4462 != null) {
            return c7033.f18884 == TypeUsage.SUPERTYPE ? new C4884(AbstractC4892.m9823(interfaceC4462)) : new C4884(interfaceC4462);
        }
        m9854(46);
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static boolean m9858(AbstractC4881 abstractC4881) {
        if (abstractC4881 != null) {
            return abstractC4881 == f14241 || abstractC4881 == f14240;
        }
        m9854(0);
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static AbstractC4877 m9859(AbstractC4877 abstractC4877, boolean z) {
        if (abstractC4877 == null) {
            m9854(5);
            throw null;
        }
        if (!z) {
            return abstractC4877;
        }
        AbstractC4877 abstractC4877Mo9741 = abstractC4877.mo9741(true);
        if (abstractC4877Mo9741 != null) {
            return abstractC4877Mo9741;
        }
        m9854(6);
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static C4884 m9860(InterfaceC4462 interfaceC4462) {
        if (interfaceC4462 != null) {
            return new C4884(interfaceC4462);
        }
        m9854(45);
        throw null;
    }
}
