package kotlin.collections;

import java.util.Iterator;
import kotlin.sequences.C5118;
import p054.InterfaceC6566;
import p253.AbstractC8189;

/* JADX INFO: renamed from: kotlin.collections.飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4337 implements Iterator, InterfaceC6566 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Iterator f12915;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public int f12916;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f12917 = 0;

    public C4337(C5118 c5118) {
        this.f12915 = c5118.f14654.iterator();
        this.f12916 = c5118.f14653;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.f12917;
        Iterator it = this.f12915;
        switch (i) {
            case 0:
                return it.hasNext();
        }
        while (this.f12916 > 0 && it.hasNext()) {
            it.next();
            this.f12916--;
        }
        return it.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f12917;
        Iterator it = this.f12915;
        switch (i) {
            case 0:
                int i2 = this.f12916;
                this.f12916 = i2 + 1;
                if (i2 >= 0) {
                    return new C4340(i2, it.next());
                }
                AbstractC8189.m13662();
                throw null;
        }
        while (this.f12916 > 0 && it.hasNext()) {
            it.next();
            this.f12916--;
        }
        return it.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f12917) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C4337(Iterator it) {
        it.getClass();
        this.f12915 = it;
    }
}
