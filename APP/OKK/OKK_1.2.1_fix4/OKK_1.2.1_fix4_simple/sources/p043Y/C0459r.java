package p043Y;

/* JADX INFO: renamed from: Y.r */
/* JADX INFO: loaded from: classes.dex */
public final class C0459r extends AbstractC0455n {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1038a;

    /* JADX INFO: renamed from: b */
    public AbstractC0454m f1039b;

    public /* synthetic */ C0459r() {
        this.f1038a = 1;
    }

    @Override // p043Y.AbstractC0455n, p043Y.InterfaceC0452k
    /* JADX INFO: renamed from: b */
    public void mo1041b(AbstractC0454m r2) {
        switch(this.f1038a) {
            case 1: goto L5;
            default: goto L4;
        };
    L4:
        return;
    L5:
        C0442a r22 = (C0442a) this.f1039b;
        if (r22.f972D == true) goto L9;
        r22.m1078G();
        r22.f972D = true;
        return;
    }

    @Override // p043Y.InterfaceC0452k
    /* JADX INFO: renamed from: d */
    public final void mo1043d(AbstractC0454m r3) {
        switch(this.f1038a) {
            case 0: goto L9;
            default: goto L4;
        };
    L4:
        C0442a r02 = (C0442a) this.f1039b;
        int r1 = r02.f971C - 1;
        r02.f971C = r1;
        if (r1 != 0) goto L7;
        r02.f972D = false;
        r02.m1083m();
    L7:
        r3.mo1062x(this);
        return;
    L9:
        this.f1039b.mo1064z();
        r3.mo1062x(this);
    }

    public C0459r(AbstractC0454m r2) {
        this.f1038a = 0;
        this.f1039b = r2;
    }
}
