package p000;

import android.view.KeyEvent;

/* JADX INFO: renamed from: dg */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0128dg extends AbstractC0493n {

    /* JADX INFO: renamed from: O */
    public InterfaceC0298hw f1093O;

    /* JADX INFO: renamed from: P */
    public boolean f1094P;

    /* JADX INFO: renamed from: Q */
    public final zg0 f1095Q;

    /* JADX INFO: renamed from: R */
    public final zg0 f1096R;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0128dg(InterfaceC0298hw interfaceC0298hw, InterfaceC0298hw interfaceC0298hw2) {
        super(null, null, true, true, null, interfaceC0298hw);
        this.f1093O = interfaceC0298hw2;
        this.f1094P = true;
        int i = mb0.f3910a;
        this.f1095Q = new zg0(6);
        this.f1096R = new zg0(6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0493n
    /* JADX INFO: renamed from: A0 */
    public final s51 mo689A0() {
        C0308i5 c0308i5 = new C0308i5(1, this);
        ir0 ir0Var = o51.f4465a;
        return new s51(null, null, c0308i5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0493n
    /* JADX INFO: renamed from: H0 */
    public final void mo690H0() {
        m693L0();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0493n
    /* JADX INFO: renamed from: I0 */
    public final boolean mo691I0(KeyEvent keyEvent) {
        long jM2968D = p30.m2968D(keyEvent);
        InterfaceC0322ik interfaceC0322ik = null;
        boolean z = false;
        z = false;
        if (this.f1093O != null) {
            zg0 zg0Var = this.f1095Q;
            if (zg0Var.m5589d(jM2968D) == null) {
                zg0Var.m5592g(jM2968D, AbstractC0307i4.m1547w(m2879k0(), null, new C0091cg(this, interfaceC0322ik, z ? 1 : 0), 3));
                z = true;
            }
        }
        return z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0493n
    /* JADX INFO: renamed from: J0 */
    public final void mo692J0(KeyEvent keyEvent) {
        long jM2968D = p30.m2968D(keyEvent);
        zg0 zg0Var = this.f1095Q;
        boolean z = false;
        if (zg0Var.m5589d(jM2968D) != null) {
            c40 c40Var = (c40) zg0Var.m5589d(jM2968D);
            if (c40Var != null) {
                if (c40Var.mo479b()) {
                    c40Var.mo478a(null);
                } else {
                    z = true;
                }
            }
            zg0Var.m5591f(jM2968D);
        }
        if (z) {
            return;
        }
        this.f4109y.invoke();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009d  */
    /* JADX INFO: renamed from: L0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m693L0() {
        char c;
        long j;
        long j2;
        char c2;
        zg0 zg0Var = this.f1095Q;
        Object[] objArr = zg0Var.f7889c;
        long[] jArr = zg0Var.f7887a;
        int length = jArr.length - 2;
        char c3 = 7;
        if (length >= 0) {
            int i = 0;
            j = 128;
            while (true) {
                long j3 = jArr[i];
                j2 = 255;
                if ((((~j3) << c3) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    int i3 = 0;
                    while (i3 < i2) {
                        if ((j3 & 255) < 128) {
                            c2 = c3;
                            ((c40) objArr[(i << 3) + i3]).mo478a(null);
                        } else {
                            c2 = c3;
                        }
                        j3 >>= 8;
                        i3++;
                        c3 = c2;
                    }
                    c = c3;
                    if (i2 != 8) {
                        break;
                    }
                } else {
                    c = c3;
                }
                if (i == length) {
                    break;
                }
                i++;
                c3 = c;
            }
        } else {
            c = 7;
            j = 128;
            j2 = 255;
        }
        zg0Var.m5586a();
        zg0 zg0Var2 = this.f1096R;
        Object[] objArr2 = zg0Var2.f7889c;
        long[] jArr2 = zg0Var2.f7887a;
        int length2 = jArr2.length - 2;
        if (length2 >= 0) {
            int i4 = 0;
            while (true) {
                long j4 = jArr2[i4];
                if ((((~j4) << c) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8 - ((~(i4 - length2)) >>> 31);
                    for (int i6 = 0; i6 < i5; i6++) {
                        if ((j4 & j2) < j) {
                            ((AbstractC1002zf) objArr2[(i4 << 3) + i6]).getClass();
                            throw null;
                        }
                        j4 >>= 8;
                    }
                    if (i5 != 8) {
                        break;
                    } else if (i4 == length2) {
                        break;
                    } else {
                        i4++;
                    }
                }
            }
        }
        zg0Var2.m5586a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.oe0
    /* JADX INFO: renamed from: q0 */
    public final void mo694q0() {
        m693L0();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0493n
    /* JADX INFO: renamed from: z0 */
    public final void mo695z0(f01 f01Var) {
        if (this.f1093O != null) {
            C0381k6 c0381k6 = new C0381k6(2, this);
            u40[] u40VarArr = d01.f923a;
            f01Var.mo17a(rz0.f5590c, new C0533o0(null, c0381k6));
        }
    }
}
