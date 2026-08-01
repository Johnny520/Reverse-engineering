package androidx.lifecycle;

import java.util.ArrayDeque;
import kotlin.coroutines.InterfaceC5192;
import kotlinx.coroutines.AbstractC6227;
import kotlinx.coroutines.AbstractC6264;
import kotlinx.coroutines.internal.AbstractC6197;
import p109.C8030;
import p111.C8036;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: androidx.lifecycle.飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3205 extends AbstractC6264 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C3244 f7342 = new C3244(0);

    @Override // kotlinx.coroutines.AbstractC6264
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final void mo4018(InterfaceC5192 interfaceC5192, final Runnable runnable) {
        interfaceC5192.getClass();
        runnable.getClass();
        final C3244 c3244 = this.f7342;
        c3244.getClass();
        C8036 c8036 = AbstractC6227.f15375;
        C8030 c8030 = AbstractC6197.f15305.f19558;
        if (c8030.mo5051(interfaceC5192) || c3244.f7394 || !c3244.f7396) {
            c8030.mo4018(interfaceC5192, new Runnable() { // from class: androidx.lifecycle.飘花落叶言子楪苏哲兰世
                @Override // java.lang.Runnable
                public final void run() {
                    C3244 c32442 = c3244;
                    if (((ArrayDeque) c32442.f7393).offer(runnable)) {
                        c32442.m5075();
                    } else {
                        C6755.m11870("cannot enqueue any more runnables");
                    }
                }
            });
        } else if (((ArrayDeque) c3244.f7393).offer(runnable)) {
            c3244.m5075();
        } else {
            C6755.m11870("cannot enqueue any more runnables");
        }
    }

    @Override // kotlinx.coroutines.AbstractC6264
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final boolean mo5051(InterfaceC5192 interfaceC5192) {
        interfaceC5192.getClass();
        C8036 c8036 = AbstractC6227.f15375;
        if (AbstractC6197.f15305.f19558.mo5051(interfaceC5192)) {
            return true;
        }
        C3244 c3244 = this.f7342;
        return !(c3244.f7394 || !c3244.f7396);
    }
}
