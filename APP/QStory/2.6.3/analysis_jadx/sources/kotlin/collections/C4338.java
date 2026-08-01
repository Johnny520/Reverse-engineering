package kotlin.collections;

import java.util.Iterator;
import kotlin.sequences.C5119;
import p034.AbstractC6347;
import p054.InterfaceC6567;

/* JADX INFO: renamed from: kotlin.collections.飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4338 implements Iterator, InterfaceC6567 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Iterator f12919;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public int f12920;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f12921 = 0;

    public C4338(C5119 c5119) {
        this.f12919 = c5119.f14654.iterator();
        this.f12920 = c5119.f14653;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.f12921;
        Iterator it = this.f12919;
        switch (i) {
            case 0:
                return it.hasNext();
        }
        while (this.f12920 > 0 && it.hasNext()) {
            it.next();
            this.f12920--;
        }
        return it.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f12921;
        Iterator it = this.f12919;
        switch (i) {
            case 0:
                int i2 = this.f12920;
                this.f12920 = i2 + 1;
                if (i2 >= 0) {
                    return new C4341(i2, it.next());
                }
                AbstractC6347.m11920();
                throw null;
        }
        while (this.f12920 > 0 && it.hasNext()) {
            it.next();
            this.f12920--;
        }
        return it.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f12921) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C4338(Iterator it) {
        it.getClass();
        this.f12919 = it;
    }
}
