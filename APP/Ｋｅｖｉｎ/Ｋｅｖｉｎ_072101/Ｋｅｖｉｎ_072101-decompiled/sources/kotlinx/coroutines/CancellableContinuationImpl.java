package kotlinx.coroutines;

/* JADX INFO: compiled from: CancellableContinuationImpl.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b\u0011\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\t\u0012\u0004\u0012\u00028\u00000\u008a\u00012\t\u0012\u0004\u0012\u00028\u00000\u008b\u00012\u00060tj\u0002`uB\u001d\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0012\u0010\u0013JB\u0010\u0012\u001a\u00020\u00112'\u0010\u000e\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u000f¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00110\u0014j\u0002`\u00172\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0018J\u001e\u0010\u001b\u001a\u00020\u00112\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00110\u0019H\u0082\b¢\u0006\u0004\b\u001b\u0010\u001cJ8\u0010\u001e\u001a\u00020\u00112!\u0010\u001d\u001a\u001d\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00110\u00142\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u001e\u0010\u0018J\u0019\u0010 \u001a\u00020\u001f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b \u0010!J!\u0010%\u001a\u00020\u00112\b\u0010\"\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0010¢\u0006\u0004\b#\u0010$J\u0017\u0010&\u001a\u00020\u001f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b&\u0010!J\u0017\u0010(\u001a\u00020\u00112\u0006\u0010'\u001a\u00020\bH\u0016¢\u0006\u0004\b(\u0010)J\u000f\u0010,\u001a\u00020\u0011H\u0000¢\u0006\u0004\b*\u0010+J\u000f\u0010-\u001a\u00020\u0011H\u0002¢\u0006\u0004\b-\u0010+J\u0017\u0010/\u001a\u00020\u00112\u0006\u0010.\u001a\u00020\u0004H\u0002¢\u0006\u0004\b/\u00100J\u0017\u00103\u001a\u00020\u000f2\u0006\u00102\u001a\u000201H\u0016¢\u0006\u0004\b3\u00104J\u001b\u00108\u001a\u0004\u0018\u00010\u000f2\b\u00105\u001a\u0004\u0018\u00010\bH\u0010¢\u0006\u0004\b6\u00107J\u0011\u00109\u001a\u0004\u0018\u00010\bH\u0001¢\u0006\u0004\b9\u0010:J\u0017\u0010=\u001a\n\u0018\u00010;j\u0004\u0018\u0001`<H\u0016¢\u0006\u0004\b=\u0010>J\u001f\u0010A\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u00012\b\u00105\u001a\u0004\u0018\u00010\bH\u0010¢\u0006\u0004\b?\u0010@J\u000f\u0010B\u001a\u00020\u0011H\u0016¢\u0006\u0004\bB\u0010+J\u0011\u0010D\u001a\u0004\u0018\u00010CH\u0002¢\u0006\u0004\bD\u0010EJ8\u0010F\u001a\u00020\u00112'\u0010\u000e\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u000f¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00110\u0014j\u0002`\u0017H\u0016¢\u0006\u0004\bF\u0010GJ\u000f\u0010H\u001a\u00020\u001fH\u0002¢\u0006\u0004\bH\u0010IJ8\u0010J\u001a\u00020\r2'\u0010\u000e\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u000f¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00110\u0014j\u0002`\u0017H\u0002¢\u0006\u0004\bJ\u0010KJB\u0010L\u001a\u00020\u00112'\u0010\u000e\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u000f¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00110\u0014j\u0002`\u00172\b\u00105\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\bL\u0010MJ\u000f\u0010O\u001a\u00020NH\u0014¢\u0006\u0004\bO\u0010PJ\u0017\u0010S\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0000¢\u0006\u0004\bQ\u0010RJ\u000f\u0010T\u001a\u00020\u0011H\u0002¢\u0006\u0004\bT\u0010+J\u000f\u0010U\u001a\u00020\u001fH\u0001¢\u0006\u0004\bU\u0010IJ<\u0010W\u001a\u00020\u00112\u0006\u0010V\u001a\u00028\u00002#\u0010\u001d\u001a\u001f\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0014H\u0016¢\u0006\u0004\bW\u0010XJH\u0010Y\u001a\u00020\u00112\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042%\b\u0002\u0010\u001d\u001a\u001f\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0014H\u0002¢\u0006\u0004\bY\u0010ZJ \u0010]\u001a\u00020\u00112\f\u0010\\\u001a\b\u0012\u0004\u0012\u00028\u00000[H\u0016ø\u0001\u0000¢\u0006\u0004\b]\u0010)JZ\u0010`\u001a\u0004\u0018\u00010\b2\u0006\u00105\u001a\u00020^2\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042#\u0010\u001d\u001a\u001f\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00142\b\u0010_\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b`\u0010aJ\u0011\u0010c\u001a\u0004\u0018\u00010\bH\u0010¢\u0006\u0004\bb\u0010:J\u000f\u0010d\u001a\u00020NH\u0016¢\u0006\u0004\bd\u0010PJ\u000f\u0010e\u001a\u00020\u001fH\u0002¢\u0006\u0004\be\u0010IJ#\u0010e\u001a\u0004\u0018\u00010\b2\u0006\u0010V\u001a\u00028\u00002\b\u0010_\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\be\u0010fJH\u0010e\u001a\u0004\u0018\u00010\b2\u0006\u0010V\u001a\u00028\u00002\b\u0010_\u001a\u0004\u0018\u00010\b2#\u0010\u001d\u001a\u001f\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0014H\u0016¢\u0006\u0004\be\u0010gJJ\u0010i\u001a\u0004\u0018\u00010h2\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010_\u001a\u0004\u0018\u00010\b2#\u0010\u001d\u001a\u001f\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0014H\u0002¢\u0006\u0004\bi\u0010jJ\u0019\u0010l\u001a\u0004\u0018\u00010\b2\u0006\u0010k\u001a\u00020\u000fH\u0016¢\u0006\u0004\bl\u0010mJ\u000f\u0010n\u001a\u00020\u001fH\u0002¢\u0006\u0004\bn\u0010IJ\u001b\u0010p\u001a\u00020\u0011*\u00020o2\u0006\u0010V\u001a\u00028\u0000H\u0016¢\u0006\u0004\bp\u0010qJ\u001b\u0010r\u001a\u00020\u0011*\u00020o2\u0006\u0010k\u001a\u00020\u000fH\u0016¢\u0006\u0004\br\u0010sR\u001c\u0010x\u001a\n\u0018\u00010tj\u0004\u0018\u0001`u8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bv\u0010wR\u001a\u0010z\u001a\u00020y8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bz\u0010{\u001a\u0004\b|\u0010}R!\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0000X\u0080\u0004¢\u0006\r\n\u0004\b\u0003\u0010~\u001a\u0005\b\u007f\u0010\u0080\u0001R\u0016\u0010\u0081\u0001\u001a\u00020\u001f8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0081\u0001\u0010IR\u0016\u0010\u0082\u0001\u001a\u00020\u001f8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0082\u0001\u0010IR\u0016\u0010\u0083\u0001\u001a\u00020\u001f8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0083\u0001\u0010IR\u001b\u0010\u0084\u0001\u001a\u0004\u0018\u00010C8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0084\u0001\u0010\u0085\u0001R\u0017\u00105\u001a\u0004\u0018\u00010\b8@X\u0080\u0004¢\u0006\u0007\u001a\u0005\b\u0086\u0001\u0010:R\u0016\u0010\u0088\u0001\u001a\u00020N8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b\u0087\u0001\u0010P\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0089\u0001"}, m115d2 = {"Lkotlinx/coroutines/CancellableContinuationImpl;", "T", "Lkotlin/coroutines/Continuation;", "delegate", "", "resumeMode", "<init>", "(Lkotlin/coroutines/Continuation;I)V", "", "proposedUpdate", "", "alreadyResumedError", "(Ljava/lang/Object;)Ljava/lang/Void;", "Lkotlinx/coroutines/CancelHandler;", "handler", "", "cause", "", "callCancelHandler", "(Lkotlinx/coroutines/CancelHandler;Ljava/lang/Throwable;)V", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "Lkotlinx/coroutines/CompletionHandler;", "(Lkotlin/jvm/functions/Function1;Ljava/lang/Throwable;)V", "Lkotlin/Function0;", "block", "callCancelHandlerSafely", "(Lkotlin/jvm/functions/Function0;)V", "onCancellation", "callOnCancellation", "", "cancel", "(Ljava/lang/Throwable;)Z", "takenState", "cancelCompletedResult$kotlinx_coroutines_core", "(Ljava/lang/Object;Ljava/lang/Throwable;)V", "cancelCompletedResult", "cancelLater", "token", "completeResume", "(Ljava/lang/Object;)V", "detachChild$kotlinx_coroutines_core", "()V", "detachChild", "detachChildIfNonResuable", "mode", "dispatchResume", "(I)V", "Lkotlinx/coroutines/Job;", "parent", "getContinuationCancellationCause", "(Lkotlinx/coroutines/Job;)Ljava/lang/Throwable;", "state", "getExceptionalResult$kotlinx_coroutines_core", "(Ljava/lang/Object;)Ljava/lang/Throwable;", "getExceptionalResult", "getResult", "()Ljava/lang/Object;", "Ljava/lang/StackTraceElement;", "Lkotlinx/coroutines/internal/StackTraceElement;", "getStackTraceElement", "()Ljava/lang/StackTraceElement;", "getSuccessfulResult$kotlinx_coroutines_core", "(Ljava/lang/Object;)Ljava/lang/Object;", "getSuccessfulResult", "initCancellability", "Lkotlinx/coroutines/DisposableHandle;", "installParentHandle", "()Lkotlinx/coroutines/DisposableHandle;", "invokeOnCancellation", "(Lkotlin/jvm/functions/Function1;)V", "isReusable", "()Z", "makeCancelHandler", "(Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/CancelHandler;", "multipleHandlersError", "(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V", "", "nameString", "()Ljava/lang/String;", "parentCancelled$kotlinx_coroutines_core", "(Ljava/lang/Throwable;)V", "parentCancelled", "releaseClaimedReusableContinuation", "resetStateReusable", "value", "resume", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "resumeImpl", "(Ljava/lang/Object;ILkotlin/jvm/functions/Function1;)V", "Lkotlin/Result;", "result", "resumeWith", "Lkotlinx/coroutines/NotCompleted;", "idempotent", "resumedState", "(Lkotlinx/coroutines/NotCompleted;Ljava/lang/Object;ILkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/lang/Object;", "takeState$kotlinx_coroutines_core", "takeState", "toString", "tryResume", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "Lkotlinx/coroutines/internal/Symbol;", "tryResumeImpl", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/internal/Symbol;", "exception", "tryResumeWithException", "(Ljava/lang/Throwable;)Ljava/lang/Object;", "trySuspend", "Lkotlinx/coroutines/CoroutineDispatcher;", "resumeUndispatched", "(Lkotlinx/coroutines/CoroutineDispatcher;Ljava/lang/Object;)V", "resumeUndispatchedWithException", "(Lkotlinx/coroutines/CoroutineDispatcher;Ljava/lang/Throwable;)V", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "getCallerFrame", "()Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "callerFrame", "Lkotlin/coroutines/CoroutineContext;", "context", "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "Lkotlin/coroutines/Continuation;", "getDelegate$kotlinx_coroutines_core", "()Lkotlin/coroutines/Continuation;", "isActive", "isCancelled", "isCompleted", "parentHandle", "Lkotlinx/coroutines/DisposableHandle;", "getState$kotlinx_coroutines_core", "getStateDebugRepresentation", "stateDebugRepresentation", "kotlinx-coroutines-core", "Lkotlinx/coroutines/DispatchedTask;", "Lkotlinx/coroutines/CancellableContinuation;"}, m116k = 1, m117mv = {1, 6, 0}, m119xi = 48)
public class CancellableContinuationImpl<T> extends kotlinx.coroutines.DispatchedTask<T> implements kotlinx.coroutines.CancellableContinuation<T>, kotlin.coroutines.jvm.internal.CoroutineStackFrame {
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater _decision$FU = null;
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater _state$FU = null;
    private volatile /* synthetic */ int _decision;
    private volatile /* synthetic */ java.lang.Object _state;
    private final kotlin.coroutines.CoroutineContext context;
    private final kotlin.coroutines.Continuation<T> delegate;
    private kotlinx.coroutines.DisposableHandle parentHandle;

    static {
            java.lang.String r0 = "_decision"
            java.lang.Class<kotlinx.coroutines.CancellableContinuationImpl> r1 = kotlinx.coroutines.CancellableContinuationImpl.class
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r1, r0)
            kotlinx.coroutines.CancellableContinuationImpl._decision$FU = r0
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            java.lang.String r2 = "_state"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r1, r0, r2)
            kotlinx.coroutines.CancellableContinuationImpl._state$FU = r0
            return
    }

    public CancellableContinuationImpl(kotlin.coroutines.Continuation<? super T> r4, int r5) {
            r3 = this;
            r3.<init>(r5)
            r3.delegate = r4
            boolean r0 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
            r1 = 0
            if (r0 == 0) goto L1d
            r0 = 0
            r2 = -1
            if (r5 == r2) goto L13
            r2 = 1
            goto L14
        L13:
            r2 = r1
        L14:
            if (r2 == 0) goto L17
            goto L1d
        L17:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        L1d:
            kotlin.coroutines.Continuation<T> r0 = r3.delegate
            kotlin.coroutines.CoroutineContext r0 = r0.getContext()
            r3.context = r0
            r3._decision = r1
            kotlinx.coroutines.Active r0 = kotlinx.coroutines.Active.INSTANCE
            r3._state = r0
            return
    }

    private final java.lang.Void alreadyResumedError(java.lang.Object r3) {
            r2 = this;
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Already resumed, but proposed with update "
            java.lang.String r1 = kotlin.jvm.internal.Intrinsics.stringPlus(r1, r3)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    private final void callCancelHandler(kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> r7, java.lang.Throwable r8) {
            r6 = this;
            r0 = r6
            r1 = 0
            r2 = 0
            r3 = r7
            r4 = 0
            r3.invoke(r8)     // Catch: java.lang.Throwable -> Lb
            goto L20
        Lb:
            r2 = move-exception
            kotlin.coroutines.CoroutineContext r3 = r0.getContext()
            kotlinx.coroutines.CompletionHandlerException r4 = new kotlinx.coroutines.CompletionHandlerException
            java.lang.String r5 = "Exception in invokeOnCancellation handler for "
            java.lang.String r5 = kotlin.jvm.internal.Intrinsics.stringPlus(r5, r0)
            r4.<init>(r5, r2)
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            kotlinx.coroutines.CoroutineExceptionHandlerKt.handleCoroutineException(r3, r4)
        L20:
            return
    }

    private final void callCancelHandlerSafely(kotlin.jvm.functions.Function0<kotlin.Unit> r6) {
            r5 = this;
            r0 = 0
            r6.invoke()     // Catch: java.lang.Throwable -> L6
            goto L1b
        L6:
            r1 = move-exception
            kotlin.coroutines.CoroutineContext r2 = r5.getContext()
            kotlinx.coroutines.CompletionHandlerException r3 = new kotlinx.coroutines.CompletionHandlerException
            java.lang.String r4 = "Exception in invokeOnCancellation handler for "
            java.lang.String r4 = kotlin.jvm.internal.Intrinsics.stringPlus(r4, r5)
            r3.<init>(r4, r1)
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            kotlinx.coroutines.CoroutineExceptionHandlerKt.handleCoroutineException(r2, r3)
        L1b:
            return
    }

    private final boolean cancelLater(java.lang.Throwable r3) {
            r2 = this;
            boolean r0 = r2.isReusable()
            if (r0 != 0) goto L8
            r0 = 0
            return r0
        L8:
            kotlin.coroutines.Continuation<T> r0 = r2.delegate
            kotlinx.coroutines.internal.DispatchedContinuation r0 = (kotlinx.coroutines.internal.DispatchedContinuation) r0
            boolean r1 = r0.postponeCancellation(r3)
            return r1
    }

    private final void detachChildIfNonResuable() {
            r1 = this;
            boolean r0 = r1.isReusable()
            if (r0 != 0) goto L9
            r1.detachChild$kotlinx_coroutines_core()
        L9:
            return
    }

    private final void dispatchResume(int r2) {
            r1 = this;
            boolean r0 = r1.tryResume()
            if (r0 == 0) goto L7
            return
        L7:
            r0 = r1
            kotlinx.coroutines.DispatchedTask r0 = (kotlinx.coroutines.DispatchedTask) r0
            kotlinx.coroutines.DispatchedTaskKt.dispatch(r0, r2)
            return
    }

    private final java.lang.String getStateDebugRepresentation() {
            r2 = this;
            java.lang.Object r0 = r2.getState$kotlinx_coroutines_core()
            boolean r1 = r0 instanceof kotlinx.coroutines.NotCompleted
            if (r1 == 0) goto Lb
            java.lang.String r0 = "Active"
            goto L14
        Lb:
            boolean r0 = r0 instanceof kotlinx.coroutines.CancelledContinuation
            if (r0 == 0) goto L12
            java.lang.String r0 = "Cancelled"
            goto L14
        L12:
            java.lang.String r0 = "Completed"
        L14:
            return r0
    }

    private final kotlinx.coroutines.DisposableHandle installParentHandle() {
            r7 = this;
            kotlin.coroutines.CoroutineContext r0 = r7.getContext()
            kotlinx.coroutines.Job$Key r1 = kotlinx.coroutines.Job.Key
            kotlin.coroutines.CoroutineContext$Key r1 = (kotlin.coroutines.CoroutineContext.Key) r1
            kotlin.coroutines.CoroutineContext$Element r0 = r0.get(r1)
            r1 = r0
            kotlinx.coroutines.Job r1 = (kotlinx.coroutines.Job) r1
            if (r1 != 0) goto L13
            r0 = 0
            return r0
        L13:
            kotlinx.coroutines.ChildContinuation r0 = new kotlinx.coroutines.ChildContinuation
            r0.<init>(r7)
            kotlinx.coroutines.CompletionHandlerBase r0 = (kotlinx.coroutines.CompletionHandlerBase) r0
            r2 = 0
            r4 = r0
            kotlin.jvm.functions.Function1 r4 = (kotlin.jvm.functions.Function1) r4
            r5 = 2
            r6 = 0
            r2 = 1
            r3 = 0
            kotlinx.coroutines.DisposableHandle r0 = kotlinx.coroutines.Job.DefaultImpls.invokeOnCompletion$default(r1, r2, r3, r4, r5, r6)
            r7.parentHandle = r0
            return r0
    }

    private final boolean isReusable() {
            r1 = this;
            int r0 = r1.resumeMode
            boolean r0 = kotlinx.coroutines.DispatchedTaskKt.isReusableMode(r0)
            if (r0 == 0) goto L14
            kotlin.coroutines.Continuation<T> r0 = r1.delegate
            kotlinx.coroutines.internal.DispatchedContinuation r0 = (kotlinx.coroutines.internal.DispatchedContinuation) r0
            boolean r0 = r0.isReusable()
            if (r0 == 0) goto L14
            r0 = 1
            goto L15
        L14:
            r0 = 0
        L15:
            return r0
    }

    private final kotlinx.coroutines.CancelHandler makeCancelHandler(kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> r2) {
            r1 = this;
            boolean r0 = r2 instanceof kotlinx.coroutines.CancelHandler
            if (r0 == 0) goto L8
            r0 = r2
            kotlinx.coroutines.CancelHandler r0 = (kotlinx.coroutines.CancelHandler) r0
            goto Lf
        L8:
            kotlinx.coroutines.InvokeOnCancel r0 = new kotlinx.coroutines.InvokeOnCancel
            r0.<init>(r2)
            kotlinx.coroutines.CancelHandler r0 = (kotlinx.coroutines.CancelHandler) r0
        Lf:
            return r0
    }

    private final void multipleHandlersError(kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> r4, java.lang.Object r5) {
            r3 = this;
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "It's prohibited to register multiple handlers, tried to register "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r4)
            java.lang.String r2 = ", already has "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r5)
            java.lang.String r1 = r1.toString()
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    private final void releaseClaimedReusableContinuation() {
            r3 = this;
            kotlin.coroutines.Continuation<T> r0 = r3.delegate
            boolean r1 = r0 instanceof kotlinx.coroutines.internal.DispatchedContinuation
            r2 = 0
            if (r1 == 0) goto La
            kotlinx.coroutines.internal.DispatchedContinuation r0 = (kotlinx.coroutines.internal.DispatchedContinuation) r0
            goto Lb
        La:
            r0 = r2
        Lb:
            if (r0 != 0) goto Le
            goto L15
        Le:
            r1 = r3
            kotlinx.coroutines.CancellableContinuation r1 = (kotlinx.coroutines.CancellableContinuation) r1
            java.lang.Throwable r2 = r0.tryReleaseClaimedContinuation(r1)
        L15:
            if (r2 != 0) goto L18
            return
        L18:
            r0 = r2
            r3.detachChild$kotlinx_coroutines_core()
            r3.cancel(r0)
            return
    }

    private final void resumeImpl(java.lang.Object r12, int r13, kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> r14) {
            r11 = this;
            r0 = r11
            r1 = 0
        L2:
            java.lang.Object r2 = r0._state
            r3 = 0
            boolean r4 = r2 instanceof kotlinx.coroutines.NotCompleted
            if (r4 == 0) goto L27
            r6 = r2
            kotlinx.coroutines.NotCompleted r6 = (kotlinx.coroutines.NotCompleted) r6
            r10 = 0
            r5 = r11
            r7 = r12
            r8 = r13
            r9 = r14
            java.lang.Object r4 = r5.resumedState(r6, r7, r8, r9, r10)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = kotlinx.coroutines.CancellableContinuationImpl._state$FU
            boolean r5 = androidx.concurrent.futures.C0110xc40028dd.m9m(r5, r11, r2, r4)
            if (r5 != 0) goto L20
            goto L2
        L20:
            r11.detachChildIfNonResuable()
            r11.dispatchResume(r13)
            return
        L27:
            boolean r4 = r2 instanceof kotlinx.coroutines.CancelledContinuation
            if (r4 == 0) goto L42
            r4 = r2
            kotlinx.coroutines.CancelledContinuation r4 = (kotlinx.coroutines.CancelledContinuation) r4
            boolean r4 = r4.makeResumed()
            if (r4 == 0) goto L42
            if (r14 != 0) goto L37
            goto L41
        L37:
            r4 = r14
            r5 = 0
            r6 = r2
            kotlinx.coroutines.CancelledContinuation r6 = (kotlinx.coroutines.CancelledContinuation) r6
            java.lang.Throwable r6 = r6.cause
            r11.callOnCancellation(r4, r6)
        L41:
            return
        L42:
            r11.alreadyResumedError(r12)
            kotlin.KotlinNothingValueException r4 = new kotlin.KotlinNothingValueException
            r4.<init>()
            throw r4
    }

    static /* synthetic */ void resumeImpl$default(kotlinx.coroutines.CancellableContinuationImpl r0, java.lang.Object r1, int r2, kotlin.jvm.functions.Function1 r3, int r4, java.lang.Object r5) {
            if (r5 != 0) goto Lb
            r4 = r4 & 4
            if (r4 == 0) goto L7
            r3 = 0
        L7:
            r0.resumeImpl(r1, r2, r3)
            return
        Lb:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Super calls with default arguments not supported in this target, function: resumeImpl"
            r0.<init>(r1)
            throw r0
    }

    private final java.lang.Object resumedState(kotlinx.coroutines.NotCompleted r10, java.lang.Object r11, int r12, kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> r13, java.lang.Object r14) {
            r9 = this;
            boolean r0 = r11 instanceof kotlinx.coroutines.CompletedExceptionally
            if (r0 == 0) goto L31
            boolean r0 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L1c
            r0 = 0
            if (r14 != 0) goto L12
            r0 = r1
            goto L13
        L12:
            r0 = r2
        L13:
            if (r0 == 0) goto L16
            goto L1c
        L16:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        L1c:
            boolean r0 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
            if (r0 == 0) goto L30
            r0 = 0
            if (r13 != 0) goto L26
            goto L27
        L26:
            r1 = r2
        L27:
            if (r1 == 0) goto L2a
            goto L30
        L2a:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        L30:
            goto L48
        L31:
            boolean r0 = kotlinx.coroutines.DispatchedTaskKt.isCancellableMode(r12)
            if (r0 != 0) goto L3a
            if (r14 != 0) goto L3a
            goto L48
        L3a:
            if (r13 != 0) goto L4a
            boolean r0 = r10 instanceof kotlinx.coroutines.CancelHandler
            if (r0 == 0) goto L44
            boolean r0 = r10 instanceof kotlinx.coroutines.BeforeResumeCancelHandler
            if (r0 == 0) goto L4a
        L44:
            if (r14 == 0) goto L47
            goto L4a
        L47:
        L48:
            r0 = r11
            goto L61
        L4a:
            kotlinx.coroutines.CompletedContinuation r0 = new kotlinx.coroutines.CompletedContinuation
            boolean r1 = r10 instanceof kotlinx.coroutines.CancelHandler
            if (r1 == 0) goto L54
            r1 = r10
            kotlinx.coroutines.CancelHandler r1 = (kotlinx.coroutines.CancelHandler) r1
            goto L55
        L54:
            r1 = 0
        L55:
            r3 = r1
            r7 = 16
            r8 = 0
            r6 = 0
            r1 = r0
            r2 = r11
            r4 = r13
            r5 = r14
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
        L61:
            return r0
    }

    private final boolean tryResume() {
            r7 = this;
            r0 = r7
            r1 = 0
        L2:
            int r2 = r0._decision
            r3 = 0
            r4 = 0
            switch(r2) {
                case 0: goto L17;
                case 1: goto L16;
                default: goto La;
            }
        La:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "Already resumed"
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L16:
            return r4
        L17:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r5 = kotlinx.coroutines.CancellableContinuationImpl._decision$FU
            r6 = 2
            boolean r4 = r5.compareAndSet(r7, r4, r6)
            if (r4 == 0) goto L22
            r4 = 1
            return r4
        L22:
            goto L2
    }

    private final kotlinx.coroutines.internal.Symbol tryResumeImpl(java.lang.Object r12, java.lang.Object r13, kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> r14) {
            r11 = this;
            r0 = r11
            r1 = 0
        L2:
            java.lang.Object r2 = r0._state
            r3 = 0
            boolean r4 = r2 instanceof kotlinx.coroutines.NotCompleted
            if (r4 == 0) goto L27
            r6 = r2
            kotlinx.coroutines.NotCompleted r6 = (kotlinx.coroutines.NotCompleted) r6
            int r8 = r11.resumeMode
            r5 = r11
            r7 = r12
            r9 = r14
            r10 = r13
            java.lang.Object r4 = r5.resumedState(r6, r7, r8, r9, r10)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = kotlinx.coroutines.CancellableContinuationImpl._state$FU
            boolean r5 = androidx.concurrent.futures.C0110xc40028dd.m9m(r5, r11, r2, r4)
            if (r5 != 0) goto L21
            goto L2
        L21:
            r11.detachChildIfNonResuable()
            kotlinx.coroutines.internal.Symbol r5 = kotlinx.coroutines.CancellableContinuationImplKt.RESUME_TOKEN
            return r5
        L27:
            boolean r4 = r2 instanceof kotlinx.coroutines.CompletedContinuation
            r5 = 0
            if (r4 == 0) goto L55
            if (r13 == 0) goto L51
            r4 = r2
            kotlinx.coroutines.CompletedContinuation r4 = (kotlinx.coroutines.CompletedContinuation) r4
            java.lang.Object r4 = r4.idempotentResume
            if (r4 != r13) goto L51
            boolean r4 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
            if (r4 == 0) goto L4e
            r4 = 0
            r5 = r2
            kotlinx.coroutines.CompletedContinuation r5 = (kotlinx.coroutines.CompletedContinuation) r5
            java.lang.Object r5 = r5.result
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual(r5, r12)
            if (r4 == 0) goto L48
            goto L4e
        L48:
            java.lang.AssertionError r4 = new java.lang.AssertionError
            r4.<init>()
            throw r4
        L4e:
            kotlinx.coroutines.internal.Symbol r5 = kotlinx.coroutines.CancellableContinuationImplKt.RESUME_TOKEN
            goto L54
        L51:
            r4 = r5
            kotlinx.coroutines.internal.Symbol r4 = (kotlinx.coroutines.internal.Symbol) r4
        L54:
            return r5
        L55:
            return r5
    }

    private final boolean trySuspend() {
            r7 = this;
            r0 = r7
            r1 = 0
        L2:
            int r2 = r0._decision
            r3 = 0
            r4 = 0
            switch(r2) {
                case 0: goto L17;
                case 1: goto La;
                case 2: goto L16;
                default: goto La;
            }
        La:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "Already suspended"
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L16:
            return r4
        L17:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r5 = kotlinx.coroutines.CancellableContinuationImpl._decision$FU
            r6 = 1
            boolean r4 = r5.compareAndSet(r7, r4, r6)
            if (r4 == 0) goto L21
            return r6
        L21:
            goto L2
    }

    public final void callCancelHandler(kotlinx.coroutines.CancelHandler r7, java.lang.Throwable r8) {
            r6 = this;
            r0 = r6
            r1 = 0
            r2 = 0
            r7.invoke(r8)     // Catch: java.lang.Throwable -> L8
            goto L1d
        L8:
            r2 = move-exception
            kotlin.coroutines.CoroutineContext r3 = r0.getContext()
            kotlinx.coroutines.CompletionHandlerException r4 = new kotlinx.coroutines.CompletionHandlerException
            java.lang.String r5 = "Exception in invokeOnCancellation handler for "
            java.lang.String r5 = kotlin.jvm.internal.Intrinsics.stringPlus(r5, r0)
            r4.<init>(r5, r2)
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            kotlinx.coroutines.CoroutineExceptionHandlerKt.handleCoroutineException(r3, r4)
        L1d:
            return
    }

    public final void callOnCancellation(kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> r5, java.lang.Throwable r6) {
            r4 = this;
            r5.invoke(r6)     // Catch: java.lang.Throwable -> L5
            goto L1a
        L5:
            r0 = move-exception
            kotlin.coroutines.CoroutineContext r1 = r4.getContext()
            kotlinx.coroutines.CompletionHandlerException r2 = new kotlinx.coroutines.CompletionHandlerException
            java.lang.String r3 = "Exception in resume onCancellation handler for "
            java.lang.String r3 = kotlin.jvm.internal.Intrinsics.stringPlus(r3, r4)
            r2.<init>(r3, r0)
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            kotlinx.coroutines.CoroutineExceptionHandlerKt.handleCoroutineException(r1, r2)
        L1a:
            return
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public boolean cancel(java.lang.Throwable r8) {
            r7 = this;
            r0 = r7
            r1 = 0
        L2:
            java.lang.Object r2 = r0._state
            r3 = 0
            boolean r4 = r2 instanceof kotlinx.coroutines.NotCompleted
            if (r4 != 0) goto Lc
            r4 = 0
            return r4
        Lc:
            kotlinx.coroutines.CancelledContinuation r4 = new kotlinx.coroutines.CancelledContinuation
            r5 = r7
            kotlin.coroutines.Continuation r5 = (kotlin.coroutines.Continuation) r5
            boolean r6 = r2 instanceof kotlinx.coroutines.CancelHandler
            r4.<init>(r5, r8, r6)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = kotlinx.coroutines.CancellableContinuationImpl._state$FU
            boolean r5 = androidx.concurrent.futures.C0110xc40028dd.m9m(r5, r7, r2, r4)
            if (r5 != 0) goto L1f
            goto L2
        L1f:
            boolean r5 = r2 instanceof kotlinx.coroutines.CancelHandler
            if (r5 == 0) goto L27
            r5 = r2
            kotlinx.coroutines.CancelHandler r5 = (kotlinx.coroutines.CancelHandler) r5
            goto L28
        L27:
            r5 = 0
        L28:
            if (r5 != 0) goto L2b
            goto L2f
        L2b:
            r6 = 0
            r7.callCancelHandler(r5, r8)
        L2f:
            r7.detachChildIfNonResuable()
            int r5 = r7.resumeMode
            r7.dispatchResume(r5)
            r5 = 1
            return r5
    }

    @Override // kotlinx.coroutines.DispatchedTask
    public void cancelCompletedResult$kotlinx_coroutines_core(java.lang.Object r22, java.lang.Throwable r23) {
            r21 = this;
            r0 = r21
            r1 = r21
            r2 = 0
        L5:
            java.lang.Object r11 = r1._state
            r12 = 0
            boolean r3 = r11 instanceof kotlinx.coroutines.NotCompleted
            if (r3 != 0) goto L73
            boolean r3 = r11 instanceof kotlinx.coroutines.CompletedExceptionally
            if (r3 == 0) goto L13
            return
        L13:
            boolean r3 = r11 instanceof kotlinx.coroutines.CompletedContinuation
            if (r3 == 0) goto L57
            r3 = r11
            kotlinx.coroutines.CompletedContinuation r3 = (kotlinx.coroutines.CompletedContinuation) r3
            boolean r3 = r3.getCancelled()
            if (r3 != 0) goto L47
            r13 = r11
            kotlinx.coroutines.CompletedContinuation r13 = (kotlinx.coroutines.CompletedContinuation) r13
            r19 = 15
            r20 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = r23
            kotlinx.coroutines.CompletedContinuation r3 = kotlinx.coroutines.CompletedContinuation.copy$default(r13, r14, r15, r16, r17, r18, r19, r20)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = kotlinx.coroutines.CancellableContinuationImpl._state$FU
            boolean r4 = androidx.concurrent.futures.C0110xc40028dd.m9m(r4, r0, r11, r3)
            if (r4 == 0) goto L44
            r4 = r11
            kotlinx.coroutines.CompletedContinuation r4 = (kotlinx.coroutines.CompletedContinuation) r4
            r13 = r23
            r4.invokeHandlers(r0, r13)
            return
        L44:
            r13 = r23
            goto L71
        L47:
            r13 = r23
            r3 = 0
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "Must be called at most once"
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
        L57:
            r13 = r23
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r14 = kotlinx.coroutines.CancellableContinuationImpl._state$FU
            kotlinx.coroutines.CompletedContinuation r15 = new kotlinx.coroutines.CompletedContinuation
            r9 = 14
            r10 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r3 = r15
            r4 = r11
            r8 = r23
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            boolean r3 = androidx.concurrent.futures.C0110xc40028dd.m9m(r14, r0, r11, r15)
            if (r3 == 0) goto L71
            return
        L71:
            goto L5
        L73:
            r13 = r23
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "Not completed"
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public void completeResume(java.lang.Object r3) {
            r2 = this;
            boolean r0 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
            if (r0 == 0) goto L17
            r0 = 0
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.CancellableContinuationImplKt.RESUME_TOKEN
            if (r3 != r1) goto Ld
            r1 = 1
            goto Le
        Ld:
            r1 = 0
        Le:
            if (r1 == 0) goto L11
            goto L17
        L11:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        L17:
            int r0 = r2.resumeMode
            r2.dispatchResume(r0)
            return
    }

    public final void detachChild$kotlinx_coroutines_core() {
            r2 = this;
            kotlinx.coroutines.DisposableHandle r0 = r2.parentHandle
            if (r0 != 0) goto L5
            return
        L5:
            r0.dispose()
            kotlinx.coroutines.NonDisposableHandle r1 = kotlinx.coroutines.NonDisposableHandle.INSTANCE
            kotlinx.coroutines.DisposableHandle r1 = (kotlinx.coroutines.DisposableHandle) r1
            r2.parentHandle = r1
            return
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public kotlin.coroutines.jvm.internal.CoroutineStackFrame getCallerFrame() {
            r2 = this;
            kotlin.coroutines.Continuation<T> r0 = r2.delegate
            boolean r1 = r0 instanceof kotlin.coroutines.jvm.internal.CoroutineStackFrame
            if (r1 == 0) goto L9
            kotlin.coroutines.jvm.internal.CoroutineStackFrame r0 = (kotlin.coroutines.jvm.internal.CoroutineStackFrame) r0
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    @Override // kotlin.coroutines.Continuation
    public kotlin.coroutines.CoroutineContext getContext() {
            r1 = this;
            kotlin.coroutines.CoroutineContext r0 = r1.context
            return r0
    }

    public java.lang.Throwable getContinuationCancellationCause(kotlinx.coroutines.Job r2) {
            r1 = this;
            java.util.concurrent.CancellationException r0 = r2.getCancellationException()
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            return r0
    }

    @Override // kotlinx.coroutines.DispatchedTask
    public final kotlin.coroutines.Continuation<T> getDelegate$kotlinx_coroutines_core() {
            r1 = this;
            kotlin.coroutines.Continuation<T> r0 = r1.delegate
            return r0
    }

    @Override // kotlinx.coroutines.DispatchedTask
    public java.lang.Throwable getExceptionalResult$kotlinx_coroutines_core(java.lang.Object r6) {
            r5 = this;
            java.lang.Throwable r0 = super.getExceptionalResult$kotlinx_coroutines_core(r6)
            if (r0 != 0) goto L8
            r0 = 0
            goto L23
        L8:
            r1 = 0
            kotlin.coroutines.Continuation r2 = r5.getDelegate$kotlinx_coroutines_core()
            r3 = 0
            boolean r4 = kotlinx.coroutines.DebugKt.getRECOVER_STACK_TRACES()
            if (r4 == 0) goto L21
            boolean r4 = r2 instanceof kotlin.coroutines.jvm.internal.CoroutineStackFrame
            if (r4 != 0) goto L19
            goto L21
        L19:
            r4 = r2
            kotlin.coroutines.jvm.internal.CoroutineStackFrame r4 = (kotlin.coroutines.jvm.internal.CoroutineStackFrame) r4
            java.lang.Throwable r4 = kotlinx.coroutines.internal.StackTraceRecoveryKt.access$recoverFromStackFrame(r0, r4)
            goto L22
        L21:
            r4 = r0
        L22:
            r0 = r4
        L23:
            return r0
    }

    public final java.lang.Object getResult() {
            r7 = this;
            boolean r0 = r7.isReusable()
            boolean r1 = r7.trySuspend()
            if (r1 == 0) goto L1b
            kotlinx.coroutines.DisposableHandle r1 = r7.parentHandle
            if (r1 != 0) goto L11
            r7.installParentHandle()
        L11:
            if (r0 == 0) goto L16
            r7.releaseClaimedReusableContinuation()
        L16:
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            return r1
        L1b:
            if (r0 == 0) goto L20
            r7.releaseClaimedReusableContinuation()
        L20:
            java.lang.Object r1 = r7.getState$kotlinx_coroutines_core()
            boolean r2 = r1 instanceof kotlinx.coroutines.CompletedExceptionally
            if (r2 == 0) goto L47
            r2 = r1
            kotlinx.coroutines.CompletedExceptionally r2 = (kotlinx.coroutines.CompletedExceptionally) r2
            java.lang.Throwable r2 = r2.cause
            r3 = 0
            boolean r4 = kotlinx.coroutines.DebugKt.getRECOVER_STACK_TRACES()
            if (r4 == 0) goto L46
            r4 = r7
            kotlin.coroutines.Continuation r4 = (kotlin.coroutines.Continuation) r4
            boolean r4 = r4 instanceof kotlin.coroutines.jvm.internal.CoroutineStackFrame
            if (r4 != 0) goto L3c
            goto L46
        L3c:
            r4 = r7
            kotlin.coroutines.Continuation r4 = (kotlin.coroutines.Continuation) r4
            kotlin.coroutines.jvm.internal.CoroutineStackFrame r4 = (kotlin.coroutines.jvm.internal.CoroutineStackFrame) r4
            java.lang.Throwable r4 = kotlinx.coroutines.internal.StackTraceRecoveryKt.access$recoverFromStackFrame(r2, r4)
            r2 = r4
        L46:
            throw r2
        L47:
            int r2 = r7.resumeMode
            boolean r2 = kotlinx.coroutines.DispatchedTaskKt.isCancellableMode(r2)
            if (r2 == 0) goto L8f
            kotlin.coroutines.CoroutineContext r2 = r7.getContext()
            kotlinx.coroutines.Job$Key r3 = kotlinx.coroutines.Job.Key
            kotlin.coroutines.CoroutineContext$Key r3 = (kotlin.coroutines.CoroutineContext.Key) r3
            kotlin.coroutines.CoroutineContext$Element r2 = r2.get(r3)
            kotlinx.coroutines.Job r2 = (kotlinx.coroutines.Job) r2
            if (r2 == 0) goto L8f
            boolean r3 = r2.isActive()
            if (r3 != 0) goto L8f
            java.util.concurrent.CancellationException r3 = r2.getCancellationException()
            r4 = r3
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            r7.cancelCompletedResult$kotlinx_coroutines_core(r1, r4)
            r4 = 0
            boolean r5 = kotlinx.coroutines.DebugKt.getRECOVER_STACK_TRACES()
            if (r5 == 0) goto L8b
            r5 = r7
            kotlin.coroutines.Continuation r5 = (kotlin.coroutines.Continuation) r5
            boolean r5 = r5 instanceof kotlin.coroutines.jvm.internal.CoroutineStackFrame
            if (r5 != 0) goto L7e
            goto L8b
        L7e:
            r5 = r3
            java.lang.Throwable r5 = (java.lang.Throwable) r5
            r6 = r7
            kotlin.coroutines.Continuation r6 = (kotlin.coroutines.Continuation) r6
            kotlin.coroutines.jvm.internal.CoroutineStackFrame r6 = (kotlin.coroutines.jvm.internal.CoroutineStackFrame) r6
            java.lang.Throwable r5 = kotlinx.coroutines.internal.StackTraceRecoveryKt.access$recoverFromStackFrame(r5, r6)
            goto L8e
        L8b:
            r5 = r3
            java.lang.Throwable r5 = (java.lang.Throwable) r5
        L8e:
            throw r5
        L8f:
            java.lang.Object r2 = r7.getSuccessfulResult$kotlinx_coroutines_core(r1)
            return r2
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public java.lang.StackTraceElement getStackTraceElement() {
            r1 = this;
            r0 = 0
            return r0
    }

    public final java.lang.Object getState$kotlinx_coroutines_core() {
            r1 = this;
            java.lang.Object r0 = r1._state
            return r0
    }

    @Override // kotlinx.coroutines.DispatchedTask
    public <T> T getSuccessfulResult$kotlinx_coroutines_core(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof kotlinx.coroutines.CompletedContinuation
            if (r0 == 0) goto Lb
            r0 = r2
            kotlinx.coroutines.CompletedContinuation r0 = (kotlinx.coroutines.CompletedContinuation) r0
            java.lang.Object r0 = r0.result
            goto Lc
        Lb:
            r0 = r2
        Lc:
            return r0
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public void initCancellability() {
            r2 = this;
            kotlinx.coroutines.DisposableHandle r0 = r2.installParentHandle()
            if (r0 != 0) goto L7
            return
        L7:
            boolean r1 = r2.isCompleted()
            if (r1 == 0) goto L16
            r0.dispose()
            kotlinx.coroutines.NonDisposableHandle r1 = kotlinx.coroutines.NonDisposableHandle.INSTANCE
            kotlinx.coroutines.DisposableHandle r1 = (kotlinx.coroutines.DisposableHandle) r1
            r2.parentHandle = r1
        L16:
            return
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public void invokeOnCancellation(kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> r15) {
            r14 = this;
            kotlinx.coroutines.CancelHandler r8 = r14.makeCancelHandler(r15)
            r9 = r14
            r10 = 0
        L6:
            java.lang.Object r11 = r9._state
            r12 = 0
            boolean r0 = r11 instanceof kotlinx.coroutines.Active
            if (r0 == 0) goto L18
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.CancellableContinuationImpl._state$FU
            boolean r0 = androidx.concurrent.futures.C0110xc40028dd.m9m(r0, r14, r11, r8)
            if (r0 == 0) goto La1
            return
        L18:
            boolean r0 = r11 instanceof kotlinx.coroutines.CancelHandler
            if (r0 == 0) goto L21
            r14.multipleHandlersError(r15, r11)
            goto La1
        L21:
            boolean r0 = r11 instanceof kotlinx.coroutines.CompletedExceptionally
            if (r0 == 0) goto L48
            r0 = r11
            kotlinx.coroutines.CompletedExceptionally r0 = (kotlinx.coroutines.CompletedExceptionally) r0
            boolean r0 = r0.makeHandled()
            if (r0 != 0) goto L31
            r14.multipleHandlersError(r15, r11)
        L31:
            boolean r0 = r11 instanceof kotlinx.coroutines.CancelledContinuation
            if (r0 == 0) goto L47
            boolean r0 = r11 instanceof kotlinx.coroutines.CompletedExceptionally
            r1 = 0
            if (r0 == 0) goto L3e
            r0 = r11
            kotlinx.coroutines.CompletedExceptionally r0 = (kotlinx.coroutines.CompletedExceptionally) r0
            goto L3f
        L3e:
            r0 = r1
        L3f:
            if (r0 != 0) goto L42
            goto L44
        L42:
            java.lang.Throwable r1 = r0.cause
        L44:
            r14.callCancelHandler(r15, r1)
        L47:
            return
        L48:
            boolean r0 = r11 instanceof kotlinx.coroutines.CompletedContinuation
            if (r0 == 0) goto L85
            r0 = r11
            kotlinx.coroutines.CompletedContinuation r0 = (kotlinx.coroutines.CompletedContinuation) r0
            kotlinx.coroutines.CancelHandler r0 = r0.cancelHandler
            if (r0 == 0) goto L56
            r14.multipleHandlersError(r15, r11)
        L56:
            boolean r0 = r8 instanceof kotlinx.coroutines.BeforeResumeCancelHandler
            if (r0 == 0) goto L5b
            return
        L5b:
            r0 = r11
            kotlinx.coroutines.CompletedContinuation r0 = (kotlinx.coroutines.CompletedContinuation) r0
            boolean r0 = r0.getCancelled()
            if (r0 == 0) goto L6d
            r0 = r11
            kotlinx.coroutines.CompletedContinuation r0 = (kotlinx.coroutines.CompletedContinuation) r0
            java.lang.Throwable r0 = r0.cancelCause
            r14.callCancelHandler(r15, r0)
            return
        L6d:
            r0 = r11
            kotlinx.coroutines.CompletedContinuation r0 = (kotlinx.coroutines.CompletedContinuation) r0
            r6 = 29
            r7 = 0
            r1 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r2 = r8
            kotlinx.coroutines.CompletedContinuation r0 = kotlinx.coroutines.CompletedContinuation.copy$default(r0, r1, r2, r3, r4, r5, r6, r7)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = kotlinx.coroutines.CancellableContinuationImpl._state$FU
            boolean r1 = androidx.concurrent.futures.C0110xc40028dd.m9m(r1, r14, r11, r0)
            if (r1 == 0) goto La1
            return
        L85:
            boolean r0 = r8 instanceof kotlinx.coroutines.BeforeResumeCancelHandler
            if (r0 == 0) goto L8a
            return
        L8a:
            kotlinx.coroutines.CompletedContinuation r13 = new kotlinx.coroutines.CompletedContinuation
            r6 = 28
            r7 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r0 = r13
            r1 = r11
            r2 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = kotlinx.coroutines.CancellableContinuationImpl._state$FU
            boolean r1 = androidx.concurrent.futures.C0110xc40028dd.m9m(r1, r14, r11, r0)
            if (r1 == 0) goto La1
            return
        La1:
            goto L6
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public boolean isActive() {
            r1 = this;
            java.lang.Object r0 = r1.getState$kotlinx_coroutines_core()
            boolean r0 = r0 instanceof kotlinx.coroutines.NotCompleted
            return r0
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public boolean isCancelled() {
            r1 = this;
            java.lang.Object r0 = r1.getState$kotlinx_coroutines_core()
            boolean r0 = r0 instanceof kotlinx.coroutines.CancelledContinuation
            return r0
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public boolean isCompleted() {
            r1 = this;
            java.lang.Object r0 = r1.getState$kotlinx_coroutines_core()
            boolean r0 = r0 instanceof kotlinx.coroutines.NotCompleted
            r0 = r0 ^ 1
            return r0
    }

    protected java.lang.String nameString() {
            r1 = this;
            java.lang.String r0 = "CancellableContinuation"
            return r0
    }

    public final void parentCancelled$kotlinx_coroutines_core(java.lang.Throwable r2) {
            r1 = this;
            boolean r0 = r1.cancelLater(r2)
            if (r0 == 0) goto L7
            return
        L7:
            r1.cancel(r2)
            r1.detachChildIfNonResuable()
            return
    }

    public final boolean resetStateReusable() {
            r5 = this;
            boolean r0 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L1a
            r0 = 0
            int r3 = r5.resumeMode
            r4 = 2
            if (r3 != r4) goto L10
            r0 = r1
            goto L11
        L10:
            r0 = r2
        L11:
            if (r0 == 0) goto L14
            goto L1a
        L14:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        L1a:
            boolean r0 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
            if (r0 == 0) goto L33
            r0 = 0
            kotlinx.coroutines.DisposableHandle r3 = r5.parentHandle
            kotlinx.coroutines.NonDisposableHandle r4 = kotlinx.coroutines.NonDisposableHandle.INSTANCE
            if (r3 == r4) goto L29
            r0 = r1
            goto L2a
        L29:
            r0 = r2
        L2a:
            if (r0 == 0) goto L2d
            goto L33
        L2d:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        L33:
            java.lang.Object r0 = r5._state
            boolean r3 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
            if (r3 == 0) goto L47
            r3 = 0
            boolean r4 = r0 instanceof kotlinx.coroutines.NotCompleted
            if (r4 != 0) goto L41
            goto L47
        L41:
            java.lang.AssertionError r1 = new java.lang.AssertionError
            r1.<init>()
            throw r1
        L47:
            boolean r3 = r0 instanceof kotlinx.coroutines.CompletedContinuation
            if (r3 == 0) goto L56
            r3 = r0
            kotlinx.coroutines.CompletedContinuation r3 = (kotlinx.coroutines.CompletedContinuation) r3
            java.lang.Object r3 = r3.idempotentResume
            if (r3 == 0) goto L56
            r5.detachChild$kotlinx_coroutines_core()
            return r2
        L56:
            r5._decision = r2
            kotlinx.coroutines.Active r2 = kotlinx.coroutines.Active.INSTANCE
            r5._state = r2
            return r1
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public void resume(T r2, kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> r3) {
            r1 = this;
            int r0 = r1.resumeMode
            r1.resumeImpl(r2, r0, r3)
            return
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public void resumeUndispatched(kotlinx.coroutines.CoroutineDispatcher r9, T r10) {
            r8 = this;
            kotlin.coroutines.Continuation<T> r0 = r8.delegate
            boolean r1 = r0 instanceof kotlinx.coroutines.internal.DispatchedContinuation
            r2 = 0
            if (r1 == 0) goto La
            kotlinx.coroutines.internal.DispatchedContinuation r0 = (kotlinx.coroutines.internal.DispatchedContinuation) r0
            goto Lb
        La:
            r0 = r2
        Lb:
            if (r0 != 0) goto Le
            goto L10
        Le:
            kotlinx.coroutines.CoroutineDispatcher r2 = r0.dispatcher
        L10:
            if (r2 != r9) goto L14
            r1 = 4
            goto L16
        L14:
            int r1 = r8.resumeMode
        L16:
            r4 = r1
            r6 = 4
            r7 = 0
            r5 = 0
            r2 = r8
            r3 = r10
            resumeImpl$default(r2, r3, r4, r5, r6, r7)
            return
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public void resumeUndispatchedWithException(kotlinx.coroutines.CoroutineDispatcher r10, java.lang.Throwable r11) {
            r9 = this;
            kotlin.coroutines.Continuation<T> r0 = r9.delegate
            boolean r1 = r0 instanceof kotlinx.coroutines.internal.DispatchedContinuation
            r2 = 0
            if (r1 == 0) goto La
            kotlinx.coroutines.internal.DispatchedContinuation r0 = (kotlinx.coroutines.internal.DispatchedContinuation) r0
            goto Lb
        La:
            r0 = r2
        Lb:
            kotlinx.coroutines.CompletedExceptionally r4 = new kotlinx.coroutines.CompletedExceptionally
            r1 = 0
            r3 = 2
            r4.<init>(r11, r1, r3, r2)
            if (r0 != 0) goto L15
            goto L17
        L15:
            kotlinx.coroutines.CoroutineDispatcher r2 = r0.dispatcher
        L17:
            if (r2 != r10) goto L1b
            r1 = 4
            goto L1d
        L1b:
            int r1 = r9.resumeMode
        L1d:
            r5 = r1
            r7 = 4
            r8 = 0
            r6 = 0
            r3 = r9
            resumeImpl$default(r3, r4, r5, r6, r7, r8)
            return
    }

    @Override // kotlin.coroutines.Continuation
    public void resumeWith(java.lang.Object r8) {
            r7 = this;
            r0 = r7
            kotlinx.coroutines.CancellableContinuation r0 = (kotlinx.coroutines.CancellableContinuation) r0
            java.lang.Object r2 = kotlinx.coroutines.CompletionStateKt.toState(r8, r0)
            int r3 = r7.resumeMode
            r5 = 4
            r6 = 0
            r4 = 0
            r1 = r7
            resumeImpl$default(r1, r2, r3, r4, r5, r6)
            return
    }

    @Override // kotlinx.coroutines.DispatchedTask
    public java.lang.Object takeState$kotlinx_coroutines_core() {
            r1 = this;
            java.lang.Object r0 = r1.getState$kotlinx_coroutines_core()
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r2.nameString()
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = 40
            java.lang.StringBuilder r0 = r0.append(r1)
            kotlin.coroutines.Continuation<T> r1 = r2.delegate
            java.lang.String r1 = kotlinx.coroutines.DebugStringsKt.toDebugString(r1)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "){"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = r2.getStateDebugRepresentation()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "}@"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = kotlinx.coroutines.DebugStringsKt.getHexAddress(r2)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public java.lang.Object tryResume(T r2, java.lang.Object r3) {
            r1 = this;
            r0 = 0
            kotlinx.coroutines.internal.Symbol r0 = r1.tryResumeImpl(r2, r3, r0)
            return r0
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public java.lang.Object tryResume(T r2, java.lang.Object r3, kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> r4) {
            r1 = this;
            kotlinx.coroutines.internal.Symbol r0 = r1.tryResumeImpl(r2, r3, r4)
            return r0
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public java.lang.Object tryResumeWithException(java.lang.Throwable r5) {
            r4 = this;
            kotlinx.coroutines.CompletedExceptionally r0 = new kotlinx.coroutines.CompletedExceptionally
            r1 = 0
            r2 = 2
            r3 = 0
            r0.<init>(r5, r1, r2, r3)
            kotlinx.coroutines.internal.Symbol r0 = r4.tryResumeImpl(r0, r3, r3)
            return r0
    }
}
