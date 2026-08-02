package p000;

/* JADX INFO: renamed from: ko */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0394ko implements InterfaceC0654rf, h01, us1 {

    /* JADX INFO: renamed from: h */
    public final int f5685h;

    /* JADX INFO: renamed from: i */
    public int f5686i;

    /* JADX INFO: renamed from: j */
    public final Object f5687j;

    public C0394ko(int i, int i2) {
        this.f5687j = null;
        this.f5685h = i;
        int i3 = i2 & 7;
        this.f5686i = i3 == 0 ? 8 : i3;
    }

    @Override // p000.InterfaceC0654rf
    /* JADX INFO: renamed from: a */
    public void mo2456a(int i, Object obj) {
        ((InterfaceC0654rf) this.f5687j).mo2456a(i + (this.f5686i == 0 ? this.f5685h : 0), obj);
    }

    @Override // p000.InterfaceC0654rf
    /* JADX INFO: renamed from: b */
    public void mo2457b(Object obj) {
        this.f5686i++;
        ((InterfaceC0654rf) this.f5687j).mo2457b(obj);
    }

    @Override // p000.h01
    /* JADX INFO: renamed from: e */
    public void mo178e(wz1 wz1Var) {
        if (wz1Var.f4202h.f13811a == 3) {
            int i = ((g30) wz1Var.f2301l).f4250h;
            boolean[] zArr = (boolean[]) this.f5687j;
            zArr[0] = zArr[0] && (this.f5685h - this.f5686i) + i == wz1Var.f4204j.f9419h;
        }
    }

    @Override // p000.InterfaceC0654rf
    /* JADX INFO: renamed from: f */
    public void mo2459f() {
        ((InterfaceC0654rf) this.f5687j).mo2459f();
    }

    @Override // p000.InterfaceC0654rf
    /* JADX INFO: renamed from: g */
    public void mo2460g(int i, Object obj) {
        ((InterfaceC0654rf) this.f5687j).mo2460g(i + (this.f5686i == 0 ? this.f5685h : 0), obj);
    }

    @Override // p000.InterfaceC0654rf
    /* JADX INFO: renamed from: j */
    public void mo2461j(int i, int i2, int i3) {
        int i4 = this.f5686i == 0 ? this.f5685h : 0;
        ((InterfaceC0654rf) this.f5687j).mo2461j(i + i4, i2 + i4, i3);
    }

    @Override // p000.InterfaceC0654rf
    /* JADX INFO: renamed from: k */
    public Object mo2462k() {
        return ((InterfaceC0654rf) this.f5687j).mo2462k();
    }

    @Override // p000.InterfaceC0654rf
    /* JADX INFO: renamed from: l */
    public void mo2463l(int i, int i2) {
        ((InterfaceC0654rf) this.f5687j).mo2463l(i + (this.f5686i == 0 ? this.f5685h : 0), i2);
    }

    @Override // p000.InterfaceC0654rf
    /* JADX INFO: renamed from: m */
    public void mo2464m(mn0 mn0Var, Object obj) {
        ((InterfaceC0654rf) this.f5687j).mo2464m(mn0Var, obj);
    }

    @Override // p000.us1
    /* JADX INFO: renamed from: n */
    public int mo2449n(int i) {
        int iMo2449n = ((us1) this.f5687j).mo2449n(i);
        if (i >= 0 && i <= this.f5686i) {
            l93.m2889c(iMo2449n, this.f5685h, i);
        }
        return iMo2449n;
    }

    @Override // p000.InterfaceC0654rf
    /* JADX INFO: renamed from: o */
    public void mo2465o() {
        if (this.f5686i <= 0) {
            AbstractC0752tx.m5443a("OffsetApplier up called with no corresponding down");
        }
        this.f5686i--;
        ((InterfaceC0654rf) this.f5687j).mo2465o();
    }

    @Override // p000.us1
    /* JADX INFO: renamed from: p */
    public int mo2451p(int i) {
        int iMo2451p = ((us1) this.f5687j).mo2451p(i);
        if (i >= 0 && i <= this.f5685h) {
            l93.m2888b(iMo2451p, this.f5686i, i);
        }
        return iMo2451p;
    }

    public C0394ko(InterfaceC0654rf interfaceC0654rf, int i) {
        this.f5687j = interfaceC0654rf;
        this.f5685h = i;
    }

    public C0394ko() {
        this.f5687j = new C0394ko[256];
        this.f5685h = 0;
        this.f5686i = 0;
    }

    public /* synthetic */ C0394ko(int i, int i2, Object obj) {
        this.f5687j = obj;
        this.f5685h = i;
        this.f5686i = i2;
    }

    @Override // p000.h01
    /* JADX INFO: renamed from: c */
    public void mo176c(j23 j23Var) {
    }

    @Override // p000.h01
    /* JADX INFO: renamed from: d */
    public void mo177d(xz1 xz1Var) {
    }

    @Override // p000.h01
    /* JADX INFO: renamed from: h */
    public void mo180h(k23 k23Var) {
    }
}
