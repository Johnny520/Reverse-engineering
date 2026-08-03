package p073o;

/* JADX INFO: renamed from: o.g */
/* JADX INFO: loaded from: classes.dex */
public class C1018g extends C1017f {

    /* JADX INFO: renamed from: m */
    public int f3756m;

    public C1018g(AbstractC1024m abstractC1024m) {
        super(abstractC1024m);
        if (abstractC1024m instanceof C1021j) {
            this.f3748e = 2;
        } else {
            this.f3748e = 3;
        }
    }

    @Override // p073o.C1017f
    /* JADX INFO: renamed from: d */
    public final void mo2462d(int i2) {
        if (this.f3753j) {
            return;
        }
        this.f3753j = true;
        this.f3750g = i2;
        for (InterfaceC1015d interfaceC1015d : this.f3754k) {
            interfaceC1015d.mo2445a(interfaceC1015d);
        }
    }
}
