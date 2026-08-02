package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class li0 {

    /* JADX INFO: renamed from: a */
    public final a63 f6133a;

    /* JADX INFO: renamed from: b */
    public final String f6134b;

    /* JADX INFO: renamed from: c */
    public final c30 f6135c;

    public li0(a63 a63Var, a63 a63Var2, String str) {
        if (a63Var2 == null) {
            throw null;
        }
        this.f6133a = a63Var;
        this.f6134b = str;
        this.f6135c = new c30(a63Var.f97c, new o30(new q30(str), new q30(a63Var2.f95a)));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof li0)) {
            return false;
        }
        li0 li0Var = (li0) obj;
        return li0Var.f6133a.equals(this.f6133a) && li0Var.f6134b.equals(this.f6134b);
    }

    public final int hashCode() {
        return (this.f6134b.hashCode() * 37) + this.f6133a.f95a.hashCode();
    }

    public final String toString() {
        return this.f6133a + "." + this.f6134b;
    }
}
