package Yue;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: Yue.ۥۢۢۨۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7470(version = "1.3")
@InterfaceC5570
@InterfaceC7507({"SMAP\nUShortArray.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UShortArray.kt\nkotlin/UShortArray\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,86:1\n1726#2,3:87\n*S KotlinDebug\n*F\n+ 1 UShortArray.kt\nkotlin/UShortArray\n*L\n62#1:87,3\n*E\n"})
@InterfaceC4776
public final class C8081 implements Collection<C8080>, InterfaceC5591 {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @InterfaceC6399
    public final short[] f23974;

    /* JADX INFO: renamed from: Yue.ۥۢۢۨۥ$ۥ */
    public static final class C1429 implements Iterator<C8080>, InterfaceC5591 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        @InterfaceC6399
        public final short[] f23975;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public int f23976;

        public C1429(@InterfaceC6399 short[] sArr) {
            C5499.m17103(sArr, "array");
            this.f23975 = sArr;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f23976 < this.f23975.length;
        }

        /* JADX DEBUG: Class process forced to load method for inline: Yue.ۥۢۢۨۤ.ۥ۟۟۟(short):Yue.ۥۢۢۨۤ */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ C8080 next() {
            return C8080.m26585(m4118());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        /* JADX INFO: renamed from: ۥ */
        public short m4118() {
            int i = this.f23976;
            short[] sArr = this.f23975;
            if (i >= sArr.length) {
                throw new NoSuchElementException(String.valueOf(this.f23976));
            }
            this.f23976 = i + 1;
            return C8080.m26590(sArr[i]);
        }
    }

    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [Yue.ۥۢۢۨۥ.ۥ۟(short[]):Yue.ۥۢۢۨۥ] */
    @InterfaceC6839
    public /* synthetic */ C8081(short[] sArr) {
        this.f23974 = sArr;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0002: CONSTRUCTOR (r1v0 short[]) A[MD:(short[]):void (m)] call: Yue.ۥۢۢۨۥ.<init>(short[]):void type: CONSTRUCTOR */
    /* JADX INFO: renamed from: ۥ۟ */
    public static final /* synthetic */ C8081 m4116(short[] sArr) {
        return new C8081(sArr);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static short[] m26643(int i) {
        return m26644(new short[i]);
    }

    @InterfaceC6399
    @InterfaceC6839
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static short[] m26644(@InterfaceC6399 short[] sArr) {
        C5499.m17103(sArr, "storage");
        return sArr;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static boolean m26645(short[] sArr, short s) {
        return C3411.m7561(sArr, s);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static boolean m26646(short[] sArr, @InterfaceC6399 Collection<C8080> collection) {
        C5499.m17103(collection, "elements");
        if (collection.isEmpty()) {
            return true;
        }
        for (Object obj : collection) {
            if (!(obj instanceof C8080) || !C3411.m7561(sArr, ((C8080) obj).m26642())) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static boolean m26647(short[] sArr, Object obj) {
        return (obj instanceof C8081) && C5499.m17094(sArr, ((C8081) obj).m26659());
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final boolean m26648(short[] sArr, short[] sArr2) {
        return C5499.m17094(sArr, sArr2);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final short m26649(short[] sArr, int i) {
        return C8080.m26590(sArr[i]);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static int m26650(short[] sArr) {
        return sArr.length;
    }

    @InterfaceC6839
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static /* synthetic */ void m26651() {
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static int m26652(short[] sArr) {
        return Arrays.hashCode(sArr);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static boolean m26653(short[] sArr) {
        return sArr.length == 0;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static Iterator<C8080> m26654(short[] sArr) {
        return new C1429(sArr);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static final void m26655(short[] sArr, int i, short s) {
        sArr[i] = s;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static String m26656(short[] sArr) {
        return "UShortArray(storage=" + Arrays.toString(sArr) + ')';
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(C8080 c8080) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends C8080> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof C8080) {
            return m26657(((C8080) obj).m26642());
        }
        return false;
    }

    @Override // java.util.Collection
    public boolean containsAll(@InterfaceC6399 Collection<? extends Object> collection) {
        C5499.m17103(collection, "elements");
        return m26646(this.f23974, collection);
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        return m26647(this.f23974, obj);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return m26652(this.f23974);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return m26653(this.f23974);
    }

    @Override // java.util.Collection, java.lang.Iterable
    @InterfaceC6399
    public Iterator<C8080> iterator() {
        return m26654(this.f23974);
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
        return m26656(this.f23974);
    }

    /* JADX INFO: renamed from: ۥ */
    public boolean m4117(short s) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public boolean m26657(short s) {
        return m26645(this.f23974, s);
    }

    /* JADX DEBUG: Method merged with bridge method: size()I */
    @Override // java.util.Collection
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public int size() {
        return m26650(this.f23974);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final /* synthetic */ short[] m26659() {
        return this.f23974;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        C5499.m17103(tArr, "array");
        return (T[]) C3876.m914(this, tArr);
    }
}
