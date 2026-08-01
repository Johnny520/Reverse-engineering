package kotlinx.coroutines.internal;

/* JADX INFO: compiled from: ConcurrentLinkedList.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u001a#\u0010\u0002\u001a\u00028\u0000\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0000*\u00028\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001ao\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r\"\u000e\b\u0000\u0010\u0005*\b\u0012\u0004\u0012\u00028\u00000\u0004*\u00028\u00002\u0006\u0010\u0007\u001a\u00020\u000628\u0010\f\u001a4\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0007\u0012\u0015\u0012\u0013\u0018\u00018\u0000¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00028\u00000\bH\u0082\bø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\"\u001a\u0010\u0011\u001a\u00020\u00108\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u0012\u0004\b\u0013\u0010\u0014\"\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0018"}, m115d2 = {"Lkotlinx/coroutines/internal/ConcurrentLinkedListNode;", "N", "close", "(Lkotlinx/coroutines/internal/ConcurrentLinkedListNode;)Lkotlinx/coroutines/internal/ConcurrentLinkedListNode;", "Lkotlinx/coroutines/internal/Segment;", "S", "", "id", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "prev", "createNewSegment", "Lkotlinx/coroutines/internal/SegmentOrClosed;", "findSegmentInternal", "(Lkotlinx/coroutines/internal/Segment;JLkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "Lkotlinx/coroutines/internal/Symbol;", "CLOSED", "Lkotlinx/coroutines/internal/Symbol;", "getCLOSED$annotations", "()V", "", "POINTERS_SHIFT", "I", "kotlinx-coroutines-core"}, m116k = 2, m117mv = {1, 6, 0}, m119xi = 48)
public final class ConcurrentLinkedListKt {
    private static final kotlinx.coroutines.internal.Symbol CLOSED = null;
    private static final int POINTERS_SHIFT = 16;

    static {
            kotlinx.coroutines.internal.Symbol r0 = new kotlinx.coroutines.internal.Symbol
            java.lang.String r1 = "CLOSED"
            r0.<init>(r1)
            kotlinx.coroutines.internal.ConcurrentLinkedListKt.CLOSED = r0
            return
    }

    public static final /* synthetic */ kotlinx.coroutines.internal.Symbol access$getCLOSED$p() {
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.internal.ConcurrentLinkedListKt.CLOSED
            return r0
    }

    public static final <N extends kotlinx.coroutines.internal.ConcurrentLinkedListNode<N>> N close(N r6) {
            r0 = 0
            r0 = r6
        L2:
            r1 = r0
            r2 = 0
            java.lang.Object r3 = kotlinx.coroutines.internal.ConcurrentLinkedListNode.access$getNextOrClosed(r1)
            r4 = 0
            kotlinx.coroutines.internal.Symbol r5 = access$getCLOSED$p()
            if (r3 != r5) goto L12
            r5 = 0
            return r0
        L12:
            r5 = r3
            kotlinx.coroutines.internal.ConcurrentLinkedListNode r5 = (kotlinx.coroutines.internal.ConcurrentLinkedListNode) r5
            r1 = r5
            if (r1 != 0) goto L22
            boolean r2 = r0.markAsClosed()
            if (r2 == 0) goto L2
            return r0
        L22:
            r0 = r1
            goto L2
    }

    private static final <S extends kotlinx.coroutines.internal.Segment<S>> java.lang.Object findSegmentInternal(S r8, long r9, kotlin.jvm.functions.Function2<? super java.lang.Long, ? super S, ? extends S> r11) {
            r0 = 0
            r1 = r8
        L2:
            long r2 = r1.getId()
            int r2 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r2 < 0) goto L16
            boolean r2 = r1.getRemoved()
            if (r2 == 0) goto L11
            goto L16
        L11:
            java.lang.Object r2 = kotlinx.coroutines.internal.SegmentOrClosed.m10223constructorimpl(r1)
            return r2
        L16:
            r2 = r1
            kotlinx.coroutines.internal.ConcurrentLinkedListNode r2 = (kotlinx.coroutines.internal.ConcurrentLinkedListNode) r2
            r3 = 0
            java.lang.Object r4 = kotlinx.coroutines.internal.ConcurrentLinkedListNode.access$getNextOrClosed(r2)
            r5 = 0
            kotlinx.coroutines.internal.Symbol r6 = access$getCLOSED$p()
            if (r4 != r6) goto L2f
            r6 = 0
            kotlinx.coroutines.internal.Symbol r7 = access$getCLOSED$p()
            java.lang.Object r7 = kotlinx.coroutines.internal.SegmentOrClosed.m10223constructorimpl(r7)
            return r7
        L2f:
            r6 = r4
            kotlinx.coroutines.internal.ConcurrentLinkedListNode r6 = (kotlinx.coroutines.internal.ConcurrentLinkedListNode) r6
            r2 = r6
            kotlinx.coroutines.internal.Segment r2 = (kotlinx.coroutines.internal.Segment) r2
            if (r2 == 0) goto L3c
            r1 = r2
            goto L2
        L3c:
            long r3 = r1.getId()
            r5 = 1
            long r3 = r3 + r5
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            java.lang.Object r3 = r11.invoke(r3, r1)
            kotlinx.coroutines.internal.Segment r3 = (kotlinx.coroutines.internal.Segment) r3
            r4 = r3
            kotlinx.coroutines.internal.ConcurrentLinkedListNode r4 = (kotlinx.coroutines.internal.ConcurrentLinkedListNode) r4
            boolean r4 = r1.trySetNext(r4)
            if (r4 == 0) goto L2
            boolean r4 = r1.getRemoved()
            if (r4 == 0) goto L5f
            r1.remove()
        L5f:
            r1 = r3
            goto L2
    }

    private static /* synthetic */ void getCLOSED$annotations() {
            return
    }
}
