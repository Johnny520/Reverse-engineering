package p257r7;

import p152k7.AbstractC2331a;

/* JADX INFO: renamed from: r7.h */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3718h extends AbstractC3712b implements InterfaceC3717g {

    /* JADX INFO: renamed from: m */
    public final boolean f12084m;

    /* JADX INFO: renamed from: n */
    public long f12085n;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3718h(boolean z9) {
        super(8);
        this.f12084m = z9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p257r7.AbstractC3712b
    /* JADX INFO: renamed from: L */
    public final void mo7712L() {
        long jM5540t;
        byte[] bArr = this.f12076k;
        if (this.f12084m) {
            jM5540t = 0;
            if (8 <= bArr.length) {
                for (int i9 = 0; i9 < 8; i9++) {
                    jM5540t = (jM5540t << 8) | ((long) (bArr[i9] & 255));
                }
            }
        } else {
            jM5540t = AbstractC2331a.m5540t(bArr, 0);
        }
        this.f12085n = jM5540t;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: N */
    public final void m7726N(long j3) {
        if (j3 == this.f12085n) {
            return;
        }
        this.f12085n = j3;
        byte[] bArr = this.f12076k;
        if (this.f12084m) {
            if (8 > bArr.length) {
                return;
            }
            for (int i9 = 7; i9 >= 0; i9--) {
                bArr[i9] = (byte) (j3 & 255);
                j3 >>>= 8;
            }
            return;
        }
        if (8 > bArr.length) {
            return;
        }
        for (int i10 = 0; i10 < 8; i10++) {
            bArr[i10] = (byte) (j3 & 255);
            j3 >>>= 8;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p257r7.InterfaceC3717g
    public final int get() {
        return (int) this.f12085n;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p257r7.InterfaceC3717g
    /* JADX INFO: renamed from: k */
    public final void mo633k(int i9) {
        m7726N(((long) i9) & 4294967295L);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return String.valueOf(this.f12085n);
    }
}
