package p153e1;

/* JADX INFO: renamed from: e1.f */
/* JADX INFO: loaded from: classes.dex */
public final class C2010f implements Comparable {

    /* JADX INFO: renamed from: d */
    public final float f6732d;

    /* JADX INFO: renamed from: a */
    public static int m3695a(float f2, float f5) {
        if (Float.isNaN(f2) || Float.isNaN(f5)) {
            return 0;
        }
        return Float.compare(f2, f5);
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m3696b(float f2, float f5) {
        return Float.compare(f2, f5) == 0;
    }

    /* JADX INFO: renamed from: c */
    public static String m3697c(float f2) {
        if (Float.isNaN(f2)) {
            return "Dp.Unspecified";
        }
        return f2 + ".dp";
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return m3695a(this.f6732d, ((C2010f) obj).f6732d);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2010f) {
            return Float.compare(this.f6732d, ((C2010f) obj).f6732d) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f6732d);
    }

    public final String toString() {
        return m3697c(this.f6732d);
    }
}
