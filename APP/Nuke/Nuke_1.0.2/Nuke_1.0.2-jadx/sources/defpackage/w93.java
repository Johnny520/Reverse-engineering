package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class w93 extends t93 {
    public final String h;
    public final List i;
    public final int j;
    public final an k;
    public final float l;
    public final an m;
    public final float n;
    public final float o;
    public final int p;
    public final int q;
    public final float r;
    public final float s;
    public final float t;
    public final float u;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public w93(String str, List list, int i, an anVar, float f, an anVar2, float f2, float f3, int i2, int i3, float f4, float f5, float f6, float f7) {
        this.h = str;
        this.i = list;
        this.j = i;
        this.k = anVar;
        this.l = f;
        this.m = anVar2;
        this.n = f2;
        this.o = f3;
        this.p = i2;
        this.q = i3;
        this.r = f4;
        this.s = f5;
        this.t = f6;
        this.u = f7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || w93.class != obj.getClass()) {
            return false;
        }
        w93 w93Var = (w93) obj;
        return this.h.equals(w93Var.h) && t11.l(this.k, w93Var.k) && this.l == w93Var.l && t11.l(this.m, w93Var.m) && this.n == w93Var.n && this.o == w93Var.o && this.p == w93Var.p && this.q == w93Var.q && this.r == w93Var.r && this.s == w93Var.s && this.t == w93Var.t && this.u == w93Var.u && this.j == w93Var.j && t11.l(this.i, w93Var.i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iHashCode = (this.i.hashCode() + (this.h.hashCode() * 31)) * 31;
        an anVar = this.k;
        int iC = vi0.c(this.l, (iHashCode + (anVar != null ? anVar.hashCode() : 0)) * 31, 31);
        an anVar2 = this.m;
        return Integer.hashCode(this.j) + vi0.c(this.u, vi0.c(this.t, vi0.c(this.s, vi0.c(this.r, vi0.d(this.q, vi0.d(this.p, vi0.c(this.o, vi0.c(this.n, (iC + (anVar2 != null ? anVar2.hashCode() : 0)) * 31, 31), 31), 31), 31), 31), 31), 31), 31);
    }
}
