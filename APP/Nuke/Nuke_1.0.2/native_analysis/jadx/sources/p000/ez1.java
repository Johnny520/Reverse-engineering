package p000;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ez1 implements Iterator, q41 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f2694h = 0;

    /* JADX INFO: renamed from: i */
    public final Iterator f2695i;

    public ez1(bz1 bz1Var) {
        i43[] i43VarArr = new i43[8];
        for (int i = 0; i < 8; i++) {
            i43VarArr[i] = new k43(this);
        }
        this.f2695i = new cz1(bz1Var, i43VarArr);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f2694h) {
            case 0:
                return ((cz1) this.f2695i).f455j;
            default:
                return this.f2695i.hasNext();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f2694h) {
            case 0:
                return (Map.Entry) ((cz1) this.f2695i).next();
            default:
                return (t93) this.f2695i.next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f2694h) {
            case 0:
                ((cz1) this.f2695i).remove();
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public ez1(r93 r93Var) {
        this.f2695i = r93Var.f9481q.iterator();
    }
}
