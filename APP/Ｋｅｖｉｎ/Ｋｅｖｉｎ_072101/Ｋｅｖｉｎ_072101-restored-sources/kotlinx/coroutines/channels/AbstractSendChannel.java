package kotlinx.coroutines.channels;

/* JADX INFO: compiled from: AbstractChannel.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\b \u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u000006:\u0004defgB)\u0012 \u0010\u0005\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0013\u001a\u000e\u0012\u0002\b\u00030\u0011j\u0006\u0012\u0002\b\u0003`\u00122\u0006\u0010\u0010\u001a\u00028\u0000H\u0004¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u00152\u0006\u0010\u0010\u001a\u00028\u0000H\u0004¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ\u001b\u0010\u001f\u001a\u00020\u00032\n\u0010\u001e\u001a\u0006\u0012\u0002\b\u00030\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J#\u0010!\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00028\u00002\n\u0010\u001e\u001a\u0006\u0012\u0002\b\u00030\u001dH\u0002¢\u0006\u0004\b!\u0010\"J\u001b\u0010!\u001a\u00020\b2\n\u0010\u001e\u001a\u0006\u0012\u0002\b\u00030\u001dH\u0002¢\u0006\u0004\b!\u0010#J)\u0010&\u001a\u00020\u00032\u0018\u0010%\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\u00030\u0002j\u0002`$H\u0016¢\u0006\u0004\b&\u0010\u0007J\u0019\u0010'\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b'\u0010(J\u0017\u0010)\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00028\u0000H\u0016¢\u0006\u0004\b)\u0010*J\u0017\u0010+\u001a\u00020\u001a2\u0006\u0010\u0010\u001a\u00028\u0000H\u0014¢\u0006\u0004\b+\u0010,J#\u0010/\u001a\u00020\u001a2\u0006\u0010\u0010\u001a\u00028\u00002\n\u0010.\u001a\u0006\u0012\u0002\b\u00030-H\u0014¢\u0006\u0004\b/\u00100J\u0017\u00102\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u000201H\u0014¢\u0006\u0004\b2\u00103JX\u00109\u001a\u00020\u0003\"\u0004\b\u0001\u001042\f\u0010.\u001a\b\u0012\u0004\u0012\u00028\u00010-2\u0006\u0010\u0010\u001a\u00028\u00002(\u00108\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u000006\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u000107\u0012\u0006\u0012\u0004\u0018\u00010\u001a05H\u0002ø\u0001\u0000¢\u0006\u0004\b9\u0010:J\u001b\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00028\u0000H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010;J\u001d\u0010=\u001a\b\u0012\u0002\b\u0003\u0018\u00010<2\u0006\u0010\u0010\u001a\u00028\u0000H\u0004¢\u0006\u0004\b=\u0010>J\u001b\u0010?\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00028\u0000H\u0082@ø\u0001\u0000¢\u0006\u0004\b?\u0010;J\u0017\u0010@\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010<H\u0014¢\u0006\u0004\b@\u0010AJ\u0011\u0010B\u001a\u0004\u0018\u00010\u0018H\u0004¢\u0006\u0004\bB\u0010CJ\u000f\u0010E\u001a\u00020DH\u0016¢\u0006\u0004\bE\u0010FJ$\u0010I\u001a\b\u0012\u0004\u0012\u00020\u00030G2\u0006\u0010\u0010\u001a\u00028\u0000ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\bH\u0010,J+\u0010J\u001a\u00020\u0003*\u0006\u0012\u0002\b\u0003072\u0006\u0010\u0010\u001a\u00028\u00002\n\u0010\u001e\u001a\u0006\u0012\u0002\b\u00030\u001dH\u0002¢\u0006\u0004\bJ\u0010KR\u0014\u0010M\u001a\u00020D8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\bL\u0010FR\u001a\u0010P\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001d8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\bN\u0010OR\u001a\u0010R\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001d8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\bQ\u0010OR\u0014\u0010S\u001a\u00020\n8$X¤\u0004¢\u0006\u0006\u001a\u0004\bS\u0010TR\u0014\u0010U\u001a\u00020\n8$X¤\u0004¢\u0006\u0006\u001a\u0004\bU\u0010TR\u0011\u0010V\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\bV\u0010TR\u0014\u0010W\u001a\u00020\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bW\u0010TR#\u0010[\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u0000060X8F¢\u0006\u0006\u001a\u0004\bY\u0010ZR.\u0010\u0005\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u00048\u0004X\u0085\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\\R\u001a\u0010^\u001a\u00020]8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b^\u0010_\u001a\u0004\b`\u0010aR\u0014\u0010c\u001a\u00020D8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bb\u0010F\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006h"}, m115d2 = {"Lkotlinx/coroutines/channels/AbstractSendChannel;", "E", "Lkotlin/Function1;", "", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "onUndeliveredElement", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "", "cause", "", "close", "(Ljava/lang/Throwable;)Z", "", "countQueueSize", "()I", "element", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$AddLastDesc;", "Lkotlinx/coroutines/internal/AddLastDesc;", "describeSendBuffered", "(Ljava/lang/Object;)Lkotlinx/coroutines/internal/LockFreeLinkedListNode$AddLastDesc;", "Lkotlinx/coroutines/channels/AbstractSendChannel$TryOfferDesc;", "describeTryOffer", "(Ljava/lang/Object;)Lkotlinx/coroutines/channels/AbstractSendChannel$TryOfferDesc;", "Lkotlinx/coroutines/channels/Send;", "send", "", "enqueueSend", "(Lkotlinx/coroutines/channels/Send;)Ljava/lang/Object;", "Lkotlinx/coroutines/channels/Closed;", "closed", "helpClose", "(Lkotlinx/coroutines/channels/Closed;)V", "helpCloseAndGetSendException", "(Ljava/lang/Object;Lkotlinx/coroutines/channels/Closed;)Ljava/lang/Throwable;", "(Lkotlinx/coroutines/channels/Closed;)Ljava/lang/Throwable;", "Lkotlinx/coroutines/channels/Handler;", "handler", "invokeOnClose", "invokeOnCloseHandler", "(Ljava/lang/Throwable;)V", "offer", "(Ljava/lang/Object;)Z", "offerInternal", "(Ljava/lang/Object;)Ljava/lang/Object;", "Lkotlinx/coroutines/selects/SelectInstance;", "select", "offerSelectInternal", "(Ljava/lang/Object;Lkotlinx/coroutines/selects/SelectInstance;)Ljava/lang/Object;", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "onClosedIdempotent", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;)V", "R", "Lkotlin/Function2;", "Lkotlinx/coroutines/channels/SendChannel;", "Lkotlin/coroutines/Continuation;", "block", "registerSelectSend", "(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/channels/ReceiveOrClosed;", "sendBuffered", "(Ljava/lang/Object;)Lkotlinx/coroutines/channels/ReceiveOrClosed;", "sendSuspend", "takeFirstReceiveOrPeekClosed", "()Lkotlinx/coroutines/channels/ReceiveOrClosed;", "takeFirstSendOrPeekClosed", "()Lkotlinx/coroutines/channels/Send;", "", "toString", "()Ljava/lang/String;", "Lkotlinx/coroutines/channels/ChannelResult;", "trySend-JP2dKIU", "trySend", "helpCloseAndResumeWithSendException", "(Lkotlin/coroutines/Continuation;Ljava/lang/Object;Lkotlinx/coroutines/channels/Closed;)V", "getBufferDebugString", "bufferDebugString", "getClosedForReceive", "()Lkotlinx/coroutines/channels/Closed;", "closedForReceive", "getClosedForSend", "closedForSend", "isBufferAlwaysFull", "()Z", "isBufferFull", "isClosedForSend", "isFullImpl", "Lkotlinx/coroutines/selects/SelectClause2;", "getOnSend", "()Lkotlinx/coroutines/selects/SelectClause2;", "onSend", "Lkotlin/jvm/functions/Function1;", "Lkotlinx/coroutines/internal/LockFreeLinkedListHead;", "queue", "Lkotlinx/coroutines/internal/LockFreeLinkedListHead;", "getQueue", "()Lkotlinx/coroutines/internal/LockFreeLinkedListHead;", "getQueueDebugStateString", "queueDebugStateString", "SendBuffered", "SendBufferedDesc", "SendSelect", "TryOfferDesc", "kotlinx-coroutines-core"}, m116k = 1, m117mv = {1, 6, 0}, m119xi = 48)
public abstract class AbstractSendChannel<E> implements kotlinx.coroutines.channels.SendChannel<E> {
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater onCloseHandler$FU = null;
    private volatile /* synthetic */ java.lang.Object onCloseHandler;
    protected final kotlin.jvm.functions.Function1<E, kotlin.Unit> onUndeliveredElement;
    private final kotlinx.coroutines.internal.LockFreeLinkedListHead queue;

    /* JADX INFO: compiled from: AbstractChannel.kt */
    @kotlin.Metadata(m114d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00028\u0001¢\u0006\u0002\u0010\u0004J\b\u0010\n\u001a\u00020\u000bH\u0016J\u0014\u0010\f\u001a\u00020\u000b2\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0014\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016R\u0012\u0010\u0003\u001a\u00028\u00018\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u0005R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u0015"}, m115d2 = {"Lkotlinx/coroutines/channels/AbstractSendChannel$SendBuffered;", "E", "Lkotlinx/coroutines/channels/Send;", "element", "(Ljava/lang/Object;)V", "Ljava/lang/Object;", "pollResult", "", "getPollResult", "()Ljava/lang/Object;", "completeResumeSend", "", "resumeSendClosed", "closed", "Lkotlinx/coroutines/channels/Closed;", "toString", "", "tryResumeSend", "Lkotlinx/coroutines/internal/Symbol;", "otherOp", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$PrepareOp;", "kotlinx-coroutines-core"}, m116k = 1, m117mv = {1, 6, 0}, m119xi = 48)
    public static final class SendBuffered<E> extends kotlinx.coroutines.channels.Send {
        public final E element;

        public SendBuffered(E r1) {
                r0 = this;
                r0.<init>()
                r0.element = r1
                return
        }

        @Override // kotlinx.coroutines.channels.Send
        public void completeResumeSend() {
                r0 = this;
                return
        }

        @Override // kotlinx.coroutines.channels.Send
        public java.lang.Object getPollResult() {
                r1 = this;
                E r0 = r1.element
                return r0
        }

        @Override // kotlinx.coroutines.channels.Send
        public void resumeSendClosed(kotlinx.coroutines.channels.Closed<?> r2) {
                r1 = this;
                boolean r0 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
                if (r0 != 0) goto L7
                return
            L7:
                r0 = 0
                java.lang.AssertionError r0 = new java.lang.AssertionError
                r0.<init>()
                throw r0
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode
        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "SendBuffered@"
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = kotlinx.coroutines.DebugStringsKt.getHexAddress(r2)
                java.lang.StringBuilder r0 = r0.append(r1)
                r1 = 40
                java.lang.StringBuilder r0 = r0.append(r1)
                E r1 = r2.element
                java.lang.StringBuilder r0 = r0.append(r1)
                r1 = 41
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }

        @Override // kotlinx.coroutines.channels.Send
        public kotlinx.coroutines.internal.Symbol tryResumeSend(kotlinx.coroutines.internal.LockFreeLinkedListNode.PrepareOp r4) {
                r3 = this;
                kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.CancellableContinuationImplKt.RESUME_TOKEN
                r1 = r0
                r2 = 0
                if (r4 != 0) goto L7
                goto La
            L7:
                r4.finishPrepare()
            La:
                return r0
        }
    }

    /* JADX INFO: compiled from: AbstractChannel.kt */
    @kotlin.Metadata(m114d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0012\u0018\u0000*\u0004\b\u0001\u0010\u00012\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u00030\u0002j\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u0003`\u0004B\u0015\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00028\u0001¢\u0006\u0002\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\fH\u0014¨\u0006\r"}, m115d2 = {"Lkotlinx/coroutines/channels/AbstractSendChannel$SendBufferedDesc;", "E", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$AddLastDesc;", "Lkotlinx/coroutines/channels/AbstractSendChannel$SendBuffered;", "Lkotlinx/coroutines/internal/AddLastDesc;", "queue", "Lkotlinx/coroutines/internal/LockFreeLinkedListHead;", "element", "(Lkotlinx/coroutines/internal/LockFreeLinkedListHead;Ljava/lang/Object;)V", "failure", "", "affected", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "kotlinx-coroutines-core"}, m116k = 1, m117mv = {1, 6, 0}, m119xi = 48)
    private static class SendBufferedDesc<E> extends kotlinx.coroutines.internal.LockFreeLinkedListNode.AddLastDesc<kotlinx.coroutines.channels.AbstractSendChannel.SendBuffered<? extends E>> {
        public SendBufferedDesc(kotlinx.coroutines.internal.LockFreeLinkedListHead r3, E r4) {
                r2 = this;
                r0 = r3
                kotlinx.coroutines.internal.LockFreeLinkedListNode r0 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r0
                kotlinx.coroutines.channels.AbstractSendChannel$SendBuffered r1 = new kotlinx.coroutines.channels.AbstractSendChannel$SendBuffered
                r1.<init>(r4)
                kotlinx.coroutines.internal.LockFreeLinkedListNode r1 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r1
                r2.<init>(r0, r1)
                return
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode.AbstractAtomicDesc
        protected java.lang.Object failure(kotlinx.coroutines.internal.LockFreeLinkedListNode r2) {
                r1 = this;
                boolean r0 = r2 instanceof kotlinx.coroutines.channels.Closed
                if (r0 == 0) goto L7
                r0 = r2
                goto Lf
            L7:
                boolean r0 = r2 instanceof kotlinx.coroutines.channels.ReceiveOrClosed
                if (r0 == 0) goto Le
                kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.channels.AbstractChannelKt.OFFER_FAILED
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }
    }

    /* JADX INFO: compiled from: AbstractChannel.kt */
    @kotlin.Metadata(m114d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u0001*\u0004\b\u0002\u0010\u00022\u00020\u00032\u00020\u0004BV\u0012\u0006\u0010\u0005\u001a\u00028\u0001\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00020\t\u0012(\u0010\n\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u000bø\u0001\u0000¢\u0006\u0002\u0010\u000fJ\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0015H\u0016J\u0014\u0010\u0017\u001a\u00020\u00152\n\u0010\u0018\u001a\u0006\u0012\u0002\b\u00030\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\u0014\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\b\u0010 \u001a\u00020\u0015H\u0016R7\u0010\n\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u000b8\u0006X\u0087\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0010R\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\u00028\u0001X\u0096\u0004¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00020\t8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006!"}, m115d2 = {"Lkotlinx/coroutines/channels/AbstractSendChannel$SendSelect;", "E", "R", "Lkotlinx/coroutines/channels/Send;", "Lkotlinx/coroutines/DisposableHandle;", "pollResult", "channel", "Lkotlinx/coroutines/channels/AbstractSendChannel;", "select", "Lkotlinx/coroutines/selects/SelectInstance;", "block", "Lkotlin/Function2;", "Lkotlinx/coroutines/channels/SendChannel;", "Lkotlin/coroutines/Continuation;", "", "(Ljava/lang/Object;Lkotlinx/coroutines/channels/AbstractSendChannel;Lkotlinx/coroutines/selects/SelectInstance;Lkotlin/jvm/functions/Function2;)V", "Lkotlin/jvm/functions/Function2;", "getPollResult", "()Ljava/lang/Object;", "Ljava/lang/Object;", "completeResumeSend", "", "dispose", "resumeSendClosed", "closed", "Lkotlinx/coroutines/channels/Closed;", "toString", "", "tryResumeSend", "Lkotlinx/coroutines/internal/Symbol;", "otherOp", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$PrepareOp;", "undeliveredElement", "kotlinx-coroutines-core"}, m116k = 1, m117mv = {1, 6, 0}, m119xi = 48)
    private static final class SendSelect<E, R> extends kotlinx.coroutines.channels.Send implements kotlinx.coroutines.DisposableHandle {
        public final kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.SendChannel<? super E>, kotlin.coroutines.Continuation<? super R>, java.lang.Object> block;
        public final kotlinx.coroutines.channels.AbstractSendChannel<E> channel;
        private final E pollResult;
        public final kotlinx.coroutines.selects.SelectInstance<R> select;

        public SendSelect(E r1, kotlinx.coroutines.channels.AbstractSendChannel<E> r2, kotlinx.coroutines.selects.SelectInstance<? super R> r3, kotlin.jvm.functions.Function2<? super kotlinx.coroutines.channels.SendChannel<? super E>, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> r4) {
                r0 = this;
                r0.<init>()
                r0.pollResult = r1
                r0.channel = r2
                r0.select = r3
                r0.block = r4
                return
        }

        @Override // kotlinx.coroutines.channels.Send
        public void completeResumeSend() {
                r6 = this;
                kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.SendChannel<? super E>, kotlin.coroutines.Continuation<? super R>, java.lang.Object> r0 = r6.block
                kotlinx.coroutines.channels.AbstractSendChannel<E> r1 = r6.channel
                kotlinx.coroutines.selects.SelectInstance<R> r2 = r6.select
                kotlin.coroutines.Continuation r2 = r2.getCompletion()
                r4 = 4
                r5 = 0
                r3 = 0
                kotlinx.coroutines.intrinsics.CancellableKt.startCoroutineCancellable$default(r0, r1, r2, r3, r4, r5)
                return
        }

        @Override // kotlinx.coroutines.DisposableHandle
        public void dispose() {
                r1 = this;
                boolean r0 = r1.mo10219remove()
                if (r0 != 0) goto L7
                return
            L7:
                r1.undeliveredElement()
                return
        }

        @Override // kotlinx.coroutines.channels.Send
        public E getPollResult() {
                r1 = this;
                E r0 = r1.pollResult
                return r0
        }

        @Override // kotlinx.coroutines.channels.Send
        public void resumeSendClosed(kotlinx.coroutines.channels.Closed<?> r3) {
                r2 = this;
                kotlinx.coroutines.selects.SelectInstance<R> r0 = r2.select
                boolean r0 = r0.trySelect()
                if (r0 == 0) goto L11
                kotlinx.coroutines.selects.SelectInstance<R> r0 = r2.select
                java.lang.Throwable r1 = r3.getSendException()
                r0.resumeSelectWithException(r1)
            L11:
                return
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode
        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "SendSelect@"
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = kotlinx.coroutines.DebugStringsKt.getHexAddress(r2)
                java.lang.StringBuilder r0 = r0.append(r1)
                r1 = 40
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.Object r1 = r2.getPollResult()
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = ")["
                java.lang.StringBuilder r0 = r0.append(r1)
                kotlinx.coroutines.channels.AbstractSendChannel<E> r1 = r2.channel
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = ", "
                java.lang.StringBuilder r0 = r0.append(r1)
                kotlinx.coroutines.selects.SelectInstance<R> r1 = r2.select
                java.lang.StringBuilder r0 = r0.append(r1)
                r1 = 93
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }

        @Override // kotlinx.coroutines.channels.Send
        public kotlinx.coroutines.internal.Symbol tryResumeSend(kotlinx.coroutines.internal.LockFreeLinkedListNode.PrepareOp r2) {
                r1 = this;
                kotlinx.coroutines.selects.SelectInstance<R> r0 = r1.select
                java.lang.Object r0 = r0.trySelectOther(r2)
                kotlinx.coroutines.internal.Symbol r0 = (kotlinx.coroutines.internal.Symbol) r0
                return r0
        }

        @Override // kotlinx.coroutines.channels.Send
        public void undeliveredElement() {
                r3 = this;
                kotlinx.coroutines.channels.AbstractSendChannel<E> r0 = r3.channel
                kotlin.jvm.functions.Function1<E, kotlin.Unit> r0 = r0.onUndeliveredElement
                if (r0 != 0) goto L7
                goto L18
            L7:
                java.lang.Object r1 = r3.getPollResult()
                kotlinx.coroutines.selects.SelectInstance<R> r2 = r3.select
                kotlin.coroutines.Continuation r2 = r2.getCompletion()
                kotlin.coroutines.CoroutineContext r2 = r2.getContext()
                kotlinx.coroutines.internal.OnUndeliveredElementKt.callUndeliveredElement(r0, r1, r2)
            L18:
                return
        }
    }

    /* JADX INFO: compiled from: AbstractChannel.kt */
    @kotlin.Metadata(m114d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0004\u0018\u0000*\u0004\b\u0001\u0010\u00012\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u00030\u0002j\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u0003`\u0004B\u0015\u0012\u0006\u0010\u0005\u001a\u00028\u0001\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\rH\u0014J\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\n\u0010\u000f\u001a\u00060\u0010j\u0002`\u0011H\u0016R\u0012\u0010\u0005\u001a\u00028\u00018\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\t¨\u0006\u0012"}, m115d2 = {"Lkotlinx/coroutines/channels/AbstractSendChannel$TryOfferDesc;", "E", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$RemoveFirstDesc;", "Lkotlinx/coroutines/channels/ReceiveOrClosed;", "Lkotlinx/coroutines/internal/RemoveFirstDesc;", "element", "queue", "Lkotlinx/coroutines/internal/LockFreeLinkedListHead;", "(Ljava/lang/Object;Lkotlinx/coroutines/internal/LockFreeLinkedListHead;)V", "Ljava/lang/Object;", "failure", "", "affected", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "onPrepare", "prepareOp", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$PrepareOp;", "Lkotlinx/coroutines/internal/PrepareOp;", "kotlinx-coroutines-core"}, m116k = 1, m117mv = {1, 6, 0}, m119xi = 48)
    protected static final class TryOfferDesc<E> extends kotlinx.coroutines.internal.LockFreeLinkedListNode.RemoveFirstDesc<kotlinx.coroutines.channels.ReceiveOrClosed<? super E>> {
        public final E element;

        public TryOfferDesc(E r2, kotlinx.coroutines.internal.LockFreeLinkedListHead r3) {
                r1 = this;
                r0 = r3
                kotlinx.coroutines.internal.LockFreeLinkedListNode r0 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r0
                r1.<init>(r0)
                r1.element = r2
                return
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode.RemoveFirstDesc, kotlinx.coroutines.internal.LockFreeLinkedListNode.AbstractAtomicDesc
        protected java.lang.Object failure(kotlinx.coroutines.internal.LockFreeLinkedListNode r2) {
                r1 = this;
                boolean r0 = r2 instanceof kotlinx.coroutines.channels.Closed
                if (r0 == 0) goto L7
                r0 = r2
                goto Lf
            L7:
                boolean r0 = r2 instanceof kotlinx.coroutines.channels.ReceiveOrClosed
                if (r0 != 0) goto Le
                kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.channels.AbstractChannelKt.OFFER_FAILED
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode.AbstractAtomicDesc
        public java.lang.Object onPrepare(kotlinx.coroutines.internal.LockFreeLinkedListNode.PrepareOp r5) {
                r4 = this;
                kotlinx.coroutines.internal.LockFreeLinkedListNode r0 = r5.affected
                kotlinx.coroutines.channels.ReceiveOrClosed r0 = (kotlinx.coroutines.channels.ReceiveOrClosed) r0
                E r1 = r4.element
                kotlinx.coroutines.internal.Symbol r1 = r0.tryResumeReceive(r1, r5)
                if (r1 != 0) goto Lf
                java.lang.Object r1 = kotlinx.coroutines.internal.LockFreeLinkedList_commonKt.REMOVE_PREPARED
                return r1
            Lf:
                java.lang.Object r2 = kotlinx.coroutines.internal.AtomicKt.RETRY_ATOMIC
                if (r1 != r2) goto L16
                java.lang.Object r2 = kotlinx.coroutines.internal.AtomicKt.RETRY_ATOMIC
                return r2
            L16:
                boolean r2 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
                if (r2 == 0) goto L2d
                r2 = 0
                kotlinx.coroutines.internal.Symbol r3 = kotlinx.coroutines.CancellableContinuationImplKt.RESUME_TOKEN
                if (r1 != r3) goto L23
                r3 = 1
                goto L24
            L23:
                r3 = 0
            L24:
                if (r3 == 0) goto L27
                goto L2d
            L27:
                java.lang.AssertionError r2 = new java.lang.AssertionError
                r2.<init>()
                throw r2
            L2d:
                r2 = 0
                return r2
        }
    }

    static {
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            java.lang.String r1 = "onCloseHandler"
            java.lang.Class<kotlinx.coroutines.channels.AbstractSendChannel> r2 = kotlinx.coroutines.channels.AbstractSendChannel.class
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r0, r1)
            kotlinx.coroutines.channels.AbstractSendChannel.onCloseHandler$FU = r0
            return
    }

    public AbstractSendChannel(kotlin.jvm.functions.Function1<? super E, kotlin.Unit> r2) {
            r1 = this;
            r1.<init>()
            r1.onUndeliveredElement = r2
            kotlinx.coroutines.internal.LockFreeLinkedListHead r0 = new kotlinx.coroutines.internal.LockFreeLinkedListHead
            r0.<init>()
            r1.queue = r0
            r0 = 0
            r1.onCloseHandler = r0
            return
    }

    public static final /* synthetic */ void access$helpCloseAndResumeWithSendException(kotlinx.coroutines.channels.AbstractSendChannel r0, kotlin.coroutines.Continuation r1, java.lang.Object r2, kotlinx.coroutines.channels.Closed r3) {
            r0.helpCloseAndResumeWithSendException(r1, r2, r3)
            return
    }

    public static final /* synthetic */ boolean access$isFullImpl(kotlinx.coroutines.channels.AbstractSendChannel r1) {
            boolean r0 = r1.isFullImpl()
            return r0
    }

    public static final /* synthetic */ void access$registerSelectSend(kotlinx.coroutines.channels.AbstractSendChannel r0, kotlinx.coroutines.selects.SelectInstance r1, java.lang.Object r2, kotlin.jvm.functions.Function2 r3) {
            r0.registerSelectSend(r1, r2, r3)
            return
    }

    public static final /* synthetic */ java.lang.Object access$sendSuspend(kotlinx.coroutines.channels.AbstractSendChannel r1, java.lang.Object r2, kotlin.coroutines.Continuation r3) {
            java.lang.Object r0 = r1.sendSuspend(r2, r3)
            return r0
    }

    private final int countQueueSize() {
            r6 = this;
            r0 = 0
            kotlinx.coroutines.internal.LockFreeLinkedListHead r1 = r6.queue
            r2 = 0
            java.lang.Object r3 = r1.getNext()
            kotlinx.coroutines.internal.LockFreeLinkedListNode r3 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r3
        La:
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r1)
            if (r4 != 0) goto L1d
            boolean r4 = r3 instanceof kotlinx.coroutines.internal.LockFreeLinkedListNode
            if (r4 == 0) goto L18
            r4 = r3
            r5 = 0
            int r0 = r0 + 1
        L18:
            kotlinx.coroutines.internal.LockFreeLinkedListNode r3 = r3.getNextNode()
            goto La
        L1d:
            return r0
    }

    private final java.lang.String getQueueDebugStateString() {
            r5 = this;
            kotlinx.coroutines.internal.LockFreeLinkedListHead r0 = r5.queue
            kotlinx.coroutines.internal.LockFreeLinkedListNode r0 = r0.getNextNode()
            kotlinx.coroutines.internal.LockFreeLinkedListHead r1 = r5.queue
            if (r0 != r1) goto Ld
            java.lang.String r1 = "EmptyQueue"
            return r1
        Ld:
            boolean r1 = r0 instanceof kotlinx.coroutines.channels.Closed
            if (r1 == 0) goto L17
            java.lang.String r1 = r0.toString()
            goto L2b
        L17:
            boolean r1 = r0 instanceof kotlinx.coroutines.channels.Receive
            if (r1 == 0) goto L1e
            java.lang.String r1 = "ReceiveQueued"
            goto L2b
        L1e:
            boolean r1 = r0 instanceof kotlinx.coroutines.channels.Send
            if (r1 == 0) goto L25
            java.lang.String r1 = "SendQueued"
            goto L2b
        L25:
            java.lang.String r1 = "UNEXPECTED:"
            java.lang.String r1 = kotlin.jvm.internal.Intrinsics.stringPlus(r1, r0)
        L2b:
            kotlinx.coroutines.internal.LockFreeLinkedListHead r2 = r5.queue
            kotlinx.coroutines.internal.LockFreeLinkedListNode r2 = r2.getPrevNode()
            if (r2 == r0) goto L6a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.StringBuilder r3 = r3.append(r1)
            java.lang.String r4 = ",queueSize="
            java.lang.StringBuilder r3 = r3.append(r4)
            int r4 = r5.countQueueSize()
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r1 = r3.toString()
            boolean r3 = r2 instanceof kotlinx.coroutines.channels.Closed
            if (r3 == 0) goto L6a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.StringBuilder r3 = r3.append(r1)
            java.lang.String r4 = ",closedForSend="
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.StringBuilder r3 = r3.append(r2)
            java.lang.String r1 = r3.toString()
        L6a:
            return r1
    }

    private final void helpClose(kotlinx.coroutines.channels.Closed<?> r8) {
            r7 = this;
            r0 = 0
            r1 = 1
            java.lang.Object r2 = kotlinx.coroutines.internal.InlineList.m10211constructorimpl$default(r0, r1, r0)
        L6:
            kotlinx.coroutines.internal.LockFreeLinkedListNode r3 = r8.getPrevNode()
            boolean r4 = r3 instanceof kotlinx.coroutines.channels.Receive
            if (r4 == 0) goto L12
            kotlinx.coroutines.channels.Receive r3 = (kotlinx.coroutines.channels.Receive) r3
            goto L13
        L12:
            r3 = r0
        L13:
            if (r3 != 0) goto L51
            r0 = 0
            if (r2 != 0) goto L1a
            goto L42
        L1a:
            boolean r3 = r2 instanceof java.util.ArrayList
            if (r3 != 0) goto L26
            r1 = r2
            kotlinx.coroutines.channels.Receive r1 = (kotlinx.coroutines.channels.Receive) r1
            r3 = 0
            r1.resumeReceiveClosed(r8)
            goto L41
        L26:
            if (r2 == 0) goto L49
            r3 = r2
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            int r4 = r3.size()
            int r4 = r4 - r1
            if (r4 < 0) goto L41
        L32:
            r1 = r4
            int r4 = r4 + (-1)
            java.lang.Object r5 = r3.get(r1)
            kotlinx.coroutines.channels.Receive r5 = (kotlinx.coroutines.channels.Receive) r5
            r6 = 0
            r5.resumeReceiveClosed(r8)
            if (r4 >= 0) goto L32
        L41:
        L42:
            r0 = r8
            kotlinx.coroutines.internal.LockFreeLinkedListNode r0 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r0
            r7.onClosedIdempotent(r0)
            return
        L49:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r3 = "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>{ kotlin.collections.TypeAliasesKt.ArrayList<E of kotlinx.coroutines.internal.InlineList> }"
            r1.<init>(r3)
            throw r1
        L51:
            boolean r4 = r3.mo10219remove()
            if (r4 != 0) goto L5c
            r3.helpRemove()
            goto L6
        L5c:
            java.lang.Object r2 = kotlinx.coroutines.internal.InlineList.m10216plusFjFbRPM(r2, r3)
            goto L6
    }

    private final java.lang.Throwable helpCloseAndGetSendException(E r5, kotlinx.coroutines.channels.Closed<?> r6) {
            r4 = this;
            r4.helpClose(r6)
            kotlin.jvm.functions.Function1<E, kotlin.Unit> r0 = r4.onUndeliveredElement
            if (r0 != 0) goto L9
        L8:
            goto L12
        L9:
            r1 = 2
            r2 = 0
            kotlinx.coroutines.internal.UndeliveredElementException r0 = kotlinx.coroutines.internal.OnUndeliveredElementKt.callUndeliveredElementCatchingException$default(r0, r5, r2, r1, r2)
            if (r0 != 0) goto L17
            goto L8
        L12:
            java.lang.Throwable r0 = r6.getSendException()
            return r0
        L17:
            r1 = 0
            r2 = r0
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            java.lang.Throwable r3 = r6.getSendException()
            kotlin.ExceptionsKt.addSuppressed(r2, r3)
            throw r0
    }

    private final java.lang.Throwable helpCloseAndGetSendException(kotlinx.coroutines.channels.Closed<?> r2) {
            r1 = this;
            r1.helpClose(r2)
            java.lang.Throwable r0 = r2.getSendException()
            return r0
    }

    private final void helpCloseAndResumeWithSendException(kotlin.coroutines.Continuation<?> r5, E r6, kotlinx.coroutines.channels.Closed<?> r7) {
            r4 = this;
            r4.helpClose(r7)
            java.lang.Throwable r0 = r7.getSendException()
            kotlin.jvm.functions.Function1<E, kotlin.Unit> r1 = r4.onUndeliveredElement
            if (r1 != 0) goto Ld
        Lc:
            goto L16
        Ld:
            r2 = 2
            r3 = 0
            kotlinx.coroutines.internal.UndeliveredElementException r1 = kotlinx.coroutines.internal.OnUndeliveredElementKt.callUndeliveredElementCatchingException$default(r1, r6, r3, r2, r3)
            if (r1 != 0) goto L24
            goto Lc
        L16:
            kotlin.Result$Companion r1 = kotlin.Result.Companion
            java.lang.Object r1 = kotlin.ResultKt.createFailure(r0)
            java.lang.Object r1 = kotlin.Result.m8669constructorimpl(r1)
            r5.resumeWith(r1)
            return
        L24:
            r2 = 0
            r3 = r1
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            kotlin.ExceptionsKt.addSuppressed(r3, r0)
            kotlin.Result$Companion r3 = kotlin.Result.Companion
            r3 = r1
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            java.lang.Object r3 = kotlin.ResultKt.createFailure(r3)
            java.lang.Object r3 = kotlin.Result.m8669constructorimpl(r3)
            r5.resumeWith(r3)
            return
    }

    private final void invokeOnCloseHandler(java.lang.Throwable r4) {
            r3 = this;
            java.lang.Object r0 = r3.onCloseHandler
            if (r0 == 0) goto L1c
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.channels.AbstractChannelKt.HANDLER_INVOKED
            if (r0 == r1) goto L1c
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = kotlinx.coroutines.channels.AbstractSendChannel.onCloseHandler$FU
            kotlinx.coroutines.internal.Symbol r2 = kotlinx.coroutines.channels.AbstractChannelKt.HANDLER_INVOKED
            boolean r1 = androidx.concurrent.futures.C0110xc40028dd.m9m(r1, r3, r0, r2)
            if (r1 == 0) goto L1c
            r1 = 1
            java.lang.Object r1 = kotlin.jvm.internal.TypeIntrinsics.beforeCheckcastToFunctionOfArity(r0, r1)
            kotlin.jvm.functions.Function1 r1 = (kotlin.jvm.functions.Function1) r1
            r1.invoke(r4)
        L1c:
            return
    }

    private final boolean isFullImpl() {
            r1 = this;
            kotlinx.coroutines.internal.LockFreeLinkedListHead r0 = r1.queue
            kotlinx.coroutines.internal.LockFreeLinkedListNode r0 = r0.getNextNode()
            boolean r0 = r0 instanceof kotlinx.coroutines.channels.ReceiveOrClosed
            if (r0 != 0) goto L12
            boolean r0 = r1.isBufferFull()
            if (r0 == 0) goto L12
            r0 = 1
            goto L13
        L12:
            r0 = 0
        L13:
            return r0
    }

    private final <R> void registerSelectSend(kotlinx.coroutines.selects.SelectInstance<? super R> r6, E r7, kotlin.jvm.functions.Function2<? super kotlinx.coroutines.channels.SendChannel<? super E>, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> r8) {
            r5 = this;
        L1:
            boolean r0 = r6.isSelected()
            if (r0 == 0) goto L9
            return
        L9:
            boolean r0 = r5.isFullImpl()
            if (r0 == 0) goto L62
            kotlinx.coroutines.channels.AbstractSendChannel$SendSelect r0 = new kotlinx.coroutines.channels.AbstractSendChannel$SendSelect
            r0.<init>(r7, r5, r6, r8)
            r1 = r0
            kotlinx.coroutines.channels.Send r1 = (kotlinx.coroutines.channels.Send) r1
            java.lang.Object r1 = r5.enqueueSend(r1)
            if (r1 != 0) goto L25
            r2 = r0
            kotlinx.coroutines.DisposableHandle r2 = (kotlinx.coroutines.DisposableHandle) r2
            r6.disposeOnSelect(r2)
            return
        L25:
            boolean r2 = r1 instanceof kotlinx.coroutines.channels.Closed
            if (r2 != 0) goto L56
            kotlinx.coroutines.internal.Symbol r2 = kotlinx.coroutines.channels.AbstractChannelKt.ENQUEUE_FAILED
            if (r1 != r2) goto L2e
            goto L62
        L2e:
            boolean r2 = r1 instanceof kotlinx.coroutines.channels.Receive
            if (r2 == 0) goto L33
            goto L62
        L33:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "enqueueSend returned "
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.StringBuilder r3 = r3.append(r1)
            r4 = 32
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
        L56:
            r2 = r1
            kotlinx.coroutines.channels.Closed r2 = (kotlinx.coroutines.channels.Closed) r2
            java.lang.Throwable r2 = r5.helpCloseAndGetSendException(r7, r2)
            java.lang.Throwable r2 = kotlinx.coroutines.internal.StackTraceRecoveryKt.recoverStackTrace(r2)
            throw r2
        L62:
            java.lang.Object r0 = r5.offerSelectInternal(r7, r6)
            java.lang.Object r1 = kotlinx.coroutines.selects.SelectKt.getALREADY_SELECTED()
            if (r0 != r1) goto L6e
            return
        L6e:
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.channels.AbstractChannelKt.OFFER_FAILED
            if (r0 != r1) goto L73
            goto L1
        L73:
            java.lang.Object r1 = kotlinx.coroutines.internal.AtomicKt.RETRY_ATOMIC
            if (r0 != r1) goto L78
            goto L1
        L78:
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.channels.AbstractChannelKt.OFFER_SUCCESS
            if (r0 != r1) goto L84
            kotlin.coroutines.Continuation r1 = r6.getCompletion()
            kotlinx.coroutines.intrinsics.UndispatchedKt.startCoroutineUnintercepted(r8, r5, r1)
            return
        L84:
            boolean r1 = r0 instanceof kotlinx.coroutines.channels.Closed
            if (r1 == 0) goto L94
            r1 = r0
            kotlinx.coroutines.channels.Closed r1 = (kotlinx.coroutines.channels.Closed) r1
            java.lang.Throwable r1 = r5.helpCloseAndGetSendException(r7, r1)
            java.lang.Throwable r1 = kotlinx.coroutines.internal.StackTraceRecoveryKt.recoverStackTrace(r1)
            throw r1
        L94:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "offerSelectInternal returned "
            java.lang.String r2 = kotlin.jvm.internal.Intrinsics.stringPlus(r2, r0)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    private final java.lang.Object sendSuspend(E r11, kotlin.coroutines.Continuation<? super kotlin.Unit> r12) {
            r10 = this;
            r0 = 0
            r1 = r12
            r2 = 0
            kotlin.coroutines.Continuation r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(r1)
            kotlinx.coroutines.CancellableContinuationImpl r3 = kotlinx.coroutines.CancellableContinuationKt.getOrCreateCancellableContinuation(r3)
            r4 = r3
            kotlinx.coroutines.CancellableContinuation r4 = (kotlinx.coroutines.CancellableContinuation) r4
            r5 = 0
        Lf:
            boolean r6 = access$isFullImpl(r10)
            if (r6 == 0) goto L63
            kotlin.jvm.functions.Function1<E, kotlin.Unit> r6 = r10.onUndeliveredElement
            if (r6 != 0) goto L20
            kotlinx.coroutines.channels.SendElement r6 = new kotlinx.coroutines.channels.SendElement
            r6.<init>(r11, r4)
            goto L29
        L20:
            kotlinx.coroutines.channels.SendElementWithUndeliveredHandler r6 = new kotlinx.coroutines.channels.SendElementWithUndeliveredHandler
            kotlin.jvm.functions.Function1<E, kotlin.Unit> r7 = r10.onUndeliveredElement
            r6.<init>(r11, r4, r7)
            kotlinx.coroutines.channels.SendElement r6 = (kotlinx.coroutines.channels.SendElement) r6
        L29:
            r7 = r6
            kotlinx.coroutines.channels.Send r7 = (kotlinx.coroutines.channels.Send) r7
            java.lang.Object r7 = r10.enqueueSend(r7)
            if (r7 != 0) goto L3b
            r8 = r6
            kotlinx.coroutines.internal.LockFreeLinkedListNode r8 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r8
            kotlinx.coroutines.CancellableContinuationKt.removeOnCancellation(r4, r8)
            goto L8e
        L3b:
            boolean r8 = r7 instanceof kotlinx.coroutines.channels.Closed
            if (r8 == 0) goto L49
            r8 = r4
            kotlin.coroutines.Continuation r8 = (kotlin.coroutines.Continuation) r8
            r9 = r7
            kotlinx.coroutines.channels.Closed r9 = (kotlinx.coroutines.channels.Closed) r9
            access$helpCloseAndResumeWithSendException(r10, r8, r11, r9)
            goto L8e
        L49:
            kotlinx.coroutines.internal.Symbol r8 = kotlinx.coroutines.channels.AbstractChannelKt.ENQUEUE_FAILED
            if (r7 != r8) goto L4e
            goto L63
        L4e:
            boolean r8 = r7 instanceof kotlinx.coroutines.channels.Receive
            if (r8 == 0) goto L53
            goto L63
        L53:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "enqueueSend returned "
            java.lang.String r9 = kotlin.jvm.internal.Intrinsics.stringPlus(r9, r7)
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
        L63:
            java.lang.Object r6 = r10.offerInternal(r11)
            kotlinx.coroutines.internal.Symbol r7 = kotlinx.coroutines.channels.AbstractChannelKt.OFFER_SUCCESS
            if (r6 != r7) goto L7b
            r7 = r4
            kotlin.coroutines.Continuation r7 = (kotlin.coroutines.Continuation) r7
            kotlin.Result$Companion r8 = kotlin.Result.Companion
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            java.lang.Object r8 = kotlin.Result.m8669constructorimpl(r8)
            r7.resumeWith(r8)
            goto L8e
        L7b:
            kotlinx.coroutines.internal.Symbol r7 = kotlinx.coroutines.channels.AbstractChannelKt.OFFER_FAILED
            if (r6 != r7) goto L80
            goto Lf
        L80:
            boolean r7 = r6 instanceof kotlinx.coroutines.channels.Closed
            if (r7 == 0) goto La6
            r7 = r4
            kotlin.coroutines.Continuation r7 = (kotlin.coroutines.Continuation) r7
            r8 = r6
            kotlinx.coroutines.channels.Closed r8 = (kotlinx.coroutines.channels.Closed) r8
            access$helpCloseAndResumeWithSendException(r10, r7, r11, r8)
        L8e:
            java.lang.Object r1 = r3.getResult()
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r1 != r2) goto L9b
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r12)
        L9b:
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r1 != r0) goto La3
            return r1
        La3:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        La6:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "offerInternal returned "
            java.lang.String r8 = kotlin.jvm.internal.Intrinsics.stringPlus(r8, r6)
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public boolean close(java.lang.Throwable r8) {
            r7 = this;
            kotlinx.coroutines.channels.Closed r0 = new kotlinx.coroutines.channels.Closed
            r0.<init>(r8)
            kotlinx.coroutines.internal.LockFreeLinkedListHead r1 = r7.queue
            kotlinx.coroutines.internal.LockFreeLinkedListNode r1 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r1
            r2 = 0
        La:
            kotlinx.coroutines.internal.LockFreeLinkedListNode r3 = r1.getPrevNode()
            r4 = r3
            r5 = 0
            boolean r6 = r4 instanceof kotlinx.coroutines.channels.Closed
            if (r6 == 0) goto L17
            r4 = 0
            goto L21
        L17:
            r4 = r0
            kotlinx.coroutines.internal.LockFreeLinkedListNode r4 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r4
            boolean r4 = r3.addNext(r4, r1)
            if (r4 == 0) goto La
            r4 = 1
        L21:
            r1 = r4
            if (r1 == 0) goto L26
            r2 = r0
            goto L2e
        L26:
            kotlinx.coroutines.internal.LockFreeLinkedListHead r2 = r7.queue
            kotlinx.coroutines.internal.LockFreeLinkedListNode r2 = r2.getPrevNode()
            kotlinx.coroutines.channels.Closed r2 = (kotlinx.coroutines.channels.Closed) r2
        L2e:
            r7.helpClose(r2)
            if (r1 == 0) goto L36
            r7.invokeOnCloseHandler(r8)
        L36:
            return r1
    }

    protected final kotlinx.coroutines.internal.LockFreeLinkedListNode.AddLastDesc<?> describeSendBuffered(E r3) {
            r2 = this;
            kotlinx.coroutines.channels.AbstractSendChannel$SendBufferedDesc r0 = new kotlinx.coroutines.channels.AbstractSendChannel$SendBufferedDesc
            kotlinx.coroutines.internal.LockFreeLinkedListHead r1 = r2.queue
            r0.<init>(r1, r3)
            kotlinx.coroutines.internal.LockFreeLinkedListNode$AddLastDesc r0 = (kotlinx.coroutines.internal.LockFreeLinkedListNode.AddLastDesc) r0
            return r0
    }

    protected final kotlinx.coroutines.channels.AbstractSendChannel.TryOfferDesc<E> describeTryOffer(E r3) {
            r2 = this;
            kotlinx.coroutines.channels.AbstractSendChannel$TryOfferDesc r0 = new kotlinx.coroutines.channels.AbstractSendChannel$TryOfferDesc
            kotlinx.coroutines.internal.LockFreeLinkedListHead r1 = r2.queue
            r0.<init>(r3, r1)
            return r0
    }

    protected java.lang.Object enqueueSend(kotlinx.coroutines.channels.Send r8) {
            r7 = this;
            boolean r0 = r7.isBufferAlwaysFull()
            if (r0 == 0) goto L22
            kotlinx.coroutines.internal.LockFreeLinkedListHead r0 = r7.queue
            kotlinx.coroutines.internal.LockFreeLinkedListNode r0 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r0
            r1 = 0
        Lb:
            kotlinx.coroutines.internal.LockFreeLinkedListNode r2 = r0.getPrevNode()
            r3 = r2
            r4 = 0
            boolean r5 = r3 instanceof kotlinx.coroutines.channels.ReceiveOrClosed
            if (r5 == 0) goto L17
            return r3
        L17:
            r3 = r8
            kotlinx.coroutines.internal.LockFreeLinkedListNode r3 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r3
            boolean r3 = r2.addNext(r3, r0)
            if (r3 == 0) goto Lb
            goto L55
        L22:
            kotlinx.coroutines.internal.LockFreeLinkedListHead r0 = r7.queue
            kotlinx.coroutines.internal.LockFreeLinkedListNode r0 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r0
            r1 = 0
            r2 = r0
            r3 = 0
            kotlinx.coroutines.channels.AbstractSendChannel$enqueueSend$$inlined$addLastIfPrevAndIf$1 r4 = new kotlinx.coroutines.channels.AbstractSendChannel$enqueueSend$$inlined$addLastIfPrevAndIf$1
            r5 = r8
            kotlinx.coroutines.internal.LockFreeLinkedListNode r5 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r5
            r4.<init>(r5, r7)
            kotlinx.coroutines.internal.LockFreeLinkedListNode$CondAddOp r4 = (kotlinx.coroutines.internal.LockFreeLinkedListNode.CondAddOp) r4
            r2 = r4
        L35:
            kotlinx.coroutines.internal.LockFreeLinkedListNode r3 = r0.getPrevNode()
            r4 = r3
            r5 = 0
            boolean r6 = r4 instanceof kotlinx.coroutines.channels.ReceiveOrClosed
            if (r6 == 0) goto L41
            return r4
        L41:
            r4 = r8
            kotlinx.coroutines.internal.LockFreeLinkedListNode r4 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r4
            int r4 = r3.tryCondAddNext(r4, r0, r2)
            switch(r4) {
                case 1: goto L4f;
                case 2: goto L4d;
                default: goto L4c;
            }
        L4c:
            goto L35
        L4d:
            r4 = 0
            goto L50
        L4f:
            r4 = 1
        L50:
            if (r4 != 0) goto L55
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.channels.AbstractChannelKt.ENQUEUE_FAILED
            return r0
        L55:
            r0 = 0
            return r0
    }

    protected java.lang.String getBufferDebugString() {
            r1 = this;
            java.lang.String r0 = ""
            return r0
    }

    protected final kotlinx.coroutines.channels.Closed<?> getClosedForReceive() {
            r3 = this;
            kotlinx.coroutines.internal.LockFreeLinkedListHead r0 = r3.queue
            kotlinx.coroutines.internal.LockFreeLinkedListNode r0 = r0.getNextNode()
            boolean r1 = r0 instanceof kotlinx.coroutines.channels.Closed
            r2 = 0
            if (r1 == 0) goto Le
            kotlinx.coroutines.channels.Closed r0 = (kotlinx.coroutines.channels.Closed) r0
            goto Lf
        Le:
            r0 = r2
        Lf:
            if (r0 != 0) goto L12
            goto L18
        L12:
            r1 = r0
            r2 = 0
            r3.helpClose(r1)
            r2 = r0
        L18:
            return r2
    }

    protected final kotlinx.coroutines.channels.Closed<?> getClosedForSend() {
            r3 = this;
            kotlinx.coroutines.internal.LockFreeLinkedListHead r0 = r3.queue
            kotlinx.coroutines.internal.LockFreeLinkedListNode r0 = r0.getPrevNode()
            boolean r1 = r0 instanceof kotlinx.coroutines.channels.Closed
            r2 = 0
            if (r1 == 0) goto Le
            kotlinx.coroutines.channels.Closed r0 = (kotlinx.coroutines.channels.Closed) r0
            goto Lf
        Le:
            r0 = r2
        Lf:
            if (r0 != 0) goto L12
            goto L18
        L12:
            r1 = r0
            r2 = 0
            r3.helpClose(r1)
            r2 = r0
        L18:
            return r2
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public final kotlinx.coroutines.selects.SelectClause2<E, kotlinx.coroutines.channels.SendChannel<E>> getOnSend() {
            r1 = this;
            kotlinx.coroutines.channels.AbstractSendChannel$onSend$1 r0 = new kotlinx.coroutines.channels.AbstractSendChannel$onSend$1
            r0.<init>(r1)
            kotlinx.coroutines.selects.SelectClause2 r0 = (kotlinx.coroutines.selects.SelectClause2) r0
            return r0
    }

    protected final kotlinx.coroutines.internal.LockFreeLinkedListHead getQueue() {
            r1 = this;
            kotlinx.coroutines.internal.LockFreeLinkedListHead r0 = r1.queue
            return r0
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public void invokeOnClose(kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> r4) {
            r3 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.channels.AbstractSendChannel.onCloseHandler$FU
            r1 = 0
            boolean r0 = androidx.concurrent.futures.C0110xc40028dd.m9m(r0, r3, r1, r4)
            if (r0 != 0) goto L23
            java.lang.Object r0 = r3.onCloseHandler
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.channels.AbstractChannelKt.HANDLER_INVOKED
            if (r0 != r1) goto L17
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Another handler was already registered and successfully invoked"
            r1.<init>(r2)
            throw r1
        L17:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Another handler was already registered: "
            java.lang.String r2 = kotlin.jvm.internal.Intrinsics.stringPlus(r2, r0)
            r1.<init>(r2)
            throw r1
        L23:
            kotlinx.coroutines.channels.Closed r0 = r3.getClosedForSend()
            if (r0 == 0) goto L38
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = kotlinx.coroutines.channels.AbstractSendChannel.onCloseHandler$FU
            kotlinx.coroutines.internal.Symbol r2 = kotlinx.coroutines.channels.AbstractChannelKt.HANDLER_INVOKED
            boolean r1 = androidx.concurrent.futures.C0110xc40028dd.m9m(r1, r3, r4, r2)
            if (r1 == 0) goto L38
            java.lang.Throwable r1 = r0.closeCause
            r4.invoke(r1)
        L38:
            return
    }

    protected abstract boolean isBufferAlwaysFull();

    protected abstract boolean isBufferFull();

    @Override // kotlinx.coroutines.channels.SendChannel
    public final boolean isClosedForSend() {
            r1 = this;
            kotlinx.coroutines.channels.Closed r0 = r1.getClosedForSend()
            if (r0 == 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public boolean offer(E r5) {
            r4 = this;
            r0 = r4
            kotlinx.coroutines.channels.SendChannel r0 = (kotlinx.coroutines.channels.SendChannel) r0     // Catch: java.lang.Throwable -> La
            boolean r0 = kotlinx.coroutines.channels.SendChannel.DefaultImpls.offer(r0, r5)     // Catch: java.lang.Throwable -> La
            return r0
        La:
            r0 = move-exception
            kotlin.jvm.functions.Function1<E, kotlin.Unit> r1 = r4.onUndeliveredElement
            if (r1 == 0) goto L20
            r2 = 2
            r3 = 0
            kotlinx.coroutines.internal.UndeliveredElementException r1 = kotlinx.coroutines.internal.OnUndeliveredElementKt.callUndeliveredElementCatchingException$default(r1, r5, r3, r2, r3)
            if (r1 != 0) goto L18
            goto L20
        L18:
            r2 = 0
            r3 = r1
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            kotlin.ExceptionsKt.addSuppressed(r3, r0)
            throw r1
        L20:
            throw r0
    }

    protected java.lang.Object offerInternal(E r5) {
            r4 = this;
        L1:
            kotlinx.coroutines.channels.ReceiveOrClosed r0 = r4.takeFirstReceiveOrPeekClosed()
            if (r0 != 0) goto Lb
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.channels.AbstractChannelKt.OFFER_FAILED
            return r0
        Lb:
            r1 = 0
            kotlinx.coroutines.internal.Symbol r1 = r0.tryResumeReceive(r5, r1)
            if (r1 == 0) goto L1
            boolean r2 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
            if (r2 == 0) goto L29
            r2 = 0
            kotlinx.coroutines.internal.Symbol r3 = kotlinx.coroutines.CancellableContinuationImplKt.RESUME_TOKEN
            if (r1 != r3) goto L1f
            r3 = 1
            goto L20
        L1f:
            r3 = 0
        L20:
            if (r3 == 0) goto L23
            goto L29
        L23:
            java.lang.AssertionError r2 = new java.lang.AssertionError
            r2.<init>()
            throw r2
        L29:
            r0.completeResumeReceive(r5)
            java.lang.Object r2 = r0.getOfferResult()
            return r2
    }

    protected java.lang.Object offerSelectInternal(E r5, kotlinx.coroutines.selects.SelectInstance<?> r6) {
            r4 = this;
            kotlinx.coroutines.channels.AbstractSendChannel$TryOfferDesc r0 = r4.describeTryOffer(r5)
            r1 = r0
            kotlinx.coroutines.internal.AtomicDesc r1 = (kotlinx.coroutines.internal.AtomicDesc) r1
            java.lang.Object r1 = r6.performAtomicTrySelect(r1)
            if (r1 == 0) goto Le
            return r1
        Le:
            java.lang.Object r2 = r0.getResult()
            kotlinx.coroutines.channels.ReceiveOrClosed r2 = (kotlinx.coroutines.channels.ReceiveOrClosed) r2
            r2.completeResumeReceive(r5)
            java.lang.Object r3 = r2.getOfferResult()
            return r3
    }

    protected void onClosedIdempotent(kotlinx.coroutines.internal.LockFreeLinkedListNode r1) {
            r0 = this;
            return
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public final java.lang.Object send(E r3, kotlin.coroutines.Continuation<? super kotlin.Unit> r4) {
            r2 = this;
            java.lang.Object r0 = r2.offerInternal(r3)
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.channels.AbstractChannelKt.OFFER_SUCCESS
            if (r0 != r1) goto Lb
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        Lb:
            java.lang.Object r0 = r2.sendSuspend(r3, r4)
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r0 != r1) goto L16
            return r0
        L16:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
    }

    protected final kotlinx.coroutines.channels.ReceiveOrClosed<?> sendBuffered(E r8) {
            r7 = this;
            kotlinx.coroutines.internal.LockFreeLinkedListHead r0 = r7.queue
            kotlinx.coroutines.internal.LockFreeLinkedListNode r0 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r0
            kotlinx.coroutines.channels.AbstractSendChannel$SendBuffered r1 = new kotlinx.coroutines.channels.AbstractSendChannel$SendBuffered
            r1.<init>(r8)
            kotlinx.coroutines.internal.LockFreeLinkedListNode r1 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r1
            r2 = 0
        Lc:
            kotlinx.coroutines.internal.LockFreeLinkedListNode r3 = r0.getPrevNode()
            r4 = r3
            r5 = 0
            boolean r6 = r4 instanceof kotlinx.coroutines.channels.ReceiveOrClosed
            if (r6 == 0) goto L1b
            r6 = r4
            kotlinx.coroutines.channels.ReceiveOrClosed r6 = (kotlinx.coroutines.channels.ReceiveOrClosed) r6
            return r6
        L1b:
            boolean r4 = r3.addNext(r1, r0)
            if (r4 == 0) goto Lc
            r0 = 0
            return r0
    }

    protected kotlinx.coroutines.channels.ReceiveOrClosed<E> takeFirstReceiveOrPeekClosed() {
            r5 = this;
            kotlinx.coroutines.internal.LockFreeLinkedListHead r0 = r5.queue
            kotlinx.coroutines.internal.LockFreeLinkedListNode r0 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r0
            r1 = 0
        L5:
            java.lang.Object r2 = r0.getNext()
            kotlinx.coroutines.internal.LockFreeLinkedListNode r2 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r2
            r3 = 0
            if (r2 != r0) goto L11
            r2 = r3
            goto L2c
        L11:
            boolean r4 = r2 instanceof kotlinx.coroutines.channels.ReceiveOrClosed
            if (r4 != 0) goto L17
            r2 = r3
            goto L2c
        L17:
            r3 = r2
            kotlinx.coroutines.channels.ReceiveOrClosed r3 = (kotlinx.coroutines.channels.ReceiveOrClosed) r3
            r4 = 0
            boolean r3 = r3 instanceof kotlinx.coroutines.channels.Closed
            if (r3 == 0) goto L26
            boolean r3 = r2.isRemoved()
            if (r3 != 0) goto L26
            goto L2c
        L26:
            kotlinx.coroutines.internal.LockFreeLinkedListNode r3 = r2.removeOrNext()
            if (r3 != 0) goto L2f
        L2c:
            kotlinx.coroutines.channels.ReceiveOrClosed r2 = (kotlinx.coroutines.channels.ReceiveOrClosed) r2
            return r2
        L2f:
            r3.helpRemovePrev()
            goto L5
    }

    protected final kotlinx.coroutines.channels.Send takeFirstSendOrPeekClosed() {
            r5 = this;
            kotlinx.coroutines.internal.LockFreeLinkedListHead r0 = r5.queue
            kotlinx.coroutines.internal.LockFreeLinkedListNode r0 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r0
            r1 = 0
        L5:
            java.lang.Object r2 = r0.getNext()
            kotlinx.coroutines.internal.LockFreeLinkedListNode r2 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r2
            r3 = 0
            if (r2 != r0) goto L11
            r2 = r3
            goto L2c
        L11:
            boolean r4 = r2 instanceof kotlinx.coroutines.channels.Send
            if (r4 != 0) goto L17
            r2 = r3
            goto L2c
        L17:
            r3 = r2
            kotlinx.coroutines.channels.Send r3 = (kotlinx.coroutines.channels.Send) r3
            r4 = 0
            boolean r3 = r3 instanceof kotlinx.coroutines.channels.Closed
            if (r3 == 0) goto L26
            boolean r3 = r2.isRemoved()
            if (r3 != 0) goto L26
            goto L2c
        L26:
            kotlinx.coroutines.internal.LockFreeLinkedListNode r3 = r2.removeOrNext()
            if (r3 != 0) goto L2f
        L2c:
            kotlinx.coroutines.channels.Send r2 = (kotlinx.coroutines.channels.Send) r2
            return r2
        L2f:
            r3.helpRemovePrev()
            goto L5
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = kotlinx.coroutines.DebugStringsKt.getClassSimpleName(r2)
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = 64
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = kotlinx.coroutines.DebugStringsKt.getHexAddress(r2)
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = 123(0x7b, float:1.72E-43)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = r2.getQueueDebugStateString()
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = r2.getBufferDebugString()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    /* JADX INFO: renamed from: trySend-JP2dKIU, reason: not valid java name */
    public final java.lang.Object mo10174trySendJP2dKIU(E r5) {
            r4 = this;
            java.lang.Object r0 = r4.offerInternal(r5)
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.channels.AbstractChannelKt.OFFER_SUCCESS
            if (r0 != r1) goto L12
            kotlinx.coroutines.channels.ChannelResult$Companion r1 = kotlinx.coroutines.channels.ChannelResult.Companion
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            java.lang.Object r1 = r1.m10194successJP2dKIU(r2)
            goto L3f
        L12:
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.channels.AbstractChannelKt.OFFER_FAILED
            if (r0 != r1) goto L2e
            kotlinx.coroutines.channels.Closed r1 = r4.getClosedForSend()
            if (r1 != 0) goto L23
            kotlinx.coroutines.channels.ChannelResult$Companion r1 = kotlinx.coroutines.channels.ChannelResult.Companion
            java.lang.Object r1 = r1.m10193failurePtdJZtk()
            return r1
        L23:
            kotlinx.coroutines.channels.ChannelResult$Companion r2 = kotlinx.coroutines.channels.ChannelResult.Companion
            java.lang.Throwable r3 = r4.helpCloseAndGetSendException(r1)
            java.lang.Object r1 = r2.m10192closedJP2dKIU(r3)
            goto L3f
        L2e:
            boolean r1 = r0 instanceof kotlinx.coroutines.channels.Closed
            if (r1 == 0) goto L40
            kotlinx.coroutines.channels.ChannelResult$Companion r1 = kotlinx.coroutines.channels.ChannelResult.Companion
            r2 = r0
            kotlinx.coroutines.channels.Closed r2 = (kotlinx.coroutines.channels.Closed) r2
            java.lang.Throwable r2 = r4.helpCloseAndGetSendException(r2)
            java.lang.Object r1 = r1.m10192closedJP2dKIU(r2)
        L3f:
            return r1
        L40:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "trySend returned "
            java.lang.String r2 = kotlin.jvm.internal.Intrinsics.stringPlus(r2, r0)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }
}
