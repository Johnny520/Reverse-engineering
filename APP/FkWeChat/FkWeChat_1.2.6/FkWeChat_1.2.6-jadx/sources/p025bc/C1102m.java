package p025bc;

import ac.C0214b;
import java.util.Iterator;
import java.util.Map;
import p036c9.InterfaceC1400a;

/* JADX INFO: renamed from: bc.m */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1102m implements Iterator, InterfaceC1400a {

    /* JADX INFO: renamed from: q */
    public final C1105p f3329q;

    public C1102m(C1092c c1092c) {
        c1092c.getClass();
        this.f3329q = new C1105p(c1092c.m3976r(), c1092c.m3977s());
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public Map.Entry next() {
        return new C0214b(this.f3329q.m4005g(), this.f3329q.next().m3970e());
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f3329q.hasNext();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
