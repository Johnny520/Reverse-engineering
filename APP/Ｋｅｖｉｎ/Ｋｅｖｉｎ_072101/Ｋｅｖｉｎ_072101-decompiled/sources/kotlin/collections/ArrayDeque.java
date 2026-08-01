package kotlin.collections;

/* JADX INFO: compiled from: ArrayDeque.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0007\u0018\u0000 P*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002:\u0001PB\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005B\u0007\b\u0016¢\u0006\u0002\u0010\u0006B\u0015\b\u0016\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0002\u0010\tJ\u0015\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0016J\u001d\u0010\u0013\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0019J\u001e\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0016J\u0016\u0010\u001a\u001a\u00020\u00142\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0016J\u0013\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00028\u0000¢\u0006\u0002\u0010\u001cJ\u0013\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00028\u0000¢\u0006\u0002\u0010\u001cJ\b\u0010\u001e\u001a\u00020\u0017H\u0016J\u0016\u0010\u001f\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\u0016J\u001e\u0010 \u001a\u00020\u00172\u0006\u0010!\u001a\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0002J\u0010\u0010\"\u001a\u00020\u00172\u0006\u0010#\u001a\u00020\u0004H\u0002J\u0010\u0010$\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0004H\u0002J\u0010\u0010%\u001a\u00020\u00172\u0006\u0010&\u001a\u00020\u0004H\u0002J\u001d\u0010'\u001a\u00020\u00142\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00140)H\u0082\bJ\u000b\u0010*\u001a\u00028\u0000¢\u0006\u0002\u0010+J\r\u0010,\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010+J\u0016\u0010-\u001a\u00028\u00002\u0006\u0010\u0018\u001a\u00020\u0004H\u0096\u0002¢\u0006\u0002\u0010.J\u0010\u0010/\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0004H\u0002J\u0015\u00100\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00028\u0000H\u0016¢\u0006\u0002\u00101J\u0016\u00102\u001a\u00028\u00002\u0006\u0010!\u001a\u00020\u0004H\u0083\b¢\u0006\u0002\u0010.J\u0011\u0010!\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0004H\u0083\bJM\u00103\u001a\u00020\u00172>\u00104\u001a:\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b6\u0012\b\b7\u0012\u0004\b\b(\u000e\u0012\u001b\u0012\u0019\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000b¢\u0006\f\b6\u0012\b\b7\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\u001705H\u0000¢\u0006\u0002\b8J\b\u00109\u001a\u00020\u0014H\u0016J\u000b\u0010:\u001a\u00028\u0000¢\u0006\u0002\u0010+J\u0015\u0010;\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00028\u0000H\u0016¢\u0006\u0002\u00101J\r\u0010<\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010+J\u0010\u0010=\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0004H\u0002J\u0010\u0010>\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0004H\u0002J\u0015\u0010?\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0016J\u0016\u0010@\u001a\u00020\u00142\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0016J\u0015\u0010A\u001a\u00028\u00002\u0006\u0010\u0018\u001a\u00020\u0004H\u0016¢\u0006\u0002\u0010.J\u000b\u0010B\u001a\u00028\u0000¢\u0006\u0002\u0010+J\r\u0010C\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010+J\u000b\u0010D\u001a\u00028\u0000¢\u0006\u0002\u0010+J\r\u0010E\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010+J\u0016\u0010F\u001a\u00020\u00142\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0016J\u001e\u0010G\u001a\u00028\u00002\u0006\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010HJ\u0017\u0010I\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000bH\u0000¢\u0006\u0004\bJ\u0010KJ)\u0010I\u001a\b\u0012\u0004\u0012\u0002HL0\u000b\"\u0004\b\u0001\u0010L2\f\u0010M\u001a\b\u0012\u0004\u0012\u0002HL0\u000bH\u0000¢\u0006\u0004\bJ\u0010NJ\u0015\u0010O\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000bH\u0016¢\u0006\u0002\u0010KJ'\u0010O\u001a\b\u0012\u0004\u0012\u0002HL0\u000b\"\u0004\b\u0001\u0010L2\f\u0010M\u001a\b\u0012\u0004\u0012\u0002HL0\u000bH\u0016¢\u0006\u0002\u0010NR\u0018\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000bX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\rR\u000e\u0010\u000e\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004@RX\u0096\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006Q"}, m115d2 = {"Lkotlin/collections/ArrayDeque;", "E", "Lkotlin/collections/AbstractMutableList;", "initialCapacity", "", "(I)V", "()V", "elements", "", "(Ljava/util/Collection;)V", "elementData", "", "", "[Ljava/lang/Object;", "head", "<set-?>", "size", "getSize", "()I", "add", "", "element", "(Ljava/lang/Object;)Z", "", "index", "(ILjava/lang/Object;)V", "addAll", "addFirst", "(Ljava/lang/Object;)V", "addLast", "clear", "contains", "copyCollectionElements", "internalIndex", "copyElements", "newCapacity", "decremented", "ensureCapacity", "minCapacity", "filterInPlace", "predicate", "Lkotlin/Function1;", "first", "()Ljava/lang/Object;", "firstOrNull", "get", "(I)Ljava/lang/Object;", "incremented", "indexOf", "(Ljava/lang/Object;)I", "internalGet", "internalStructure", "structure", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "internalStructure$kotlin_stdlib", "isEmpty", "last", "lastIndexOf", "lastOrNull", "negativeMod", "positiveMod", "remove", "removeAll", "removeAt", "removeFirst", "removeFirstOrNull", "removeLast", "removeLastOrNull", "retainAll", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "testToArray", "testToArray$kotlin_stdlib", "()[Ljava/lang/Object;", "T", "array", "([Ljava/lang/Object;)[Ljava/lang/Object;", "toArray", "Companion", "kotlin-stdlib"}, m116k = 1, m117mv = {1, 9, 0}, m119xi = 48)
public final class ArrayDeque<E> extends kotlin.collections.AbstractMutableList<E> {
    public static final kotlin.collections.ArrayDeque.Companion Companion = null;
    private static final int defaultMinCapacity = 10;
    private static final java.lang.Object[] emptyElementData = null;
    private static final int maxArraySize = 2147483639;
    private java.lang.Object[] elementData;
    private int head;
    private int size;

    /* JADX INFO: compiled from: ArrayDeque.kt */
    @kotlin.Metadata(m114d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0007\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001d\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004H\u0000¢\u0006\u0002\b\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0018\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0007R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, m115d2 = {"Lkotlin/collections/ArrayDeque$Companion;", "", "()V", "defaultMinCapacity", "", "emptyElementData", "", "[Ljava/lang/Object;", "maxArraySize", "newCapacity", "oldCapacity", "minCapacity", "newCapacity$kotlin_stdlib", "kotlin-stdlib"}, m116k = 1, m117mv = {1, 9, 0}, m119xi = 48)
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

        public final int newCapacity$kotlin_stdlib(int r4, int r5) {
                r3 = this;
                int r0 = r4 >> 1
                int r0 = r0 + r4
                int r1 = r0 - r5
                if (r1 >= 0) goto L8
                r0 = r5
            L8:
                r1 = 2147483639(0x7ffffff7, float:NaN)
                int r2 = r0 - r1
                if (r2 <= 0) goto L15
                if (r5 <= r1) goto L14
                r1 = 2147483647(0x7fffffff, float:NaN)
            L14:
                r0 = r1
            L15:
                return r0
        }
    }

    static {
            kotlin.collections.ArrayDeque$Companion r0 = new kotlin.collections.ArrayDeque$Companion
            r1 = 0
            r0.<init>(r1)
            kotlin.collections.ArrayDeque.Companion = r0
            r0 = 0
            r1 = 0
            java.lang.Object[] r0 = new java.lang.Object[r1]
            kotlin.collections.ArrayDeque.emptyElementData = r0
            return
    }

    public ArrayDeque() {
            r1 = this;
            r1.<init>()
            java.lang.Object[] r0 = kotlin.collections.ArrayDeque.emptyElementData
            r1.elementData = r0
            return
    }

    public ArrayDeque(int r4) {
            r3 = this;
            r3.<init>()
            if (r4 != 0) goto L9
            java.lang.Object[] r0 = kotlin.collections.ArrayDeque.emptyElementData
            goto Ld
        L9:
            if (r4 <= 0) goto L10
            java.lang.Object[] r0 = new java.lang.Object[r4]
        Ld:
            r3.elementData = r0
            return
        L10:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Illegal Capacity: "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r4)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    public ArrayDeque(java.util.Collection<? extends E> r6) {
            r5 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            r5.<init>()
            r0 = r6
            r1 = 0
            r2 = r0
            r3 = 0
            java.lang.Object[] r4 = new java.lang.Object[r3]
            java.lang.Object[] r0 = r2.toArray(r4)
            r5.elementData = r0
            java.lang.Object[] r0 = r5.elementData
            int r0 = r0.length
            r5.size = r0
            java.lang.Object[] r0 = r5.elementData
            int r0 = r0.length
            if (r0 != 0) goto L1f
            r3 = 1
        L1f:
            if (r3 == 0) goto L25
            java.lang.Object[] r0 = kotlin.collections.ArrayDeque.emptyElementData
            r5.elementData = r0
        L25:
            return
    }

    private final void copyCollectionElements(int r6, java.util.Collection<? extends E> r7) {
            r5 = this;
            java.util.Iterator r0 = r7.iterator()
            r1 = r6
            java.lang.Object[] r2 = r5.elementData
            int r2 = r2.length
        L8:
            if (r1 >= r2) goto L1b
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L1b
            java.lang.Object[] r3 = r5.elementData
            java.lang.Object r4 = r0.next()
            r3[r1] = r4
            int r1 = r1 + 1
            goto L8
        L1b:
            r1 = 0
            int r2 = r5.head
        L1e:
            if (r1 >= r2) goto L31
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L31
            java.lang.Object[] r3 = r5.elementData
            java.lang.Object r4 = r0.next()
            r3[r1] = r4
            int r1 = r1 + 1
            goto L1e
        L31:
            int r1 = r5.size()
            int r2 = r7.size()
            int r1 = r1 + r2
            r5.size = r1
            return
    }

    private final void copyElements(int r6) {
            r5 = this;
            java.lang.Object[] r0 = new java.lang.Object[r6]
            java.lang.Object[] r1 = r5.elementData
            int r2 = r5.head
            java.lang.Object[] r3 = r5.elementData
            int r3 = r3.length
            r4 = 0
            kotlin.collections.ArraysKt.copyInto(r1, r0, r4, r2, r3)
            java.lang.Object[] r1 = r5.elementData
            java.lang.Object[] r2 = r5.elementData
            int r2 = r2.length
            int r3 = r5.head
            int r2 = r2 - r3
            int r3 = r5.head
            kotlin.collections.ArraysKt.copyInto(r1, r0, r2, r4, r3)
            r5.head = r4
            r5.elementData = r0
            return
    }

    private final int decremented(int r2) {
            r1 = this;
            if (r2 != 0) goto L9
            java.lang.Object[] r0 = r1.elementData
            int r0 = kotlin.collections.ArraysKt.getLastIndex(r0)
            goto Lb
        L9:
            int r0 = r2 + (-1)
        Lb:
            return r0
    }

    private final void ensureCapacity(int r3) {
            r2 = this;
            if (r3 < 0) goto L26
            java.lang.Object[] r0 = r2.elementData
            int r0 = r0.length
            if (r3 > r0) goto L8
            return
        L8:
            java.lang.Object[] r0 = r2.elementData
            java.lang.Object[] r1 = kotlin.collections.ArrayDeque.emptyElementData
            if (r0 != r1) goto L19
            r0 = 10
            int r0 = kotlin.ranges.RangesKt.coerceAtLeast(r3, r0)
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r2.elementData = r0
            return
        L19:
            kotlin.collections.ArrayDeque$Companion r0 = kotlin.collections.ArrayDeque.Companion
            java.lang.Object[] r1 = r2.elementData
            int r1 = r1.length
            int r0 = r0.newCapacity$kotlin_stdlib(r1, r3)
            r2.copyElements(r0)
            return
        L26:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Deque is too big."
            r0.<init>(r1)
            throw r0
    }

    private final boolean filterInPlace(kotlin.jvm.functions.Function1<? super E, java.lang.Boolean> r11) {
            r10 = this;
            r0 = 0
            boolean r1 = r10.isEmpty()
            r2 = 0
            if (r1 != 0) goto La9
            java.lang.Object[] r1 = r10.elementData
            int r1 = r1.length
            if (r1 != 0) goto Lf
            r1 = 1
            goto L10
        Lf:
            r1 = r2
        L10:
            if (r1 == 0) goto L14
            goto La9
        L14:
            int r1 = r10.head
            int r2 = r10.size()
            int r1 = r1 + r2
            int r1 = r10.positiveMod(r1)
            int r2 = r10.head
            r3 = 0
            int r4 = r10.head
            r5 = 0
            if (r4 >= r1) goto L4d
            int r4 = r10.head
        L29:
            if (r4 >= r1) goto L47
            java.lang.Object[] r6 = r10.elementData
            r6 = r6[r4]
            java.lang.Object r7 = r11.invoke(r6)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L43
            java.lang.Object[] r7 = r10.elementData
            int r8 = r2 + 1
            r7[r2] = r6
            r2 = r8
            goto L44
        L43:
            r3 = 1
        L44:
            int r4 = r4 + 1
            goto L29
        L47:
            java.lang.Object[] r4 = r10.elementData
            kotlin.collections.ArraysKt.fill(r4, r5, r2, r1)
            goto L9c
        L4d:
            int r4 = r10.head
            java.lang.Object[] r6 = r10.elementData
            int r6 = r6.length
        L52:
            if (r4 >= r6) goto L74
            java.lang.Object[] r7 = r10.elementData
            r7 = r7[r4]
            java.lang.Object[] r8 = r10.elementData
            r8[r4] = r5
            java.lang.Object r8 = r11.invoke(r7)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L70
            java.lang.Object[] r8 = r10.elementData
            int r9 = r2 + 1
            r8[r2] = r7
            r2 = r9
            goto L71
        L70:
            r3 = 1
        L71:
            int r4 = r4 + 1
            goto L52
        L74:
            int r2 = r10.positiveMod(r2)
            r4 = 0
        L79:
            if (r4 >= r1) goto L9c
            java.lang.Object[] r6 = r10.elementData
            r6 = r6[r4]
            java.lang.Object[] r7 = r10.elementData
            r7[r4] = r5
            java.lang.Object r7 = r11.invoke(r6)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L98
            java.lang.Object[] r7 = r10.elementData
            r7[r2] = r6
            int r2 = r10.incremented(r2)
            goto L99
        L98:
            r3 = 1
        L99:
            int r4 = r4 + 1
            goto L79
        L9c:
            if (r3 == 0) goto La8
            int r4 = r10.head
            int r4 = r2 - r4
            int r4 = r10.negativeMod(r4)
            r10.size = r4
        La8:
            return r3
        La9:
            return r2
    }

    private final int incremented(int r2) {
            r1 = this;
            java.lang.Object[] r0 = r1.elementData
            int r0 = kotlin.collections.ArraysKt.getLastIndex(r0)
            if (r2 != r0) goto La
            r0 = 0
            goto Lc
        La:
            int r0 = r2 + 1
        Lc:
            return r0
    }

    private final E internalGet(int r2) {
            r1 = this;
            java.lang.Object[] r0 = r1.elementData
            r0 = r0[r2]
            return r0
    }

    private final int internalIndex(int r2) {
            r1 = this;
            int r0 = r1.head
            int r0 = r0 + r2
            int r0 = r1.positiveMod(r0)
            return r0
    }

    private final int negativeMod(int r2) {
            r1 = this;
            if (r2 >= 0) goto L7
            java.lang.Object[] r0 = r1.elementData
            int r0 = r0.length
            int r0 = r0 + r2
            goto L8
        L7:
            r0 = r2
        L8:
            return r0
    }

    private final int positiveMod(int r2) {
            r1 = this;
            java.lang.Object[] r0 = r1.elementData
            int r0 = r0.length
            if (r2 < r0) goto Lb
            java.lang.Object[] r0 = r1.elementData
            int r0 = r0.length
            int r0 = r2 - r0
            goto Lc
        Lb:
            r0 = r2
        Lc:
            return r0
    }

    @Override // kotlin.collections.AbstractMutableList, java.util.AbstractList, java.util.List
    public void add(int r11, E r12) {
            r10 = this;
            kotlin.collections.AbstractList$Companion r0 = kotlin.collections.AbstractList.Companion
            int r1 = r10.size()
            r0.checkPositionIndex$kotlin_stdlib(r11, r1)
            int r0 = r10.size()
            if (r11 != r0) goto L13
            r10.addLast(r12)
            return
        L13:
            if (r11 != 0) goto L19
            r10.addFirst(r12)
            return
        L19:
            int r0 = r10.size()
            r1 = 1
            int r0 = r0 + r1
            r10.ensureCapacity(r0)
            int r0 = r10.head
            int r0 = r0 + r11
            int r0 = r10.positiveMod(r0)
            int r2 = r10.size()
            int r2 = r2 + r1
            int r2 = r2 >> r1
            r3 = 0
            if (r11 >= r2) goto L84
            int r2 = r10.decremented(r0)
            int r4 = r10.head
            int r4 = r10.decremented(r4)
            int r5 = r10.head
            if (r2 < r5) goto L59
            java.lang.Object[] r3 = r10.elementData
            java.lang.Object[] r5 = r10.elementData
            int r6 = r10.head
            r5 = r5[r6]
            r3[r4] = r5
            java.lang.Object[] r3 = r10.elementData
            java.lang.Object[] r5 = r10.elementData
            int r6 = r10.head
            int r7 = r10.head
            int r7 = r7 + r1
            int r8 = r2 + 1
            kotlin.collections.ArraysKt.copyInto(r3, r5, r6, r7, r8)
            goto L7d
        L59:
            java.lang.Object[] r5 = r10.elementData
            java.lang.Object[] r6 = r10.elementData
            int r7 = r10.head
            int r7 = r7 - r1
            int r8 = r10.head
            java.lang.Object[] r9 = r10.elementData
            int r9 = r9.length
            kotlin.collections.ArraysKt.copyInto(r5, r6, r7, r8, r9)
            java.lang.Object[] r5 = r10.elementData
            java.lang.Object[] r6 = r10.elementData
            int r6 = r6.length
            int r6 = r6 - r1
            java.lang.Object[] r7 = r10.elementData
            r7 = r7[r3]
            r5[r6] = r7
            java.lang.Object[] r5 = r10.elementData
            java.lang.Object[] r6 = r10.elementData
            int r7 = r2 + 1
            kotlin.collections.ArraysKt.copyInto(r5, r6, r3, r1, r7)
        L7d:
            java.lang.Object[] r3 = r10.elementData
            r3[r2] = r12
            r10.head = r4
            goto Lbf
        L84:
            int r2 = r10.head
            int r4 = r10.size()
            int r2 = r2 + r4
            int r2 = r10.positiveMod(r2)
            if (r0 >= r2) goto L9b
            java.lang.Object[] r3 = r10.elementData
            java.lang.Object[] r4 = r10.elementData
            int r5 = r0 + 1
            kotlin.collections.ArraysKt.copyInto(r3, r4, r5, r0, r2)
            goto Lbb
        L9b:
            java.lang.Object[] r4 = r10.elementData
            java.lang.Object[] r5 = r10.elementData
            kotlin.collections.ArraysKt.copyInto(r4, r5, r1, r3, r2)
            java.lang.Object[] r4 = r10.elementData
            java.lang.Object[] r5 = r10.elementData
            java.lang.Object[] r6 = r10.elementData
            int r6 = r6.length
            int r6 = r6 - r1
            r5 = r5[r6]
            r4[r3] = r5
            java.lang.Object[] r3 = r10.elementData
            java.lang.Object[] r4 = r10.elementData
            int r5 = r0 + 1
            java.lang.Object[] r6 = r10.elementData
            int r6 = r6.length
            int r6 = r6 - r1
            kotlin.collections.ArraysKt.copyInto(r3, r4, r5, r0, r6)
        Lbb:
            java.lang.Object[] r3 = r10.elementData
            r3[r0] = r12
        Lbf:
            int r2 = r10.size()
            int r2 = r2 + r1
            r10.size = r2
            return
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E r2) {
            r1 = this;
            r1.addLast(r2)
            r0 = 1
            return r0
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int r13, java.util.Collection<? extends E> r14) {
            r12 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            kotlin.collections.AbstractList$Companion r0 = kotlin.collections.AbstractList.Companion
            int r1 = r12.size()
            r0.checkPositionIndex$kotlin_stdlib(r13, r1)
            boolean r0 = r14.isEmpty()
            r1 = 0
            if (r0 == 0) goto L16
            return r1
        L16:
            int r0 = r12.size()
            if (r13 != r0) goto L21
            boolean r0 = r12.addAll(r14)
            return r0
        L21:
            int r0 = r12.size()
            int r2 = r14.size()
            int r0 = r0 + r2
            r12.ensureCapacity(r0)
            int r0 = r12.head
            int r2 = r12.size()
            int r0 = r0 + r2
            int r0 = r12.positiveMod(r0)
            int r2 = r12.head
            int r2 = r2 + r13
            int r2 = r12.positiveMod(r2)
            int r3 = r14.size()
            int r4 = r12.size()
            r5 = 1
            int r4 = r4 + r5
            int r4 = r4 >> r5
            if (r13 >= r4) goto Lc7
            int r4 = r12.head
            int r4 = r4 - r3
            int r6 = r12.head
            if (r2 < r6) goto L8e
            if (r4 < 0) goto L5f
            java.lang.Object[] r1 = r12.elementData
            java.lang.Object[] r6 = r12.elementData
            int r7 = r12.head
            kotlin.collections.ArraysKt.copyInto(r1, r6, r4, r7, r2)
            goto Lba
        L5f:
            java.lang.Object[] r6 = r12.elementData
            int r6 = r6.length
            int r4 = r4 + r6
            int r6 = r12.head
            int r6 = r2 - r6
            java.lang.Object[] r7 = r12.elementData
            int r7 = r7.length
            int r7 = r7 - r4
            if (r7 < r6) goto L77
            java.lang.Object[] r1 = r12.elementData
            java.lang.Object[] r8 = r12.elementData
            int r9 = r12.head
            kotlin.collections.ArraysKt.copyInto(r1, r8, r4, r9, r2)
            goto Lba
        L77:
            java.lang.Object[] r8 = r12.elementData
            java.lang.Object[] r9 = r12.elementData
            int r10 = r12.head
            int r11 = r12.head
            int r11 = r11 + r7
            kotlin.collections.ArraysKt.copyInto(r8, r9, r4, r10, r11)
            java.lang.Object[] r8 = r12.elementData
            java.lang.Object[] r9 = r12.elementData
            int r10 = r12.head
            int r10 = r10 + r7
            kotlin.collections.ArraysKt.copyInto(r8, r9, r1, r10, r2)
            goto Lba
        L8e:
            java.lang.Object[] r6 = r12.elementData
            java.lang.Object[] r7 = r12.elementData
            int r8 = r12.head
            java.lang.Object[] r9 = r12.elementData
            int r9 = r9.length
            kotlin.collections.ArraysKt.copyInto(r6, r7, r4, r8, r9)
            if (r3 < r2) goto La8
            java.lang.Object[] r6 = r12.elementData
            java.lang.Object[] r7 = r12.elementData
            java.lang.Object[] r8 = r12.elementData
            int r8 = r8.length
            int r8 = r8 - r3
            kotlin.collections.ArraysKt.copyInto(r6, r7, r8, r1, r2)
            goto Lba
        La8:
            java.lang.Object[] r6 = r12.elementData
            java.lang.Object[] r7 = r12.elementData
            java.lang.Object[] r8 = r12.elementData
            int r8 = r8.length
            int r8 = r8 - r3
            kotlin.collections.ArraysKt.copyInto(r6, r7, r8, r1, r3)
            java.lang.Object[] r6 = r12.elementData
            java.lang.Object[] r7 = r12.elementData
            kotlin.collections.ArraysKt.copyInto(r6, r7, r1, r3, r2)
        Lba:
            r12.head = r4
            int r1 = r2 - r3
            int r1 = r12.negativeMod(r1)
            r12.copyCollectionElements(r1, r14)
            goto L13d
        Lc7:
            int r4 = r2 + r3
            if (r2 >= r0) goto L105
            int r6 = r0 + r3
            java.lang.Object[] r7 = r12.elementData
            int r7 = r7.length
            if (r6 > r7) goto Lda
            java.lang.Object[] r1 = r12.elementData
            java.lang.Object[] r6 = r12.elementData
            kotlin.collections.ArraysKt.copyInto(r1, r6, r4, r2, r0)
            goto L13a
        Lda:
            java.lang.Object[] r6 = r12.elementData
            int r6 = r6.length
            if (r4 < r6) goto Lec
            java.lang.Object[] r1 = r12.elementData
            java.lang.Object[] r6 = r12.elementData
            java.lang.Object[] r7 = r12.elementData
            int r7 = r7.length
            int r7 = r4 - r7
            kotlin.collections.ArraysKt.copyInto(r1, r6, r7, r2, r0)
            goto L13a
        Lec:
            int r6 = r0 + r3
            java.lang.Object[] r7 = r12.elementData
            int r7 = r7.length
            int r6 = r6 - r7
            java.lang.Object[] r7 = r12.elementData
            java.lang.Object[] r8 = r12.elementData
            int r9 = r0 - r6
            kotlin.collections.ArraysKt.copyInto(r7, r8, r1, r9, r0)
            java.lang.Object[] r1 = r12.elementData
            java.lang.Object[] r7 = r12.elementData
            int r8 = r0 - r6
            kotlin.collections.ArraysKt.copyInto(r1, r7, r4, r2, r8)
            goto L13a
        L105:
            java.lang.Object[] r6 = r12.elementData
            java.lang.Object[] r7 = r12.elementData
            kotlin.collections.ArraysKt.copyInto(r6, r7, r3, r1, r0)
            java.lang.Object[] r6 = r12.elementData
            int r6 = r6.length
            if (r4 < r6) goto L121
            java.lang.Object[] r1 = r12.elementData
            java.lang.Object[] r6 = r12.elementData
            java.lang.Object[] r7 = r12.elementData
            int r7 = r7.length
            int r7 = r4 - r7
            java.lang.Object[] r8 = r12.elementData
            int r8 = r8.length
            kotlin.collections.ArraysKt.copyInto(r1, r6, r7, r2, r8)
            goto L13a
        L121:
            java.lang.Object[] r6 = r12.elementData
            java.lang.Object[] r7 = r12.elementData
            java.lang.Object[] r8 = r12.elementData
            int r8 = r8.length
            int r8 = r8 - r3
            java.lang.Object[] r9 = r12.elementData
            int r9 = r9.length
            kotlin.collections.ArraysKt.copyInto(r6, r7, r1, r8, r9)
            java.lang.Object[] r1 = r12.elementData
            java.lang.Object[] r6 = r12.elementData
            java.lang.Object[] r7 = r12.elementData
            int r7 = r7.length
            int r7 = r7 - r3
            kotlin.collections.ArraysKt.copyInto(r1, r6, r4, r2, r7)
        L13a:
            r12.copyCollectionElements(r2, r14)
        L13d:
            return r5
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(java.util.Collection<? extends E> r3) {
            r2 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto Ld
            r0 = 0
            return r0
        Ld:
            int r0 = r2.size()
            int r1 = r3.size()
            int r0 = r0 + r1
            r2.ensureCapacity(r0)
            int r0 = r2.head
            int r1 = r2.size()
            int r0 = r0 + r1
            int r0 = r2.positiveMod(r0)
            r2.copyCollectionElements(r0, r3)
            r0 = 1
            return r0
    }

    public final void addFirst(E r3) {
            r2 = this;
            int r0 = r2.size()
            int r0 = r0 + 1
            r2.ensureCapacity(r0)
            int r0 = r2.head
            int r0 = r2.decremented(r0)
            r2.head = r0
            java.lang.Object[] r0 = r2.elementData
            int r1 = r2.head
            r0[r1] = r3
            int r0 = r2.size()
            int r0 = r0 + 1
            r2.size = r0
            return
    }

    public final void addLast(E r4) {
            r3 = this;
            int r0 = r3.size()
            int r0 = r0 + 1
            r3.ensureCapacity(r0)
            java.lang.Object[] r0 = r3.elementData
            int r1 = r3.head
            int r2 = r3.size()
            int r1 = r1 + r2
            int r1 = r3.positiveMod(r1)
            r0[r1] = r4
            int r0 = r3.size()
            int r0 = r0 + 1
            r3.size = r0
            return
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
            r6 = this;
            int r0 = r6.head
            int r1 = r6.size()
            int r0 = r0 + r1
            int r0 = r6.positiveMod(r0)
            int r1 = r6.head
            r2 = 0
            r3 = 0
            if (r1 >= r0) goto L19
            java.lang.Object[] r1 = r6.elementData
            int r4 = r6.head
            kotlin.collections.ArraysKt.fill(r1, r3, r4, r0)
            goto L31
        L19:
            r1 = r6
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L31
            java.lang.Object[] r1 = r6.elementData
            int r4 = r6.head
            java.lang.Object[] r5 = r6.elementData
            int r5 = r5.length
            kotlin.collections.ArraysKt.fill(r1, r3, r4, r5)
            java.lang.Object[] r1 = r6.elementData
            kotlin.collections.ArraysKt.fill(r1, r3, r2, r0)
        L31:
            r6.head = r2
            r6.size = r2
            return
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(java.lang.Object r3) {
            r2 = this;
            int r0 = r2.indexOf(r3)
            r1 = -1
            if (r0 == r1) goto L9
            r0 = 1
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    public final E first() {
            r2 = this;
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto Ld
            java.lang.Object[] r0 = r2.elementData
            int r1 = r2.head
            r0 = r0[r1]
            return r0
        Ld:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            java.lang.String r1 = "ArrayDeque is empty."
            r0.<init>(r1)
            throw r0
    }

    public final E firstOrNull() {
            r2 = this;
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L8
            r0 = 0
            goto Le
        L8:
            java.lang.Object[] r0 = r2.elementData
            int r1 = r2.head
            r0 = r0[r1]
        Le:
            return r0
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int r3) {
            r2 = this;
            kotlin.collections.AbstractList$Companion r0 = kotlin.collections.AbstractList.Companion
            int r1 = r2.size()
            r0.checkElementIndex$kotlin_stdlib(r3, r1)
            java.lang.Object[] r0 = r2.elementData
            int r1 = r2.head
            int r1 = r1 + r3
            int r1 = r2.positiveMod(r1)
            r0 = r0[r1]
            return r0
    }

    @Override // kotlin.collections.AbstractMutableList
    public int getSize() {
            r1 = this;
            int r0 = r1.size
            return r0
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(java.lang.Object r5) {
            r4 = this;
            int r0 = r4.head
            int r1 = r4.size()
            int r0 = r0 + r1
            int r0 = r4.positiveMod(r0)
            int r1 = r4.head
            if (r1 >= r0) goto L25
            int r1 = r4.head
        L11:
            if (r1 >= r0) goto L5a
            java.lang.Object[] r2 = r4.elementData
            r2 = r2[r1]
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r5, r2)
            if (r2 == 0) goto L22
            int r2 = r4.head
            int r2 = r1 - r2
            return r2
        L22:
            int r1 = r1 + 1
            goto L11
        L25:
            int r1 = r4.head
            if (r1 < r0) goto L5a
            int r1 = r4.head
            java.lang.Object[] r2 = r4.elementData
            int r2 = r2.length
        L2e:
            if (r1 >= r2) goto L42
            java.lang.Object[] r3 = r4.elementData
            r3 = r3[r1]
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r5, r3)
            if (r3 == 0) goto L3f
            int r2 = r4.head
            int r2 = r1 - r2
            return r2
        L3f:
            int r1 = r1 + 1
            goto L2e
        L42:
            r1 = 0
        L43:
            if (r1 >= r0) goto L5a
            java.lang.Object[] r2 = r4.elementData
            r2 = r2[r1]
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r5, r2)
            if (r2 == 0) goto L57
            java.lang.Object[] r2 = r4.elementData
            int r2 = r2.length
            int r2 = r2 + r1
            int r3 = r4.head
            int r2 = r2 - r3
            return r2
        L57:
            int r1 = r1 + 1
            goto L43
        L5a:
            r1 = -1
            return r1
    }

    public final void internalStructure$kotlin_stdlib(kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super java.lang.Object[], kotlin.Unit> r5) {
            r4 = this;
            java.lang.String r0 = "structure"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            int r0 = r4.head
            int r1 = r4.size()
            int r0 = r0 + r1
            int r0 = r4.positiveMod(r0)
            boolean r1 = r4.isEmpty()
            if (r1 != 0) goto L22
            int r1 = r4.head
            if (r1 >= r0) goto L1b
            goto L22
        L1b:
            int r1 = r4.head
            java.lang.Object[] r2 = r4.elementData
            int r2 = r2.length
            int r1 = r1 - r2
            goto L24
        L22:
            int r1 = r4.head
        L24:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            java.lang.Object[] r3 = r4.toArray()
            r5.invoke(r2, r3)
            return
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
            r1 = this;
            int r0 = r1.size()
            if (r0 != 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    public final E last() {
            r3 = this;
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L19
            java.lang.Object[] r0 = r3.elementData
            int r1 = r3.head
            r2 = r3
            java.util.List r2 = (java.util.List) r2
            int r2 = kotlin.collections.CollectionsKt.getLastIndex(r2)
            int r1 = r1 + r2
            int r1 = r3.positiveMod(r1)
            r0 = r0[r1]
            return r0
        L19:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            java.lang.String r1 = "ArrayDeque is empty."
            r0.<init>(r1)
            throw r0
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(java.lang.Object r6) {
            r5 = this;
            int r0 = r5.head
            int r1 = r5.size()
            int r0 = r0 + r1
            int r0 = r5.positiveMod(r0)
            int r1 = r5.head
            r2 = -1
            if (r1 >= r0) goto L2a
            int r1 = r0 + (-1)
            int r3 = r5.head
            if (r3 > r1) goto L65
        L16:
            java.lang.Object[] r4 = r5.elementData
            r4 = r4[r1]
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual(r6, r4)
            if (r4 == 0) goto L25
            int r2 = r5.head
            int r2 = r1 - r2
            return r2
        L25:
            if (r1 == r3) goto L65
            int r1 = r1 + (-1)
            goto L16
        L2a:
            int r1 = r5.head
            if (r1 <= r0) goto L65
            int r1 = r0 + (-1)
        L30:
            if (r2 >= r1) goto L47
            java.lang.Object[] r3 = r5.elementData
            r3 = r3[r1]
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r6, r3)
            if (r3 == 0) goto L44
            java.lang.Object[] r2 = r5.elementData
            int r2 = r2.length
            int r2 = r2 + r1
            int r3 = r5.head
            int r2 = r2 - r3
            return r2
        L44:
            int r1 = r1 + (-1)
            goto L30
        L47:
            java.lang.Object[] r1 = r5.elementData
            int r1 = kotlin.collections.ArraysKt.getLastIndex(r1)
            int r3 = r5.head
            if (r3 > r1) goto L65
        L51:
            java.lang.Object[] r4 = r5.elementData
            r4 = r4[r1]
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual(r6, r4)
            if (r4 == 0) goto L60
            int r2 = r5.head
            int r2 = r1 - r2
            return r2
        L60:
            if (r1 == r3) goto L65
            int r1 = r1 + (-1)
            goto L51
        L65:
            return r2
    }

    public final E lastOrNull() {
            r3 = this;
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L8
            r0 = 0
            goto L1a
        L8:
            java.lang.Object[] r0 = r3.elementData
            int r1 = r3.head
            r2 = r3
            java.util.List r2 = (java.util.List) r2
            int r2 = kotlin.collections.CollectionsKt.getLastIndex(r2)
            int r1 = r1 + r2
            int r1 = r3.positiveMod(r1)
            r0 = r0[r1]
        L1a:
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(java.lang.Object r3) {
            r2 = this;
            int r0 = r2.indexOf(r3)
            r1 = -1
            if (r0 != r1) goto L9
            r1 = 0
            return r1
        L9:
            r2.remove(r0)
            r1 = 1
            return r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(java.util.Collection<? extends java.lang.Object> r14) {
            r13 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            r0 = r13
            r1 = 0
            boolean r2 = r0.isEmpty()
            r3 = 0
            if (r2 != 0) goto La9
            java.lang.Object[] r2 = r0.elementData
            int r2 = r2.length
            if (r2 != 0) goto L15
            r2 = 1
            goto L16
        L15:
            r2 = r3
        L16:
            if (r2 == 0) goto L1a
            goto La9
        L1a:
            int r2 = r0.head
            int r3 = r0.size()
            int r2 = r2 + r3
            int r2 = r0.positiveMod(r2)
            int r3 = r0.head
            r4 = 0
            int r5 = r0.head
            r6 = 0
            if (r5 >= r2) goto L52
            int r5 = r0.head
        L2f:
            if (r5 >= r2) goto L49
            java.lang.Object[] r7 = r0.elementData
            r7 = r7[r5]
            r8 = r7
            r9 = 0
            boolean r10 = r14.contains(r8)
            if (r10 != 0) goto L45
            java.lang.Object[] r8 = r0.elementData
            int r9 = r3 + 1
            r8[r3] = r7
            r3 = r9
            goto L46
        L45:
            r4 = 1
        L46:
            int r5 = r5 + 1
            goto L2f
        L49:
            java.lang.Object[] r5 = r0.elementData
            kotlin.collections.ArraysKt.fill(r5, r6, r3, r2)
            r12 = r4
            r4 = r3
            r3 = r12
            goto L9c
        L52:
            int r5 = r0.head
            java.lang.Object[] r7 = r0.elementData
            int r7 = r7.length
        L57:
            if (r5 >= r7) goto L75
            java.lang.Object[] r8 = r0.elementData
            r8 = r8[r5]
            java.lang.Object[] r9 = r0.elementData
            r9[r5] = r6
            r9 = r8
            r10 = 0
            boolean r11 = r14.contains(r9)
            if (r11 != 0) goto L71
            java.lang.Object[] r9 = r0.elementData
            int r10 = r3 + 1
            r9[r3] = r8
            r3 = r10
            goto L72
        L71:
            r4 = 1
        L72:
            int r5 = r5 + 1
            goto L57
        L75:
            int r3 = r0.positiveMod(r3)
            r5 = 0
        L7a:
            if (r5 >= r2) goto L99
            java.lang.Object[] r7 = r0.elementData
            r7 = r7[r5]
            java.lang.Object[] r8 = r0.elementData
            r8[r5] = r6
            r8 = r7
            r9 = 0
            boolean r10 = r14.contains(r8)
            if (r10 != 0) goto L95
            java.lang.Object[] r8 = r0.elementData
            r8[r3] = r7
            int r3 = r0.incremented(r3)
            goto L96
        L95:
            r4 = 1
        L96:
            int r5 = r5 + 1
            goto L7a
        L99:
            r12 = r4
            r4 = r3
            r3 = r12
        L9c:
            if (r3 == 0) goto La8
            int r5 = r0.head
            int r5 = r4 - r5
            int r5 = r0.negativeMod(r5)
            r0.size = r5
        La8:
            goto Laa
        La9:
        Laa:
            return r3
    }

    @Override // kotlin.collections.AbstractMutableList
    public E removeAt(int r11) {
            r10 = this;
            kotlin.collections.AbstractList$Companion r0 = kotlin.collections.AbstractList.Companion
            int r1 = r10.size()
            r0.checkElementIndex$kotlin_stdlib(r11, r1)
            r0 = r10
            java.util.List r0 = (java.util.List) r0
            int r0 = kotlin.collections.CollectionsKt.getLastIndex(r0)
            if (r11 != r0) goto L17
            java.lang.Object r0 = r10.removeLast()
            return r0
        L17:
            if (r11 != 0) goto L1e
            java.lang.Object r0 = r10.removeFirst()
            return r0
        L1e:
            int r0 = r10.head
            int r0 = r0 + r11
            int r0 = r10.positiveMod(r0)
            java.lang.Object[] r1 = r10.elementData
            r1 = r1[r0]
            int r2 = r10.size()
            r3 = 1
            int r2 = r2 >> r3
            r4 = 0
            r5 = 0
            if (r11 >= r2) goto L76
            int r2 = r10.head
            if (r0 < r2) goto L44
            java.lang.Object[] r2 = r10.elementData
            java.lang.Object[] r5 = r10.elementData
            int r6 = r10.head
            int r6 = r6 + r3
            int r7 = r10.head
            kotlin.collections.ArraysKt.copyInto(r2, r5, r6, r7, r0)
            goto L67
        L44:
            java.lang.Object[] r2 = r10.elementData
            java.lang.Object[] r6 = r10.elementData
            kotlin.collections.ArraysKt.copyInto(r2, r6, r3, r5, r0)
            java.lang.Object[] r2 = r10.elementData
            java.lang.Object[] r6 = r10.elementData
            java.lang.Object[] r7 = r10.elementData
            int r7 = r7.length
            int r7 = r7 - r3
            r6 = r6[r7]
            r2[r5] = r6
            java.lang.Object[] r2 = r10.elementData
            java.lang.Object[] r5 = r10.elementData
            int r6 = r10.head
            int r6 = r6 + r3
            int r7 = r10.head
            java.lang.Object[] r8 = r10.elementData
            int r8 = r8.length
            int r8 = r8 - r3
            kotlin.collections.ArraysKt.copyInto(r2, r5, r6, r7, r8)
        L67:
            java.lang.Object[] r2 = r10.elementData
            int r5 = r10.head
            r2[r5] = r4
            int r2 = r10.head
            int r2 = r10.incremented(r2)
            r10.head = r2
            goto Lb7
        L76:
            int r2 = r10.head
            r6 = r10
            java.util.List r6 = (java.util.List) r6
            int r6 = kotlin.collections.CollectionsKt.getLastIndex(r6)
            int r2 = r2 + r6
            int r2 = r10.positiveMod(r2)
            if (r0 > r2) goto L92
            java.lang.Object[] r5 = r10.elementData
            java.lang.Object[] r6 = r10.elementData
            int r7 = r0 + 1
            int r8 = r2 + 1
            kotlin.collections.ArraysKt.copyInto(r5, r6, r0, r7, r8)
            goto Lb3
        L92:
            java.lang.Object[] r6 = r10.elementData
            java.lang.Object[] r7 = r10.elementData
            int r8 = r0 + 1
            java.lang.Object[] r9 = r10.elementData
            int r9 = r9.length
            kotlin.collections.ArraysKt.copyInto(r6, r7, r0, r8, r9)
            java.lang.Object[] r6 = r10.elementData
            java.lang.Object[] r7 = r10.elementData
            int r7 = r7.length
            int r7 = r7 - r3
            java.lang.Object[] r8 = r10.elementData
            r8 = r8[r5]
            r6[r7] = r8
            java.lang.Object[] r6 = r10.elementData
            java.lang.Object[] r7 = r10.elementData
            int r8 = r2 + 1
            kotlin.collections.ArraysKt.copyInto(r6, r7, r5, r3, r8)
        Lb3:
            java.lang.Object[] r5 = r10.elementData
            r5[r2] = r4
        Lb7:
            int r2 = r10.size()
            int r2 = r2 - r3
            r10.size = r2
            return r1
    }

    public final E removeFirst() {
            r4 = this;
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L24
            java.lang.Object[] r0 = r4.elementData
            int r1 = r4.head
            r0 = r0[r1]
            java.lang.Object[] r1 = r4.elementData
            int r2 = r4.head
            r3 = 0
            r1[r2] = r3
            int r1 = r4.head
            int r1 = r4.incremented(r1)
            r4.head = r1
            int r1 = r4.size()
            int r1 = r1 + (-1)
            r4.size = r1
            return r0
        L24:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            java.lang.String r1 = "ArrayDeque is empty."
            r0.<init>(r1)
            throw r0
    }

    public final E removeFirstOrNull() {
            r1 = this;
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L8
            r0 = 0
            goto Lc
        L8:
            java.lang.Object r0 = r1.removeFirst()
        Lc:
            return r0
    }

    public final E removeLast() {
            r4 = this;
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L26
            int r0 = r4.head
            r1 = r4
            java.util.List r1 = (java.util.List) r1
            int r1 = kotlin.collections.CollectionsKt.getLastIndex(r1)
            int r0 = r0 + r1
            int r0 = r4.positiveMod(r0)
            java.lang.Object[] r1 = r4.elementData
            r1 = r1[r0]
            java.lang.Object[] r2 = r4.elementData
            r3 = 0
            r2[r0] = r3
            int r2 = r4.size()
            int r2 = r2 + (-1)
            r4.size = r2
            return r1
        L26:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            java.lang.String r1 = "ArrayDeque is empty."
            r0.<init>(r1)
            throw r0
    }

    public final E removeLastOrNull() {
            r1 = this;
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L8
            r0 = 0
            goto Lc
        L8:
            java.lang.Object r0 = r1.removeLast()
        Lc:
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(java.util.Collection<? extends java.lang.Object> r13) {
            r12 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            r0 = r12
            r1 = 0
            boolean r2 = r0.isEmpty()
            r3 = 0
            if (r2 != 0) goto La9
            java.lang.Object[] r2 = r0.elementData
            int r2 = r2.length
            if (r2 != 0) goto L15
            r2 = 1
            goto L16
        L15:
            r2 = r3
        L16:
            if (r2 == 0) goto L1a
            goto La9
        L1a:
            int r2 = r0.head
            int r3 = r0.size()
            int r2 = r2 + r3
            int r2 = r0.positiveMod(r2)
            int r3 = r0.head
            r4 = 0
            int r5 = r0.head
            r6 = 0
            if (r5 >= r2) goto L52
            int r5 = r0.head
        L2f:
            if (r5 >= r2) goto L49
            java.lang.Object[] r7 = r0.elementData
            r7 = r7[r5]
            r8 = r7
            r9 = 0
            boolean r8 = r13.contains(r8)
            if (r8 == 0) goto L45
            java.lang.Object[] r8 = r0.elementData
            int r9 = r3 + 1
            r8[r3] = r7
            r3 = r9
            goto L46
        L45:
            r4 = 1
        L46:
            int r5 = r5 + 1
            goto L2f
        L49:
            java.lang.Object[] r5 = r0.elementData
            kotlin.collections.ArraysKt.fill(r5, r6, r3, r2)
            r11 = r4
            r4 = r3
            r3 = r11
            goto L9c
        L52:
            int r5 = r0.head
            java.lang.Object[] r7 = r0.elementData
            int r7 = r7.length
        L57:
            if (r5 >= r7) goto L75
            java.lang.Object[] r8 = r0.elementData
            r8 = r8[r5]
            java.lang.Object[] r9 = r0.elementData
            r9[r5] = r6
            r9 = r8
            r10 = 0
            boolean r9 = r13.contains(r9)
            if (r9 == 0) goto L71
            java.lang.Object[] r9 = r0.elementData
            int r10 = r3 + 1
            r9[r3] = r8
            r3 = r10
            goto L72
        L71:
            r4 = 1
        L72:
            int r5 = r5 + 1
            goto L57
        L75:
            int r3 = r0.positiveMod(r3)
            r5 = 0
        L7a:
            if (r5 >= r2) goto L99
            java.lang.Object[] r7 = r0.elementData
            r7 = r7[r5]
            java.lang.Object[] r8 = r0.elementData
            r8[r5] = r6
            r8 = r7
            r9 = 0
            boolean r8 = r13.contains(r8)
            if (r8 == 0) goto L95
            java.lang.Object[] r8 = r0.elementData
            r8[r3] = r7
            int r3 = r0.incremented(r3)
            goto L96
        L95:
            r4 = 1
        L96:
            int r5 = r5 + 1
            goto L7a
        L99:
            r11 = r4
            r4 = r3
            r3 = r11
        L9c:
            if (r3 == 0) goto La8
            int r5 = r0.head
            int r5 = r4 - r5
            int r5 = r0.negativeMod(r5)
            r0.size = r5
        La8:
            goto Laa
        La9:
        Laa:
            return r3
    }

    @Override // kotlin.collections.AbstractMutableList, java.util.AbstractList, java.util.List
    public E set(int r4, E r5) {
            r3 = this;
            kotlin.collections.AbstractList$Companion r0 = kotlin.collections.AbstractList.Companion
            int r1 = r3.size()
            r0.checkElementIndex$kotlin_stdlib(r4, r1)
            int r0 = r3.head
            int r0 = r0 + r4
            int r0 = r3.positiveMod(r0)
            java.lang.Object[] r1 = r3.elementData
            r1 = r1[r0]
            java.lang.Object[] r2 = r3.elementData
            r2[r0] = r5
            return r1
    }

    public final java.lang.Object[] testToArray$kotlin_stdlib() {
            r1 = this;
            java.lang.Object[] r0 = r1.toArray()
            return r0
    }

    public final <T> T[] testToArray$kotlin_stdlib(T[] r2) {
            r1 = this;
            java.lang.String r0 = "array"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.Object[] r0 = r1.toArray(r2)
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public java.lang.Object[] toArray() {
            r1 = this;
            int r0 = r1.size()
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Object[] r0 = r1.toArray(r0)
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public <T> T[] toArray(T[] r10) {
            r9 = this;
            java.lang.String r0 = "array"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            int r0 = r10.length
            int r1 = r9.size()
            if (r0 < r1) goto Le
            r0 = r10
            goto L16
        Le:
            int r0 = r9.size()
            java.lang.Object[] r0 = kotlin.collections.ArraysKt.arrayOfNulls(r10, r0)
        L16:
            int r1 = r9.head
            int r2 = r9.size()
            int r1 = r1 + r2
            int r8 = r9.positiveMod(r1)
            int r1 = r9.head
            if (r1 >= r8) goto L32
            java.lang.Object[] r1 = r9.elementData
            int r4 = r9.head
            r6 = 2
            r7 = 0
            r3 = 0
            r2 = r0
            r5 = r8
            kotlin.collections.ArraysKt.copyInto$default(r1, r2, r3, r4, r5, r6, r7)
            goto L51
        L32:
            r1 = r9
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L51
            java.lang.Object[] r1 = r9.elementData
            int r2 = r9.head
            java.lang.Object[] r3 = r9.elementData
            int r3 = r3.length
            r4 = 0
            kotlin.collections.ArraysKt.copyInto(r1, r0, r4, r2, r3)
            java.lang.Object[] r1 = r9.elementData
            java.lang.Object[] r2 = r9.elementData
            int r2 = r2.length
            int r3 = r9.head
            int r2 = r2 - r3
            kotlin.collections.ArraysKt.copyInto(r1, r0, r2, r4, r8)
        L51:
            int r1 = r0.length
            int r2 = r9.size()
            if (r1 <= r2) goto L5f
            int r1 = r9.size()
            r2 = 0
            r0[r1] = r2
        L5f:
            return r0
    }
}
