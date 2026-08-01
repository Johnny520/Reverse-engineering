package kotlinx.coroutines.internal;

import kotlinx.coroutines.internal.Segment;

/* JADX INFO: compiled from: ConcurrentLinkedList.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0018\u0002\b \u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00002\b\u0012\u0004\u0012\u00028\u00000\u001bB!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00018\u0000\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\f\u001a\u00020\tH\u0000¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\tH\u0000¢\u0006\u0004\b\u0010\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00058&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u000b¨\u0006\u001a"}, m115d2 = {"Lkotlinx/coroutines/internal/Segment;", "S", "", "id", "prev", "", "pointers", "<init>", "(JLkotlinx/coroutines/internal/Segment;I)V", "", "decPointers$kotlinx_coroutines_core", "()Z", "decPointers", "", "onSlotCleaned", "()V", "tryIncPointers$kotlinx_coroutines_core", "tryIncPointers", "J", "getId", "()J", "getMaxSlots", "()I", "maxSlots", "getRemoved", "removed", "kotlinx-coroutines-core", "Lkotlinx/coroutines/internal/ConcurrentLinkedListNode;"}, m116k = 1, m117mv = {1, 6, 0}, m119xi = 48)
public abstract class Segment<S extends kotlinx.coroutines.internal.Segment<S>> extends kotlinx.coroutines.internal.ConcurrentLinkedListNode<S> {
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater cleanedAndPointers$FU = null;
    private volatile /* synthetic */ int cleanedAndPointers;

    /* JADX INFO: renamed from: id */
    private final long f82id;

    static {
            java.lang.Class<kotlinx.coroutines.internal.Segment> r0 = kotlinx.coroutines.internal.Segment.class
            java.lang.String r1 = "cleanedAndPointers"
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r0, r1)
            kotlinx.coroutines.internal.Segment.cleanedAndPointers$FU = r0
            return
    }

    public Segment(long r2, S r4, int r5) {
            r1 = this;
            r0 = r4
            kotlinx.coroutines.internal.ConcurrentLinkedListNode r0 = (kotlinx.coroutines.internal.ConcurrentLinkedListNode) r0
            r1.<init>(r0)
            r1.f82id = r2
            int r0 = r5 << 16
            r1.cleanedAndPointers = r0
            return
    }

    public final boolean decPointers$kotlinx_coroutines_core() {
            r2 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = kotlinx.coroutines.internal.Segment.cleanedAndPointers$FU
            r1 = -65536(0xffffffffffff0000, float:NaN)
            int r0 = r0.addAndGet(r2, r1)
            int r1 = r2.getMaxSlots()
            if (r0 != r1) goto L16
            boolean r0 = r2.isTail()
            if (r0 != 0) goto L16
            r0 = 1
            goto L17
        L16:
            r0 = 0
        L17:
            return r0
    }

    public final long getId() {
            r2 = this;
            long r0 = r2.f82id
            return r0
    }

    public abstract int getMaxSlots();

    @Override // kotlinx.coroutines.internal.ConcurrentLinkedListNode
    public boolean getRemoved() {
            r2 = this;
            int r0 = r2.cleanedAndPointers
            int r1 = r2.getMaxSlots()
            if (r0 != r1) goto L10
            boolean r0 = r2.isTail()
            if (r0 != 0) goto L10
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            return r0
    }

    public final void onSlotCleaned() {
            r2 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = kotlinx.coroutines.internal.Segment.cleanedAndPointers$FU
            int r0 = r0.incrementAndGet(r2)
            int r1 = r2.getMaxSlots()
            if (r0 != r1) goto L15
            boolean r0 = r2.isTail()
            if (r0 != 0) goto L15
            r2.remove()
        L15:
            return
    }

    public final boolean tryIncPointers$kotlinx_coroutines_core() {
            r9 = this;
            r0 = 65536(0x10000, float:9.1835E-41)
            r1 = r9
            r2 = 0
        L4:
            int r3 = r1.cleanedAndPointers
            r4 = r3
            r5 = 0
            int r6 = r9.getMaxSlots()
            r7 = 0
            r8 = 1
            if (r4 != r6) goto L1a
            boolean r6 = r9.isTail()
            if (r6 == 0) goto L18
            goto L1a
        L18:
            r4 = r7
            goto L1b
        L1a:
            r4 = r8
        L1b:
            if (r4 != 0) goto L1e
            goto L29
        L1e:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r4 = kotlinx.coroutines.internal.Segment.cleanedAndPointers$FU
            int r5 = r3 + r0
            boolean r4 = r4.compareAndSet(r1, r3, r5)
            if (r4 == 0) goto L4
            r7 = r8
        L29:
            return r7
    }
}
