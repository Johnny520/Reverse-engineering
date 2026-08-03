package p086fh;

import java.nio.ByteBuffer;
import p094g6.C1354b;

/* JADX INFO: renamed from: fh.g */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1249g extends AbstractC1244b {

    /* JADX INFO: renamed from: g */
    public final long f4097g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1249g(long j3) {
        this.f4097g = j3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p343x6.AbstractC5700d
    /* JADX INFO: renamed from: G */
    public final int mo1577G(C1354b c1354b) {
        c1354b.m3642n(1);
        long j3 = this.f4097g;
        if (j3 != 0) {
            c1354b.m3639k(8, 0);
            ByteBuffer byteBuffer = c1354b.f4486a;
            int i9 = c1354b.f4487b - 8;
            c1354b.f4487b = i9;
            byteBuffer.putLong(i9, j3);
            c1354b.m3641m(0);
        }
        int iM3635g = c1354b.m3635g();
        c1354b.m3637i(iM3635g);
        return iM3635g;
    }
}
