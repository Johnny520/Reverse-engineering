package p304uf;

import bsh.C0353j;
import java.util.AbstractList;
import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import p069f.C0933f0;
import p114hg.InterfaceC1711a;
import p136j8.C2104o;
import p322w0.AbstractC4666q;
import p322w0.C4665p;
import p339x1.C5633p;
import p356y0.AbstractC5852n;

/* JADX INFO: renamed from: uf.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4327a implements ListIterator, InterfaceC1711a {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f14457g;

    /* JADX INFO: renamed from: h */
    public int f14458h;

    /* JADX INFO: renamed from: i */
    public int f14459i;

    /* JADX INFO: renamed from: j */
    public int f14460j;

    /* JADX INFO: renamed from: k */
    public final Object f14461k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4327a(C4665p c4665p, int i9) {
        this.f14457g = 2;
        this.f14461k = c4665p;
        this.f14458h = i9 - 1;
        this.f14459i = -1;
        this.f14460j = AbstractC4666q.m9150g(c4665p);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public void m8721a() {
        if (((AbstractList) ((C4328b) this.f14461k).f14466k).modCount != this.f14460j) {
            throw new ConcurrentModificationException();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ListIterator
    public final void add(Object obj) {
        switch (this.f14457g) {
            case 0:
                m8721a();
                C4328b c4328b = (C4328b) this.f14461k;
                int i9 = this.f14458h;
                this.f14458h = i9 + 1;
                c4328b.add(i9, obj);
                this.f14459i = -1;
                this.f14460j = ((AbstractList) c4328b).modCount;
                return;
            case 1:
                m8722c();
                C4329c c4329c = (C4329c) this.f14461k;
                int i10 = this.f14458h;
                this.f14458h = i10 + 1;
                c4329c.add(i10, obj);
                this.f14459i = -1;
                this.f14460j = ((AbstractList) c4329c).modCount;
                return;
            case 2:
                m8723d();
                C4665p c4665p = (C4665p) this.f14461k;
                c4665p.add(this.f14458h + 1, obj);
                this.f14459i = -1;
                this.f14458h++;
                this.f14460j = AbstractC4666q.m9150g(c4665p);
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public void m8722c() {
        if (((AbstractList) ((C4329c) this.f14461k)).modCount != this.f14460j) {
            throw new ConcurrentModificationException();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public void m8723d() {
        if (AbstractC4666q.m9150g((C4665p) this.f14461k) != this.f14460j) {
            throw new ConcurrentModificationException();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        switch (this.f14457g) {
            case 0:
                return this.f14458h < ((C4328b) this.f14461k).f14464i;
            case 1:
                return this.f14458h < ((C4329c) this.f14461k).f14469h;
            case 2:
                return this.f14458h < ((C4665p) this.f14461k).size() - 1;
            default:
                return this.f14458h < this.f14460j;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.f14457g) {
            case 0:
                if (this.f14458h > 0) {
                }
                break;
            case 1:
                if (this.f14458h > 0) {
                }
                break;
            case 2:
                if (this.f14458h >= 0) {
                }
                break;
            default:
                if (this.f14458h > this.f14459i) {
                }
                break;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.f14457g) {
            case 0:
                m8721a();
                int i9 = this.f14458h;
                C4328b c4328b = (C4328b) this.f14461k;
                if (i9 >= c4328b.f14464i) {
                    C0353j.m1307e();
                    return null;
                }
                this.f14458h = i9 + 1;
                this.f14459i = i9;
                return c4328b.f14462g[c4328b.f14463h + i9];
            case 1:
                m8722c();
                int i10 = this.f14458h;
                C4329c c4329c = (C4329c) this.f14461k;
                if (i10 >= c4329c.f14469h) {
                    C0353j.m1307e();
                    return null;
                }
                this.f14458h = i10 + 1;
                this.f14459i = i10;
                return c4329c.f14468g[i10];
            case 2:
                m8723d();
                int i11 = this.f14458h + 1;
                this.f14459i = i11;
                C4665p c4665p = (C4665p) this.f14461k;
                AbstractC4666q.m9145a(i11, c4665p.size());
                Object obj = c4665p.get(i11);
                this.f14458h = i11;
                return obj;
            default:
                C0933f0 c0933f0 = ((C5633p) this.f14461k).f22940g;
                int i12 = this.f14458h;
                this.f14458h = i12 + 1;
                Object objM2291f = c0933f0.m2291f(i12);
                objM2291f.getClass();
                return (AbstractC5852n) objM2291f;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.f14457g) {
            case 0:
                return this.f14458h;
            case 1:
                return this.f14458h;
            case 2:
                return this.f14458h + 1;
            default:
                return this.f14458h - this.f14459i;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.f14457g) {
            case 0:
                m8721a();
                int i9 = this.f14458h;
                if (i9 <= 0) {
                    C0353j.m1307e();
                    return null;
                }
                int i10 = i9 - 1;
                this.f14458h = i10;
                this.f14459i = i10;
                C4328b c4328b = (C4328b) this.f14461k;
                return c4328b.f14462g[c4328b.f14463h + i10];
            case 1:
                m8722c();
                int i11 = this.f14458h;
                if (i11 <= 0) {
                    C0353j.m1307e();
                    return null;
                }
                int i12 = i11 - 1;
                this.f14458h = i12;
                this.f14459i = i12;
                return ((C4329c) this.f14461k).f14468g[i12];
            case 2:
                m8723d();
                int i13 = this.f14458h;
                C4665p c4665p = (C4665p) this.f14461k;
                AbstractC4666q.m9145a(i13, c4665p.size());
                int i14 = this.f14458h;
                this.f14459i = i14;
                this.f14458h--;
                return c4665p.get(i14);
            default:
                C0933f0 c0933f0 = ((C5633p) this.f14461k).f22940g;
                int i15 = this.f14458h - 1;
                this.f14458h = i15;
                Object objM2291f = c0933f0.m2291f(i15);
                objM2291f.getClass();
                return (AbstractC5852n) objM2291f;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ListIterator
    public final int previousIndex() {
        int i9;
        switch (this.f14457g) {
            case 0:
                i9 = this.f14458h;
                break;
            case 1:
                i9 = this.f14458h;
                break;
            case 2:
                return this.f14458h;
            default:
                i9 = this.f14458h - this.f14459i;
                break;
        }
        return i9 - 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        switch (this.f14457g) {
            case 0:
                C4328b c4328b = (C4328b) this.f14461k;
                m8721a();
                int i9 = this.f14459i;
                if (i9 == -1) {
                    C2104o.m5276A("Call next() or previous() before removing element from the iterator.");
                    return;
                }
                c4328b.mo6458c(i9);
                this.f14458h = this.f14459i;
                this.f14459i = -1;
                this.f14460j = ((AbstractList) c4328b).modCount;
                return;
            case 1:
                C4329c c4329c = (C4329c) this.f14461k;
                m8722c();
                int i10 = this.f14459i;
                if (i10 == -1) {
                    C2104o.m5276A("Call next() or previous() before removing element from the iterator.");
                    return;
                }
                c4329c.mo6458c(i10);
                this.f14458h = this.f14459i;
                this.f14459i = -1;
                this.f14460j = ((AbstractList) c4329c).modCount;
                return;
            case 2:
                m8723d();
                C4665p c4665p = (C4665p) this.f14461k;
                c4665p.remove(this.f14459i);
                this.f14458h--;
                this.f14459i = -1;
                this.f14460j = AbstractC4666q.m9150g(c4665p);
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ListIterator
    public final void set(Object obj) {
        switch (this.f14457g) {
            case 0:
                m8721a();
                int i9 = this.f14459i;
                if (i9 != -1) {
                    ((C4328b) this.f14461k).set(i9, obj);
                    return;
                } else {
                    C2104o.m5276A("Call next() or previous() before replacing element from the iterator.");
                    return;
                }
            case 1:
                m8722c();
                int i10 = this.f14459i;
                if (i10 != -1) {
                    ((C4329c) this.f14461k).set(i10, obj);
                    return;
                } else {
                    C2104o.m5276A("Call next() or previous() before replacing element from the iterator.");
                    return;
                }
            case 2:
                C4665p c4665p = (C4665p) this.f14461k;
                m8723d();
                int i11 = this.f14459i;
                if (i11 < 0) {
                    C2104o.m5276A("Cannot call set before the first call to next() or previous() or immediately after a call to add() or remove()");
                    return;
                } else {
                    c4665p.set(i11, obj);
                    this.f14460j = AbstractC4666q.m9150g(c4665p);
                    return;
                }
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C4327a(C4329c c4329c, int i9) {
        this.f14457g = 1;
        this.f14461k = c4329c;
        this.f14458h = i9;
        this.f14459i = -1;
        this.f14460j = ((AbstractList) c4329c).modCount;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C4327a(C5633p c5633p, int i9, int i10) {
        this(c5633p, (i10 & 1) != 0 ? 0 : i9, 0, c5633p.f22940g.f2924b);
        this.f14457g = 3;
    }

    public C4327a(C5633p c5633p, int i9, int i10, int i11) {
        this.f14457g = 3;
        this.f14461k = c5633p;
        this.f14458h = i9;
        this.f14459i = i10;
        this.f14460j = i11;
    }

    public C4327a(C4328b c4328b, int i9) {
        this.f14457g = 0;
        this.f14461k = c4328b;
        this.f14458h = i9;
        this.f14459i = -1;
        this.f14460j = ((AbstractList) c4328b).modCount;
    }
}
