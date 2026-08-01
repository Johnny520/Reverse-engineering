package p095;

import kotlin.coroutines.InterfaceC4360;
import kotlinx.coroutines.AbstractC5432;
import kotlinx.coroutines.internal.AbstractC5353;

/* JADX INFO: renamed from: 飘花落叶言世苏哲楪子兰.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7214 extends AbstractC5432 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final C7214 f19251 = new C7214();

    @Override // kotlinx.coroutines.AbstractC5432
    public final String toString() {
        return "Dispatchers.IO";
    }

    @Override // kotlinx.coroutines.AbstractC5432
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final AbstractC5432 mo10527(int i) {
        AbstractC5353.m10367(i);
        return i >= AbstractC7217.f19261 ? this : super.mo10527(i);
    }

    @Override // kotlinx.coroutines.AbstractC5432
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final void mo3458(InterfaceC4360 interfaceC4360, Runnable runnable) {
        C7207.f19223.f19224.m12442(runnable, true, false);
    }

    @Override // kotlinx.coroutines.AbstractC5432
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final void mo10344(InterfaceC4360 interfaceC4360, Runnable runnable) {
        C7207.f19223.f19224.m12442(runnable, true, true);
    }
}
