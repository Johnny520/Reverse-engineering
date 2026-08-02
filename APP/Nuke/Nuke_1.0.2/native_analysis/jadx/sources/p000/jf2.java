package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class jf2 {

    /* JADX INFO: renamed from: a */
    public final i41 f5016a;

    /* JADX INFO: renamed from: b */
    public final String f5017b;

    public jf2(i41 i41Var, String str) {
        this.f5016a = i41Var;
        this.f5017b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jf2)) {
            return false;
        }
        jf2 jf2Var = (jf2) obj;
        return this.f5016a.equals(jf2Var.f5016a) && this.f5017b.equals(jf2Var.f5017b);
    }

    public final int hashCode() {
        return this.f5017b.hashCode() + (this.f5016a.hashCode() * 31);
    }

    public final String toString() {
        return "ScriptConfigOption(value=" + this.f5016a + ", label=" + this.f5017b + ")";
    }
}
