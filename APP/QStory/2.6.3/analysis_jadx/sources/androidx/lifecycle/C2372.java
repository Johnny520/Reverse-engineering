package androidx.lifecycle;

import java.util.ArrayDeque;
import kotlin.coroutines.InterfaceC4360;
import kotlinx.coroutines.AbstractC5395;
import kotlinx.coroutines.AbstractC5432;
import kotlinx.coroutines.internal.AbstractC5365;
import p093.C7201;
import p095.C7207;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: androidx.lifecycle.飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2372 extends AbstractC5432 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C2411 f6997 = new C2411(0);

    @Override // kotlinx.coroutines.AbstractC5432
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final void mo3458(InterfaceC4360 interfaceC4360, final Runnable runnable) {
        interfaceC4360.getClass();
        runnable.getClass();
        final C2411 c2411 = this.f6997;
        c2411.getClass();
        C7207 c7207 = AbstractC5395.f15030;
        C7201 c7201 = AbstractC5365.f14960.f19213;
        if (c7201.mo4491(interfaceC4360) || c2411.f7049 || !c2411.f7051) {
            c7201.mo3458(interfaceC4360, new Runnable() { // from class: androidx.lifecycle.飘花落叶言子楪苏哲兰世
                @Override // java.lang.Runnable
                public final void run() {
                    C2411 c24112 = c2411;
                    if (((ArrayDeque) c24112.f7048).offer(runnable)) {
                        c24112.m4515();
                    } else {
                        C5925.m11311("cannot enqueue any more runnables");
                    }
                }
            });
        } else if (((ArrayDeque) c2411.f7048).offer(runnable)) {
            c2411.m4515();
        } else {
            C5925.m11311("cannot enqueue any more runnables");
        }
    }

    @Override // kotlinx.coroutines.AbstractC5432
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final boolean mo4491(InterfaceC4360 interfaceC4360) {
        interfaceC4360.getClass();
        C7207 c7207 = AbstractC5395.f15030;
        if (AbstractC5365.f14960.f19213.mo4491(interfaceC4360)) {
            return true;
        }
        C2411 c2411 = this.f6997;
        return !(c2411.f7049 || !c2411.f7051);
    }
}
