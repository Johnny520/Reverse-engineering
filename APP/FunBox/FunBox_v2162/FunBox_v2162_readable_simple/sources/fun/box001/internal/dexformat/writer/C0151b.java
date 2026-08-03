package fun.box001.internal.dexformat.writer;

/* JADX INFO: renamed from: j.b */
/* JADX INFO: loaded from: classes.dex */
final class C0151b implements InterfaceC0155f {

    /* JADX INFO: renamed from: a */
    private int f486a;

    public C0151b() {
        this.f486a = 0;
    }

    /* JADX INFO: renamed from: f */
    private void m355f(AbstractC0156g r5) {
        C0162m r0 = r5.m368j();
        if (r0 == null) goto L7;
        int r02 = r0.m383h();
        if (r02 <= this.f486a) goto L7;
        this.f486a = r02;
    L7:
        C0164o r52 = r5.m369k();
        int r03 = r52.m504B();
        int r1 = 0;
    L8:
        if (r1 >= r03) goto L13;
        int r2 = r52.m513p(r1).m383h();
        if (r2 <= this.f486a) goto L12;
        this.f486a = r2;
    L12:
        r1 = r1 + 1;
        goto L8
    }

    @Override // fun.box001.internal.dexformat.writer.InterfaceC0155f
    /* JADX INFO: renamed from: a */
    public final void mo18a(C0170u r1) {
        m355f(r1);
    }

    @Override // fun.box001.internal.dexformat.writer.InterfaceC0155f
    /* JADX INFO: renamed from: b */
    public final void mo71b(C0158i r1) {
        m355f(r1);
    }

    @Override // fun.box001.internal.dexformat.writer.InterfaceC0155f
    /* JADX INFO: renamed from: c */
    public final void mo19c(C0159j r1) {
        m355f(r1);
    }

    @Override // fun.box001.internal.dexformat.writer.InterfaceC0155f
    /* JADX INFO: renamed from: d */
    public final void mo20d(C0169t r1) {
        m355f(r1);
    }

    /* JADX INFO: renamed from: e */
    public final int m356e() {
        return this.f486a;
    }
}
