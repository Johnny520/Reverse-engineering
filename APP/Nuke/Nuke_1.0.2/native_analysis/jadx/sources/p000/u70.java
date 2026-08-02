package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class u70 {

    /* JADX INFO: renamed from: a */
    public final String f11124a;

    public u70(String str) {
        str.getClass();
        this.f11124a = i80.m2300c(str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u70)) {
            return false;
        }
        return t11.m5086l(this.f11124a, ((u70) obj).f11124a);
    }

    public final int hashCode() {
        return this.f11124a.hashCode();
    }

    public final String toString() {
        return i80.m2302e(this.f11124a);
    }
}
