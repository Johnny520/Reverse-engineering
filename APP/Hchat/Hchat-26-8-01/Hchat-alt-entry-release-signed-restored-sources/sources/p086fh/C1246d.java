package p086fh;

import java.nio.ByteBuffer;
import p094g6.C1354b;

/* JADX INFO: renamed from: fh.d */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1246d extends AbstractC1244b {

    /* JADX INFO: renamed from: g */
    public final double f4094g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1246d(double d10) {
        this.f4094g = d10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p343x6.AbstractC5700d
    /* JADX INFO: renamed from: G */
    public final int mo1577G(C1354b c1354b) {
        c1354b.m3642n(1);
        double d10 = this.f4094g;
        if (d10 != 0.0d) {
            c1354b.m3639k(8, 0);
            ByteBuffer byteBuffer = c1354b.f4486a;
            int i9 = c1354b.f4487b - 8;
            c1354b.f4487b = i9;
            byteBuffer.putDouble(i9, d10);
            c1354b.m3641m(0);
        }
        int iM3635g = c1354b.m3635g();
        c1354b.m3637i(iM3635g);
        return iM3635g;
    }
}
