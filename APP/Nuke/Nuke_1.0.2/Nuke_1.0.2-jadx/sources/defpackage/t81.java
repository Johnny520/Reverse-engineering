package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class t81 {
    public final d91 a;
    public final s81 b;
    public final o71 c;
    public final e9 d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public t81(d91 d91Var, s81 s81Var, o71 o71Var, e9 e9Var) {
        this.a = d91Var;
        this.b = s81Var;
        this.c = o71Var;
        this.d = e9Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a(int i, Object obj, px pxVar, int i2) {
        int i3;
        Object obj2;
        go0 go0Var = (go0) pxVar;
        go0Var.X(-462424778);
        int i4 = (go0Var.d(i) ? 4 : 2) | i2 | (go0Var.h(obj) ? 32 : 16) | (go0Var.f(this) ? 256 : 128);
        if (go0Var.O(i4 & 1, (i4 & 147) != 146)) {
            i3 = i;
            obj2 = obj;
            p40.a(obj2, i3, this.a.r, xe1.i0(-824725566, new b8(this, i), go0Var), go0Var, ((i4 >> 3) & 14) | 3072 | ((i4 << 3) & 112));
        } else {
            i3 = i;
            obj2 = obj;
            go0Var.R();
        }
        b62 b62VarR = go0Var.r();
        if (b62VarR != null) {
            b62VarR.d = new a81(this, i3, obj2, i2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object b(int i) {
        s81 s81Var = this.b;
        s81Var.getClass();
        l11 l11VarE = s81Var.a.e(i);
        return ((in0) l11VarE.c.j).j(Integer.valueOf(i - l11VarE.a));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int c() {
        s81 s81Var = this.b;
        s81Var.getClass();
        return s81Var.a.i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object d(int i) {
        Object objJ;
        e9 e9Var = this.d;
        Object[] objArr = (Object[]) e9Var.k;
        int i2 = i - e9Var.i;
        Object obj = (i2 < 0 || i2 >= objArr.length) ? null : objArr[i2];
        if (obj != null) {
            return obj;
        }
        s81 s81Var = this.b;
        s81Var.getClass();
        l11 l11VarE = s81Var.a.e(i);
        int i3 = i - l11VarE.a;
        in0 in0Var = (in0) l11VarE.c.i;
        return (in0Var == null || (objJ = in0Var.j(Integer.valueOf(i3))) == null) ? new u50(i) : objJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t81)) {
            return false;
        }
        return t11.l(this.b, ((t81) obj).b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.b.hashCode();
    }
}
