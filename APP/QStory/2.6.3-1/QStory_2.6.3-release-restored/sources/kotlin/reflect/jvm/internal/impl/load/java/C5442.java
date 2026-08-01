package kotlin.reflect.jvm.internal.impl.load.java;

import androidx.compose.foundation.text.C1850;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.collections.AbstractC5171;
import kotlin.collections.AbstractC5176;
import kotlin.collections.AbstractC5179;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier;
import kotlin.reflect.jvm.internal.impl.name.C5519;
import kotlin.reflect.jvm.internal.impl.name.C5523;
import kotlin.reflect.jvm.internal.impl.resolve.constants.AbstractC5600;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C5585;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C5603;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.AbstractC5605;
import p050.AbstractC7176;
import p062.InterfaceC7307;
import p062.InterfaceC7310;
import p089.C7760;
import p095.AbstractC7818;
import p191.AbstractC8568;
import p248.C8894;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.java.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5442 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final LinkedHashMap f13813;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final ConcurrentHashMap f13814 = new ConcurrentHashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C8894 f13815;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType : AnnotationQualifierApplicabilityType.values()) {
            String javaTarget = annotationQualifierApplicabilityType.getJavaTarget();
            if (linkedHashMap.get(javaTarget) == null) {
                linkedHashMap.put(javaTarget, annotationQualifierApplicabilityType);
            }
        }
        f13813 = linkedHashMap;
    }

    public C5442(C8894 c8894) {
        this.f13815 = c8894;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01a1  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C5452 m9777(C5442 c5442, C5452 c5452, InterfaceC7310 interfaceC7310) {
        boolean z;
        C5458 c5458;
        ReportLevel reportLevelM9786;
        C5458 c54582;
        Object objM9781;
        Object next;
        Pair pair;
        boolean z2;
        NullabilityQualifier nullabilityQualifier;
        int i;
        C7760 c7760M12786;
        Object c54583;
        c5442.getClass();
        interfaceC7310.getClass();
        C8894 c8894 = c5442.f13815;
        boolean z3 = c8894.f22590;
        if (!z3) {
            ArrayList<C5458> arrayList = new ArrayList();
            Iterator it = interfaceC7310.iterator();
            while (true) {
                z = false;
                if (!it.hasNext()) {
                    break;
                }
                Object next2 = it.next();
                if (!z3 && (c5458 = (C5458) AbstractC5450.f13864.get(c5442.m9780(next2))) != null) {
                    C5519 c5519M9780 = c5442.m9780(next2);
                    if (c5519M9780 == null || !AbstractC5450.f13865.containsKey(c5519M9780)) {
                        reportLevelM9786 = c5442.m9786(next2);
                        if (reportLevelM9786 == null) {
                            reportLevelM9786 = ((C5444) c8894.f22591).f13821;
                        }
                    } else {
                        reportLevelM9786 = (ReportLevel) ((C1850) c8894.f22589).invoke(c5519M9780);
                    }
                    if (reportLevelM9786 == ReportLevel.IGNORE) {
                        reportLevelM9786 = null;
                    }
                    if (reportLevelM9786 == null) {
                        c54582 = null;
                    } else {
                        C7760 c7760M127862 = C7760.m12786(c5458.f13883, null, reportLevelM9786.isWarning(), 1);
                        Collection collection = c5458.f13882;
                        boolean z4 = c5458.f13881;
                        boolean z5 = c5458.f13880;
                        boolean z6 = c5458.f13879;
                        collection.getClass();
                        c54582 = new C5458(c7760M127862, collection, z4, z5, z6);
                    }
                }
                if (c54582 != null) {
                    c54583 = c54582;
                } else if (!((C5444) c8894.f22591).f13818 && (objM9781 = c5442.m9781(next2, AbstractC5448.f13844)) != null) {
                    Iterator it2 = c5442.m9779(next2).iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it2.next();
                        if (c5442.m9787(next) != null) {
                            break;
                        }
                    }
                    if (next == null) {
                        pair = null;
                    } else {
                        ArrayList arrayListM9783 = c5442.m9783(objM9781, true);
                        LinkedHashSet linkedHashSet = new LinkedHashSet();
                        Iterator it3 = arrayListM9783.iterator();
                        while (it3.hasNext()) {
                            AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType = (AnnotationQualifierApplicabilityType) f13813.get((String) it3.next());
                            if (annotationQualifierApplicabilityType != null) {
                                linkedHashSet.add(annotationQualifierApplicabilityType);
                            }
                        }
                        if (linkedHashSet.contains(AnnotationQualifierApplicabilityType.TYPE_USE)) {
                            Set setM9404 = AbstractC5179.m9404(AnnotationQualifierApplicabilityType.values());
                            AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType2 = AnnotationQualifierApplicabilityType.TYPE_PARAMETER_BOUNDS;
                            setM9404.getClass();
                            LinkedHashSet linkedHashSet2 = new LinkedHashSet(AbstractC5171.m9331(setM9404.size()));
                            boolean z7 = false;
                            for (Object obj : setM9404) {
                                if (z7 || !AbstractC5227.m9466(obj, annotationQualifierApplicabilityType2)) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                    z7 = true;
                                }
                                if (z2) {
                                    linkedHashSet2.add(obj);
                                }
                            }
                            linkedHashSet = AbstractC8568.m13613(linkedHashSet2, linkedHashSet);
                        }
                        pair = new Pair(next, linkedHashSet);
                    }
                    if (pair == null) {
                        c54583 = null;
                    } else {
                        Object objComponent1 = pair.component1();
                        Set set = (Set) pair.component2();
                        ReportLevel reportLevelM97862 = c5442.m9786(next2);
                        if (reportLevelM97862 == null && (reportLevelM97862 = c5442.m9786(objComponent1)) == null) {
                            reportLevelM97862 = ((C5444) c8894.f22591).f13821;
                        }
                        if (!reportLevelM97862.isIgnore()) {
                            objComponent1.getClass();
                            C7760 c7760M9784 = c5442.m9784(objComponent1, false);
                            if (c7760M9784 != null) {
                                c7760M12786 = c7760M9784;
                            } else {
                                Object objM9787 = c5442.m9787(objComponent1);
                                if (objM9787 != null) {
                                    ReportLevel reportLevelM97863 = c5442.m9786(objComponent1);
                                    if (reportLevelM97863 == null) {
                                        reportLevelM97863 = ((C5444) c8894.f22591).f13821;
                                    }
                                    if (!reportLevelM97863.isIgnore()) {
                                        C7760 c7760M97842 = c5442.m9784(objM9787, false);
                                        if (c7760M97842 != null) {
                                            nullabilityQualifier = null;
                                            i = 1;
                                            c7760M12786 = C7760.m12786(c7760M97842, null, reportLevelM97863.isWarning(), 1);
                                        } else {
                                            nullabilityQualifier = null;
                                            i = 1;
                                            c7760M12786 = null;
                                        }
                                        c54583 = c7760M12786 != null ? nullabilityQualifier : new C5458(C7760.m12786(c7760M12786, nullabilityQualifier, reportLevelM97862.isWarning(), i), set, 28);
                                    }
                                }
                                c7760M12786 = null;
                            }
                            nullabilityQualifier = null;
                            i = 1;
                            if (c7760M12786 != null) {
                            }
                        }
                    }
                }
                if (c54583 != null) {
                    arrayList.add(c54583);
                }
            }
            if (!arrayList.isEmpty()) {
                EnumMap enumMap = new EnumMap(AnnotationQualifierApplicabilityType.class);
                for (C5458 c54584 : arrayList) {
                    for (AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType3 : c54584.f13882) {
                        enumMap.containsKey(annotationQualifierApplicabilityType3);
                        enumMap.put(annotationQualifierApplicabilityType3, c54584);
                    }
                }
                EnumMap enumMap2 = c5452 != null ? new EnumMap(c5452.f13872) : new EnumMap(AnnotationQualifierApplicabilityType.class);
                for (Map.Entry entry : enumMap.entrySet()) {
                    AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType4 = (AnnotationQualifierApplicabilityType) entry.getKey();
                    C5458 c54585 = (C5458) entry.getValue();
                    if (c54585 != null) {
                        enumMap2.put(annotationQualifierApplicabilityType4, c54585);
                        z = true;
                    }
                }
                if (z) {
                    return new C5452(enumMap2);
                }
            }
        }
        return c5452;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static List m9778(AbstractC5600 abstractC5600) {
        if (!(abstractC5600 instanceof C5585)) {
            return abstractC5600 instanceof C5603 ? AbstractC7176.m12487(((C5603) abstractC5600).f14251.m9893()) : EmptyList.INSTANCE;
        }
        Iterable iterable = (Iterable) ((C5585) abstractC5600).f14250;
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            AbstractC5176.m9363(m9778((AbstractC5600) it.next()), arrayList);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final Iterable m9779(Object obj) {
        InterfaceC7310 annotations;
        InterfaceC7307 interfaceC7307 = (InterfaceC7307) obj;
        interfaceC7307.getClass();
        AbstractC7818 abstractC7818M10059 = AbstractC5605.m10059(interfaceC7307);
        return (abstractC7818M10059 == null || (annotations = abstractC7818M10059.getAnnotations()) == null) ? EmptyList.INSTANCE : annotations;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C5519 m9780(Object obj) {
        InterfaceC7307 interfaceC7307 = (InterfaceC7307) obj;
        interfaceC7307.getClass();
        return interfaceC7307.mo9737();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Object m9781(Object obj, C5519 c5519) {
        for (Object obj2 : m9779(obj)) {
            if (AbstractC5227.m9466(m9780(obj2), c5519)) {
                return obj2;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C7760 m9782(Iterable iterable) {
        boolean z;
        iterable.getClass();
        AbstractAnnotationTypeQualifierResolver$extractMutability$1 abstractAnnotationTypeQualifierResolver$extractMutability$1 = new AbstractAnnotationTypeQualifierResolver$extractMutability$1(this);
        Iterator it = iterable.iterator();
        C7760 c7760 = null;
        while (it.hasNext()) {
            C7760 c77602 = (C7760) abstractAnnotationTypeQualifierResolver$extractMutability$1.invoke(it.next());
            if (c7760 != null) {
                boolean z2 = c7760.f18835;
                if (c77602 != null && !c77602.equals(c7760) && (!(z = c77602.f18835) || z2)) {
                    if (z || !z2) {
                        return null;
                    }
                }
            }
            c7760 = c77602;
        }
        return c7760;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final ArrayList m9783(Object obj, boolean z) {
        Map mapMo9735 = ((InterfaceC7307) obj).mo9735();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : mapMo9735.entrySet()) {
            AbstractC5176.m9363((!z || AbstractC5227.m9466((C5523) entry.getKey(), AbstractC5447.f13829)) ? m9778((AbstractC5600) entry.getValue()) : EmptyList.INSTANCE, arrayList);
        }
        return arrayList;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final C7760 m9784(Object obj, boolean z) {
        NullabilityQualifier nullabilityQualifier;
        C5519 c5519M9780 = m9780(obj);
        if (c5519M9780 == null) {
            return null;
        }
        ReportLevel reportLevel = (ReportLevel) ((C1850) this.f13815.f22589).invoke(c5519M9780);
        if (reportLevel.isIgnore()) {
            return null;
        }
        if (AbstractC5448.f13856.contains(c5519M9780)) {
            nullabilityQualifier = NullabilityQualifier.NOT_NULL;
        } else if (AbstractC5448.f13857.contains(c5519M9780)) {
            nullabilityQualifier = NullabilityQualifier.NULLABLE;
        } else if (AbstractC5448.f13851.contains(c5519M9780)) {
            nullabilityQualifier = NullabilityQualifier.FORCE_FLEXIBILITY;
        } else {
            if (!c5519M9780.equals(AbstractC5448.f13855)) {
                return null;
            }
            String str = (String) AbstractC5176.m9375(m9783(obj, false));
            if (str != null) {
                switch (str.hashCode()) {
                    case 73135176:
                        if (!str.equals("MAYBE")) {
                            return null;
                        }
                        nullabilityQualifier = NullabilityQualifier.NULLABLE;
                        break;
                    case 74175084:
                        if (!str.equals("NEVER")) {
                            return null;
                        }
                        nullabilityQualifier = NullabilityQualifier.NULLABLE;
                        break;
                    case 433141802:
                        if (!str.equals("UNKNOWN")) {
                            return null;
                        }
                        nullabilityQualifier = NullabilityQualifier.FORCE_FLEXIBILITY;
                        break;
                        break;
                    case 1933739535:
                        if (!str.equals("ALWAYS")) {
                            return null;
                        }
                        nullabilityQualifier = NullabilityQualifier.NOT_NULL;
                        break;
                    default:
                        return null;
                }
            } else {
                nullabilityQualifier = NullabilityQualifier.NOT_NULL;
            }
        }
        return new C7760(nullabilityQualifier, reportLevel.isWarning() || z);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final boolean m9785(Object obj, C5519 c5519) {
        Iterable iterableM9779 = m9779(obj);
        if ((iterableM9779 instanceof Collection) && ((Collection) iterableM9779).isEmpty()) {
            return false;
        }
        Iterator it = iterableM9779.iterator();
        while (it.hasNext()) {
            if (AbstractC5227.m9466(m9780(it.next()), c5519)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final ReportLevel m9786(Object obj) {
        String str;
        C5444 c5444 = (C5444) this.f13815.f22591;
        ReportLevel reportLevel = (ReportLevel) c5444.f13819.get(m9780(obj));
        if (reportLevel != null) {
            return reportLevel;
        }
        Object objM9781 = m9781(obj, AbstractC5448.f13853);
        if (objM9781 == null || (str = (String) AbstractC5176.m9375(m9783(objM9781, false))) == null) {
            return null;
        }
        ReportLevel reportLevel2 = c5444.f13820;
        if (reportLevel2 != null) {
            return reportLevel2;
        }
        int iHashCode = str.hashCode();
        if (iHashCode == -2137067054) {
            if (str.equals("IGNORE")) {
                return ReportLevel.IGNORE;
            }
            return null;
        }
        if (iHashCode == -1838656823) {
            if (str.equals("STRICT")) {
                return ReportLevel.STRICT;
            }
            return null;
        }
        if (iHashCode == 2656902 && str.equals("WARN")) {
            return ReportLevel.WARN;
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final Object m9787(Object obj) {
        Object objM9787;
        obj.getClass();
        if (!((C5444) this.f13815.f22591).f13818) {
            if (AbstractC5176.m9365(AbstractC5448.f13859, m9780(obj)) || m9785(obj, AbstractC5448.f13846)) {
                return obj;
            }
            if (m9785(obj, AbstractC5448.f13845)) {
                AbstractC7818 abstractC7818M10059 = AbstractC5605.m10059((InterfaceC7307) obj);
                abstractC7818M10059.getClass();
                ConcurrentHashMap concurrentHashMap = this.f13814;
                Object obj2 = concurrentHashMap.get(abstractC7818M10059);
                if (obj2 != null) {
                    return obj2;
                }
                Iterator it = m9779(obj).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        objM9787 = null;
                        break;
                    }
                    objM9787 = m9787(it.next());
                    if (objM9787 != null) {
                        break;
                    }
                }
                if (objM9787 != null) {
                    Object objPutIfAbsent = concurrentHashMap.putIfAbsent(abstractC7818M10059, objM9787);
                    return objPutIfAbsent == null ? objM9787 : objPutIfAbsent;
                }
            }
        }
        return null;
    }
}
