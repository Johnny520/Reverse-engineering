package p009j;

/* JADX INFO: renamed from: j.b */
/* JADX INFO: loaded from: classes.dex */
final class C0151b implements InterfaceC0155f {

    /* JADX INFO: renamed from: a */
    private int f486a = 0;

    /* JADX INFO: renamed from: f */
    private void m355f(AbstractC0156g abstractC0156g) {
        int iM383h;
        C0162m c0162mM368j = abstractC0156g.m368j();
        if (c0162mM368j != null && (iM383h = c0162mM368j.m383h()) > this.f486a) {
            this.f486a = iM383h;
        }
        C0164o c0164oM369k = abstractC0156g.m369k();
        int iM504B = c0164oM369k.m504B();
        for (int i2 = 0; i2 < iM504B; i2++) {
            int iM383h2 = c0164oM369k.m513p(i2).m383h();
            if (iM383h2 > this.f486a) {
                this.f486a = iM383h2;
            }
        }
    }

    @Override // p009j.InterfaceC0155f
    /* JADX INFO: renamed from: a */
    public final void mo18a(C0170u c0170u) {
        m355f(c0170u);
    }

    @Override // p009j.InterfaceC0155f
    /* JADX INFO: renamed from: b */
    public final void mo71b(C0158i c0158i) {
        m355f(c0158i);
    }

    @Override // p009j.InterfaceC0155f
    /* JADX INFO: renamed from: c */
    public final void mo19c(C0159j c0159j) {
        m355f(c0159j);
    }

    @Override // p009j.InterfaceC0155f
    /* JADX INFO: renamed from: d */
    public final void mo20d(C0169t c0169t) {
        m355f(c0169t);
    }

    /* JADX INFO: renamed from: e */
    public final int m356e() {
        return this.f486a;
    }
}
