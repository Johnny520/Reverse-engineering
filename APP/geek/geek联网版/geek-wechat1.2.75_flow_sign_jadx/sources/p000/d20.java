package p000;

/* JADX INFO: loaded from: classes.dex */
public class d20 extends AbstractC0243g implements InterfaceC0667re {

    /* JADX INFO: renamed from: d */
    public final t50 f1292d;

    public d20(InterfaceC0295he interfaceC0295he, t50 t50Var) {
        super(interfaceC0295he, true);
        this.f1292d = t50Var;
    }

    @Override // p000.C0040aq
    /* JADX INFO: renamed from: B */
    public final boolean mo439B() {
        return true;
    }

    @Override // p000.InterfaceC0667re
    /* JADX INFO: renamed from: c */
    public final InterfaceC0667re mo824c() {
        t50 t50Var = this.f1292d;
        if (t50Var != null) {
            return t50Var;
        }
        return null;
    }

    @Override // p000.C0040aq
    /* JADX INFO: renamed from: k */
    public void mo452k(Object obj) {
        g80.m1177H(AbstractC0493mp.m1870u(this.f1292d), g80.m1176G(obj));
    }

    @Override // p000.C0040aq
    /* JADX INFO: renamed from: l */
    public void mo453l(Object obj) {
        this.f1292d.mo1118f(g80.m1176G(obj));
    }
}
