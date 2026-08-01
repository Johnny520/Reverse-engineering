package kotlinx.coroutines;

import java.util.concurrent.locks.LockSupport;
import kotlin.coroutines.InterfaceC4359;
import kotlin.jvm.internal.AbstractC4394;

/* JADX INFO: renamed from: kotlinx.coroutines.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5423 extends AbstractC5428 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final Thread f15062;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final AbstractC5393 f15063;

    public C5423(InterfaceC4359 interfaceC4359, Thread thread, AbstractC5393 abstractC5393) {
        super(interfaceC4359, true, true);
        this.f15062 = thread;
        this.f15063 = abstractC5393;
    }

    @Override // kotlinx.coroutines.C5459
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰 */
    public final void mo10379(Object obj) {
        Thread threadCurrentThread = Thread.currentThread();
        Thread thread = this.f15062;
        if (AbstractC4394.m8917(threadCurrentThread, thread)) {
            return;
        }
        LockSupport.unpark(thread);
    }
}
