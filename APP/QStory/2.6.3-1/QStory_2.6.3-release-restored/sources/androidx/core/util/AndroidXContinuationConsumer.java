package androidx.core.util;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.InterfaceC5189;
import net.bytebuddy.description.method.MethodDescription;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m150d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0003B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000f¨\u0006\u0010"}, m151d2 = {"Landroidx/core/util/AndroidXContinuationConsumer;", "T", "Landroidx/core/util/飘花落叶言子楪世苏哲兰;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;", "continuation", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V", "value", "Lkotlin/飘花落叶言子楪兰苏哲世;", "accept", "(Ljava/lang/Object;)V", "", "toString", "()Ljava/lang/String;", "Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;", "core-ktx"}, m152k = 1, m153mv = {2, 1, 0}, m155xi = 48)
final class AndroidXContinuationConsumer<T> extends AtomicBoolean implements InterfaceC3021 {
    private final InterfaceC5189<T> continuation;

    /* JADX WARN: Multi-variable type inference failed */
    public AndroidXContinuationConsumer(InterfaceC5189<? super T> interfaceC5189) {
        super(false);
        this.continuation = interfaceC5189;
    }

    @Override // androidx.core.util.InterfaceC3021
    public void accept(T value) {
        if (compareAndSet(false, true)) {
            this.continuation.resumeWith(Result.m9304constructorimpl(value));
        }
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    public String toString() {
        return "ContinuationConsumer(resultAccepted = " + get() + ')';
    }
}
