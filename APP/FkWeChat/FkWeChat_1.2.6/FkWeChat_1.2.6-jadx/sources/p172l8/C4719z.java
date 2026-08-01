package p172l8;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import p024b9.AbstractC1041j;
import p024b9.AbstractC1061t;
import p036c9.InterfaceC1400a;
import p185m8.AbstractC5106t;

/* JADX INFO: renamed from: l8.z */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C4719z implements Collection, InterfaceC1400a {

    /* JADX INFO: renamed from: q */
    public final byte[] f13944q;

    /* JADX INFO: renamed from: l8.z$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a implements Iterator, InterfaceC1400a {

        /* JADX INFO: renamed from: q */
        public final byte[] f13945q;

        /* JADX INFO: renamed from: r */
        public int f13946r;

        public a(byte[] bArr) {
            bArr.getClass();
            this.f13945q = bArr;
        }

        /* JADX INFO: renamed from: g */
        public byte m18839g() {
            int i10 = this.f13946r;
            byte[] bArr = this.f13945q;
            if (i10 >= bArr.length) {
                throw new NoSuchElementException(String.valueOf(i10));
            }
            this.f13946r = i10 + 1;
            return C4718y.m18817c(bArr[i10]);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f13946r < this.f13945q.length;
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ Object next() {
            return C4718y.m18816a(m18839g());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public /* synthetic */ C4719z(byte[] bArr) {
        this.f13944q = bArr;
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ C4719z m18823a(byte[] bArr) {
        return new C4719z(bArr);
    }

    /* JADX INFO: renamed from: c */
    public static byte[] m18824c(int i10) {
        return m18825e(new byte[i10]);
    }

    /* JADX INFO: renamed from: e */
    public static byte[] m18825e(byte[] bArr) {
        bArr.getClass();
        return bArr;
    }

    /* JADX INFO: renamed from: o */
    public static boolean m18826o(byte[] bArr, byte b10) {
        return AbstractC5106t.m20696N(bArr, b10);
    }

    /* JADX INFO: renamed from: p */
    public static boolean m18827p(byte[] bArr, Collection collection) {
        collection.getClass();
        Collection collection2 = collection;
        if (collection2.isEmpty()) {
            return true;
        }
        for (Object obj : collection2) {
            if (!(obj instanceof C4718y) || !AbstractC5106t.m20696N(bArr, ((C4718y) obj).m18822k())) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: q */
    public static boolean m18828q(byte[] bArr, Object obj) {
        return (obj instanceof C4719z) && AbstractC1061t.m3842c(bArr, ((C4719z) obj).m18838z());
    }

    /* JADX INFO: renamed from: r */
    public static final byte m18829r(byte[] bArr, int i10) {
        return C4718y.m18817c(bArr[i10]);
    }

    /* JADX INFO: renamed from: t */
    public static int m18830t(byte[] bArr) {
        return bArr.length;
    }

    /* JADX INFO: renamed from: u */
    public static int m18831u(byte[] bArr) {
        return Arrays.hashCode(bArr);
    }

    /* JADX INFO: renamed from: v */
    public static boolean m18832v(byte[] bArr) {
        return bArr.length == 0;
    }

    /* JADX INFO: renamed from: w */
    public static Iterator m18833w(byte[] bArr) {
        return new a(bArr);
    }

    /* JADX INFO: renamed from: x */
    public static final void m18834x(byte[] bArr, int i10, byte b10) {
        bArr[i10] = b10;
    }

    /* JADX INFO: renamed from: y */
    public static String m18835y(byte[] bArr) {
        return "UByteArray(storage=" + Arrays.toString(bArr) + ')';
    }

    @Override // java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof C4718y) {
            return m18836l(((C4718y) obj).m18822k());
        }
        return false;
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection collection) {
        collection.getClass();
        return m18827p(this.f13944q, collection);
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        return m18828q(this.f13944q, obj);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return m18831u(this.f13944q);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return m18832v(this.f13944q);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return m18833w(this.f13944q);
    }

    /* JADX INFO: renamed from: l */
    public boolean m18836l(byte b10) {
        return m18826o(this.f13944q, b10);
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public int size() {
        return m18830t(this.f13944q);
    }

    @Override // java.util.Collection
    public Object[] toArray(Object[] objArr) {
        objArr.getClass();
        return AbstractC1041j.m3804b(this, objArr);
    }

    public String toString() {
        return m18835y(this.f13944q);
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ byte[] m18838z() {
        return this.f13944q;
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return AbstractC1041j.m3803a(this);
    }
}
