package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import com.bumptech.glide.AbstractC3057;
import java.lang.reflect.Type;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.reflect.jvm.internal.impl.name.C4687;
import p081.InterfaceC7028;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4437 implements InterfaceC7028 {
    public final boolean equals(Object obj) {
        return (obj instanceof AbstractC4437) && AbstractC4395.m8907(mo8971(), ((AbstractC4437) obj).mo8971());
    }

    public final int hashCode() {
        return mo8971().hashCode();
    }

    public final String toString() {
        return getClass().getName() + ": " + mo8971();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public abstract Type mo8971();

    @Override // p081.InterfaceC7028
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public C4430 mo8972(C4687 c4687) {
        Object next;
        c4687.getClass();
        Iterator it = getAnnotations().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (AbstractC4395.m8907(AbstractC4431.m8977(AbstractC3057.m6756(AbstractC3057.m6759(((C4430) next).f13051))).m9327(), c4687)) {
                break;
            }
        }
        return (C4430) next;
    }
}
