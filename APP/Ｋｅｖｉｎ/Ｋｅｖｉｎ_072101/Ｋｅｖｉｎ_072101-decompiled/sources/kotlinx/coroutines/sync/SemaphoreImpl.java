package kotlinx.coroutines.sync;

/* JADX INFO: compiled from: Semaphore.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\b\u0002\u0018\u00002\u00020\u001eB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\u0007\u001a\u00020\u0006H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\t\u001a\u00020\u0006H\u0082@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\bJ\u001d\u0010\r\u001a\u00020\f2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0013\u0010\u0012J\u0019\u0010\u0014\u001a\u00020\f*\b\u0012\u0004\u0012\u00020\u00060\nH\u0002¢\u0006\u0004\b\u0014\u0010\u000eR\u0014\u0010\u0017\u001a\u00020\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R \u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00060\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\u001c\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001d"}, m115d2 = {"Lkotlinx/coroutines/sync/SemaphoreImpl;", "", "permits", "acquiredPermits", "<init>", "(II)V", "", "acquire", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "acquireSlowPath", "Lkotlinx/coroutines/CancellableContinuation;", "cont", "", "addAcquireToQueue", "(Lkotlinx/coroutines/CancellableContinuation;)Z", "release", "()V", "tryAcquire", "()Z", "tryResumeNextFromQueue", "tryResumeAcquire", "getAvailablePermits", "()I", "availablePermits", "Lkotlin/Function1;", "", "onCancellationRelease", "Lkotlin/jvm/functions/Function1;", "I", "kotlinx-coroutines-core", "Lkotlinx/coroutines/sync/Semaphore;"}, m116k = 1, m117mv = {1, 6, 0}, m119xi = 48)
final class SemaphoreImpl implements kotlinx.coroutines.sync.Semaphore {
    static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater _availablePermits$FU = null;
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicLongFieldUpdater deqIdx$FU = null;
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicLongFieldUpdater enqIdx$FU = null;
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater head$FU = null;
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater tail$FU = null;
    volatile /* synthetic */ int _availablePermits;
    private volatile /* synthetic */ long deqIdx;
    private volatile /* synthetic */ long enqIdx;
    private volatile /* synthetic */ java.lang.Object head;
    private final kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit> onCancellationRelease;
    private final int permits;
    private volatile /* synthetic */ java.lang.Object tail;

    static {
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            java.lang.String r1 = "head"
            java.lang.Class<kotlinx.coroutines.sync.SemaphoreImpl> r2 = kotlinx.coroutines.sync.SemaphoreImpl.class
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r0, r1)
            kotlinx.coroutines.sync.SemaphoreImpl.head$FU = r0
            java.lang.String r0 = "deqIdx"
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(r2, r0)
            kotlinx.coroutines.sync.SemaphoreImpl.deqIdx$FU = r0
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            java.lang.String r1 = "tail"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r0, r1)
            kotlinx.coroutines.sync.SemaphoreImpl.tail$FU = r0
            java.lang.String r0 = "enqIdx"
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(r2, r0)
            kotlinx.coroutines.sync.SemaphoreImpl.enqIdx$FU = r0
            java.lang.String r0 = "_availablePermits"
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r2, r0)
            kotlinx.coroutines.sync.SemaphoreImpl._availablePermits$FU = r0
            return
    }

    public SemaphoreImpl(int r6, int r7) {
            r5 = this;
            r5.<init>()
            r5.permits = r6
            r0 = 0
            r5.deqIdx = r0
            r5.enqIdx = r0
            int r2 = r5.permits
            r3 = 1
            r4 = 0
            if (r2 <= 0) goto L14
            r2 = r3
            goto L15
        L14:
            r2 = r4
        L15:
            if (r2 == 0) goto L54
            if (r7 < 0) goto L1e
            int r2 = r5.permits
            if (r7 > r2) goto L1e
            goto L1f
        L1e:
            r3 = r4
        L1f:
            if (r3 == 0) goto L3d
            kotlinx.coroutines.sync.SemaphoreSegment r2 = new kotlinx.coroutines.sync.SemaphoreSegment
            r3 = 0
            r4 = 2
            r2.<init>(r0, r3, r4)
            r0 = r2
            r5.head = r0
            r5.tail = r0
            int r0 = r5.permits
            int r0 = r0 - r7
            r5._availablePermits = r0
            kotlinx.coroutines.sync.SemaphoreImpl$onCancellationRelease$1 r0 = new kotlinx.coroutines.sync.SemaphoreImpl$onCancellationRelease$1
            r0.<init>(r5)
            kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0
            r5.onCancellationRelease = r0
            return
        L3d:
            r0 = 0
            int r1 = r5.permits
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "The number of acquired permits should be in 0.."
            java.lang.String r0 = kotlin.jvm.internal.Intrinsics.stringPlus(r2, r1)
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L54:
            r0 = 0
            int r1 = r5.permits
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "Semaphore should have at least 1 permit, but had "
            java.lang.String r0 = kotlin.jvm.internal.Intrinsics.stringPlus(r2, r1)
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
    }

    public static final /* synthetic */ java.lang.Object access$acquireSlowPath(kotlinx.coroutines.sync.SemaphoreImpl r1, kotlin.coroutines.Continuation r2) {
            java.lang.Object r0 = r1.acquireSlowPath(r2)
            return r0
    }

    public static final /* synthetic */ boolean access$addAcquireToQueue(kotlinx.coroutines.sync.SemaphoreImpl r1, kotlinx.coroutines.CancellableContinuation r2) {
            boolean r0 = r1.addAcquireToQueue(r2)
            return r0
    }

    public static final /* synthetic */ kotlin.jvm.functions.Function1 access$getOnCancellationRelease$p(kotlinx.coroutines.sync.SemaphoreImpl r1) {
            kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit> r0 = r1.onCancellationRelease
            return r0
    }

    private final java.lang.Object acquireSlowPath(kotlin.coroutines.Continuation<? super kotlin.Unit> r10) {
            r9 = this;
            r0 = 0
            r1 = r10
            r2 = 0
            kotlin.coroutines.Continuation r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(r1)
            kotlinx.coroutines.CancellableContinuationImpl r3 = kotlinx.coroutines.CancellableContinuationKt.getOrCreateCancellableContinuation(r3)
            r4 = r3
            kotlinx.coroutines.CancellableContinuation r4 = (kotlinx.coroutines.CancellableContinuation) r4
            r5 = 0
        Lf:
            boolean r6 = access$addAcquireToQueue(r9, r4)
            if (r6 == 0) goto L17
            goto L29
        L17:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r6 = kotlinx.coroutines.sync.SemaphoreImpl._availablePermits$FU
            int r6 = r6.getAndDecrement(r9)
            if (r6 <= 0) goto Lf
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            kotlin.jvm.functions.Function1 r8 = access$getOnCancellationRelease$p(r9)
            r4.resume(r7, r8)
        L29:
            java.lang.Object r1 = r3.getResult()
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r1 != r2) goto L36
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r10)
        L36:
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r1 != r0) goto L3e
            return r1
        L3e:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
    }

    private final boolean addAcquireToQueue(kotlinx.coroutines.CancellableContinuation<? super kotlin.Unit> r24) {
            r23 = this;
            r0 = r23
            r1 = r24
            java.lang.Object r2 = r0.tail
            kotlinx.coroutines.sync.SemaphoreSegment r2 = (kotlinx.coroutines.sync.SemaphoreSegment) r2
            java.util.concurrent.atomic.AtomicLongFieldUpdater r3 = kotlinx.coroutines.sync.SemaphoreImpl.enqIdx$FU
            long r3 = r3.getAndIncrement(r0)
            int r5 = kotlinx.coroutines.sync.SemaphoreKt.access$getSEGMENT_SIZE$p()
            long r5 = (long) r5
            long r5 = r3 / r5
            r7 = r23
            r8 = 0
        L18:
            r9 = r2
            kotlinx.coroutines.internal.Segment r9 = (kotlinx.coroutines.internal.Segment) r9
            r10 = 0
            r11 = r9
        L1e:
            long r12 = r11.getId()
            int r12 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r12 < 0) goto L34
            boolean r12 = r11.getRemoved()
            if (r12 == 0) goto L2d
            goto L34
        L2d:
            java.lang.Object r12 = kotlinx.coroutines.internal.SegmentOrClosed.m10223constructorimpl(r11)
            r16 = r2
            goto L50
        L34:
            r12 = r11
            kotlinx.coroutines.internal.ConcurrentLinkedListNode r12 = (kotlinx.coroutines.internal.ConcurrentLinkedListNode) r12
            r13 = 0
            java.lang.Object r14 = kotlinx.coroutines.internal.ConcurrentLinkedListNode.access$getNextOrClosed(r12)
            r15 = 0
            r16 = r2
            kotlinx.coroutines.internal.Symbol r2 = kotlinx.coroutines.internal.ConcurrentLinkedListKt.access$getCLOSED$p()
            if (r14 != r2) goto L107
            r2 = 0
            kotlinx.coroutines.internal.Symbol r17 = kotlinx.coroutines.internal.ConcurrentLinkedListKt.access$getCLOSED$p()
            java.lang.Object r17 = kotlinx.coroutines.internal.SegmentOrClosed.m10223constructorimpl(r17)
            r12 = r17
        L50:
            r2 = r12
            boolean r9 = kotlinx.coroutines.internal.SegmentOrClosed.m10228isClosedimpl(r2)
            if (r9 != 0) goto L9f
            kotlinx.coroutines.internal.Segment r9 = kotlinx.coroutines.internal.SegmentOrClosed.m10226getSegmentimpl(r2)
            r12 = r7
            r13 = 0
            r14 = r12
            r15 = 0
        L5f:
            java.lang.Object r10 = r14.tail
            kotlinx.coroutines.internal.Segment r10 = (kotlinx.coroutines.internal.Segment) r10
            r18 = 0
            long r19 = r10.getId()
            long r21 = r9.getId()
            int r19 = (r19 > r21 ? 1 : (r19 == r21 ? 0 : -1))
            if (r19 < 0) goto L74
            r11 = 1
            goto L8e
        L74:
            boolean r19 = r9.tryIncPointers$kotlinx_coroutines_core()
            if (r19 != 0) goto L7c
            r11 = 0
            goto L8e
        L7c:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r11 = kotlinx.coroutines.sync.SemaphoreImpl.tail$FU
            boolean r11 = androidx.concurrent.futures.C0110xc40028dd.m9m(r11, r12, r10, r9)
            if (r11 == 0) goto L94
            boolean r11 = r10.decPointers$kotlinx_coroutines_core()
            if (r11 == 0) goto L8d
            r10.remove()
        L8d:
            r11 = 1
        L8e:
            if (r11 == 0) goto L91
            goto L9f
        L91:
            r2 = r16
            goto L18
        L94:
            boolean r11 = r9.decPointers$kotlinx_coroutines_core()
            if (r11 == 0) goto L9d
            r9.remove()
        L9d:
            goto L5f
        L9f:
            kotlinx.coroutines.internal.Segment r2 = kotlinx.coroutines.internal.SegmentOrClosed.m10226getSegmentimpl(r2)
            kotlinx.coroutines.sync.SemaphoreSegment r2 = (kotlinx.coroutines.sync.SemaphoreSegment) r2
            int r5 = kotlinx.coroutines.sync.SemaphoreKt.access$getSEGMENT_SIZE$p()
            long r5 = (long) r5
            long r5 = r3 % r5
            int r5 = (int) r5
            r6 = 0
            r7 = r2
            r8 = 0
            java.util.concurrent.atomic.AtomicReferenceArray r9 = r7.acquirers
            boolean r6 = kotlinx.coroutines.debug.internal.ConcurrentWeakMap$Core$$ExternalSyntheticBackportWithForwarding0.m137m(r9, r5, r6, r1)
            if (r6 == 0) goto Lc8
            kotlinx.coroutines.sync.CancelSemaphoreAcquisitionHandler r6 = new kotlinx.coroutines.sync.CancelSemaphoreAcquisitionHandler
            r6.<init>(r2, r5)
            kotlinx.coroutines.CancelHandlerBase r6 = (kotlinx.coroutines.CancelHandlerBase) r6
            r7 = 0
            kotlin.jvm.functions.Function1 r6 = (kotlin.jvm.functions.Function1) r6
            r1.invokeOnCancellation(r6)
            r6 = 1
            return r6
        Lc8:
            kotlinx.coroutines.internal.Symbol r6 = kotlinx.coroutines.sync.SemaphoreKt.access$getPERMIT$p()
            kotlinx.coroutines.internal.Symbol r7 = kotlinx.coroutines.sync.SemaphoreKt.access$getTAKEN$p()
            r8 = r2
            r9 = 0
            java.util.concurrent.atomic.AtomicReferenceArray r10 = r8.acquirers
            boolean r6 = kotlinx.coroutines.debug.internal.ConcurrentWeakMap$Core$$ExternalSyntheticBackportWithForwarding0.m137m(r10, r5, r6, r7)
            if (r6 == 0) goto Le3
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit> r7 = r0.onCancellationRelease
            r1.resume(r6, r7)
            r6 = 1
            return r6
        Le3:
            r6 = 1
            boolean r7 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
            if (r7 == 0) goto L105
            r7 = 0
            r8 = r2
            r9 = 0
            java.util.concurrent.atomic.AtomicReferenceArray r10 = r8.acquirers
            java.lang.Object r8 = r10.get(r5)
            kotlinx.coroutines.internal.Symbol r9 = kotlinx.coroutines.sync.SemaphoreKt.access$getBROKEN$p()
            if (r8 != r9) goto Lfb
            r11 = r6
            goto Lfc
        Lfb:
            r11 = 0
        Lfc:
            if (r11 == 0) goto Lff
            goto L105
        Lff:
            java.lang.AssertionError r6 = new java.lang.AssertionError
            r6.<init>()
            throw r6
        L105:
            r6 = 0
            return r6
        L107:
            r2 = r14
            kotlinx.coroutines.internal.ConcurrentLinkedListNode r2 = (kotlinx.coroutines.internal.ConcurrentLinkedListNode) r2
            kotlinx.coroutines.internal.Segment r2 = (kotlinx.coroutines.internal.Segment) r2
            if (r2 == 0) goto L116
            r11 = r2
            r2 = r16
            goto L1e
        L116:
            long r12 = r11.getId()
            r14 = 1
            long r12 = r12 + r14
            r14 = r11
            kotlinx.coroutines.sync.SemaphoreSegment r14 = (kotlinx.coroutines.sync.SemaphoreSegment) r14
            r15 = 0
            kotlinx.coroutines.sync.SemaphoreSegment r12 = kotlinx.coroutines.sync.SemaphoreKt.access$createSegment(r12, r14)
            kotlinx.coroutines.internal.Segment r12 = (kotlinx.coroutines.internal.Segment) r12
            r13 = r12
            kotlinx.coroutines.internal.ConcurrentLinkedListNode r13 = (kotlinx.coroutines.internal.ConcurrentLinkedListNode) r13
            boolean r13 = r11.trySetNext(r13)
            if (r13 == 0) goto L13e
            boolean r13 = r11.getRemoved()
            if (r13 == 0) goto L139
            r11.remove()
        L139:
            r11 = r12
            r2 = r16
            goto L1e
        L13e:
            r2 = r16
            goto L1e
    }

    private final boolean tryResumeAcquire(kotlinx.coroutines.CancellableContinuation<? super kotlin.Unit> r4) {
            r3 = this;
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            r1 = 0
            kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit> r2 = r3.onCancellationRelease
            java.lang.Object r0 = r4.tryResume(r0, r1, r2)
            if (r0 != 0) goto Ld
            r0 = 0
            return r0
        Ld:
            r4.completeResume(r0)
            r1 = 1
            return r1
    }

    private final boolean tryResumeNextFromQueue() {
            r22 = this;
            r0 = r22
            java.lang.Object r1 = r0.head
            kotlinx.coroutines.sync.SemaphoreSegment r1 = (kotlinx.coroutines.sync.SemaphoreSegment) r1
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = kotlinx.coroutines.sync.SemaphoreImpl.deqIdx$FU
            long r2 = r2.getAndIncrement(r0)
            int r4 = kotlinx.coroutines.sync.SemaphoreKt.access$getSEGMENT_SIZE$p()
            long r4 = (long) r4
            long r4 = r2 / r4
            r6 = r22
            r7 = 0
        L16:
            r8 = r1
            kotlinx.coroutines.internal.Segment r8 = (kotlinx.coroutines.internal.Segment) r8
            r9 = 0
            r10 = r8
        L1c:
            long r11 = r10.getId()
            int r11 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r11 < 0) goto L30
            boolean r11 = r10.getRemoved()
            if (r11 == 0) goto L2b
            goto L30
        L2b:
            java.lang.Object r11 = kotlinx.coroutines.internal.SegmentOrClosed.m10223constructorimpl(r10)
            goto L4a
        L30:
            r11 = r10
            kotlinx.coroutines.internal.ConcurrentLinkedListNode r11 = (kotlinx.coroutines.internal.ConcurrentLinkedListNode) r11
            r12 = 0
            java.lang.Object r13 = kotlinx.coroutines.internal.ConcurrentLinkedListNode.access$getNextOrClosed(r11)
            r14 = 0
            kotlinx.coroutines.internal.Symbol r15 = kotlinx.coroutines.internal.ConcurrentLinkedListKt.access$getCLOSED$p()
            if (r13 != r15) goto L102
            r15 = 0
            kotlinx.coroutines.internal.Symbol r16 = kotlinx.coroutines.internal.ConcurrentLinkedListKt.access$getCLOSED$p()
            java.lang.Object r16 = kotlinx.coroutines.internal.SegmentOrClosed.m10223constructorimpl(r16)
            r11 = r16
        L4a:
            r8 = r11
            boolean r9 = kotlinx.coroutines.internal.SegmentOrClosed.m10228isClosedimpl(r8)
            if (r9 != 0) goto L96
            kotlinx.coroutines.internal.Segment r9 = kotlinx.coroutines.internal.SegmentOrClosed.m10226getSegmentimpl(r8)
            r12 = r6
            r13 = 0
            r14 = r12
            r15 = 0
        L59:
            java.lang.Object r11 = r14.head
            kotlinx.coroutines.internal.Segment r11 = (kotlinx.coroutines.internal.Segment) r11
            r17 = 0
            long r18 = r11.getId()
            long r20 = r9.getId()
            int r18 = (r18 > r20 ? 1 : (r18 == r20 ? 0 : -1))
            if (r18 < 0) goto L6e
            r10 = 1
            goto L88
        L6e:
            boolean r18 = r9.tryIncPointers$kotlinx_coroutines_core()
            if (r18 != 0) goto L76
            r10 = 0
            goto L88
        L76:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r10 = kotlinx.coroutines.sync.SemaphoreImpl.head$FU
            boolean r10 = androidx.concurrent.futures.C0110xc40028dd.m9m(r10, r12, r11, r9)
            if (r10 == 0) goto L8b
            boolean r10 = r11.decPointers$kotlinx_coroutines_core()
            if (r10 == 0) goto L87
            r11.remove()
        L87:
            r10 = 1
        L88:
            if (r10 == 0) goto L16
            goto L96
        L8b:
            boolean r10 = r9.decPointers$kotlinx_coroutines_core()
            if (r10 == 0) goto L94
            r9.remove()
        L94:
            goto L59
        L96:
            kotlinx.coroutines.internal.Segment r6 = kotlinx.coroutines.internal.SegmentOrClosed.m10226getSegmentimpl(r8)
            kotlinx.coroutines.sync.SemaphoreSegment r6 = (kotlinx.coroutines.sync.SemaphoreSegment) r6
            r6.cleanPrev()
            long r7 = r6.getId()
            int r7 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r7 <= 0) goto Laa
            r7 = 0
            return r7
        Laa:
            int r7 = kotlinx.coroutines.sync.SemaphoreKt.access$getSEGMENT_SIZE$p()
            long r7 = (long) r7
            long r7 = r2 % r7
            int r7 = (int) r7
            kotlinx.coroutines.internal.Symbol r8 = kotlinx.coroutines.sync.SemaphoreKt.access$getPERMIT$p()
            r9 = r6
            r10 = 0
            java.util.concurrent.atomic.AtomicReferenceArray r11 = r9.acquirers
            java.lang.Object r8 = r11.getAndSet(r7, r8)
            if (r8 != 0) goto Lf2
            int r9 = kotlinx.coroutines.sync.SemaphoreKt.access$getMAX_SPIN_CYCLES$p()
            r10 = 0
        Lc7:
            if (r10 >= r9) goto Ldf
            int r11 = r10 + 1
            r12 = 0
            r13 = r6
            r14 = 0
            java.util.concurrent.atomic.AtomicReferenceArray r15 = r13.acquirers
            java.lang.Object r13 = r15.get(r7)
            kotlinx.coroutines.internal.Symbol r14 = kotlinx.coroutines.sync.SemaphoreKt.access$getTAKEN$p()
            if (r13 != r14) goto Ldc
            r9 = 1
            return r9
        Ldc:
            r10 = r11
            goto Lc7
        Ldf:
            kotlinx.coroutines.internal.Symbol r9 = kotlinx.coroutines.sync.SemaphoreKt.access$getPERMIT$p()
            kotlinx.coroutines.internal.Symbol r10 = kotlinx.coroutines.sync.SemaphoreKt.access$getBROKEN$p()
            r11 = r6
            r12 = 0
            java.util.concurrent.atomic.AtomicReferenceArray r13 = r11.acquirers
            boolean r9 = kotlinx.coroutines.debug.internal.ConcurrentWeakMap$Core$$ExternalSyntheticBackportWithForwarding0.m137m(r13, r7, r9, r10)
            r10 = 1
            r9 = r9 ^ r10
            return r9
        Lf2:
            kotlinx.coroutines.internal.Symbol r9 = kotlinx.coroutines.sync.SemaphoreKt.access$getCANCELLED$p()
            if (r8 != r9) goto Lfa
            r9 = 0
            return r9
        Lfa:
            r9 = r8
            kotlinx.coroutines.CancellableContinuation r9 = (kotlinx.coroutines.CancellableContinuation) r9
            boolean r9 = r0.tryResumeAcquire(r9)
            return r9
        L102:
            r15 = r13
            kotlinx.coroutines.internal.ConcurrentLinkedListNode r15 = (kotlinx.coroutines.internal.ConcurrentLinkedListNode) r15
            r11 = r15
            kotlinx.coroutines.internal.Segment r11 = (kotlinx.coroutines.internal.Segment) r11
            if (r11 == 0) goto L110
            r10 = r11
            goto L1c
        L110:
            long r12 = r10.getId()
            r14 = 1
            long r12 = r12 + r14
            r14 = r10
            kotlinx.coroutines.sync.SemaphoreSegment r14 = (kotlinx.coroutines.sync.SemaphoreSegment) r14
            r15 = 0
            kotlinx.coroutines.sync.SemaphoreSegment r12 = kotlinx.coroutines.sync.SemaphoreKt.access$createSegment(r12, r14)
            kotlinx.coroutines.internal.Segment r12 = (kotlinx.coroutines.internal.Segment) r12
            r13 = r12
            kotlinx.coroutines.internal.ConcurrentLinkedListNode r13 = (kotlinx.coroutines.internal.ConcurrentLinkedListNode) r13
            boolean r13 = r10.trySetNext(r13)
            if (r13 == 0) goto L1c
            boolean r13 = r10.getRemoved()
            if (r13 == 0) goto L133
            r10.remove()
        L133:
            r10 = r12
            goto L1c
    }

    @Override // kotlinx.coroutines.sync.Semaphore
    public java.lang.Object acquire(kotlin.coroutines.Continuation<? super kotlin.Unit> r4) {
            r3 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = kotlinx.coroutines.sync.SemaphoreImpl._availablePermits$FU
            int r0 = r0.getAndDecrement(r3)
            if (r0 <= 0) goto Lb
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            return r1
        Lb:
            java.lang.Object r1 = r3.acquireSlowPath(r4)
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r1 != r2) goto L16
            return r1
        L16:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            return r1
    }

    @Override // kotlinx.coroutines.sync.Semaphore
    public int getAvailablePermits() {
            r2 = this;
            int r0 = r2._availablePermits
            r1 = 0
            int r0 = java.lang.Math.max(r0, r1)
            return r0
    }

    @Override // kotlinx.coroutines.sync.Semaphore
    public void release() {
            r8 = this;
        L1:
            r0 = r8
            r1 = 0
        L4:
            int r2 = r0._availablePermits
            r3 = r2
            r4 = 0
            int r5 = r8.permits
            if (r3 >= r5) goto Lf
            r5 = 1
            goto L10
        Lf:
            r5 = 0
        L10:
            if (r5 == 0) goto L28
            int r3 = r3 + 1
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r4 = kotlinx.coroutines.sync.SemaphoreImpl._availablePermits$FU
            boolean r4 = r4.compareAndSet(r0, r2, r3)
            if (r4 == 0) goto L27
            r0 = r2
            if (r0 < 0) goto L20
            return
        L20:
            boolean r1 = r8.tryResumeNextFromQueue()
            if (r1 == 0) goto L1
            return
        L27:
            goto L4
        L28:
            r5 = 0
            int r6 = r8.permits
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.String r7 = "The number of released permits cannot be greater than "
            java.lang.String r5 = kotlin.jvm.internal.Intrinsics.stringPlus(r7, r6)
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r5 = r5.toString()
            r6.<init>(r5)
            throw r6
    }

    @Override // kotlinx.coroutines.sync.Semaphore
    public boolean tryAcquire() {
            r6 = this;
            r0 = r6
            r1 = 0
        L2:
            int r2 = r0._availablePermits
            r3 = 0
            if (r2 > 0) goto La
            r4 = 0
            return r4
        La:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r4 = kotlinx.coroutines.sync.SemaphoreImpl._availablePermits$FU
            int r5 = r2 + (-1)
            boolean r4 = r4.compareAndSet(r6, r2, r5)
            if (r4 == 0) goto L16
            r4 = 1
            return r4
        L16:
            goto L2
    }
}
