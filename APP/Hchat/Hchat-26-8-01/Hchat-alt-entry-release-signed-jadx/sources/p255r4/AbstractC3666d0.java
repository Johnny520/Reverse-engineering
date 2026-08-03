package p255r4;

import p000a.AbstractC0000a;
import p311v4.AbstractC4474w;
import p311v4.C4477z;
import p376z4.C6090d;

/* JADX INFO: renamed from: r4.d0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3666d0 extends AbstractC3705y {

    /* JADX INFO: renamed from: i */
    public final AbstractC4474w f11916i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC3666d0(AbstractC4474w abstractC4474w) {
        super(abstractC4474w.f14821g);
        this.f11916i = abstractC4474w;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p255r4.AbstractC3660a0
    /* JADX INFO: renamed from: c */
    public final int mo7644c() {
        return 8;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p255r4.AbstractC3660a0
    /* JADX INFO: renamed from: d */
    public final void mo7645d(C3689p c3689p, C6090d c6090d) {
        C3674h0 c3674h0 = c3689p.f12005g;
        C3674h0 c3674h02 = c3689p.f12004f;
        AbstractC4474w abstractC4474w = this.f11916i;
        C4477z c4477z = abstractC4474w.f14822h;
        int iM7657m = c3674h0.m7657m(this.f12038h);
        int iM7656l = c3674h02.m7656l(c4477z.f14827g);
        int iMo7648i = mo7648i(c3689p);
        if (c6090d.m10829d()) {
            c6090d.m10827b(0, m7710f() + ' ' + abstractC4474w.mo4901a());
            c6090d.m10827b(2, "  class_idx: ".concat(AbstractC0000a.m46X0(iM7657m)));
            c6090d.m10827b(2, String.format("  %-10s %s", mo7649j().concat(":"), AbstractC0000a.m46X0(iMo7648i)));
            c6090d.m10827b(4, "  name_idx:  ".concat(AbstractC0000a.m48Y0(iM7656l)));
        }
        c6090d.m10836l(iM7657m);
        c6090d.m10836l(iMo7648i);
        c6090d.m10835k(iM7656l);
    }

    /* JADX INFO: renamed from: i */
    public abstract int mo7648i(C3689p c3689p);

    /* JADX INFO: renamed from: j */
    public abstract String mo7649j();
}
