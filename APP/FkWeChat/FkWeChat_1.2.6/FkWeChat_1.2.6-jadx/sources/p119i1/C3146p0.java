package p119i1;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import java.util.ListIterator;
import p036c9.InterfaceC1400a;
import p117i.C3039b;
import p215oc.C5706c;

/* JADX INFO: renamed from: i1.p0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C3146p0 implements ListIterator, InterfaceC1400a {

    /* JADX INFO: renamed from: q */
    public final SnapshotStateList f8391q;

    /* JADX INFO: renamed from: r */
    public int f8392r;

    /* JADX INFO: renamed from: s */
    public int f8393s = -1;

    /* JADX INFO: renamed from: t */
    public int f8394t;

    public C3146p0(SnapshotStateList snapshotStateList, int i10) {
        this.f8391q = snapshotStateList;
        this.f8392r = i10 - 1;
        this.f8394t = AbstractC3126f0.m11727h(snapshotStateList);
    }

    @Override // java.util.ListIterator
    public void add(Object obj) {
        m11839g();
        this.f8391q.add(this.f8392r + 1, obj);
        this.f8393s = -1;
        this.f8392r++;
        this.f8394t = AbstractC3126f0.m11727h(this.f8391q);
    }

    /* JADX INFO: renamed from: g */
    public final void m11839g() {
        if (AbstractC3126f0.m11727h(this.f8391q) == this.f8394t) {
            return;
        }
        C3039b.m11232a();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public boolean hasNext() {
        return this.f8392r < this.f8391q.size() - 1;
    }

    @Override // java.util.ListIterator
    public boolean hasPrevious() {
        return this.f8392r >= 0;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public Object next() {
        m11839g();
        int i10 = this.f8392r + 1;
        this.f8393s = i10;
        AbstractC3126f0.m11732m(i10, this.f8391q.size());
        Object obj = this.f8391q.get(i10);
        this.f8392r = i10;
        return obj;
    }

    @Override // java.util.ListIterator
    public int nextIndex() {
        return this.f8392r + 1;
    }

    @Override // java.util.ListIterator
    public Object previous() {
        m11839g();
        AbstractC3126f0.m11732m(this.f8392r, this.f8391q.size());
        int i10 = this.f8392r;
        this.f8393s = i10;
        this.f8392r--;
        return this.f8391q.get(i10);
    }

    @Override // java.util.ListIterator
    public int previousIndex() {
        return this.f8392r;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        m11839g();
        this.f8391q.remove(this.f8393s);
        this.f8392r--;
        this.f8393s = -1;
        this.f8394t = AbstractC3126f0.m11727h(this.f8391q);
    }

    @Override // java.util.ListIterator
    public void set(Object obj) {
        m11839g();
        int i10 = this.f8393s;
        if (i10 >= 0) {
            this.f8391q.set(i10, obj);
            this.f8394t = AbstractC3126f0.m11727h(this.f8391q);
        } else {
            AbstractC3126f0.m11728i();
            C5706c.m23089a();
        }
    }
}
