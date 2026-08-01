package p025bc;

import java.util.Iterator;
import java.util.Map;
import p036c9.InterfaceC1400a;

/* JADX INFO: renamed from: bc.f */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1095f implements Iterator, InterfaceC1400a {

    /* JADX INFO: renamed from: q */
    public final C1098i f3317q;

    public C1095f(C1093d c1093d) {
        c1093d.getClass();
        this.f3317q = new C1098i(c1093d.m3989j(), c1093d);
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public Map.Entry next() {
        return new C1091b(this.f3317q.m4000v().m3990l(), this.f3317q.m4001x(), this.f3317q.next());
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f3317q.hasNext();
    }

    @Override // java.util.Iterator
    public void remove() {
        this.f3317q.remove();
    }
}
