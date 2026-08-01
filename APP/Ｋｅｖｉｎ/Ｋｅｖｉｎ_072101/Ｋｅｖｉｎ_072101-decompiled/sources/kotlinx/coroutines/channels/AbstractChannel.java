package kotlinx.coroutines.channels;

/* JADX INFO: compiled from: AbstractChannel.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b \u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003:\u0007STUVWXYB'\u0012 \u0010\u0004\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u0007¢\u0006\u0002\u0010\bJ\u0012\u0010\u0019\u001a\u00020\n2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0007J\u0016\u0010\u0019\u001a\u00020\u00062\u000e\u0010\u001a\u001a\n\u0018\u00010\u001cj\u0004\u0018\u0001`\u001dJ\u0017\u0010\u001e\u001a\u00020\n2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0000¢\u0006\u0002\b\u001fJ\u000e\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000!H\u0004J\u0016\u0010\"\u001a\u00020\n2\f\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000$H\u0002J\u0016\u0010%\u001a\u00020\n2\f\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000$H\u0014JR\u0010&\u001a\u00020\n\"\u0004\b\u0001\u0010'2\f\u0010(\u001a\b\u0012\u0004\u0012\u0002H'0)2$\u0010*\u001a \b\u0001\u0012\u0006\u0012\u0004\u0018\u00010,\u0012\n\u0012\b\u0012\u0004\u0012\u0002H'0-\u0012\u0006\u0012\u0004\u0018\u00010,0+2\u0006\u0010.\u001a\u00020/H\u0002ø\u0001\u0000¢\u0006\u0002\u00100J\u000f\u00101\u001a\b\u0012\u0004\u0012\u00028\u000002H\u0086\u0002J\u0010\u00103\u001a\u00020\u00062\u0006\u00104\u001a\u00020\nH\u0014J/\u00105\u001a\u00020\u00062\f\u00106\u001a\b\u0012\u0004\u0012\u000208072\n\u00109\u001a\u0006\u0012\u0002\b\u00030:H\u0014ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b;\u0010<J\b\u0010=\u001a\u00020\u0006H\u0014J\b\u0010>\u001a\u00020\u0006H\u0014J\n\u0010?\u001a\u0004\u0018\u00010,H\u0014J\u0016\u0010@\u001a\u0004\u0018\u00010,2\n\u0010(\u001a\u0006\u0012\u0002\b\u00030)H\u0014J\u0011\u0010#\u001a\u00028\u0000H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010AJ\"\u0010B\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017H\u0086@ø\u0001\u0000ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\bC\u0010AJ\u001f\u0010D\u001a\u0002H'\"\u0004\b\u0001\u0010'2\u0006\u0010.\u001a\u00020/H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010EJR\u0010F\u001a\u00020\u0006\"\u0004\b\u0001\u0010'2\f\u0010(\u001a\b\u0012\u0004\u0012\u0002H'0)2\u0006\u0010.\u001a\u00020/2$\u0010*\u001a \b\u0001\u0012\u0006\u0012\u0004\u0018\u00010,\u0012\n\u0012\b\u0012\u0004\u0012\u0002H'0-\u0012\u0006\u0012\u0004\u0018\u00010,0+H\u0002ø\u0001\u0000¢\u0006\u0002\u0010GJ \u0010H\u001a\u00020\u00062\n\u0010I\u001a\u0006\u0012\u0002\b\u00030J2\n\u0010#\u001a\u0006\u0012\u0002\b\u00030$H\u0002J\u0010\u0010K\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010LH\u0014J\u001c\u0010M\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\bN\u0010OJX\u0010P\u001a\u00020\u0006\"\u0004\b\u0001\u0010'* \b\u0001\u0012\u0006\u0012\u0004\u0018\u00010,\u0012\n\u0012\b\u0012\u0004\u0012\u0002H'0-\u0012\u0006\u0012\u0004\u0018\u00010,0+2\f\u0010(\u001a\b\u0012\u0004\u0012\u0002H'0)2\u0006\u0010.\u001a\u00020/2\b\u0010Q\u001a\u0004\u0018\u00010,H\u0002ø\u0001\u0000¢\u0006\u0002\u0010RR\u0014\u0010\t\u001a\u00020\n8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0012\u0010\r\u001a\u00020\nX¤\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\fR\u0012\u0010\u000e\u001a\u00020\nX¤\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\fR\u0014\u0010\u000f\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\fR\u0014\u0010\u0010\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\fR\u0014\u0010\u0011\u001a\u00020\n8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\fR\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00138F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R \u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00170\u00138Fø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0015\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006Z"}, m115d2 = {"Lkotlinx/coroutines/channels/AbstractChannel;", "E", "Lkotlinx/coroutines/channels/AbstractSendChannel;", "Lkotlinx/coroutines/channels/Channel;", "onUndeliveredElement", "Lkotlin/Function1;", "", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "(Lkotlin/jvm/functions/Function1;)V", "hasReceiveOrClosed", "", "getHasReceiveOrClosed", "()Z", "isBufferAlwaysEmpty", "isBufferEmpty", "isClosedForReceive", "isEmpty", "isEmptyImpl", "onReceive", "Lkotlinx/coroutines/selects/SelectClause1;", "getOnReceive", "()Lkotlinx/coroutines/selects/SelectClause1;", "onReceiveCatching", "Lkotlinx/coroutines/channels/ChannelResult;", "getOnReceiveCatching", "cancel", "cause", "", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "cancelInternal", "cancelInternal$kotlinx_coroutines_core", "describeTryPoll", "Lkotlinx/coroutines/channels/AbstractChannel$TryPollDesc;", "enqueueReceive", "receive", "Lkotlinx/coroutines/channels/Receive;", "enqueueReceiveInternal", "enqueueReceiveSelect", "R", "select", "Lkotlinx/coroutines/selects/SelectInstance;", "block", "Lkotlin/Function2;", "", "Lkotlin/coroutines/Continuation;", "receiveMode", "", "(Lkotlinx/coroutines/selects/SelectInstance;Lkotlin/jvm/functions/Function2;I)Z", "iterator", "Lkotlinx/coroutines/channels/ChannelIterator;", "onCancelIdempotent", "wasClosed", "onCancelIdempotentList", "list", "Lkotlinx/coroutines/internal/InlineList;", "Lkotlinx/coroutines/channels/Send;", "closed", "Lkotlinx/coroutines/channels/Closed;", "onCancelIdempotentList-w-w6eGU", "(Ljava/lang/Object;Lkotlinx/coroutines/channels/Closed;)V", "onReceiveDequeued", "onReceiveEnqueued", "pollInternal", "pollSelectInternal", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "receiveCatching", "receiveCatching-JP2dKIU", "receiveSuspend", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "registerSelectReceiveMode", "(Lkotlinx/coroutines/selects/SelectInstance;ILkotlin/jvm/functions/Function2;)V", "removeReceiveOnCancel", "cont", "Lkotlinx/coroutines/CancellableContinuation;", "takeFirstReceiveOrPeekClosed", "Lkotlinx/coroutines/channels/ReceiveOrClosed;", "tryReceive", "tryReceive-PtdJZtk", "()Ljava/lang/Object;", "tryStartBlockUnintercepted", "value", "(Lkotlin/jvm/functions/Function2;Lkotlinx/coroutines/selects/SelectInstance;ILjava/lang/Object;)V", "Itr", "ReceiveElement", "ReceiveElementWithUndeliveredHandler", "ReceiveHasNext", "ReceiveSelect", "RemoveReceiveOnCancel", "TryPollDesc", "kotlinx-coroutines-core"}, m116k = 1, m117mv = {1, 6, 0}, m119xi = 48)
public abstract class AbstractChannel<E> extends kotlinx.coroutines.channels.AbstractSendChannel<E> implements kotlinx.coroutines.channels.Channel<E> {

    /* JADX INFO: compiled from: AbstractChannel.kt */
    @kotlin.Metadata(m114d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004¢\u0006\u0002\u0010\u0005J\u0011\u0010\f\u001a\u00020\rH\u0096Bø\u0001\u0000¢\u0006\u0002\u0010\u000eJ\u0012\u0010\u000f\u001a\u00020\r2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0002J\u0011\u0010\u0010\u001a\u00020\rH\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u000eJ\u000e\u0010\u0011\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0002\u0010\tR\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, m115d2 = {"Lkotlinx/coroutines/channels/AbstractChannel$Itr;", "E", "Lkotlinx/coroutines/channels/ChannelIterator;", "channel", "Lkotlinx/coroutines/channels/AbstractChannel;", "(Lkotlinx/coroutines/channels/AbstractChannel;)V", "result", "", "getResult", "()Ljava/lang/Object;", "setResult", "(Ljava/lang/Object;)V", "hasNext", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "hasNextResult", "hasNextSuspend", "next", "kotlinx-coroutines-core"}, m116k = 1, m117mv = {1, 6, 0}, m119xi = 48)
    private static final class Itr<E> implements kotlinx.coroutines.channels.ChannelIterator<E> {
        public final kotlinx.coroutines.channels.AbstractChannel<E> channel;
        private java.lang.Object result;

        public Itr(kotlinx.coroutines.channels.AbstractChannel<E> r2) {
                r1 = this;
                r1.<init>()
                r1.channel = r2
                kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.channels.AbstractChannelKt.POLL_FAILED
                r1.result = r0
                return
        }

        public static final /* synthetic */ java.lang.Object access$hasNextSuspend(kotlinx.coroutines.channels.AbstractChannel.Itr r1, kotlin.coroutines.Continuation r2) {
                java.lang.Object r0 = r1.hasNextSuspend(r2)
                return r0
        }

        private final boolean hasNextResult(java.lang.Object r2) {
                r1 = this;
                boolean r0 = r2 instanceof kotlinx.coroutines.channels.Closed
                if (r0 == 0) goto L19
                r0 = r2
                kotlinx.coroutines.channels.Closed r0 = (kotlinx.coroutines.channels.Closed) r0
                java.lang.Throwable r0 = r0.closeCause
                if (r0 != 0) goto Ld
                r0 = 0
                return r0
            Ld:
                r0 = r2
                kotlinx.coroutines.channels.Closed r0 = (kotlinx.coroutines.channels.Closed) r0
                java.lang.Throwable r0 = r0.getReceiveException()
                java.lang.Throwable r0 = kotlinx.coroutines.internal.StackTraceRecoveryKt.recoverStackTrace(r0)
                throw r0
            L19:
                r0 = 1
                return r0
        }

        private final java.lang.Object hasNextSuspend(kotlin.coroutines.Continuation<? super java.lang.Boolean> r12) {
                r11 = this;
                r0 = 0
                r1 = r12
                r2 = 0
                kotlin.coroutines.Continuation r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(r1)
                kotlinx.coroutines.CancellableContinuationImpl r3 = kotlinx.coroutines.CancellableContinuationKt.getOrCreateCancellableContinuation(r3)
                r4 = r3
                kotlinx.coroutines.CancellableContinuation r4 = (kotlinx.coroutines.CancellableContinuation) r4
                r5 = 0
                kotlinx.coroutines.channels.AbstractChannel$ReceiveHasNext r6 = new kotlinx.coroutines.channels.AbstractChannel$ReceiveHasNext
                r6.<init>(r11, r4)
            L14:
                kotlinx.coroutines.channels.AbstractChannel<E> r7 = r11.channel
                r8 = r6
                kotlinx.coroutines.channels.Receive r8 = (kotlinx.coroutines.channels.Receive) r8
                boolean r7 = kotlinx.coroutines.channels.AbstractChannel.access$enqueueReceive(r7, r8)
                if (r7 == 0) goto L29
                kotlinx.coroutines.channels.AbstractChannel<E> r7 = r11.channel
                r8 = r6
                kotlinx.coroutines.channels.Receive r8 = (kotlinx.coroutines.channels.Receive) r8
                kotlinx.coroutines.channels.AbstractChannel.access$removeReceiveOnCancel(r7, r4, r8)
                goto L84
            L29:
                kotlinx.coroutines.channels.AbstractChannel<E> r7 = r11.channel
                java.lang.Object r7 = r7.pollInternal()
                r11.setResult(r7)
                boolean r8 = r7 instanceof kotlinx.coroutines.channels.Closed
                if (r8 == 0) goto L67
                r8 = r7
                kotlinx.coroutines.channels.Closed r8 = (kotlinx.coroutines.channels.Closed) r8
                java.lang.Throwable r8 = r8.closeCause
                if (r8 != 0) goto L4f
                r8 = r4
                kotlin.coroutines.Continuation r8 = (kotlin.coroutines.Continuation) r8
                kotlin.Result$Companion r9 = kotlin.Result.Companion
                r9 = 0
                java.lang.Boolean r9 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r9)
                java.lang.Object r9 = kotlin.Result.m8669constructorimpl(r9)
                r8.resumeWith(r9)
                goto L66
            L4f:
                r8 = r4
                kotlin.coroutines.Continuation r8 = (kotlin.coroutines.Continuation) r8
                kotlin.Result$Companion r9 = kotlin.Result.Companion
                r9 = r7
                kotlinx.coroutines.channels.Closed r9 = (kotlinx.coroutines.channels.Closed) r9
                java.lang.Throwable r9 = r9.getReceiveException()
                java.lang.Object r9 = kotlin.ResultKt.createFailure(r9)
                java.lang.Object r9 = kotlin.Result.m8669constructorimpl(r9)
                r8.resumeWith(r9)
            L66:
                goto L84
            L67:
                kotlinx.coroutines.internal.Symbol r8 = kotlinx.coroutines.channels.AbstractChannelKt.POLL_FAILED
                if (r7 == r8) goto L14
                r8 = 1
                java.lang.Boolean r8 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r8)
                kotlinx.coroutines.channels.AbstractChannel<E> r9 = r11.channel
                kotlin.jvm.functions.Function1<E, kotlin.Unit> r9 = r9.onUndeliveredElement
                if (r9 != 0) goto L78
                r9 = 0
                goto L80
            L78:
                kotlin.coroutines.CoroutineContext r10 = r4.getContext()
                kotlin.jvm.functions.Function1 r9 = kotlinx.coroutines.internal.OnUndeliveredElementKt.bindCancellationFun(r9, r7, r10)
            L80:
                r4.resume(r8, r9)
            L84:
                java.lang.Object r1 = r3.getResult()
                java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                if (r1 != r2) goto L91
                kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r12)
            L91:
                return r1
        }

        public final java.lang.Object getResult() {
                r1 = this;
                java.lang.Object r0 = r1.result
                return r0
        }

        @Override // kotlinx.coroutines.channels.ChannelIterator
        public java.lang.Object hasNext(kotlin.coroutines.Continuation<? super java.lang.Boolean> r3) {
                r2 = this;
                java.lang.Object r0 = r2.getResult()
                kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.channels.AbstractChannelKt.POLL_FAILED
                if (r0 == r1) goto L15
                java.lang.Object r0 = r2.getResult()
                boolean r0 = r2.hasNextResult(r0)
                java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r0)
                return r0
            L15:
                kotlinx.coroutines.channels.AbstractChannel<E> r0 = r2.channel
                java.lang.Object r0 = r0.pollInternal()
                r2.setResult(r0)
                java.lang.Object r0 = r2.getResult()
                kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.channels.AbstractChannelKt.POLL_FAILED
                if (r0 == r1) goto L33
                java.lang.Object r0 = r2.getResult()
                boolean r0 = r2.hasNextResult(r0)
                java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r0)
                return r0
            L33:
                java.lang.Object r0 = r2.hasNextSuspend(r3)
                return r0
        }

        @Override // kotlinx.coroutines.channels.ChannelIterator
        public E next() {
                r3 = this;
                java.lang.Object r0 = r3.result
                boolean r1 = r0 instanceof kotlinx.coroutines.channels.Closed
                if (r1 != 0) goto L17
                kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.channels.AbstractChannelKt.POLL_FAILED
                if (r0 == r1) goto Lf
                kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.channels.AbstractChannelKt.POLL_FAILED
                r3.result = r1
                return r0
            Lf:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "'hasNext' should be called prior to 'next' invocation"
                r1.<init>(r2)
                throw r1
            L17:
                r1 = r0
                kotlinx.coroutines.channels.Closed r1 = (kotlinx.coroutines.channels.Closed) r1
                java.lang.Throwable r1 = r1.getReceiveException()
                java.lang.Throwable r1 = kotlinx.coroutines.internal.StackTraceRecoveryKt.recoverStackTrace(r1)
                throw r1
        }

        @Override // kotlinx.coroutines.channels.ChannelIterator
        @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Since 1.3.0, binary compatibility with versions <= 1.2.x")
        public /* synthetic */ java.lang.Object next(kotlin.coroutines.Continuation r2) {
                r1 = this;
                r0 = r1
                kotlinx.coroutines.channels.ChannelIterator r0 = (kotlinx.coroutines.channels.ChannelIterator) r0
                java.lang.Object r0 = kotlinx.coroutines.channels.ChannelIterator.DefaultImpls.next(r0, r2)
                return r0
        }

        public final void setResult(java.lang.Object r1) {
                r0 = this;
                r0.result = r1
                return
        }
    }

    /* JADX INFO: compiled from: AbstractChannel.kt */
    @kotlin.Metadata(m114d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0012\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00002\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u001d\u0012\u000e\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0015\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\fJ\u0014\u0010\r\u001a\u00020\n2\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\u000fH\u0016J\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000b\u001a\u00028\u0001¢\u0006\u0002\u0010\u0011J\b\u0010\u0012\u001a\u00020\u0013H\u0016J!\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u000b\u001a\u00028\u00012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0002\u0010\u0018R\u0018\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, m115d2 = {"Lkotlinx/coroutines/channels/AbstractChannel$ReceiveElement;", "E", "Lkotlinx/coroutines/channels/Receive;", "cont", "Lkotlinx/coroutines/CancellableContinuation;", "", "receiveMode", "", "(Lkotlinx/coroutines/CancellableContinuation;I)V", "completeResumeReceive", "", "value", "(Ljava/lang/Object;)V", "resumeReceiveClosed", "closed", "Lkotlinx/coroutines/channels/Closed;", "resumeValue", "(Ljava/lang/Object;)Ljava/lang/Object;", "toString", "", "tryResumeReceive", "Lkotlinx/coroutines/internal/Symbol;", "otherOp", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$PrepareOp;", "(Ljava/lang/Object;Lkotlinx/coroutines/internal/LockFreeLinkedListNode$PrepareOp;)Lkotlinx/coroutines/internal/Symbol;", "kotlinx-coroutines-core"}, m116k = 1, m117mv = {1, 6, 0}, m119xi = 48)
    private static class ReceiveElement<E> extends kotlinx.coroutines.channels.Receive<E> {
        public final kotlinx.coroutines.CancellableContinuation<java.lang.Object> cont;
        public final int receiveMode;

        public ReceiveElement(kotlinx.coroutines.CancellableContinuation<java.lang.Object> r1, int r2) {
                r0 = this;
                r0.<init>()
                r0.cont = r1
                r0.receiveMode = r2
                return
        }

        @Override // kotlinx.coroutines.channels.ReceiveOrClosed
        public void completeResumeReceive(E r3) {
                r2 = this;
                kotlinx.coroutines.CancellableContinuation<java.lang.Object> r0 = r2.cont
                kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.CancellableContinuationImplKt.RESUME_TOKEN
                r0.completeResume(r1)
                return
        }

        @Override // kotlinx.coroutines.channels.Receive
        public void resumeReceiveClosed(kotlinx.coroutines.channels.Closed<?> r6) {
                r5 = this;
                int r0 = r5.receiveMode
                r1 = 1
                if (r0 != r1) goto L22
                kotlinx.coroutines.CancellableContinuation<java.lang.Object> r0 = r5.cont
                kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
                kotlin.Result$Companion r1 = kotlin.Result.Companion
                r1 = r6
                r2 = 0
                kotlinx.coroutines.channels.ChannelResult$Companion r3 = kotlinx.coroutines.channels.ChannelResult.Companion
                java.lang.Throwable r4 = r1.closeCause
                java.lang.Object r1 = r3.m10192closedJP2dKIU(r4)
                kotlinx.coroutines.channels.ChannelResult r1 = kotlinx.coroutines.channels.ChannelResult.m10179boximpl(r1)
                java.lang.Object r1 = kotlin.Result.m8669constructorimpl(r1)
                r0.resumeWith(r1)
                goto L37
            L22:
                kotlinx.coroutines.CancellableContinuation<java.lang.Object> r0 = r5.cont
                kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
                kotlin.Result$Companion r1 = kotlin.Result.Companion
                java.lang.Throwable r1 = r6.getReceiveException()
                java.lang.Object r1 = kotlin.ResultKt.createFailure(r1)
                java.lang.Object r1 = kotlin.Result.m8669constructorimpl(r1)
                r0.resumeWith(r1)
            L37:
                return
        }

        public final java.lang.Object resumeValue(E r3) {
                r2 = this;
                int r0 = r2.receiveMode
                r1 = 1
                if (r0 != r1) goto L10
                kotlinx.coroutines.channels.ChannelResult$Companion r0 = kotlinx.coroutines.channels.ChannelResult.Companion
                java.lang.Object r0 = r0.m10194successJP2dKIU(r3)
                kotlinx.coroutines.channels.ChannelResult r0 = kotlinx.coroutines.channels.ChannelResult.m10179boximpl(r0)
                goto L11
            L10:
                r0 = r3
            L11:
                return r0
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode
        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "ReceiveElement@"
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = kotlinx.coroutines.DebugStringsKt.getHexAddress(r2)
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = "[receiveMode="
                java.lang.StringBuilder r0 = r0.append(r1)
                int r1 = r2.receiveMode
                java.lang.StringBuilder r0 = r0.append(r1)
                r1 = 93
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }

        @Override // kotlinx.coroutines.channels.ReceiveOrClosed
        public kotlinx.coroutines.internal.Symbol tryResumeReceive(E r6, kotlinx.coroutines.internal.LockFreeLinkedListNode.PrepareOp r7) {
                r5 = this;
                kotlinx.coroutines.CancellableContinuation<java.lang.Object> r0 = r5.cont
                java.lang.Object r1 = r5.resumeValue(r6)
                r2 = 0
                if (r7 != 0) goto Lb
                r3 = r2
                goto Ld
            Lb:
                kotlinx.coroutines.internal.LockFreeLinkedListNode$AbstractAtomicDesc r3 = r7.desc
            Ld:
                kotlin.jvm.functions.Function1 r4 = r5.resumeOnCancellationFun(r6)
                java.lang.Object r0 = r0.tryResume(r1, r3, r4)
                if (r0 != 0) goto L18
                return r2
            L18:
                boolean r1 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
                if (r1 == 0) goto L2f
                r1 = 0
                kotlinx.coroutines.internal.Symbol r2 = kotlinx.coroutines.CancellableContinuationImplKt.RESUME_TOKEN
                if (r0 != r2) goto L25
                r2 = 1
                goto L26
            L25:
                r2 = 0
            L26:
                if (r2 == 0) goto L29
                goto L2f
            L29:
                java.lang.AssertionError r1 = new java.lang.AssertionError
                r1.<init>()
                throw r1
            L2f:
                if (r7 != 0) goto L32
                goto L35
            L32:
                r7.finishPrepare()
            L35:
                kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.CancellableContinuationImplKt.RESUME_TOKEN
                return r1
        }
    }

    /* JADX INFO: compiled from: AbstractChannel.kt */
    @kotlin.Metadata(m114d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\b\u0002\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00002\b\u0012\u0004\u0012\u0002H\u00010\u0002B;\u0012\u000e\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u001c\u0010\b\u001a\u0018\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00028\u0001`\u000b¢\u0006\u0002\u0010\fJ#\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\u0006\u0010\u000f\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u0010R&\u0010\b\u001a\u0018\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00028\u0001`\u000b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m115d2 = {"Lkotlinx/coroutines/channels/AbstractChannel$ReceiveElementWithUndeliveredHandler;", "E", "Lkotlinx/coroutines/channels/AbstractChannel$ReceiveElement;", "cont", "Lkotlinx/coroutines/CancellableContinuation;", "", "receiveMode", "", "onUndeliveredElement", "Lkotlin/Function1;", "", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "(Lkotlinx/coroutines/CancellableContinuation;ILkotlin/jvm/functions/Function1;)V", "resumeOnCancellationFun", "", "value", "(Ljava/lang/Object;)Lkotlin/jvm/functions/Function1;", "kotlinx-coroutines-core"}, m116k = 1, m117mv = {1, 6, 0}, m119xi = 48)
    private static final class ReceiveElementWithUndeliveredHandler<E> extends kotlinx.coroutines.channels.AbstractChannel.ReceiveElement<E> {
        public final kotlin.jvm.functions.Function1<E, kotlin.Unit> onUndeliveredElement;

        public ReceiveElementWithUndeliveredHandler(kotlinx.coroutines.CancellableContinuation<java.lang.Object> r1, int r2, kotlin.jvm.functions.Function1<? super E, kotlin.Unit> r3) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.onUndeliveredElement = r3
                return
        }

        @Override // kotlinx.coroutines.channels.Receive
        public kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit> resumeOnCancellationFun(E r3) {
                r2 = this;
                kotlin.jvm.functions.Function1<E, kotlin.Unit> r0 = r2.onUndeliveredElement
                kotlinx.coroutines.CancellableContinuation<java.lang.Object> r1 = r2.cont
                kotlin.coroutines.CoroutineContext r1 = r1.getContext()
                kotlin.jvm.functions.Function1 r0 = kotlinx.coroutines.internal.OnUndeliveredElementKt.bindCancellationFun(r0, r3, r1)
                return r0
        }
    }

    /* JADX INFO: compiled from: AbstractChannel.kt */
    @kotlin.Metadata(m114d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0012\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B!\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\u0010\bJ\u0015\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\fJ#\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u000e2\u0006\u0010\u000b\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u0010J\u0014\u0010\u0011\u001a\u00020\n2\n\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0015H\u0016J!\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u000b\u001a\u00028\u00012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0002\u0010\u001aR\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, m115d2 = {"Lkotlinx/coroutines/channels/AbstractChannel$ReceiveHasNext;", "E", "Lkotlinx/coroutines/channels/Receive;", "iterator", "Lkotlinx/coroutines/channels/AbstractChannel$Itr;", "cont", "Lkotlinx/coroutines/CancellableContinuation;", "", "(Lkotlinx/coroutines/channels/AbstractChannel$Itr;Lkotlinx/coroutines/CancellableContinuation;)V", "completeResumeReceive", "", "value", "(Ljava/lang/Object;)V", "resumeOnCancellationFun", "Lkotlin/Function1;", "", "(Ljava/lang/Object;)Lkotlin/jvm/functions/Function1;", "resumeReceiveClosed", "closed", "Lkotlinx/coroutines/channels/Closed;", "toString", "", "tryResumeReceive", "Lkotlinx/coroutines/internal/Symbol;", "otherOp", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$PrepareOp;", "(Ljava/lang/Object;Lkotlinx/coroutines/internal/LockFreeLinkedListNode$PrepareOp;)Lkotlinx/coroutines/internal/Symbol;", "kotlinx-coroutines-core"}, m116k = 1, m117mv = {1, 6, 0}, m119xi = 48)
    private static class ReceiveHasNext<E> extends kotlinx.coroutines.channels.Receive<E> {
        public final kotlinx.coroutines.CancellableContinuation<java.lang.Boolean> cont;
        public final kotlinx.coroutines.channels.AbstractChannel.Itr<E> iterator;

        public ReceiveHasNext(kotlinx.coroutines.channels.AbstractChannel.Itr<E> r1, kotlinx.coroutines.CancellableContinuation<? super java.lang.Boolean> r2) {
                r0 = this;
                r0.<init>()
                r0.iterator = r1
                r0.cont = r2
                return
        }

        @Override // kotlinx.coroutines.channels.ReceiveOrClosed
        public void completeResumeReceive(E r3) {
                r2 = this;
                kotlinx.coroutines.channels.AbstractChannel$Itr<E> r0 = r2.iterator
                r0.setResult(r3)
                kotlinx.coroutines.CancellableContinuation<java.lang.Boolean> r0 = r2.cont
                kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.CancellableContinuationImplKt.RESUME_TOKEN
                r0.completeResume(r1)
                return
        }

        @Override // kotlinx.coroutines.channels.Receive
        public kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit> resumeOnCancellationFun(E r3) {
                r2 = this;
                kotlinx.coroutines.channels.AbstractChannel$Itr<E> r0 = r2.iterator
                kotlinx.coroutines.channels.AbstractChannel<E> r0 = r0.channel
                kotlin.jvm.functions.Function1<E, kotlin.Unit> r0 = r0.onUndeliveredElement
                if (r0 != 0) goto La
                r0 = 0
                goto L14
            La:
                kotlinx.coroutines.CancellableContinuation<java.lang.Boolean> r1 = r2.cont
                kotlin.coroutines.CoroutineContext r1 = r1.getContext()
                kotlin.jvm.functions.Function1 r0 = kotlinx.coroutines.internal.OnUndeliveredElementKt.bindCancellationFun(r0, r3, r1)
            L14:
                return r0
        }

        @Override // kotlinx.coroutines.channels.Receive
        public void resumeReceiveClosed(kotlinx.coroutines.channels.Closed<?> r5) {
                r4 = this;
                java.lang.Throwable r0 = r5.closeCause
                if (r0 != 0) goto L12
                kotlinx.coroutines.CancellableContinuation<java.lang.Boolean> r0 = r4.cont
                r1 = 0
                java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
                r2 = 2
                r3 = 0
                java.lang.Object r0 = kotlinx.coroutines.CancellableContinuation.DefaultImpls.tryResume$default(r0, r1, r3, r2, r3)
                goto L1c
            L12:
                kotlinx.coroutines.CancellableContinuation<java.lang.Boolean> r0 = r4.cont
                java.lang.Throwable r1 = r5.getReceiveException()
                java.lang.Object r0 = r0.tryResumeWithException(r1)
            L1c:
                if (r0 == 0) goto L29
                kotlinx.coroutines.channels.AbstractChannel$Itr<E> r1 = r4.iterator
                r1.setResult(r5)
                kotlinx.coroutines.CancellableContinuation<java.lang.Boolean> r1 = r4.cont
                r1.completeResume(r0)
            L29:
                return
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode
        public java.lang.String toString() {
                r2 = this;
                java.lang.String r0 = "ReceiveHasNext@"
                java.lang.String r1 = kotlinx.coroutines.DebugStringsKt.getHexAddress(r2)
                java.lang.String r0 = kotlin.jvm.internal.Intrinsics.stringPlus(r0, r1)
                return r0
        }

        @Override // kotlinx.coroutines.channels.ReceiveOrClosed
        public kotlinx.coroutines.internal.Symbol tryResumeReceive(E r7, kotlinx.coroutines.internal.LockFreeLinkedListNode.PrepareOp r8) {
                r6 = this;
                kotlinx.coroutines.CancellableContinuation<java.lang.Boolean> r0 = r6.cont
                r1 = 1
                java.lang.Boolean r2 = java.lang.Boolean.valueOf(r1)
                r3 = 0
                if (r8 != 0) goto Lc
                r4 = r3
                goto Le
            Lc:
                kotlinx.coroutines.internal.LockFreeLinkedListNode$AbstractAtomicDesc r4 = r8.desc
            Le:
                kotlin.jvm.functions.Function1 r5 = r6.resumeOnCancellationFun(r7)
                java.lang.Object r0 = r0.tryResume(r2, r4, r5)
                if (r0 != 0) goto L19
                return r3
            L19:
                boolean r2 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
                if (r2 == 0) goto L2f
                r2 = 0
                kotlinx.coroutines.internal.Symbol r3 = kotlinx.coroutines.CancellableContinuationImplKt.RESUME_TOKEN
                if (r0 != r3) goto L25
                goto L26
            L25:
                r1 = 0
            L26:
                if (r1 == 0) goto L29
                goto L2f
            L29:
                java.lang.AssertionError r1 = new java.lang.AssertionError
                r1.<init>()
                throw r1
            L2f:
                if (r8 != 0) goto L32
                goto L35
            L32:
                r8.finishPrepare()
            L35:
                kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.CancellableContinuationImplKt.RESUME_TOKEN
                return r1
        }
    }

    /* JADX INFO: compiled from: AbstractChannel.kt */
    @kotlin.Metadata(m114d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u0001*\u0004\b\u0002\u0010\u00022\b\u0012\u0004\u0012\u0002H\u00020\u00032\u00020\u0004BR\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\b\u0012$\u0010\t\u001a \b\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\f\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n\u0012\u0006\u0010\r\u001a\u00020\u000eø\u0001\u0000¢\u0006\u0002\u0010\u000fJ\u0015\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00028\u0002H\u0016¢\u0006\u0002\u0010\u0014J\b\u0010\u0015\u001a\u00020\u0012H\u0016J#\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00172\u0006\u0010\u0013\u001a\u00028\u0002H\u0016¢\u0006\u0002\u0010\u0019J\u0014\u0010\u001a\u001a\u00020\u00122\n\u0010\u001b\u001a\u0006\u0012\u0002\b\u00030\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u001eH\u0016J!\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010\u0013\u001a\u00028\u00022\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016¢\u0006\u0002\u0010#R3\u0010\t\u001a \b\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\f\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n8\u0006X\u0087\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0010R\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006$"}, m115d2 = {"Lkotlinx/coroutines/channels/AbstractChannel$ReceiveSelect;", "R", "E", "Lkotlinx/coroutines/channels/Receive;", "Lkotlinx/coroutines/DisposableHandle;", "channel", "Lkotlinx/coroutines/channels/AbstractChannel;", "select", "Lkotlinx/coroutines/selects/SelectInstance;", "block", "Lkotlin/Function2;", "", "Lkotlin/coroutines/Continuation;", "receiveMode", "", "(Lkotlinx/coroutines/channels/AbstractChannel;Lkotlinx/coroutines/selects/SelectInstance;Lkotlin/jvm/functions/Function2;I)V", "Lkotlin/jvm/functions/Function2;", "completeResumeReceive", "", "value", "(Ljava/lang/Object;)V", "dispose", "resumeOnCancellationFun", "Lkotlin/Function1;", "", "(Ljava/lang/Object;)Lkotlin/jvm/functions/Function1;", "resumeReceiveClosed", "closed", "Lkotlinx/coroutines/channels/Closed;", "toString", "", "tryResumeReceive", "Lkotlinx/coroutines/internal/Symbol;", "otherOp", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$PrepareOp;", "(Ljava/lang/Object;Lkotlinx/coroutines/internal/LockFreeLinkedListNode$PrepareOp;)Lkotlinx/coroutines/internal/Symbol;", "kotlinx-coroutines-core"}, m116k = 1, m117mv = {1, 6, 0}, m119xi = 48)
    private static final class ReceiveSelect<R, E> extends kotlinx.coroutines.channels.Receive<E> implements kotlinx.coroutines.DisposableHandle {
        public final kotlin.jvm.functions.Function2<java.lang.Object, kotlin.coroutines.Continuation<? super R>, java.lang.Object> block;
        public final kotlinx.coroutines.channels.AbstractChannel<E> channel;
        public final int receiveMode;
        public final kotlinx.coroutines.selects.SelectInstance<R> select;

        public ReceiveSelect(kotlinx.coroutines.channels.AbstractChannel<E> r1, kotlinx.coroutines.selects.SelectInstance<? super R> r2, kotlin.jvm.functions.Function2<java.lang.Object, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> r3, int r4) {
                r0 = this;
                r0.<init>()
                r0.channel = r1
                r0.select = r2
                r0.block = r3
                r0.receiveMode = r4
                return
        }

        @Override // kotlinx.coroutines.channels.ReceiveOrClosed
        public void completeResumeReceive(E r5) {
                r4 = this;
                kotlin.jvm.functions.Function2<java.lang.Object, kotlin.coroutines.Continuation<? super R>, java.lang.Object> r0 = r4.block
                int r1 = r4.receiveMode
                r2 = 1
                if (r1 != r2) goto L12
                kotlinx.coroutines.channels.ChannelResult$Companion r1 = kotlinx.coroutines.channels.ChannelResult.Companion
                java.lang.Object r1 = r1.m10194successJP2dKIU(r5)
                kotlinx.coroutines.channels.ChannelResult r1 = kotlinx.coroutines.channels.ChannelResult.m10179boximpl(r1)
                goto L13
            L12:
                r1 = r5
            L13:
                kotlinx.coroutines.selects.SelectInstance<R> r2 = r4.select
                kotlin.coroutines.Continuation r2 = r2.getCompletion()
                kotlin.jvm.functions.Function1 r3 = r4.resumeOnCancellationFun(r5)
                kotlinx.coroutines.intrinsics.CancellableKt.startCoroutineCancellable(r0, r1, r2, r3)
                return
        }

        @Override // kotlinx.coroutines.DisposableHandle
        public void dispose() {
                r1 = this;
                boolean r0 = r1.mo10219remove()
                if (r0 == 0) goto Lb
                kotlinx.coroutines.channels.AbstractChannel<E> r0 = r1.channel
                r0.onReceiveDequeued()
            Lb:
                return
        }

        @Override // kotlinx.coroutines.channels.Receive
        public kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit> resumeOnCancellationFun(E r3) {
                r2 = this;
                kotlinx.coroutines.channels.AbstractChannel<E> r0 = r2.channel
                kotlin.jvm.functions.Function1<E, kotlin.Unit> r0 = r0.onUndeliveredElement
                if (r0 != 0) goto L8
                r0 = 0
                goto L16
            L8:
                kotlinx.coroutines.selects.SelectInstance<R> r1 = r2.select
                kotlin.coroutines.Continuation r1 = r1.getCompletion()
                kotlin.coroutines.CoroutineContext r1 = r1.getContext()
                kotlin.jvm.functions.Function1 r0 = kotlinx.coroutines.internal.OnUndeliveredElementKt.bindCancellationFun(r0, r3, r1)
            L16:
                return r0
        }

        @Override // kotlinx.coroutines.channels.Receive
        public void resumeReceiveClosed(kotlinx.coroutines.channels.Closed<?> r8) {
                r7 = this;
                kotlinx.coroutines.selects.SelectInstance<R> r0 = r7.select
                boolean r0 = r0.trySelect()
                if (r0 != 0) goto L9
                return
            L9:
                int r0 = r7.receiveMode
                switch(r0) {
                    case 0: goto L2a;
                    case 1: goto Lf;
                    default: goto Le;
                }
            Le:
                goto L33
            Lf:
                kotlin.jvm.functions.Function2<java.lang.Object, kotlin.coroutines.Continuation<? super R>, java.lang.Object> r1 = r7.block
                kotlinx.coroutines.channels.ChannelResult$Companion r0 = kotlinx.coroutines.channels.ChannelResult.Companion
                java.lang.Throwable r2 = r8.closeCause
                java.lang.Object r0 = r0.m10192closedJP2dKIU(r2)
                kotlinx.coroutines.channels.ChannelResult r2 = kotlinx.coroutines.channels.ChannelResult.m10179boximpl(r0)
                kotlinx.coroutines.selects.SelectInstance<R> r0 = r7.select
                kotlin.coroutines.Continuation r3 = r0.getCompletion()
                r5 = 4
                r6 = 0
                r4 = 0
                kotlinx.coroutines.intrinsics.CancellableKt.startCoroutineCancellable$default(r1, r2, r3, r4, r5, r6)
                goto L33
            L2a:
                kotlinx.coroutines.selects.SelectInstance<R> r0 = r7.select
                java.lang.Throwable r1 = r8.getReceiveException()
                r0.resumeSelectWithException(r1)
            L33:
                return
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode
        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "ReceiveSelect@"
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = kotlinx.coroutines.DebugStringsKt.getHexAddress(r2)
                java.lang.StringBuilder r0 = r0.append(r1)
                r1 = 91
                java.lang.StringBuilder r0 = r0.append(r1)
                kotlinx.coroutines.selects.SelectInstance<R> r1 = r2.select
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = ",receiveMode="
                java.lang.StringBuilder r0 = r0.append(r1)
                int r1 = r2.receiveMode
                java.lang.StringBuilder r0 = r0.append(r1)
                r1 = 93
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }

        @Override // kotlinx.coroutines.channels.ReceiveOrClosed
        public kotlinx.coroutines.internal.Symbol tryResumeReceive(E r2, kotlinx.coroutines.internal.LockFreeLinkedListNode.PrepareOp r3) {
                r1 = this;
                kotlinx.coroutines.selects.SelectInstance<R> r0 = r1.select
                java.lang.Object r0 = r0.trySelectOther(r3)
                kotlinx.coroutines.internal.Symbol r0 = (kotlinx.coroutines.internal.Symbol) r0
                return r0
        }
    }

    /* JADX INFO: compiled from: AbstractChannel.kt */
    @kotlin.Metadata(m114d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\u0002\u0010\u0004J\u0013\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0096\u0002J\b\u0010\t\u001a\u00020\nH\u0016R\u0012\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m115d2 = {"Lkotlinx/coroutines/channels/AbstractChannel$RemoveReceiveOnCancel;", "Lkotlinx/coroutines/BeforeResumeCancelHandler;", "receive", "Lkotlinx/coroutines/channels/Receive;", "(Lkotlinx/coroutines/channels/AbstractChannel;Lkotlinx/coroutines/channels/Receive;)V", "invoke", "", "cause", "", "toString", "", "kotlinx-coroutines-core"}, m116k = 1, m117mv = {1, 6, 0}, m119xi = 48)
    private final class RemoveReceiveOnCancel extends kotlinx.coroutines.BeforeResumeCancelHandler {
        private final kotlinx.coroutines.channels.Receive<?> receive;
        final /* synthetic */ kotlinx.coroutines.channels.AbstractChannel<E> this$0;

        public RemoveReceiveOnCancel(kotlinx.coroutines.channels.AbstractChannel r1, kotlinx.coroutines.channels.Receive<?> r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.receive = r2
                return
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.Throwable r2) {
                r1 = this;
                r0 = r2
                java.lang.Throwable r0 = (java.lang.Throwable) r0
                r1.invoke2(r0)
                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                return r0
        }

        @Override // kotlinx.coroutines.CancelHandlerBase
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public void invoke2(java.lang.Throwable r2) {
                r1 = this;
                kotlinx.coroutines.channels.Receive<?> r0 = r1.receive
                boolean r0 = r0.mo10219remove()
                if (r0 == 0) goto Ld
                kotlinx.coroutines.channels.AbstractChannel<E> r0 = r1.this$0
                r0.onReceiveDequeued()
            Ld:
                return
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "RemoveReceiveOnCancel["
                java.lang.StringBuilder r0 = r0.append(r1)
                kotlinx.coroutines.channels.Receive<?> r1 = r2.receive
                java.lang.StringBuilder r0 = r0.append(r1)
                r1 = 93
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    /* JADX INFO: compiled from: AbstractChannel.kt */
    @kotlin.Metadata(m114d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0004\u0018\u0000*\u0004\b\u0001\u0010\u00012\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u0004B\r\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000bH\u0014J\u0016\u0010\f\u001a\u0004\u0018\u00010\t2\n\u0010\r\u001a\u00060\u000ej\u0002`\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\u0012"}, m115d2 = {"Lkotlinx/coroutines/channels/AbstractChannel$TryPollDesc;", "E", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$RemoveFirstDesc;", "Lkotlinx/coroutines/channels/Send;", "Lkotlinx/coroutines/internal/RemoveFirstDesc;", "queue", "Lkotlinx/coroutines/internal/LockFreeLinkedListHead;", "(Lkotlinx/coroutines/internal/LockFreeLinkedListHead;)V", "failure", "", "affected", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "onPrepare", "prepareOp", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$PrepareOp;", "Lkotlinx/coroutines/internal/PrepareOp;", "onRemoved", "", "kotlinx-coroutines-core"}, m116k = 1, m117mv = {1, 6, 0}, m119xi = 48)
    protected static final class TryPollDesc<E> extends kotlinx.coroutines.internal.LockFreeLinkedListNode.RemoveFirstDesc<kotlinx.coroutines.channels.Send> {
        public TryPollDesc(kotlinx.coroutines.internal.LockFreeLinkedListHead r2) {
                r1 = this;
                r0 = r2
                kotlinx.coroutines.internal.LockFreeLinkedListNode r0 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r0
                r1.<init>(r0)
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
                boolean r0 = r2 instanceof kotlinx.coroutines.channels.Send
                if (r0 != 0) goto Le
                kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.channels.AbstractChannelKt.POLL_FAILED
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
                kotlinx.coroutines.channels.Send r0 = (kotlinx.coroutines.channels.Send) r0
                kotlinx.coroutines.internal.Symbol r1 = r0.tryResumeSend(r5)
                if (r1 != 0) goto Ld
                java.lang.Object r1 = kotlinx.coroutines.internal.LockFreeLinkedList_commonKt.REMOVE_PREPARED
                return r1
            Ld:
                java.lang.Object r2 = kotlinx.coroutines.internal.AtomicKt.RETRY_ATOMIC
                if (r1 != r2) goto L14
                java.lang.Object r2 = kotlinx.coroutines.internal.AtomicKt.RETRY_ATOMIC
                return r2
            L14:
                boolean r2 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
                if (r2 == 0) goto L2b
                r2 = 0
                kotlinx.coroutines.internal.Symbol r3 = kotlinx.coroutines.CancellableContinuationImplKt.RESUME_TOKEN
                if (r1 != r3) goto L21
                r3 = 1
                goto L22
            L21:
                r3 = 0
            L22:
                if (r3 == 0) goto L25
                goto L2b
            L25:
                java.lang.AssertionError r2 = new java.lang.AssertionError
                r2.<init>()
                throw r2
            L2b:
                r2 = 0
                return r2
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode.AbstractAtomicDesc
        public void onRemoved(kotlinx.coroutines.internal.LockFreeLinkedListNode r2) {
                r1 = this;
                r0 = r2
                kotlinx.coroutines.channels.Send r0 = (kotlinx.coroutines.channels.Send) r0
                r0.undeliveredElement()
                return
        }
    }

    public AbstractChannel(kotlin.jvm.functions.Function1<? super E, kotlin.Unit> r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public static final /* synthetic */ boolean access$enqueueReceive(kotlinx.coroutines.channels.AbstractChannel r1, kotlinx.coroutines.channels.Receive r2) {
            boolean r0 = r1.enqueueReceive(r2)
            return r0
    }

    public static final /* synthetic */ java.lang.Object access$receiveSuspend(kotlinx.coroutines.channels.AbstractChannel r1, int r2, kotlin.coroutines.Continuation r3) {
            java.lang.Object r0 = r1.receiveSuspend(r2, r3)
            return r0
    }

    public static final /* synthetic */ void access$registerSelectReceiveMode(kotlinx.coroutines.channels.AbstractChannel r0, kotlinx.coroutines.selects.SelectInstance r1, int r2, kotlin.jvm.functions.Function2 r3) {
            r0.registerSelectReceiveMode(r1, r2, r3)
            return
    }

    public static final /* synthetic */ void access$removeReceiveOnCancel(kotlinx.coroutines.channels.AbstractChannel r0, kotlinx.coroutines.CancellableContinuation r1, kotlinx.coroutines.channels.Receive r2) {
            r0.removeReceiveOnCancel(r1, r2)
            return
    }

    private final boolean enqueueReceive(kotlinx.coroutines.channels.Receive<? super E> r4) {
            r3 = this;
            boolean r0 = r3.enqueueReceiveInternal(r4)
            r1 = r0
            r2 = 0
            if (r1 == 0) goto Lb
            r3.onReceiveEnqueued()
        Lb:
            return r0
    }

    private final <R> boolean enqueueReceiveSelect(kotlinx.coroutines.selects.SelectInstance<? super R> r4, kotlin.jvm.functions.Function2<java.lang.Object, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> r5, int r6) {
            r3 = this;
            kotlinx.coroutines.channels.AbstractChannel$ReceiveSelect r0 = new kotlinx.coroutines.channels.AbstractChannel$ReceiveSelect
            r0.<init>(r3, r4, r5, r6)
            r1 = r0
            kotlinx.coroutines.channels.Receive r1 = (kotlinx.coroutines.channels.Receive) r1
            boolean r1 = r3.enqueueReceive(r1)
            if (r1 == 0) goto L14
            r2 = r0
            kotlinx.coroutines.DisposableHandle r2 = (kotlinx.coroutines.DisposableHandle) r2
            r4.disposeOnSelect(r2)
        L14:
            return r1
    }

    private final <R> java.lang.Object receiveSuspend(int r11, kotlin.coroutines.Continuation<? super R> r12) {
            r10 = this;
            r0 = 0
            r1 = r12
            r2 = 0
            kotlin.coroutines.Continuation r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(r1)
            kotlinx.coroutines.CancellableContinuationImpl r3 = kotlinx.coroutines.CancellableContinuationKt.getOrCreateCancellableContinuation(r3)
            r4 = r3
            kotlinx.coroutines.CancellableContinuation r4 = (kotlinx.coroutines.CancellableContinuation) r4
            r5 = 0
            kotlin.jvm.functions.Function1<E, kotlin.Unit> r6 = r10.onUndeliveredElement
            if (r6 != 0) goto L19
            kotlinx.coroutines.channels.AbstractChannel$ReceiveElement r6 = new kotlinx.coroutines.channels.AbstractChannel$ReceiveElement
            r6.<init>(r4, r11)
            goto L22
        L19:
            kotlinx.coroutines.channels.AbstractChannel$ReceiveElementWithUndeliveredHandler r6 = new kotlinx.coroutines.channels.AbstractChannel$ReceiveElementWithUndeliveredHandler
            kotlin.jvm.functions.Function1<E, kotlin.Unit> r7 = r10.onUndeliveredElement
            r6.<init>(r4, r11, r7)
            kotlinx.coroutines.channels.AbstractChannel$ReceiveElement r6 = (kotlinx.coroutines.channels.AbstractChannel.ReceiveElement) r6
        L22:
        L23:
            r7 = r6
            kotlinx.coroutines.channels.Receive r7 = (kotlinx.coroutines.channels.Receive) r7
            boolean r7 = access$enqueueReceive(r10, r7)
            if (r7 == 0) goto L34
            r7 = r6
            kotlinx.coroutines.channels.Receive r7 = (kotlinx.coroutines.channels.Receive) r7
            access$removeReceiveOnCancel(r10, r4, r7)
            goto L53
        L34:
            java.lang.Object r7 = r10.pollInternal()
            boolean r8 = r7 instanceof kotlinx.coroutines.channels.Closed
            if (r8 == 0) goto L43
            r8 = r7
            kotlinx.coroutines.channels.Closed r8 = (kotlinx.coroutines.channels.Closed) r8
            r6.resumeReceiveClosed(r8)
            goto L53
        L43:
            kotlinx.coroutines.internal.Symbol r8 = kotlinx.coroutines.channels.AbstractChannelKt.POLL_FAILED
            if (r7 == r8) goto L23
            java.lang.Object r8 = r6.resumeValue(r7)
            kotlin.jvm.functions.Function1 r9 = r6.resumeOnCancellationFun(r7)
            r4.resume(r8, r9)
        L53:
            java.lang.Object r1 = r3.getResult()
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r1 != r2) goto L60
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r12)
        L60:
            return r1
    }

    private final <R> void registerSelectReceiveMode(kotlinx.coroutines.selects.SelectInstance<? super R> r3, int r4, kotlin.jvm.functions.Function2<java.lang.Object, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> r5) {
            r2 = this;
        L1:
            boolean r0 = r3.isSelected()
            if (r0 == 0) goto L9
            return
        L9:
            boolean r0 = r2.isEmptyImpl()
            if (r0 == 0) goto L16
            boolean r0 = r2.enqueueReceiveSelect(r3, r5, r4)
            if (r0 == 0) goto L1
            return
        L16:
            java.lang.Object r0 = r2.pollSelectInternal(r3)
            java.lang.Object r1 = kotlinx.coroutines.selects.SelectKt.getALREADY_SELECTED()
            if (r0 != r1) goto L22
            return
        L22:
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.channels.AbstractChannelKt.POLL_FAILED
            if (r0 != r1) goto L27
            goto L1
        L27:
            java.lang.Object r1 = kotlinx.coroutines.internal.AtomicKt.RETRY_ATOMIC
            if (r0 != r1) goto L2c
            goto L1
        L2c:
            r2.tryStartBlockUnintercepted(r5, r3, r4, r0)
            goto L1
    }

    private final void removeReceiveOnCancel(kotlinx.coroutines.CancellableContinuation<?> r3, kotlinx.coroutines.channels.Receive<?> r4) {
            r2 = this;
            kotlinx.coroutines.channels.AbstractChannel$RemoveReceiveOnCancel r0 = new kotlinx.coroutines.channels.AbstractChannel$RemoveReceiveOnCancel
            r0.<init>(r2, r4)
            kotlinx.coroutines.CancelHandlerBase r0 = (kotlinx.coroutines.CancelHandlerBase) r0
            r1 = 0
            kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0
            r3.invokeOnCancellation(r0)
            return
    }

    private final <R> void tryStartBlockUnintercepted(kotlin.jvm.functions.Function2<java.lang.Object, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> r5, kotlinx.coroutines.selects.SelectInstance<? super R> r6, int r7, java.lang.Object r8) {
            r4 = this;
            boolean r0 = r8 instanceof kotlinx.coroutines.channels.Closed
            if (r0 == 0) goto L34
            switch(r7) {
                case 0: goto L27;
                case 1: goto L9;
                default: goto L8;
            }
        L8:
            goto L33
        L9:
            boolean r0 = r6.trySelect()
            if (r0 != 0) goto L10
            return
        L10:
            kotlinx.coroutines.channels.ChannelResult$Companion r0 = kotlinx.coroutines.channels.ChannelResult.Companion
            r1 = r8
            kotlinx.coroutines.channels.Closed r1 = (kotlinx.coroutines.channels.Closed) r1
            java.lang.Throwable r1 = r1.closeCause
            java.lang.Object r0 = r0.m10192closedJP2dKIU(r1)
            kotlinx.coroutines.channels.ChannelResult r0 = kotlinx.coroutines.channels.ChannelResult.m10179boximpl(r0)
            kotlin.coroutines.Continuation r1 = r6.getCompletion()
            kotlinx.coroutines.intrinsics.UndispatchedKt.startCoroutineUnintercepted(r5, r0, r1)
            goto L33
        L27:
            r0 = r8
            kotlinx.coroutines.channels.Closed r0 = (kotlinx.coroutines.channels.Closed) r0
            java.lang.Throwable r0 = r0.getReceiveException()
            java.lang.Throwable r0 = kotlinx.coroutines.internal.StackTraceRecoveryKt.recoverStackTrace(r0)
            throw r0
        L33:
            goto L62
        L34:
            r0 = 1
            if (r7 != r0) goto L5b
            r0 = r8
            r1 = 0
            boolean r2 = r0 instanceof kotlinx.coroutines.channels.Closed
            if (r2 == 0) goto L49
            kotlinx.coroutines.channels.ChannelResult$Companion r2 = kotlinx.coroutines.channels.ChannelResult.Companion
            r3 = r0
            kotlinx.coroutines.channels.Closed r3 = (kotlinx.coroutines.channels.Closed) r3
            java.lang.Throwable r3 = r3.closeCause
            java.lang.Object r2 = r2.m10192closedJP2dKIU(r3)
            goto L4f
        L49:
            kotlinx.coroutines.channels.ChannelResult$Companion r2 = kotlinx.coroutines.channels.ChannelResult.Companion
            java.lang.Object r2 = r2.m10194successJP2dKIU(r0)
        L4f:
            kotlinx.coroutines.channels.ChannelResult r0 = kotlinx.coroutines.channels.ChannelResult.m10179boximpl(r2)
            kotlin.coroutines.Continuation r1 = r6.getCompletion()
            kotlinx.coroutines.intrinsics.UndispatchedKt.startCoroutineUnintercepted(r5, r0, r1)
            goto L62
        L5b:
            kotlin.coroutines.Continuation r0 = r6.getCompletion()
            kotlinx.coroutines.intrinsics.UndispatchedKt.startCoroutineUnintercepted(r5, r8, r0)
        L62:
            return
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public /* synthetic */ void cancel() {
            r1 = this;
            r0 = r1
            kotlinx.coroutines.channels.Channel r0 = (kotlinx.coroutines.channels.Channel) r0
            kotlinx.coroutines.channels.Channel.DefaultImpls.cancel(r0)
            return
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public final void cancel(java.util.concurrent.CancellationException r4) {
            r3 = this;
            boolean r0 = r3.isClosedForReceive()
            if (r0 == 0) goto L7
            return
        L7:
            if (r4 != 0) goto L19
            java.util.concurrent.CancellationException r0 = new java.util.concurrent.CancellationException
            java.lang.String r1 = kotlinx.coroutines.DebugStringsKt.getClassSimpleName(r3)
            java.lang.String r2 = " was cancelled"
            java.lang.String r1 = kotlin.jvm.internal.Intrinsics.stringPlus(r1, r2)
            r0.<init>(r1)
            goto L1a
        L19:
            r0 = r4
        L1a:
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            r3.cancelInternal$kotlinx_coroutines_core(r0)
            return
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public final /* synthetic */ boolean cancel(java.lang.Throwable r2) {
            r1 = this;
            boolean r0 = r1.cancelInternal$kotlinx_coroutines_core(r2)
            return r0
    }

    public final boolean cancelInternal$kotlinx_coroutines_core(java.lang.Throwable r4) {
            r3 = this;
            boolean r0 = r3.close(r4)
            r1 = r0
            r2 = 0
            r3.onCancelIdempotent(r1)
            return r0
    }

    protected final kotlinx.coroutines.channels.AbstractChannel.TryPollDesc<E> describeTryPoll() {
            r2 = this;
            kotlinx.coroutines.channels.AbstractChannel$TryPollDesc r0 = new kotlinx.coroutines.channels.AbstractChannel$TryPollDesc
            kotlinx.coroutines.internal.LockFreeLinkedListHead r1 = r2.getQueue()
            r0.<init>(r1)
            return r0
    }

    protected boolean enqueueReceiveInternal(kotlinx.coroutines.channels.Receive<? super E> r10) {
            r9 = this;
            boolean r0 = r9.isBufferAlwaysEmpty()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L26
            kotlinx.coroutines.internal.LockFreeLinkedListHead r0 = r9.getQueue()
            kotlinx.coroutines.internal.LockFreeLinkedListNode r0 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r0
            r3 = 0
        Lf:
            kotlinx.coroutines.internal.LockFreeLinkedListNode r4 = r0.getPrevNode()
            r5 = r4
            r6 = 0
            boolean r7 = r5 instanceof kotlinx.coroutines.channels.Send
            if (r7 == 0) goto L1c
            r1 = r2
            goto L56
        L1c:
            r5 = r10
            kotlinx.coroutines.internal.LockFreeLinkedListNode r5 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r5
            boolean r5 = r4.addNext(r5, r0)
            if (r5 == 0) goto Lf
            goto L56
        L26:
            kotlinx.coroutines.internal.LockFreeLinkedListHead r0 = r9.getQueue()
            kotlinx.coroutines.internal.LockFreeLinkedListNode r0 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r0
            r3 = 0
            r4 = r0
            r5 = 0
            kotlinx.coroutines.channels.AbstractChannel$enqueueReceiveInternal$$inlined$addLastIfPrevAndIf$1 r6 = new kotlinx.coroutines.channels.AbstractChannel$enqueueReceiveInternal$$inlined$addLastIfPrevAndIf$1
            r7 = r10
            kotlinx.coroutines.internal.LockFreeLinkedListNode r7 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r7
            r6.<init>(r7, r9)
            kotlinx.coroutines.internal.LockFreeLinkedListNode$CondAddOp r6 = (kotlinx.coroutines.internal.LockFreeLinkedListNode.CondAddOp) r6
            r4 = r6
        L3b:
            kotlinx.coroutines.internal.LockFreeLinkedListNode r5 = r0.getPrevNode()
            r6 = r5
            r7 = 0
            boolean r8 = r6 instanceof kotlinx.coroutines.channels.Send
            if (r8 == 0) goto L48
            r1 = r2
            goto L56
        L48:
            r6 = r10
            kotlinx.coroutines.internal.LockFreeLinkedListNode r6 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r6
            int r6 = r5.tryCondAddNext(r6, r0, r4)
            switch(r6) {
                case 1: goto L55;
                case 2: goto L53;
                default: goto L52;
            }
        L52:
            goto L3b
        L53:
            r1 = r2
            goto L56
        L55:
        L56:
            return r1
    }

    protected final boolean getHasReceiveOrClosed() {
            r1 = this;
            kotlinx.coroutines.internal.LockFreeLinkedListHead r0 = r1.getQueue()
            kotlinx.coroutines.internal.LockFreeLinkedListNode r0 = r0.getNextNode()
            boolean r0 = r0 instanceof kotlinx.coroutines.channels.ReceiveOrClosed
            return r0
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public final kotlinx.coroutines.selects.SelectClause1<E> getOnReceive() {
            r1 = this;
            kotlinx.coroutines.channels.AbstractChannel$onReceive$1 r0 = new kotlinx.coroutines.channels.AbstractChannel$onReceive$1
            r0.<init>(r1)
            kotlinx.coroutines.selects.SelectClause1 r0 = (kotlinx.coroutines.selects.SelectClause1) r0
            return r0
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public final kotlinx.coroutines.selects.SelectClause1<kotlinx.coroutines.channels.ChannelResult<E>> getOnReceiveCatching() {
            r1 = this;
            kotlinx.coroutines.channels.AbstractChannel$onReceiveCatching$1 r0 = new kotlinx.coroutines.channels.AbstractChannel$onReceiveCatching$1
            r0.<init>(r1)
            kotlinx.coroutines.selects.SelectClause1 r0 = (kotlinx.coroutines.selects.SelectClause1) r0
            return r0
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public kotlinx.coroutines.selects.SelectClause1<E> getOnReceiveOrNull() {
            r1 = this;
            r0 = r1
            kotlinx.coroutines.channels.Channel r0 = (kotlinx.coroutines.channels.Channel) r0
            kotlinx.coroutines.selects.SelectClause1 r0 = kotlinx.coroutines.channels.Channel.DefaultImpls.getOnReceiveOrNull(r0)
            return r0
    }

    protected abstract boolean isBufferAlwaysEmpty();

    protected abstract boolean isBufferEmpty();

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public boolean isClosedForReceive() {
            r1 = this;
            kotlinx.coroutines.channels.Closed r0 = r1.getClosedForReceive()
            if (r0 == 0) goto Le
            boolean r0 = r1.isBufferEmpty()
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public boolean isEmpty() {
            r1 = this;
            boolean r0 = r1.isEmptyImpl()
            return r0
    }

    protected final boolean isEmptyImpl() {
            r1 = this;
            kotlinx.coroutines.internal.LockFreeLinkedListHead r0 = r1.getQueue()
            kotlinx.coroutines.internal.LockFreeLinkedListNode r0 = r0.getNextNode()
            boolean r0 = r0 instanceof kotlinx.coroutines.channels.Send
            if (r0 != 0) goto L14
            boolean r0 = r1.isBufferEmpty()
            if (r0 == 0) goto L14
            r0 = 1
            goto L15
        L14:
            r0 = 0
        L15:
            return r0
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public final kotlinx.coroutines.channels.ChannelIterator<E> iterator() {
            r1 = this;
            kotlinx.coroutines.channels.AbstractChannel$Itr r0 = new kotlinx.coroutines.channels.AbstractChannel$Itr
            r0.<init>(r1)
            kotlinx.coroutines.channels.ChannelIterator r0 = (kotlinx.coroutines.channels.ChannelIterator) r0
            return r0
    }

    protected void onCancelIdempotent(boolean r5) {
            r4 = this;
            kotlinx.coroutines.channels.Closed r0 = r4.getClosedForSend()
            if (r0 == 0) goto L3e
            r1 = 1
            r2 = 0
            java.lang.Object r1 = kotlinx.coroutines.internal.InlineList.m10211constructorimpl$default(r2, r1, r2)
        Lc:
            kotlinx.coroutines.internal.LockFreeLinkedListNode r2 = r0.getPrevNode()
            boolean r3 = r2 instanceof kotlinx.coroutines.internal.LockFreeLinkedListHead
            if (r3 == 0) goto L1a
        L16:
            r4.mo10171onCancelIdempotentListww6eGU(r1, r0)
            return
        L1a:
            boolean r3 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
            if (r3 == 0) goto L2c
            r3 = 0
            boolean r3 = r2 instanceof kotlinx.coroutines.channels.Send
            if (r3 == 0) goto L26
            goto L2c
        L26:
            java.lang.AssertionError r3 = new java.lang.AssertionError
            r3.<init>()
            throw r3
        L2c:
            boolean r3 = r2.mo10219remove()
            if (r3 != 0) goto L36
            r2.helpRemove()
            goto Lc
        L36:
            r3 = r2
            kotlinx.coroutines.channels.Send r3 = (kotlinx.coroutines.channels.Send) r3
            java.lang.Object r1 = kotlinx.coroutines.internal.InlineList.m10216plusFjFbRPM(r1, r3)
            goto Lc
        L3e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Cannot happen"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    /* JADX INFO: renamed from: onCancelIdempotentList-w-w6eGU, reason: not valid java name */
    protected void mo10171onCancelIdempotentListww6eGU(java.lang.Object r7, kotlinx.coroutines.channels.Closed<?> r8) {
            r6 = this;
            r0 = 0
            if (r7 != 0) goto L5
            goto L2e
        L5:
            boolean r1 = r7 instanceof java.util.ArrayList
            if (r1 != 0) goto L11
            r1 = r7
            kotlinx.coroutines.channels.Send r1 = (kotlinx.coroutines.channels.Send) r1
            r2 = 0
            r1.resumeSendClosed(r8)
            goto L2d
        L11:
            if (r7 == 0) goto L2f
            r1 = r7
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            int r2 = r1.size()
            int r2 = r2 + (-1)
            if (r2 < 0) goto L2d
        L1e:
            r3 = r2
            int r2 = r2 + (-1)
            java.lang.Object r4 = r1.get(r3)
            kotlinx.coroutines.channels.Send r4 = (kotlinx.coroutines.channels.Send) r4
            r5 = 0
            r4.resumeSendClosed(r8)
            if (r2 >= 0) goto L1e
        L2d:
        L2e:
            return
        L2f:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>{ kotlin.collections.TypeAliasesKt.ArrayList<E of kotlinx.coroutines.internal.InlineList> }"
            r1.<init>(r2)
            throw r1
    }

    protected void onReceiveDequeued() {
            r0 = this;
            return
    }

    protected void onReceiveEnqueued() {
            r0 = this;
            return
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Deprecated in the favour of 'tryReceive'. Please note that the provided replacement does not rethrow channel's close cause as 'poll' did, for the precise replacement please refer to the 'poll' documentation", replaceWith = @kotlin.ReplaceWith(expression = "tryReceive().getOrNull()", imports = {}))
    public E poll() {
            r1 = this;
            r0 = r1
            kotlinx.coroutines.channels.Channel r0 = (kotlinx.coroutines.channels.Channel) r0
            java.lang.Object r0 = kotlinx.coroutines.channels.Channel.DefaultImpls.poll(r0)
            return r0
    }

    protected java.lang.Object pollInternal() {
            r4 = this;
        L1:
            kotlinx.coroutines.channels.Send r0 = r4.takeFirstSendOrPeekClosed()
            if (r0 != 0) goto Lb
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.channels.AbstractChannelKt.POLL_FAILED
            return r0
        Lb:
            r1 = 0
            kotlinx.coroutines.internal.Symbol r1 = r0.tryResumeSend(r1)
            if (r1 == 0) goto L31
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
            r0.completeResumeSend()
            java.lang.Object r2 = r0.getPollResult()
            return r2
        L31:
            r0.undeliveredElement()
            goto L1
    }

    protected java.lang.Object pollSelectInternal(kotlinx.coroutines.selects.SelectInstance<?> r5) {
            r4 = this;
            kotlinx.coroutines.channels.AbstractChannel$TryPollDesc r0 = r4.describeTryPoll()
            r1 = r0
            kotlinx.coroutines.internal.AtomicDesc r1 = (kotlinx.coroutines.internal.AtomicDesc) r1
            java.lang.Object r1 = r5.performAtomicTrySelect(r1)
            if (r1 == 0) goto Le
            return r1
        Le:
            java.lang.Object r2 = r0.getResult()
            kotlinx.coroutines.channels.Send r2 = (kotlinx.coroutines.channels.Send) r2
            r2.completeResumeSend()
            java.lang.Object r3 = r0.getResult()
            kotlinx.coroutines.channels.Send r3 = (kotlinx.coroutines.channels.Send) r3
            java.lang.Object r3 = r3.getPollResult()
            return r3
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public final java.lang.Object receive(kotlin.coroutines.Continuation<? super E> r3) {
            r2 = this;
            java.lang.Object r0 = r2.pollInternal()
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.channels.AbstractChannelKt.POLL_FAILED
            if (r0 == r1) goto Ld
            boolean r1 = r0 instanceof kotlinx.coroutines.channels.Closed
            if (r1 != 0) goto Ld
            return r0
        Ld:
            r1 = 0
            java.lang.Object r1 = r2.receiveSuspend(r1, r3)
            return r1
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    /* JADX INFO: renamed from: receiveCatching-JP2dKIU, reason: not valid java name */
    public final java.lang.Object mo10172receiveCatchingJP2dKIU(kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ChannelResult<? extends E>> r6) {
            r5 = this;
            boolean r0 = r6 instanceof kotlinx.coroutines.channels.AbstractChannel$receiveCatching$1
            if (r0 == 0) goto L14
            r0 = r6
            kotlinx.coroutines.channels.AbstractChannel$receiveCatching$1 r0 = (kotlinx.coroutines.channels.AbstractChannel$receiveCatching$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r6 = r0.label
            int r6 = r6 - r2
            r0.label = r6
            goto L19
        L14:
            kotlinx.coroutines.channels.AbstractChannel$receiveCatching$1 r0 = new kotlinx.coroutines.channels.AbstractChannel$receiveCatching$1
            r0.<init>(r5, r6)
        L19:
            r6 = r0
            java.lang.Object r0 = r6.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r6.label
            switch(r2) {
                case 0: goto L32;
                case 1: goto L2d;
                default: goto L25;
            }
        L25:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L2d:
            kotlin.ResultKt.throwOnFailure(r0)
            r2 = r0
            goto L61
        L32:
            kotlin.ResultKt.throwOnFailure(r0)
            r2 = r5
            java.lang.Object r3 = r2.pollInternal()
            kotlinx.coroutines.internal.Symbol r4 = kotlinx.coroutines.channels.AbstractChannelKt.POLL_FAILED
            if (r3 == r4) goto L57
            r1 = r3
            r2 = 0
            boolean r3 = r1 instanceof kotlinx.coroutines.channels.Closed
            if (r3 == 0) goto L50
            kotlinx.coroutines.channels.ChannelResult$Companion r3 = kotlinx.coroutines.channels.ChannelResult.Companion
            r4 = r1
            kotlinx.coroutines.channels.Closed r4 = (kotlinx.coroutines.channels.Closed) r4
            java.lang.Throwable r4 = r4.closeCause
            java.lang.Object r3 = r3.m10192closedJP2dKIU(r4)
            goto L56
        L50:
            kotlinx.coroutines.channels.ChannelResult$Companion r3 = kotlinx.coroutines.channels.ChannelResult.Companion
            java.lang.Object r3 = r3.m10194successJP2dKIU(r1)
        L56:
            return r3
        L57:
            r3 = 1
            r6.label = r3
            java.lang.Object r2 = r2.receiveSuspend(r3, r6)
            if (r2 != r1) goto L61
            return r1
        L61:
            kotlinx.coroutines.channels.ChannelResult r2 = (kotlinx.coroutines.channels.ChannelResult) r2
            java.lang.Object r1 = r2.m10191unboximpl()
            return r1
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Deprecated in favor of 'receiveCatching'. Please note that the provided replacement does not rethrow channel's close cause as 'receiveOrNull' did, for the detailed replacement please refer to the 'receiveOrNull' documentation", replaceWith = @kotlin.ReplaceWith(expression = "receiveCatching().getOrNull()", imports = {}))
    public java.lang.Object receiveOrNull(kotlin.coroutines.Continuation<? super E> r2) {
            r1 = this;
            r0 = r1
            kotlinx.coroutines.channels.Channel r0 = (kotlinx.coroutines.channels.Channel) r0
            java.lang.Object r0 = kotlinx.coroutines.channels.Channel.DefaultImpls.receiveOrNull(r0, r2)
            return r0
    }

    @Override // kotlinx.coroutines.channels.AbstractSendChannel
    protected kotlinx.coroutines.channels.ReceiveOrClosed<E> takeFirstReceiveOrPeekClosed() {
            r4 = this;
            kotlinx.coroutines.channels.ReceiveOrClosed r0 = super.takeFirstReceiveOrPeekClosed()
            r1 = r0
            r2 = 0
            if (r1 == 0) goto Lf
            boolean r3 = r1 instanceof kotlinx.coroutines.channels.Closed
            if (r3 != 0) goto Lf
            r4.onReceiveDequeued()
        Lf:
            return r0
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    /* JADX INFO: renamed from: tryReceive-PtdJZtk, reason: not valid java name */
    public final java.lang.Object mo10173tryReceivePtdJZtk() {
            r3 = this;
            java.lang.Object r0 = r3.pollInternal()
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.channels.AbstractChannelKt.POLL_FAILED
            if (r0 != r1) goto Lf
            kotlinx.coroutines.channels.ChannelResult$Companion r1 = kotlinx.coroutines.channels.ChannelResult.Companion
            java.lang.Object r1 = r1.m10193failurePtdJZtk()
            return r1
        Lf:
            boolean r1 = r0 instanceof kotlinx.coroutines.channels.Closed
            if (r1 == 0) goto L1f
            kotlinx.coroutines.channels.ChannelResult$Companion r1 = kotlinx.coroutines.channels.ChannelResult.Companion
            r2 = r0
            kotlinx.coroutines.channels.Closed r2 = (kotlinx.coroutines.channels.Closed) r2
            java.lang.Throwable r2 = r2.closeCause
            java.lang.Object r1 = r1.m10192closedJP2dKIU(r2)
            return r1
        L1f:
            kotlinx.coroutines.channels.ChannelResult$Companion r1 = kotlinx.coroutines.channels.ChannelResult.Companion
            java.lang.Object r1 = r1.m10194successJP2dKIU(r0)
            return r1
    }
}
