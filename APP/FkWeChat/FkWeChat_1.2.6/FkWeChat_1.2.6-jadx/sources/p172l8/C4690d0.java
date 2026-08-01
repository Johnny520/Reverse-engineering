package p172l8;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import p024b9.AbstractC1041j;
import p024b9.AbstractC1061t;
import p036c9.InterfaceC1400a;
import p185m8.AbstractC5106t;

/* JADX INFO: renamed from: l8.d0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C4690d0 implements Collection, InterfaceC1400a {

    /* JADX INFO: renamed from: q */
    public final long[] f13900q;

    /* JADX INFO: renamed from: l8.d0$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a implements Iterator, InterfaceC1400a {

        /* JADX INFO: renamed from: q */
        public final long[] f13901q;

        /* JADX INFO: renamed from: r */
        public int f13902r;

        public a(long[] jArr) {
            jArr.getClass();
            this.f13901q = jArr;
        }

        /* JADX INFO: renamed from: g */
        public long m18752g() {
            int i10 = this.f13902r;
            long[] jArr = this.f13901q;
            if (i10 >= jArr.length) {
                throw new NoSuchElementException(String.valueOf(i10));
            }
            this.f13902r = i10 + 1;
            return C4688c0.m18729c(jArr[i10]);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f13902r < this.f13901q.length;
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ Object next() {
            return C4688c0.m18728a(m18752g());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public /* synthetic */ C4690d0(long[] jArr) {
        this.f13900q = jArr;
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ C4690d0 m18736a(long[] jArr) {
        return new C4690d0(jArr);
    }

    /* JADX INFO: renamed from: c */
    public static long[] m18737c(int i10) {
        return m18738e(new long[i10]);
    }

    /* JADX INFO: renamed from: e */
    public static long[] m18738e(long[] jArr) {
        jArr.getClass();
        return jArr;
    }

    /* JADX INFO: renamed from: o */
    public static boolean m18739o(long[] jArr, long j10) {
        return AbstractC5106t.m20702Q(jArr, j10);
    }

    /* JADX INFO: renamed from: p */
    public static boolean m18740p(long[] jArr, Collection collection) {
        collection.getClass();
        Collection collection2 = collection;
        if (collection2.isEmpty()) {
            return true;
        }
        for (Object obj : collection2) {
            if (!(obj instanceof C4688c0) || !AbstractC5106t.m20702Q(jArr, ((C4688c0) obj).m18734k())) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: q */
    public static boolean m18741q(long[] jArr, Object obj) {
        return (obj instanceof C4690d0) && AbstractC1061t.m3842c(jArr, ((C4690d0) obj).m18751z());
    }

    /* JADX INFO: renamed from: r */
    public static final long m18742r(long[] jArr, int i10) {
        return C4688c0.m18729c(jArr[i10]);
    }

    /* JADX INFO: renamed from: t */
    public static int m18743t(long[] jArr) {
        return jArr.length;
    }

    /* JADX INFO: renamed from: u */
    public static int m18744u(long[] jArr) {
        return Arrays.hashCode(jArr);
    }

    /* JADX INFO: renamed from: v */
    public static boolean m18745v(long[] jArr) {
        return jArr.length == 0;
    }

    /* JADX INFO: renamed from: w */
    public static Iterator m18746w(long[] jArr) {
        return new a(jArr);
    }

    /* JADX INFO: renamed from: x */
    public static final void m18747x(long[] jArr, int i10, long j10) {
        jArr[i10] = j10;
    }

    /* JADX INFO: renamed from: y */
    public static String m18748y(long[] jArr) {
        return "ULongArray(storage=" + Arrays.toString(jArr) + ')';
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
        if (obj instanceof C4688c0) {
            return m18749l(((C4688c0) obj).m18734k());
        }
        return false;
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection collection) {
        collection.getClass();
        return m18740p(this.f13900q, collection);
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        return m18741q(this.f13900q, obj);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return m18744u(this.f13900q);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return m18745v(this.f13900q);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return m18746w(this.f13900q);
    }

    /* JADX INFO: renamed from: l */
    public boolean m18749l(long j10) {
        return m18739o(this.f13900q, j10);
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
        return m18743t(this.f13900q);
    }

    @Override // java.util.Collection
    public Object[] toArray(Object[] objArr) {
        objArr.getClass();
        return AbstractC1041j.m3804b(this, objArr);
    }

    public String toString() {
        return m18748y(this.f13900q);
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ long[] m18751z() {
        return this.f13900q;
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return AbstractC1041j.m3803a(this);
    }
}
