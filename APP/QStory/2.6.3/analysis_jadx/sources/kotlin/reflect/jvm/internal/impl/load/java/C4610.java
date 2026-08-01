package kotlin.reflect.jvm.internal.impl.load.java;

import androidx.compose.foundation.text.C1012;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.AbstractC4344;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier;
import kotlin.reflect.jvm.internal.impl.name.C4687;
import kotlin.reflect.jvm.internal.impl.name.C4691;
import kotlin.reflect.jvm.internal.impl.resolve.constants.AbstractC4768;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C4753;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C4771;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.AbstractC4773;
import p034.AbstractC6347;
import p046.InterfaceC6478;
import p046.InterfaceC6481;
import p073.C6931;
import p079.AbstractC6989;
import p232.C8065;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.java.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4610 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final LinkedHashMap f13468;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final ConcurrentHashMap f13469 = new ConcurrentHashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C8065 f13470;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType : AnnotationQualifierApplicabilityType.values()) {
            String javaTarget = annotationQualifierApplicabilityType.getJavaTarget();
            if (linkedHashMap.get(javaTarget) == null) {
                linkedHashMap.put(javaTarget, annotationQualifierApplicabilityType);
            }
        }
        f13468 = linkedHashMap;
    }

    public C4610(C8065 c8065) {
        this.f13470 = c8065;
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
    public static kotlin.reflect.jvm.internal.impl.load.java.C4620 m9218(kotlin.reflect.jvm.internal.impl.load.java.C4610 r19, kotlin.reflect.jvm.internal.impl.load.java.C4620 r20, p046.InterfaceC6481 r21) {
        /*
            Method dump skipped, instruction units count: 561
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.C4610.m9218(kotlin.reflect.jvm.internal.impl.load.java.飘花落叶言子楪世苏哲兰, kotlin.reflect.jvm.internal.impl.load.java.飘花落叶言子楪哲兰苏世, 飘花落叶言世子兰哲苏楪.飘花落叶言子楪苏世兰哲):kotlin.reflect.jvm.internal.impl.load.java.飘花落叶言子楪哲兰苏世");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static List m9219(AbstractC4768 abstractC4768) {
        if (!(abstractC4768 instanceof C4753)) {
            return abstractC4768 instanceof C4771 ? AbstractC6347.m11928(((C4771) abstractC4768).f13906.m9334()) : EmptyList.INSTANCE;
        }
        Iterable iterable = (Iterable) ((C4753) abstractC4768).f13905;
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            AbstractC4344.m8804(m9219((AbstractC4768) it.next()), arrayList);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final Iterable m9220(Object obj) {
        InterfaceC6481 annotations;
        InterfaceC6478 interfaceC6478 = (InterfaceC6478) obj;
        interfaceC6478.getClass();
        AbstractC6989 abstractC6989M9500 = AbstractC4773.m9500(interfaceC6478);
        return (abstractC6989M9500 == null || (annotations = abstractC6989M9500.getAnnotations()) == null) ? EmptyList.INSTANCE : annotations;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C4687 m9221(Object obj) {
        InterfaceC6478 interfaceC6478 = (InterfaceC6478) obj;
        interfaceC6478.getClass();
        return interfaceC6478.mo9178();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Object m9222(Object obj, C4687 c4687) {
        for (Object obj2 : m9220(obj)) {
            if (AbstractC4395.m8907(m9221(obj2), c4687)) {
                return obj2;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C6931 m9223(Iterable iterable) {
        boolean z;
        iterable.getClass();
        AbstractAnnotationTypeQualifierResolver$extractMutability$1 abstractAnnotationTypeQualifierResolver$extractMutability$1 = new AbstractAnnotationTypeQualifierResolver$extractMutability$1(this);
        Iterator it = iterable.iterator();
        C6931 c6931 = null;
        while (it.hasNext()) {
            C6931 c69312 = (C6931) abstractAnnotationTypeQualifierResolver$extractMutability$1.invoke(it.next());
            if (c6931 != null) {
                boolean z2 = c6931.f18490;
                if (c69312 != null && !c69312.equals(c6931) && (!(z = c69312.f18490) || z2)) {
                    if (z || !z2) {
                        return null;
                    }
                }
            }
            c6931 = c69312;
        }
        return c6931;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final ArrayList m9224(Object obj, boolean z) {
        Map mapMo9176 = ((InterfaceC6478) obj).mo9176();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : mapMo9176.entrySet()) {
            AbstractC4344.m8804((!z || AbstractC4395.m8907((C4691) entry.getKey(), AbstractC4615.f13484)) ? m9219((AbstractC4768) entry.getValue()) : EmptyList.INSTANCE, arrayList);
        }
        return arrayList;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final C6931 m9225(Object obj, boolean z) {
        NullabilityQualifier nullabilityQualifier;
        C4687 c4687M9221 = m9221(obj);
        if (c4687M9221 == null) {
            return null;
        }
        ReportLevel reportLevel = (ReportLevel) ((C1012) this.f13470.f22244).invoke(c4687M9221);
        if (reportLevel.isIgnore()) {
            return null;
        }
        if (AbstractC4616.f13511.contains(c4687M9221)) {
            nullabilityQualifier = NullabilityQualifier.NOT_NULL;
        } else if (AbstractC4616.f13512.contains(c4687M9221)) {
            nullabilityQualifier = NullabilityQualifier.NULLABLE;
        } else if (AbstractC4616.f13506.contains(c4687M9221)) {
            nullabilityQualifier = NullabilityQualifier.FORCE_FLEXIBILITY;
        } else {
            if (!c4687M9221.equals(AbstractC4616.f13510)) {
                return null;
            }
            String str = (String) AbstractC4344.m8816(m9224(obj, false));
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
        return new C6931(nullabilityQualifier, reportLevel.isWarning() || z);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final boolean m9226(Object obj, C4687 c4687) {
        Iterable iterableM9220 = m9220(obj);
        if ((iterableM9220 instanceof Collection) && ((Collection) iterableM9220).isEmpty()) {
            return false;
        }
        Iterator it = iterableM9220.iterator();
        while (it.hasNext()) {
            if (AbstractC4395.m8907(m9221(it.next()), c4687)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final ReportLevel m9227(Object obj) {
        String str;
        C4612 c4612 = (C4612) this.f13470.f22246;
        ReportLevel reportLevel = (ReportLevel) c4612.f13474.get(m9221(obj));
        if (reportLevel != null) {
            return reportLevel;
        }
        Object objM9222 = m9222(obj, AbstractC4616.f13508);
        if (objM9222 == null || (str = (String) AbstractC4344.m8816(m9224(objM9222, false))) == null) {
            return null;
        }
        ReportLevel reportLevel2 = c4612.f13475;
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
    public final Object m9228(Object obj) {
        Object objM9228;
        obj.getClass();
        if (!((C4612) this.f13470.f22246).f13473) {
            if (AbstractC4344.m8806(AbstractC4616.f13514, m9221(obj)) || m9226(obj, AbstractC4616.f13501)) {
                return obj;
            }
            if (m9226(obj, AbstractC4616.f13500)) {
                AbstractC6989 abstractC6989M9500 = AbstractC4773.m9500((InterfaceC6478) obj);
                abstractC6989M9500.getClass();
                ConcurrentHashMap concurrentHashMap = this.f13469;
                Object obj2 = concurrentHashMap.get(abstractC6989M9500);
                if (obj2 != null) {
                    return obj2;
                }
                Iterator it = m9220(obj).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        objM9228 = null;
                        break;
                    }
                    objM9228 = m9228(it.next());
                    if (objM9228 != null) {
                        break;
                    }
                }
                if (objM9228 != null) {
                    Object objPutIfAbsent = concurrentHashMap.putIfAbsent(abstractC6989M9500, objM9228);
                    return objPutIfAbsent == null ? objM9228 : objPutIfAbsent;
                }
            }
        }
        return null;
    }
}
