package yyds;

import java.util.Iterator;

/* JADX INFO: renamed from: yyds.ᛴᛵᛸᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0862 implements Iterator, InterfaceC0527 {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public int f3956;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ int f3957 = 1;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final Iterator f3958;

    public C0862(C0320 c0320) {
        this.f3958 = c0320.f1693.iterator();
        this.f3956 = c0320.f1694;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.f3957;
        Iterator it = this.f3958;
        switch (i) {
            case 0:
                break;
            case 1:
                return it.hasNext();
            default:
                return it.hasNext();
        }
        while (this.f3956 > 0 && it.hasNext()) {
            it.next();
            this.f3956--;
        }
        return it.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f3957;
        Iterator it = this.f3958;
        switch (i) {
            case 0:
                break;
            case 1:
                int i2 = this.f3956;
                this.f3956 = i2 + 1;
                if (i2 >= 0) {
                    return new C1661(i2, it.next());
                }
                AbstractC2725.m4853();
                throw null;
            default:
                int i3 = this.f3956;
                this.f3956 = i3 + 1;
                if (i3 >= 0) {
                    return new C1661(i3, it.next());
                }
                AbstractC2725.m4853();
                throw null;
        }
        while (this.f3956 > 0 && it.hasNext()) {
            it.next();
            this.f3956--;
        }
        return it.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f3957) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C0862(C0558 c0558) {
        this.f3958 = new C1119((C0497) c0558.f2654);
    }

    public C0862(Iterator it) {
        this.f3958 = it;
    }
}
