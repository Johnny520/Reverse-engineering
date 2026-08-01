package kotlin.reflect.jvm.internal.impl.load.java;

import androidx.compose.foundation.text.C1012;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.AbstractC4343;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier;
import kotlin.reflect.jvm.internal.impl.name.C4686;
import kotlin.reflect.jvm.internal.impl.name.C4690;
import kotlin.reflect.jvm.internal.impl.resolve.constants.AbstractC4767;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C4752;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C4770;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.AbstractC4772;
import p046.InterfaceC6477;
import p046.InterfaceC6480;
import p073.C6930;
import p079.AbstractC6988;
import p232.C8064;
import p253.AbstractC8189;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.java.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4609 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final LinkedHashMap f13464;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final ConcurrentHashMap f13465 = new ConcurrentHashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C8064 f13466;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType : AnnotationQualifierApplicabilityType.values()) {
            String javaTarget = annotationQualifierApplicabilityType.getJavaTarget();
            if (linkedHashMap.get(javaTarget) == null) {
                linkedHashMap.put(javaTarget, annotationQualifierApplicabilityType);
            }
        }
        f13464 = linkedHashMap;
    }

    public C4609(C8064 c8064) {
        this.f13466 = c8064;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01a1  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static kotlin.reflect.jvm.internal.impl.load.java.C4619 m9228(kotlin.reflect.jvm.internal.impl.load.java.C4609 r19, kotlin.reflect.jvm.internal.impl.load.java.C4619 r20, p046.InterfaceC6480 r21) {
        /*
            Method dump skipped, instruction units count: 561
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.C4609.m9228(kotlin.reflect.jvm.internal.impl.load.java.飘花落叶言子楪世苏哲兰, kotlin.reflect.jvm.internal.impl.load.java.飘花落叶言子楪哲兰苏世, 飘花落叶言世子兰哲苏楪.飘花落叶言子楪苏世兰哲):kotlin.reflect.jvm.internal.impl.load.java.飘花落叶言子楪哲兰苏世");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static List m9229(AbstractC4767 abstractC4767) {
        if (!(abstractC4767 instanceof C4752)) {
            return abstractC4767 instanceof C4770 ? AbstractC8189.m13660(((C4770) abstractC4767).f13902.m9344()) : EmptyList.INSTANCE;
        }
        Iterable iterable = (Iterable) ((C4752) abstractC4767).f13901;
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            AbstractC4343.m8794(m9229((AbstractC4767) it.next()), arrayList);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final Iterable m9230(Object obj) {
        InterfaceC6480 annotations;
        InterfaceC6477 interfaceC6477 = (InterfaceC6477) obj;
        interfaceC6477.getClass();
        AbstractC6988 abstractC6988M9510 = AbstractC4772.m9510(interfaceC6477);
        return (abstractC6988M9510 == null || (annotations = abstractC6988M9510.getAnnotations()) == null) ? EmptyList.INSTANCE : annotations;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C4686 m9231(Object obj) {
        InterfaceC6477 interfaceC6477 = (InterfaceC6477) obj;
        interfaceC6477.getClass();
        return interfaceC6477.mo9188();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Object m9232(Object obj, C4686 c4686) {
        for (Object obj2 : m9230(obj)) {
            if (AbstractC4394.m8917(m9231(obj2), c4686)) {
                return obj2;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C6930 m9233(Iterable iterable) {
        boolean z;
        iterable.getClass();
        AbstractAnnotationTypeQualifierResolver$extractMutability$1 abstractAnnotationTypeQualifierResolver$extractMutability$1 = new AbstractAnnotationTypeQualifierResolver$extractMutability$1(this);
        Iterator it = iterable.iterator();
        C6930 c6930 = null;
        while (it.hasNext()) {
            C6930 c69302 = (C6930) abstractAnnotationTypeQualifierResolver$extractMutability$1.invoke(it.next());
            if (c6930 != null) {
                boolean z2 = c6930.f18495;
                if (c69302 != null && !c69302.equals(c6930) && (!(z = c69302.f18495) || z2)) {
                    if (z || !z2) {
                        return null;
                    }
                }
            }
            c6930 = c69302;
        }
        return c6930;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final ArrayList m9234(Object obj, boolean z) {
        Map mapMo9186 = ((InterfaceC6477) obj).mo9186();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : mapMo9186.entrySet()) {
            AbstractC4343.m8794((!z || AbstractC4394.m8917((C4690) entry.getKey(), AbstractC4614.f13480)) ? m9229((AbstractC4767) entry.getValue()) : EmptyList.INSTANCE, arrayList);
        }
        return arrayList;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final C6930 m9235(Object obj, boolean z) {
        NullabilityQualifier nullabilityQualifier;
        C4686 c4686M9231 = m9231(obj);
        if (c4686M9231 == null) {
            return null;
        }
        ReportLevel reportLevel = (ReportLevel) ((C1012) this.f13466.f22246).invoke(c4686M9231);
        if (reportLevel.isIgnore()) {
            return null;
        }
        if (AbstractC4615.f13507.contains(c4686M9231)) {
            nullabilityQualifier = NullabilityQualifier.NOT_NULL;
        } else if (AbstractC4615.f13508.contains(c4686M9231)) {
            nullabilityQualifier = NullabilityQualifier.NULLABLE;
        } else if (AbstractC4615.f13502.contains(c4686M9231)) {
            nullabilityQualifier = NullabilityQualifier.FORCE_FLEXIBILITY;
        } else {
            if (!c4686M9231.equals(AbstractC4615.f13506)) {
                return null;
            }
            String str = (String) AbstractC4343.m8826(m9234(obj, false));
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
        return new C6930(nullabilityQualifier, reportLevel.isWarning() || z);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final boolean m9236(Object obj, C4686 c4686) {
        Iterable iterableM9230 = m9230(obj);
        if ((iterableM9230 instanceof Collection) && ((Collection) iterableM9230).isEmpty()) {
            return false;
        }
        Iterator it = iterableM9230.iterator();
        while (it.hasNext()) {
            if (AbstractC4394.m8917(m9231(it.next()), c4686)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final ReportLevel m9237(Object obj) {
        String str;
        C4611 c4611 = (C4611) this.f13466.f22248;
        ReportLevel reportLevel = (ReportLevel) c4611.f13470.get(m9231(obj));
        if (reportLevel != null) {
            return reportLevel;
        }
        Object objM9232 = m9232(obj, AbstractC4615.f13504);
        if (objM9232 == null || (str = (String) AbstractC4343.m8826(m9234(objM9232, false))) == null) {
            return null;
        }
        ReportLevel reportLevel2 = c4611.f13471;
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
    public final Object m9238(Object obj) {
        Object objM9238;
        obj.getClass();
        if (!((C4611) this.f13466.f22248).f13469) {
            if (AbstractC4343.m8789(AbstractC4615.f13510, m9231(obj)) || m9236(obj, AbstractC4615.f13497)) {
                return obj;
            }
            if (m9236(obj, AbstractC4615.f13496)) {
                AbstractC6988 abstractC6988M9510 = AbstractC4772.m9510((InterfaceC6477) obj);
                abstractC6988M9510.getClass();
                ConcurrentHashMap concurrentHashMap = this.f13465;
                Object obj2 = concurrentHashMap.get(abstractC6988M9510);
                if (obj2 != null) {
                    return obj2;
                }
                Iterator it = m9230(obj).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        objM9238 = null;
                        break;
                    }
                    objM9238 = m9238(it.next());
                    if (objM9238 != null) {
                        break;
                    }
                }
                if (objM9238 != null) {
                    Object objPutIfAbsent = concurrentHashMap.putIfAbsent(abstractC6988M9510, objM9238);
                    return objPutIfAbsent == null ? objM9238 : objPutIfAbsent;
                }
            }
        }
        return null;
    }
}
