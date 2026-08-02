package defpackage;

import android.graphics.Rect;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class lf3 {
    public final wl a;
    public final float b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public lf3(Rect rect, float f) {
        this.a = new wl(rect);
        this.b = f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Rect a() {
        wl wlVar = this.a;
        wlVar.getClass();
        return new Rect(wlVar.a, wlVar.b, wlVar.c, wlVar.d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!lf3.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        lf3 lf3Var = (lf3) obj;
        return t11.l(this.a, lf3Var.a) && this.b == lf3Var.b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Float.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("WindowMetrics(_bounds=");
        sb.append(this.a);
        sb.append(", density=");
        return vi0.l(sb, this.b, ')');
    }

    public lf3(wl wlVar, float f) {
        this.a = wlVar;
        this.b = f;
    }
}
