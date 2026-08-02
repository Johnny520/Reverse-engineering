package p000;

import android.os.Build;
import android.view.View;
import android.view.contentcapture.ContentCaptureSession;

/* JADX INFO: renamed from: r6 */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0645r6 extends yn0 implements xm0 {

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ int f9356o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0645r6(int i, Object obj, Class cls, String str, String str2, int i2, int i3, int i4) {
        super(i, obj, cls, str, str2, i2, i3);
        this.f9356o = i4;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0132  */
    @Override // p000.xm0
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo6a() {
        ContentCaptureSession contentCaptureSessionM324a;
        vn1 vn1Var;
        int i = this.f9356o;
        boolean z = false;
        Object obj = this.f963i;
        switch (i) {
            case 0:
                View view = (View) obj;
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= 30) {
                    AbstractC0227g4.m1798f(view);
                }
                if (i2 < 29 || (contentCaptureSessionM324a = b00.m324a(view)) == null) {
                    return null;
                }
                return new sz0(6, contentCaptureSessionM324a, view, z);
            case 1:
                return ((ry2) obj).mo1769v0();
            case 2:
                wk0 wk0Var = (wk0) obj;
                sk1 sk1Var = wk0Var.f12553c;
                sk1 sk1Var2 = wk0Var.f12554d;
                bl0 bl0Var = wk0Var.f12551a;
                pl0 pl0VarM561f = bl0Var.m561f();
                kl0 kl0Var = kl0.f5628j;
                if (pl0VarM561f == null) {
                    Object[] objArr = sk1Var2.f10175b;
                    long[] jArr = sk1Var2.f10174a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i3 = 0;
                        while (true) {
                            long j = jArr[i3];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i4 = 8 - ((~(i3 - length)) >>> 31);
                                for (int i5 = 0; i5 < i4; i5++) {
                                    if ((j & 255) < 128) {
                                        ((pk0) objArr[(i3 << 3) + i5]).mo299Z(kl0Var);
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
                } else if (pl0VarM561f.f10770u) {
                    if (sk1Var.m4884c(pl0VarM561f)) {
                        pl0VarM561f.m3877S0();
                    }
                    kl0 kl0VarM3876R0 = pl0VarM561f.m3876R0();
                    if (!pl0VarM561f.f10757h.f10770u) {
                        kz0.m2764b("visitAncestors called on an unattached node");
                    }
                    th1 th1Var = pl0VarM561f.f10757h;
                    r61 r61VarM4933c0 = sp0.m4933c0(pl0VarM561f);
                    int i6 = 0;
                    while (r61VarM4933c0 != null) {
                        if ((((th1) r61VarM4933c0.f9372M.f12036g).f10760k & 5120) != 0) {
                            while (th1Var != null) {
                                int i7 = th1Var.f10759j;
                                if ((i7 & 5120) != 0) {
                                    if ((i7 & 1024) != 0) {
                                        i6++;
                                    }
                                    if ((th1Var instanceof pk0) && sk1Var2.m4884c(th1Var)) {
                                        if (i6 <= 1) {
                                            ((pk0) th1Var).mo299Z(kl0VarM3876R0);
                                        } else {
                                            ((pk0) th1Var).mo299Z(kl0.f5627i);
                                        }
                                        sk1Var2.m4893l(th1Var);
                                    }
                                }
                                th1Var = th1Var.f10761l;
                            }
                        }
                        r61VarM4933c0 = r61VarM4933c0.m4389u();
                        th1Var = (r61VarM4933c0 == null || (vn1Var = r61VarM4933c0.f9372M) == null) ? null : (qx2) vn1Var.f12035f;
                    }
                    Object[] objArr2 = sk1Var2.f10175b;
                    long[] jArr2 = sk1Var2.f10174a;
                    int length2 = jArr2.length - 2;
                    if (length2 >= 0) {
                        int i8 = 0;
                        while (true) {
                            long j2 = jArr2[i8];
                            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i9 = 8 - ((~(i8 - length2)) >>> 31);
                                for (int i10 = 0; i10 < i9; i10++) {
                                    if ((j2 & 255) < 128) {
                                        ((pk0) objArr2[(i8 << 3) + i10]).mo299Z(kl0Var);
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
                if (bl0Var.m561f() == null || bl0Var.f926c.m3876R0() == kl0Var) {
                    bl0Var.m558c();
                }
                sk1Var.m4883b();
                sk1Var2.m4883b();
                wk0Var.f12555e = false;
                return a83.f116a;
            case 3:
                return Boolean.valueOf(((ul0) obj).f11347C.m3878T0(7));
            default:
                ((pp1) obj).getClass();
                return Boolean.valueOf(pp1.m3934f());
        }
    }
}
