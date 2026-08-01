package p049;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.AbstractC4343;
import kotlin.collections.AbstractC4344;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.name.C4686;
import kotlin.reflect.jvm.internal.impl.name.C4687;

/* JADX INFO: renamed from: 飘花落叶言世子兰苏哲楪.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6521 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final LinkedHashSet f17835;

    static {
        Set<PrimitiveType> set = PrimitiveType.NUMBER_TYPES;
        ArrayList arrayList = new ArrayList(AbstractC4344.m8832(set, 10));
        for (PrimitiveType primitiveType : set) {
            primitiveType.getClass();
            arrayList.add(AbstractC6525.f17857.m9331(primitiveType.getTypeName()));
        }
        ArrayList<C4686> arrayListM8821 = AbstractC4343.m8821(AbstractC4343.m8821(AbstractC4343.m8821(arrayList, AbstractC6526.f17884.m9329()), AbstractC6526.f17902.m9329()), AbstractC6526.f17907.m9329());
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (C4686 c4686 : arrayListM8821) {
            c4686.getClass();
            linkedHashSet.add(new C4687(c4686.m9330(), c4686.f13692.m9328()));
        }
        f17835 = linkedHashSet;
    }
}
