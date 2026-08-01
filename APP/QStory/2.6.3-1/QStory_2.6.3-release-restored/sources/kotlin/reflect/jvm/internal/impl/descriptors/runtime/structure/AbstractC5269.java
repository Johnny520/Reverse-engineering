package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import com.bumptech.glide.AbstractC3889;
import java.lang.reflect.Type;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.reflect.jvm.internal.impl.name.C5519;
import p097.InterfaceC7857;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5269 implements InterfaceC7857 {
    public final boolean equals(Object obj) {
        return (obj instanceof AbstractC5269) && AbstractC5227.m9466(mo9530(), ((AbstractC5269) obj).mo9530());
    }

    public final int hashCode() {
        return mo9530().hashCode();
    }

    public final String toString() {
        return getClass().getName() + ": " + mo9530();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public abstract Type mo9530();

    @Override // p097.InterfaceC7857
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public C5262 mo9531(C5519 c5519) {
        Object next;
        c5519.getClass();
        Iterator it = getAnnotations().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (AbstractC5227.m9466(AbstractC5263.m9536(AbstractC3889.m7316(AbstractC3889.m7319(((C5262) next).f13396))).m9886(), c5519)) {
                break;
            }
        }
        return (C5262) next;
    }
}
