package Yue;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: Yue.ۥۢۢۧ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7470(version = "1.3")
@InterfaceC5570
@InterfaceC7507({"SMAP\nULongArray.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ULongArray.kt\nkotlin/ULongArray\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,86:1\n1726#2,3:87\n*S KotlinDebug\n*F\n+ 1 ULongArray.kt\nkotlin/ULongArray\n*L\n62#1:87,3\n*E\n"})
@InterfaceC4776
public final class C8065 implements Collection<C8064>, InterfaceC5591 {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @InterfaceC6399
    public final long[] f23955;

    /* JADX INFO: renamed from: Yue.ۥۢۢۧ۠$ۥ */
    public static final class C1425 implements Iterator<C8064>, InterfaceC5591 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        @InterfaceC6399
        public final long[] f23956;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public int f23957;

        public C1425(@InterfaceC6399 long[] jArr) {
            C5499.m17103(jArr, "array");
            this.f23956 = jArr;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f23957 < this.f23956.length;
        }

        /* JADX DEBUG: Class process forced to load method for inline: Yue.ۥۢۢۧ۟.ۥ۟۟۟(long):Yue.ۥۢۢۧ۟ */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ C8064 next() {
            return C8064.m26403(m4095());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        /* JADX INFO: renamed from: ۥ */
        public long m4095() {
            int i = this.f23957;
            long[] jArr = this.f23956;
            if (i >= jArr.length) {
                throw new NoSuchElementException(String.valueOf(this.f23957));
            }
            this.f23957 = i + 1;
            return C8064.m26408(jArr[i]);
        }
    }

    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [Yue.ۥۢۢۧ۠.ۥ۟(long[]):Yue.ۥۢۢۧ۠] */
    @InterfaceC6839
    public /* synthetic */ C8065(long[] jArr) {
        this.f23955 = jArr;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0002: CONSTRUCTOR (r1v0 long[]) A[MD:(long[]):void (m)] call: Yue.ۥۢۢۧ۠.<init>(long[]):void type: CONSTRUCTOR */
    /* JADX INFO: renamed from: ۥ۟ */
    public static final /* synthetic */ C8065 m4093(long[] jArr) {
        return new C8065(jArr);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static long[] m26463(int i) {
        return m26464(new long[i]);
    }

    @InterfaceC6399
    @InterfaceC6839
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static long[] m26464(@InterfaceC6399 long[] jArr) {
        C5499.m17103(jArr, "storage");
        return jArr;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static boolean m26465(long[] jArr, long j) {
        return C3411.m7559(jArr, j);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static boolean m26466(long[] jArr, @InterfaceC6399 Collection<C8064> collection) {
        C5499.m17103(collection, "elements");
        if (collection.isEmpty()) {
            return true;
        }
        for (Object obj : collection) {
            if (!(obj instanceof C8064) || !C3411.m7559(jArr, ((C8064) obj).m26462())) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static boolean m26467(long[] jArr, Object obj) {
        return (obj instanceof C8065) && C5499.m17094(jArr, ((C8065) obj).m26479());
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final boolean m26468(long[] jArr, long[] jArr2) {
        return C5499.m17094(jArr, jArr2);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final long m26469(long[] jArr, int i) {
        return C8064.m26408(jArr[i]);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static int m26470(long[] jArr) {
        return jArr.length;
    }

    @InterfaceC6839
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static /* synthetic */ void m26471() {
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static int m26472(long[] jArr) {
        return Arrays.hashCode(jArr);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static boolean m26473(long[] jArr) {
        return jArr.length == 0;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static Iterator<C8064> m26474(long[] jArr) {
        return new C1425(jArr);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static final void m26475(long[] jArr, int i, long j) {
        jArr[i] = j;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static String m26476(long[] jArr) {
        return "ULongArray(storage=" + Arrays.toString(jArr) + ')';
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(C8064 c8064) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends C8064> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof C8064) {
            return m26477(((C8064) obj).m26462());
        }
        return false;
    }

    @Override // java.util.Collection
    public boolean containsAll(@InterfaceC6399 Collection<? extends Object> collection) {
        C5499.m17103(collection, "elements");
        return m26466(this.f23955, collection);
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        return m26467(this.f23955, obj);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return m26472(this.f23955);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return m26473(this.f23955);
    }

    @Override // java.util.Collection, java.lang.Iterable
    @InterfaceC6399
    public Iterator<C8064> iterator() {
        return m26474(this.f23955);
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Collection
    public Object[] toArray() {
        return C3876.m913(this);
    }

    public String toString() {
        return m26476(this.f23955);
    }

    /* JADX INFO: renamed from: ۥ */
    public boolean m4094(long j) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public boolean m26477(long j) {
        return m26465(this.f23955, j);
    }

    /* JADX DEBUG: Method merged with bridge method: size()I */
    @Override // java.util.Collection
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public int size() {
        return m26470(this.f23955);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final /* synthetic */ long[] m26479() {
        return this.f23955;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        C5499.m17103(tArr, "array");
        return (T[]) C3876.m914(this, tArr);
    }
}
