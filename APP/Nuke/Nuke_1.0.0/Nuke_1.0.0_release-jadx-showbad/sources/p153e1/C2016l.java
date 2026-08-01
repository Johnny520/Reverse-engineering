package p153e1;

/* JADX INFO: renamed from: e1.l */
/* JADX INFO: loaded from: classes.dex */
public final class C2016l {

    /* JADX INFO: renamed from: a */
    public final long f6741a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final boolean m3704a(long j5, long j6) {
        return j5 == j6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static String m3705b(long j5) {
        return ((int) (j5 >> 32)) + " x " + ((int) (j5 & 4294967295L));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (obj instanceof C2016l) {
            return this.f6741a == ((C2016l) obj).f6741a;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Long.hashCode(this.f6741a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return m3705b(this.f6741a);
    }
}
