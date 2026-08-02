package defpackage;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class t8 {
    public final Context a;
    public final e70 b;
    public final long c;
    public final jw1 d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public t8(Context context, e70 e70Var, long j, jw1 jw1Var) {
        this.a = context;
        this.b = e70Var;
        this.c = j;
        this.d = jw1Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!t8.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        t8 t8Var = (t8) obj;
        return t11.l(this.a, t8Var.a) && t11.l(this.b, t8Var.b) && ju.c(this.c, t8Var.c) && t11.l(this.d, t8Var.d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        int i = ju.h;
        return this.d.hashCode() + hk1.c(iHashCode, 31, this.c);
    }
}
