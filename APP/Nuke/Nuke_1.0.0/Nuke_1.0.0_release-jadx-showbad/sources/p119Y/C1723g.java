package p119Y;

import java.util.Iterator;
import java.util.Map;
import p122Y2.InterfaceC1766a;
import p136b0.C1846h;
import p245u0.AbstractC3301H;
import p245u0.C3299F;

/* JADX INFO: renamed from: Y.g */
/* JADX INFO: loaded from: classes.dex */
public final class C1723g implements Iterator, InterfaceC1766a {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f5970d = 0;

    /* JADX INFO: renamed from: e */
    public final Iterator f5971e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1723g(C1846h c1846h) {
        AbstractC1729m[] abstractC1729mArr = new AbstractC1729m[8];
        for (int i5 = 0; i5 < 8; i5++) {
            abstractC1729mArr[i5] = new C1731o(this);
        }
        this.f5971e = new C1721e(c1846h, abstractC1729mArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f5970d) {
            case 0:
                return ((C1721e) this.f5971e).f5963f;
            default:
                return this.f5971e.hasNext();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f5970d) {
            case 0:
                return (Map.Entry) ((C1721e) this.f5971e).next();
            default:
                return (AbstractC3301H) this.f5971e.next();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f5970d) {
            case 0:
                ((C1721e) this.f5971e).remove();
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C1723g(C3299F c3299f) {
        this.f5971e = c3299f.f10207m.iterator();
    }
}
