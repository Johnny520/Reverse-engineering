package defpackage;

import android.graphics.Shader;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ft2 extends an {
    public final long a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ft2(long j) {
        this.a = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.an
    public final void a(float f, long j, q9 q9Var) {
        q9Var.i(1.0f);
        long jB = this.a;
        if (f != 1.0f) {
            jB = ju.b(ju.d(jB) * f, jB);
        }
        q9Var.k(jB);
        if (((Shader) q9Var.d) != null) {
            q9Var.n(null);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ft2) {
            return ju.c(this.a, ((ft2) obj).a);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int i = ju.h;
        return Long.hashCode(this.a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "SolidColor(value=" + ((Object) ju.i(this.a)) + ')';
    }
}
