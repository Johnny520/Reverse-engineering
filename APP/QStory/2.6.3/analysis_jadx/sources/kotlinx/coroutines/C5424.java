package kotlinx.coroutines;

import java.util.concurrent.locks.LockSupport;
import kotlin.coroutines.InterfaceC4360;
import kotlin.jvm.internal.AbstractC4395;

/* JADX INFO: renamed from: kotlinx.coroutines.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5424 extends AbstractC5429 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final Thread f15062;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final AbstractC5394 f15063;

    public C5424(InterfaceC4360 interfaceC4360, Thread thread, AbstractC5394 abstractC5394) {
        super(interfaceC4360, true, true);
        this.f15062 = thread;
        this.f15063 = abstractC5394;
    }

    @Override // kotlinx.coroutines.C5460
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏 */
    public final void mo10383(Object obj) {
        Thread threadCurrentThread = Thread.currentThread();
        Thread thread = this.f15062;
        if (AbstractC4395.m8907(threadCurrentThread, thread)) {
            return;
        }
        LockSupport.unpark(thread);
    }
}
