package kotlinx.coroutines;

/* JADX INFO: compiled from: Interruptible.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\b\u0002\u0018\u00002#\u0012\u0015\u0012\u0013\u0018\u00010\r¢\u0006\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u00050\u001bj\u0002`\u001eB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\u0005¢\u0006\u0004\b\u0011\u0010\u0007R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\u0015R\u001c\u0010\u0018\u001a\n \u0017*\u0004\u0018\u00010\u00160\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, m115d2 = {"Lkotlinx/coroutines/ThreadState;", "Lkotlinx/coroutines/Job;", "job", "<init>", "(Lkotlinx/coroutines/Job;)V", "", "clearInterrupt", "()V", "", "state", "", "invalidState", "(I)Ljava/lang/Void;", "", "cause", "invoke", "(Ljava/lang/Throwable;)V", "setup", "Lkotlinx/coroutines/DisposableHandle;", "cancelHandle", "Lkotlinx/coroutines/DisposableHandle;", "Lkotlinx/coroutines/Job;", "Ljava/lang/Thread;", "kotlin.jvm.PlatformType", "targetThread", "Ljava/lang/Thread;", "kotlinx-coroutines-core", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "Lkotlinx/coroutines/CompletionHandler;"}, m116k = 1, m117mv = {1, 6, 0}, m119xi = 48)
final class ThreadState implements kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit> {
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater _state$FU = null;
    private volatile /* synthetic */ int _state;
    private kotlinx.coroutines.DisposableHandle cancelHandle;
    private final kotlinx.coroutines.Job job;
    private final java.lang.Thread targetThread;

    static {
            java.lang.Class<kotlinx.coroutines.ThreadState> r0 = kotlinx.coroutines.ThreadState.class
            java.lang.String r1 = "_state"
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r0, r1)
            kotlinx.coroutines.ThreadState._state$FU = r0
            return
    }

    public ThreadState(kotlinx.coroutines.Job r2) {
            r1 = this;
            r1.<init>()
            r1.job = r2
            r0 = 0
            r1._state = r0
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r1.targetThread = r0
            return
    }

    private final java.lang.Void invalidState(int r4) {
            r3 = this;
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Illegal state "
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            java.lang.String r1 = kotlin.jvm.internal.Intrinsics.stringPlus(r1, r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    public final void clearInterrupt() {
            r6 = this;
            r0 = r6
            r1 = 0
        L2:
            int r2 = r0._state
            r3 = 0
            switch(r2) {
                case 0: goto L17;
                case 1: goto L9;
                case 2: goto L16;
                case 3: goto L12;
                default: goto L9;
            }
        L9:
            r6.invalidState(r2)
            kotlin.KotlinNothingValueException r4 = new kotlin.KotlinNothingValueException
            r4.<init>()
            throw r4
        L12:
            java.lang.Thread.interrupted()
            return
        L16:
            goto L29
        L17:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r4 = kotlinx.coroutines.ThreadState._state$FU
            r5 = 1
            boolean r4 = r4.compareAndSet(r6, r2, r5)
            if (r4 == 0) goto L29
            kotlinx.coroutines.DisposableHandle r4 = r6.cancelHandle
            if (r4 != 0) goto L25
            goto L28
        L25:
            r4.dispose()
        L28:
            return
        L29:
            goto L2
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

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public void invoke2(java.lang.Throwable r7) {
            r6 = this;
            r0 = r6
            r1 = 0
        L2:
            int r2 = r0._state
            r3 = 0
            switch(r2) {
                case 0: goto L13;
                case 1: goto L12;
                case 2: goto L12;
                case 3: goto L12;
                default: goto L9;
            }
        L9:
            r6.invalidState(r2)
            kotlin.KotlinNothingValueException r4 = new kotlin.KotlinNothingValueException
            r4.<init>()
            throw r4
        L12:
            return
        L13:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r4 = kotlinx.coroutines.ThreadState._state$FU
            r5 = 2
            boolean r4 = r4.compareAndSet(r6, r2, r5)
            if (r4 == 0) goto L25
            java.lang.Thread r4 = r6.targetThread
            r4.interrupt()
            r4 = 3
            r6._state = r4
            return
        L25:
            goto L2
    }

    public final void setup() {
            r6 = this;
            kotlinx.coroutines.Job r0 = r6.job
            r1 = 1
            r2 = r6
            kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
            kotlinx.coroutines.DisposableHandle r0 = r0.invokeOnCompletion(r1, r1, r2)
            r6.cancelHandle = r0
            r0 = r6
            r1 = 0
        Le:
            int r2 = r0._state
            r3 = 0
            switch(r2) {
                case 0: goto L1f;
                case 1: goto L15;
                case 2: goto L1e;
                case 3: goto L1e;
                default: goto L15;
            }
        L15:
            r6.invalidState(r2)
            kotlin.KotlinNothingValueException r4 = new kotlin.KotlinNothingValueException
            r4.<init>()
            throw r4
        L1e:
            return
        L1f:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r4 = kotlinx.coroutines.ThreadState._state$FU
            r5 = 0
            boolean r4 = r4.compareAndSet(r6, r2, r5)
            if (r4 == 0) goto L29
            return
        L29:
            goto Le
    }
}
