package kotlinx.coroutines.flow;

/* JADX INFO: compiled from: StateFlow.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\b\u0002\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0013B\u0007¢\u0006\u0004\b\u0001\u0010\u0002J\u001b\u0010\u0006\u001a\u00020\u00052\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\t\u001a\u00020\bH\u0086@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ)\u0010\r\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\b\u0018\u00010\f0\u000b2\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u0002J\r\u0010\u0010\u001a\u00020\u0005¢\u0006\u0004\b\u0010\u0010\u0011\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, m115d2 = {"Lkotlinx/coroutines/flow/StateFlowSlot;", "<init>", "()V", "Lkotlinx/coroutines/flow/StateFlowImpl;", "flow", "", "allocateLocked", "(Lkotlinx/coroutines/flow/StateFlowImpl;)Z", "", "awaitPending", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "Lkotlin/coroutines/Continuation;", "freeLocked", "(Lkotlinx/coroutines/flow/StateFlowImpl;)[Lkotlin/coroutines/Continuation;", "makePending", "takePending", "()Z", "kotlinx-coroutines-core", "Lkotlinx/coroutines/flow/internal/AbstractSharedFlowSlot;"}, m116k = 1, m117mv = {1, 6, 0}, m119xi = 48)
final class StateFlowSlot extends kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlinx.coroutines.flow.StateFlowImpl<?>> {
    static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater _state$FU = null;
    volatile /* synthetic */ java.lang.Object _state;

    static {
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            java.lang.String r1 = "_state"
            java.lang.Class<kotlinx.coroutines.flow.StateFlowSlot> r2 = kotlinx.coroutines.flow.StateFlowSlot.class
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r0, r1)
            kotlinx.coroutines.flow.StateFlowSlot._state$FU = r0
            return
    }

    public StateFlowSlot() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1._state = r0
            return
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot
    public /* bridge */ /* synthetic */ boolean allocateLocked(kotlinx.coroutines.flow.StateFlowImpl<?> r2) {
            r1 = this;
            r0 = r2
            kotlinx.coroutines.flow.StateFlowImpl r0 = (kotlinx.coroutines.flow.StateFlowImpl) r0
            boolean r0 = r1.allocateLocked2(r0)
            return r0
    }

    /* JADX INFO: renamed from: allocateLocked, reason: avoid collision after fix types in other method */
    public boolean allocateLocked2(kotlinx.coroutines.flow.StateFlowImpl<?> r2) {
            r1 = this;
            java.lang.Object r0 = r1._state
            if (r0 == 0) goto L6
            r0 = 0
            return r0
        L6:
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.flow.StateFlowKt.access$getNONE$p()
            r1._state = r0
            r0 = 1
            return r0
    }

    public final java.lang.Object awaitPending(kotlin.coroutines.Continuation<? super kotlin.Unit> r11) {
            r10 = this;
            r0 = 0
            r1 = r11
            r2 = 0
            kotlinx.coroutines.CancellableContinuationImpl r3 = new kotlinx.coroutines.CancellableContinuationImpl
            kotlin.coroutines.Continuation r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(r1)
            r5 = 1
            r3.<init>(r4, r5)
            r3.initCancellability()
            r4 = r3
            kotlinx.coroutines.CancellableContinuation r4 = (kotlinx.coroutines.CancellableContinuation) r4
            r6 = 0
            boolean r7 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
            if (r7 == 0) goto L28
            r7 = 0
            java.lang.Object r8 = r10._state
            boolean r8 = r8 instanceof kotlinx.coroutines.CancellableContinuationImpl
            if (r8 != 0) goto L22
            goto L28
        L22:
            java.lang.AssertionError r5 = new java.lang.AssertionError
            r5.<init>()
            throw r5
        L28:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = kotlinx.coroutines.flow.StateFlowSlot._state$FU
            kotlinx.coroutines.internal.Symbol r8 = kotlinx.coroutines.flow.StateFlowKt.access$getNONE$p()
            boolean r7 = androidx.concurrent.futures.C0110xc40028dd.m9m(r7, r10, r8, r4)
            if (r7 == 0) goto L35
            goto L5e
        L35:
            boolean r7 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
            if (r7 == 0) goto L4f
            r7 = 0
            java.lang.Object r8 = r10._state
            kotlinx.coroutines.internal.Symbol r9 = kotlinx.coroutines.flow.StateFlowKt.access$getPENDING$p()
            if (r8 != r9) goto L45
            goto L46
        L45:
            r5 = 0
        L46:
            if (r5 == 0) goto L49
            goto L4f
        L49:
            java.lang.AssertionError r5 = new java.lang.AssertionError
            r5.<init>()
            throw r5
        L4f:
            r5 = r4
            kotlin.coroutines.Continuation r5 = (kotlin.coroutines.Continuation) r5
            kotlin.Result$Companion r7 = kotlin.Result.Companion
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            java.lang.Object r7 = kotlin.Result.m8669constructorimpl(r7)
            r5.resumeWith(r7)
        L5e:
            java.lang.Object r1 = r3.getResult()
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r1 != r2) goto L6b
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r11)
        L6b:
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r1 != r0) goto L73
            return r1
        L73:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot
    public /* bridge */ /* synthetic */ kotlin.coroutines.Continuation[] freeLocked(kotlinx.coroutines.flow.StateFlowImpl<?> r2) {
            r1 = this;
            r0 = r2
            kotlinx.coroutines.flow.StateFlowImpl r0 = (kotlinx.coroutines.flow.StateFlowImpl) r0
            kotlin.coroutines.Continuation[] r0 = r1.freeLocked2(r0)
            return r0
    }

    /* JADX INFO: renamed from: freeLocked, reason: avoid collision after fix types in other method */
    public kotlin.coroutines.Continuation<kotlin.Unit>[] freeLocked2(kotlinx.coroutines.flow.StateFlowImpl<?> r2) {
            r1 = this;
            r0 = 0
            r1._state = r0
            kotlin.coroutines.Continuation<kotlin.Unit>[] r0 = kotlinx.coroutines.flow.internal.AbstractSharedFlowKt.EMPTY_RESUMES
            return r0
    }

    public final void makePending() {
            r6 = this;
            r0 = r6
            r1 = 0
        L2:
            java.lang.Object r2 = r0._state
            r3 = 0
            if (r2 != 0) goto La
            return
        La:
            kotlinx.coroutines.internal.Symbol r4 = kotlinx.coroutines.flow.StateFlowKt.access$getPENDING$p()
            if (r2 != r4) goto L11
            return
        L11:
            kotlinx.coroutines.internal.Symbol r4 = kotlinx.coroutines.flow.StateFlowKt.access$getNONE$p()
            if (r2 != r4) goto L24
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = kotlinx.coroutines.flow.StateFlowSlot._state$FU
            kotlinx.coroutines.internal.Symbol r5 = kotlinx.coroutines.flow.StateFlowKt.access$getPENDING$p()
            boolean r4 = androidx.concurrent.futures.C0110xc40028dd.m9m(r4, r6, r2, r5)
            if (r4 == 0) goto L41
            return
        L24:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = kotlinx.coroutines.flow.StateFlowSlot._state$FU
            kotlinx.coroutines.internal.Symbol r5 = kotlinx.coroutines.flow.StateFlowKt.access$getNONE$p()
            boolean r4 = androidx.concurrent.futures.C0110xc40028dd.m9m(r4, r6, r2, r5)
            if (r4 == 0) goto L41
            r4 = r2
            kotlinx.coroutines.CancellableContinuationImpl r4 = (kotlinx.coroutines.CancellableContinuationImpl) r4
            kotlin.coroutines.Continuation r4 = (kotlin.coroutines.Continuation) r4
            kotlin.Result$Companion r5 = kotlin.Result.Companion
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            java.lang.Object r5 = kotlin.Result.m8669constructorimpl(r5)
            r4.resumeWith(r5)
            return
        L41:
            goto L2
    }

    public final boolean takePending() {
            r4 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.flow.StateFlowSlot._state$FU
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.flow.StateFlowKt.access$getNONE$p()
            java.lang.Object r0 = r0.getAndSet(r4, r1)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            r1 = 0
            boolean r2 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
            if (r2 == 0) goto L20
            r2 = 0
            boolean r3 = r0 instanceof kotlinx.coroutines.CancellableContinuationImpl
            if (r3 != 0) goto L1a
            goto L20
        L1a:
            java.lang.AssertionError r2 = new java.lang.AssertionError
            r2.<init>()
            throw r2
        L20:
            kotlinx.coroutines.internal.Symbol r2 = kotlinx.coroutines.flow.StateFlowKt.access$getPENDING$p()
            if (r0 != r2) goto L28
            r2 = 1
            goto L29
        L28:
            r2 = 0
        L29:
            return r2
    }
}
