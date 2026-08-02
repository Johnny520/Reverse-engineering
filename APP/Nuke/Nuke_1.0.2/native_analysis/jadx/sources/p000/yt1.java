package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class yt1 {

    /* JADX INFO: renamed from: a */
    public final String f13616a;

    public yt1(String str) {
        this.f13616a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yt1) && this.f13616a.equals(((yt1) obj).f13616a);
    }

    public final int hashCode() {
        return this.f13616a.hashCode();
    }

    public final String toString() {
        return hk1.m2210i(new StringBuilder("OpaqueKey(key="), this.f13616a, ')');
    }
}
