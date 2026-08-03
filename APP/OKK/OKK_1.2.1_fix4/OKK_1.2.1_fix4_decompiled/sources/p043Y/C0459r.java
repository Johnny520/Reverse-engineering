package p043Y;

/* JADX INFO: renamed from: Y.r */
/* JADX INFO: loaded from: classes.dex */
public final class C0459r extends AbstractC0455n {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1038a = 1;

    /* JADX INFO: renamed from: b */
    public AbstractC0454m f1039b;

    public /* synthetic */ C0459r() {
    }

    @Override // p043Y.AbstractC0455n, p043Y.InterfaceC0452k
    /* JADX INFO: renamed from: b */
    public void mo1041b(AbstractC0454m abstractC0454m) {
        switch (this.f1038a) {
            case 1:
                C0442a c0442a = (C0442a) this.f1039b;
                if (!c0442a.f972D) {
                    c0442a.m1078G();
                    c0442a.f972D = true;
                }
                break;
        }
    }

    @Override // p043Y.InterfaceC0452k
    /* JADX INFO: renamed from: d */
    public final void mo1043d(AbstractC0454m abstractC0454m) {
        switch (this.f1038a) {
            case 0:
                this.f1039b.mo1064z();
                abstractC0454m.mo1062x(this);
                break;
            default:
                C0442a c0442a = (C0442a) this.f1039b;
                int i2 = c0442a.f971C - 1;
                c0442a.f971C = i2;
                if (i2 == 0) {
                    c0442a.f972D = false;
                    c0442a.m1083m();
                }
                abstractC0454m.mo1062x(this);
                break;
        }
    }

    public C0459r(AbstractC0454m abstractC0454m) {
        this.f1039b = abstractC0454m;
    }
}
