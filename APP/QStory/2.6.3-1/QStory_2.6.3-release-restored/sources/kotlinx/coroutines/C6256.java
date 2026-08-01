package kotlinx.coroutines;

import java.util.concurrent.locks.LockSupport;
import kotlin.coroutines.InterfaceC5192;
import kotlin.jvm.internal.AbstractC5227;

/* JADX INFO: renamed from: kotlinx.coroutines.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6256 extends AbstractC6261 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final Thread f15407;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final AbstractC6226 f15408;

    public C6256(InterfaceC5192 interfaceC5192, Thread thread, AbstractC6226 abstractC6226) {
        super(interfaceC5192, true, true);
        this.f15407 = thread;
        this.f15408 = abstractC6226;
    }

    @Override // kotlinx.coroutines.C6292
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏 */
    public final void mo10942(Object obj) {
        Thread threadCurrentThread = Thread.currentThread();
        Thread thread = this.f15407;
        if (AbstractC5227.m9466(threadCurrentThread, thread)) {
            return;
        }
        LockSupport.unpark(thread);
    }
}
