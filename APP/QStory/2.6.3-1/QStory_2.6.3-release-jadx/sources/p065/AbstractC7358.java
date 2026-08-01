package p065;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.AbstractC5171;
import kotlin.collections.AbstractC5176;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.reflect.jvm.internal.impl.builtins.UnsignedArrayType;
import kotlin.reflect.jvm.internal.impl.builtins.UnsignedType;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5298;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5309;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5331;
import kotlin.reflect.jvm.internal.impl.name.C5523;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5714;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5749;
import p095.AbstractC7815;

/* JADX INFO: renamed from: 飘花落叶言世子兰苏哲楪.飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC7358 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final LinkedHashSet f18261;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final HashMap f18262;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final HashMap f18263;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final Set f18264;

    static {
        UnsignedType[] unsignedTypeArrValues = UnsignedType.values();
        ArrayList arrayList = new ArrayList(unsignedTypeArrValues.length);
        for (UnsignedType unsignedType : unsignedTypeArrValues) {
            arrayList.add(unsignedType.getTypeName());
        }
        f18264 = AbstractC5176.m9347(arrayList);
        UnsignedArrayType[] unsignedArrayTypeArrValues = UnsignedArrayType.values();
        ArrayList arrayList2 = new ArrayList(unsignedArrayTypeArrValues.length);
        for (UnsignedArrayType unsignedArrayType : unsignedArrayTypeArrValues) {
            arrayList2.add(unsignedArrayType.getTypeName());
        }
        AbstractC5176.m9347(arrayList2);
        f18263 = new HashMap();
        f18262 = new HashMap();
        AbstractC5171.m9329(new HashMap(AbstractC5171.m9331(4)), new Pair[]{new Pair(UnsignedArrayType.UBYTEARRAY, C5523.m9889("ubyteArrayOf")), new Pair(UnsignedArrayType.USHORTARRAY, C5523.m9889("ushortArrayOf")), new Pair(UnsignedArrayType.UINTARRAY, C5523.m9889("uintArrayOf")), new Pair(UnsignedArrayType.ULONGARRAY, C5523.m9889("ulongArrayOf"))});
        UnsignedType[] unsignedTypeArrValues2 = UnsignedType.values();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (UnsignedType unsignedType2 : unsignedTypeArrValues2) {
            linkedHashSet.add(unsignedType2.getArrayClassId().m9882());
        }
        f18261 = linkedHashSet;
        for (UnsignedType unsignedType3 : UnsignedType.values()) {
            f18263.put(unsignedType3.getArrayClassId(), unsignedType3.getClassId());
            f18262.put(unsignedType3.getClassId(), unsignedType3.getArrayClassId());
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final boolean m12566(AbstractC5714 abstractC5714) {
        InterfaceC5309 interfaceC5309Mo9770;
        if (AbstractC5749.m10411(abstractC5714) || (interfaceC5309Mo9770 = abstractC5714.mo10281().mo9770()) == null) {
            return false;
        }
        InterfaceC5331 interfaceC5331Mo9587 = interfaceC5309Mo9770.mo9587();
        return (interfaceC5331Mo9587 instanceof InterfaceC5298) && AbstractC5227.m9466(((AbstractC7815) ((InterfaceC5298) interfaceC5331Mo9587)).f19032, AbstractC7355.f18198) && f18264.contains(interfaceC5309Mo9770.getName());
    }
}
