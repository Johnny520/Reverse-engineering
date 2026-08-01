package p041H0;

/* JADX INFO: renamed from: H0.f0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0592f0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1908a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final int m966a(long j5, int i5) {
        int i6 = AbstractC0554C0.f1667b;
        return ((int) (j5 >> (i5 * 15))) & 32767;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static long m967c(int i5, int i6, int i7, int i8) {
        return (((long) (i6 & 32767)) << 15) | ((long) (i5 & 32767)) | (((long) (i7 & 32767)) << 30) | (((long) (i8 & 32767)) << 45) | Long.MIN_VALUE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public int m968b() {
        switch (this.f1908a) {
            case 0:
                return 16;
            default:
                return 8;
        }
    }
}
