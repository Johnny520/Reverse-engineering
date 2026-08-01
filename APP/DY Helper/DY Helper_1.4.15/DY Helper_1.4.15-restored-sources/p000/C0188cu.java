package p000;

/* JADX INFO: renamed from: cu */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0188cu implements p000.ss1 {

    /* JADX INFO: renamed from: α */
    public final /* synthetic */ int f2749;

    /* JADX INFO: renamed from: β */
    public final java.lang.Object f2750;

    /* JADX INFO: renamed from: γ */
    public final java.lang.Object f2751;

    public C0188cu(java.io.File r2) {
            r1 = this;
            r0 = 1
            r1.f2749 = r0
            r1.<init>()
            r1.f2750 = r2
            r30 r2 = p000.r30.f9249
            r1.f2751 = r2
            return
    }

    public /* synthetic */ C0188cu(java.lang.Object r1, int r2, java.lang.Object r3) {
            r0 = this;
            r0.f2749 = r2
            r0.f2750 = r1
            r0.f2751 = r3
            r0.<init>()
            return
    }

    @Override // p000.ss1
    public final java.util.Iterator iterator() {
            r2 = this;
            int r0 = r2.f2749
            switch(r0) {
                case 0: goto L25;
                case 1: goto L1f;
                case 2: goto L19;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r2.f2750
            ss1 r0 = (p000.ss1) r0
            java.util.List r0 = p000.us1.m5949(r0)
            java.lang.Object r2 = r2.f2751
            java.util.Comparator r2 = (java.util.Comparator) r2
            p000.AbstractC0019ai.m168(r0, r2)
            java.util.Iterator r2 = r0.iterator()
            return r2
        L19:
            f90 r0 = new f90
            r0.<init>(r2)
            return r0
        L1f:
            p30 r0 = new p30
            r0.<init>(r2)
            return r0
        L25:
            bu r0 = new bu
            java.lang.Object r1 = r2.f2750
            ss1 r1 = (p000.ss1) r1
            java.util.Iterator r1 = r1.iterator()
            java.lang.Object r2 = r2.f2751
            a80 r2 = (p000.a80) r2
            r0.<init>(r1, r2)
            return r0
    }
}
