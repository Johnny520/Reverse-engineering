package p000;

/* JADX INFO: renamed from: nm */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0591nm implements p000.InterfaceC0631op {

    /* JADX INFO: renamed from: ζ */
    public static final p000.C0591nm f7670 = null;

    /* JADX INFO: renamed from: η */
    public static final p000.C0591nm f7671 = null;

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f7672;

    static {
            nm r0 = new nm
            r1 = 0
            r0.<init>(r1)
            p000.C0591nm.f7670 = r0
            nm r0 = new nm
            r1 = 1
            r0.<init>(r1)
            p000.C0591nm.f7671 = r0
            return
    }

    public /* synthetic */ C0591nm(int r1) {
            r0 = this;
            r0.f7672 = r1
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: α */
    private final void m4078(java.lang.Object r1) {
            r0 = this;
            return
    }

    public java.lang.String toString() {
            r1 = this;
            int r0 = r1.f7672
            switch(r0) {
                case 0: goto La;
                default: goto L5;
            }
        L5:
            java.lang.String r1 = super.toString()
            return r1
        La:
            java.lang.String r1 = "This continuation is already complete"
            return r1
    }

    @Override // p000.InterfaceC0631op
    /* JADX INFO: renamed from: γ */
    public final p000.InterfaceC0880up mo72() {
            r1 = this;
            int r1 = r1.f7672
            switch(r1) {
                case 0: goto L8;
                default: goto L5;
            }
        L5:
            hz r1 = p000.C0377hz.f4846
            return r1
        L8:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "This continuation is already complete"
            r1.<init>(r0)
            throw r1
    }

    @Override // p000.InterfaceC0631op
    /* JADX INFO: renamed from: ζ */
    public final void mo75(java.lang.Object r1) {
            r0 = this;
            int r0 = r0.f7672
            switch(r0) {
                case 0: goto L6;
                default: goto L5;
            }
        L5:
            return
        L6:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "This continuation is already complete"
            r0.<init>(r1)
            throw r0
    }
}
