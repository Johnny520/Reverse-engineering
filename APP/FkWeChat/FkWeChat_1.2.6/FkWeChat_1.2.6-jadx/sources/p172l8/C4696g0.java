package p172l8;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import p024b9.AbstractC1041j;
import p024b9.AbstractC1061t;
import p036c9.InterfaceC1400a;
import p185m8.AbstractC5106t;

/* JADX INFO: renamed from: l8.g0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C4696g0 implements Collection, InterfaceC1400a {

    /* JADX INFO: renamed from: q */
    public final short[] f13906q;

    /* JADX INFO: renamed from: l8.g0$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a implements Iterator, InterfaceC1400a {

        /* JADX INFO: renamed from: q */
        public final short[] f13907q;

        /* JADX INFO: renamed from: r */
        public int f13908r;

        public a(short[] sArr) {
            sArr.getClass();
            this.f13907q = sArr;
        }

        /* JADX INFO: renamed from: g */
        public short m18778g() {
            int i10 = this.f13908r;
            short[] sArr = this.f13907q;
            if (i10 >= sArr.length) {
                throw new NoSuchElementException(String.valueOf(i10));
            }
            this.f13908r = i10 + 1;
            return C4694f0.m18757c(sArr[i10]);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f13908r < this.f13907q.length;
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ Object next() {
            return C4694f0.m18756a(m18778g());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public /* synthetic */ C4696g0(short[] sArr) {
        this.f13906q = sArr;
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ C4696g0 m18762a(short[] sArr) {
        return new C4696g0(sArr);
    }

    /* JADX INFO: renamed from: c */
    public static short[] m18763c(int i10) {
        return m18764e(new short[i10]);
    }

    /* JADX INFO: renamed from: e */
    public static short[] m18764e(short[] sArr) {
        sArr.getClass();
        return sArr;
    }

    /* JADX INFO: renamed from: o */
    public static boolean m18765o(short[] sArr, short s10) {
        return AbstractC5106t.m20706S(sArr, s10);
    }

    /* JADX INFO: renamed from: p */
    public static boolean m18766p(short[] sArr, Collection collection) {
        collection.getClass();
        Collection collection2 = collection;
        if (collection2.isEmpty()) {
            return true;
        }
        for (Object obj : collection2) {
            if (!(obj instanceof C4694f0) || !AbstractC5106t.m20706S(sArr, ((C4694f0) obj).m18761j())) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: q */
    public static boolean m18767q(short[] sArr, Object obj) {
        return (obj instanceof C4696g0) && AbstractC1061t.m3842c(sArr, ((C4696g0) obj).m18777z());
    }

    /* JADX INFO: renamed from: r */
    public static final short m18768r(short[] sArr, int i10) {
        return C4694f0.m18757c(sArr[i10]);
    }

    /* JADX INFO: renamed from: t */
    public static int m18769t(short[] sArr) {
        return sArr.length;
    }

    /* JADX INFO: renamed from: u */
    public static int m18770u(short[] sArr) {
        return Arrays.hashCode(sArr);
    }

    /* JADX INFO: renamed from: v */
    public static boolean m18771v(short[] sArr) {
        return sArr.length == 0;
    }

    /* JADX INFO: renamed from: w */
    public static Iterator m18772w(short[] sArr) {
        return new a(sArr);
    }

    /* JADX INFO: renamed from: x */
    public static final void m18773x(short[] sArr, int i10, short s10) {
        sArr[i10] = s10;
    }

    /* JADX INFO: renamed from: y */
    public static String m18774y(short[] sArr) {
        return "UShortArray(storage=" + Arrays.toString(sArr) + ')';
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
        if (obj instanceof C4694f0) {
            return m18775l(((C4694f0) obj).m18761j());
        }
        return false;
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection collection) {
        collection.getClass();
        return m18766p(this.f13906q, collection);
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        return m18767q(this.f13906q, obj);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return m18770u(this.f13906q);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return m18771v(this.f13906q);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return m18772w(this.f13906q);
    }

    /* JADX INFO: renamed from: l */
    public boolean m18775l(short s10) {
        return m18765o(this.f13906q, s10);
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
        return m18769t(this.f13906q);
    }

    @Override // java.util.Collection
    public Object[] toArray(Object[] objArr) {
        objArr.getClass();
        return AbstractC1041j.m3804b(this, objArr);
    }

    public String toString() {
        return m18774y(this.f13906q);
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ short[] m18777z() {
        return this.f13906q;
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return AbstractC1041j.m3803a(this);
    }
}
