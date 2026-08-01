package p244qb;

import bsh.C1189h4;
import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import p299ub.C8630l;

/* JADX INFO: renamed from: qb.j */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public class C6379j extends AbstractList implements RandomAccess {

    /* JADX INFO: renamed from: q */
    public int f20119q;

    /* JADX INFO: renamed from: r */
    public Object f20120r;

    /* JADX INFO: renamed from: qb.j$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class b implements Iterator {

        /* JADX INFO: renamed from: q */
        public static final b f20121q = new b();

        /* JADX INFO: renamed from: b */
        public static b m25375b() {
            return f20121q;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return false;
        }

        @Override // java.util.Iterator
        public Object next() {
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new IllegalStateException();
        }
    }

    /* JADX INFO: renamed from: qb.j$c */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public class c extends d {

        /* JADX INFO: renamed from: r */
        public final int f20122r;

        public c() {
            super();
            this.f20122r = ((AbstractList) C6379j.this).modCount;
        }

        @Override // p244qb.C6379j.d
        /* JADX INFO: renamed from: b */
        public void mo25376b() {
            if (((AbstractList) C6379j.this).modCount == this.f20122r) {
                return;
            }
            throw new ConcurrentModificationException("ModCount: " + ((AbstractList) C6379j.this).modCount + "; expected: " + this.f20122r);
        }

        @Override // p244qb.C6379j.d
        /* JADX INFO: renamed from: d */
        public Object mo25377d() {
            return C6379j.this.f20120r;
        }

        @Override // java.util.Iterator
        public void remove() {
            mo25376b();
            C6379j.this.clear();
        }
    }

    /* JADX INFO: renamed from: qb.j$d */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static abstract class d implements Iterator {

        /* JADX INFO: renamed from: q */
        public boolean f20124q;

        public d() {
        }

        /* JADX INFO: renamed from: b */
        public abstract void mo25376b();

        /* JADX INFO: renamed from: d */
        public abstract Object mo25377d();

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return !this.f20124q;
        }

        @Override // java.util.Iterator
        public final Object next() {
            if (this.f20124q) {
                C1189h4.m4429a();
                return null;
            }
            this.f20124q = true;
            mo25376b();
            return mo25377d();
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m25370a(int i10) {
        String str = (i10 == 2 || i10 == 3 || i10 == 5 || i10 == 6 || i10 == 7) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 2 || i10 == 3 || i10 == 5 || i10 == 6 || i10 == 7) ? 2 : 3];
        switch (i10) {
            case 2:
            case 3:
            case 5:
            case 6:
            case 7:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/utils/SmartList";
                break;
            case 4:
                objArr[0] = "a";
                break;
            default:
                objArr[0] = "elements";
                break;
        }
        if (i10 == 2 || i10 == 3) {
            objArr[1] = "iterator";
        } else if (i10 == 5 || i10 == 6 || i10 == 7) {
            objArr[1] = "toArray";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/SmartList";
        }
        switch (i10) {
            case 2:
            case 3:
            case 5:
            case 6:
            case 7:
                break;
            case 4:
                objArr[2] = "toArray";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 != 2 && i10 != 3 && i10 != 5 && i10 != 6 && i10 != 7) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i10, Object obj) {
        int i11;
        if (i10 < 0 || i10 > (i11 = this.f20119q)) {
            C8630l.m33208a("Index: ", i10, ", Size: ", this.f20119q);
            return;
        }
        if (i11 == 0) {
            this.f20120r = obj;
        } else if (i11 == 1 && i10 == 0) {
            this.f20120r = new Object[]{obj, this.f20120r};
        } else {
            Object[] objArr = new Object[i11 + 1];
            Object obj2 = this.f20120r;
            if (i11 == 1) {
                objArr[0] = obj2;
            } else {
                Object[] objArr2 = (Object[]) obj2;
                System.arraycopy(objArr2, 0, objArr, 0, i10);
                System.arraycopy(objArr2, i10, objArr, i10 + 1, this.f20119q - i10);
            }
            objArr[i10] = obj;
            this.f20120r = objArr;
        }
        this.f20119q++;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        this.f20120r = null;
        this.f20119q = 0;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i10) {
        int i11;
        if (i10 < 0 || i10 >= (i11 = this.f20119q)) {
            C8630l.m33208a("Index: ", i10, ", Size: ", this.f20119q);
            return null;
        }
        Object obj = this.f20120r;
        return i11 == 1 ? obj : ((Object[]) obj)[i10];
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        int i10 = this.f20119q;
        if (i10 == 0) {
            b bVarM25375b = b.m25375b();
            if (bVarM25375b == null) {
                m25370a(2);
            }
            return bVarM25375b;
        }
        if (i10 == 1) {
            return new c();
        }
        Iterator it = super.iterator();
        if (it == null) {
            m25370a(3);
        }
        return it;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object remove(int i10) {
        int i11;
        if (i10 < 0 || i10 >= (i11 = this.f20119q)) {
            C8630l.m33208a("Index: ", i10, ", Size: ", this.f20119q);
            return null;
        }
        Object obj = this.f20120r;
        if (i11 == 1) {
            this.f20120r = null;
        } else {
            Object[] objArr = (Object[]) obj;
            Object obj2 = objArr[i10];
            if (i11 == 2) {
                this.f20120r = objArr[1 - i10];
            } else {
                int i12 = (i11 - i10) - 1;
                if (i12 > 0) {
                    System.arraycopy(objArr, i10 + 1, objArr, i10, i12);
                }
                objArr[this.f20119q - 1] = null;
            }
            obj = obj2;
        }
        this.f20119q--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object set(int i10, Object obj) {
        int i11;
        if (i10 < 0 || i10 >= (i11 = this.f20119q)) {
            C8630l.m33208a("Index: ", i10, ", Size: ", this.f20119q);
            return null;
        }
        Object obj2 = this.f20120r;
        if (i11 == 1) {
            this.f20120r = obj;
            return obj2;
        }
        Object[] objArr = (Object[]) obj2;
        Object obj3 = objArr[i10];
        objArr[i10] = obj;
        return obj3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f20119q;
    }

    @Override // java.util.List
    public void sort(Comparator comparator) {
        int i10 = this.f20119q;
        if (i10 >= 2) {
            Arrays.sort((Object[]) this.f20120r, 0, i10, comparator);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray(Object[] objArr) {
        if (objArr == null) {
            m25370a(4);
        }
        int length = objArr.length;
        int i10 = this.f20119q;
        if (i10 == 1) {
            if (length == 0) {
                Object[] objArr2 = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), 1);
                objArr2[0] = this.f20120r;
                return objArr2;
            }
            objArr[0] = this.f20120r;
        } else {
            if (length < i10) {
                Object[] objArrCopyOf = Arrays.copyOf((Object[]) this.f20120r, i10, objArr.getClass());
                if (objArrCopyOf == null) {
                    m25370a(6);
                }
                return objArrCopyOf;
            }
            if (i10 != 0) {
                System.arraycopy(this.f20120r, 0, objArr, 0, i10);
            }
        }
        int i11 = this.f20119q;
        if (length > i11) {
            objArr[i11] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Object obj) {
        int i10 = this.f20119q;
        if (i10 == 0) {
            this.f20120r = obj;
        } else {
            Object obj2 = this.f20120r;
            if (i10 == 1) {
                this.f20120r = new Object[]{obj2, obj};
            } else {
                Object[] objArr = (Object[]) obj2;
                int length = objArr.length;
                if (i10 >= length) {
                    int i11 = ((length * 3) / 2) + 1;
                    int i12 = i10 + 1;
                    if (i11 < i12) {
                        i11 = i12;
                    }
                    Object[] objArr2 = new Object[i11];
                    this.f20120r = objArr2;
                    System.arraycopy(objArr, 0, objArr2, 0, length);
                    objArr = objArr2;
                }
                objArr[this.f20119q] = obj;
            }
        }
        this.f20119q++;
        ((AbstractList) this).modCount++;
        return true;
    }
}
