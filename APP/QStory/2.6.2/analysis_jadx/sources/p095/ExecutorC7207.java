package p095;

import java.util.concurrent.Executor;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.InterfaceC4359;
import kotlinx.coroutines.AbstractC5387;
import kotlinx.coroutines.AbstractC5431;
import kotlinx.coroutines.internal.AbstractC5352;
import kotlinx.coroutines.internal.AbstractC5358;

/* JADX INFO: renamed from: 飘花落叶言世苏哲楪子兰.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class ExecutorC7207 extends AbstractC5387 implements Executor {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final ExecutorC7207 f19230 = new ExecutorC7207();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final AbstractC5431 f19231;

    static {
        C7213 c7213 = C7213.f19256;
        int i = AbstractC5358.f14941;
        if (64 >= i) {
            i = 64;
        }
        f19231 = c7213.mo10523(AbstractC5352.m10369(i, 12, "kotlinx.coroutines.io.parallelism"));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        mo3448(EmptyCoroutineContext.INSTANCE, runnable);
    }

    @Override // kotlinx.coroutines.AbstractC5431
    public final String toString() {
        return "Dispatchers.IO";
    }

    @Override // kotlinx.coroutines.AbstractC5431
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final void mo3448(InterfaceC4359 interfaceC4359, Runnable runnable) {
        f19231.mo3448(interfaceC4359, runnable);
    }

    @Override // kotlinx.coroutines.AbstractC5431
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final void mo10340(InterfaceC4359 interfaceC4359, Runnable runnable) {
        f19231.mo10340(interfaceC4359, runnable);
    }
}
