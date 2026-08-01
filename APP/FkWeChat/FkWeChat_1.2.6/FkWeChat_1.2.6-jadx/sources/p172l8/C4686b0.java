package p172l8;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import p024b9.AbstractC1041j;
import p024b9.AbstractC1061t;
import p036c9.InterfaceC1400a;
import p185m8.AbstractC5106t;

/* JADX INFO: renamed from: l8.b0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C4686b0 implements Collection, InterfaceC1400a {

    /* JADX INFO: renamed from: q */
    public final int[] f13891q;

    /* JADX INFO: renamed from: l8.b0$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a implements Iterator, InterfaceC1400a {

        /* JADX INFO: renamed from: q */
        public final int[] f13892q;

        /* JADX INFO: renamed from: r */
        public int f13893r;

        public a(int[] iArr) {
            iArr.getClass();
            this.f13892q = iArr;
        }

        /* JADX INFO: renamed from: g */
        public int m18726g() {
            int i10 = this.f13893r;
            int[] iArr = this.f13892q;
            if (i10 >= iArr.length) {
                throw new NoSuchElementException(String.valueOf(i10));
            }
            this.f13893r = i10 + 1;
            return C4684a0.m18703c(iArr[i10]);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f13893r < this.f13892q.length;
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ Object next() {
            return C4684a0.m18702a(m18726g());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public /* synthetic */ C4686b0(int[] iArr) {
        this.f13891q = iArr;
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ C4686b0 m18710a(int[] iArr) {
        return new C4686b0(iArr);
    }

    /* JADX INFO: renamed from: c */
    public static int[] m18711c(int i10) {
        return m18712e(new int[i10]);
    }

    /* JADX INFO: renamed from: e */
    public static int[] m18712e(int[] iArr) {
        iArr.getClass();
        return iArr;
    }

    /* JADX INFO: renamed from: o */
    public static boolean m18713o(int[] iArr, int i10) {
        return AbstractC5106t.m20700P(iArr, i10);
    }

    /* JADX INFO: renamed from: p */
    public static boolean m18714p(int[] iArr, Collection collection) {
        collection.getClass();
        Collection collection2 = collection;
        if (collection2.isEmpty()) {
            return true;
        }
        for (Object obj : collection2) {
            if (!(obj instanceof C4684a0) || !AbstractC5106t.m20700P(iArr, ((C4684a0) obj).m18707j())) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: q */
    public static boolean m18715q(int[] iArr, Object obj) {
        return (obj instanceof C4686b0) && AbstractC1061t.m3842c(iArr, ((C4686b0) obj).m18725z());
    }

    /* JADX INFO: renamed from: r */
    public static final int m18716r(int[] iArr, int i10) {
        return C4684a0.m18703c(iArr[i10]);
    }

    /* JADX INFO: renamed from: t */
    public static int m18717t(int[] iArr) {
        return iArr.length;
    }

    /* JADX INFO: renamed from: u */
    public static int m18718u(int[] iArr) {
        return Arrays.hashCode(iArr);
    }

    /* JADX INFO: renamed from: v */
    public static boolean m18719v(int[] iArr) {
        return iArr.length == 0;
    }

    /* JADX INFO: renamed from: w */
    public static Iterator m18720w(int[] iArr) {
        return new a(iArr);
    }

    /* JADX INFO: renamed from: x */
    public static final void m18721x(int[] iArr, int i10, int i11) {
        iArr[i10] = i11;
    }

    /* JADX INFO: renamed from: y */
    public static String m18722y(int[] iArr) {
        return "UIntArray(storage=" + Arrays.toString(iArr) + ')';
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
        if (obj instanceof C4684a0) {
            return m18723l(((C4684a0) obj).m18707j());
        }
        return false;
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection collection) {
        collection.getClass();
        return m18714p(this.f13891q, collection);
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        return m18715q(this.f13891q, obj);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return m18718u(this.f13891q);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return m18719v(this.f13891q);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return m18720w(this.f13891q);
    }

    /* JADX INFO: renamed from: l */
    public boolean m18723l(int i10) {
        return m18713o(this.f13891q, i10);
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
        return m18717t(this.f13891q);
    }

    @Override // java.util.Collection
    public Object[] toArray(Object[] objArr) {
        objArr.getClass();
        return AbstractC1041j.m3804b(this, objArr);
    }

    public String toString() {
        return m18722y(this.f13891q);
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int[] m18725z() {
        return this.f13891q;
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return AbstractC1041j.m3803a(this);
    }
}
