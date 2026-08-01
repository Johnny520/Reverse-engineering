package p047I0;

/* JADX INFO: renamed from: I0.f */
/* JADX INFO: loaded from: classes.dex */
public final class C0725f extends AbstractC0716c {

    /* JADX INFO: renamed from: f */
    public static C0725f f2294f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p047I0.AbstractC0716c
    /* JADX INFO: renamed from: a */
    public final int[] mo1217a(int i5) {
        int length = m1219c().length();
        if (length <= 0 || i5 >= length) {
            return null;
        }
        if (i5 < 0) {
            i5 = 0;
        }
        while (i5 < length && m1219c().charAt(i5) == '\n' && (m1219c().charAt(i5) == '\n' || (i5 != 0 && m1219c().charAt(i5 - 1) != '\n'))) {
            i5++;
        }
        if (i5 >= length) {
            return null;
        }
        int i6 = i5 + 1;
        while (i6 < length && !m1227e(i6)) {
            i6++;
        }
        return m1218b(i5, i6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p047I0.AbstractC0716c
    /* JADX INFO: renamed from: d */
    public final int[] mo1220d(int i5) {
        int length = m1219c().length();
        if (length <= 0 || i5 <= 0) {
            return null;
        }
        if (i5 > length) {
            i5 = length;
        }
        while (i5 > 0 && m1219c().charAt(i5 - 1) == '\n' && !m1227e(i5)) {
            i5--;
        }
        if (i5 <= 0) {
            return null;
        }
        int i6 = i5 - 1;
        while (i6 > 0 && (m1219c().charAt(i6) == '\n' || (i6 != 0 && m1219c().charAt(i6 - 1) != '\n'))) {
            i6--;
        }
        return m1218b(i6, i5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final boolean m1227e(int i5) {
        if (i5 <= 0 || m1219c().charAt(i5 - 1) == '\n') {
            return false;
        }
        return i5 == m1219c().length() || m1219c().charAt(i5) == '\n';
    }
}
