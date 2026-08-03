package p006D;

import android.view.WindowInsets;
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

    public C0114m0(C0122q0 c0122q0, WindowInsets windowInsets) {
        super(c0122q0, windowInsets);
        this.f300n = null;
        this.f301o = null;
        this.f302p = null;
    }

    @Override // p006D.C0118o0
    /* JADX INFO: renamed from: g */
    public C1102c mo418g() {
        if (this.f301o == null) {
            this.f301o = C1102c.m2599c(this.f288c.getMandatorySystemGestureInsets());
        }
        return this.f301o;
    }

    @Override // p006D.C0118o0
    /* JADX INFO: renamed from: i */
    public C1102c mo419i() {
        if (this.f300n == null) {
            this.f300n = C1102c.m2599c(this.f288c.getSystemGestureInsets());
        }
        return this.f300n;
    }

    @Override // p006D.C0118o0
    /* JADX INFO: renamed from: k */
    public C1102c mo420k() {
        if (this.f302p == null) {
            this.f302p = C1102c.m2599c(this.f288c.getTappableElementInsets());
        }
        return this.f302p;
    }

    @Override // p006D.AbstractC0108j0, p006D.C0118o0
    /* JADX INFO: renamed from: l */
    public C0122q0 mo383l(int i2, int i3, int i4, int i5) {
        return C0122q0.m429d(null, this.f288c.inset(i2, i3, i4, i5));
    }

    @Override // p006D.C0110k0, p006D.C0118o0
    /* JADX INFO: renamed from: q */
    public void mo393q(C1102c c1102c) {
    }
}
