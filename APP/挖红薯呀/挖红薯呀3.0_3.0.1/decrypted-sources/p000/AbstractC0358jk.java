package p000;

/* JADX INFO: renamed from: jk */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0358jk extends AbstractC0955y9 {

    /* JADX INFO: renamed from: e */
    private final InterfaceC0618pk f2908e;

    /* JADX INFO: renamed from: f */
    private transient InterfaceC0322ik f2909f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC0358jk(InterfaceC0322ik interfaceC0322ik) {
        this(interfaceC0322ik, interfaceC0322ik != null ? interfaceC0322ik.mo540e() : null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0322ik
    /* JADX INFO: renamed from: e */
    public InterfaceC0618pk mo540e() {
        InterfaceC0618pk interfaceC0618pk = this.f2908e;
        interfaceC0618pk.getClass();
        return interfaceC0618pk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0955y9
    /* JADX INFO: renamed from: n */
    public void mo1718n() {
        InterfaceC0322ik interfaceC0322ik = this.f2909f;
        if (interfaceC0322ik != null && interfaceC0322ik != this) {
            InterfaceC0515nk interfaceC0515nkMo64l = mo540e().mo64l(C0496n2.f4163w);
            interfaceC0515nkMo64l.getClass();
            C0179eo c0179eo = (C0179eo) interfaceC0322ik;
            c0179eo.m943m();
            C0884wc c0884wcM945o = c0179eo.m945o();
            if (c0884wcM945o != null) {
                c0884wcM945o.m4987p();
            }
        }
        this.f2909f = C0651qg.f5141e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public final InterfaceC0322ik m1719o() {
        InterfaceC0322ik interfaceC0322ik = this.f2909f;
        if (interfaceC0322ik != null) {
            return interfaceC0322ik;
        }
        AbstractC0692rk abstractC0692rk = (AbstractC0692rk) mo540e().mo64l(C0496n2.f4163w);
        InterfaceC0322ik c0179eo = abstractC0692rk != null ? new C0179eo(abstractC0692rk, this) : this;
        this.f2909f = c0179eo;
        return c0179eo;
    }

    public AbstractC0358jk(InterfaceC0322ik interfaceC0322ik, InterfaceC0618pk interfaceC0618pk) {
        super(interfaceC0322ik);
        this.f2908e = interfaceC0618pk;
    }
}
