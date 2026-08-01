package ad;

import java.util.Iterator;
import p036c9.InterfaceC1400a;
import p300uc.InterfaceC8645a;
import p375zc.AbstractC9939c;

/* JADX INFO: renamed from: ad.f0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0255f0 implements Iterator, InterfaceC1400a {

    /* JADX INFO: renamed from: q */
    public final AbstractC9939c f632q;

    /* JADX INFO: renamed from: r */
    public final C0295w0 f633r;

    /* JADX INFO: renamed from: s */
    public final InterfaceC8645a f634s;

    public C0255f0(AbstractC9939c abstractC9939c, C0295w0 c0295w0, InterfaceC8645a interfaceC8645a) {
        abstractC9939c.getClass();
        c0295w0.getClass();
        interfaceC8645a.getClass();
        this.f632q = abstractC9939c;
        this.f633r = c0295w0;
        this.f634s = interfaceC8645a;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f633r.m593E();
    }

    @Override // java.util.Iterator
    public Object next() {
        return new C0301z0(this.f632q, EnumC0268j1.f652s, this.f633r, this.f634s.mo15953a(), null).mo660D(this.f634s);
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
