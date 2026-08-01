package p299ub;

/* JADX INFO: renamed from: ub.e */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC8618e {

    /* JADX INFO: renamed from: a */
    public static final int[] f28674a;

    /* JADX INFO: renamed from: b */
    public static final int[] f28675b;

    /* JADX INFO: renamed from: c */
    public static final int[] f28676c;

    /* JADX INFO: renamed from: d */
    public static final long[] f28677d;

    static {
        int[] iArr = new int[256];
        int i10 = 0;
        for (int i11 = 0; i11 < 256; i11++) {
            iArr[i11] = "0123456789abcdef".charAt(i11 & 15) | ("0123456789abcdef".charAt(i11 >> 4) << '\b');
        }
        f28674a = iArr;
        int[] iArr2 = new int[256];
        for (int i12 = 0; i12 < 256; i12++) {
            iArr2[i12] = "0123456789ABCDEF".charAt(i12 & 15) | ("0123456789ABCDEF".charAt(i12 >> 4) << '\b');
        }
        f28675b = iArr2;
        int[] iArr3 = new int[256];
        for (int i13 = 0; i13 < 256; i13++) {
            iArr3[i13] = -1;
        }
        int i14 = 0;
        int i15 = 0;
        while (i14 < "0123456789abcdef".length()) {
            iArr3["0123456789abcdef".charAt(i14)] = i15;
            i14++;
            i15++;
        }
        int i16 = 0;
        int i17 = 0;
        while (i16 < "0123456789ABCDEF".length()) {
            iArr3["0123456789ABCDEF".charAt(i16)] = i17;
            i16++;
            i17++;
        }
        f28676c = iArr3;
        long[] jArr = new long[256];
        for (int i18 = 0; i18 < 256; i18++) {
            jArr[i18] = -1;
        }
        int i19 = 0;
        int i20 = 0;
        while (i19 < "0123456789abcdef".length()) {
            jArr["0123456789abcdef".charAt(i19)] = i20;
            i19++;
            i20++;
        }
        int i21 = 0;
        while (i10 < "0123456789ABCDEF".length()) {
            jArr["0123456789ABCDEF".charAt(i10)] = i21;
            i10++;
            i21++;
        }
        f28677d = jArr;
    }

    /* JADX INFO: renamed from: b */
    public static final int[] m33092b() {
        return f28674a;
    }
}
