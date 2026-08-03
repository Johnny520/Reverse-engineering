package p000;

import java.util.Arrays;

/* JADX INFO: renamed from: z6 */
/* JADX INFO: loaded from: classes.dex */
public final class C2787z6 {

    /* JADX INFO: renamed from: a */
    public final byte[] f9452a;

    public C2787z6(int r3, byte[] r4) {
        byte[] r0 = new byte[r3];
        this.f9452a = r0;
        System.arraycopy(r4, 0, r0, 0, r3);
    }

    /* JADX INFO: renamed from: a */
    public static C2787z6 m5359a(byte[] r2) {
        if (r2 == null) goto L6;
        return new C2787z6(r2.length, r2);
    L6:
        throw new NullPointerException("data must be non-null");
    }

    public final boolean equals(Object r2) {
        if ((r2 instanceof C2787z6) == true) goto L7;
        return false;
    L7:
        return Arrays.equals(((C2787z6) r2).f9452a, this.f9452a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f9452a);
    }

    public final String toString() {
        return "Bytes(" + AbstractC0585Nj.m1155w(this.f9452a) + ")";
    }
}
