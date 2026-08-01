package kotlinx.coroutines;

import kotlin.coroutines.InterfaceC4359;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: kotlinx.coroutines.飘花落叶言子哲世苏楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5415 extends AbstractC5431 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final C5415 f15057 = new C5415();

    @Override // kotlinx.coroutines.AbstractC5431
    public final String toString() {
        return "Dispatchers.Unconfined";
    }

    @Override // kotlinx.coroutines.AbstractC5431
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final void mo3448(InterfaceC4359 interfaceC4359, Runnable runnable) {
        C5422 c5422 = (C5422) interfaceC4359.get(C5422.f15060);
        if (c5422 != null) {
            c5422.f15061 = true;
        } else {
            C5919.m11247("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
        }
    }
}
