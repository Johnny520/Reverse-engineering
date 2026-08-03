package p011F0;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import p001A0.AbstractC0040p;
import p009E0.AbstractC0176g;
import p009E0.AbstractC0179j;
import p031Q0.AbstractC0307g;
import p034S.AbstractC0324d;

/* JADX INFO: renamed from: F0.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0199c extends AbstractC0176g implements RandomAccess, Serializable {

    /* JADX INFO: renamed from: d */
    public static final C0199c f418d = null;

    /* JADX INFO: renamed from: a */
    public Object[] f419a;

    /* JADX INFO: renamed from: b */
    public int f420b;

    /* JADX INFO: renamed from: c */
    public boolean f421c;

    static {
        C0199c r02 = new C0199c(0);
        r02.f421c = true;
        f418d = r02;
    }

    public C0199c(int r2) {
        if (r2 < 0) goto L7;
        this.f419a = new Object[r2];
        return;
    L7:
        throw new IllegalArgumentException("capacity must be non-negative.".toString());
    }

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ int m579c(C0199c r02) {
        return ((AbstractList) r02).modCount;
    }

    @Override // p009E0.AbstractC0176g
    /* JADX INFO: renamed from: a */
    public final int mo521a() {
        return this.f420b;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object r4) {
        m582f();
        int r02 = this.f420b;
        ((AbstractList) this).modCount++;
        m583g(r02, 1);
        this.f419a[r02] = r4;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection r3) {
        AbstractC0307g.m703e(r3, "elements");
        m582f();
        int r02 = r3.size();
        m580d(this.f420b, r3, r02);
        if (r02 <= 0) goto L5;
        return true;
    L5:
        return false;
    }

    @Override // p009E0.AbstractC0176g
    /* JADX INFO: renamed from: b */
    public final Object mo522b(int r5) {
        m582f();
        int r02 = this.f420b;
        if (r5 < 0) goto L8;
        if (r5 >= r02) goto L8;
        return m584h(r5);
    L8:
        throw new IndexOutOfBoundsException(AbstractC0324d.m721d("index: ", r5, ", size: ", r02));
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        m582f();
        m585i(0, this.f420b);
    }

    /* JADX INFO: renamed from: d */
    public final void m580d(int r5, Collection r6, int r7) {
        ((AbstractList) this).modCount++;
        m583g(r5, r7);
        Iterator r62 = r6.iterator();
        int r02 = 0;
    L3:
        if (r02 >= r7) goto L5;
        this.f419a[r5 + r02] = r62.next();
        r02 = r02 + 1;
        goto L3
    }

    /* JADX INFO: renamed from: e */
    public final void m581e(int r3, Object r4) {
        ((AbstractList) this).modCount++;
        m583g(r3, 1);
        this.f419a[r3] = r4;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object r4) {
        if (r4 != this) goto L4;
    L7:
        return true;
    L4:
        if ((r4 instanceof List) == false) goto L9;
        Object[] r02 = this.f419a;
        int r2 = this.f420b;
        if (AbstractC0040p.m94a(r02, 0, r2, (List) r4) == true) goto L7;
        return false;
    L9:
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final void m582f() {
        if (this.f421c == true) goto L6;
        return;
    L6:
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: g */
    public final void m583g(int r6, int r7) {
        int r02 = this.f420b + r7;
        if (r02 < 0) goto L18;
        Object[] r1 = this.f419a;
        if (r02 <= r1.length) goto L15;
        int r2 = r1.length;
        int r22 = r2 + (r2 >> 1);
        if ((r22 - r02) >= 0) goto L10;
        r22 = r02;
    L10:
        if ((r22 - 2147483639) <= 0) goto L14;
        if (r02 <= 2147483639) goto L13;
        r22 = Integer.MAX_VALUE;
        goto L14
    L13:
        r22 = 2147483639;
    L14:
        Object[] r03 = Arrays.copyOf(r1, r22);
        AbstractC0307g.m702d(r03, "copyOf(...)");
        this.f419a = r03;
    L15:
        Object[] r04 = this.f419a;
        AbstractC0179j.m533j0(r04, r04, r6 + r7, r6, this.f420b);
        this.f420b += r7;
        return;
    L18:
        throw new OutOfMemoryError();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int r5) {
        int r02 = this.f420b;
        if (r5 < 0) goto L8;
        if (r5 >= r02) goto L8;
        return this.f419a[r5];
    L8:
        throw new IndexOutOfBoundsException(AbstractC0324d.m721d("index: ", r5, ", size: ", r02));
    }

    /* JADX INFO: renamed from: h */
    public final Object m584h(int r5) {
        ((AbstractList) this).modCount++;
        Object[] r02 = this.f419a;
        Object r1 = r02[r5];
        AbstractC0179j.m533j0(r02, r02, r5, r5 + 1, this.f420b);
        Object[] r52 = this.f419a;
        int r03 = this.f420b - 1;
        AbstractC0307g.m703e(r52, "<this>");
        r52[r03] = null;
        this.f420b--;
        return r1;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        Object[] r02 = this.f419a;
        int r1 = this.f420b;
        int r2 = 1;
        int r4 = 0;
    L3:
        if (r4 >= r1) goto L9;
        Object r5 = r02[r4];
        int r22 = r2 * 31;
        if (r5 == null) goto L7;
        int r52 = r5.hashCode();
    L8:
        r2 = r22 + r52;
        r4 = r4 + 1;
        goto L3
    L7:
        r52 = 0;
        goto L8
    L9:
        return r2;
    }

    /* JADX INFO: renamed from: i */
    public final void m585i(int r4, int r5) {
        if (r5 <= 0) goto L4;
        ((AbstractList) this).modCount++;
    L4:
        Object[] r02 = this.f419a;
        AbstractC0179j.m533j0(r02, r02, r4, r4 + r5, this.f420b);
        Object[] r42 = this.f419a;
        int r03 = this.f420b;
        int r1 = r03 - r5;
        AbstractC0307g.m703e(r42, "<this>");
    L5:
        if (r1 >= r03) goto L7;
        r42[r1] = null;
        r1 = r1 + 1;
        goto L5
    L7:
        this.f420b -= r5;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object r3) {
        int r02 = 0;
    L4:
        if (r02 >= this.f420b) goto L9;
        if (AbstractC0307g.m699a(this.f419a[r02], r3) == true) goto L7;
        r02 = r02 + 1;
        goto L4
    L7:
        return r02;
    L9:
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        if (this.f420b != 0) goto L5;
        return true;
    L5:
        return false;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    /* JADX INFO: renamed from: j */
    public final int m586j(int r6, int r7, Collection r8, boolean r9) {
        int r02 = 0;
        int r1 = 0;
    L3:
        if (r02 >= r7) goto L8;
        int r3 = r6 + r02;
        if (r8.contains(this.f419a[r3]) == r9) goto L6;
        r02 = r02 + 1;
        goto L3
    L6:
        Object[] r2 = this.f419a;
        r02 = r02 + 1;
        r2[r1 + r6] = r2[r3];
        r1 = r1 + 1;
        goto L3
    L8:
        int r82 = r7 - r1;
        Object[] r92 = this.f419a;
        AbstractC0179j.m533j0(r92, r92, r6 + r1, r7 + r6, this.f420b);
        Object[] r62 = this.f419a;
        int r72 = this.f420b;
        int r93 = r72 - r82;
        AbstractC0307g.m703e(r62, "<this>");
    L9:
        if (r93 >= r72) goto L11;
        r62[r93] = null;
        r93 = r93 + 1;
        goto L9
    L11:
        if (r82 <= 0) goto L13;
        ((AbstractList) this).modCount++;
    L13:
        this.f420b -= r82;
        return r82;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object r3) {
        int r02 = this.f420b - 1;
    L3:
        if (r02 < 0) goto L8;
        if (AbstractC0307g.m699a(this.f419a[r02], r3) == true) goto L6;
        r02 = r02 - 1;
        goto L3
    L6:
        return r02;
    L8:
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object r1) {
        m582f();
        int r12 = indexOf(r1);
        if (r12 < 0) goto L5;
        mo522b(r12);
    L5:
        if (r12 < 0) goto L7;
        return true;
    L7:
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection r3) {
        AbstractC0307g.m703e(r3, "elements");
        m582f();
        if (m586j(0, this.f420b, r3, false) <= 0) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection r4) {
        AbstractC0307g.m703e(r4, "elements");
        m582f();
        if (m586j(0, this.f420b, r4, true) > 0) goto L5;
        return false;
    L5:
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int r4, Object r5) {
        m582f();
        int r02 = this.f420b;
        if (r4 < 0) goto L8;
        if (r4 >= r02) goto L8;
        Object[] r03 = this.f419a;
        Object r1 = r03[r4];
        r03[r4] = r5;
        return r1;
    L8:
        throw new IndexOutOfBoundsException(AbstractC0324d.m721d("index: ", r4, ", size: ", r02));
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int r8, int r9) {
        AbstractC0040p.m107j(r8, r9, this.f420b);
        return new C0198b(this.f419a, r8, r9 - r8, null, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] r4) {
        AbstractC0307g.m703e(r4, "array");
        int r02 = r4.length;
        int r1 = this.f420b;
        if (r02 >= r1) goto L6;
        Object[] r42 = Arrays.copyOfRange(this.f419a, 0, r1, r4.getClass());
        AbstractC0307g.m702d(r42, "copyOfRange(...)");
        return r42;
    L6:
        AbstractC0179j.m533j0(this.f419a, r4, 0, 0, r1);
        AbstractC0040p.m95a0(this.f420b, r4);
        return r4;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return AbstractC0040p.m96b(this.f419a, 0, this.f420b, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int r5) {
        int r02 = this.f420b;
        if (r5 < 0) goto L8;
        if (r5 > r02) goto L8;
        return new C0197a(this, r5);
    L8:
        throw new IndexOutOfBoundsException(AbstractC0324d.m721d("index: ", r5, ", size: ", r02));
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int r4, Collection r5) {
        AbstractC0307g.m703e(r5, "elements");
        m582f();
        int r02 = this.f420b;
        if (r4 < 0) goto L11;
        if (r4 > r02) goto L11;
        int r03 = r5.size();
        m580d(r4, r5, r03);
        if (r03 <= 0) goto L8;
        return true;
    L8:
        return false;
    L11:
        throw new IndexOutOfBoundsException(AbstractC0324d.m721d("index: ", r4, ", size: ", r02));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        Object[] r02 = this.f419a;
        int r1 = this.f420b;
        AbstractC0307g.m703e(r02, "<this>");
        AbstractC0040p.m114s(r1, r02.length);
        Object[] r03 = Arrays.copyOfRange(r02, 0, r1);
        AbstractC0307g.m702d(r03, "copyOfRange(...)");
        return r03;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int r4, Object r5) {
        m582f();
        int r02 = this.f420b;
        if (r4 < 0) goto L8;
        if (r4 > r02) goto L8;
        ((AbstractList) this).modCount++;
        m583g(r4, 1);
        this.f419a[r4] = r5;
        return;
    L8:
        throw new IndexOutOfBoundsException(AbstractC0324d.m721d("index: ", r4, ", size: ", r02));
    }
}
