package p217p0;

/* JADX INFO: renamed from: p0.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2871b {

    /* JADX INFO: renamed from: a */
    public static final long f9063a;

    /* JADX INFO: renamed from: b */
    public static final long f9064b;

    /* JADX INFO: renamed from: c */
    public static final long f9065c;

    /* JADX INFO: renamed from: d */
    public static final long f9066d;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ int f9067e = 0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        long j5 = 3;
        long j6 = j5 << 32;
        f9063a = (((long) 0) & 4294967295L) | j6;
        f9064b = (((long) 1) & 4294967295L) | j6;
        f9065c = j6 | (((long) 2) & 4294967295L);
        f9066d = (j5 & 4294967295L) | (((long) 4) << 32);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final boolean m5068a(long j5, long j6) {
        return j5 == j6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static String m5069b(long j5) {
        return m5068a(j5, f9063a) ? "Rgb" : m5068a(j5, f9064b) ? "Xyz" : m5068a(j5, f9065c) ? "Lab" : m5068a(j5, f9066d) ? "Cmyk" : "Unknown";
    }
}
