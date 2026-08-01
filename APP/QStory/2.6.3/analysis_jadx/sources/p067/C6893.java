package p067;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.AbstractC4344;
import kotlin.collections.AbstractC4345;
import kotlin.collections.EmptySet;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Constructor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Package;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$ValueParameter;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmMethodSignature;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$StringTableTypes;
import kotlin.reflect.jvm.internal.impl.protobuf.C4725;
import kotlin.reflect.jvm.internal.impl.protobuf.C4726;
import net.bytebuddy.description.method.MethodDescription;
import p007.C6157;
import p034.AbstractC6347;
import p070.AbstractC6909;
import p070.AbstractC6912;
import p070.C6902;
import p070.InterfaceC6908;
import p071.AbstractC6913;
import p075.AbstractC6955;

/* JADX INFO: renamed from: 飘花落叶言世楪兰子苏哲.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6893 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C4726 f18347;

    static {
        C4726 c4726 = new C4726();
        c4726.m9414(AbstractC6913.f18432);
        c4726.m9414(AbstractC6913.f18431);
        c4726.m9414(AbstractC6913.f18430);
        c4726.m9414(AbstractC6913.f18429);
        c4726.m9414(AbstractC6913.f18428);
        c4726.m9414(AbstractC6913.f18427);
        c4726.m9414(AbstractC6913.f18434);
        c4726.m9414(AbstractC6913.f18433);
        c4726.m9414(AbstractC6913.f18437);
        c4726.m9414(AbstractC6913.f18438);
        c4726.m9414(AbstractC6913.f18435);
        c4726.m9414(AbstractC6913.f18436);
        c4726.m9414(AbstractC6955.f18590);
        f18347 = c4726;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final Pair m12166(String[] strArr, String[] strArr2) {
        strArr2.getClass();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(AbstractC6890.m12163(strArr));
        return new Pair(m12172(byteArrayInputStream, strArr2), ProtoBuf$Class.parseFrom(byteArrayInputStream, f18347));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static String m12167(ProtoBuf$Type protoBuf$Type, InterfaceC6908 interfaceC6908) {
        if (protoBuf$Type.hasClassName()) {
            return AbstractC6889.m12161(interfaceC6908.mo12165(protoBuf$Type.getClassName()));
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final boolean m12168(ProtoBuf$Property protoBuf$Property) {
        protoBuf$Property.getClass();
        C6902 c6902 = AbstractC6888.f18339;
        C6902 c69022 = AbstractC6888.f18339;
        Object extension = protoBuf$Property.getExtension(AbstractC6913.f18428);
        extension.getClass();
        return c69022.mo12181(((Number) extension).intValue()).booleanValue();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static C6886 m12169(ProtoBuf$Function protoBuf$Function, InterfaceC6908 interfaceC6908, C6157 c6157) {
        String strConcat;
        protoBuf$Function.getClass();
        interfaceC6908.getClass();
        c6157.getClass();
        C4725 c4725 = AbstractC6913.f18431;
        c4725.getClass();
        JvmProtoBuf$JvmMethodSignature jvmProtoBuf$JvmMethodSignature = (JvmProtoBuf$JvmMethodSignature) AbstractC6912.m12204(protoBuf$Function, c4725);
        int name = (jvmProtoBuf$JvmMethodSignature == null || !jvmProtoBuf$JvmMethodSignature.hasName()) ? protoBuf$Function.getName() : jvmProtoBuf$JvmMethodSignature.getName();
        if (jvmProtoBuf$JvmMethodSignature == null || !jvmProtoBuf$JvmMethodSignature.hasDesc()) {
            List listM11930 = AbstractC6347.m11930(AbstractC6909.m12201(protoBuf$Function, c6157));
            List<ProtoBuf$ValueParameter> valueParameterList = protoBuf$Function.getValueParameterList();
            valueParameterList.getClass();
            ArrayList arrayList = new ArrayList(AbstractC4345.m8822(valueParameterList, 10));
            for (ProtoBuf$ValueParameter protoBuf$ValueParameter : valueParameterList) {
                protoBuf$ValueParameter.getClass();
                arrayList.add(AbstractC6909.m12195(protoBuf$ValueParameter, c6157));
            }
            ArrayList arrayListM8793 = AbstractC4344.m8793(arrayList, listM11930);
            ArrayList arrayList2 = new ArrayList(AbstractC4345.m8822(arrayListM8793, 10));
            Iterator it = arrayListM8793.iterator();
            while (it.hasNext()) {
                String strM12167 = m12167((ProtoBuf$Type) it.next(), interfaceC6908);
                if (strM12167 == null) {
                    return null;
                }
                arrayList2.add(strM12167);
            }
            String strM121672 = m12167(AbstractC6909.m12199(protoBuf$Function, c6157), interfaceC6908);
            if (strM121672 == null) {
                return null;
            }
            strConcat = AbstractC4344.m8810(arrayList2, "", "(", ")", null, 56).concat(strM121672);
        } else {
            strConcat = interfaceC6908.getString(jvmProtoBuf$JvmMethodSignature.getDesc());
        }
        return new C6886(interfaceC6908.getString(name), strConcat);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v2 java.lang.String, still in use, count: 2, list:
          (r3v2 java.lang.String) from 0x0053: IF  (r3v2 java.lang.String) == (null java.lang.String)  -> B:23:0x0055 A[HIDDEN] (LINE:84)
          (r3v2 java.lang.String) from 0x0056: PHI (r3v3 java.lang.String) = (r3v2 java.lang.String), (r3v5 java.lang.String) binds: [B:22:0x0053, B:20:0x0042] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:114)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:62)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:45)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:67)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:35)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static p067.C6887 m12170(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property r3, p070.InterfaceC6908 r4, p007.C6157 r5, boolean r6) {
        /*
            r3.getClass()
            r4.getClass()
            r5.getClass()
            kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子楪哲苏兰世 r0 = p071.AbstractC6913.f18429
            r0.getClass()
            java.lang.Object r0 = p070.AbstractC6912.m12204(r3, r0)
            kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmPropertySignature r0 = (kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmPropertySignature) r0
            r1 = 0
            if (r0 != 0) goto L18
            goto L55
        L18:
            boolean r2 = r0.hasField()
            if (r2 == 0) goto L23
            kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmFieldSignature r0 = r0.getField()
            goto L24
        L23:
            r0 = r1
        L24:
            if (r0 != 0) goto L29
            if (r6 == 0) goto L29
            goto L55
        L29:
            if (r0 == 0) goto L36
            boolean r6 = r0.hasName()
            if (r6 == 0) goto L36
            int r6 = r0.getName()
            goto L3a
        L36:
            int r6 = r3.getName()
        L3a:
            if (r0 == 0) goto L4b
            boolean r2 = r0.hasDesc()
            if (r2 == 0) goto L4b
            int r3 = r0.getDesc()
            java.lang.String r3 = r4.getString(r3)
            goto L56
        L4b:
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type r3 = p070.AbstractC6909.m12200(r3, r5)
            java.lang.String r3 = m12167(r3, r4)
            if (r3 != 0) goto L56
        L55:
            return r1
        L56:
            飘花落叶言世楪兰子苏哲.飘花落叶言子楪世哲兰苏 r5 = new 飘花落叶言世楪兰子苏哲.飘花落叶言子楪世哲兰苏
            java.lang.String r4 = r4.getString(r6)
            r5.<init>(r4, r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p067.C6893.m12170(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property, 飘花落叶言世楪哲兰子苏.飘花落叶言子楪苏世哲兰, 飘花落叶言世兰子哲苏楪.飘花落叶言子楪苏哲兰世, boolean):飘花落叶言世楪兰子苏哲.飘花落叶言子楪世哲兰苏");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static C6886 m12171(ProtoBuf$Constructor protoBuf$Constructor, InterfaceC6908 interfaceC6908, C6157 c6157) throws IOException {
        String strM8810;
        protoBuf$Constructor.getClass();
        interfaceC6908.getClass();
        c6157.getClass();
        C4725 c4725 = AbstractC6913.f18432;
        c4725.getClass();
        JvmProtoBuf$JvmMethodSignature jvmProtoBuf$JvmMethodSignature = (JvmProtoBuf$JvmMethodSignature) AbstractC6912.m12204(protoBuf$Constructor, c4725);
        String string = (jvmProtoBuf$JvmMethodSignature == null || !jvmProtoBuf$JvmMethodSignature.hasName()) ? MethodDescription.CONSTRUCTOR_INTERNAL_NAME : interfaceC6908.getString(jvmProtoBuf$JvmMethodSignature.getName());
        if (jvmProtoBuf$JvmMethodSignature == null || !jvmProtoBuf$JvmMethodSignature.hasDesc()) {
            List<ProtoBuf$ValueParameter> valueParameterList = protoBuf$Constructor.getValueParameterList();
            valueParameterList.getClass();
            ArrayList arrayList = new ArrayList(AbstractC4345.m8822(valueParameterList, 10));
            for (ProtoBuf$ValueParameter protoBuf$ValueParameter : valueParameterList) {
                protoBuf$ValueParameter.getClass();
                String strM12167 = m12167(AbstractC6909.m12195(protoBuf$ValueParameter, c6157), interfaceC6908);
                if (strM12167 == null) {
                    return null;
                }
                arrayList.add(strM12167);
            }
            strM8810 = AbstractC4344.m8810(arrayList, "", "(", ")V", null, 56);
        } else {
            strM8810 = interfaceC6908.getString(jvmProtoBuf$JvmMethodSignature.getDesc());
        }
        return new C6886(string, strM8810);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static C6885 m12172(ByteArrayInputStream byteArrayInputStream, String[] strArr) {
        JvmProtoBuf$StringTableTypes delimitedFrom = JvmProtoBuf$StringTableTypes.parseDelimitedFrom(byteArrayInputStream, f18347);
        delimitedFrom.getClass();
        strArr.getClass();
        List<Integer> localNameList = delimitedFrom.getLocalNameList();
        Set setM8788 = localNameList.isEmpty() ? EmptySet.INSTANCE : AbstractC4344.m8788(localNameList);
        List<JvmProtoBuf$StringTableTypes.Record> recordList = delimitedFrom.getRecordList();
        recordList.getClass();
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(recordList.size());
        for (JvmProtoBuf$StringTableTypes.Record record : recordList) {
            int range = record.getRange();
            for (int i = 0; i < range; i++) {
                arrayList.add(record);
            }
        }
        arrayList.trimToSize();
        return new C6885(strArr, setM8788, arrayList);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final Pair m12173(String[] strArr, String[] strArr2) {
        strArr2.getClass();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(AbstractC6890.m12163(strArr));
        return new Pair(m12172(byteArrayInputStream, strArr2), ProtoBuf$Function.parseFrom(byteArrayInputStream, f18347));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final Pair m12174(String[] strArr, String[] strArr2) {
        strArr2.getClass();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(AbstractC6890.m12163(strArr));
        return new Pair(m12172(byteArrayInputStream, strArr2), ProtoBuf$Package.parseFrom(byteArrayInputStream, f18347));
    }
}
