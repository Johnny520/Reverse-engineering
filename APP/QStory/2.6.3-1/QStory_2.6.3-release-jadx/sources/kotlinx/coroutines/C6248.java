package kotlinx.coroutines;

import kotlin.coroutines.InterfaceC5192;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: kotlinx.coroutines.飘花落叶言子哲世苏楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6248 extends AbstractC6264 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final C6248 f15402 = new C6248();

    @Override // kotlinx.coroutines.AbstractC6264
    public final String toString() {
        return "Dispatchers.Unconfined";
    }

    @Override // kotlinx.coroutines.AbstractC6264
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final void mo4018(InterfaceC5192 interfaceC5192, Runnable runnable) {
        C6255 c6255 = (C6255) interfaceC5192.get(C6255.f15405);
        if (c6255 != null) {
            c6255.f15406 = true;
        } else {
            C6755.m11867("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
        }
    }
}
