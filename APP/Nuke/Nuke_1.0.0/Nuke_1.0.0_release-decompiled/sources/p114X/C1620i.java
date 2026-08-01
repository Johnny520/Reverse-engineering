package p114X;

import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: X.i */
/* JADX INFO: loaded from: classes.dex */
public final class C1620i extends AbstractC1612a {

    /* JADX INFO: renamed from: f */
    public final C1618g f5574f;

    /* JADX INFO: renamed from: g */
    public int f5575g;

    /* JADX INFO: renamed from: h */
    public C1622k f5576h;

    /* JADX INFO: renamed from: i */
    public int f5577i;

    public C1620i(C1618g c1618g, int i5) {
        super(i5, c1618g.f5571k);
        this.f5574f = c1618g;
        this.f5575g = c1618g.m2900e();
        this.f5577i = -1;
        m2923b();
    }

    /* JADX INFO: renamed from: a */
    public final void m2922a() {
        if (this.f5575g != this.f5574f.m2900e()) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // p114X.AbstractC1612a, java.util.ListIterator
    public final void add(Object obj) {
        m2922a();
        int i5 = this.f5553d;
        C1618g c1618g = this.f5574f;
        c1618g.add(i5, obj);
        this.f5553d++;
        this.f5554e = c1618g.mo1976a();
        this.f5575g = c1618g.m2900e();
        this.f5577i = -1;
        m2923b();
    }

    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX INFO: renamed from: b */
    public final void m2923b() {
        C1618g c1618g = this.f5574f;
        Object[] objArr = c1618g.f5569i;
        if (objArr == null) {
            this.f5576h = null;
            return;
        }
        int i5 = (c1618g.f5571k - 1) & (-32);
        int i6 = this.f5553d;
        if (i6 > i5) {
            i6 = i5;
        }
        int i7 = (c1618g.f5567g / 5) + 1;
        C1622k c1622k = this.f5576h;
        if (c1622k == null) {
            this.f5576h = new C1622k(objArr, i6, i5, i7);
            return;
        }
        c1622k.f5553d = i6;
        c1622k.f5554e = i5;
        c1622k.f5580f = i7;
        if (c1622k.f5581g.length < i7) {
            c1622k.f5581g = new Object[i7];
        }
        c1622k.f5581g[0] = objArr;
        ?? r6 = i6 == i5 ? 1 : 0;
        c1622k.f5582h = r6;
        c1622k.m2925b(i6 - r6, 1);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        m2922a();
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i5 = this.f5553d;
        this.f5577i = i5;
        C1622k c1622k = this.f5576h;
        C1618g c1618g = this.f5574f;
        if (c1622k == null) {
            Object[] objArr = c1618g.f5570j;
            this.f5553d = i5 + 1;
            return objArr[i5];
        }
        if (c1622k.hasNext()) {
            this.f5553d++;
            return c1622k.next();
        }
        Object[] objArr2 = c1618g.f5570j;
        int i6 = this.f5553d;
        this.f5553d = i6 + 1;
        return objArr2[i6 - c1622k.f5554e];
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        m2922a();
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i5 = this.f5553d;
        this.f5577i = i5 - 1;
        C1622k c1622k = this.f5576h;
        C1618g c1618g = this.f5574f;
        if (c1622k == null) {
            Object[] objArr = c1618g.f5570j;
            int i6 = i5 - 1;
            this.f5553d = i6;
            return objArr[i6];
        }
        int i7 = c1622k.f5554e;
        if (i5 <= i7) {
            this.f5553d = i5 - 1;
            return c1622k.previous();
        }
        Object[] objArr2 = c1618g.f5570j;
        int i8 = i5 - 1;
        this.f5553d = i8;
        return objArr2[i8 - i7];
    }

    @Override // p114X.AbstractC1612a, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        m2922a();
        int i5 = this.f5577i;
        if (i5 == -1) {
            throw new IllegalStateException();
        }
        C1618g c1618g = this.f5574f;
        c1618g.mo1977b(i5);
        int i6 = this.f5577i;
        if (i6 < this.f5553d) {
            this.f5553d = i6;
        }
        this.f5554e = c1618g.mo1976a();
        this.f5575g = c1618g.m2900e();
        this.f5577i = -1;
        m2923b();
    }

    @Override // p114X.AbstractC1612a, java.util.ListIterator
    public final void set(Object obj) {
        m2922a();
        int i5 = this.f5577i;
        if (i5 == -1) {
            throw new IllegalStateException();
        }
        C1618g c1618g = this.f5574f;
        c1618g.set(i5, obj);
        this.f5575g = c1618g.m2900e();
        m2923b();
    }
}
