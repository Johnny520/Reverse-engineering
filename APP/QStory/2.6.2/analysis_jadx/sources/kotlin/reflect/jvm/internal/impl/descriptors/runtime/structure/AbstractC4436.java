package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.Type;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.reflect.jvm.internal.impl.name.C4686;
import p053.AbstractC6560;
import p081.InterfaceC7027;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4436 implements InterfaceC7027 {
    public final boolean equals(Object obj) {
        return (obj instanceof AbstractC4436) && AbstractC4394.m8917(mo8981(), ((AbstractC4436) obj).mo8981());
    }

    public final int hashCode() {
        return mo8981().hashCode();
    }

    public final String toString() {
        return getClass().getName() + ": " + mo8981();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public abstract Type mo8981();

    @Override // p081.InterfaceC7027
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public C4429 mo8982(C4686 c4686) {
        Object next;
        c4686.getClass();
        Iterator it = getAnnotations().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (AbstractC4394.m8917(AbstractC4430.m8987(AbstractC6560.m12029(AbstractC6560.m12033(((C4429) next).f13047))).m9337(), c4686)) {
                break;
            }
        }
        return (C4429) next;
    }
}
