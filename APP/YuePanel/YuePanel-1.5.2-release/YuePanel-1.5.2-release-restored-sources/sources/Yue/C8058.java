package Yue;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: Yue.ۥۢۢۦۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7470(version = "1.3")
@InterfaceC5570
@InterfaceC7507({"SMAP\nUIntArray.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UIntArray.kt\nkotlin/UIntArray\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,86:1\n1726#2,3:87\n*S KotlinDebug\n*F\n+ 1 UIntArray.kt\nkotlin/UIntArray\n*L\n62#1:87,3\n*E\n"})
@InterfaceC4776
public final class C8058 implements Collection<C8057>, InterfaceC5591 {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @InterfaceC6399
    public final int[] f23936;

    /* JADX INFO: renamed from: Yue.ۥۢۢۦۤ$ۥ */
    public static final class C1421 implements Iterator<C8057>, InterfaceC5591 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        @InterfaceC6399
        public final int[] f23937;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public int f23938;

        public C1421(@InterfaceC6399 int[] iArr) {
            C5499.m17103(iArr, "array");
            this.f23937 = iArr;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f23938 < this.f23937.length;
        }

        /* JADX DEBUG: Class process forced to load method for inline: Yue.ۥۢۢۦۣ.ۥ۟۟۟(int):Yue.ۥۢۢۦۣ */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ C8057 next() {
            return C8057.m26313(m4084());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        /* JADX INFO: renamed from: ۥ */
        public int m4084() {
            int i = this.f23938;
            int[] iArr = this.f23937;
            if (i >= iArr.length) {
                throw new NoSuchElementException(String.valueOf(this.f23938));
            }
            this.f23938 = i + 1;
            return C8057.m26318(iArr[i]);
        }
    }

    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [Yue.ۥۢۢۦۤ.ۥ۟(int[]):Yue.ۥۢۢۦۤ] */
    @InterfaceC6839
    public /* synthetic */ C8058(int[] iArr) {
        this.f23936 = iArr;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0002: CONSTRUCTOR (r1v0 int[]) A[MD:(int[]):void (m)] call: Yue.ۥۢۢۦۤ.<init>(int[]):void type: CONSTRUCTOR */
    /* JADX INFO: renamed from: ۥ۟ */
    public static final /* synthetic */ C8058 m4082(int[] iArr) {
        return new C8058(iArr);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static int[] m26373(int i) {
        return m26374(new int[i]);
    }

    @InterfaceC6399
    @InterfaceC6839
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static int[] m26374(@InterfaceC6399 int[] iArr) {
        C5499.m17103(iArr, "storage");
        return iArr;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static boolean m26375(int[] iArr, int i) {
        return C3411.m7558(iArr, i);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static boolean m26376(int[] iArr, @InterfaceC6399 Collection<C8057> collection) {
        C5499.m17103(collection, "elements");
        if (collection.isEmpty()) {
            return true;
        }
        for (Object obj : collection) {
            if (!(obj instanceof C8057) || !C3411.m7558(iArr, ((C8057) obj).m26372())) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static boolean m26377(int[] iArr, Object obj) {
        return (obj instanceof C8058) && C5499.m17094(iArr, ((C8058) obj).m26389());
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final boolean m26378(int[] iArr, int[] iArr2) {
        return C5499.m17094(iArr, iArr2);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final int m26379(int[] iArr, int i) {
        return C8057.m26318(iArr[i]);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static int m26380(int[] iArr) {
        return iArr.length;
    }

    @InterfaceC6839
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static /* synthetic */ void m26381() {
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static int m26382(int[] iArr) {
        return Arrays.hashCode(iArr);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static boolean m26383(int[] iArr) {
        return iArr.length == 0;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static Iterator<C8057> m26384(int[] iArr) {
        return new C1421(iArr);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static final void m26385(int[] iArr, int i, int i2) {
        iArr[i] = i2;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static String m26386(int[] iArr) {
        return "UIntArray(storage=" + Arrays.toString(iArr) + ')';
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(C8057 c8057) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends C8057> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof C8057) {
            return m26387(((C8057) obj).m26372());
        }
        return false;
    }

    @Override // java.util.Collection
    public boolean containsAll(@InterfaceC6399 Collection<? extends Object> collection) {
        C5499.m17103(collection, "elements");
        return m26376(this.f23936, collection);
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        return m26377(this.f23936, obj);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return m26382(this.f23936);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return m26383(this.f23936);
    }

    @Override // java.util.Collection, java.lang.Iterable
    @InterfaceC6399
    public Iterator<C8057> iterator() {
        return m26384(this.f23936);
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
        return m26386(this.f23936);
    }

    /* JADX INFO: renamed from: ۥ */
    public boolean m4083(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public boolean m26387(int i) {
        return m26375(this.f23936, i);
    }

    /* JADX DEBUG: Method merged with bridge method: size()I */
    @Override // java.util.Collection
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public int size() {
        return m26380(this.f23936);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final /* synthetic */ int[] m26389() {
        return this.f23936;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        C5499.m17103(tArr, "array");
        return (T[]) C3876.m914(this, tArr);
    }
}
