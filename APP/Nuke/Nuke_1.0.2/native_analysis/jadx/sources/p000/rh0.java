package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class rh0 {

    /* JADX INFO: renamed from: a */
    public final String f9586a;

    public rh0(String str) {
        this.f9586a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rh0) && this.f9586a.equals(((rh0) obj).f9586a);
    }

    public final int hashCode() {
        return this.f9586a.hashCode();
    }

    public final String toString() {
        return vi0.m5691j("ExternalLinkRequest(url=", this.f9586a, ")");
    }
}
