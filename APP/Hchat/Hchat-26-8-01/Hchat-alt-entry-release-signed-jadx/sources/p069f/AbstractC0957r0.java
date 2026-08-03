package p069f;

/* JADX INFO: renamed from: f.r0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0957r0 {

    /* JADX INFO: renamed from: a */
    public static final long[] f3015a = {-9187201950435737345L, -1};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        new C0943k0(0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final int m2355a(int i9) {
        if (i9 == 7) {
            return 6;
        }
        return i9 - (i9 / 8);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static final int m2356b(int i9) {
        if (i9 == 0) {
            return 6;
        }
        return (i9 * 2) + 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static final int m2357c(int i9) {
        if (i9 > 0) {
            return (-1) >>> Integer.numberOfLeadingZeros(i9);
        }
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static final int m2358d(int i9) {
        if (i9 == 7) {
            return 8;
        }
        return ((i9 - 1) / 7) + i9;
    }
}
