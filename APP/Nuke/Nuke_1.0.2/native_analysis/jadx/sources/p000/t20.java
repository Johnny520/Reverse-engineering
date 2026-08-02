package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class t20 {

    /* JADX INFO: renamed from: a */
    public final C0583pk f10505a;

    public t20(C0583pk c0583pk) {
        this.f10505a = c0583pk;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t20) && t11.m5086l(this.f10505a, ((t20) obj).f10505a);
    }

    public final int hashCode() {
        return Float.hashCode(this.f10505a.f8378a);
    }

    public final String toString() {
        return "HorizontalCrossAxisAlignment(horizontal=" + this.f10505a + ')';
    }
}
