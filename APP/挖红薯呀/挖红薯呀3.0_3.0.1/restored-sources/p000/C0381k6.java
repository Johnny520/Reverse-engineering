package p000;

import android.os.Bundle;
import android.view.ViewParent;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: k6 */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0381k6 implements InterfaceC0298hw {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f3023d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f3024e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0381k6(pf1 pf1Var, long j) {
        this.f3023d = 1;
        this.f3024e = pf1Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0097  */
    @Override // p000.InterfaceC0298hw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        int i;
        int i2 = 2;
        boolean z = true;
        switch (this.f3023d) {
            case 0:
                AbstractC0398kl.m1932r((C0420l6) this.f3024e);
                return na1.f4229a;
            case 1:
                throw null;
            case 2:
                InterfaceC0298hw interfaceC0298hw = ((C0128dg) this.f3024e).f1093O;
                if (interfaceC0298hw != null) {
                    interfaceC0298hw.invoke();
                }
                return Boolean.TRUE;
            case 3:
                Object obj = ((List) this.f3024e).get(2);
                obj.getClass();
                return (Integer) obj;
            case 4:
                return Integer.valueOf(((c90) this.f3024e).m506g().f6458n);
            case 5:
                Object objMo2494q = ((InterfaceC0470md) this.f3024e).mo2494q();
                return (fg0) (objMo2494q instanceof C0836vd ? null : objMo2494q);
            case 6:
                return new zk0((bl0) this.f3024e);
            case 7:
                vw0 vw0Var = (vw0) this.f3024e;
                qx0 qx0Var = vw0Var.f6830d;
                Object obj2 = vw0Var.f6833g;
                if (obj2 != null) {
                    return qx0Var.mo613i(vw0Var, obj2);
                }
                C0921xc.m5131l("Value should be initialized");
                return null;
            case 8:
                lx0 lx0Var = ((cx0) this.f3024e).f909f;
                if (lx0Var == null) {
                    return null;
                }
                Bundle bundleM1922h = AbstractC0398kl.m1922h((uo0[]) Arrays.copyOf(new uo0[0], 0));
                lx0Var.m2085b(bundleM1922h);
                if (bundleM1922h.isEmpty()) {
                    return null;
                }
                return bundleM1922h;
            case 9:
                nx0 nx0Var = (nx0) this.f3024e;
                nx0Var.getLifecycle().mo4014a(new rt0(0, nx0Var));
                return na1.f4229a;
            case 10:
                ry0 ry0Var = (ry0) this.f3024e;
                C0380k5 c0380k5 = (C0380k5) pf1.m3058r(ry0Var, bn0.f548a);
                ry0Var.f5575D = c0380k5;
                ry0Var.f5576E = c0380k5 != null ? new C0343j5(c0380k5.f3011a, c0380k5.f3012b, c0380k5.f3013c, c0380k5.f3014d) : null;
                return na1.f4229a;
            case 11:
                return (ViewParent) this.f3024e;
            case 12:
                gp0 gp0Var = ((u01) this.f3024e).f6095e;
                if (((q11) gp0Var.getValue()).f5022a == 9205357640488583168L || q11.m3187c(((q11) gp0Var.getValue()).f5022a)) {
                    return null;
                }
                long j = ((q11) gp0Var.getValue()).f5022a;
                throw null;
            case 13:
                e31 e31Var = (e31) this.f3024e;
                while (true) {
                    synchronized (e31Var.f1290g) {
                        try {
                            if (!e31Var.f1286c) {
                                e31Var.f1286c = z;
                                try {
                                    sh0 sh0Var = e31Var.f1289f;
                                    Object[] objArr = sh0Var.f5768d;
                                    int i3 = sh0Var.f5770f;
                                    int i4 = 0;
                                    while (i4 < i3) {
                                        d31 d31Var = (d31) objArr[i4];
                                        kh0 kh0Var = d31Var.f960g;
                                        InterfaceC0742sw interfaceC0742sw = d31Var.f954a;
                                        Object[] objArr2 = kh0Var.f3151b;
                                        long[] jArr = kh0Var.f3150a;
                                        int length = jArr.length - i2;
                                        if (length >= 0) {
                                            int i5 = 0;
                                            while (true) {
                                                long j2 = jArr[i5];
                                                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                    int i6 = 8;
                                                    int i7 = 8 - ((~(i5 - length)) >>> 31);
                                                    int i8 = 0;
                                                    while (i8 < i7) {
                                                        if ((j2 & 255) < 128) {
                                                            i = i6;
                                                            interfaceC0742sw.invoke(objArr2[(i5 << 3) + i8]);
                                                        } else {
                                                            i = i6;
                                                        }
                                                        j2 >>= i;
                                                        i8++;
                                                        i6 = i;
                                                    }
                                                    if (i7 == i6) {
                                                        if (i5 != length) {
                                                            i5++;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        kh0Var.m1891b();
                                        i4++;
                                        i2 = 2;
                                    }
                                    e31Var.f1286c = false;
                                } catch (Throwable th) {
                                    e31Var.f1286c = false;
                                    throw th;
                                }
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    if (!e31Var.m776a()) {
                        return na1.f4229a;
                    }
                    i2 = 2;
                    z = true;
                }
                break;
            case 14:
                r71 r71Var = (r71) this.f3024e;
                r71Var.f5311B = null;
                z60.m5417D(r71Var);
                v50.m4407m(r71Var);
                AbstractC0398kl.m1932r(r71Var);
                return Boolean.TRUE;
            default:
                ((o81) this.f3024e).f4485Q.invoke(Boolean.valueOf(!r0.f4484P));
                return na1.f4229a;
        }
    }

    public /* synthetic */ C0381k6(int i, Object obj) {
        this.f3023d = i;
        this.f3024e = obj;
    }
}
