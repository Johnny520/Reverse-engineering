package p125i7;

/* JADX INFO: renamed from: i7.m0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3225m0 {

    /* JADX INFO: renamed from: a */
    public static final String[] f8633a;

    static {
        String[] strArr = new String[1024];
        for (int i10 = 0; i10 < 1024; i10++) {
            strArr[i10] = String.valueOf(i10);
        }
        f8633a = strArr;
    }

    /* JADX INFO: renamed from: a */
    public static final String m12252a(long j10) {
        return (0 > j10 || j10 >= 1024) ? String.valueOf(j10) : f8633a[(int) j10];
    }
}
