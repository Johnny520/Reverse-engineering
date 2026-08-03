package p000;

/* JADX INFO: renamed from: Rd */
/* JADX INFO: loaded from: classes.dex */
public class C0750Rd extends C2628vd {

    /* JADX INFO: renamed from: m */
    public int f2386m;

    public C0750Rd(AbstractC1449gF abstractC1449gF) {
        super(abstractC1449gF);
        if (abstractC1449gF instanceof C0757Rk) {
            this.f9114e = 2;
        } else {
            this.f9114e = 3;
        }
    }

    @Override // p000.C2628vd
    /* JADX INFO: renamed from: d */
    public final void mo1539d(int i) {
        if (this.f9119j) {
            return;
        }
        this.f9119j = true;
        this.f9116g = i;
        for (InterfaceC2542td interfaceC2542td : this.f9120k) {
            interfaceC2542td.mo1546a(interfaceC2542td);
        }
    }
}
