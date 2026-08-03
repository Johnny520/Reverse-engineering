package Yue;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: Yue.ۥۢۢۥۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7470(version = "1.3")
@InterfaceC5570
@InterfaceC7507({"SMAP\nUByteArray.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UByteArray.kt\nkotlin/UByteArray\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,86:1\n1726#2,3:87\n*S KotlinDebug\n*F\n+ 1 UByteArray.kt\nkotlin/UByteArray\n*L\n62#1:87,3\n*E\n"})
@InterfaceC4776
public final class C8049 implements Collection<C8048>, InterfaceC5591 {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @InterfaceC6399
    public final byte[] f23927;

    /* JADX INFO: renamed from: Yue.ۥۢۢۥۦ$ۥ */
    public static final class C1419 implements Iterator<C8048>, InterfaceC5591 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        @InterfaceC6399
        public final byte[] f23928;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public int f23929;

        public C1419(@InterfaceC6399 byte[] bArr) {
            C5499.m17103(bArr, "array");
            this.f23928 = bArr;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f23929 < this.f23928.length;
        }

        /* JADX DEBUG: Class process forced to load method for inline: Yue.ۥۢۢۥۥ.ۥ۟۟۟(byte):Yue.ۥۢۢۥۥ */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ C8048 next() {
            return C8048.m26188(m4070());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        /* JADX INFO: renamed from: ۥ */
        public byte m4070() {
            int i = this.f23929;
            byte[] bArr = this.f23928;
            if (i >= bArr.length) {
                throw new NoSuchElementException(String.valueOf(this.f23929));
            }
            this.f23929 = i + 1;
            return C8048.m26193(bArr[i]);
        }
    }

    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [Yue.ۥۢۢۥۦ.ۥ۟(byte[]):Yue.ۥۢۢۥۦ] */
    @InterfaceC6839
    public /* synthetic */ C8049(byte[] bArr) {
        this.f23927 = bArr;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0002: CONSTRUCTOR (r1v0 byte[]) A[MD:(byte[]):void (m)] call: Yue.ۥۢۢۥۦ.<init>(byte[]):void type: CONSTRUCTOR */
    /* JADX INFO: renamed from: ۥ۟ */
    public static final /* synthetic */ C8049 m4068(byte[] bArr) {
        return new C8049(bArr);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static byte[] m26246(int i) {
        return m26247(new byte[i]);
    }

    @InterfaceC6399
    @InterfaceC6839
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static byte[] m26247(@InterfaceC6399 byte[] bArr) {
        C5499.m17103(bArr, "storage");
        return bArr;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static boolean m26248(byte[] bArr, byte b) {
        return C3411.m7554(bArr, b);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static boolean m26249(byte[] bArr, @InterfaceC6399 Collection<C8048> collection) {
        C5499.m17103(collection, "elements");
        if (collection.isEmpty()) {
            return true;
        }
        for (Object obj : collection) {
            if (!(obj instanceof C8048) || !C3411.m7554(bArr, ((C8048) obj).m26245())) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static boolean m26250(byte[] bArr, Object obj) {
        return (obj instanceof C8049) && C5499.m17094(bArr, ((C8049) obj).m26262());
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final boolean m26251(byte[] bArr, byte[] bArr2) {
        return C5499.m17094(bArr, bArr2);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final byte m26252(byte[] bArr, int i) {
        return C8048.m26193(bArr[i]);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static int m26253(byte[] bArr) {
        return bArr.length;
    }

    @InterfaceC6839
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static /* synthetic */ void m26254() {
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static int m26255(byte[] bArr) {
        return Arrays.hashCode(bArr);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static boolean m26256(byte[] bArr) {
        return bArr.length == 0;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static Iterator<C8048> m26257(byte[] bArr) {
        return new C1419(bArr);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static final void m26258(byte[] bArr, int i, byte b) {
        bArr[i] = b;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static String m26259(byte[] bArr) {
        return "UByteArray(storage=" + Arrays.toString(bArr) + ')';
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(C8048 c8048) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends C8048> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof C8048) {
            return m26260(((C8048) obj).m26245());
        }
        return false;
    }

    @Override // java.util.Collection
    public boolean containsAll(@InterfaceC6399 Collection<? extends Object> collection) {
        C5499.m17103(collection, "elements");
        return m26249(this.f23927, collection);
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        return m26250(this.f23927, obj);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return m26255(this.f23927);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return m26256(this.f23927);
    }

    @Override // java.util.Collection, java.lang.Iterable
    @InterfaceC6399
    public Iterator<C8048> iterator() {
        return m26257(this.f23927);
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
        return m26259(this.f23927);
    }

    /* JADX INFO: renamed from: ۥ */
    public boolean m4069(byte b) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public boolean m26260(byte b) {
        return m26248(this.f23927, b);
    }

    /* JADX DEBUG: Method merged with bridge method: size()I */
    @Override // java.util.Collection
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public int size() {
        return m26253(this.f23927);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final /* synthetic */ byte[] m26262() {
        return this.f23927;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        C5499.m17103(tArr, "array");
        return (T[]) C3876.m914(this, tArr);
    }
}
