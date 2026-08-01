package ac;

import java.util.Iterator;
import java.util.Map;
import p036c9.InterfaceC1400a;

/* JADX INFO: renamed from: ac.i */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0221i implements Iterator, InterfaceC1400a {

    /* JADX INFO: renamed from: q */
    public final C0219g f574q;

    public C0221i(C0218f c0218f) {
        c0218f.getClass();
        AbstractC0233u[] abstractC0233uArr = new AbstractC0233u[8];
        for (int i10 = 0; i10 < 8; i10++) {
            abstractC0233uArr[i10] = new C0237y(this);
        }
        this.f574q = new C0219g(c0218f, abstractC0233uArr);
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public Map.Entry next() {
        return (Map.Entry) this.f574q.next();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f574q.hasNext();
    }

    /* JADX INFO: renamed from: l */
    public final void m503l(Object obj, Object obj2) {
        this.f574q.m499E(obj, obj2);
    }

    @Override // java.util.Iterator
    public void remove() {
        this.f574q.remove();
    }
}
