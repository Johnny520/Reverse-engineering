package androidx.core.util;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.InterfaceC4356;
import net.bytebuddy.description.method.MethodDescription;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0003\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0003B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000f¨\u0006\u0010"}, d2 = {"Landroidx/core/util/ContinuationConsumer;", "T", "Ljava/util/function/Consumer;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;", "continuation", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V", "value", "Lkotlin/飘花落叶言子楪兰苏哲世;", "accept", "(Ljava/lang/Object;)V", "", "toString", "()Ljava/lang/String;", "Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;", "core-ktx"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class ContinuationConsumer<T> extends AtomicBoolean implements Consumer<T> {
    private final InterfaceC4356<T> continuation;

    /* JADX WARN: Multi-variable type inference failed */
    public ContinuationConsumer(InterfaceC4356<? super T> interfaceC4356) {
        super(false);
        this.continuation = interfaceC4356;
    }

    @Override // java.util.function.Consumer
    public void accept(T value) {
        if (compareAndSet(false, true)) {
            this.continuation.resumeWith(Result.m8755constructorimpl(value));
        }
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    public String toString() {
        return "ContinuationConsumer(resultAccepted = " + get() + ')';
    }
}
