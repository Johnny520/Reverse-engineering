package p046d6;

/* JADX INFO: renamed from: d6.n */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0717n {

    /* JADX INFO: renamed from: a */
    public static final C0716m f2154a = new C0716m(0);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static void m1890a(int i9, int i10) {
        StringBuilder sb2 = new StringBuilder("bad utf-8 byte ");
        char[] cArr = new char[2];
        for (int i11 = 0; i11 < 2; i11++) {
            cArr[1 - i11] = Character.forDigit(i9 & 15, 16);
            i9 >>= 4;
        }
        sb2.append(new String(cArr));
        sb2.append(" at offset ");
        char[] cArr2 = new char[8];
        for (int i12 = 0; i12 < 8; i12++) {
            cArr2[7 - i12] = Character.forDigit(i10 & 15, 16);
            i10 >>= 4;
        }
        sb2.append(new String(cArr2));
        throw new IllegalArgumentException(sb2.toString());
    }
}
