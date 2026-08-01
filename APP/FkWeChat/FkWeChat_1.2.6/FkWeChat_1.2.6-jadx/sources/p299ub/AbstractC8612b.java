package p299ub;

/* JADX INFO: renamed from: ub.b */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC8612b extends AbstractC8610a {
    /* JADX INFO: renamed from: d */
    public static final boolean m33080d(char c10, char c11, boolean z10) {
        if (c10 == c11) {
            return true;
        }
        if (!z10) {
            return false;
        }
        char upperCase = Character.toUpperCase(c10);
        char upperCase2 = Character.toUpperCase(c11);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }

    /* JADX INFO: renamed from: e */
    public static boolean m33081e(char c10) {
        return 55296 <= c10 && c10 < 57344;
    }
}
