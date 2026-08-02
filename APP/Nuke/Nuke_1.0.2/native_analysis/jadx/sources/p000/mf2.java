package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class mf2 {

    /* JADX INFO: renamed from: a */
    public final lf2 f6632a;

    /* JADX INFO: renamed from: b */
    public final int f6633b;

    public mf2(lf2 lf2Var, int i) {
        this.f6632a = lf2Var;
        this.f6633b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mf2)) {
            return false;
        }
        mf2 mf2Var = (mf2) obj;
        return t11.m5086l(this.f6632a, mf2Var.f6632a) && this.f6633b == mf2Var.f6633b;
    }

    public final int hashCode() {
        lf2 lf2Var = this.f6632a;
        return Integer.hashCode(this.f6633b) + ((lf2Var == null ? 0 : lf2Var.hashCode()) * 31);
    }

    public final String toString() {
        return "ScriptConfigSchemaDocument(schema=" + this.f6632a + ", byteCount=" + this.f6633b + ")";
    }
}
