package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class mu0 extends AbstractC0746t implements InterfaceC0729sk {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C0890wi f4047e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ nu0 f4048f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Illegal instructions before constructor call */
    public mu0(C0890wi c0890wi, nu0 nu0Var) {
        C0496n2 c0496n2 = C0496n2.f4164x;
        this.f4047e = c0890wi;
        this.f4048f = nu0Var;
        super(c0496n2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0729sk
    /* JADX INFO: renamed from: n */
    public final void mo787n(InterfaceC0618pk interfaceC0618pk, Throwable th) throws Throwable {
        C0890wi c0890wi = this.f4047e;
        nu0 nu0Var = this.f4048f;
        rd0.m3464W(th, new C0081c7(2, c0890wi, nu0Var));
        InterfaceC0729sk interfaceC0729sk = (InterfaceC0729sk) nu0Var.f4344d.mo64l(C0496n2.f4164x);
        if (interfaceC0729sk == null) {
            throw th;
        }
        interfaceC0729sk.mo787n(interfaceC0618pk, th);
    }
}
