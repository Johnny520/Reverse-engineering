package p000;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class vb0 implements InterfaceC0968ym {

    /* JADX INFO: renamed from: d */
    public boolean f6647d;

    /* JADX INFO: renamed from: e */
    public long f6648e = 9223372034707292159L;

    /* JADX INFO: renamed from: f */
    public long f6649f = 0;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ yb0 f6650g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public vb0(yb0 yb0Var) {
        this.f6650g = yb0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final i50 m4472a() {
        this.f6647d = true;
        yb0 yb0Var = this.f6650g;
        i50 i50VarMo52l0 = yb0Var.mo52l0();
        if (w20.m4833a(this.f6648e, 9223372034707292159L)) {
            this.f6648e = AbstractC0307i4.m1518D(i50VarMo52l0.mo344d(0L));
            this.f6649f = i50VarMo52l0.mo342G();
        }
        yb0Var.mo55n0().f396J.m1033b();
        return i50VarMo52l0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0968ym
    /* JADX INFO: renamed from: b */
    public final float mo48b() {
        return this.f6650g.mo48b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final void m4473d(C0190ez c0190ez, float f) {
        yb0 yb0Var = this.f6650g;
        lw0 lw0Var = yb0Var.f7599p;
        if (lw0Var == null) {
            lw0Var = new lw0();
            yb0Var.f7599p = lw0Var;
        }
        int iM1066l0 = AbstractC0201f9.m1066l0(lw0Var.f3607b, c0190ez);
        if (iM1066l0 >= 0) {
            float[] fArr = lw0Var.f3608c;
            if (fArr[iM1066l0] != f) {
                fArr[iM1066l0] = f;
                lw0Var.f3609d[iM1066l0] = 1;
                return;
            } else {
                byte[] bArr = lw0Var.f3609d;
                if (bArr[iM1066l0] == 2) {
                    bArr[iM1066l0] = 0;
                    return;
                }
                return;
            }
        }
        int i = lw0Var.f3606a;
        C0190ez[] c0190ezArr = lw0Var.f3607b;
        if (i == c0190ezArr.length) {
            int i2 = i * 2;
            lw0Var.f3607b = (C0190ez[]) Arrays.copyOf(c0190ezArr, i2);
            lw0Var.f3608c = Arrays.copyOf(lw0Var.f3608c, i2);
            lw0Var.f3609d = Arrays.copyOf(lw0Var.f3609d, i2);
        }
        lw0Var.f3607b[i] = c0190ez;
        lw0Var.f3609d[i] = 3;
        lw0Var.f3608c[i] = f;
        lw0Var.f3606a++;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0968ym
    /* JADX INFO: renamed from: h */
    public final float mo49h() {
        return this.f6650g.mo49h();
    }
}
