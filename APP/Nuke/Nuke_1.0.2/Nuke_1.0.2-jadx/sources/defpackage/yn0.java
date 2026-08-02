package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public class yn0 extends bp implements wn0, p41, un0 {
    public final int n;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public yn0(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(obj, cls, str, str2, (i2 & 1) == 1);
        this.n = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.wn0
    public final int c() {
        return this.n;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.bp
    public final p41 d() {
        d72.a.getClass();
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object] */
    public final boolean equals(Object obj) {
        ?? r2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof yn0) {
            yn0 yn0Var = (yn0) obj;
            return this.k.equals(yn0Var.k) && this.l.equals(yn0Var.l) && t11.l(this.i, yn0Var.i) && f().equals(yn0Var.f());
        }
        if (!(obj instanceof yn0)) {
            return false;
        }
        p41 p41Var = this.h;
        if (p41Var == null) {
            d();
            this.h = this;
            this = this;
        } else {
            r2 = p41Var;
        }
        return obj.equals(r2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        f();
        return this.l.hashCode() + hk1.f(this.k, f().hashCode() * 31, 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        p41 p41Var = this.h;
        if (p41Var == null) {
            d();
            this.h = this;
            p41Var = this;
        }
        if (p41Var != this) {
            return p41Var.toString();
        }
        String str = this.k;
        return "<init>".equals(str) ? "constructor (Kotlin reflection is not available)" : vi0.j("function ", str, " (Kotlin reflection is not available)");
    }

    public yn0(int i, Class cls, String str, String str2, int i2) {
        this(i, ap.h, cls, str, str2, i2, 0);
    }
}
