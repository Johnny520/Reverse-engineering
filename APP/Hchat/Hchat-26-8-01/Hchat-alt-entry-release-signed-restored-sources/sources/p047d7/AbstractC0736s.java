package p047d7;

import java.io.InputStream;
import p152k7.AbstractC2331a;
import p241q7.C3445b;
import p257r7.AbstractC3712b;

/* JADX INFO: renamed from: d7.s */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0736s extends AbstractC3712b {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p257r7.AbstractC3712b, p152k7.AbstractC2331a
    /* JADX INFO: renamed from: B */
    public final void mo1893B(C3445b c3445b) {
        mo1924S(c3445b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: N */
    public final long m1927N(int i9) {
        return ((long) AbstractC2331a.m5539s(this.f12076k, i9)) & 4294967295L;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: O */
    public final int m1928O(int i9) {
        return AbstractC2331a.m5541w(this.f12076k, i9) & 65535;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: P */
    public final void m1929P(byte[] bArr, int i9, int i10, int i11) {
        if (i11 <= 0 || bArr.length == 0) {
            return;
        }
        int i12 = i10 + i11;
        if (i12 > mo5551p()) {
            m7715M(i12, false);
        }
        System.arraycopy(bArr, i9, this.f12076k, i10, i11);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Q */
    public final void m1930Q(int i9, long j3) {
        AbstractC2331a.m5534D(this.f12076k, i9, (int) j3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: R */
    public final void m1931R(int i9, int i10) {
        AbstractC2331a.m5536F(this.f12076k, i9, (short) i10);
    }

    /* JADX INFO: renamed from: S */
    public abstract int mo1924S(InputStream inputStream);
}
