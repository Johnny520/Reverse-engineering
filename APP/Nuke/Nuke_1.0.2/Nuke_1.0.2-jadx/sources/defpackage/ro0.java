package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ro0 implements Iterator, q41 {
    public final /* synthetic */ int h;
    public int i;
    public Object j;
    public final Object k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ro0(uk1 uk1Var) {
        this.h = 2;
        this.k = uk1Var;
        this.i = -1;
        this.j = tp0.B(new tk1(uk1Var, this, null));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void a() {
        Object objJ;
        int i = this.i;
        c70 c70Var = (c70) this.k;
        if (i == -2) {
            objJ = ((xm0) c70Var.b).a();
        } else {
            in0 in0Var = (in0) c70Var.c;
            Object obj = this.j;
            obj.getClass();
            objJ = in0Var.j(obj);
        }
        this.j = objJ;
        this.i = objJ == null ? 0 : 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.h) {
            case 0:
                if (this.i < 0) {
                    a();
                }
                return this.i == 1;
            case 1:
                return ((vo2) this.j).hasNext();
            case 2:
                return ((vo2) this.j).hasNext();
            default:
                return this.i < ((Map) this.k).size();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final Object next() {
        Object obj = null;
        switch (this.h) {
            case 0:
                if (this.i < 0) {
                    a();
                }
                if (this.i == 0) {
                    um2.b();
                    return null;
                }
                Object obj2 = this.j;
                obj2.getClass();
                this.i = -1;
                return obj2;
            case 1:
                return ((vo2) this.j).next();
            case 2:
                return ((vo2) this.j).next();
            default:
                if (hasNext()) {
                    obj = this.j;
                    this.i++;
                    Object obj3 = ((Map) this.k).get(obj);
                    if (obj3 == null) {
                        throw new ConcurrentModificationException("Hash code of an element (" + obj + ") has changed after it was added to the persistent set.");
                    }
                    this.j = ((nb1) obj3).b;
                } else {
                    um2.b();
                }
                return obj;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final void remove() {
        int i = this.h;
        Object obj = this.k;
        switch (i) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                int i2 = this.i;
                if (i2 != -1) {
                    ((ok1) obj).i.h(i2);
                    this.i = -1;
                    return;
                }
                return;
            case 2:
                int i3 = this.i;
                if (i3 != -1) {
                    ((uk1) obj).i.m(i3);
                    this.i = -1;
                    return;
                }
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public ro0(c70 c70Var) {
        this.h = 0;
        this.k = c70Var;
        this.i = -2;
    }

    public ro0(Object obj, Map map) {
        this.h = 3;
        this.j = obj;
        this.k = map;
    }

    public ro0(ok1 ok1Var) {
        this.h = 1;
        this.k = ok1Var;
        this.i = -1;
        this.j = tp0.B(new nk1(ok1Var, this, null));
    }
}
