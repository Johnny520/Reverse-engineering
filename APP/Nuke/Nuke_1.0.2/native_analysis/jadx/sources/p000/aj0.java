package p000;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class aj0 implements Iterator, q41 {

    /* JADX INFO: renamed from: h */
    public final Iterator f223h;

    /* JADX INFO: renamed from: i */
    public int f224i = -1;

    /* JADX INFO: renamed from: j */
    public Object f225j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ bj0 f226k;

    public aj0(bj0 bj0Var) {
        this.f226k = bj0Var;
        this.f223h = bj0Var.f893b.iterator();
    }

    /* JADX INFO: renamed from: a */
    public final void m173a() {
        Object next;
        do {
            Iterator it = this.f223h;
            if (!it.hasNext()) {
                this.f224i = 0;
                return;
            }
            next = it.next();
        } while (!((Boolean) this.f226k.f894c.mo5j(next)).booleanValue());
        this.f225j = next;
        this.f224i = 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f224i == -1) {
            m173a();
        }
        return this.f224i == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f224i == -1) {
            m173a();
        }
        if (this.f224i == 0) {
            um2.m5513b();
            return null;
        }
        Object obj = this.f225j;
        this.f225j = null;
        this.f224i = -1;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
