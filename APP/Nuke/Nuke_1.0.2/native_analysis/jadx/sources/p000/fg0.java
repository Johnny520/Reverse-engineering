package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class fg0 implements hg0 {

    /* JADX INFO: renamed from: a */
    public final String f2979a;

    public fg0(String str) {
        str.getClass();
        this.f2979a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fg0) && t11.m5086l(this.f2979a, ((fg0) obj).f2979a);
    }

    public final int hashCode() {
        return this.f2979a.hashCode();
    }

    public final String toString() {
        return vi0.m5691j("StringLiteral(value=", this.f2979a, ")");
    }
}
