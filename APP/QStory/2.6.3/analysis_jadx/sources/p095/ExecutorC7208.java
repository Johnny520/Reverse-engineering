package p095;

import java.util.concurrent.Executor;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.InterfaceC4360;
import kotlinx.coroutines.AbstractC5388;
import kotlinx.coroutines.AbstractC5432;
import kotlinx.coroutines.internal.AbstractC5353;
import kotlinx.coroutines.internal.AbstractC5359;

/* JADX INFO: renamed from: 飘花落叶言世苏哲楪子兰.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class ExecutorC7208 extends AbstractC5388 implements Executor {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final ExecutorC7208 f19225 = new ExecutorC7208();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final AbstractC5432 f19226;

    static {
        C7214 c7214 = C7214.f19251;
        int i = AbstractC5359.f14941;
        if (64 >= i) {
            i = 64;
        }
        f19226 = c7214.mo10527(AbstractC5353.m10373(i, 12, "kotlinx.coroutines.io.parallelism"));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        mo3458(EmptyCoroutineContext.INSTANCE, runnable);
    }

    @Override // kotlinx.coroutines.AbstractC5432
    public final String toString() {
        return "Dispatchers.IO";
    }

    @Override // kotlinx.coroutines.AbstractC5432
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final void mo3458(InterfaceC4360 interfaceC4360, Runnable runnable) {
        f19226.mo3458(interfaceC4360, runnable);
    }

    @Override // kotlinx.coroutines.AbstractC5432
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final void mo10344(InterfaceC4360 interfaceC4360, Runnable runnable) {
        f19226.mo10344(interfaceC4360, runnable);
    }
}
