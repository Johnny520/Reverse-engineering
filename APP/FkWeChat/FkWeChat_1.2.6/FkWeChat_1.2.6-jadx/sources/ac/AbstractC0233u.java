package ac;

import java.util.Iterator;
import p036c9.InterfaceC1400a;
import p052dc.AbstractC1943a;

/* JADX INFO: renamed from: ac.u */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0233u implements Iterator, InterfaceC1400a {

    /* JADX INFO: renamed from: q */
    public Object[] f588q = C0232t.f580e.m557a().m548r();

    /* JADX INFO: renamed from: r */
    public int f589r;

    /* JADX INFO: renamed from: s */
    public int f590s;

    /* JADX INFO: renamed from: A */
    public final void m561A() {
        AbstractC1943a.m7049a(m570y());
        this.f590s++;
    }

    /* JADX INFO: renamed from: B */
    public final void m562B(Object[] objArr, int i10) {
        objArr.getClass();
        m563C(objArr, i10, 0);
    }

    /* JADX INFO: renamed from: C */
    public final void m563C(Object[] objArr, int i10, int i11) {
        objArr.getClass();
        this.f588q = objArr;
        this.f589r = i10;
        this.f590s = i11;
    }

    /* JADX INFO: renamed from: D */
    public final void m564D(int i10) {
        this.f590s = i10;
    }

    /* JADX INFO: renamed from: g */
    public final Object m565g() {
        AbstractC1943a.m7049a(m569x());
        return this.f588q[this.f590s];
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return m569x();
    }

    /* JADX INFO: renamed from: l */
    public final C0232t m566l() {
        AbstractC1943a.m7049a(m570y());
        Object obj = this.f588q[this.f590s];
        obj.getClass();
        return (C0232t) obj;
    }

    /* JADX INFO: renamed from: o */
    public final Object[] m567o() {
        return this.f588q;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX INFO: renamed from: v */
    public final int m568v() {
        return this.f590s;
    }

    /* JADX INFO: renamed from: x */
    public final boolean m569x() {
        return this.f590s < this.f589r;
    }

    /* JADX INFO: renamed from: y */
    public final boolean m570y() {
        AbstractC1943a.m7049a(this.f590s >= this.f589r);
        return this.f590s < this.f588q.length;
    }

    /* JADX INFO: renamed from: z */
    public final void m571z() {
        AbstractC1943a.m7049a(m569x());
        this.f590s += 2;
    }
}
