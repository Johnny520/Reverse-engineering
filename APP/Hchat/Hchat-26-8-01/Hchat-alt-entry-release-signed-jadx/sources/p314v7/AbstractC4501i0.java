package p314v7;

import java.io.IOException;
import p152k7.AbstractC2331a;
import p241q7.C3445b;
import p257r7.AbstractC3712b;

/* JADX INFO: renamed from: v7.i0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4501i0 extends AbstractC3712b {

    /* JADX INFO: renamed from: m */
    public C4499h0 f14855m;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC4501i0(int i9) {
        super(i9);
        byte[] bArr = this.f12076k;
        int length = bArr.length;
        if (length > 1) {
            AbstractC2331a.m5536F(bArr, 0, (short) length);
        }
        AbstractC2331a.m5534D(this.f12076k, 4, -1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p257r7.AbstractC3712b, p152k7.AbstractC2331a
    /* JADX INFO: renamed from: B */
    public final void mo1893B(C3445b c3445b) throws IOException {
        int i9 = c3445b.f11162k;
        byte[] bArr = this.f12076k;
        c3445b.m7229e(bArr, bArr.length);
        if (AbstractC2331a.m5538q(this.f12076k, 2, 3)) {
            return;
        }
        c3445b.m7230g(i9);
        m7715M(65535 & c3445b.readShort(), false);
        byte[] bArr2 = this.f12076k;
        c3445b.m7229e(bArr2, bArr2.length);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: N */
    public final int m8934N() {
        boolean zM5538q = AbstractC2331a.m5538q(this.f12076k, 2, 3);
        byte[] bArr = this.f12076k;
        return zM5538q ? AbstractC2331a.m5542x(bArr, 0) : AbstractC2331a.m5539s(bArr, 4);
    }
}
