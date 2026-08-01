package p067;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.AbstractC4343;
import kotlin.collections.AbstractC4344;
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
import kotlin.reflect.jvm.internal.impl.protobuf.C4724;
import kotlin.reflect.jvm.internal.impl.protobuf.C4725;
import net.bytebuddy.description.method.MethodDescription;
import p015.C6230;
import p070.AbstractC6908;
import p070.AbstractC6911;
import p070.C6901;
import p070.InterfaceC6907;
import p071.AbstractC6912;
import p075.AbstractC6954;
import p253.AbstractC8189;

/* JADX INFO: renamed from: 飘花落叶言世楪兰子苏哲.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6892 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C4725 f18352;

    static {
        C4725 c4725 = new C4725();
        c4725.m9424(AbstractC6912.f18437);
        c4725.m9424(AbstractC6912.f18436);
        c4725.m9424(AbstractC6912.f18435);
        c4725.m9424(AbstractC6912.f18434);
        c4725.m9424(AbstractC6912.f18433);
        c4725.m9424(AbstractC6912.f18432);
        c4725.m9424(AbstractC6912.f18439);
        c4725.m9424(AbstractC6912.f18438);
        c4725.m9424(AbstractC6912.f18442);
        c4725.m9424(AbstractC6912.f18443);
        c4725.m9424(AbstractC6912.f18440);
        c4725.m9424(AbstractC6912.f18441);
        c4725.m9424(AbstractC6954.f18595);
        f18352 = c4725;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final Pair m12138(String[] strArr, String[] strArr2) {
        strArr2.getClass();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(AbstractC6889.m12135(strArr));
        return new Pair(m12144(byteArrayInputStream, strArr2), ProtoBuf$Class.parseFrom(byteArrayInputStream, f18352));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static String m12139(ProtoBuf$Type protoBuf$Type, InterfaceC6907 interfaceC6907) {
        if (protoBuf$Type.hasClassName()) {
            return AbstractC6888.m12133(interfaceC6907.mo12137(protoBuf$Type.getClassName()));
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final boolean m12140(ProtoBuf$Property protoBuf$Property) {
        protoBuf$Property.getClass();
        C6901 c6901 = AbstractC6887.f18344;
        C6901 c69012 = AbstractC6887.f18344;
        Object extension = protoBuf$Property.getExtension(AbstractC6912.f18433);
        extension.getClass();
        return c69012.mo12153(((Number) extension).intValue()).booleanValue();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static C6885 m12141(ProtoBuf$Function protoBuf$Function, InterfaceC6907 interfaceC6907, C6230 c6230) {
        String strConcat;
        protoBuf$Function.getClass();
        interfaceC6907.getClass();
        c6230.getClass();
        C4724 c4724 = AbstractC6912.f18436;
        c4724.getClass();
        JvmProtoBuf$JvmMethodSignature jvmProtoBuf$JvmMethodSignature = (JvmProtoBuf$JvmMethodSignature) AbstractC6911.m12176(protoBuf$Function, c4724);
        int name = (jvmProtoBuf$JvmMethodSignature == null || !jvmProtoBuf$JvmMethodSignature.hasName()) ? protoBuf$Function.getName() : jvmProtoBuf$JvmMethodSignature.getName();
        if (jvmProtoBuf$JvmMethodSignature == null || !jvmProtoBuf$JvmMethodSignature.hasDesc()) {
            List listM13658 = AbstractC8189.m13658(AbstractC6908.m12173(protoBuf$Function, c6230));
            List<ProtoBuf$ValueParameter> valueParameterList = protoBuf$Function.getValueParameterList();
            valueParameterList.getClass();
            ArrayList arrayList = new ArrayList(AbstractC4344.m8832(valueParameterList, 10));
            for (ProtoBuf$ValueParameter protoBuf$ValueParameter : valueParameterList) {
                protoBuf$ValueParameter.getClass();
                arrayList.add(AbstractC6908.m12167(protoBuf$ValueParameter, c6230));
            }
            ArrayList arrayListM8825 = AbstractC4343.m8825(arrayList, listM13658);
            ArrayList arrayList2 = new ArrayList(AbstractC4344.m8832(arrayListM8825, 10));
            Iterator it = arrayListM8825.iterator();
            while (it.hasNext()) {
                String strM12139 = m12139((ProtoBuf$Type) it.next(), interfaceC6907);
                if (strM12139 == null) {
                    return null;
                }
                arrayList2.add(strM12139);
            }
            String strM121392 = m12139(AbstractC6908.m12171(protoBuf$Function, c6230), interfaceC6907);
            if (strM121392 == null) {
                return null;
            }
            strConcat = AbstractC4343.m8813(arrayList2, "", "(", ")", null, 56).concat(strM121392);
        } else {
            strConcat = interfaceC6907.getString(jvmProtoBuf$JvmMethodSignature.getDesc());
        }
        return new C6885(interfaceC6907.getString(name), strConcat);
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
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1120)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1120)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:35)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static p067.C6886 m12142(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property r3, p070.InterfaceC6907 r4, p015.C6230 r5, boolean r6) {
        /*
            r3.getClass()
            r4.getClass()
            r5.getClass()
            kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子楪哲苏兰世 r0 = p071.AbstractC6912.f18434
            r0.getClass()
            java.lang.Object r0 = p070.AbstractC6911.m12176(r3, r0)
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
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type r3 = p070.AbstractC6908.m12172(r3, r5)
            java.lang.String r3 = m12139(r3, r4)
            if (r3 != 0) goto L56
        L55:
            return r1
        L56:
            飘花落叶言世楪兰子苏哲.飘花落叶言子楪世哲兰苏 r5 = new 飘花落叶言世楪兰子苏哲.飘花落叶言子楪世哲兰苏
            java.lang.String r4 = r4.getString(r6)
            r5.<init>(r4, r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p067.C6892.m12142(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property, 飘花落叶言世楪哲兰子苏.飘花落叶言子楪苏世哲兰, 飘花落叶言世兰楪子苏哲.飘花落叶言子楪苏哲兰世, boolean):飘花落叶言世楪兰子苏哲.飘花落叶言子楪世哲兰苏");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static C6885 m12143(ProtoBuf$Constructor protoBuf$Constructor, InterfaceC6907 interfaceC6907, C6230 c6230) throws IOException {
        String strM8813;
        protoBuf$Constructor.getClass();
        interfaceC6907.getClass();
        c6230.getClass();
        C4724 c4724 = AbstractC6912.f18437;
        c4724.getClass();
        JvmProtoBuf$JvmMethodSignature jvmProtoBuf$JvmMethodSignature = (JvmProtoBuf$JvmMethodSignature) AbstractC6911.m12176(protoBuf$Constructor, c4724);
        String string = (jvmProtoBuf$JvmMethodSignature == null || !jvmProtoBuf$JvmMethodSignature.hasName()) ? MethodDescription.CONSTRUCTOR_INTERNAL_NAME : interfaceC6907.getString(jvmProtoBuf$JvmMethodSignature.getName());
        if (jvmProtoBuf$JvmMethodSignature == null || !jvmProtoBuf$JvmMethodSignature.hasDesc()) {
            List<ProtoBuf$ValueParameter> valueParameterList = protoBuf$Constructor.getValueParameterList();
            valueParameterList.getClass();
            ArrayList arrayList = new ArrayList(AbstractC4344.m8832(valueParameterList, 10));
            for (ProtoBuf$ValueParameter protoBuf$ValueParameter : valueParameterList) {
                protoBuf$ValueParameter.getClass();
                String strM12139 = m12139(AbstractC6908.m12167(protoBuf$ValueParameter, c6230), interfaceC6907);
                if (strM12139 == null) {
                    return null;
                }
                arrayList.add(strM12139);
            }
            strM8813 = AbstractC4343.m8813(arrayList, "", "(", ")V", null, 56);
        } else {
            strM8813 = interfaceC6907.getString(jvmProtoBuf$JvmMethodSignature.getDesc());
        }
        return new C6885(string, strM8813);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static C6884 m12144(ByteArrayInputStream byteArrayInputStream, String[] strArr) {
        JvmProtoBuf$StringTableTypes delimitedFrom = JvmProtoBuf$StringTableTypes.parseDelimitedFrom(byteArrayInputStream, f18352);
        delimitedFrom.getClass();
        strArr.getClass();
        List<Integer> localNameList = delimitedFrom.getLocalNameList();
        Set setM8800 = localNameList.isEmpty() ? EmptySet.INSTANCE : AbstractC4343.m8800(localNameList);
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
        return new C6884(strArr, setM8800, arrayList);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final Pair m12145(String[] strArr, String[] strArr2) {
        strArr2.getClass();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(AbstractC6889.m12135(strArr));
        return new Pair(m12144(byteArrayInputStream, strArr2), ProtoBuf$Function.parseFrom(byteArrayInputStream, f18352));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final Pair m12146(String[] strArr, String[] strArr2) {
        strArr2.getClass();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(AbstractC6889.m12135(strArr));
        return new Pair(m12144(byteArrayInputStream, strArr2), ProtoBuf$Package.parseFrom(byteArrayInputStream, f18352));
    }
}
