package kotlinx.coroutines.internal;

/* JADX INFO: compiled from: LockFreeTaskQueue.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0016\b\u0000\u0018\u0000 /*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001:\u0002/0B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\u00032\u0006\u0010\t\u001a\u00028\u0000¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0000j\b\u0012\u0004\u0012\u00028\u0000`\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0000j\b\u0012\u0004\u0012\u00028\u0000`\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\r\u0010\u0012\u001a\u00020\u0005¢\u0006\u0004\b\u0012\u0010\u0013J3\u0010\u0015\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0000j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u000e2\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\t\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0005¢\u0006\u0004\b\u0017\u0010\u0013J-\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00010\u001b\"\u0004\b\u0001\u0010\u00182\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0019¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0013\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u0000¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\"\u0010#J3\u0010&\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0000j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u000e2\u0006\u0010$\u001a\u00020\u00032\u0006\u0010%\u001a\u00020\u0003H\u0002¢\u0006\u0004\b&\u0010'R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010(R\u0011\u0010)\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b)\u0010\u0013R\u0014\u0010*\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010(R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010+R\u0011\u0010.\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b,\u0010-¨\u00061"}, m115d2 = {"Lkotlinx/coroutines/internal/LockFreeTaskQueueCore;", "", "E", "", "capacity", "", "singleConsumer", "<init>", "(IZ)V", "element", "addLast", "(Ljava/lang/Object;)I", "", "state", "Lkotlinx/coroutines/internal/Core;", "allocateNextCopy", "(J)Lkotlinx/coroutines/internal/LockFreeTaskQueueCore;", "allocateOrGetNextCopy", "close", "()Z", "index", "fillPlaceholder", "(ILjava/lang/Object;)Lkotlinx/coroutines/internal/LockFreeTaskQueueCore;", "isClosed", "R", "Lkotlin/Function1;", "transform", "", "map", "(Lkotlin/jvm/functions/Function1;)Ljava/util/List;", "markFrozen", "()J", "next", "()Lkotlinx/coroutines/internal/LockFreeTaskQueueCore;", "removeFirstOrNull", "()Ljava/lang/Object;", "oldHead", "newHead", "removeSlowPath", "(II)Lkotlinx/coroutines/internal/LockFreeTaskQueueCore;", "I", "isEmpty", "mask", "Z", "getSize", "()I", "size", "Companion", "Placeholder", "kotlinx-coroutines-core"}, m116k = 1, m117mv = {1, 6, 0}, m119xi = 48)
public final class LockFreeTaskQueueCore<E> {
    public static final int ADD_CLOSED = 2;
    public static final int ADD_FROZEN = 1;
    public static final int ADD_SUCCESS = 0;
    public static final int CAPACITY_BITS = 30;
    public static final long CLOSED_MASK = 2305843009213693952L;
    public static final int CLOSED_SHIFT = 61;
    public static final kotlinx.coroutines.internal.LockFreeTaskQueueCore.Companion Companion = null;
    public static final long FROZEN_MASK = 1152921504606846976L;
    public static final int FROZEN_SHIFT = 60;
    public static final long HEAD_MASK = 1073741823;
    public static final int HEAD_SHIFT = 0;
    public static final int INITIAL_CAPACITY = 8;
    public static final int MAX_CAPACITY_MASK = 1073741823;
    public static final int MIN_ADD_SPIN_CAPACITY = 1024;
    public static final kotlinx.coroutines.internal.Symbol REMOVE_FROZEN = null;
    public static final long TAIL_MASK = 1152921503533105152L;
    public static final int TAIL_SHIFT = 30;
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater _next$FU = null;
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicLongFieldUpdater _state$FU = null;
    private volatile /* synthetic */ java.lang.Object _next;
    private volatile /* synthetic */ long _state;
    private /* synthetic */ java.util.concurrent.atomic.AtomicReferenceArray array;
    private final int capacity;
    private final int mask;
    private final boolean singleConsumer;

    /* JADX INFO: compiled from: LockFreeTaskQueue.kt */
    @kotlin.Metadata(m114d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\n\u0010\u0016\u001a\u00020\u0004*\u00020\tJ\u0012\u0010\u0017\u001a\u00020\t*\u00020\t2\u0006\u0010\u0018\u001a\u00020\u0004J\u0012\u0010\u0019\u001a\u00020\t*\u00020\t2\u0006\u0010\u001a\u001a\u00020\u0004JP\u0010\u001b\u001a\u0002H\u001c\"\u0004\b\u0001\u0010\u001c*\u00020\t26\u0010\u001d\u001a2\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u001f\u0012\b\b \u0012\u0004\b\b(!\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u001f\u0012\b\b \u0012\u0004\b\b(\"\u0012\u0004\u0012\u0002H\u001c0\u001eH\u0086\b¢\u0006\u0002\u0010#J\u0015\u0010$\u001a\u00020\t*\u00020\t2\u0006\u0010%\u001a\u00020\tH\u0086\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006&"}, m115d2 = {"Lkotlinx/coroutines/internal/LockFreeTaskQueueCore$Companion;", "", "()V", "ADD_CLOSED", "", "ADD_FROZEN", "ADD_SUCCESS", "CAPACITY_BITS", "CLOSED_MASK", "", "CLOSED_SHIFT", "FROZEN_MASK", "FROZEN_SHIFT", "HEAD_MASK", "HEAD_SHIFT", "INITIAL_CAPACITY", "MAX_CAPACITY_MASK", "MIN_ADD_SPIN_CAPACITY", "REMOVE_FROZEN", "Lkotlinx/coroutines/internal/Symbol;", "TAIL_MASK", "TAIL_SHIFT", "addFailReason", "updateHead", "newHead", "updateTail", "newTail", "withState", "T", "block", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "head", "tail", "(JLkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "wo", "other", "kotlinx-coroutines-core"}, m116k = 1, m117mv = {1, 6, 0}, m119xi = 48)
    public static final class Companion {
        private Companion() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public final int addFailReason(long r5) {
                r4 = this;
                r0 = 2305843009213693952(0x2000000000000000, double:1.4916681462400413E-154)
                long r0 = r0 & r5
                r2 = 0
                int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r0 == 0) goto Lb
                r0 = 2
                goto Lc
            Lb:
                r0 = 1
            Lc:
                return r0
        }

        public final long updateHead(long r6, int r8) {
                r5 = this;
                r0 = 1073741823(0x3fffffff, double:5.304989472E-315)
                long r0 = r5.m138wo(r6, r0)
                long r2 = (long) r8
                r4 = 0
                long r2 = r2 << r4
                long r0 = r0 | r2
                return r0
        }

        public final long updateTail(long r6, int r8) {
                r5 = this;
                r0 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
                long r0 = r5.m138wo(r6, r0)
                long r2 = (long) r8
                r4 = 30
                long r2 = r2 << r4
                long r0 = r0 | r2
                return r0
        }

        public final <T> T withState(long r6, kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super java.lang.Integer, ? extends T> r8) {
                r5 = this;
                r0 = 0
                r1 = 1073741823(0x3fffffff, double:5.304989472E-315)
                long r1 = r1 & r6
                r3 = 0
                long r1 = r1 >> r3
                int r1 = (int) r1
                r2 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
                long r2 = r2 & r6
                r4 = 30
                long r2 = r2 >> r4
                int r2 = (int) r2
                java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
                java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
                java.lang.Object r3 = r8.invoke(r3, r4)
                return r3
        }

        /* JADX INFO: renamed from: wo */
        public final long m138wo(long r3, long r5) {
                r2 = this;
                long r0 = ~r5
                long r0 = r0 & r3
                return r0
        }
    }

    /* JADX INFO: compiled from: LockFreeTaskQueue.kt */
    @kotlin.Metadata(m114d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m115d2 = {"Lkotlinx/coroutines/internal/LockFreeTaskQueueCore$Placeholder;", "", "index", "", "(I)V", "kotlinx-coroutines-core"}, m116k = 1, m117mv = {1, 6, 0}, m119xi = 48)
    public static final class Placeholder {
        public final int index;

        public Placeholder(int r1) {
                r0 = this;
                r0.<init>()
                r0.index = r1
                return
        }
    }

    static {
            kotlinx.coroutines.internal.LockFreeTaskQueueCore$Companion r0 = new kotlinx.coroutines.internal.LockFreeTaskQueueCore$Companion
            r1 = 0
            r0.<init>(r1)
            kotlinx.coroutines.internal.LockFreeTaskQueueCore.Companion = r0
            kotlinx.coroutines.internal.Symbol r0 = new kotlinx.coroutines.internal.Symbol
            java.lang.String r1 = "REMOVE_FROZEN"
            r0.<init>(r1)
            kotlinx.coroutines.internal.LockFreeTaskQueueCore.REMOVE_FROZEN = r0
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            java.lang.String r1 = "_next"
            java.lang.Class<kotlinx.coroutines.internal.LockFreeTaskQueueCore> r2 = kotlinx.coroutines.internal.LockFreeTaskQueueCore.class
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r0, r1)
            kotlinx.coroutines.internal.LockFreeTaskQueueCore._next$FU = r0
            java.lang.String r0 = "_state"
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(r2, r0)
            kotlinx.coroutines.internal.LockFreeTaskQueueCore._state$FU = r0
            return
    }

    public LockFreeTaskQueueCore(int r6, boolean r7) {
            r5 = this;
            r5.<init>()
            r5.capacity = r6
            r5.singleConsumer = r7
            int r0 = r5.capacity
            r1 = 1
            int r0 = r0 - r1
            r5.mask = r0
            r0 = 0
            r5._next = r0
            r2 = 0
            r5._state = r2
            java.util.concurrent.atomic.AtomicReferenceArray r0 = new java.util.concurrent.atomic.AtomicReferenceArray
            int r2 = r5.capacity
            r0.<init>(r2)
            r5.array = r0
            int r0 = r5.mask
            r2 = 1073741823(0x3fffffff, float:1.9999999)
            r3 = 0
            if (r0 > r2) goto L28
            r0 = r1
            goto L29
        L28:
            r0 = r3
        L29:
            java.lang.String r2 = "Check failed."
            if (r0 == 0) goto L44
            int r0 = r5.capacity
            int r4 = r5.mask
            r0 = r0 & r4
            if (r0 != 0) goto L35
            goto L36
        L35:
            r1 = r3
        L36:
            if (r1 == 0) goto L3a
        L39:
            return
        L3a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
        L44:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
    }

    private final kotlinx.coroutines.internal.LockFreeTaskQueueCore<E> allocateNextCopy(long r19) {
            r18 = this;
            r0 = r18
            kotlinx.coroutines.internal.LockFreeTaskQueueCore r1 = new kotlinx.coroutines.internal.LockFreeTaskQueueCore
            int r2 = r0.capacity
            int r2 = r2 * 2
            boolean r3 = r0.singleConsumer
            r1.<init>(r2, r3)
            kotlinx.coroutines.internal.LockFreeTaskQueueCore$Companion r2 = kotlinx.coroutines.internal.LockFreeTaskQueueCore.Companion
            r3 = r19
            r5 = 0
            r6 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r6 = r6 & r3
            r8 = 0
            long r6 = r6 >> r8
            int r6 = (int) r6
            r7 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r7 = r7 & r3
            r9 = 30
            long r7 = r7 >> r9
            int r7 = (int) r7
            r8 = r6
            r9 = r7
            r10 = 0
            r11 = r8
        L27:
            int r12 = r0.mask
            r12 = r12 & r11
            int r13 = r0.mask
            r13 = r13 & r9
            if (r12 == r13) goto L4a
            java.util.concurrent.atomic.AtomicReferenceArray r12 = r0.array
            int r13 = r0.mask
            r13 = r13 & r11
            java.lang.Object r12 = r12.get(r13)
            if (r12 != 0) goto L3f
            kotlinx.coroutines.internal.LockFreeTaskQueueCore$Placeholder r12 = new kotlinx.coroutines.internal.LockFreeTaskQueueCore$Placeholder
            r12.<init>(r11)
        L3f:
            java.util.concurrent.atomic.AtomicReferenceArray r13 = r1.array
            int r14 = r1.mask
            r14 = r14 & r11
            r13.set(r14, r12)
            int r11 = r11 + 1
            goto L27
        L4a:
            kotlinx.coroutines.internal.LockFreeTaskQueueCore$Companion r12 = kotlinx.coroutines.internal.LockFreeTaskQueueCore.Companion
            r13 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            r15 = r2
            r16 = r3
            r2 = r19
            long r12 = r12.m138wo(r2, r13)
            r1._state = r12
            return r1
    }

    private final kotlinx.coroutines.internal.LockFreeTaskQueueCore<E> allocateOrGetNextCopy(long r8) {
            r7 = this;
            r0 = r7
            r1 = 0
        L2:
            java.lang.Object r2 = r0._next
            kotlinx.coroutines.internal.LockFreeTaskQueueCore r2 = (kotlinx.coroutines.internal.LockFreeTaskQueueCore) r2
            r3 = 0
            if (r2 == 0) goto Lb
            return r2
        Lb:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = kotlinx.coroutines.internal.LockFreeTaskQueueCore._next$FU
            r5 = 0
            kotlinx.coroutines.internal.LockFreeTaskQueueCore r6 = r7.allocateNextCopy(r8)
            androidx.concurrent.futures.C0110xc40028dd.m9m(r4, r7, r5, r6)
            goto L2
    }

    private final kotlinx.coroutines.internal.LockFreeTaskQueueCore<E> fillPlaceholder(int r4, E r5) {
            r3 = this;
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r3.array
            int r1 = r3.mask
            r1 = r1 & r4
            java.lang.Object r0 = r0.get(r1)
            boolean r1 = r0 instanceof kotlinx.coroutines.internal.LockFreeTaskQueueCore.Placeholder
            if (r1 == 0) goto L1d
            r1 = r0
            kotlinx.coroutines.internal.LockFreeTaskQueueCore$Placeholder r1 = (kotlinx.coroutines.internal.LockFreeTaskQueueCore.Placeholder) r1
            int r1 = r1.index
            if (r1 != r4) goto L1d
            java.util.concurrent.atomic.AtomicReferenceArray r1 = r3.array
            int r2 = r3.mask
            r2 = r2 & r4
            r1.set(r2, r5)
            return r3
        L1d:
            r1 = 0
            return r1
    }

    private final long markFrozen() {
            r14 = this;
            r6 = r14
            r7 = 0
        L2:
            long r8 = r6._state
            r0 = r8
            r2 = 0
            r3 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r10 = r0 & r3
            r12 = 0
            int r5 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r5 == 0) goto L12
            return r0
        L12:
            long r10 = r0 | r3
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = kotlinx.coroutines.internal.LockFreeTaskQueueCore._state$FU
            r1 = r6
            r2 = r8
            r4 = r10
            boolean r0 = r0.compareAndSet(r1, r2, r4)
            if (r0 == 0) goto L20
            return r10
        L20:
            goto L2
    }

    private final kotlinx.coroutines.internal.LockFreeTaskQueueCore<E> removeSlowPath(int r25, int r26) {
            r24 = this;
            r6 = r24
            r7 = r24
            r8 = 0
        L5:
            long r9 = r7._state
            r11 = 0
            kotlinx.coroutines.internal.LockFreeTaskQueueCore$Companion r12 = kotlinx.coroutines.internal.LockFreeTaskQueueCore.Companion
            r0 = r9
            r13 = r0
            r15 = 0
            r0 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r0 = r0 & r13
            r2 = 0
            long r0 = r0 >> r2
            int r4 = (int) r0
            r0 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r0 = r0 & r13
            r3 = 30
            long r0 = r0 >> r3
            int r5 = (int) r0
            r3 = r4
            r16 = r5
            r17 = 0
            boolean r0 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
            if (r0 == 0) goto L39
            r0 = 0
            r1 = r25
            if (r3 != r1) goto L30
            r2 = 1
        L30:
            if (r2 == 0) goto L33
            goto L3b
        L33:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        L39:
            r1 = r25
        L3b:
            r18 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r18 = r9 & r18
            r20 = 0
            int r0 = (r18 > r20 ? 1 : (r18 == r20 ? 0 : -1))
            if (r0 == 0) goto L4a
            kotlinx.coroutines.internal.LockFreeTaskQueueCore r0 = r24.next()
            return r0
        L4a:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = kotlinx.coroutines.internal.LockFreeTaskQueueCore._state$FU
            kotlinx.coroutines.internal.LockFreeTaskQueueCore$Companion r2 = kotlinx.coroutines.internal.LockFreeTaskQueueCore.Companion
            r18 = r7
            r7 = r26
            long r19 = r2.updateHead(r9, r7)
            r1 = r24
            r21 = r3
            r2 = r9
            r22 = r4
            r23 = r5
            r4 = r19
            boolean r0 = r0.compareAndSet(r1, r2, r4)
            if (r0 == 0) goto L72
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r6.array
            int r1 = r6.mask
            r1 = r21 & r1
            r2 = 0
            r0.set(r1, r2)
            return r2
        L72:
            r7 = r18
            goto L5
    }

    public final int addLast(E r28) {
            r27 = this;
            r6 = r27
            r7 = r28
            r8 = r27
            r9 = 0
        L7:
            long r10 = r8._state
            r12 = 0
            r0 = 3458764513820540928(0x3000000000000000, double:1.727233711018889E-77)
            long r0 = r0 & r10
            r13 = 0
            int r0 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r0 == 0) goto L1b
            kotlinx.coroutines.internal.LockFreeTaskQueueCore$Companion r0 = kotlinx.coroutines.internal.LockFreeTaskQueueCore.Companion
            int r0 = r0.addFailReason(r10)
            return r0
        L1b:
            kotlinx.coroutines.internal.LockFreeTaskQueueCore$Companion r15 = kotlinx.coroutines.internal.LockFreeTaskQueueCore.Companion
            r16 = r10
            r18 = 0
            r0 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r0 = r16 & r0
            r19 = 0
            long r0 = r0 >> r19
            int r4 = (int) r0
            r0 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r0 = r16 & r0
            r2 = 30
            long r0 = r0 >> r2
            int r5 = (int) r0
            r20 = r4
            r2 = r5
            r21 = 0
            int r3 = r6.mask
            int r0 = r2 + 2
            r0 = r0 & r3
            r1 = r20 & r3
            r22 = 1
            if (r0 != r1) goto L47
            return r22
        L47:
            boolean r0 = r6.singleConsumer
            r1 = 1073741823(0x3fffffff, float:1.9999999)
            if (r0 != 0) goto L6a
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r6.array
            r13 = r2 & r3
            java.lang.Object r0 = r0.get(r13)
            if (r0 == 0) goto L6a
            int r0 = r6.capacity
            r13 = 1024(0x400, float:1.435E-42)
            if (r0 < r13) goto L69
            int r0 = r2 - r20
            r0 = r0 & r1
            int r1 = r6.capacity
            int r1 = r1 >> 1
            if (r0 <= r1) goto L68
            goto L69
        L68:
            goto Lad
        L69:
            return r22
        L6a:
            int r0 = r2 + 1
            r13 = r0 & r1
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = kotlinx.coroutines.internal.LockFreeTaskQueueCore._state$FU
            kotlinx.coroutines.internal.LockFreeTaskQueueCore$Companion r1 = kotlinx.coroutines.internal.LockFreeTaskQueueCore.Companion
            long r23 = r1.updateTail(r10, r13)
            r1 = r27
            r14 = r2
            r22 = r3
            r2 = r10
            r25 = r4
            r26 = r5
            r4 = r23
            boolean r0 = r0.compareAndSet(r1, r2, r4)
            if (r0 == 0) goto Lab
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r6.array
            r1 = r14 & r22
            r0.set(r1, r7)
            r0 = r27
        L91:
            long r1 = r0._state
            r3 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r1 = r1 & r3
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L9e
            goto La8
        L9e:
            kotlinx.coroutines.internal.LockFreeTaskQueueCore r1 = r0.next()
            kotlinx.coroutines.internal.LockFreeTaskQueueCore r1 = r1.fillPlaceholder(r14, r7)
            if (r1 != 0) goto La9
        La8:
            return r19
        La9:
            r0 = r1
            goto L91
        Lab:
        Lad:
            goto L7
    }

    public final boolean close() {
            r16 = this;
            r6 = r16
            r7 = 0
        L3:
            long r8 = r6._state
            r0 = r8
            r2 = 0
            r3 = 2305843009213693952(0x2000000000000000, double:1.4916681462400413E-154)
            long r10 = r0 & r3
            r12 = 0
            int r5 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            r10 = 1
            if (r5 == 0) goto L14
            return r10
        L14:
            r14 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r14 = r14 & r0
            int r5 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r5 == 0) goto L1d
            r3 = 0
            return r3
        L1d:
            long r11 = r0 | r3
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = kotlinx.coroutines.internal.LockFreeTaskQueueCore._state$FU
            r1 = r6
            r2 = r8
            r4 = r11
            boolean r0 = r0.compareAndSet(r1, r2, r4)
            if (r0 == 0) goto L2b
            return r10
        L2b:
            goto L3
    }

    public final int getSize() {
            r11 = this;
            kotlinx.coroutines.internal.LockFreeTaskQueueCore$Companion r0 = kotlinx.coroutines.internal.LockFreeTaskQueueCore.Companion
            long r1 = r11._state
            r3 = 0
            r4 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r4 = r4 & r1
            r6 = 0
            long r4 = r4 >> r6
            int r4 = (int) r4
            r5 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r5 = r5 & r1
            r7 = 30
            long r5 = r5 >> r7
            int r5 = (int) r5
            r6 = r4
            r7 = r5
            r8 = 0
            int r9 = r7 - r6
            r10 = 1073741823(0x3fffffff, float:1.9999999)
            r0 = r9 & r10
            return r0
    }

    public final boolean isClosed() {
            r4 = this;
            long r0 = r4._state
            r2 = 2305843009213693952(0x2000000000000000, double:1.4916681462400413E-154)
            long r0 = r0 & r2
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto Ld
            r0 = 1
            goto Le
        Ld:
            r0 = 0
        Le:
            return r0
    }

    public final boolean isEmpty() {
            r10 = this;
            kotlinx.coroutines.internal.LockFreeTaskQueueCore$Companion r0 = kotlinx.coroutines.internal.LockFreeTaskQueueCore.Companion
            long r1 = r10._state
            r3 = 0
            r4 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r4 = r4 & r1
            r6 = 0
            long r4 = r4 >> r6
            int r4 = (int) r4
            r7 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r7 = r7 & r1
            r5 = 30
            long r7 = r7 >> r5
            int r5 = (int) r7
            r7 = r4
            r8 = r5
            r9 = 0
            if (r7 != r8) goto L1c
            r6 = 1
        L1c:
            return r6
    }

    public final <R> java.util.List<R> map(kotlin.jvm.functions.Function1<? super E, ? extends R> r14) {
            r13 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r13.capacity
            r0.<init>(r1)
            kotlinx.coroutines.internal.LockFreeTaskQueueCore$Companion r1 = kotlinx.coroutines.internal.LockFreeTaskQueueCore.Companion
            long r2 = r13._state
            r4 = 0
            r5 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r5 = r5 & r2
            r7 = 0
            long r5 = r5 >> r7
            int r5 = (int) r5
            r6 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r6 = r6 & r2
            r8 = 30
            long r6 = r6 >> r8
            int r6 = (int) r6
            r7 = r5
            r8 = r6
            r9 = 0
            r10 = r7
        L21:
            int r11 = r13.mask
            r11 = r11 & r10
            int r12 = r13.mask
            r12 = r12 & r8
            if (r11 == r12) goto L42
            java.util.concurrent.atomic.AtomicReferenceArray r11 = r13.array
            int r12 = r13.mask
            r12 = r12 & r10
            java.lang.Object r11 = r11.get(r12)
            if (r11 == 0) goto L3f
            boolean r12 = r11 instanceof kotlinx.coroutines.internal.LockFreeTaskQueueCore.Placeholder
            if (r12 != 0) goto L3f
            java.lang.Object r12 = r14.invoke(r11)
            r0.add(r12)
        L3f:
            int r10 = r10 + 1
            goto L21
        L42:
            r1 = r0
            java.util.List r1 = (java.util.List) r1
            return r1
    }

    public final kotlinx.coroutines.internal.LockFreeTaskQueueCore<E> next() {
            r2 = this;
            long r0 = r2.markFrozen()
            kotlinx.coroutines.internal.LockFreeTaskQueueCore r0 = r2.allocateOrGetNextCopy(r0)
            return r0
    }

    public final java.lang.Object removeFirstOrNull() {
            r26 = this;
            r6 = r26
            r7 = r26
            r8 = 0
        L5:
            long r9 = r7._state
            r11 = 0
            r0 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r0 = r0 & r9
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L15
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.internal.LockFreeTaskQueueCore.REMOVE_FROZEN
            return r0
        L15:
            kotlinx.coroutines.internal.LockFreeTaskQueueCore$Companion r12 = kotlinx.coroutines.internal.LockFreeTaskQueueCore.Companion
            r0 = r9
            r13 = r0
            r15 = 0
            r0 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r0 = r0 & r13
            r2 = 0
            long r0 = r0 >> r2
            int r4 = (int) r0
            r0 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r0 = r0 & r13
            r2 = 30
            long r0 = r0 >> r2
            int r5 = (int) r0
            r0 = r4
            r16 = r5
            r2 = r0
            r17 = 0
            int r0 = r6.mask
            r0 = r16 & r0
            int r1 = r6.mask
            r1 = r1 & r2
            r3 = 0
            if (r0 != r1) goto L3c
            return r3
        L3c:
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r6.array
            int r1 = r6.mask
            r1 = r1 & r2
            java.lang.Object r1 = r0.get(r1)
            if (r1 != 0) goto L51
            boolean r0 = r6.singleConsumer
            if (r0 == 0) goto L4c
            return r3
        L4c:
            r22 = r7
            r19 = r8
            goto L8f
        L51:
            boolean r0 = r1 instanceof kotlinx.coroutines.internal.LockFreeTaskQueueCore.Placeholder
            if (r0 == 0) goto L56
            return r3
        L56:
            int r0 = r2 + 1
            r18 = 1073741823(0x3fffffff, float:1.9999999)
            r0 = r0 & r18
            java.util.concurrent.atomic.AtomicLongFieldUpdater r18 = kotlinx.coroutines.internal.LockFreeTaskQueueCore._state$FU
            kotlinx.coroutines.internal.LockFreeTaskQueueCore$Companion r3 = kotlinx.coroutines.internal.LockFreeTaskQueueCore.Companion
            long r20 = r3.updateHead(r9, r0)
            r3 = r0
            r0 = r18
            r18 = r1
            r1 = r26
            r22 = r7
            r19 = r8
            r23 = r11
            r11 = 0
            r7 = r2
            r8 = r3
            r2 = r9
            r24 = r4
            r25 = r5
            r4 = r20
            boolean r0 = r0.compareAndSet(r1, r2, r4)
            if (r0 == 0) goto L8b
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r6.array
            int r1 = r6.mask
            r1 = r1 & r7
            r0.set(r1, r11)
            return r18
        L8b:
            boolean r0 = r6.singleConsumer
            if (r0 != 0) goto L95
        L8f:
            r8 = r19
            r7 = r22
            goto L5
        L95:
            r0 = r26
        L97:
            kotlinx.coroutines.internal.LockFreeTaskQueueCore r1 = r0.removeSlowPath(r7, r8)
            if (r1 != 0) goto L9f
            return r18
        L9f:
            r0 = r1
            goto L97
    }
}
