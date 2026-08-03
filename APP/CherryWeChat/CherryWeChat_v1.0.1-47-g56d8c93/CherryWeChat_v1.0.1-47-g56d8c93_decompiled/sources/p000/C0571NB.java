package p000;

/* JADX INFO: renamed from: NB */
/* JADX INFO: loaded from: classes.dex */
public final class C0571NB extends AbstractC0399JB {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1863a = 1;

    /* JADX INFO: renamed from: b */
    public AbstractC0356IB f1864b;

    public /* synthetic */ C0571NB() {
    }

    @Override // p000.AbstractC0399JB, p000.InterfaceC0313HB
    /* JADX INFO: renamed from: a */
    public void mo662a(AbstractC0356IB abstractC0356IB) {
        switch (this.f1863a) {
            case 1:
                C1308d5 c1308d5 = (C1308d5) this.f1864b;
                if (!c1308d5.f4761D) {
                    c1308d5.m764G();
                    c1308d5.f4761D = true;
                }
                break;
        }
    }

    @Override // p000.InterfaceC0313HB
    /* JADX INFO: renamed from: d */
    public final void mo665d(AbstractC0356IB abstractC0356IB) {
        switch (this.f1863a) {
            case 0:
                this.f1864b.mo788z();
                abstractC0356IB.mo786x(this);
                break;
            default:
                C1308d5 c1308d5 = (C1308d5) this.f1864b;
                int i = c1308d5.f4760C - 1;
                c1308d5.f4760C = i;
                if (i == 0) {
                    c1308d5.f4761D = false;
                    c1308d5.m777m();
                }
                abstractC0356IB.mo786x(this);
                break;
        }
    }

    public C0571NB(AbstractC0356IB abstractC0356IB) {
        this.f1864b = abstractC0356IB;
    }
}
