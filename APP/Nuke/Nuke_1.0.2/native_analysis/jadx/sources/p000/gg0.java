package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class gg0 implements hg0 {

    /* JADX INFO: renamed from: a */
    public final String f3503a;

    public gg0(String str) {
        str.getClass();
        this.f3503a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gg0) && t11.m5086l(this.f3503a, ((gg0) obj).f3503a);
    }

    public final int hashCode() {
        return this.f3503a.hashCode();
    }

    public final String toString() {
        return vi0.m5691j("Symbol(value=", this.f3503a, ")");
    }
}
