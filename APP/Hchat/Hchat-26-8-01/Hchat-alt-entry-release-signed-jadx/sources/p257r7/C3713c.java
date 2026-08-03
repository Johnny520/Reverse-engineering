package p257r7;

/* JADX INFO: renamed from: r7.c */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class C3713c extends AbstractC3712b implements InterfaceC3717g {

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ int f12077m;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3713c(int i9, int i10) {
        super(i9);
        this.f12077m = i10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: N */
    public static boolean m7716N(byte[] bArr, byte[] bArr2) {
        if (bArr == bArr2) {
            return true;
        }
        if (bArr.length == 0) {
            if (bArr2.length == 0) {
                return true;
            }
        } else if (bArr2.length != 0 && bArr.length == bArr2.length) {
            for (int i9 = 0; i9 < bArr.length; i9++) {
                if (bArr[i9] == bArr2[i9]) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: R */
    public static byte[] m7717R(byte[] bArr) {
        if (bArr == null) {
            return new byte[0];
        }
        int i9 = 0;
        for (int i10 = 0; i10 < bArr.length; i10++) {
            if (bArr[i10] != 0) {
                i9 = i10 + 1;
            }
        }
        byte[] bArr2 = new byte[i9];
        if (i9 > 0) {
            System.arraycopy(bArr, 0, bArr2, 0, i9);
        }
        return bArr2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: O */
    public int m7718O(int i9) {
        byte[] bArr = this.f12076k;
        if (i9 + 4 > bArr.length) {
            return 0;
        }
        return ((bArr[i9 + 3] & 255) << 24) | (bArr[i9] & 255) | ((bArr[i9 + 1] & 255) << 8) | ((bArr[i9 + 2] & 255) << 16);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: P */
    public void m7719P(byte b10) {
        this.f12076k[0] = b10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Q */
    public void m7720Q(int i9) {
        if (i9 < 0) {
            i9 = 0;
        }
        m7715M(i9, true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p257r7.InterfaceC3717g
    public int get() {
        return this.f12076k[0] & 255;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p257r7.InterfaceC3717g
    /* JADX INFO: renamed from: k */
    public void mo633k(int i9) {
        m7719P((byte) i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        switch (this.f12077m) {
            case 0:
                return "size=" + this.f12076k.length;
            default:
                return String.valueOf((int) this.f12076k[0]);
        }
    }
}
