package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class w02 {

    /* JADX INFO: renamed from: a */
    public final k02 f12240a;

    public w02() {
        this(new k02());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof w02) {
            return t11.m5086l(this.f12240a, ((w02) obj).f12240a);
        }
        return false;
    }

    public final int hashCode() {
        k02 k02Var = this.f12240a;
        if (k02Var != null) {
            return k02Var.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "PlatformTextStyle(spanStyle=null, paragraphSyle=" + this.f12240a + ')';
    }

    public w02(k02 k02Var) {
        this.f12240a = k02Var;
    }
}
