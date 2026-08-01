package androidx.lifecycle;

import java.util.ArrayDeque;
import kotlin.coroutines.InterfaceC4359;
import kotlinx.coroutines.AbstractC5394;
import kotlinx.coroutines.AbstractC5431;
import kotlinx.coroutines.internal.AbstractC5364;
import p093.C7200;
import p095.C7206;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: androidx.lifecycle.飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2372 extends AbstractC5431 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C2411 f6996 = new C2411(0);

    @Override // kotlinx.coroutines.AbstractC5431
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final void mo3448(InterfaceC4359 interfaceC4359, final Runnable runnable) {
        interfaceC4359.getClass();
        runnable.getClass();
        final C2411 c2411 = this.f6996;
        c2411.getClass();
        C7206 c7206 = AbstractC5394.f15030;
        C7200 c7200 = AbstractC5364.f14960.f19218;
        if (c7200.mo4481(interfaceC4359) || c2411.f7048 || !c2411.f7050) {
            c7200.mo3448(interfaceC4359, new Runnable() { // from class: androidx.lifecycle.飘花落叶言子楪苏哲兰世
                @Override // java.lang.Runnable
                public final void run() {
                    C2411 c24112 = c2411;
                    if (((ArrayDeque) c24112.f7047).offer(runnable)) {
                        c24112.m4505();
                    } else {
                        C5919.m11250("cannot enqueue any more runnables");
                    }
                }
            });
        } else if (((ArrayDeque) c2411.f7047).offer(runnable)) {
            c2411.m4505();
        } else {
            C5919.m11250("cannot enqueue any more runnables");
        }
    }

    @Override // kotlinx.coroutines.AbstractC5431
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final boolean mo4481(InterfaceC4359 interfaceC4359) {
        interfaceC4359.getClass();
        C7206 c7206 = AbstractC5394.f15030;
        if (AbstractC5364.f14960.f19218.mo4481(interfaceC4359)) {
            return true;
        }
        C2411 c2411 = this.f6996;
        return !(c2411.f7048 || !c2411.f7050);
    }
}
