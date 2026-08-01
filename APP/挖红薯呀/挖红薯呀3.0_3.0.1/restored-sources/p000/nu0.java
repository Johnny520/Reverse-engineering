package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class nu0 implements InterfaceC0966yk, ju0 {

    /* JADX INFO: renamed from: g */
    public static final C0014ad f4343g = new C0014ad(0);

    /* JADX INFO: renamed from: d */
    public final InterfaceC0618pk f4344d;

    /* JADX INFO: renamed from: e */
    public final nu0 f4345e = this;

    /* JADX INFO: renamed from: f */
    public volatile InterfaceC0618pk f4346f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public nu0(InterfaceC0618pk interfaceC0618pk) {
        this.f4344d = interfaceC0618pk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m2740a() {
        synchronized (this.f4345e) {
            try {
                InterfaceC0618pk interfaceC0618pk = this.f4346f;
                if (interfaceC0618pk == null) {
                    this.f4346f = f4343g;
                } else {
                    C0224fw c0224fw = new C0224fw(0);
                    c40 c40Var = (c40) interfaceC0618pk.mo64l(C0496n2.f4129I);
                    if (c40Var != null) {
                        c40Var.mo478a(c0224fw);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.ju0
    /* JADX INFO: renamed from: d */
    public final void mo785d() {
        m2740a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.ju0
    /* JADX INFO: renamed from: e */
    public final void mo786e() {
        m2740a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0966yk
    /* JADX INFO: renamed from: f */
    public final InterfaceC0618pk mo1328f() {
        InterfaceC0618pk interfaceC0618pkMo63h;
        InterfaceC0618pk interfaceC0618pk = this.f4346f;
        if (interfaceC0618pk == null || interfaceC0618pk == f4343g) {
            C0890wi c0890wi = (C0890wi) this.f4344d.mo64l(C0890wi.f7133e);
            InterfaceC0618pk mu0Var = c0890wi != null ? new mu0(c0890wi, this) : C0220fs.f1799d;
            synchronized (this.f4345e) {
                try {
                    InterfaceC0618pk interfaceC0618pk2 = this.f4346f;
                    if (interfaceC0618pk2 == null) {
                        InterfaceC0618pk interfaceC0618pk3 = this.f4344d;
                        interfaceC0618pkMo63h = interfaceC0618pk3.mo63h(new e40((c40) interfaceC0618pk3.mo64l(C0496n2.f4129I))).mo63h(C0220fs.f1799d).mo63h(mu0Var);
                    } else if (interfaceC0618pk2 == f4343g) {
                        InterfaceC0618pk interfaceC0618pk4 = this.f4344d;
                        e40 e40Var = new e40((c40) interfaceC0618pk4.mo64l(C0496n2.f4129I));
                        e40Var.m1612A(new C0224fw(0));
                        interfaceC0618pkMo63h = interfaceC0618pk4.mo63h(e40Var).mo63h(C0220fs.f1799d).mo63h(mu0Var);
                    } else {
                        interfaceC0618pkMo63h = interfaceC0618pk2;
                    }
                    this.f4346f = interfaceC0618pkMo63h;
                } catch (Throwable th) {
                    throw th;
                }
            }
            interfaceC0618pk = interfaceC0618pkMo63h;
        }
        interfaceC0618pk.getClass();
        return interfaceC0618pk;
    }

    @Override // p000.ju0
    /* JADX INFO: renamed from: c */
    public final void mo784c() {
    }
}
