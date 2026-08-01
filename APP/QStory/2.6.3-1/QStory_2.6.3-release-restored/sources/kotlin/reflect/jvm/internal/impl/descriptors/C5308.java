package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.C5178;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.reflect.jvm.internal.impl.name.C5519;
import kotlin.sequences.AbstractC5954;
import kotlin.sequences.C5947;
import p068.InterfaceC7387;
import p095.AbstractC7815;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.descriptors.飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5308 implements InterfaceC5307 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final ArrayList f13452;

    public C5308(ArrayList arrayList) {
        this.f13452 = arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5307
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final boolean mo9511(C5519 c5519) {
        c5519.getClass();
        ArrayList arrayList = this.f13452;
        if (arrayList.isEmpty()) {
            return true;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (AbstractC5227.m9466(((AbstractC7815) ((InterfaceC5298) it.next())).f19032, c5519)) {
                return false;
            }
        }
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5307
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo9512(C5519 c5519, ArrayList arrayList) {
        c5519.getClass();
        for (Object obj : this.f13452) {
            if (AbstractC5227.m9466(((AbstractC7815) ((InterfaceC5298) obj)).f19032, c5519)) {
                arrayList.add(obj);
            }
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5307
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final Collection mo9513(C5519 c5519, InterfaceC7387 interfaceC7387) {
        c5519.getClass();
        return AbstractC5954.m10669(new C5947(AbstractC5954.m10670(new C5178(this.f13452, 1), C5326.f13482), true, new C5297(c5519, 0)));
    }
}
