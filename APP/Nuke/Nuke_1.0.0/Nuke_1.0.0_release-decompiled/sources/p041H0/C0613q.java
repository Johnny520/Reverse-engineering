package p041H0;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import p061L2.AbstractC0972l;
import p117X2.AbstractC1664i;
import p117X2.AbstractC1665j;
import p122Y2.InterfaceC1766a;
import p169h0.AbstractC2206o;
import p179i4.AbstractC2352g;
import p186k.C2404A;
import p186k.C2441w;
import p192l.AbstractC2477a;

/* JADX INFO: renamed from: H0.q */
/* JADX INFO: loaded from: classes.dex */
public final class C0613q implements List, InterfaceC1766a {

    /* JADX INFO: renamed from: d */
    public final C2404A f1966d = new C2404A(16);

    /* JADX INFO: renamed from: e */
    public final C2441w f1967e = new C2441w(16);

    /* JADX INFO: renamed from: f */
    public int f1968f = -1;

    /* JADX WARN: Code restructure failed: missing block: B:20:0x003d, code lost:
    
        p192l.AbstractC2477a.m4423d("Index must be between 0 and size");
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0043, code lost:
    
        throw null;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long m1055a() {
        /*
            r7 = this;
            r0 = 2139095040(0x7f800000, float:Infinity)
            r1 = 0
            long r0 = p041H0.AbstractC0601k.m1025a(r0, r1, r1)
            int r2 = r7.f1968f
            int r2 = r2 + 1
            int r3 = p179i4.AbstractC2352g.m4208u(r7)
            if (r2 > r3) goto L44
        L11:
            k.w r4 = r7.f1967e
            if (r2 < 0) goto L3a
            int r5 = r4.f7886b
            if (r2 >= r5) goto L3d
            long[] r4 = r4.f7885a
            r5 = r4[r2]
            int r4 = p041H0.AbstractC0601k.m1031g(r5, r0)
            if (r4 >= 0) goto L24
            r0 = r5
        L24:
            float r4 = p041H0.AbstractC0601k.m1033i(r0)
            r5 = 0
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 >= 0) goto L34
            boolean r4 = p041H0.AbstractC0601k.m1038n(r0)
            if (r4 == 0) goto L34
            goto L39
        L34:
            if (r2 == r3) goto L39
            int r2 = r2 + 1
            goto L11
        L39:
            return r0
        L3a:
            r4.getClass()
        L3d:
            java.lang.String r0 = "Index must be between 0 and size"
            p192l.AbstractC2477a.m4423d(r0)
            r0 = 0
            throw r0
        L44:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p041H0.C0613q.m1055a():long");
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ void add(int i5, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i5, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ void addFirst(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ void addLast(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX INFO: renamed from: b */
    public final void m1056b(int i5, int i6) {
        if (i5 >= i6) {
            return;
        }
        this.f1966d.m4254l(i5, i6);
        C2441w c2441w = this.f1967e;
        if (i5 >= 0) {
            int i7 = c2441w.f7886b;
            if (i5 <= i7 && i6 >= 0 && i6 <= i7) {
                if (i6 < i5) {
                    AbstractC2477a.m4422c("The end index must be < start index");
                    throw null;
                }
                if (i6 != i5) {
                    if (i6 < i7) {
                        long[] jArr = c2441w.f7885a;
                        AbstractC0972l.m1992P(jArr, jArr, i5, i6, i7);
                    }
                    c2441w.f7886b -= i6 - i5;
                    return;
                }
                return;
            }
        } else {
            c2441w.getClass();
        }
        AbstractC2477a.m4423d("Index must be between 0 and size");
        throw null;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.f1968f = -1;
        this.f1966d.m4246d();
        this.f1967e.f7886b = 0;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return (obj instanceof AbstractC2206o) && indexOf((AbstractC2206o) obj) != -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains((AbstractC2206o) it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i5) {
        Object objM4248f = this.f1966d.m4248f(i5);
        AbstractC1665j.m2983c(objM4248f, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
        return (AbstractC2206o) objM4248f;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof AbstractC2206o)) {
            return -1;
        }
        AbstractC2206o abstractC2206o = (AbstractC2206o) obj;
        int iM4208u = AbstractC2352g.m4208u(this);
        if (iM4208u >= 0) {
            int i5 = 0;
            while (!AbstractC1665j.m2981a(this.f1966d.m4248f(i5), abstractC2206o)) {
                if (i5 != iM4208u) {
                    i5++;
                }
            }
            return i5;
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f1966d.m4250h();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C0609o(this, 0, 7);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof AbstractC2206o)) {
            return -1;
        }
        AbstractC2206o abstractC2206o = (AbstractC2206o) obj;
        for (int iM4208u = AbstractC2352g.m4208u(this); -1 < iM4208u; iM4208u--) {
            if (AbstractC1665j.m2981a(this.f1966d.m4248f(iM4208u), abstractC2206o)) {
                return iM4208u;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new C0609o(this, 0, 7);
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i5) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ Object removeFirst() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ Object removeLast() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final void replaceAll(UnaryOperator unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i5, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f1966d.f7767b;
    }

    @Override // java.util.List
    public final void sort(Comparator comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final List subList(int i5, int i6) {
        return new C0611p(this, i5, i6);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return AbstractC1664i.m2979a(this);
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i5) {
        return new C0609o(this, i5, 6);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return AbstractC1664i.m2980b(this, objArr);
    }
}
