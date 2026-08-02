package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class fa0 extends n21 {

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ int f2881l;

    /* JADX INFO: renamed from: m */
    public final Object f2882m;

    public /* synthetic */ fa0(int i, Object obj) {
        this.f2881l = i;
        this.f2882m = obj;
    }

    @Override // p000.n21
    /* JADX INFO: renamed from: k */
    public final boolean mo1214k() {
        switch (this.f2881l) {
        }
        return false;
    }

    @Override // p000.n21
    /* JADX INFO: renamed from: l */
    public final void mo1215l(Throwable th) {
        int i = this.f2881l;
        Object obj = this.f2882m;
        switch (i) {
            case 0:
                ((ca0) obj).mo717a();
                break;
            case 1:
                ((in0) obj).mo5j(th);
                break;
            default:
                Object obj2 = r21.f9330h.get(m3225j());
                o21 o21Var = (o21) obj;
                if (!(obj2 instanceof C0557ov)) {
                    o21Var.mo2509h(AbstractC0179eu.m1455e0(obj2));
                } else {
                    o21Var.mo2509h(fg1.m1644s(((C0557ov) obj2).f7856a));
                }
                break;
        }
    }
}
