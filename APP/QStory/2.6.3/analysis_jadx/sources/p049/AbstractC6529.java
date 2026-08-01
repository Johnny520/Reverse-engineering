package p049;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.AbstractC4339;
import kotlin.collections.AbstractC4344;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.reflect.jvm.internal.impl.builtins.UnsignedArrayType;
import kotlin.reflect.jvm.internal.impl.builtins.UnsignedType;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4466;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4477;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4499;
import kotlin.reflect.jvm.internal.impl.name.C4691;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4882;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4917;
import p079.AbstractC6986;

/* JADX INFO: renamed from: 飘花落叶言世子兰苏哲楪.飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6529 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final LinkedHashSet f17916;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final HashMap f17917;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final HashMap f17918;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final Set f17919;

    static {
        UnsignedType[] unsignedTypeArrValues = UnsignedType.values();
        ArrayList arrayList = new ArrayList(unsignedTypeArrValues.length);
        for (UnsignedType unsignedType : unsignedTypeArrValues) {
            arrayList.add(unsignedType.getTypeName());
        }
        f17919 = AbstractC4344.m8788(arrayList);
        UnsignedArrayType[] unsignedArrayTypeArrValues = UnsignedArrayType.values();
        ArrayList arrayList2 = new ArrayList(unsignedArrayTypeArrValues.length);
        for (UnsignedArrayType unsignedArrayType : unsignedArrayTypeArrValues) {
            arrayList2.add(unsignedArrayType.getTypeName());
        }
        AbstractC4344.m8788(arrayList2);
        f17918 = new HashMap();
        f17917 = new HashMap();
        AbstractC4339.m8770(new HashMap(AbstractC4339.m8772(4)), new Pair[]{new Pair(UnsignedArrayType.UBYTEARRAY, C4691.m9330("ubyteArrayOf")), new Pair(UnsignedArrayType.USHORTARRAY, C4691.m9330("ushortArrayOf")), new Pair(UnsignedArrayType.UINTARRAY, C4691.m9330("uintArrayOf")), new Pair(UnsignedArrayType.ULONGARRAY, C4691.m9330("ulongArrayOf"))});
        UnsignedType[] unsignedTypeArrValues2 = UnsignedType.values();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (UnsignedType unsignedType2 : unsignedTypeArrValues2) {
            linkedHashSet.add(unsignedType2.getArrayClassId().m9323());
        }
        f17916 = linkedHashSet;
        for (UnsignedType unsignedType3 : UnsignedType.values()) {
            f17918.put(unsignedType3.getArrayClassId(), unsignedType3.getClassId());
            f17917.put(unsignedType3.getClassId(), unsignedType3.getArrayClassId());
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final boolean m12007(AbstractC4882 abstractC4882) {
        InterfaceC4477 interfaceC4477Mo9211;
        if (AbstractC4917.m9852(abstractC4882) || (interfaceC4477Mo9211 = abstractC4882.mo9722().mo9211()) == null) {
            return false;
        }
        InterfaceC4499 interfaceC4499Mo9028 = interfaceC4477Mo9211.mo9028();
        return (interfaceC4499Mo9028 instanceof InterfaceC4466) && AbstractC4395.m8907(((AbstractC6986) ((InterfaceC4466) interfaceC4499Mo9028)).f18687, AbstractC6526.f17853) && f17919.contains(interfaceC4477Mo9211.getName());
    }
}
