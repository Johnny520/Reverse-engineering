package kotlin.collections.builders;

/* JADX INFO: compiled from: ListBuilder.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010)\n\u0002\b\u0002\n\u0002\u0010+\n\u0002\b\u0015\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0000\u0018\u0000 V*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\u00060\u0003j\u0002`\u00042\b\u0012\u0004\u0012\u0002H\u00010\u00052\u00060\u0006j\u0002`\u0007:\u0002VWB\u0007\b\u0016¢\u0006\u0002\u0010\bB\u000f\b\u0016\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bBM\b\u0002\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\r\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\u0006\u0010\u000f\u001a\u00020\n\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0000\u0012\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0000¢\u0006\u0002\u0010\u0014J\u0015\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u001dJ\u001d\u0010\u001b\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010 J\u001e\u0010!\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020\n2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000#H\u0016J\u0016\u0010!\u001a\u00020\u00112\f\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000#H\u0016J&\u0010$\u001a\u00020\u001e2\u0006\u0010%\u001a\u00020\n2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000#2\u0006\u0010&\u001a\u00020\nH\u0002J\u001d\u0010'\u001a\u00020\u001e2\u0006\u0010%\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010 J\f\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00000)J\b\u0010*\u001a\u00020\u001eH\u0002J\b\u0010+\u001a\u00020\u001eH\u0016J\u0014\u0010,\u001a\u00020\u00112\n\u0010-\u001a\u0006\u0012\u0002\b\u00030)H\u0002J\u0010\u0010.\u001a\u00020\u001e2\u0006\u0010/\u001a\u00020\nH\u0002J\u0010\u00100\u001a\u00020\u001e2\u0006\u0010&\u001a\u00020\nH\u0002J\u0013\u00101\u001a\u00020\u00112\b\u0010-\u001a\u0004\u0018\u000102H\u0096\u0002J\u0016\u00103\u001a\u00028\u00002\u0006\u0010\u001f\u001a\u00020\nH\u0096\u0002¢\u0006\u0002\u00104J\b\u00105\u001a\u00020\nH\u0016J\u0015\u00106\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00028\u0000H\u0016¢\u0006\u0002\u00107J\u0018\u00108\u001a\u00020\u001e2\u0006\u0010%\u001a\u00020\n2\u0006\u0010&\u001a\u00020\nH\u0002J\b\u00109\u001a\u00020\u0011H\u0016J\u000f\u0010:\u001a\b\u0012\u0004\u0012\u00028\u00000;H\u0096\u0002J\u0015\u0010<\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00028\u0000H\u0016¢\u0006\u0002\u00107J\u000e\u0010=\u001a\b\u0012\u0004\u0012\u00028\u00000>H\u0016J\u0016\u0010=\u001a\b\u0012\u0004\u0012\u00028\u00000>2\u0006\u0010\u001f\u001a\u00020\nH\u0016J\u0015\u0010?\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u001dJ\u0016\u0010@\u001a\u00020\u00112\f\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000#H\u0016J\u0015\u0010A\u001a\u00028\u00002\u0006\u0010\u001f\u001a\u00020\nH\u0016¢\u0006\u0002\u00104J\u0015\u0010B\u001a\u00028\u00002\u0006\u0010%\u001a\u00020\nH\u0002¢\u0006\u0002\u00104J\u0018\u0010C\u001a\u00020\u001e2\u0006\u0010D\u001a\u00020\n2\u0006\u0010E\u001a\u00020\nH\u0002J\u0016\u0010F\u001a\u00020\u00112\f\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000#H\u0016J.\u0010G\u001a\u00020\n2\u0006\u0010D\u001a\u00020\n2\u0006\u0010E\u001a\u00020\n2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000#2\u0006\u0010H\u001a\u00020\u0011H\u0002J\u001e\u0010I\u001a\u00028\u00002\u0006\u0010\u001f\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010JJ\u001e\u0010K\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010L\u001a\u00020\n2\u0006\u0010M\u001a\u00020\nH\u0016J\u0015\u0010N\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001020\rH\u0016¢\u0006\u0002\u0010OJ'\u0010N\u001a\b\u0012\u0004\u0012\u0002HP0\r\"\u0004\b\u0001\u0010P2\f\u0010Q\u001a\b\u0012\u0004\u0012\u0002HP0\rH\u0016¢\u0006\u0002\u0010RJ\b\u0010S\u001a\u00020TH\u0016J\b\u0010U\u001a\u000202H\u0002R\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\rX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0015R\u0016\u0010\u0012\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0000X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\u00020\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0013\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0000X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006X"}, m115d2 = {"Lkotlin/collections/builders/ListBuilder;", "E", "", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "Lkotlin/collections/AbstractMutableList;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "()V", "initialCapacity", "", "(I)V", "array", "", "offset", "length", "isReadOnly", "", "backing", "root", "([Ljava/lang/Object;IIZLkotlin/collections/builders/ListBuilder;Lkotlin/collections/builders/ListBuilder;)V", "[Ljava/lang/Object;", "isEffectivelyReadOnly", "()Z", "size", "getSize", "()I", "add", "element", "(Ljava/lang/Object;)Z", "", "index", "(ILjava/lang/Object;)V", "addAll", "elements", "", "addAllInternal", "i", "n", "addAtInternal", "build", "", "checkIsMutable", "clear", "contentEquals", "other", "ensureCapacity", "minCapacity", "ensureExtraCapacity", "equals", "", "get", "(I)Ljava/lang/Object;", "hashCode", "indexOf", "(Ljava/lang/Object;)I", "insertAtInternal", "isEmpty", "iterator", "", "lastIndexOf", "listIterator", "", "remove", "removeAll", "removeAt", "removeAtInternal", "removeRangeInternal", "rangeOffset", "rangeLength", "retainAll", "retainOrRemoveAllInternal", "retain", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "subList", "fromIndex", "toIndex", "toArray", "()[Ljava/lang/Object;", "T", "destination", "([Ljava/lang/Object;)[Ljava/lang/Object;", "toString", "", "writeReplace", "Companion", "Itr", "kotlin-stdlib"}, m116k = 1, m117mv = {1, 9, 0}, m119xi = 48)
public final class ListBuilder<E> extends kotlin.collections.AbstractMutableList<E> implements java.util.List<E>, java.util.RandomAccess, java.io.Serializable, kotlin.jvm.internal.markers.KMutableList {
    private static final kotlin.collections.builders.ListBuilder.Companion Companion = null;
    private static final kotlin.collections.builders.ListBuilder Empty = null;
    private E[] array;
    private final kotlin.collections.builders.ListBuilder<E> backing;
    private boolean isReadOnly;
    private int length;
    private int offset;
    private final kotlin.collections.builders.ListBuilder<E> root;

    /* JADX INFO: compiled from: ListBuilder.kt */
    @kotlin.Metadata(m114d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m115d2 = {"Lkotlin/collections/builders/ListBuilder$Companion;", "", "()V", "Empty", "Lkotlin/collections/builders/ListBuilder;", "", "kotlin-stdlib"}, m116k = 1, m117mv = {1, 9, 0}, m119xi = 48)
    private static final class Companion {
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
    }

    /* JADX INFO: compiled from: ListBuilder.kt */
    @kotlin.Metadata(m114d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010+\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u001d\b\u0016\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0015\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\fJ\t\u0010\r\u001a\u00020\u000eH\u0096\u0002J\b\u0010\u000f\u001a\u00020\u000eH\u0016J\u000e\u0010\u0010\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0002\u0010\u0011J\b\u0010\u0012\u001a\u00020\u0006H\u0016J\r\u0010\u0013\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u0011J\b\u0010\u0014\u001a\u00020\u0006H\u0016J\b\u0010\u0015\u001a\u00020\nH\u0016J\u0015\u0010\u0016\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\fR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, m115d2 = {"Lkotlin/collections/builders/ListBuilder$Itr;", "E", "", "list", "Lkotlin/collections/builders/ListBuilder;", "index", "", "(Lkotlin/collections/builders/ListBuilder;I)V", "lastIndex", "add", "", "element", "(Ljava/lang/Object;)V", "hasNext", "", "hasPrevious", "next", "()Ljava/lang/Object;", "nextIndex", "previous", "previousIndex", "remove", "set", "kotlin-stdlib"}, m116k = 1, m117mv = {1, 9, 0}, m119xi = 48)
    private static final class Itr<E> implements java.util.ListIterator<E>, kotlin.jvm.internal.markers.KMutableListIterator {
        private int index;
        private int lastIndex;
        private final kotlin.collections.builders.ListBuilder<E> list;

        public Itr(kotlin.collections.builders.ListBuilder<E> r2, int r3) {
                r1 = this;
                java.lang.String r0 = "list"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                r1.<init>()
                r1.list = r2
                r1.index = r3
                r0 = -1
                r1.lastIndex = r0
                return
        }

        @Override // java.util.ListIterator
        public void add(E r4) {
                r3 = this;
                kotlin.collections.builders.ListBuilder<E> r0 = r3.list
                int r1 = r3.index
                int r2 = r1 + 1
                r3.index = r2
                r0.add(r1, r4)
                r0 = -1
                r3.lastIndex = r0
                return
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
                r2 = this;
                int r0 = r2.index
                kotlin.collections.builders.ListBuilder<E> r1 = r2.list
                int r1 = kotlin.collections.builders.ListBuilder.access$getLength$p(r1)
                if (r0 >= r1) goto Lc
                r0 = 1
                goto Ld
            Lc:
                r0 = 0
            Ld:
                return r0
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
                r1 = this;
                int r0 = r1.index
                if (r0 <= 0) goto L6
                r0 = 1
                goto L7
            L6:
                r0 = 0
            L7:
                return r0
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public E next() {
                r3 = this;
                int r0 = r3.index
                kotlin.collections.builders.ListBuilder<E> r1 = r3.list
                int r1 = kotlin.collections.builders.ListBuilder.access$getLength$p(r1)
                if (r0 >= r1) goto L24
                int r0 = r3.index
                int r1 = r0 + 1
                r3.index = r1
                r3.lastIndex = r0
                kotlin.collections.builders.ListBuilder<E> r0 = r3.list
                java.lang.Object[] r0 = kotlin.collections.builders.ListBuilder.access$getArray$p(r0)
                kotlin.collections.builders.ListBuilder<E> r1 = r3.list
                int r1 = kotlin.collections.builders.ListBuilder.access$getOffset$p(r1)
                int r2 = r3.lastIndex
                int r1 = r1 + r2
                r0 = r0[r1]
                return r0
            L24:
                java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
                r0.<init>()
                throw r0
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
                r1 = this;
                int r0 = r1.index
                return r0
        }

        @Override // java.util.ListIterator
        public E previous() {
                r3 = this;
                int r0 = r3.index
                if (r0 <= 0) goto L20
                int r0 = r3.index
                int r0 = r0 + (-1)
                r3.index = r0
                int r0 = r3.index
                r3.lastIndex = r0
                kotlin.collections.builders.ListBuilder<E> r0 = r3.list
                java.lang.Object[] r0 = kotlin.collections.builders.ListBuilder.access$getArray$p(r0)
                kotlin.collections.builders.ListBuilder<E> r1 = r3.list
                int r1 = kotlin.collections.builders.ListBuilder.access$getOffset$p(r1)
                int r2 = r3.lastIndex
                int r1 = r1 + r2
                r0 = r0[r1]
                return r0
            L20:
                java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
                r0.<init>()
                throw r0
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
                r1 = this;
                int r0 = r1.index
                int r0 = r0 + (-1)
                return r0
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
                r3 = this;
                int r0 = r3.lastIndex
                r1 = -1
                if (r0 == r1) goto L7
                r0 = 1
                goto L8
            L7:
                r0 = 0
            L8:
                if (r0 == 0) goto L18
                kotlin.collections.builders.ListBuilder<E> r0 = r3.list
                int r2 = r3.lastIndex
                r0.remove(r2)
                int r0 = r3.lastIndex
                r3.index = r0
                r3.lastIndex = r1
                return
            L18:
                r0 = 0
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "Call next() or previous() before removing element from the iterator."
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
        }

        @Override // java.util.ListIterator
        public void set(E r3) {
                r2 = this;
                int r0 = r2.lastIndex
                r1 = -1
                if (r0 == r1) goto L7
                r0 = 1
                goto L8
            L7:
                r0 = 0
            L8:
                if (r0 == 0) goto L12
                kotlin.collections.builders.ListBuilder<E> r0 = r2.list
                int r1 = r2.lastIndex
                r0.set(r1, r3)
                return
            L12:
                r0 = 0
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "Call next() or previous() before replacing element from the iterator."
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
        }
    }

    static {
            kotlin.collections.builders.ListBuilder$Companion r0 = new kotlin.collections.builders.ListBuilder$Companion
            r1 = 0
            r0.<init>(r1)
            kotlin.collections.builders.ListBuilder.Companion = r0
            kotlin.collections.builders.ListBuilder r0 = new kotlin.collections.builders.ListBuilder
            r1 = 0
            r0.<init>(r1)
            r1 = r0
            r2 = 0
            r3 = 1
            r1.isReadOnly = r3
            kotlin.collections.builders.ListBuilder.Empty = r0
            return
    }

    public ListBuilder() {
            r1 = this;
            r0 = 10
            r1.<init>(r0)
            return
    }

    public ListBuilder(int r8) {
            r7 = this;
            java.lang.Object[] r1 = kotlin.collections.builders.ListBuilderKt.arrayOfUninitializedElements(r8)
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r0 = r7
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
    }

    private ListBuilder(E[] r1, int r2, int r3, boolean r4, kotlin.collections.builders.ListBuilder<E> r5, kotlin.collections.builders.ListBuilder<E> r6) {
            r0 = this;
            r0.<init>()
            r0.array = r1
            r0.offset = r2
            r0.length = r3
            r0.isReadOnly = r4
            r0.backing = r5
            r0.root = r6
            return
    }

    public static final /* synthetic */ java.lang.Object[] access$getArray$p(kotlin.collections.builders.ListBuilder r1) {
            E[] r0 = r1.array
            return r0
    }

    public static final /* synthetic */ int access$getLength$p(kotlin.collections.builders.ListBuilder r1) {
            int r0 = r1.length
            return r0
    }

    public static final /* synthetic */ int access$getOffset$p(kotlin.collections.builders.ListBuilder r1) {
            int r0 = r1.offset
            return r0
    }

    private final void addAllInternal(int r6, java.util.Collection<? extends E> r7, int r8) {
            r5 = this;
            kotlin.collections.builders.ListBuilder<E> r0 = r5.backing
            if (r0 == 0) goto L15
            kotlin.collections.builders.ListBuilder<E> r0 = r5.backing
            r0.addAllInternal(r6, r7, r8)
            kotlin.collections.builders.ListBuilder<E> r0 = r5.backing
            E[] r0 = r0.array
            r5.array = r0
            int r0 = r5.length
            int r0 = r0 + r8
            r5.length = r0
            goto L2c
        L15:
            r5.insertAtInternal(r6, r8)
            r0 = 0
            java.util.Iterator r1 = r7.iterator()
        L1d:
            if (r0 >= r8) goto L2c
            E[] r2 = r5.array
            int r3 = r6 + r0
            java.lang.Object r4 = r1.next()
            r2[r3] = r4
            int r0 = r0 + 1
            goto L1d
        L2c:
            return
    }

    private final void addAtInternal(int r3, E r4) {
            r2 = this;
            kotlin.collections.builders.ListBuilder<E> r0 = r2.backing
            r1 = 1
            if (r0 == 0) goto L16
            kotlin.collections.builders.ListBuilder<E> r0 = r2.backing
            r0.addAtInternal(r3, r4)
            kotlin.collections.builders.ListBuilder<E> r0 = r2.backing
            E[] r0 = r0.array
            r2.array = r0
            int r0 = r2.length
            int r0 = r0 + r1
            r2.length = r0
            goto L1d
        L16:
            r2.insertAtInternal(r3, r1)
            E[] r0 = r2.array
            r0[r3] = r4
        L1d:
            return
    }

    private final void checkIsMutable() {
            r1 = this;
            boolean r0 = r1.isEffectivelyReadOnly()
            if (r0 != 0) goto L7
            return
        L7:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    private final boolean contentEquals(java.util.List<?> r4) {
            r3 = this;
            E[] r0 = r3.array
            int r1 = r3.offset
            int r2 = r3.length
            boolean r0 = kotlin.collections.builders.ListBuilderKt.access$subarrayContentEquals(r0, r1, r2, r4)
            return r0
    }

    private final void ensureCapacity(int r3) {
            r2 = this;
            kotlin.collections.builders.ListBuilder<E> r0 = r2.backing
            if (r0 != 0) goto L23
            if (r3 < 0) goto L1d
            E[] r0 = r2.array
            int r0 = r0.length
            if (r3 <= r0) goto L1c
            kotlin.collections.ArrayDeque$Companion r0 = kotlin.collections.ArrayDeque.Companion
            E[] r1 = r2.array
            int r1 = r1.length
            int r0 = r0.newCapacity$kotlin_stdlib(r1, r3)
            E[] r1 = r2.array
            java.lang.Object[] r1 = kotlin.collections.builders.ListBuilderKt.copyOfUninitializedElements(r1, r0)
            r2.array = r1
        L1c:
            return
        L1d:
            java.lang.OutOfMemoryError r0 = new java.lang.OutOfMemoryError
            r0.<init>()
            throw r0
        L23:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
    }

    private final void ensureExtraCapacity(int r2) {
            r1 = this;
            int r0 = r1.length
            int r0 = r0 + r2
            r1.ensureCapacity(r0)
            return
    }

    private final void insertAtInternal(int r5, int r6) {
            r4 = this;
            r4.ensureExtraCapacity(r6)
            E[] r0 = r4.array
            E[] r1 = r4.array
            int r2 = r4.offset
            int r3 = r4.length
            int r2 = r2 + r3
            int r3 = r5 + r6
            kotlin.collections.ArraysKt.copyInto(r0, r1, r3, r5, r2)
            int r0 = r4.length
            int r0 = r0 + r6
            r4.length = r0
            return
    }

    private final boolean isEffectivelyReadOnly() {
            r1 = this;
            boolean r0 = r1.isReadOnly
            if (r0 != 0) goto L11
            kotlin.collections.builders.ListBuilder<E> r0 = r1.root
            if (r0 == 0) goto Lf
            kotlin.collections.builders.ListBuilder<E> r0 = r1.root
            boolean r0 = r0.isReadOnly
            if (r0 == 0) goto Lf
            goto L11
        Lf:
            r0 = 0
            goto L12
        L11:
            r0 = 1
        L12:
            return r0
    }

    private final E removeAtInternal(int r7) {
            r6 = this;
            kotlin.collections.builders.ListBuilder<E> r0 = r6.backing
            if (r0 == 0) goto L11
            kotlin.collections.builders.ListBuilder<E> r0 = r6.backing
            java.lang.Object r0 = r0.removeAtInternal(r7)
            int r1 = r6.length
            int r1 = r1 + (-1)
            r6.length = r1
            return r0
        L11:
            E[] r0 = r6.array
            r0 = r0[r7]
            E[] r1 = r6.array
            E[] r2 = r6.array
            int r3 = r7 + 1
            int r4 = r6.offset
            int r5 = r6.length
            int r4 = r4 + r5
            kotlin.collections.ArraysKt.copyInto(r1, r2, r7, r3, r4)
            E[] r1 = r6.array
            int r2 = r6.offset
            int r3 = r6.length
            int r2 = r2 + r3
            int r2 = r2 + (-1)
            kotlin.collections.builders.ListBuilderKt.resetAt(r1, r2)
            int r1 = r6.length
            int r1 = r1 + (-1)
            r6.length = r1
            return r0
    }

    private final void removeRangeInternal(int r5, int r6) {
            r4 = this;
            kotlin.collections.builders.ListBuilder<E> r0 = r4.backing
            if (r0 == 0) goto La
            kotlin.collections.builders.ListBuilder<E> r0 = r4.backing
            r0.removeRangeInternal(r5, r6)
            goto L1f
        La:
            E[] r0 = r4.array
            E[] r1 = r4.array
            int r2 = r5 + r6
            int r3 = r4.length
            kotlin.collections.ArraysKt.copyInto(r0, r1, r5, r2, r3)
            E[] r0 = r4.array
            int r1 = r4.length
            int r1 = r1 - r6
            int r2 = r4.length
            kotlin.collections.builders.ListBuilderKt.resetRange(r0, r1, r2)
        L1f:
            int r0 = r4.length
            int r0 = r0 - r6
            r4.length = r0
            return
    }

    private final int retainOrRemoveAllInternal(int r9, int r10, java.util.Collection<? extends E> r11, boolean r12) {
            r8 = this;
            kotlin.collections.builders.ListBuilder<E> r0 = r8.backing
            if (r0 == 0) goto L10
            kotlin.collections.builders.ListBuilder<E> r0 = r8.backing
            int r0 = r0.retainOrRemoveAllInternal(r9, r10, r11, r12)
            int r1 = r8.length
            int r1 = r1 - r0
            r8.length = r1
            return r0
        L10:
            r0 = 0
            r1 = 0
        L12:
            if (r0 >= r10) goto L34
            E[] r2 = r8.array
            int r3 = r9 + r0
            r2 = r2[r3]
            boolean r2 = r11.contains(r2)
            if (r2 != r12) goto L31
            E[] r2 = r8.array
            int r3 = r1 + 1
            int r1 = r1 + r9
            E[] r4 = r8.array
            int r5 = r0 + 1
            int r0 = r0 + r9
            r0 = r4[r0]
            r2[r1] = r0
            r1 = r3
            r0 = r5
            goto L12
        L31:
            int r0 = r0 + 1
            goto L12
        L34:
            int r2 = r10 - r1
            E[] r3 = r8.array
            E[] r4 = r8.array
            int r5 = r9 + r10
            int r6 = r8.length
            int r7 = r9 + r1
            kotlin.collections.ArraysKt.copyInto(r3, r4, r7, r5, r6)
            E[] r3 = r8.array
            int r4 = r8.length
            int r4 = r4 - r2
            int r5 = r8.length
            kotlin.collections.builders.ListBuilderKt.resetRange(r3, r4, r5)
            int r3 = r8.length
            int r3 = r3 - r2
            r8.length = r3
            return r2
    }

    private final java.lang.Object writeReplace() {
            r3 = this;
            boolean r0 = r3.isEffectivelyReadOnly()
            if (r0 == 0) goto L10
            kotlin.collections.builders.SerializedCollection r0 = new kotlin.collections.builders.SerializedCollection
            r1 = r3
            java.util.Collection r1 = (java.util.Collection) r1
            r2 = 0
            r0.<init>(r1, r2)
            return r0
        L10:
            java.io.NotSerializableException r0 = new java.io.NotSerializableException
            java.lang.String r1 = "The list cannot be serialized while it is being built."
            r0.<init>(r1)
            throw r0
    }

    @Override // kotlin.collections.AbstractMutableList, java.util.AbstractList, java.util.List
    public void add(int r3, E r4) {
            r2 = this;
            r2.checkIsMutable()
            kotlin.collections.AbstractList$Companion r0 = kotlin.collections.AbstractList.Companion
            int r1 = r2.length
            r0.checkPositionIndex$kotlin_stdlib(r3, r1)
            int r0 = r2.offset
            int r0 = r0 + r3
            r2.addAtInternal(r0, r4)
            return
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E r3) {
            r2 = this;
            r2.checkIsMutable()
            int r0 = r2.offset
            int r1 = r2.length
            int r0 = r0 + r1
            r2.addAtInternal(r0, r3)
            r0 = 1
            return r0
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int r3, java.util.Collection<? extends E> r4) {
            r2 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r2.checkIsMutable()
            kotlin.collections.AbstractList$Companion r0 = kotlin.collections.AbstractList.Companion
            int r1 = r2.length
            r0.checkPositionIndex$kotlin_stdlib(r3, r1)
            int r0 = r4.size()
            int r1 = r2.offset
            int r1 = r1 + r3
            r2.addAllInternal(r1, r4, r0)
            if (r0 <= 0) goto L1d
            r1 = 1
            goto L1e
        L1d:
            r1 = 0
        L1e:
            return r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(java.util.Collection<? extends E> r4) {
            r3 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r3.checkIsMutable()
            int r0 = r4.size()
            int r1 = r3.offset
            int r2 = r3.length
            int r1 = r1 + r2
            r3.addAllInternal(r1, r4, r0)
            if (r0 <= 0) goto L18
            r1 = 1
            goto L19
        L18:
            r1 = 0
        L19:
            return r1
    }

    public final java.util.List<E> build() {
            r1 = this;
            kotlin.collections.builders.ListBuilder<E> r0 = r1.backing
            if (r0 != 0) goto L17
            r1.checkIsMutable()
            r0 = 1
            r1.isReadOnly = r0
            int r0 = r1.length
            if (r0 <= 0) goto L12
            r0 = r1
            java.util.List r0 = (java.util.List) r0
            goto L16
        L12:
            kotlin.collections.builders.ListBuilder r0 = kotlin.collections.builders.ListBuilder.Empty
            java.util.List r0 = (java.util.List) r0
        L16:
            return r0
        L17:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
            r2 = this;
            r2.checkIsMutable()
            int r0 = r2.offset
            int r1 = r2.length
            r2.removeRangeInternal(r0, r1)
            return
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r2 == r1) goto L12
            boolean r0 = r2 instanceof java.util.List
            if (r0 == 0) goto L10
            r0 = r2
            java.util.List r0 = (java.util.List) r0
            boolean r0 = r1.contentEquals(r0)
            if (r0 == 0) goto L10
            goto L12
        L10:
            r0 = 0
            goto L13
        L12:
            r0 = 1
        L13:
            return r0
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int r3) {
            r2 = this;
            kotlin.collections.AbstractList$Companion r0 = kotlin.collections.AbstractList.Companion
            int r1 = r2.length
            r0.checkElementIndex$kotlin_stdlib(r3, r1)
            E[] r0 = r2.array
            int r1 = r2.offset
            int r1 = r1 + r3
            r0 = r0[r1]
            return r0
    }

    @Override // kotlin.collections.AbstractMutableList
    public int getSize() {
            r1 = this;
            int r0 = r1.length
            return r0
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
            r3 = this;
            E[] r0 = r3.array
            int r1 = r3.offset
            int r2 = r3.length
            int r0 = kotlin.collections.builders.ListBuilderKt.access$subarrayContentHashCode(r0, r1, r2)
            return r0
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(java.lang.Object r4) {
            r3 = this;
            r0 = 0
        L1:
            int r1 = r3.length
            if (r0 >= r1) goto L16
            E[] r1 = r3.array
            int r2 = r3.offset
            int r2 = r2 + r0
            r1 = r1[r2]
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r4)
            if (r1 == 0) goto L13
            return r0
        L13:
            int r0 = r0 + 1
            goto L1
        L16:
            r1 = -1
            return r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
            r1 = this;
            int r0 = r1.length
            if (r0 != 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public java.util.Iterator<E> iterator() {
            r2 = this;
            kotlin.collections.builders.ListBuilder$Itr r0 = new kotlin.collections.builders.ListBuilder$Itr
            r1 = 0
            r0.<init>(r2, r1)
            java.util.Iterator r0 = (java.util.Iterator) r0
            return r0
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(java.lang.Object r4) {
            r3 = this;
            int r0 = r3.length
            int r0 = r0 + (-1)
        L4:
            if (r0 < 0) goto L17
            E[] r1 = r3.array
            int r2 = r3.offset
            int r2 = r2 + r0
            r1 = r1[r2]
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r4)
            if (r1 == 0) goto L14
            return r0
        L14:
            int r0 = r0 + (-1)
            goto L4
        L17:
            r1 = -1
            return r1
    }

    @Override // java.util.AbstractList, java.util.List
    public java.util.ListIterator<E> listIterator() {
            r2 = this;
            kotlin.collections.builders.ListBuilder$Itr r0 = new kotlin.collections.builders.ListBuilder$Itr
            r1 = 0
            r0.<init>(r2, r1)
            java.util.ListIterator r0 = (java.util.ListIterator) r0
            return r0
    }

    @Override // java.util.AbstractList, java.util.List
    public java.util.ListIterator<E> listIterator(int r3) {
            r2 = this;
            kotlin.collections.AbstractList$Companion r0 = kotlin.collections.AbstractList.Companion
            int r1 = r2.length
            r0.checkPositionIndex$kotlin_stdlib(r3, r1)
            kotlin.collections.builders.ListBuilder$Itr r0 = new kotlin.collections.builders.ListBuilder$Itr
            r0.<init>(r2, r3)
            java.util.ListIterator r0 = (java.util.ListIterator) r0
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(java.lang.Object r3) {
            r2 = this;
            r2.checkIsMutable()
            int r0 = r2.indexOf(r3)
            if (r0 < 0) goto Lc
            r2.remove(r0)
        Lc:
            if (r0 < 0) goto L10
            r1 = 1
            goto L11
        L10:
            r1 = 0
        L11:
            return r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(java.util.Collection<? extends java.lang.Object> r4) {
            r3 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r3.checkIsMutable()
            int r0 = r3.offset
            int r1 = r3.length
            r2 = 0
            int r0 = r3.retainOrRemoveAllInternal(r0, r1, r4, r2)
            if (r0 <= 0) goto L14
            r2 = 1
        L14:
            return r2
    }

    @Override // kotlin.collections.AbstractMutableList
    public E removeAt(int r3) {
            r2 = this;
            r2.checkIsMutable()
            kotlin.collections.AbstractList$Companion r0 = kotlin.collections.AbstractList.Companion
            int r1 = r2.length
            r0.checkElementIndex$kotlin_stdlib(r3, r1)
            int r0 = r2.offset
            int r0 = r0 + r3
            java.lang.Object r0 = r2.removeAtInternal(r0)
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(java.util.Collection<? extends java.lang.Object> r4) {
            r3 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r3.checkIsMutable()
            int r0 = r3.offset
            int r1 = r3.length
            r2 = 1
            int r0 = r3.retainOrRemoveAllInternal(r0, r1, r4, r2)
            if (r0 <= 0) goto L14
            goto L15
        L14:
            r2 = 0
        L15:
            return r2
    }

    @Override // kotlin.collections.AbstractMutableList, java.util.AbstractList, java.util.List
    public E set(int r4, E r5) {
            r3 = this;
            r3.checkIsMutable()
            kotlin.collections.AbstractList$Companion r0 = kotlin.collections.AbstractList.Companion
            int r1 = r3.length
            r0.checkElementIndex$kotlin_stdlib(r4, r1)
            E[] r0 = r3.array
            int r1 = r3.offset
            int r1 = r1 + r4
            r0 = r0[r1]
            E[] r1 = r3.array
            int r2 = r3.offset
            int r2 = r2 + r4
            r1[r2] = r5
            return r0
    }

    @Override // java.util.AbstractList, java.util.List
    public java.util.List<E> subList(int r10, int r11) {
            r9 = this;
            kotlin.collections.AbstractList$Companion r0 = kotlin.collections.AbstractList.Companion
            int r1 = r9.length
            r0.checkRangeIndexes$kotlin_stdlib(r10, r11, r1)
            kotlin.collections.builders.ListBuilder r0 = new kotlin.collections.builders.ListBuilder
            E[] r3 = r9.array
            int r1 = r9.offset
            int r4 = r1 + r10
            int r5 = r11 - r10
            boolean r6 = r9.isReadOnly
            kotlin.collections.builders.ListBuilder<E> r1 = r9.root
            if (r1 != 0) goto L19
            r8 = r9
            goto L1a
        L19:
            r8 = r1
        L1a:
            r2 = r0
            r7 = r9
            r2.<init>(r3, r4, r5, r6, r7, r8)
            java.util.List r0 = (java.util.List) r0
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public java.lang.Object[] toArray() {
            r4 = this;
            E[] r0 = r4.array
            int r1 = r4.offset
            int r2 = r4.offset
            int r3 = r4.length
            int r2 = r2 + r3
            java.lang.Object[] r0 = kotlin.collections.ArraysKt.copyOfRange(r0, r1, r2)
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public <T> T[] toArray(T[] r5) {
            r4 = this;
            java.lang.String r0 = "destination"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            int r0 = r5.length
            int r1 = r4.length
            if (r0 >= r1) goto L21
            E[] r0 = r4.array
            int r1 = r4.offset
            int r2 = r4.offset
            int r3 = r4.length
            int r2 = r2 + r3
            java.lang.Class r3 = r5.getClass()
            java.lang.Object[] r0 = java.util.Arrays.copyOfRange(r0, r1, r2, r3)
            java.lang.String r1 = "copyOfRange(array, offse…h, destination.javaClass)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
        L21:
            E[] r0 = r4.array
            int r1 = r4.offset
            int r2 = r4.offset
            int r3 = r4.length
            int r2 = r2 + r3
            r3 = 0
            kotlin.collections.ArraysKt.copyInto(r0, r5, r3, r1, r2)
            int r0 = r5.length
            int r1 = r4.length
            if (r0 <= r1) goto L38
            int r0 = r4.length
            r1 = 0
            r5[r0] = r1
        L38:
            return r5
    }

    @Override // java.util.AbstractCollection
    public java.lang.String toString() {
            r3 = this;
            E[] r0 = r3.array
            int r1 = r3.offset
            int r2 = r3.length
            java.lang.String r0 = kotlin.collections.builders.ListBuilderKt.access$subarrayContentToString(r0, r1, r2)
            return r0
    }
}
