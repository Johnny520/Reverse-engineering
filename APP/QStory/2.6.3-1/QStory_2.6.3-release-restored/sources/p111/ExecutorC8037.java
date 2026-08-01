package p111;

import java.util.concurrent.Executor;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.InterfaceC5192;
import kotlinx.coroutines.AbstractC6220;
import kotlinx.coroutines.AbstractC6264;
import kotlinx.coroutines.internal.AbstractC6185;
import kotlinx.coroutines.internal.AbstractC6191;

/* JADX INFO: renamed from: 飘花落叶言世苏哲楪子兰.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class ExecutorC8037 extends AbstractC6220 implements Executor {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final ExecutorC8037 f19570 = new ExecutorC8037();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final AbstractC6264 f19571;

    static {
        C8043 c8043 = C8043.f19596;
        int i = AbstractC6191.f15286;
        if (64 >= i) {
            i = 64;
        }
        f19571 = c8043.mo11086(AbstractC6185.m10932(i, 12, "kotlinx.coroutines.io.parallelism"));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        mo4018(EmptyCoroutineContext.INSTANCE, runnable);
    }

    @Override // kotlinx.coroutines.AbstractC6264
    public final String toString() {
        return "Dispatchers.IO";
    }

    @Override // kotlinx.coroutines.AbstractC6264
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final void mo4018(InterfaceC5192 interfaceC5192, Runnable runnable) {
        f19571.mo4018(interfaceC5192, runnable);
    }

    @Override // kotlinx.coroutines.AbstractC6264
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final void mo10903(InterfaceC5192 interfaceC5192, Runnable runnable) {
        f19571.mo10903(interfaceC5192, runnable);
    }
}
