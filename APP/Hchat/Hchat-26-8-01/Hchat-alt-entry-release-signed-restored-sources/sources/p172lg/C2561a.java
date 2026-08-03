package p172lg;

/* JADX INFO: renamed from: lg.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2561a {

    /* JADX INFO: renamed from: a */
    public final float f8310a;

    /* JADX INFO: renamed from: b */
    public final float f8311b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2561a(float f3, float f10) {
        this.f8310a = f3;
        this.f8311b = f10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static boolean m6018d(Float f3, Float f10) {
        return f3.floatValue() <= f10.floatValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final Comparable m6019a() {
        return Float.valueOf(this.f8311b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final Comparable m6020b() {
        return Float.valueOf(this.f8310a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final boolean m6021c() {
        return this.f8310a > this.f8311b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (!(obj instanceof C2561a)) {
            return false;
        }
        if (m6021c() && ((C2561a) obj).m6021c()) {
            return true;
        }
        C2561a c2561a = (C2561a) obj;
        return this.f8310a == c2561a.f8310a && this.f8311b == c2561a.f8311b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        if (m6021c()) {
            return -1;
        }
        return Float.hashCode(this.f8311b) + (Float.hashCode(this.f8310a) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return this.f8310a + ".." + this.f8311b;
    }
}
