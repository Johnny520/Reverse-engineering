package p000;

/* JADX INFO: loaded from: classes.dex */
public class w10 extends AbstractC0243g implements InterfaceC0631qe {

    /* JADX INFO: renamed from: d */
    public final m50 f4903d;

    public w10(InterfaceC0258ge interfaceC0258ge, m50 m50Var) {
        super(interfaceC0258ge, true);
        this.f4903d = m50Var;
    }

    @Override // p000.C0864wp
    /* JADX INFO: renamed from: B */
    public final boolean mo2544B() {
        return true;
    }

    @Override // p000.InterfaceC0631qe
    /* JADX INFO: renamed from: c */
    public final InterfaceC0631qe mo1405c() {
        m50 m50Var = this.f4903d;
        if (m50Var != null) {
            return m50Var;
        }
        return null;
    }

    @Override // p000.C0864wp
    /* JADX INFO: renamed from: k */
    public void mo2454k(Object obj) {
        a80.m30B(AbstractC0346ip.m1512z(this.f4903d), a80.m29A(obj));
    }

    @Override // p000.C0864wp
    /* JADX INFO: renamed from: l */
    public void mo2003l(Object obj) {
        this.f4903d.mo1241f(a80.m29A(obj));
    }
}
