package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class m71 {

    /* JADX INFO: renamed from: a */
    public final String f6498a;

    public m71(String str) {
        this.f6498a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof m71) {
            return this.f6498a.equals(((m71) obj).f6498a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f6498a.hashCode();
    }

    public final String toString() {
        return hk1.m2211j(new StringBuilder("StringHeaderFactory{value='"), this.f6498a, "'}");
    }
}
