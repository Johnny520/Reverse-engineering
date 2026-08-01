package kotlinx.coroutines.channels;

/* JADX INFO: compiled from: ConflatedChannel.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B'\u0012 \u0010\u0003\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u0006¢\u0006\u0002\u0010\u0007J\u0016\u0010\u0018\u001a\u00020\r2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u001aH\u0014J\u0015\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00028\u0000H\u0014¢\u0006\u0002\u0010\u001dJ!\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00028\u00002\n\u0010\u001f\u001a\u0006\u0012\u0002\b\u00030 H\u0014¢\u0006\u0002\u0010!J\u0010\u0010\"\u001a\u00020\u00052\u0006\u0010#\u001a\u00020\rH\u0014J\n\u0010$\u001a\u0004\u0018\u00010\u0017H\u0014J\u0016\u0010%\u001a\u0004\u0018\u00010\u00172\n\u0010\u001f\u001a\u0006\u0012\u0002\b\u00030 H\u0014J\u0014\u0010&\u001a\u0004\u0018\u00010'2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0017H\u0002R\u0014\u0010\b\u001a\u00020\t8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\r8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\r8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\r8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\r8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u000eR\u0012\u0010\u0013\u001a\u00060\u0014j\u0002`\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006("}, m115d2 = {"Lkotlinx/coroutines/channels/ConflatedChannel;", "E", "Lkotlinx/coroutines/channels/AbstractChannel;", "onUndeliveredElement", "Lkotlin/Function1;", "", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "(Lkotlin/jvm/functions/Function1;)V", "bufferDebugString", "", "getBufferDebugString", "()Ljava/lang/String;", "isBufferAlwaysEmpty", "", "()Z", "isBufferAlwaysFull", "isBufferEmpty", "isBufferFull", "isEmpty", "lock", "Ljava/util/concurrent/locks/ReentrantLock;", "Lkotlinx/coroutines/internal/ReentrantLock;", "value", "", "enqueueReceiveInternal", "receive", "Lkotlinx/coroutines/channels/Receive;", "offerInternal", "element", "(Ljava/lang/Object;)Ljava/lang/Object;", "offerSelectInternal", "select", "Lkotlinx/coroutines/selects/SelectInstance;", "(Ljava/lang/Object;Lkotlinx/coroutines/selects/SelectInstance;)Ljava/lang/Object;", "onCancelIdempotent", "wasClosed", "pollInternal", "pollSelectInternal", "updateValueLocked", "Lkotlinx/coroutines/internal/UndeliveredElementException;", "kotlinx-coroutines-core"}, m116k = 1, m117mv = {1, 6, 0}, m119xi = 48)
public class ConflatedChannel<E> extends kotlinx.coroutines.channels.AbstractChannel<E> {
    private final java.util.concurrent.locks.ReentrantLock lock;
    private java.lang.Object value;

    public ConflatedChannel(kotlin.jvm.functions.Function1<? super E, kotlin.Unit> r2) {
            r1 = this;
            r1.<init>(r2)
            java.util.concurrent.locks.ReentrantLock r0 = new java.util.concurrent.locks.ReentrantLock
            r0.<init>()
            r1.lock = r0
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.channels.AbstractChannelKt.EMPTY
            r1.value = r0
            return
    }

    private final kotlinx.coroutines.internal.UndeliveredElementException updateValueLocked(java.lang.Object r5) {
            r4 = this;
            java.lang.Object r0 = r4.value
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.channels.AbstractChannelKt.EMPTY
            r2 = 0
            if (r0 != r1) goto L8
            goto L12
        L8:
            kotlin.jvm.functions.Function1<E, kotlin.Unit> r1 = r4.onUndeliveredElement
            if (r1 != 0) goto Ld
            goto L12
        Ld:
            r3 = 2
            kotlinx.coroutines.internal.UndeliveredElementException r2 = kotlinx.coroutines.internal.OnUndeliveredElementKt.callUndeliveredElementCatchingException$default(r1, r0, r2, r3, r2)
        L12:
            r1 = r2
            r4.value = r5
            return r1
    }

    @Override // kotlinx.coroutines.channels.AbstractChannel
    protected boolean enqueueReceiveInternal(kotlinx.coroutines.channels.Receive<? super E> r6) {
            r5 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r5.lock
            r1 = 0
            r2 = r0
            java.util.concurrent.locks.Lock r2 = (java.util.concurrent.locks.Lock) r2
            r2.lock()
            r3 = 0
            boolean r4 = super.enqueueReceiveInternal(r6)     // Catch: java.lang.Throwable -> L13
            r2.unlock()
            return r4
        L13:
            r3 = move-exception
            r2.unlock()
            throw r3
    }

    @Override // kotlinx.coroutines.channels.AbstractSendChannel
    protected java.lang.String getBufferDebugString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "(value="
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.Object r1 = r2.value
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = 41
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // kotlinx.coroutines.channels.AbstractChannel
    protected final boolean isBufferAlwaysEmpty() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // kotlinx.coroutines.channels.AbstractSendChannel
    protected final boolean isBufferAlwaysFull() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // kotlinx.coroutines.channels.AbstractChannel
    protected final boolean isBufferEmpty() {
            r2 = this;
            java.lang.Object r0 = r2.value
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.channels.AbstractChannelKt.EMPTY
            if (r0 != r1) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    @Override // kotlinx.coroutines.channels.AbstractSendChannel
    protected final boolean isBufferFull() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // kotlinx.coroutines.channels.AbstractChannel, kotlinx.coroutines.channels.ReceiveChannel
    public boolean isEmpty() {
            r5 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r5.lock
            r1 = 0
            r2 = r0
            java.util.concurrent.locks.Lock r2 = (java.util.concurrent.locks.Lock) r2
            r2.lock()
            r3 = 0
            boolean r4 = r5.isEmptyImpl()     // Catch: java.lang.Throwable -> L13
            r2.unlock()
            return r4
        L13:
            r3 = move-exception
            r2.unlock()
            throw r3
    }

    @Override // kotlinx.coroutines.channels.AbstractSendChannel
    protected java.lang.Object offerInternal(E r9) {
            r8 = this;
            r0 = 0
            java.util.concurrent.locks.ReentrantLock r1 = r8.lock
            r2 = 0
            r3 = r1
            java.util.concurrent.locks.Lock r3 = (java.util.concurrent.locks.Lock) r3
            r3.lock()
            r4 = 0
            kotlinx.coroutines.channels.Closed r5 = r8.getClosedForSend()     // Catch: java.lang.Throwable -> L6c
            if (r5 != 0) goto L66
            java.lang.Object r5 = r8.value     // Catch: java.lang.Throwable -> L6c
            kotlinx.coroutines.internal.Symbol r6 = kotlinx.coroutines.channels.AbstractChannelKt.EMPTY     // Catch: java.lang.Throwable -> L6c
            if (r5 != r6) goto L57
        L17:
        L18:
            kotlinx.coroutines.channels.ReceiveOrClosed r5 = r8.takeFirstReceiveOrPeekClosed()     // Catch: java.lang.Throwable -> L6c
            if (r5 != 0) goto L1f
            goto L57
        L1f:
            r0 = r5
            boolean r5 = r0 instanceof kotlinx.coroutines.channels.Closed     // Catch: java.lang.Throwable -> L6c
            if (r5 == 0) goto L2a
        L26:
            r3.unlock()
            return r0
        L2a:
            r5 = 0
            kotlinx.coroutines.internal.Symbol r5 = r0.tryResumeReceive(r9, r5)     // Catch: java.lang.Throwable -> L6c
            if (r5 == 0) goto L17
            boolean r6 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()     // Catch: java.lang.Throwable -> L6c
            if (r6 == 0) goto L48
            r6 = 0
            kotlinx.coroutines.internal.Symbol r7 = kotlinx.coroutines.CancellableContinuationImplKt.RESUME_TOKEN     // Catch: java.lang.Throwable -> L6c
            if (r5 != r7) goto L3e
            r7 = 1
            goto L3f
        L3e:
            r7 = 0
        L3f:
            if (r7 == 0) goto L42
            goto L48
        L42:
            java.lang.AssertionError r6 = new java.lang.AssertionError     // Catch: java.lang.Throwable -> L6c
            r6.<init>()     // Catch: java.lang.Throwable -> L6c
            throw r6     // Catch: java.lang.Throwable -> L6c
        L48:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L6c
            r3.unlock()
            r0.completeResumeReceive(r9)
            java.lang.Object r1 = r0.getOfferResult()
            return r1
        L57:
            kotlinx.coroutines.internal.UndeliveredElementException r5 = r8.updateValueLocked(r9)     // Catch: java.lang.Throwable -> L6c
            if (r5 != 0) goto L63
            kotlinx.coroutines.internal.Symbol r5 = kotlinx.coroutines.channels.AbstractChannelKt.OFFER_SUCCESS     // Catch: java.lang.Throwable -> L6c
            r3.unlock()
            return r5
        L63:
            r6 = 0
            throw r5     // Catch: java.lang.Throwable -> L6c
        L66:
            r6 = 0
            r3.unlock()
            return r5
        L6c:
            r4 = move-exception
            r3.unlock()
            throw r4
    }

    @Override // kotlinx.coroutines.channels.AbstractSendChannel
    protected java.lang.Object offerSelectInternal(E r10, kotlinx.coroutines.selects.SelectInstance<?> r11) {
            r9 = this;
            r0 = 0
            java.util.concurrent.locks.ReentrantLock r1 = r9.lock
            r2 = 0
            r3 = r1
            java.util.concurrent.locks.Lock r3 = (java.util.concurrent.locks.Lock) r3
            r3.lock()
            r4 = 0
            kotlinx.coroutines.channels.Closed r5 = r9.getClosedForSend()     // Catch: java.lang.Throwable -> L8f
            if (r5 != 0) goto L89
            java.lang.Object r5 = r9.value     // Catch: java.lang.Throwable -> L8f
            kotlinx.coroutines.internal.Symbol r6 = kotlinx.coroutines.channels.AbstractChannelKt.EMPTY     // Catch: java.lang.Throwable -> L8f
            if (r5 != r6) goto L6c
        L17:
        L18:
            kotlinx.coroutines.channels.AbstractSendChannel$TryOfferDesc r5 = r9.describeTryOffer(r10)     // Catch: java.lang.Throwable -> L8f
            r6 = r5
            kotlinx.coroutines.internal.AtomicDesc r6 = (kotlinx.coroutines.internal.AtomicDesc) r6     // Catch: java.lang.Throwable -> L8f
            java.lang.Object r6 = r11.performAtomicTrySelect(r6)     // Catch: java.lang.Throwable -> L8f
            if (r6 != 0) goto L43
            java.lang.Object r7 = r5.getResult()     // Catch: java.lang.Throwable -> L8f
            r0 = r7
            kotlin.Unit r4 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L8f
            r3.unlock()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            r1 = r0
            kotlinx.coroutines.channels.ReceiveOrClosed r1 = (kotlinx.coroutines.channels.ReceiveOrClosed) r1
            r1.completeResumeReceive(r10)
            r1 = r0
            kotlinx.coroutines.channels.ReceiveOrClosed r1 = (kotlinx.coroutines.channels.ReceiveOrClosed) r1
            java.lang.Object r1 = r1.getOfferResult()
            return r1
        L43:
            kotlinx.coroutines.internal.Symbol r7 = kotlinx.coroutines.channels.AbstractChannelKt.OFFER_FAILED     // Catch: java.lang.Throwable -> L8f
            if (r6 != r7) goto L48
            goto L6c
        L48:
            java.lang.Object r7 = kotlinx.coroutines.internal.AtomicKt.RETRY_ATOMIC     // Catch: java.lang.Throwable -> L8f
            if (r6 != r7) goto L4d
            goto L17
        L4d:
            java.lang.Object r7 = kotlinx.coroutines.selects.SelectKt.getALREADY_SELECTED()     // Catch: java.lang.Throwable -> L8f
            if (r6 == r7) goto L68
            boolean r7 = r6 instanceof kotlinx.coroutines.channels.Closed     // Catch: java.lang.Throwable -> L8f
            if (r7 == 0) goto L58
            goto L68
        L58:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L8f
            java.lang.String r8 = "performAtomicTrySelect(describeTryOffer) returned "
            java.lang.String r8 = kotlin.jvm.internal.Intrinsics.stringPlus(r8, r6)     // Catch: java.lang.Throwable -> L8f
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L8f
            r7.<init>(r8)     // Catch: java.lang.Throwable -> L8f
            throw r7     // Catch: java.lang.Throwable -> L8f
        L68:
            r3.unlock()
            return r6
        L6c:
            boolean r5 = r11.trySelect()     // Catch: java.lang.Throwable -> L8f
            if (r5 != 0) goto L7a
            java.lang.Object r5 = kotlinx.coroutines.selects.SelectKt.getALREADY_SELECTED()     // Catch: java.lang.Throwable -> L8f
            r3.unlock()
            return r5
        L7a:
            kotlinx.coroutines.internal.UndeliveredElementException r5 = r9.updateValueLocked(r10)     // Catch: java.lang.Throwable -> L8f
            if (r5 != 0) goto L86
            kotlinx.coroutines.internal.Symbol r5 = kotlinx.coroutines.channels.AbstractChannelKt.OFFER_SUCCESS     // Catch: java.lang.Throwable -> L8f
            r3.unlock()
            return r5
        L86:
            r6 = 0
            throw r5     // Catch: java.lang.Throwable -> L8f
        L89:
            r6 = 0
            r3.unlock()
            return r5
        L8f:
            r4 = move-exception
            r3.unlock()
            throw r4
    }

    @Override // kotlinx.coroutines.channels.AbstractChannel
    protected void onCancelIdempotent(boolean r7) {
            r6 = this;
            r0 = 0
            java.util.concurrent.locks.ReentrantLock r1 = r6.lock
            r2 = 0
            r3 = r1
            java.util.concurrent.locks.Lock r3 = (java.util.concurrent.locks.Lock) r3
            r3.lock()
            r4 = 0
            kotlinx.coroutines.internal.Symbol r5 = kotlinx.coroutines.channels.AbstractChannelKt.EMPTY     // Catch: java.lang.Throwable -> L23
            kotlinx.coroutines.internal.UndeliveredElementException r5 = r6.updateValueLocked(r5)     // Catch: java.lang.Throwable -> L23
            r0 = r5
            kotlin.Unit r4 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L23
            r3.unlock()
            super.onCancelIdempotent(r7)
            if (r0 != 0) goto L20
            return
        L20:
            r1 = r0
            r2 = 0
            throw r1
        L23:
            r4 = move-exception
            r3.unlock()
            throw r4
    }

    @Override // kotlinx.coroutines.channels.AbstractChannel
    protected java.lang.Object pollInternal() {
            r7 = this;
            r0 = 0
            java.util.concurrent.locks.ReentrantLock r1 = r7.lock
            r2 = 0
            r3 = r1
            java.util.concurrent.locks.Lock r3 = (java.util.concurrent.locks.Lock) r3
            r3.lock()
            r4 = 0
            java.lang.Object r5 = r7.value     // Catch: java.lang.Throwable -> L2c
            kotlinx.coroutines.internal.Symbol r6 = kotlinx.coroutines.channels.AbstractChannelKt.EMPTY     // Catch: java.lang.Throwable -> L2c
            if (r5 != r6) goto L1d
            kotlinx.coroutines.channels.Closed r5 = r7.getClosedForSend()     // Catch: java.lang.Throwable -> L2c
            if (r5 != 0) goto L19
            kotlinx.coroutines.internal.Symbol r5 = kotlinx.coroutines.channels.AbstractChannelKt.POLL_FAILED     // Catch: java.lang.Throwable -> L2c
        L19:
            r3.unlock()
            return r5
        L1d:
            java.lang.Object r5 = r7.value     // Catch: java.lang.Throwable -> L2c
            r0 = r5
            kotlinx.coroutines.internal.Symbol r5 = kotlinx.coroutines.channels.AbstractChannelKt.EMPTY     // Catch: java.lang.Throwable -> L2c
            r7.value = r5     // Catch: java.lang.Throwable -> L2c
            kotlin.Unit r4 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L2c
            r3.unlock()
            return r0
        L2c:
            r4 = move-exception
            r3.unlock()
            throw r4
    }

    @Override // kotlinx.coroutines.channels.AbstractChannel
    protected java.lang.Object pollSelectInternal(kotlinx.coroutines.selects.SelectInstance<?> r8) {
            r7 = this;
            r0 = 0
            java.util.concurrent.locks.ReentrantLock r1 = r7.lock
            r2 = 0
            r3 = r1
            java.util.concurrent.locks.Lock r3 = (java.util.concurrent.locks.Lock) r3
            r3.lock()
            r4 = 0
            java.lang.Object r5 = r7.value     // Catch: java.lang.Throwable -> L3a
            kotlinx.coroutines.internal.Symbol r6 = kotlinx.coroutines.channels.AbstractChannelKt.EMPTY     // Catch: java.lang.Throwable -> L3a
            if (r5 != r6) goto L1d
            kotlinx.coroutines.channels.Closed r5 = r7.getClosedForSend()     // Catch: java.lang.Throwable -> L3a
            if (r5 != 0) goto L19
            kotlinx.coroutines.internal.Symbol r5 = kotlinx.coroutines.channels.AbstractChannelKt.POLL_FAILED     // Catch: java.lang.Throwable -> L3a
        L19:
            r3.unlock()
            return r5
        L1d:
            boolean r5 = r8.trySelect()     // Catch: java.lang.Throwable -> L3a
            if (r5 != 0) goto L2b
            java.lang.Object r5 = kotlinx.coroutines.selects.SelectKt.getALREADY_SELECTED()     // Catch: java.lang.Throwable -> L3a
            r3.unlock()
            return r5
        L2b:
            java.lang.Object r5 = r7.value     // Catch: java.lang.Throwable -> L3a
            r0 = r5
            kotlinx.coroutines.internal.Symbol r5 = kotlinx.coroutines.channels.AbstractChannelKt.EMPTY     // Catch: java.lang.Throwable -> L3a
            r7.value = r5     // Catch: java.lang.Throwable -> L3a
            kotlin.Unit r4 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L3a
            r3.unlock()
            return r0
        L3a:
            r4 = move-exception
            r3.unlock()
            throw r4
    }
}
