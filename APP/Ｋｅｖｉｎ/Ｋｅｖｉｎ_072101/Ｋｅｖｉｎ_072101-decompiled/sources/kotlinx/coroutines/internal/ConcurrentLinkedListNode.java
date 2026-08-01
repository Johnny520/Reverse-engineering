package kotlinx.coroutines.internal;

import kotlinx.coroutines.internal.ConcurrentLinkedListNode;

/* JADX INFO: compiled from: ConcurrentLinkedList.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\r\n\u0002\u0010\u0000\n\u0002\b\t\b \u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00002\u00020\u001aB\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ \u0010\u000e\u001a\u0004\u0018\u00018\u00002\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0086\b¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u0005¢\u0006\u0004\b\u0010\u0010\u0007J\u0015\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00028\u0000¢\u0006\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0014\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\nR\u0016\u0010\u0017\u001a\u0004\u0018\u00018\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0019\u001a\u0004\u0018\u00018\u00008F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0016R\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u001a8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\u0002\u001a\u0004\u0018\u00018\u00008F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0016R\u0014\u0010 \u001a\u00020\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\nR\u0014\u0010\"\u001a\u00028\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\u0016¨\u0006#"}, m115d2 = {"Lkotlinx/coroutines/internal/ConcurrentLinkedListNode;", "N", "prev", "<init>", "(Lkotlinx/coroutines/internal/ConcurrentLinkedListNode;)V", "", "cleanPrev", "()V", "", "markAsClosed", "()Z", "Lkotlin/Function0;", "", "onClosedAction", "nextOrIfClosed", "(Lkotlin/jvm/functions/Function0;)Lkotlinx/coroutines/internal/ConcurrentLinkedListNode;", "remove", "value", "trySetNext", "(Lkotlinx/coroutines/internal/ConcurrentLinkedListNode;)Z", "isTail", "getLeftmostAliveNode", "()Lkotlinx/coroutines/internal/ConcurrentLinkedListNode;", "leftmostAliveNode", "getNext", "next", "", "getNextOrClosed", "()Ljava/lang/Object;", "nextOrClosed", "getPrev", "getRemoved", "removed", "getRightmostAliveNode", "rightmostAliveNode", "kotlinx-coroutines-core"}, m116k = 1, m117mv = {1, 6, 0}, m119xi = 48)
public abstract class ConcurrentLinkedListNode<N extends kotlinx.coroutines.internal.ConcurrentLinkedListNode<N>> {
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater _next$FU = null;
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater _prev$FU = null;
    private volatile /* synthetic */ java.lang.Object _next;
    private volatile /* synthetic */ java.lang.Object _prev;

    static {
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            java.lang.String r1 = "_next"
            java.lang.Class<kotlinx.coroutines.internal.ConcurrentLinkedListNode> r2 = kotlinx.coroutines.internal.ConcurrentLinkedListNode.class
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r0, r1)
            kotlinx.coroutines.internal.ConcurrentLinkedListNode._next$FU = r0
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            java.lang.String r1 = "_prev"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r0, r1)
            kotlinx.coroutines.internal.ConcurrentLinkedListNode._prev$FU = r0
            return
    }

    public ConcurrentLinkedListNode(N r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1._next = r0
            r1._prev = r2
            return
    }

    public static final /* synthetic */ java.lang.Object access$getNextOrClosed(kotlinx.coroutines.internal.ConcurrentLinkedListNode r1) {
            java.lang.Object r0 = r1.getNextOrClosed()
            return r0
    }

    private final N getLeftmostAliveNode() {
            r2 = this;
            kotlinx.coroutines.internal.ConcurrentLinkedListNode r0 = r2.getPrev()
        L4:
            if (r0 == 0) goto L12
            boolean r1 = r0.getRemoved()
            if (r1 == 0) goto L12
            java.lang.Object r1 = r0._prev
            r0 = r1
            kotlinx.coroutines.internal.ConcurrentLinkedListNode r0 = (kotlinx.coroutines.internal.ConcurrentLinkedListNode) r0
            goto L4
        L12:
            return r0
    }

    private final java.lang.Object getNextOrClosed() {
            r1 = this;
            java.lang.Object r0 = r1._next
            return r0
    }

    private final N getRightmostAliveNode() {
            r2 = this;
            boolean r0 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
            if (r0 == 0) goto L14
            r0 = 0
            boolean r1 = r2.isTail()
            if (r1 != 0) goto Le
            goto L14
        Le:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        L14:
            kotlinx.coroutines.internal.ConcurrentLinkedListNode r0 = r2.getNext()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
        L1b:
            boolean r1 = r0.getRemoved()
            if (r1 == 0) goto L2a
            kotlinx.coroutines.internal.ConcurrentLinkedListNode r1 = r0.getNext()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            r0 = r1
            goto L1b
        L2a:
            return r0
    }

    public final void cleanPrev() {
            r2 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.internal.ConcurrentLinkedListNode._prev$FU
            r1 = 0
            r0.lazySet(r2, r1)
            return
    }

    public final N getNext() {
            r6 = this;
            r0 = r6
            r1 = 0
            java.lang.Object r2 = access$getNextOrClosed(r0)
            r3 = 0
            kotlinx.coroutines.internal.Symbol r4 = kotlinx.coroutines.internal.ConcurrentLinkedListKt.access$getCLOSED$p()
            if (r2 != r4) goto L10
            r4 = 0
            r5 = 0
            return r5
        L10:
            r4 = r2
            kotlinx.coroutines.internal.ConcurrentLinkedListNode r4 = (kotlinx.coroutines.internal.ConcurrentLinkedListNode) r4
            return r4
    }

    public final N getPrev() {
            r1 = this;
            java.lang.Object r0 = r1._prev
            kotlinx.coroutines.internal.ConcurrentLinkedListNode r0 = (kotlinx.coroutines.internal.ConcurrentLinkedListNode) r0
            return r0
    }

    public abstract boolean getRemoved();

    public final boolean isTail() {
            r1 = this;
            kotlinx.coroutines.internal.ConcurrentLinkedListNode r0 = r1.getNext()
            if (r0 != 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    public final boolean markAsClosed() {
            r3 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.internal.ConcurrentLinkedListNode._next$FU
            r1 = 0
            kotlinx.coroutines.internal.Symbol r2 = kotlinx.coroutines.internal.ConcurrentLinkedListKt.access$getCLOSED$p()
            boolean r0 = androidx.concurrent.futures.C0110xc40028dd.m9m(r0, r3, r1, r2)
            return r0
    }

    public final N nextOrIfClosed(kotlin.jvm.functions.Function0 r5) {
            r4 = this;
            r0 = 0
            java.lang.Object r1 = access$getNextOrClosed(r4)
            r2 = 0
            kotlinx.coroutines.internal.Symbol r3 = kotlinx.coroutines.internal.ConcurrentLinkedListKt.access$getCLOSED$p()
            if (r1 == r3) goto L12
            r3 = r1
            kotlinx.coroutines.internal.ConcurrentLinkedListNode r3 = (kotlinx.coroutines.internal.ConcurrentLinkedListNode) r3
            return r3
        L12:
            r5.invoke()
            kotlin.KotlinNothingValueException r3 = new kotlin.KotlinNothingValueException
            r3.<init>()
            throw r3
    }

    public final void remove() {
            r3 = this;
            boolean r0 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
            if (r0 == 0) goto L14
            r0 = 0
            boolean r0 = r3.getRemoved()
            if (r0 == 0) goto Le
            goto L14
        Le:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        L14:
            boolean r0 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
            if (r0 == 0) goto L28
            r0 = 0
            boolean r1 = r3.isTail()
            if (r1 != 0) goto L22
            goto L28
        L22:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        L28:
            kotlinx.coroutines.internal.ConcurrentLinkedListNode r0 = r3.getLeftmostAliveNode()
            kotlinx.coroutines.internal.ConcurrentLinkedListNode r1 = r3.getRightmostAliveNode()
            r1._prev = r0
            if (r0 == 0) goto L37
            r0._next = r1
        L37:
            boolean r2 = r1.getRemoved()
            if (r2 == 0) goto L3e
            goto L28
        L3e:
            if (r0 == 0) goto L47
            boolean r2 = r0.getRemoved()
            if (r2 == 0) goto L47
            goto L28
        L47:
            return
    }

    public final boolean trySetNext(N r3) {
            r2 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.internal.ConcurrentLinkedListNode._next$FU
            r1 = 0
            boolean r0 = androidx.concurrent.futures.C0110xc40028dd.m9m(r0, r2, r1, r3)
            return r0
    }
}
