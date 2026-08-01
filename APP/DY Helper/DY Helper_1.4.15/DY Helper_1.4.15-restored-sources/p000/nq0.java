package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class nq0 extends p000.q01 implements p000.y91 {

    /* JADX INFO: renamed from: τ */
    public float f7706;

    /* JADX INFO: renamed from: υ */
    public boolean f7707;

    @Override // p000.y91
    /* JADX INFO: renamed from: л */
    public final java.lang.Object mo846(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof p000.ep1
            if (r0 == 0) goto L7
            ep1 r2 = (p000.ep1) r2
            goto L8
        L7:
            r2 = 0
        L8:
            if (r2 != 0) goto L15
            ep1 r2 = new ep1
            r2.<init>()
            r0 = 0
            r2.f3629 = r0
            r0 = 1
            r2.f3630 = r0
        L15:
            float r0 = r1.f7706
            r2.f3629 = r0
            boolean r1 = r1.f7707
            r2.f3630 = r1
            return r2
    }
}
