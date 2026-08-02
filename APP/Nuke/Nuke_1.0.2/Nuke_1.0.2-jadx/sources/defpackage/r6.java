package defpackage;

import android.os.Build;
import android.view.View;
import android.view.contentcapture.ContentCaptureSession;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r6 extends yn0 implements xm0 {
    public final /* synthetic */ int o;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r6(int i, Object obj, Class cls, String str, String str2, int i2, int i3, int i4) {
        super(i, obj, cls, str, str2, i2, i3);
        this.o = i4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0132  */
    @Override // defpackage.xm0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a() {
        ContentCaptureSession contentCaptureSessionA;
        vn1 vn1Var;
        int i = this.o;
        boolean z = false;
        Object obj = this.i;
        switch (i) {
            case 0:
                View view = (View) obj;
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= 30) {
                    g4.f(view);
                }
                if (i2 < 29 || (contentCaptureSessionA = b00.a(view)) == null) {
                    return null;
                }
                return new sz0(6, contentCaptureSessionA, view, z);
            case 1:
                return ((ry2) obj).v0();
            case 2:
                wk0 wk0Var = (wk0) obj;
                sk1 sk1Var = wk0Var.c;
                sk1 sk1Var2 = wk0Var.d;
                bl0 bl0Var = wk0Var.a;
                pl0 pl0VarF = bl0Var.f();
                kl0 kl0Var = kl0.j;
                if (pl0VarF == null) {
                    Object[] objArr = sk1Var2.b;
                    long[] jArr = sk1Var2.a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i3 = 0;
                        while (true) {
                            long j = jArr[i3];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i4 = 8 - ((~(i3 - length)) >>> 31);
                                for (int i5 = 0; i5 < i4; i5++) {
                                    if ((j & 255) < 128) {
                                        ((pk0) objArr[(i3 << 3) + i5]).Z(kl0Var);
                                    }
                                    j >>= 8;
                                }
                                if (i4 == 8) {
                                    if (i3 != length) {
                                        i3++;
                                    }
                                }
                            }
                        }
                    }
                } else if (pl0VarF.u) {
                    if (sk1Var.c(pl0VarF)) {
                        pl0VarF.S0();
                    }
                    kl0 kl0VarR0 = pl0VarF.R0();
                    if (!pl0VarF.h.u) {
                        kz0.b("visitAncestors called on an unattached node");
                    }
                    th1 th1Var = pl0VarF.h;
                    r61 r61VarC0 = sp0.c0(pl0VarF);
                    int i6 = 0;
                    while (r61VarC0 != null) {
                        if ((((th1) r61VarC0.M.g).k & 5120) != 0) {
                            while (th1Var != null) {
                                int i7 = th1Var.j;
                                if ((i7 & 5120) != 0) {
                                    if ((i7 & 1024) != 0) {
                                        i6++;
                                    }
                                    if ((th1Var instanceof pk0) && sk1Var2.c(th1Var)) {
                                        if (i6 <= 1) {
                                            ((pk0) th1Var).Z(kl0VarR0);
                                        } else {
                                            ((pk0) th1Var).Z(kl0.i);
                                        }
                                        sk1Var2.l(th1Var);
                                    }
                                }
                                th1Var = th1Var.l;
                            }
                        }
                        r61VarC0 = r61VarC0.u();
                        th1Var = (r61VarC0 == null || (vn1Var = r61VarC0.M) == null) ? null : (qx2) vn1Var.f;
                    }
                    Object[] objArr2 = sk1Var2.b;
                    long[] jArr2 = sk1Var2.a;
                    int length2 = jArr2.length - 2;
                    if (length2 >= 0) {
                        int i8 = 0;
                        while (true) {
                            long j2 = jArr2[i8];
                            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i9 = 8 - ((~(i8 - length2)) >>> 31);
                                for (int i10 = 0; i10 < i9; i10++) {
                                    if ((j2 & 255) < 128) {
                                        ((pk0) objArr2[(i8 << 3) + i10]).Z(kl0Var);
                                    }
                                    j2 >>= 8;
                                }
                                if (i9 == 8) {
                                    if (i8 != length2) {
                                        i8++;
                                    }
                                }
                            }
                        }
                    }
                }
                if (bl0Var.f() == null || bl0Var.c.R0() == kl0Var) {
                    bl0Var.c();
                }
                sk1Var.b();
                sk1Var2.b();
                wk0Var.e = false;
                return a83.a;
            case 3:
                return Boolean.valueOf(((ul0) obj).C.T0(7));
            default:
                ((pp1) obj).getClass();
                return Boolean.valueOf(pp1.f());
        }
    }
}
