package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ne1 implements Iterator, q41 {
    public final pe1 h;
    public int i;
    public int j;
    public int k;
    public final /* synthetic */ int l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ne1(pe1 pe1Var, int i) {
        this.l = i;
        pe1Var.getClass();
        this.h = pe1Var;
        this.j = -1;
        this.k = pe1Var.o;
        b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a() {
        if (this.h.o != this.k) {
            throw new ConcurrentModificationException();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void b() {
        while (true) {
            int i = this.i;
            pe1 pe1Var = this.h;
            if (i >= pe1Var.m || pe1Var.j[i] >= 0) {
                return;
            } else {
                this.i = i + 1;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.i < this.h.m;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final Object next() {
        int i = this.l;
        pe1 pe1Var = this.h;
        switch (i) {
            case 0:
                a();
                int i2 = this.i;
                if (i2 >= pe1Var.m) {
                    um2.b();
                } else {
                    this.i = i2 + 1;
                    this.j = i2;
                    oe1 oe1Var = new oe1(pe1Var, i2);
                    b();
                }
                break;
            case 1:
                a();
                int i3 = this.i;
                if (i3 >= pe1Var.m) {
                    um2.b();
                } else {
                    this.i = i3 + 1;
                    this.j = i3;
                    Object obj = pe1Var.h[i3];
                    b();
                }
                break;
            default:
                a();
                int i4 = this.i;
                if (i4 >= pe1Var.m) {
                    um2.b();
                } else {
                    this.i = i4 + 1;
                    this.j = i4;
                    Object[] objArr = pe1Var.i;
                    objArr.getClass();
                    Object obj2 = objArr[this.j];
                    b();
                }
                break;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final void remove() {
        a();
        if (this.j == -1) {
            s.l("Call next() before removing element from the iterator.");
            return;
        }
        pe1 pe1Var = this.h;
        pe1Var.c();
        pe1Var.k(this.j);
        this.j = -1;
        this.k = pe1Var.o;
    }
}
