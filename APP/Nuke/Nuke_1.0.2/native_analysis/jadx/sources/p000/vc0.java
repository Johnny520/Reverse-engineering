package p000;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class vc0 implements Iterator, q41 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f11897h = 1;

    /* JADX INFO: renamed from: i */
    public final Iterator f11898i;

    /* JADX INFO: renamed from: j */
    public int f11899j;

    public vc0(wc0 wc0Var) {
        this.f11898i = wc0Var.f12457a.iterator();
        this.f11899j = wc0Var.f12458b;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.f11897h;
        Iterator it = this.f11898i;
        switch (i) {
            case 0:
                break;
            default:
                return it.hasNext();
        }
        while (this.f11899j > 0 && it.hasNext()) {
            it.next();
            this.f11899j--;
        }
        return it.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f11897h;
        Iterator it = this.f11898i;
        switch (i) {
            case 0:
                break;
            default:
                int i2 = this.f11899j;
                this.f11899j = i2 + 1;
                if (i2 >= 0) {
                    return new jy0(i2, it.next());
                }
                AbstractC0179eu.m1447a0();
                throw null;
        }
        while (this.f11899j > 0 && it.hasNext()) {
            it.next();
            this.f11899j--;
        }
        return it.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f11897h) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public vc0(Iterator it) {
        it.getClass();
        this.f11898i = it;
    }
}
