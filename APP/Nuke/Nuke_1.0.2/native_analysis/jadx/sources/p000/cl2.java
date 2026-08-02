package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class cl2 {

    /* JADX INFO: renamed from: a */
    public final String f1616a;

    /* JADX INFO: renamed from: b */
    public final boolean f1617b;

    public cl2(String str, boolean z) {
        str.getClass();
        this.f1616a = str;
        this.f1617b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cl2)) {
            return false;
        }
        cl2 cl2Var = (cl2) obj;
        return t11.m5086l(this.f1616a, cl2Var.f1616a) && this.f1617b == cl2Var.f1617b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f1617b) + (this.f1616a.hashCode() * 29791);
    }

    public final String toString() {
        return "ScriptUserRef(id=" + this.f1616a + ", name=null, displayName=null, isSelf=" + this.f1617b + ")";
    }
}
