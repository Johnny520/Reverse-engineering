package p182m7;

import java.io.IOException;
import p241q7.C3445b;
import p257r7.AbstractC3712b;

/* JADX INFO: renamed from: m7.s */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2806s extends AbstractC3712b {

    /* JADX INFO: renamed from: m */
    public final C2807t f9064m;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2806s(C2807t c2807t) {
        super(0);
        this.f9064m = c2807t;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p257r7.AbstractC3712b, p152k7.AbstractC2331a
    /* JADX INFO: renamed from: B */
    public final void mo1893B(C3445b c3445b) throws IOException {
        C2807t c2807t = this.f9064m;
        m7715M(c2807t.f9067s.f12074o == 0 ? 0 : c2807t.f9073y.get() - c3445b.f11162k, false);
        super.mo1893B(c3445b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p257r7.AbstractC3712b, p152k7.AbstractC2331a
    /* JADX INFO: renamed from: r */
    public final byte[] mo5552r() {
        return this.f12076k;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "size = " + mo5551p();
    }
}
