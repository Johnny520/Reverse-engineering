package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class k5 implements wn0, Serializable {
    public final Object h;
    public final Class i;
    public final String j;
    public final String k;
    public final boolean l = false;
    public final int m;
    public final int n;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public k5(int i, int i2, Class cls, Object obj, String str, String str2) {
        this.h = obj;
        this.i = cls;
        this.j = str;
        this.k = str2;
        this.m = i;
        this.n = i2 >> 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.wn0
    public final int c() {
        return this.m;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k5)) {
            return false;
        }
        k5 k5Var = (k5) obj;
        return this.l == k5Var.l && this.m == k5Var.m && this.n == k5Var.n && this.h.equals(k5Var.h) && this.i.equals(k5Var.i) && this.j.equals(k5Var.j) && this.k.equals(k5Var.k);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return ((((hk1.f(this.k, hk1.f(this.j, (this.i.hashCode() + (this.h.hashCode() * 31)) * 31, 31), 31) + (this.l ? 1231 : 1237)) * 31) + this.m) * 31) + this.n;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        d72.a.getClass();
        return e72.a(this);
    }
}
