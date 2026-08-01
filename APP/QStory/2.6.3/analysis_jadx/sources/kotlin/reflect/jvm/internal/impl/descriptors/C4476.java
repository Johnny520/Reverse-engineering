package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.C4346;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.reflect.jvm.internal.impl.name.C4687;
import kotlin.sequences.AbstractC5122;
import kotlin.sequences.C5115;
import p052.InterfaceC6558;
import p079.AbstractC6986;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.descriptors.飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4476 implements InterfaceC4475 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final ArrayList f13107;

    public C4476(ArrayList arrayList) {
        this.f13107 = arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4475
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final boolean mo8952(C4687 c4687) {
        c4687.getClass();
        ArrayList arrayList = this.f13107;
        if (arrayList.isEmpty()) {
            return true;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (AbstractC4395.m8907(((AbstractC6986) ((InterfaceC4466) it.next())).f18687, c4687)) {
                return false;
            }
        }
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4475
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo8953(C4687 c4687, ArrayList arrayList) {
        c4687.getClass();
        for (Object obj : this.f13107) {
            if (AbstractC4395.m8907(((AbstractC6986) ((InterfaceC4466) obj)).f18687, c4687)) {
                arrayList.add(obj);
            }
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4475
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final Collection mo8954(C4687 c4687, InterfaceC6558 interfaceC6558) {
        c4687.getClass();
        return AbstractC5122.m10110(new C5115(AbstractC5122.m10111(new C4346(this.f13107, 1), C4494.f13137), true, new C4465(c4687, 0)));
    }
}
