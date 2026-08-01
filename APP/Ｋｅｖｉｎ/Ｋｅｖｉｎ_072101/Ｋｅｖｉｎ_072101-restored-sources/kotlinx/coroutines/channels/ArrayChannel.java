package kotlinx.coroutines.channels;

/* JADX INFO: compiled from: ArrayChannel.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000BB9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012 \u0010\t\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000e\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0013\u001a\u00020\u00122\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u00172\u0006\u0010\r\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u001c\u0010\u001dJ#\u0010 \u001a\u00020\u00172\u0006\u0010\r\u001a\u00028\u00002\n\u0010\u001f\u001a\u0006\u0012\u0002\b\u00030\u001eH\u0014¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020\u0012H\u0014¢\u0006\u0004\b#\u0010$J\u0011\u0010%\u001a\u0004\u0018\u00010\u0017H\u0014¢\u0006\u0004\b%\u0010&J\u001d\u0010'\u001a\u0004\u0018\u00010\u00172\n\u0010\u001f\u001a\u0006\u0012\u0002\b\u00030\u001eH\u0014¢\u0006\u0004\b'\u0010(J\u0019\u0010*\u001a\u0004\u0018\u00010)2\u0006\u0010\f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b*\u0010+R\u001e\u0010-\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00102\u001a\u00020/8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b0\u00101R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00103R\u0016\u00104\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00103R\u0014\u00105\u001a\u00020\u00128DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b5\u00106R\u0014\u00107\u001a\u00020\u00128DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b7\u00106R\u0014\u00108\u001a\u00020\u00128DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b8\u00106R\u0014\u00109\u001a\u00020\u00128DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b9\u00106R\u0014\u0010:\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b:\u00106R\u0014\u0010;\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b;\u00106R\u0018\u0010>\u001a\u00060<j\u0002`=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010@¨\u0006A"}, m115d2 = {"Lkotlinx/coroutines/channels/ArrayChannel;", "E", "", "capacity", "Lkotlinx/coroutines/channels/BufferOverflow;", "onBufferOverflow", "Lkotlin/Function1;", "", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "onUndeliveredElement", "<init>", "(ILkotlinx/coroutines/channels/BufferOverflow;Lkotlin/jvm/functions/Function1;)V", "currentSize", "element", "enqueueElement", "(ILjava/lang/Object;)V", "Lkotlinx/coroutines/channels/Receive;", "receive", "", "enqueueReceiveInternal", "(Lkotlinx/coroutines/channels/Receive;)Z", "Lkotlinx/coroutines/channels/Send;", "send", "", "enqueueSend", "(Lkotlinx/coroutines/channels/Send;)Ljava/lang/Object;", "ensureCapacity", "(I)V", "offerInternal", "(Ljava/lang/Object;)Ljava/lang/Object;", "Lkotlinx/coroutines/selects/SelectInstance;", "select", "offerSelectInternal", "(Ljava/lang/Object;Lkotlinx/coroutines/selects/SelectInstance;)Ljava/lang/Object;", "wasClosed", "onCancelIdempotent", "(Z)V", "pollInternal", "()Ljava/lang/Object;", "pollSelectInternal", "(Lkotlinx/coroutines/selects/SelectInstance;)Ljava/lang/Object;", "Lkotlinx/coroutines/internal/Symbol;", "updateBufferSize", "(I)Lkotlinx/coroutines/internal/Symbol;", "", "buffer", "[Ljava/lang/Object;", "", "getBufferDebugString", "()Ljava/lang/String;", "bufferDebugString", "I", "head", "isBufferAlwaysEmpty", "()Z", "isBufferAlwaysFull", "isBufferEmpty", "isBufferFull", "isClosedForReceive", "isEmpty", "Ljava/util/concurrent/locks/ReentrantLock;", "Lkotlinx/coroutines/internal/ReentrantLock;", "lock", "Ljava/util/concurrent/locks/ReentrantLock;", "Lkotlinx/coroutines/channels/BufferOverflow;", "kotlinx-coroutines-core", "Lkotlinx/coroutines/channels/AbstractChannel;"}, m116k = 1, m117mv = {1, 6, 0}, m119xi = 48)
public class ArrayChannel<E> extends kotlinx.coroutines.channels.AbstractChannel<E> {
    private java.lang.Object[] buffer;
    private final int capacity;
    private int head;
    private final java.util.concurrent.locks.ReentrantLock lock;
    private final kotlinx.coroutines.channels.BufferOverflow onBufferOverflow;
    private volatile /* synthetic */ int size;

    /* JADX INFO: compiled from: ArrayChannel.kt */
    @kotlin.Metadata(m116k = 3, m117mv = {1, 6, 0}, m119xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = null;

        static {
                kotlinx.coroutines.channels.BufferOverflow[] r0 = kotlinx.coroutines.channels.BufferOverflow.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                kotlinx.coroutines.channels.BufferOverflow r1 = kotlinx.coroutines.channels.BufferOverflow.SUSPEND
                int r1 = r1.ordinal()
                r2 = 1
                r0[r1] = r2
                kotlinx.coroutines.channels.BufferOverflow r1 = kotlinx.coroutines.channels.BufferOverflow.DROP_LATEST
                int r1 = r1.ordinal()
                r2 = 2
                r0[r1] = r2
                kotlinx.coroutines.channels.BufferOverflow r1 = kotlinx.coroutines.channels.BufferOverflow.DROP_OLDEST
                int r1 = r1.ordinal()
                r2 = 3
                r0[r1] = r2
                kotlinx.coroutines.channels.ArrayChannel.WhenMappings.$EnumSwitchMapping$0 = r0
                return
        }
    }

    public ArrayChannel(int r10, kotlinx.coroutines.channels.BufferOverflow r11, kotlin.jvm.functions.Function1<? super E, kotlin.Unit> r12) {
            r9 = this;
            r9.<init>(r12)
            r9.capacity = r10
            r9.onBufferOverflow = r11
            int r0 = r9.capacity
            r1 = 0
            r2 = 1
            if (r0 < r2) goto Lf
            goto L10
        Lf:
            r2 = r1
        L10:
            if (r2 == 0) goto L34
        L13:
            java.util.concurrent.locks.ReentrantLock r0 = new java.util.concurrent.locks.ReentrantLock
            r0.<init>()
            r9.lock = r0
            int r0 = r9.capacity
            r2 = 8
            int r0 = java.lang.Math.min(r0, r2)
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r2 = r0
            r8 = 0
            kotlinx.coroutines.internal.Symbol r3 = kotlinx.coroutines.channels.AbstractChannelKt.EMPTY
            r6 = 6
            r7 = 0
            r4 = 0
            r5 = 0
            kotlin.collections.ArraysKt.fill$default(r2, r3, r4, r5, r6, r7)
            r9.buffer = r0
            r9.size = r1
            return
        L34:
            r0 = 0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "ArrayChannel capacity must be at least 1, but "
            java.lang.StringBuilder r1 = r1.append(r2)
            int r2 = r9.capacity
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " was specified"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r0 = r1.toString()
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
    }

    private final void enqueueElement(int r5, E r6) {
            r4 = this;
            int r0 = r4.capacity
            if (r5 >= r0) goto L13
            r4.ensureCapacity(r5)
            java.lang.Object[] r0 = r4.buffer
            int r1 = r4.head
            int r1 = r1 + r5
            java.lang.Object[] r2 = r4.buffer
            int r2 = r2.length
            int r1 = r1 % r2
            r0[r1] = r6
            goto L4c
        L13:
            boolean r0 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
            r1 = 1
            if (r0 == 0) goto L2d
            r0 = 0
            kotlinx.coroutines.channels.BufferOverflow r2 = r4.onBufferOverflow
            kotlinx.coroutines.channels.BufferOverflow r3 = kotlinx.coroutines.channels.BufferOverflow.DROP_OLDEST
            if (r2 != r3) goto L23
            r2 = r1
            goto L24
        L23:
            r2 = 0
        L24:
            if (r2 == 0) goto L27
            goto L2d
        L27:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        L2d:
            java.lang.Object[] r0 = r4.buffer
            int r2 = r4.head
            java.lang.Object[] r3 = r4.buffer
            int r3 = r3.length
            int r2 = r2 % r3
            r3 = 0
            r0[r2] = r3
            java.lang.Object[] r0 = r4.buffer
            int r2 = r4.head
            int r2 = r2 + r5
            java.lang.Object[] r3 = r4.buffer
            int r3 = r3.length
            int r2 = r2 % r3
            r0[r2] = r6
            int r0 = r4.head
            int r0 = r0 + r1
            java.lang.Object[] r1 = r4.buffer
            int r1 = r1.length
            int r0 = r0 % r1
            r4.head = r0
        L4c:
            return
    }

    private final void ensureCapacity(int r9) {
            r8 = this;
            java.lang.Object[] r0 = r8.buffer
            int r0 = r0.length
            if (r9 < r0) goto L30
            java.lang.Object[] r0 = r8.buffer
            int r0 = r0.length
            int r0 = r0 * 2
            int r1 = r8.capacity
            int r0 = java.lang.Math.min(r0, r1)
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r2 = 0
            r3 = r2
        L14:
            if (r3 >= r9) goto L27
            r4 = r3
            int r3 = r3 + 1
            java.lang.Object[] r5 = r8.buffer
            int r6 = r8.head
            int r6 = r6 + r4
            java.lang.Object[] r7 = r8.buffer
            int r7 = r7.length
            int r6 = r6 % r7
            r5 = r5[r6]
            r1[r4] = r5
            goto L14
        L27:
            kotlinx.coroutines.internal.Symbol r3 = kotlinx.coroutines.channels.AbstractChannelKt.EMPTY
            kotlin.collections.ArraysKt.fill(r1, r3, r9, r0)
            r8.buffer = r1
            r8.head = r2
        L30:
            return
    }

    private final kotlinx.coroutines.internal.Symbol updateBufferSize(int r4) {
            r3 = this;
            int r0 = r3.capacity
            r1 = 0
            if (r4 >= r0) goto La
            int r0 = r4 + 1
            r3.size = r0
            return r1
        La:
            kotlinx.coroutines.channels.BufferOverflow r0 = r3.onBufferOverflow
            int[] r2 = kotlinx.coroutines.channels.ArrayChannel.WhenMappings.$EnumSwitchMapping$0
            int r0 = r0.ordinal()
            r0 = r2[r0]
            switch(r0) {
                case 1: goto L21;
                case 2: goto L1e;
                case 3: goto L1d;
                default: goto L17;
            }
        L17:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L1d:
            goto L23
        L1e:
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.channels.AbstractChannelKt.OFFER_SUCCESS
            goto L23
        L21:
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.channels.AbstractChannelKt.OFFER_FAILED
        L23:
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
    protected java.lang.Object enqueueSend(kotlinx.coroutines.channels.Send r6) {
            r5 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r5.lock
            r1 = 0
            r2 = r0
            java.util.concurrent.locks.Lock r2 = (java.util.concurrent.locks.Lock) r2
            r2.lock()
            r3 = 0
            java.lang.Object r4 = super.enqueueSend(r6)     // Catch: java.lang.Throwable -> L13
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
            java.lang.String r1 = "(buffer:capacity="
            java.lang.StringBuilder r0 = r0.append(r1)
            int r1 = r2.capacity
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ",size="
            java.lang.StringBuilder r0 = r0.append(r1)
            int r1 = r2.size
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
            r1 = this;
            int r0 = r1.size
            if (r0 != 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    @Override // kotlinx.coroutines.channels.AbstractSendChannel
    protected final boolean isBufferFull() {
            r2 = this;
            int r0 = r2.size
            int r1 = r2.capacity
            if (r0 != r1) goto Le
            kotlinx.coroutines.channels.BufferOverflow r0 = r2.onBufferOverflow
            kotlinx.coroutines.channels.BufferOverflow r1 = kotlinx.coroutines.channels.BufferOverflow.SUSPEND
            if (r0 != r1) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @Override // kotlinx.coroutines.channels.AbstractChannel, kotlinx.coroutines.channels.ReceiveChannel
    public boolean isClosedForReceive() {
            r5 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r5.lock
            r1 = 0
            r2 = r0
            java.util.concurrent.locks.Lock r2 = (java.util.concurrent.locks.Lock) r2
            r2.lock()
            r3 = 0
            boolean r4 = super.isClosedForReceive()     // Catch: java.lang.Throwable -> L13
            r2.unlock()
            return r4
        L13:
            r3 = move-exception
            r2.unlock()
            throw r3
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
    protected java.lang.Object offerInternal(E r10) {
            r9 = this;
            r0 = 0
            java.util.concurrent.locks.ReentrantLock r1 = r9.lock
            r2 = 0
            r3 = r1
            java.util.concurrent.locks.Lock r3 = (java.util.concurrent.locks.Lock) r3
            r3.lock()
            r4 = 0
            int r5 = r9.size     // Catch: java.lang.Throwable -> L74
            kotlinx.coroutines.channels.Closed r6 = r9.getClosedForSend()     // Catch: java.lang.Throwable -> L74
            if (r6 != 0) goto L6e
            kotlinx.coroutines.internal.Symbol r6 = r9.updateBufferSize(r5)     // Catch: java.lang.Throwable -> L74
            if (r6 != 0) goto L68
            if (r5 != 0) goto L5f
        L1b:
        L1c:
            kotlinx.coroutines.channels.ReceiveOrClosed r6 = r9.takeFirstReceiveOrPeekClosed()     // Catch: java.lang.Throwable -> L74
            if (r6 != 0) goto L23
            goto L5f
        L23:
            r0 = r6
            boolean r6 = r0 instanceof kotlinx.coroutines.channels.Closed     // Catch: java.lang.Throwable -> L74
            if (r6 == 0) goto L30
            r9.size = r5     // Catch: java.lang.Throwable -> L74
            r3.unlock()
            return r0
        L30:
            r6 = 0
            kotlinx.coroutines.internal.Symbol r6 = r0.tryResumeReceive(r10, r6)     // Catch: java.lang.Throwable -> L74
            if (r6 == 0) goto L1b
            boolean r7 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()     // Catch: java.lang.Throwable -> L74
            if (r7 == 0) goto L4e
            r7 = 0
            kotlinx.coroutines.internal.Symbol r8 = kotlinx.coroutines.CancellableContinuationImplKt.RESUME_TOKEN     // Catch: java.lang.Throwable -> L74
            if (r6 != r8) goto L44
            r8 = 1
            goto L45
        L44:
            r8 = 0
        L45:
            if (r8 == 0) goto L48
            goto L4e
        L48:
            java.lang.AssertionError r7 = new java.lang.AssertionError     // Catch: java.lang.Throwable -> L74
            r7.<init>()     // Catch: java.lang.Throwable -> L74
            throw r7     // Catch: java.lang.Throwable -> L74
        L4e:
            r9.size = r5     // Catch: java.lang.Throwable -> L74
            kotlin.Unit r4 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L74
            r3.unlock()
            r0.completeResumeReceive(r10)
            java.lang.Object r1 = r0.getOfferResult()
            return r1
        L5f:
            r9.enqueueElement(r5, r10)     // Catch: java.lang.Throwable -> L74
            kotlinx.coroutines.internal.Symbol r6 = kotlinx.coroutines.channels.AbstractChannelKt.OFFER_SUCCESS     // Catch: java.lang.Throwable -> L74
            r3.unlock()
            return r6
        L68:
            r7 = 0
            r3.unlock()
            return r6
        L6e:
            r7 = 0
            r3.unlock()
            return r6
        L74:
            r4 = move-exception
            r3.unlock()
            throw r4
    }

    @Override // kotlinx.coroutines.channels.AbstractSendChannel
    protected java.lang.Object offerSelectInternal(E r11, kotlinx.coroutines.selects.SelectInstance<?> r12) {
            r10 = this;
            r0 = 0
            java.util.concurrent.locks.ReentrantLock r1 = r10.lock
            r2 = 0
            r3 = r1
            java.util.concurrent.locks.Lock r3 = (java.util.concurrent.locks.Lock) r3
            r3.lock()
            r4 = 0
            int r5 = r10.size     // Catch: java.lang.Throwable -> L9a
            kotlinx.coroutines.channels.Closed r6 = r10.getClosedForSend()     // Catch: java.lang.Throwable -> L9a
            if (r6 != 0) goto L94
            kotlinx.coroutines.internal.Symbol r6 = r10.updateBufferSize(r5)     // Catch: java.lang.Throwable -> L9a
            if (r6 != 0) goto L8e
            if (r5 != 0) goto L75
        L1b:
        L1c:
            kotlinx.coroutines.channels.AbstractSendChannel$TryOfferDesc r6 = r10.describeTryOffer(r11)     // Catch: java.lang.Throwable -> L9a
            r7 = r6
            kotlinx.coroutines.internal.AtomicDesc r7 = (kotlinx.coroutines.internal.AtomicDesc) r7     // Catch: java.lang.Throwable -> L9a
            java.lang.Object r7 = r12.performAtomicTrySelect(r7)     // Catch: java.lang.Throwable -> L9a
            if (r7 != 0) goto L49
            r10.size = r5     // Catch: java.lang.Throwable -> L9a
            java.lang.Object r8 = r6.getResult()     // Catch: java.lang.Throwable -> L9a
            r0 = r8
            kotlin.Unit r4 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L9a
            r3.unlock()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            r1 = r0
            kotlinx.coroutines.channels.ReceiveOrClosed r1 = (kotlinx.coroutines.channels.ReceiveOrClosed) r1
            r1.completeResumeReceive(r11)
            r1 = r0
            kotlinx.coroutines.channels.ReceiveOrClosed r1 = (kotlinx.coroutines.channels.ReceiveOrClosed) r1
            java.lang.Object r1 = r1.getOfferResult()
            return r1
        L49:
            kotlinx.coroutines.internal.Symbol r8 = kotlinx.coroutines.channels.AbstractChannelKt.OFFER_FAILED     // Catch: java.lang.Throwable -> L9a
            if (r7 != r8) goto L4e
            goto L75
        L4e:
            java.lang.Object r8 = kotlinx.coroutines.internal.AtomicKt.RETRY_ATOMIC     // Catch: java.lang.Throwable -> L9a
            if (r7 != r8) goto L53
            goto L1b
        L53:
            java.lang.Object r8 = kotlinx.coroutines.selects.SelectKt.getALREADY_SELECTED()     // Catch: java.lang.Throwable -> L9a
            if (r7 == r8) goto L6e
            boolean r8 = r7 instanceof kotlinx.coroutines.channels.Closed     // Catch: java.lang.Throwable -> L9a
            if (r8 == 0) goto L5e
            goto L6e
        L5e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L9a
            java.lang.String r9 = "performAtomicTrySelect(describeTryOffer) returned "
            java.lang.String r9 = kotlin.jvm.internal.Intrinsics.stringPlus(r9, r7)     // Catch: java.lang.Throwable -> L9a
            java.lang.String r9 = r9.toString()     // Catch: java.lang.Throwable -> L9a
            r8.<init>(r9)     // Catch: java.lang.Throwable -> L9a
            throw r8     // Catch: java.lang.Throwable -> L9a
        L6e:
            r10.size = r5     // Catch: java.lang.Throwable -> L9a
            r3.unlock()
            return r7
        L75:
            boolean r6 = r12.trySelect()     // Catch: java.lang.Throwable -> L9a
            if (r6 != 0) goto L85
            r10.size = r5     // Catch: java.lang.Throwable -> L9a
            java.lang.Object r6 = kotlinx.coroutines.selects.SelectKt.getALREADY_SELECTED()     // Catch: java.lang.Throwable -> L9a
            r3.unlock()
            return r6
        L85:
            r10.enqueueElement(r5, r11)     // Catch: java.lang.Throwable -> L9a
            kotlinx.coroutines.internal.Symbol r6 = kotlinx.coroutines.channels.AbstractChannelKt.OFFER_SUCCESS     // Catch: java.lang.Throwable -> L9a
            r3.unlock()
            return r6
        L8e:
            r7 = 0
            r3.unlock()
            return r6
        L94:
            r7 = 0
            r3.unlock()
            return r6
        L9a:
            r4 = move-exception
            r3.unlock()
            throw r4
    }

    @Override // kotlinx.coroutines.channels.AbstractChannel
    protected void onCancelIdempotent(boolean r17) {
            r16 = this;
            r1 = r16
            kotlin.jvm.functions.Function1<E, kotlin.Unit> r2 = r1.onUndeliveredElement
            r3 = 0
            java.util.concurrent.locks.ReentrantLock r4 = r1.lock
            r5 = 0
            r6 = r4
            java.util.concurrent.locks.Lock r6 = (java.util.concurrent.locks.Lock) r6
            r6.lock()
            r0 = 0
            int r7 = r1.size     // Catch: java.lang.Throwable -> L50
            r8 = 0
            r9 = r8
        L13:
            if (r9 >= r7) goto L3e
            int r10 = r9 + 1
            r11 = 0
            java.lang.Object[] r12 = r1.buffer     // Catch: java.lang.Throwable -> L50
            int r13 = r1.head     // Catch: java.lang.Throwable -> L50
            r12 = r12[r13]     // Catch: java.lang.Throwable -> L50
            if (r2 == 0) goto L29
            kotlinx.coroutines.internal.Symbol r13 = kotlinx.coroutines.channels.AbstractChannelKt.EMPTY     // Catch: java.lang.Throwable -> L50
            if (r12 == r13) goto L29
            kotlinx.coroutines.internal.UndeliveredElementException r13 = kotlinx.coroutines.internal.OnUndeliveredElementKt.callUndeliveredElementCatchingException(r2, r12, r3)     // Catch: java.lang.Throwable -> L50
            r3 = r13
        L29:
            java.lang.Object[] r13 = r1.buffer     // Catch: java.lang.Throwable -> L50
            int r14 = r1.head     // Catch: java.lang.Throwable -> L50
            kotlinx.coroutines.internal.Symbol r15 = kotlinx.coroutines.channels.AbstractChannelKt.EMPTY     // Catch: java.lang.Throwable -> L50
            r13[r14] = r15     // Catch: java.lang.Throwable -> L50
            int r13 = r1.head     // Catch: java.lang.Throwable -> L50
            int r13 = r13 + 1
            java.lang.Object[] r14 = r1.buffer     // Catch: java.lang.Throwable -> L50
            int r14 = r14.length     // Catch: java.lang.Throwable -> L50
            int r13 = r13 % r14
            r1.head = r13     // Catch: java.lang.Throwable -> L50
            r9 = r10
            goto L13
        L3e:
            r1.size = r8     // Catch: java.lang.Throwable -> L50
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L50
            r6.unlock()
            super.onCancelIdempotent(r17)
            if (r3 != 0) goto L4d
            return
        L4d:
            r0 = r3
            r4 = 0
            throw r0
        L50:
            r0 = move-exception
            r6.unlock()
            throw r0
    }

    @Override // kotlinx.coroutines.channels.AbstractChannel
    protected java.lang.Object pollInternal() {
            r13 = this;
            r0 = 0
            r1 = 0
            r2 = 0
            java.util.concurrent.locks.ReentrantLock r3 = r13.lock
            r4 = 0
            r5 = r3
            java.util.concurrent.locks.Lock r5 = (java.util.concurrent.locks.Lock) r5
            r5.lock()
            r6 = 0
            int r7 = r13.size     // Catch: java.lang.Throwable -> L95
            if (r7 != 0) goto L1d
            kotlinx.coroutines.channels.Closed r8 = r13.getClosedForSend()     // Catch: java.lang.Throwable -> L95
            if (r8 != 0) goto L19
            kotlinx.coroutines.internal.Symbol r8 = kotlinx.coroutines.channels.AbstractChannelKt.POLL_FAILED     // Catch: java.lang.Throwable -> L95
        L19:
            r5.unlock()
            return r8
        L1d:
            java.lang.Object[] r8 = r13.buffer     // Catch: java.lang.Throwable -> L95
            int r9 = r13.head     // Catch: java.lang.Throwable -> L95
            r8 = r8[r9]     // Catch: java.lang.Throwable -> L95
            r2 = r8
            java.lang.Object[] r8 = r13.buffer     // Catch: java.lang.Throwable -> L95
            int r9 = r13.head     // Catch: java.lang.Throwable -> L95
            r10 = 0
            r8[r9] = r10     // Catch: java.lang.Throwable -> L95
            int r8 = r7 + (-1)
            r13.size = r8     // Catch: java.lang.Throwable -> L95
            kotlinx.coroutines.internal.Symbol r8 = kotlinx.coroutines.channels.AbstractChannelKt.POLL_FAILED     // Catch: java.lang.Throwable -> L95
            int r9 = r13.capacity     // Catch: java.lang.Throwable -> L95
            r11 = 1
            if (r7 != r9) goto L67
        L36:
        L37:
            kotlinx.coroutines.channels.Send r9 = r13.takeFirstSendOrPeekClosed()     // Catch: java.lang.Throwable -> L95
            if (r9 != 0) goto L3e
            goto L67
        L3e:
            r0 = r9
            kotlinx.coroutines.internal.Symbol r9 = r0.tryResumeSend(r10)     // Catch: java.lang.Throwable -> L95
            if (r9 == 0) goto L63
            boolean r10 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()     // Catch: java.lang.Throwable -> L95
            if (r10 == 0) goto L5c
            r10 = 0
            kotlinx.coroutines.internal.Symbol r12 = kotlinx.coroutines.CancellableContinuationImplKt.RESUME_TOKEN     // Catch: java.lang.Throwable -> L95
            if (r9 != r12) goto L52
            r12 = r11
            goto L53
        L52:
            r12 = 0
        L53:
            if (r12 == 0) goto L56
            goto L5c
        L56:
            java.lang.AssertionError r10 = new java.lang.AssertionError     // Catch: java.lang.Throwable -> L95
            r10.<init>()     // Catch: java.lang.Throwable -> L95
            throw r10     // Catch: java.lang.Throwable -> L95
        L5c:
            r1 = 1
            java.lang.Object r10 = r0.getPollResult()     // Catch: java.lang.Throwable -> L95
            r8 = r10
            goto L67
        L63:
            r0.undeliveredElement()     // Catch: java.lang.Throwable -> L95
            goto L36
        L67:
            kotlinx.coroutines.internal.Symbol r9 = kotlinx.coroutines.channels.AbstractChannelKt.POLL_FAILED     // Catch: java.lang.Throwable -> L95
            if (r8 == r9) goto L7c
            boolean r9 = r8 instanceof kotlinx.coroutines.channels.Closed     // Catch: java.lang.Throwable -> L95
            if (r9 != 0) goto L7c
            r13.size = r7     // Catch: java.lang.Throwable -> L95
            java.lang.Object[] r9 = r13.buffer     // Catch: java.lang.Throwable -> L95
            int r10 = r13.head     // Catch: java.lang.Throwable -> L95
            int r10 = r10 + r7
            java.lang.Object[] r12 = r13.buffer     // Catch: java.lang.Throwable -> L95
            int r12 = r12.length     // Catch: java.lang.Throwable -> L95
            int r10 = r10 % r12
            r9[r10] = r8     // Catch: java.lang.Throwable -> L95
        L7c:
            int r9 = r13.head     // Catch: java.lang.Throwable -> L95
            int r9 = r9 + r11
            java.lang.Object[] r10 = r13.buffer     // Catch: java.lang.Throwable -> L95
            int r10 = r10.length     // Catch: java.lang.Throwable -> L95
            int r9 = r9 % r10
            r13.head = r9     // Catch: java.lang.Throwable -> L95
            kotlin.Unit r6 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L95
            r5.unlock()
            if (r1 == 0) goto L94
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            r0.completeResumeSend()
        L94:
            return r2
        L95:
            r6 = move-exception
            r5.unlock()
            throw r6
    }

    @Override // kotlinx.coroutines.channels.AbstractChannel
    protected java.lang.Object pollSelectInternal(kotlinx.coroutines.selects.SelectInstance<?> r14) {
            r13 = this;
            r0 = 0
            r1 = 0
            r2 = 0
            java.util.concurrent.locks.ReentrantLock r3 = r13.lock
            r4 = 0
            r5 = r3
            java.util.concurrent.locks.Lock r5 = (java.util.concurrent.locks.Lock) r5
            r5.lock()
            r6 = 0
            int r7 = r13.size     // Catch: java.lang.Throwable -> Ld4
            if (r7 != 0) goto L1d
            kotlinx.coroutines.channels.Closed r8 = r13.getClosedForSend()     // Catch: java.lang.Throwable -> Ld4
            if (r8 != 0) goto L19
            kotlinx.coroutines.internal.Symbol r8 = kotlinx.coroutines.channels.AbstractChannelKt.POLL_FAILED     // Catch: java.lang.Throwable -> Ld4
        L19:
            r5.unlock()
            return r8
        L1d:
            java.lang.Object[] r8 = r13.buffer     // Catch: java.lang.Throwable -> Ld4
            int r9 = r13.head     // Catch: java.lang.Throwable -> Ld4
            r8 = r8[r9]     // Catch: java.lang.Throwable -> Ld4
            r2 = r8
            java.lang.Object[] r8 = r13.buffer     // Catch: java.lang.Throwable -> Ld4
            int r9 = r13.head     // Catch: java.lang.Throwable -> Ld4
            r10 = 0
            r8[r9] = r10     // Catch: java.lang.Throwable -> Ld4
            int r8 = r7 + (-1)
            r13.size = r8     // Catch: java.lang.Throwable -> Ld4
            kotlinx.coroutines.internal.Symbol r8 = kotlinx.coroutines.channels.AbstractChannelKt.POLL_FAILED     // Catch: java.lang.Throwable -> Ld4
            int r9 = r13.capacity     // Catch: java.lang.Throwable -> Ld4
            if (r7 != r9) goto L8b
        L35:
        L36:
            kotlinx.coroutines.channels.AbstractChannel$TryPollDesc r9 = r13.describeTryPoll()     // Catch: java.lang.Throwable -> Ld4
            r10 = r9
            kotlinx.coroutines.internal.AtomicDesc r10 = (kotlinx.coroutines.internal.AtomicDesc) r10     // Catch: java.lang.Throwable -> Ld4
            java.lang.Object r10 = r14.performAtomicTrySelect(r10)     // Catch: java.lang.Throwable -> Ld4
            if (r10 != 0) goto L56
            java.lang.Object r11 = r9.getResult()     // Catch: java.lang.Throwable -> Ld4
            r0 = r11
            r1 = 1
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)     // Catch: java.lang.Throwable -> Ld4
            r11 = r0
            kotlinx.coroutines.channels.Send r11 = (kotlinx.coroutines.channels.Send) r11     // Catch: java.lang.Throwable -> Ld4
            java.lang.Object r11 = r11.getPollResult()     // Catch: java.lang.Throwable -> Ld4
            r8 = r11
            goto L8b
        L56:
            kotlinx.coroutines.internal.Symbol r11 = kotlinx.coroutines.channels.AbstractChannelKt.POLL_FAILED     // Catch: java.lang.Throwable -> Ld4
            if (r10 != r11) goto L5b
            goto L8b
        L5b:
            java.lang.Object r11 = kotlinx.coroutines.internal.AtomicKt.RETRY_ATOMIC     // Catch: java.lang.Throwable -> Ld4
            if (r10 != r11) goto L60
            goto L35
        L60:
            java.lang.Object r11 = kotlinx.coroutines.selects.SelectKt.getALREADY_SELECTED()     // Catch: java.lang.Throwable -> Ld4
            if (r10 != r11) goto L73
            r13.size = r7     // Catch: java.lang.Throwable -> Ld4
            java.lang.Object[] r11 = r13.buffer     // Catch: java.lang.Throwable -> Ld4
            int r12 = r13.head     // Catch: java.lang.Throwable -> Ld4
            r11[r12] = r2     // Catch: java.lang.Throwable -> Ld4
            r5.unlock()
            return r10
        L73:
            boolean r11 = r10 instanceof kotlinx.coroutines.channels.Closed     // Catch: java.lang.Throwable -> Ld4
            if (r11 == 0) goto L7b
            r0 = r10
            r1 = 1
            r8 = r10
            goto L8b
        L7b:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Ld4
            java.lang.String r12 = "performAtomicTrySelect(describeTryOffer) returned "
            java.lang.String r12 = kotlin.jvm.internal.Intrinsics.stringPlus(r12, r10)     // Catch: java.lang.Throwable -> Ld4
            java.lang.String r12 = r12.toString()     // Catch: java.lang.Throwable -> Ld4
            r11.<init>(r12)     // Catch: java.lang.Throwable -> Ld4
            throw r11     // Catch: java.lang.Throwable -> Ld4
        L8b:
            kotlinx.coroutines.internal.Symbol r9 = kotlinx.coroutines.channels.AbstractChannelKt.POLL_FAILED     // Catch: java.lang.Throwable -> Ld4
            if (r8 == r9) goto La1
            boolean r9 = r8 instanceof kotlinx.coroutines.channels.Closed     // Catch: java.lang.Throwable -> Ld4
            if (r9 != 0) goto La1
            r13.size = r7     // Catch: java.lang.Throwable -> Ld4
            java.lang.Object[] r9 = r13.buffer     // Catch: java.lang.Throwable -> Ld4
            int r10 = r13.head     // Catch: java.lang.Throwable -> Ld4
            int r10 = r10 + r7
            java.lang.Object[] r11 = r13.buffer     // Catch: java.lang.Throwable -> Ld4
            int r11 = r11.length     // Catch: java.lang.Throwable -> Ld4
            int r10 = r10 % r11
            r9[r10] = r8     // Catch: java.lang.Throwable -> Ld4
            goto Lb7
        La1:
            boolean r9 = r14.trySelect()     // Catch: java.lang.Throwable -> Ld4
            if (r9 != 0) goto Lb7
            r13.size = r7     // Catch: java.lang.Throwable -> Ld4
            java.lang.Object[] r9 = r13.buffer     // Catch: java.lang.Throwable -> Ld4
            int r10 = r13.head     // Catch: java.lang.Throwable -> Ld4
            r9[r10] = r2     // Catch: java.lang.Throwable -> Ld4
            java.lang.Object r9 = kotlinx.coroutines.selects.SelectKt.getALREADY_SELECTED()     // Catch: java.lang.Throwable -> Ld4
            r5.unlock()
            return r9
        Lb7:
            int r9 = r13.head     // Catch: java.lang.Throwable -> Ld4
            int r9 = r9 + 1
            java.lang.Object[] r10 = r13.buffer     // Catch: java.lang.Throwable -> Ld4
            int r10 = r10.length     // Catch: java.lang.Throwable -> Ld4
            int r9 = r9 % r10
            r13.head = r9     // Catch: java.lang.Throwable -> Ld4
            kotlin.Unit r6 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> Ld4
            r5.unlock()
            if (r1 == 0) goto Ld3
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            r3 = r0
            kotlinx.coroutines.channels.Send r3 = (kotlinx.coroutines.channels.Send) r3
            r3.completeResumeSend()
        Ld3:
            return r2
        Ld4:
            r6 = move-exception
            r5.unlock()
            throw r6
    }
}
