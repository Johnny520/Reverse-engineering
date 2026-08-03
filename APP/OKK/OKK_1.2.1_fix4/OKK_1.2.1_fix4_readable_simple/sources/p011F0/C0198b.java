package p011F0;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import p001A0.AbstractC0040p;
import p009E0.AbstractC0176g;
import p009E0.AbstractC0179j;
import p031Q0.AbstractC0307g;
import p034S.AbstractC0324d;

/* JADX INFO: renamed from: F0.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0198b extends AbstractC0176g implements RandomAccess, Serializable {

    /* JADX INFO: renamed from: a */
    public Object[] f413a;

    /* JADX INFO: renamed from: b */
    public final int f414b;

    /* JADX INFO: renamed from: c */
    public int f415c;

    /* JADX INFO: renamed from: d */
    public final C0198b f416d;

    /* JADX INFO: renamed from: e */
    public final C0199c f417e;

    public C0198b(Object[] r2, int r3, int r4, C0198b r5, C0199c r6) {
        AbstractC0307g.m703e(r2, "backing");
        AbstractC0307g.m703e(r6, "root");
        this.f413a = r2;
        this.f414b = r3;
        this.f415c = r4;
        this.f416d = r5;
        this.f417e = r6;
        ((AbstractList) this).modCount = C0199c.m579c(r6);
    }

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ int m571c(C0198b r02) {
        return ((AbstractList) r02).modCount;
    }

    @Override // p009E0.AbstractC0176g
    /* JADX INFO: renamed from: a */
    public final int mo521a() {
        m574f();
        return this.f415c;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object r3) {
        m575g();
        m574f();
        m573e(this.f414b + this.f415c, r3);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection r4) {
        AbstractC0307g.m703e(r4, "elements");
        m575g();
        m574f();
        int r02 = r4.size();
        m572d(this.f414b + this.f415c, r4, r02);
        if (r02 <= 0) goto L5;
        return true;
    L5:
        return false;
    }

    @Override // p009E0.AbstractC0176g
    /* JADX INFO: renamed from: b */
    public final Object mo522b(int r5) {
        m575g();
        m574f();
        int r02 = this.f415c;
        if (r5 < 0) goto L8;
        if (r5 >= r02) goto L8;
        return m576h(this.f414b + r5);
    L8:
        throw new IndexOutOfBoundsException(AbstractC0324d.m721d("index: ", r5, ", size: ", r02));
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        m575g();
        m574f();
        m577i(this.f414b, this.f415c);
    }

    /* JADX INFO: renamed from: d */
    public final void m572d(int r3, Collection r4, int r5) {
        ((AbstractList) this).modCount++;
        C0199c r02 = this.f417e;
        C0198b r1 = this.f416d;
        if (r1 == null) goto L5;
        r1.m572d(r3, r4, r5);
    L6:
        this.f413a = r02.f419a;
        this.f415c += r5;
        return;
    L5:
        C0199c r12 = C0199c.f418d;
        r02.m580d(r3, r4, r5);
        goto L6
    }

    /* JADX INFO: renamed from: e */
    public final void m573e(int r3, Object r4) {
        ((AbstractList) this).modCount++;
        C0199c r02 = this.f417e;
        C0198b r1 = this.f416d;
        if (r1 == null) goto L5;
        r1.m573e(r3, r4);
    L6:
        this.f413a = r02.f419a;
        this.f415c++;
        return;
    L5:
        C0199c r12 = C0199c.f418d;
        r02.m581e(r3, r4);
        goto L6
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object r4) {
        m574f();
        if (r4 != this) goto L5;
    L10:
        return true;
    L5:
        if ((r4 instanceof List) == false) goto L9;
        Object[] r02 = this.f413a;
        int r1 = this.f414b;
        int r2 = this.f415c;
        if (AbstractC0040p.m94a(r02, r1, r2, (List) r4) == true) goto L10;
    L9:
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final void m574f() {
        if (C0199c.m579c(this.f417e) != ((AbstractList) this).modCount) goto L6;
        return;
    L6:
        throw new ConcurrentModificationException();
    }

    /* JADX INFO: renamed from: g */
    public final void m575g() {
        if (this.f417e.f421c == true) goto L6;
        return;
    L6:
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int r5) {
        m574f();
        int r02 = this.f415c;
        if (r5 < 0) goto L8;
        if (r5 >= r02) goto L8;
        return this.f413a[this.f414b + r5];
    L8:
        throw new IndexOutOfBoundsException(AbstractC0324d.m721d("index: ", r5, ", size: ", r02));
    }

    /* JADX INFO: renamed from: h */
    public final Object m576h(int r2) {
        ((AbstractList) this).modCount++;
        C0198b r02 = this.f416d;
        if (r02 == null) goto L5;
        Object r22 = r02.m576h(r2);
    L6:
        this.f415c--;
        return r22;
    L5:
        C0199c r03 = C0199c.f418d;
        r22 = this.f417e.m584h(r2);
        goto L6
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        m574f();
        Object[] r02 = this.f413a;
        int r1 = this.f415c;
        int r2 = 1;
        int r4 = 0;
    L3:
        if (r4 >= r1) goto L9;
        Object r5 = r02[this.f414b + r4];
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
    public final void m577i(int r2, int r3) {
        if (r3 <= 0) goto L4;
        ((AbstractList) this).modCount++;
    L4:
        C0198b r02 = this.f416d;
        if (r02 == null) goto L7;
        r02.m577i(r2, r3);
    L8:
        this.f415c -= r3;
        return;
    L7:
        C0199c r03 = C0199c.f418d;
        this.f417e.m585i(r2, r3);
        goto L8
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object r4) {
        m574f();
        int r02 = 0;
    L4:
        if (r02 >= this.f415c) goto L9;
        if (AbstractC0307g.m699a(this.f413a[this.f414b + r02], r4) == true) goto L7;
        r02 = r02 + 1;
        goto L4
    L7:
        return r02;
    L9:
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        m574f();
        if (this.f415c != 0) goto L5;
        return true;
    L5:
        return false;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    /* JADX INFO: renamed from: j */
    public final int m578j(int r2, int r3, Collection r4, boolean r5) {
        C0198b r02 = this.f416d;
        if (r02 == null) goto L5;
        int r22 = r02.m578j(r2, r3, r4, r5);
    L6:
        if (r22 <= 0) goto L8;
        ((AbstractList) this).modCount++;
    L8:
        this.f415c -= r22;
        return r22;
    L5:
        C0199c r03 = C0199c.f418d;
        r22 = this.f417e.m586j(r2, r3, r4, r5);
        goto L6
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object r4) {
        m574f();
        int r02 = this.f415c - 1;
    L3:
        if (r02 < 0) goto L8;
        if (AbstractC0307g.m699a(this.f413a[this.f414b + r02], r4) == true) goto L6;
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
        m575g();
        m574f();
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
    public final boolean removeAll(Collection r4) {
        AbstractC0307g.m703e(r4, "elements");
        m575g();
        m574f();
        int r02 = this.f415c;
        if (m578j(this.f414b, r02, r4, false) <= 0) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection r4) {
        AbstractC0307g.m703e(r4, "elements");
        m575g();
        m574f();
        int r02 = this.f415c;
        if (m578j(this.f414b, r02, r4, true) > 0) goto L7;
        return false;
    L7:
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int r4, Object r5) {
        m575g();
        m574f();
        int r02 = this.f415c;
        if (r4 < 0) goto L8;
        if (r4 >= r02) goto L8;
        Object[] r03 = this.f413a;
        int r1 = this.f414b;
        Object r2 = r03[r1 + r4];
        r03[r1 + r4] = r5;
        return r2;
    L8:
        throw new IndexOutOfBoundsException(AbstractC0324d.m721d("index: ", r4, ", size: ", r02));
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int r8, int r9) {
        AbstractC0040p.m107j(r8, r9, this.f415c);
        return new C0198b(this.f413a, this.f414b + r8, r9 - r8, this, this.f417e);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] r5) {
        AbstractC0307g.m703e(r5, "array");
        m574f();
        int r02 = r5.length;
        int r1 = this.f415c;
        int r2 = this.f414b;
        if (r02 >= r1) goto L6;
        Object[] r52 = Arrays.copyOfRange(this.f413a, r2, r1 + r2, r5.getClass());
        AbstractC0307g.m702d(r52, "copyOfRange(...)");
        return r52;
    L6:
        AbstractC0179j.m533j0(this.f413a, r5, 0, r2, r1 + r2);
        AbstractC0040p.m95a0(this.f415c, r5);
        return r5;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        m574f();
        return AbstractC0040p.m96b(this.f413a, this.f414b, this.f415c, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int r5) {
        m574f();
        int r02 = this.f415c;
        if (r5 < 0) goto L8;
        if (r5 > r02) goto L8;
        return new C0197a(this, r5);
    L8:
        throw new IndexOutOfBoundsException(AbstractC0324d.m721d("index: ", r5, ", size: ", r02));
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int r4, Object r5) {
        m575g();
        m574f();
        int r02 = this.f415c;
        if (r4 < 0) goto L8;
        if (r4 > r02) goto L8;
        m573e(this.f414b + r4, r5);
        return;
    L8:
        throw new IndexOutOfBoundsException(AbstractC0324d.m721d("index: ", r4, ", size: ", r02));
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int r4, Collection r5) {
        AbstractC0307g.m703e(r5, "elements");
        m575g();
        m574f();
        int r02 = this.f415c;
        if (r4 < 0) goto L11;
        if (r4 > r02) goto L11;
        int r03 = r5.size();
        m572d(this.f414b + r4, r5, r03);
        if (r03 <= 0) goto L8;
        return true;
    L8:
        return false;
    L11:
        throw new IndexOutOfBoundsException(AbstractC0324d.m721d("index: ", r4, ", size: ", r02));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        m574f();
        Object[] r02 = this.f413a;
        int r1 = this.f415c;
        int r2 = this.f414b;
        int r12 = r1 + r2;
        AbstractC0307g.m703e(r02, "<this>");
        AbstractC0040p.m114s(r12, r02.length);
        Object[] r03 = Arrays.copyOfRange(r02, r2, r12);
        AbstractC0307g.m702d(r03, "copyOfRange(...)");
        return r03;
    }
}
