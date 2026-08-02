package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class eg0 implements hg0 {

    /* JADX INFO: renamed from: a */
    public final String f2434a;

    public eg0(String str) {
        this.f2434a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eg0) && this.f2434a.equals(((eg0) obj).f2434a);
    }

    public final int hashCode() {
        return this.f2434a.hashCode();
    }

    public final String toString() {
        return vi0.m5691j("Identifier(value=", this.f2434a, ")");
    }
}
