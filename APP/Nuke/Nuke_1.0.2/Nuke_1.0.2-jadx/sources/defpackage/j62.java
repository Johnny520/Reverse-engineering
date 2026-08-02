package defpackage;

import nuke.module.wechat.ai.AIChatConfig;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class j62 implements rf {
    public final yj1 h = new yj1();
    public final lk1 i = new lk1();
    public final Object j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public j62(Object obj) {
        this.j = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.rf
    public final void a(int i, Object obj) {
        yj1 yj1Var = this.h;
        yj1Var.a(5);
        yj1Var.a(i);
        this.i.a(obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.rf
    public final void b(Object obj) {
        this.h.a(1);
        this.i.a(obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void c(s73 s73Var, z72 z72Var) {
        Exception exc;
        yj1 yj1Var = this.h;
        int i = yj1Var.b;
        lk1 lk1Var = new lk1();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            lk1 lk1Var2 = this.i;
            if (i2 >= i) {
                if (i3 != lk1Var2.b) {
                    tx.a("Applier operation size mismatch");
                }
                lk1Var2.d();
                yj1Var.b = 0;
                s73Var.i();
                return;
            }
            int i4 = i2 + 1;
            try {
                try {
                    switch (yj1Var.c(i2)) {
                        case 0:
                            s73Var.o();
                            i2 = i4;
                            break;
                        case 1:
                            int i5 = i3 + 1;
                            s73Var.b(lk1Var2.f(i3));
                            i3 = i5;
                            i2 = i4;
                            break;
                        case 2:
                            int i6 = i2 + 2;
                            i2 += 3;
                            s73Var.l(yj1Var.c(i4), yj1Var.c(i6));
                            break;
                        case 3:
                            int i7 = i2 + 2;
                            try {
                                int i8 = i2 + 3;
                                try {
                                    i2 += 4;
                                    s73Var.j(yj1Var.c(i4), yj1Var.c(i7), yj1Var.c(i8));
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
                            s73Var.c();
                            i2 = i4;
                            break;
                        case 5:
                            i2 += 2;
                            int i9 = i3 + 1;
                            s73Var.a(yj1Var.c(i4), lk1Var2.f(i3));
                            i3 = i9;
                            break;
                        case AIChatConfig.DefaultContextRounds /* 6 */:
                            i2 += 2;
                            try {
                                yj1Var.c(i4);
                                int i10 = i3 + 1;
                                i3 = i10;
                            } catch (Exception e3) {
                                exc = e3;
                            }
                            break;
                        case 7:
                            int i11 = i3 + 1;
                            Object objF = lk1Var2.f(i3);
                            objF.getClass();
                            xe1.f(2, objF);
                            i3 += 2;
                            s73Var.m((mn0) objF, lk1Var2.f(i11));
                            i2 = i4;
                            break;
                        case 8:
                            Object obj = s73Var.j;
                            if (obj instanceof uw) {
                                uw uwVar = (uw) obj;
                                if (z72Var.f.j(uwVar)) {
                                    uwVar.c();
                                }
                            }
                            lk1Var.a(obj);
                            s73Var.f();
                            i2 = i4;
                            break;
                        default:
                            i2 = i4;
                            break;
                    }
                } catch (Throwable th) {
                    s73Var.i();
                    throw th;
                }
            } catch (Exception e4) {
                exc = e4;
                i2 = i4;
            }
            exc = e3;
            throw new ww(lk1Var2, lk1Var, yj1Var, i2 - 1, exc);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.rf
    public final void f() {
        this.h.a(8);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.rf
    public final void g(int i, Object obj) {
        yj1 yj1Var = this.h;
        yj1Var.a(6);
        yj1Var.a(i);
        this.i.a(obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.rf
    public final void j(int i, int i2, int i3) {
        yj1 yj1Var = this.h;
        yj1Var.a(3);
        yj1Var.a(i);
        yj1Var.a(i2);
        yj1Var.a(i3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.rf
    public final Object k() {
        return this.j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.rf
    public final void l(int i, int i2) {
        yj1 yj1Var = this.h;
        yj1Var.a(2);
        yj1Var.a(i);
        yj1Var.a(i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.rf
    public final void m(mn0 mn0Var, Object obj) {
        this.h.a(7);
        lk1 lk1Var = this.i;
        lk1Var.a(mn0Var);
        lk1Var.a(obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.rf
    public final void o() {
        this.h.a(0);
    }
}
