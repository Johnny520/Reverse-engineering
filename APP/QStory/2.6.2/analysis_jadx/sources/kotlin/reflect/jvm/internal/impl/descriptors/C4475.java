package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.C4345;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.reflect.jvm.internal.impl.name.C4686;
import kotlin.sequences.AbstractC5121;
import kotlin.sequences.C5114;
import p052.InterfaceC6557;
import p079.AbstractC6985;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.descriptors.飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4475 implements InterfaceC4474 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final ArrayList f13103;

    public C4475(ArrayList arrayList) {
        this.f13103 = arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4474
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final boolean mo8962(C4686 c4686) {
        c4686.getClass();
        ArrayList arrayList = this.f13103;
        if (arrayList.isEmpty()) {
            return true;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (AbstractC4394.m8917(((AbstractC6985) ((InterfaceC4465) it.next())).f18692, c4686)) {
                return false;
            }
        }
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4474
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo8963(C4686 c4686, ArrayList arrayList) {
        c4686.getClass();
        for (Object obj : this.f13103) {
            if (AbstractC4394.m8917(((AbstractC6985) ((InterfaceC4465) obj)).f18692, c4686)) {
                arrayList.add(obj);
            }
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4474
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final Collection mo8964(C4686 c4686, InterfaceC6557 interfaceC6557) {
        c4686.getClass();
        return AbstractC5121.m10106(new C5114(AbstractC5121.m10111(new C4345(this.f13103, 1), C4493.f13133), true, new C4464(c4686, 0)));
    }
}
