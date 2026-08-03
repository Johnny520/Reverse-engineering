package p086fh;

import java.nio.ByteBuffer;
import p094g6.C1354b;

/* JADX INFO: renamed from: fh.f */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1248f extends AbstractC1244b {

    /* JADX INFO: renamed from: g */
    public final int f4096g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1248f(int i9) {
        this.f4096g = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p343x6.AbstractC5700d
    /* JADX INFO: renamed from: G */
    public final int mo1577G(C1354b c1354b) {
        c1354b.m3642n(1);
        int i9 = this.f4096g;
        if (i9 != 0) {
            c1354b.m3639k(4, 0);
            ByteBuffer byteBuffer = c1354b.f4486a;
            int i10 = c1354b.f4487b - 4;
            c1354b.f4487b = i10;
            byteBuffer.putInt(i10, i9);
            c1354b.m3641m(0);
        }
        int iM3635g = c1354b.m3635g();
        c1354b.m3637i(iM3635g);
        return iM3635g;
    }
}
