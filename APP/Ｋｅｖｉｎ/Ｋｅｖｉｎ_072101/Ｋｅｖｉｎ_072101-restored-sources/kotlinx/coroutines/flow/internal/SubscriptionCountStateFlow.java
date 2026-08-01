package kotlinx.coroutines.flow.internal;

/* JADX INFO: compiled from: AbstractSharedFlow.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0002\u0010\u0005J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0002R\u0014\u0010\u0006\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\f"}, m115d2 = {"Lkotlinx/coroutines/flow/internal/SubscriptionCountStateFlow;", "Lkotlinx/coroutines/flow/StateFlow;", "", "Lkotlinx/coroutines/flow/SharedFlowImpl;", "initialValue", "(I)V", "value", "getValue", "()Ljava/lang/Integer;", "increment", "", "delta", "kotlinx-coroutines-core"}, m116k = 1, m117mv = {1, 6, 0}, m119xi = 48)
final class SubscriptionCountStateFlow extends kotlinx.coroutines.flow.SharedFlowImpl<java.lang.Integer> implements kotlinx.coroutines.flow.StateFlow<java.lang.Integer> {
    public SubscriptionCountStateFlow(int r4) {
            r3 = this;
            r0 = 2147483647(0x7fffffff, float:NaN)
            kotlinx.coroutines.channels.BufferOverflow r1 = kotlinx.coroutines.channels.BufferOverflow.DROP_OLDEST
            r2 = 1
            r3.<init>(r2, r0, r1)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            r3.tryEmit(r0)
            return
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlinx.coroutines.flow.StateFlow
    public java.lang.Integer getValue() {
            r3 = this;
            r0 = 0
            monitor-enter(r3)
            r1 = 0
            java.lang.Object r2 = r3.getLastReplayedLocked()     // Catch: java.lang.Throwable -> L14
            java.lang.Number r2 = (java.lang.Number) r2     // Catch: java.lang.Throwable -> L14
            int r2 = r2.intValue()     // Catch: java.lang.Throwable -> L14
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L14
            monitor-exit(r3)
            return r1
        L14:
            r1 = move-exception
            monitor-exit(r3)
            throw r1
    }

    @Override // kotlinx.coroutines.flow.StateFlow
    public /* bridge */ /* synthetic */ java.lang.Integer getValue() {
            r1 = this;
            java.lang.Integer r0 = r1.getValue()
            return r0
    }

    public final boolean increment(int r4) {
            r3 = this;
            r0 = 0
            monitor-enter(r3)
            r1 = 0
            java.lang.Object r2 = r3.getLastReplayedLocked()     // Catch: java.lang.Throwable -> L19
            java.lang.Number r2 = (java.lang.Number) r2     // Catch: java.lang.Throwable -> L19
            int r2 = r2.intValue()     // Catch: java.lang.Throwable -> L19
            int r2 = r2 + r4
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L19
            boolean r2 = r3.tryEmit(r2)     // Catch: java.lang.Throwable -> L19
            monitor-exit(r3)
            return r2
        L19:
            r1 = move-exception
            monitor-exit(r3)
            throw r1
    }
}
