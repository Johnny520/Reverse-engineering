package kotlinx.coroutines.flow.internal;

/* JADX INFO: compiled from: FlowExceptions.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0000\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0011\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\b\u001a\u00020\tH\u0016R\u0015\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n"}, m115d2 = {"Lkotlinx/coroutines/flow/internal/AbortFlowException;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "owner", "Lkotlinx/coroutines/flow/FlowCollector;", "(Lkotlinx/coroutines/flow/FlowCollector;)V", "getOwner", "()Lkotlinx/coroutines/flow/FlowCollector;", "fillInStackTrace", "", "kotlinx-coroutines-core"}, m116k = 1, m117mv = {1, 6, 0}, m119xi = 48)
public final class AbortFlowException extends java.util.concurrent.CancellationException {
    private final kotlinx.coroutines.flow.FlowCollector<?> owner;

    public AbortFlowException(kotlinx.coroutines.flow.FlowCollector<?> r2) {
            r1 = this;
            java.lang.String r0 = "Flow was aborted, no more elements needed"
            r1.<init>(r0)
            r1.owner = r2
            return
    }

    @Override // java.lang.Throwable
    public java.lang.Throwable fillInStackTrace() {
            r2 = this;
            boolean r0 = kotlinx.coroutines.DebugKt.getDEBUG()
            if (r0 == 0) goto Lb
            java.lang.Throwable r0 = super.fillInStackTrace()
            return r0
        Lb:
            r0 = 0
            r1 = 0
            java.lang.StackTraceElement[] r0 = new java.lang.StackTraceElement[r1]
            r2.setStackTrace(r0)
            r0 = r2
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            return r0
    }

    public final kotlinx.coroutines.flow.FlowCollector<?> getOwner() {
            r1 = this;
            kotlinx.coroutines.flow.FlowCollector<?> r0 = r1.owner
            return r0
    }
}
