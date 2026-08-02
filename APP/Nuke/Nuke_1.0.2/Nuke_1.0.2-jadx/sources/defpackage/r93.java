package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class r93 extends t93 implements Iterable, q41 {
    public final String h;
    public final float i;
    public final float j;
    public final float k;
    public final float l;
    public final float m;
    public final float n;
    public final float o;
    public final List p;
    public final List q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public r93(String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, List list, ArrayList arrayList) {
        this.h = str;
        this.i = f;
        this.j = f2;
        this.k = f3;
        this.l = f4;
        this.m = f5;
        this.n = f6;
        this.o = f7;
        this.p = list;
        this.q = arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof r93)) {
            r93 r93Var = (r93) obj;
            return t11.l(this.h, r93Var.h) && this.i == r93Var.i && this.j == r93Var.j && this.k == r93Var.k && this.l == r93Var.l && this.m == r93Var.m && this.n == r93Var.n && this.o == r93Var.o && t11.l(this.p, r93Var.p) && t11.l(this.q, r93Var.q);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.q.hashCode() + ((this.p.hashCode() + vi0.c(this.o, vi0.c(this.n, vi0.c(this.m, vi0.c(this.l, vi0.c(this.k, vi0.c(this.j, vi0.c(this.i, this.h.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31)) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new ez1(this);
    }
}
