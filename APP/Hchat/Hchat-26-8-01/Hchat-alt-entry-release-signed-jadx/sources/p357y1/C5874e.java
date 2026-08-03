package p357y1;

/* JADX INFO: renamed from: y1.e */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5874e extends AbstractC5862b {

    /* JADX INFO: renamed from: c */
    public static C5874e f23847c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p357y1.AbstractC5862b
    /* JADX INFO: renamed from: a */
    public final int[] mo10564a(int i9) {
        int length = m10566c().length();
        if (length <= 0 || i9 >= length) {
            return null;
        }
        if (i9 < 0) {
            i9 = 0;
        }
        while (i9 < length && m10566c().charAt(i9) == '\n' && (m10566c().charAt(i9) == '\n' || (i9 != 0 && m10566c().charAt(i9 - 1) != '\n'))) {
            i9++;
        }
        if (i9 >= length) {
            return null;
        }
        int i10 = i9 + 1;
        while (i10 < length && !m10578e(i10)) {
            i10++;
        }
        return m10565b(i9, i10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p357y1.AbstractC5862b
    /* JADX INFO: renamed from: d */
    public final int[] mo10567d(int i9) {
        int length = m10566c().length();
        if (length <= 0 || i9 <= 0) {
            return null;
        }
        if (i9 > length) {
            i9 = length;
        }
        while (i9 > 0 && m10566c().charAt(i9 - 1) == '\n' && !m10578e(i9)) {
            i9--;
        }
        if (i9 <= 0) {
            return null;
        }
        int i10 = i9 - 1;
        while (i10 > 0 && (m10566c().charAt(i10) == '\n' || (i10 != 0 && m10566c().charAt(i10 - 1) != '\n'))) {
            i10--;
        }
        return m10565b(i10, i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final boolean m10578e(int i9) {
        if (i9 <= 0 || m10566c().charAt(i9 - 1) == '\n') {
            return false;
        }
        return i9 == m10566c().length() || m10566c().charAt(i9) == '\n';
    }
}
