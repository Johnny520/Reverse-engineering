package p000;

import java.util.ListIterator;

/* JADX INFO: renamed from: u2 */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0758u2 extends C0717t2 implements ListIterator {

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ AbstractC0832w2 f11066k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0758u2(AbstractC0832w2 abstractC0832w2, int i) {
        super(0, abstractC0832w2);
        this.f11066k = abstractC0832w2;
        int iMo529a = abstractC0832w2.mo529a();
        if (i < 0 || i > iMo529a) {
            C0676s.m4646d(vi0.m5689h("index: ", i, ", size: ", iMo529a));
            throw null;
        }
        this.f10503i = i;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f10503i > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f10503i;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            um2.m5513b();
            return null;
        }
        int i = this.f10503i - 1;
        this.f10503i = i;
        return this.f11066k.get(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f10503i - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
