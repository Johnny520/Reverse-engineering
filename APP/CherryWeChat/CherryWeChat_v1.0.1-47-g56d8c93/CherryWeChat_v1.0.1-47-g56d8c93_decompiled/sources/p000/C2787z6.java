package p000;

import java.util.Arrays;

/* JADX INFO: renamed from: z6 */
/* JADX INFO: loaded from: classes.dex */
public final class C2787z6 {

    /* JADX INFO: renamed from: a */
    public final byte[] f9452a;

    public C2787z6(int i, byte[] bArr) {
        byte[] bArr2 = new byte[i];
        this.f9452a = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, i);
    }

    /* JADX INFO: renamed from: a */
    public static C2787z6 m5359a(byte[] bArr) {
        if (bArr != null) {
            return new C2787z6(bArr.length, bArr);
        }
        throw new NullPointerException("data must be non-null");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2787z6) {
            return Arrays.equals(((C2787z6) obj).f9452a, this.f9452a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f9452a);
    }

    public final String toString() {
        return "Bytes(" + AbstractC0585Nj.m1155w(this.f9452a) + ")";
    }
}
