package kotlinx.coroutines.sync;

/* JADX INFO: compiled from: Mutex.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u00112\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u00110 :\u0006$%&'()B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\n\u001a\u00020\t2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0096@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\f\u001a\u00020\t2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0082@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\u000bJT\u0010\u0014\u001a\u00020\t\"\u0004\b\u0000\u0010\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\"\u0010\u0013\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0010H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u0019\u001a\u00020\u00012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u0019\u0010\bJ\u0019\u0010\u001a\u001a\u00020\t2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u00018@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001dR\"\u0010#\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u00110 8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006*"}, m115d2 = {"Lkotlinx/coroutines/sync/MutexImpl;", "", "locked", "<init>", "(Z)V", "", "owner", "holdsLock", "(Ljava/lang/Object;)Z", "", "lock", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lockSuspend", "R", "Lkotlinx/coroutines/selects/SelectInstance;", "select", "Lkotlin/Function2;", "Lkotlinx/coroutines/sync/Mutex;", "Lkotlin/coroutines/Continuation;", "block", "registerSelectClause2", "(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", "", "toString", "()Ljava/lang/String;", "tryLock", "unlock", "(Ljava/lang/Object;)V", "isLocked", "()Z", "isLockedEmptyQueueState$kotlinx_coroutines_core", "isLockedEmptyQueueState", "Lkotlinx/coroutines/selects/SelectClause2;", "getOnLock", "()Lkotlinx/coroutines/selects/SelectClause2;", "onLock", "LockCont", "LockSelect", "LockWaiter", "LockedQueue", "TryLockDesc", "UnlockOp", "kotlinx-coroutines-core"}, m116k = 1, m117mv = {1, 6, 0}, m119xi = 48)
public final class MutexImpl implements kotlinx.coroutines.sync.Mutex, kotlinx.coroutines.selects.SelectClause2<java.lang.Object, kotlinx.coroutines.sync.Mutex> {
    static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater _state$FU = null;
    volatile /* synthetic */ java.lang.Object _state;

    /* JADX INFO: compiled from: Mutex.kt */
    @kotlin.Metadata(m114d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u001d\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\rH\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m115d2 = {"Lkotlinx/coroutines/sync/MutexImpl$LockCont;", "Lkotlinx/coroutines/sync/MutexImpl$LockWaiter;", "Lkotlinx/coroutines/sync/MutexImpl;", "owner", "", "cont", "Lkotlinx/coroutines/CancellableContinuation;", "", "(Lkotlinx/coroutines/sync/MutexImpl;Ljava/lang/Object;Lkotlinx/coroutines/CancellableContinuation;)V", "completeResumeLockWaiter", "toString", "", "tryResumeLockWaiter", "", "kotlinx-coroutines-core"}, m116k = 1, m117mv = {1, 6, 0}, m119xi = 48)
    private final class LockCont extends kotlinx.coroutines.sync.MutexImpl.LockWaiter {
        private final kotlinx.coroutines.CancellableContinuation<kotlin.Unit> cont;
        final /* synthetic */ kotlinx.coroutines.sync.MutexImpl this$0;

        public LockCont(kotlinx.coroutines.sync.MutexImpl r1, java.lang.Object r2, kotlinx.coroutines.CancellableContinuation<? super kotlin.Unit> r3) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r1, r2)
                r0.cont = r3
                return
        }

        @Override // kotlinx.coroutines.sync.MutexImpl.LockWaiter
        public void completeResumeLockWaiter() {
                r2 = this;
                kotlinx.coroutines.CancellableContinuation<kotlin.Unit> r0 = r2.cont
                kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.CancellableContinuationImplKt.RESUME_TOKEN
                r0.completeResume(r1)
                return
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode
        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "LockCont["
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.Object r1 = r2.owner
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = ", "
                java.lang.StringBuilder r0 = r0.append(r1)
                kotlinx.coroutines.CancellableContinuation<kotlin.Unit> r1 = r2.cont
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = "] for "
                java.lang.StringBuilder r0 = r0.append(r1)
                kotlinx.coroutines.sync.MutexImpl r1 = r2.this$0
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }

        @Override // kotlinx.coroutines.sync.MutexImpl.LockWaiter
        public boolean tryResumeLockWaiter() {
                r5 = this;
                boolean r0 = r5.take()
                r1 = 0
                if (r0 != 0) goto L8
                return r1
            L8:
                kotlinx.coroutines.CancellableContinuation<kotlin.Unit> r0 = r5.cont
                kotlin.Unit r2 = kotlin.Unit.INSTANCE
                kotlinx.coroutines.sync.MutexImpl$LockCont$tryResumeLockWaiter$1 r3 = new kotlinx.coroutines.sync.MutexImpl$LockCont$tryResumeLockWaiter$1
                kotlinx.coroutines.sync.MutexImpl r4 = r5.this$0
                r3.<init>(r4, r5)
                kotlin.jvm.functions.Function1 r3 = (kotlin.jvm.functions.Function1) r3
                r4 = 0
                java.lang.Object r0 = r0.tryResume(r2, r4, r3)
                if (r0 == 0) goto L1d
                r1 = 1
            L1d:
                return r1
        }
    }

    /* JADX INFO: compiled from: Mutex.kt */
    @kotlin.Metadata(m114d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0082\u0004\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00060\u0002R\u00020\u0003BD\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\"\u0010\b\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00050\tø\u0001\u0000¢\u0006\u0002\u0010\fJ\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016R1\u0010\b\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00050\t8\u0006X\u0087\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\rR\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, m115d2 = {"Lkotlinx/coroutines/sync/MutexImpl$LockSelect;", "R", "Lkotlinx/coroutines/sync/MutexImpl$LockWaiter;", "Lkotlinx/coroutines/sync/MutexImpl;", "owner", "", "select", "Lkotlinx/coroutines/selects/SelectInstance;", "block", "Lkotlin/Function2;", "Lkotlinx/coroutines/sync/Mutex;", "Lkotlin/coroutines/Continuation;", "(Lkotlinx/coroutines/sync/MutexImpl;Ljava/lang/Object;Lkotlinx/coroutines/selects/SelectInstance;Lkotlin/jvm/functions/Function2;)V", "Lkotlin/jvm/functions/Function2;", "completeResumeLockWaiter", "", "toString", "", "tryResumeLockWaiter", "", "kotlinx-coroutines-core"}, m116k = 1, m117mv = {1, 6, 0}, m119xi = 48)
    private final class LockSelect<R> extends kotlinx.coroutines.sync.MutexImpl.LockWaiter {
        public final kotlin.jvm.functions.Function2<kotlinx.coroutines.sync.Mutex, kotlin.coroutines.Continuation<? super R>, java.lang.Object> block;
        public final kotlinx.coroutines.selects.SelectInstance<R> select;
        final /* synthetic */ kotlinx.coroutines.sync.MutexImpl this$0;

        public LockSelect(kotlinx.coroutines.sync.MutexImpl r1, java.lang.Object r2, kotlinx.coroutines.selects.SelectInstance<? super R> r3, kotlin.jvm.functions.Function2<? super kotlinx.coroutines.sync.Mutex, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> r4) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r1, r2)
                r0.select = r3
                r0.block = r4
                return
        }

        @Override // kotlinx.coroutines.sync.MutexImpl.LockWaiter
        public void completeResumeLockWaiter() {
                r5 = this;
                kotlin.jvm.functions.Function2<kotlinx.coroutines.sync.Mutex, kotlin.coroutines.Continuation<? super R>, java.lang.Object> r0 = r5.block
                kotlinx.coroutines.sync.MutexImpl r1 = r5.this$0
                kotlinx.coroutines.selects.SelectInstance<R> r2 = r5.select
                kotlin.coroutines.Continuation r2 = r2.getCompletion()
                kotlinx.coroutines.sync.MutexImpl$LockSelect$completeResumeLockWaiter$1 r3 = new kotlinx.coroutines.sync.MutexImpl$LockSelect$completeResumeLockWaiter$1
                kotlinx.coroutines.sync.MutexImpl r4 = r5.this$0
                r3.<init>(r4, r5)
                kotlin.jvm.functions.Function1 r3 = (kotlin.jvm.functions.Function1) r3
                kotlinx.coroutines.intrinsics.CancellableKt.startCoroutineCancellable(r0, r1, r2, r3)
                return
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode
        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "LockSelect["
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.Object r1 = r2.owner
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = ", "
                java.lang.StringBuilder r0 = r0.append(r1)
                kotlinx.coroutines.selects.SelectInstance<R> r1 = r2.select
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = "] for "
                java.lang.StringBuilder r0 = r0.append(r1)
                kotlinx.coroutines.sync.MutexImpl r1 = r2.this$0
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }

        @Override // kotlinx.coroutines.sync.MutexImpl.LockWaiter
        public boolean tryResumeLockWaiter() {
                r1 = this;
                boolean r0 = r1.take()
                if (r0 == 0) goto L10
                kotlinx.coroutines.selects.SelectInstance<R> r0 = r1.select
                boolean r0 = r0.trySelect()
                if (r0 == 0) goto L10
                r0 = 1
                goto L11
            L10:
                r0 = 0
            L11:
                return r0
        }
    }

    /* JADX INFO: compiled from: Mutex.kt */
    @kotlin.Metadata(m114d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b¢\u0004\u0018\u00002\u00020\u000f2\u00020\u0010B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\u0007J\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH&¢\u0006\u0004\b\f\u0010\u000bR\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u00018\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\r¨\u0006\u000e"}, m115d2 = {"Lkotlinx/coroutines/sync/MutexImpl$LockWaiter;", "", "owner", "<init>", "(Lkotlinx/coroutines/sync/MutexImpl;Ljava/lang/Object;)V", "", "completeResumeLockWaiter", "()V", "dispose", "", "take", "()Z", "tryResumeLockWaiter", "Ljava/lang/Object;", "kotlinx-coroutines-core", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "Lkotlinx/coroutines/DisposableHandle;"}, m116k = 1, m117mv = {1, 6, 0}, m119xi = 48)
    private abstract class LockWaiter extends kotlinx.coroutines.internal.LockFreeLinkedListNode implements kotlinx.coroutines.DisposableHandle {
        private static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater isTaken$FU = null;
        private volatile /* synthetic */ int isTaken;
        public final java.lang.Object owner;
        final /* synthetic */ kotlinx.coroutines.sync.MutexImpl this$0;

        static {
                java.lang.Class<kotlinx.coroutines.sync.MutexImpl$LockWaiter> r0 = kotlinx.coroutines.sync.MutexImpl.LockWaiter.class
                java.lang.String r1 = "isTaken"
                java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r0, r1)
                kotlinx.coroutines.sync.MutexImpl.LockWaiter.isTaken$FU = r0
                return
        }

        public LockWaiter(kotlinx.coroutines.sync.MutexImpl r2, java.lang.Object r3) {
                r1 = this;
                r1.this$0 = r2
                r1.<init>()
                r1.owner = r3
                r0 = 0
                r1.isTaken = r0
                return
        }

        public abstract void completeResumeLockWaiter();

        @Override // kotlinx.coroutines.DisposableHandle
        public final void dispose() {
                r0 = this;
                r0.mo10219remove()
                return
        }

        public final boolean take() {
                r3 = this;
                java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = kotlinx.coroutines.sync.MutexImpl.LockWaiter.isTaken$FU
                r1 = 0
                r2 = 1
                boolean r0 = r0.compareAndSet(r3, r1, r2)
                return r0
        }

        public abstract boolean tryResumeLockWaiter();
    }

    /* JADX INFO: compiled from: Mutex.kt */
    @kotlin.Metadata(m114d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016R\u0012\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m115d2 = {"Lkotlinx/coroutines/sync/MutexImpl$LockedQueue;", "Lkotlinx/coroutines/internal/LockFreeLinkedListHead;", "owner", "", "(Ljava/lang/Object;)V", "toString", "", "kotlinx-coroutines-core"}, m116k = 1, m117mv = {1, 6, 0}, m119xi = 48)
    private static final class LockedQueue extends kotlinx.coroutines.internal.LockFreeLinkedListHead {
        public java.lang.Object owner;

        public LockedQueue(java.lang.Object r1) {
                r0 = this;
                r0.<init>()
                r0.owner = r1
                return
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode
        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "LockedQueue["
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.Object r1 = r2.owner
                java.lang.StringBuilder r0 = r0.append(r1)
                r1 = 93
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    /* JADX INFO: compiled from: Mutex.kt */
    @kotlin.Metadata(m114d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001:\u0001\rB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u001e\u0010\u0007\u001a\u00020\b2\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005H\u0016J\u0016\u0010\f\u001a\u0004\u0018\u00010\u00052\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\nH\u0016R\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m115d2 = {"Lkotlinx/coroutines/sync/MutexImpl$TryLockDesc;", "Lkotlinx/coroutines/internal/AtomicDesc;", "mutex", "Lkotlinx/coroutines/sync/MutexImpl;", "owner", "", "(Lkotlinx/coroutines/sync/MutexImpl;Ljava/lang/Object;)V", "complete", "", "op", "Lkotlinx/coroutines/internal/AtomicOp;", "failure", "prepare", "PrepareOp", "kotlinx-coroutines-core"}, m116k = 1, m117mv = {1, 6, 0}, m119xi = 48)
    private static final class TryLockDesc extends kotlinx.coroutines.internal.AtomicDesc {
        public final kotlinx.coroutines.sync.MutexImpl mutex;
        public final java.lang.Object owner;

        /* JADX INFO: compiled from: Mutex.kt */
        @kotlin.Metadata(m114d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\u0002\u0010\u0004J\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016R\u0018\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, m115d2 = {"Lkotlinx/coroutines/sync/MutexImpl$TryLockDesc$PrepareOp;", "Lkotlinx/coroutines/internal/OpDescriptor;", "atomicOp", "Lkotlinx/coroutines/internal/AtomicOp;", "(Lkotlinx/coroutines/sync/MutexImpl$TryLockDesc;Lkotlinx/coroutines/internal/AtomicOp;)V", "getAtomicOp", "()Lkotlinx/coroutines/internal/AtomicOp;", "perform", "", "affected", "kotlinx-coroutines-core"}, m116k = 1, m117mv = {1, 6, 0}, m119xi = 48)
        private final class PrepareOp extends kotlinx.coroutines.internal.OpDescriptor {
            private final kotlinx.coroutines.internal.AtomicOp<?> atomicOp;
            final /* synthetic */ kotlinx.coroutines.sync.MutexImpl.TryLockDesc this$0;

            public PrepareOp(kotlinx.coroutines.sync.MutexImpl.TryLockDesc r1, kotlinx.coroutines.internal.AtomicOp<?> r2) {
                    r0 = this;
                    r0.this$0 = r1
                    r0.<init>()
                    r0.atomicOp = r2
                    return
            }

            @Override // kotlinx.coroutines.internal.OpDescriptor
            public kotlinx.coroutines.internal.AtomicOp<?> getAtomicOp() {
                    r1 = this;
                    kotlinx.coroutines.internal.AtomicOp<?> r0 = r1.atomicOp
                    return r0
            }

            @Override // kotlinx.coroutines.internal.OpDescriptor
            public java.lang.Object perform(java.lang.Object r4) {
                    r3 = this;
                    kotlinx.coroutines.internal.AtomicOp r0 = r3.getAtomicOp()
                    boolean r0 = r0.isDecided()
                    if (r0 == 0) goto Lf
                    kotlinx.coroutines.sync.Empty r0 = kotlinx.coroutines.sync.MutexKt.access$getEMPTY_UNLOCKED$p()
                    goto L13
                Lf:
                    kotlinx.coroutines.internal.AtomicOp r0 = r3.getAtomicOp()
                L13:
                    if (r4 == 0) goto L1f
                    r1 = r4
                    kotlinx.coroutines.sync.MutexImpl r1 = (kotlinx.coroutines.sync.MutexImpl) r1
                    java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = kotlinx.coroutines.sync.MutexImpl._state$FU
                    androidx.concurrent.futures.C0110xc40028dd.m9m(r2, r1, r3, r0)
                    r1 = 0
                    return r1
                L1f:
                    java.lang.NullPointerException r1 = new java.lang.NullPointerException
                    java.lang.String r2 = "null cannot be cast to non-null type kotlinx.coroutines.sync.MutexImpl"
                    r1.<init>(r2)
                    throw r1
            }
        }

        public TryLockDesc(kotlinx.coroutines.sync.MutexImpl r1, java.lang.Object r2) {
                r0 = this;
                r0.<init>()
                r0.mutex = r1
                r0.owner = r2
                return
        }

        @Override // kotlinx.coroutines.internal.AtomicDesc
        public void complete(kotlinx.coroutines.internal.AtomicOp<?> r4, java.lang.Object r5) {
                r3 = this;
                if (r5 == 0) goto L7
                kotlinx.coroutines.sync.Empty r0 = kotlinx.coroutines.sync.MutexKt.access$getEMPTY_UNLOCKED$p()
                goto L17
            L7:
                java.lang.Object r0 = r3.owner
                if (r0 != 0) goto L10
                kotlinx.coroutines.sync.Empty r0 = kotlinx.coroutines.sync.MutexKt.access$getEMPTY_LOCKED$p()
                goto L17
            L10:
                kotlinx.coroutines.sync.Empty r0 = new kotlinx.coroutines.sync.Empty
                java.lang.Object r1 = r3.owner
                r0.<init>(r1)
            L17:
                kotlinx.coroutines.sync.MutexImpl r1 = r3.mutex
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = kotlinx.coroutines.sync.MutexImpl._state$FU
                androidx.concurrent.futures.C0110xc40028dd.m9m(r2, r1, r4, r0)
                return
        }

        @Override // kotlinx.coroutines.internal.AtomicDesc
        public java.lang.Object prepare(kotlinx.coroutines.internal.AtomicOp<?> r5) {
                r4 = this;
                kotlinx.coroutines.sync.MutexImpl$TryLockDesc$PrepareOp r0 = new kotlinx.coroutines.sync.MutexImpl$TryLockDesc$PrepareOp
                r0.<init>(r4, r5)
                kotlinx.coroutines.sync.MutexImpl r1 = r4.mutex
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = kotlinx.coroutines.sync.MutexImpl._state$FU
                kotlinx.coroutines.sync.Empty r3 = kotlinx.coroutines.sync.MutexKt.access$getEMPTY_UNLOCKED$p()
                boolean r1 = androidx.concurrent.futures.C0110xc40028dd.m9m(r2, r1, r3, r0)
                if (r1 != 0) goto L18
                kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.sync.MutexKt.access$getLOCK_FAIL$p()
                return r1
            L18:
                kotlinx.coroutines.sync.MutexImpl r1 = r4.mutex
                java.lang.Object r1 = r0.perform(r1)
                return r1
        }
    }

    /* JADX INFO: compiled from: Mutex.kt */
    @kotlin.Metadata(m114d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\b\u001a\u00020\u0002H\u0016R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m115d2 = {"Lkotlinx/coroutines/sync/MutexImpl$UnlockOp;", "Lkotlinx/coroutines/internal/AtomicOp;", "Lkotlinx/coroutines/sync/MutexImpl;", "queue", "Lkotlinx/coroutines/sync/MutexImpl$LockedQueue;", "(Lkotlinx/coroutines/sync/MutexImpl$LockedQueue;)V", "complete", "", "affected", "failure", "", "prepare", "kotlinx-coroutines-core"}, m116k = 1, m117mv = {1, 6, 0}, m119xi = 48)
    private static final class UnlockOp extends kotlinx.coroutines.internal.AtomicOp<kotlinx.coroutines.sync.MutexImpl> {
        public final kotlinx.coroutines.sync.MutexImpl.LockedQueue queue;

        public UnlockOp(kotlinx.coroutines.sync.MutexImpl.LockedQueue r1) {
                r0 = this;
                r0.<init>()
                r0.queue = r1
                return
        }

        @Override // kotlinx.coroutines.internal.AtomicOp
        public /* bridge */ /* synthetic */ void complete(kotlinx.coroutines.sync.MutexImpl r2, java.lang.Object r3) {
                r1 = this;
                r0 = r2
                kotlinx.coroutines.sync.MutexImpl r0 = (kotlinx.coroutines.sync.MutexImpl) r0
                r1.complete2(r0, r3)
                return
        }

        /* JADX INFO: renamed from: complete, reason: avoid collision after fix types in other method */
        public void complete2(kotlinx.coroutines.sync.MutexImpl r3, java.lang.Object r4) {
                r2 = this;
                if (r4 != 0) goto L7
                kotlinx.coroutines.sync.Empty r0 = kotlinx.coroutines.sync.MutexKt.access$getEMPTY_UNLOCKED$p()
                goto L9
            L7:
                kotlinx.coroutines.sync.MutexImpl$LockedQueue r0 = r2.queue
            L9:
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = kotlinx.coroutines.sync.MutexImpl._state$FU
                androidx.concurrent.futures.C0110xc40028dd.m9m(r1, r3, r2, r0)
                return
        }

        @Override // kotlinx.coroutines.internal.AtomicOp
        public /* bridge */ /* synthetic */ java.lang.Object prepare(kotlinx.coroutines.sync.MutexImpl r2) {
                r1 = this;
                r0 = r2
                kotlinx.coroutines.sync.MutexImpl r0 = (kotlinx.coroutines.sync.MutexImpl) r0
                java.lang.Object r0 = r1.prepare2(r0)
                return r0
        }

        /* JADX INFO: renamed from: prepare, reason: avoid collision after fix types in other method */
        public java.lang.Object prepare2(kotlinx.coroutines.sync.MutexImpl r2) {
                r1 = this;
                kotlinx.coroutines.sync.MutexImpl$LockedQueue r0 = r1.queue
                boolean r0 = r0.isEmpty()
                if (r0 == 0) goto La
                r0 = 0
                goto Le
            La:
                kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.sync.MutexKt.access$getUNLOCK_FAIL$p()
            Le:
                return r0
        }
    }

    static {
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            java.lang.String r1 = "_state"
            java.lang.Class<kotlinx.coroutines.sync.MutexImpl> r2 = kotlinx.coroutines.sync.MutexImpl.class
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r0, r1)
            kotlinx.coroutines.sync.MutexImpl._state$FU = r0
            return
    }

    public MutexImpl(boolean r2) {
            r1 = this;
            r1.<init>()
            if (r2 == 0) goto La
            kotlinx.coroutines.sync.Empty r0 = kotlinx.coroutines.sync.MutexKt.access$getEMPTY_LOCKED$p()
            goto Le
        La:
            kotlinx.coroutines.sync.Empty r0 = kotlinx.coroutines.sync.MutexKt.access$getEMPTY_UNLOCKED$p()
        Le:
            r1._state = r0
            return
    }

    public static final /* synthetic */ java.lang.Object access$lockSuspend(kotlinx.coroutines.sync.MutexImpl r1, java.lang.Object r2, kotlin.coroutines.Continuation r3) {
            java.lang.Object r0 = r1.lockSuspend(r2, r3)
            return r0
    }

    private final java.lang.Object lockSuspend(java.lang.Object r17, kotlin.coroutines.Continuation<? super kotlin.Unit> r18) {
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = 0
            r3 = r18
            r4 = 0
            kotlin.coroutines.Continuation r5 = kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(r3)
            kotlinx.coroutines.CancellableContinuationImpl r5 = kotlinx.coroutines.CancellableContinuationKt.getOrCreateCancellableContinuation(r5)
            r6 = r5
            kotlinx.coroutines.CancellableContinuation r6 = (kotlinx.coroutines.CancellableContinuation) r6
            r7 = 0
            r8 = 0
            kotlinx.coroutines.sync.MutexImpl$LockCont r9 = new kotlinx.coroutines.sync.MutexImpl$LockCont
            r9.<init>(r0, r1, r6)
            r8 = r9
            r9 = r16
            r10 = 0
        L1e:
            java.lang.Object r11 = r9._state
            r12 = 0
            boolean r13 = r11 instanceof kotlinx.coroutines.sync.Empty
            if (r13 == 0) goto L64
            r13 = r11
            kotlinx.coroutines.sync.Empty r13 = (kotlinx.coroutines.sync.Empty) r13
            java.lang.Object r13 = r13.locked
            kotlinx.coroutines.internal.Symbol r14 = kotlinx.coroutines.sync.MutexKt.access$getUNLOCKED$p()
            if (r13 == r14) goto L43
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r13 = kotlinx.coroutines.sync.MutexImpl._state$FU
            kotlinx.coroutines.sync.MutexImpl$LockedQueue r14 = new kotlinx.coroutines.sync.MutexImpl$LockedQueue
            r15 = r11
            kotlinx.coroutines.sync.Empty r15 = (kotlinx.coroutines.sync.Empty) r15
            java.lang.Object r15 = r15.locked
            r14.<init>(r15)
            androidx.concurrent.futures.C0110xc40028dd.m9m(r13, r0, r11, r14)
            goto Lc9
        L43:
            if (r1 != 0) goto L4a
            kotlinx.coroutines.sync.Empty r13 = kotlinx.coroutines.sync.MutexKt.access$getEMPTY_LOCKED$p()
            goto L4f
        L4a:
            kotlinx.coroutines.sync.Empty r13 = new kotlinx.coroutines.sync.Empty
            r13.<init>(r1)
        L4f:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r14 = kotlinx.coroutines.sync.MutexImpl._state$FU
            boolean r14 = androidx.concurrent.futures.C0110xc40028dd.m9m(r14, r0, r11, r13)
            if (r14 == 0) goto Lc9
            kotlin.Unit r14 = kotlin.Unit.INSTANCE
            kotlinx.coroutines.sync.MutexImpl$lockSuspend$2$1$1 r15 = new kotlinx.coroutines.sync.MutexImpl$lockSuspend$2$1$1
            r15.<init>(r0, r1)
            kotlin.jvm.functions.Function1 r15 = (kotlin.jvm.functions.Function1) r15
            r6.resume(r14, r15)
            goto L96
        L64:
            boolean r13 = r11 instanceof kotlinx.coroutines.sync.MutexImpl.LockedQueue
            if (r13 == 0) goto Lbf
            r13 = r11
            kotlinx.coroutines.sync.MutexImpl$LockedQueue r13 = (kotlinx.coroutines.sync.MutexImpl.LockedQueue) r13
            java.lang.Object r13 = r13.owner
            if (r13 == r1) goto L71
            r14 = 1
            goto L72
        L71:
            r14 = 0
        L72:
            if (r14 == 0) goto Lae
            r14 = r11
            kotlinx.coroutines.sync.MutexImpl$LockedQueue r14 = (kotlinx.coroutines.sync.MutexImpl.LockedQueue) r14
            r15 = r8
            kotlinx.coroutines.internal.LockFreeLinkedListNode r15 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r15
            r14.addLast(r15)
            java.lang.Object r14 = r0._state
            if (r14 == r11) goto L8f
            boolean r14 = r8.take()
            if (r14 != 0) goto L88
            goto L8f
        L88:
            kotlinx.coroutines.sync.MutexImpl$LockCont r14 = new kotlinx.coroutines.sync.MutexImpl$LockCont
            r14.<init>(r0, r1, r6)
            r8 = r14
            goto Lca
        L8f:
            r14 = r8
            kotlinx.coroutines.internal.LockFreeLinkedListNode r14 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r14
            kotlinx.coroutines.CancellableContinuationKt.removeOnCancellation(r6, r14)
        L96:
            java.lang.Object r3 = r5.getResult()
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r3 != r4) goto La3
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r18)
        La3:
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r3 != r2) goto Lab
            return r3
        Lab:
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            return r2
        Lae:
            r14 = 0
            java.lang.String r15 = "Already locked by "
            java.lang.String r14 = kotlin.jvm.internal.Intrinsics.stringPlus(r15, r1)
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r14 = r14.toString()
            r15.<init>(r14)
            throw r15
        Lbf:
            boolean r13 = r11 instanceof kotlinx.coroutines.internal.OpDescriptor
            if (r13 == 0) goto Lcc
            r13 = r11
            kotlinx.coroutines.internal.OpDescriptor r13 = (kotlinx.coroutines.internal.OpDescriptor) r13
            r13.perform(r0)
        Lc9:
        Lca:
            goto L1e
        Lcc:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "Illegal state "
            java.lang.String r14 = kotlin.jvm.internal.Intrinsics.stringPlus(r14, r11)
            java.lang.String r14 = r14.toString()
            r13.<init>(r14)
            throw r13
    }

    @Override // kotlinx.coroutines.sync.Mutex
    public kotlinx.coroutines.selects.SelectClause2<java.lang.Object, kotlinx.coroutines.sync.Mutex> getOnLock() {
            r1 = this;
            r0 = r1
            kotlinx.coroutines.selects.SelectClause2 r0 = (kotlinx.coroutines.selects.SelectClause2) r0
            return r0
    }

    @Override // kotlinx.coroutines.sync.Mutex
    public boolean holdsLock(java.lang.Object r6) {
            r5 = this;
            java.lang.Object r0 = r5._state
            r1 = 0
            boolean r2 = r0 instanceof kotlinx.coroutines.sync.Empty
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L14
            r2 = r0
            kotlinx.coroutines.sync.Empty r2 = (kotlinx.coroutines.sync.Empty) r2
            java.lang.Object r2 = r2.locked
            if (r2 != r6) goto L12
            goto L23
        L12:
            r3 = r4
            goto L23
        L14:
            boolean r2 = r0 instanceof kotlinx.coroutines.sync.MutexImpl.LockedQueue
            if (r2 == 0) goto L22
            r2 = r0
            kotlinx.coroutines.sync.MutexImpl$LockedQueue r2 = (kotlinx.coroutines.sync.MutexImpl.LockedQueue) r2
            java.lang.Object r2 = r2.owner
            if (r2 != r6) goto L20
            goto L23
        L20:
            r3 = r4
            goto L23
        L22:
            r3 = r4
        L23:
            return r3
    }

    @Override // kotlinx.coroutines.sync.Mutex
    public boolean isLocked() {
            r7 = this;
            r0 = r7
            r1 = 0
        L2:
            java.lang.Object r2 = r0._state
            r3 = 0
            boolean r4 = r2 instanceof kotlinx.coroutines.sync.Empty
            r5 = 1
            if (r4 == 0) goto L1a
            r4 = r2
            kotlinx.coroutines.sync.Empty r4 = (kotlinx.coroutines.sync.Empty) r4
            java.lang.Object r4 = r4.locked
            kotlinx.coroutines.internal.Symbol r6 = kotlinx.coroutines.sync.MutexKt.access$getUNLOCKED$p()
            if (r4 == r6) goto L18
            goto L19
        L18:
            r5 = 0
        L19:
            return r5
        L1a:
            boolean r4 = r2 instanceof kotlinx.coroutines.sync.MutexImpl.LockedQueue
            if (r4 == 0) goto L1f
            return r5
        L1f:
            boolean r4 = r2 instanceof kotlinx.coroutines.internal.OpDescriptor
            if (r4 == 0) goto L2b
            r4 = r2
            kotlinx.coroutines.internal.OpDescriptor r4 = (kotlinx.coroutines.internal.OpDescriptor) r4
            r4.perform(r7)
            goto L2
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "Illegal state "
            java.lang.String r5 = kotlin.jvm.internal.Intrinsics.stringPlus(r5, r2)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
    }

    public final boolean isLockedEmptyQueueState$kotlinx_coroutines_core() {
            r2 = this;
            java.lang.Object r0 = r2._state
            boolean r1 = r0 instanceof kotlinx.coroutines.sync.MutexImpl.LockedQueue
            if (r1 == 0) goto L11
            r1 = r0
            kotlinx.coroutines.sync.MutexImpl$LockedQueue r1 = (kotlinx.coroutines.sync.MutexImpl.LockedQueue) r1
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L11
            r1 = 1
            goto L12
        L11:
            r1 = 0
        L12:
            return r1
    }

    @Override // kotlinx.coroutines.sync.Mutex
    public java.lang.Object lock(java.lang.Object r3, kotlin.coroutines.Continuation<? super kotlin.Unit> r4) {
            r2 = this;
            boolean r0 = r2.tryLock(r3)
            if (r0 == 0) goto L9
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L9:
            java.lang.Object r0 = r2.lockSuspend(r3, r4)
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r0 != r1) goto L14
            return r0
        L14:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
    }

    @Override // kotlinx.coroutines.selects.SelectClause2
    public <R> void registerSelectClause2(kotlinx.coroutines.selects.SelectInstance<? super R> r5, java.lang.Object r6, kotlin.jvm.functions.Function2<? super kotlinx.coroutines.sync.Mutex, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> r7) {
            r4 = this;
        L1:
            boolean r0 = r5.isSelected()
            if (r0 == 0) goto L9
            return
        L9:
            java.lang.Object r0 = r4._state
            boolean r1 = r0 instanceof kotlinx.coroutines.sync.Empty
            if (r1 == 0) goto L63
            r1 = r0
            kotlinx.coroutines.sync.Empty r1 = (kotlinx.coroutines.sync.Empty) r1
            java.lang.Object r1 = r1.locked
            kotlinx.coroutines.internal.Symbol r2 = kotlinx.coroutines.sync.MutexKt.access$getUNLOCKED$p()
            if (r1 == r2) goto L2a
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = kotlinx.coroutines.sync.MutexImpl._state$FU
            kotlinx.coroutines.sync.MutexImpl$LockedQueue r2 = new kotlinx.coroutines.sync.MutexImpl$LockedQueue
            r3 = r0
            kotlinx.coroutines.sync.Empty r3 = (kotlinx.coroutines.sync.Empty) r3
            java.lang.Object r3 = r3.locked
            r2.<init>(r3)
            androidx.concurrent.futures.C0110xc40028dd.m9m(r1, r4, r0, r2)
            goto L1
        L2a:
            kotlinx.coroutines.sync.MutexImpl$TryLockDesc r1 = new kotlinx.coroutines.sync.MutexImpl$TryLockDesc
            r1.<init>(r4, r6)
            kotlinx.coroutines.internal.AtomicDesc r1 = (kotlinx.coroutines.internal.AtomicDesc) r1
            java.lang.Object r1 = r5.performAtomicTrySelect(r1)
            if (r1 != 0) goto L40
            kotlin.coroutines.Continuation r2 = r5.getCompletion()
            kotlinx.coroutines.intrinsics.UndispatchedKt.startCoroutineUnintercepted(r7, r4, r2)
            return
        L40:
            java.lang.Object r2 = kotlinx.coroutines.selects.SelectKt.getALREADY_SELECTED()
            if (r1 != r2) goto L47
            return
        L47:
            kotlinx.coroutines.internal.Symbol r2 = kotlinx.coroutines.sync.MutexKt.access$getLOCK_FAIL$p()
            if (r1 != r2) goto L4e
            goto L1
        L4e:
            java.lang.Object r2 = kotlinx.coroutines.internal.AtomicKt.RETRY_ATOMIC
            if (r1 != r2) goto L53
            goto L1
        L53:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "performAtomicTrySelect(TryLockDesc) returned "
            java.lang.String r3 = kotlin.jvm.internal.Intrinsics.stringPlus(r3, r1)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
        L63:
            boolean r1 = r0 instanceof kotlinx.coroutines.sync.MutexImpl.LockedQueue
            if (r1 == 0) goto La3
            r1 = r0
            kotlinx.coroutines.sync.MutexImpl$LockedQueue r1 = (kotlinx.coroutines.sync.MutexImpl.LockedQueue) r1
            java.lang.Object r1 = r1.owner
            if (r1 == r6) goto L70
            r1 = 1
            goto L71
        L70:
            r1 = 0
        L71:
            if (r1 == 0) goto L92
            kotlinx.coroutines.sync.MutexImpl$LockSelect r1 = new kotlinx.coroutines.sync.MutexImpl$LockSelect
            r1.<init>(r4, r6, r5, r7)
            r2 = r0
            kotlinx.coroutines.sync.MutexImpl$LockedQueue r2 = (kotlinx.coroutines.sync.MutexImpl.LockedQueue) r2
            r3 = r1
            kotlinx.coroutines.internal.LockFreeLinkedListNode r3 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r3
            r2.addLast(r3)
            java.lang.Object r2 = r4._state
            if (r2 == r0) goto L8b
            boolean r2 = r1.take()
            if (r2 != 0) goto L1
        L8b:
            r2 = r1
            kotlinx.coroutines.DisposableHandle r2 = (kotlinx.coroutines.DisposableHandle) r2
            r5.disposeOnSelect(r2)
            return
        L92:
            r1 = 0
            java.lang.String r2 = "Already locked by "
            java.lang.String r1 = kotlin.jvm.internal.Intrinsics.stringPlus(r2, r6)
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r1 = r1.toString()
            r2.<init>(r1)
            throw r2
        La3:
            boolean r1 = r0 instanceof kotlinx.coroutines.internal.OpDescriptor
            if (r1 == 0) goto Laf
            r1 = r0
            kotlinx.coroutines.internal.OpDescriptor r1 = (kotlinx.coroutines.internal.OpDescriptor) r1
            r1.perform(r4)
            goto L1
        Laf:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Illegal state "
            java.lang.String r2 = kotlin.jvm.internal.Intrinsics.stringPlus(r2, r0)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    public java.lang.String toString() {
            r7 = this;
            r0 = r7
            r1 = 0
        L2:
            java.lang.Object r2 = r0._state
            r3 = 0
            boolean r4 = r2 instanceof kotlinx.coroutines.sync.Empty
            r5 = 93
            java.lang.String r6 = "Mutex["
            if (r4 == 0) goto L2a
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.StringBuilder r4 = r4.append(r6)
            r6 = r2
            kotlinx.coroutines.sync.Empty r6 = (kotlinx.coroutines.sync.Empty) r6
            java.lang.Object r6 = r6.locked
            java.lang.StringBuilder r4 = r4.append(r6)
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r4 = r4.toString()
            return r4
        L2a:
            boolean r4 = r2 instanceof kotlinx.coroutines.internal.OpDescriptor
            if (r4 == 0) goto L36
            r4 = r2
            kotlinx.coroutines.internal.OpDescriptor r4 = (kotlinx.coroutines.internal.OpDescriptor) r4
            r4.perform(r7)
            goto L2
        L36:
            boolean r4 = r2 instanceof kotlinx.coroutines.sync.MutexImpl.LockedQueue
            if (r4 == 0) goto L55
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.StringBuilder r4 = r4.append(r6)
            r6 = r2
            kotlinx.coroutines.sync.MutexImpl$LockedQueue r6 = (kotlinx.coroutines.sync.MutexImpl.LockedQueue) r6
            java.lang.Object r6 = r6.owner
            java.lang.StringBuilder r4 = r4.append(r6)
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r4 = r4.toString()
            return r4
        L55:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "Illegal state "
            java.lang.String r5 = kotlin.jvm.internal.Intrinsics.stringPlus(r5, r2)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
    }

    @Override // kotlinx.coroutines.sync.Mutex
    public boolean tryLock(java.lang.Object r9) {
            r8 = this;
            r0 = r8
            r1 = 0
        L2:
            java.lang.Object r2 = r0._state
            r3 = 0
            boolean r4 = r2 instanceof kotlinx.coroutines.sync.Empty
            r5 = 1
            r6 = 0
            if (r4 == 0) goto L2f
            r4 = r2
            kotlinx.coroutines.sync.Empty r4 = (kotlinx.coroutines.sync.Empty) r4
            java.lang.Object r4 = r4.locked
            kotlinx.coroutines.internal.Symbol r7 = kotlinx.coroutines.sync.MutexKt.access$getUNLOCKED$p()
            if (r4 == r7) goto L19
            return r6
        L19:
            if (r9 != 0) goto L20
            kotlinx.coroutines.sync.Empty r4 = kotlinx.coroutines.sync.MutexKt.access$getEMPTY_LOCKED$p()
            goto L26
        L20:
            kotlinx.coroutines.sync.Empty r4 = new kotlinx.coroutines.sync.Empty
            r4.<init>(r9)
        L26:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = kotlinx.coroutines.sync.MutexImpl._state$FU
            boolean r6 = androidx.concurrent.futures.C0110xc40028dd.m9m(r6, r8, r2, r4)
            if (r6 == 0) goto L5a
            return r5
        L2f:
            boolean r4 = r2 instanceof kotlinx.coroutines.sync.MutexImpl.LockedQueue
            if (r4 == 0) goto L50
            r4 = r2
            kotlinx.coroutines.sync.MutexImpl$LockedQueue r4 = (kotlinx.coroutines.sync.MutexImpl.LockedQueue) r4
            java.lang.Object r4 = r4.owner
            if (r4 == r9) goto L3b
            goto L3c
        L3b:
            r5 = r6
        L3c:
            if (r5 == 0) goto L3f
            return r6
        L3f:
            r4 = 0
            java.lang.String r5 = "Already locked by "
            java.lang.String r4 = kotlin.jvm.internal.Intrinsics.stringPlus(r5, r9)
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r4 = r4.toString()
            r5.<init>(r4)
            throw r5
        L50:
            boolean r4 = r2 instanceof kotlinx.coroutines.internal.OpDescriptor
            if (r4 == 0) goto L5c
            r4 = r2
            kotlinx.coroutines.internal.OpDescriptor r4 = (kotlinx.coroutines.internal.OpDescriptor) r4
            r4.perform(r8)
        L5a:
            goto L2
        L5c:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "Illegal state "
            java.lang.String r5 = kotlin.jvm.internal.Intrinsics.stringPlus(r5, r2)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
    }

    @Override // kotlinx.coroutines.sync.Mutex
    public void unlock(java.lang.Object r10) {
            r9 = this;
            r0 = r9
            r1 = 0
        L2:
            java.lang.Object r2 = r0._state
            r3 = 0
            boolean r4 = r2 instanceof kotlinx.coroutines.sync.Empty
            java.lang.String r5 = " but expected "
            java.lang.String r6 = "Mutex is locked by "
            r7 = 1
            r8 = 0
            if (r4 == 0) goto L72
            if (r10 != 0) goto L31
            r4 = r2
            kotlinx.coroutines.sync.Empty r4 = (kotlinx.coroutines.sync.Empty) r4
            java.lang.Object r4 = r4.locked
            kotlinx.coroutines.internal.Symbol r5 = kotlinx.coroutines.sync.MutexKt.access$getUNLOCKED$p()
            if (r4 == r5) goto L1f
            goto L20
        L1f:
            r7 = r8
        L20:
            if (r7 == 0) goto L23
            goto L3c
        L23:
            r4 = 0
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "Mutex is not locked"
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L31:
            r4 = r2
            kotlinx.coroutines.sync.Empty r4 = (kotlinx.coroutines.sync.Empty) r4
            java.lang.Object r4 = r4.locked
            if (r4 != r10) goto L39
            goto L3a
        L39:
            r7 = r8
        L3a:
            if (r7 == 0) goto L49
        L3c:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = kotlinx.coroutines.sync.MutexImpl._state$FU
            kotlinx.coroutines.sync.Empty r5 = kotlinx.coroutines.sync.MutexKt.access$getEMPTY_UNLOCKED$p()
            boolean r4 = androidx.concurrent.futures.C0110xc40028dd.m9m(r4, r9, r2, r5)
            if (r4 == 0) goto Lf9
            return
        L49:
            r4 = 0
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.StringBuilder r6 = r7.append(r6)
            r7 = r2
            kotlinx.coroutines.sync.Empty r7 = (kotlinx.coroutines.sync.Empty) r7
            java.lang.Object r7 = r7.locked
            java.lang.StringBuilder r6 = r6.append(r7)
            java.lang.StringBuilder r5 = r6.append(r5)
            java.lang.StringBuilder r5 = r5.append(r10)
            java.lang.String r4 = r5.toString()
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r4 = r4.toString()
            r5.<init>(r4)
            throw r5
        L72:
            boolean r4 = r2 instanceof kotlinx.coroutines.internal.OpDescriptor
            if (r4 == 0) goto L7e
            r4 = r2
            kotlinx.coroutines.internal.OpDescriptor r4 = (kotlinx.coroutines.internal.OpDescriptor) r4
            r4.perform(r9)
            goto Lf9
        L7e:
            boolean r4 = r2 instanceof kotlinx.coroutines.sync.MutexImpl.LockedQueue
            if (r4 == 0) goto Lfc
            if (r10 == 0) goto Lb9
            r4 = r2
            kotlinx.coroutines.sync.MutexImpl$LockedQueue r4 = (kotlinx.coroutines.sync.MutexImpl.LockedQueue) r4
            java.lang.Object r4 = r4.owner
            if (r4 != r10) goto L8c
            goto L8d
        L8c:
            r7 = r8
        L8d:
            if (r7 == 0) goto L90
            goto Lb9
        L90:
            r4 = 0
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.StringBuilder r6 = r7.append(r6)
            r7 = r2
            kotlinx.coroutines.sync.MutexImpl$LockedQueue r7 = (kotlinx.coroutines.sync.MutexImpl.LockedQueue) r7
            java.lang.Object r7 = r7.owner
            java.lang.StringBuilder r6 = r6.append(r7)
            java.lang.StringBuilder r5 = r6.append(r5)
            java.lang.StringBuilder r5 = r5.append(r10)
            java.lang.String r4 = r5.toString()
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r4 = r4.toString()
            r5.<init>(r4)
            throw r5
        Lb9:
            r4 = r2
            kotlinx.coroutines.sync.MutexImpl$LockedQueue r4 = (kotlinx.coroutines.sync.MutexImpl.LockedQueue) r4
            kotlinx.coroutines.internal.LockFreeLinkedListNode r4 = r4.removeFirstOrNull()
            if (r4 != 0) goto Ld9
            kotlinx.coroutines.sync.MutexImpl$UnlockOp r5 = new kotlinx.coroutines.sync.MutexImpl$UnlockOp
            r6 = r2
            kotlinx.coroutines.sync.MutexImpl$LockedQueue r6 = (kotlinx.coroutines.sync.MutexImpl.LockedQueue) r6
            r5.<init>(r6)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = kotlinx.coroutines.sync.MutexImpl._state$FU
            boolean r6 = androidx.concurrent.futures.C0110xc40028dd.m9m(r6, r9, r2, r5)
            if (r6 == 0) goto Lf9
            java.lang.Object r6 = r5.perform(r9)
            if (r6 != 0) goto Lf9
            return
        Ld9:
            r5 = r4
            kotlinx.coroutines.sync.MutexImpl$LockWaiter r5 = (kotlinx.coroutines.sync.MutexImpl.LockWaiter) r5
            boolean r5 = r5.tryResumeLockWaiter()
            if (r5 == 0) goto Lf9
            r5 = r2
            kotlinx.coroutines.sync.MutexImpl$LockedQueue r5 = (kotlinx.coroutines.sync.MutexImpl.LockedQueue) r5
            r6 = r4
            kotlinx.coroutines.sync.MutexImpl$LockWaiter r6 = (kotlinx.coroutines.sync.MutexImpl.LockWaiter) r6
            java.lang.Object r6 = r6.owner
            if (r6 != 0) goto Lf0
            kotlinx.coroutines.internal.Symbol r6 = kotlinx.coroutines.sync.MutexKt.access$getLOCKED$p()
        Lf0:
            r5.owner = r6
            r5 = r4
            kotlinx.coroutines.sync.MutexImpl$LockWaiter r5 = (kotlinx.coroutines.sync.MutexImpl.LockWaiter) r5
            r5.completeResumeLockWaiter()
            return
        Lf9:
            goto L2
        Lfc:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "Illegal state "
            java.lang.String r5 = kotlin.jvm.internal.Intrinsics.stringPlus(r5, r2)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
    }
}
