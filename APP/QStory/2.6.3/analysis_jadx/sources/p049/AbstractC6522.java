package p049;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.AbstractC4344;
import kotlin.collections.AbstractC4345;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.name.C4687;
import kotlin.reflect.jvm.internal.impl.name.C4688;

/* JADX INFO: renamed from: 飘花落叶言世子兰苏哲楪.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6522 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final LinkedHashSet f17831;

    static {
        Set<PrimitiveType> set = PrimitiveType.NUMBER_TYPES;
        ArrayList arrayList = new ArrayList(AbstractC4345.m8822(set, 10));
        for (PrimitiveType primitiveType : set) {
            primitiveType.getClass();
            arrayList.add(AbstractC6526.f17853.m9321(primitiveType.getTypeName()));
        }
        ArrayList<C4687> arrayListM8794 = AbstractC4344.m8794(AbstractC4344.m8794(AbstractC4344.m8794(arrayList, AbstractC6527.f17880.m9319()), AbstractC6527.f17898.m9319()), AbstractC6527.f17903.m9319());
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (C4687 c4687 : arrayListM8794) {
            c4687.getClass();
            linkedHashSet.add(new C4688(c4687.m9320(), c4687.f13696.m9318()));
        }
        f17831 = linkedHashSet;
    }
}
