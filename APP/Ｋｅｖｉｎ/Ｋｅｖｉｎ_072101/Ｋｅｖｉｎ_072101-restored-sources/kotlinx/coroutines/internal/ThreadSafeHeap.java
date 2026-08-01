package kotlinx.coroutines.internal;

import java.lang.Comparable;
import kotlinx.coroutines.internal.ThreadSafeHeapNode;

/* JADX INFO: compiled from: ThreadSafeHeap.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0018\n\u0002\u0010\u0000\n\u0002\u0018\u0002\b\u0017\u0018\u0000*\u0012\b\u0000\u0010\u0003*\u00020\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u000602j\u0002`3B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00028\u0000H\u0001¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\n\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00028\u0000¢\u0006\u0004\b\n\u0010\tJ.\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00028\u00002\u0014\u0010\r\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0004\u0012\u00020\f0\u000bH\u0086\b¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u0007¢\u0006\u0004\b\u0010\u0010\u0005J\u0011\u0010\u0011\u001a\u0004\u0018\u00018\u0000H\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0013\u0010\u0012J\u0017\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00028\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00028\u00002\u0006\u0010\u001a\u001a\u00020\u0019H\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ&\u0010\u001e\u001a\u0004\u0018\u00018\u00002\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\f0\u000bH\u0086\b¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b \u0010\u0012J\u0018\u0010\"\u001a\u00020\u00072\u0006\u0010!\u001a\u00020\u0019H\u0082\u0010¢\u0006\u0004\b\"\u0010#J\u0018\u0010$\u001a\u00020\u00072\u0006\u0010!\u001a\u00020\u0019H\u0082\u0010¢\u0006\u0004\b$\u0010#J\u001f\u0010&\u001a\u00020\u00072\u0006\u0010!\u001a\u00020\u00192\u0006\u0010%\u001a\u00020\u0019H\u0002¢\u0006\u0004\b&\u0010'R \u0010(\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0011\u0010*\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b*\u0010+R$\u00100\u001a\u00020\u00192\u0006\u0010,\u001a\u00020\u00198F@BX\u0086\u000e¢\u0006\f\u001a\u0004\b-\u0010.\"\u0004\b/\u0010#¨\u00061"}, m115d2 = {"Lkotlinx/coroutines/internal/ThreadSafeHeap;", "Lkotlinx/coroutines/internal/ThreadSafeHeapNode;", "", "T", "<init>", "()V", "node", "", "addImpl", "(Lkotlinx/coroutines/internal/ThreadSafeHeapNode;)V", "addLast", "Lkotlin/Function1;", "", "cond", "addLastIf", "(Lkotlinx/coroutines/internal/ThreadSafeHeapNode;Lkotlin/jvm/functions/Function1;)Z", "clear", "firstImpl", "()Lkotlinx/coroutines/internal/ThreadSafeHeapNode;", "peek", "", "realloc", "()[Lkotlinx/coroutines/internal/ThreadSafeHeapNode;", "remove", "(Lkotlinx/coroutines/internal/ThreadSafeHeapNode;)Z", "", "index", "removeAtImpl", "(I)Lkotlinx/coroutines/internal/ThreadSafeHeapNode;", "predicate", "removeFirstIf", "(Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/internal/ThreadSafeHeapNode;", "removeFirstOrNull", "i", "siftDownFrom", "(I)V", "siftUpFrom", "j", "swap", "(II)V", "a", "[Lkotlinx/coroutines/internal/ThreadSafeHeapNode;", "isEmpty", "()Z", "value", "getSize", "()I", "setSize", "size", "kotlinx-coroutines-core", "", "Lkotlinx/coroutines/internal/SynchronizedObject;"}, m116k = 1, m117mv = {1, 6, 0}, m119xi = 48)
public class ThreadSafeHeap<T extends kotlinx.coroutines.internal.ThreadSafeHeapNode & java.lang.Comparable<? super T>> {
    private volatile /* synthetic */ int _size;

    /* JADX INFO: renamed from: a */
    private T[] f83a;

    public ThreadSafeHeap() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1._size = r0
            return
    }

    private final T[] realloc() {
            r4 = this;
            T extends kotlinx.coroutines.internal.ThreadSafeHeapNode & java.lang.Comparable<? super T>[] r0 = r4.f83a
            if (r0 != 0) goto Ld
            r1 = 4
            kotlinx.coroutines.internal.ThreadSafeHeapNode[] r1 = new kotlinx.coroutines.internal.ThreadSafeHeapNode[r1]
            r2 = r1
            r3 = 0
            r4.f83a = r2
            goto L2d
        Ld:
            int r1 = r4.getSize()
            int r2 = r0.length
            if (r1 < r2) goto L2c
            int r1 = r4.getSize()
            int r1 = r1 * 2
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r0, r1)
            java.lang.String r2 = "copyOf(this, newSize)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            r2 = r1
            kotlinx.coroutines.internal.ThreadSafeHeapNode[] r2 = (kotlinx.coroutines.internal.ThreadSafeHeapNode[]) r2
            r3 = 0
            r4.f83a = r2
            kotlinx.coroutines.internal.ThreadSafeHeapNode[] r1 = (kotlinx.coroutines.internal.ThreadSafeHeapNode[]) r1
            goto L2d
        L2c:
            r1 = r0
        L2d:
            return r1
    }

    private final void setSize(int r1) {
            r0 = this;
            r0._size = r1
            return
    }

    private final void siftDownFrom(int r6) {
            r5 = this;
            r0 = r6
        L1:
            int r1 = r0 * 2
            int r1 = r1 + 1
            int r2 = r5.getSize()
            if (r1 < r2) goto Lc
            return
        Lc:
            T extends kotlinx.coroutines.internal.ThreadSafeHeapNode & java.lang.Comparable<? super T>[] r2 = r5.f83a
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            int r3 = r1 + 1
            int r4 = r5.getSize()
            if (r3 >= r4) goto L2f
            int r3 = r1 + 1
            r3 = r2[r3]
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3)
            java.lang.Comparable r3 = (java.lang.Comparable) r3
            r4 = r2[r1]
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4)
            int r3 = r3.compareTo(r4)
            if (r3 >= 0) goto L2f
            int r1 = r1 + 1
        L2f:
            r3 = r2[r0]
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3)
            java.lang.Comparable r3 = (java.lang.Comparable) r3
            r4 = r2[r1]
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4)
            int r3 = r3.compareTo(r4)
            if (r3 > 0) goto L42
            return
        L42:
            r5.swap(r0, r1)
            r0 = r1
            goto L1
    }

    private final void siftUpFrom(int r6) {
            r5 = this;
            r0 = r6
        L1:
            if (r0 > 0) goto L4
            return
        L4:
            T extends kotlinx.coroutines.internal.ThreadSafeHeapNode & java.lang.Comparable<? super T>[] r1 = r5.f83a
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            int r2 = r0 + (-1)
            int r2 = r2 / 2
            r3 = r1[r2]
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3)
            java.lang.Comparable r3 = (java.lang.Comparable) r3
            r4 = r1[r0]
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4)
            int r3 = r3.compareTo(r4)
            if (r3 > 0) goto L20
            return
        L20:
            r5.swap(r0, r2)
            r0 = r2
            goto L1
    }

    private final void swap(int r4, int r5) {
            r3 = this;
            T extends kotlinx.coroutines.internal.ThreadSafeHeapNode & java.lang.Comparable<? super T>[] r0 = r3.f83a
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            r1 = r0[r5]
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            r2 = r0[r4]
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            r0[r4] = r1
            r0[r5] = r2
            r1.setIndex(r4)
            r2.setIndex(r5)
            return
    }

    public final void addImpl(T r4) {
            r3 = this;
            boolean r0 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
            if (r0 == 0) goto L19
            r0 = 0
            kotlinx.coroutines.internal.ThreadSafeHeap r1 = r4.getHeap()
            if (r1 != 0) goto Lf
            r1 = 1
            goto L10
        Lf:
            r1 = 0
        L10:
            if (r1 == 0) goto L13
            goto L19
        L13:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        L19:
            r4.setHeap(r3)
            kotlinx.coroutines.internal.ThreadSafeHeapNode[] r0 = r3.realloc()
            int r1 = r3.getSize()
            int r2 = r1 + 1
            r3.setSize(r2)
            r0[r1] = r4
            r4.setIndex(r1)
            r3.siftUpFrom(r1)
            return
    }

    public final void addLast(T r3) {
            r2 = this;
            r0 = 0
            monitor-enter(r2)
            r1 = 0
            r2.addImpl(r3)     // Catch: java.lang.Throwable -> Lb
            kotlin.Unit r1 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r2)
            return
        Lb:
            r1 = move-exception
            monitor-exit(r2)
            throw r1
    }

    public final boolean addLastIf(T r6, kotlin.jvm.functions.Function1<? super T, java.lang.Boolean> r7) {
            r5 = this;
            r0 = 0
            r1 = 0
            monitor-enter(r5)
            r2 = 0
            r3 = 1
            kotlinx.coroutines.internal.ThreadSafeHeapNode r4 = r5.firstImpl()     // Catch: java.lang.Throwable -> L25
            java.lang.Object r4 = r7.invoke(r4)     // Catch: java.lang.Throwable -> L25
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch: java.lang.Throwable -> L25
            boolean r4 = r4.booleanValue()     // Catch: java.lang.Throwable -> L25
            if (r4 == 0) goto L1a
            r5.addImpl(r6)     // Catch: java.lang.Throwable -> L25
            r4 = r3
            goto L1b
        L1a:
            r4 = 0
        L1b:
            kotlin.jvm.internal.InlineMarker.finallyStart(r3)
            monitor-exit(r5)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r3)
            return r4
        L25:
            r2 = move-exception
            kotlin.jvm.internal.InlineMarker.finallyStart(r3)
            monitor-exit(r5)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r3)
            throw r2
    }

    public final void clear() {
            r8 = this;
            r0 = 0
            monitor-enter(r8)
            r1 = 0
            T extends kotlinx.coroutines.internal.ThreadSafeHeapNode & java.lang.Comparable<? super T>[] r2 = r8.f83a     // Catch: java.lang.Throwable -> L19
            if (r2 != 0) goto L8
            goto L10
        L8:
            r6 = 6
            r7 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            kotlin.collections.ArraysKt.fill$default(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L19
        L10:
            r2 = 0
            r8._size = r2     // Catch: java.lang.Throwable -> L19
            kotlin.Unit r1 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L19
            monitor-exit(r8)
            return
        L19:
            r1 = move-exception
            monitor-exit(r8)
            throw r1
    }

    public final T firstImpl() {
            r2 = this;
            T extends kotlinx.coroutines.internal.ThreadSafeHeapNode & java.lang.Comparable<? super T>[] r0 = r2.f83a
            if (r0 != 0) goto L6
            r0 = 0
            goto L9
        L6:
            r1 = 0
            r0 = r0[r1]
        L9:
            return r0
    }

    public final int getSize() {
            r1 = this;
            int r0 = r1._size
            return r0
    }

    public final boolean isEmpty() {
            r1 = this;
            int r0 = r1.getSize()
            if (r0 != 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    public final T peek() {
            r3 = this;
            r0 = 0
            monitor-enter(r3)
            r1 = 0
            kotlinx.coroutines.internal.ThreadSafeHeapNode r2 = r3.firstImpl()     // Catch: java.lang.Throwable -> La
            monitor-exit(r3)
            return r2
        La:
            r1 = move-exception
            monitor-exit(r3)
            throw r1
    }

    public final boolean remove(T r7) {
            r6 = this;
            r0 = 0
            monitor-enter(r6)
            r1 = 0
            kotlinx.coroutines.internal.ThreadSafeHeap r2 = r7.getHeap()     // Catch: java.lang.Throwable -> L29
            r3 = 0
            if (r2 != 0) goto Lb
            goto L27
        Lb:
            int r2 = r7.getIndex()     // Catch: java.lang.Throwable -> L29
            boolean r4 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()     // Catch: java.lang.Throwable -> L29
            r5 = 1
            if (r4 == 0) goto L23
            r4 = 0
            if (r2 < 0) goto L1a
            r3 = r5
        L1a:
            if (r3 == 0) goto L1d
            goto L23
        L1d:
            java.lang.AssertionError r3 = new java.lang.AssertionError     // Catch: java.lang.Throwable -> L29
            r3.<init>()     // Catch: java.lang.Throwable -> L29
            throw r3     // Catch: java.lang.Throwable -> L29
        L23:
            r6.removeAtImpl(r2)     // Catch: java.lang.Throwable -> L29
            r3 = r5
        L27:
            monitor-exit(r6)
            return r3
        L29:
            r1 = move-exception
            monitor-exit(r6)
            throw r1
    }

    public final T removeAtImpl(int r8) {
            r7 = this;
            boolean r0 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L1b
            r0 = 0
            int r3 = r7.getSize()
            if (r3 <= 0) goto L11
            r0 = r2
            goto L12
        L11:
            r0 = r1
        L12:
            if (r0 == 0) goto L15
            goto L1b
        L15:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        L1b:
            T extends kotlinx.coroutines.internal.ThreadSafeHeapNode & java.lang.Comparable<? super T>[] r0 = r7.f83a
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            int r3 = r7.getSize()
            r4 = -1
            int r3 = r3 + r4
            r7.setSize(r3)
            int r3 = r7.getSize()
            if (r8 >= r3) goto L58
            int r3 = r7.getSize()
            r7.swap(r8, r3)
            int r3 = r8 + (-1)
            int r3 = r3 / 2
            if (r8 <= 0) goto L55
            r5 = r0[r8]
            kotlin.jvm.internal.Intrinsics.checkNotNull(r5)
            java.lang.Comparable r5 = (java.lang.Comparable) r5
            r6 = r0[r3]
            kotlin.jvm.internal.Intrinsics.checkNotNull(r6)
            int r5 = r5.compareTo(r6)
            if (r5 >= 0) goto L55
            r7.swap(r8, r3)
            r7.siftUpFrom(r3)
            goto L58
        L55:
            r7.siftDownFrom(r8)
        L58:
            int r3 = r7.getSize()
            r3 = r0[r3]
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3)
            boolean r5 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
            if (r5 == 0) goto L78
            r5 = 0
            kotlinx.coroutines.internal.ThreadSafeHeap r6 = r3.getHeap()
            if (r6 != r7) goto L6f
            r1 = r2
        L6f:
            if (r1 == 0) goto L72
            goto L78
        L72:
            java.lang.AssertionError r1 = new java.lang.AssertionError
            r1.<init>()
            throw r1
        L78:
            r1 = 0
            r3.setHeap(r1)
            r3.setIndex(r4)
            int r2 = r7.getSize()
            r0[r2] = r1
            return r3
    }

    public final T removeFirstIf(kotlin.jvm.functions.Function1<? super T, java.lang.Boolean> r8) {
            r7 = this;
            r0 = 0
            r1 = 0
            monitor-enter(r7)
            r2 = 0
            r3 = 1
            kotlinx.coroutines.internal.ThreadSafeHeapNode r4 = r7.firstImpl()     // Catch: java.lang.Throwable -> L34
            r5 = 0
            if (r4 != 0) goto L15
            r1 = 2
            kotlin.jvm.internal.InlineMarker.finallyStart(r1)
            monitor-exit(r7)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r1)
            return r5
        L15:
            java.lang.Object r6 = r8.invoke(r4)     // Catch: java.lang.Throwable -> L34
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch: java.lang.Throwable -> L34
            boolean r6 = r6.booleanValue()     // Catch: java.lang.Throwable -> L34
            if (r6 == 0) goto L27
            r5 = 0
            kotlinx.coroutines.internal.ThreadSafeHeapNode r5 = r7.removeAtImpl(r5)     // Catch: java.lang.Throwable -> L34
            goto L2a
        L27:
            r6 = r5
            kotlinx.coroutines.internal.ThreadSafeHeapNode r6 = (kotlinx.coroutines.internal.ThreadSafeHeapNode) r6     // Catch: java.lang.Throwable -> L34
        L2a:
            kotlin.jvm.internal.InlineMarker.finallyStart(r3)
            monitor-exit(r7)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r3)
            return r5
        L34:
            r2 = move-exception
            kotlin.jvm.internal.InlineMarker.finallyStart(r3)
            monitor-exit(r7)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r3)
            throw r2
    }

    public final T removeFirstOrNull() {
            r4 = this;
            r0 = 0
            monitor-enter(r4)
            r1 = 0
            int r2 = r4.getSize()     // Catch: java.lang.Throwable -> L17
            if (r2 <= 0) goto Lf
            r2 = 0
            kotlinx.coroutines.internal.ThreadSafeHeapNode r2 = r4.removeAtImpl(r2)     // Catch: java.lang.Throwable -> L17
            goto L13
        Lf:
            r2 = 0
            r3 = r2
            kotlinx.coroutines.internal.ThreadSafeHeapNode r3 = (kotlinx.coroutines.internal.ThreadSafeHeapNode) r3     // Catch: java.lang.Throwable -> L17
        L13:
            monitor-exit(r4)
            return r2
        L17:
            r1 = move-exception
            monitor-exit(r4)
            throw r1
    }
}
