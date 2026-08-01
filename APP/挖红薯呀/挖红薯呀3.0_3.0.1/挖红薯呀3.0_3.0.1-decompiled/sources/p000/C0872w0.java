package p000;

/* JADX INFO: renamed from: w0 */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0872w0 extends AbstractC0747t0 {

    /* JADX INFO: renamed from: c */
    public static C0872w0 f6884c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0747t0
    /* JADX INFO: renamed from: a */
    public final int[] mo4139a(int i) {
        int length = m4141c().length();
        if (length <= 0 || i >= length) {
            return null;
        }
        if (i < 0) {
            i = 0;
        }
        while (i < length && m4141c().charAt(i) == '\n' && (m4141c().charAt(i) == '\n' || (i != 0 && m4141c().charAt(i - 1) != '\n'))) {
            i++;
        }
        if (i >= length) {
            return null;
        }
        int i2 = i + 1;
        while (i2 < length && !m4822e(i2)) {
            i2++;
        }
        return m4140b(i, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0747t0
    /* JADX INFO: renamed from: d */
    public final int[] mo4142d(int i) {
        int length = m4141c().length();
        if (length <= 0 || i <= 0) {
            return null;
        }
        if (i > length) {
            i = length;
        }
        while (i > 0 && m4141c().charAt(i - 1) == '\n' && !m4822e(i)) {
            i--;
        }
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        while (i2 > 0 && (m4141c().charAt(i2) == '\n' || (i2 != 0 && m4141c().charAt(i2 - 1) != '\n'))) {
            i2--;
        }
        return m4140b(i2, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final boolean m4822e(int i) {
        if (i <= 0 || m4141c().charAt(i - 1) == '\n') {
            return false;
        }
        return i == m4141c().length() || m4141c().charAt(i) == '\n';
    }
}
