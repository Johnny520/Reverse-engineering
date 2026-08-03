package p257r7;

import p152k7.AbstractC2331a;

/* JADX INFO: renamed from: r7.f */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class C3716f extends AbstractC3712b implements InterfaceC3723m {

    /* JADX INFO: renamed from: m */
    public final boolean f12082m;

    /* JADX INFO: renamed from: n */
    public int f12083n;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3716f(int i9) {
        this(false);
        mo633k(i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p257r7.AbstractC3712b
    /* JADX INFO: renamed from: L */
    public final void mo7712L() {
        byte[] bArr = this.f12076k;
        int iM5539s = 0;
        if (!this.f12082m) {
            iM5539s = AbstractC2331a.m5539s(bArr, 0);
        } else if (4 <= bArr.length) {
            iM5539s = (bArr[3] & 255) | ((bArr[2] & 255) << 8) | ((bArr[1] & 255) << 16) | ((bArr[0] & 255) << 24);
        }
        this.f12083n = iM5539s;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p257r7.InterfaceC3717g
    public final int get() {
        return this.f12083n;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p257r7.InterfaceC3717g
    /* JADX INFO: renamed from: k */
    public final void mo633k(int i9) {
        if (i9 == this.f12083n) {
            return;
        }
        this.f12083n = i9;
        byte[] bArr = this.f12076k;
        if (!this.f12082m) {
            AbstractC2331a.m5534D(bArr, 0, i9);
        } else {
            if (4 > bArr.length) {
                return;
            }
            bArr[0] = (byte) ((i9 >>> 24) & 255);
            bArr[1] = (byte) ((i9 >>> 16) & 255);
            bArr[2] = (byte) ((i9 >>> 8) & 255);
            bArr[3] = (byte) (i9 & 255);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        return String.valueOf(this.f12083n);
    }

    public C3716f(boolean z9) {
        super(4);
        this.f12082m = z9;
    }
}
