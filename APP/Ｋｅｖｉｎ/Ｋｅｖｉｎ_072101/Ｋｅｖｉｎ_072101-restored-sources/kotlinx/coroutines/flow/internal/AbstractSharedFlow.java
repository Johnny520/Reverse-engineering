package kotlinx.coroutines.flow.internal;

import kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot;

/* JADX INFO: compiled from: AbstractSharedFlow.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b \u0018\u0000*\f\b\u0000\u0010\u0001*\u0006\u0012\u0002\b\u00030\u00022\u00060\u0003j\u0002`\u0004B\u0005¢\u0006\u0002\u0010\u0005J\r\u0010\u0018\u001a\u00028\u0000H\u0004¢\u0006\u0002\u0010\u0019J\r\u0010\u001a\u001a\u00028\u0000H$¢\u0006\u0002\u0010\u0019J\u001d\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u000e2\u0006\u0010\u001c\u001a\u00020\tH$¢\u0006\u0002\u0010\u001dJ\u001d\u0010\u001e\u001a\u00020\u001f2\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u001f0!H\u0084\bJ\u0015\u0010\"\u001a\u00020\u001f2\u0006\u0010#\u001a\u00028\u0000H\u0004¢\u0006\u0002\u0010$R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t@BX\u0084\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R:\u0010\u000f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\u000e2\u0010\u0010\b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\u000e@BX\u0084\u000e¢\u0006\u0010\n\u0002\u0010\u0013\u0012\u0004\b\u0010\u0010\u0005\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\t0\u00158F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006%"}, m115d2 = {"Lkotlinx/coroutines/flow/internal/AbstractSharedFlow;", "S", "Lkotlinx/coroutines/flow/internal/AbstractSharedFlowSlot;", "", "Lkotlinx/coroutines/internal/SynchronizedObject;", "()V", "_subscriptionCount", "Lkotlinx/coroutines/flow/internal/SubscriptionCountStateFlow;", "<set-?>", "", "nCollectors", "getNCollectors", "()I", "nextIndex", "", "slots", "getSlots$annotations", "getSlots", "()[Lkotlinx/coroutines/flow/internal/AbstractSharedFlowSlot;", "[Lkotlinx/coroutines/flow/internal/AbstractSharedFlowSlot;", "subscriptionCount", "Lkotlinx/coroutines/flow/StateFlow;", "getSubscriptionCount", "()Lkotlinx/coroutines/flow/StateFlow;", "allocateSlot", "()Lkotlinx/coroutines/flow/internal/AbstractSharedFlowSlot;", "createSlot", "createSlotArray", "size", "(I)[Lkotlinx/coroutines/flow/internal/AbstractSharedFlowSlot;", "forEachSlotLocked", "", "block", "Lkotlin/Function1;", "freeSlot", "slot", "(Lkotlinx/coroutines/flow/internal/AbstractSharedFlowSlot;)V", "kotlinx-coroutines-core"}, m116k = 1, m117mv = {1, 6, 0}, m119xi = 48)
public abstract class AbstractSharedFlow<S extends kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<?>> {
    private kotlinx.coroutines.flow.internal.SubscriptionCountStateFlow _subscriptionCount;
    private int nCollectors;
    private int nextIndex;
    private S[] slots;

    public AbstractSharedFlow() {
            r0 = this;
            r0.<init>()
            return
    }

    public static final /* synthetic */ int access$getNCollectors(kotlinx.coroutines.flow.internal.AbstractSharedFlow r1) {
            int r0 = r1.nCollectors
            return r0
    }

    public static final /* synthetic */ kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot[] access$getSlots(kotlinx.coroutines.flow.internal.AbstractSharedFlow r1) {
            S extends kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<?>[] r0 = r1.slots
            return r0
    }

    protected static /* synthetic */ void getSlots$annotations() {
            return
    }

    protected final S allocateSlot() {
            r9 = this;
            r0 = 0
            r1 = 0
            monitor-enter(r9)
            r2 = 0
            kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot[] r3 = r9.getSlots()     // Catch: java.lang.Throwable -> L6a
            r4 = 2
            if (r3 != 0) goto L15
            kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot[] r4 = r9.createSlotArray(r4)     // Catch: java.lang.Throwable -> L6a
            r5 = r4
            r6 = 0
            r9.slots = r5     // Catch: java.lang.Throwable -> L6a
            r3 = r4
            goto L32
        L15:
            int r5 = r9.getNCollectors()     // Catch: java.lang.Throwable -> L6a
            int r6 = r3.length     // Catch: java.lang.Throwable -> L6a
            if (r5 < r6) goto L31
            int r5 = r3.length     // Catch: java.lang.Throwable -> L6a
            int r5 = r5 * r4
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r3, r5)     // Catch: java.lang.Throwable -> L6a
            java.lang.String r5 = "copyOf(this, newSize)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r5)     // Catch: java.lang.Throwable -> L6a
            r5 = r4
            kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot[] r5 = (kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot[]) r5     // Catch: java.lang.Throwable -> L6a
            r6 = 0
            r9.slots = r5     // Catch: java.lang.Throwable -> L6a
            kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot[] r4 = (kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot[]) r4     // Catch: java.lang.Throwable -> L6a
            r3 = r4
            goto L32
        L31:
        L32:
            r4 = 0
            int r5 = r9.nextIndex     // Catch: java.lang.Throwable -> L6a
            r4 = r5
            r5 = 0
        L38:
            r6 = r3[r4]     // Catch: java.lang.Throwable -> L6a
            if (r6 != 0) goto L45
            kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot r6 = r9.createSlot()     // Catch: java.lang.Throwable -> L6a
            r7 = r6
            r8 = 0
            r3[r4] = r7     // Catch: java.lang.Throwable -> L6a
        L45:
            r5 = r6
            int r4 = r4 + 1
            int r6 = r3.length     // Catch: java.lang.Throwable -> L6a
            if (r4 < r6) goto L4c
            r4 = 0
        L4c:
            boolean r6 = r5.allocateLocked(r9)     // Catch: java.lang.Throwable -> L6a
            if (r6 == 0) goto L38
            r9.nextIndex = r4     // Catch: java.lang.Throwable -> L6a
            int r6 = r9.getNCollectors()     // Catch: java.lang.Throwable -> L6a
            r7 = 1
            int r6 = r6 + r7
            r9.nCollectors = r6     // Catch: java.lang.Throwable -> L6a
            kotlinx.coroutines.flow.internal.SubscriptionCountStateFlow r6 = r9._subscriptionCount     // Catch: java.lang.Throwable -> L6a
            r0 = r6
            monitor-exit(r9)
            r1 = r5
            if (r0 != 0) goto L66
            goto L69
        L66:
            r0.increment(r7)
        L69:
            return r1
        L6a:
            r2 = move-exception
            monitor-exit(r9)
            throw r2
    }

    protected abstract S createSlot();

    protected abstract S[] createSlotArray(int r1);

    protected final void forEachSlotLocked(kotlin.jvm.functions.Function1<? super S, kotlin.Unit> r9) {
            r8 = this;
            r0 = 0
            int r1 = access$getNCollectors(r8)
            if (r1 != 0) goto L8
            return
        L8:
            kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot[] r1 = access$getSlots(r8)
            if (r1 != 0) goto Lf
            goto L22
        Lf:
            r2 = 0
            int r3 = r1.length
            r4 = 0
        L12:
            if (r4 >= r3) goto L21
            r5 = r1[r4]
            int r4 = r4 + 1
            r6 = r5
            r7 = 0
            if (r6 == 0) goto L1f
            r9.invoke(r6)
        L1f:
            goto L12
        L21:
        L22:
            return
    }

    protected final void freeSlot(S r8) {
            r7 = this;
            r0 = 0
            r1 = 0
            monitor-enter(r7)
            r2 = 0
            int r3 = r7.getNCollectors()     // Catch: java.lang.Throwable -> L3c
            r4 = -1
            int r3 = r3 + r4
            r7.nCollectors = r3     // Catch: java.lang.Throwable -> L3c
            kotlinx.coroutines.flow.internal.SubscriptionCountStateFlow r3 = r7._subscriptionCount     // Catch: java.lang.Throwable -> L3c
            r0 = r3
            int r3 = r7.getNCollectors()     // Catch: java.lang.Throwable -> L3c
            r5 = 0
            if (r3 != 0) goto L18
            r7.nextIndex = r5     // Catch: java.lang.Throwable -> L3c
        L18:
            kotlin.coroutines.Continuation[] r3 = r8.freeLocked(r7)     // Catch: java.lang.Throwable -> L3c
            monitor-exit(r7)
            r1 = r3
            int r2 = r1.length
        L20:
            if (r5 >= r2) goto L35
            r3 = r1[r5]
            int r5 = r5 + 1
            if (r3 != 0) goto L29
            goto L20
        L29:
            kotlin.Result$Companion r6 = kotlin.Result.Companion
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            java.lang.Object r6 = kotlin.Result.m8669constructorimpl(r6)
            r3.resumeWith(r6)
            goto L20
        L35:
            if (r0 != 0) goto L38
            goto L3b
        L38:
            r0.increment(r4)
        L3b:
            return
        L3c:
            r2 = move-exception
            monitor-exit(r7)
            throw r2
    }

    protected final int getNCollectors() {
            r1 = this;
            int r0 = r1.nCollectors
            return r0
    }

    protected final S[] getSlots() {
            r1 = this;
            S extends kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<?>[] r0 = r1.slots
            return r0
    }

    public final kotlinx.coroutines.flow.StateFlow<java.lang.Integer> getSubscriptionCount() {
            r5 = this;
            r0 = 0
            monitor-enter(r5)
            r1 = 0
            kotlinx.coroutines.flow.internal.SubscriptionCountStateFlow r2 = r5._subscriptionCount     // Catch: java.lang.Throwable -> L1b
            if (r2 != 0) goto L15
            kotlinx.coroutines.flow.internal.SubscriptionCountStateFlow r2 = new kotlinx.coroutines.flow.internal.SubscriptionCountStateFlow     // Catch: java.lang.Throwable -> L1b
            int r3 = r5.getNCollectors()     // Catch: java.lang.Throwable -> L1b
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L1b
            r3 = r2
            r4 = 0
            r5._subscriptionCount = r3     // Catch: java.lang.Throwable -> L1b
        L15:
            monitor-exit(r5)
            kotlinx.coroutines.flow.StateFlow r2 = (kotlinx.coroutines.flow.StateFlow) r2
            return r2
        L1b:
            r1 = move-exception
            monitor-exit(r5)
            throw r1
    }
}
