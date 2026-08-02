package p000;

/* JADX INFO: renamed from: y3 */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0909y3 extends AbstractC0796v3 {

    /* JADX INFO: renamed from: j */
    public static C0909y3 f13286j;

    @Override // p000.AbstractC0796v3
    /* JADX INFO: renamed from: a */
    public final int[] mo5611a(int i) {
        int length = m5613c().length();
        if (length <= 0 || i >= length) {
            return null;
        }
        if (i < 0) {
            i = 0;
        }
        while (i < length && m5613c().charAt(i) == '\n' && (m5613c().charAt(i) == '\n' || (i != 0 && m5613c().charAt(i - 1) != '\n'))) {
            i++;
        }
        if (i >= length) {
            return null;
        }
        int i2 = i + 1;
        while (i2 < length && !m6210k(i2)) {
            i2++;
        }
        return m5612b(i, i2);
    }

    @Override // p000.AbstractC0796v3
    /* JADX INFO: renamed from: i */
    public final int[] mo5618i(int i) {
        int length = m5613c().length();
        if (length <= 0 || i <= 0) {
            return null;
        }
        if (i > length) {
            i = length;
        }
        while (i > 0 && m5613c().charAt(i - 1) == '\n' && !m6210k(i)) {
            i--;
        }
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        while (i2 > 0 && (m5613c().charAt(i2) == '\n' || (i2 != 0 && m5613c().charAt(i2 - 1) != '\n'))) {
            i2--;
        }
        return m5612b(i2, i);
    }

    /* JADX INFO: renamed from: k */
    public final boolean m6210k(int i) {
        if (i <= 0 || m5613c().charAt(i - 1) == '\n') {
            return false;
        }
        return i == m5613c().length() || m5613c().charAt(i) == '\n';
    }
}
