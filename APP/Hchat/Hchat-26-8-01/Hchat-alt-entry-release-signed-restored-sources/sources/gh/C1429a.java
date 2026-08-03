package gh;

import java.nio.ByteBuffer;
import p094g6.C1354b;
import p343x6.AbstractC5700d;

/* JADX INFO: renamed from: gh.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1429a extends AbstractC5700d {

    /* JADX INFO: renamed from: g */
    public int f4740g;

    /* JADX INFO: renamed from: h */
    public int f4741h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1429a(int i9) {
        this.f4740g = i9;
        this.f4741h = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p343x6.AbstractC5700d
    /* JADX INFO: renamed from: G */
    public final int mo1577G(C1354b c1354b) {
        int i9 = this.f4740g;
        int i10 = this.f4741h;
        c1354b.m3642n(2);
        if (i10 != 0) {
            c1354b.m3639k(4, 0);
            ByteBuffer byteBuffer = c1354b.f4486a;
            int i11 = c1354b.f4487b - 4;
            c1354b.f4487b = i11;
            byteBuffer.putInt(i11, i10);
            c1354b.m3641m(1);
        }
        if (i9 != 0) {
            c1354b.m3639k(4, 0);
            ByteBuffer byteBuffer2 = c1354b.f4486a;
            int i12 = c1354b.f4487b - 4;
            c1354b.f4487b = i12;
            byteBuffer2.putInt(i12, i9);
            c1354b.m3641m(0);
        }
        int iM3635g = c1354b.m3635g();
        c1354b.m3637i(iM3635g);
        return iM3635g;
    }
}
