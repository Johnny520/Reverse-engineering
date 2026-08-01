package p083;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.AbstractC5176;
import kotlin.collections.AbstractC5177;
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
import kotlin.reflect.jvm.internal.impl.protobuf.C5557;
import kotlin.reflect.jvm.internal.impl.protobuf.C5558;
import net.bytebuddy.description.method.MethodDescription;
import p023.C6986;
import p050.AbstractC7176;
import p086.AbstractC7738;
import p086.AbstractC7741;
import p086.C7731;
import p086.InterfaceC7737;
import p087.AbstractC7742;
import p091.AbstractC7784;

/* JADX INFO: renamed from: 飘花落叶言世楪兰子苏哲.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7722 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C5558 f18692;

    static {
        C5558 c5558 = new C5558();
        c5558.m9973(AbstractC7742.f18777);
        c5558.m9973(AbstractC7742.f18776);
        c5558.m9973(AbstractC7742.f18775);
        c5558.m9973(AbstractC7742.f18774);
        c5558.m9973(AbstractC7742.f18773);
        c5558.m9973(AbstractC7742.f18772);
        c5558.m9973(AbstractC7742.f18779);
        c5558.m9973(AbstractC7742.f18778);
        c5558.m9973(AbstractC7742.f18782);
        c5558.m9973(AbstractC7742.f18783);
        c5558.m9973(AbstractC7742.f18780);
        c5558.m9973(AbstractC7742.f18781);
        c5558.m9973(AbstractC7784.f18935);
        f18692 = c5558;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final Pair m12725(String[] strArr, String[] strArr2) {
        strArr2.getClass();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(AbstractC7719.m12722(strArr));
        return new Pair(m12731(byteArrayInputStream, strArr2), ProtoBuf$Class.parseFrom(byteArrayInputStream, f18692));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static String m12726(ProtoBuf$Type protoBuf$Type, InterfaceC7737 interfaceC7737) {
        if (protoBuf$Type.hasClassName()) {
            return AbstractC7718.m12720(interfaceC7737.mo12724(protoBuf$Type.getClassName()));
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final boolean m12727(ProtoBuf$Property protoBuf$Property) {
        protoBuf$Property.getClass();
        C7731 c7731 = AbstractC7717.f18684;
        C7731 c77312 = AbstractC7717.f18684;
        Object extension = protoBuf$Property.getExtension(AbstractC7742.f18773);
        extension.getClass();
        return c77312.mo12740(((Number) extension).intValue()).booleanValue();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static C7715 m12728(ProtoBuf$Function protoBuf$Function, InterfaceC7737 interfaceC7737, C6986 c6986) {
        String strConcat;
        protoBuf$Function.getClass();
        interfaceC7737.getClass();
        c6986.getClass();
        C5557 c5557 = AbstractC7742.f18776;
        c5557.getClass();
        JvmProtoBuf$JvmMethodSignature jvmProtoBuf$JvmMethodSignature = (JvmProtoBuf$JvmMethodSignature) AbstractC7741.m12763(protoBuf$Function, c5557);
        int name = (jvmProtoBuf$JvmMethodSignature == null || !jvmProtoBuf$JvmMethodSignature.hasName()) ? protoBuf$Function.getName() : jvmProtoBuf$JvmMethodSignature.getName();
        if (jvmProtoBuf$JvmMethodSignature == null || !jvmProtoBuf$JvmMethodSignature.hasDesc()) {
            List listM12489 = AbstractC7176.m12489(AbstractC7738.m12760(protoBuf$Function, c6986));
            List<ProtoBuf$ValueParameter> valueParameterList = protoBuf$Function.getValueParameterList();
            valueParameterList.getClass();
            ArrayList arrayList = new ArrayList(AbstractC5177.m9381(valueParameterList, 10));
            for (ProtoBuf$ValueParameter protoBuf$ValueParameter : valueParameterList) {
                protoBuf$ValueParameter.getClass();
                arrayList.add(AbstractC7738.m12754(protoBuf$ValueParameter, c6986));
            }
            ArrayList arrayListM9352 = AbstractC5176.m9352(arrayList, listM12489);
            ArrayList arrayList2 = new ArrayList(AbstractC5177.m9381(arrayListM9352, 10));
            Iterator it = arrayListM9352.iterator();
            while (it.hasNext()) {
                String strM12726 = m12726((ProtoBuf$Type) it.next(), interfaceC7737);
                if (strM12726 == null) {
                    return null;
                }
                arrayList2.add(strM12726);
            }
            String strM127262 = m12726(AbstractC7738.m12758(protoBuf$Function, c6986), interfaceC7737);
            if (strM127262 == null) {
                return null;
            }
            strConcat = AbstractC5176.m9369(arrayList2, "", "(", ")", null, 56).concat(strM127262);
        } else {
            strConcat = interfaceC7737.getString(jvmProtoBuf$JvmMethodSignature.getDesc());
        }
        return new C7715(interfaceC7737.getString(name), strConcat);
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
    public static p083.C7716 m12729(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property r3, p086.InterfaceC7737 r4, p023.C6986 r5, boolean r6) {
        /*
            r3.getClass()
            r4.getClass()
            r5.getClass()
            kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子楪哲苏兰世 r0 = p087.AbstractC7742.f18774
            r0.getClass()
            java.lang.Object r0 = p086.AbstractC7741.m12763(r3, r0)
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
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type r3 = p086.AbstractC7738.m12759(r3, r5)
            java.lang.String r3 = m12726(r3, r4)
            if (r3 != 0) goto L56
        L55:
            return r1
        L56:
            飘花落叶言世楪兰子苏哲.飘花落叶言子楪世哲兰苏 r5 = new 飘花落叶言世楪兰子苏哲.飘花落叶言子楪世哲兰苏
            java.lang.String r4 = r4.getString(r6)
            r5.<init>(r4, r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p083.C7722.m12729(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property, 飘花落叶言世楪哲兰子苏.飘花落叶言子楪苏世哲兰, 飘花落叶言世兰子哲苏楪.飘花落叶言子楪苏哲兰世, boolean):飘花落叶言世楪兰子苏哲.飘花落叶言子楪世哲兰苏");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static C7715 m12730(ProtoBuf$Constructor protoBuf$Constructor, InterfaceC7737 interfaceC7737, C6986 c6986) throws IOException {
        String strM9369;
        protoBuf$Constructor.getClass();
        interfaceC7737.getClass();
        c6986.getClass();
        C5557 c5557 = AbstractC7742.f18777;
        c5557.getClass();
        JvmProtoBuf$JvmMethodSignature jvmProtoBuf$JvmMethodSignature = (JvmProtoBuf$JvmMethodSignature) AbstractC7741.m12763(protoBuf$Constructor, c5557);
        String string = (jvmProtoBuf$JvmMethodSignature == null || !jvmProtoBuf$JvmMethodSignature.hasName()) ? MethodDescription.CONSTRUCTOR_INTERNAL_NAME : interfaceC7737.getString(jvmProtoBuf$JvmMethodSignature.getName());
        if (jvmProtoBuf$JvmMethodSignature == null || !jvmProtoBuf$JvmMethodSignature.hasDesc()) {
            List<ProtoBuf$ValueParameter> valueParameterList = protoBuf$Constructor.getValueParameterList();
            valueParameterList.getClass();
            ArrayList arrayList = new ArrayList(AbstractC5177.m9381(valueParameterList, 10));
            for (ProtoBuf$ValueParameter protoBuf$ValueParameter : valueParameterList) {
                protoBuf$ValueParameter.getClass();
                String strM12726 = m12726(AbstractC7738.m12754(protoBuf$ValueParameter, c6986), interfaceC7737);
                if (strM12726 == null) {
                    return null;
                }
                arrayList.add(strM12726);
            }
            strM9369 = AbstractC5176.m9369(arrayList, "", "(", ")V", null, 56);
        } else {
            strM9369 = interfaceC7737.getString(jvmProtoBuf$JvmMethodSignature.getDesc());
        }
        return new C7715(string, strM9369);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static C7714 m12731(ByteArrayInputStream byteArrayInputStream, String[] strArr) {
        JvmProtoBuf$StringTableTypes delimitedFrom = JvmProtoBuf$StringTableTypes.parseDelimitedFrom(byteArrayInputStream, f18692);
        delimitedFrom.getClass();
        strArr.getClass();
        List<Integer> localNameList = delimitedFrom.getLocalNameList();
        Set setM9347 = localNameList.isEmpty() ? EmptySet.INSTANCE : AbstractC5176.m9347(localNameList);
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
        return new C7714(strArr, setM9347, arrayList);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final Pair m12732(String[] strArr, String[] strArr2) {
        strArr2.getClass();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(AbstractC7719.m12722(strArr));
        return new Pair(m12731(byteArrayInputStream, strArr2), ProtoBuf$Function.parseFrom(byteArrayInputStream, f18692));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final Pair m12733(String[] strArr, String[] strArr2) {
        strArr2.getClass();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(AbstractC7719.m12722(strArr));
        return new Pair(m12731(byteArrayInputStream, strArr2), ProtoBuf$Package.parseFrom(byteArrayInputStream, f18692));
    }
}
