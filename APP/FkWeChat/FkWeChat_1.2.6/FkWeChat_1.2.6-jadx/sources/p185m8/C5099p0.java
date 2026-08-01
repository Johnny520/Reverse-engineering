package p185m8;

import java.util.Iterator;
import p036c9.InterfaceC1400a;

/* JADX INFO: renamed from: m8.p0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C5099p0 implements Iterator, InterfaceC1400a {

    /* JADX INFO: renamed from: q */
    public final Iterator f15413q;

    /* JADX INFO: renamed from: r */
    public int f15414r;

    public C5099p0(Iterator it) {
        it.getClass();
        this.f15413q = it;
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final C5095n0 next() {
        int i10 = this.f15414r;
        this.f15414r = i10 + 1;
        if (i10 < 0) {
            AbstractC5114x.m20810y();
        }
        return new C5095n0(i10, this.f15413q.next());
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f15413q.hasNext();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
