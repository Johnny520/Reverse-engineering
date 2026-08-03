package p255r4;

import p227p4.C3315t;
import p311v4.C4452d;
import p376z4.C6090d;

/* JADX INFO: renamed from: r4.q */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3691q extends AbstractC3682l0 {

    /* JADX INFO: renamed from: k */
    public final C4452d f12023k;

    /* JADX INFO: renamed from: l */
    public byte[] f12024l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3691q(C4452d c4452d) {
        super(1, -1);
        this.f12023k = c4452d;
        this.f12024l = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p255r4.AbstractC3660a0
    /* JADX INFO: renamed from: a */
    public final void mo7638a(C3689p c3689p) {
        C3315t.m7001j(c3689p, this.f12023k);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p255r4.AbstractC3660a0
    /* JADX INFO: renamed from: b */
    public final EnumC3662b0 mo7639b() {
        return EnumC3662b0.f11875B;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p255r4.AbstractC3682l0
    /* JADX INFO: renamed from: e */
    public final int mo7640e(AbstractC3682l0 abstractC3682l0) {
        return this.f12023k.compareTo(((C3691q) abstractC3682l0).f12023k);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f12023k.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p255r4.AbstractC3682l0
    /* JADX INFO: renamed from: j */
    public final void mo7641j(C3680k0 c3680k0, int i9) {
        C6090d c6090d = new C6090d();
        new C3315t(c3680k0.f11995b, c6090d).m7021J(this.f12023k, false);
        byte[] bArrM10832h = c6090d.m10832h();
        this.f12024l = bArrM10832h;
        m7684k(bArrM10832h.length);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p255r4.AbstractC3682l0
    /* JADX INFO: renamed from: l */
    public final String mo7642l() {
        return this.f12023k.mo4901a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p255r4.AbstractC3682l0
    /* JADX INFO: renamed from: m */
    public final void mo7643m(C3689p c3689p, C6090d c6090d) {
        if (!c6090d.m10829d()) {
            c6090d.m10833i(this.f12024l);
        } else {
            c6090d.m10827b(0, m7682g().concat(" encoded array"));
            new C3315t(c3689p, c6090d).m7021J(this.f12023k, true);
        }
    }
}
