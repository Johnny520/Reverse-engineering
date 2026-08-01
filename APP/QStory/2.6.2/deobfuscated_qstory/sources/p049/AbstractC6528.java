package p049;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.AbstractC4338;
import kotlin.collections.AbstractC4343;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.reflect.jvm.internal.impl.builtins.UnsignedArrayType;
import kotlin.reflect.jvm.internal.impl.builtins.UnsignedType;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4465;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4476;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4498;
import kotlin.reflect.jvm.internal.impl.name.C4690;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4881;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4916;
import p079.AbstractC6985;

/* JADX INFO: renamed from: 飘花落叶言世子兰苏哲楪.飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6528 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final LinkedHashSet f17920;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final HashMap f17921;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final HashMap f17922;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final Set f17923;

    static {
        UnsignedType[] unsignedTypeArrValues = UnsignedType.values();
        ArrayList arrayList = new ArrayList(unsignedTypeArrValues.length);
        for (UnsignedType unsignedType : unsignedTypeArrValues) {
            arrayList.add(unsignedType.getTypeName());
        }
        f17923 = AbstractC4343.m8800(arrayList);
        UnsignedArrayType[] unsignedArrayTypeArrValues = UnsignedArrayType.values();
        ArrayList arrayList2 = new ArrayList(unsignedArrayTypeArrValues.length);
        for (UnsignedArrayType unsignedArrayType : unsignedArrayTypeArrValues) {
            arrayList2.add(unsignedArrayType.getTypeName());
        }
        AbstractC4343.m8800(arrayList2);
        f17922 = new HashMap();
        f17921 = new HashMap();
        AbstractC4338.m8784(new HashMap(AbstractC4338.m8779(4)), new Pair[]{new Pair(UnsignedArrayType.UBYTEARRAY, C4690.m9340("ubyteArrayOf")), new Pair(UnsignedArrayType.USHORTARRAY, C4690.m9340("ushortArrayOf")), new Pair(UnsignedArrayType.UINTARRAY, C4690.m9340("uintArrayOf")), new Pair(UnsignedArrayType.ULONGARRAY, C4690.m9340("ulongArrayOf"))});
        UnsignedType[] unsignedTypeArrValues2 = UnsignedType.values();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (UnsignedType unsignedType2 : unsignedTypeArrValues2) {
            linkedHashSet.add(unsignedType2.getArrayClassId().m9333());
        }
        f17920 = linkedHashSet;
        for (UnsignedType unsignedType3 : UnsignedType.values()) {
            f17922.put(unsignedType3.getArrayClassId(), unsignedType3.getClassId());
            f17921.put(unsignedType3.getClassId(), unsignedType3.getArrayClassId());
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final boolean m11964(AbstractC4881 abstractC4881) {
        InterfaceC4476 interfaceC4476Mo9221;
        if (AbstractC4916.m9858(abstractC4881) || (interfaceC4476Mo9221 = abstractC4881.mo9732().mo9221()) == null) {
            return false;
        }
        InterfaceC4498 interfaceC4498Mo9038 = interfaceC4476Mo9221.mo9038();
        return (interfaceC4498Mo9038 instanceof InterfaceC4465) && AbstractC4394.m8917(((AbstractC6985) ((InterfaceC4465) interfaceC4498Mo9038)).f18692, AbstractC6525.f17857) && f17923.contains(interfaceC4476Mo9221.getName());
    }
}
