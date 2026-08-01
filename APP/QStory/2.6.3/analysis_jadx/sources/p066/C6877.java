package p066;

import androidx.compose.runtime.C1311;
import androidx.fragment.app.C2308;
import io.ktor.util.C4211;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ServiceLoader;
import kotlin.collections.AbstractC4344;
import kotlin.collections.AbstractC4345;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC4489;
import kotlin.reflect.jvm.internal.impl.descriptors.C4490;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4456;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4463;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4473;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4480;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4481;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4484;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4499;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.name.C4691;
import kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition$Contract;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil$OverrideCompatibilityInfo$Result;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4882;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4893;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4896;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4914;
import kotlin.reflect.jvm.internal.impl.types.C4871;
import kotlin.reflect.jvm.internal.impl.types.C4872;
import kotlin.reflect.jvm.internal.impl.types.C4891;
import kotlin.reflect.jvm.internal.impl.types.checker.InterfaceC4852;
import p052.InterfaceC6558;
import p079.AbstractC6977;
import p079.AbstractC6989;
import p079.AbstractC6994;
import p079.AbstractC7002;
import p079.C6990;
import p079.C6992;
import p079.C7006;
import p103.AbstractC7275;
import p103.C7273;
import p144.C7547;

/* JADX INFO: renamed from: 飘花落叶言世楪兰子哲苏.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6877 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C6872 f18319;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C6877 f18320;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final List f18321 = AbstractC4344.m8797(ServiceLoader.load(InterfaceC6880.class, InterfaceC6880.class.getClassLoader()));

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC4852 f18322;

    static {
        C6872 c6872 = new C6872();
        f18319 = c6872;
        f18320 = new C6877(c6872);
    }

    public C6877(InterfaceC4852 interfaceC4852) {
        if (interfaceC4852 != null) {
            this.f18322 = interfaceC4852;
        } else {
            m12140(5);
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:110:0x0192, code lost:
    
        if (r2 == false) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0194, code lost:
    
        r0 = kotlin.reflect.jvm.internal.impl.descriptors.AbstractC4489.f13124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0197, code lost:
    
        r0 = kotlin.reflect.jvm.internal.impl.descriptors.AbstractC4489.f13125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0199, code lost:
    
        r12 = ((kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4480) m12141(r11, new p066.C6884(0))).mo9029(r12, r1, r0, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind.FAKE_OVERRIDE);
        r13.mo12135(r12, r11);
        r13.mo9538(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x01b0, code lost:
    
        return;
     */
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m12136(java.util.Collection r11, p079.AbstractC6989 r12, p066.AbstractC6876 r13) {
        /*
            Method dump skipped, instruction units count: 457
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p066.C6877.m12136(java.util.Collection, 飘花落叶言世楪子苏兰哲.飘花落叶言子世楪苏哲兰, 飘花落叶言世楪兰子哲苏.飘花落叶言子楪哲世兰苏):void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static ArrayList m12137(InterfaceC4481 interfaceC4481) {
        C7006 c7006Mo9032 = interfaceC4481.mo9032();
        ArrayList arrayList = new ArrayList();
        if (c7006Mo9032 != null) {
            arrayList.add(c7006Mo9032.getType());
        }
        Iterator it = interfaceC4481.mo9035().iterator();
        while (it.hasNext()) {
            arrayList.add(((AbstractC6977) ((InterfaceC4456) it.next())).getType());
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static void m12138(InterfaceC4480 interfaceC4480, LinkedHashSet linkedHashSet) {
        if (interfaceC4480 == null) {
            m12140(17);
            throw null;
        }
        if (interfaceC4480.getKind().isReal()) {
            linkedHashSet.add(interfaceC4480);
        } else {
            if (interfaceC4480.mo9030().isEmpty()) {
                C7547.m12774(interfaceC4480, "No overridden descriptors found for (fake override) ");
                return;
            }
            Iterator it = interfaceC4480.mo9030().iterator();
            while (it.hasNext()) {
                m12138((InterfaceC4480) it.next(), linkedHashSet);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static boolean m12139(AbstractC4882 abstractC4882, AbstractC4882 abstractC48822, C4872 c4872) {
        if (abstractC4882 == null) {
            m12140(44);
            throw null;
        }
        if (abstractC48822 == null) {
            m12140(45);
            throw null;
        }
        if (AbstractC4893.m9829(abstractC4882) && AbstractC4893.m9829(abstractC48822)) {
            return true;
        }
        return C4891.m9790(c4872, abstractC4882.mo9772(), abstractC48822.mo9772());
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0035 A[FALL_THROUGH] */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void m12140(int r25) {
        /*
            Method dump skipped, instruction units count: 1296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p066.C6877.m12140(int):void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static Object m12141(Collection collection, InterfaceC6558 interfaceC6558) {
        Object next;
        if (collection.size() == 1) {
            Object objM8819 = AbstractC4344.m8819(collection);
            if (objM8819 != null) {
                return objM8819;
            }
            m12140(78);
            throw null;
        }
        ArrayList arrayList = new ArrayList(2);
        ArrayList arrayList2 = new ArrayList(AbstractC4345.m8822(collection, 10));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList2.add(interfaceC6558.invoke(it.next()));
        }
        Object objM88192 = AbstractC4344.m8819(collection);
        InterfaceC4481 interfaceC4481 = (InterfaceC4481) interfaceC6558.invoke(objM88192);
        for (Object obj : collection) {
            InterfaceC4481 interfaceC44812 = (InterfaceC4481) interfaceC6558.invoke(obj);
            if (interfaceC44812 == null) {
                m12140(69);
                throw null;
            }
            Iterator it2 = arrayList2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    arrayList.add(obj);
                    break;
                }
                if (!m12147(interfaceC44812, (InterfaceC4481) it2.next())) {
                    break;
                }
            }
            if (m12147(interfaceC44812, interfaceC4481) && !m12147(interfaceC4481, interfaceC44812)) {
                objM88192 = obj;
            }
        }
        if (arrayList.isEmpty()) {
            if (objM88192 != null) {
                return objM88192;
            }
            m12140(79);
            throw null;
        }
        if (arrayList.size() == 1) {
            Object objM88193 = AbstractC4344.m8819(arrayList);
            if (objM88193 != null) {
                return objM88193;
            }
            m12140(80);
            throw null;
        }
        Iterator it3 = arrayList.iterator();
        while (true) {
            if (!it3.hasNext()) {
                next = null;
                break;
            }
            next = it3.next();
            AbstractC4882 returnType = ((InterfaceC4481) interfaceC6558.invoke(next)).getReturnType();
            returnType.getClass();
            if (!(returnType.mo9772() instanceof AbstractC4896)) {
                break;
            }
        }
        if (next != null) {
            return next;
        }
        Object objM88194 = AbstractC4344.m8819(arrayList);
        if (objM88194 != null) {
            return objM88194;
        }
        m12140(82);
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static boolean m12142(InterfaceC4481 interfaceC4481, InterfaceC4481 interfaceC44812) {
        if (interfaceC4481 == null) {
            m12140(13);
            throw null;
        }
        if (interfaceC44812 == null) {
            m12140(14);
            throw null;
        }
        boolean zEquals = interfaceC4481.equals(interfaceC44812);
        C6872 c6872 = C6872.f18313;
        if (!zEquals && c6872.m12122(interfaceC4481.mo9002(), interfaceC44812.mo9002(), false)) {
            return true;
        }
        InterfaceC4481 interfaceC4481Mo9002 = interfaceC44812.mo9002();
        int i = AbstractC6870.f18312;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        AbstractC6870.m12105(interfaceC4481.mo9002(), linkedHashSet);
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            if (c6872.m12122(interfaceC4481Mo9002, (InterfaceC4481) it.next(), false)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static void m12143(InterfaceC4480 interfaceC4480, InterfaceC6558 interfaceC6558) {
        C4490 c4490;
        C4490 c4490M9072;
        C4490 c44902;
        if (interfaceC4480 == null) {
            m12140(105);
            throw null;
        }
        for (InterfaceC4480 interfaceC44802 : interfaceC4480.mo9030()) {
            if (interfaceC44802.getVisibility() == AbstractC4489.f13125) {
                m12143(interfaceC44802, interfaceC6558);
            }
        }
        if (interfaceC4480.getVisibility() != AbstractC4489.f13125) {
            return;
        }
        Collection<InterfaceC4480> collectionMo9030 = interfaceC4480.mo9030();
        if (collectionMo9030 == null) {
            m12140(107);
            throw null;
        }
        if (collectionMo9030.isEmpty()) {
            c4490M9072 = AbstractC4489.f13129;
        } else {
            Iterator it = collectionMo9030.iterator();
            loop3: while (true) {
                c4490 = null;
                while (it.hasNext()) {
                    C4490 visibility = ((InterfaceC4480) it.next()).getVisibility();
                    if (c4490 != null) {
                        Integer numM9070 = AbstractC4489.m9070(visibility, c4490);
                        if (numM9070 == null) {
                            break;
                        } else if (numM9070.intValue() > 0) {
                        }
                    }
                    c4490 = visibility;
                }
            }
            if (c4490 == null) {
                c4490M9072 = null;
                break;
            }
            Iterator it2 = collectionMo9030.iterator();
            while (it2.hasNext()) {
                Integer numM90702 = AbstractC4489.m9070(c4490, ((InterfaceC4480) it2.next()).getVisibility());
                if (numM90702 == null || numM90702.intValue() < 0) {
                    c4490M9072 = null;
                    break;
                }
            }
            c4490M9072 = c4490;
        }
        if (c4490M9072 == null) {
            c4490M9072 = null;
            break;
        }
        if (interfaceC4480.getKind() == CallableMemberDescriptor$Kind.FAKE_OVERRIDE) {
            for (InterfaceC4480 interfaceC44803 : collectionMo9030) {
                if (interfaceC44803.mo9009() != Modality.ABSTRACT && !interfaceC44803.getVisibility().equals(c4490M9072)) {
                    c4490M9072 = null;
                    break;
                }
            }
        } else {
            c4490M9072 = AbstractC4489.m9072(c4490M9072.f13131.mo9098());
        }
        if (c4490M9072 == null) {
            if (interfaceC6558 != null) {
                interfaceC6558.invoke(interfaceC4480);
            }
            c44902 = AbstractC4489.f13116;
        } else {
            c44902 = c4490M9072;
        }
        if (interfaceC4480 instanceof C6992) {
            C6992 c6992 = (C6992) interfaceC4480;
            if (c44902 == null) {
                C6992.m12318(20);
                throw null;
            }
            c6992.f18719 = c44902;
            Iterator it3 = ((InterfaceC4473) interfaceC4480).mo9023().iterator();
            while (it3.hasNext()) {
                m12143((AbstractC6994) it3.next(), c4490M9072 == null ? null : interfaceC6558);
            }
            return;
        }
        if (interfaceC4480 instanceof AbstractC7002) {
            AbstractC7002 abstractC7002 = (AbstractC7002) interfaceC4480;
            if (c44902 != null) {
                abstractC7002.f18772 = c44902;
                return;
            } else {
                AbstractC7002.m12332(10);
                throw null;
            }
        }
        AbstractC6994 abstractC6994 = (AbstractC6994) interfaceC4480;
        abstractC6994.f18742 = c44902;
        if (c44902 != abstractC6994.m12326().getVisibility()) {
            abstractC6994.f18744 = false;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static boolean m12144(InterfaceC4481 interfaceC4481, AbstractC4882 abstractC4882, InterfaceC4481 interfaceC44812, AbstractC4882 abstractC48822, C4872 c4872) {
        if (interfaceC4481 == null) {
            m12140(71);
            throw null;
        }
        if (abstractC4882 == null) {
            m12140(72);
            throw null;
        }
        if (interfaceC44812 == null) {
            m12140(73);
            throw null;
        }
        if (abstractC48822 == null) {
            m12140(74);
            throw null;
        }
        AbstractC4914 abstractC4914Mo9772 = abstractC4882.mo9772();
        AbstractC4914 abstractC4914Mo97722 = abstractC48822.mo9772();
        if (abstractC4914Mo9772 == abstractC4914Mo97722) {
            return true;
        }
        if (!c4872.m9764(abstractC4914Mo9772, abstractC4914Mo97722)) {
            return false;
        }
        return C4891.f14211.m9793(c4872, c4872.f14170, abstractC4914Mo9772, abstractC4914Mo97722);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static boolean m12145(InterfaceC4481 interfaceC4481, InterfaceC4481 interfaceC44812) {
        if (interfaceC4481 == null) {
            m12140(67);
            throw null;
        }
        if (interfaceC44812 != null) {
            Integer numM9070 = AbstractC4489.m9070(interfaceC4481.getVisibility(), interfaceC44812.getVisibility());
            return numM9070 == null || numM9070.intValue() >= 0;
        }
        m12140(68);
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static ArrayList m12146(Object obj, LinkedList linkedList, InterfaceC6558 interfaceC6558, InterfaceC6558 interfaceC65582) {
        if (obj == null) {
            m12140(97);
            throw null;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(obj);
        InterfaceC4481 interfaceC4481 = (InterfaceC4481) interfaceC6558.invoke(obj);
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            InterfaceC4481 interfaceC44812 = (InterfaceC4481) interfaceC6558.invoke(next);
            if (obj == next) {
                it.remove();
            } else {
                OverridingUtil$OverrideCompatibilityInfo$Result overridingUtil$OverrideCompatibilityInfo$ResultM12149 = m12149(interfaceC4481, interfaceC44812);
                if (overridingUtil$OverrideCompatibilityInfo$ResultM12149 == OverridingUtil$OverrideCompatibilityInfo$Result.OVERRIDABLE) {
                    arrayList.add(next);
                    it.remove();
                } else if (overridingUtil$OverrideCompatibilityInfo$ResultM12149 == OverridingUtil$OverrideCompatibilityInfo$Result.CONFLICT) {
                    interfaceC65582.invoke(next);
                    it.remove();
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static boolean m12147(InterfaceC4481 interfaceC4481, InterfaceC4481 interfaceC44812) {
        if (interfaceC4481 == null) {
            m12140(65);
            throw null;
        }
        if (interfaceC44812 == null) {
            m12140(66);
            throw null;
        }
        AbstractC4882 returnType = interfaceC4481.getReturnType();
        AbstractC4882 returnType2 = interfaceC44812.getReturnType();
        if (m12145(interfaceC4481, interfaceC44812)) {
            C4872 c4872M12150 = f18320.m12150(interfaceC4481.getTypeParameters(), interfaceC44812.getTypeParameters());
            if (interfaceC4481 instanceof InterfaceC4484) {
                return m12144(interfaceC4481, returnType, interfaceC44812, returnType2, c4872M12150);
            }
            if (!(interfaceC4481 instanceof InterfaceC4473)) {
                C7547.m12764(interfaceC4481.getClass(), "Unexpected callable: ");
                return false;
            }
            InterfaceC4473 interfaceC4473 = (InterfaceC4473) interfaceC4481;
            InterfaceC4473 interfaceC44732 = (InterfaceC4473) interfaceC44812;
            C6990 setter = interfaceC4473.getSetter();
            C6990 setter2 = interfaceC44732.getSetter();
            if ((setter == null || setter2 == null) ? true : m12145(setter, setter2)) {
                if (interfaceC4473.mo8995() && interfaceC44732.mo8995()) {
                    return C4891.m9790(c4872M12150, returnType.mo9772(), returnType2.mo9772());
                }
                if ((interfaceC4473.mo8995() || !interfaceC44732.mo8995()) && m12144(interfaceC4481, returnType, interfaceC44812, returnType2, c4872M12150)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static C6882 m12148(InterfaceC4481 interfaceC4481, InterfaceC4481 interfaceC44812) {
        boolean z;
        if (interfaceC4481 == null) {
            m12140(38);
            throw null;
        }
        if (interfaceC44812 == null) {
            m12140(39);
            throw null;
        }
        boolean z2 = interfaceC4481 instanceof InterfaceC4484;
        if ((z2 && !(interfaceC44812 instanceof InterfaceC4484)) || (((z = interfaceC4481 instanceof InterfaceC4473)) && !(interfaceC44812 instanceof InterfaceC4473))) {
            return C6882.m12157("Member kind mismatch");
        }
        if (!z2 && !z) {
            C4211.m8604(interfaceC4481, "This type of CallableDescriptor cannot be checked for overridability: ");
            return null;
        }
        if (!interfaceC4481.getName().equals(interfaceC44812.getName())) {
            return C6882.m12157("Name mismatch");
        }
        C6882 c6882M12157 = (interfaceC4481.mo9032() == null) != (interfaceC44812.mo9032() == null) ? C6882.m12157("Receiver presence mismatch") : interfaceC4481.mo9035().size() != interfaceC44812.mo9035().size() ? C6882.m12157("Value parameter number mismatch") : null;
        if (c6882M12157 != null) {
            return c6882M12157;
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static OverridingUtil$OverrideCompatibilityInfo$Result m12149(InterfaceC4481 interfaceC4481, InterfaceC4481 interfaceC44812) {
        C6877 c6877 = f18320;
        OverridingUtil$OverrideCompatibilityInfo$Result overridingUtil$OverrideCompatibilityInfo$ResultM12159 = c6877.m12154(interfaceC44812, interfaceC4481, null).m12159();
        OverridingUtil$OverrideCompatibilityInfo$Result overridingUtil$OverrideCompatibilityInfo$ResultM121592 = c6877.m12152(interfaceC4481, interfaceC44812, null, false).m12159();
        OverridingUtil$OverrideCompatibilityInfo$Result overridingUtil$OverrideCompatibilityInfo$Result = OverridingUtil$OverrideCompatibilityInfo$Result.OVERRIDABLE;
        if (overridingUtil$OverrideCompatibilityInfo$ResultM12159 == overridingUtil$OverrideCompatibilityInfo$Result && overridingUtil$OverrideCompatibilityInfo$ResultM121592 == overridingUtil$OverrideCompatibilityInfo$Result) {
            return overridingUtil$OverrideCompatibilityInfo$Result;
        }
        OverridingUtil$OverrideCompatibilityInfo$Result overridingUtil$OverrideCompatibilityInfo$Result2 = OverridingUtil$OverrideCompatibilityInfo$Result.CONFLICT;
        return (overridingUtil$OverrideCompatibilityInfo$ResultM12159 == overridingUtil$OverrideCompatibilityInfo$Result2 || overridingUtil$OverrideCompatibilityInfo$ResultM121592 == overridingUtil$OverrideCompatibilityInfo$Result2) ? overridingUtil$OverrideCompatibilityInfo$Result2 : OverridingUtil$OverrideCompatibilityInfo$Result.INCOMPATIBLE;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final C4872 m12150(List list, List list2) {
        if (list == null) {
            m12140(40);
            throw null;
        }
        if (list2 == null) {
            m12140(41);
            throw null;
        }
        boolean zIsEmpty = list.isEmpty();
        InterfaceC4852 interfaceC4852 = this.f18322;
        if (zIsEmpty) {
            return new C4871((HashMap) null, interfaceC4852).m9750();
        }
        HashMap map = new HashMap();
        for (int i = 0; i < list.size(); i++) {
            map.put(((InterfaceC4463) list.get(i)).mo9001(), ((InterfaceC4463) list2.get(i)).mo9001());
        }
        return new C4871(map, interfaceC4852).m9750();
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ac, code lost:
    
        r10.remove();
     */
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final p066.C6882 m12151(kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4481 r13, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4481 r14, boolean r15) {
        /*
            Method dump skipped, instruction units count: 347
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p066.C6877.m12151(kotlin.reflect.jvm.internal.impl.descriptors.飘花落叶言子楪世苏兰哲, kotlin.reflect.jvm.internal.impl.descriptors.飘花落叶言子楪世苏兰哲, boolean):飘花落叶言世楪兰子哲苏.飘花落叶言子楪苏兰哲世");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final C6882 m12152(InterfaceC4481 interfaceC4481, InterfaceC4481 interfaceC44812, AbstractC6989 abstractC6989, boolean z) {
        if (interfaceC4481 == null) {
            m12140(22);
            throw null;
        }
        if (interfaceC44812 == null) {
            m12140(23);
            throw null;
        }
        C6882 c6882M12151 = m12151(interfaceC4481, interfaceC44812, z);
        boolean z2 = c6882M12151.m12159() == OverridingUtil$OverrideCompatibilityInfo$Result.OVERRIDABLE;
        List<InterfaceC6880> list = f18321;
        for (InterfaceC6880 interfaceC6880 : list) {
            if (interfaceC6880.mo9235() != ExternalOverridabilityCondition$Contract.CONFLICTS_ONLY && (!z2 || interfaceC6880.mo9235() != ExternalOverridabilityCondition$Contract.SUCCESS_ONLY)) {
                int i = AbstractC6881.f18326[interfaceC6880.mo9234(interfaceC4481, interfaceC44812, abstractC6989).ordinal()];
                if (i == 1) {
                    z2 = true;
                } else if (i == 2) {
                    return C6882.m12157("External condition");
                }
            }
        }
        if (!z2) {
            return c6882M12151;
        }
        for (InterfaceC6880 interfaceC68802 : list) {
            if (interfaceC68802.mo9235() == ExternalOverridabilityCondition$Contract.CONFLICTS_ONLY) {
                int i2 = AbstractC6881.f18326[interfaceC68802.mo9234(interfaceC4481, interfaceC44812, abstractC6989).ordinal()];
                if (i2 == 1) {
                    C2308.m4354(interfaceC68802.getClass().getName(), "Contract violation in ", " condition. It's not supposed to end with success");
                    return null;
                }
                if (i2 == 2) {
                    return C6882.m12157("External condition");
                }
            }
        }
        C6882 c6882 = C6882.f18327;
        if (c6882 != null) {
            return c6882;
        }
        C6882.m12158(0);
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void m12153(C4691 c4691, Collection collection, Collection collection2, AbstractC6989 abstractC6989, AbstractC6876 abstractC6876) {
        Integer numM9070;
        if (c4691 == null) {
            m12140(50);
            throw null;
        }
        if (collection == null) {
            m12140(51);
            throw null;
        }
        if (collection2 == null) {
            m12140(52);
            throw null;
        }
        if (abstractC6989 == null) {
            m12140(53);
            throw null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(collection);
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            InterfaceC4480 interfaceC4480 = (InterfaceC4480) it.next();
            if (interfaceC4480 == null) {
                m12140(57);
                throw null;
            }
            ArrayList arrayList = new ArrayList(collection.size());
            int i = C7273.f19370;
            C7273 c7273M12489 = AbstractC7275.m12489();
            Iterator it2 = collection.iterator();
            while (it2.hasNext()) {
                InterfaceC4480 interfaceC44802 = (InterfaceC4480) it2.next();
                OverridingUtil$OverrideCompatibilityInfo$Result overridingUtil$OverrideCompatibilityInfo$ResultM12159 = m12154(interfaceC44802, interfaceC4480, abstractC6989).m12159();
                boolean z = !AbstractC4489.m9067(interfaceC44802.getVisibility()) && AbstractC4489.m9066(interfaceC44802, interfaceC4480);
                int i2 = AbstractC6881.f18325[overridingUtil$OverrideCompatibilityInfo$ResultM12159.ordinal()];
                if (i2 == 1) {
                    if (z) {
                        c7273M12489.add(interfaceC44802);
                    }
                    arrayList.add(interfaceC44802);
                } else if (i2 == 2) {
                    if (z) {
                        abstractC6876.mo9537(interfaceC44802, interfaceC4480);
                    }
                    arrayList.add(interfaceC44802);
                }
            }
            abstractC6876.mo12135(interfaceC4480, c7273M12489);
            linkedHashSet.removeAll(arrayList);
        }
        if (linkedHashSet.size() >= 2) {
            InterfaceC4499 interfaceC4499Mo9028 = ((InterfaceC4480) linkedHashSet.iterator().next()).mo9028();
            if (!linkedHashSet.isEmpty()) {
                Iterator it3 = linkedHashSet.iterator();
                while (it3.hasNext()) {
                    if (((InterfaceC4480) it3.next()).mo9028() != interfaceC4499Mo9028) {
                        LinkedList<InterfaceC4480> linkedList = new LinkedList(linkedHashSet);
                        while (!linkedList.isEmpty()) {
                            linkedList.isEmpty();
                            InterfaceC4480 interfaceC44803 = null;
                            for (InterfaceC4480 interfaceC44804 : linkedList) {
                                if (interfaceC44803 == null || ((numM9070 = AbstractC4489.m9070(interfaceC44803.getVisibility(), interfaceC44804.getVisibility())) != null && numM9070.intValue() < 0)) {
                                    interfaceC44803 = interfaceC44804;
                                }
                            }
                            interfaceC44803.getClass();
                            m12136(m12146(interfaceC44803, linkedList, new C6884(1), new C1311(abstractC6876, 7, interfaceC44803)), abstractC6989, abstractC6876);
                        }
                        return;
                    }
                }
            }
        }
        Iterator it4 = linkedHashSet.iterator();
        while (it4.hasNext()) {
            m12136(Collections.singleton((InterfaceC4480) it4.next()), abstractC6989, abstractC6876);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final C6882 m12154(InterfaceC4481 interfaceC4481, InterfaceC4481 interfaceC44812, AbstractC6989 abstractC6989) {
        if (interfaceC4481 == null) {
            m12140(19);
            throw null;
        }
        if (interfaceC44812 != null) {
            return m12152(interfaceC4481, interfaceC44812, abstractC6989, false);
        }
        m12140(20);
        throw null;
    }
}
