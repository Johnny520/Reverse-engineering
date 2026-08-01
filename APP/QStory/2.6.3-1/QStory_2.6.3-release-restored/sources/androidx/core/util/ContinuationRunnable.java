package androidx.core.util;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.InterfaceC5189;
import net.bytebuddy.description.method.MethodDescription;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m150d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\r¨\u0006\u000e"}, m151d2 = {"Landroidx/core/util/ContinuationRunnable;", "Ljava/lang/Runnable;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "continuation", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V", "run", "()V", "", "toString", "()Ljava/lang/String;", "Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;", "core-ktx"}, m152k = 1, m153mv = {2, 1, 0}, m155xi = 48)
final class ContinuationRunnable extends AtomicBoolean implements Runnable {
    private final InterfaceC5189<C6008> continuation;

    /* JADX WARN: Multi-variable type inference failed */
    public ContinuationRunnable(InterfaceC5189<? super C6008> interfaceC5189) {
        super(false);
        this.continuation = interfaceC5189;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (compareAndSet(false, true)) {
            this.continuation.resumeWith(Result.m9304constructorimpl(C6008.f15084));
        }
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    public String toString() {
        return "ContinuationRunnable(ran = " + get() + ')';
    }
}
