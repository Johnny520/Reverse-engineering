package p000;

/* JADX INFO: renamed from: NB */
/* JADX INFO: loaded from: classes.dex */
public final class C0571NB extends AbstractC0399JB {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1863a;

    /* JADX INFO: renamed from: b */
    public AbstractC0356IB f1864b;

    public /* synthetic */ C0571NB() {
        this.f1863a = 1;
    }

    @Override // p000.AbstractC0399JB, p000.InterfaceC0313HB
    /* JADX INFO: renamed from: a */
    public void mo662a(AbstractC0356IB r2) {
        switch(this.f1863a) {
            case 1: goto L5;
            default: goto L4;
        };
    L4:
        return;
    L5:
        C1308d5 r22 = (C1308d5) this.f1864b;
        if (r22.f4761D == true) goto L9;
        r22.m764G();
        r22.f4761D = true;
        return;
    }

    @Override // p000.InterfaceC0313HB
    /* JADX INFO: renamed from: d */
    public final void mo665d(AbstractC0356IB r3) {
        switch(this.f1863a) {
            case 0: goto L9;
            default: goto L4;
        };
    L4:
        C1308d5 r0 = (C1308d5) this.f1864b;
        int r1 = r0.f4760C - 1;
        r0.f4760C = r1;
        if (r1 != 0) goto L7;
        r0.f4761D = false;
        r0.m777m();
    L7:
        r3.mo786x(this);
        return;
    L9:
        this.f1864b.mo788z();
        r3.mo786x(this);
    }

    public C0571NB(AbstractC0356IB r2) {
        this.f1863a = 0;
        this.f1864b = r2;
    }
}
