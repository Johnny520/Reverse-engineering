package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class za0 implements Comparable {

    /* JADX INFO: renamed from: h */
    public final float f13798h;

    /* JADX INFO: renamed from: a */
    public static int m6403a(float f, float f2) {
        if (Float.isNaN(f) || Float.isNaN(f2)) {
            return 0;
        }
        return Float.compare(f, f2);
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m6404b(float f, float f2) {
        return Float.compare(f, f2) == 0;
    }

    /* JADX INFO: renamed from: c */
    public static String m6405c(float f) {
        if (Float.isNaN(f)) {
            return "Dp.Unspecified";
        }
        return f + ".dp";
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return m6403a(this.f13798h, ((za0) obj).f13798h);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof za0) {
            return Float.compare(this.f13798h, ((za0) obj).f13798h) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f13798h);
    }

    public final String toString() {
        return m6405c(this.f13798h);
    }
}
