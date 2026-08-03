package p176m1;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Map;
import p114hg.InterfaceC1711a;
import p223p0.AbstractC3283k;
import p223p0.C3276d;
import p223p0.C3285m;
import p266s0.C3877g;

/* JADX INFO: renamed from: m1.f0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2731f0 implements Iterator, InterfaceC1711a {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f8874g = 2;

    /* JADX INFO: renamed from: h */
    public final Object f8875h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2731f0(C3877g c3877g) {
        AbstractC3283k[] abstractC3283kArr = new AbstractC3283k[8];
        for (int i9 = 0; i9 < 8; i9++) {
            abstractC3283kArr[i9] = new C3285m(this);
        }
        this.f8875h = new C3276d(c3877g, abstractC3283kArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f8874g) {
            case 0:
                return ((Iterator) this.f8875h).hasNext();
            case 1:
                return ((C3276d) this.f8875h).f10428i;
            default:
                return ((Enumeration) this.f8875h).hasMoreElements();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f8874g) {
            case 0:
                return (AbstractC2737i0) ((Iterator) this.f8875h).next();
            case 1:
                return (Map.Entry) ((C3276d) this.f8875h).next();
            default:
                return ((Enumeration) this.f8875h).nextElement();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f8874g) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                ((C3276d) this.f8875h).remove();
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C2731f0(Enumeration enumeration) {
        this.f8875h = enumeration;
    }

    public C2731f0(C2733g0 c2733g0) {
        this.f8875h = c2733g0.f8888p.iterator();
    }
}
