package kotlinx.coroutines;

import kotlin.coroutines.InterfaceC4360;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: kotlinx.coroutines.飘花落叶言子哲世苏楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5416 extends AbstractC5432 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final C5416 f15057 = new C5416();

    @Override // kotlinx.coroutines.AbstractC5432
    public final String toString() {
        return "Dispatchers.Unconfined";
    }

    @Override // kotlinx.coroutines.AbstractC5432
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final void mo3458(InterfaceC4360 interfaceC4360, Runnable runnable) {
        C5423 c5423 = (C5423) interfaceC4360.get(C5423.f15060);
        if (c5423 != null) {
            c5423.f15061 = true;
        } else {
            C5925.m11308("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
        }
    }
}
