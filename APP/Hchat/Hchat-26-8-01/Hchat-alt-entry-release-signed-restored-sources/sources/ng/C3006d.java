package ng;

import bsh.C0353j;
import java.util.Iterator;
import p000a.AbstractC0000a;
import p114hg.InterfaceC1711a;
import tf.C4176w;

/* JADX INFO: renamed from: ng.d */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3006d implements Iterator, InterfaceC1711a {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f9793g = 2;

    /* JADX INFO: renamed from: h */
    public int f9794h;

    /* JADX INFO: renamed from: i */
    public final Iterator f9795i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3006d(C3007e c3007e, byte b10) {
        this.f9794h = c3007e.f9798c;
        this.f9795i = c3007e.f9797b.iterator();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        Iterator it;
        switch (this.f9793g) {
            case 0:
                break;
            case 1:
                return this.f9794h > 0 && this.f9795i.hasNext();
            default:
                return this.f9795i.hasNext();
        }
        while (true) {
            int i9 = this.f9794h;
            it = this.f9795i;
            if (i9 > 0 && it.hasNext()) {
                it.next();
                this.f9794h--;
            }
        }
        return it.hasNext();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final Object next() {
        Iterator it;
        switch (this.f9793g) {
            case 0:
                break;
            case 1:
                int i9 = this.f9794h;
                if (i9 != 0) {
                    this.f9794h = i9 - 1;
                    return this.f9795i.next();
                }
                C0353j.m1307e();
                return null;
            default:
                int i10 = this.f9794h;
                this.f9794h = i10 + 1;
                if (i10 >= 0) {
                    return new C4176w(i10, this.f9795i.next());
                }
                AbstractC0000a.m32Q0();
                throw null;
        }
        while (true) {
            int i11 = this.f9794h;
            it = this.f9795i;
            if (i11 > 0 && it.hasNext()) {
                it.next();
                this.f9794h--;
            }
        }
        return it.next();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f9793g) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C3006d(Iterator it) {
        it.getClass();
        this.f9795i = it;
    }

    public C3006d(C3007e c3007e) {
        this.f9795i = c3007e.f9797b.iterator();
        this.f9794h = c3007e.f9798c;
    }
}
