package p255r4;

import p000a.AbstractC0000a;
import p376z4.C6090d;

/* JADX INFO: renamed from: r4.c */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3663c extends AbstractC3682l0 {

    /* JADX INFO: renamed from: k */
    public C3661b f11900k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p255r4.AbstractC3660a0
    /* JADX INFO: renamed from: a */
    public final void mo7638a(C3689p c3689p) {
        this.f11900k = (C3661b) c3689p.f12000b.m7679l(this.f11900k);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p255r4.AbstractC3660a0
    /* JADX INFO: renamed from: b */
    public final EnumC3662b0 mo7639b() {
        return EnumC3662b0.f11878E;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p255r4.AbstractC3682l0
    /* JADX INFO: renamed from: l */
    public final String mo7642l() {
        return this.f11900k.f11872k.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p255r4.AbstractC3682l0
    /* JADX INFO: renamed from: m */
    public final void mo7643m(C3689p c3689p, C6090d c6090d) {
        int iM7681f = this.f11900k.m7681f();
        if (c6090d.m10829d()) {
            c6090d.m10827b(4, "  annotations_off: ".concat(AbstractC0000a.m48Y0(iM7681f)));
        }
        c6090d.m10835k(iM7681f);
    }
}
