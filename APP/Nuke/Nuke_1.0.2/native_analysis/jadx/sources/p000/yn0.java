package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public class yn0 extends AbstractC0063bp implements wn0, p41, un0 {

    /* JADX INFO: renamed from: n */
    public final int f13530n;

    public yn0(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(obj, cls, str, str2, (i2 & 1) == 1);
        this.f13530n = i;
    }

    @Override // p000.wn0
    /* JADX INFO: renamed from: c */
    public final int mo2601c() {
        return this.f13530n;
    }

    @Override // p000.AbstractC0063bp
    /* JADX INFO: renamed from: d */
    public final p41 mo581d() {
        d72.f1901a.getClass();
        return this;
    }

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
            return this.f965k.equals(yn0Var.f965k) && this.f966l.equals(yn0Var.f966l) && t11.m5086l(this.f963i, yn0Var.f963i) && m582f().equals(yn0Var.m582f());
        }
        if (!(obj instanceof yn0)) {
            return false;
        }
        p41 p41Var = this.f962h;
        if (p41Var == null) {
            mo581d();
            this.f962h = this;
            this = this;
        } else {
            r2 = p41Var;
        }
        return obj.equals(r2);
    }

    public final int hashCode() {
        m582f();
        return this.f966l.hashCode() + hk1.m2207f(this.f965k, m582f().hashCode() * 31, 31);
    }

    public final String toString() {
        p41 p41Var = this.f962h;
        if (p41Var == null) {
            mo581d();
            this.f962h = this;
            p41Var = this;
        }
        if (p41Var != this) {
            return p41Var.toString();
        }
        String str = this.f965k;
        return "<init>".equals(str) ? "constructor (Kotlin reflection is not available)" : vi0.m5691j("function ", str, " (Kotlin reflection is not available)");
    }

    public yn0(int i, Class cls, String str, String str2, int i2) {
        this(i, C0026ap.f317h, cls, str, str2, i2, 0);
    }
}
