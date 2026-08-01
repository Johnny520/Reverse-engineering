package p000;

import java.io.File;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class ue0 {

    /* JADX INFO: renamed from: c */
    private static final long f6205c = 600000;

    /* JADX INFO: renamed from: a */
    public static final ue0 f6203a = new ue0();

    /* JADX INFO: renamed from: b */
    private static final u60 f6204b = new x51(new sc0(3));

    /* JADX INFO: renamed from: d */
    public static final int f6206d = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private ue0() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static final String m4319b() {
        return ik0.f2579a.m1592a(100, 28, 17, 69, 42, 87, 28, 94, 40, 25, 28, 30, 63, 21, 0, 30, 51, 8, 65, 110, 42, 27, 4, 88, 61, 29);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    private final String m4320d() {
        return (String) f6204b.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final void m4321c() {
        try {
            new File(m4320d()).delete();
        } catch (Exception unused) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final boolean m4322e() {
        Long lM3384U;
        try {
            File file = new File(m4320d());
            if (file.exists() && (lM3384U = r41.m3384U(AbstractC0627pt.m3156c0(file))) != null) {
                return System.currentTimeMillis() - lM3384U.longValue() < f6205c;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final void m4323f() {
        try {
            AbstractC0627pt.m3157d0(String.valueOf(System.currentTimeMillis()), new File(m4320d()));
        } catch (Exception unused) {
        }
    }
}
