package p000;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ou2 implements Iterator, q41 {

    /* JADX INFO: renamed from: h */
    public final rs2 f7849h;

    /* JADX INFO: renamed from: i */
    public final Iterator f7850i;

    /* JADX INFO: renamed from: j */
    public int f7851j;

    /* JADX INFO: renamed from: k */
    public Map.Entry f7852k;

    /* JADX INFO: renamed from: l */
    public Map.Entry f7853l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ int f7854m;

    public ou2(rs2 rs2Var, Iterator it, int i) {
        this.f7854m = i;
        this.f7849h = rs2Var;
        this.f7850i = it;
        this.f7851j = rs2Var.m4616e().f9157d;
        m3641a();
    }

    /* JADX INFO: renamed from: a */
    public final void m3641a() {
        this.f7852k = this.f7853l;
        Iterator it = this.f7850i;
        this.f7853l = it.hasNext() ? (Map.Entry) it.next() : null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f7853l != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f7854m) {
            case 0:
                m3641a();
                if (this.f7852k != null) {
                    return new nu2(this);
                }
                throw new IllegalStateException();
            case 1:
                Map.Entry entry = this.f7853l;
                if (entry == null) {
                    throw new IllegalStateException();
                }
                m3641a();
                return entry.getKey();
            default:
                Map.Entry entry2 = this.f7853l;
                if (entry2 == null) {
                    throw new IllegalStateException();
                }
                m3641a();
                return entry2.getValue();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        rs2 rs2Var = this.f7849h;
        if (rs2Var.m4616e().f9157d != this.f7851j) {
            throw new ConcurrentModificationException();
        }
        Map.Entry entry = this.f7852k;
        if (entry == null) {
            throw new IllegalStateException();
        }
        rs2Var.remove(entry.getKey());
        this.f7852k = null;
        this.f7851j = rs2Var.m4616e().f9157d;
    }
}
