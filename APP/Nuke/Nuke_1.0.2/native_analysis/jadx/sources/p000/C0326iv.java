package p000;

/* JADX INFO: renamed from: iv */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0326iv implements InterfaceC0101cp {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f4796h;

    /* JADX INFO: renamed from: i */
    public final C0401kv f4797i;

    public /* synthetic */ C0326iv(C0401kv c0401kv, int i) {
        this.f4796h = i;
        this.f4797i = c0401kv;
    }

    @Override // p000.InterfaceC0101cp
    /* JADX INFO: renamed from: b */
    public final void mo879b(InterfaceC0854wo interfaceC0854wo, q92 q92Var) {
        int i = this.f4796h;
        C0401kv c0401kv = this.f4797i;
        switch (i) {
            case 0:
                if (!q92Var.f8836a.f9471w) {
                    c0401kv.completeExceptionally(new C0594pv(q92Var));
                } else {
                    c0401kv.complete(q92Var.f8837b);
                }
                break;
            default:
                c0401kv.complete(q92Var);
                break;
        }
    }

    @Override // p000.InterfaceC0101cp
    /* JADX INFO: renamed from: d */
    public final void mo880d(InterfaceC0854wo interfaceC0854wo, Throwable th) {
        int i = this.f4796h;
        C0401kv c0401kv = this.f4797i;
        switch (i) {
            case 0:
                c0401kv.completeExceptionally(th);
                break;
            default:
                c0401kv.completeExceptionally(th);
                break;
        }
    }
}
