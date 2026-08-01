package p245u0;

import p000A.C0072l0;
import p001A0.C0102b;
import p041H0.C0566K;
import p056K2.C0891q;
import p095T.AbstractC1385s;
import p095T.C1357e;
import p095T.C1366i0;
import p121Y1.C1753n;
import p153e1.EnumC2017m;
import p204n0.C2686e;
import p211o0.C2753l;
import p222q0.C2901b;
import p239t0.AbstractC3207b;

/* JADX INFO: renamed from: u0.I */
/* JADX INFO: loaded from: classes.dex */
public final class C3302I extends AbstractC3207b {

    /* JADX INFO: renamed from: e */
    public final C1366i0 f10209e = AbstractC1385s.m2629s(new C2686e(0));

    /* JADX INFO: renamed from: f */
    public final C1366i0 f10210f = AbstractC1385s.m2629s(Boolean.FALSE);

    /* JADX INFO: renamed from: g */
    public final C3298E f10211g;

    /* JADX INFO: renamed from: h */
    public final C1366i0 f10212h;

    /* JADX INFO: renamed from: i */
    public float f10213i;

    /* JADX INFO: renamed from: j */
    public C2753l f10214j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3302I(C3306c c3306c) {
        C3298E c3298e = new C3298E(c3306c);
        c3298e.f10190f = new C0102b(15, this);
        this.f10211g = c3298e;
        this.f10212h = new C1366i0(C0891q.f2780a, C1357e.f4795g);
        this.f10213i = 1.0f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p239t0.AbstractC3207b
    /* JADX INFO: renamed from: a */
    public final void mo5481a(float f2) {
        this.f10213i = f2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p239t0.AbstractC3207b
    /* JADX INFO: renamed from: b */
    public final void mo5482b(C2753l c2753l) {
        this.f10214j = c2753l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p239t0.AbstractC3207b
    /* JADX INFO: renamed from: d */
    public final long mo5483d() {
        return ((C2686e) this.f10209e.getValue()).f8570a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p239t0.AbstractC3207b
    /* JADX INFO: renamed from: e */
    public final void mo5484e(C0566K c0566k) {
        C2901b c2901b = c0566k.f1742d;
        C2753l c2753l = this.f10214j;
        C3298E c3298e = this.f10211g;
        if (c2753l == null) {
            c2753l = (C2753l) c3298e.f10191g.getValue();
        }
        if (((Boolean) this.f10210f.getValue()).booleanValue() && c0566k.getLayoutDirection() == EnumC2017m.f6743e) {
            long jMo856Y = c2901b.mo856Y();
            C0072l0 c0072l0 = c2901b.f9185e;
            long jM110n = c0072l0.m110n();
            c0072l0.m106j().mo4852n();
            try {
                ((C1753n) c0072l0.f307e).m3113I(-1.0f, 1.0f, jMo856Y);
                c3298e.m5569e(c0566k, this.f10213i, c2753l);
            } finally {
                c0072l0.m106j().mo4851l();
                c0072l0.m119y(jM110n);
            }
        } else {
            c3298e.m5569e(c0566k, this.f10213i, c2753l);
        }
        this.f10212h.getValue();
    }
}
