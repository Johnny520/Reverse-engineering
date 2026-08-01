package kotlinx.coroutines.internal;

/* JADX INFO: compiled from: LockFreeTaskQueue.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\b\u0010\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00028\u0000¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\u0003¢\u0006\u0004\b\r\u0010\u000eJ-\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00010\u0012\"\u0004\b\u0001\u0010\u000f2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0017\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u000eR\u0011\u0010\u001b\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, m115d2 = {"Lkotlinx/coroutines/internal/LockFreeTaskQueue;", "", "E", "", "singleConsumer", "<init>", "(Z)V", "element", "addLast", "(Ljava/lang/Object;)Z", "", "close", "()V", "isClosed", "()Z", "R", "Lkotlin/Function1;", "transform", "", "map", "(Lkotlin/jvm/functions/Function1;)Ljava/util/List;", "removeFirstOrNull", "()Ljava/lang/Object;", "isEmpty", "", "getSize", "()I", "size", "kotlinx-coroutines-core"}, m116k = 1, m117mv = {1, 6, 0}, m119xi = 48)
public class LockFreeTaskQueue<E> {
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater _cur$FU = null;
    private volatile /* synthetic */ java.lang.Object _cur;

    static {
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            java.lang.String r1 = "_cur"
            java.lang.Class<kotlinx.coroutines.internal.LockFreeTaskQueue> r2 = kotlinx.coroutines.internal.LockFreeTaskQueue.class
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r0, r1)
            kotlinx.coroutines.internal.LockFreeTaskQueue._cur$FU = r0
            return
    }

    public LockFreeTaskQueue(boolean r3) {
            r2 = this;
            r2.<init>()
            kotlinx.coroutines.internal.LockFreeTaskQueueCore r0 = new kotlinx.coroutines.internal.LockFreeTaskQueueCore
            r1 = 8
            r0.<init>(r1, r3)
            r2._cur = r0
            return
    }

    public final boolean addLast(E r7) {
            r6 = this;
            r0 = r6
            r1 = 0
        L2:
            java.lang.Object r2 = r0._cur
            kotlinx.coroutines.internal.LockFreeTaskQueueCore r2 = (kotlinx.coroutines.internal.LockFreeTaskQueueCore) r2
            r3 = 0
            int r4 = r2.addLast(r7)
            switch(r4) {
                case 0: goto L1c;
                case 1: goto L12;
                case 2: goto L10;
                default: goto Lf;
            }
        Lf:
            goto L1e
        L10:
            r4 = 0
            return r4
        L12:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = kotlinx.coroutines.internal.LockFreeTaskQueue._cur$FU
            kotlinx.coroutines.internal.LockFreeTaskQueueCore r5 = r2.next()
            androidx.concurrent.futures.C0110xc40028dd.m9m(r4, r6, r2, r5)
            goto L1e
        L1c:
            r4 = 1
            return r4
        L1e:
            goto L2
    }

    public final void close() {
            r6 = this;
            r0 = r6
            r1 = 0
        L2:
            java.lang.Object r2 = r0._cur
            kotlinx.coroutines.internal.LockFreeTaskQueueCore r2 = (kotlinx.coroutines.internal.LockFreeTaskQueueCore) r2
            r3 = 0
            boolean r4 = r2.close()
            if (r4 == 0) goto Lf
            return
        Lf:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = kotlinx.coroutines.internal.LockFreeTaskQueue._cur$FU
            kotlinx.coroutines.internal.LockFreeTaskQueueCore r5 = r2.next()
            androidx.concurrent.futures.C0110xc40028dd.m9m(r4, r6, r2, r5)
            goto L2
    }

    public final int getSize() {
            r1 = this;
            java.lang.Object r0 = r1._cur
            kotlinx.coroutines.internal.LockFreeTaskQueueCore r0 = (kotlinx.coroutines.internal.LockFreeTaskQueueCore) r0
            int r0 = r0.getSize()
            return r0
    }

    public final boolean isClosed() {
            r1 = this;
            java.lang.Object r0 = r1._cur
            kotlinx.coroutines.internal.LockFreeTaskQueueCore r0 = (kotlinx.coroutines.internal.LockFreeTaskQueueCore) r0
            boolean r0 = r0.isClosed()
            return r0
    }

    public final boolean isEmpty() {
            r1 = this;
            java.lang.Object r0 = r1._cur
            kotlinx.coroutines.internal.LockFreeTaskQueueCore r0 = (kotlinx.coroutines.internal.LockFreeTaskQueueCore) r0
            boolean r0 = r0.isEmpty()
            return r0
    }

    public final <R> java.util.List<R> map(kotlin.jvm.functions.Function1<? super E, ? extends R> r2) {
            r1 = this;
            java.lang.Object r0 = r1._cur
            kotlinx.coroutines.internal.LockFreeTaskQueueCore r0 = (kotlinx.coroutines.internal.LockFreeTaskQueueCore) r0
            java.util.List r0 = r0.map(r2)
            return r0
    }

    public final E removeFirstOrNull() {
            r7 = this;
            r0 = r7
            r1 = 0
        L2:
            java.lang.Object r2 = r0._cur
            kotlinx.coroutines.internal.LockFreeTaskQueueCore r2 = (kotlinx.coroutines.internal.LockFreeTaskQueueCore) r2
            r3 = 0
            java.lang.Object r4 = r2.removeFirstOrNull()
            kotlinx.coroutines.internal.Symbol r5 = kotlinx.coroutines.internal.LockFreeTaskQueueCore.REMOVE_FROZEN
            if (r4 == r5) goto L11
            return r4
        L11:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = kotlinx.coroutines.internal.LockFreeTaskQueue._cur$FU
            kotlinx.coroutines.internal.LockFreeTaskQueueCore r6 = r2.next()
            androidx.concurrent.futures.C0110xc40028dd.m9m(r5, r7, r2, r6)
            goto L2
    }
}
