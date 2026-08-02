package defpackage;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ez1 implements Iterator, q41 {
    public final /* synthetic */ int h = 0;
    public final Iterator i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ez1(bz1 bz1Var) {
        i43[] i43VarArr = new i43[8];
        for (int i = 0; i < 8; i++) {
            i43VarArr[i] = new k43(this);
        }
        this.i = new cz1(bz1Var, i43VarArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.h) {
            case 0:
                return ((cz1) this.i).j;
            default:
                return this.i.hasNext();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final Object next() {
        switch (this.h) {
            case 0:
                return (Map.Entry) ((cz1) this.i).next();
            default:
                return (t93) this.i.next();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final void remove() {
        switch (this.h) {
            case 0:
                ((cz1) this.i).remove();
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public ez1(r93 r93Var) {
        this.i = r93Var.q.iterator();
    }
}
