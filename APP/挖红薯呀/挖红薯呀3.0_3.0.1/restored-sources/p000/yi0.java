package p000;

import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class yi0 extends nh0 {

    /* JADX INFO: renamed from: o */
    public final nh0 f7648o;

    /* JADX INFO: renamed from: p */
    public boolean f7649p;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public yi0(long j, q21 q21Var, InterfaceC0742sw interfaceC0742sw, InterfaceC0742sw interfaceC0742sw2, nh0 nh0Var) {
        super(j, q21Var, interfaceC0742sw, interfaceC0742sw2);
        this.f7648o = nh0Var;
        nh0Var.mo814k();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.nh0, p000.l21
    /* JADX INFO: renamed from: c */
    public final void mo807c() {
        if (this.f3331c) {
            return;
        }
        super.mo807c();
        if (this.f7649p) {
            return;
        }
        this.f7649p = true;
        this.f7648o.mo815l();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.nh0
    /* JADX INFO: renamed from: w */
    public final v50 mo822w() {
        yi0 yi0Var;
        nh0 nh0Var = this.f7648o;
        if (nh0Var.f4273m || nh0Var.f3331c) {
            return new n21(this);
        }
        kh0 kh0Var = this.f4268h;
        long j = this.f3330b;
        HashMap mapM4164b = kh0Var != null ? t21.m4164b(nh0Var.mo811g(), this, this.f7648o.mo808d()) : null;
        Object obj = t21.f5893c;
        synchronized (obj) {
            try {
                t21.m4165c(this);
                if (kh0Var == null || kh0Var.f3153d == 0) {
                    yi0Var = this;
                    yi0Var.m1967a();
                } else {
                    yi0Var = this;
                    v50 v50VarM2707z = yi0Var.m2707z(this.f7648o.mo811g(), kh0Var, mapM4164b, this.f7648o.mo808d());
                    if (!v50VarM2707z.equals(o21.f4412a)) {
                        return v50VarM2707z;
                    }
                    kh0 kh0VarMo823x = yi0Var.f7648o.mo823x();
                    if (kh0VarMo823x != null) {
                        kh0VarMo823x.m1899j(kh0Var);
                    } else {
                        yi0Var.f7648o.mo804B(kh0Var);
                        yi0Var.f4268h = null;
                    }
                }
                if (p30.m3009s(yi0Var.f7648o.mo811g(), j) < 0) {
                    yi0Var.f7648o.m2706v();
                }
                nh0 nh0Var2 = yi0Var.f7648o;
                nh0Var2.mo818r(nh0Var2.mo808d().m3190b(j).m3189a(yi0Var.f4270j));
                yi0Var.f7648o.m2705A(j);
                nh0 nh0Var3 = yi0Var.f7648o;
                int i = yi0Var.f3332d;
                yi0Var.f3332d = -1;
                if (i >= 0) {
                    int[] iArr = nh0Var3.f4271k;
                    iArr.getClass();
                    int length = iArr.length;
                    int[] iArrCopyOf = Arrays.copyOf(iArr, length + 1);
                    iArrCopyOf[length] = i;
                    nh0Var3.f4271k = iArrCopyOf;
                } else {
                    nh0Var3.getClass();
                }
                nh0 nh0Var4 = yi0Var.f7648o;
                q21 q21Var = yi0Var.f4270j;
                nh0Var4.getClass();
                synchronized (obj) {
                    nh0Var4.f4270j = nh0Var4.f4270j.m3192d(q21Var);
                    nh0 nh0Var5 = yi0Var.f7648o;
                    int[] iArr2 = yi0Var.f4271k;
                    nh0Var5.getClass();
                    if (iArr2.length != 0) {
                        int[] iArr3 = nh0Var5.f4271k;
                        if (iArr3.length != 0) {
                            int length2 = iArr3.length;
                            int length3 = iArr2.length;
                            int[] iArrCopyOf2 = Arrays.copyOf(iArr3, length2 + length3);
                            System.arraycopy(iArr2, 0, iArrCopyOf2, length2, length3);
                            iArr2 = iArrCopyOf2;
                        }
                        nh0Var5.f4271k = iArr2;
                    }
                }
                yi0Var.f4273m = true;
                if (!yi0Var.f7649p) {
                    yi0Var.f7649p = true;
                    yi0Var.f7648o.mo815l();
                }
                return o21.f4412a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
