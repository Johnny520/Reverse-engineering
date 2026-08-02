package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ci1 {
    public static final bi1 Companion = new bi1();

    /* JADX INFO: renamed from: a */
    public final int f1571a;

    public /* synthetic */ ci1(int i, int i2) {
        if ((i & 1) == 0) {
            this.f1571a = 10;
        } else {
            this.f1571a = i2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ci1) && this.f1571a == ((ci1) obj).f1571a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f1571a);
    }

    public final String toString() {
        return hk1.m2208g(this.f1571a, "ModifyFriendsCountConf(count=", ")");
    }

    public ci1(int i) {
        this.f1571a = i;
    }

    public /* synthetic */ ci1() {
        this(10);
    }
}
