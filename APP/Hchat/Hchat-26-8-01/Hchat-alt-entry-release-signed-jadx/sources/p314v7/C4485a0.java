package p314v7;

import p068eh.AbstractC0921a;
import p136j8.C2104o;
import p257r7.C3713c;

/* JADX INFO: renamed from: v7.a0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4485a0 extends C3713c {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: S */
    public final byte[] m8918S(int i9, int i10) {
        byte[] bArr = this.f12076k;
        int length = bArr.length - i9;
        if (length < i10 || length <= 0) {
            return null;
        }
        byte[] bArr2 = new byte[i10];
        if (i10 >= 0) {
            System.arraycopy(bArr, i9, bArr2, 0, i10);
        }
        return bArr2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: T */
    public final int m8919T(int i9, int i10) {
        byte[] bArr = this.f12076k;
        if (bArr.length < i9 + i10) {
            return 0;
        }
        if (i10 == 1) {
            return bArr[i9] & 255;
        }
        if (i10 == 2) {
            return ((short) (((bArr[i9 + 1] & 255) << 8) | (bArr[i9] & 255))) & 65535;
        }
        if (i10 == 4) {
            return m7718O(i9);
        }
        C2104o.m5294t(AbstractC0921a.m2249l(i10, "Invalid data size "));
        return 0;
    }
}
