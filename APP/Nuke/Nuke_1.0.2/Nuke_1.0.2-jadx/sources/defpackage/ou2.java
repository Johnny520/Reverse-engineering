package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ou2 implements Iterator, q41 {
    public final rs2 h;
    public final Iterator i;
    public int j;
    public Map.Entry k;
    public Map.Entry l;
    public final /* synthetic */ int m;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ou2(rs2 rs2Var, Iterator it, int i) {
        this.m = i;
        this.h = rs2Var;
        this.i = it;
        this.j = rs2Var.e().d;
        a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a() {
        this.k = this.l;
        Iterator it = this.i;
        this.l = it.hasNext() ? (Map.Entry) it.next() : null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.l != null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final Object next() {
        switch (this.m) {
            case 0:
                a();
                if (this.k != null) {
                    return new nu2(this);
                }
                throw new IllegalStateException();
            case 1:
                Map.Entry entry = this.l;
                if (entry == null) {
                    throw new IllegalStateException();
                }
                a();
                return entry.getKey();
            default:
                Map.Entry entry2 = this.l;
                if (entry2 == null) {
                    throw new IllegalStateException();
                }
                a();
                return entry2.getValue();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final void remove() {
        rs2 rs2Var = this.h;
        if (rs2Var.e().d != this.j) {
            throw new ConcurrentModificationException();
        }
        Map.Entry entry = this.k;
        if (entry == null) {
            throw new IllegalStateException();
        }
        rs2Var.remove(entry.getKey());
        this.k = null;
        this.j = rs2Var.e().d;
    }
}
