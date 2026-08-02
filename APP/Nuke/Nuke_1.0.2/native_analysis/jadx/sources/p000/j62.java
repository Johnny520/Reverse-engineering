package p000;

import nuke.module.wechat.p002ai.AIChatConfig;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class j62 implements InterfaceC0654rf {

    /* JADX INFO: renamed from: h */
    public final yj1 f4901h = new yj1();

    /* JADX INFO: renamed from: i */
    public final lk1 f4902i = new lk1();

    /* JADX INFO: renamed from: j */
    public final Object f4903j;

    public j62(Object obj) {
        this.f4903j = obj;
    }

    @Override // p000.InterfaceC0654rf
    /* JADX INFO: renamed from: a */
    public final void mo2456a(int i, Object obj) {
        yj1 yj1Var = this.f4901h;
        yj1Var.m6281a(5);
        yj1Var.m6281a(i);
        this.f4902i.m2925a(obj);
    }

    @Override // p000.InterfaceC0654rf
    /* JADX INFO: renamed from: b */
    public final void mo2457b(Object obj) {
        this.f4901h.m6281a(1);
        this.f4902i.m2925a(obj);
    }

    /* JADX INFO: renamed from: c */
    public final void m2458c(s73 s73Var, z72 z72Var) {
        Exception exc;
        yj1 yj1Var = this.f4901h;
        int i = yj1Var.f13491b;
        lk1 lk1Var = new lk1();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            lk1 lk1Var2 = this.f4902i;
            if (i2 >= i) {
                if (i3 != lk1Var2.f6164b) {
                    AbstractC0752tx.m5443a("Applier operation size mismatch");
                }
                lk1Var2.m2928d();
                yj1Var.f13491b = 0;
                s73Var.mo4444i();
                return;
            }
            int i4 = i2 + 1;
            try {
                try {
                    switch (yj1Var.m6283c(i2)) {
                        case 0:
                            s73Var.mo2465o();
                            i2 = i4;
                            break;
                        case 1:
                            int i5 = i3 + 1;
                            s73Var.mo2457b(lk1Var2.m2930f(i3));
                            i3 = i5;
                            i2 = i4;
                            break;
                        case 2:
                            int i6 = i2 + 2;
                            i2 += 3;
                            s73Var.mo2463l(yj1Var.m6283c(i4), yj1Var.m6283c(i6));
                            break;
                        case 3:
                            int i7 = i2 + 2;
                            try {
                                int i8 = i2 + 3;
                                try {
                                    i2 += 4;
                                    s73Var.mo2461j(yj1Var.m6283c(i4), yj1Var.m6283c(i7), yj1Var.m6283c(i8));
                                } catch (Exception e) {
                                    exc = e;
                                    i2 = i8;
                                }
                            } catch (Exception e2) {
                                exc = e2;
                                i2 = i7;
                            }
                            break;
                        case 4:
                            s73Var.m4750c();
                            i2 = i4;
                            break;
                        case 5:
                            i2 += 2;
                            int i9 = i3 + 1;
                            s73Var.mo2456a(yj1Var.m6283c(i4), lk1Var2.m2930f(i3));
                            i3 = i9;
                            break;
                        case AIChatConfig.DefaultContextRounds /* 6 */:
                            i2 += 2;
                            try {
                                yj1Var.m6283c(i4);
                                int i10 = i3 + 1;
                                i3 = i10;
                            } catch (Exception e3) {
                                exc = e3;
                            }
                            break;
                        case 7:
                            int i11 = i3 + 1;
                            Object objM2930f = lk1Var2.m2930f(i3);
                            objM2930f.getClass();
                            xe1.m6119f(2, objM2930f);
                            i3 += 2;
                            s73Var.mo2464m((mn0) objM2930f, lk1Var2.m2930f(i11));
                            i2 = i4;
                            break;
                        case 8:
                            Object obj = s73Var.f9961j;
                            if (obj instanceof InterfaceC0788uw) {
                                InterfaceC0788uw interfaceC0788uw = (InterfaceC0788uw) obj;
                                if (z72Var.f13773f.m6431j(interfaceC0788uw)) {
                                    interfaceC0788uw.mo1538c();
                                }
                            }
                            lk1Var.m2925a(obj);
                            s73Var.mo2459f();
                            i2 = i4;
                            break;
                        default:
                            i2 = i4;
                            break;
                    }
                } catch (Throwable th) {
                    s73Var.mo4444i();
                    throw th;
                }
            } catch (Exception e4) {
                exc = e4;
                i2 = i4;
            }
            exc = e3;
            throw new C0862ww(lk1Var2, lk1Var, yj1Var, i2 - 1, exc);
        }
    }

    @Override // p000.InterfaceC0654rf
    /* JADX INFO: renamed from: f */
    public final void mo2459f() {
        this.f4901h.m6281a(8);
    }

    @Override // p000.InterfaceC0654rf
    /* JADX INFO: renamed from: g */
    public final void mo2460g(int i, Object obj) {
        yj1 yj1Var = this.f4901h;
        yj1Var.m6281a(6);
        yj1Var.m6281a(i);
        this.f4902i.m2925a(obj);
    }

    @Override // p000.InterfaceC0654rf
    /* JADX INFO: renamed from: j */
    public final void mo2461j(int i, int i2, int i3) {
        yj1 yj1Var = this.f4901h;
        yj1Var.m6281a(3);
        yj1Var.m6281a(i);
        yj1Var.m6281a(i2);
        yj1Var.m6281a(i3);
    }

    @Override // p000.InterfaceC0654rf
    /* JADX INFO: renamed from: k */
    public final Object mo2462k() {
        return this.f4903j;
    }

    @Override // p000.InterfaceC0654rf
    /* JADX INFO: renamed from: l */
    public final void mo2463l(int i, int i2) {
        yj1 yj1Var = this.f4901h;
        yj1Var.m6281a(2);
        yj1Var.m6281a(i);
        yj1Var.m6281a(i2);
    }

    @Override // p000.InterfaceC0654rf
    /* JADX INFO: renamed from: m */
    public final void mo2464m(mn0 mn0Var, Object obj) {
        this.f4901h.m6281a(7);
        lk1 lk1Var = this.f4902i;
        lk1Var.m2925a(mn0Var);
        lk1Var.m2925a(obj);
    }

    @Override // p000.InterfaceC0654rf
    /* JADX INFO: renamed from: o */
    public final void mo2465o() {
        this.f4901h.m6281a(0);
    }
}
