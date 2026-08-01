package p025bc;

import java.util.Iterator;
import p036c9.InterfaceC1400a;

/* JADX INFO: renamed from: bc.k */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1100k implements Iterator, InterfaceC1400a {

    /* JADX INFO: renamed from: q */
    public final C1098i f3327q;

    public C1100k(C1093d c1093d) {
        c1093d.getClass();
        this.f3327q = new C1098i(c1093d.m3989j(), c1093d);
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f3327q.hasNext();
    }

    @Override // java.util.Iterator
    public Object next() {
        return this.f3327q.next().m3970e();
    }

    @Override // java.util.Iterator
    public void remove() {
        this.f3327q.remove();
    }
}
