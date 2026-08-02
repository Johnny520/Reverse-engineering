package p000;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class vo2 implements Iterator, t00, q41 {

    /* JADX INFO: renamed from: h */
    public int f12093h;

    /* JADX INFO: renamed from: i */
    public Object f12094i;

    /* JADX INFO: renamed from: j */
    public t00 f12095j;

    /* JADX INFO: renamed from: a */
    public final RuntimeException m5745a() {
        int i = this.f12093h;
        if (i == 4) {
            return new NoSuchElementException();
        }
        if (i == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.f12093h);
    }

    /* JADX INFO: renamed from: b */
    public final void m5746b(t00 t00Var, Object obj) {
        this.f12094i = obj;
        this.f12093h = 3;
        this.f12095j = t00Var;
        t00Var.getClass();
    }

    @Override // p000.t00
    /* JADX INFO: renamed from: f */
    public final a20 mo2508f() {
        return zd0.f13837h;
    }

    @Override // p000.t00
    /* JADX INFO: renamed from: h */
    public final void mo2509h(Object obj) {
        fg1.m1627T(obj);
        this.f12093h = 4;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i;
        while (true) {
            i = this.f12093h;
            if (i != 0) {
                break;
            }
            this.f12093h = 5;
            t00 t00Var = this.f12095j;
            t00Var.getClass();
            this.f12095j = null;
            t00Var.mo2509h(a83.f116a);
        }
        if (i == 1) {
            throw null;
        }
        if (i == 2 || i == 3) {
            return true;
        }
        if (i == 4) {
            return false;
        }
        throw m5745a();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f12093h;
        if (i == 0 || i == 1) {
            if (hasNext()) {
                return next();
            }
            um2.m5513b();
            return null;
        }
        if (i == 2) {
            this.f12093h = 1;
            throw null;
        }
        if (i != 3) {
            throw m5745a();
        }
        this.f12093h = 0;
        Object obj = this.f12094i;
        this.f12094i = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
