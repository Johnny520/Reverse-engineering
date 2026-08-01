package p000;

import android.view.autofill.AutofillValue;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class o81 extends C0649qe {

    /* JADX INFO: renamed from: P */
    public boolean f4484P;

    /* JADX INFO: renamed from: Q */
    public InterfaceC0742sw f4485Q;

    /* JADX INFO: renamed from: R */
    public final C0381k6 f4486R;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public o81(final boolean z, xg0 xg0Var, boolean z2, xv0 xv0Var, final InterfaceC0742sw interfaceC0742sw) {
        super(xg0Var, null, false, z2, xv0Var, new InterfaceC0298hw() { // from class: n81
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // p000.InterfaceC0298hw
            public final Object invoke() {
                interfaceC0742sw.invoke(Boolean.valueOf(!z));
                return na1.f4229a;
            }
        });
        this.f4484P = z;
        this.f4485Q = interfaceC0742sw;
        this.f4486R = new C0381k6(15, this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0493n
    /* JADX INFO: renamed from: z0 */
    public final void mo695z0(f01 f01Var) {
        p81 p81Var = this.f4484P ? p81.f4779d : p81.f4780e;
        u40[] u40VarArr = d01.f923a;
        e01 e01Var = b01.f315H;
        u40[] u40VarArr2 = d01.f923a;
        u40 u40Var = u40VarArr2[25];
        f01Var.mo17a(e01Var, p81Var);
        C0876w4 c0876w4 = C0496n2.f4162v;
        e01 e01Var2 = b01.f339r;
        u40 u40Var2 = u40VarArr2[9];
        f01Var.mo17a(e01Var2, c0876w4);
        C0460m5 c0460m5 = new C0460m5(AutofillValue.forToggle(this.f4484P));
        e01 e01Var3 = b01.f340s;
        u40 u40Var3 = u40VarArr2[10];
        f01Var.mo17a(e01Var3, c0460m5);
        f01Var.mo17a(rz0.f5595h, new C0533o0(null, new C0532o(24, f01Var)));
    }
}
