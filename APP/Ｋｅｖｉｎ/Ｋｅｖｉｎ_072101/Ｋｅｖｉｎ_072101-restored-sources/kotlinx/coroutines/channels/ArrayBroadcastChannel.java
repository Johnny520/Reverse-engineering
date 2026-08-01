package kotlinx.coroutines.channels;

/* JADX INFO: compiled from: ArrayBroadcastChannel.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000L2\b\u0012\u0004\u0012\u00028\u00000M:\u0001JB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\t\u001a\u00020\r2\u000e\u0010\u0007\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\fH\u0016¢\u0006\u0004\b\t\u0010\u000eJ\u0019\u0010\u000f\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\nJ\u000f\u0010\u0010\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0012\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\nJ\u000f\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00028\u00002\u0006\u0010\u0016\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ#\u0010\u001f\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00028\u00002\n\u0010\u001e\u001a\u0006\u0012\u0002\b\u00030\u001dH\u0014¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000!H\u0016¢\u0006\u0004\b\"\u0010#J4\u0010'\u001a\u00020\r2\u0010\b\u0002\u0010%\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010$2\u0010\b\u0002\u0010&\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010$H\u0082\u0010¢\u0006\u0004\b'\u0010(R\u001c\u0010*\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010/\u001a\u00020,8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0018\u00102\u001a\u000600j\u0002`18\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00104\u001a\u0004\b5\u00106R$\u0010;\u001a\u00020\u00132\u0006\u00107\u001a\u00020\u00138B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b8\u0010\u0015\"\u0004\b9\u0010:R\u0014\u0010<\u001a\u00020\b8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b<\u0010=R\u0014\u0010>\u001a\u00020\b8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b>\u0010=R$\u0010A\u001a\u00020\u00022\u0006\u00107\u001a\u00020\u00028B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b?\u00106\"\u0004\b@\u0010\u0005R6\u0010D\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000$0Bj\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000$`C8\u0002X\u0082\u0004¢\u0006\f\n\u0004\bD\u0010E\u0012\u0004\bF\u0010\u0011R$\u0010I\u001a\u00020\u00132\u0006\u00107\u001a\u00020\u00138B@BX\u0082\u000e¢\u0006\f\u001a\u0004\bG\u0010\u0015\"\u0004\bH\u0010:¨\u0006K"}, m115d2 = {"Lkotlinx/coroutines/channels/ArrayBroadcastChannel;", "E", "", "capacity", "<init>", "(I)V", "", "cause", "", "cancel", "(Ljava/lang/Throwable;)Z", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "", "(Ljava/util/concurrent/CancellationException;)V", "cancelInternal", "checkSubOffers", "()V", "close", "", "computeMinHead", "()J", "index", "elementAt", "(J)Ljava/lang/Object;", "element", "", "offerInternal", "(Ljava/lang/Object;)Ljava/lang/Object;", "Lkotlinx/coroutines/selects/SelectInstance;", "select", "offerSelectInternal", "(Ljava/lang/Object;Lkotlinx/coroutines/selects/SelectInstance;)Ljava/lang/Object;", "Lkotlinx/coroutines/channels/ReceiveChannel;", "openSubscription", "()Lkotlinx/coroutines/channels/ReceiveChannel;", "Lkotlinx/coroutines/channels/ArrayBroadcastChannel$Subscriber;", "addSub", "removeSub", "updateHead", "(Lkotlinx/coroutines/channels/ArrayBroadcastChannel$Subscriber;Lkotlinx/coroutines/channels/ArrayBroadcastChannel$Subscriber;)V", "", "buffer", "[Ljava/lang/Object;", "", "getBufferDebugString", "()Ljava/lang/String;", "bufferDebugString", "Ljava/util/concurrent/locks/ReentrantLock;", "Lkotlinx/coroutines/internal/ReentrantLock;", "bufferLock", "Ljava/util/concurrent/locks/ReentrantLock;", "I", "getCapacity", "()I", "value", "getHead", "setHead", "(J)V", "head", "isBufferAlwaysFull", "()Z", "isBufferFull", "getSize", "setSize", "size", "", "Lkotlinx/coroutines/internal/SubscribersList;", "subscribers", "Ljava/util/List;", "getSubscribers$annotations", "getTail", "setTail", "tail", "Subscriber", "kotlinx-coroutines-core", "Lkotlinx/coroutines/channels/AbstractSendChannel;", "Lkotlinx/coroutines/channels/BroadcastChannel;"}, m116k = 1, m117mv = {1, 6, 0}, m119xi = 48)
public final class ArrayBroadcastChannel<E> extends kotlinx.coroutines.channels.AbstractSendChannel<E> implements kotlinx.coroutines.channels.BroadcastChannel<E> {
    private volatile /* synthetic */ long _head;
    private volatile /* synthetic */ int _size;
    private volatile /* synthetic */ long _tail;
    private final java.lang.Object[] buffer;
    private final java.util.concurrent.locks.ReentrantLock bufferLock;
    private final int capacity;
    private final java.util.List<kotlinx.coroutines.channels.ArrayBroadcastChannel.Subscriber<E>> subscribers;

    /* JADX INFO: compiled from: ArrayBroadcastChannel.kt */
    @kotlin.Metadata(m114d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010'2\b\u0012\u0004\u0012\u00028\u00010(B\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\bJ\u0011\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0011\u0010\u0011\u001a\u0004\u0018\u00010\u000eH\u0014¢\u0006\u0004\b\u0011\u0010\u0010J\u001d\u0010\u0014\u001a\u0004\u0018\u00010\u000e2\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u0012H\u0014¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00068TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\bR\u0014\u0010\u0018\u001a\u00020\u00068TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\bR\u0014\u0010\u0019\u001a\u00020\u00068TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\bR\u0014\u0010\u001a\u001a\u00020\u00068TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\bR$\u0010!\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u0018\u0010$\u001a\u00060\"j\u0002`#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006&"}, m115d2 = {"Lkotlinx/coroutines/channels/ArrayBroadcastChannel$Subscriber;", "E", "Lkotlinx/coroutines/channels/ArrayBroadcastChannel;", "broadcastChannel", "<init>", "(Lkotlinx/coroutines/channels/ArrayBroadcastChannel;)V", "", "checkOffer", "()Z", "", "cause", "close", "(Ljava/lang/Throwable;)Z", "needsToCheckOfferWithoutLock", "", "peekUnderLock", "()Ljava/lang/Object;", "pollInternal", "Lkotlinx/coroutines/selects/SelectInstance;", "select", "pollSelectInternal", "(Lkotlinx/coroutines/selects/SelectInstance;)Ljava/lang/Object;", "Lkotlinx/coroutines/channels/ArrayBroadcastChannel;", "isBufferAlwaysEmpty", "isBufferAlwaysFull", "isBufferEmpty", "isBufferFull", "", "value", "getSubHead", "()J", "setSubHead", "(J)V", "subHead", "Ljava/util/concurrent/locks/ReentrantLock;", "Lkotlinx/coroutines/internal/ReentrantLock;", "subLock", "Ljava/util/concurrent/locks/ReentrantLock;", "kotlinx-coroutines-core", "Lkotlinx/coroutines/channels/AbstractChannel;", "Lkotlinx/coroutines/channels/ReceiveChannel;"}, m116k = 1, m117mv = {1, 6, 0}, m119xi = 48)
    private static final class Subscriber<E> extends kotlinx.coroutines.channels.AbstractChannel<E> implements kotlinx.coroutines.channels.ReceiveChannel<E> {
        private volatile /* synthetic */ long _subHead;
        private final kotlinx.coroutines.channels.ArrayBroadcastChannel<E> broadcastChannel;
        private final java.util.concurrent.locks.ReentrantLock subLock;

        public Subscriber(kotlinx.coroutines.channels.ArrayBroadcastChannel<E> r3) {
                r2 = this;
                r0 = 0
                r2.<init>(r0)
                r2.broadcastChannel = r3
                java.util.concurrent.locks.ReentrantLock r0 = new java.util.concurrent.locks.ReentrantLock
                r0.<init>()
                r2.subLock = r0
                r0 = 0
                r2._subHead = r0
                return
        }

        private final boolean needsToCheckOfferWithoutLock() {
                r2 = this;
                kotlinx.coroutines.channels.Closed r0 = r2.getClosedForReceive()
                r1 = 0
                if (r0 == 0) goto L8
                return r1
            L8:
                boolean r0 = r2.isBufferEmpty()
                if (r0 == 0) goto L17
                kotlinx.coroutines.channels.ArrayBroadcastChannel<E> r0 = r2.broadcastChannel
                kotlinx.coroutines.channels.Closed r0 = r0.getClosedForReceive()
                if (r0 != 0) goto L17
                return r1
            L17:
                r0 = 1
                return r0
        }

        private final java.lang.Object peekUnderLock() {
                r7 = this;
                long r0 = r7.getSubHead()
                kotlinx.coroutines.channels.ArrayBroadcastChannel<E> r2 = r7.broadcastChannel
                kotlinx.coroutines.channels.Closed r2 = r2.getClosedForReceive()
                kotlinx.coroutines.channels.ArrayBroadcastChannel<E> r3 = r7.broadcastChannel
                long r3 = kotlinx.coroutines.channels.ArrayBroadcastChannel.access$getTail(r3)
                int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
                if (r5 < 0) goto L21
                if (r2 != 0) goto L1b
                kotlinx.coroutines.channels.Closed r5 = r7.getClosedForReceive()
                goto L1c
            L1b:
                r5 = r2
            L1c:
                if (r5 != 0) goto L20
                kotlinx.coroutines.internal.Symbol r5 = kotlinx.coroutines.channels.AbstractChannelKt.POLL_FAILED
            L20:
                return r5
            L21:
                kotlinx.coroutines.channels.ArrayBroadcastChannel<E> r5 = r7.broadcastChannel
                java.lang.Object r5 = kotlinx.coroutines.channels.ArrayBroadcastChannel.access$elementAt(r5, r0)
                kotlinx.coroutines.channels.Closed r6 = r7.getClosedForReceive()
                if (r6 == 0) goto L2e
                return r6
            L2e:
                return r5
        }

        public final boolean checkOffer() {
                r9 = this;
                r0 = 0
                r1 = 0
            L2:
                boolean r2 = r9.needsToCheckOfferWithoutLock()
                if (r2 == 0) goto L7d
                java.util.concurrent.locks.ReentrantLock r2 = r9.subLock
                boolean r2 = r2.tryLock()
                if (r2 != 0) goto L12
                goto L7d
            L12:
                r2 = 0
                r3 = 0
                java.lang.Object r4 = r9.peekUnderLock()     // Catch: java.lang.Throwable -> L76
                r3 = r4
                kotlinx.coroutines.internal.Symbol r4 = kotlinx.coroutines.channels.AbstractChannelKt.POLL_FAILED     // Catch: java.lang.Throwable -> L76
                if (r3 != r4) goto L25
            L1f:
                java.util.concurrent.locks.ReentrantLock r4 = r9.subLock
                r4.unlock()
                goto L2
            L25:
                boolean r4 = r3 instanceof kotlinx.coroutines.channels.Closed     // Catch: java.lang.Throwable -> L76
                if (r4 == 0) goto L34
                r4 = r3
                kotlinx.coroutines.channels.Closed r4 = (kotlinx.coroutines.channels.Closed) r4     // Catch: java.lang.Throwable -> L76
                r1 = r4
            L2e:
                java.util.concurrent.locks.ReentrantLock r4 = r9.subLock
                r4.unlock()
                goto L7d
            L34:
                kotlinx.coroutines.channels.ReceiveOrClosed r4 = r9.takeFirstReceiveOrPeekClosed()     // Catch: java.lang.Throwable -> L76
                if (r4 != 0) goto L3b
            L3a:
                goto L2e
            L3b:
                r2 = r4
                boolean r4 = r2 instanceof kotlinx.coroutines.channels.Closed     // Catch: java.lang.Throwable -> L76
                if (r4 == 0) goto L42
                goto L3a
            L42:
                r4 = 0
                kotlinx.coroutines.internal.Symbol r4 = r2.tryResumeReceive(r3, r4)     // Catch: java.lang.Throwable -> L76
                if (r4 != 0) goto L4a
                goto L1f
            L4a:
                boolean r5 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()     // Catch: java.lang.Throwable -> L76
                if (r5 == 0) goto L61
                r5 = 0
                kotlinx.coroutines.internal.Symbol r6 = kotlinx.coroutines.CancellableContinuationImplKt.RESUME_TOKEN     // Catch: java.lang.Throwable -> L76
                if (r4 != r6) goto L57
                r6 = 1
                goto L58
            L57:
                r6 = 0
            L58:
                if (r6 == 0) goto L5b
                goto L61
            L5b:
                java.lang.AssertionError r5 = new java.lang.AssertionError     // Catch: java.lang.Throwable -> L76
                r5.<init>()     // Catch: java.lang.Throwable -> L76
                throw r5     // Catch: java.lang.Throwable -> L76
            L61:
                long r5 = r9.getSubHead()     // Catch: java.lang.Throwable -> L76
                r7 = 1
                long r7 = r7 + r5
                r9.setSubHead(r7)     // Catch: java.lang.Throwable -> L76
                r0 = 1
                java.util.concurrent.locks.ReentrantLock r4 = r9.subLock
                r4.unlock()
                r2.completeResumeReceive(r3)
                goto L2
            L76:
                r4 = move-exception
                java.util.concurrent.locks.ReentrantLock r5 = r9.subLock
                r5.unlock()
                throw r4
            L7d:
                if (r1 != 0) goto L80
                goto L87
            L80:
                r2 = r1
                r3 = 0
                java.lang.Throwable r4 = r2.closeCause
                r9.close(r4)
            L87:
                return r0
        }

        @Override // kotlinx.coroutines.channels.AbstractSendChannel, kotlinx.coroutines.channels.SendChannel
        public boolean close(java.lang.Throwable r8) {
                r7 = this;
                boolean r0 = super.close(r8)
                if (r0 == 0) goto L2c
                kotlinx.coroutines.channels.ArrayBroadcastChannel<E> r1 = r7.broadcastChannel
                r2 = 1
                r3 = 0
                kotlinx.coroutines.channels.ArrayBroadcastChannel.updateHead$default(r1, r3, r7, r2, r3)
                java.util.concurrent.locks.ReentrantLock r1 = r7.subLock
                r2 = 0
                r3 = r1
                java.util.concurrent.locks.Lock r3 = (java.util.concurrent.locks.Lock) r3
                r3.lock()
                r4 = 0
                kotlinx.coroutines.channels.ArrayBroadcastChannel<E> r5 = r7.broadcastChannel     // Catch: java.lang.Throwable -> L27
                long r5 = kotlinx.coroutines.channels.ArrayBroadcastChannel.access$getTail(r5)     // Catch: java.lang.Throwable -> L27
                r7.setSubHead(r5)     // Catch: java.lang.Throwable -> L27
                kotlin.Unit r4 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L27
                r3.unlock()
                goto L2c
            L27:
                r4 = move-exception
                r3.unlock()
                throw r4
            L2c:
                return r0
        }

        public final long getSubHead() {
                r2 = this;
                long r0 = r2._subHead
                return r0
        }

        @Override // kotlinx.coroutines.channels.AbstractChannel
        protected boolean isBufferAlwaysEmpty() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // kotlinx.coroutines.channels.AbstractSendChannel
        protected boolean isBufferAlwaysFull() {
                r2 = this;
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "Should not be used"
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
        }

        @Override // kotlinx.coroutines.channels.AbstractChannel
        protected boolean isBufferEmpty() {
                r4 = this;
                long r0 = r4.getSubHead()
                kotlinx.coroutines.channels.ArrayBroadcastChannel<E> r2 = r4.broadcastChannel
                long r2 = kotlinx.coroutines.channels.ArrayBroadcastChannel.access$getTail(r2)
                int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r0 < 0) goto L10
                r0 = 1
                goto L11
            L10:
                r0 = 0
            L11:
                return r0
        }

        @Override // kotlinx.coroutines.channels.AbstractSendChannel
        protected boolean isBufferFull() {
                r2 = this;
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "Should not be used"
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
        }

        @Override // kotlinx.coroutines.channels.AbstractChannel
        protected java.lang.Object pollInternal() {
                r10 = this;
                r0 = 0
                java.util.concurrent.locks.ReentrantLock r1 = r10.subLock
                r2 = 0
                r3 = r1
                java.util.concurrent.locks.Lock r3 = (java.util.concurrent.locks.Lock) r3
                r3.lock()
                r4 = 0
                java.lang.Object r5 = r10.peekUnderLock()     // Catch: java.lang.Throwable -> L4e
                boolean r6 = r5 instanceof kotlinx.coroutines.channels.Closed     // Catch: java.lang.Throwable -> L4e
                if (r6 == 0) goto L15
                goto L25
            L15:
                kotlinx.coroutines.internal.Symbol r6 = kotlinx.coroutines.channels.AbstractChannelKt.POLL_FAILED     // Catch: java.lang.Throwable -> L4e
                if (r5 != r6) goto L1a
                goto L25
            L1a:
                long r6 = r10.getSubHead()     // Catch: java.lang.Throwable -> L4e
                r8 = 1
                long r8 = r8 + r6
                r10.setSubHead(r8)     // Catch: java.lang.Throwable -> L4e
                r0 = 1
            L25:
                r3.unlock()
                r1 = r5
                boolean r2 = r1 instanceof kotlinx.coroutines.channels.Closed
                r3 = 0
                if (r2 == 0) goto L34
                r2 = r1
                kotlinx.coroutines.channels.Closed r2 = (kotlinx.coroutines.channels.Closed) r2
                goto L35
            L34:
                r2 = r3
            L35:
                if (r2 != 0) goto L38
                goto L3e
            L38:
                r4 = 0
                java.lang.Throwable r5 = r2.closeCause
                r10.close(r5)
            L3e:
                boolean r2 = r10.checkOffer()
                if (r2 == 0) goto L45
                r0 = 1
            L45:
                if (r0 == 0) goto L4d
                kotlinx.coroutines.channels.ArrayBroadcastChannel<E> r2 = r10.broadcastChannel
                r4 = 3
                kotlinx.coroutines.channels.ArrayBroadcastChannel.updateHead$default(r2, r3, r3, r4, r3)
            L4d:
                return r1
            L4e:
                r4 = move-exception
                r3.unlock()
                throw r4
        }

        @Override // kotlinx.coroutines.channels.AbstractChannel
        protected java.lang.Object pollSelectInternal(kotlinx.coroutines.selects.SelectInstance<?> r11) {
                r10 = this;
                r0 = 0
                java.util.concurrent.locks.ReentrantLock r1 = r10.subLock
                r2 = 0
                r3 = r1
                java.util.concurrent.locks.Lock r3 = (java.util.concurrent.locks.Lock) r3
                r3.lock()
                r4 = 0
                java.lang.Object r5 = r10.peekUnderLock()     // Catch: java.lang.Throwable -> L5a
                boolean r6 = r5 instanceof kotlinx.coroutines.channels.Closed     // Catch: java.lang.Throwable -> L5a
                if (r6 == 0) goto L15
                goto L31
            L15:
                kotlinx.coroutines.internal.Symbol r6 = kotlinx.coroutines.channels.AbstractChannelKt.POLL_FAILED     // Catch: java.lang.Throwable -> L5a
                if (r5 != r6) goto L1a
                goto L31
            L1a:
                boolean r6 = r11.trySelect()     // Catch: java.lang.Throwable -> L5a
                if (r6 != 0) goto L26
                java.lang.Object r6 = kotlinx.coroutines.selects.SelectKt.getALREADY_SELECTED()     // Catch: java.lang.Throwable -> L5a
                r5 = r6
                goto L31
            L26:
                long r6 = r10.getSubHead()     // Catch: java.lang.Throwable -> L5a
                r8 = 1
                long r8 = r8 + r6
                r10.setSubHead(r8)     // Catch: java.lang.Throwable -> L5a
                r0 = 1
            L31:
                r3.unlock()
                r1 = r5
                boolean r2 = r1 instanceof kotlinx.coroutines.channels.Closed
                r3 = 0
                if (r2 == 0) goto L40
                r2 = r1
                kotlinx.coroutines.channels.Closed r2 = (kotlinx.coroutines.channels.Closed) r2
                goto L41
            L40:
                r2 = r3
            L41:
                if (r2 != 0) goto L44
                goto L4a
            L44:
                r4 = 0
                java.lang.Throwable r5 = r2.closeCause
                r10.close(r5)
            L4a:
                boolean r2 = r10.checkOffer()
                if (r2 == 0) goto L51
                r0 = 1
            L51:
                if (r0 == 0) goto L59
                kotlinx.coroutines.channels.ArrayBroadcastChannel<E> r2 = r10.broadcastChannel
                r4 = 3
                kotlinx.coroutines.channels.ArrayBroadcastChannel.updateHead$default(r2, r3, r3, r4, r3)
            L59:
                return r1
            L5a:
                r4 = move-exception
                r3.unlock()
                throw r4
        }

        public final void setSubHead(long r1) {
                r0 = this;
                r0._subHead = r1
                return
        }
    }

    public ArrayBroadcastChannel(int r5) {
            r4 = this;
            r0 = 0
            r4.<init>(r0)
            r4.capacity = r5
            int r0 = r4.capacity
            r1 = 0
            r2 = 1
            if (r0 < r2) goto Le
            goto Lf
        Le:
            r2 = r1
        Lf:
            if (r2 == 0) goto L2e
        L12:
            java.util.concurrent.locks.ReentrantLock r0 = new java.util.concurrent.locks.ReentrantLock
            r0.<init>()
            r4.bufferLock = r0
            int r0 = r4.capacity
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r4.buffer = r0
            r2 = 0
            r4._head = r2
            r4._tail = r2
            r4._size = r1
            java.util.List r0 = kotlinx.coroutines.internal.ConcurrentKt.subscriberList()
            r4.subscribers = r0
            return
        L2e:
            r0 = 0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "ArrayBroadcastChannel capacity must be at least 1, but "
            java.lang.StringBuilder r1 = r1.append(r2)
            int r2 = r4.getCapacity()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " was specified"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r0 = r1.toString()
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
    }

    public static final /* synthetic */ java.lang.Object access$elementAt(kotlinx.coroutines.channels.ArrayBroadcastChannel r1, long r2) {
            java.lang.Object r0 = r1.elementAt(r2)
            return r0
    }

    public static final /* synthetic */ long access$getTail(kotlinx.coroutines.channels.ArrayBroadcastChannel r2) {
            long r0 = r2.getTail()
            return r0
    }

    private final boolean cancelInternal(java.lang.Throwable r6) {
            r5 = this;
            boolean r0 = r5.close(r6)
            r1 = r0
            r2 = 0
            java.util.List<kotlinx.coroutines.channels.ArrayBroadcastChannel$Subscriber<E>> r3 = r5.subscribers
            java.util.Iterator r3 = r3.iterator()
        Lc:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L1c
            java.lang.Object r4 = r3.next()
            kotlinx.coroutines.channels.ArrayBroadcastChannel$Subscriber r4 = (kotlinx.coroutines.channels.ArrayBroadcastChannel.Subscriber) r4
            r4.cancelInternal$kotlinx_coroutines_core(r6)
            goto Lc
        L1c:
            return r0
    }

    private final void checkSubOffers() {
            r5 = this;
            r0 = 0
            r1 = 0
            java.util.List<kotlinx.coroutines.channels.ArrayBroadcastChannel$Subscriber<E>> r2 = r5.subscribers
            java.util.Iterator r2 = r2.iterator()
        L8:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L1d
            java.lang.Object r3 = r2.next()
            kotlinx.coroutines.channels.ArrayBroadcastChannel$Subscriber r3 = (kotlinx.coroutines.channels.ArrayBroadcastChannel.Subscriber) r3
            r1 = 1
            boolean r4 = r3.checkOffer()
            if (r4 == 0) goto L8
            r0 = 1
            goto L8
        L1d:
            if (r0 != 0) goto L21
            if (r1 != 0) goto L26
        L21:
            r2 = 3
            r3 = 0
            updateHead$default(r5, r3, r3, r2, r3)
        L26:
            return
    }

    private final long computeMinHead() {
            r6 = this;
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            java.util.List<kotlinx.coroutines.channels.ArrayBroadcastChannel$Subscriber<E>> r2 = r6.subscribers
            java.util.Iterator r2 = r2.iterator()
        Lb:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L20
            java.lang.Object r3 = r2.next()
            kotlinx.coroutines.channels.ArrayBroadcastChannel$Subscriber r3 = (kotlinx.coroutines.channels.ArrayBroadcastChannel.Subscriber) r3
            long r4 = r3.getSubHead()
            long r0 = kotlin.ranges.RangesKt.coerceAtMost(r0, r4)
            goto Lb
        L20:
            return r0
    }

    private final E elementAt(long r4) {
            r3 = this;
            java.lang.Object[] r0 = r3.buffer
            int r1 = r3.capacity
            long r1 = (long) r1
            long r1 = r4 % r1
            int r1 = (int) r1
            r0 = r0[r1]
            return r0
    }

    private final long getHead() {
            r2 = this;
            long r0 = r2._head
            return r0
    }

    private final int getSize() {
            r1 = this;
            int r0 = r1._size
            return r0
    }

    private static /* synthetic */ void getSubscribers$annotations() {
            return
    }

    private final long getTail() {
            r2 = this;
            long r0 = r2._tail
            return r0
    }

    private final void setHead(long r1) {
            r0 = this;
            r0._head = r1
            return
    }

    private final void setSize(int r1) {
            r0 = this;
            r0._size = r1
            return
    }

    private final void setTail(long r1) {
            r0 = this;
            r0._tail = r1
            return
    }

    private final void updateHead(kotlinx.coroutines.channels.ArrayBroadcastChannel.Subscriber<E> r26, kotlinx.coroutines.channels.ArrayBroadcastChannel.Subscriber<E> r27) {
            r25 = this;
            r1 = r25
            r0 = r26
            r2 = r27
        L6:
            r3 = 0
            java.util.concurrent.locks.ReentrantLock r4 = r1.bufferLock
            r5 = 0
            r6 = r4
            java.util.concurrent.locks.Lock r6 = (java.util.concurrent.locks.Lock) r6
            r6.lock()
            r7 = 0
            if (r0 == 0) goto L32
            long r8 = r25.getTail()     // Catch: java.lang.Throwable -> L2b
            r0.setSubHead(r8)     // Catch: java.lang.Throwable -> L2b
            java.util.List<kotlinx.coroutines.channels.ArrayBroadcastChannel$Subscriber<E>> r8 = r1.subscribers     // Catch: java.lang.Throwable -> L2b
            boolean r8 = r8.isEmpty()     // Catch: java.lang.Throwable -> L2b
            java.util.List<kotlinx.coroutines.channels.ArrayBroadcastChannel$Subscriber<E>> r9 = r1.subscribers     // Catch: java.lang.Throwable -> L2b
            r9.add(r0)     // Catch: java.lang.Throwable -> L2b
            if (r8 != 0) goto L32
            r6.unlock()
            return
        L2b:
            r0 = move-exception
            r17 = r4
            r24 = r5
            goto L145
        L32:
            if (r2 == 0) goto L49
            java.util.List<kotlinx.coroutines.channels.ArrayBroadcastChannel$Subscriber<E>> r0 = r1.subscribers     // Catch: java.lang.Throwable -> L2b
            r0.remove(r2)     // Catch: java.lang.Throwable -> L2b
            long r8 = r25.getHead()     // Catch: java.lang.Throwable -> L2b
            long r10 = r2.getSubHead()     // Catch: java.lang.Throwable -> L2b
            int r0 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r0 == 0) goto L49
            r6.unlock()
            return
        L49:
            long r8 = r25.computeMinHead()     // Catch: java.lang.Throwable -> L140
            long r10 = r25.getTail()     // Catch: java.lang.Throwable -> L140
            long r12 = r25.getHead()     // Catch: java.lang.Throwable -> L140
            long r14 = kotlin.ranges.RangesKt.coerceAtMost(r8, r10)     // Catch: java.lang.Throwable -> L140
            int r0 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r0 > 0) goto L61
            r6.unlock()
            return
        L61:
            int r0 = r25.getSize()     // Catch: java.lang.Throwable -> L140
        L65:
            int r2 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r2 >= 0) goto L13b
            java.lang.Object[] r2 = r1.buffer     // Catch: java.lang.Throwable -> L133
            r16 = r3
            int r3 = r25.getCapacity()     // Catch: java.lang.Throwable -> L12b
            r17 = r4
            long r3 = (long) r3
            long r3 = r12 % r3
            int r3 = (int) r3     // Catch: java.lang.Throwable -> L125
            r4 = 0
            r2[r3] = r4     // Catch: java.lang.Throwable -> L125
            int r2 = r25.getCapacity()     // Catch: java.lang.Throwable -> L125
            r18 = 1
            if (r0 < r2) goto L85
            r2 = r18
            goto L86
        L85:
            r2 = 0
        L86:
            r19 = 1
            long r12 = r12 + r19
            r1.setHead(r12)     // Catch: java.lang.Throwable -> L125
            int r0 = r0 + (-1)
            r1.setSize(r0)     // Catch: java.lang.Throwable -> L125
            if (r2 == 0) goto L11b
        L94:
        L95:
            kotlinx.coroutines.channels.Send r21 = r25.takeFirstSendOrPeekClosed()     // Catch: java.lang.Throwable -> L125
            if (r21 != 0) goto La0
            r3 = r16
            r4 = r17
            goto L65
        La0:
            r16 = r21
            r3 = r16
            boolean r4 = r3 instanceof kotlinx.coroutines.channels.Closed     // Catch: java.lang.Throwable -> L117
            if (r4 == 0) goto Lab
            r4 = r17
            goto L65
        Lab:
            r4 = 0
            kotlinx.coroutines.internal.Symbol r16 = r3.tryResumeSend(r4)     // Catch: java.lang.Throwable -> L117
            r22 = r16
            r4 = r22
            if (r4 == 0) goto L10c
            boolean r22 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()     // Catch: java.lang.Throwable -> L117
            if (r22 == 0) goto Ld5
            r22 = 0
            r23 = r2
            kotlinx.coroutines.internal.Symbol r2 = kotlinx.coroutines.CancellableContinuationImplKt.RESUME_TOKEN     // Catch: java.lang.Throwable -> Ld0
            if (r4 != r2) goto Lc5
            goto Lc7
        Lc5:
            r18 = 0
        Lc7:
            if (r18 == 0) goto Lca
            goto Ld7
        Lca:
            java.lang.AssertionError r2 = new java.lang.AssertionError     // Catch: java.lang.Throwable -> Ld0
            r2.<init>()     // Catch: java.lang.Throwable -> Ld0
            throw r2     // Catch: java.lang.Throwable -> Ld0
        Ld0:
            r0 = move-exception
            r24 = r5
            goto L145
        Ld5:
            r23 = r2
        Ld7:
            java.lang.Object[] r2 = r1.buffer     // Catch: java.lang.Throwable -> L117
            r22 = r4
            int r4 = r25.getCapacity()     // Catch: java.lang.Throwable -> L117
            r24 = r5
            long r4 = (long) r4
            long r4 = r10 % r4
            int r4 = (int) r4     // Catch: java.lang.Throwable -> L10a
            java.lang.Object r5 = r3.getPollResult()     // Catch: java.lang.Throwable -> L10a
            r2[r4] = r5     // Catch: java.lang.Throwable -> L10a
            int r2 = r0 + 1
            r1.setSize(r2)     // Catch: java.lang.Throwable -> L10a
            long r4 = r10 + r19
            r1.setTail(r4)     // Catch: java.lang.Throwable -> L10a
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L10a
            r6.unlock()
            r3.completeResumeSend()
            r25.checkSubOffers()
            r0 = 0
            r2 = 0
            goto L6
        L10a:
            r0 = move-exception
            goto L145
        L10c:
            r23 = r2
            r22 = r4
            r24 = r5
            r16 = r3
            r4 = 0
            goto L94
        L117:
            r0 = move-exception
            r24 = r5
            goto L145
        L11b:
            r23 = r2
            r24 = r5
            r3 = r16
            r4 = r17
            goto L65
        L125:
            r0 = move-exception
            r24 = r5
            r3 = r16
            goto L145
        L12b:
            r0 = move-exception
            r17 = r4
            r24 = r5
            r3 = r16
            goto L145
        L133:
            r0 = move-exception
            r16 = r3
            r17 = r4
            r24 = r5
            goto L145
        L13b:
            r6.unlock()
            return
        L140:
            r0 = move-exception
            r17 = r4
            r24 = r5
        L145:
            r6.unlock()
            throw r0
    }

    static /* synthetic */ void updateHead$default(kotlinx.coroutines.channels.ArrayBroadcastChannel r1, kotlinx.coroutines.channels.ArrayBroadcastChannel.Subscriber r2, kotlinx.coroutines.channels.ArrayBroadcastChannel.Subscriber r3, int r4, java.lang.Object r5) {
            r5 = r4 & 1
            r0 = 0
            if (r5 == 0) goto L6
            r2 = r0
        L6:
            r4 = r4 & 2
            if (r4 == 0) goto Lb
            r3 = r0
        Lb:
            r1.updateHead(r2, r3)
            return
    }

    @Override // kotlinx.coroutines.channels.BroadcastChannel
    public void cancel(java.util.concurrent.CancellationException r2) {
            r1 = this;
            r0 = r2
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            r1.cancelInternal(r0)
            return
    }

    @Override // kotlinx.coroutines.channels.BroadcastChannel
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public /* synthetic */ boolean cancel(java.lang.Throwable r2) {
            r1 = this;
            boolean r0 = r1.cancelInternal(r2)
            return r0
    }

    @Override // kotlinx.coroutines.channels.AbstractSendChannel, kotlinx.coroutines.channels.SendChannel
    public boolean close(java.lang.Throwable r2) {
            r1 = this;
            boolean r0 = super.close(r2)
            if (r0 != 0) goto L8
            r0 = 0
            return r0
        L8:
            r1.checkSubOffers()
            r0 = 1
            return r0
    }

    @Override // kotlinx.coroutines.channels.AbstractSendChannel
    protected java.lang.String getBufferDebugString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "(buffer:capacity="
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.Object[] r1 = r2.buffer
            int r1 = r1.length
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ",size="
            java.lang.StringBuilder r0 = r0.append(r1)
            int r1 = r2.getSize()
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = 41
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public final int getCapacity() {
            r1 = this;
            int r0 = r1.capacity
            return r0
    }

    @Override // kotlinx.coroutines.channels.AbstractSendChannel
    protected boolean isBufferAlwaysFull() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // kotlinx.coroutines.channels.AbstractSendChannel
    protected boolean isBufferFull() {
            r2 = this;
            int r0 = r2.getSize()
            int r1 = r2.capacity
            if (r0 < r1) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            return r0
    }

    @Override // kotlinx.coroutines.channels.AbstractSendChannel
    protected java.lang.Object offerInternal(E r11) {
            r10 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r10.bufferLock
            r1 = 0
            r2 = r0
            java.util.concurrent.locks.Lock r2 = (java.util.concurrent.locks.Lock) r2
            r2.lock()
            r3 = 0
            kotlinx.coroutines.channels.Closed r4 = r10.getClosedForSend()     // Catch: java.lang.Throwable -> L4e
            if (r4 != 0) goto L48
            int r4 = r10.getSize()     // Catch: java.lang.Throwable -> L4e
            int r5 = r10.getCapacity()     // Catch: java.lang.Throwable -> L4e
            if (r4 < r5) goto L20
            kotlinx.coroutines.internal.Symbol r5 = kotlinx.coroutines.channels.AbstractChannelKt.OFFER_FAILED     // Catch: java.lang.Throwable -> L4e
            r2.unlock()
            return r5
        L20:
            long r5 = r10.getTail()     // Catch: java.lang.Throwable -> L4e
            java.lang.Object[] r7 = r10.buffer     // Catch: java.lang.Throwable -> L4e
            int r8 = r10.getCapacity()     // Catch: java.lang.Throwable -> L4e
            long r8 = (long) r8     // Catch: java.lang.Throwable -> L4e
            long r8 = r5 % r8
            int r8 = (int) r8     // Catch: java.lang.Throwable -> L4e
            r7[r8] = r11     // Catch: java.lang.Throwable -> L4e
            int r7 = r4 + 1
            r10.setSize(r7)     // Catch: java.lang.Throwable -> L4e
            r7 = 1
            long r7 = r7 + r5
            r10.setTail(r7)     // Catch: java.lang.Throwable -> L4e
            kotlin.Unit r3 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L4e
            r2.unlock()
            r10.checkSubOffers()
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.channels.AbstractChannelKt.OFFER_SUCCESS
            return r0
        L48:
            r5 = 0
            r2.unlock()
            return r4
        L4e:
            r3 = move-exception
            r2.unlock()
            throw r3
    }

    @Override // kotlinx.coroutines.channels.AbstractSendChannel
    protected java.lang.Object offerSelectInternal(E r11, kotlinx.coroutines.selects.SelectInstance<?> r12) {
            r10 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r10.bufferLock
            r1 = 0
            r2 = r0
            java.util.concurrent.locks.Lock r2 = (java.util.concurrent.locks.Lock) r2
            r2.lock()
            r3 = 0
            kotlinx.coroutines.channels.Closed r4 = r10.getClosedForSend()     // Catch: java.lang.Throwable -> L5c
            if (r4 != 0) goto L56
            int r4 = r10.getSize()     // Catch: java.lang.Throwable -> L5c
            int r5 = r10.getCapacity()     // Catch: java.lang.Throwable -> L5c
            if (r4 < r5) goto L20
            kotlinx.coroutines.internal.Symbol r5 = kotlinx.coroutines.channels.AbstractChannelKt.OFFER_FAILED     // Catch: java.lang.Throwable -> L5c
            r2.unlock()
            return r5
        L20:
            boolean r5 = r12.trySelect()     // Catch: java.lang.Throwable -> L5c
            if (r5 != 0) goto L2e
            java.lang.Object r5 = kotlinx.coroutines.selects.SelectKt.getALREADY_SELECTED()     // Catch: java.lang.Throwable -> L5c
            r2.unlock()
            return r5
        L2e:
            long r5 = r10.getTail()     // Catch: java.lang.Throwable -> L5c
            java.lang.Object[] r7 = r10.buffer     // Catch: java.lang.Throwable -> L5c
            int r8 = r10.getCapacity()     // Catch: java.lang.Throwable -> L5c
            long r8 = (long) r8     // Catch: java.lang.Throwable -> L5c
            long r8 = r5 % r8
            int r8 = (int) r8     // Catch: java.lang.Throwable -> L5c
            r7[r8] = r11     // Catch: java.lang.Throwable -> L5c
            int r7 = r4 + 1
            r10.setSize(r7)     // Catch: java.lang.Throwable -> L5c
            r7 = 1
            long r7 = r7 + r5
            r10.setTail(r7)     // Catch: java.lang.Throwable -> L5c
            kotlin.Unit r3 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L5c
            r2.unlock()
            r10.checkSubOffers()
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.channels.AbstractChannelKt.OFFER_SUCCESS
            return r0
        L56:
            r5 = 0
            r2.unlock()
            return r4
        L5c:
            r3 = move-exception
            r2.unlock()
            throw r3
    }

    @Override // kotlinx.coroutines.channels.BroadcastChannel
    public kotlinx.coroutines.channels.ReceiveChannel<E> openSubscription() {
            r5 = this;
            kotlinx.coroutines.channels.ArrayBroadcastChannel$Subscriber r0 = new kotlinx.coroutines.channels.ArrayBroadcastChannel$Subscriber
            r0.<init>(r5)
            r1 = r0
            r2 = 0
            r3 = 0
            r4 = 2
            updateHead$default(r5, r1, r3, r4, r3)
            kotlinx.coroutines.channels.ReceiveChannel r0 = (kotlinx.coroutines.channels.ReceiveChannel) r0
            return r0
    }
}
