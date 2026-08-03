package p255r4;

import p000a.AbstractC0000a;
import p311v4.C4451c0;
import p376z4.C6090d;

/* JADX INFO: renamed from: r4.s0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3696s0 extends AbstractC3705y {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p255r4.AbstractC3660a0
    /* JADX INFO: renamed from: a */
    public final void mo7638a(C3689p c3689p) {
        c3689p.f12004f.m7662r(this.f12038h.m8904k());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p255r4.AbstractC3660a0
    /* JADX INFO: renamed from: b */
    public final EnumC3662b0 mo7639b() {
        return EnumC3662b0.f11882l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p255r4.AbstractC3660a0
    /* JADX INFO: renamed from: c */
    public final int mo7644c() {
        return 4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p255r4.AbstractC3660a0
    /* JADX INFO: renamed from: d */
    public final void mo7645d(C3689p c3689p, C6090d c6090d) {
        C4451c0 c4451c0M8904k = this.f12038h.m8904k();
        int iM7656l = c3689p.f12004f.m7656l(c4451c0M8904k);
        if (c6090d.m10829d()) {
            c6090d.m10827b(0, m7710f() + ' ' + c4451c0M8904k.mo4901a());
            c6090d.m10827b(4, "  descriptor_idx: ".concat(AbstractC0000a.m48Y0(iM7656l)));
        }
        c6090d.m10835k(iM7656l);
    }
}
