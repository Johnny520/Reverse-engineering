package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ro2 implements so2 {

    /* JADX INFO: renamed from: a */
    public final Object f9664a;

    public ro2(Object obj) {
        this.f9664a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ro2) && this.f9664a.equals(((ro2) obj).f9664a);
    }

    public final int hashCode() {
        return this.f9664a.hashCode();
    }

    public final String toString() {
        return "Ok(data=" + this.f9664a + ")";
    }
}
