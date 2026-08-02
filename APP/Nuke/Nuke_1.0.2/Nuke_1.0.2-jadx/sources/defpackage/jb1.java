package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class jb1 implements Iterator {
    public lb1 h;
    public lb1 i = null;
    public int j;
    public final /* synthetic */ mb1 k;
    public final /* synthetic */ int l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public jb1(mb1 mb1Var, int i) {
        this.l = i;
        this.k = mb1Var;
        this.h = mb1Var.m.k;
        this.j = mb1Var.l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object a() {
        return b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final lb1 b() {
        lb1 lb1Var = this.h;
        mb1 mb1Var = this.k;
        if (lb1Var == mb1Var.m) {
            um2.b();
            return null;
        }
        if (mb1Var.l != this.j) {
            throw new ConcurrentModificationException();
        }
        this.h = lb1Var.k;
        this.i = lb1Var;
        return lb1Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.h != this.k.m;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public Object next() {
        switch (this.l) {
            case 1:
                return b().m;
            default:
                return a();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final void remove() {
        lb1 lb1Var = this.i;
        if (lb1Var == null) {
            throw new IllegalStateException();
        }
        mb1 mb1Var = this.k;
        mb1Var.c(lb1Var, true);
        this.i = null;
        this.j = mb1Var.l;
    }
}
