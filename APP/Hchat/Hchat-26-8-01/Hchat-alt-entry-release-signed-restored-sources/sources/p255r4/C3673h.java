package p255r4;

import p227p4.C3315t;
import p311v4.C4459h;
import p376z4.C6090d;

/* JADX INFO: renamed from: r4.h */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3673h extends AbstractC3682l0 {

    /* JADX INFO: renamed from: k */
    public final C4459h f11929k;

    /* JADX INFO: renamed from: l */
    public byte[] f11930l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3673h(C4459h c4459h) {
        super(1, -1);
        this.f11929k = c4459h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p255r4.AbstractC3660a0
    /* JADX INFO: renamed from: a */
    public final void mo7638a(C3689p c3689p) {
        C3315t.m7001j(c3689p, this.f11929k);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p255r4.AbstractC3660a0
    /* JADX INFO: renamed from: b */
    public final EnumC3662b0 mo7639b() {
        return EnumC3662b0.f11875B;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p255r4.AbstractC3682l0
    /* JADX INFO: renamed from: j */
    public final void mo7641j(C3680k0 c3680k0, int i9) {
        C6090d c6090d = new C6090d();
        new C3315t(c3680k0.f11995b, c6090d).m7021J(this.f11929k, true);
        byte[] bArrM10832h = c6090d.m10832h();
        this.f11930l = bArrM10832h;
        m7684k(bArrM10832h.length);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p255r4.AbstractC3682l0
    /* JADX INFO: renamed from: l */
    public final String mo7642l() {
        return this.f11929k.mo4901a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p255r4.AbstractC3682l0
    /* JADX INFO: renamed from: m */
    public final void mo7643m(C3689p c3689p, C6090d c6090d) {
        if (!c6090d.m10829d()) {
            c6090d.m10833i(this.f11930l);
        } else {
            c6090d.m10827b(0, m7682g().concat(" call site"));
            new C3315t(c3689p, c6090d).m7021J(this.f11929k, true);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return this.f11929k.toString();
    }
}
