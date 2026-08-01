package kotlin.collections;

import java.util.Iterator;
import kotlin.sequences.C5951;
import p050.AbstractC7176;
import p070.InterfaceC7396;

/* JADX INFO: renamed from: kotlin.collections.飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5170 implements Iterator, InterfaceC7396 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Iterator f13264;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public int f13265;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f13266 = 0;

    public C5170(C5951 c5951) {
        this.f13264 = c5951.f14999.iterator();
        this.f13265 = c5951.f14998;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.f13266;
        Iterator it = this.f13264;
        switch (i) {
            case 0:
                return it.hasNext();
        }
        while (this.f13265 > 0 && it.hasNext()) {
            it.next();
            this.f13265--;
        }
        return it.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f13266;
        Iterator it = this.f13264;
        switch (i) {
            case 0:
                int i2 = this.f13265;
                this.f13265 = i2 + 1;
                if (i2 >= 0) {
                    return new C5173(i2, it.next());
                }
                AbstractC7176.m12479();
                throw null;
        }
        while (this.f13265 > 0 && it.hasNext()) {
            it.next();
            this.f13265--;
        }
        return it.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f13266) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C5170(Iterator it) {
        it.getClass();
        this.f13264 = it;
    }
}
