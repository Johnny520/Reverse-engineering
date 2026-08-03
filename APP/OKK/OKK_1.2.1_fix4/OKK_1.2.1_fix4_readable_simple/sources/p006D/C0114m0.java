package p006D;

import android.view.WindowInsets;
import p001A0.AbstractC0016B;
import p085v.C1102c;

/* JADX INFO: renamed from: D.m0 */
/* JADX INFO: loaded from: classes.dex */
public class C0114m0 extends C0112l0 {

    /* JADX INFO: renamed from: n */
    public C1102c f300n;

    /* JADX INFO: renamed from: o */
    public C1102c f301o;

    /* JADX INFO: renamed from: p */
    public C1102c f302p;

    public C0114m0(C0122q0 r1, WindowInsets r2) {
        super(r1, r2);
        this.f300n = null;
        this.f301o = null;
        this.f302p = null;
    }

    @Override // p006D.C0118o0
    /* JADX INFO: renamed from: g */
    public C1102c mo418g() {
        if (this.f301o != null) goto L6;
        this.f301o = C1102c.m2599c(AbstractC0016B.m47t(this.f288c));
    L6:
        return this.f301o;
    }

    @Override // p006D.C0118o0
    /* JADX INFO: renamed from: i */
    public C1102c mo419i() {
        if (this.f300n != null) goto L6;
        this.f300n = C1102c.m2599c(AbstractC0016B.m51x(this.f288c));
    L6:
        return this.f300n;
    }

    @Override // p006D.C0118o0
    /* JADX INFO: renamed from: k */
    public C1102c mo420k() {
        if (this.f302p != null) goto L6;
        this.f302p = C1102c.m2599c(AbstractC0016B.m30c(this.f288c));
    L6:
        return this.f302p;
    }

    @Override // p006D.AbstractC0108j0, p006D.C0118o0
    /* JADX INFO: renamed from: l */
    public C0122q0 mo383l(int r2, int r3, int r4, int r5) {
        return C0122q0.m429d(null, AbstractC0016B.m36i(this.f288c, r2, r3, r4, r5));
    }

    @Override // p006D.C0110k0, p006D.C0118o0
    /* JADX INFO: renamed from: q */
    public void mo393q(C1102c r1) {
    }
}
