package p016b1;

import java.util.Iterator;
import java.util.Map;
import p036c9.InterfaceC1400a;

/* JADX INFO: renamed from: b1.i */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C0913i implements Iterator, InterfaceC1400a {

    /* JADX INFO: renamed from: q */
    public final C0911g f2875q;

    public C0913i(C0910f c0910f) {
        AbstractC0925u[] abstractC0925uArr = new AbstractC0925u[8];
        for (int i10 = 0; i10 < 8; i10++) {
            abstractC0925uArr[i10] = new C0929y(this);
        }
        this.f2875q = new C0911g(c0910f, abstractC0925uArr);
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public Map.Entry next() {
        return (Map.Entry) this.f2875q.next();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f2875q.hasNext();
    }

    /* JADX INFO: renamed from: l */
    public final void m3352l(Object obj, Object obj2) {
        this.f2875q.m3349C(obj, obj2);
    }

    @Override // java.util.Iterator
    public void remove() {
        this.f2875q.remove();
    }
}
