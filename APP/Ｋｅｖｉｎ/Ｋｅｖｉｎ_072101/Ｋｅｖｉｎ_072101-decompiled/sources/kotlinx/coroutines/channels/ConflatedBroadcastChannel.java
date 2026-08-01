package kotlinx.coroutines.channels;

/* JADX INFO: compiled from: ConflatedBroadcastChannel.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\b\u0007\u0018\u0000 B*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000G:\u0004CBDEB\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00028\u0000¢\u0006\u0004\b\u0003\u0010\u0004B\u0007¢\u0006\u0004\b\u0003\u0010\u0005J?\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00070\u00062\u0014\u0010\b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0007\u0018\u00010\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0017¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u000f\u001a\u00020\u00132\u000e\u0010\r\u001a\n\u0018\u00010\u0011j\u0004\u0018\u0001`\u0012H\u0016¢\u0006\u0004\b\u000f\u0010\u0014J\u0019\u0010\u0015\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u0015\u0010\u0010J\u001d\u0010\u0016\u001a\u00020\u00132\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J)\u0010\u001b\u001a\u00020\u00132\u0018\u0010\u001a\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\u00130\u0018j\u0002`\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0019\u0010\u001d\u001a\u00020\u00132\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0019\u0010!\u001a\u0004\u0018\u00010 2\u0006\u0010\u001f\u001a\u00028\u0000H\u0002¢\u0006\u0004\b!\u0010\"J\u0015\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000#H\u0016¢\u0006\u0004\b$\u0010%JX\u0010.\u001a\u00020\u0013\"\u0004\b\u0001\u0010&2\f\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00010'2\u0006\u0010\u001f\u001a\u00028\u00002(\u0010-\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000*\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010+\u0012\u0006\u0012\u0004\u0018\u00010,0)H\u0002ø\u0001\u0000¢\u0006\u0004\b.\u0010/J?\u00100\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0007\u0018\u00010\u00062\u0012\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00070\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0002¢\u0006\u0004\b0\u0010\u000bJ\u001b\u00101\u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b1\u00102J&\u00106\u001a\b\u0012\u0004\u0012\u00020\u0013032\u0006\u0010\u001f\u001a\u00028\u0000H\u0016ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b4\u00105R\u0014\u00107\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b7\u00108R&\u0010<\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000*098VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b:\u0010;R\u0017\u0010\u0002\u001a\u00028\u00008F¢\u0006\f\u0012\u0004\b?\u0010\u0005\u001a\u0004\b=\u0010>R\u0013\u0010A\u001a\u0004\u0018\u00018\u00008F¢\u0006\u0006\u001a\u0004\b@\u0010>\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006F"}, m115d2 = {"Lkotlinx/coroutines/channels/ConflatedBroadcastChannel;", "E", "value", "<init>", "(Ljava/lang/Object;)V", "()V", "", "Lkotlinx/coroutines/channels/ConflatedBroadcastChannel$Subscriber;", "list", "subscriber", "addSubscriber", "([Lkotlinx/coroutines/channels/ConflatedBroadcastChannel$Subscriber;Lkotlinx/coroutines/channels/ConflatedBroadcastChannel$Subscriber;)[Lkotlinx/coroutines/channels/ConflatedBroadcastChannel$Subscriber;", "", "cause", "", "cancel", "(Ljava/lang/Throwable;)Z", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "", "(Ljava/util/concurrent/CancellationException;)V", "close", "closeSubscriber", "(Lkotlinx/coroutines/channels/ConflatedBroadcastChannel$Subscriber;)V", "Lkotlin/Function1;", "Lkotlinx/coroutines/channels/Handler;", "handler", "invokeOnClose", "(Lkotlin/jvm/functions/Function1;)V", "invokeOnCloseHandler", "(Ljava/lang/Throwable;)V", "element", "Lkotlinx/coroutines/channels/ConflatedBroadcastChannel$Closed;", "offerInternal", "(Ljava/lang/Object;)Lkotlinx/coroutines/channels/ConflatedBroadcastChannel$Closed;", "Lkotlinx/coroutines/channels/ReceiveChannel;", "openSubscription", "()Lkotlinx/coroutines/channels/ReceiveChannel;", "R", "Lkotlinx/coroutines/selects/SelectInstance;", "select", "Lkotlin/Function2;", "Lkotlinx/coroutines/channels/SendChannel;", "Lkotlin/coroutines/Continuation;", "", "block", "registerSelectSend", "(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", "removeSubscriber", "send", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/channels/ChannelResult;", "trySend-JP2dKIU", "(Ljava/lang/Object;)Ljava/lang/Object;", "trySend", "isClosedForSend", "()Z", "Lkotlinx/coroutines/selects/SelectClause2;", "getOnSend", "()Lkotlinx/coroutines/selects/SelectClause2;", "onSend", "getValue", "()Ljava/lang/Object;", "getValue$annotations", "getValueOrNull", "valueOrNull", "Companion", "Closed", "State", "Subscriber", "kotlinx-coroutines-core", "Lkotlinx/coroutines/channels/BroadcastChannel;"}, m116k = 1, m117mv = {1, 6, 0}, m119xi = 48)
public final class ConflatedBroadcastChannel<E> implements kotlinx.coroutines.channels.BroadcastChannel<E> {

    @java.lang.Deprecated
    private static final kotlinx.coroutines.channels.ConflatedBroadcastChannel.Closed CLOSED = null;
    private static final kotlinx.coroutines.channels.ConflatedBroadcastChannel.Companion Companion = null;

    @java.lang.Deprecated
    private static final kotlinx.coroutines.channels.ConflatedBroadcastChannel.State<java.lang.Object> INITIAL_STATE = null;

    @java.lang.Deprecated
    private static final kotlinx.coroutines.internal.Symbol UNDEFINED = null;
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater _state$FU = null;
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater _updating$FU = null;
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater onCloseHandler$FU = null;
    private volatile /* synthetic */ java.lang.Object _state;
    private volatile /* synthetic */ int _updating;
    private volatile /* synthetic */ java.lang.Object onCloseHandler;

    /* JADX INFO: compiled from: ConflatedBroadcastChannel.kt */
    @kotlin.Metadata(m114d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004R\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007¨\u0006\n"}, m115d2 = {"Lkotlinx/coroutines/channels/ConflatedBroadcastChannel$Closed;", "", "closeCause", "", "(Ljava/lang/Throwable;)V", "sendException", "getSendException", "()Ljava/lang/Throwable;", "valueException", "getValueException", "kotlinx-coroutines-core"}, m116k = 1, m117mv = {1, 6, 0}, m119xi = 48)
    private static final class Closed {
        public final java.lang.Throwable closeCause;

        public Closed(java.lang.Throwable r1) {
                r0 = this;
                r0.<init>()
                r0.closeCause = r1
                return
        }

        public final java.lang.Throwable getSendException() {
                r2 = this;
                java.lang.Throwable r0 = r2.closeCause
                if (r0 != 0) goto Ld
                kotlinx.coroutines.channels.ClosedSendChannelException r0 = new kotlinx.coroutines.channels.ClosedSendChannelException
                java.lang.String r1 = "Channel was closed"
                r0.<init>(r1)
                java.lang.Throwable r0 = (java.lang.Throwable) r0
            Ld:
                return r0
        }

        public final java.lang.Throwable getValueException() {
                r2 = this;
                java.lang.Throwable r0 = r2.closeCause
                if (r0 != 0) goto Ld
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "Channel was closed"
                r0.<init>(r1)
                java.lang.Throwable r0 = (java.lang.Throwable) r0
            Ld:
                return r0
        }
    }

    /* JADX INFO: compiled from: ConflatedBroadcastChannel.kt */
    @kotlin.Metadata(m114d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, m115d2 = {"Lkotlinx/coroutines/channels/ConflatedBroadcastChannel$Companion;", "", "()V", "CLOSED", "Lkotlinx/coroutines/channels/ConflatedBroadcastChannel$Closed;", "INITIAL_STATE", "Lkotlinx/coroutines/channels/ConflatedBroadcastChannel$State;", "UNDEFINED", "Lkotlinx/coroutines/internal/Symbol;", "kotlinx-coroutines-core"}, m116k = 1, m117mv = {1, 6, 0}, m119xi = 48)
    private static final class Companion {
        private Companion() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker r1) {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* JADX INFO: compiled from: ConflatedBroadcastChannel.kt */
    @kotlin.Metadata(m114d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0014\u0010\u0004\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0006\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007R \u0010\u0004\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\bR\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, m115d2 = {"Lkotlinx/coroutines/channels/ConflatedBroadcastChannel$State;", "E", "", "value", "subscribers", "", "Lkotlinx/coroutines/channels/ConflatedBroadcastChannel$Subscriber;", "(Ljava/lang/Object;[Lkotlinx/coroutines/channels/ConflatedBroadcastChannel$Subscriber;)V", "[Lkotlinx/coroutines/channels/ConflatedBroadcastChannel$Subscriber;", "kotlinx-coroutines-core"}, m116k = 1, m117mv = {1, 6, 0}, m119xi = 48)
    private static final class State<E> {
        public final kotlinx.coroutines.channels.ConflatedBroadcastChannel.Subscriber<E>[] subscribers;
        public final java.lang.Object value;

        public State(java.lang.Object r1, kotlinx.coroutines.channels.ConflatedBroadcastChannel.Subscriber<E>[] r2) {
                r0 = this;
                r0.<init>()
                r0.value = r1
                r0.subscribers = r2
                return
        }
    }

    /* JADX INFO: compiled from: ConflatedBroadcastChannel.kt */
    @kotlin.Metadata(m114d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u0013\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0015\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\nJ\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0014R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m115d2 = {"Lkotlinx/coroutines/channels/ConflatedBroadcastChannel$Subscriber;", "E", "Lkotlinx/coroutines/channels/ConflatedChannel;", "Lkotlinx/coroutines/channels/ReceiveChannel;", "broadcastChannel", "Lkotlinx/coroutines/channels/ConflatedBroadcastChannel;", "(Lkotlinx/coroutines/channels/ConflatedBroadcastChannel;)V", "offerInternal", "", "element", "(Ljava/lang/Object;)Ljava/lang/Object;", "onCancelIdempotent", "", "wasClosed", "", "kotlinx-coroutines-core"}, m116k = 1, m117mv = {1, 6, 0}, m119xi = 48)
    private static final class Subscriber<E> extends kotlinx.coroutines.channels.ConflatedChannel<E> implements kotlinx.coroutines.channels.ReceiveChannel<E> {
        private final kotlinx.coroutines.channels.ConflatedBroadcastChannel<E> broadcastChannel;

        public Subscriber(kotlinx.coroutines.channels.ConflatedBroadcastChannel<E> r2) {
                r1 = this;
                r0 = 0
                r1.<init>(r0)
                r1.broadcastChannel = r2
                return
        }

        @Override // kotlinx.coroutines.channels.ConflatedChannel, kotlinx.coroutines.channels.AbstractSendChannel
        public java.lang.Object offerInternal(E r2) {
                r1 = this;
                java.lang.Object r0 = super.offerInternal(r2)
                return r0
        }

        @Override // kotlinx.coroutines.channels.ConflatedChannel, kotlinx.coroutines.channels.AbstractChannel
        protected void onCancelIdempotent(boolean r2) {
                r1 = this;
                if (r2 == 0) goto L7
                kotlinx.coroutines.channels.ConflatedBroadcastChannel<E> r0 = r1.broadcastChannel
                kotlinx.coroutines.channels.ConflatedBroadcastChannel.access$closeSubscriber(r0, r1)
            L7:
                return
        }
    }

    static {
            kotlinx.coroutines.channels.ConflatedBroadcastChannel$Companion r0 = new kotlinx.coroutines.channels.ConflatedBroadcastChannel$Companion
            r1 = 0
            r0.<init>(r1)
            kotlinx.coroutines.channels.ConflatedBroadcastChannel.Companion = r0
            kotlinx.coroutines.channels.ConflatedBroadcastChannel$Closed r0 = new kotlinx.coroutines.channels.ConflatedBroadcastChannel$Closed
            r0.<init>(r1)
            kotlinx.coroutines.channels.ConflatedBroadcastChannel.CLOSED = r0
            kotlinx.coroutines.internal.Symbol r0 = new kotlinx.coroutines.internal.Symbol
            java.lang.String r2 = "UNDEFINED"
            r0.<init>(r2)
            kotlinx.coroutines.channels.ConflatedBroadcastChannel.UNDEFINED = r0
            kotlinx.coroutines.channels.ConflatedBroadcastChannel$State r0 = new kotlinx.coroutines.channels.ConflatedBroadcastChannel$State
            kotlinx.coroutines.internal.Symbol r2 = kotlinx.coroutines.channels.ConflatedBroadcastChannel.UNDEFINED
            r0.<init>(r2, r1)
            kotlinx.coroutines.channels.ConflatedBroadcastChannel.INITIAL_STATE = r0
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            java.lang.String r1 = "_state"
            java.lang.Class<kotlinx.coroutines.channels.ConflatedBroadcastChannel> r2 = kotlinx.coroutines.channels.ConflatedBroadcastChannel.class
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r0, r1)
            kotlinx.coroutines.channels.ConflatedBroadcastChannel._state$FU = r0
            java.lang.String r0 = "_updating"
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r2, r0)
            kotlinx.coroutines.channels.ConflatedBroadcastChannel._updating$FU = r0
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            java.lang.String r1 = "onCloseHandler"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r0, r1)
            kotlinx.coroutines.channels.ConflatedBroadcastChannel.onCloseHandler$FU = r0
            return
    }

    public ConflatedBroadcastChannel() {
            r1 = this;
            r1.<init>()
            kotlinx.coroutines.channels.ConflatedBroadcastChannel$State<java.lang.Object> r0 = kotlinx.coroutines.channels.ConflatedBroadcastChannel.INITIAL_STATE
            r1._state = r0
            r0 = 0
            r1._updating = r0
            r0 = 0
            r1.onCloseHandler = r0
            return
    }

    public ConflatedBroadcastChannel(E r4) {
            r3 = this;
            r3.<init>()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.channels.ConflatedBroadcastChannel._state$FU
            kotlinx.coroutines.channels.ConflatedBroadcastChannel$State r1 = new kotlinx.coroutines.channels.ConflatedBroadcastChannel$State
            r2 = 0
            r1.<init>(r4, r2)
            r0.lazySet(r3, r1)
            return
    }

    public static final /* synthetic */ void access$closeSubscriber(kotlinx.coroutines.channels.ConflatedBroadcastChannel r0, kotlinx.coroutines.channels.ConflatedBroadcastChannel.Subscriber r1) {
            r0.closeSubscriber(r1)
            return
    }

    public static final /* synthetic */ void access$registerSelectSend(kotlinx.coroutines.channels.ConflatedBroadcastChannel r0, kotlinx.coroutines.selects.SelectInstance r1, java.lang.Object r2, kotlin.jvm.functions.Function2 r3) {
            r0.registerSelectSend(r1, r2, r3)
            return
    }

    private final kotlinx.coroutines.channels.ConflatedBroadcastChannel.Subscriber<E>[] addSubscriber(kotlinx.coroutines.channels.ConflatedBroadcastChannel.Subscriber<E>[] r4, kotlinx.coroutines.channels.ConflatedBroadcastChannel.Subscriber<E> r5) {
            r3 = this;
            if (r4 != 0) goto Le
            r0 = 1
            kotlinx.coroutines.channels.ConflatedBroadcastChannel$Subscriber[] r1 = new kotlinx.coroutines.channels.ConflatedBroadcastChannel.Subscriber[r0]
            r2 = 0
        L6:
            if (r2 >= r0) goto Ld
            r1[r2] = r5
            int r2 = r2 + 1
            goto L6
        Ld:
            return r1
        Le:
            java.lang.Object[] r0 = kotlin.collections.ArraysKt.plus(r4, r5)
            kotlinx.coroutines.channels.ConflatedBroadcastChannel$Subscriber[] r0 = (kotlinx.coroutines.channels.ConflatedBroadcastChannel.Subscriber[]) r0
            return r0
    }

    private final void closeSubscriber(kotlinx.coroutines.channels.ConflatedBroadcastChannel.Subscriber<E> r8) {
            r7 = this;
            r0 = r7
            r1 = 0
        L2:
            java.lang.Object r2 = r0._state
            r3 = 0
            boolean r4 = r2 instanceof kotlinx.coroutines.channels.ConflatedBroadcastChannel.Closed
            if (r4 == 0) goto Lc
            return
        Lc:
            boolean r4 = r2 instanceof kotlinx.coroutines.channels.ConflatedBroadcastChannel.State
            if (r4 == 0) goto L31
            kotlinx.coroutines.channels.ConflatedBroadcastChannel$State r4 = new kotlinx.coroutines.channels.ConflatedBroadcastChannel$State
            r5 = r2
            kotlinx.coroutines.channels.ConflatedBroadcastChannel$State r5 = (kotlinx.coroutines.channels.ConflatedBroadcastChannel.State) r5
            java.lang.Object r5 = r5.value
            r6 = r2
            kotlinx.coroutines.channels.ConflatedBroadcastChannel$State r6 = (kotlinx.coroutines.channels.ConflatedBroadcastChannel.State) r6
            kotlinx.coroutines.channels.ConflatedBroadcastChannel$Subscriber<E>[] r6 = r6.subscribers
            kotlin.jvm.internal.Intrinsics.checkNotNull(r6)
            kotlinx.coroutines.channels.ConflatedBroadcastChannel$Subscriber[] r6 = r7.removeSubscriber(r6, r8)
            r4.<init>(r5, r6)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = kotlinx.coroutines.channels.ConflatedBroadcastChannel._state$FU
            boolean r5 = androidx.concurrent.futures.C0110xc40028dd.m9m(r5, r7, r2, r4)
            if (r5 == 0) goto L2f
            return
        L2f:
            goto L2
        L31:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "Invalid state "
            java.lang.String r5 = kotlin.jvm.internal.Intrinsics.stringPlus(r5, r2)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
    }

    public static /* synthetic */ void getValue$annotations() {
            return
    }

    private final void invokeOnCloseHandler(java.lang.Throwable r4) {
            r3 = this;
            java.lang.Object r0 = r3.onCloseHandler
            if (r0 == 0) goto L1c
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.channels.AbstractChannelKt.HANDLER_INVOKED
            if (r0 == r1) goto L1c
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = kotlinx.coroutines.channels.ConflatedBroadcastChannel.onCloseHandler$FU
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

    private final kotlinx.coroutines.channels.ConflatedBroadcastChannel.Closed offerInternal(E r14) {
            r13 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = kotlinx.coroutines.channels.ConflatedBroadcastChannel._updating$FU
            r1 = 1
            r2 = 0
            boolean r0 = r0.compareAndSet(r13, r2, r1)
            r1 = 0
            if (r0 != 0) goto Lc
            return r1
        Lc:
            r0 = r13
            r3 = 0
        Lf:
            java.lang.Object r4 = r0._state     // Catch: java.lang.Throwable -> L61
            r5 = 0
            boolean r6 = r4 instanceof kotlinx.coroutines.channels.ConflatedBroadcastChannel.Closed     // Catch: java.lang.Throwable -> L61
            if (r6 == 0) goto L1e
            r1 = r4
            kotlinx.coroutines.channels.ConflatedBroadcastChannel$Closed r1 = (kotlinx.coroutines.channels.ConflatedBroadcastChannel.Closed) r1     // Catch: java.lang.Throwable -> L61
        L1b:
            r13._updating = r2
            return r1
        L1e:
            boolean r6 = r4 instanceof kotlinx.coroutines.channels.ConflatedBroadcastChannel.State     // Catch: java.lang.Throwable -> L61
            if (r6 == 0) goto L51
            kotlinx.coroutines.channels.ConflatedBroadcastChannel$State r6 = new kotlinx.coroutines.channels.ConflatedBroadcastChannel$State     // Catch: java.lang.Throwable -> L61
            r7 = r4
            kotlinx.coroutines.channels.ConflatedBroadcastChannel$State r7 = (kotlinx.coroutines.channels.ConflatedBroadcastChannel.State) r7     // Catch: java.lang.Throwable -> L61
            kotlinx.coroutines.channels.ConflatedBroadcastChannel$Subscriber<E>[] r7 = r7.subscribers     // Catch: java.lang.Throwable -> L61
            r6.<init>(r14, r7)     // Catch: java.lang.Throwable -> L61
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = kotlinx.coroutines.channels.ConflatedBroadcastChannel._state$FU     // Catch: java.lang.Throwable -> L61
            boolean r7 = androidx.concurrent.futures.C0110xc40028dd.m9m(r7, r13, r4, r6)     // Catch: java.lang.Throwable -> L61
            if (r7 == 0) goto L4e
            r0 = r4
            kotlinx.coroutines.channels.ConflatedBroadcastChannel$State r0 = (kotlinx.coroutines.channels.ConflatedBroadcastChannel.State) r0     // Catch: java.lang.Throwable -> L61
            kotlinx.coroutines.channels.ConflatedBroadcastChannel$Subscriber<E>[] r0 = r0.subscribers     // Catch: java.lang.Throwable -> L61
            if (r0 != 0) goto L3c
            goto L4c
        L3c:
            r7 = 0
            int r8 = r0.length     // Catch: java.lang.Throwable -> L61
            r9 = r2
        L3f:
            if (r9 >= r8) goto L4b
            r10 = r0[r9]     // Catch: java.lang.Throwable -> L61
            int r9 = r9 + 1
            r11 = r10
            r12 = 0
            r11.offerInternal(r14)     // Catch: java.lang.Throwable -> L61
            goto L3f
        L4b:
        L4c:
            goto L1b
        L4e:
            goto Lf
        L51:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L61
            java.lang.String r1 = "Invalid state "
            java.lang.String r1 = kotlin.jvm.internal.Intrinsics.stringPlus(r1, r4)     // Catch: java.lang.Throwable -> L61
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L61
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L61
            throw r0     // Catch: java.lang.Throwable -> L61
        L61:
            r0 = move-exception
            r13._updating = r2
            throw r0
    }

    private final <R> void registerSelectSend(kotlinx.coroutines.selects.SelectInstance<? super R> r4, E r5, kotlin.jvm.functions.Function2<? super kotlinx.coroutines.channels.SendChannel<? super E>, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> r6) {
            r3 = this;
            boolean r0 = r4.trySelect()
            if (r0 != 0) goto L7
            return
        L7:
            kotlinx.coroutines.channels.ConflatedBroadcastChannel$Closed r0 = r3.offerInternal(r5)
            if (r0 != 0) goto L15
            kotlin.coroutines.Continuation r0 = r4.getCompletion()
            kotlinx.coroutines.intrinsics.UndispatchedKt.startCoroutineUnintercepted(r6, r3, r0)
            return
        L15:
            r1 = 0
            java.lang.Throwable r2 = r0.getSendException()
            r4.resumeSelectWithException(r2)
            return
    }

    private final kotlinx.coroutines.channels.ConflatedBroadcastChannel.Subscriber<E>[] removeSubscriber(kotlinx.coroutines.channels.ConflatedBroadcastChannel.Subscriber<E>[] r11, kotlinx.coroutines.channels.ConflatedBroadcastChannel.Subscriber<E> r12) {
            r10 = this;
            int r0 = r11.length
            int r8 = kotlin.collections.ArraysKt.indexOf(r11, r12)
            boolean r1 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
            r2 = 1
            if (r1 == 0) goto L1b
            r1 = 0
            if (r8 < 0) goto L11
            r3 = r2
            goto L12
        L11:
            r3 = 0
        L12:
            if (r3 == 0) goto L15
            goto L1b
        L15:
            java.lang.AssertionError r1 = new java.lang.AssertionError
            r1.<init>()
            throw r1
        L1b:
            if (r0 != r2) goto L1f
            r1 = 0
            return r1
        L1f:
            int r1 = r0 + (-1)
            kotlinx.coroutines.channels.ConflatedBroadcastChannel$Subscriber[] r9 = new kotlinx.coroutines.channels.ConflatedBroadcastChannel.Subscriber[r1]
            r6 = 6
            r7 = 0
            r3 = 0
            r4 = 0
            r1 = r11
            r2 = r9
            r5 = r8
            kotlin.collections.ArraysKt.copyInto$default(r1, r2, r3, r4, r5, r6, r7)
            int r4 = r8 + 1
            r6 = 8
            r5 = 0
            r3 = r8
            kotlin.collections.ArraysKt.copyInto$default(r1, r2, r3, r4, r5, r6, r7)
            return r9
    }

    @Override // kotlinx.coroutines.channels.BroadcastChannel
    public void cancel(java.util.concurrent.CancellationException r2) {
            r1 = this;
            r0 = r2
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            r1.close(r0)
            return
    }

    @Override // kotlinx.coroutines.channels.BroadcastChannel
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public /* synthetic */ boolean cancel(java.lang.Throwable r2) {
            r1 = this;
            boolean r0 = r1.close(r2)
            return r0
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public boolean close(java.lang.Throwable r13) {
            r12 = this;
            r0 = r12
            r1 = 0
        L2:
            java.lang.Object r2 = r0._state
            r3 = 0
            boolean r4 = r2 instanceof kotlinx.coroutines.channels.ConflatedBroadcastChannel.Closed
            r5 = 0
            if (r4 == 0) goto Ld
            return r5
        Ld:
            boolean r4 = r2 instanceof kotlinx.coroutines.channels.ConflatedBroadcastChannel.State
            if (r4 == 0) goto L41
            if (r13 != 0) goto L16
            kotlinx.coroutines.channels.ConflatedBroadcastChannel$Closed r4 = kotlinx.coroutines.channels.ConflatedBroadcastChannel.CLOSED
            goto L1b
        L16:
            kotlinx.coroutines.channels.ConflatedBroadcastChannel$Closed r4 = new kotlinx.coroutines.channels.ConflatedBroadcastChannel$Closed
            r4.<init>(r13)
        L1b:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = kotlinx.coroutines.channels.ConflatedBroadcastChannel._state$FU
            boolean r6 = androidx.concurrent.futures.C0110xc40028dd.m9m(r6, r12, r2, r4)
            if (r6 == 0) goto L3f
            r6 = r2
            kotlinx.coroutines.channels.ConflatedBroadcastChannel$State r6 = (kotlinx.coroutines.channels.ConflatedBroadcastChannel.State) r6
            kotlinx.coroutines.channels.ConflatedBroadcastChannel$Subscriber<E>[] r6 = r6.subscribers
            if (r6 != 0) goto L2b
            goto L3a
        L2b:
            r7 = 0
            int r8 = r6.length
        L2d:
            if (r5 >= r8) goto L39
            r9 = r6[r5]
            int r5 = r5 + 1
            r10 = r9
            r11 = 0
            r10.close(r13)
            goto L2d
        L39:
        L3a:
            r12.invokeOnCloseHandler(r13)
            r5 = 1
            return r5
        L3f:
            goto L2
        L41:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "Invalid state "
            java.lang.String r5 = kotlin.jvm.internal.Intrinsics.stringPlus(r5, r2)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public kotlinx.coroutines.selects.SelectClause2<E, kotlinx.coroutines.channels.SendChannel<E>> getOnSend() {
            r1 = this;
            kotlinx.coroutines.channels.ConflatedBroadcastChannel$onSend$1 r0 = new kotlinx.coroutines.channels.ConflatedBroadcastChannel$onSend$1
            r0.<init>(r1)
            kotlinx.coroutines.selects.SelectClause2 r0 = (kotlinx.coroutines.selects.SelectClause2) r0
            return r0
    }

    public final E getValue() {
            r6 = this;
            r0 = r6
            r1 = 0
            java.lang.Object r2 = r0._state
            r3 = 0
            boolean r4 = r2 instanceof kotlinx.coroutines.channels.ConflatedBroadcastChannel.Closed
            if (r4 != 0) goto L36
            boolean r4 = r2 instanceof kotlinx.coroutines.channels.ConflatedBroadcastChannel.State
            if (r4 == 0) goto L26
            r4 = r2
            kotlinx.coroutines.channels.ConflatedBroadcastChannel$State r4 = (kotlinx.coroutines.channels.ConflatedBroadcastChannel.State) r4
            java.lang.Object r4 = r4.value
            kotlinx.coroutines.internal.Symbol r5 = kotlinx.coroutines.channels.ConflatedBroadcastChannel.UNDEFINED
            if (r4 == r5) goto L1e
            r4 = r2
            kotlinx.coroutines.channels.ConflatedBroadcastChannel$State r4 = (kotlinx.coroutines.channels.ConflatedBroadcastChannel.State) r4
            java.lang.Object r4 = r4.value
            return r4
        L1e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "No value"
            r4.<init>(r5)
            throw r4
        L26:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "Invalid state "
            java.lang.String r5 = kotlin.jvm.internal.Intrinsics.stringPlus(r5, r2)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L36:
            r4 = r2
            kotlinx.coroutines.channels.ConflatedBroadcastChannel$Closed r4 = (kotlinx.coroutines.channels.ConflatedBroadcastChannel.Closed) r4
            java.lang.Throwable r4 = r4.getValueException()
            throw r4
    }

    public final E getValueOrNull() {
            r5 = this;
            java.lang.Object r0 = r5._state
            boolean r1 = r0 instanceof kotlinx.coroutines.channels.ConflatedBroadcastChannel.Closed
            r2 = 0
            if (r1 == 0) goto L8
            goto L18
        L8:
            boolean r1 = r0 instanceof kotlinx.coroutines.channels.ConflatedBroadcastChannel.State
            if (r1 == 0) goto L19
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.channels.ConflatedBroadcastChannel.UNDEFINED
            r3 = r0
            kotlinx.coroutines.channels.ConflatedBroadcastChannel$State r3 = (kotlinx.coroutines.channels.ConflatedBroadcastChannel.State) r3
            java.lang.Object r3 = r3.value
            r4 = 0
            if (r3 != r1) goto L17
            goto L18
        L17:
            r2 = r3
        L18:
            return r2
        L19:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Invalid state "
            java.lang.String r2 = kotlin.jvm.internal.Intrinsics.stringPlus(r2, r0)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public void invokeOnClose(kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> r4) {
            r3 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.channels.ConflatedBroadcastChannel.onCloseHandler$FU
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
            java.lang.Object r0 = r3._state
            boolean r1 = r0 instanceof kotlinx.coroutines.channels.ConflatedBroadcastChannel.Closed
            if (r1 == 0) goto L3b
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = kotlinx.coroutines.channels.ConflatedBroadcastChannel.onCloseHandler$FU
            kotlinx.coroutines.internal.Symbol r2 = kotlinx.coroutines.channels.AbstractChannelKt.HANDLER_INVOKED
            boolean r1 = androidx.concurrent.futures.C0110xc40028dd.m9m(r1, r3, r4, r2)
            if (r1 == 0) goto L3b
            r1 = r0
            kotlinx.coroutines.channels.ConflatedBroadcastChannel$Closed r1 = (kotlinx.coroutines.channels.ConflatedBroadcastChannel.Closed) r1
            java.lang.Throwable r1 = r1.closeCause
            r4.invoke(r1)
        L3b:
            return
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public boolean isClosedForSend() {
            r1 = this;
            java.lang.Object r0 = r1._state
            boolean r0 = r0 instanceof kotlinx.coroutines.channels.ConflatedBroadcastChannel.Closed
            return r0
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Deprecated in the favour of 'trySend' method", replaceWith = @kotlin.ReplaceWith(expression = "trySend(element).isSuccess", imports = {}))
    public boolean offer(E r2) {
            r1 = this;
            r0 = r1
            kotlinx.coroutines.channels.BroadcastChannel r0 = (kotlinx.coroutines.channels.BroadcastChannel) r0
            boolean r0 = kotlinx.coroutines.channels.BroadcastChannel.DefaultImpls.offer(r0, r2)
            return r0
    }

    @Override // kotlinx.coroutines.channels.BroadcastChannel
    public kotlinx.coroutines.channels.ReceiveChannel<E> openSubscription() {
            r8 = this;
            kotlinx.coroutines.channels.ConflatedBroadcastChannel$Subscriber r0 = new kotlinx.coroutines.channels.ConflatedBroadcastChannel$Subscriber
            r0.<init>(r8)
            r1 = r8
            r2 = 0
        L7:
            java.lang.Object r3 = r1._state
            r4 = 0
            boolean r5 = r3 instanceof kotlinx.coroutines.channels.ConflatedBroadcastChannel.Closed
            if (r5 == 0) goto L1c
            r5 = r3
            kotlinx.coroutines.channels.ConflatedBroadcastChannel$Closed r5 = (kotlinx.coroutines.channels.ConflatedBroadcastChannel.Closed) r5
            java.lang.Throwable r5 = r5.closeCause
            r0.close(r5)
            r5 = r0
            kotlinx.coroutines.channels.ReceiveChannel r5 = (kotlinx.coroutines.channels.ReceiveChannel) r5
            return r5
        L1c:
            boolean r5 = r3 instanceof kotlinx.coroutines.channels.ConflatedBroadcastChannel.State
            if (r5 == 0) goto L52
            r5 = r3
            kotlinx.coroutines.channels.ConflatedBroadcastChannel$State r5 = (kotlinx.coroutines.channels.ConflatedBroadcastChannel.State) r5
            java.lang.Object r5 = r5.value
            kotlinx.coroutines.internal.Symbol r6 = kotlinx.coroutines.channels.ConflatedBroadcastChannel.UNDEFINED
            if (r5 == r6) goto L31
            r5 = r3
            kotlinx.coroutines.channels.ConflatedBroadcastChannel$State r5 = (kotlinx.coroutines.channels.ConflatedBroadcastChannel.State) r5
            java.lang.Object r5 = r5.value
            r0.offerInternal(r5)
        L31:
            kotlinx.coroutines.channels.ConflatedBroadcastChannel$State r5 = new kotlinx.coroutines.channels.ConflatedBroadcastChannel$State
            r6 = r3
            kotlinx.coroutines.channels.ConflatedBroadcastChannel$State r6 = (kotlinx.coroutines.channels.ConflatedBroadcastChannel.State) r6
            java.lang.Object r6 = r6.value
            r7 = r3
            kotlinx.coroutines.channels.ConflatedBroadcastChannel$State r7 = (kotlinx.coroutines.channels.ConflatedBroadcastChannel.State) r7
            kotlinx.coroutines.channels.ConflatedBroadcastChannel$Subscriber<E>[] r7 = r7.subscribers
            kotlinx.coroutines.channels.ConflatedBroadcastChannel$Subscriber[] r7 = r8.addSubscriber(r7, r0)
            r5.<init>(r6, r7)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = kotlinx.coroutines.channels.ConflatedBroadcastChannel._state$FU
            boolean r6 = androidx.concurrent.futures.C0110xc40028dd.m9m(r6, r8, r3, r5)
            if (r6 == 0) goto L50
            r6 = r0
            kotlinx.coroutines.channels.ReceiveChannel r6 = (kotlinx.coroutines.channels.ReceiveChannel) r6
            return r6
        L50:
            goto L7
        L52:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "Invalid state "
            java.lang.String r6 = kotlin.jvm.internal.Intrinsics.stringPlus(r6, r3)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public java.lang.Object send(E r4, kotlin.coroutines.Continuation<? super kotlin.Unit> r5) {
            r3 = this;
            kotlinx.coroutines.channels.ConflatedBroadcastChannel$Closed r0 = r3.offerInternal(r4)
            if (r0 != 0) goto L11
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r0 != 0) goto Le
            r0 = 0
            return r0
        Le:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L11:
            r1 = 0
            java.lang.Throwable r2 = r0.getSendException()
            throw r2
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    /* JADX INFO: renamed from: trySend-JP2dKIU */
    public java.lang.Object mo10174trySendJP2dKIU(E r5) {
            r4 = this;
            kotlinx.coroutines.channels.ConflatedBroadcastChannel$Closed r0 = r4.offerInternal(r5)
            if (r0 != 0) goto Lf
            kotlinx.coroutines.channels.ChannelResult$Companion r0 = kotlinx.coroutines.channels.ChannelResult.Companion
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            java.lang.Object r0 = r0.m10194successJP2dKIU(r1)
            return r0
        Lf:
            r1 = 0
            kotlinx.coroutines.channels.ChannelResult$Companion r2 = kotlinx.coroutines.channels.ChannelResult.Companion
            java.lang.Throwable r3 = r0.getSendException()
            java.lang.Object r2 = r2.m10192closedJP2dKIU(r3)
            return r2
    }
}
