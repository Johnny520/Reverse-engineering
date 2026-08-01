package p000;

import android.os.Trace;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.InputMethodManager;

/* JADX INFO: renamed from: i7 */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0310i7 extends c50 implements InterfaceC0298hw {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f2469d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f2470e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0310i7(int i, Object obj) {
        super(0);
        this.f2469d = i;
        this.f2470e = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0075  */
    @Override // p000.InterfaceC0298hw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        C0964yi c0964yi;
        int i = this.f2469d;
        boolean z = false;
        na1 na1Var = na1.f4229a;
        Object obj = this.f2470e;
        switch (i) {
            case 0:
                b91 b91Var = (b91) obj;
                Object objM328c = b91Var.m328c();
                EnumC0485ms enumC0485ms = EnumC0485ms.f4028f;
                if (objM328c == enumC0485ms && b91Var.f462d.getValue() == enumC0485ms) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 1:
                ((C0149dv) obj).m733y0();
                return na1Var;
            case 2:
                Object systemService = ((e20) obj).f1277a.getContext().getSystemService("input_method");
                systemService.getClass();
                return (InputMethodManager) systemService;
            case 3:
                f60 f60Var = ((b60) obj).f396J;
                f60Var.f1607p.f7083B = true;
                ec0 ec0Var = f60Var.f1608q;
                if (ec0Var != null) {
                    ec0Var.f1390v = true;
                }
                return na1Var;
            case 4:
                i60 i60Var = (i60) obj;
                if (!((Boolean) i60Var.f2465g.getValue()).booleanValue() && (c0964yi = i60Var.f2461c) != null) {
                    c0964yi.m5271l();
                }
                return na1Var;
            case 5:
                bd0 bd0Var = (bd0) ((ba0) obj).f478a.f7232e;
                if (!bd0Var.f496e) {
                    if (bd0Var.f497f) {
                        xr0.m5148a("ManagedValuesStore tried to enter composition twice. Did you attempt to install the same store multiple times or into two compositions?");
                    }
                    bd0Var.m349a();
                    bd0Var.f497f = true;
                }
                return na1Var;
            case 6:
                return (InterfaceC0966yk) ((C0948y2) obj).f7494g;
            case 7:
                return ((gj0) obj).m1248w0();
            case 8:
                ut0 ut0Var = (ut0) obj;
                ut0Var.f6303g = null;
                Trace.beginSection("OnPositionedDispatch");
                try {
                    ut0Var.m4348a();
                    return na1Var;
                } finally {
                    Trace.endSection();
                }
            case 9:
                q60 q60VarM5085a = ((x41) obj).m5085a();
                b60 b60Var = q60VarM5085a.f5056d;
                if (q60VarM5085a.f5069q != ((ph0) b60Var.m308o()).f4858d.f5770f) {
                    jh0 jh0Var = q60VarM5085a.f5061i;
                    Object[] objArr = jh0Var.f2880c;
                    long[] jArr = jh0Var.f2878a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i2 = 0;
                        while (true) {
                            long j = jArr[i2];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i3 = 8 - ((~(i2 - length)) >>> 31);
                                for (int i4 = 0; i4 < i3; i4++) {
                                    if ((255 & j) < 128) {
                                        ((i60) objArr[(i2 << 3) + i4]).f2462d = true;
                                    }
                                    j >>= 8;
                                }
                                if (i3 == 8) {
                                    if (i2 != length) {
                                        i2++;
                                    }
                                }
                            }
                        }
                    }
                    if (b60Var.f413l != null) {
                        if (!b60Var.f396J.f1596e) {
                            b60.m261V(b60Var, false, 7);
                        }
                    } else if (!b60Var.m311r()) {
                        b60.m262X(b60Var, false, 7);
                    }
                }
                return na1Var;
            case 10:
                return new BaseInputConnection(((e20) obj).f1277a, false);
            default:
                ((kb1) obj).f3069h.setValue(na1Var);
                return na1Var;
        }
    }
}
