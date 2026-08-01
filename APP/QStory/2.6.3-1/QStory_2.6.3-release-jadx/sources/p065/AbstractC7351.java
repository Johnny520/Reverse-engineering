package p065;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.AbstractC5176;
import kotlin.collections.AbstractC5177;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.name.C5519;
import kotlin.reflect.jvm.internal.impl.name.C5520;

/* JADX INFO: renamed from: 飘花落叶言世子兰苏哲楪.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC7351 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final LinkedHashSet f18176;

    static {
        Set<PrimitiveType> set = PrimitiveType.NUMBER_TYPES;
        ArrayList arrayList = new ArrayList(AbstractC5177.m9381(set, 10));
        for (PrimitiveType primitiveType : set) {
            primitiveType.getClass();
            arrayList.add(AbstractC7355.f18198.m9880(primitiveType.getTypeName()));
        }
        ArrayList<C5519> arrayListM9353 = AbstractC5176.m9353(AbstractC5176.m9353(AbstractC5176.m9353(arrayList, AbstractC7356.f18225.m9878()), AbstractC7356.f18243.m9878()), AbstractC7356.f18248.m9878());
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (C5519 c5519 : arrayListM9353) {
            c5519.getClass();
            linkedHashSet.add(new C5520(c5519.m9879(), c5519.f14041.m9877()));
        }
        f18176 = linkedHashSet;
    }
}
